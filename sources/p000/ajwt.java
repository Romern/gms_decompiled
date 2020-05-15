package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ajwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajwt extends RotateDrawable {

    /* renamed from: a */
    public int f71459a = 8000;

    /* renamed from: b */
    public ValueAnimator f71460b;

    /* renamed from: c */
    private final Context f71461c;

    /* renamed from: d */
    private Drawable f71462d;

    /* renamed from: e */
    private int f71463e = 0;

    /* renamed from: f */
    private int f71464f = 0;

    public ajwt(Context context) {
        this.f71461c = context;
    }

    /* renamed from: a */
    public final Drawable mo39023a() {
        Drawable drawable = this.f71462d;
        if (drawable != null) {
            return drawable;
        }
        Drawable a = C1133kh.m17836a(this.f71461c, (int) C0126R.C0127drawable.sharing_progress_waiting);
        this.f71462d = a;
        setDrawable(a);
        return a;
    }

    public final void draw(Canvas canvas) {
        mo39023a();
        canvas.save();
        canvas.translate((float) this.f71463e, (float) this.f71464f);
        super.draw(canvas);
        canvas.restore();
    }

    public final void invalidateSelf() {
        mo39023a();
        super.invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        super.onLevelChange((i * 4) % 10000);
        mo39023a().setLevel(this.f71459a);
        return true;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        this.f71463e = i;
        this.f71464f = i2;
        super.setBounds(0, 0, i3 - i, i4 - i2);
    }
}
