package p000;

import java.util.Arrays;

/* renamed from: eqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eqb {

    /* renamed from: a */
    public final String f15508a;

    /* renamed from: b */
    public final Long f15509b;

    public eqb(String str, Long l) {
        this.f15508a = str;
        this.f15509b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eqb) {
            eqb eqb = (eqb) obj;
            return bmxi.m108538a(this.f15508a, eqb.f15508a) && bmxi.m108538a(this.f15509b, eqb.f15509b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15508a, this.f15509b});
    }
}
