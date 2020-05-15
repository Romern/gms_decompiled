package p000;

import java.util.Arrays;

/* renamed from: eqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eqt {

    /* renamed from: a */
    public final Long f15535a;

    public eqt(Long l) {
        this.f15535a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eqt) {
            return bmxi.m108538a(this.f15535a, ((eqt) obj).f15535a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15535a});
    }
}
