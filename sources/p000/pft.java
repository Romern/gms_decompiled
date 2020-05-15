package p000;

import com.google.android.gms.cast.CastDevice;

/* renamed from: pft */
final /* synthetic */ class pft implements Runnable {

    /* renamed from: a */
    private final pfu f39044a;

    /* renamed from: b */
    private final String f39045b;

    /* renamed from: c */
    private final String f39046c;

    public pft(pfu pfu, String str, String str2) {
        this.f39044a = pfu;
        this.f39045b = str;
        this.f39046c = str2;
    }

    public final void run() {
        pem pem;
        pfu pfu = this.f39044a;
        String str = this.f39045b;
        String str2 = this.f39046c;
        synchronized (pfu.f39047a.f39069s) {
            pem = (pem) pfu.f39047a.f39069s.get(str);
        }
        if (pem == null) {
            pfv.f39050a.mo23670a("Discarded message for unknown namespace '%s'", str);
            return;
        }
        pfv pfv = pfu.f39047a;
        ptx ptx = pfv.f39050a;
        CastDevice castDevice = pfv.f39067q;
        pem.mo22975a(str2);
    }
}
