package com.google.android.gms.auth.authzen;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ifk();

    /* renamed from: a */
    final int f10376a;

    /* renamed from: b */
    public final List f10377b;

    public DeviceData(int i, List list) {
        this.f10376a = i;
        this.f10377b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f10377b, false);
        see.m35063b(parcel, 10000, this.f10376a);
        see.m35062b(parcel, a);
    }
}
