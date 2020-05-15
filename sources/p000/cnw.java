package p000;

import android.graphics.Bitmap;

/* renamed from: cnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cnw extends cnl implements cge {
    public cnw(cnu cnu) {
        super(cnu);
    }

    /* renamed from: a */
    public final Class mo3841a() {
        return cnu.class;
    }

    /* renamed from: c */
    public final int mo3843c() {
        coa coa = ((cnu) this.f7105a).f7116a.f7115a;
        ccs ccs = (ccs) coa.f7134a;
        return ccs.f6536a.limit() + ccs.f6538c.length + (ccs.f6539d.length * 4) + coa.f7140g;
    }

    /* renamed from: d */
    public final void mo3844d() {
        cgr cgr;
        ((cnu) this.f7105a).stop();
        cnu cnu = (cnu) this.f7105a;
        cnu.f7117b = true;
        coa coa = cnu.f7116a.f7115a;
        coa.f7135b.clear();
        coa.mo4031d();
        coa.mo4029b();
        cqb cqb = coa.f7143j;
        if (cqb != null) {
            coa.f7136c.mo3683a(cqb);
            coa.f7143j = null;
        }
        cqb cqb2 = coa.f7144k;
        if (cqb2 != null) {
            coa.f7136c.mo3683a(cqb2);
            coa.f7144k = null;
        }
        cqb cqb3 = coa.f7145l;
        if (cqb3 != null) {
            coa.f7136c.mo3683a(cqb3);
            coa.f7145l = null;
        }
        ccs ccs = (ccs) coa.f7134a;
        ccs.f6541f = null;
        byte[] bArr = ccs.f6538c;
        if (bArr != null) {
            ccs.f6545j.mo4004a(bArr);
        }
        int[] iArr = ccs.f6539d;
        if (!(iArr == null || (cgr = ccs.f6545j.f7114b) == null)) {
            cgr.mo3874a(iArr);
        }
        Bitmap bitmap = ccs.f6542g;
        if (bitmap != null) {
            ccs.f6545j.mo4003a(bitmap);
        }
        ccs.f6542g = null;
        ccs.f6536a = null;
        ccs.f6543h = null;
        byte[] bArr2 = ccs.f6537b;
        if (bArr2 != null) {
            ccs.f6545j.mo4004a(bArr2);
        }
        coa.f7138e = true;
    }

    /* renamed from: e */
    public final void mo3858e() {
        ((cnu) this.f7105a).mo4009b().prepareToDraw();
    }
}
