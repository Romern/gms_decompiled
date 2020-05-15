package p000;

import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;

/* renamed from: ahee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahee extends roh {

    /* renamed from: c */
    final /* synthetic */ ahdv f67073c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahee(rod rod, ahdv ahdv) {
        super(rod);
        this.f67073c = ahdv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24970a(rjd rjd, aucf aucf) {
        ahdc ahdc = (ahdc) rjd;
        rlf a = ahej.m55617a(aucf);
        ahdv ahdv = this.f67073c;
        ahdc.mo25288A();
        ((ahds) ahdc.mo25289B()).mo36359a(new StartScanRequest(ahdv, ahdo.m55569a(a)));
    }
}
