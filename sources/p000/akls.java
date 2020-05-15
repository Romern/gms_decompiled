package p000;

import android.net.Network;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;

/* renamed from: akls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akls extends aklq {

    /* renamed from: b */
    private final Network f72220b;

    /* renamed from: c */
    private final qxo f72221c = aknf.m60078b("NetworkAvailableBindLatency");

    /* renamed from: a */
    public final void mo39546a(Messenger messenger, akln akln) {
        this.f72221c.mo24371b();
        aknf.m60075a("NetworkAvailableMessageSent");
        qxo b = aknf.m60078b("NetworkAvailableMessageAckLatency");
        Network network = this.f72220b;
        aklr aklr = new aklr(b, akln);
        Message obtain = Message.obtain();
        obtain.what = 0;
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.net.extra.NETWORK", network);
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(new aklv(aklr));
        messenger.send(obtain);
    }

    public akls(Network network) {
        this.f72220b = network;
    }
}
