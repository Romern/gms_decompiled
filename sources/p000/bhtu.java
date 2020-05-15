package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: bhtu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhtu {

    /* renamed from: a */
    public final List f119573a;

    public bhtu(List list) {
        this.f119573a = list;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bhtu) && bhxi.m101705a(((bhtu) obj).f119573a, this.f119573a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119573a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f119573a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("BeaconScan{sightings=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
