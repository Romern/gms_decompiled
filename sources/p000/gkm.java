package p000;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: gkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gkm {

    /* renamed from: a */
    public final String f18410a;

    /* renamed from: b */
    public final String f18411b;

    /* renamed from: c */
    public final boolean f18412c;

    /* renamed from: d */
    public final boolean f18413d;

    /* renamed from: e */
    public final long f18414e;

    public gkm(String str, String str2, boolean z, boolean z2, long j) {
        sdo.m34977c(str);
        this.f18410a = str;
        sdo.m34977c(str2);
        this.f18411b = str2;
        this.f18412c = z;
        this.f18413d = z2;
        this.f18414e = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gkm) {
            gkm gkm = (gkm) obj;
            return TextUtils.equals(this.f18410a, gkm.f18410a) && TextUtils.equals(this.f18411b, gkm.f18411b) && this.f18412c == gkm.f18412c && this.f18413d == gkm.f18413d && this.f18414e == gkm.f18414e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18410a, this.f18411b, Boolean.valueOf(this.f18412c), Boolean.valueOf(this.f18413d), Long.valueOf(this.f18414e)});
    }
}
