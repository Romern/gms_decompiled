package p000;

import java.util.List;

/* renamed from: zgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zgq extends zix {

    /* renamed from: d */
    private final String f55035d;

    public zgq(zgf zgf, List list, String str) {
        super(zgf, list, false);
        this.f55035d = str;
    }

    /* renamed from: a */
    public final boolean mo19158a(caae caae) {
        if ((caae.f172325a & 32) == 0) {
            return false;
        }
        String str = this.f55035d;
        caaq caaq = caae.f172331g;
        if (caaq == null) {
            caaq = caaq.f172356h;
        }
        if (str.equals(caaq.f172359b)) {
            return true;
        }
        return false;
    }
}
