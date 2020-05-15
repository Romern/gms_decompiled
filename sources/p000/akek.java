package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: akek */
final /* synthetic */ class akek implements Callable {

    /* renamed from: a */
    private final akgy f71740a;

    /* renamed from: b */
    private final ShareTarget f71741b;

    public akek(akgy akgy, ShareTarget shareTarget) {
        this.f71740a = akgy;
        this.f71741b = shareTarget;
    }

    public final Object call() {
        akgy akgy = this.f71740a;
        ShareTarget shareTarget = this.f71741b;
        akdd i = akgy.mo39411i(shareTarget);
        if (i == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akgy", "t", 2417, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Deny invoked for unknown share target");
            return 35511;
        }
        int i2 = 35510;
        if (cfov.f185185a.mo6606a().mo82305aN()) {
            srn srn = ajvp.f71371a;
            i.mo39250a(new akfc(akgy, ahfi.m55635b(new akfb(i), cfov.m142025A(), akgy.f71937d), shareTarget));
            bxvd da = ajne.f70960c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ajne ajne = (ajne) da.f164949b;
            ajne.f70963b = 2;
            ajne.f70962a |= 1;
            try {
                akgy.m59550a(i, (ajne) da.mo74062i());
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl2.mo68432a("akgy", "t", 2451, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Successfully wrote a rejection response frame");
                i2 = 0;
            } catch (IOException e) {
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl3.mo68437a(e);
                bnsl3.mo68432a("akgy", "t", 2453, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Failed to write the rejection response frame");
            }
        } else {
            i.mo39250a(new akfd(akgy, shareTarget));
            bxvd da2 = ajne.f70960c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ajne ajne2 = (ajne) da2.f164949b;
            ajne2.f70963b = 2;
            ajne2.f70962a |= 1;
            try {
                akgy.m59550a(i, (ajne) da2.mo74062i());
                bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl4.mo68432a("akgy", "t", 2470, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Successfully wrote a rejection response frame");
                i2 = 0;
            } catch (IOException e2) {
                bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl5.mo68437a(e2);
                bnsl5.mo68432a("akgy", "t", 2472, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("Failed to write the rejection response frame");
            }
            i.mo39250a(new akfg(akgy, ahfi.m55635b(new akff(i), cfov.m142025A(), akgy.f71937d), shareTarget));
        }
        ajud k = akgy.mo39415k(shareTarget);
        if (k != null) {
            k.mo38711a(shareTarget, new ajub(8).mo38916a());
        }
        return Integer.valueOf(i2);
    }
}
