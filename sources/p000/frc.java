package p000;

import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;

/* renamed from: frc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class frc extends rle {

    /* renamed from: a */
    private final GetRecentContextCall$Request f17149a;

    public frc(GetRecentContextCall$Request getRecentContextCall$Request, rkb rkb) {
        super(fqj.f17127a, rkb);
        this.f17149a = getRecentContextCall$Request;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        super.mo17716a((rkk) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        GetRecentContextCall$Response getRecentContextCall$Response = new GetRecentContextCall$Response();
        getRecentContextCall$Response.f9554a = status;
        return getRecentContextCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((ftq) rjd).mo11311e().mo11306a(this.f17149a, new frb(this));
    }
}
