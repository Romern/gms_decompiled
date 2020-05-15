package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ptl();

    /* renamed from: a */
    public double f29888a;

    /* renamed from: b */
    public boolean f29889b;

    /* renamed from: c */
    public int f29890c;

    /* renamed from: d */
    public ApplicationMetadata f29891d;

    /* renamed from: e */
    public int f29892e;

    /* renamed from: f */
    public EqualizerSettings f29893f;

    /* renamed from: g */
    public double f29894g;

    public DeviceStatus() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DeviceStatus) {
            DeviceStatus deviceStatus = (DeviceStatus) obj;
            if (this.f29888a == deviceStatus.f29888a && this.f29889b == deviceStatus.f29889b && this.f29890c == deviceStatus.f29890c && ptk.m31236a(this.f29891d, deviceStatus.f29891d) && this.f29892e == deviceStatus.f29892e) {
                EqualizerSettings equalizerSettings = this.f29893f;
                return ptk.m31236a(equalizerSettings, equalizerSettings) && this.f29894g == deviceStatus.f29894g;
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f29888a), Boolean.valueOf(this.f29889b), Integer.valueOf(this.f29890c), this.f29891d, Integer.valueOf(this.f29892e), this.f29893f, Double.valueOf(this.f29894g)});
    }

    public DeviceStatus(double d, boolean z, int i, ApplicationMetadata applicationMetadata, int i2, EqualizerSettings equalizerSettings, double d2) {
        this.f29888a = d;
        this.f29889b = z;
        this.f29890c = i;
        this.f29891d = applicationMetadata;
        this.f29892e = i2;
        this.f29893f = equalizerSettings;
        this.f29894g = d2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35033a(parcel, 2, this.f29888a);
        see.m35051a(parcel, 3, this.f29889b);
        see.m35063b(parcel, 4, this.f29890c);
        see.m35040a(parcel, 5, this.f29891d, i, false);
        see.m35063b(parcel, 6, this.f29892e);
        see.m35040a(parcel, 7, this.f29893f, i, false);
        see.m35033a(parcel, 8, this.f29894g);
        see.m35062b(parcel, a);
    }
}
