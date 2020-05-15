package p000;

import android.content.Context;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: afxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afxj implements cayy {

    /* renamed from: a */
    private final cijl f64918a;

    /* renamed from: b */
    private final cijl f64919b;

    public afxj(cijl cijl, cijl cijl2) {
        this.f64918a = cijl;
        this.f64919b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        cijl cijl = this.f64918a;
        cijl cijl2 = this.f64919b;
        aeet a = aeet.m51742a();
        a.mo34098a((Context) cijl.mo6445a());
        a.mo34101a(afxh.f64917a);
        bnha h = bnhe.m109414h();
        Iterator it = EnumSet.complementOf(EnumSet.of(afyd.UNKNOWN)).iterator();
        while (it.hasNext()) {
            afyd afyd = (afyd) it.next();
            h.mo67695b(afyd, aeeg.m51722a("com.google.android.gms.mdisync.service.MdiSyncBackgroundTaskService", afyf.m53667a(afyd, afye.PERIODIC).mo35063c(), afyf.m53667a(afyd, afye.ONEOFF).mo35063c()));
        }
        a.mo34103a(h.mo67618b());
        a.mo34102a(new afxg(cijl));
        bqgj b = snp.m35704b(10);
        cazf.m127593a(b, "Cannot return null from a non-@Nullable @Provides method");
        a.mo34105a(b);
        a.mo34099a(aytf.m84780b());
        a.mo34104a("mdisync");
        a.mo34100a((beju) cijl2.mo6445a());
        a.mo34096a(new afxi());
        aecs a2 = a.mo34095a(afrj.f64634l);
        cazf.m127593a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
