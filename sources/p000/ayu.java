package p000;

import java.util.Arrays;

/* renamed from: ayu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayu {

    /* renamed from: a */
    public final Object f2600a;

    /* renamed from: b */
    public final Throwable f2601b;

    public ayu(Object obj) {
        this.f2600a = obj;
        this.f2601b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ayu) {
            ayu ayu = (ayu) obj;
            Object obj2 = this.f2600a;
            if (obj2 != null && obj2.equals(ayu.f2600a)) {
                return true;
            }
            Throwable th = this.f2601b;
            if (!(th == null || ayu.f2601b == null)) {
                return th.toString().equals(this.f2601b.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2600a, this.f2601b});
    }

    public ayu(Throwable th) {
        this.f2601b = th;
        this.f2600a = null;
    }
}
