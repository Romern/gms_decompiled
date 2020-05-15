package p000;

import android.support.p002v7.widget.RecyclerView;
import android.util.Log;
import android.view.animation.Interpolator;

/* renamed from: acg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acg {

    /* renamed from: a */
    public int f154a = -1;

    /* renamed from: b */
    private int f155b = 0;

    /* renamed from: c */
    private int f156c = 0;

    /* renamed from: d */
    private int f157d = Integer.MIN_VALUE;

    /* renamed from: e */
    private Interpolator f158e = null;

    /* renamed from: f */
    private boolean f159f = false;

    /* renamed from: g */
    private int f160g = 0;

    /* renamed from: a */
    public final void mo295a(int i, int i2, int i3, Interpolator interpolator) {
        this.f155b = i;
        this.f156c = i2;
        this.f157d = i3;
        this.f158e = interpolator;
        this.f159f = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo296a(RecyclerView recyclerView) {
        int i = this.f154a;
        if (i >= 0) {
            this.f154a = -1;
            recyclerView.jumpToPositionForSmoothScroller(i);
            this.f159f = false;
        } else if (this.f159f) {
            Interpolator interpolator = this.f158e;
            if (interpolator != null && this.f157d <= 0) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.f157d;
            if (i2 > 0) {
                recyclerView.mViewFlinger.mo310a(this.f155b, this.f156c, i2, interpolator);
                int i3 = this.f160g + 1;
                this.f160g = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f159f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f160g = 0;
        }
    }
}
