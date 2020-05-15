package p000;

import java.util.Objects;

/* renamed from: cbag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbag {

    /* renamed from: a */
    private final Class f176473a;

    /* renamed from: b */
    private final String f176474b = null;

    private cbag(Class cls) {
        this.f176473a = cls;
    }

    /* renamed from: a */
    public static cbag m127657a(Class cls) {
        bmxy.m108581a(cls);
        return new cbag(cls);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbag) {
            cbag cbag = (cbag) obj;
            if (Objects.equals(this.f176473a, cbag.f176473a)) {
                String str = cbag.f176474b;
                if (Objects.equals(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Objects.hashCode(this.f176473a) ^ 1000003) * 1000003) ^ Objects.hashCode(null);
    }

    public final String toString() {
        return this.f176473a.getCanonicalName();
    }
}
