package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.RecurrenceEnd;
import com.google.android.gms.reminders.model.RecurrenceEndEntity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecurrenceEndRef extends aotf implements RecurrenceEnd {

    /* renamed from: f */
    private boolean f107070f = false;

    /* renamed from: g */
    private DateTimeRef f107071g;

    /* renamed from: h */
    private boolean f107072h = false;

    /* renamed from: i */
    private DateTimeRef f107073i;

    public RecurrenceEndRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public static boolean m91921a(DataHolder dataHolder, int i, int i2, String str) {
        return DateTimeRef.m91883a(dataHolder, i, i2, str.concat("recurrence_end_")) && dataHolder.mo17773f(aotf.m69487b(str, "recurrence_end_num_occurrences"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "recurrence_end_auto_renew"), i, i2) && DateTimeRef.m91883a(dataHolder, i, i2, str.concat("recurrence_end_auto_renew_until_"));
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new RecurrenceEndEntity(this);
    }

    /* renamed from: c */
    public final DateTime mo58671c() {
        if (!this.f107070f) {
            this.f107070f = true;
            this.f107071g = !DateTimeRef.m91883a(this.f43672a, this.f43673b, this.f83582e, this.f83581d.concat("recurrence_end_")) ? new DateTimeRef(this.f43672a, this.f43673b, this.f83581d.concat("recurrence_end_")) : null;
        }
        return this.f107071g;
    }

    /* renamed from: d */
    public final Integer mo58672d() {
        return mo46856i(mo46858k("recurrence_end_num_occurrences"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceEnd)) {
            return false;
        }
        if (this != obj) {
            return RecurrenceEndEntity.m92123a(this, (RecurrenceEnd) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo58674f() {
        return Boolean.valueOf(mo25150c(mo46858k("recurrence_end_auto_renew")));
    }

    /* renamed from: g */
    public final DateTime mo58675g() {
        if (!this.f107072h) {
            this.f107072h = true;
            this.f107073i = !DateTimeRef.m91883a(this.f43672a, this.f43673b, this.f83582e, this.f83581d.concat("recurrence_end_auto_renew_until_")) ? new DateTimeRef(this.f43672a, this.f43673b, this.f83581d.concat("recurrence_end_auto_renew_until_")) : null;
        }
        return this.f107073i;
    }

    public final int hashCode() {
        return RecurrenceEndEntity.m92122a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotw.m69513a(new RecurrenceEndEntity(this), parcel, i);
    }
}
