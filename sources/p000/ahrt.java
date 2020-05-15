package p000;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;

/* renamed from: ahrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahrt extends buqn {

    /* renamed from: a */
    final /* synthetic */ Message f67897a;

    /* renamed from: b */
    final /* synthetic */ NearbyDevice f67898b;

    /* renamed from: c */
    final /* synthetic */ ahrx f67899c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahrt(ahrx ahrx, String str, Message message, NearbyDevice nearbyDevice) {
        super(str);
        this.f67899c = ahrx;
        this.f67897a = message;
        this.f67898b = nearbyDevice;
    }

    public final void run() {
        this.f67899c.f67907a.f67911a.mo37371a(this.f67897a, this.f67898b.f80713d, null, null);
    }
}
