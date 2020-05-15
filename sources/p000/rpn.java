package p000;

/* renamed from: rpn */
final /* synthetic */ class rpn implements Runnable {

    /* renamed from: a */
    private final rpq f43491a;

    public rpn(rpq rpq) {
        this.f43491a = rpq;
    }

    public final void run() {
        rpq rpq = this.f43491a;
        if ("com.google.android.gms".equals(ssy.m36271a())) {
            if (cdme.m134017c()) {
                rpq.mo24993a("com.google.android.gms.common.systemhealthutils.restart.GmsRestartGmsService", "scheduled-restart-gms");
            }
        } else if (spn.m35873c() && cdme.m134018d()) {
            rpq.mo24993a("com.google.android.gms.common.systemhealthutils.restart.GmsRestartPersistentService", "scheduled-restart-persistent");
        }
    }
}
