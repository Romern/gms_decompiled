package p000;

import android.graphics.Rect;

/* renamed from: rm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1328rm {
    /* renamed from: a */
    public static int m20090a(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: b */
    public static int m20094b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    /* renamed from: c */
    private static boolean m20095c(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: a */
    public static int m20091a(int i, Rect rect, Rect rect2) {
        int i2;
        if (i == 17) {
            i2 = rect.left - rect2.right;
        } else if (i == 33) {
            i2 = rect.top - rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left - rect.right;
        } else if (i == 130) {
            i2 = rect2.top - rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r10.right <= r12.left) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r10.top >= r12.bottom) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r10.left >= r12.right) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r10.bottom <= r12.top) goto L_0x0041;
     */
    /* renamed from: a */
    public static boolean m20092a(int i, Rect rect, Rect rect2, Rect rect3) {
        int i2;
        boolean c = m20095c(i, rect, rect2);
        if (m20095c(i, rect, rect3) || !c) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        if (!(i == 17 || i == 66)) {
            int a = m20091a(i, rect, rect2);
            if (i == 17) {
                i2 = rect.left - rect3.left;
            } else if (i == 33) {
                i2 = rect.top - rect3.top;
            } else if (i == 66) {
                i2 = rect3.right - rect.right;
            } else if (i == 130) {
                i2 = rect3.bottom - rect.bottom;
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            return a < Math.max(1, i2);
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m20093a(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            return (rect.right > rect2.right || rect.left >= rect2.right) && rect.left > rect2.left;
        }
        if (i == 33) {
            return (rect.bottom > rect2.bottom || rect.top >= rect2.bottom) && rect.top > rect2.top;
        }
        if (i == 66) {
            return (rect.left < rect2.left || rect.right <= rect2.left) && rect.right < rect2.right;
        }
        if (i == 130) {
            return (rect.top < rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }
}
