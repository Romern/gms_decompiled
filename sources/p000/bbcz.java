package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: bbcz */
final /* synthetic */ class bbcz implements bqeh {

    /* renamed from: a */
    private final bbda f102389a;

    /* renamed from: b */
    private final bavt f102390b;

    public bbcz(bbda bbda, bavt bavt) {
        this.f102389a = bbda;
        this.f102390b = bavt;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbda bbda = this.f102389a;
        bavt bavt = this.f102390b;
        bavu bavu = (bavu) obj;
        if (bavu != null) {
            bavq a = bavq.m87609a(bavu.f101939c);
            if (a == null) {
                a = bavq.NONE;
            }
            if (a != bavq.DOWNLOAD_COMPLETE) {
                Context context = bbda.f102391a;
                int a2 = bavb.m87594a(bavt.f101933e);
                if (a2 == 0) {
                    a2 = 1;
                }
                Uri a3 = bbfd.m87917a(context, a2, bavu.f101938b, bbda.f102392b, bbda.f102400j);
                if (a3 != null) {
                    bbda.f102394d.mo56091a(a3);
                }
            }
            return bqga.m112775a((Object) null);
        }
        bbev.m87905a("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
        throw new bbdb();
    }
}
