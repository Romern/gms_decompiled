package p000;

import java.util.Arrays;

/* renamed from: aixi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aixi implements rjh, rjj {

    /* renamed from: a */
    public final String f69980a;

    /* renamed from: b */
    public final boolean f69981b;

    /* renamed from: c */
    public final int f69982c;

    /* renamed from: d */
    public final String f69983d = null;

    /* renamed from: e */
    public final String f69984e;

    public aixi(aixh aixh) {
        this.f69980a = aixh.f69976a;
        this.f69981b = aixh.f69977b;
        this.f69982c = aixh.f69979d;
        this.f69984e = aixh.f69978c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aixi) {
            aixi aixi = (aixi) obj;
            if (sdg.m34949a(this.f69980a, aixi.f69980a) && this.f69981b == aixi.f69981b) {
                String str = aixi.f69983d;
                return sdg.m34949a(null, null) && sdg.m34949a(this.f69984e, aixi.f69984e) && this.f69982c == aixi.f69982c;
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f69980a, Boolean.valueOf(this.f69981b), null, this.f69984e, Integer.valueOf(this.f69982c)});
    }
}
