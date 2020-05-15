package p000;

/* renamed from: bdat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdat {

    /* renamed from: a */
    public final bdar f105248a;

    /* renamed from: b */
    public boolean f105249b = false;

    /* renamed from: c */
    final /* synthetic */ bdav f105250c;

    /* renamed from: d */
    private final bdaq f105251d;

    public bdat(bdav bdav, bdar bdar) {
        this.f105250c = bdav;
        this.f105248a = bdar;
        this.f105251d = new bdas(this);
    }

    /* renamed from: a */
    public final synchronized void mo57833a() {
        this.f105249b = false;
        this.f105248a.mo56710a(this.f105251d);
    }

    /* renamed from: b */
    public final synchronized void mo57834b() {
        this.f105248a.mo56711b(this.f105251d);
        this.f105249b = false;
    }
}
