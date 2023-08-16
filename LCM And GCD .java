class Solution {
    static Long gcd(Long a, Long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static Long lcm(Long a, Long b) {
        return (a * b) / gcd(a, b);
    }

    static Long[] lcmAndGcd(Long A, Long B) {
        Long[] result = new Long[2];
        result[0] = lcm(A, B);
        result[1] = gcd(A, B);
        return result;
    }
}
