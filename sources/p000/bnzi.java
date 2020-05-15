package p000;

import java.security.Key;
import java.util.Iterator;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bnzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnzi {

    /* renamed from: a */
    static final int f132400a = ((int) System.currentTimeMillis());

    /* renamed from: a */
    public static bnzb m110895a(Iterable iterable) {
        boolean z;
        Iterator it = iterable.iterator();
        bmxy.m108589a(it.hasNext(), "Must be at least 1 hash code to combine.");
        int a = ((bnzb) it.next()).mo68738a() / 8;
        byte[] bArr = new byte[a];
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            byte[] b = ((bnzb) it2.next()).mo68740b();
            if (b.length == a) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108589a(z, "All hashcodes must have the same bit length.");
            for (int i = 0; i < b.length; i++) {
                bArr[i] = (byte) (bArr[i] + b[i]);
            }
        }
        return bnzb.m110872b(bArr);
    }

    /* renamed from: b */
    public static bnzc m110900b() {
        return bnzw.f132429a;
    }

    @Deprecated
    /* renamed from: c */
    public static bnzc m110901c() {
        return bnzf.f132397a;
    }

    /* renamed from: d */
    public static bnzc m110902d() {
        return bnzg.f132398a;
    }

    /* renamed from: e */
    public static bnzc m110903e() {
        return bnzh.f132399a;
    }

    /* renamed from: f */
    public static bnzc m110904f() {
        return bnze.CRC_32.f132396c;
    }

    /* renamed from: g */
    public static bnzc m110905g() {
        return bnyx.f132388a;
    }

    /* renamed from: i */
    public static bnzc m110907i() {
        return new bnzw(-1514046234);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* renamed from: h */
    public static bnzc m110906h() {
        bmxy.m108589a(true, (Object) "Number of bits must be positive");
        return bnzy.f132437b;
    }

    /* renamed from: a */
    public static bnzc m110896a() {
        return bnzy.f132436a;
    }

    /* renamed from: a */
    public static bnzc m110897a(Key key) {
        return new bnzr("HmacSHA256", key, m110899a("hmacSha256", key));
    }

    /* renamed from: a */
    public static bnzc m110898a(byte[] bArr) {
        SecretKeySpec secretKeySpec = new SecretKeySpec((byte[]) bmxy.m108581a(bArr), "HmacSHA1");
        return new bnzr("HmacSHA1", secretKeySpec, m110899a("hmacSha1", secretKeySpec));
    }

    /* renamed from: a */
    private static String m110899a(String str, Key key) {
        return String.format("Hashing.%s(Key[algorithm=%s, format=%s])", str, key.getAlgorithm(), key.getFormat());
    }
}
