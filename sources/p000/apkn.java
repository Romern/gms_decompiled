package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.util.Log;
import java.util.Collection;

/* renamed from: apkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apkn extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final int f84617a;

    /* renamed from: b */
    boolean f84618b = false;

    /* renamed from: c */
    final /* synthetic */ apko f84619c;

    /* renamed from: d */
    private final Collection f84620d;

    public apkn(apko apko, int i, Collection collection) {
        this.f84619c = apko;
        this.f84617a = i;
        this.f84620d = collection;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List, java.util.Collection], assign insn: 0x0027: IGET  (r1v6 ? I:java.util.Collection) = (r6v0 'this' apkn A[THIS]) apkn.d java.util.Collection */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47368a(ConnectivityManager connectivityManager) {
        boolean z;
        if (connectivityManager != null) {
            boolean z2 = this.f84618b;
            apko apko = this.f84619c;
            int i = this.f84617a;
            if ((apko.f84621a & i) != i) {
                z = false;
            } else {
                z = true;
            }
            if (z2 != z) {
                if (!z2) {
                    NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addCapability(14).addCapability(12);
                    ? r1 = this.f84620d;
                    int size = r1.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        addCapability.addCapability(((Integer) r1.get(i2)).intValue());
                    }
                    connectivityManager.requestNetwork(addCapability.build(), this);
                } else {
                    connectivityManager.unregisterNetworkCallback(this);
                }
                this.f84618b = !this.f84618b;
                return;
            }
            return;
        }
        Log.w("NetworkScheduler", "ConnectivityManager unavailable, not updating network listener");
    }

    public final void onAvailable(Network network) {
        synchronized (this.f84619c) {
            apko apko = this.f84619c;
            apko.f84621a = (this.f84617a ^ -1) & apko.f84621a;
            mo47368a(apko.mo47370a());
            apht.m70315a().f84404d.mo16943a();
        }
    }
}
