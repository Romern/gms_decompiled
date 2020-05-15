package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: avmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avmv {

    /* renamed from: a */
    public static final avsz f93428a = new avmu();

    /* renamed from: b */
    private static final sek f93429b = avpq.m79017d("ExperimentControl");

    /* renamed from: c */
    private static final avti f93430c = new avto("control.experiment.exp_id_key", "");

    /* renamed from: d */
    private static final avti f93431d = new avto("control.experiment.exp_name_space_key", "");

    /* renamed from: e */
    private static final avti f93432e = new avto("control.experiment.exp_log_source_key", "");

    /* renamed from: f */
    private final rpr f93433f;

    /* renamed from: g */
    private final avtn f93434g = ((avtn) avtn.f93892a.mo51589b());

    public avmv(rpr rpr) {
        this.f93433f = rpr;
    }

    /* renamed from: a */
    private final boolean m78827a(String str, String str2, String str3) {
        try {
            aney a = anef.m64089a(this.f93433f);
            int[] iArr = !str3.equals("") ? new int[]{Integer.parseInt(str3)} : new int[0];
            roz b = rpa.m34196b();
            b.f43472a = new aneu(str, str2, iArr);
            aucu.m76782a(a.mo24701a(b.mo24977a()));
            this.f93434g.mo51605a(f93430c.mo51602b(str3));
            this.f93434g.mo51605a(f93431d.mo51602b(str));
            this.f93434g.mo51605a(f93432e.mo51602b(str2));
            f93429b.mo25412b("Experiment config id: %s name_space: %s log_source: %s", str3, str, str2);
            avmz avmz = (avmz) avmz.f93475a.mo51589b();
            bxvd da = bohs.f133145d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bohs bohs = (bohs) da.f164949b;
            int i = bohs.f133147a | 1;
            bohs.f133147a = i;
            bohs.f133148b = 1;
            str3.getClass();
            bohs.f133147a = i | 2;
            bohs.f133149c = str3;
            avpp avpp = avmz.f93482b;
            bohs bohs2 = (bohs) da.mo74062i();
            bxvd a2 = avpp.mo51476a(10);
            if (a2.f164950c) {
                a2.mo74035c();
                a2.f164950c = false;
            }
            bohn bohn = (bohn) a2.f164949b;
            bohn bohn2 = bohn.f133102n;
            bohs2.getClass();
            bohn.f133115l = bohs2;
            bohn.f133104a |= 1024;
            avpp.mo51478a((bohn) a2.mo74062i());
            return true;
        } catch (InterruptedException | NumberFormatException | ExecutionException e) {
            f93429b.mo25418e("Unable to set experiment config id: %s name_space: %s, log_source: %s.", cftq.m143014d(), cftq.m143016f(), cftq.m143015e());
            return false;
        }
    }

    /* renamed from: a */
    public final void mo51400a() {
        if (cftq.f185693a.mo6606a().mo82709a()) {
            String f = cftq.m143016f();
            String e = cftq.m143015e();
            String d = cftq.m143014d().equals(cftq.f185693a.mo6606a().mo82715g()) ? (String) this.f93434g.mo51607b(f93430c) : cftq.m143014d();
            if (((String) this.f93434g.mo51607b(f93430c)).equals(d) && ((String) this.f93434g.mo51607b(f93431d)).equals(f) && ((String) this.f93434g.mo51607b(f93432e)).equals(e)) {
                return;
            }
            if ((((String) this.f93434g.mo51607b(f93430c)).equals(d) || !((String) this.f93434g.mo51607b(f93431d)).equals(f) || !((String) this.f93434g.mo51607b(f93432e)).equals(e)) && !((String) this.f93434g.mo51607b(f93430c)).equals("") && !m78827a((String) this.f93434g.mo51607b(f93431d), (String) this.f93434g.mo51607b(f93432e), "")) {
                f93429b.mo25416d("Unable to clear current experiment, abort updating experiment config.", new Object[0]);
            } else {
                m78827a(f, e, d);
            }
        }
    }
}
