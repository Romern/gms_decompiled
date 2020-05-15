package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: brwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brwr extends bruh {

    /* renamed from: a */
    public final brue f143540a;

    /* renamed from: b */
    private final Object f143541b = new Object();

    /* renamed from: c */
    private final ConcurrentHashMap f143542c = new ConcurrentHashMap();

    public brwr(brue brue) {
        super(brun.I_AM_THE_RPC_LIB);
        this.f143540a = brue;
    }

    /* renamed from: a */
    public final chqp mo69980a(bruo bruo) {
        chqp chqp;
        chqp chqp2 = (chqp) this.f143542c.get(bruo);
        if (chqp2 != null) {
            return chqp2;
        }
        synchronized (this.f143541b) {
            if (!this.f143542c.containsKey(bruo)) {
                brwx brwx = new brwx(bruo, this.f143540a);
                bngs j = bngx.m109377j();
                j.mo67668c(brxh.m114841a(new brwo(this, bruo)));
                if (this.f143540a.mo69952i() != null) {
                    j.mo67668c(new brwu(this.f143540a.mo69952i(), this.f143540a.mo69946e()));
                }
                if (this.f143540a.mo69950h() != null) {
                    j.mo67668c(new brwa());
                    j.mo67668c(brxh.m114841a(new brwp(this)));
                } else {
                    j.mo67668c(new brwv());
                }
                j.mo67668c(brxh.m114841a(new brwq(this)));
                ArrayList arrayList = new ArrayList(j.mo67664a());
                Collections.reverse(arrayList);
                this.f143542c.put(bruo, chqx.m149438a(brwx, arrayList));
            }
            chqp = (chqp) this.f143542c.get(bruo);
        }
        return chqp;
    }
}
