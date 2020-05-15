package p000;

import android.content.Context;
import android.net.Uri;
import java.util.List;

/* renamed from: bbcp */
final /* synthetic */ class bbcp implements bqeh {

    /* renamed from: a */
    private final bbda f102348a;

    /* renamed from: b */
    private final bavt f102349b;

    /* renamed from: c */
    private final String f102350c;

    /* renamed from: d */
    private final bavr f102351d;

    /* renamed from: e */
    private final bauy f102352e;

    /* renamed from: f */
    private final bavg f102353f;

    /* renamed from: g */
    private final bavn f102354g;

    /* renamed from: h */
    private final int f102355h;

    /* renamed from: i */
    private final List f102356i;

    /* renamed from: j */
    private final bxvd f102357j;

    public bbcp(bbda bbda, bxvd bxvd, bavt bavt, String str, bavr bavr, bauy bauy, bavg bavg, bavn bavn, int i, List list) {
        this.f102348a = bbda;
        this.f102357j = bxvd;
        this.f102349b = bavt;
        this.f102350c = str;
        this.f102351d = bavr;
        this.f102352e = bauy;
        this.f102353f = bavg;
        this.f102354g = bavn;
        this.f102355h = i;
        this.f102356i = list;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbda bbda = this.f102348a;
        bxvd bxvd = this.f102357j;
        bavt bavt = this.f102349b;
        String str = this.f102350c;
        bavr bavr = this.f102351d;
        bauy bauy = this.f102352e;
        bavg bavg = this.f102353f;
        bavn bavn = this.f102354g;
        int i = this.f102355h;
        List list = this.f102356i;
        int intValue = ((Integer) obj).intValue();
        Context context = bbda.f102391a;
        int a = bavb.m87594a(bavt.f101933e);
        if (a == 0) {
            a = 1;
        }
        Uri a2 = bbfd.m87917a(context, a, str, bbda.f102392b, bbda.f102400j);
        if (a2 == null) {
            bbev.m87905a("%s: Failed to get file uri!", "SharedFileManager");
            bauo a3 = bauq.m87573a();
            a3.f101791a = baup.UNABLE_TO_CREATE_FILE_URI_ERROR;
            return bqga.m112777a((Throwable) a3.mo55987a());
        }
        bavq bavq = bavq.DOWNLOAD_IN_PROGRESS;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bavu bavu = (bavu) bxvd.f164949b;
        bavu bavu2 = bavu.f101935d;
        bavu.f101939c = bavq.f101915g;
        bavu.f101937a |= 2;
        return bqdx.m112674a(bbda.f102393c.mo56080a(bavt, (bavu) bxvd.mo74062i()), new bbcs(bbda, bavg, bauy, bavt, bavr, intValue, a2, bavn, i, list), bbda.f102401k);
    }
}
