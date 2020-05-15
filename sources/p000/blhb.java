package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: blhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blhb {

    /* renamed from: a */
    public static final blhb f126492a = new blhb();

    /* renamed from: b */
    public int f126493b = 0;

    /* renamed from: c */
    public List f126494c = Collections.emptyList();

    /* renamed from: d */
    public String f126495d = "";

    private blhb() {
    }

    /* renamed from: d */
    public static blha m107158d() {
        return new blha();
    }

    /* renamed from: a */
    public final int mo66522a() {
        return this.f126494c.size();
    }

    /* renamed from: b */
    public final List mo66523b() {
        return Collections.unmodifiableList(this.f126494c);
    }

    /* renamed from: c */
    public final blha mo66524c() {
        return new blha(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blhb) {
            blhb blhb = (blhb) obj;
            return bkwv.m106779a(Integer.valueOf(this.f126493b), Integer.valueOf(blhb.f126493b)) && bkwv.m106779a(this.f126494c, blhb.f126494c) && bkwv.m106779a(this.f126495d, blhb.f126495d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126495d, this.f126494c, Integer.valueOf(this.f126493b)});
    }

    public blhb(blha blha) {
        this.f126493b = blha.f126489a;
        this.f126494c = Collections.unmodifiableList(blha.f126490b);
        this.f126495d = blha.f126491c;
    }
}
