package p000;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

/* renamed from: rd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1319rd implements View.OnTouchListener {

    /* renamed from: q */
    private static final int f26897q = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    final C1317rb f26898a = new C1317rb();

    /* renamed from: b */
    final View f26899b;

    /* renamed from: c */
    boolean f26900c;

    /* renamed from: d */
    boolean f26901d;

    /* renamed from: e */
    boolean f26902e;

    /* renamed from: f */
    public final ListView f26903f;

    /* renamed from: g */
    private final Interpolator f26904g = new AccelerateInterpolator();

    /* renamed from: h */
    private Runnable f26905h;

    /* renamed from: i */
    private final float[] f26906i = {0.0f, 0.0f};

    /* renamed from: j */
    private final float[] f26907j = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: k */
    private final int f26908k;

    /* renamed from: l */
    private final float[] f26909l = {0.0f, 0.0f};

    /* renamed from: m */
    private final float[] f26910m = {0.0f, 0.0f};

    /* renamed from: n */
    private final float[] f26911n = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: o */
    private boolean f26912o;

    /* renamed from: p */
    private boolean f26913p;

    /* renamed from: a */
    private final float m20058a(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.f26902e) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: a */
    static float m20059a(float f, float f2, float f3) {
        return f <= f3 ? f >= f2 ? f : f2 : f3;
    }

    /* renamed from: b */
    private final void m20061b() {
        int i = 0;
        if (!this.f26900c) {
            C1317rb rbVar = this.f26898a;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i2 = (int) (currentAnimationTimeMillis - rbVar.f26889e);
            int i3 = rbVar.f26886b;
            if (i2 > i3) {
                i = i3;
            } else if (i2 >= 0) {
                i = i2;
            }
            rbVar.f26895k = i;
            rbVar.f26894j = rbVar.mo15800a(currentAnimationTimeMillis);
            rbVar.f26893i = currentAnimationTimeMillis;
            return;
        }
        this.f26902e = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L_0x007c;
     */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (!this.f26913p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            m20061b();
            return false;
        }
        this.f26901d = true;
        this.f26912o = false;
        float a = m20060a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f26899b.getWidth());
        float a2 = m20060a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f26899b.getHeight());
        C1317rb rbVar = this.f26898a;
        rbVar.f26887c = a;
        rbVar.f26888d = a2;
        if (!this.f26902e && mo15803a()) {
            if (this.f26905h == null) {
                this.f26905h = new C1318rc(this);
            }
            this.f26902e = true;
            this.f26900c = true;
            if (this.f26912o || (i = this.f26908k) <= 0) {
                this.f26905h.run();
            } else {
                C1280ps.m19892a(this.f26899b, this.f26905h, (long) i);
            }
            this.f26912o = true;
        }
        return false;
    }

    public C1319rd(ListView listView) {
        this.f26899b = listView;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f = displayMetrics.density;
        float f2 = displayMetrics.density;
        float[] fArr = this.f26911n;
        float f3 = ((float) ((int) ((f * 1575.0f) + 0.5f))) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.f26910m;
        float f4 = ((float) ((int) ((f2 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        float[] fArr3 = this.f26907j;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f26906i;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f26909l;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f26908k = f26897q;
        C1317rb rbVar = this.f26898a;
        rbVar.f26885a = 500;
        rbVar.f26886b = 500;
        this.f26903f = listView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[RETURN] */
    /* renamed from: a */
    private final float m20060a(int i, float f, float f2, float f3) {
        float f4;
        float f5;
        float a = m20059a(this.f26906i[i] * f2, 0.0f, this.f26907j[i]);
        float a2 = m20058a(f2 - f, a) - m20058a(f, a);
        if (a2 < 0.0f) {
            f5 = -this.f26904g.getInterpolation(-a2);
        } else if (a2 > 0.0f) {
            f5 = this.f26904g.getInterpolation(a2);
        } else {
            f4 = 0.0f;
            if (f4 != 0.0f) {
                return 0.0f;
            }
            float f6 = this.f26909l[i];
            float f7 = this.f26910m[i];
            float f8 = this.f26911n[i];
            float f9 = f6 * f3;
            if (f4 > 0.0f) {
                return m20059a(f4 * f9, f7, f8);
            }
            return -m20059a((-f4) * f9, f7, f8);
        }
        f4 = m20059a(f5, -1.0f, 1.0f);
        if (f4 != 0.0f) {
        }
    }

    /* renamed from: a */
    public final void mo15802a(boolean z) {
        if (this.f26913p && !z) {
            m20061b();
        }
        this.f26913p = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo15803a() {
        ListView listView;
        int count;
        C1317rb rbVar = this.f26898a;
        float f = rbVar.f26888d;
        int abs = (int) (f / Math.abs(f));
        float f2 = rbVar.f26887c;
        int abs2 = (int) (f2 / Math.abs(f2));
        if (!(abs == 0 || (count = (listView = this.f26903f).getCount()) == 0)) {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0) {
                if (abs < 0 && (firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0)) {
                    return true;
                }
            } else if (i < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight()) {
                return true;
            }
        }
        return abs2 == 0 ? false : false;
    }
}
