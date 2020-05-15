package p000;

import com.google.android.gms.deviceconnection.service.DeviceConnectionApiService;

/* renamed from: twc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class twc extends tvz implements aaai {

    /* renamed from: a */
    final /* synthetic */ DeviceConnectionApiService f46745a;

    /* renamed from: b */
    private final aaag f46746b;

    /* renamed from: c */
    private final tvo f46747c;

    public twc(DeviceConnectionApiService deviceConnectionApiService, aaag aaag, tvo tvo) {
        this.f46745a = deviceConnectionApiService;
        this.f46746b = aaag;
        this.f46747c = tvo;
    }

    /* renamed from: a */
    public final void mo26832a(tvx tvx) {
        this.f46746b.mo16659a(this.f46745a, new twd(tvx, this.f46747c));
    }

    /* renamed from: a */
    public final void mo26833a(tvx tvx, String[] strArr) {
        boolean z;
        sdo.m34959a(strArr);
        if (strArr.length != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        for (int i = 0; i < strArr.length; i++) {
            sdo.m34977c(strArr[i]);
            sdo.m34970a(!strArr[i].contains(","));
        }
        this.f46746b.mo16659a(this.f46745a, new twe(tvx, this.f46747c, strArr));
    }
}
