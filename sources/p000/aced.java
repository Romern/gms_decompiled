package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncStatus;
import java.io.IOException;

/* renamed from: aced */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aced implements acjh {

    /* renamed from: a */
    private final rnt f59623a;

    /* renamed from: b */
    private final Account f59624b;

    /* renamed from: c */
    private final int f59625c;

    /* renamed from: d */
    private final int f59626d;

    /* renamed from: e */
    private final LatestFootprintFilter f59627e;

    /* renamed from: f */
    private final SyncStatus f59628f;

    /* renamed from: g */
    private final barb f59629g;

    /* renamed from: h */
    private final bafj f59630h;

    public aced(rnt rnt, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, barb barb, SyncStatus syncStatus, bafj bafj) {
        this.f59623a = rnt;
        this.f59624b = account;
        this.f59625c = i;
        this.f59626d = i2;
        this.f59627e = latestFootprintFilter;
        this.f59628f = syncStatus;
        this.f59629g = barb;
        this.f59630h = bafj;
    }

    /* renamed from: a */
    public final void mo32708a() {
        Throwable th;
        bany b;
        Throwable th2;
        try {
            bafl a = this.f59630h.mo55662a(this.f59624b, this.f59625c, this.f59626d);
            try {
                b = a.mo55677c().mo55799b();
                int intValue = ((Integer) this.f59629g.mo32621a()).intValue();
                SyncStatus syncStatus = this.f59628f;
                a.mo55669a(b, acfw.m49036a(this.f59627e), this.f59628f.f80004b * 1000, intValue, syncStatus.f80003a * 1000, syncStatus.f80005c * 1000);
                bxvd da = byjj.f166658c.mo74144da();
                bxvd da2 = byhu.f166512c.mo74144da();
                long j = this.f59628f.f80005c * 1000;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                byhu byhu = (byhu) da2.f164949b;
                byhu.f166514a |= 1;
                byhu.f166515b = j;
                byhu byhu2 = (byhu) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byjj byjj = (byjj) da.f164949b;
                byhu2.getClass();
                byjj.f166661b = byhu2;
                byjj.f166660a = 2;
                a.mo55671a(b, (byjj) da.mo74062i());
                b.mo55796b();
                b.close();
                if (a != null) {
                    a.close();
                }
                this.f59623a.mo11797a(Status.f30107a);
                return;
            } catch (Throwable th3) {
                th = th3;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
            throw th2;
        } catch (IOException e) {
            this.f59623a.mo11797a(new Status(8, e.getMessage()));
        } catch (Throwable th4) {
            bqye.m113761a(th, th4);
        }
    }

    /* renamed from: a */
    public final void mo32709a(Status status) {
        this.f59623a.mo11797a(status);
    }
}
