package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: aitr */
final /* synthetic */ class aitr implements Runnable {

    /* renamed from: a */
    private final aiug f69725a;

    /* renamed from: b */
    private final aivg f69726b;

    /* renamed from: c */
    private final String f69727c;

    /* renamed from: d */
    private final aivo f69728d;

    public aitr(aiug aiug, aivg aivg, String str, aivo aivo) {
        this.f69725a = aiug;
        this.f69726b = aivg;
        this.f69727c = str;
        this.f69728d = aivo;
    }

    public final void run() {
        aiug aiug = this.f69725a;
        aivg aivg = this.f69726b;
        String str = this.f69727c;
        aivo aivo = this.f69728d;
        byte[] d = aiug.f69778a.mo38105d();
        srn srn = ailf.f69111a;
        ahfi b = ahfi.m55635b(new aity(aiug, aivg, d), cfnv.m140758T() * 1000, aiug.f69782e);
        try {
            bvgz a = aiug.mo38048a(aivg.f69867c, 2);
            if ((a.f156061a & 64) != 0) {
                byte[] k = a.f156065e.mo73780k();
                aivg.f69865a.f69912d = k;
                Arrays.toString(k);
            }
            short a2 = bqct.m112601a(d);
            short a3 = bqct.m112601a(aivg.f69865a.f69912d);
            if (aiug.f69783f.mo38043b(a3)) {
                if (a2 > a3) {
                    aivg e = aiug.f69783f.mo38046e(a3);
                    if (e != null) {
                        e.close();
                    }
                } else {
                    b.mo36396b();
                    aivg.close();
                    return;
                }
            }
            if (!aiug.f69778a.mo38094a(aivg.f69865a, str, new aiuc(aiug, aivg, b, aivo))) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aiug", "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("L2ProtocolRunner failed to host a network");
                b.mo36396b();
                aivg.close();
                aiug.f69783f.mo38044c(a3);
                return;
            }
            new soa(9, new aitz(aiug, aivg, b, a3)).start();
            try {
                bxvd da = bvgz.f156059f.mo74144da();
                bxtx a4 = bxtx.m123261a(aiug.f69778a.mo38105d());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvgz bvgz = (bvgz) da.f164949b;
                a4.getClass();
                bvgz.f156061a |= 64;
                bvgz.f156065e = a4;
                int a5 = aiug.f69783f.mo38038a();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvgz bvgz2 = (bvgz) da.f164949b;
                int i = bvgz2.f156061a | 32;
                bvgz2.f156061a = i;
                bvgz2.f156064d = a5;
                bvgz2.f156062b = 2;
                bvgz2.f156061a = i | 1;
                aiug.m57962a(aivg, (bvgz) da.mo74062i());
            } catch (IOException e2) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("aiug", "a", 249, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("L2ProtocolRunner failed to inform the remote device about the network");
                b.mo36396b();
                aivg.close();
                aiug.f69778a.mo38099b(aivg.f69865a);
                aiug.f69783f.mo38044c(a3);
            }
        } catch (IOException e3) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("aiug", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("L2ProtocolRunner failed to read from the remote device");
            b.mo36396b();
            aivg.close();
        }
    }
}
