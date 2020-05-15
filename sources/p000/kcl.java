package p000;

import java.util.Arrays;

/* renamed from: kcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kcl {

    /* renamed from: a */
    public final kck f23818a;

    /* renamed from: b */
    private final String f23819b;

    public kcl(kck kck, String str) {
        this.f23818a = kck;
        this.f23819b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kcl kcl = (kcl) obj;
            return bmxi.m108538a(this.f23818a, kcl.f23818a) && bmxi.m108538a(this.f23819b, kcl.f23819b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23818a, this.f23819b});
    }
}
