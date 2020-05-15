package p000;

/* renamed from: as */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class C0033as {

    /* renamed from: c */
    final C0038ax f2101c;

    /* renamed from: d */
    boolean f2102d;

    /* renamed from: e */
    int f2103e = -1;

    /* renamed from: f */
    final /* synthetic */ C0034at f2104f;

    public C0033as(C0034at atVar, C0038ax axVar) {
        this.f2104f = atVar;
        this.f2101c = axVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2370a(boolean z) {
        if (z != this.f2102d) {
            this.f2102d = z;
            C0034at atVar = this.f2104f;
            int i = atVar.f2153d;
            atVar.f2153d = (!z ? -1 : 1) + i;
            if (i == 0 && z) {
                atVar.mo2443a();
            }
            C0034at atVar2 = this.f2104f;
            if (atVar2.f2153d == 0 && !this.f2102d) {
                atVar2.mo2451c();
            }
            if (this.f2102d) {
                this.f2104f.mo2446a(this);
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo2290a();

    /* renamed from: a */
    public boolean mo2309a(C0013ak akVar) {
        return false;
    }

    /* renamed from: b */
    public void mo2310b() {
    }
}
