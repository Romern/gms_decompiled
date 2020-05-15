package p000;

import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: bfpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfpf extends bfph implements IBinder.DeathRecipient {

    /* renamed from: q */
    private final aehw f114758q;

    public bfpf(Context context, int i, String str, LocationRequestInternal locationRequestInternal, boolean z, boolean z2, bfpd bfpd, aehw aehw) {
        super(context, i, str, locationRequestInternal, z, z2, bfpd);
        this.f114758q = aehw;
        try {
            aehw.asBinder().linkToDeath(this, 0);
        } catch (RemoteException e) {
            bfpd.mo62083a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo62084a(LocationAvailability locationAvailability) {
        return 1;
    }

    /* renamed from: a */
    public final boolean mo62086a() {
        return false;
    }

    /* renamed from: b */
    public final void mo62087b() {
        try {
            this.f114758q.asBinder().unlinkToDeath(this, 0);
        } catch (NoSuchElementException e) {
            Log.e("GCoreFlp", "Tried to remove a death link to a binder that didn't exist.");
        }
    }

    public final void binderDied() {
        this.f114779o.mo62083a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo62085a(List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Location location = (Location) it.next();
                if (this.f114765a == spn.f44932a) {
                    location = new Location(location);
                }
                this.f114758q.mo34160a(location);
            }
            return 1;
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("client died while calling listener ");
            sb.append(valueOf);
            Log.e("GCoreFlp", sb.toString());
            return 2;
        }
    }
}
