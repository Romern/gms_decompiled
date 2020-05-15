package p000;

/* renamed from: vfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class vfb {

    /* renamed from: a */
    private static final sbw f49155a = new sbw("PreferenceGuard", "");

    /* renamed from: b */
    private vfa f49156b;

    /* renamed from: i */
    public final vez f49157i = new vez();

    /* renamed from: a */
    private final void m40264a(int i) {
        if (i != this.f49157i.mo28370a()) {
            this.f49157i.mo28371a(i);
        }
    }

    /* renamed from: a */
    public abstract vfk mo28357a();

    /* renamed from: c */
    public abstract void mo28374c(txg txg);

    /* renamed from: c */
    public final synchronized boolean mo28375c() {
        return this.f49157i.mo28370a() == 0;
    }

    /* renamed from: d */
    public final synchronized void mo28376d() {
        m40264a(3);
    }

    /* renamed from: e */
    public final synchronized boolean mo28377e() {
        return this.f49157i.mo28370a() == 3;
    }

    /* renamed from: f */
    public final synchronized void mo28378f() {
        vfa vfa = this.f49156b;
        if (vfa == null) {
            f49155a.mo25377c("PreferenceGuard", "The cleaner was not defined.");
        } else {
            vfa.mo28362a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28372a(vfa vfa) {
        sdo.m34959a(vfa);
        this.f49156b = vfa;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo28373a(boolean z) {
        if (!mo28377e()) {
            m40264a(!z ? 2 : 0);
        }
    }
}
