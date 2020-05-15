package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: tlw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tlw extends rle {

    /* renamed from: a */
    final /* synthetic */ tiu f46251a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tlw(rkb rkb, tiu tiu) {
        super(tjj.f46189a, rkb);
        this.f46251a = tiu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        super.mo17716a((rkk) obj);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new tlv(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        tmd tmd = (tmd) rjd;
        tiu tiu = this.f46251a;
        tmd.mo25288A();
        tmr tmr = (tmr) tmd.mo25289B();
        tmi tmi = new tmi(null, null, this, null, null);
        ContextManagerClientInfo contextManagerClientInfo = tmd.f46258c;
        tmr.mo9989a(tmi, contextManagerClientInfo.f30678b, contextManagerClientInfo.f30677a, contextManagerClientInfo.f30680d, (ContextDataFilterImpl) tiu);
    }
}
