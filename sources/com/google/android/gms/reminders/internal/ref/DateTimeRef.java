package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.Time;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DateTimeRef extends aotf implements DateTime {

    /* renamed from: f */
    private boolean f107060f = false;

    /* renamed from: g */
    private TimeRef f107061g;

    public DateTimeRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public static boolean m91883a(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo17773f(aotf.m69487b(str, "year"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "month"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "day"), i, i2) && TimeRef.m91971a(dataHolder, i, i2, str) && dataHolder.mo17773f(aotf.m69487b(str, "period"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "date_range"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "absolute_time_ms"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "unspecified_future_time"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "all_day"), i, i2);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new DateTimeEntity(this);
    }

    /* renamed from: c */
    public final Integer mo58630c() {
        return mo46856i(mo46858k("year"));
    }

    /* renamed from: d */
    public final Integer mo58631d() {
        return mo46856i(mo46858k("month"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DateTime)) {
            return false;
        }
        if (this != obj) {
            return DateTimeEntity.m92044a(this, (DateTime) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final Integer mo58633f() {
        return mo46856i(mo46858k("day"));
    }

    /* renamed from: g */
    public final Time mo58634g() {
        if (!this.f107060f) {
            this.f107060f = true;
            this.f107061g = !TimeRef.m91971a(this.f43672a, this.f43673b, this.f83582e, this.f83581d) ? new TimeRef(this.f43672a, this.f43673b, this.f83581d) : null;
        }
        return this.f107061g;
    }

    /* renamed from: h */
    public final Integer mo58635h() {
        return mo46856i(mo46858k("period"));
    }

    public final int hashCode() {
        return DateTimeEntity.m92043a(this);
    }

    /* renamed from: i */
    public final Integer mo58636i() {
        return mo46856i(mo46858k("date_range"));
    }

    /* renamed from: j */
    public final Long mo58637j() {
        return mo46855h(mo46858k("absolute_time_ms"));
    }

    /* renamed from: k */
    public final Boolean mo58638k() {
        return Boolean.valueOf(mo25150c(mo46858k("unspecified_future_time")));
    }

    /* renamed from: l */
    public final Boolean mo58639l() {
        return Boolean.valueOf(mo25150c(mo46858k("all_day")));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotn.m69505a(new DateTimeEntity(this), parcel, i);
    }
}
