# mdsd.assignment.3

Includes assignment 3 of model driven software development project.<br>
Uses extention: `.mathint`. 
## dsl input

```
result "simple calculation" is 5+1
result "power calculation" is 5**(2*3) 
result "external calculation" is external.log(10,2) 
let y = 3 in y+4 end 
let z = 5 and y = 4 in z*y end 
let x = 34 and y = 5 in (let z = 7 in (let g = 2 in x+y+z-g end) end) end  
```

## console output

```
simple calculation -> 5 + 1 = 6
power calculation -> Math.pow(5, (2 * 3)) = 15625.0
external calculation -> externals.log(10, 2) = 3
defined y = 3
y + 4 = 7
defined z = 5
defined y = 4
z * y = 20
defined g = 2
defined z = 7
defined x = 34
defined y = 5
x + y + z - g = 44
```