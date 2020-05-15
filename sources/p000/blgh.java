package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* renamed from: blgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blgh {

    /* renamed from: a */
    public static final blgh f126427a = new blgh();

    /* renamed from: b */
    private Map f126428b = Collections.emptyMap();

    private blgh() {
    }

    /* renamed from: b */
    public static blgg m107126b() {
        return new blgg();
    }

    /* renamed from: a */
    public final Map mo66481a() {
        return Collections.unmodifiableMap(this.f126428b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof blgh) && bkwv.m106779a(this.f126428b, ((blgh) obj).f126428b);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126428b});
    }

    public blgh(blgg blgg) {
        this.f126428b = Collections.unmodifiableMap(blgg.f126426a);
    }
}
