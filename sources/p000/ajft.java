package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: ajft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajft extends ahhb {
    /* renamed from: a */
    public final void mo36478a(Context context, Class cls, ahgz ahgz) {
        Class cls2;
        Object obj;
        if (cls.equals(aixb.class)) {
            ahgz.mo36476a(aixb.class, new aixb(context));
        } else if (cls.equals(ajeq.class)) {
            ahgz.mo36476a(ajeq.class, new ajeq(context));
        } else {
            if (cls.equals(sqv.class)) {
                cls2 = sqv.class;
                obj = srb.f45012a;
            } else if (cls.equals(aiwp.class)) {
                ahgz.mo36476a(aiwp.class, new aiwp(context));
                return;
            } else if (cls.equals(ajat.class)) {
                ahgz.mo36476a(ajat.class, new ajat(context));
                return;
            } else if (cls.equals(aiws.class)) {
                ahgz.mo36476a(aiws.class, new aiws(context));
                return;
            } else if (cls.equals(ajeb.class)) {
                ahgz.mo36476a(ajeb.class, new ajeb(context));
                return;
            } else if (cls.equals(ajgu.class)) {
                ahgz.mo36476a(ajgu.class, new ajgu(context));
                return;
            } else if (cls.equals(aiwq.class)) {
                ahgz.mo36476a(aiwq.class, new ajaz(context));
                return;
            } else if (cls.equals(aiyx.class)) {
                ahgz.mo36476a(aiyx.class, new aiyx(context));
                return;
            } else if (cls.equals(buqh.class)) {
                ahgz.mo36476a(buqh.class, buqh.m120234a("NearbyMessages"));
                return;
            } else if (cls.equals(ajej.class)) {
                ahgz.mo36476a(ajej.class, new ajej(context));
                return;
            } else if (cls.equals(ajeg.class)) {
                ahgz.mo36476a(ajeg.class, new ajeg(context));
                return;
            } else if (cls.equals(ajbn.class)) {
                ahgz.mo36476a(ajbn.class, new ajbn(context));
                return;
            } else if (cls.equals(aiyz.class)) {
                ahgz.mo36476a(aiyz.class, new aiyz(context));
                return;
            } else if (cls.equals(ajai.class)) {
                ahgz.mo36476a(ajai.class, new ajai(context));
                return;
            } else if (cls.equals(ajbd.class)) {
                ahgz.mo36476a(ajbd.class, new ajbd(context));
                return;
            } else if (cls.equals(ajed.class)) {
                ahgz.mo36476a(ajed.class, new ajed(context));
                return;
            } else if (cls.equals(aiyh.class)) {
                ahgz.mo36476a(aiyh.class, new aiyh(context));
                return;
            } else if (cls.equals(aiyr.class)) {
                ahgz.mo36476a(aiyr.class, new aiyr(context));
                return;
            } else if (cls.equals(ajaf.class)) {
                obj = new ajaf(context, null);
                cls2 = ajaf.class;
            } else if (cls.equals(aiya.class)) {
                ahgz.mo36476a(aiya.class, new aiya(context));
                return;
            } else if (cls.equals(afkl.class)) {
                ahgz.mo36476a(afkl.class, afkf.m53198a(context));
                return;
            } else if (cls.equals(behy.class)) {
                ahgz.mo36476a(behy.class, beff.m94940a(context).mo60653a());
                return;
            } else {
                return;
            }
            ahgz.mo36476a(cls2, obj);
        }
    }

    /* renamed from: a */
    public final void mo36479a(Class cls, Object obj) {
        if (cls.equals(aixb.class)) {
            aixb aixb = (aixb) obj;
            int i = Build.VERSION.SDK_INT;
            srn srn = ahfq.f67120a;
            aixb.f69970c.unregisterComponentCallbacks(aixb.f69969b);
            aixb.f69968a.clear();
        } else if (cls.equals(buqh.class)) {
            ((buqh) obj).mo72981a();
        } else if (cls.equals(ajbd.class)) {
            ((ajbd) obj).mo38440d();
        } else if (cls.equals(ajaf.class)) {
            ajaf ajaf = (ajaf) obj;
            srn srn2 = ahfq.f67120a;
            ajaf.mo38364b();
            aiyr aiyr = ajaf.f70223a;
            aiyq aiyq = ajaf.f70224b;
            aiyr.f70096g.mo72984b();
            aiyr.f70091b.remove(aiyq);
            ajaf.f70225c = true;
        } else if (cls.equals(ajbn.class)) {
            ajbn ajbn = (ajbn) obj;
            ajbn.f70333g.mo36464b();
            ajbn.f70330d.close();
        }
    }
}
