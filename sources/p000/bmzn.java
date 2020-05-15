package p000;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* renamed from: bmzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmzn {
    /* renamed from: a */
    public static bmzi m108681a(bmzi bmzi) {
        if ((bmzi instanceof bmzl) || (bmzi instanceof bmzk)) {
            return bmzi;
        }
        return bmzi instanceof Serializable ? new bmzk(bmzi) : new bmzl(bmzi);
    }

    /* renamed from: a */
    public static bmzi m108682a(bmzi bmzi, long j, TimeUnit timeUnit) {
        return new bmzj(bmzi, j, timeUnit);
    }

    /* renamed from: a */
    public static bmzi m108683a(Object obj) {
        return new bmzm(obj);
    }
}
