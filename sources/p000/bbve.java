package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.TimeUnit;

/* renamed from: bbve */
final /* synthetic */ class bbve implements bdaq {

    /* renamed from: a */
    private final bbwq f103500a;

    /* renamed from: b */
    private final bcoh f103501b;

    /* renamed from: c */
    private final String f103502c;

    public bbve(bbwq bbwq, bcoh bcoh, String str) {
        this.f103500a = bbwq;
        this.f103501b = bcoh;
        this.f103502c = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo54573a(Object obj) {
        bmxv bmxv;
        bmxv bmxv2;
        cbff cbff;
        bbwq bbwq = this.f103500a;
        bcoh bcoh = this.f103501b;
        String str = this.f103502c;
        if (((bngx) obj).isEmpty()) {
            bbxw bbxw = bbwq.f103604b;
            try {
                cbex a = bcku.m89205a(str);
                try {
                    cbds cbds = a.f176862a;
                    if (cbds == null) {
                        cbds = cbds.f176782e;
                    }
                    bcsq f = ConversationId.m94839f();
                    f.mo57473a(bcoh.mo57058b().mo57074e());
                    int b = cbel.m127777b(cbds.f176784a);
                    if (b == 0) {
                        b = 1;
                    }
                    int i = b - 2;
                    if (i == 1 || i == 2 || i == 3) {
                        f.mo57475b(bclk.m89246a(cbds));
                    } else if (i != 4) {
                        bmxv2 = bmvz.f131120a;
                        if (bmxv2.mo66813a() || (cbff = a.f176866e) == null) {
                            bmxv = bmvz.f131120a;
                            if (bmxv.mo66813a()) {
                                bbwq.f103606d.mo25812a(new bbvx(bbwq, bcoh, bmxv));
                                return;
                            }
                            return;
                        }
                        bxvd bxvd = (bxvd) cbff.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) cbff);
                        cbdl a2 = bcli.m89240a((ConversationId) bmxv2.mo66814b());
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        a2.getClass();
                        ((cbff) bxvd.f164949b).f176903j = a2;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        bbon.m88284a();
                        long micros = timeUnit.toMicros(System.currentTimeMillis());
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ((cbff) bxvd.f164949b).f176901h = micros;
                        bxvd da = cbkj.f177405k.mo74144da();
                        ByteString aL = ((cbff) bxvd.mo74062i()).mo73639aL();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cbkj cbkj = (cbkj) da.f164949b;
                        aL.getClass();
                        cbkj.f177411e = aL;
                        cbkj.f177410d = cbki.m127937a(26);
                        bmxv = bclm.m89252a((cbkj) da.mo74062i(), bcoh, ((bcku) bbxw).f104414b, ((bcku) bbxw).f104418f, ((bcku) bbxw).f104415c);
                        if (bmxv.mo66813a()) {
                        }
                    } else {
                        bcsr c = ConversationId.GroupId.m94847c();
                        c.mo57478b(cbds.f176785b);
                        c.mo57477a(cbds.f176787d);
                        f.mo57474a(c.mo57476a());
                    }
                    bmxv2 = bmxv.m108566b(f.mo57472a());
                } catch (IllegalArgumentException e) {
                    bbos.m88292b("TyMsgClient", "Unable to parse intent args", e);
                    bcfx bcfx = ((bcku) bbxw).f104415c;
                    bcnr q = bcns.m89409q();
                    q.mo57011b(10027);
                    q.mo57012b(bcoh.mo57058b().mo57074e());
                    q.mo57010a(bcoh.mo57059c().mo73781l());
                    bcfx.mo56753a(q.mo57002a());
                    bmxv2 = bmvz.f131120a;
                }
                if (bmxv2.mo66813a()) {
                }
                bmxv = bmvz.f131120a;
            } catch (Exception e2) {
                bbos.m88292b("TyMsgClient", "Unable to parse intent args", e2);
                bcfx bcfx2 = ((bcku) bbxw).f104415c;
                bcnr q2 = bcns.m89409q();
                q2.mo57011b(10029);
                q2.mo57012b(bcoh.mo57058b().mo57074e());
                q2.mo57010a(bcoh.mo57059c().mo73781l());
                bcfx2.mo56753a(q2.mo57002a());
                bmxv = bmvz.f131120a;
            }
            if (bmxv.mo66813a()) {
            }
        }
    }
}
