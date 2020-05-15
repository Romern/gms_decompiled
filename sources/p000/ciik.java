package p000;

/* renamed from: ciik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciik implements ciiv {

    /* renamed from: a */
    public final chqs f190404a;

    /* renamed from: b */
    public boolean f190405b;

    /* renamed from: c */
    private boolean f190406c;

    /* renamed from: d */
    private boolean f190407d;

    public ciik() {
    }

    /* renamed from: a */
    public final void mo25548a() {
        this.f190404a.mo70032b();
        this.f190407d = true;
    }

    /* renamed from: a */
    public final void mo25549a(Object obj) {
        bmxy.m108601b(!this.f190406c, "Stream was terminated by error, no further calls are allowed");
        bmxy.m108601b(!this.f190407d, "Stream is already completed, no further calls are allowed");
        this.f190404a.mo70030a(obj);
    }

    public ciik(chqs chqs) {
        this.f190405b = true;
        this.f190406c = false;
        this.f190407d = false;
        this.f190404a = chqs;
    }

    /* renamed from: a */
    public final void mo25550a(Throwable th) {
        this.f190404a.mo70031a("Cancelled by client with StreamObserver.onError()", th);
        this.f190406c = true;
    }
}
