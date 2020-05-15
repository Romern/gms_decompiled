package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* renamed from: blhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blhl {

    /* renamed from: a */
    public static final blhl f126540a = new blhl();

    /* renamed from: b */
    private final String f126541b = "";

    /* renamed from: c */
    private final Map f126542c = Collections.emptyMap();

    private blhl() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blhl) {
            blhl blhl = (blhl) obj;
            return bkwv.m106779a(this.f126541b, blhl.f126541b) && bkwv.m106779a(this.f126542c, blhl.f126542c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126542c, this.f126541b});
    }
}
