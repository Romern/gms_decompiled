package p000;

/* renamed from: bqbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqbt {
    /* renamed from: a */
    static void m112529a(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    /* renamed from: a */
    public static void m112530a(boolean z, String str, int i, int i2) {
        if (!z) {
            StringBuilder sb = new StringBuilder(str.length() + 36);
            sb.append("overflow: ");
            sb.append(str);
            sb.append("(");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(")");
            throw new ArithmeticException(sb.toString());
        }
    }

    /* renamed from: a */
    static void m112531a(boolean z, String str, long j, long j2) {
        if (!z) {
            StringBuilder sb = new StringBuilder(str.length() + 54);
            sb.append("overflow: ");
            sb.append(str);
            sb.append("(");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(")");
            throw new ArithmeticException(sb.toString());
        }
    }
}
