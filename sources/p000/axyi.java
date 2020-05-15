package p000;

/* renamed from: axyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axyi {

    /* renamed from: a */
    public Object f96764a;

    /* renamed from: b */
    public final long f96765b;

    /* renamed from: c */
    final axyh f96766c = new axyh(this);

    /* renamed from: d */
    public final ayab f96767d;

    /* renamed from: e */
    public int f96768e;

    /* renamed from: f */
    public boolean f96769f;

    /* renamed from: g */
    public final Object f96770g = new Object();

    /* renamed from: h */
    final /* synthetic */ axyj f96771h;

    public axyi(axyj axyj, Object obj, long j, int i, ayab ayab) {
        this.f96771h = axyj;
        sdo.m34959a(obj);
        this.f96764a = obj;
        this.f96765b = j;
        sdo.m34959a(ayab);
        this.f96767d = ayab;
        this.f96768e = i + 1;
    }

    /* renamed from: a */
    public final boolean mo53764a() {
        synchronized (this.f96770g) {
            if (this.f96769f) {
                return false;
            }
            this.f96769f = true;
            this.f96764a = null;
            axyf axyf = this.f96771h.f96773a;
            axyf.f96762a.removeCallbacks(this.f96766c);
            this.f96771h.f96775c.mo54000a();
            return true;
        }
    }
}
