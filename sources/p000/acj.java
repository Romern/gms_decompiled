package p000;

/* renamed from: acj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acj {

    /* renamed from: a */
    int f177a = -1;

    /* renamed from: b */
    public int f178b = 0;

    /* renamed from: c */
    public int f179c = 0;

    /* renamed from: d */
    public int f180d = 1;

    /* renamed from: e */
    public int f181e = 0;

    /* renamed from: f */
    public boolean f182f = false;

    /* renamed from: g */
    public boolean f183g = false;

    /* renamed from: h */
    public boolean f184h = false;

    /* renamed from: i */
    public boolean f185i = false;

    /* renamed from: j */
    public boolean f186j = false;

    /* renamed from: k */
    public boolean f187k = false;

    /* renamed from: l */
    public int f188l;

    /* renamed from: m */
    public long f189m;

    /* renamed from: n */
    public int f190n;

    /* renamed from: o */
    public int f191o;

    /* renamed from: p */
    public int f192p;

    /* renamed from: a */
    public final int mo305a() {
        return this.f183g ? this.f178b - this.f179c : this.f181e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f177a + ", mData=" + ((Object) null) + ", mItemCount=" + this.f181e + ", mIsMeasuring=" + this.f185i + ", mPreviousLayoutItemCount=" + this.f178b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f179c + ", mStructureChanged=" + this.f182f + ", mInPreLayout=" + this.f183g + ", mRunSimpleAnimations=" + this.f186j + ", mRunPredictiveAnimations=" + this.f187k + '}';
    }

    /* renamed from: a */
    public final void mo306a(int i) {
        if ((this.f180d & i) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f180d));
        }
    }
}
