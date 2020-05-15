package p000;

/* renamed from: nam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nam {

    /* renamed from: a */
    private static final lvn f35141a = new lvn("MmsBackupSchedulerLog");

    /* renamed from: b */
    private final qws f35142b;

    public nam(qws qws) {
        this.f35142b = qws;
    }

    /* renamed from: a */
    public final void mo20411a(mqk mqk, mqj mqj) {
        if (!ccls.m130535n()) {
            f35141a.logVerbose("Logging is disabled.", new Object[0]);
            return;
        }
        f35141a.logVerbose("Logging to Clearcut eventCode: %s, event: %s", mqj, mqk);
        qwo a = this.f35142b.mo24335a(mqk.serializeToBytes());
        a.mo24328b(mqj.f34275R);
        a.mo24327b();
    }
}
