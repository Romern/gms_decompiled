package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetSeChipTransactionsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asnw();

    /* renamed from: a */
    List f108379a;

    public GetSeChipTransactionsResponse(List list) {
        this.f108379a = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f108379a, false);
        see.m35062b(parcel, a);
    }
}
