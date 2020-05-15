package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator CREATOR = new bhgp();

    /* renamed from: a */
    private final long f151170a;

    public DateValidatorPointForward(long j) {
        this.f151170a = j;
    }

    /* renamed from: a */
    public static DateValidatorPointForward m117558a() {
        return new DateValidatorPointForward(Long.MIN_VALUE);
    }

    /* renamed from: a */
    public final boolean mo71130a(long j) {
        return j >= this.f151170a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DateValidatorPointForward) && this.f151170a == ((DateValidatorPointForward) obj).f151170a;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f151170a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f151170a);
    }
}
