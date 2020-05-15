package p000;

/* renamed from: bnri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bnri {
    protected bnri() {
        new bnrh(this);
    }

    /* renamed from: a */
    public static char[] m110166a(char[] cArr, int i, int i2) {
        if (i2 >= 0) {
            char[] cArr2 = new char[i2];
            if (i > 0) {
                System.arraycopy(cArr, 0, cArr2, 0, i);
            }
            return cArr2;
        }
        throw new AssertionError("Cannot increase internal buffer any further");
    }

    /* renamed from: a */
    public String mo68384a(String str) {
        throw null;
    }
}
