package p000;

import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;

/* renamed from: zcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zcn extends yzx {

    /* renamed from: a */
    final /* synthetic */ String f54920a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zcn(rkb rkb, String str) {
        super(rkb);
        this.f54920a = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.fitness.request.UnclaimBleDeviceRequest.<init>(java.lang.String, zcl):void
     arg types: [java.lang.String, zcs]
     candidates:
      com.google.android.gms.fitness.request.UnclaimBleDeviceRequest.<init>(java.lang.String, android.os.IBinder):void
      com.google.android.gms.fitness.request.UnclaimBleDeviceRequest.<init>(java.lang.String, zcl):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((zbh) ((yzz) rjd).mo25289B()).mo30906a(new UnclaimBleDeviceRequest(this.f54920a, (zcl) new zcs(this)));
    }
}
