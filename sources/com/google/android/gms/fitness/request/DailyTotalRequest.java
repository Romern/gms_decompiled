package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DailyTotalRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zee();

    /* renamed from: a */
    public DataType f32199a;

    /* renamed from: b */
    public final boolean f32200b;

    /* renamed from: c */
    public final zaw f32201c;

    public DailyTotalRequest(IBinder iBinder, DataType dataType, boolean z) {
        zaw zaw;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDailyTotalCallback");
            zaw = queryLocalInterface instanceof zaw ? (zaw) queryLocalInterface : new zaw(iBinder);
        } else {
            zaw = null;
        }
        this.f32201c = zaw;
        this.f32199a = dataType;
        this.f32200b = z;
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[1];
        DataType dataType = this.f32199a;
        if (dataType != null) {
            str = dataType.mo18916a();
        } else {
            str = "null";
        }
        objArr[0] = str;
        return String.format("DailyTotalRequest{%s}", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f32201c.f12819a);
        see.m35040a(parcel, 2, this.f32199a, i, false);
        see.m35051a(parcel, 4, this.f32200b);
        see.m35062b(parcel, a);
    }
}
