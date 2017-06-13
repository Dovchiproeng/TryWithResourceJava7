This repository is showing how try with resource handle the exception.

1. All 3 throw statements enabled.

Message "Exception from constructor" will printed and the exception thrown by constructor will be suppressed, that means you can't catch it.

2. The throw in constructor is removed.

Now the stack trace will print "Exception from method" and "Suppressed: Exception from closeable" below. Here you also can't catch the suppressed exception thrown by close method, but you will be nofitied about the suppressed exception.

3. Throws from constructor and method are removed.

As you have probably already guessed the "Exception from closeable" will be printed.

**Important tip:** In all of above situations you are actually **catching all exceptions**, no matter where they were throwed. So if you use try-with-resource block you don't need to wrap the block with another try-catch, it's simply useless.