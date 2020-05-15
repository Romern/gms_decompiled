package p000;

/* renamed from: aask */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aask {

    /* renamed from: a */
    public final String f56458a;

    /* renamed from: b */
    public long f56459b;

    /* renamed from: c */
    public boolean f56460c = false;

    /* renamed from: d */
    public boolean f56461d = false;

    /* renamed from: e */
    public boolean f56462e = false;

    /* renamed from: f */
    public final aasi f56463f = new aasi();

    /* renamed from: a */
    public final void mo31711a() {
        this.f56463f.deleteObservers();
    }

    /* renamed from: b */
    public final void mo31713b(boolean z) {
        this.f56461d = z;
        if (z) {
            this.f56463f.mo31710b();
        }
    }

    public aask(String str, long j, boolean z) {
        this.f56458a = str;
        this.f56459b = j;
        this.f56460c = z;
    }

    /* renamed from: a */
    public final void mo31712a(boolean z) {
        this.f56462e = z;
        if (z) {
            this.f56463f.mo31710b();
        }
    }
}
