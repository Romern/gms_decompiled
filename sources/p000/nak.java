package p000;

/* renamed from: nak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nak {

    /* renamed from: a */
    private static final lvn f35136a = new lvn("GmsBackupSchedulerLog");

    /* renamed from: b */
    private final qws f35137b;

    public nak(qws qws) {
        this.f35137b = qws;
    }

    /* renamed from: a */
    public final void mo20409a(mqk mqk, mqj mqj) {
        if (!ccli.f179330a.mo6606a().mo76272e()) {
            f35136a.mo25409a("Logging is disabled.", new Object[0]);
            return;
        }
        f35136a.mo25409a("Logging to Clearcut eventCode: %s, event: %s", mqj, mqk);
        qwo a = this.f35137b.mo24335a(mqk.mo73642k());
        a.mo24328b(mqj.f34275R);
        a.mo24327b();
    }
}
