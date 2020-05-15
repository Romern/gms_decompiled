package p000;

import java.util.Arrays;
import java.util.Random;

/* renamed from: xlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xlu {

    /* renamed from: c */
    private static final bypv f52692c = bypx.m125085a("version");

    /* renamed from: d */
    private static final bypv f52693d = bypx.m125085a("irk");

    /* renamed from: e */
    private static final bypv f52694e = bypx.m125085a("lk");

    /* renamed from: g */
    private static final sek f52695g = new sek(new String[]{"CableCredentialData"}, (short[]) null);

    /* renamed from: a */
    public final byte[] f52696a;

    /* renamed from: b */
    public final byte[] f52697b;

    /* renamed from: f */
    private final int f52698f = 1;

    public xlu(byte[] bArr, byte[] bArr2) {
        this.f52696a = (byte[]) sdo.m34959a(bArr);
        this.f52697b = (byte[]) sdo.m34959a(bArr2);
    }

    /* renamed from: a */
    public static xlu m43152a(bypx bypx) {
        if (bypx == null) {
            return null;
        }
        try {
            bnim bnim = bypx.mo74447f().f167361a;
            if (bnim.containsKey(f52692c)) {
                if (((bypx) bnim.get(f52692c)).mo74446e().f167358a == 1) {
                    if (bnim.containsKey(f52693d) && bnim.containsKey(f52694e)) {
                        return new xlu(((bypx) bnim.get(f52693d)).mo74445d().f167357a.mo73780k(), ((bypx) bnim.get(f52694e)).mo74445d().f167357a.mo73780k());
                    }
                    f52695g.mo25418e("Missing key material in CableCredentialData decoding", new Object[0]);
                    return null;
                }
            }
            f52695g.mo25418e("Missing or unknown version CableCredentialData decoding", new Object[0]);
            return null;
        } catch (bypw e) {
            f52695g.mo25417e("Unable to deserialize object.", e, new Object[0]);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xlu) {
            xlu xlu = (xlu) obj;
            int i = xlu.f52698f;
            return Arrays.equals(this.f52697b, xlu.f52697b) && Arrays.equals(this.f52696a, xlu.f52696a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{1, this.f52696a, this.f52697b});
    }

    /* renamed from: a */
    public static xlu m43153a(Random random) {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[32];
        random.nextBytes(bArr);
        random.nextBytes(bArr2);
        return new xlu(bArr, bArr2);
    }

    /* renamed from: a */
    public final bypx mo29922a() {
        try {
            return bypx.m125084a(new bypt(f52692c, bypx.m125083a(1)), new bypt(f52693d, bypx.m125082a(this.f52696a)), new bypt(f52694e, bypx.m125082a(this.f52697b)));
        } catch (bypm e) {
            f52695g.mo25417e("Unable to serialize object", e, new Object[0]);
            return null;
        }
    }
}
