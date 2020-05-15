package p000;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: pgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pgo {

    /* renamed from: a */
    public final long f39085a;

    /* renamed from: b */
    public final JSONObject f39086b;

    /* renamed from: c */
    private final int f39087c = 0;

    /* renamed from: d */
    private final boolean f39088d = false;

    public pgo(long j, JSONObject jSONObject) {
        this.f39085a = j;
        this.f39086b = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pgo) {
            pgo pgo = (pgo) obj;
            if (this.f39085a == pgo.f39085a) {
                int i = pgo.f39087c;
                boolean z = pgo.f39088d;
                if (sdg.m34949a(this.f39086b, pgo.f39086b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f39085a), 0, false, this.f39086b});
    }
}
