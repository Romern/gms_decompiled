package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: blhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blhk {

    /* renamed from: a */
    public static final blhk f126537a = new blhk();

    /* renamed from: b */
    private final String f126538b = "";

    /* renamed from: c */
    private final List f126539c = Collections.emptyList();

    private blhk() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blhk) {
            blhk blhk = (blhk) obj;
            return bkwv.m106779a(this.f126538b, blhk.f126538b) && bkwv.m106779a(this.f126539c, blhk.f126539c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126539c, this.f126538b});
    }
}
