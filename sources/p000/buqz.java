package p000;

import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.concurrent.TimeUnit;

/* renamed from: buqz */
public final /* synthetic */ class buqz implements Runnable {

    /* renamed from: a */
    private final burc f154749a;

    /* renamed from: b */
    private final long f154750b;

    /* renamed from: c */
    private final bqgy f154751c;

    public buqz(burc burc, long j, bqgy bqgy) {
        this.f154749a = burc;
        this.f154750b = j;
        this.f154751c = bqgy;
    }

    public final void run() {
        burc burc = this.f154749a;
        long j = this.f154750b;
        bqgy bqgy = this.f154751c;
        try {
            burc.f154754b.await(j, TimeUnit.MILLISECONDS);
            synchronized (burc) {
                burx burx = burc.f154753a;
                if (burx == null) {
                    bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
                    bnsl.mo68432a("burc", "a", 148, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("getFirmwareUpdatableItems fail because deviceStatusService is null!");
                    bqgy.mo69138b((Object) null);
                } else {
                    bqgy.mo69138b(burx.mo73072a());
                }
            }
        } catch (RemoteException | InterruptedException e) {
            bnsl bnsl2 = (bnsl) busr.f154819a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("burc", "a", (int) MfiClientException.TYPE_NO_ACCOUNT_INFO, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("getFirmwareUpdatableItems meet exception!");
            bqgy.mo69138b((Object) null);
        }
    }
}
