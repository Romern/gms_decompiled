package p000;

/* renamed from: ghp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ghp {

    /* renamed from: a */
    private static ghp f18272a;

    /* renamed from: b */
    private final aeat f18273b;

    private ghp(aeat aeat) {
        this.f18273b = aeat;
    }

    /* renamed from: a */
    public static synchronized ghp m13169a() {
        ghp ghp;
        synchronized (ghp.class) {
            if (f18272a == null) {
                ghp ghp2 = new ghp(aeat.m51532a(rpr.m34216b()));
                f18272a = ghp2;
                ghp2.mo11885b();
            }
            ghp = f18272a;
        }
        return ghp;
    }

    /* renamed from: b */
    public final void mo11885b() {
        aeat aeat = this.f18273b;
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.audit.upload.AuditGcmTaskService";
        aebi.mo34004a(cbwv.f178492a.mo6606a().mo75565f(), cbwv.f178492a.mo6606a().mo75564e());
        aebi.f63099k = "audit_task";
        aebi.mo34027b(1);
        aebi.f63102n = true;
        aebi.mo34028b(0, 0);
        aebi.mo34024a(0, 0);
        aebi.mo34026a(false);
        aeat.mo33984a(aebi.mo33974b());
    }
}
