package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.DailyPattern;
import com.google.android.gms.reminders.model.DailyPatternEntity;
import com.google.android.gms.reminders.model.Time;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DailyPatternRef extends aotf implements DailyPattern {

    /* renamed from: f */
    private boolean f107058f = false;

    /* renamed from: g */
    private TimeRef f107059g;

    public DailyPatternRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public static boolean m91878a(DataHolder dataHolder, int i, int i2, String str) {
        return TimeRef.m91971a(dataHolder, i, i2, str.concat("daily_pattern_")) && dataHolder.mo17773f(aotf.m69487b(str, "daily_pattern_period"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "daily_pattern_all_day"), i, i2);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new DailyPatternEntity(this);
    }

    /* renamed from: c */
    public final Time mo58625c() {
        if (!this.f107058f) {
            this.f107058f = true;
            this.f107059g = !TimeRef.m91971a(this.f43672a, this.f43673b, this.f83582e, this.f83581d.concat("daily_pattern_")) ? new TimeRef(this.f43672a, this.f43673b, this.f83581d.concat("daily_pattern_")) : null;
        }
        return this.f107059g;
    }

    /* renamed from: d */
    public final Integer mo58626d() {
        return mo46856i(mo46858k("daily_pattern_period"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DailyPattern)) {
            return false;
        }
        if (this != obj) {
            return DailyPatternEntity.m92029a(this, (DailyPattern) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo58628f() {
        return Boolean.valueOf(mo25150c(mo46858k("daily_pattern_all_day")));
    }

    public final int hashCode() {
        return DailyPatternEntity.m92028a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotl.m69501a(new DailyPatternEntity(this), parcel, i);
    }
}
