package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceInfo;
import com.google.android.gms.reminders.model.RecurrenceInfoEntity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecurrenceInfoRef extends aotf implements RecurrenceInfo {

    /* renamed from: f */
    private boolean f107074f = false;

    /* renamed from: g */
    private RecurrenceRef f107075g;

    public RecurrenceInfoRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new RecurrenceInfoEntity(this);
    }

    /* renamed from: c */
    public final Recurrence mo58677c() {
        if (!this.f107074f) {
            this.f107074f = true;
            this.f107075g = !RecurrenceRef.m91932a(this.f43672a, this.f43673b, this.f83582e, this.f83581d) ? new RecurrenceRef(this.f43672a, this.f43673b, this.f83581d) : null;
        }
        return this.f107075g;
    }

    /* renamed from: d */
    public final String mo58678d() {
        return mo25151d(mo46858k("recurrence_id"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceInfo)) {
            return false;
        }
        if (this != obj) {
            return RecurrenceInfoEntity.m92145a(this, (RecurrenceInfo) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo58680f() {
        return Boolean.valueOf(mo25150c(mo46858k("recurrence_master")));
    }

    /* renamed from: g */
    public final Boolean mo58681g() {
        return Boolean.valueOf(mo25150c(mo46858k("recurrence_exceptional")));
    }

    public final int hashCode() {
        return RecurrenceInfoEntity.m92144a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotx.m69514a(new RecurrenceInfoEntity(this), parcel, i);
    }
}
