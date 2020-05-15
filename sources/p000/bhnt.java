package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: bhnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhnt extends LinearLayout {

    /* renamed from: a */
    public int f119151a;

    /* renamed from: b */
    public final Paint f119152b;

    /* renamed from: c */
    public int f119153c = -1;

    /* renamed from: d */
    public float f119154d;

    /* renamed from: e */
    int f119155e = -1;

    /* renamed from: f */
    int f119156f = -1;

    /* renamed from: g */
    public ValueAnimator f119157g;

    /* renamed from: h */
    public int f119158h = -1;

    /* renamed from: i */
    public int f119159i = -1;

    /* renamed from: j */
    final /* synthetic */ TabLayout f119160j;

    /* renamed from: k */
    private final GradientDrawable f119161k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bhnt(TabLayout tabLayout, Context context) {
        super(context);
        this.f119160j = tabLayout;
        setWillNotDraw(false);
        this.f119152b = new Paint();
        this.f119161k = new GradientDrawable();
    }

    /* renamed from: a */
    private final void m101218a(bhnx bhnx, RectF rectF) {
        View[] viewArr = {bhnx.f119174a, bhnx.f119175b, null};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                i = z ? Math.max(i, view.getRight()) : view.getRight();
                z = true;
            }
        }
        int i4 = i - i2;
        int a = (int) bhkn.m101061a(getContext(), 24);
        if (i4 < a) {
            i4 = a;
        }
        int left = (bhnx.getLeft() + bhnx.getRight()) / 2;
        int i5 = i4 / 2;
        rectF.set((float) (left - i5), 0.0f, (float) (left + i5), 0.0f);
    }

    public final void draw(Canvas canvas) {
        int i;
        Drawable drawable = this.f119160j.f151259n;
        int i2 = 0;
        if (drawable != null) {
            i = drawable.getIntrinsicHeight();
        } else {
            i = 0;
        }
        int i3 = this.f119151a;
        if (i3 >= 0) {
            i = i3;
        }
        int i4 = this.f119160j.f151267v;
        if (i4 == 0) {
            i2 = getHeight() - i;
            i = getHeight();
        } else if (i4 == 1) {
            i2 = (getHeight() - i) / 2;
            i = (getHeight() + i) / 2;
        } else if (i4 != 2) {
            if (i4 != 3) {
                i = 0;
            } else {
                i = getHeight();
            }
        }
        int i5 = this.f119155e;
        if (i5 >= 0 && this.f119156f > i5) {
            Drawable drawable2 = this.f119160j.f151259n;
            if (drawable2 == null) {
                drawable2 = this.f119161k;
            }
            int i6 = Build.VERSION.SDK_INT;
            Drawable mutate = drawable2.mutate();
            mutate.setBounds(this.f119155e, i2, this.f119156f, i);
            if (this.f119152b != null) {
                int i7 = Build.VERSION.SDK_INT;
                C1173lt.m19599a(mutate, this.f119152b.getColor());
            }
            mutate.draw(canvas);
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.f119157g;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            mo64053a();
        } else {
            mo64055a(false, this.f119153c, -1);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            TabLayout tabLayout = this.f119160j;
            if (tabLayout.f151265t == 1 || tabLayout.f151268w == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 > 0) {
                    int a = (int) bhkn.m101061a(getContext(), 16);
                    if (i3 * childCount > getMeasuredWidth() - (a + a)) {
                        TabLayout tabLayout2 = this.f119160j;
                        tabLayout2.f151265t = 0;
                        tabLayout2.mo71222a(false);
                    } else {
                        boolean z = false;
                        for (int i5 = 0; i5 < childCount; i5++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                            if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                layoutParams.width = i3;
                                layoutParams.weight = 0.0f;
                                z = true;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    }
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int i2 = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public final void mo64053a() {
        int i;
        View childAt = getChildAt(this.f119153c);
        int i2 = -1;
        if (childAt == null) {
            i = -1;
        } else if (childAt.getWidth() > 0) {
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = this.f119160j;
            if (!tabLayout.f151270y && (childAt instanceof bhnx)) {
                int i3 = TabLayout.f151230B;
                m101218a((bhnx) childAt, tabLayout.f151249d);
                left = (int) this.f119160j.f151249d.left;
                right = (int) this.f119160j.f151249d.right;
            }
            if (this.f119154d <= 0.0f || this.f119153c >= getChildCount() - 1) {
                i2 = left;
                i = right;
            } else {
                View childAt2 = getChildAt(this.f119153c + 1);
                int left2 = childAt2.getLeft();
                int right2 = childAt2.getRight();
                TabLayout tabLayout2 = this.f119160j;
                if (!tabLayout2.f151270y && (childAt2 instanceof bhnx)) {
                    int i4 = TabLayout.f151230B;
                    m101218a((bhnx) childAt2, tabLayout2.f151249d);
                    left2 = (int) this.f119160j.f151249d.left;
                    right2 = (int) this.f119160j.f151249d.right;
                }
                float f = this.f119154d;
                float f2 = 1.0f - f;
                i2 = (int) ((((float) left2) * f) + (((float) left) * f2));
                i = (int) ((f * ((float) right2)) + (f2 * ((float) right)));
            }
        } else {
            i = -1;
        }
        mo64054a(i2, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64054a(int i, int i2) {
        if (i != this.f119155e || i2 != this.f119156f) {
            this.f119155e = i;
            this.f119156f = i2;
            C1280ps.m19915e(this);
        }
    }

    /* renamed from: a */
    public final void mo64055a(boolean z, int i, int i2) {
        View childAt = getChildAt(i);
        if (childAt == null) {
            mo64053a();
            return;
        }
        int left = childAt.getLeft();
        int right = childAt.getRight();
        TabLayout tabLayout = this.f119160j;
        if (!tabLayout.f151270y && (childAt instanceof bhnx)) {
            int i3 = TabLayout.f151230B;
            m101218a((bhnx) childAt, tabLayout.f151249d);
            left = (int) this.f119160j.f151249d.left;
            right = (int) this.f119160j.f151249d.right;
        }
        int i4 = this.f119155e;
        int i5 = this.f119156f;
        if (i4 != left || i5 != right) {
            if (z) {
                this.f119158h = i4;
                this.f119159i = i5;
            }
            bhnr bhnr = new bhnr(this, left, right);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f119157g = valueAnimator;
                valueAnimator.setInterpolator(bhdl.f118328b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(bhnr);
                valueAnimator.addListener(new bhns(this, i));
                valueAnimator.start();
                return;
            }
            this.f119157g.removeAllUpdateListeners();
            this.f119157g.addUpdateListener(bhnr);
        }
    }
}
