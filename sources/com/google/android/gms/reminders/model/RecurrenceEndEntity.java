package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecurrenceEndEntity extends AbstractSafeParcelable implements RecurrenceEnd {
    public static final Parcelable.Creator CREATOR = new aotw();

    /* renamed from: a */
    public final DateTimeEntity f107154a;

    /* renamed from: b */
    public final Integer f107155b;

    /* renamed from: c */
    public final Boolean f107156c;

    /* renamed from: d */
    public final DateTimeEntity f107157d;

    public RecurrenceEndEntity(DateTime dateTime, Integer num, Boolean bool, DateTime dateTime2, boolean z) {
        this.f107155b = num;
        this.f107156c = bool;
        if (z) {
            this.f107154a = (DateTimeEntity) dateTime;
            this.f107157d = (DateTimeEntity) dateTime2;
            return;
        }
        DateTimeEntity dateTimeEntity = null;
        this.f107154a = dateTime != null ? new DateTimeEntity(dateTime) : null;
        this.f107157d = dateTime2 != null ? new DateTimeEntity(dateTime2) : dateTimeEntity;
    }

    /* renamed from: a */
    public static int m92122a(RecurrenceEnd recurrenceEnd) {
        return Arrays.hashCode(new Object[]{recurrenceEnd.mo58671c(), recurrenceEnd.mo58672d(), recurrenceEnd.mo58674f(), recurrenceEnd.mo58675g()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final DateTime mo58671c() {
        return this.f107154a;
    }

    /* renamed from: d */
    public final Integer mo58672d() {
        return this.f107155b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceEnd)) {
            return false;
        }
        if (this != obj) {
            return m92123a(this, (RecurrenceEnd) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo58674f() {
        return this.f107156c;
    }

    /* renamed from: g */
    public final DateTime mo58675g() {
        return this.f107157d;
    }

    public final int hashCode() {
        return m92122a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotw.m69513a(this, parcel, i);
    }

    /* renamed from: a */
    public static boolean m92123a(RecurrenceEnd recurrenceEnd, RecurrenceEnd recurrenceEnd2) {
        return sdg.m34949a(recurrenceEnd.mo58671c(), recurrenceEnd2.mo58671c()) && sdg.m34949a(recurrenceEnd.mo58672d(), recurrenceEnd2.mo58672d()) && sdg.m34949a(recurrenceEnd.mo58674f(), recurrenceEnd2.mo58674f()) && sdg.m34949a(recurrenceEnd.mo58675g(), recurrenceEnd2.mo58675g());
    }

    public RecurrenceEndEntity(DateTimeEntity dateTimeEntity, Integer num, Boolean bool, DateTimeEntity dateTimeEntity2) {
        this.f107154a = dateTimeEntity;
        this.f107155b = num;
        this.f107156c = bool;
        this.f107157d = dateTimeEntity2;
    }

    public RecurrenceEndEntity(RecurrenceEnd recurrenceEnd) {
        this(recurrenceEnd.mo58671c(), recurrenceEnd.mo58672d(), recurrenceEnd.mo58674f(), recurrenceEnd.mo58675g(), false);
    }
}
