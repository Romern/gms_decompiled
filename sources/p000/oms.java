package p000;

import com.google.android.gms.car.telemetry.testing.FakeLogEvent;

/* renamed from: oms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oms {

    /* renamed from: a */
    public final FakeLogEvent f37955a;

    /* renamed from: b */
    public final /* synthetic */ omt f37956b;

    public oms(omt omt, byte[] bArr) {
        this.f37956b = omt;
        FakeLogEvent fakeLogEvent = new FakeLogEvent();
        this.f37955a = fakeLogEvent;
        fakeLogEvent.f29520a = omt.f37957a;
        fakeLogEvent.f29521b = null;
        fakeLogEvent.f29524e = System.currentTimeMillis();
        this.f37955a.f29523d = bArr;
    }
}
