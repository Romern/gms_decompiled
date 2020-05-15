package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;

/* renamed from: zco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zco extends yzx {
    public zco(rkb rkb) {
        super(rkb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((zbh) ((yzz) rjd).mo25289B()).mo30903a(new ListClaimedBleDevicesRequest((zcv) new zcu(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return BleDevicesResult.m23710a(status);
    }
}
