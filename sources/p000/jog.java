package p000;

import java.util.Arrays;

/* renamed from: jog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jog {

    /* renamed from: a */
    public final int f22933a;

    /* renamed from: b */
    public final int f22934b;

    /* renamed from: c */
    public final int f22935c;

    public jog(String str, String str2, int i) {
        this.f22933a = str.hashCode();
        this.f22934b = str2.hashCode();
        this.f22935c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jog) {
            jog jog = (jog) obj;
            if (this.f22934b == jog.f22934b && this.f22933a == jog.f22933a && this.f22935c == jog.f22935c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f22933a), Integer.valueOf(this.f22934b), Integer.valueOf(this.f22935c)});
    }
}
