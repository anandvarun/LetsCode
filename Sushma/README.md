Start date 5/31/2017

Program 2 as in anandvarun/LetsCode

Q) Check if a given number is prime in O(sqrt(n)) time

Logic:

m= sqrt(n) m * m =a * b Three cases:

a < m and b > m 2)a = m and b = m 3)a > m and b < m
Hence it is enough to check do num % i for numbers ranging from 2 to sqrt(num)

Imports: java.math.*; Math.sqrt(num)

Typecasting:

(int)Math.sqrt()

typecasting works best refer mathdemo file for better explanation
