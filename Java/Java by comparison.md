
* Never compare boolean with true or false in conditions.
* Positive condition is more readable than the negative condition.
* Return boolean expression directly.
* Several conditions into a single check, it's better to group them in some way or brackets can help too.
* Use braces
* Avoid switch fallthrough
* Replace magic numbers with constants i.e. number/constants in the program should be named and then used.
* Use enums (i.e. convert magic numbers to enum) such that we can’t send any invalid value to fn. I.e. to prevent illegal value input so use enum instead of integers.
* ForEach over for loops
* Avoid compute intensive operations during iteration. If they can be computed once and then used, so do that.
* Group similar code and separate different codes with new lines.
* Use string.format over concatenation.
* Replace comments with utility functions or files.
* Document implementation decisions.
``` 
    In the context of \[USE CASE],
    facing \[CONCERN]
    we decided for \[OPTION]
    to achieve \[QUALITY],
    accepting \[DOWNSIDE].
```
* Document using examples
* Always fail fast
* Catch more specific exceptions.
* Check type before cast.
* Standalone tests and parameterized tests
* Split methods with boolean params
* Split methods with optional params
* Favour abstract over concrete (example: Collection over LinkedList or ArrayList)
* Favour Immutable over mutable objects (As references of objects can modify wrong objects)
* Avoid leaking references (Return new immutable from class functions)
* Avoid returning NULL instead return a UNSUPPORTED new object (with that name)
* Method references over lambdas and lambdas over anonymous classes
* Functional over imperative style
* Avoid side effects (use reduce or collect)
* Use collect for terminating complex streams.
* Avoid Exceptions in streams instead return some empty things for the same.
* Favour optional over null.
* Avoid Optional fields or params (only use optional as return type)
* Use Optionals as streams (Optional is a stream with 0 or 1 element)
* Favour logging over console output.