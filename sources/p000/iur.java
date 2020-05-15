package p000;

import android.accounts.Account;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.util.HashSet;

/* renamed from: iur */
final /* synthetic */ class iur implements Runnable {

    /* renamed from: a */
    private final iuv f21817a;

    public iur(iuv iuv) {
        this.f21817a = iuv;
    }

    public final void run() {
        HashSet<RemoteDevice> hashSet;
        iuv iuv = this.f21817a;
        HashSet<Account> hashSet2 = new HashSet();
        iuy iuy = iuv.f21825a;
        synchronized (iuy.f21838b) {
            hashSet = new HashSet();
            for (ConnectionInfo connectionInfo : iuy.mo13353d()) {
                hashSet.add(connectionInfo.f11124b);
            }
        }
        for (RemoteDevice remoteDevice : hashSet) {
            hashSet2.add(new Account(remoteDevice.f11140d, "com.google"));
        }
        for (Account account : hashSet2) {
            iuv.f21830f.mo13969b(account);
        }
    }
}
