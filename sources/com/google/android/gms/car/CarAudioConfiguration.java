package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarAudioConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new njb();

    /* renamed from: a */
    public int f29280a;

    /* renamed from: b */
    public int f29281b;

    /* renamed from: c */
    public int f29282c;

    public CarAudioConfiguration(int i, int i2, int i3) {
        this.f29280a = i;
        this.f29281b = i2;
        this.f29282c = i3;
    }

    public final String toString() {
        String name = getClass().getName();
        int i = this.f29280a;
        int i2 = this.f29281b;
        int i3 = this.f29282c;
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 74);
        sb.append(name);
        sb.append("[sampleRate=");
        sb.append(i);
        sb.append(",channelConfig=");
        sb.append(i2);
        sb.append(",audioFormat=");
        sb.append(i3);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f29280a);
        see.m35063b(parcel, 2, this.f29281b);
        see.m35063b(parcel, 3, this.f29282c);
        see.m35062b(parcel, a);
    }
}
