package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams;
import com.google.android.gms.walletp2p.internal.zeroparty.Transaction;
import com.google.android.libraries.walletp2p.model.Contact;

/* renamed from: axfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axfl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TransferParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        btsb btsb;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray != null) {
            try {
                btsb = (btsb) GeneratedMessageLite.m124014a(btsb.f150174d, createByteArray);
            } catch (bxwf e) {
                throw new RuntimeException(e);
            }
        } else {
            btsb = null;
        }
        int a = bzvi.m126244a(parcel.readInt());
        if (a != 0) {
            i = a;
        } else {
            i = 1;
        }
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        String readString2 = parcel.readString();
        Contact contact = (Contact) parcel.readParcelable(Contact.class.getClassLoader());
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        String readString3 = parcel.readString();
        Transaction transaction = (Transaction) parcel.readParcelable(Transaction.class.getClassLoader());
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (parcel.readInt() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        TransferParams transferParams = new TransferParams(i, readInt, z, btsb, readString2, z2, readString3, z3);
        transferParams.f110645d = readString;
        transferParams.f110647f = contact;
        transferParams.f110650i = transaction;
        transferParams.f110652k = z4;
        return transferParams;
    }
}
