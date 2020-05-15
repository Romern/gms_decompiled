package p000;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;

/* renamed from: bci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bci extends bcg {

    /* renamed from: g */
    private final Paint f2959g = new azc(3);

    /* renamed from: h */
    private final Rect f2960h = new Rect();

    /* renamed from: i */
    private final Rect f2961i = new Rect();

    /* renamed from: j */
    private azy f2962j;

    public bci(ayo ayo, bcj bcj) {
        super(ayo, bcj);
    }

    /* renamed from: e */
    private final Bitmap m2682e() {
        ayp ayp;
        String str = this.f2936c.f2968f;
        bap l = this.f2935b.mo2899l();
        if (l == null || (ayp = (ayp) l.f2791c.get(str)) == null) {
            return null;
        }
        Bitmap bitmap = ayp.f2570e;
        if (bitmap != null) {
            return bitmap;
        }
        String str2 = ayp.f2569d;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(l.f2790b)) {
                    AssetManager assets = l.f2789a.getAssets();
                    Bitmap a = ben.m2832a(BitmapFactory.decodeStream(assets.open(l.f2790b + str2), null, options), ayp.f2566a, ayp.f2567b);
                    l.mo2958a(str, a);
                    return a;
                }
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            } catch (IOException e) {
                bek.m2806a("Unable to open asset.", e);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                l.mo2958a(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException e2) {
                bek.m2806a("data URL did not have correct base64 format.", e2);
                return null;
            }
        }
    }

    /* renamed from: a */
    public final void mo2924a(RectF rectF, Matrix matrix, boolean z) {
        super.mo2924a(rectF, matrix, z);
        Bitmap e = m2682e();
        if (e != null) {
            rectF.set(0.0f, 0.0f, ((float) e.getWidth()) * ben.m2828a(), ((float) e.getHeight()) * ben.m2828a());
            this.f2934a.mapRect(rectF);
        }
    }

    /* renamed from: b */
    public final void mo2991b(Canvas canvas, Matrix matrix, int i) {
        Bitmap e = m2682e();
        if (e != null && !e.isRecycled()) {
            float a = ben.m2828a();
            this.f2959g.setAlpha(i);
            azy azy = this.f2962j;
            if (azy != null) {
                this.f2959g.setColorFilter((ColorFilter) azy.mo2944f());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f2960h.set(0, 0, e.getWidth(), e.getHeight());
            this.f2961i.set(0, 0, (int) (((float) e.getWidth()) * a), (int) (((float) e.getHeight()) * a));
            canvas.drawBitmap(e, this.f2960h, this.f2961i, this.f2959g);
            canvas.restore();
        }
    }

    /* renamed from: a */
    public final void mo2926a(Object obj, beq beq) {
        super.mo2926a(obj, beq);
        if (obj == ayt.f2572B) {
            this.f2962j = new ban(beq);
        }
    }
}
