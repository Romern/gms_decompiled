package p000;

import java.util.concurrent.Executor;

/* renamed from: bbed */
final /* synthetic */ class bbed implements bqeh {

    /* renamed from: a */
    private final bavt f102464a;

    /* renamed from: b */
    private final bavq f102465b;

    /* renamed from: c */
    private final bbdd f102466c;

    /* renamed from: d */
    private final Executor f102467d;

    public bbed(bavt bavt, bavq bavq, bbdd bbdd, Executor executor) {
        this.f102464a = bavt;
        this.f102465b = bavq;
        this.f102466c = bbdd;
        this.f102467d = executor;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bavt bavt = this.f102464a;
        bavq bavq = this.f102465b;
        bbdd bbdd = this.f102466c;
        Executor executor = this.f102467d;
        bavu bavu = (bavu) obj;
        if (bavu == null) {
            bbev.m87906a("%s: Shared file not found, newFileKey = %s", "DownloaderCallbackImpl", bavt);
            bauo a = bauq.m87573a();
            a.f101791a = baup.SHARED_FILE_NOT_FOUND_ERROR;
            return bqga.m112777a((Throwable) a.mo55987a());
        }
        bxvd bxvd = (bxvd) bavu.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bavu);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bavu bavu2 = (bavu) bxvd.f164949b;
        bavu2.f101939c = bavq.f101915g;
        bavu2.f101937a |= 2;
        return bqdx.m112674a(bbdd.mo56080a(bavt, (bavu) bxvd.mo74062i()), new bbee(bavt), executor);
    }
}
