package p000;

import java.util.Arrays;

/* renamed from: hid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hid implements rjh, rjj {

    /* renamed from: a */
    public final String f19828a;

    public hid(String str) {
        this.f19828a = str;
    }

    /* renamed from: a */
    public static hic m14370a(String str) {
        return new hic(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hid) {
            return sdg.m34949a(this.f19828a, ((hid) obj).f19828a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19828a});
    }
}
