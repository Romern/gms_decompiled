package p000;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;
import com.google.android.gms.nearby.messages.internal.Update;

/* renamed from: ahrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahrx extends aixf {

    /* renamed from: a */
    final /* synthetic */ ahsa f67907a;

    public ahrx(ahsa ahsa) {
        this.f67907a = ahsa;
    }

    /* renamed from: a */
    public final void mo9885a(Message message) {
        if (!cfod.m141152l()) {
            this.f67907a.f67912b.mo72987c(new ahrs(this, "handleMessagesCallback", message));
        }
    }

    /* renamed from: b */
    public final void mo9886b(Message message) {
        if (!cfod.m141152l()) {
            this.f67907a.f67912b.mo72987c(new ahrv(this, "handleMessagesCallback", message));
        }
    }

    /* renamed from: a */
    public final void mo37002a(Message message, NearbyDevice nearbyDevice) {
        if (!cfod.m141152l()) {
            this.f67907a.f67912b.mo72987c(new ahrt(this, "handleMessagesCallback", message, nearbyDevice));
        }
    }

    /* renamed from: a */
    public final void mo37003a(Message message, BleSignalImpl bleSignalImpl) {
        if (!cfod.m141152l()) {
            this.f67907a.f67912b.mo72987c(new ahru(this, "handleMessagesCallback", message, bleSignalImpl));
        }
    }

    /* renamed from: a */
    public final void mo37004a(Update update) {
        if (cfod.m141152l()) {
            this.f67907a.f67912b.mo72987c(new ahrw(this, "handleMessagesCallback", update));
        }
    }
}
