package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;

/* renamed from: acku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acku implements acjj {

    /* renamed from: a */
    private final Account f60048a;

    /* renamed from: b */
    private final rnt f60049b;

    /* renamed from: c */
    private final baof f60050c;

    public acku(baok baok, String str, Account account, int i, int i2, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter, rnt rnt) {
        this.f60050c = new baof(accu.m48907a(syncPolicy), baok, str, account, bafi.m86741a(i, i2, byhm.SYNC_LATEST_PER_SECONDARY_ID), bafi.m86740a(acfw.m49036a(latestFootprintFilter)));
        this.f60049b = rnt;
        this.f60048a = account;
    }

    /* renamed from: a */
    public final bygz mo32663a() {
        return this.f60050c.f101404a;
    }

    /* renamed from: b */
    public final accl mo32665b() {
        return accl.READ;
    }

    /* renamed from: c */
    public final Account mo32666c() {
        return this.f60048a;
    }

    /* renamed from: d */
    public final boolean mo32667d() {
        return true;
    }

    /* renamed from: e */
    public final void mo32668e() {
        try {
            this.f60050c.mo55833a();
            this.f60049b.mo11797a(Status.f30107a);
        } catch (azzp e) {
            this.f60049b.mo11797a(ackq.m49338a(getClass().getSimpleName(), e));
        }
    }

    /* renamed from: a */
    public final void mo32664a(Status status) {
        this.f60049b.mo11797a(status);
    }

    public acku(baok baok, String str, Account account, int i, int i2, SyncPolicy syncPolicy, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, rnt rnt) {
        bacu a = accu.m48907a(syncPolicy);
        bygz a2 = bafi.m86741a(i, i2, byhm.SYNC_FULL_SNAPSHOT);
        badr a3 = acfw.m49037a(timeSeriesFootprintsSubscriptionFilter);
        bxvd da = bygx.f166401c.mo74144da();
        byjq a4 = bafi.m86743a(a3);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bygx bygx = (bygx) da.f164949b;
        a4.getClass();
        bygx.f166404b = a4;
        bygx.f166403a = 2;
        this.f60050c = new baof(a, baok, str, account, a2, (bygx) da.mo74062i());
        this.f60049b = rnt;
        this.f60048a = account;
    }
}
