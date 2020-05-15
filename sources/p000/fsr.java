package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.appdatasearch.SectionPayload;

/* renamed from: fsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fsr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SectionPayload[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        SparseArray sparseArray = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                int a = sed.m34997a(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (a != 0) {
                    int readInt2 = parcel.readInt();
                    SparseArray sparseArray2 = new SparseArray(readInt2);
                    for (int i = 0; i < readInt2; i++) {
                        sparseArray2.append(parcel.readInt(), parcel.createByteArray());
                    }
                    parcel.setDataPosition(dataPosition + a);
                    sparseArray = sparseArray2;
                } else {
                    sparseArray = null;
                }
            }
        }
        sed.m34994F(parcel, b);
        return new SectionPayload(sparseArray);
    }
}
