package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.felicanetworks.mfc.C0126R;

/* renamed from: apek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apek extends Drawable {

    /* renamed from: a */
    public static TypedArray f84242a;

    /* renamed from: b */
    public static int f84243b;

    /* renamed from: f */
    private static int f84244f;

    /* renamed from: g */
    private static float f84245g;

    /* renamed from: h */
    private static Drawable f84246h;

    /* renamed from: i */
    private static final Paint f84247i = new Paint();

    /* renamed from: j */
    private static final Rect f84248j = new Rect();

    /* renamed from: k */
    private static final char[] f84249k = new char[1];

    /* renamed from: c */
    public int f84250c;

    /* renamed from: d */
    public Character f84251d;

    /* renamed from: e */
    private final Paint f84252e;

    static {
        apek.class.getSimpleName();
    }

    apek() {
        this.f84251d = null;
        this.f84252e = new Paint();
    }

    /* renamed from: a */
    private static synchronized void m70096a(Resources resources) {
        synchronized (apek.class) {
            if (f84242a == null) {
                f84242a = resources.obtainTypedArray(C0126R.array.letter_tile_colors);
                f84243b = resources.getColor(C0126R.color.letter_tile_default_color);
                f84244f = resources.getColor(C0126R.color.background_white);
                f84245g = resources.getFraction(C0126R.fraction.letter_to_tile_ratio, 1, 1);
                f84246h = resources.getDrawable(C0126R.C0127drawable.product_logo_avatar_anonymous_white_color_48);
                f84247i.setTypeface(Typeface.create("sans-serif", 0));
                f84247i.setTextAlign(Paint.Align.CENTER);
                f84247i.setAntiAlias(true);
            }
        }
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (isVisible() && !bounds.isEmpty()) {
            f84247i.setColor(this.f84250c);
            f84247i.setAlpha(this.f84252e.getAlpha());
            Rect bounds2 = getBounds();
            int min = Math.min(bounds2.width(), bounds2.height());
            canvas.drawCircle((float) bounds2.centerX(), (float) bounds2.centerY(), (float) (min / 2), f84247i);
            Character ch = this.f84251d;
            if (ch != null) {
                f84249k[0] = ch.charValue();
                f84247i.setTextSize(f84245g * ((float) min));
                f84247i.getTextBounds(f84249k, 0, 1, f84248j);
                f84247i.setTypeface(Typeface.create("sans-serif", 0));
                f84247i.setColor(f84244f);
                f84247i.setAlpha(138);
                canvas.drawText(f84249k, 0, 1, (float) bounds2.centerX(), (((float) bounds2.centerY()) + (((float) bounds2.height()) * 0.0f)) - f84248j.exactCenterY(), f84247i);
                return;
            }
            Drawable drawable = f84246h;
            Rect copyBounds = copyBounds();
            int min2 = (int) (((float) Math.min(copyBounds.width(), copyBounds.height())) / 2.0f);
            copyBounds.set(copyBounds.centerX() - min2, (int) (((float) (copyBounds.centerY() - min2)) + (((float) copyBounds.height()) * 0.0f)), copyBounds.centerX() + min2, (int) (((float) (copyBounds.centerY() + min2)) + (((float) copyBounds.height()) * 0.0f)));
            drawable.setBounds(copyBounds);
            f84246h.setAlpha(138);
            f84246h.draw(canvas);
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
        this.f84252e.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f84252e.setColorFilter(colorFilter);
    }

    public apek(Resources resources) {
        this.f84251d = null;
        m70096a(resources);
        Paint paint = new Paint();
        this.f84252e = paint;
        paint.setFilterBitmap(true);
        this.f84252e.setDither(true);
        this.f84250c = f84243b;
    }
}
