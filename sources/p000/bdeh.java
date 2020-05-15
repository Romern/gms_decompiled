package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: bdeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdeh {

    /* renamed from: a */
    public final WeakReference f105408a;

    /* renamed from: b */
    public final bden f105409b;

    /* renamed from: c */
    public final bdek f105410c;

    /* renamed from: d */
    public boolean f105411d;

    /* renamed from: e */
    final /* synthetic */ bdej f105412e;

    /* renamed from: f */
    private final bngx f105413f;

    public bdeh(bdej bdej, bdek bdek, bngx bngx, ImageView imageView) {
        this.f105412e = bdej;
        bmxy.m108581a(imageView);
        this.f105408a = new WeakReference(imageView);
        this.f105409b = bdej.f105418d.mo57941a(((bddt) bdek).f105383a);
        this.f105410c = bdek;
        this.f105413f = bngx;
    }

    /* renamed from: a */
    public final void mo57937a(Bitmap bitmap) {
        if (bitmap != null) {
            List<bdem> c = this.f105409b.mo57916c();
            if (c != null && !c.isEmpty()) {
                for (bdem bdem : c) {
                    bdem bdem2 = bdem.CIRCLE_CROP;
                    if (bdem.ordinal() == 0) {
                        C1245ok okVar = bdej.f105415a;
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        int min = Math.min(width, height);
                        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        float f = (float) (min / 2);
                        canvas.drawCircle(f, f, f, paint);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        canvas.drawBitmap(bitmap, (float) ((min - width) / 2), (float) ((min - height) / 2), paint);
                        bitmap = createBitmap;
                    }
                }
            }
            ImageView imageView = (ImageView) this.f105408a.get();
            if (imageView != null) {
                bddx.m90628a(imageView);
                C1245ok okVar2 = bdej.f105415a;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null || layoutParams.height <= 0) {
                    imageView.getHeight();
                } else {
                    int i = layoutParams.height;
                }
                imageView.getPaddingTop();
                imageView.getPaddingBottom();
                bnre i2 = this.f105413f.listIterator();
                while (i2.hasNext()) {
                    bitmap = ((bder) i2.next()).mo57944a();
                }
            }
        } else {
            bitmap = null;
        }
        mo57938a(new BitmapDrawable(bitmap));
    }

    /* renamed from: b */
    public final void mo57940b(Drawable drawable) {
        beel.m91855b();
        ImageView imageView = (ImageView) this.f105408a.get();
        if (!this.f105411d && imageView != null) {
            imageView.setImageDrawable(drawable);
            bdej.m90637a(imageView, null);
        }
    }

    /* renamed from: a */
    public final void mo57938a(Drawable drawable) {
        ImageView imageView = (ImageView) this.f105408a.get();
        if (!this.f105411d && imageView != null) {
            bdeg bdeg = new bdeg(this, drawable);
            imageView.addOnAttachStateChangeListener(bdeg);
            if (C1280ps.m19871F(imageView)) {
                imageView.removeOnAttachStateChangeListener(bdeg);
                imageView.post(new bdec(this, drawable));
            }
        }
    }

    /* renamed from: a */
    public final void mo57939a(Runnable runnable) {
        if (beel.m91854a()) {
            this.f105412e.f105419e.execute(runnable);
        } else {
            runnable.run();
        }
    }
}
