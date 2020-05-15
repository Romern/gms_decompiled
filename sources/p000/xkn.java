package p000;

import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: xkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xkn extends xkf {

    /* renamed from: a */
    static final byps f52560a = bypx.m125083a(1);

    /* renamed from: b */
    static final byps f52561b = bypx.m125083a(2);

    /* renamed from: c */
    static final byps f52562c = bypx.m125083a(3);

    /* renamed from: d */
    static final byps f52563d = bypx.m125083a(4);

    /* renamed from: e */
    static final byps f52564e = bypx.m125083a(5);

    /* renamed from: f */
    static final byps f52565f = bypx.m125083a(6);

    /* renamed from: g */
    static final byps f52566g = bypx.m125083a(7);

    /* renamed from: k */
    private static final bnic f52567k = bnic.m109490a(f52560a, f52561b);

    /* renamed from: l */
    private static final bnic f52568l = bnic.m109494a(f52560a, f52561b, f52562c, f52563d, f52564e, f52565f, f52566g);

    /* renamed from: r */
    private static final sek f52569r = new sek(new String[]{"AuthenticatorGetAssertionCommand"}, (short[]) null);

    /* renamed from: h */
    public final String f52570h;

    /* renamed from: i */
    public final byte[] f52571i;

    /* renamed from: j */
    public final List f52572j;

    /* renamed from: m */
    private final AuthenticationExtensions f52573m;

    /* renamed from: n */
    private final boolean f52574n;

    /* renamed from: o */
    private final boolean f52575o;

    /* renamed from: p */
    private final byte[] f52576p = null;

    /* renamed from: q */
    private final Integer f52577q = null;

    public xkn(String str, byte[] bArr, List list, AuthenticationExtensions authenticationExtensions, boolean z, boolean z2) {
        this.f52570h = str;
        this.f52571i = bArr;
        this.f52572j = list;
        this.f52573m = authenticationExtensions;
        this.f52574n = z;
        this.f52575o = z2;
    }

    /* renamed from: a */
    public static xkn m43097a(bypx bypx) {
        bnim a = xkc.m43083a(bypx, "Request data for AuthenticatorGetAssertion command not encoded in CBOR map");
        if (a.f131670c.containsAll(f52567k)) {
            bnrd a2 = bnpf.m110057c(a.f131670c, f52568l).iterator();
            while (a2.hasNext()) {
                f52569r.mo25414c("Unrecognized key present in response map: %s", (bypx) a2.next());
            }
            xkm xkm = new xkm();
            xkm.mo29868a(xkc.m43084b((bypx) a.get(f52561b), "Client data hash not encoded as CBOR bytestring"));
            xkm.mo29867a(xkc.m43085c((bypx) a.get(f52560a), "RP ID not encoded as CBOR textstring"));
            if (a.containsKey(f52562c)) {
                bngx e = xkc.m43087e((bypx) a.get(f52562c), "Allow list not encoded as CBOR array");
                ArrayList arrayList = new ArrayList();
                try {
                    bnre i = e.listIterator();
                    while (i.hasNext()) {
                        arrayList.add(PublicKeyCredentialDescriptor.m23481a((bypx) i.next()));
                    }
                    xkm.f52554a = arrayList;
                } catch (xpz e2) {
                    throw new xkk("Invalid credential descriptor included in allow list", e2);
                }
            }
            return xkm.mo29866a();
        }
        throw new xkk("Request map for AuthenticatorGetAssertion is missing one or more of the rpId and clientDataHash required fields");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c3 A[Catch:{ bypm -> 0x00d2 }] */
    /* renamed from: b */
    public final bypu mo29861b() {
        bypu bypu;
        sdo.m34959a((Object) this.f52570h);
        sdo.m34959a(this.f52571i);
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(new bypt(f52560a, bypx.m125085a(this.f52570h)));
            arrayList.add(new bypt(f52561b, bypx.m125082a(this.f52571i)));
            if (this.f52572j != null) {
                byps byps = f52562c;
                List<PublicKeyCredentialDescriptor> list = this.f52572j;
                ArrayList arrayList2 = new ArrayList();
                for (PublicKeyCredentialDescriptor publicKeyCredentialDescriptor : list) {
                    arrayList2.add(publicKeyCredentialDescriptor.mo18717a());
                }
                arrayList.add(new bypt(byps, bypx.m125079a(arrayList2)));
            }
            if (this.f52573m != null) {
                byps byps2 = f52563d;
                AuthenticationExtensions authenticationExtensions = this.f52573m;
                ArrayList arrayList3 = new ArrayList();
                if (authenticationExtensions.f31717c != null) {
                    arrayList3.add(new bypt(xqv.f52947l, bypx.m125081a(true)));
                }
                arrayList.add(new bypt(byps2, bypx.m125086b(arrayList3)));
            }
            boolean z = this.f52574n;
            boolean z2 = this.f52575o;
            if (z) {
                if (!z2) {
                    bypu = null;
                    if (bypu != null) {
                        arrayList.add(new bypt(f52564e, bypu));
                    }
                    return bypx.m125086b(arrayList);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            if (!z) {
                arrayList4.add(new bypt(xqv.f52945j, bypx.m125081a(false)));
            }
            if (z2) {
                arrayList4.add(new bypt(xqv.f52946k, bypx.m125081a(true)));
            }
            bypu = bypx.m125086b(arrayList4);
            if (bypu != null) {
            }
            return bypx.m125086b(arrayList);
        } catch (bypm e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xkn) {
            xkn xkn = (xkn) obj;
            if (bmxi.m108538a(this.f52570h, xkn.f52570h) && Arrays.equals(this.f52571i, xkn.f52571i) && bmxi.m108538a(this.f52572j, xkn.f52572j) && bmxi.m108538a(this.f52573m, xkn.f52573m) && this.f52574n == xkn.f52574n && this.f52575o == xkn.f52575o) {
                byte[] bArr = xkn.f52576p;
                if (Arrays.equals((byte[]) null, (byte[]) null)) {
                    Integer num = xkn.f52577q;
                    if (bmxi.m108538a(null, null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52570h, Integer.valueOf(Arrays.hashCode(this.f52571i)), this.f52572j, this.f52573m, Boolean.valueOf(this.f52574n), Boolean.valueOf(this.f52575o), Integer.valueOf(Arrays.hashCode((byte[]) null)), null});
    }

    /* renamed from: a */
    public final xke mo29860a() {
        return xke.AUTHENTICATOR_GET_ASSERTION;
    }
}
