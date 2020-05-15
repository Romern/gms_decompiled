package p000;

import java.util.Arrays;

/* renamed from: aury */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aury {

    /* renamed from: a */
    public final boolean f92392a;

    /* renamed from: b */
    public final boolean f92393b;

    public aury(bedl bedl) {
        this.f92392a = bedl.f106975a;
        this.f92393b = bedl.f106976b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aury) {
            aury aury = (aury) obj;
            return this.f92392a == aury.f92392a && this.f92393b == aury.f92393b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f92392a), Boolean.valueOf(this.f92393b)});
    }
}
