package p000;

import com.felicanetworks.sdu.ErrorInfo;
import java.util.ArrayList;

/* renamed from: agbn */
final /* synthetic */ class agbn implements Runnable {

    /* renamed from: a */
    private final agbt f65163a;

    public agbn(agbt agbt) {
        this.f65163a = agbt;
    }

    public final void run() {
        boolean z;
        agbt agbt = this.f65163a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (!agbt.f65181k) {
            try {
                try {
                    arrayList.clear();
                    synchronized (agbt.f65193w) {
                        arrayList.addAll(agbt.f65193w);
                        agbt.f65193w.clear();
                    }
                    if (agbt.f65177g) {
                        arrayList2.clear();
                        synchronized (agbt.f65194x) {
                            arrayList2.addAll(agbt.f65194x);
                            agbt.f65194x.clear();
                        }
                    }
                    agbt.mo35203a(arrayList, agbt.f65182l);
                    agbt.mo35203a(arrayList2, agbt.f65183m);
                    synchronized (agbt.f65193w) {
                        synchronized (agbt.f65194x) {
                            z = false;
                            if (agbt.f65193w.isEmpty() && agbt.f65194x.isEmpty()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.sleep(agbt.f65169b);
                    }
                } catch (InterruptedException e) {
                }
            } finally {
                agbt.f65168a.mo35221a("Send thread stopped.");
                try {
                    agbt.f65182l.mo35191a();
                } catch (Exception e2) {
                    bnsl bnsl = (bnsl) agbt.f65168a.f65218b.mo68387b();
                    bnsl.mo68437a(e2);
                    bnsl.mo68432a("agbt", "b", 391, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to leave the group.");
                }
                try {
                    agbt.f65182l.mo35192b();
                    agbm agbm = agbt.f65183m;
                    if (agbm != null) {
                        agbm.mo35192b();
                    }
                } catch (Exception e3) {
                    bnsl bnsl2 = (bnsl) agbt.f65168a.f65218b.mo68387b();
                    bnsl2.mo68437a(e3);
                    bnsl2.mo68432a("agbt", "b", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Failed to close the mdns socket.");
                }
            }
        }
        try {
        } catch (Exception e4) {
            bnsl bnsl3 = (bnsl) agbt.f65168a.f65218b.mo68387b();
            bnsl3.mo68437a(e4);
            bnsl3.mo68432a("agbt", "b", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed to close the mdns socket.");
        }
    }
}
