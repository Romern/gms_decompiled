package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.view.MultiTransportViewOptions;
import java.util.ArrayList;

/* renamed from: xrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xrp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MultiTransportViewOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                sed.m35000a(parcel, readInt, arrayList, getClass().getClassLoader());
            }
        }
        sed.m34994F(parcel, b);
        return new MultiTransportViewOptions(i, arrayList);
    }
}
