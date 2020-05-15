package p000;

import java.util.List;

/* renamed from: bbac */
final /* synthetic */ class bbac implements bqeh {

    /* renamed from: a */
    private final List f102198a;

    /* renamed from: b */
    private final bavd f102199b;

    /* renamed from: c */
    private final bavr f102200c;

    public bbac(List list, bavd bavd, bavr bavr) {
        this.f102198a = list;
        this.f102199b = bavd;
        this.f102200c = bavr;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        List list = this.f102198a;
        bavd bavd = this.f102199b;
        bavr bavr = this.f102200c;
        if (((bbau) obj) == bbau.DOWNLOADED) {
            return bqga.m112775a(bavd);
        }
        bbev.m87910b("%s downloadFileGroup %s %s can't finish!", "FileGroupManager", bavr.f101919b, bavr.f101920c);
        baua.m87546a(list, "Failed to download file group %s", bavr.f101919b);
        bbev.m87905a("%s: An unknown error has occurred during download", "FileGroupManager");
        bauo a = bauq.m87573a();
        a.f101791a = baup.UNKNOWN_ERROR;
        throw a.mo55987a();
    }
}
