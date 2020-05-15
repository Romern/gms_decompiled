package p000;

import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.ContactId;

/* renamed from: bbrt */
final /* synthetic */ class bbrt implements bmxj {

    /* renamed from: a */
    private final bbsc f103242a;

    /* renamed from: b */
    private final ContactId f103243b;

    /* renamed from: c */
    private final bmxz f103244c;

    /* renamed from: d */
    private final bcoh f103245d;

    public bbrt(bbsc bbsc, ContactId contactId, bmxz bmxz, bcoh bcoh) {
        this.f103242a = bbsc;
        this.f103243b = contactId;
        this.f103244c = bmxz;
        this.f103245d = bcoh;
    }

    public final Object apply(Object obj) {
        bbsc bbsc = this.f103242a;
        ContactId contactId = this.f103243b;
        bmxz bmxz = this.f103244c;
        bcoh bcoh = this.f103245d;
        bmxv bmxv = (bmxv) obj;
        if (!bmxv.mo66813a()) {
            bcsi m = bcsj.m89802m();
            m.mo57441a(contactId);
            m.mo57442a((Long) -1L);
            m.mo57440a(bngx.m109376e());
            m.mo57445b(bngx.m109376e());
            bmxv = bmxv.m108566b(m.mo57436a());
        }
        boolean a = bmxz.mo6527a((bcsj) bmxv.mo66814b());
        bcsj bcsj = (bcsj) bmxv.mo66814b();
        bqgg bqgg = null;
        if (a) {
            synchronized (bbsc.f103276d) {
                bqgg bqgg2 = (bqgg) bbsc.f103279g.get(Pair.create(bcoh, contactId));
                if (bqgg2 != null) {
                    if (!bqgg2.isDone()) {
                        bbos.m88289a("LitContactCtrlr", "ContactSync already pending for contact");
                        bqgg = bqgg2;
                    }
                }
                bqgg a2 = bbqt.m88418a(bbqt.m88417a(bbsc.f103273a).f103177s, bbsc.f103274b);
                bqgg a3 = bbqt.m88418a(bbqt.m88417a(bbsc.f103273a).f103178t, bbsc.f103274b);
                bcei c = bcej.m88869c();
                c.f104034a = "sync contact profile";
                c.mo56735a(bcen.f104044e);
                bqgg a4 = bqga.m112771a(new bbru(bbsc, bcoh, bcsj, c.mo56734a()), bbsc.f103274b);
                bqgg a5 = bqdx.m112673a(bqga.m112783b(a3, a2, a4).mo69216a(new bbrv(bbsc, bcoh, bcsj, a2, a3, a4), bqfb.INSTANCE), new bbrw(bbsc, bcsj, bcoh), bqfb.INSTANCE);
                bbsc.f103279g.put(Pair.create(bcoh, contactId), a5);
                bqgg = a5;
            }
        } else if (bcsj.mo57307f() && bcsj.mo57305d().mo66813a()) {
            synchronized (bbsc.f103277e) {
                bqgg bqgg3 = (bqgg) bbsc.f103280h.get(Pair.create(bcoh, bcsj.mo57302a()));
                if (bqgg3 == null || bqgg3.isDone() || bqgg3.isCancelled()) {
                    bqgg3 = bbsc.f103274b.mo25819b(new bbrz(bbsc, bcoh, bcsj));
                    bbsc.f103280h.put(Pair.create(bcoh, bcsj.mo57302a()), bqgg3);
                } else {
                    bbos.m88289a("LitContactCtrlr", "contactSync or contactImageFetch already pending for contact");
                }
            }
        }
        if (bqgg != null) {
            bbsc.f103274b.mo25812a(new bbsa(bbsc, bqgg, bcoh, contactId));
        }
        return bcsj;
    }
}
