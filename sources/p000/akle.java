package p000;

import android.net.Network;

/* renamed from: akle */
final /* synthetic */ class akle implements aklo {

    /* renamed from: a */
    private final aklk f72190a;

    /* renamed from: b */
    private final Network f72191b;

    public akle(aklk aklk, Network network) {
        this.f72190a = aklk;
        this.f72191b = network;
    }

    /* renamed from: a */
    public final void mo39534a(boolean z) {
        aklk aklk = this.f72190a;
        Network network = this.f72191b;
        if (!z) {
            eoa.m10828c("NetRec", "Did not Receive acknowledgement for network available", new Object[0]);
        }
        new aklh(aklk, network).run();
    }
}
