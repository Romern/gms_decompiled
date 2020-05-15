package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bhgl();

    /* renamed from: a */
    public final Month f151164a;

    /* renamed from: b */
    public final Month f151165b;

    /* renamed from: c */
    public final Month f151166c;

    /* renamed from: d */
    public final DateValidator f151167d;

    /* renamed from: e */
    public final int f151168e;

    /* renamed from: f */
    public final int f151169f;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface DateValidator extends Parcelable {
        /* renamed from: a */
        boolean mo71130a(long j);
    }

    public CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator) {
        this.f151164a = month;
        this.f151165b = month2;
        this.f151166c = month3;
        this.f151167d = dateValidator;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3.compareTo(month2) <= 0) {
            this.f151169f = month.mo71155b(month2) + 1;
            this.f151168e = (month2.f151175d - month.f151175d) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarConstraints) {
            CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
            return this.f151164a.equals(calendarConstraints.f151164a) && this.f151165b.equals(calendarConstraints.f151165b) && this.f151166c.equals(calendarConstraints.f151166c) && this.f151167d.equals(calendarConstraints.f151167d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f151164a, this.f151165b, this.f151166c, this.f151167d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f151164a, 0);
        parcel.writeParcelable(this.f151165b, 0);
        parcel.writeParcelable(this.f151166c, 0);
        parcel.writeParcelable(this.f151167d, 0);
    }
}
