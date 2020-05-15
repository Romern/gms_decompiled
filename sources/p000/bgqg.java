package p000;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: bgqg */
final /* synthetic */ class bgqg implements bgql {

    /* renamed from: a */
    private final bgqm f117274a;

    /* renamed from: b */
    private final bmxv f117275b;

    /* renamed from: c */
    private final bgqp f117276c;

    /* renamed from: d */
    private final bgqp f117277d;

    /* renamed from: e */
    private final bgqp f117278e;

    /* renamed from: f */
    private final buof f117279f;

    /* renamed from: g */
    private final ClientContext f117280g;

    public bgqg(bgqm bgqm, bmxv bmxv, bgqp bgqp, bgqp bgqp2, bgqp bgqp3, buof buof, ClientContext clientContext) {
        this.f117274a = bgqm;
        this.f117275b = bmxv;
        this.f117276c = bgqp;
        this.f117277d = bgqp2;
        this.f117278e = bgqp3;
        this.f117279f = buof;
        this.f117280g = clientContext;
    }

    /* renamed from: a */
    public final void mo63098a() {
        bgqm bgqm = this.f117274a;
        bmxv bmxv = this.f117275b;
        bgqp bgqp = this.f117276c;
        bgqp bgqp2 = this.f117277d;
        bgqp bgqp3 = this.f117278e;
        buof buof = this.f117279f;
        ClientContext clientContext = this.f117280g;
        if (bgqm.f117292k != null) {
            bxvd da = buoq.f154571d.mo74144da();
            bxvd b = bgqm.mo63101b(bmxv);
            buov a = bgqp.mo63103a();
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            buoi buoi = buoi.f154527i;
            a.getClass();
            ((buoi) b.f164949b).f154535g = a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buoi buoi2 = (buoi) b.mo74062i();
            buoi2.getClass();
            ((buoq) da.f164949b).f154575c = buoi2;
            buov a2 = bgqp2.mo63103a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((buoq) da.f164949b).f154574b = a2;
            bxvd da2 = buot.f154584c.mo74144da();
            buov a3 = bgqp3.mo63103a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buot buot = (buot) da2.f164949b;
            a3.getClass();
            buot.f154586a = a3;
            buof.getClass();
            buot.f154587b = buof;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buot buot2 = (buot) da2.mo74062i();
            buot2.getClass();
            ((buoq) da.f164949b).f154573a = buot2;
            ByteString aL = ((buoq) da.mo74062i()).mo73639aL();
            bxvd da3 = buor.f154576d.mo74144da();
            ByteString bxtx = bgqm.f117292k.f117286a;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            buor buor = (buor) da3.f164949b;
            bxtx.getClass();
            buor.f154578a = bxtx;
            aL.getClass();
            buor.f154579b = aL;
            if (cezv.m138511f()) {
                String a4 = bgqm.f117290h.mo63100a("NodeTriggeringGuarded", aL);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                a4.getClass();
                ((buor) da3.f164949b).f154580c = a4;
            }
            buor buor2 = (buor) da3.mo74062i();
            if (buof.f164961ai == -1) {
                buof.f164961ai = bxxm.f165037a.mo74228a(buof).mo74223b(buof);
            }
            if (buor2.f164961ai == -1) {
                buor2.f164961ai = bxxm.f165037a.mo74228a(buor2).mo74223b(buor2);
            }
            long a5 = bgqm.f117291j.mo63104a();
            buos a6 = bgqm.f117288a.mo34441a(clientContext, buor2);
            bgqq bgqq = bgqm.f117291j;
            int a7 = (int) (bgqq.mo63104a() - a5);
            buow buow = a6.f154583a;
            if (buow == null) {
                buow = buow.f154597c;
            }
            bgqq.mo63106a(a7, buow);
        }
    }
}
