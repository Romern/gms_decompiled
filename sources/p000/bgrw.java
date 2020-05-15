package p000;

import android.os.HandlerThread;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: bgrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgrw {

    /* renamed from: a */
    public static final srn f117381a = srn.m36126a("QMonitor", sgj.LOCATION);

    /* renamed from: g */
    private static bgrw f117382g;

    /* renamed from: b */
    public final rpr f117383b;

    /* renamed from: c */
    public bgth f117384c;

    /* renamed from: d */
    public HandlerThread f117385d;

    /* renamed from: e */
    private final sqv f117386e = new bgte();

    /* renamed from: f */
    private final Random f117387f = new SecureRandom();

    private bgrw(rpr rpr) {
        this.f117383b = rpr;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r3v19, types: [bgqs, bgtb], assign insn: 0x0110: CONSTRUCTOR  (r3v19 ? I:bgqs) = (r4v32 rpr), (r6v16 bgsq) call: bgqs.<init>(android.content.Context, bgsq):void type: CONSTRUCTOR */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01fe  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static void m99827a() {
        bgrv bgrv;
        bmvz bmvz;
        bgqj bgqj;
        if (bgry.m99829d()) {
            synchronized (bgrw.class) {
                if (f117382g == null) {
                    bgrw bgrw = new bgrw(rpr.m34216b());
                    f117382g = bgrw;
                    HandlerThread handlerThread = new HandlerThread("QMon", 9);
                    bgrw.f117385d = handlerThread;
                    handlerThread.start();
                    bgrw.f117384c = new bgth("Q", bgrw.f117385d);
                    bgrw.f117384c.mo63155b(new bgtc("QSettings", new bgry(bgrw.f117383b, bgrw.f117384c.mo63151a(1))));
                    bgsd bgpr = !cezu.f183534a.mo6606a().seismicUseNewLocationApi() ? new bgpr(bgrw.f117383b, bgrw.f117384c.mo63151a(2)) : new bgpq(bgrw.f117383b, bgrw.f117384c.mo63151a(2));
                    bgrw.f117384c.mo63155b(new bgtc("QLocation", bgpr));
                    if (!cezu.f183534a.mo6606a().seismicDebugBypassBattery()) {
                        bgrw.f117384c.mo63155b(new bgtc("QPower", new bgpt(bgrw.f117383b, bgrw.f117385d, bgrw.f117384c.mo63151a(3))));
                    }
                    if (!cezu.f183534a.mo6606a().seismicDebugBypassMotion()) {
                        bgrw.f117384c.mo63155b(new bgtc("QMotion", new bgpi(bgrw.f117383b, bgrw.f117384c.mo63151a(4))));
                    }
                    if (cezu.f183534a.mo6606a().seismicEnableStartupDelay()) {
                        bgrw.f117384c.mo63155b(new bgti(cezu.f183534a.mo6606a().seismicMinStartupDelayMillis(), cezu.f183534a.mo6606a().seismicMaxStartupDelayMillis(), bgrw.f117387f));
                    }
                    if (cezu.m138503x() != 0) {
                        ? bgqs = new bgqs(bgrw.f117383b, bgrw.f117384c.mo63151a(11));
                        bgrw.f117384c.mo63155b(new bgtc("QScreen", bgqs));
                        bgrv = bgqs;
                    } else {
                        bgrv = new bgrv();
                    }
                    bgrk bgrk = new bgrk(bgpr, bgrw.f117386e, new bgqt(bgrw, new bgsb(bgrv)));
                    if (cezv.f183536a.mo6606a().quakeApiEnable()) {
                        if (!cezv.f183536a.mo6606a().quakeApiV2Enable()) {
                            bgrw.f117384c.mo63155b(new bgro(bgpr, new bgqw(bgrw)));
                        } else {
                            if (!cezv.f183536a.mo6606a().quakeApiBackoffEnable()) {
                                bmvz = bmvz.f131120a;
                            } else {
                                bmxv b = bmxv.m108566b(new bgpg(bgqy.f117318a, bgrw.f117384c.mo63151a(14)));
                                bgrw.f117384c.mo63155b(new bgtc("QBackoff", (bgtb) ((bmyg) b).f131198a));
                                bmvz = b;
                            }
                            bgqq bgqq = new bgqq(bgqz.f117319a, bgra.f117320a);
                            if (!cezv.m138510e()) {
                                if (!cezv.m138511f() && !cezv.m138509d()) {
                                    bgqj = bgre.f117324a;
                                    bgrk.getClass();
                                    bgrf bgrf = new bgrf(bgrk);
                                    bgrk.getClass();
                                    bgrn bgrn = new bgrn(!cezv.m138507b(), bgpr, bmvz, bgqq, bgrf, new bgrg(bgrk), new bgqu(bgrw, bmvz, bgqj, bgqq));
                                    bgrw.f117384c.mo63155b(bgrn);
                                    if (cezv.m138507b()) {
                                        bgrw.f117384c.mo63155b(new bgrl(bgrw.f117383b, bgqv.f117315a, new skc(bgrw.f117383b), bgrn));
                                    }
                                }
                            }
                            bgri bgri = new bgri(new bgrb(bgrw), bgrc.f117322a);
                            bgri.getClass();
                            bgrd bgrd = new bgrd(bgri);
                            bgrw.f117384c.mo63155b(bgri);
                            bgqj = bgrd;
                            bgrk.getClass();
                            bgrf bgrf2 = new bgrf(bgrk);
                            bgrk.getClass();
                            bgrn bgrn2 = new bgrn(!cezv.m138507b(), bgpr, bmvz, bgqq, bgrf2, new bgrg(bgrk), new bgqu(bgrw, bmvz, bgqj, bgqq));
                            bgrw.f117384c.mo63155b(bgrn2);
                            if (cezv.m138507b()) {
                            }
                        }
                    }
                    bgru bgru = new bgru(bgrw.f117383b, bgrw.f117386e, bgpr);
                    if (cezu.f183534a.mo6606a().seismicEnableGls()) {
                        bgrw.f117384c.mo63155b(new bgrp(bgrw.f117383b, bgpr, bgru, bgrk, new bgqx(bgrw)));
                    }
                    bgrw.f117384c.mo63155b(bgru);
                    bgrw.f117384c.mo63155b(bgrk);
                    bgrw.f117384c.mo63152a();
                }
            }
        }
    }
}
