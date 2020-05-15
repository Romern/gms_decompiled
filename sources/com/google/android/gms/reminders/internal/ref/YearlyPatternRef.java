package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.YearlyPattern;
import com.google.android.gms.reminders.model.YearlyPatternEntity;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class YearlyPatternRef extends aotf implements YearlyPattern {

    /* renamed from: f */
    private boolean f107104f = false;

    /* renamed from: g */
    private MonthlyPatternRef f107105g;

    public YearlyPatternRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public static boolean m91979a(DataHolder dataHolder, int i, int i2, String str) {
        return MonthlyPatternRef.m91916a(dataHolder, i, i2, str.concat("yearly_pattern_")) && dataHolder.mo17773f(aotf.m69487b(str, "yearly_pattern_year_month"), i, i2);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new YearlyPatternEntity(this);
    }

    /* renamed from: c */
    public final MonthlyPattern mo58732c() {
        if (!this.f107104f) {
            this.f107104f = true;
            this.f107105g = !MonthlyPatternRef.m91916a(this.f43672a, this.f43673b, this.f83582e, this.f83581d.concat("yearly_pattern_")) ? new MonthlyPatternRef(this.f43672a, this.f43673b, this.f83581d.concat("yearly_pattern_")) : null;
        }
        return this.f107105g;
    }

    /* renamed from: d */
    public final List mo58733d() {
        return mo46859l(mo46858k("yearly_pattern_year_month"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YearlyPattern)) {
            return false;
        }
        if (this != obj) {
            return YearlyPatternEntity.m92227a(this, (YearlyPattern) obj);
        }
        return true;
    }

    public final int hashCode() {
        return YearlyPatternEntity.m92226a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aouh.m69525a(new YearlyPatternEntity(this), parcel, i);
    }
}
