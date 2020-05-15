package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: bbcx */
final /* synthetic */ class bbcx implements bqeh {

    /* renamed from: a */
    private final bbda f102386a;

    /* renamed from: b */
    private final bavt f102387b;

    public bbcx(bbda bbda, bavt bavt) {
        this.f102386a = bbda;
        this.f102387b = bavt;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbda bbda = this.f102386a;
        bavt bavt = this.f102387b;
        bavu bavu = (bavu) obj;
        if (bavu == null) {
            bbev.m87906a("%s: No file entry with key %s", "SharedFileManager", bavt);
            return bqga.m112775a((Object) false);
        }
        Context context = bbda.f102391a;
        int a = bavb.m87594a(bavt.f101933e);
        if (a == 0) {
            a = 1;
        }
        Uri a2 = bbfd.m87917a(context, a, bavu.f101938b, bbda.f102392b, bbda.f102400j);
        if (a2 != null) {
            bbda.f102394d.mo56091a(a2);
        }
        bbdd bbdd = bbda.f102393c;
        return bqdx.m112674a(bqga.m112775a(Boolean.valueOf(bbfh.m87934a(bbfh.m87928a(bbdd.f102402a, "gms_icing_mdd_shared_files", bbdd.f102404c), bbdd.m87830a(bavt, bbdd.f102402a, bbdd.f102403b)))), new bbcn(bavt), bbda.f102401k);
    }
}
