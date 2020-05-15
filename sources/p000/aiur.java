package p000;

import java.io.IOException;
import java.net.ServerSocket;

/* renamed from: aiur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiur extends soa {

    /* renamed from: a */
    final /* synthetic */ ServerSocket f69813a;

    /* renamed from: b */
    final /* synthetic */ aivw f69814b;

    /* renamed from: c */
    final /* synthetic */ aivd f69815c;

    /* renamed from: d */
    final /* synthetic */ aiuc f69816d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiur(aivd aivd, int i, ServerSocket serverSocket, aivw aivw, aiuc aiuc) {
        super(i);
        this.f69815c = aivd;
        this.f69813a = serverSocket;
        this.f69814b = aivw;
        this.f69816d = aiuc;
    }

    public final void run() {
        ServerSocket serverSocket;
        try {
            aivx aivx = new aivx(this.f69813a.accept());
            aivx.mo37637a(new aiuq(this, this.f69814b));
            aiuc aiuc = this.f69816d;
            aiuc.f69767c.mo38053a(new aiub(aiuc, aiuc.f69765a, aivx, aiuc.f69768d, aiuc.f69766b));
            serverSocket = this.f69813a;
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiur", "run", 647, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("WiFi Aware ServerSocket failed to accept any incoming connections.");
            serverSocket = this.f69813a;
        } catch (Throwable th) {
            ails.m57444a(this.f69813a, "WifiAware", "ServerSocket");
            ails.m57447b();
            throw th;
        }
        ails.m57444a(serverSocket, "WifiAware", "ServerSocket");
        ails.m57447b();
    }
}
