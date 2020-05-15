package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: blhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blhv {

    /* renamed from: a */
    public static final blhv f126583a = new blhv();

    /* renamed from: b */
    public int f126584b = 0;

    /* renamed from: c */
    private List f126585c = Collections.emptyList();

    private blhv() {
    }

    /* renamed from: c */
    public static blhu m107183c() {
        return new blhu();
    }

    /* renamed from: a */
    public final int mo66562a() {
        return this.f126585c.size();
    }

    /* renamed from: b */
    public final List mo66563b() {
        return Collections.unmodifiableList(this.f126585c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blhv) {
            blhv blhv = (blhv) obj;
            return bkwv.m106779a(Integer.valueOf(this.f126584b), Integer.valueOf(blhv.f126584b)) && bkwv.m106779a(this.f126585c, blhv.f126585c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126585c, Integer.valueOf(this.f126584b)});
    }

    public blhv(blhu blhu) {
        this.f126584b = blhu.f126581a;
        this.f126585c = Collections.unmodifiableList(blhu.f126582b);
    }
}
