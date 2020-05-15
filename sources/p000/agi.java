package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* renamed from: agi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agi extends Drawable {

    /* renamed from: a */
    private final Path f503a = new Path();

    public agi() {
        new Handler(Looper.getMainLooper());
        new agf();
        new Rect();
        new agh(this);
    }

    public final void draw(Canvas canvas) {
    }

    public final int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f503a.reset();
        this.f503a.addOval((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom, Path.Direction.CW);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
