package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.ActivityRecognitionResult;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Snapshot extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lrz();

    /* renamed from: a */
    public final ActivityRecognitionResult f11719a;

    /* renamed from: b */
    public final BeaconStateImpl f11720b;

    /* renamed from: c */
    public final HeadphoneStateImpl f11721c;

    /* renamed from: d */
    public final Location f11722d;

    /* renamed from: e */
    public final NetworkStateImpl f11723e;

    /* renamed from: f */
    public final DataHolder f11724f;

    /* renamed from: g */
    public final PowerStateImpl f11725g;

    /* renamed from: h */
    public final ScreenStateImpl f11726h;

    /* renamed from: i */
    public final WeatherImpl f11727i;

    /* renamed from: j */
    public final TimeIntervalsImpl f11728j;

    /* renamed from: k */
    public final ContextData f11729k;

    public Snapshot(ActivityRecognitionResult activityRecognitionResult, BeaconStateImpl beaconStateImpl, HeadphoneStateImpl headphoneStateImpl, Location location, NetworkStateImpl networkStateImpl, DataHolder dataHolder, PowerStateImpl powerStateImpl, ScreenStateImpl screenStateImpl, WeatherImpl weatherImpl, TimeIntervalsImpl timeIntervalsImpl, ContextData contextData) {
        this.f11719a = activityRecognitionResult;
        this.f11720b = beaconStateImpl;
        this.f11721c = headphoneStateImpl;
        this.f11722d = location;
        this.f11723e = networkStateImpl;
        this.f11724f = dataHolder;
        this.f11725g = powerStateImpl;
        this.f11726h = screenStateImpl;
        this.f11727i = weatherImpl;
        this.f11728j = timeIntervalsImpl;
        this.f11729k = contextData;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f11719a, i, false);
        see.m35040a(parcel, 3, this.f11720b, i, false);
        see.m35040a(parcel, 4, this.f11721c, i, false);
        see.m35040a(parcel, 5, this.f11722d, i, false);
        see.m35040a(parcel, 6, this.f11723e, i, false);
        see.m35040a(parcel, 7, this.f11724f, i, false);
        see.m35040a(parcel, 8, this.f11725g, i, false);
        see.m35040a(parcel, 9, this.f11726h, i, false);
        see.m35040a(parcel, 10, this.f11727i, i, false);
        see.m35040a(parcel, 11, this.f11728j, i, false);
        see.m35040a(parcel, 12, this.f11729k, i, false);
        see.m35062b(parcel, a);
    }
}
