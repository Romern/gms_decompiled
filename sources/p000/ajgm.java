package p000;

import java.util.Arrays;

/* renamed from: ajgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajgm {

    /* renamed from: a */
    public final ahfv f70586a;

    /* renamed from: b */
    public final byyo f70587b;

    public ajgm(ahfv ahfv, byyo byyo) {
        this.f70586a = ahfv;
        this.f70587b = byyo;
    }

    /* renamed from: a */
    public final String mo38614a() {
        String valueOf = String.valueOf(this.f70587b.f168983c);
        String valueOf2 = String.valueOf(this.f70586a.mo36407a());
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajgm) {
            ajgm ajgm = (ajgm) obj;
            return sdg.m34949a(this.f70586a, ajgm.f70586a) && sdg.m34949a(this.f70587b, ajgm.f70587b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f70586a, this.f70587b});
    }

    public final String toString() {
        return String.format("AdvertiseTokenParams{tokenId=%s, tokenParams=%s}", this.f70586a, this.f70587b);
    }
}
