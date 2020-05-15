package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: yfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yfy {

    /* renamed from: a */
    private final Map f53743a = new HashMap();

    /* renamed from: b */
    private final Map f53744b = new HashMap();

    /* renamed from: c */
    private boolean f53745c = false;

    /* renamed from: a */
    public final yfz mo30452a() {
        this.f53745c = true;
        return new yfz(this.f53744b);
    }

    /* renamed from: a */
    public final void mo30453a(caae caae, yhe yhe) {
        bmxy.m108601b(!this.f53745c, "BuildQuery.build() is already invoked.");
        caae caae2 = (caae) this.f53743a.get(caae.f172326b);
        if (caae2 == null) {
            this.f53743a.put(caae.f172326b, caae);
        } else {
            caae = caae2;
        }
        this.f53744b.put(caae, ((yhe) bmxu.m108565a((yhe) this.f53744b.get(caae), yhe.f53818a)).mo30493a(yhe));
    }
}
