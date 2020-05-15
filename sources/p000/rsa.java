package p000;

import java.util.Arrays;

/* renamed from: rsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rsa {

    /* renamed from: a */
    public final sgk f43568a;

    /* renamed from: b */
    public final boolean f43569b;

    public rsa(sgk sgk, boolean z) {
        this.f43568a = sgk;
        this.f43569b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rsa) {
            rsa rsa = (rsa) obj;
            if (!sdg.m34949a(rsa.f43568a, this.f43568a) || rsa.f43569b != this.f43569b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43568a, Boolean.valueOf(this.f43569b)});
    }
}
