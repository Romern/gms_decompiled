package p000;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: rw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1338rw {

    /* renamed from: w */
    private static final Interpolator f26932w = new C1335rt();

    /* renamed from: a */
    public int f26933a;

    /* renamed from: b */
    public int f26934b;

    /* renamed from: c */
    public float[] f26935c;

    /* renamed from: d */
    public float[] f26936d;

    /* renamed from: e */
    public float[] f26937e;

    /* renamed from: f */
    public float[] f26938f;

    /* renamed from: g */
    public float f26939g;

    /* renamed from: h */
    public int f26940h;

    /* renamed from: i */
    public final int f26941i;

    /* renamed from: j */
    public int f26942j;

    /* renamed from: k */
    public View f26943k;

    /* renamed from: l */
    private int f26944l = -1;

    /* renamed from: m */
    private int[] f26945m;

    /* renamed from: n */
    private int[] f26946n;

    /* renamed from: o */
    private int[] f26947o;

    /* renamed from: p */
    private int f26948p;

    /* renamed from: q */
    private VelocityTracker f26949q;

    /* renamed from: r */
    private float f26950r;

    /* renamed from: s */
    private OverScroller f26951s;

    /* renamed from: t */
    private final C1337rv f26952t;

    /* renamed from: u */
    private boolean f26953u;

    /* renamed from: v */
    private final ViewGroup f26954v;

    /* renamed from: x */
    private final Runnable f26955x = new C1336ru(this);

    private C1338rw(Context context, ViewGroup viewGroup, C1337rv rvVar) {
        if (rvVar != null) {
            this.f26954v = viewGroup;
            this.f26952t = rvVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f26941i = i;
            this.f26940h = i;
            this.f26934b = viewConfiguration.getScaledTouchSlop();
            this.f26950r = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f26939g = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f26951s = new OverScroller(context, f26932w);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    /* renamed from: a */
    private static final float m20122a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            return f <= 0.0f ? -f3 : f3;
        }
        return f;
    }

    /* renamed from: b */
    private static final int m20130b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            return i <= 0 ? -i3 : i3;
        }
        return i;
    }

    /* renamed from: c */
    private final void m20133c() {
        this.f26949q.computeCurrentVelocity(1000, this.f26950r);
        m20125a(m20122a(this.f26949q.getXVelocity(this.f26944l), this.f26939g, this.f26950r), m20122a(this.f26949q.getYVelocity(this.f26944l), this.f26939g, this.f26950r));
    }

    /* renamed from: d */
    private final boolean m20136d(int i) {
        if (mo15827a(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: a */
    public final boolean mo15827a(int i) {
        return ((1 << i) & this.f26948p) != 0;
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
    private final int m20123a(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f26954v.getWidth();
        float f = (float) (width / 2);
        float sin = f + (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 8.0f) * 0.47123894f))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: b */
    public static C1338rw m20131b(ViewGroup viewGroup, C1337rv rvVar) {
        C1338rw a = m20124a(viewGroup, rvVar);
        a.f26934b = (int) ((float) a.f26934b);
        return a;
    }

    /* renamed from: b */
    private final void m20132b(float f, float f2, int i) {
        boolean a = m20127a(f, f2, i, 1);
        if (m20127a(f2, f, i, 4)) {
            a |= true;
        }
        if (m20127a(f, f2, i, 2)) {
            a |= true;
        }
        if (m20127a(f2, f, i, 8)) {
            a |= true;
        }
        if (a) {
            int[] iArr = this.f26946n;
            iArr[i] = iArr[i] | a;
            this.f26952t.mo820a(a ? 1 : 0, i);
        }
    }

    /* renamed from: c */
    private final void m20134c(int i) {
        if (this.f26935c != null && mo15827a(i)) {
            this.f26935c[i] = 0.0f;
            this.f26936d[i] = 0.0f;
            this.f26937e[i] = 0.0f;
            this.f26938f[i] = 0.0f;
            this.f26945m[i] = 0;
            this.f26946n[i] = 0;
            this.f26947o[i] = 0;
            this.f26948p = ((1 << i) ^ -1) & this.f26948p;
        }
    }

    /* renamed from: b */
    public final View mo15831b(int i, int i2) {
        for (int childCount = this.f26954v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f26954v.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C1338rw m20124a(ViewGroup viewGroup, C1337rv rvVar) {
        return new C1338rw(viewGroup.getContext(), viewGroup, rvVar);
    }

    /* renamed from: c */
    private final void m20135c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m20136d(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f26937e[pointerId] = x;
                this.f26938f[pointerId] = y;
            }
        }
    }

    /* renamed from: a */
    private final void m20125a(float f, float f2) {
        this.f26953u = true;
        this.f26952t.mo821a(this.f26943k, f, f2);
        this.f26953u = false;
        if (this.f26933a == 1) {
            mo15832b(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15832b(int i) {
        this.f26954v.removeCallbacks(this.f26955x);
        if (this.f26933a != i) {
            this.f26933a = i;
            this.f26952t.mo819a(i);
            if (this.f26933a == 0) {
                this.f26943k = null;
            }
        }
    }

    /* renamed from: a */
    private final void m20126a(float f, float f2, int i) {
        float[] fArr = this.f26935c;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f26936d;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f26937e;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f26938f;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f26945m;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f26946n;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f26947o;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f26935c = fArr2;
            this.f26936d = fArr3;
            this.f26937e = fArr4;
            this.f26938f = fArr5;
            this.f26945m = iArr;
            this.f26946n = iArr2;
            this.f26947o = iArr3;
        }
        float[] fArr9 = this.f26935c;
        this.f26937e[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f26936d;
        this.f26938f[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f26945m;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f26954v.getLeft() + this.f26940h) {
            i2 = 1;
        }
        if (i5 < this.f26954v.getTop() + this.f26940h) {
            i2 |= 4;
        }
        if (i4 > this.f26954v.getRight() - this.f26940h) {
            i2 |= 2;
        }
        if (i5 > this.f26954v.getBottom() - this.f26940h) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.f26948p |= 1 << i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rw.a(float, float):void
     arg types: [int, int]
     candidates:
      rw.a(android.view.ViewGroup, rv):rw
      rw.a(android.view.View, int):void
      rw.a(int, int):boolean
      rw.a(float, float):void */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r9.f26944l == -1) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        m20133c();
     */
    /* renamed from: b */
    public final void mo15833b(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo15825a();
        }
        if (this.f26949q == null) {
            this.f26949q = VelocityTracker.obtain();
        }
        this.f26949q.addMovement(motionEvent);
        int i = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View b = mo15831b((int) x, (int) y);
            m20126a(x, y, pointerId);
            mo15835b(b, pointerId);
            if ((this.f26945m[pointerId] & this.f26942j) != 0) {
                this.f26952t.mo827c();
            }
        } else if (actionMasked == 1) {
            if (this.f26933a == 1) {
                m20133c();
            }
            mo15825a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f26933a == 1) {
                    m20125a(0.0f, 0.0f);
                }
                mo15825a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m20126a(x2, y2, pointerId2);
                if (this.f26933a == 0) {
                    mo15835b(mo15831b((int) x2, (int) y2), pointerId2);
                    if ((this.f26945m[pointerId2] & this.f26942j) != 0) {
                        this.f26952t.mo827c();
                        return;
                    }
                    return;
                }
                int i2 = (int) x2;
                int i3 = (int) y2;
                View view = this.f26943k;
                if (view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom()) {
                    mo15835b(this.f26943k, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f26933a == 1 && pointerId3 == this.f26944l) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i >= pointerCount) {
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i);
                        if (pointerId4 != this.f26944l) {
                            View b2 = mo15831b((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                            View view2 = this.f26943k;
                            if (b2 == view2 && mo15835b(view2, pointerId4)) {
                            }
                        }
                        i++;
                    }
                }
                m20134c(pointerId3);
            }
        } else if (this.f26933a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i);
                if (m20136d(pointerId5)) {
                    float x3 = motionEvent.getX(i);
                    float y3 = motionEvent.getY(i);
                    float f = x3 - this.f26935c[pointerId5];
                    float f2 = y3 - this.f26936d[pointerId5];
                    m20132b(f, f2, pointerId5);
                    if (this.f26933a == 1) {
                        break;
                    }
                    View b3 = mo15831b((int) x3, (int) y3);
                    if (m20129a(b3, f, f2) && mo15835b(b3, pointerId5)) {
                        break;
                    }
                }
                i++;
            }
            m20135c(motionEvent);
        } else if (m20136d(this.f26944l)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f26944l);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f26937e;
            int i4 = this.f26944l;
            int i5 = (int) (x4 - fArr[i4]);
            int i6 = (int) (y4 - this.f26938f[i4]);
            int left = this.f26943k.getLeft() + i5;
            int top = this.f26943k.getTop() + i6;
            int left2 = this.f26943k.getLeft();
            int top2 = this.f26943k.getTop();
            if (i5 != 0) {
                left = this.f26952t.mo826c(this.f26943k, left);
                C1280ps.m19924h(this.f26943k, left - left2);
            }
            if (i6 != 0) {
                top = this.f26952t.mo828d(this.f26943k, top);
                C1280ps.m19922g(this.f26943k, top - top2);
            }
            if (!(i5 == 0 && i6 == 0)) {
                this.f26952t.mo823a(this.f26943k, left, top);
            }
            m20135c(motionEvent);
        }
    }

    /* renamed from: a */
    private final boolean m20127a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (!((this.f26945m[i] & i2) != i2 || (this.f26942j & i2) == 0 || (this.f26947o[i] & i2) == i2 || (this.f26946n[i] & i2) == i2)) {
            float f3 = (float) this.f26934b;
            if (abs > f3 || abs2 > f3) {
                if (abs < abs2 * 0.5f && this.f26952t.mo824b()) {
                    int[] iArr = this.f26947o;
                    iArr[i] = iArr[i] | i2;
                    return false;
                } else if ((this.f26946n[i] & i2) != 0 || abs <= ((float) this.f26934b)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m20128a(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        int left = this.f26943k.getLeft();
        int top = this.f26943k.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f26951s.abortAnimation();
            mo15832b(0);
            return false;
        }
        View view = this.f26943k;
        int b = m20130b(i3, (int) this.f26939g, (int) this.f26950r);
        int b2 = m20130b(i4, (int) this.f26939g, (int) this.f26950r);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (b == 0) {
            f = ((float) abs) / ((float) i8);
        } else {
            f = ((float) abs3) / ((float) i7);
        }
        if (b2 == 0) {
            f2 = ((float) abs2) / ((float) i8);
        } else {
            f2 = ((float) abs4) / ((float) i7);
        }
        this.f26951s.startScroll(left, top, i5, i6, (int) ((((float) m20123a(i5, b, this.f26952t.mo818a(view))) * f) + (((float) m20123a(i6, b2, this.f26952t.mo15824a())) * f2)));
        mo15832b(2);
        return true;
    }

    /* renamed from: a */
    private final boolean m20129a(View view, float f, float f2) {
        if (view != null) {
            int a = this.f26952t.mo818a(view);
            int a2 = this.f26952t.mo15824a();
            if (a <= 0 || a2 <= 0) {
                return a > 0 ? Math.abs(f) > ((float) this.f26934b) : a2 > 0 && Math.abs(f2) > ((float) this.f26934b);
            }
            int i = this.f26934b;
            return (f * f) + (f2 * f2) > ((float) (i * i));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(float[], float):void}
     arg types: [float[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void} */
    /* renamed from: a */
    public final void mo15825a() {
        this.f26944l = -1;
        float[] fArr = this.f26935c;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f26936d, 0.0f);
            Arrays.fill(this.f26937e, 0.0f);
            Arrays.fill(this.f26938f, 0.0f);
            Arrays.fill(this.f26945m, 0);
            Arrays.fill(this.f26946n, 0);
            Arrays.fill(this.f26947o, 0);
            this.f26948p = 0;
        }
        VelocityTracker velocityTracker = this.f26949q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f26949q = null;
        }
    }

    /* renamed from: a */
    public final void mo15826a(View view, int i) {
        if (view.getParent() == this.f26954v) {
            this.f26943k = view;
            this.f26944l = i;
            this.f26952t.mo822a(view, i);
            mo15832b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f26954v + ")");
    }

    /* renamed from: a */
    public final boolean mo15828a(int i, int i2) {
        if (this.f26953u) {
            return m20128a(i, i2, (int) this.f26949q.getXVelocity(this.f26944l), (int) this.f26949q.getYVelocity(this.f26944l));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00db, code lost:
        if (r12 != r11) goto L_0x00e4;
     */
    /* renamed from: a */
    public final boolean mo15829a(MotionEvent motionEvent) {
        boolean z;
        View b;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo15825a();
        }
        if (this.f26949q == null) {
            this.f26949q = VelocityTracker.obtain();
        }
        this.f26949q.addMovement(motionEvent2);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent2.getPointerId(actionIndex);
                            float x = motionEvent2.getX(actionIndex);
                            float y = motionEvent2.getY(actionIndex);
                            m20126a(x, y, pointerId);
                            int i = this.f26933a;
                            if (i == 0) {
                                if ((this.f26945m[pointerId] & this.f26942j) != 0) {
                                    this.f26952t.mo827c();
                                }
                            } else if (i == 2 && (b = mo15831b((int) x, (int) y)) == this.f26943k) {
                                mo15835b(b, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            m20134c(motionEvent2.getPointerId(actionIndex));
                        }
                    }
                } else if (!(this.f26935c == null || this.f26936d == null)) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId2 = motionEvent2.getPointerId(i2);
                        if (m20136d(pointerId2)) {
                            float x2 = motionEvent2.getX(i2);
                            float y2 = motionEvent2.getY(i2);
                            float f = x2 - this.f26935c[pointerId2];
                            float f2 = y2 - this.f26936d[pointerId2];
                            View b2 = mo15831b((int) x2, (int) y2);
                            if (b2 == null || !m20129a(b2, f, f2)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                int left = b2.getLeft();
                                int c = this.f26952t.mo826c(b2, ((int) f) + left);
                                int top = b2.getTop();
                                int d = this.f26952t.mo828d(b2, ((int) f2) + top);
                                int a = this.f26952t.mo818a(b2);
                                int a2 = this.f26952t.mo15824a();
                                if (a != 0) {
                                    if (a > 0) {
                                    }
                                }
                                if (a2 != 0) {
                                    if (a2 > 0 && d == top) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            m20132b(f, f2, pointerId2);
                            if (this.f26933a != 1) {
                                if (z && mo15835b(b2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    m20135c(motionEvent);
                }
            }
            mo15825a();
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId3 = motionEvent2.getPointerId(0);
            m20126a(x3, y3, pointerId3);
            View b3 = mo15831b((int) x3, (int) y3);
            if (b3 == this.f26943k && this.f26933a == 2) {
                mo15835b(b3, pointerId3);
            }
            if ((this.f26945m[pointerId3] & this.f26942j) != 0) {
                this.f26952t.mo827c();
            }
        }
        return this.f26933a == 1;
    }

    /* renamed from: b */
    public final boolean mo15834b() {
        if (this.f26933a == 2) {
            boolean computeScrollOffset = this.f26951s.computeScrollOffset();
            int currX = this.f26951s.getCurrX();
            int currY = this.f26951s.getCurrY();
            int left = currX - this.f26943k.getLeft();
            int top = currY - this.f26943k.getTop();
            if (left != 0) {
                C1280ps.m19924h(this.f26943k, left);
            }
            if (top != 0) {
                C1280ps.m19922g(this.f26943k, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f26952t.mo823a(this.f26943k, currX, currY);
            }
            if (computeScrollOffset) {
                if (currX == this.f26951s.getFinalX() && currY == this.f26951s.getFinalY()) {
                    this.f26951s.abortAnimation();
                }
            }
            this.f26954v.post(this.f26955x);
        }
        return this.f26933a == 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo15835b(View view, int i) {
        if (view == this.f26943k && this.f26944l == i) {
            return true;
        }
        if (view == null || !this.f26952t.mo825b(view, i)) {
            return false;
        }
        this.f26944l = i;
        mo15826a(view, i);
        return true;
    }

    /* renamed from: a */
    public final boolean mo15830a(View view, int i, int i2) {
        this.f26943k = view;
        this.f26944l = -1;
        boolean a = m20128a(i, i2, 0, 0);
        if (a || this.f26933a != 0 || this.f26943k == null) {
            return a;
        }
        this.f26943k = null;
        return false;
    }
}
