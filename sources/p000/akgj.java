package p000;

import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider$4;
import java.util.Collection;

/* renamed from: akgj */
public final /* synthetic */ class akgj implements Runnable {

    /* renamed from: a */
    private final NearbySharingProvider$4 f71874a;

    public akgj(NearbySharingProvider$4 nearbySharingProvider$4) {
        this.f71874a = nearbySharingProvider$4;
    }

    public final void run() {
        NearbySharingProvider$4 nearbySharingProvider$4 = this.f71874a;
        bnre i = bngx.m109368a((Collection) nearbySharingProvider$4.f81141a.f71934a.keySet()).listIterator();
        while (i.hasNext()) {
            String str = (String) i.next();
            byte[] bArr = (byte[]) nearbySharingProvider$4.f81141a.f71934a.remove(str);
            if (bArr != null) {
                nearbySharingProvider$4.f81141a.mo39268a(str, bArr);
            }
        }
    }
}
