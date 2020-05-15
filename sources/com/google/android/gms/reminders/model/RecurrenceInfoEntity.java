package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecurrenceInfoEntity extends AbstractSafeParcelable implements RecurrenceInfo {
    public static final Parcelable.Creator CREATOR = new aotx();

    /* renamed from: a */
    public final RecurrenceEntity f107166a;

    /* renamed from: b */
    public final String f107167b;

    /* renamed from: c */
    public final Boolean f107168c;

    /* renamed from: d */
    public final Boolean f107169d;

    public RecurrenceInfoEntity(RecurrenceEntity recurrenceEntity, String str, Boolean bool, Boolean bool2) {
        this.f107166a = recurrenceEntity;
        this.f107167b = str;
        this.f107168c = bool;
        this.f107169d = bool2;
    }

    /* renamed from: a */
    public static int m92144a(RecurrenceInfo recurrenceInfo) {
        return Arrays.hashCode(new Object[]{recurrenceInfo.mo58677c(), recurrenceInfo.mo58678d(), recurrenceInfo.mo58680f(), recurrenceInfo.mo58681g()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final Recurrence mo58677c() {
        return this.f107166a;
    }

    /* renamed from: d */
    public final String mo58678d() {
        return this.f107167b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceInfo)) {
            return false;
        }
        if (this != obj) {
            return m92145a(this, (RecurrenceInfo) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo58680f() {
        return this.f107168c;
    }

    /* renamed from: g */
    public final Boolean mo58681g() {
        return this.f107169d;
    }

    public final int hashCode() {
        return m92144a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotx.m69514a(this, parcel, i);
    }

    public RecurrenceInfoEntity(RecurrenceInfo recurrenceInfo) {
        Recurrence c = recurrenceInfo.mo58677c();
        String d = recurrenceInfo.mo58678d();
        Boolean f = recurrenceInfo.mo58680f();
        Boolean g = recurrenceInfo.mo58681g();
        this.f107167b = d;
        this.f107168c = f;
        this.f107169d = g;
        this.f107166a = c != null ? new RecurrenceEntity(c) : null;
    }

    /* renamed from: a */
    public static boolean m92145a(RecurrenceInfo recurrenceInfo, RecurrenceInfo recurrenceInfo2) {
        return sdg.m34949a(recurrenceInfo.mo58677c(), recurrenceInfo2.mo58677c()) && sdg.m34949a(recurrenceInfo.mo58678d(), recurrenceInfo2.mo58678d()) && sdg.m34949a(recurrenceInfo.mo58680f(), recurrenceInfo2.mo58680f()) && sdg.m34949a(recurrenceInfo.mo58681g(), recurrenceInfo2.mo58681g());
    }
}
