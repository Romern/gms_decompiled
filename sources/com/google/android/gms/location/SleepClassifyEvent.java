package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SleepClassifyEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeis();

    /* renamed from: a */
    public int f79381a;

    /* renamed from: b */
    public int f79382b;

    /* renamed from: c */
    public int f79383c;

    /* renamed from: d */
    public int f79384d;

    /* renamed from: e */
    public int f79385e;

    /* renamed from: f */
    public int f79386f;

    /* renamed from: g */
    public int f79387g;

    /* renamed from: h */
    public boolean f79388h;

    /* renamed from: i */
    public int f79389i;

    public SleepClassifyEvent(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8) {
        this.f79381a = i;
        this.f79382b = i2;
        this.f79383c = i3;
        this.f79384d = i4;
        this.f79385e = i5;
        this.f79386f = i6;
        this.f79387g = i7;
        this.f79388h = z;
        this.f79389i = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SleepClassifyEvent) {
            SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
            return this.f79381a == sleepClassifyEvent.f79381a && this.f79382b == sleepClassifyEvent.f79382b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79381a), Integer.valueOf(this.f79382b)});
    }

    public final String toString() {
        int i = this.f79381a;
        int i2 = this.f79382b;
        int i3 = this.f79383c;
        int i4 = this.f79384d;
        int i5 = this.f79385e;
        int i6 = this.f79386f;
        int i7 = this.f79387g;
        boolean z = this.f79388h;
        int i8 = this.f79389i;
        StringBuilder sb = new StringBuilder(117);
        sb.append(i);
        sb.append(" - ");
        sb.append(i2);
        sb.append(" - ");
        sb.append(i3);
        sb.append(" - ");
        sb.append(i4);
        sb.append(" - ");
        sb.append(i5);
        sb.append(" - ");
        sb.append(i6);
        sb.append(" - ");
        sb.append(i7);
        sb.append(" - ");
        sb.append(z);
        sb.append(" - ");
        sb.append(i8);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f79381a);
        see.m35063b(parcel, 2, this.f79382b);
        see.m35063b(parcel, 3, this.f79383c);
        see.m35063b(parcel, 4, this.f79384d);
        see.m35063b(parcel, 5, this.f79385e);
        see.m35063b(parcel, 6, this.f79386f);
        see.m35063b(parcel, 7, this.f79387g);
        see.m35051a(parcel, 8, this.f79388h);
        see.m35063b(parcel, 9, this.f79389i);
        see.m35062b(parcel, a);
    }
}
