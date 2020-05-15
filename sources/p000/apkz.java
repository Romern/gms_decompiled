package p000;

/* renamed from: apkz */
final /* synthetic */ class apkz implements Runnable {

    /* renamed from: a */
    private final aplb f84650a;

    /* renamed from: b */
    private final String f84651b;

    public apkz(aplb aplb, String str) {
        this.f84650a = aplb;
        this.f84651b = str;
    }

    public final void run() {
        aplb aplb = this.f84650a;
        String str = this.f84651b;
        aplb.mo47385c();
        bljb a = blkh.m107281a("trigger_EXECUTION_CALLBACK");
        try {
            aplb.mo47234b(aapx.EXECUTION_CALLBACK);
            if (a != null) {
                a.close();
            }
            aplb.f84659e.mo49122c(str);
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
