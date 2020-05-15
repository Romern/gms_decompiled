package p000;

import java.io.IOException;

/* renamed from: boan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class boan {

    /* renamed from: d */
    public static final boan f132470d = new boaj("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: e */
    public static final boan f132471e = new boaj("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: f */
    public static final boan f132472f = new boai(new boah("base16()", "0123456789ABCDEF".toCharArray()));

    static {
        new boam("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new boam("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    }

    /* renamed from: a */
    public abstract int mo68782a(int i);

    /* renamed from: a */
    public abstract int mo68779a(byte[] bArr, CharSequence charSequence);

    /* renamed from: a */
    public abstract boan mo68783a();

    /* renamed from: a */
    public abstract boan mo68784a(String str, int i);

    /* renamed from: a */
    public CharSequence mo68785a(CharSequence charSequence) {
        throw null;
    }

    /* renamed from: a */
    public abstract void mo68781a(Appendable appendable, byte[] bArr, int i);

    /* renamed from: b */
    public abstract int mo68786b(int i);

    /* renamed from: b */
    public abstract boan mo68787b();

    /* renamed from: c */
    public abstract boan mo68788c();

    /* renamed from: a */
    public final String mo68794a(byte[] bArr) {
        return mo68795a(bArr, bArr.length);
    }

    /* renamed from: b */
    public final byte[] mo68796b(CharSequence charSequence) {
        try {
            CharSequence a = mo68785a(charSequence);
            int b = mo68786b(a.length());
            byte[] bArr = new byte[b];
            int a2 = mo68779a(bArr, a);
            if (a2 == b) {
                return bArr;
            }
            byte[] bArr2 = new byte[a2];
            System.arraycopy(bArr, 0, bArr2, 0, a2);
            return bArr2;
        } catch (boak e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public final String mo68795a(byte[] bArr, int i) {
        bmxy.m108585a(0, i, bArr.length);
        StringBuilder sb = new StringBuilder(mo68782a(i));
        try {
            mo68781a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
