package p000;

import com.google.android.gms.maps.model.LatLng;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: bhzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhzt {

    /* renamed from: a */
    public final String f119990a;

    /* renamed from: b */
    public final LatLng f119991b;

    /* renamed from: c */
    public final float f119992c;

    /* renamed from: d */
    public final Collection f119993d;

    /* renamed from: e */
    public final int f119994e;

    /* renamed from: f */
    public final int f119995f;

    /* renamed from: g */
    public final String f119996g;

    /* renamed from: h */
    public final boolean f119997h;

    public bhzt(LatLng latLng, float f) {
        this(latLng, f, -1, 0, null, false, Collections.emptySet());
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj instanceof bhzt) {
            bhzt bhzt = (bhzt) obj;
            if ((this.f119996g != null || bhzt.f119996g == null) && this.f119990a.equals(bhzt.f119990a) && this.f119991b.equals(bhzt.f119991b) && this.f119992c == bhzt.f119992c && this.f119994e == bhzt.f119994e && this.f119995f == bhzt.f119995f && ((((str = this.f119996g) == null && bhzt.f119996g == null) || str.equals(bhzt.f119996g)) && this.f119997h == bhzt.f119997h && this.f119993d.equals(bhzt.f119993d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119991b, Float.valueOf(this.f119992c), Integer.valueOf(this.f119995f), Integer.valueOf(this.f119994e), this.f119996g, Boolean.valueOf(this.f119997h), this.f119993d});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("id", this.f119990a);
        a.mo25396a("latLng", this.f119991b);
        a.mo25396a("radiusMeters", Float.valueOf(this.f119992c));
        a.mo25396a("loiteringTimeMillis", Integer.valueOf(this.f119994e));
        a.mo25396a("radiusType", Integer.valueOf(this.f119995f));
        a.mo25396a("chainName", this.f119996g);
        a.mo25396a("hasBeacon", Boolean.valueOf(this.f119997h));
        a.mo25396a("place types", this.f119993d);
        return a.toString();
    }

    public bhzt(LatLng latLng, float f, int i, int i2, String str, boolean z, Collection collection) {
        this.f119990a = sqd.m35968b(ByteBuffer.allocate(28).putDouble(latLng.f79894a).putDouble(latLng.f79895b).putFloat(f).putInt(i).putInt(i2).array());
        this.f119992c = f;
        this.f119991b = latLng;
        this.f119994e = i;
        this.f119995f = i2;
        this.f119996g = str;
        this.f119997h = z;
        this.f119993d = collection;
    }
}
