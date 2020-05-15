package p000;

import java.io.IOException;
import java.net.ServerSocket;

/* renamed from: ainp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ainp extends soa {

    /* renamed from: a */
    final String f69268a;

    /* renamed from: b */
    final /* synthetic */ ServerSocket f69269b;

    /* renamed from: c */
    final /* synthetic */ aiof f69270c;

    /* renamed from: d */
    final /* synthetic */ ahoc f69271d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ainp(aiof aiof, int i, ServerSocket serverSocket, ahoc ahoc) {
        super(i);
        this.f69270c = aiof;
        this.f69269b = serverSocket;
        this.f69271d = ahoc;
        aint aint = this.f69270c.f69326g;
        String str = aint.f69286a;
        int i2 = aint.f69290e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("::");
        sb.append(i2);
        this.f69268a = sb.toString();
    }

    public final void run() {
        while (true) {
            try {
                ails.m57439a();
                aiwd aiwd = new aiwd(this.f69269b.accept());
                String str = aiwd.f69126a;
                airo airo = new airo(65);
                if (airr.SUCCESS == this.f69270c.f69325f.mo37908b(airo)) {
                    aiwd.mo37637a(new ainn(this, airo));
                    ahor ahor = this.f69271d.f67649a;
                    ((ahrk) ahor).f67880b.mo36783a(new ahlj(((ahrk) ahor).f67879a.mo36875a(aiwd), aiwd));
                } else {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                    bnsl.mo68432a("ainp", "run", 692, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to create a WifiHotspotSocket because we were unable to register the MediumOperation.");
                    ails.m57440a(aiwd, "WifiHotspot", str);
                    ails.m57447b();
                }
            } catch (IOException e) {
                ails.m57444a(this.f69269b, "WifiHotspot", this.f69268a);
                ails.m57447b();
                return;
            }
        }
    }
}
