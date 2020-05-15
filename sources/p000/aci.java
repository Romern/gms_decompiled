package p000;

import android.content.Context;
import android.graphics.PointF;
import android.support.p002v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: aci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aci {

    /* renamed from: a */
    public int f161a;

    /* renamed from: b */
    public RecyclerView f162b;

    /* renamed from: c */
    public abu f163c;

    /* renamed from: d */
    public boolean f164d;

    /* renamed from: e */
    public boolean f165e;

    /* renamed from: f */
    public View f166f;

    /* renamed from: g */
    public boolean f167g;

    /* renamed from: h */
    protected final LinearInterpolator f168h;

    /* renamed from: i */
    protected final DecelerateInterpolator f169i;

    /* renamed from: j */
    protected PointF f170j;

    /* renamed from: k */
    protected int f171k;

    /* renamed from: l */
    protected int f172l;

    /* renamed from: m */
    private final acg f173m;

    /* renamed from: n */
    private final DisplayMetrics f174n;

    /* renamed from: o */
    private boolean f175o;

    /* renamed from: p */
    private float f176p;

    public aci() {
        this.f161a = -1;
        this.f173m = new acg();
    }

    /* renamed from: a */
    public static int m413a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            return i4 - i2;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 >= 0) {
            return 0;
        }
        return i7;
    }

    /* renamed from: b */
    private static int m414b(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 > 0) {
            return i3;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo304c(int i) {
        float abs = (float) Math.abs(i);
        if (!this.f175o) {
            this.f176p = mo297a(this.f174n);
            this.f175o = true;
        }
        return (int) Math.ceil((double) (abs * this.f176p));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo297a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo303b(int i) {
        double c = (double) mo304c(i);
        Double.isNaN(c);
        return (int) Math.ceil(c / 0.3356d);
    }

    public aci(Context context) {
        this.f161a = -1;
        this.f173m = new acg();
        this.f168h = new LinearInterpolator();
        this.f169i = new DecelerateInterpolator();
        this.f175o = false;
        this.f171k = 0;
        this.f172l = 0;
        this.f174n = context.getResources().getDisplayMetrics();
    }

    /* renamed from: a */
    public final int mo298a(View view) {
        return this.f162b.getChildLayoutPosition(view);
    }

    /* renamed from: a */
    public PointF mo299a(int i) {
        abu abu = this.f163c;
        if (abu instanceof ach) {
            return ((ach) abu).mo69d(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + ach.class.getCanonicalName());
        return null;
    }

    /* renamed from: a */
    public final void mo300a() {
        if (this.f165e) {
            this.f165e = false;
            this.f172l = 0;
            this.f171k = 0;
            this.f170j = null;
            this.f162b.mState.f177a = -1;
            this.f166f = null;
            this.f161a = -1;
            this.f164d = false;
            abu abu = this.f163c;
            if (abu.f123u == this) {
                abu.f123u = null;
            }
            this.f163c = null;
            this.f162b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo301a(int i, int i2) {
        PointF a;
        RecyclerView recyclerView = this.f162b;
        if (this.f161a == -1 || recyclerView == null) {
            mo300a();
        }
        if (!(!this.f164d || this.f166f != null || this.f163c == null || (a = mo299a(this.f161a)) == null || (a.x == 0.0f && a.y == 0.0f))) {
            recyclerView.scrollStep((int) Math.signum(a.x), (int) Math.signum(a.y), null);
        }
        this.f164d = false;
        View view = this.f166f;
        if (view != null) {
            if (mo298a(view) == this.f161a) {
                View view2 = this.f166f;
                acj acj = recyclerView.mState;
                mo302a(view2, this.f173m);
                this.f173m.mo296a(recyclerView);
                mo300a();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f166f = null;
            }
        }
        if (this.f165e) {
            acj acj2 = recyclerView.mState;
            acg acg = this.f173m;
            if (this.f162b.mLayout.mo250u() != 0) {
                this.f171k = m414b(this.f171k, i);
                int b = m414b(this.f172l, i2);
                this.f172l = b;
                if (this.f171k == 0 && b == 0) {
                    PointF a2 = mo299a(this.f161a);
                    if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
                        acg.f154a = this.f161a;
                        mo300a();
                    } else {
                        float sqrt = (float) Math.sqrt((double) ((a2.x * a2.x) + (a2.y * a2.y)));
                        a2.x /= sqrt;
                        a2.y /= sqrt;
                        this.f170j = a2;
                        this.f171k = (int) (a2.x * 10000.0f);
                        this.f172l = (int) (a2.y * 10000.0f);
                        acg.mo295a((int) (((float) this.f171k) * 1.2f), (int) (((float) this.f172l) * 1.2f), (int) (((float) mo304c(10000)) * 1.2f), this.f168h);
                    }
                }
            } else {
                mo300a();
            }
            acg acg2 = this.f173m;
            int i3 = acg2.f154a;
            acg2.mo296a(recyclerView);
            if (i3 >= 0 && this.f165e) {
                this.f164d = true;
                recyclerView.mViewFlinger.mo309a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo302a(View view, acg acg) {
        int i;
        PointF pointF = this.f170j;
        int i2 = 1;
        int i3 = 0;
        int i4 = (pointF == null || pointF.x == 0.0f) ? 0 : this.f170j.x > 0.0f ? 1 : -1;
        abu abu = this.f163c;
        if (abu == null || !abu.mo77j()) {
            i = 0;
        } else {
            abv abv = (abv) view.getLayoutParams();
            i = m413a(abu.m283d(view) - abv.leftMargin, abu.m286g(view) + abv.rightMargin, abu.mo251v(), abu.f115D - abu.mo253x(), i4);
        }
        PointF pointF2 = this.f170j;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i2 = 0;
        } else if (this.f170j.y <= 0.0f) {
            i2 = -1;
        }
        abu abu2 = this.f163c;
        if (abu2 != null && abu2.mo78k()) {
            abv abv2 = (abv) view.getLayoutParams();
            i3 = m413a(abu.m287h(view) - abv2.topMargin, abu.m282c(view) + abv2.bottomMargin, abu2.mo252w(), abu2.f116E - abu2.mo254y(), i2);
        }
        int b = mo303b((int) Math.sqrt((double) ((i * i) + (i3 * i3))));
        if (b > 0) {
            acg.mo295a(-i, -i3, b, this.f169i);
        }
    }
}
