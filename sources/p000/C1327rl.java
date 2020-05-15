package p000;

import android.graphics.Rect;
import java.util.Comparator;

/* renamed from: rl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1327rl implements Comparator {

    /* renamed from: a */
    private final Rect f26928a = new Rect();

    /* renamed from: b */
    private final Rect f26929b = new Rect();

    /* renamed from: c */
    private final boolean f26930c;

    public C1327rl(boolean z) {
        this.f26930c = z;
    }

    public final int compare(Object obj, Object obj2) {
        Rect rect = this.f26928a;
        Rect rect2 = this.f26929b;
        ((C1301qm) obj).mo15753a(rect);
        ((C1301qm) obj2).mo15753a(rect2);
        if (rect.top < rect2.top) {
            return -1;
        }
        if (rect.top > rect2.top) {
            return 1;
        }
        if (rect.left >= rect2.left) {
            if (rect.left <= rect2.left) {
                if (rect.bottom < rect2.bottom) {
                    return -1;
                }
                if (rect.bottom > rect2.bottom) {
                    return 1;
                }
                if (rect.right >= rect2.right) {
                    if (rect.right <= rect2.right) {
                        return 0;
                    }
                    if (this.f26930c) {
                        return -1;
                    }
                    return 1;
                } else if (this.f26930c) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (this.f26930c) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f26930c) {
            return 1;
        } else {
            return -1;
        }
    }
}
