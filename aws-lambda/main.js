// I referred http://blog.0x82.com/2014/11/24/aws-lambda-functions-in-go/
var child_process = require('child_process');

exports.handler = function(event, context) {
  var proc = child_process.spawn('./fib', [ JSON.stringify(event) ], { stdio: 'inherit' });

  proc.on('close', function(code) {
    if(code !== 0) {
      return context.done(new Error("Process exited with non-zero status code"));
    }

    context.done(null);
  });
}