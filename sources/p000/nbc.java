package p000;

import java.util.Arrays;

/* renamed from: nbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nbc {
    /* renamed from: a */
    private static String m25874a(byte[] bArr, int i, int i2) {
        return Arrays.toString(Arrays.copyOfRange(bArr, i, i2));
    }

    /* renamed from: a */
    public abstract byte[] mo20415a();

    /* renamed from: b */
    public abstract nbw mo20416b();

    /* renamed from: c */
    public abstract byte[] mo20417c();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    public final String toString() {
        int length;
        StringBuilder sb = new StringBuilder();
        sb.append("EncryptedChunk{encryptedBytes=");
        byte[] a = mo20415a();
        if (a == null || (length = a.length) <= 6) {
            sb.append(Arrays.toString(a));
        } else {
            String a2 = m25874a(a, 0, 3);
            sb.append((CharSequence) a2, 0, a2.length() - 1);
            sb.append(", ... , ");
            String a3 = m25874a(a, length - 3, length);
            sb.append((CharSequence) a3, 1, a3.length());
        }
        sb.append(", key=");
        sb.append(mo20416b());
        sb.append(", nonce=");
        sb.append(Arrays.toString(mo20417c()));
        sb.append('}');
        return sb.toString();
    }
}
