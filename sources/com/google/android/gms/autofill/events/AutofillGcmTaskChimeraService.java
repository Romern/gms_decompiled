package com.google.android.gms.autofill.events;

import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutofillGcmTaskChimeraService extends aeah {

    /* renamed from: a */
    public static final /* synthetic */ int f11624a = 0;

    /* renamed from: b */
    private static final srn f11625b = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: c */
    private bnhe f11626c;

    /* renamed from: d */
    private cijl f11627d;

    /* renamed from: e */
    private cijl f11628e;

    /* renamed from: g */
    private cijl f11629g;

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        int i;
        aeeu aeeu;
        kpy kpy = (kpy) this.f11626c.get(aecc.f63128a);
        String str = aecc.f63128a;
        if (kpy == null) {
            bnsl bnsl = (bnsl) f11625b.mo68388c();
            bnsl.mo68432a("com.google.android.gms.autofill.events.AutofillGcmTaskChimeraService", "a", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("No affiliated Task for Tag: %s", aecc.f63128a);
            return 2;
        } else if (ccip.m129868h()) {
            if (ccip.m129874n()) {
                bbjl a = ((aeez) this.f11627d.mo6445a()).mo34111a(aecc.f63128a);
                aeeu = ((aeeh) this.f11628e.mo6445a()).mo34089g((kbb) a.mo56168a());
                i = a.mo56169b();
            } else {
                aeeu = ((aeeh) this.f11628e.mo6445a()).mo34089g(kbb.SYNC_ID_PREDICTIONS_DOWNLOAD);
                i = aeeu.mo34065a(aecc.f63128a);
            }
            return aeeu.mo34063a(aeeu.mo34066a(new kpm(kpy), i, (Executor) this.f11629g.mo6445a()), i);
        } else {
            kpx a2 = kpy.mo14774a();
            if (a2 == kpx.SUCCESS) {
                return 0;
            }
            if (a2 == kpx.RESCHEDULE) {
                return 1;
            }
            return 2;
        }
    }

    public final void onCreate() {
        super.onCreate();
        kre a = krc.m18382a(this);
        this.f11626c = a.mo14841p();
        this.f11628e = a.mo14849x();
        this.f11627d = a.mo14848w();
        this.f11629g = a.mo14850y();
    }
}
