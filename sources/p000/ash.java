package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;

/* renamed from: ash */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ash extends atf {

    /* renamed from: u */
    private static final String[] f2122u = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: v */
    private static final TypeEvaluator f2123v = new ase();

    /* renamed from: w */
    private static final Property f2124w = new asf(Matrix.class, "animatedTransform");

    /* renamed from: d */
    private static final void m1931d(atq atq) {
        Matrix matrix;
        View view = atq.f2216b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map map = atq.f2215a;
                map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix = new Matrix(imageView.getImageMatrix());
                } else {
                    int i = asg.f2121a[imageView.getScaleType().ordinal()];
                    if (i == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        Matrix matrix2 = new Matrix();
                        matrix2.postScale(((float) imageView.getWidth()) / ((float) drawable2.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable2.getIntrinsicHeight()));
                        matrix = matrix2;
                    } else if (i != 2) {
                        matrix = new Matrix(imageView.getImageMatrix());
                    } else {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        int width = imageView.getWidth();
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float f = (float) width;
                        float f2 = (float) intrinsicWidth;
                        float height = (float) imageView.getHeight();
                        float f3 = (float) intrinsicHeight;
                        float max = Math.max(f / f2, height / f3);
                        int round = Math.round((f - (f2 * max)) / 2.0f);
                        int round2 = Math.round((height - (f3 * max)) / 2.0f);
                        Matrix matrix3 = new Matrix();
                        matrix3.postScale(max, max);
                        matrix3.postTranslate((float) round, (float) round2);
                        matrix = matrix3;
                    }
                }
                map.put("android:changeImageTransform:matrix", matrix);
            }
        }
    }

    /* renamed from: a */
    public final Animator mo2376a(ViewGroup viewGroup, atq atq, atq atq2) {
        boolean z;
        if (!(atq == null || atq2 == null)) {
            Rect rect = (Rect) atq.f2215a.get("android:changeImageTransform:bounds");
            Rect rect2 = (Rect) atq2.f2215a.get("android:changeImageTransform:bounds");
            if (!(rect == null || rect2 == null)) {
                Matrix matrix = (Matrix) atq.f2215a.get("android:changeImageTransform:matrix");
                Matrix matrix2 = (Matrix) atq2.f2215a.get("android:changeImageTransform:matrix");
                if (matrix == null && matrix2 == null) {
                    z = true;
                } else {
                    z = matrix != null && matrix.equals(matrix2);
                }
                if (rect.equals(rect2) && z) {
                    return null;
                }
                ImageView imageView = (ImageView) atq2.f2216b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    if (matrix == null) {
                        matrix = ast.f2141a;
                    }
                    if (matrix2 == null) {
                        matrix2 = ast.f2141a;
                    }
                    f2124w.set(imageView, matrix);
                    return ObjectAnimator.ofObject(imageView, f2124w, new ato(), matrix, matrix2);
                }
                return ObjectAnimator.ofObject(imageView, f2124w, f2123v, ast.f2141a, ast.f2141a);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final String[] mo2378a() {
        return f2122u;
    }

    /* renamed from: b */
    public final void mo2379b(atq atq) {
        m1931d(atq);
    }

    /* renamed from: a */
    public final void mo2377a(atq atq) {
        m1931d(atq);
    }
}
