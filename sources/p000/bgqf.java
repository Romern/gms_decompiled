package p000;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: bgqf */
final /* synthetic */ class bgqf implements bgql {

    /* renamed from: a */
    private final bgqm f117269a;

    /* renamed from: b */
    private final long f117270b;

    /* renamed from: c */
    private final bmxv f117271c;

    /* renamed from: d */
    private final bgqp f117272d;

    /* renamed from: e */
    private final ClientContext f117273e;

    public bgqf(bgqm bgqm, long j, bmxv bmxv, bgqp bgqp, ClientContext clientContext) {
        this.f117269a = bgqm;
        this.f117270b = j;
        this.f117271c = bmxv;
        this.f117272d = bgqp;
        this.f117273e = clientContext;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public final void mo63098a() {
        bgqm bgqm = this.f117269a;
        long j = this.f117270b;
        bmxv bmxv = this.f117271c;
        bgqp bgqp = this.f117272d;
        ClientContext clientContext = this.f117273e;
        String d = ayvd.m84918d(j);
        bxvd da = buom.f154548d.mo74144da();
        bxvd b = bgqm.mo63101b(bmxv);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buoi buoi = (buoi) b.mo74062i();
        buoi.getClass();
        ((buom) da.f164949b).f154552c = buoi;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        d.getClass();
        ((buom) da.f164949b).f154550a = d;
        buov a = bgqp.mo63103a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((buom) da.f164949b).f154551b = a;
        ByteString aL = ((buom) da.mo74062i()).mo73639aL();
        bxvd da2 = buon.f154553e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        buon buon = (buon) da2.f164949b;
        aL.getClass();
        buon.f154557c = aL;
        bgqk bgqk = bgqm.f117292k;
        if (bgqk != null) {
            ByteString bxtx = bgqk.f117286a;
            bxtx.getClass();
            buon.f154556b = bxtx;
        }
        if (cezv.m138510e()) {
            String a2 = bgqm.f117290h.mo63100a("NodeOnlineGuarded", aL);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            a2.getClass();
            ((buon) da2.f164949b).f154558d = a2;
        }
        bgqm.mo25559b("x-goog-skey");
        bgqm.mo25556a("x-goog-skey", d);
        buon buon2 = (buon) da2.mo74062i();
        if (buon2.f164961ai == -1) {
            buon2.f164961ai = bxxm.f165037a.mo74228a(buon2).mo74223b(buon2);
        }
        long a3 = bgqm.f117291j.mo63104a();
        buoo a4 = bgqm.f117288a.mo34440a(clientContext, buon2);
        bgqq bgqq = bgqm.f117291j;
        int a5 = (int) (bgqq.mo63104a() - a3);
        buow buow = a4.f154563c;
        if (buow == null) {
            buow = buow.f154597c;
        }
        bgqq.mo63106a(a5, buow);
        if (a4.f154564d <= 0 || !bgqm.f117289g.mo66813a()) {
            bgqm.f117292k = new bgqk(a4.f154562b);
            return;
        }
        bgpg bgpg = (bgpg) bgqm.f117289g.mo66814b();
        long max = Math.max(0L, Math.min((long) a4.f154564d, cezv.f183536a.mo6606a().quakeApiBackoffMaxMs()));
        bgpg.f117194b = ((Long) bgpg.f117193a.mo6606a()).longValue() + max;
        bgpg.f117474g.mo63137a();
        bgsq bgsq = bgpg.f117474g;
        bgsq.f117450b.sendEmptyMessageDelayed(bgsq.f117449a, max);
    }
}
