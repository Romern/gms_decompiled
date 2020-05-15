package p000;

import java.util.Arrays;

/* renamed from: hji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hji {

    /* renamed from: a */
    private final String f19889a;

    /* renamed from: b */
    private final String f19890b;

    public hji(String str, String str2) {
        this.f19890b = str2;
        this.f19889a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hji) {
            hji hji = (hji) obj;
            if (!sdg.m34949a(this.f19889a, hji.f19889a) || !sdg.m34949a(this.f19890b, hji.f19890b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19889a, this.f19890b});
    }
}
