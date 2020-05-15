package p000;

import com.google.android.gms.fido.credentialstore.KeyData;

/* renamed from: xcr */
final /* synthetic */ class xcr implements bmxj {

    /* renamed from: a */
    private final xct f51957a;

    /* renamed from: b */
    private final String f51958b;

    /* renamed from: c */
    private final byte[] f51959c;

    public xcr(xct xct, String str, byte[] bArr) {
        this.f51957a = xct;
        this.f51958b = str;
        this.f51959c = bArr;
    }

    public final Object apply(Object obj) {
        xct xct = this.f51957a;
        String str = this.f51958b;
        byte[] bArr = this.f51959c;
        try {
            if (((Boolean) obj).booleanValue()) {
                return bmxv.m108566b(KeyData.m23436a(xdd.m42691a(xct.f51964c).f52779d, xct.f51964c));
            }
            return xct.mo29644a(str, bArr);
        } catch (adbe e) {
            throw e.mo33303c();
        }
    }
}
