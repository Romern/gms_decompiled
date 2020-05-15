package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: bgqh */
final /* synthetic */ class bgqh implements bgql {

    /* renamed from: a */
    private final bgqm f117281a;

    /* renamed from: b */
    private final bmxv f117282b;

    /* renamed from: c */
    private final bgqp f117283c;

    /* renamed from: d */
    private final ClientContext f117284d;

    public bgqh(bgqm bgqm, bmxv bmxv, bgqp bgqp, ClientContext clientContext) {
        this.f117281a = bgqm;
        this.f117282b = bmxv;
        this.f117283c = bgqp;
        this.f117284d = clientContext;
    }

    /* renamed from: a */
    public final void mo63098a() {
        bgqm bgqm = this.f117281a;
        bmxv bmxv = this.f117282b;
        bgqp bgqp = this.f117283c;
        ClientContext clientContext = this.f117284d;
        if (bgqm.f117292k != null) {
            bxvd da = buoj.f154537c.mo74144da();
            bxvd b = bgqm.mo63101b(bmxv);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buoi buoi = (buoi) b.mo74062i();
            buoi.getClass();
            ((buoj) da.f164949b).f154540b = buoi;
            buov a = bgqp.mo63103a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((buoj) da.f164949b).f154539a = a;
            ByteString aL = ((buoj) da.mo74062i()).mo73639aL();
            bxvd da2 = buok.f154541d.mo74144da();
            ByteString bxtx = bgqm.f117292k.f117286a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buok buok = (buok) da2.f164949b;
            bxtx.getClass();
            buok.f154543a = bxtx;
            aL.getClass();
            buok.f154544b = aL;
            if (cezv.m138509d()) {
                String a2 = bgqm.f117290h.mo63100a("NodeOfflineGuarded", aL);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                a2.getClass();
                ((buok) da2.f164949b).f154545c = a2;
            }
            buok buok2 = (buok) da2.mo74062i();
            if (buok2.f164961ai == -1) {
                buok2.f164961ai = bxxm.f165037a.mo74228a(buok2).mo74223b(buok2);
            }
            aepr aepr = bgqm.f117288a;
            if (aepr.f63609c == null) {
                aepr.f63609c = chtv.m149566a(chtu.UNARY, "google.internal.android.location.quake.v1.QuakeApiService/NodeOffline", ciie.m150370a(buok.f154541d), ciie.m150370a(buol.f154546a));
            }
            buol buol = (buol) aepr.f63612a.mo25553a(aepr.f63609c, clientContext, buok2, (long) aepr.f63608b, TimeUnit.MILLISECONDS);
            bgqm.f117292k = null;
            bgqm.mo63102c();
        }
    }
}
