package p000;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: qqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qqg implements rjf {

    /* renamed from: a */
    private final Account f41946a;

    public qqg(qqf qqf) {
        this.f41946a = qqf.f41945a;
    }

    /* renamed from: a */
    public static qqf m32654a() {
        return new qqf();
    }

    /* renamed from: b */
    public final Account mo24205b() {
        return this.f41946a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qqg) {
            return bmxi.m108538a(this.f41946a, ((qqg) obj).f41946a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41946a});
    }
}
