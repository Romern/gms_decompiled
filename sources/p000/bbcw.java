package p000;

import android.content.Context;

/* renamed from: bbcw */
final /* synthetic */ class bbcw implements bqeh {

    /* renamed from: a */
    private final bbda f102384a;

    /* renamed from: b */
    private final bavt f102385b;

    public bbcw(bbda bbda, bavt bavt) {
        this.f102384a = bbda;
        this.f102385b = bavt;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbda bbda = this.f102384a;
        bavt bavt = this.f102385b;
        bavu bavu = (bavu) obj;
        if (bavu == null) {
            bbev.m87906a("%s: getOnDeviceUri called on file that doesn't exists. Key = %s!", "SharedFileManager", bavt);
            return bqga.m112777a((Throwable) new bbdb());
        }
        Context context = bbda.f102391a;
        int a = bavb.m87594a(bavt.f101933e);
        if (a == 0) {
            a = 1;
        }
        return bqga.m112775a(bbfd.m87917a(context, a, bavu.f101938b, bbda.f102392b, bbda.f102400j));
    }
}
