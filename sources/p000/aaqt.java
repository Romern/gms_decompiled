package p000;

import java.util.concurrent.ExecutorService;

/* renamed from: aaqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaqt extends aakq {

    /* renamed from: a */
    public final ExecutorService f28945a = snp.m35704b(10);

    /* renamed from: b */
    private final aajt f28946b;

    /* renamed from: c */
    private final aaqx f28947c;

    /* renamed from: d */
    private final aaqs f28948d;

    public aaqt(aajt aajt, aaqx aaqx, aaqs aaqs) {
        this.f28946b = aajt;
        this.f28947c = aaqx;
        this.f28948d = aaqs;
    }

    /* renamed from: a */
    public final void mo16940a(aamh aamh) {
        if (this.f28948d.mo17191b(aamh)) {
            aajt aajt = this.f28946b;
            for (blmp blmp : aajt.f28315r.mo16951a(aamh)) {
                aajt.mo16916b(blmp);
            }
        }
    }

    /* renamed from: b */
    public final void mo16942b(aamh aamh) {
        if (!this.f28948d.mo17191b(aamh)) {
            aaqs aaqs = this.f28948d;
            aaqx aaqx = this.f28947c;
            if (aaqs.mo17190a(aamh) && (!ceck.m135993c() || !aytw.m84813a(aaqs.f28942a))) {
                aaqx.mo17196a(new aaqr(aaqs, aaqx, aamh));
            }
            this.f28946b.f28315r.mo16951a(aamh);
        }
    }
}
