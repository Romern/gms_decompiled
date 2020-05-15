package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.Set;
import org.json.JSONException;

/* renamed from: ube */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ube {

    /* renamed from: d */
    private static final sbw f47107d = new sbw("QueuedAction", "");

    /* renamed from: a */
    public final uln f47108a;

    /* renamed from: b */
    public final uhn f47109b;

    /* renamed from: c */
    public vfb f47110c;

    /* renamed from: e */
    private final uqe f47111e;

    /* renamed from: f */
    private final vfd f47112f;

    /* renamed from: g */
    private txw f47113g;

    /* renamed from: h */
    private int f47114h = 0;

    /* renamed from: i */
    private long f47115i = 0;

    /* renamed from: j */
    private long f47116j = 0;

    /* renamed from: k */
    private boolean f47117k = false;

    public ube(uln uln, txw txw, uqe uqe, uhn uhn, vfd vfd) {
        sdo.m34959a(uln);
        this.f47108a = uln;
        sdo.m34959a(txw);
        this.f47113g = txw;
        sdo.m34959a(uqe);
        this.f47111e = uqe;
        sdo.m34959a(uhn);
        this.f47109b = uhn;
        sdo.m34959a(vfd);
        this.f47112f = vfd;
        m37893k();
    }

    /* renamed from: k */
    private final void m37893k() {
        txp txp = this.f47113g.f46966a;
        uax uax = null;
        this.f47110c = null;
        if (!mo27065i() && txp.mo26901j()) {
            try {
                veq a = this.f47112f.mo28379a(false, txp.mo26892c(this.f47109b));
                this.f47110c = a;
                if (a != null) {
                    String str = this.f47108a.f48138g;
                    if (str != null) {
                        try {
                            uax = new uax(str);
                        } catch (JSONException e) {
                            f47107d.mo25378c("QueuedAction", String.format("Unable to deserialize transfer preferences %s", str), e);
                            uln uln = this.f47108a;
                            uln.f48138g = null;
                            uln.mo27725t();
                        }
                    }
                    a.mo28374c(uax);
                }
            } catch (tzu e2) {
            }
        }
    }

    /* renamed from: l */
    private final synchronized void m37894l() {
        sdo.m34970a(!this.f47109b.mo27382b());
        if (mo27061e()) {
            try {
                uey c = mo27057b().mo26892c(this.f47109b);
                ukk s = mo27057b().mo26913s();
                if (s != null) {
                    ujx a = this.f47109b.mo27402a(c, s);
                    TransferProgressData a2 = mo27050a(a.mo27610g());
                    if (a2 != null) {
                        this.f47111e.mo27858a(a2, a);
                    }
                }
            } catch (tzu e) {
            } catch (uaa e2) {
                f47107d.mo25378c("QueuedAction", "Cannot retrieve entry", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized TransferProgressData mo27050a(DriveId driveId) {
        int i;
        switch (this.f47114h) {
            case 0:
                return null;
            case 1:
            case 3:
            case 4:
                i = 1;
                break;
            case 2:
                i = 4;
                break;
            case 5:
                i = 3;
                break;
            case 6:
                i = 2;
                break;
            case 7:
                i = 5;
                break;
            case 8:
                i = -3;
                break;
            case 9:
                i = -4;
                break;
            default:
                i = -1;
                break;
        }
        return new TransferProgressData(0, driveId, i, this.f47115i, this.f47116j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized txp mo27057b() {
        return this.f47113g.f46966a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized int mo27059c() {
        return this.f47114h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized long mo27060d() {
        return this.f47116j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo27061e() {
        return mo27057b().mo26902k() == txr.CREATE_FILE || mo27057b().mo26902k() == txr.CONTENT_AND_METADATA;
    }

    /* renamed from: f */
    public final synchronized void mo27062f() {
        this.f47117k = true;
        vfb vfb = this.f47110c;
        if (vfb != null) {
            vfb.mo28376d();
        }
    }

    /* renamed from: g */
    public final synchronized void mo27063g() {
        sdo.m34970a(!this.f47109b.mo27382b());
        if (!mo27065i()) {
            this.f47108a.mo27694a(true);
            vfb vfb = this.f47110c;
            if (vfb != null) {
                vfb.mo28376d();
            }
            mo27051a();
        }
    }

    /* renamed from: h */
    public final synchronized void mo27064h() {
        sdo.m34970a(!this.f47109b.mo27382b());
        if (mo27065i()) {
            this.f47108a.mo27694a(false);
            m37893k();
        }
    }

    /* renamed from: i */
    public final synchronized boolean mo27065i() {
        return this.f47108a.f48137f;
    }

    /* renamed from: j */
    public final synchronized boolean mo27066j() {
        return this.f47117k;
    }

    public final String toString() {
        return String.format("QueuedAction[%s, %s]", this.f47108a, this.f47113g);
    }

    /* renamed from: a */
    public final void mo27051a() {
        vfb vfb = this.f47110c;
        if (vfb != null) {
            vfb.mo28378f();
            this.f47110c = null;
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo27058b(ube ube) {
        boolean z;
        sdo.m34970a(!this.f47109b.mo27382b());
        this.f47109b.mo27435d();
        try {
            if (ube.mo27059c() == 0) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
            long j = this.f47108a.f48366m;
            long j2 = ube.f47108a.f48366m;
            this.f47113g.f46966a.mo26878a(ube.mo27057b(), this.f47109b, j);
            this.f47108a.mo27693a(this.f47113g.mo26926a().toString());
            this.f47108a.mo27725t();
            vpb.m40986a(this.f47109b, mo27057b().mo26877a(), j2, j);
            ube.f47108a.mo27726u();
            ube.mo27051a();
            this.f47109b.mo27442f();
            this.f47109b.mo27439e();
        } catch (JSONException e) {
            f47107d.mo25378c("QueuedAction", "Failed to serialize combination of two serializable actions!", e);
            try {
                this.f47113g = uat.m37850a(this.f47109b, this.f47108a);
            } catch (JSONException e2) {
                f47107d.mo25378c("QueuedAction", "Failed to deserialize an action we had deserialized before!", e2);
            }
            this.f47109b.mo27439e();
            return false;
        } catch (Throwable th) {
            this.f47109b.mo27439e();
            throw th;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo27052a(int i, boolean z) {
        sdo.m34970a(!this.f47109b.mo27382b());
        int i2 = this.f47114h;
        this.f47114h = i;
        if (z && i2 != i) {
            m37894l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo27053a(long j, long j2) {
        boolean z = true;
        sdo.m34970a(!this.f47109b.mo27382b());
        if (this.f47115i == j && this.f47116j == j2) {
            z = false;
        }
        this.f47115i = j;
        this.f47116j = j2;
        if (z) {
            m37894l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo27054a(txu txu) {
        txp txp = this.f47113g.f46967b;
        uhn uhn = txu.f46958a;
        uhn.mo27435d();
        try {
            txp.mo26875a(txu);
            uhn.mo27442f();
        } catch (tzw e) {
            f47107d.mo25378c("QueuedAction", "Failed to undo action.", e);
        } catch (tzx e2) {
            try {
                f47107d.mo25378c("QueuedAction", "Failed to undo action. Unexpected conflict on undo", e2);
            } catch (Throwable th) {
                uhn.mo27439e();
                throw th;
            }
        }
        uhn.mo27439e();
    }

    /* renamed from: a */
    public final boolean mo27055a(Set set) {
        return mo27057b().mo26883a(set);
    }

    /* renamed from: a */
    public final synchronized boolean mo27056a(ube ube) {
        boolean z;
        if (ube.mo27059c() == 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        int i = this.f47114h;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            return false;
        }
        return mo27057b().mo26890b(ube.mo27057b());
    }
}
