package p000;

import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import com.google.android.gms.nearby.messages.internal.Update;

/* renamed from: ahrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahrw extends buqn {

    /* renamed from: a */
    final /* synthetic */ Update f67905a;

    /* renamed from: b */
    final /* synthetic */ ahrx f67906b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahrw(ahrx ahrx, String str, Update update) {
        super(str);
        this.f67906b = ahrx;
        this.f67905a = update;
    }

    public final void run() {
        if (this.f67905a.mo44364a(2)) {
            this.f67906b.f67907a.f67911a.mo37370a(this.f67905a.f80795c);
            return;
        }
        Update update = this.f67905a;
        NearbyDevice nearbyDevice = update.f80798f;
        this.f67906b.f67907a.f67911a.mo37371a(update.f80795c, nearbyDevice != null ? nearbyDevice.f80713d : null, update.f80797e, update.f80799g);
    }
}
