package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ecl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ecl implements aubq {

    /* renamed from: a */
    final /* synthetic */ ecn f14682a;

    public ecl(ecn ecn) {
        this.f14682a = ecn;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (!aucb.mo50384b() || !((Boolean) aucb.mo50386d()).booleanValue()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("ecl", "a", 197, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[ShushGestureSensor] Nano app not available.");
            return;
        }
        this.f14682a.mo9960a(ecn.m10109a(1, ByteBuffer.allocate(36).order(ByteOrder.LITTLE_ENDIAN).putFloat((float) cdid.f180932a.mo6606a().mo77642i()).putFloat((float) cdid.f180932a.mo6606a().mo77634a()).putFloat((float) cdid.f180932a.mo6606a().mo77636c()).putFloat((float) cdid.f180932a.mo6606a().mo77638e()).putFloat((float) cdid.f180932a.mo6606a().mo77635b()).putFloat((float) cdid.f180932a.mo6606a().mo77639f()).putFloat((float) cdid.f180932a.mo6606a().mo77644k()).putFloat((float) cdid.f180932a.mo6606a().mo77643j()).putFloat((float) cdid.f180932a.mo6606a().mo77641h()).array()));
    }
}
