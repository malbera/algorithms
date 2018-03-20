Euclid Algorithm

Lemma: Suppose a and b are not both zero.

a) (a,b)=(b,a)  
b) if a>0 and a|b then (a,b)=a  
c) if a≡c(modb), then (a,b)=(c,b).

Proof.  
Part (a) is clear, since a common divisor of a and b is a common divisor of b and a.    
Part (b) note that if a|b, then a is a common divisor of a and b. Clearly a is the largest divisor of a, so we are done.    
Part (c) if a≡c(mod b), then b|a−c, so there is a y such that a−c=by, i.e., c=a−by. If d divides both a and b, then it also divides a−by. Therefore any common divisor of a and b is also a common divisor of c and b. Similarly, if d divides both c and b, then it also divides c+by=a, so any common divisor of c and b is a common divisor of a and b. This shows that the common divisors of a and b are exactly the common divisors of c and b, so, in particular, they have the same greatest common divisor.