package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferConfigurations;

/* renamed from: arrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class arrj extends dck implements arrk {
    public arrj() {
        super("com.google.android.gms.smartdevice.directtransfer.internal.ISourceDirectTransferService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        arrh arrh;
        arik arik = null;
        arrh arrh2 = null;
        arrh arrh3 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.smartdevice.directtransfer.internal.IDirectTransferCallback");
                arrh = queryLocalInterface instanceof arrh ? (arrh) queryLocalInterface : new arrf(readStrongBinder);
            } else {
                arrh = null;
            }
            DirectTransferConfigurations directTransferConfigurations = (DirectTransferConfigurations) dcl.m8163a(parcel, DirectTransferConfigurations.CREATOR);
            ParcelFileDescriptor[] parcelFileDescriptorArr = (ParcelFileDescriptor[]) parcel.createTypedArray(ParcelFileDescriptor.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener");
                if (queryLocalInterface2 instanceof arik) {
                    arik = (arik) queryLocalInterface2;
                } else {
                    arik = new arif(readStrongBinder2);
                }
            }
            mo48765a(arrh, directTransferConfigurations, parcelFileDescriptorArr, arik);
        } else if (i == 2) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.smartdevice.directtransfer.internal.IDirectTransferCallback");
                if (queryLocalInterface3 instanceof arrh) {
                    arrh3 = (arrh) queryLocalInterface3;
                } else {
                    arrh3 = new arrf(readStrongBinder3);
                }
            }
            mo48763a(arrh3);
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.smartdevice.directtransfer.internal.IDirectTransferCallback");
                if (queryLocalInterface4 instanceof arrh) {
                    arrh2 = (arrh) queryLocalInterface4;
                } else {
                    arrh2 = new arrf(readStrongBinder4);
                }
            }
            mo48764a(arrh2, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        }
        return true;
    }
}
