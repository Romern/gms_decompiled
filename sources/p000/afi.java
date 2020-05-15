package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.util.Objects;

/* renamed from: afi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afi extends Drawable {

    /* renamed from: a */
    final Paint f426a;

    /* renamed from: b */
    public int f427b;

    /* renamed from: c */
    private Drawable f428c;

    /* renamed from: d */
    private final RectF f429d = new RectF();

    public afi() {
        Paint paint = new Paint();
        this.f426a = paint;
        paint.setAntiAlias(true);
    }

    /* renamed from: a */
    private final void m646a() {
        if (this.f428c != null) {
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                Drawable drawable = this.f428c;
                int width = bounds.width();
                int height = bounds.height();
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth > intrinsicHeight) {
                    int i = (((int) (((float) width) * (((float) intrinsicWidth) / ((float) intrinsicHeight)))) - width) / 2;
                    drawable.setBounds(-i, 0, width + i, height);
                } else {
                    int i2 = (((int) (((float) height) * (((float) intrinsicHeight) / ((float) intrinsicWidth)))) - height) / 2;
                    drawable.setBounds(0, -i2, width, height + i2);
                }
                drawable.draw(canvas);
                this.f426a.setShader(new BitmapShader(createBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
            }
        }
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (this.f428c != null && !bounds.isEmpty()) {
            canvas.save();
            canvas.translate((float) bounds.left, (float) bounds.top);
            RectF rectF = this.f429d;
            float f = (float) this.f427b;
            canvas.drawRoundRect(rectF, f, f, this.f426a);
            canvas.restore();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f429d.right = (float) rect.width();
        this.f429d.bottom = (float) rect.height();
        m646a();
    }

    public final void setAlpha(int i) {
        this.f426a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f426a.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    public final void mo572a(Drawable drawable) {
        if (!Objects.equals(this.f428c, drawable)) {
            this.f428c = drawable;
            m646a();
        }
    }
}
