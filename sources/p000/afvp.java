package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;

/* renamed from: afvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class afvp extends dck implements afvq {
    public afvp() {
        super("com.google.android.gms.mdisync.internal.IMdiSyncService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        afvo afvo = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
                if (queryLocalInterface instanceof afvo) {
                    afvo = (afvo) queryLocalInterface;
                } else {
                    afvo = new afvo(readStrongBinder);
                }
            }
            mo35037a(afvo, (SyncRequest) dcl.m8163a(parcel, SyncRequest.CREATOR), (CallerInfo) dcl.m8163a(parcel, CallerInfo.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
                if (queryLocalInterface2 instanceof afvo) {
                    afvo = (afvo) queryLocalInterface2;
                } else {
                    afvo = new afvo(readStrongBinder2);
                }
            }
            mo35038a(afvo, (TeleportingSyncRequest) dcl.m8163a(parcel, TeleportingSyncRequest.CREATOR), (CallerInfo) dcl.m8163a(parcel, CallerInfo.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
