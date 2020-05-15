package p000;

/* renamed from: ymi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ymi extends yja {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final ygd mo30558c() {
        ygd ygd;
        ygd[] ygdArr = new ygd[5];
        ygdArr[0] = ygv.m44056b(ygv.f53771a);
        ygdArr[1] = ygv.m44057b("session_activity_segment");
        ygdArr[2] = ygv.m44057b("__VIRTUAL__");
        ygdArr[3] = ygv.m44057b("detected_sports_session");
        if (!this.f53910k) {
            ygd = ygv.m44057b("from_activity_samples");
        } else {
            ygd = ygv.m44057b("activity_from_steps");
        }
        ygdArr[4] = ygd;
        return ygv.m44058b(ygdArr);
    }

    public ymi() {
        super("MergeActivitySegments", null);
        this.f53909j = "merge_activity_segments";
    }
}
