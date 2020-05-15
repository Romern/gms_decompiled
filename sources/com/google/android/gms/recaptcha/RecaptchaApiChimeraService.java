package com.google.android.gms.recaptcha;

import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecaptchaApiChimeraService extends zzx {

    /* renamed from: a */
    protected bxyk f83482a;

    /* renamed from: b */
    protected vvq f83483b;

    /* renamed from: k */
    private final aorp f83484k;

    static {
        RecaptchaApiChimeraService.class.getSimpleName();
    }

    public RecaptchaApiChimeraService() {
        this(aorq.m66329a(), new aopm());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (p000.bxzt.m124579a(r5.f83482a, r5.f83484k.mo43193a()).f164863a <= p000.cghx.f186975a.mo6606a().mo83821a()) goto L_0x0038;
     */
    /* renamed from: a */
    public final synchronized vvq mo46801a() {
        vvq vvq = this.f83483b;
        if (vvq != null) {
            if (vvq.mo28906a()) {
            }
        }
        this.f83483b = vvp.m41462a(this, "recaptcha-android");
        this.f83482a = this.f83484k.mo43193a();
        return this.f83483b;
    }

    /* renamed from: b */
    public final synchronized boolean mo46802b() {
        boolean z;
        vvq vvq = this.f83483b;
        if (vvq == null || !vvq.mo28906a()) {
            z = false;
        } else {
            this.f83483b.mo28907b();
            this.f83483b = null;
            z = true;
        }
        return z;
    }

    protected RecaptchaApiChimeraService(aorp aorp, aopm aopm) {
        super(205, "com.google.android.gms.recaptcha.service.START", bnon.f131923a, 3, 9);
        this.f83484k = aorp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new aoqb(this, new aaag(this, this.f56354e, this.f56355f), getServiceRequest.f30230d));
    }
}
