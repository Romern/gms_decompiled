package p000;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p002v7.widget.RecyclerView;
import android.view.MotionEvent;

/* renamed from: zq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1548zq extends abr implements aby {

    /* renamed from: r */
    private static final int[] f27760r = {16842919};

    /* renamed from: s */
    private static final int[] f27761s = new int[0];

    /* renamed from: A */
    private int f27762A = 0;

    /* renamed from: B */
    private final int[] f27763B = new int[2];

    /* renamed from: C */
    private final int[] f27764C = new int[2];

    /* renamed from: D */
    private final Runnable f27765D = new C1544zm(this);

    /* renamed from: E */
    private final abz f27766E = new C1545zn(this);

    /* renamed from: a */
    public final int f27767a;

    /* renamed from: b */
    final StateListDrawable f27768b;

    /* renamed from: c */
    final Drawable f27769c;

    /* renamed from: d */
    int f27770d;

    /* renamed from: e */
    int f27771e;

    /* renamed from: f */
    float f27772f;

    /* renamed from: g */
    int f27773g;

    /* renamed from: h */
    int f27774h;

    /* renamed from: i */
    float f27775i;

    /* renamed from: j */
    public int f27776j = 0;

    /* renamed from: k */
    public int f27777k = 0;

    /* renamed from: l */
    public RecyclerView f27778l;

    /* renamed from: m */
    public boolean f27779m = false;

    /* renamed from: n */
    public boolean f27780n = false;

    /* renamed from: o */
    public int f27781o = 0;

    /* renamed from: p */
    final ValueAnimator f27782p = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* renamed from: q */
    int f27783q = 0;

    /* renamed from: t */
    private final int f27784t;

    /* renamed from: u */
    private final int f27785u;

    /* renamed from: v */
    private final int f27786v;

    /* renamed from: w */
    private final StateListDrawable f27787w;

    /* renamed from: x */
    private final Drawable f27788x;

    /* renamed from: y */
    private final int f27789y;

    /* renamed from: z */
    private final int f27790z;

    public C1548zq(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f27768b = stateListDrawable;
        this.f27769c = drawable;
        this.f27787w = stateListDrawable2;
        this.f27788x = drawable2;
        this.f27785u = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f27786v = Math.max(i, drawable.getIntrinsicWidth());
        this.f27789y = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f27790z = Math.max(i, drawable2.getIntrinsicWidth());
        this.f27767a = i2;
        this.f27784t = i3;
        this.f27768b.setAlpha(255);
        this.f27769c.setAlpha(255);
        this.f27782p.addListener(new C1546zo(this));
        this.f27782p.addUpdateListener(new C1547zp(this));
        RecyclerView recyclerView2 = this.f27778l;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.f27778l.removeOnItemTouchListener(this);
                this.f27778l.removeOnScrollListener(this.f27766E);
                m20980d();
            }
            this.f27778l = recyclerView;
            if (recyclerView != null) {
                recyclerView.addItemDecoration(this);
                this.f27778l.addOnItemTouchListener(this);
                this.f27778l.addOnScrollListener(this.f27766E);
            }
        }
    }

    /* renamed from: a */
    private static final int m20977a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
            int i7 = i2 + i6;
            if (i7 >= i5 || i7 < 0) {
                return 0;
            }
            return i6;
        }
        return 0;
    }

    /* renamed from: b */
    private final void m20978b(int i) {
        m20980d();
        this.f27778l.postDelayed(this.f27765D, (long) i);
    }

    /* renamed from: c */
    private final boolean m20979c() {
        return C1280ps.m19923h(this.f27778l) == 1;
    }

    /* renamed from: d */
    private final void m20980d() {
        this.f27778l.removeCallbacks(this.f27765D);
    }

    /* renamed from: a */
    public final void mo268a(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo16635b(float f, float f2) {
        if (f2 < ((float) (this.f27777k - this.f27789y))) {
            return false;
        }
        int i = this.f27774h;
        int i2 = this.f27773g / 2;
        return f >= ((float) (i - i2)) && f <= ((float) (i + i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16631a() {
        this.f27778l.invalidate();
    }

    /* renamed from: b */
    public final void mo16634b() {
        int i = this.f27783q;
        if (i != 0) {
            if (i == 3) {
                this.f27782p.cancel();
            } else {
                return;
            }
        }
        this.f27783q = 1;
        ValueAnimator valueAnimator = this.f27782p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f27782p.setDuration(500L);
        this.f27782p.setStartDelay(0);
        this.f27782p.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16632a(int i) {
        if (i == 2 && this.f27781o != 2) {
            this.f27768b.setState(f27760r);
            m20980d();
        }
        if (i != 0) {
            mo16634b();
        } else {
            mo16631a();
        }
        if (this.f27781o == 2 && i != 2) {
            this.f27768b.setState(f27761s);
            m20978b(1200);
        } else if (i == 1) {
            m20978b(1500);
        }
        this.f27781o = i;
    }

    /* renamed from: b */
    public final void mo212b(Canvas canvas, RecyclerView recyclerView) {
        if (this.f27776j != this.f27778l.getWidth() || this.f27777k != this.f27778l.getHeight()) {
            this.f27776j = this.f27778l.getWidth();
            this.f27777k = this.f27778l.getHeight();
            mo16632a(0);
        } else if (this.f27783q != 0) {
            if (this.f27779m) {
                int i = this.f27776j;
                int i2 = this.f27785u;
                int i3 = i - i2;
                int i4 = this.f27771e;
                int i5 = this.f27770d;
                int i6 = i4 - (i5 / 2);
                this.f27768b.setBounds(0, 0, i2, i5);
                this.f27769c.setBounds(0, 0, this.f27786v, this.f27777k);
                if (m20979c()) {
                    this.f27769c.draw(canvas);
                    canvas.translate((float) this.f27785u, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f27768b.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-this.f27785u), (float) (-i6));
                } else {
                    canvas.translate((float) i3, 0.0f);
                    this.f27769c.draw(canvas);
                    canvas.translate(0.0f, (float) i6);
                    this.f27768b.draw(canvas);
                    canvas.translate((float) (-i3), (float) (-i6));
                }
            }
            if (this.f27780n) {
                int i7 = this.f27777k;
                int i8 = this.f27789y;
                int i9 = i7 - i8;
                int i10 = this.f27774h;
                int i11 = this.f27773g;
                int i12 = i10 - (i11 / 2);
                this.f27787w.setBounds(0, 0, i11, i8);
                this.f27788x.setBounds(0, 0, this.f27776j, this.f27790z);
                canvas.translate(0.0f, (float) i9);
                this.f27788x.draw(canvas);
                canvas.translate((float) i12, 0.0f);
                this.f27787w.draw(canvas);
                canvas.translate((float) (-i12), (float) (-i9));
            }
        }
    }

    /* renamed from: a */
    public final void mo267a(MotionEvent motionEvent) {
        if (this.f27781o == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean a = mo16633a(motionEvent.getX(), motionEvent.getY());
            boolean b = mo16635b(motionEvent.getX(), motionEvent.getY());
            if (a) {
                if (!b) {
                    this.f27762A = 2;
                    this.f27772f = (float) ((int) motionEvent.getY());
                    mo16632a(2);
                }
            } else if (!b) {
                return;
            }
            this.f27762A = 1;
            this.f27775i = (float) ((int) motionEvent.getX());
            mo16632a(2);
        } else if (motionEvent.getAction() == 1 && this.f27781o == 2) {
            this.f27772f = 0.0f;
            this.f27775i = 0.0f;
            mo16632a(1);
            this.f27762A = 0;
        } else if (motionEvent.getAction() == 2 && this.f27781o == 2) {
            mo16634b();
            if (this.f27762A == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f27764C;
                int i = this.f27784t;
                iArr[0] = i;
                int i2 = this.f27776j - i;
                iArr[1] = i2;
                float max = Math.max((float) iArr[0], Math.min((float) i2, x));
                if (Math.abs(((float) this.f27774h) - max) >= 2.0f) {
                    int a2 = m20977a(this.f27775i, max, iArr, this.f27778l.computeHorizontalScrollRange(), this.f27778l.computeHorizontalScrollOffset(), this.f27776j);
                    if (a2 != 0) {
                        this.f27778l.scrollBy(a2, 0);
                    }
                    this.f27775i = max;
                }
            }
            if (this.f27762A == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f27763B;
                int i3 = this.f27784t;
                iArr2[0] = i3;
                int i4 = this.f27777k - i3;
                iArr2[1] = i4;
                float max2 = Math.max((float) iArr2[0], Math.min((float) i4, y));
                if (Math.abs(((float) this.f27771e) - max2) >= 2.0f) {
                    int a3 = m20977a(this.f27772f, max2, iArr2, this.f27778l.computeVerticalScrollRange(), this.f27778l.computeVerticalScrollOffset(), this.f27777k);
                    if (a3 != 0) {
                        this.f27778l.scrollBy(0, a3);
                    }
                    this.f27772f = max2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo16633a(float f, float f2) {
        if (!m20979c()) {
            if (f < ((float) (this.f27776j - this.f27785u))) {
                return false;
            }
        } else if (f > ((float) this.f27785u)) {
            return false;
        }
        int i = this.f27771e;
        int i2 = this.f27770d / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2));
    }

    /* renamed from: a */
    public final boolean mo269a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f27781o;
        if (i != 1) {
            return i == 2;
        }
        boolean a = mo16633a(motionEvent.getX(), motionEvent.getY());
        boolean b = mo16635b(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (a) {
            if (!b) {
                this.f27762A = 2;
                this.f27772f = (float) ((int) motionEvent.getY());
                mo16632a(2);
                return true;
            }
        } else if (!b) {
            return false;
        }
        this.f27762A = 1;
        this.f27775i = (float) ((int) motionEvent.getX());
        mo16632a(2);
        return true;
    }
}
