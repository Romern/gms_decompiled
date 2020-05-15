package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.SortItem;
import com.google.android.gms.pay.SortOrderInfo;

/* renamed from: algo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class algo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SortOrderInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        SortItem[] sortItemArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                sortItemArr = (SortItem[]) sed.m35004b(parcel, readInt, SortItem.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SortOrderInfo(i, sortItemArr);
    }
}
