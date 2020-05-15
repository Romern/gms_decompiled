package p000;

/* renamed from: cavv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cavv extends cavc {

    /* renamed from: b */
    final /* synthetic */ int f176179b;

    /* renamed from: c */
    final /* synthetic */ cawc f176180c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cavv(cawc cawc, String str, Object[] objArr, int i) {
        super(str, objArr);
        this.f176180c = cawc;
        this.f176179b = i;
    }

    /* renamed from: a */
    public final void mo74949a() {
        synchronized (this.f176180c) {
            this.f176180c.f176213s.remove(Integer.valueOf(this.f176179b));
        }
    }
}
