package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: avww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avww implements rjh {

    /* renamed from: a */
    public final String f94050a;

    /* renamed from: b */
    public final String f94051b;

    /* renamed from: c */
    public final List f94052c;

    public avww(String str, String str2, List list) {
        this.f94050a = str;
        this.f94051b = str2;
        this.f94052c = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avww) {
            avww avww = (avww) obj;
            return sdg.m34949a(this.f94051b, avww.f94051b) && sdg.m34949a(this.f94050a, avww.f94050a) && sdg.m34949a(this.f94052c, avww.f94052c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f94051b, this.f94050a, this.f94052c});
    }
}
