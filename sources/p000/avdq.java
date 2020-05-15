package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.UdcCacheRequest;

/* renamed from: avdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avdq extends avdz {

    /* renamed from: a */
    final /* synthetic */ UdcCacheRequest f92997a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public avdq(rkb rkb, UdcCacheRequest udcCacheRequest) {
        super(rkb);
        this.f92997a = udcCacheRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51177a(avdo avdo) {
        avdo.mo51166a(new avdp(this), this.f92997a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new avec(status, null);
    }
}
