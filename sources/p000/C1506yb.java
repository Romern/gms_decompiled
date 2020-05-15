package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.felicanetworks.mfc.C0126R;

/* renamed from: yb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1506yb extends SeekBar {

    /* renamed from: a */
    private final C1507yc f27630a;

    public C1506yb(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1507yc ycVar = this.f27630a;
        Drawable drawable = ycVar.f27632c;
        if (drawable != null && drawable.isStateful() && drawable.setState(ycVar.f27631b.getDrawableState())) {
            ycVar.f27631b.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f27630a.f27632c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        C1507yc ycVar = this.f27630a;
        if (ycVar.f27632c != null) {
            int max = ycVar.f27631b.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = ycVar.f27632c.getIntrinsicWidth();
                int intrinsicHeight = ycVar.f27632c.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth >> 1;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight >> 1;
                }
                ycVar.f27632c.setBounds(-i, -i2, i, i2);
                float width = ((float) ((ycVar.f27631b.getWidth() - ycVar.f27631b.getPaddingLeft()) - ycVar.f27631b.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) ycVar.f27631b.getPaddingLeft(), (float) (ycVar.f27631b.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    ycVar.f27632c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public C1506yb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.seekBarStyle);
    }

    public C1506yb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        adm.m515a(this, getContext());
        C1507yc ycVar = new C1507yc(this);
        this.f27630a = ycVar;
        ycVar.mo16524a(attributeSet, i);
    }
}
