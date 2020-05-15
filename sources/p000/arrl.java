package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferOptions;

/* renamed from: arrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class arrl extends dck implements arrm {
    public arrl() {
        super("com.google.android.gms.smartdevice.directtransfer.internal.ITargetDirectTransferService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        arrh arrh;
        arik arik = null;
        arrh arrh2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.smartdevice.directtransfer.internal.IDirectTransferCallback");
                arrh = queryLocalInterface instanceof arrh ? (arrh) queryLocalInterface : new arrf(readStrongBinder);
            } else {
                arrh = null;
            }
            DirectTransferOptions directTransferOptions = (DirectTransferOptions) dcl.m8163a(parcel, DirectTransferOptions.CREATOR);
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
            mo48771a(arrh, directTransferOptions, parcelFileDescriptorArr, arik);
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.smartdevice.directtransfer.internal.IDirectTransferCallback");
                if (queryLocalInterface3 instanceof arrh) {
                    arrh2 = (arrh) queryLocalInterface3;
                } else {
                    arrh2 = new arrf(readStrongBinder3);
                }
            }
            mo48770a(arrh2);
        }
        return true;
    }
}
