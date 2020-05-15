package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: canu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class canu {

    /* renamed from: c */
    private static final canu[] f175416c = m126843a();

    /* renamed from: a */
    public final int f175417a;

    /* renamed from: b */
    public final int f175418b;

    /* renamed from: d */
    private final cant[] f175419d;

    private canu(int i, cant... cantArr) {
        this.f175417a = i;
        this.f175419d = cantArr;
        cant cant = cantArr[0];
        int i2 = cant.f175414a;
        cans[] cansArr = cant.f175415b;
        int i3 = 0;
        for (cans cans : cansArr) {
            i3 += cans.f175412a * (cans.f175413b + i2);
        }
        this.f175418b = i3;
    }

    /* renamed from: a */
    public static canu m126842a(int i) {
        if (i > 0 && i <= 40) {
            return f175416c[i - 1];
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        return String.valueOf(this.f175417a);
    }

    /* renamed from: a */
    private static canu[] m126843a() {
        return new canu[]{new canu(1, new cant(7, new cans(1, 19)), new cant(10, new cans(1, 16)), new cant(13, new cans(1, 13)), new cant(17, new cans(1, 9))), new canu(2, new cant(10, new cans(1, 34)), new cant(16, new cans(1, 28)), new cant(22, new cans(1, 22)), new cant(28, new cans(1, 16))), new canu(3, new cant(15, new cans(1, 55)), new cant(26, new cans(1, 44)), new cant(18, new cans(2, 17)), new cant(22, new cans(2, 13))), new canu(4, new cant(20, new cans(1, 80)), new cant(18, new cans(2, 32)), new cant(26, new cans(2, 24)), new cant(16, new cans(4, 9))), new canu(5, new cant(26, new cans(1, 108)), new cant(24, new cans(2, 43)), new cant(18, new cans(2, 15), new cans(2, 16)), new cant(22, new cans(2, 11), new cans(2, 12))), new canu(6, new cant(18, new cans(2, 68)), new cant(16, new cans(4, 27)), new cant(24, new cans(4, 19)), new cant(28, new cans(4, 15))), new canu(7, new cant(20, new cans(2, 78)), new cant(18, new cans(4, 31)), new cant(18, new cans(2, 14), new cans(4, 15)), new cant(26, new cans(4, 13), new cans(1, 14))), new canu(8, new cant(24, new cans(2, 97)), new cant(22, new cans(2, 38), new cans(2, 39)), new cant(22, new cans(4, 18), new cans(2, 19)), new cant(26, new cans(4, 14), new cans(2, 15))), new canu(9, new cant(30, new cans(2, 116)), new cant(22, new cans(3, 36), new cans(2, 37)), new cant(20, new cans(4, 16), new cans(4, 17)), new cant(24, new cans(4, 12), new cans(4, 13))), new canu(10, new cant(18, new cans(2, 68), new cans(2, 69)), new cant(26, new cans(4, 43), new cans(1, 44)), new cant(24, new cans(6, 19), new cans(2, 20)), new cant(28, new cans(6, 15), new cans(2, 16))), new canu(11, new cant(20, new cans(4, 81)), new cant(30, new cans(1, 50), new cans(4, 51)), new cant(28, new cans(4, 22), new cans(4, 23)), new cant(24, new cans(3, 12), new cans(8, 13))), new canu(12, new cant(24, new cans(2, 92), new cans(2, 93)), new cant(22, new cans(6, 36), new cans(2, 37)), new cant(26, new cans(4, 20), new cans(6, 21)), new cant(28, new cans(7, 14), new cans(4, 15))), new canu(13, new cant(26, new cans(4, 107)), new cant(22, new cans(8, 37), new cans(1, 38)), new cant(24, new cans(8, 20), new cans(4, 21)), new cant(22, new cans(12, 11), new cans(4, 12))), new canu(14, new cant(30, new cans(3, 115), new cans(1, 116)), new cant(24, new cans(4, 40), new cans(5, 41)), new cant(20, new cans(11, 16), new cans(5, 17)), new cant(24, new cans(11, 12), new cans(5, 13))), new canu(15, new cant(22, new cans(5, 87), new cans(1, 88)), new cant(24, new cans(5, 41), new cans(5, 42)), new cant(30, new cans(5, 24), new cans(7, 25)), new cant(24, new cans(11, 12), new cans(7, 13))), new canu(16, new cant(24, new cans(5, 98), new cans(1, 99)), new cant(28, new cans(7, 45), new cans(3, 46)), new cant(24, new cans(15, 19), new cans(2, 20)), new cant(30, new cans(3, 15), new cans(13, 16))), new canu(17, new cant(28, new cans(1, 107), new cans(5, 108)), new cant(28, new cans(10, 46), new cans(1, 47)), new cant(28, new cans(1, 22), new cans(15, 23)), new cant(28, new cans(2, 14), new cans(17, 15))), new canu(18, new cant(30, new cans(5, 120), new cans(1, 121)), new cant(26, new cans(9, 43), new cans(4, 44)), new cant(28, new cans(17, 22), new cans(1, 23)), new cant(28, new cans(2, 14), new cans(19, 15))), new canu(19, new cant(28, new cans(3, 113), new cans(4, 114)), new cant(26, new cans(3, 44), new cans(11, 45)), new cant(26, new cans(17, 21), new cans(4, 22)), new cant(26, new cans(9, 13), new cans(16, 14))), new canu(20, new cant(28, new cans(3, 107), new cans(5, 108)), new cant(26, new cans(3, 41), new cans(13, 42)), new cant(30, new cans(15, 24), new cans(5, 25)), new cant(28, new cans(15, 15), new cans(10, 16))), new canu(21, new cant(28, new cans(4, 116), new cans(4, 117)), new cant(26, new cans(17, 42)), new cant(28, new cans(17, 22), new cans(6, 23)), new cant(30, new cans(19, 16), new cans(6, 17))), new canu(22, new cant(28, new cans(2, 111), new cans(7, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS)), new cant(28, new cans(17, 46)), new cant(30, new cans(7, 24), new cans(16, 25)), new cant(24, new cans(34, 13))), new canu(23, new cant(30, new cans(4, 121), new cans(5, 122)), new cant(28, new cans(4, 47), new cans(14, 48)), new cant(30, new cans(11, 24), new cans(14, 25)), new cant(30, new cans(16, 15), new cans(14, 16))), new canu(24, new cant(30, new cans(6, 117), new cans(4, 118)), new cant(28, new cans(6, 45), new cans(14, 46)), new cant(30, new cans(11, 24), new cans(16, 25)), new cant(30, new cans(30, 16), new cans(2, 17))), new canu(25, new cant(26, new cans(8, 106), new cans(4, 107)), new cant(28, new cans(8, 47), new cans(13, 48)), new cant(30, new cans(7, 24), new cans(22, 25)), new cant(30, new cans(22, 15), new cans(13, 16))), new canu(26, new cant(28, new cans(10, 114), new cans(2, 115)), new cant(28, new cans(19, 46), new cans(4, 47)), new cant(28, new cans(28, 22), new cans(6, 23)), new cant(30, new cans(33, 16), new cans(4, 17))), new canu(27, new cant(30, new cans(8, 122), new cans(4, 123)), new cant(28, new cans(22, 45), new cans(3, 46)), new cant(30, new cans(8, 23), new cans(26, 24)), new cant(30, new cans(12, 15), new cans(28, 16))), new canu(28, new cant(30, new cans(3, 117), new cans(10, 118)), new cant(28, new cans(3, 45), new cans(23, 46)), new cant(30, new cans(4, 24), new cans(31, 25)), new cant(30, new cans(11, 15), new cans(31, 16))), new canu(29, new cant(30, new cans(7, 116), new cans(7, 117)), new cant(28, new cans(21, 45), new cans(7, 46)), new cant(30, new cans(1, 23), new cans(37, 24)), new cant(30, new cans(19, 15), new cans(26, 16))), new canu(30, new cant(30, new cans(5, 115), new cans(10, 116)), new cant(28, new cans(19, 47), new cans(10, 48)), new cant(30, new cans(15, 24), new cans(25, 25)), new cant(30, new cans(23, 15), new cans(25, 16))), new canu(31, new cant(30, new cans(13, 115), new cans(3, 116)), new cant(28, new cans(2, 46), new cans(29, 47)), new cant(30, new cans(42, 24), new cans(1, 25)), new cant(30, new cans(23, 15), new cans(28, 16))), new canu(32, new cant(30, new cans(17, 115)), new cant(28, new cans(10, 46), new cans(23, 47)), new cant(30, new cans(10, 24), new cans(35, 25)), new cant(30, new cans(19, 15), new cans(35, 16))), new canu(33, new cant(30, new cans(17, 115), new cans(1, 116)), new cant(28, new cans(14, 46), new cans(21, 47)), new cant(30, new cans(29, 24), new cans(19, 25)), new cant(30, new cans(11, 15), new cans(46, 16))), new canu(34, new cant(30, new cans(13, 115), new cans(6, 116)), new cant(28, new cans(14, 46), new cans(23, 47)), new cant(30, new cans(44, 24), new cans(7, 25)), new cant(30, new cans(59, 16), new cans(1, 17))), new canu(35, new cant(30, new cans(12, 121), new cans(7, 122)), new cant(28, new cans(12, 47), new cans(26, 48)), new cant(30, new cans(39, 24), new cans(14, 25)), new cant(30, new cans(22, 15), new cans(41, 16))), new canu(36, new cant(30, new cans(6, 121), new cans(14, 122)), new cant(28, new cans(6, 47), new cans(34, 48)), new cant(30, new cans(46, 24), new cans(10, 25)), new cant(30, new cans(2, 15), new cans(64, 16))), new canu(37, new cant(30, new cans(17, 122), new cans(4, 123)), new cant(28, new cans(29, 46), new cans(14, 47)), new cant(30, new cans(49, 24), new cans(10, 25)), new cant(30, new cans(24, 15), new cans(46, 16))), new canu(38, new cant(30, new cans(4, 122), new cans(18, 123)), new cant(28, new cans(13, 46), new cans(32, 47)), new cant(30, new cans(48, 24), new cans(14, 25)), new cant(30, new cans(42, 15), new cans(32, 16))), new canu(39, new cant(30, new cans(20, 117), new cans(4, 118)), new cant(28, new cans(40, 47), new cans(7, 48)), new cant(30, new cans(43, 24), new cans(22, 25)), new cant(30, new cans(10, 15), new cans(67, 16))), new canu(40, new cant(30, new cans(19, 118), new cans(6, 119)), new cant(28, new cans(18, 47), new cans(31, 48)), new cant(30, new cans(34, 24), new cans(34, 25)), new cant(30, new cans(20, 15), new cans(61, 16)))};
    }

    /* renamed from: a */
    public final cant mo74706a(canq canq) {
        return this.f175419d[canq.ordinal()];
    }
}
