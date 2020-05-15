package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.concurrent.Callable;

/* renamed from: par */
final /* synthetic */ class par implements Callable {

    /* renamed from: a */
    private final pbm f38729a;

    /* renamed from: b */
    private final long f38730b;

    /* renamed from: c */
    private final Bundle f38731c;

    public par(pbm pbm, long j, Bundle bundle) {
        this.f38729a = pbm;
        this.f38730b = j;
        this.f38731c = bundle;
    }

    public final Object call() {
        omm omm;
        pbm pbm = this.f38729a;
        long j = this.f38730b;
        Bundle bundle = this.f38731c;
        pbl pbl = pbm.f38787m;
        boolean z = false;
        if (!pbl.f38768a || (omm = pbl.f38774g) == null) {
            bnsi c = pbm.f38775a.mo68388c();
            c.mo68432a("pbm", "b", 404, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("HandoffState is invalid to do a transferForHandoff.");
        } else {
            try {
                omm.mo22296a(j, bundle);
                z = true;
            } catch (RemoteException e) {
                bnsi c2 = pbm.f38775a.mo68388c();
                c2.mo68437a(e);
                c2.mo68432a("pbm", "b", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68405a("Cannot transfer for handoff");
            }
        }
        return Boolean.valueOf(z);
    }
}
