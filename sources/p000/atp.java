package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.cast.JGCastService;

/* renamed from: atp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atp {
    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00e3  */
    /* renamed from: a */
    static View m2088a(ViewGroup viewGroup, View view, View view2) {
        int i;
        ViewGroup viewGroup2;
        View view3 = view;
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        int i2 = aty.f2233b;
        view3.transformMatrixToGlobal(matrix);
        viewGroup.transformMatrixToLocal(matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean z = !view.isAttachedToWindow();
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        Bitmap bitmap = null;
        if (!z) {
            viewGroup2 = null;
            i = 0;
        } else {
            if (isAttachedToWindow) {
                viewGroup2 = (ViewGroup) view.getParent();
                i = viewGroup2.indexOfChild(view3);
                viewGroup.getOverlay().add(view3);
            }
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            }
            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(round4 - round2, JGCastService.FLAG_PRIVATE_DISPLAY));
            imageView.layout(round, round2, round3, round4);
            return imageView;
        }
        int round5 = Math.round(rectF.width());
        int round6 = Math.round(rectF.height());
        if (round5 > 0 && round6 > 0) {
            float min = Math.min(1.0f, 1048576.0f / ((float) (round5 * round6)));
            int round7 = Math.round(((float) round5) * min);
            int round8 = Math.round(((float) round6) * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            Picture picture = new Picture();
            Canvas beginRecording = picture.beginRecording(round7, round8);
            beginRecording.concat(matrix);
            view3.draw(beginRecording);
            picture.endRecording();
            bitmap = Bitmap.createBitmap(picture);
        }
        if (z) {
            viewGroup.getOverlay().remove(view3);
            viewGroup2.addView(view3, i);
        }
        if (bitmap != null) {
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(round4 - round2, JGCastService.FLAG_PRIVATE_DISPLAY));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }
}
