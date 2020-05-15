package p000;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;

/* renamed from: bbec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbec implements bbem {

    /* renamed from: a */
    public final Context f102451a;

    /* renamed from: b */
    public final bbdd f102452b;

    /* renamed from: c */
    public final befa f102453c;

    /* renamed from: d */
    public final bawt f102454d;

    /* renamed from: e */
    public final bauy f102455e;

    /* renamed from: f */
    public final baxa f102456f;

    /* renamed from: g */
    public final bavg f102457g;

    /* renamed from: h */
    public final bbep f102458h;

    /* renamed from: i */
    public final bavr f102459i;

    /* renamed from: j */
    public final int f102460j;

    /* renamed from: k */
    public final bmxv f102461k;

    /* renamed from: l */
    public final Executor f102462l;

    /* renamed from: m */
    public final int f102463m;

    public bbec(Context context, bbdd bbdd, befa befa, bawt bawt, bauy bauy, int i, baxa baxa, bavg bavg, bbep bbep, bavr bavr, int i2, bmxv bmxv, Executor executor) {
        this.f102451a = context;
        this.f102452b = bbdd;
        this.f102453c = befa;
        this.f102454d = bawt;
        this.f102455e = bauy;
        this.f102463m = i;
        this.f102456f = baxa;
        this.f102457g = bavg;
        this.f102458h = bbep;
        this.f102459i = bavr;
        this.f102460j = i2;
        this.f102461k = bmxv;
        this.f102462l = executor;
    }

    /* renamed from: a */
    public final bqgg mo56087a() {
        return bbef.m87874a(bavq.DOWNLOAD_FAILED, this.f102455e, this.f102463m, this.f102452b, this.f102462l);
    }

    /* renamed from: a */
    public final bqgg mo56088a(Uri uri) {
        if (!bbeh.m87882a(this.f102453c, uri, this.f102457g.f101889d)) {
            bbev.m87910b("%s: Downloaded delta file at uri = %s, checksum = %s verification failed", "DeltaFileDownloaderCallbackImpl", uri, this.f102457g.f101889d);
            bauo a = bauq.m87573a();
            a.f101791a = baup.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            return bqga.m112777a((Throwable) a.mo55987a());
        }
        Uri a2 = bbeg.m87877a(uri);
        bxvd da = bavt.f101927g.mo74144da();
        bauv bauv = this.f102457g.f101891f;
        if (bauv == null) {
            bauv = bauv.f101842b;
        }
        String str = bauv.f101844a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bavt bavt = (bavt) da.f164949b;
        str.getClass();
        int i = bavt.f101929a | 4;
        bavt.f101929a = i;
        bavt.f101932d = str;
        bavt.f101933e = this.f102463m - 1;
        bavt.f101929a = i | 8;
        return bqdx.m112674a(bqdx.m112674a(this.f102452b.mo56079a((bavt) da.mo74062i()), new bbeb(this, a2, uri), this.f102462l), new bbea(this, a2), this.f102462l);
    }
}
