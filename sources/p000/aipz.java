package p000;

import java.io.IOException;

/* renamed from: aipz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aipz implements blvq {

    /* renamed from: a */
    final /* synthetic */ aiqb f69472a;

    public aipz(aiqb aiqb) {
        this.f69472a = aiqb;
    }

    /* renamed from: a */
    public final void mo13805a(blvp blvp) {
        aiqb aiqb = this.f69472a;
        aipu aipu = new aipu(this, blvp);
        aiqc aiqc = aiqb.f69473a;
        aiqb.mo37839a(aipu);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo37838b(blvp blvp) {
        aiqb aiqb = this.f69472a;
        aiqc aiqc = aiqb.f69473a;
        if (aiqb.f69476d.get()) {
            blvp.mo66713b();
            return;
        }
        aiqp a = aiqo.m57733a(blvp, new aipv(this, blvp), new aipw(this));
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aipz", "b", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to create an incoming MultiplexBleSocket from connection %s.", blvp.mo66756c());
            return;
        }
        this.f69472a.f69474b.put(blvp.mo66756c(), a);
    }

    /* renamed from: a */
    public final void mo13806a(IOException iOException) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68437a(iOException);
        bnsl.mo68432a("aipz", "a", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("BleServerSocket encountered an error while receiving an incoming connection. Ignoring since this server socket only returns successfully connected sockets.");
    }
}
