package p000;

/* renamed from: betf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class betf extends besn {

    /* renamed from: a */
    private boolean f112376a = false;

    /* renamed from: b */
    private final bgnu f112377b;

    public betf(berb berb) {
        super(berb);
        this.f112377b = !berb.f112199z.mo63024a() ? berb.f112113A.mo63024a() ? berb.f112113A : null : berb.f112199z;
    }

    /* renamed from: b */
    public final void mo61099b(boolean z) {
        super.mo61099b(z);
        if (!this.f112376a) {
            mo61132c(39);
        }
    }

    /* renamed from: g */
    public final void mo61083g() {
        super.mo61083g();
        this.f112376a = false;
        bgnu bgnu = this.f112377b;
        if (bgnu == null || !bgnu.mo63025a(this)) {
            this.f112400h.mo62049a(bfos.SMD_STATE_ENTERED, 1);
            mo61107a(new besk(this.f112396d));
            return;
        }
        this.f112400h.mo62049a(bfos.SMD_STATE_ENTERED, 0);
    }

    /* renamed from: h */
    public final void mo61084h() {
        super.mo61084h();
        this.f112376a = true;
        bgnu bgnu = this.f112377b;
        if (bgnu != null) {
            bgnu.mo63027c();
        }
        this.f112400h.mo62048a(bfos.SMD_STATE_EXITED);
    }

    /* renamed from: p */
    public final String mo61093p() {
        return "SignificantMotionDetectionState";
    }
}
