package p000;

import android.content.Context;
import java.util.List;

/* renamed from: bbcu */
final /* synthetic */ class bbcu implements bqeh {

    /* renamed from: a */
    private final bbda f102377a;

    /* renamed from: b */
    private final bavt f102378b;

    /* renamed from: c */
    private final bavg f102379c;

    /* renamed from: d */
    private final List f102380d;

    /* renamed from: e */
    private final int f102381e;

    /* renamed from: f */
    private final int f102382f;

    public bbcu(bbda bbda, bavt bavt, bavg bavg, List list, int i, int i2) {
        this.f102377a = bbda;
        this.f102378b = bavt;
        this.f102379c = bavg;
        this.f102380d = list;
        this.f102381e = i;
        this.f102382f = i2;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbda bbda = this.f102377a;
        bavt bavt = this.f102378b;
        bavg bavg = this.f102379c;
        List list = this.f102380d;
        int i = this.f102381e;
        int i2 = this.f102382f;
        bavu bavu = (bavu) obj;
        if (bavu != null) {
            bavq a = bavq.m87609a(bavu.f101939c);
            if (a == null) {
                a = bavq.NONE;
            }
            if (a == bavq.DOWNLOAD_COMPLETE) {
                Context context = bbda.f102391a;
                int a2 = bavb.m87594a(bavt.f101933e);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (bbfd.m87917a(context, a2, bavu.f101938b, bbda.f102392b, bbda.f102400j) != null) {
                    return bqga.m112775a(bavg);
                }
            }
        }
        return bbda.mo56073a(list, i + 1, i2);
    }
}
