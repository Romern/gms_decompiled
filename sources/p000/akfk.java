package p000;

import android.os.SystemClock;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* renamed from: akfk */
final /* synthetic */ class akfk implements Runnable {

    /* renamed from: a */
    private final akgy f71796a;

    /* renamed from: b */
    private final akdd f71797b;

    /* renamed from: c */
    private final ajud f71798c;

    /* renamed from: d */
    private final String f71799d;

    /* renamed from: e */
    private final ShareTarget f71800e;

    /* renamed from: f */
    private final ajnw f71801f;

    public akfk(akgy akgy, akdd akdd, ajud ajud, String str, ShareTarget shareTarget, ajnw ajnw) {
        this.f71796a = akgy;
        this.f71797b = akdd;
        this.f71798c = ajud;
        this.f71799d = str;
        this.f71800e = shareTarget;
        this.f71801f = ajnw;
    }

    public final void run() {
        akgy akgy = this.f71796a;
        akdd akdd = this.f71797b;
        ajud ajud = this.f71798c;
        String str = this.f71799d;
        ShareTarget shareTarget = this.f71800e;
        ajnw ajnw = this.f71801f;
        if (ajnw != null) {
            akgy.f71938e.mo39358a();
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "a", 1915, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Successfully read the response frame");
            ajne ajne = ajnw.f71027d;
            if (ajne == null) {
                ajne = ajne.f70960c;
            }
            ajnv ajnv = ajnv.UNKNOWN_FRAME_TYPE;
            ajnz ajnz = ajnz.UNKNOWN_SECURITY_TYPE;
            akgr akgr = akgr.SUCCESS;
            int b = ajnd.m58878b(ajne.f70963b);
            if (b == 0) {
                b = 1;
            }
            int i = b - 1;
            if (i == 1) {
                akgy.mo39395b(akdd);
                ajvg ajvg = akgy.f71948o;
                long j = akgy.f71953t;
                List b2 = shareTarget.mo44499b();
                bxvd d = ajvh.m59107d(16);
                bxvd da = bvfu.f155922d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvfu bvfu = (bvfu) da.f164949b;
                bvfu.f155924a |= 1;
                bvfu.f155925b = j;
                bvfe a = ajvh.m59104a(b2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvfu bvfu2 = (bvfu) da.f164949b;
                a.getClass();
                bvfu2.f155926c = a;
                bvfu2.f155924a |= 2;
                bvfu bvfu3 = (bvfu) da.mo74062i();
                if (d.f164950c) {
                    d.mo74035c();
                    d.f164950c = false;
                }
                bvgd bvgd = (bvgd) d.f164949b;
                bvgd bvgd2 = bvgd.f155960B;
                bvfu3.getClass();
                bvgd.f155980q = bvfu3;
                bvgd.f155964a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                ajvg.mo38957a(new ajva((bvgd) d.mo74062i()));
                akgy.f71955v = SystemClock.uptimeMillis();
                ajud.mo38711a(shareTarget, new ajub(5).mo38916a());
                akgx akgx = new akgx(akgy, shareTarget, ajud);
                for (ahiq ahiq : akgy.mo39425p(shareTarget)) {
                    akgy.f71940g.mo39291a(str, ahiq, akgx);
                }
                for (ahiq ahiq2 : akgy.mo39427q(shareTarget)) {
                    akgy.f71940g.mo39291a(str, ahiq2, akgx);
                }
                for (ahiq ahiq3 : akgy.mo39428r(shareTarget)) {
                    akgy.f71940g.mo39291a(str, ahiq3, akgx);
                }
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl2.mo68432a("akgy", "a", 1936, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("The connection was accepted. Payloads are now being sent.");
            } else if (i == 2) {
                ajud.mo38711a(shareTarget, new ajub(8).mo38916a());
                akdd.mo39253b();
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl3.mo68432a("akgy", "a", 1941, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("The connection was rejected. The connection has been closed.");
            } else if (i == 3) {
                ajud.mo38711a(shareTarget, new ajub(13).mo38916a());
                akdd.mo39253b();
                bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl4.mo68432a("akgy", "a", 1947, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("The connection was rejected because the remote device does not have enough space for our attachments. The connection has been closed.");
            } else if (i != 4) {
                ajud.mo38711a(shareTarget, new ajub(7).mo38916a());
                akdd.mo39253b();
                bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl5.mo68432a("akgy", "a", 1962, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("The connection failed. The connection has been closed.");
            } else {
                ajud.mo38711a(shareTarget, new ajub(14).mo38916a());
                akdd.mo39253b();
                bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl6.mo68432a("akgy", "a", 1955, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6.mo68405a("The connection was rejected because the remote device does not support the attachments we were sending. The connection has been closed.");
            }
        } else {
            ajud.mo38711a(shareTarget, new ajub(7).mo38916a());
            akdd.mo39253b();
            bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68387b();
            bnsl7.mo68432a("akgy", "a", 1907, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68405a("Failed to read a response from the remote device. Disconnecting.");
        }
    }
}
