package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.Property;
import com.google.android.libraries.onegoogle.account.disc.RingView;

/* renamed from: bddh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bddh extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ bmxv f105361a;

    /* renamed from: b */
    final /* synthetic */ bddk f105362b;

    public bddh(bddk bddk, bmxv bmxv) {
        this.f105362b = bddk;
        this.f105361a = bmxv;
    }

    public final void onAnimationStart(Animator animator) {
        bddk bddk = this.f105362b;
        Property property = bddk.f105364f;
        RingView ringView = bddk.f105365a;
        ((bdde) this.f105361a.mo66814b()).mo57888a();
        bddk bddk2 = this.f105362b;
        int i = bddk2.f105366b;
        int i2 = bddk2.f105367c;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        int i3 = (i2 + 1) / 2;
        int i4 = i - i3;
        RectF rectF = new RectF(new Rect(i3, i3, i4, i4));
        paint.setStrokeWidth((float) i2);
        int[][] iArr = bdcy.f105348a;
        for (int[] iArr2 : iArr) {
            paint.setColor(iArr2[0]);
            canvas.drawArc(rectF, (float) iArr2[1], (float) iArr2[2], false, paint);
        }
        ringView.setImageDrawable(new BitmapDrawable(createBitmap));
    }
}
