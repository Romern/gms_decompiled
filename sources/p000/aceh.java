package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import java.io.IOException;

/* renamed from: aceh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aceh implements acjh {

    /* renamed from: a */
    private final rnt f59640a;

    /* renamed from: b */
    private final Account f59641b;

    /* renamed from: c */
    private final int f59642c;

    /* renamed from: d */
    private final int f59643d;

    /* renamed from: e */
    private final TimeSeriesFootprintsSubscriptionFilter f59644e;

    /* renamed from: f */
    private final SyncStatus f59645f;

    /* renamed from: g */
    private final barb f59646g;

    /* renamed from: h */
    private final bafu f59647h;

    public aceh(rnt rnt, Account account, int i, int i2, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, barb barb, SyncStatus syncStatus, bafu bafu) {
        this.f59640a = rnt;
        this.f59641b = account;
        this.f59642c = i;
        this.f59643d = i2;
        this.f59644e = timeSeriesFootprintsSubscriptionFilter;
        this.f59645f = syncStatus;
        this.f59646g = barb;
        this.f59647h = bafu;
    }

    /* renamed from: a */
    public final void mo32708a() {
        Throwable th;
        bany b;
        Throwable th2;
        try {
            bafv a = this.f59647h.mo55681a(this.f59641b, this.f59642c, this.f59643d);
            try {
                b = a.mo55696c().mo55799b();
                int intValue = ((Integer) this.f59646g.mo32621a()).intValue();
                SyncStatus syncStatus = this.f59645f;
                a.mo55688a(b, acfw.m49037a(this.f59644e), this.f59645f.f80004b * 1000, intValue, syncStatus.f80003a * 1000, syncStatus.f80005c * 1000);
                bxvd da = byjj.f166658c.mo74144da();
                bxvd da2 = byhu.f166512c.mo74144da();
                long j = this.f59645f.f80005c * 1000;
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
                a.mo55691a(b, (byjj) da.mo74062i());
                b.mo55796b();
                b.close();
                if (a != null) {
                    a.close();
                }
                this.f59640a.mo11797a(Status.f30107a);
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
            this.f59640a.mo11797a(new Status(8, e.getMessage()));
        } catch (Throwable th4) {
            bqye.m113761a(th, th4);
        }
    }

    /* renamed from: a */
    public final void mo32709a(Status status) {
        this.f59640a.mo11797a(status);
    }
}
