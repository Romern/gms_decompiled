package p000;

import com.google.android.gms.nearby.messages.Message;

/* renamed from: dza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dza extends aixf {

    /* renamed from: a */
    final /* synthetic */ dzc f14454a;

    public dza(dzc dzc) {
        this.f14454a = dzc;
    }

    /* renamed from: a */
    public final void mo9885a(Message message) {
        this.f14454a.f13883a.mo9435a(new dyy(this, message), dqy.m9123a("BeaconMessageListener_onFound"));
    }

    /* renamed from: b */
    public final void mo9886b(Message message) {
        this.f14454a.f13883a.mo9435a(new dyz(this, message), dqy.m9123a("BeaconMessageListener_onLost"));
    }
}
