package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: xkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xkv extends xkh {

    /* renamed from: a */
    static final bypx f52628a = bypx.m125083a(1);

    /* renamed from: b */
    static final bypx f52629b = bypx.m125083a(2);

    /* renamed from: c */
    static final bypx f52630c;

    /* renamed from: d */
    private static final bniq f52631d;

    /* renamed from: h */
    private static final sek f52632h = new sek(new String[]{"AuthenticatorMakeCredentialResponseData"}, (short[]) null);

    /* renamed from: e */
    private final byte[] f52633e;

    /* renamed from: f */
    private final String f52634f;

    /* renamed from: g */
    private final byte[] f52635g;

    static {
        byps a = bypx.m125083a(3);
        f52630c = a;
        bypx bypx = f52629b;
        bypx bypx2 = f52628a;
        f52631d = bniq.m109553a(bnnt.f131877a, 3, bypx, bypx2, a);
    }

    public xkv(byte[] bArr, String str, byte[] bArr2) {
        this.f52633e = (byte[]) sdo.m34959a(bArr);
        sdo.m34959a((Object) str);
        this.f52634f = str;
        this.f52635g = (byte[]) sdo.m34959a(bArr2);
    }

    /* renamed from: a */
    public static xkv m43119a(bypx bypx) {
        bnim a = xkc.m43083a(bypx, "Response data for AuthenticatorMakeCredential not encoded in CBOR map");
        if (a.f131670c.containsAll(f52631d)) {
            bnrd a2 = bnpf.m110057c(a.f131670c, f52631d).iterator();
            while (a2.hasNext()) {
                f52632h.mo25414c("Unrecognized key present in response map: %s", (bypx) a2.next());
            }
            byte[] b = xkc.m43084b((bypx) a.get(f52629b), "Response map for AuthenticatorMakeCredential contains a non-bytestring CBOR value for authData label");
            String c = xkc.m43085c((bypx) a.get(f52628a), "Response map for AuthenticatorMakeCredential contains a non-textstring CBOR value for format label");
            bypx bypx2 = (bypx) a.get(f52630c);
            sdo.m34959a(bypx2);
            try {
                return new xkv(b, c, bypx2.mo74444c());
            } catch (bypr e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new xkk("Response map for AuthenticatorMakeCredential does not contain required keys");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xkv) {
            xkv xkv = (xkv) obj;
            if (!Arrays.equals(this.f52633e, xkv.f52633e) || !this.f52634f.equals(xkv.f52634f) || !Arrays.equals(this.f52635g, xkv.f52635g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f52633e)), this.f52634f, Integer.valueOf(Arrays.hashCode(this.f52635g))});
    }

    /* renamed from: a */
    public final bypu mo29865a() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new bypt(f52629b, bypx.m125082a(this.f52633e)));
            arrayList.add(new bypt(f52628a, bypx.m125085a(this.f52634f)));
            arrayList.add(new bypt(f52630c, bypx.m125087b(this.f52635g)));
            return bypx.m125086b(arrayList);
        } catch (bypm | bypq e) {
            throw new RuntimeException(e);
        }
    }
}
