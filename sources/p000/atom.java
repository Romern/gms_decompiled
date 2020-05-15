package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.tapandpay.firstparty.ValuableInfo;
import java.io.IOException;

/* renamed from: atom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atom extends Drawable implements bepq {

    /* renamed from: b */
    private static final srn f90592b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    private static final Rect f90593c = new Rect(35, 35, 95, 95);

    /* renamed from: d */
    private static final Rect f90594d = new Rect(135, 35, 530, 67);

    /* renamed from: e */
    private static final Rect f90595e = new Rect(135, 75, 530, 95);

    /* renamed from: f */
    private static final Rect f90596f = new Rect(550, 35, 665, 67);

    /* renamed from: g */
    private static final Rect f90597g = new Rect(550, 75, 665, 95);

    /* renamed from: h */
    private static final Rect f90598h = new Rect(0, 130, 700, 385);

    /* renamed from: i */
    private static final Rect f90599i = new Rect(35, 385, 665, 420);

    /* renamed from: j */
    private static final Rect f90600j = new Rect(0, 0, 700, 440);

    /* renamed from: k */
    private static final Rect f90601k;

    /* renamed from: l */
    private final Bitmap f90602l;

    /* renamed from: m */
    private final Bitmap f90603m;

    /* renamed from: n */
    private final Bitmap f90604n;

    /* renamed from: o */
    private final ValuableInfo f90605o;

    /* renamed from: p */
    private final TextPaint f90606p = new TextPaint();

    /* renamed from: q */
    private final ColorMatrix f90607q = new ColorMatrix();

    /* renamed from: r */
    private float f90608r = 1.0f;

    static {
        Rect rect = new Rect(f90594d);
        f90601k = rect;
        rect.union(f90595e);
    }

    public atom(Context context, ValuableInfo valuableInfo) {
        this.f90605o = valuableInfo;
        Bitmap bitmap = valuableInfo.f108495o;
        this.f90602l = bitmap == null ? m76226a(context, valuableInfo.f108484d) : bitmap;
        Bitmap bitmap2 = valuableInfo.f108494n;
        this.f90603m = bitmap2 == null ? m76226a(context, valuableInfo.f108489i) : bitmap2;
        Bitmap bitmap3 = valuableInfo.f108493m;
        this.f90604n = bitmap3 == null ? m76226a(context, valuableInfo.f108488h) : bitmap3;
        this.f90606p.setAntiAlias(true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ssa.a(android.content.ContentResolver, android.net.Uri, int, boolean):android.graphics.Bitmap
     arg types: [android.content.ContentResolver, android.net.Uri, int, int]
     candidates:
      ssa.a(android.content.ContentResolver, android.net.Uri, android.graphics.Bitmap, boolean):android.graphics.Bitmap
      ssa.a(android.content.ContentResolver, android.net.Uri, int, boolean):android.graphics.Bitmap */
    /* renamed from: a */
    static Bitmap m76226a(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return ssa.m36182a(context.getContentResolver(), uri, -1, false);
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f90592b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Decoding image failed for: %s", uri);
            return null;
        }
    }

    /* renamed from: b */
    public final float mo50082b() {
        return this.f90608r;
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        int i = this.f90605o.f108487g;
        if ((i == 4 || i == 8) && (bitmap = this.f90604n) != null) {
            m76227a(canvas, f90600j, bitmap);
            return;
        }
        RectF rectF = new RectF(getBounds());
        this.f90606p.setColor(this.f90605o.f108485e);
        canvas.drawRoundRect(rectF, 25.0f, 25.0f, this.f90606p);
        this.f90606p.setTextSize(32.0f);
        this.f90606p.setTextAlign(Paint.Align.LEFT);
        this.f90606p.setColor(this.f90605o.f108486f);
        this.f90606p.setTypeface(Typeface.DEFAULT);
        m76227a(canvas, f90593c, this.f90602l);
        Bitmap bitmap2 = this.f90603m;
        if (bitmap2 != null) {
            m76227a(canvas, f90601k, bitmap2);
        } else {
            String str = this.f90605o.f108481a;
            if (!TextUtils.isEmpty(str)) {
                this.f90606p.setTextSize(32.0f);
                m76228a(canvas, str, f90594d);
            }
            String str2 = this.f90605o.f108482b;
            if (!TextUtils.isEmpty(str2)) {
                this.f90606p.setTextSize(20.0f);
                m76228a(canvas, str2, f90595e);
            }
        }
        this.f90606p.setTextAlign(Paint.Align.RIGHT);
        this.f90606p.setTextSize(32.0f);
        this.f90606p.setTypeface(Typeface.DEFAULT_BOLD);
        m76228a(canvas, this.f90605o.f108483c, f90596f);
        this.f90606p.setTextSize(20.0f);
        this.f90606p.setTypeface(Typeface.DEFAULT);
        m76228a(canvas, this.f90605o.f108490j, f90597g);
        m76227a(canvas, f90598h, this.f90604n);
        this.f90606p.setTextAlign(Paint.Align.CENTER);
        m76228a(canvas, this.f90605o.f108491k, f90599i);
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
        this.f90606p.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f90606p.setColorFilter(colorFilter);
    }

    /* renamed from: b */
    public final void mo50083b(float f) {
        this.f90608r = f;
        this.f90607q.setSaturation(f);
        this.f90606p.setColorFilter(new ColorMatrixColorFilter(this.f90607q));
        invalidateSelf();
    }

    /* renamed from: a */
    private final void m76227a(Canvas canvas, Rect rect, Bitmap bitmap) {
        if (bitmap != null) {
            RectF rectF = new RectF();
            rectF.bottom = (float) bitmap.getHeight();
            rectF.right = (float) bitmap.getWidth();
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, new RectF(rect), Matrix.ScaleToFit.CENTER);
            canvas.drawBitmap(bitmap, matrix, this.f90606p);
        }
    }

    /* renamed from: a */
    private final void m76228a(Canvas canvas, String str, Rect rect) {
        if (!TextUtils.isEmpty(str)) {
            Paint.Align textAlign = this.f90606p.getTextAlign();
            canvas.drawText(TextUtils.ellipsize(str, this.f90606p, (float) rect.width(), TextUtils.TruncateAt.END).toString(), (float) (textAlign == Paint.Align.LEFT ? rect.left : textAlign != Paint.Align.RIGHT ? (rect.left + rect.right) / 2 : rect.right), (float) rect.bottom, this.f90606p);
        }
    }

    public atom(ValuableInfo valuableInfo, Bitmap bitmap) {
        this.f90604n = bitmap;
        this.f90605o = valuableInfo;
        this.f90602l = null;
        this.f90603m = null;
    }

    @Deprecated
    /* renamed from: a */
    public final float mo50080a() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: a */
    public final void mo50081a(float f) {
        throw new UnsupportedOperationException();
    }
}
