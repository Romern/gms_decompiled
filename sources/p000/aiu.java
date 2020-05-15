package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: aiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiu {

    /* renamed from: a */
    private static final ThreadLocal f618a = new ThreadLocal();

    /* renamed from: b */
    private static final ThreadLocal f619b = new ThreadLocal();

    /* renamed from: a */
    public static void m838a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        Matrix matrix = (Matrix) f618a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f618a.set(matrix);
        } else {
            matrix.reset();
        }
        m839a(viewGroup, view, matrix);
        RectF rectF = (RectF) f619b.get();
        if (rectF == null) {
            rectF = new RectF();
            f619b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a */
    private static void m839a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m839a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
