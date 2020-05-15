package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DataChangeListenerResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alcy();

    /* renamed from: a */
    public DataChangeListenerType f81453a;

    /* renamed from: b */
    public SmartTapTransmissionData f81454b;

    private DataChangeListenerResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataChangeListenerResponse) {
            DataChangeListenerResponse dataChangeListenerResponse = (DataChangeListenerResponse) obj;
            return sdg.m34949a(this.f81453a, dataChangeListenerResponse.f81453a) && sdg.m34949a(this.f81454b, dataChangeListenerResponse.f81454b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81453a, this.f81454b});
    }

    public DataChangeListenerResponse(DataChangeListenerType dataChangeListenerType, SmartTapTransmissionData smartTapTransmissionData) {
        this.f81453a = dataChangeListenerType;
        this.f81454b = smartTapTransmissionData;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81453a, i, false);
        see.m35040a(parcel, 2, this.f81454b, i, false);
        see.m35062b(parcel, a);
    }
}
