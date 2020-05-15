package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bepr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bepr extends Drawable implements bepq {

    /* renamed from: b */
    public final TextPaint f111999b;

    /* renamed from: c */
    public final Context f112000c;

    /* renamed from: d */
    public int f112001d = 1000;

    /* renamed from: e */
    public String f112002e;

    /* renamed from: f */
    public int f112003f = -12303292;

    /* renamed from: g */
    public Drawable f112004g;

    /* renamed from: h */
    public boolean f112005h;

    /* renamed from: i */
    public boolean f112006i = false;

    /* renamed from: j */
    public int f112007j;

    /* renamed from: k */
    private Rect f112008k;

    /* renamed from: l */
    private float f112009l = 1.0f;

    /* renamed from: m */
    private float f112010m = 1.0f;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Paint.setShadowLayer(float, float, float, int):void}
     arg types: [int, int, int, int]
     candidates:
      ClspMth{android.graphics.Paint.setShadowLayer(float, float, float, long):void}
      ClspMth{android.graphics.Paint.setShadowLayer(float, float, float, int):void} */
    public bepr(Context context) {
        TextPaint textPaint = new TextPaint();
        this.f111999b = textPaint;
        textPaint.setColor(-1);
        this.f111999b.setShadowLayer(1.0f, 0.0f, 1.0f, -1291845632);
        this.f111999b.setAntiAlias(true);
        this.f112000c = context;
    }

    /* renamed from: a */
    public final float mo50080a() {
        return this.f112009l;
    }

    /* renamed from: b */
    public final float mo50082b() {
        return this.f112010m;
    }

    /* renamed from: c */
    public final String mo60916c() {
        String str = this.f112002e;
        return str != null ? TextUtils.join(" ", bqcg.m112564a(str.toCharArray())) : "";
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Paint.setShadowLayer(float, float, float, int):void}
     arg types: [int, int, int, int]
     candidates:
      ClspMth{android.graphics.Paint.setShadowLayer(float, float, float, long):void}
      ClspMth{android.graphics.Paint.setShadowLayer(float, float, float, int):void} */
    public final void draw(Canvas canvas) {
        double d;
        double d2;
        double d3;
        Canvas canvas2 = canvas;
        Rect a = m95406a(0.0d, 0.0d, 700.0d, 440.0d);
        if (this.f112005h) {
            this.f112008k = null;
        } else if (!a.equals(this.f112008k) || this.f112004g == null) {
            PaintDrawable paintDrawable = new PaintDrawable(this.f112003f);
            double width = (double) a.width();
            Double.isNaN(width);
            paintDrawable.setCornerRadius((float) (width * 0.03571428571428571d));
            this.f112004g = new LayerDrawable(!this.f112006i ? new Drawable[]{paintDrawable, this.f112000c.getResources().getDrawable(C0126R.C0127drawable.tp_generic_card_art_pattern_color_360x227dp)} : new Drawable[]{paintDrawable});
            this.f112008k = a;
        }
        m95408a(this.f112004g, a, canvas2);
        if (this.f112002e != null) {
            Rect a2 = m95406a(56.0d, 346.0d, 300.0d, 38.0d);
            m95407a(a2, this.f111999b);
            canvas2.drawText(TextUtils.ellipsize(this.f112002e, this.f111999b, 476.0f, TextUtils.TruncateAt.END).toString(), (float) a2.left, (float) a2.bottom, this.f111999b);
        }
        if (!this.f112005h && this.f112007j != 0) {
            TextUtils.isEmpty(null);
            if (!TextUtils.isEmpty(null)) {
                d3 = 260.0d;
            } else {
                d3 = 0.0d;
            }
            m95408a(this.f112000c.getResources().getDrawable(this.f112007j), m95406a(518.0d, d3, 148.0d, 148.0d), canvas2);
        }
        if (!TextUtils.isEmpty(null) || !TextUtils.isEmpty(null)) {
            this.f111999b.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            if (!TextUtils.isEmpty(null)) {
                d = (double) m95405a(556.0d, 112.0d);
            } else {
                d = 0.0d;
            }
            if (!TextUtils.isEmpty(null)) {
                if (d != 0.0d) {
                    d2 = (-148.0d + d) - 0.125d;
                } else {
                    d2 = 520.0d;
                }
                m95405a(d2, 148.0d);
            }
            this.f111999b.setShadowLayer(1.0f, 0.0f, 1.0f, -1291845632);
            if (!TextUtils.isEmpty(null) && !TextUtils.isEmpty(null)) {
                Paint paint = new Paint();
                paint.setColor(C1165lm.m19355b(0, 31));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(2.0f);
                paint.setAntiAlias(true);
                float f = (float) (d - 0.25d);
                canvas.drawLine(f, 36.0f, f, 100.0f, paint);
            }
        }
    }

    public final int getIntrinsicHeight() {
        return 440;
    }

    public final int getIntrinsicWidth() {
        return 700;
    }

    public final int getOpacity() {
        return -2;
    }

    public final void setAlpha(int i) {
        this.f111999b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f111999b.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    private final int m95405a(double d, double d2) {
        Rect a = m95406a(d, 24.0d, d2, 40.0d);
        this.f111999b.setTypeface(Typeface.create("sans-serif-bold", 0));
        m95407a(a, this.f111999b);
        new Rect();
        throw null;
    }

    /* renamed from: b */
    public final void mo50083b(float f) {
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f112010m = f;
        colorMatrix.setSaturation(f);
        this.f111999b.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        invalidateSelf();
    }

    /* renamed from: a */
    private final Rect m95406a(double d, double d2, double d3, double d4) {
        Rect bounds = getBounds();
        double width = (double) bounds.width();
        double height = (double) bounds.height();
        Double.isNaN(width);
        Double.isNaN(height);
        Double.isNaN(width);
        Double.isNaN(height);
        return new Rect((int) ((width * d) / 700.0d), (int) ((height * d2) / 440.0d), (int) ((width * (d + d3)) / 700.0d), (int) ((height * (d2 + d4)) / 440.0d));
    }

    /* renamed from: a */
    private static void m95407a(Rect rect, Paint paint) {
        Paint.FontMetrics fontMetrics = new Paint.FontMetrics();
        int height = rect.height();
        while (height > 0) {
            paint.setTextSize((float) height);
            paint.getFontMetrics(fontMetrics);
            if (fontMetrics.descent - fontMetrics.ascent > ((float) rect.height())) {
                height--;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private final void m95408a(Drawable drawable, Rect rect, Canvas canvas) {
        if (drawable != null) {
            drawable.setBounds(rect);
            drawable.setAlpha(this.f111999b.getAlpha());
            drawable.setColorFilter(this.f111999b.getColorFilter());
            drawable.draw(canvas);
        }
    }

    /* renamed from: a */
    public final void mo50081a(float f) {
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f112009l = f;
        colorMatrix.setScale(f, f, f, 1.0f);
        this.f111999b.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo60914a(Bitmap bitmap, boolean z) {
        BitmapDrawable bitmapDrawable;
        if (!z) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            RectF rectF = new RectF(rect);
            double width = (double) rect.width();
            Double.isNaN(width);
            float f = (float) (width * 0.03571428571428571d);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            canvas.drawRoundRect(rectF, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect, paint);
            bitmapDrawable = new BitmapDrawable(this.f112000c.getResources(), createBitmap);
        } else {
            bitmapDrawable = new BitmapDrawable(this.f112000c.getResources(), bitmap);
        }
        this.f112004g = bitmapDrawable;
        this.f112005h = true;
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo60915a(String str) {
        this.f112002e = str;
        invalidateSelf();
    }
}
