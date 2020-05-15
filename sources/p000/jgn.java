package p000;

import android.content.Context;
import com.google.android.gms.auth.managed.DownloadStatusResponse;

/* renamed from: jgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jgn implements Runnable {

    /* renamed from: a */
    private final Context f22428a;

    /* renamed from: b */
    private final long f22429b;

    /* renamed from: c */
    private final jgm f22430c;

    /* renamed from: d */
    private final jhl f22431d;

    public jgn(Context context, jgm jgm, long j) {
        jhl a = jhl.m16704a();
        this.f22428a = context;
        this.f22429b = j;
        sdo.m34959a(jgm);
        this.f22430c = jgm;
        this.f22431d = a;
    }

    public final void run() {
        DownloadStatusResponse a = this.f22431d.mo13739a(this.f22428a, this.f22429b);
        switch (a.f11050b) {
            case 21508:
                jgm jgm = this.f22430c;
                if (!ccge.m129596b()) {
                    jgu jgu = (jgu) jgm;
                    if (!jgu.f22439c) {
                        jgu.mo13719b();
                        return;
                    }
                }
                ((jgu) jgm).mo13718a(101);
                return;
            case 21509:
                this.f22430c.mo13712a();
                return;
            case 21510:
                jgm jgm2 = this.f22430c;
                int i = a.f11051c;
                jgu jgu2 = (jgu) jgm2;
                jgu2.f22440d = 0;
                jgu2.mo13718a(Integer.valueOf(i));
                jgu2.mo13719b();
                return;
            case 21511:
                jgm jgm3 = this.f22430c;
                if (!ccge.m129596b()) {
                    jgu jgu3 = (jgu) jgm3;
                    if (!jgu3.f22439c) {
                        jgu3.mo13719b();
                        return;
                    }
                }
                jgu.f22437a.mo25418e("Download failed.", new Object[0]);
                ((jgu) jgm3).mo13718a(-2);
                return;
            default:
                this.f22430c.mo13712a();
                return;
        }
    }
}
