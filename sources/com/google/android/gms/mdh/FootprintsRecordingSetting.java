package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FootprintsRecordingSetting extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afko();

    /* renamed from: a */
    public final int f79977a;

    /* renamed from: b */
    public final boolean f79978b;

    /* renamed from: c */
    public final boolean f79979c;

    /* renamed from: d */
    public final long f79980d;

    public FootprintsRecordingSetting(int i, boolean z, boolean z2, long j) {
        this.f79977a = i;
        this.f79978b = z;
        this.f79979c = z2;
        this.f79980d = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FootprintsRecordingSetting) {
            FootprintsRecordingSetting footprintsRecordingSetting = (FootprintsRecordingSetting) obj;
            return this.f79977a == footprintsRecordingSetting.f79977a && this.f79978b == footprintsRecordingSetting.f79978b && this.f79979c == footprintsRecordingSetting.f79979c && this.f79980d == footprintsRecordingSetting.f79980d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79977a), Boolean.valueOf(this.f79978b), Boolean.valueOf(this.f79979c), Long.valueOf(this.f79980d)});
    }

    public final String toString() {
        int i = this.f79977a;
        boolean z = this.f79978b;
        boolean z2 = this.f79979c;
        long j = this.f79980d;
        StringBuilder sb = new StringBuilder(124);
        sb.append("FootprintsRecordingSetting{corpusGroup=");
        sb.append(i);
        sb.append(", enabled=");
        sb.append(z);
        sb.append(", unset=");
        sb.append(z2);
        sb.append(", lastModifiedTimeMicros=");
        sb.append(j);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f79977a);
        see.m35051a(parcel, 2, this.f79978b);
        see.m35051a(parcel, 3, this.f79979c);
        see.m35036a(parcel, 4, this.f79980d);
        see.m35062b(parcel, a);
    }
}
