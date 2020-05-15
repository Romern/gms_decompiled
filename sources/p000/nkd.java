package p000;

import android.os.RemoteException;
import java.util.concurrent.Callable;

/* renamed from: nkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nkd implements Callable {

    /* renamed from: a */
    final /* synthetic */ nkq f35882a;

    /* renamed from: b */
    final /* synthetic */ nrf f35883b;

    public nkd(nkq nkq, nrf nrf) {
        this.f35882a = nkq;
        this.f35883b = nrf;
    }

    /* renamed from: a */
    public final Boolean mo20940a() {
        bnsn bnsn = nkq.f35898a;
        this.f35882a.mo20975m();
        for (nkp nkp : this.f35882a.f35904f) {
            if (nkp.f35897b.f12819a == this.f35883b.f12819a) {
                return false;
            }
        }
        try {
            this.f35882a.f35904f.add(new nkp(this.f35882a, this.f35883b));
            return true;
        } catch (RemoteException e) {
            bnsi b = nkq.f35898a.mo68387b();
            b.mo68432a("nkd", "a", 439, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Client already dead?");
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        bnsn bnsn = nkq.f35898a;
        this.f35882a.mo20975m();
        for (nkp nkp : this.f35882a.f35904f) {
            if (nkp.f35897b.f12819a == this.f35883b.f12819a) {
                return false;
            }
        }
        try {
            this.f35882a.f35904f.add(new nkp(this.f35882a, this.f35883b));
            return true;
        } catch (RemoteException e) {
            bnsi b = nkq.f35898a.mo68387b();
            b.mo68432a("nkd", "a", 439, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Client already dead?");
            return false;
        }
    }
}
