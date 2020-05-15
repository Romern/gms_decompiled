package p000;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: yrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yrl implements bmxj {

    /* renamed from: a */
    private final zrd f54492a;

    /* renamed from: b */
    private final Map f54493b = new HashMap();

    public yrl(zrd zrd) {
        this.f54492a = zrd;
    }

    /* renamed from: a */
    public final caae apply(String str) {
        if (this.f54493b.containsKey(str)) {
            return (caae) this.f54493b.get(str);
        }
        try {
            caae a = this.f54492a.mo31377a(str);
            this.f54493b.put(str, a);
            return a;
        } catch (IOException e) {
            return null;
        }
    }
}
