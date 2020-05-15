package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RadioState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nvm();

    /* renamed from: a */
    public boolean f29430a;

    /* renamed from: b */
    public boolean f29431b;

    /* renamed from: c */
    public int f29432c;

    /* renamed from: d */
    public RadioStationInfo f29433d;

    /* renamed from: e */
    public List f29434e;

    /* renamed from: f */
    public List f29435f;

    public RadioState(boolean z, boolean z2, int i, RadioStationInfo radioStationInfo, List list, List list2) {
        this.f29430a = z;
        this.f29431b = z2;
        this.f29432c = i;
        this.f29433d = radioStationInfo;
        this.f29434e = list;
        this.f29435f = list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f29430a);
        see.m35051a(parcel, 2, this.f29431b);
        see.m35063b(parcel, 3, this.f29432c);
        see.m35040a(parcel, 4, this.f29433d, i, false);
        see.m35066c(parcel, 5, this.f29434e, false);
        see.m35066c(parcel, 6, this.f29435f, false);
        see.m35062b(parcel, a);
    }
}
