package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;

/* renamed from: avdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avdw extends avdz {

    /* renamed from: a */
    final /* synthetic */ UdcWriteLocalSettingsRequest f93001a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public avdw(rkb rkb, UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest) {
        super(rkb);
        this.f93001a = udcWriteLocalSettingsRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51177a(avdo avdo) {
        avdo.mo51168a(new avdv(this), this.f93001a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return status;
    }
}
