package p000;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: aphe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aphe extends dck implements aphf {
    public aphe() {
        super("com.google.android.gms.scheduler.IGmsTaskScheduler");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        aphi aphi;
        if (i == 1) {
            Intent intent = (Intent) dcl.m8163a(parcel, Intent.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.scheduler.ISchedulerCallbacks");
                aphi = queryLocalInterface instanceof aphi ? (aphi) queryLocalInterface : new aphg(readStrongBinder);
            } else {
                aphi = null;
            }
            mo47214a(intent, aphi);
        } else if (i != 2) {
            return false;
        } else {
            mo47213a(parcel.readInt());
        }
        return true;
    }
}
