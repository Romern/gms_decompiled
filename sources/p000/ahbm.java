package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.RenameRequest;

/* renamed from: ahbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ahbm extends dck implements ahbn {
    public ahbm() {
        super("com.google.android.gms.mobstore.IMobStoreFileService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        ahbk ahbk = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
                if (queryLocalInterface instanceof ahbk) {
                    ahbk = (ahbk) queryLocalInterface;
                } else {
                    ahbk = new ahbi(readStrongBinder);
                }
            }
            mo34998a(ahbk, (OpenFileDescriptorRequest) dcl.m8163a(parcel, OpenFileDescriptorRequest.CREATOR));
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
                if (queryLocalInterface2 instanceof ahbk) {
                    ahbk = (ahbk) queryLocalInterface2;
                } else {
                    ahbk = new ahbi(readStrongBinder2);
                }
            }
            mo34997a(ahbk, (DeleteFileRequest) dcl.m8163a(parcel, DeleteFileRequest.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
                if (queryLocalInterface3 instanceof ahbk) {
                    ahbk = (ahbk) queryLocalInterface3;
                } else {
                    ahbk = new ahbi(readStrongBinder3);
                }
            }
            mo34999a(ahbk, (RenameRequest) dcl.m8163a(parcel, RenameRequest.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
