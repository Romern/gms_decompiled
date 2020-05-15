package p000;

import java.util.Arrays;

/* renamed from: doj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class doj {

    /* renamed from: a */
    public final bxco f13704a;

    /* renamed from: b */
    public final int f13705b;

    public doj(bxco bxco, int i) {
        if (bxco != bxco.UNKNOWN_CONTEXT_NAME) {
            this.f13704a = bxco;
            this.f13705b = 1;
            return;
        }
        this.f13704a = bxco.UNKNOWN_CONTEXT_NAME;
        this.f13705b = i;
    }

    /* renamed from: a */
    public static doj m8942a(bxco bxco) {
        return new doj(bxco, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof doj) {
            doj doj = (doj) obj;
            if (doj.f13705b == this.f13705b && doj.f13704a == this.f13704a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13705b - 1), Integer.valueOf(this.f13704a.f162973bD)});
    }
}
