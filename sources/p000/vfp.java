package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: vfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vfp {

    /* renamed from: a */
    public static final sbw f49188a = new sbw("PinnedContentDownloader", "");

    /* renamed from: b */
    public final uhn f49189b;

    /* renamed from: c */
    public final ufu f49190c;

    /* renamed from: d */
    public final vfm f49191d = new vfm(this);

    /* renamed from: e */
    public final ExecutorService f49192e = snp.m35704b(10);

    /* renamed from: f */
    public final ExecutorService f49193f = sne.m35694a(((Integer) twy.f46843aa.mo58455c()).intValue(), 10);

    /* renamed from: g */
    public final Map f49194g = new HashMap();

    /* renamed from: h */
    public final Map f49195h = Collections.synchronizedMap(new HashMap());

    /* renamed from: i */
    public final vbt f49196i;

    /* renamed from: j */
    public final uqe f49197j;

    /* renamed from: k */
    public final vcz f49198k;

    /* renamed from: l */
    public final vfd f49199l;

    /* renamed from: m */
    public final vfl f49200m = new vfl(this);

    public vfp(uhn uhn, ufu ufu, vbt vbt, uqe uqe, vcz vcz, vfd vfd) {
        sdo.m34959a(uhn);
        this.f49189b = uhn;
        sdo.m34959a(ufu);
        this.f49190c = ufu;
        sdo.m34959a(vbt);
        this.f49196i = vbt;
        sdo.m34959a(uqe);
        this.f49197j = uqe;
        this.f49198k = vcz;
        sdo.m34959a(vfd);
        this.f49199l = vfd;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m40310a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
            case 3:
                return 5;
            case 4:
                return -5;
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                f49188a.mo25374b("PinnedContentDownloader", "Unrecognized download state code: %d", Integer.valueOf(i));
                break;
        }
        return -4;
    }

    /* renamed from: b */
    public final uey mo28401b(ujx ujx) {
        sdo.m34970a(ujx.mo27573ai());
        uey a = this.f49189b.mo27392a(ujx.mo27567ac(), ujx.mo27643z());
        if (a == null) {
            f49188a.mo25369a("Owner app of appdata entry %s does not exist, unpinning the entry", ujx);
            ujx.mo27560a(uml.UNPINNED);
            ujx.mo27627m(false);
        }
        return a;
    }

    /* renamed from: a */
    private static TransferProgressData m40311a(DriveId driveId, int i) {
        return new TransferProgressData(1, driveId, i, 0, -1);
    }

    /* renamed from: a */
    public final int mo28397a(ujx ujx, vfb vfb) {
        if (ujx == null) {
            return -4;
        }
        uml aa = ujx.mo27565aa();
        if (aa.mo27695a()) {
            return 0;
        }
        if (aa.mo27697c()) {
            return 3;
        }
        if (ujx.mo27566ab()) {
            return 5;
        }
        Integer num = (Integer) this.f49195h.get(ujx.mo27551a());
        if (num == null || num.intValue() < ((Integer) twy.f46847ae.mo58455c()).intValue()) {
            return vfb.mo28375c() ? 1 : 4;
        }
        return -4;
    }

    /* renamed from: b */
    public final void mo28402b(ujx ujx, int i) {
        mo28400a(ujx, m40310a(i));
    }

    /* renamed from: a */
    public final synchronized void mo28398a() {
        synchronized (this.f49194g) {
            if (this.f49194g.size() > 0 && this.f49194g.size() < ((Integer) twy.f46843aa.mo58455c()).intValue()) {
                this.f49194g.notify();
            }
        }
        this.f49192e.submit(this.f49191d);
    }

    /* renamed from: a */
    public final void mo28399a(ujx ujx) {
        uml aa = ujx.mo27565aa();
        int i = 0;
        if (aa.mo27696b()) {
            if (!ujx.mo27577am()) {
                i = 1;
            }
        } else if (aa.mo27697c()) {
            i = 3;
        }
        this.f49197j.mo27858a(m40311a(ujx.mo27610g(), i), ujx);
    }

    /* renamed from: a */
    public final void mo28400a(ujx ujx, int i) {
        this.f49197j.mo27858a(m40311a(ujx.mo27610g(), i), ujx);
    }
}
