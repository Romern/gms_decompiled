package p000;

import android.graphics.Rect;

/* renamed from: afn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afn {
    /* renamed from: a */
    public static void m680a(Rect rect, Rect rect2) {
        if (rect2.width() < rect2.height()) {
            rect.setEmpty();
        } else {
            rect.set(rect2.left, rect2.top, rect2.left + rect2.height(), rect2.bottom);
        }
    }

    /* renamed from: b */
    public static void m683b(Rect rect, Rect rect2) {
        if (rect2.width() < rect2.height()) {
            rect.set(rect2);
        } else {
            rect.set(rect2.left + rect2.height(), rect2.top, rect2.right, rect2.bottom);
        }
    }

    /* renamed from: c */
    public static void m684c(Rect rect, Rect rect2) {
        rect.set(rect2.left, rect2.top, rect2.right, (rect2.top + rect2.bottom) / 2);
    }

    /* renamed from: d */
    public static void m685d(Rect rect, Rect rect2) {
        rect.set(rect2.left, (rect2.top + rect2.bottom) / 2, rect2.right, rect2.bottom);
    }

    /* renamed from: e */
    public static void m686e(Rect rect, Rect rect2) {
        int min = Math.min(rect2.width(), rect2.height()) / 2;
        rect.set(rect2.centerX() - min, rect2.centerY() - min, rect2.centerX() + min, rect2.centerY() + min);
    }

    /* renamed from: f */
    public static void m687f(Rect rect, Rect rect2) {
        if (!rect.isEmpty()) {
            int centerX = rect.centerX();
            int centerY = rect.centerY();
            if (!rect.intersect(rect2)) {
                rect.setEmpty();
                return;
            }
            m686e(rect, rect);
            int centerX2 = centerX - rect.centerX();
            int centerY2 = centerY - rect.centerY();
            rect.offset(centerX2, centerY2);
            if (!rect2.contains(rect)) {
                rect.offset(-centerX2, -centerY2);
            }
        }
    }

    /* renamed from: a */
    public static void m681a(Rect rect, Rect rect2, float f) {
        rect.set(rect2);
        float f2 = 0.5f - (f / 2.0f);
        rect.inset((int) (((float) rect.width()) * f2), (int) (((float) rect.height()) * f2));
    }

    /* renamed from: a */
    public static boolean m682a(Rect rect) {
        int width = rect.width();
        float height = (float) rect.height();
        return ((float) width) > height + height;
    }
}
