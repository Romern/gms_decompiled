package p000;

import android.net.Uri;

/* renamed from: bbea */
final /* synthetic */ class bbea implements bqeh {

    /* renamed from: a */
    private final bbec f102446a;

    /* renamed from: b */
    private final Uri f102447b;

    public bbea(bbec bbec, Uri uri) {
        this.f102446a = bbec;
        this.f102447b = uri;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbec bbec = this.f102446a;
        Uri uri = this.f102447b;
        Void voidR = (Void) obj;
        if (bbeh.m87882a(bbec.f102453c, uri, bbec.f102455e.f101854f)) {
            return bbef.m87874a(bavq.DOWNLOAD_COMPLETE, bbec.f102455e, bbec.f102463m, bbec.f102452b, bbec.f102462l);
        }
        bbev.m87906a("%s: Final file checksum verification failed. %s.", "DeltaFileDownloaderCallbackImpl", uri);
        bauo a = bauq.m87573a();
        a.f101791a = baup.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
        return bqga.m112777a((Throwable) a.mo55987a());
    }
}
