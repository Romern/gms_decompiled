package p000;

/* renamed from: sev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sev {

    /* renamed from: a */
    public static qxq f44097a;

    /* renamed from: b */
    private final String f44098b;

    public sev(String str) {
        sdo.m34959a((Object) str);
        this.f44098b = str;
    }

    /* renamed from: a */
    private static synchronized void m35099a(String str) {
        synchronized (sev.class) {
            if (cdly.f181215a.mo6606a().mo77876b()) {
                f44097a.mo24383c(str).mo24359a();
                f44097a.mo24388e();
            }
        }
    }

    /* renamed from: b */
    public final void mo25434b() {
        m35099a(this.f44098b.concat("-cancelled"));
    }

    /* renamed from: c */
    public final void mo25435c() {
        m35099a(this.f44098b.concat("-blocked"));
    }

    /* renamed from: a */
    public final void mo25433a() {
        m35099a(this.f44098b.concat("-notified"));
    }
}
