package p000;

import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;

/* renamed from: guw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class guw extends gus {

    /* renamed from: d */
    public final byte[] f19047d;

    public guw(int i, guk guk, String str, byte[] bArr) {
        super(i, guk, str);
        this.f19047d = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AuthenticatorTransferInfo mo12250a() {
        gtz gtz = new gtz();
        gtz.mo12221a(this.f19045c);
        gtz.f19016c = this.f19047d;
        gtz.f19019f.add(4);
        gtz.mo12220a(3);
        return gtz.mo12219a();
    }
}
