package p000;

/* renamed from: saf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class saf {

    /* renamed from: d */
    public Object f43917d;

    /* renamed from: e */
    public boolean f43918e = false;

    /* renamed from: f */
    final /* synthetic */ sam f43919f;

    public saf(sam sam, Object obj) {
        this.f43919f = sam;
        this.f43917d = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25280a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo25282b();

    /* renamed from: c */
    public final void mo25284c() {
        mo25285d();
        sam sam = this.f43919f;
        String[] strArr = sam.f43928G;
        synchronized (sam.f43955y) {
            this.f43919f.f43955y.remove(this);
        }
    }

    /* renamed from: d */
    public final void mo25285d() {
        synchronized (this) {
            this.f43917d = null;
        }
    }
}
