package p000;

import android.os.Build;
import android.support.p002v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* renamed from: acl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0004acl implements Runnable {

    /* renamed from: a */
    public int f193a;

    /* renamed from: b */
    public int f194b;

    /* renamed from: c */
    public OverScroller f195c;

    /* renamed from: d */
    public Interpolator f196d = RecyclerView.sQuinticInterpolator;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView f197e;

    /* renamed from: f */
    private boolean f198f = false;

    /* renamed from: g */
    private boolean f199g = false;

    public C0004acl(RecyclerView recyclerView) {
        this.f197e = recyclerView;
        this.f195c = new OverScroller(recyclerView.getContext(), RecyclerView.sQuinticInterpolator);
    }

    /* renamed from: c */
    private final void m426c() {
        this.f197e.removeCallbacks(this);
        C1280ps.m19891a(this.f197e, this);
    }

    /* renamed from: a */
    public final void mo309a() {
        if (this.f198f) {
            this.f199g = true;
        } else {
            m426c();
        }
    }

    /* renamed from: b */
    public final void mo311b() {
        this.f197e.removeCallbacks(this);
        this.f195c.abortAnimation();
    }

    public final void run() {
        int i;
        int i2;
        boolean z;
        int i3;
        RecyclerView recyclerView = this.f197e;
        if (recyclerView.mLayout != null) {
            this.f199g = false;
            this.f198f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f195c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f193a;
                int i5 = currY - this.f194b;
                this.f193a = currX;
                this.f194b = currY;
                RecyclerView recyclerView2 = this.f197e;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = this.f197e.mReusableIntPair;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (this.f197e.getOverScrollMode() != 2) {
                    this.f197e.considerReleasingGlowsOnScroll(i4, i5);
                }
                RecyclerView recyclerView3 = this.f197e;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i4, i5, iArr3);
                    RecyclerView recyclerView4 = this.f197e;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i4 -= i;
                    i5 -= i2;
                    aci aci = recyclerView4.mLayout.f123u;
                    if (aci != null && !aci.f164d && aci.f165e) {
                        int a = recyclerView4.mState.mo305a();
                        if (a == 0) {
                            aci.mo300a();
                        } else if (aci.f161a >= a) {
                            aci.f161a = a - 1;
                            aci.mo301a(i, i2);
                        } else {
                            aci.mo301a(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!this.f197e.mItemDecorations.isEmpty()) {
                    this.f197e.invalidate();
                }
                RecyclerView recyclerView5 = this.f197e;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i, i2, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = this.f197e;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.dispatchOnScrolled(i, i2);
                }
                if (!this.f197e.awakenScrollBars()) {
                    this.f197e.invalidate();
                }
                int currX2 = overScroller.getCurrX();
                int finalX = overScroller.getFinalX();
                int currY2 = overScroller.getCurrY();
                int finalY = overScroller.getFinalY();
                if (overScroller.isFinished()) {
                    z = true;
                } else {
                    z = (currX2 == finalX || i6 != 0) && (currY2 == finalY || i7 != 0);
                }
                RecyclerView recyclerView7 = this.f197e;
                aci aci2 = recyclerView7.mLayout.f123u;
                if ((aci2 == null || !aci2.f164d) && z) {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else {
                            i3 = i6 > 0 ? currVelocity : 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        this.f197e.absorbGlows(i3, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        this.f197e.mPrefetchRegistry.mo16643a();
                    }
                } else {
                    mo309a();
                    RecyclerView recyclerView8 = this.f197e;
                    C1555zx zxVar = recyclerView8.mGapWorker;
                    if (zxVar != null) {
                        zxVar.mo16647a(recyclerView8, i, i2);
                    }
                }
            }
            aci aci3 = this.f197e.mLayout.f123u;
            if (aci3 != null && aci3.f164d) {
                aci3.mo301a(0, 0);
            }
            this.f198f = false;
            if (!this.f199g) {
                this.f197e.setScrollState(0);
                this.f197e.stopNestedScroll(1);
                return;
            }
            m426c();
            return;
        }
        mo311b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: a */
    public final void mo310a(int i, int i2, int i3, Interpolator interpolator) {
        int i4;
        int i5;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            int sqrt = (int) Math.sqrt(0.0d);
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            int height = abs <= abs2 ? this.f197e.getHeight() : this.f197e.getWidth();
            float f = (float) (height / 2);
            float f2 = (float) height;
            float sin = f + (((float) Math.sin((double) ((Math.min(1.0f, ((float) sqrt2) / f2) - 8.0f) * 0.47123894f))) * f);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (abs <= abs2) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
            }
            i4 = Math.min(i5, 2000);
        } else {
            i4 = i3;
        }
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f196d != interpolator) {
            this.f196d = interpolator;
            this.f195c = new OverScroller(this.f197e.getContext(), interpolator);
        }
        this.f194b = 0;
        this.f193a = 0;
        this.f197e.setScrollState(2);
        this.f195c.startScroll(0, 0, i, i2, i4);
        int i6 = Build.VERSION.SDK_INT;
        mo309a();
    }
}
