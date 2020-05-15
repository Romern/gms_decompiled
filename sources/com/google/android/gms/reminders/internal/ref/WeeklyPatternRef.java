package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.WeeklyPattern;
import com.google.android.gms.reminders.model.WeeklyPatternEntity;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WeeklyPatternRef extends aotf implements WeeklyPattern {
    public WeeklyPatternRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public static boolean m91976a(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo17773f(aotf.m69487b(str, "weekly_pattern_weekday"), i, i2);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new WeeklyPatternEntity(this);
    }

    /* renamed from: c */
    public final List mo58729c() {
        return mo46859l(mo46858k("weekly_pattern_weekday"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WeeklyPattern)) {
            return false;
        }
        if (this != obj) {
            return WeeklyPatternEntity.m92221a(this, (WeeklyPattern) obj);
        }
        return true;
    }

    public final int hashCode() {
        return WeeklyPatternEntity.m92220a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aoug.m69524a(new WeeklyPatternEntity(this), parcel);
    }
}
