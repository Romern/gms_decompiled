package p000;

import java.util.Arrays;

/* renamed from: veb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class veb implements ved {

    /* renamed from: a */
    public final boolean f49106a;

    public veb(boolean z) {
        this.f49106a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return sdg.m34949a(Boolean.valueOf(this.f49106a), Boolean.valueOf(((veb) obj).f49106a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f49106a)});
    }
}
