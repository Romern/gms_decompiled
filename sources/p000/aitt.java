package p000;

import java.io.IOException;
import java.net.InetSocketAddress;

/* renamed from: aitt */
final /* synthetic */ class aitt implements Runnable {

    /* renamed from: a */
    private final aiug f69731a;

    /* renamed from: b */
    private final aivg f69732b;

    /* renamed from: c */
    private final ahfk f69733c;

    /* renamed from: d */
    private final String f69734d;

    /* renamed from: e */
    private final short f69735e;

    /* renamed from: f */
    private final bqgy f69736f;

    public aitt(aiug aiug, aivg aivg, ahfk ahfk, String str, short s, bqgy bqgy) {
        this.f69731a = aiug;
        this.f69732b = aivg;
        this.f69733c = ahfk;
        this.f69734d = str;
        this.f69735e = s;
        this.f69736f = bqgy;
    }

    public final void run() {
        aiug aiug = this.f69731a;
        aivg aivg = this.f69732b;
        ahfk ahfk = this.f69733c;
        String str = this.f69734d;
        short s = this.f69735e;
        bqgy bqgy = this.f69736f;
        byte[] d = aiug.f69778a.mo38105d();
        srn srn = ailf.f69111a;
        ahfi b = ahfi.m55635b(new aitu(aiug, aivg, d), cfnv.m140758T() * 1000, aiug.f69782e);
        ahfk.mo36399a(new aitv(aiug, aivg, d));
        if (ahfk.mo36401b()) {
            aivg.close();
        }
        try {
            bxvd da = bvgz.f156059f.mo74144da();
            bxtx a = bxtx.m123261a(aiug.f69778a.mo38105d());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvgz bvgz = (bvgz) da.f164949b;
            a.getClass();
            bvgz.f156061a |= 64;
            bvgz.f156065e = a;
            int a2 = aiug.f69783f.mo38038a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvgz bvgz2 = (bvgz) da.f164949b;
            int i = bvgz2.f156061a | 32;
            bvgz2.f156061a = i;
            bvgz2.f156064d = a2;
            bvgz2.f156062b = 1;
            bvgz2.f156061a = 1 | i;
            aiug.m57962a(aivg, (bvgz) da.mo74062i());
            ails.m57438a(aiug.f69778a.mo38105d());
            aiug.mo38054b(aivg.f69867c, 3);
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aiug", "a", 382, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Received incoming notice that a Wifi Aware network is available");
            if (aiug.f69778a.mo38093a(aivg.f69865a, str, ahfk)) {
                InetSocketAddress a3 = aiug.f69778a.mo38087a(aivg.f69865a);
                if (a3 != null) {
                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl2.mo68432a("aiug", "a", 403, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Immediately received the ip/port. No need to wait for notice.");
                } else {
                    bvgw bvgw = aiug.mo38054b(aivg.f69867c, 4).f156063c;
                    if (bvgw == null) {
                        bvgw = bvgw.f156053d;
                    }
                    InetSocketAddress inetSocketAddress = new InetSocketAddress(bvgw.f156056b, bvgw.f156057c);
                    bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl3.mo68432a("aiug", "a", 400, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Received incoming notice that a Wifi Aware ServerSocket is available");
                    a3 = inetSocketAddress;
                }
                aivx a4 = aiug.f69778a.mo38086a(aivg.f69865a, a3, ahfk);
                if (a4 != null) {
                    a4.mo37637a(new aitw(aiug, s));
                    bqgy.mo69138b(a4);
                    b.mo36396b();
                    aivg.close();
                    return;
                }
                aiug.f69778a.mo38099b(aivg.f69865a);
                throw new IOException("Failed to connect to the Wifi Aware ServerSocket");
            }
            throw new IOException("Failed to join the Wifi Aware network");
        } catch (IOException e) {
            bqgy.mo69136a((Throwable) e);
        } catch (Throwable th) {
            b.mo36396b();
            aivg.close();
            throw th;
        }
    }
}
