package p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.common.p079ui.PopoverView;
import com.google.android.wallet.p097ui.common.FocusedViewToTopScrollView;

/* renamed from: awhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awhb extends FocusedViewToTopScrollView {

    /* renamed from: n */
    public static final /* synthetic */ int f94326n = 0;

    /* renamed from: A */
    private int f94327A;

    /* renamed from: B */
    private boolean f94328B;

    /* renamed from: C */
    private int f94329C;

    /* renamed from: D */
    private int f94330D;

    /* renamed from: E */
    private int f94331E;

    /* renamed from: a */
    public final PopoverView f94332a;

    /* renamed from: b */
    public boolean f94333b;

    /* renamed from: c */
    boolean f94334c;

    /* renamed from: d */
    public boolean f94335d;

    /* renamed from: e */
    int f94336e = 3;

    /* renamed from: f */
    boolean f94337f;

    /* renamed from: g */
    public boolean f94338g;

    /* renamed from: h */
    public boolean f94339h;

    /* renamed from: i */
    public boolean f94340i;

    /* renamed from: j */
    public Runnable f94341j;

    /* renamed from: k */
    public boolean f94342k;

    /* renamed from: l */
    public boolean f94343l;

    /* renamed from: m */
    float f94344m;

    /* renamed from: z */
    private final int f94345z;

    public awhb(Context context, PopoverView popoverView) {
        super(context);
        boolean z;
        this.f94332a = popoverView;
        int i = 0;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        setSmoothScrollingEnabled(false);
        PopoverView popoverView2 = this.f94332a;
        if (!popoverView2.f110115u || !popoverView2.f110108n) {
            z = false;
        } else {
            z = true;
        }
        mo71903a(z);
        PopoverView popoverView3 = this.f94332a;
        this.f151969q = popoverView3.f110119y;
        this.f94345z = popoverView3.f110120z ? getResources().getDimensionPixelSize(C0126R.dimen.wallet_popover_rounded_corner_transition_distance) : i;
        this.f94328B = true;
        this.f151972t = new awgx(this);
    }

    /* renamed from: a */
    private static final void m79916a(View view, int i) {
        if (view instanceof awgw) {
            ((awgw) view).mo52143b(-i);
        }
    }

    /* renamed from: j */
    private final void m79918j() {
        PopoverView popoverView = this.f94332a;
        if (!popoverView.f110114t && !this.f94339h) {
            int scrollY = getScrollY();
            int i = this.f94330D;
            if (scrollY <= i && !this.f94328B) {
                this.f94328B = true;
                mo71902a(i, this.f94332a.f110108n, false);
            }
        } else if (this.f94334c && this.f94336e == 2) {
            int g = popoverView.mo59882g();
            if (getScrollY() <= g) {
                mo52155f();
            } else if (getScrollY() <= g + this.f94329C) {
                mo52156g();
            }
        } else if (this.f94336e == 1) {
            this.f94338g = false;
        }
        int l = m79920l();
        if (l > 0) {
            PopoverView popoverView2 = this.f94332a;
            if (l < popoverView2.f110107m + this.f94345z && !this.f94343l && !this.f94342k && !this.f94339h) {
                this.f94342k = true;
                mo71902a(popoverView2.mo59881f(), this.f94332a.f110108n, false);
            }
        }
    }

    /* renamed from: k */
    private final int m79919k() {
        PopoverView popoverView = this.f94332a;
        int i = popoverView.f110107m;
        if (popoverView.mo59879d()) {
            i += (int) this.f94332a.f110101g.getTranslationY();
        }
        return Math.max(0, i);
    }

    /* renamed from: l */
    private final int m79920l() {
        return (this.f94332a.f110095a.getHeight() - getScrollY()) - this.f94332a.f110107m;
    }

    /* renamed from: b */
    public final void mo52150b() {
        if (this.f94332a.mo59880e() && this.f94333b) {
            if (this.f94332a.f110109o == 1) {
                this.f94332a.f110097c.setTranslationY((float) Math.max(getScrollY() + m79919k(), this.f94332a.f110095a.getHeight()));
                return;
            }
            int k = m79919k();
            int height = this.f94332a.f110095a.getHeight();
            int scrollY = (height - getScrollY()) - k;
            if (scrollY > 0) {
                m79916a(this.f94332a.f110102h, 0);
                this.f94332a.f110097c.setTranslationY((float) (height - getScrollY()));
                return;
            }
            m79916a(this.f94332a.f110102h, scrollY);
            this.f94332a.f110097c.setTranslationY((float) Math.max(0, k));
        }
    }

    /* renamed from: c */
    public final void mo52151c() {
        int i;
        if (this.f94332a.f110105k != null) {
            if (getScrollY() < this.f94332a.mo59881f()) {
                i = this.f94332a.f110095a.getHeight() - getScrollY();
            } else {
                i = 0;
            }
            this.f94332a.f110105k.setTranslationY((float) i);
            int height = getHeight() - i;
            if (height != this.f94332a.f110105k.getLayoutParams().height) {
                this.f94332a.f110105k.getLayoutParams().height = height;
                this.f94332a.f110105k.requestLayout();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3 A[RETURN] */
    public final int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        int i;
        int i2;
        int scrollY;
        PopoverView popoverView;
        boolean z = true;
        if (!this.f94332a.f110113s || (!this.f94342k && !this.f94343l)) {
            z = false;
        }
        this.f151970r = z;
        int computeScrollDeltaToGetChildRectOnScreen = super.computeScrollDeltaToGetChildRectOnScreen(rect);
        if (this.f94332a.mo59880e()) {
            PopoverView popoverView2 = this.f94332a;
            if (popoverView2.f110109o == 0) {
                i = popoverView2.f110097c.getHeight();
                if (this.f94332a.mo59879d()) {
                    i += this.f94332a.f110107m;
                }
                i2 = rect.top;
                scrollY = getScrollY();
                popoverView = this.f94332a;
                if (i2 - (scrollY + computeScrollDeltaToGetChildRectOnScreen) < i + popoverView.f110119y) {
                    if (popoverView.mo59880e()) {
                        PopoverView popoverView3 = this.f94332a;
                        if (popoverView3.f110109o == 0) {
                            computeScrollDeltaToGetChildRectOnScreen -= popoverView3.f110097c.getHeight();
                        }
                    }
                    if (this.f94332a.mo59879d() && computeScrollDeltaToGetChildRectOnScreen <= m79919k()) {
                        if (getScrollY() + computeScrollDeltaToGetChildRectOnScreen > this.f94332a.f110095a.getHeight()) {
                            computeScrollDeltaToGetChildRectOnScreen -= m79919k();
                        } else {
                            computeScrollDeltaToGetChildRectOnScreen = (this.f94332a.f110095a.getHeight() - this.f94332a.f110107m) - getScrollY();
                        }
                    }
                }
                if (Math.abs(computeScrollDeltaToGetChildRectOnScreen) >= this.f94332a.f110118x) {
                    return 0;
                }
                return computeScrollDeltaToGetChildRectOnScreen;
            }
        }
        i = 0;
        if (this.f94332a.mo59879d()) {
        }
        i2 = rect.top;
        scrollY = getScrollY();
        popoverView = this.f94332a;
        if (i2 - (scrollY + computeScrollDeltaToGetChildRectOnScreen) < i + popoverView.f110119y) {
        }
        if (Math.abs(computeScrollDeltaToGetChildRectOnScreen) >= this.f94332a.f110118x) {
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awhb.a(boolean, android.view.View[]):void
     arg types: [int, android.view.View[]]
     candidates:
      awhb.a(android.view.View, int):void
      com.google.android.wallet.ui.common.FocusedViewToTopScrollView.a(int, boolean):void
      com.google.android.wallet.ui.common.FocusedViewToTopScrollView.a(android.content.Context, android.util.AttributeSet):void
      awhb.a(boolean, android.view.View[]):void */
    /* renamed from: d */
    public final void mo52153d() {
        this.f94332a.f110097c.setVisibility(0);
        PopoverView popoverView = this.f94332a;
        m79917a(true, popoverView.f110102h, popoverView.f110103i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awhb.a(boolean, android.view.View[]):void
     arg types: [int, android.view.View[]]
     candidates:
      awhb.a(android.view.View, int):void
      com.google.android.wallet.ui.common.FocusedViewToTopScrollView.a(int, boolean):void
      com.google.android.wallet.ui.common.FocusedViewToTopScrollView.a(android.content.Context, android.util.AttributeSet):void
      awhb.a(boolean, android.view.View[]):void */
    /* renamed from: e */
    public final void mo52154e() {
        int i;
        PopoverView popoverView = this.f94332a;
        if (popoverView.f110109o == 0) {
            i = 4;
        } else {
            i = 8;
        }
        popoverView.f110097c.setVisibility(i);
        PopoverView popoverView2 = this.f94332a;
        m79917a(false, popoverView2.f110102h, popoverView2.f110103i);
    }

    /* renamed from: f */
    public final void mo52155f() {
        PopoverView popoverView = this.f94332a;
        awgr awgr = popoverView.f110100f;
        if (awgr != null && !this.f94338g) {
            this.f94339h = false;
            this.f94338g = true;
            if (popoverView.f110110p) {
                awgr.mo52133e(popoverView.f110091E);
            } else {
                awgr.mo52134t();
            }
        }
    }

    /* renamed from: g */
    public final void mo52156g() {
        if (!this.f94339h) {
            this.f94339h = true;
            mo71902a(0, this.f94332a.f110108n, true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onScrollChanged(i, i2, i3, i4);
        boolean z = true;
        if (i2 < i4) {
            i5 = 2;
        } else {
            i5 = i2 <= i4 ? 3 : 1;
        }
        if (i5 != this.f94336e) {
            this.f94336e = i5;
            this.f94327A = i4;
        }
        if (i2 < this.f94332a.mo59881f()) {
            z = false;
        }
        this.f94343l = z;
        if (z) {
            this.f94342k = false;
        }
        if (!this.f94337f || this.f94339h) {
            m79918j();
        }
        mo52148a();
        mo52150b();
        mo52151c();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        PopoverView popoverView = this.f94332a;
        double d = (double) i2;
        double d2 = popoverView.f110117w;
        Double.isNaN(d);
        this.f94329C = (int) (d2 * d);
        double d3 = popoverView.f110116v;
        Double.isNaN(d);
        this.f94330D = (int) (d3 * d);
        this.f94331E = (int) (((float) i2) * 0.04f);
        awgy awgy = new awgy(this, i2);
        int i5 = Build.VERSION.SDK_INT;
        if (!isInLayout()) {
            awgy.run();
        } else {
            post(awgy);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f94337f = false;
                m79918j();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    this.f94337f = false;
                }
            }
            return onTouchEvent;
        }
        this.f94337f = true;
        this.f94328B = false;
        return onTouchEvent;
    }

    /* access modifiers changed from: protected */
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9;
        int i10 = i2;
        int i11 = i4;
        if (!this.f94339h) {
            PopoverView popoverView = this.f94332a;
            if (popoverView.f110112r && this.f94343l) {
                int f = popoverView.mo59881f();
                if (i11 + i10 < f) {
                    i9 = f - i11;
                    return super.overScrollBy(i, i9, i3, i4, i5, i6, i7, i8, z);
                }
            } else if (!popoverView.f110114t && i10 < 0) {
                int i12 = this.f94330D;
                if (i12 - i11 > this.f94331E) {
                    i9 = 0;
                } else if (i11 < i12) {
                    i9 = (int) (((float) i10) * 0.2f);
                }
                return super.overScrollBy(i, i9, i3, i4, i5, i6, i7, i8, z);
            }
        }
        i9 = i10;
        return super.overScrollBy(i, i9, i3, i4, i5, i6, i7, i8, z);
    }

    /* renamed from: a */
    private final void m79917a(boolean z, View... viewArr) {
        for (int i = 0; i < 2; i++) {
            View view = viewArr[i];
            if (view instanceof awgw) {
                PopoverView popoverView = this.f94332a;
                ((awgw) view).mo52142a(popoverView.f110102h, popoverView.f110103i, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo52148a() {
        float f;
        if (this.f94332a.mo59879d()) {
            PopoverView popoverView = this.f94332a;
            if (popoverView.f110090D) {
                View view = popoverView.f110101g;
                int i = popoverView.f110107m;
                int height = popoverView.f110095a.getHeight();
                int l = m79920l();
                if (l <= 0) {
                    this.f94332a.f110104j.setVisibility(0);
                    view.setAlpha(1.0f);
                    this.f94332a.f110104j.setScaleY(1.0f);
                    int translationY = (int) this.f94332a.f110104j.getTranslationY();
                    int i2 = this.f94336e;
                    if (i2 == 1) {
                        int max = Math.max(-i, Math.max(height - i, this.f94327A) - getScrollY());
                        if (max < translationY) {
                            float f2 = (float) max;
                            this.f94332a.f110104j.setTranslationY(f2);
                            view.setTranslationY(f2);
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                        }
                    } else {
                        if (i2 == 2) {
                            int max2 = Math.max(this.f94327A, height);
                            if (!this.f94337f) {
                                max2 = Math.min(max2, height - translationY);
                            }
                            int min = Math.min(0, Math.max(max2 - getScrollY(), 0) - i);
                            if (min > translationY) {
                                float f3 = (float) min;
                                this.f94332a.f110104j.setTranslationY(f3);
                                view.setTranslationY(f3);
                            }
                        }
                        f = 0.0f;
                    }
                } else if (l <= i) {
                    float f4 = (float) l;
                    float f5 = 1.0f - (f4 / ((float) i));
                    this.f94332a.f110104j.setVisibility(0);
                    view.setAlpha(f5);
                    this.f94332a.f110104j.setTranslationY(f4);
                    this.f94332a.f110104j.setScaleY(f5);
                    f = 0.0f;
                } else {
                    this.f94332a.f110104j.setVisibility(4);
                    view.setAlpha(0.0f);
                    this.f94332a.f110104j.setTranslationY((float) i);
                    this.f94332a.f110104j.setScaleY(0.0f);
                    int i3 = this.f94345z;
                    f = l <= i + i3 ? ((float) (l - i)) / ((float) i3) : 1.0f;
                }
                if ((f == 0.0f && this.f94344m != 0.0f) || ((f == 1.0f && this.f94344m != 1.0f) || Math.abs(f - this.f94344m) > 0.05f)) {
                    this.f94344m = f;
                    PopoverView popoverView2 = this.f94332a;
                    if (popoverView2.f110120z) {
                        float f6 = popoverView2.f110099e.f94344m * ((float) popoverView2.f110087A);
                        popoverView2.f110111q = f6;
                        if (f6 > 0.0f) {
                            popoverView2.f110106l.setOutlineProvider(popoverView2.f110088B);
                            popoverView2.f110106l.setClipToOutline(true);
                            popoverView2.f110097c.setOutlineProvider(popoverView2.f110089C);
                            popoverView2.f110097c.setClipToOutline(true);
                            return;
                        }
                        popoverView2.f110106l.setOutlineProvider(null);
                        popoverView2.f110106l.setClipToOutline(false);
                        popoverView2.f110097c.setOutlineProvider(null);
                        popoverView2.f110097c.setClipToOutline(false);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo52149a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (this.f94333b) {
            runnable.run();
        } else {
            this.f94341j = runnable;
        }
    }
}
