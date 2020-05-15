package p000;

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* renamed from: rau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rau extends rle {

    /* renamed from: a */
    private final qwo f42572a;

    public rau(qwo qwo, rkb rkb) {
        super(qws.f42331a, rkb);
        this.f42572a = qwo;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        super.mo17716a((rkk) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        qwo qwo;
        raw raw = (raw) rjd;
        rat rat = new rat(this);
        try {
            qwo qwo2 = this.f42572a;
            qws qws = qwo2.f42317a;
            rjo rjo = qws.f42331a;
            Iterator it = qws.f42350r.iterator();
            while (true) {
                qwo = null;
                if (!it.hasNext()) {
                    Iterator it2 = qws.f42335q.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            qwo = qwo2;
                            break;
                        }
                        qwo2 = ((qwn) it2.next()).mo24320a();
                        if (qwo2 == null) {
                            break;
                        }
                    }
                } else {
                    qwo2 = ((qwn) it.next()).mo24320a();
                    if (qwo2 == null) {
                        break;
                    }
                }
            }
            if (qwo == null) {
                rat.mo24340a(Status.f30107a);
            } else if (qwo.f42317a.f42349p.mo24332a(qwo.f42320d, qwo.f42321e, ((cagi) qwo.f42325i.f164949b).f173102e)) {
                try {
                    LogEventParcelable a = qwo.mo24321a();
                    cagi cagi = a.f30039j;
                    bxvd bxvd = (bxvd) cagi.mo74142c(5);
                    bxvd.mo73625a((bxvk) cagi);
                    bxvf bxvf = (bxvf) bxvd;
                    if (a.f30040k != null) {
                        if (a.f30039j.f173106i.mo73744a() == 0) {
                            bxtx a2 = bxtx.m123261a(a.f30040k.mo14930a());
                            if (bxvf.f164950c) {
                                bxvf.mo74035c();
                                bxvf.f164950c = false;
                            }
                            cagi cagi2 = (cagi) bxvf.f164949b;
                            cagi cagi3 = cagi.f173096t;
                            a2.getClass();
                            cagi2.f173098a |= 1024;
                            cagi2.f173106i = a2;
                        }
                    }
                    a.f30039j = (cagi) bxvf.mo74062i();
                    a.f30031b = a.f30039j.mo73642k();
                    ((rbj) raw.mo25289B()).mo24429a(rat, a);
                } catch (RuntimeException e) {
                    Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
                    mo9481a(new Status(10, "MessageProducer"));
                }
            } else {
                mo17716a((rkk) Status.f30107a);
            }
        } catch (RuntimeException e2) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.EventModifier ", e2);
            mo9481a(new Status(10, "EventModifier"));
        }
    }
}
