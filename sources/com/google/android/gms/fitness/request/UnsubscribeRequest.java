package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UnsubscribeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zfo();

    /* renamed from: a */
    public final DataType f32322a;

    /* renamed from: b */
    public final DataSource f32323b;

    /* renamed from: c */
    public final zcl f32324c;

    public UnsubscribeRequest(DataType dataType, DataSource dataSource, zcl zcl) {
        sdo.m34975b((dataType == null) != (dataSource == null), "Must specify exactly one of dataType and dataSource.");
        this.f32322a = dataType;
        this.f32323b = dataSource;
        this.f32324c = zcl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UnsubscribeRequest)) {
                return false;
            }
            UnsubscribeRequest unsubscribeRequest = (UnsubscribeRequest) obj;
            if (!sdg.m34949a(this.f32323b, unsubscribeRequest.f32323b) || !sdg.m34949a(this.f32322a, unsubscribeRequest.f32322a)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32323b, this.f32322a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32322a, i, false);
        see.m35040a(parcel, 2, this.f32323b, i, false);
        zcl zcl = this.f32324c;
        if (zcl != null) {
            iBinder = zcl.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 3, iBinder);
        see.m35062b(parcel, a);
    }
}
