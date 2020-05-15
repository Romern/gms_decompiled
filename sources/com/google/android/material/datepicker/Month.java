package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Month implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new bhhl();

    /* renamed from: a */
    public final Calendar f151172a;

    /* renamed from: b */
    public final String f151173b;

    /* renamed from: c */
    public final int f151174c;

    /* renamed from: d */
    public final int f151175d = this.f151172a.get(1);

    /* renamed from: e */
    public final int f151176e = this.f151172a.getMaximum(7);

    /* renamed from: f */
    public final int f151177f = this.f151172a.getActualMaximum(5);

    /* renamed from: g */
    public final long f151178g;

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b = bhhv.m100906b(calendar);
        this.f151172a = b;
        this.f151174c = b.get(2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(bhhv.m100904a());
        this.f151173b = simpleDateFormat.format(this.f151172a.getTime());
        this.f151178g = this.f151172a.getTimeInMillis();
    }

    /* renamed from: a */
    public static Month m117562a() {
        return new Month(bhhv.m100905b());
    }

    /* renamed from: b */
    public final int mo71154b() {
        int firstDayOfWeek = this.f151172a.get(7) - this.f151172a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f151176e : firstDayOfWeek;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Month) {
            Month month = (Month) obj;
            return this.f151174c == month.f151174c && this.f151175d == month.f151175d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f151174c), Integer.valueOf(this.f151175d)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f151175d);
        parcel.writeInt(this.f151174c);
    }

    /* renamed from: a */
    public static Month m117563a(int i, int i2) {
        Calendar c = bhhv.m100907c();
        c.set(1, i);
        c.set(2, i2);
        return new Month(c);
    }

    /* renamed from: b */
    public final int mo71155b(Month month) {
        if (this.f151172a instanceof GregorianCalendar) {
            return ((month.f151175d - this.f151175d) * 12) + (month.f151174c - this.f151174c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* renamed from: a */
    public static Month m117564a(long j) {
        Calendar c = bhhv.m100907c();
        c.setTimeInMillis(j);
        return new Month(c);
    }

    /* renamed from: a */
    public final int compareTo(Month month) {
        return this.f151172a.compareTo(month.f151172a);
    }

    /* renamed from: a */
    public final long mo71153a(int i) {
        Calendar b = bhhv.m100906b(this.f151172a);
        b.set(5, i);
        return b.getTimeInMillis();
    }

    /* renamed from: b */
    public final Month mo71156b(int i) {
        Calendar b = bhhv.m100906b(this.f151172a);
        b.add(2, i);
        return new Month(b);
    }
}
