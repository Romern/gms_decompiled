package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: blge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blge {

    /* renamed from: a */
    public static final blge f126421a = new blge();

    /* renamed from: b */
    private List f126422b = Collections.emptyList();

    private blge() {
    }

    /* renamed from: b */
    public static blgd m107124b() {
        return new blgd();
    }

    /* renamed from: a */
    public final List mo66478a() {
        return Collections.unmodifiableList(this.f126422b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof blge) && bkwv.m106779a(this.f126422b, ((blge) obj).f126422b);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126422b});
    }

    public blge(blgd blgd) {
        this.f126422b = Collections.unmodifiableList(blgd.f126420a);
    }
}
