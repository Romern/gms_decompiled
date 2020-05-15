package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecurrenceStartEntity extends AbstractSafeParcelable implements RecurrenceStart {
    public static final Parcelable.Creator CREATOR = new aoty();

    /* renamed from: a */
    public final DateTimeEntity f107170a;

    public RecurrenceStartEntity(DateTimeEntity dateTimeEntity) {
        this.f107170a = dateTimeEntity;
    }

    /* renamed from: a */
    public static int m92152a(RecurrenceStart recurrenceStart) {
        return Arrays.hashCode(new Object[]{recurrenceStart.mo58693c()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final DateTime mo58693c() {
        return this.f107170a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceStart)) {
            return false;
        }
        if (this != obj) {
            return m92153a(this, (RecurrenceStart) obj);
        }
        return true;
    }

    public final int hashCode() {
        return m92152a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aoty.m69515a(this, parcel, i);
    }

    public RecurrenceStartEntity(RecurrenceStart recurrenceStart) {
        DateTime c = recurrenceStart.mo58693c();
        this.f107170a = c != null ? new DateTimeEntity(c) : null;
    }

    /* renamed from: a */
    public static boolean m92153a(RecurrenceStart recurrenceStart, RecurrenceStart recurrenceStart2) {
        return sdg.m34949a(recurrenceStart.mo58693c(), recurrenceStart2.mo58693c());
    }
}
