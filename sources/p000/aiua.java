package p000;

import java.io.IOException;

/* renamed from: aiua */
final /* synthetic */ class aiua implements Runnable {

    /* renamed from: a */
    private final aiuc f69755a;

    /* renamed from: b */
    private final aivg f69756b;

    /* renamed from: c */
    private final String f69757c;

    /* renamed from: d */
    private final int f69758d;

    /* renamed from: e */
    private final ahfi f69759e;

    public aiua(aiuc aiuc, aivg aivg, String str, int i, ahfi ahfi) {
        this.f69755a = aiuc;
        this.f69756b = aivg;
        this.f69757c = str;
        this.f69758d = i;
        this.f69759e = ahfi;
    }

    public final void run() {
        aiuc aiuc = this.f69755a;
        aivg aivg = this.f69756b;
        String str = this.f69757c;
        int i = this.f69758d;
        ahfi ahfi = this.f69759e;
        aiug aiug = aiuc.f69767c;
        try {
            bxvd da = bvgz.f156059f.mo74144da();
            ByteString a = ByteString.m123261a(aiug.f69778a.mo38105d());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvgz bvgz = (bvgz) da.f164949b;
            a.getClass();
            bvgz.f156061a |= 64;
            bvgz.f156065e = a;
            int a2 = aiug.f69783f.mo38038a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvgz bvgz2 = (bvgz) da.f164949b;
            int i2 = bvgz2.f156061a | 32;
            bvgz2.f156061a = i2;
            bvgz2.f156064d = a2;
            bvgz2.f156062b = 3;
            bvgz2.f156061a = i2 | 1;
            bxvd da2 = bvgw.f156053d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvgw bvgw = (bvgw) da2.f164949b;
            str.getClass();
            int i3 = bvgw.f156055a | 1;
            bvgw.f156055a = i3;
            bvgw.f156056b = str;
            bvgw.f156055a = i3 | 2;
            bvgw.f156057c = i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvgz bvgz3 = (bvgz) da.f164949b;
            bvgw bvgw2 = (bvgw) da2.mo74062i();
            bvgw2.getClass();
            bvgz3.f156063c = bvgw2;
            bvgz3.f156061a |= 8;
            aiug.m57962a(aivg, (bvgz) da.mo74062i());
            srn srn = ailf.f69111a;
            aivg.close();
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiug", "a", 268, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("L2ProtocolRunner failed to inform the remote device about the ServerSocket");
            ahfi.mo36396b();
            aivg.close();
            aiug.f69778a.mo38099b(aivg.f69865a);
            aiug.f69783f.mo38044c(bqct.m112601a(aivg.f69865a.f69912d));
        }
    }
}
