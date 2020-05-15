package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: blgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blgo {

    /* renamed from: a */
    public static final blgo f126450a = new blgo();

    /* renamed from: b */
    public String f126451b = "";

    /* renamed from: c */
    public boolean f126452c = false;

    /* renamed from: d */
    private List f126453d = Collections.emptyList();

    private blgo() {
    }

    /* renamed from: b */
    public static blgn m107143b() {
        return new blgn();
    }

    /* renamed from: a */
    public final List mo66501a() {
        return Collections.unmodifiableList(this.f126453d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blgo) {
            blgo blgo = (blgo) obj;
            return bkwv.m106779a(this.f126453d, blgo.f126453d) && bkwv.m106779a(this.f126451b, blgo.f126451b) && bkwv.m106779a(Boolean.valueOf(this.f126452c), Boolean.valueOf(blgo.f126452c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126453d, this.f126451b, Boolean.valueOf(this.f126452c)});
    }

    public blgo(blgn blgn) {
        this.f126453d = Collections.unmodifiableList(blgn.f126447a);
        this.f126451b = blgn.f126448b;
        this.f126452c = blgn.f126449c;
    }
}
