package p000;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;

/* renamed from: ajwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajwx {

    /* renamed from: a */
    public int f71479a;

    /* renamed from: b */
    public final Paint f71480b;

    /* renamed from: c */
    public final float f71481c;

    /* renamed from: d */
    final /* synthetic */ ajwy f71482d;

    /* renamed from: e */
    private ValueAnimator f71483e;

    public ajwx(ajwy ajwy, Paint paint) {
        this(ajwy, paint, 0);
    }

    /* renamed from: a */
    public final void mo39038a() {
        ValueAnimator valueAnimator = this.f71483e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f71483e = null;
        }
        this.f71479a = 0;
    }

    public ajwx(ajwy ajwy, Paint paint, int i) {
        this.f71482d = ajwy;
        this.f71480b = paint;
        this.f71479a = i;
        this.f71481c = paint.getStrokeWidth();
    }

    /* renamed from: a */
    public final void mo39039a(long j) {
        mo39038a();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f71483e = ofFloat;
        ofFloat.setStartDelay(j);
        this.f71483e.setDuration(2000L);
        this.f71483e.setInterpolator(new LinearInterpolator());
        this.f71483e.addUpdateListener(new ajww(this));
        this.f71483e.setRepeatCount(-1);
        this.f71483e.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39040a(Canvas canvas) {
        int width = this.f71482d.getBounds().width() / 2;
        int height = this.f71482d.getBounds().height() / 2;
        int i = this.f71479a;
        canvas.drawOval((float) (width - i), (float) (height - i), (float) (width + i), (float) (height + i), this.f71480b);
    }
}
