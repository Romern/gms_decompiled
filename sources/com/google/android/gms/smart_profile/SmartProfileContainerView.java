package com.google.android.gms.smart_profile;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smart_profile.header.view.HeaderView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SmartProfileContainerView extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener, aqvo {

    /* renamed from: a */
    public int f107729a;

    /* renamed from: b */
    public SmartProfileChimeraActivity f107730b;

    /* renamed from: c */
    public HeaderView f107731c;

    /* renamed from: d */
    public View f107732d;

    /* renamed from: e */
    public ScrollView f107733e;

    /* renamed from: f */
    public Scroller f107734f;

    /* renamed from: g */
    public aqqh f107735g;

    /* renamed from: h */
    public boolean f107736h;

    /* renamed from: i */
    public float f107737i;

    /* renamed from: j */
    private int f107738j;

    /* renamed from: k */
    private int f107739k;

    /* renamed from: l */
    private ViewGroup f107740l;

    /* renamed from: m */
    private C1255ou f107741m;

    /* renamed from: n */
    private C1322rg f107742n;

    /* renamed from: o */
    private int f107743o;

    /* renamed from: p */
    private int f107744p;

    /* renamed from: q */
    private float f107745q;

    /* renamed from: r */
    private float f107746r;

    /* renamed from: s */
    private float f107747s;

    /* renamed from: t */
    private int f107748t;

    /* renamed from: u */
    private Point f107749u;

    /* renamed from: v */
    private boolean f107750v;

    /* renamed from: w */
    private aqrj f107751w;

    /* renamed from: x */
    private ColorDrawable f107752x;

    /* renamed from: y */
    private int f107753y;

    public SmartProfileContainerView(Context context) {
        super(context);
        m92515a(context);
    }

    /* renamed from: a */
    private final void m92515a(Context context) {
        this.f107742n = new C1322rg(context);
        this.f107730b = (SmartProfileChimeraActivity) context;
        this.f107729a = 3;
        this.f107747s = 500.0f;
        this.f107750v = false;
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* renamed from: c */
    private final void m92516c(float f) {
        this.f107745q = f;
        this.f107746r = mo58998d();
        this.f107744p = this.f107733e.getScrollY();
        this.f107743o = this.f107731c.getHeight();
        this.f107734f.forceFinished(true);
    }

    /* renamed from: d */
    private final void m92517d(float f) {
        float max = Math.max(Math.min(f, (float) this.f107739k), (float) this.f107738j);
        int i = this.f107738j;
        this.f107731c.mo59020b(1.0f - ((max - ((float) i)) / ((float) (this.f107739k - i))));
    }

    /* renamed from: f */
    private final int m92518f() {
        return this.f107733e.getChildAt(0).getHeight() - this.f107733e.getHeight();
    }

    /* renamed from: g */
    private final Point m92519g() {
        Point point = this.f107749u;
        if (point != null) {
            return point;
        }
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point2 = new Point();
        this.f107749u = point2;
        defaultDisplay.getSize(point2);
        return this.f107749u;
    }

    /* renamed from: h */
    private final void m92520h() {
        this.f107750v = false;
        this.f107746r = mo58998d();
        if (m92521i()) {
            mo58996c();
        } else if (!this.f107734f.isFinished()) {
        } else {
            if (this.f107753y == 0) {
                this.f107731c.mo59015a();
            } else {
                this.f107731c.mo59019b();
            }
        }
    }

    /* renamed from: i */
    private final boolean m92521i() {
        int i = m92519g().y;
        if (this.f107740l == null || this.f107750v || mo58998d() <= ((float) (i / 2))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo58994b() {
        this.f107732d.setVisibility(0);
    }

    public final void computeScroll() {
        super.computeScroll();
        Scroller scroller = this.f107734f;
        if (scroller != null && scroller.computeScrollOffset()) {
            float currY = (float) this.f107734f.getCurrY();
            int i = Build.VERSION.SDK_INT;
            float currVelocity = this.f107734f.getCurrVelocity();
            int i2 = this.f107729a;
            if (i2 != 3) {
                if (i2 == 1) {
                    float f = (float) this.f107738j;
                    if (currY >= f) {
                        float f2 = (float) this.f107739k;
                        if (currY <= f2) {
                            m92517d(currY);
                            int finalY = this.f107734f.getFinalY();
                            if (finalY > this.f107738j && finalY < this.f107739k) {
                                this.f107734f.forceFinished(true);
                                if (((float) finalY) < currY) {
                                    this.f107731c.mo59019b();
                                } else {
                                    this.f107731c.mo59015a();
                                }
                            }
                        } else {
                            m92517d(f2);
                            this.f107729a = 3;
                            this.f107734f.forceFinished(true);
                        }
                    } else {
                        m92517d(f);
                        this.f107729a = 2;
                        mo58992a(0.0f, currVelocity);
                    }
                } else if (i2 == 2) {
                    if (currY < 0.0f) {
                        this.f107733e.scrollTo(0, 0);
                        this.f107729a = 1;
                        mo58992a((float) this.f107738j, currVelocity);
                    } else if (currY > ((float) m92518f())) {
                        this.f107733e.scrollTo(0, m92518f());
                        this.f107742n.f26915a.onAbsorb((int) currVelocity);
                        this.f107734f.forceFinished(true);
                    } else {
                        this.f107733e.scrollTo(0, (int) currY);
                    }
                    this.f107735g.mo48070a();
                }
            } else if (currY < 0.0f) {
                mo58995b(0.0f);
                this.f107729a = 1;
                mo58992a((float) this.f107739k, -currVelocity);
            } else if (currY > ((float) m92519g().y)) {
                this.f107734f.forceFinished(true);
                mo58995b((float) m92519g().y);
                this.f107730b.finish();
                return;
            } else if (currVelocity < this.f107747s && m92521i()) {
                this.f107734f.forceFinished(true);
                mo58995b((float) this.f107734f.getCurrY());
                mo58996c();
                return;
            } else {
                mo58995b((float) this.f107734f.getCurrY());
            }
        }
        C1280ps.m19915e(this);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C1255ou ouVar = this.f107741m;
        if (ouVar != null) {
            ouVar.mo15671a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int a = C1280ps.m19880a(this);
        if (a != 0 && a != 1) {
            this.f107742n.f26915a.finish();
        } else if (!this.f107742n.f26915a.isFinished()) {
            int save = canvas.save();
            canvas.rotate(180.0f);
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.translate((float) (-width), (float) (-height));
            this.f107742n.f26915a.setSize(width, height);
            boolean draw = this.f107742n.f26915a.draw(canvas);
            canvas.restoreToCount(save);
            if (draw) {
                C1280ps.m19915e(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SmartProfileChimeraActivity smartProfileChimeraActivity = this.f107730b;
        if (smartProfileChimeraActivity != null) {
            this.f107748t = ViewConfiguration.get(smartProfileChimeraActivity).getScaledTouchSlop();
            this.f107751w = new aqrj(this);
            this.f107741m = new C1255ou(this.f107730b, this.f107751w);
            this.f107734f = new Scroller(this.f107730b);
            this.f107739k = this.f107731c.f107765g;
            this.f107738j = getResources().getDimensionPixelSize(C0126R.dimen.profile_header_collapsed_height);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f107740l = (ViewGroup) findViewById(C0126R.C0129id.container);
        this.f107733e = (ScrollView) findViewById(C0126R.C0129id.scrollview);
        this.f107732d = findViewById(C0126R.C0129id.content_progress_container);
        HeaderView headerView = (HeaderView) findViewById(C0126R.C0129id.header_view);
        this.f107731c = headerView;
        headerView.f107770l = this;
        int i = Build.VERSION.SDK_INT;
        if (!cgnz.m146325b() || !cgmy.f187331a.mo6606a().mo84134e()) {
            this.f107752x = new ColorDrawable(getResources().getColor(C0126R.color.profile_background_color));
        } else {
            this.f107752x = new ColorDrawable(getResources().getColor(C0126R.color.profile_card_background));
        }
        this.f107752x.setAlpha(0);
        this.f107730b.getWindow().setBackgroundDrawable(this.f107752x);
    }

    public final void onGlobalLayout() {
        if (this.f107731c.mo59024f()) {
            mo58995b((float) m92519g().y);
            this.f107729a = 3;
            this.f107733e.scrollTo(0, 0);
            double intExtra = (double) (100 - this.f107730b.getIntent().getIntExtra("com.google.android.gms.people.smart_profile.SLIDE_IN_PERCENTAGE", 100));
            Double.isNaN(intExtra);
            double d = (double) m92519g().y;
            Double.isNaN(d);
            int i = (int) ((intExtra / 100.0d) * d);
            float f = (float) i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f107740l, "translationY", mo58998d(), f);
            ofFloat.addUpdateListener(new aqri(this));
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.setDuration((long) ((Math.abs(mo58998d() - f) / ((float) m92519g().y)) * 300.0f));
            ofFloat.addListener(new aqrf(this, i));
            ofFloat.start();
        }
        int i2 = Build.VERSION.SDK_INT;
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    return mo58993a(rawY);
                }
                if (action != 3) {
                    return false;
                }
            }
            m92520h();
            return false;
        }
        m92516c(rawY);
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        z2 = false;
                        z = false;
                    }
                } else if (mo58993a(rawY)) {
                    this.f107750v = true;
                    float f = this.f107745q;
                    float f2 = rawY - f;
                    int i = (int) (((float) this.f107744p) - f2);
                    int i2 = (int) (((float) this.f107743o) + f2);
                    int i3 = (int) (this.f107746r + f2);
                    if (f > rawY) {
                        if (mo58998d() <= 0.0f) {
                            if (this.f107731c.mo59023e()) {
                                this.f107733e.scrollTo(0, i);
                                this.f107729a = 2;
                                if (i > m92518f()) {
                                    this.f107742n.f26915a.onPull(((float) (i - m92518f())) / ((float) getHeight()));
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                this.f107735g.mo48070a();
                            } else {
                                int i4 = this.f107738j;
                                if (i2 <= i4) {
                                    m92517d((float) i4);
                                    this.f107733e.scrollTo(0, this.f107738j - i2);
                                    this.f107729a = 2;
                                    m92516c(rawY);
                                    z2 = false;
                                } else {
                                    m92517d((float) i2);
                                    this.f107729a = 1;
                                    z2 = false;
                                }
                            }
                        } else if (i3 <= 0) {
                            mo58995b(0.0f);
                            this.f107729a = 1;
                            m92516c(rawY);
                            z2 = false;
                        } else {
                            mo58995b((float) i3);
                            this.f107729a = 3;
                            z2 = false;
                        }
                        if (Math.abs(f2) > ((float) this.f107748t)) {
                            this.f107753y = 1;
                        }
                    } else {
                        if (this.f107733e.getScrollY() > 0) {
                            if (i <= 0) {
                                this.f107733e.scrollTo(0, 0);
                                this.f107729a = 1;
                                m92516c(rawY);
                            } else {
                                this.f107733e.scrollTo(0, i);
                                this.f107729a = 2;
                            }
                            this.f107735g.mo48070a();
                        } else if (this.f107731c.mo59024f()) {
                            mo58995b((float) i3);
                            this.f107729a = 3;
                        } else {
                            int i5 = this.f107739k;
                            if (i2 >= i5) {
                                m92517d((float) i5);
                                mo58995b((float) (i2 - this.f107739k));
                                this.f107729a = 3;
                                m92516c(rawY);
                            } else {
                                m92517d((float) i2);
                                this.f107729a = 1;
                            }
                        }
                        if (Math.abs(f2) > ((float) this.f107748t)) {
                            this.f107753y = 0;
                        }
                        z2 = false;
                    }
                    z = true;
                } else {
                    z2 = false;
                    z = false;
                }
            }
            C1322rg rgVar = this.f107742n;
            rgVar.f26915a.onRelease();
            z2 = rgVar.f26915a.isFinished();
            m92520h();
            z = false;
        } else {
            this.f107731c.mo59021c();
            m92516c(rawY);
            z2 = false;
            z = false;
        }
        if (z2) {
            C1280ps.m19915e(this);
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public SmartProfileContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m92515a(context);
    }

    /* renamed from: b */
    public final void mo58995b(float f) {
        if (f != this.f107737i) {
            this.f107735g.mo48070a();
        }
        this.f107737i = f;
        mo48195a();
        if (this.f107740l != null && f != mo58998d()) {
            this.f107740l.setTranslationY(f);
            mo59001e();
        }
    }

    /* renamed from: c */
    public final void mo58996c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(mo58998d(), (float) m92519g().y);
        ofFloat.addUpdateListener(new aqrg(this));
        ofFloat.addListener(new aqrh(this));
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    /* renamed from: e */
    public final void mo59001e() {
        int i = Build.VERSION.SDK_INT;
        this.f107752x.setAlpha((int) ((1.0f - (mo58998d() / ((float) m92519g().y))) * 0.6f * 255.0f));
    }

    public SmartProfileContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m92515a(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.f(android.view.View, float):void
     arg types: [com.google.android.gms.smart_profile.header.view.HeaderView, int]
     candidates:
      ps.f(android.view.View, int):void
      ps.f(android.view.View, float):void */
    /* renamed from: a */
    public final void mo48195a() {
        if (cgnz.m146325b()) {
            if (this.f107731c.mo59023e()) {
                int i = Build.VERSION.SDK_INT;
                C1280ps.m19918f(this.f107731c, (float) getResources().getDimensionPixelSize(C0126R.dimen.header_shadow_elevation));
                this.f107731c.setOutlineProvider(ViewOutlineProvider.BOUNDS);
            } else {
                int i2 = Build.VERSION.SDK_INT;
                C1280ps.m19918f((View) this.f107731c, 0.0f);
            }
            HeaderView headerView = this.f107731c;
            int[] iArr = new int[2];
            if (headerView.f107764f) {
                headerView.getLocationOnScreen(iArr);
            } else {
                headerView.findViewById(C0126R.C0129id.toolbar).getLocationOnScreen(iArr);
            }
            if (iArr[1] > headerView.f107766h) {
                this.f107735g.mo48074e();
            } else {
                this.f107735g.mo48073d();
            }
        }
        if (!this.f107736h) {
            if (this.f107737i == 0.0f) {
                this.f107735g.mo48071b();
                this.f107736h = true;
            }
        } else if (this.f107737i != 0.0f) {
            this.f107735g.mo48072c();
            this.f107736h = false;
        }
        this.f107735g.mo48070a();
        this.f107739k = this.f107731c.f107765g;
    }

    /* renamed from: d */
    public final float mo58998d() {
        return this.f107740l.getTranslationY();
    }

    /* renamed from: a */
    public final void mo58992a(float f, float f2) {
        this.f107734f.forceFinished(true);
        this.f107734f.fling(0, (int) f, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo58993a(float f) {
        return this.f107750v || Math.abs(this.f107745q - f) > ((float) this.f107748t);
    }
}
