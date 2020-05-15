package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.RecurrenceStart;
import com.google.android.gms.reminders.model.RecurrenceStartEntity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecurrenceStartRef extends aotf implements RecurrenceStart {

    /* renamed from: f */
    private boolean f107088f = false;

    /* renamed from: g */
    private DateTimeRef f107089g;

    public RecurrenceStartRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public static boolean m91942a(DataHolder dataHolder, int i, int i2, String str) {
        return DateTimeRef.m91883a(dataHolder, i, i2, str.concat("recurrence_start_"));
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new RecurrenceStartEntity(this);
    }

    /* renamed from: c */
    public final DateTime mo58693c() {
        if (!this.f107088f) {
            this.f107088f = true;
            this.f107089g = !DateTimeRef.m91883a(this.f43672a, this.f43673b, this.f83582e, this.f83581d.concat("recurrence_start_")) ? new DateTimeRef(this.f43672a, this.f43673b, this.f83581d.concat("recurrence_start_")) : null;
        }
        return this.f107089g;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceStart)) {
            return false;
        }
        if (this != obj) {
            return RecurrenceStartEntity.m92153a(this, (RecurrenceStart) obj);
        }
        return true;
    }

    public final int hashCode() {
        return RecurrenceStartEntity.m92152a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aoty.m69515a(new RecurrenceStartEntity(this), parcel, i);
    }
}
