package p000;

import java.util.Map;
import java.util.function.Predicate;

/* renamed from: lhl */
final /* synthetic */ class lhl implements Predicate {

    /* renamed from: a */
    private final lhn f26110a;

    public lhl(lhn lhn) {
        this.f26110a = lhn;
    }

    public final boolean test(Object obj) {
        lhn lhn = this.f26110a;
        String str = (String) ((Map.Entry) obj).getKey();
        if (str.startsWith("credential_save_rejection_count_for_") && lhn.f26113g.getInt(str, 0) >= lhi.f26105c) {
            String substring = str.substring(36);
            boan boan = boan.f132471e;
            bmxy.m108581a(substring);
            boam boam = (boam) boan;
            CharSequence a = boam.mo68785a(substring);
            if (boam.f132467b.mo68775b(a.length())) {
                int i = 0;
                while (i < a.length()) {
                    boah boah = boam.f132467b;
                    char charAt = a.charAt(i);
                    if (charAt <= 127 && boah.f132460g[charAt] != -1) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
