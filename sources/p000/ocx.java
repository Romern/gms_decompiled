package p000;

import android.content.Context;
import android.media.AudioManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: ocx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ocx {

    /* renamed from: a */
    public static final Object f37197a = new Object();

    /* renamed from: b */
    public static final ocm f37198b = ocm.m28386e().mo21972a();

    /* renamed from: g */
    private static final bnsn f37199g = odk.m28481a("CAR.ANALYTICS");

    /* renamed from: h */
    private static final ocv f37200h = ocs.f37192a;

    /* renamed from: i */
    private static volatile ocx f37201i;

    /* renamed from: c */
    public volatile ocv f37202c;

    /* renamed from: d */
    public final C1582ocr f37203d;

    /* renamed from: e */
    public final BlockingQueue f37204e;

    /* renamed from: f */
    public final ocy f37205f;

    /* renamed from: j */
    private final ocj f37206j;

    /* renamed from: k */
    private final ocz f37207k;

    public ocx(ocv ocv, ocy ocy, ocj ocj, ocz ocz, C1582ocr ocr, BlockingQueue blockingQueue) {
        this.f37202c = ocv;
        this.f37205f = ocy;
        this.f37206j = ocj;
        this.f37207k = ocz;
        this.f37203d = ocr;
        this.f37204e = blockingQueue;
        ocr.mo21977a(new oct(this));
        ocr.mo21975a();
    }

    /* renamed from: a */
    private final bpcl m28404a(bxvd bxvd) {
        boolean isMusicActive = ((AudioManager) this.f37206j.f37169a.getSystemService("audio")).isMusicActive();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpcl bpcl = (bpcl) bxvd.f164949b;
        bpcl bpcl2 = bpcl.f135759L;
        bpcl.f135773a |= 33554432;
        bpcl.f135795w = isMusicActive;
        ocj ocj = this.f37206j;
        ocj.mo21964a();
        int i = ocj.f37170b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpcl bpcl3 = (bpcl) bxvd.f164949b;
        bpcl3.f135773a |= 16777216;
        bpcl3.f135794v = i;
        if (ccql.m131268c()) {
            ocj ocj2 = this.f37206j;
            ocj2.mo21964a();
            bmxv bmxv = ocj2.f37171c;
            if (bmxv.mo66813a()) {
                int intValue = ((Integer) bmxv.mo66814b()).intValue();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpcl bpcl4 = (bpcl) bxvd.f164949b;
                bpcl4.f135774b |= 1048576;
                bpcl4.f135769I = intValue;
            }
        }
        ocm a = this.f37202c.mo21152a();
        if (a != null) {
            if (a.mo21965a().mo66813a()) {
                int intValue2 = ((Integer) a.mo21965a().mo66814b()).intValue();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpcl bpcl5 = (bpcl) bxvd.f164949b;
                bpcl5.f135773a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                bpcl5.f135789q = intValue2;
            } else {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpcl bpcl6 = (bpcl) bxvd.f164949b;
                bpcl6.f135773a &= -524289;
                bpcl6.f135789q = 0;
            }
            if (a.mo21966b().mo66813a()) {
                boolean booleanValue = ((Boolean) a.mo21966b().mo66814b()).booleanValue();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpcl bpcl7 = (bpcl) bxvd.f164949b;
                bpcl7.f135773a = 1048576 | bpcl7.f135773a;
                bpcl7.f135790r = booleanValue;
            } else {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpcl bpcl8 = (bpcl) bxvd.f164949b;
                bpcl8.f135773a &= -1048577;
                bpcl8.f135790r = false;
            }
            if (a.mo21967c().mo66813a()) {
                int intValue3 = ((Integer) a.mo21967c().mo66814b()).intValue();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpcl bpcl9 = (bpcl) bxvd.f164949b;
                bpcl9.f135773a |= 2097152;
                bpcl9.f135791s = intValue3;
            } else {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpcl bpcl10 = (bpcl) bxvd.f164949b;
                bpcl10.f135773a &= -2097153;
                bpcl10.f135791s = 0;
            }
            if (a.mo21968d().mo66813a()) {
                int i2 = ((bpde) a.mo21968d().mo66814b()).f135928l;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpcl bpcl11 = (bpcl) bxvd.f164949b;
                bpcl11.f135773a |= 4194304;
                bpcl11.f135792t = i2;
            } else {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpcl bpcl12 = (bpcl) bxvd.f164949b;
                bpcl12.f135773a &= -4194305;
                bpcl12.f135792t = -1;
            }
        }
        return (bpcl) bxvd.mo74062i();
    }

    /* renamed from: a */
    public static ocx m28405a(Context context) {
        ocu ocu;
        boolean z;
        if (f37201i == null) {
            synchronized (f37197a) {
                if (f37201i == null) {
                    C1582ocr ocr = new C1582ocr(context.getApplicationContext());
                    ocv ocv = f37200h;
                    ocy ocy = new ocy(context.getApplicationContext());
                    ocj ocj = new ocj(context.getApplicationContext());
                    if (ccvo.m131796b() && ccvo.m131797c()) {
                        odc odc = odc.f37214a;
                        long d = ccvo.f180038a.mo6606a().mo76883d();
                        if (d >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bmxy.m108593a(z, "Cache expiration may not be negative: %s", d);
                        odc.f37216c = TimeUnit.MILLISECONDS.toNanos(d);
                        ocu = odc;
                    } else {
                        ocu = new ocu();
                    }
                    f37201i = new ocx(ocv, ocy, ocj, ocu, ocr, new ArrayBlockingQueue((int) ccqr.f179769a.mo6606a().mo76655a()));
                }
            }
        }
        return f37201i;
    }

    /* renamed from: a */
    private final boolean m28406a(bpcy bpcy, int i, bxvd bxvd, List list) {
        boolean z;
        bpcx bpcx = ((bpcl) bxvd.f164949b).f135765E;
        if (bpcx == null) {
            bpcx = bpcx.f135883d;
        }
        if ((bpcx.f135885a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(!z, "sourceDomainLifetimeId is reserved for CarTelemetryLogger lib use");
        if (ccvo.m131796b() && ccvo.m131797c()) {
            bpcx bpcx2 = (bpcx) this.f37207k.mo21980a(bpcy);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpcl bpcl = (bpcl) bxvd.f164949b;
            bpcl bpcl2 = bpcl.f135759L;
            bpcx2.getClass();
            bpcl.f135765E = bpcx2;
            bpcl.f135774b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            bngx a = this.f37207k.mo21979a();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpcl bpcl3 = (bpcl) bxvd.f164949b;
            if (!bpcl3.f135766F.mo73666a()) {
                bpcl3.f135766F = bxvk.m124021a(bpcl3.f135766F);
            }
            bxsy.m123078a(a, bpcl3.f135766F);
        }
        bpcl a2 = m28404a(bxvd);
        ocq b = this.f37203d.mo21978b();
        ocq ocq = ocq.ENABLED;
        int ordinal = b.ordinal();
        if (ordinal == 0) {
            this.f37205f.mo21983a(i, a2, list);
            return true;
        } else if (ordinal == 1) {
            return false;
        } else {
            if (ordinal == 2) {
                if (!this.f37204e.offer(new ocw(i, a2, list))) {
                    bnsi c = f37199g.mo68388c();
                    c.mo68432a("ocx", "a", 275, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Cannot queue item because queue overflowing");
                }
                return false;
            }
            String valueOf = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Impossible enabledFlag: ");
            sb.append(valueOf);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo21981a(int i, bpcl bpcl, List list) {
        bpcy bpcy;
        if (!ccvo.m131796b() || !ccvo.m131797c()) {
            bpcy bpcy2 = bpcy.DOMAIN_UNSPECIFIED;
            bxvd bxvd = (bxvd) bpcl.mo74142c(5);
            bxvd.mo73625a((bxvk) bpcl);
            m28406a(bpcy2, i, bxvd, list);
            return;
        }
        bpcx bpcx = bpcl.f135765E;
        if (bpcx == null) {
            bpcx = bpcx.f135883d;
        }
        if ((bpcx.f135885a & 1) == 0) {
            bpcy = bpcy.DOMAIN_UNSPECIFIED;
        } else {
            bpcx bpcx2 = bpcl.f135765E;
            if (bpcx2 == null) {
                bpcx2 = bpcx.f135883d;
            }
            bpcy = bpcy.m111790a(bpcx2.f135886b);
            bmxy.m108581a(bpcy);
        }
        bxvd bxvd2 = (bxvd) bpcl.mo74142c(5);
        bxvd2.mo73625a((bxvk) bpcl);
        m28406a(bpcy, i, bxvd2, list);
    }

    /* renamed from: a */
    public final void mo21982a(bpcy bpcy, int i) {
        odh a = odi.m28455a(bpcy, bpeb.TELEMETRY, bpea.TELEMETRY_EVENTS_BUFFERED);
        a.f37252e = bmxv.m108566b(Integer.valueOf(i));
        this.f37205f.mo21983a(37, m28404a(((odi) a.mo22019b()).mo22020C()), bngx.m109376e());
    }
}
