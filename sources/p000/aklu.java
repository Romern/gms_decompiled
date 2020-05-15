package p000;

import android.os.Message;
import android.os.Messenger;

/* renamed from: aklu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aklu extends aklq {

    /* renamed from: b */
    private final qxo f72224b = aknf.m60078b("NetworkLostBindLatency");

    /* renamed from: a */
    public final void mo39546a(Messenger messenger, akln akln) {
        this.f72224b.mo24371b();
        aknf.m60075a("NetworkLostMessageSent");
        aklt aklt = new aklt(aknf.m60078b("NetworkLostMessageAckLatency"), akln);
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.replyTo = new Messenger(new aklv(aklt));
        messenger.send(obtain);
    }
}
