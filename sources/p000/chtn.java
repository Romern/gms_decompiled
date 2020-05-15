package p000;

import java.util.BitSet;
import java.util.Locale;

/* renamed from: chtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class chtn {

    /* renamed from: c */
    private static final BitSet f189128c;

    /* renamed from: a */
    public final String f189129a;

    /* renamed from: b */
    public final byte[] f189130b;

    /* renamed from: d */
    private final String f189131d;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        f189128c = bitSet;
    }

    public chtn(String str, boolean z) {
        bmxy.m108582a(str, "name");
        this.f189131d = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        bmxy.m108582a(lowerCase, "name");
        bmxy.m108589a(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        int i = 0;
        while (i < lowerCase.length()) {
            char charAt = lowerCase.charAt(i);
            if ((z && charAt == ':' && i == 0) || f189128c.get(charAt)) {
                i++;
            } else {
                throw new IllegalArgumentException(bmzh.m108675a("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
            }
        }
        this.f189129a = lowerCase;
        this.f189130b = lowerCase.getBytes(bmwy.f131156a);
    }

    /* renamed from: a */
    public static chtn m149535a(String str, chti chti) {
        return new chth(str, chti);
    }

    /* renamed from: a */
    public abstract Object mo85635a(byte[] bArr);

    /* renamed from: a */
    public abstract byte[] mo85636a(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f189129a.equals(((chtn) obj).f189129a);
    }

    public final int hashCode() {
        return this.f189129a.hashCode();
    }

    public final String toString() {
        String str = this.f189129a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append("Key{name='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    /* renamed from: a */
    public static chtn m149536a(String str, chtk chtk) {
        return new chtj(str, chtk);
    }

    /* renamed from: a */
    static chtn m149537a(String str, boolean z, chtq chtq) {
        return new chtp(str, z, chtq);
    }
}
