package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;

/* renamed from: anvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvq extends saf {

    /* renamed from: a */
    private final ConnectionResult f77782a;

    /* renamed from: b */
    private final MomentsFeed f77783b;

    public anvq(anwj anwj, anns anns, ConnectionResult connectionResult, MomentsFeed momentsFeed) {
        super(anwj, anns);
        this.f77782a = connectionResult;
        this.f77783b = momentsFeed;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25280a(Object obj) {
        anns anns = (anns) obj;
        ConnectionResult connectionResult = this.f77782a;
        MomentsFeed momentsFeed = this.f77783b;
        anns.f77221a = connectionResult;
        anns.f77222b = momentsFeed;
        anns.deliverResult(momentsFeed);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25282b() {
    }
}
