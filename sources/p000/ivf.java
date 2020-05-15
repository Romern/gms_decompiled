package p000;

import android.util.SparseArray;
import java.util.Arrays;

/* renamed from: ivf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ivf {

    /* renamed from: a */
    public static final SparseArray f21859a = new SparseArray();

    /* renamed from: b */
    public static final SparseArray f21860b = new SparseArray();

    /* renamed from: c */
    public static final SparseArray f21861c = new SparseArray();

    /* renamed from: d */
    public final int f21862d;

    /* renamed from: e */
    public final int f21863e;

    /* renamed from: f */
    public final int f21864f;

    static {
        f21859a.put(1, "absent");
        f21859a.put(0, "present");
        f21859a.put(2, "unknown");
        f21859a.put(3, "secondary");
        f21859a.put(4, "background");
        f21860b.put(10, "enabled");
        f21860b.put(11, "disabled");
        f21860b.put(12, "unknown");
        f21861c.put(20, "enabled");
        f21861c.put(21, "disabled");
        f21861c.put(22, "unsupported");
    }

    public ivf(int i, int i2, int i3) {
        boolean z = true;
        sdo.m34974b(f21859a.get(i) != null);
        sdo.m34974b(f21860b.get(i2) != null);
        sdo.m34974b(f21861c.get(i3) == null ? false : z);
        this.f21862d = i;
        this.f21863e = i2;
        this.f21864f = i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ivf) {
            ivf ivf = (ivf) obj;
            return this.f21862d == ivf.f21862d && this.f21863e == ivf.f21863e && this.f21864f == ivf.f21864f;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f21862d), Integer.valueOf(this.f21863e), Integer.valueOf(this.f21864f)});
    }

    public final String toString() {
        return String.format("{user_present=%d, screen_lock=%d, trust_agent=%d}", Integer.valueOf(this.f21862d), Integer.valueOf(this.f21863e), Integer.valueOf(this.f21864f));
    }
}
