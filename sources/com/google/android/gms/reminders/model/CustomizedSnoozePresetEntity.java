package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CustomizedSnoozePresetEntity extends AbstractSafeParcelable implements CustomizedSnoozePreset {
    public static final Parcelable.Creator CREATOR = new aotk();

    /* renamed from: a */
    public final TimeEntity f107119a;

    /* renamed from: b */
    public final TimeEntity f107120b;

    /* renamed from: c */
    public final TimeEntity f107121c;

    public CustomizedSnoozePresetEntity(Time time, Time time2, Time time3) {
        this.f107119a = (TimeEntity) time;
        this.f107120b = (TimeEntity) time2;
        this.f107121c = (TimeEntity) time3;
    }

    /* renamed from: a */
    public final Time mo58745a() {
        return this.f107119a;
    }

    /* renamed from: b */
    public final Time mo58746b() {
        return this.f107120b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final Time mo58747c() {
        return this.f107121c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CustomizedSnoozePreset)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        CustomizedSnoozePreset customizedSnoozePreset = (CustomizedSnoozePreset) obj;
        return sdg.m34949a(mo58745a(), customizedSnoozePreset.mo58745a()) && sdg.m34949a(mo58746b(), customizedSnoozePreset.mo58746b()) && sdg.m34949a(mo58747c(), customizedSnoozePreset.mo58747c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo58745a(), mo58746b(), mo58747c()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f107119a, i, false);
        see.m35040a(parcel, 3, this.f107120b, i, false);
        see.m35040a(parcel, 4, this.f107121c, i, false);
        see.m35062b(parcel, a);
    }

    public CustomizedSnoozePresetEntity(TimeEntity timeEntity, TimeEntity timeEntity2, TimeEntity timeEntity3) {
        this.f107119a = timeEntity;
        this.f107120b = timeEntity2;
        this.f107121c = timeEntity3;
    }
}
