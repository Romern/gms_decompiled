package p000;

import com.google.firebase.auth.api.model.MfaInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: brqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brqd implements brpk {

    /* renamed from: a */
    public String f143155a;

    /* renamed from: b */
    public String f143156b;

    /* renamed from: c */
    public boolean f143157c;

    /* renamed from: d */
    public long f143158d;

    /* renamed from: e */
    public List f143159e;

    /* renamed from: f */
    public String f143160f;

    /* renamed from: a */
    public final bxxk mo69763a() {
        return (bxxk) bkke.f124516i.mo74142c(7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69764a(bxxc bxxc) {
        if (bxxc instanceof bkke) {
            bkke bkke = (bkke) bxxc;
            stm.m36300b(bkke.f124522e);
            stm.m36300b(bkke.f124519b);
            this.f143155a = stm.m36300b(bkke.f124518a);
            this.f143156b = stm.m36300b(bkke.f124520c);
            this.f143157c = bkke.f124523f;
            this.f143158d = bkke.f124521d;
            this.f143159e = new ArrayList();
            bxwc bxwc = bkke.f124525h;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                this.f143159e.add(MfaInfo.m118902a((bkll) bxwc.get(i)));
            }
            this.f143160f = bkke.f124524g;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of EmailLinkSigninResponse.");
    }
}
