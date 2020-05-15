package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Time;
import com.google.android.gms.reminders.model.TimeEntity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TimeRef extends aotf implements Time {
    public TimeRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public static boolean m91971a(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo17773f(aotf.m69487b(str, "hour"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "minute"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "second"), i, i2);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new TimeEntity(this);
    }

    /* renamed from: c */
    public final Integer mo58724c() {
        return mo46856i(mo46858k("hour"));
    }

    /* renamed from: d */
    public final Integer mo58725d() {
        return mo46856i(mo46858k("minute"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Time)) {
            return false;
        }
        if (this != obj) {
            return TimeEntity.m92214a(this, (Time) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final Integer mo58727f() {
        return mo46856i(mo46858k("second"));
    }

    public final int hashCode() {
        return TimeEntity.m92213a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aouf.m69523a(new TimeEntity(this), parcel);
    }
}
