package p000;

/* renamed from: beuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beuc extends besn {

    /* renamed from: a */
    private boolean f112458a = false;

    /* renamed from: b */
    private bgnu f112459b = null;

    /* renamed from: c */
    private bgnu f112460c = null;

    public beuc(berb berb) {
        super(berb);
        bxbm.m122541a(this.f112402j);
    }

    /* renamed from: b */
    public final void mo61099b(boolean z) {
        super.mo61099b(z);
        if (!this.f112458a) {
            this.f112396d.mo60972a(false);
            mo61132c(39);
        }
    }

    /* renamed from: g */
    public final void mo61083g() {
        super.mo61083g();
        if (this.f112396d.f112199z.mo63024a()) {
            bgnu bgnu = this.f112396d.f112199z;
            this.f112459b = bgnu;
            bgnu.mo63025a(this);
        }
        if (this.f112396d.f112113A.mo63024a()) {
            bgnu bgnu2 = this.f112396d.f112113A;
            this.f112460c = bgnu2;
            bgnu2.mo63025a(this);
        }
        if (this.f112459b == null && this.f112460c == null) {
            this.f112400h.mo62049a(bfos.SMD_STATE_ENTERED, 1);
        } else {
            this.f112400h.mo62049a(bfos.SMD_STATE_ENTERED, 0);
        }
    }

    /* renamed from: h */
    public final void mo61084h() {
        super.mo61084h();
        this.f112458a = true;
        bgnu bgnu = this.f112459b;
        if (bgnu != null && bgnu.mo63026b()) {
            this.f112459b.mo63027c();
        }
        bgnu bgnu2 = this.f112460c;
        if (bgnu2 != null && bgnu2.mo63026b()) {
            this.f112460c.mo63027c();
        }
        this.f112400h.mo62048a(bfos.SMD_STATE_EXITED);
    }

    /* renamed from: p */
    public final String mo61093p() {
        return "WatchSignificantMotionDetectionState";
    }
}
