package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.ads.internal.request.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0542c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutoClickProtectionConfigurationParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                z = sed.m35006c(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList = sed.m34992D(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new AutoClickProtectionConfigurationParcel(z, arrayList);
    }
}
