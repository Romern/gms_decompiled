package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.walletp2p.internal.firstparty.CheckRecipientEligibilityRequest;
import java.util.ArrayList;

/* renamed from: axms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axms implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CheckRecipientEligibilityRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                arrayList = sed.m34992D(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList2 = sed.m34992D(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new CheckRecipientEligibilityRequest(arrayList, arrayList2);
    }
}