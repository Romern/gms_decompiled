package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;

/* renamed from: cnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cnu extends Drawable implements Animatable, cny, aui {

    /* renamed from: a */
    public final cnt f7116a;

    /* renamed from: b */
    public boolean f7117b;

    /* renamed from: c */
    private boolean f7118c;

    /* renamed from: d */
    private boolean f7119d;

    /* renamed from: e */
    private boolean f7120e = true;

    /* renamed from: f */
    private int f7121f;

    /* renamed from: g */
    private final int f7122g = -1;

    /* renamed from: h */
    private boolean f7123h;

    /* renamed from: i */
    private Paint f7124i;

    /* renamed from: j */
    private Rect f7125j;

    public cnu(cnt cnt) {
        crb.m7382a(cnt);
        this.f7116a = cnt;
    }

    /* renamed from: e */
    private final void m4612e() {
        crb.m7386a(!this.f7117b, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f7116a.f7115a.mo4026a() == 1) {
            invalidateSelf();
        } else if (!this.f7118c) {
            this.f7118c = true;
            coa coa = this.f7116a.f7115a;
            if (coa.f7138e) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            } else if (!coa.f7135b.contains(this)) {
                boolean isEmpty = coa.f7135b.isEmpty();
                coa.f7135b.add(this);
                if (isEmpty && !coa.f7137d) {
                    coa.f7137d = true;
                    coa.f7138e = false;
                    coa.mo4030c();
                }
                invalidateSelf();
            } else {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
        }
    }

    /* renamed from: f */
    private final void m4613f() {
        this.f7118c = false;
        coa coa = this.f7116a.f7115a;
        coa.f7135b.remove(this);
        if (coa.f7135b.isEmpty()) {
            coa.mo4029b();
        }
    }

    /* renamed from: g */
    private final Rect m4614g() {
        if (this.f7125j == null) {
            this.f7125j = new Rect();
        }
        return this.f7125j;
    }

    /* renamed from: h */
    private final Paint m4615h() {
        if (this.f7124i == null) {
            this.f7124i = new Paint(2);
        }
        return this.f7124i;
    }

    /* renamed from: a */
    public final void mo2526a() {
    }

    /* renamed from: b */
    public final Bitmap mo4009b() {
        return this.f7116a.f7115a.f7139f;
    }

    /* renamed from: c */
    public final ByteBuffer mo4010c() {
        return ((ccs) this.f7116a.f7115a.f7134a).f6536a.asReadOnlyBuffer();
    }

    public final void draw(Canvas canvas) {
        if (!this.f7117b) {
            if (this.f7123h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m4614g());
                this.f7123h = false;
            }
            coa coa = this.f7116a.f7115a;
            cqb cqb = coa.f7143j;
            canvas.drawBitmap(cqb != null ? cqb.f11836b : coa.f7139f, (Rect) null, m4614g(), m4615h());
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f7116a;
    }

    public final int getIntrinsicHeight() {
        return this.f7116a.f7115a.f7142i;
    }

    public final int getIntrinsicWidth() {
        return this.f7116a.f7115a.f7141h;
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.f7118c;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f7123h = true;
    }

    public final void setAlpha(int i) {
        m4615h().setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        m4615h().setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        crb.m7386a(!this.f7117b, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f7120e = z;
        if (!z) {
            m4613f();
        } else if (this.f7119d) {
            m4612e();
        }
        return super.setVisible(z, z2);
    }

    public final void start() {
        this.f7119d = true;
        this.f7121f = 0;
        if (this.f7120e) {
            m4612e();
        }
    }

    public final void stop() {
        this.f7119d = false;
        m4613f();
    }

    /* renamed from: d */
    public final void mo4011d() {
        int i;
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback != null) {
            invalidateSelf();
            coa coa = this.f7116a.f7115a;
            cqb cqb = coa.f7143j;
            if (cqb != null) {
                i = cqb.f11835a;
            } else {
                i = -1;
            }
            if (i == coa.mo4026a() - 1) {
                this.f7121f++;
            }
            if (this.f7122g != -1 && this.f7121f >= 0) {
                stop();
                return;
            }
            return;
        }
        stop();
        invalidateSelf();
    }
}
