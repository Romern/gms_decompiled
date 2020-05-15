package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* renamed from: blhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blhi {

    /* renamed from: a */
    public static final blhi f126528a = new blhi();

    /* renamed from: b */
    public String f126529b = "";

    /* renamed from: c */
    private String f126530c = "";

    /* renamed from: d */
    private Map f126531d = Collections.emptyMap();

    private blhi() {
    }

    /* renamed from: a */
    public static blhh m107173a() {
        return new blhh();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blhi) {
            blhi blhi = (blhi) obj;
            return bkwv.m106779a(this.f126530c, blhi.f126530c) && bkwv.m106779a(this.f126531d, blhi.f126531d) && bkwv.m106779a(this.f126529b, blhi.f126529b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126531d, this.f126530c, this.f126529b});
    }

    public blhi(blhh blhh) {
        this.f126530c = blhh.f126525a;
        this.f126531d = Collections.unmodifiableMap(blhh.f126526b);
        this.f126529b = blhh.f126527c;
    }
}
