package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.MonthlyPatternEntity;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MonthlyPatternRef extends aotf implements MonthlyPattern {
    public MonthlyPatternRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public static boolean m91916a(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo17773f(aotf.m69487b(str, "monthly_pattern_month_day"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "monthly_pattern_week_day"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "monthly_pattern_week_day_number"), i, i2);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new MonthlyPatternEntity(this);
    }

    /* renamed from: c */
    public final List mo58666c() {
        return mo46859l(mo46858k("monthly_pattern_month_day"));
    }

    /* renamed from: d */
    public final Integer mo58667d() {
        return mo46856i(mo46858k("monthly_pattern_week_day"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MonthlyPattern)) {
            return false;
        }
        if (this != obj) {
            return MonthlyPatternEntity.m92105a(this, (MonthlyPattern) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final Integer mo58669f() {
        return mo46856i(mo46858k("monthly_pattern_week_day_number"));
    }

    public final int hashCode() {
        return MonthlyPatternEntity.m92104a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aots.m69510a(new MonthlyPatternEntity(this), parcel);
    }
}
