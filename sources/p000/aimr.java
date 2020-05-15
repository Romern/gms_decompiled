package p000;

import java.io.IOException;
import java.net.ServerSocket;

/* renamed from: aimr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aimr extends soa {

    /* renamed from: a */
    final /* synthetic */ ServerSocket f69202a;

    /* renamed from: b */
    final /* synthetic */ aine f69203b;

    /* renamed from: c */
    final /* synthetic */ ahof f69204c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aimr(aine aine, ahof ahof, ServerSocket serverSocket) {
        super(9);
        this.f69203b = aine;
        this.f69204c = ahof;
        this.f69202a = serverSocket;
    }

    public final void run() {
        while (true) {
            try {
                this.f69203b.mo37706a(this.f69204c, new aiwb(this.f69202a.accept()));
            } catch (IOException e) {
                ails.m57444a(this.f69202a, "WifiDirect", "WifiDirectServerSocket");
                ails.m57447b();
                return;
            }
        }
    }
}
