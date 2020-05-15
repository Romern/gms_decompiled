package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bbvd */
final /* synthetic */ class bbvd implements Runnable {

    /* renamed from: a */
    private final bbwq f103496a;

    /* renamed from: b */
    private final bcoh f103497b;

    /* renamed from: c */
    private final String f103498c;

    /* renamed from: d */
    private final bmxv f103499d;

    public bbvd(bbwq bbwq, bcoh bcoh, String str, bmxv bmxv) {
        this.f103496a = bbwq;
        this.f103497b = bcoh;
        this.f103498c = str;
        this.f103499d = bmxv;
    }

    public final void run() {
        bmxv bmxv;
        String str;
        bxtx bxtx;
        Bitmap decodeByteArray;
        bbwq bbwq = this.f103496a;
        bcoh bcoh = this.f103497b;
        String str2 = this.f103498c;
        bmxv bmxv2 = this.f103499d;
        boolean booleanValue = ((Boolean) bbqt.m88417a(bbwq.f103603a).f103117aL.mo58455c()).booleanValue();
        Long l = (Long) bbqt.m88417a(bbwq.f103603a).f103118aM.mo58455c();
        boolean booleanValue2 = ((Boolean) bbqt.m88417a(bbwq.f103603a).f103119aN.mo58455c()).booleanValue();
        Long l2 = (Long) bbqt.m88417a(bbwq.f103603a).f103120aO.mo58455c();
        if (booleanValue) {
            if (l.longValue() > 0) {
                bbwq.f103616n.postDelayed(new bbvy(bbwq, bcoh, str2, bmxv2), l.longValue());
            } else {
                bbwq.mo56472a(bcoh, str2, (bcsp) bmxv2.mo66814b());
            }
        }
        if (booleanValue2) {
            bbxw bbxw = bbwq.f103604b;
            bcsp bcsp = (bcsp) bmxv2.mo66814b();
            try {
                cbex a = bcku.m89205a(str2);
                if (a.f176865d == null || bcsp.mo57317a().mo60556c() != ConversationId.IdType.ONE_TO_ONE) {
                    bmxv = bmvz.f131120a;
                    if (bmxv.mo66813a() && ((bcsp) bmxv2.mo66814b()).mo57317a().mo60556c() == ConversationId.IdType.ONE_TO_ONE) {
                        if (l2.longValue() > 0) {
                            bcsi m = bcsj.m89802m();
                            m.mo57441a(((bcsj) bmxv.mo66814b()).mo57302a());
                            bbon.m88284a();
                            m.mo57442a(Long.valueOf(System.currentTimeMillis() + l2.longValue()));
                            if (bbwq.f103607e.mo56561a(bcoh).mo56602a(m.mo57436a()) != -1) {
                                bbwq.f103616n.postDelayed(new bbvz(bbwq, bcoh, bmxv), l2.longValue());
                                return;
                            }
                            return;
                        }
                        bbwq.f103607e.mo56561a(bcoh).mo56602a((bcsj) bmxv.mo66814b());
                        return;
                    }
                }
                bcsi m2 = bcsj.m89802m();
                m2.mo57441a(bcsp.mo57317a().mo60558e());
                m2.mo57442a((Long) -1L);
                cbdv cbdv = a.f176865d;
                if (cbdv == null) {
                    cbdv = cbdv.f176794j;
                }
                m2.mo57446b(cbdv.f176796a);
                cbdv cbdv2 = a.f176865d;
                if (cbdv2 == null) {
                    cbdv2 = cbdv.f176794j;
                }
                cbdt cbdt = cbdv2.f176797b;
                if (cbdt == null) {
                    cbdt = cbdt.f176788d;
                }
                String str3 = "";
                if (cbdt.f176790a == 2) {
                    str = (String) cbdt.f176791b;
                } else {
                    str = str3;
                }
                if (!TextUtils.isEmpty(str)) {
                    cbdv cbdv3 = a.f176865d;
                    if (cbdv3 == null) {
                        cbdv3 = cbdv.f176794j;
                    }
                    cbdt cbdt2 = cbdv3.f176797b;
                    if (cbdt2 == null) {
                        cbdt2 = cbdt.f176788d;
                    }
                    if (cbdt2.f176790a == 2) {
                        str3 = (String) cbdt2.f176791b;
                    }
                    m2.mo57443a(str3);
                } else {
                    cbdv cbdv4 = a.f176865d;
                    if (cbdv4 == null) {
                        cbdv4 = cbdv.f176794j;
                    }
                    cbdt cbdt3 = cbdv4.f176797b;
                    if (cbdt3 == null) {
                        cbdt3 = cbdt.f176788d;
                    }
                    if (cbdt3.f176790a == 1) {
                        bxtx = (bxtx) cbdt3.f176791b;
                    } else {
                        bxtx = bxtx.f164797b;
                    }
                    byte[] k = bxtx.mo73780k();
                    int length = k.length;
                    if (length > 0 && (decodeByteArray = BitmapFactory.decodeByteArray(k, 0, length)) != null) {
                        m2.mo57437a(decodeByteArray);
                    }
                }
                bmxv = bmxv.m108566b(m2.mo57436a());
                if (bmxv.mo66813a()) {
                }
            } catch (Exception e) {
                bbos.m88292b("TyMsgClient", "Unable to parse intent args", e);
                bcfx bcfx = ((bcku) bbxw).f104415c;
                bcnr q = bcns.m89409q();
                q.mo57011b(10028);
                q.mo57012b(bcoh.mo57058b().mo57074e());
                q.mo57010a(bcoh.mo57059c().mo73781l());
                bcfx.mo56753a(q.mo57002a());
                bmxv = bmvz.f131120a;
            }
        }
    }
}
