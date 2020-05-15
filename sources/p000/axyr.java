package p000;

import java.util.Arrays;

/* renamed from: axyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axyr {

    /* renamed from: a */
    private final ayex f96794a;

    /* renamed from: b */
    private final String f96795b;

    public axyr(ayex ayex, String str) {
        this.f96794a = ayex;
        this.f96795b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axyr) {
            axyr axyr = (axyr) obj;
            return sdg.m34949a(this.f96795b, axyr.f96795b) && this.f96794a == axyr.f96794a;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f96795b, this.f96794a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f96794a);
        String str = this.f96795b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + str.length());
        sb.append("LoggableTag{");
        sb.append(valueOf);
        sb.append(",");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
