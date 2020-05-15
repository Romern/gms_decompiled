package p000;

import java.util.Arrays;

/* renamed from: esr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class esr {

    /* renamed from: a */
    public final String f15638a;

    private esr(String str) {
        this.f15638a = str;
    }

    /* renamed from: a */
    public static esr m11103a(String str) {
        if (str == null) {
            return new esr("");
        }
        return new esr(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof esr) {
            return this.f15638a.equals(((esr) obj).f15638a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15638a});
    }
}
