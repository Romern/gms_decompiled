package p000;

import java.util.Arrays;

/* renamed from: ansb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ansb {

    /* renamed from: a */
    String f77569a = "";

    /* renamed from: b */
    String f77570b = "";

    /* renamed from: c */
    String f77571c = "";

    /* renamed from: d */
    String f77572d = "";

    public final boolean equals(Object obj) {
        if (!(obj instanceof ansb)) {
            return super.equals(obj);
        }
        ansb ansb = (ansb) obj;
        return sdg.m34949a(this.f77569a, ansb.f77569a) && sdg.m34949a(this.f77570b, ansb.f77570b) && sdg.m34949a(this.f77571c, ansb.f77571c) && sdg.m34949a(this.f77572d, ansb.f77572d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f77569a, this.f77570b, this.f77571c, this.f77572d});
    }

    public final String toString() {
        return String.format("Annotations[longText=%s text=%s, shortText=%s, bubbleText=%s]", this.f77569a, this.f77570b, this.f77571c, this.f77572d);
    }
}
