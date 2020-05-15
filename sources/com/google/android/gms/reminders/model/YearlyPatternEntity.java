package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class YearlyPatternEntity extends AbstractSafeParcelable implements YearlyPattern {
    public static final Parcelable.Creator CREATOR = new aouh();

    /* renamed from: a */
    public final MonthlyPatternEntity f107199a;

    /* renamed from: b */
    public final List f107200b;

    public YearlyPatternEntity(MonthlyPatternEntity monthlyPatternEntity, List list) {
        this.f107199a = monthlyPatternEntity;
        this.f107200b = list;
    }

    /* renamed from: a */
    public static int m92226a(YearlyPattern yearlyPattern) {
        return Arrays.hashCode(new Object[]{yearlyPattern.mo58732c(), yearlyPattern.mo58733d()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final MonthlyPattern mo58732c() {
        return this.f107199a;
    }

    /* renamed from: d */
    public final List mo58733d() {
        return this.f107200b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YearlyPattern)) {
            return false;
        }
        if (this != obj) {
            return m92227a(this, (YearlyPattern) obj);
        }
        return true;
    }

    public final int hashCode() {
        return m92226a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aouh.m69525a(this, parcel, i);
    }

    public YearlyPatternEntity(YearlyPattern yearlyPattern) {
        MonthlyPattern c = yearlyPattern.mo58732c();
        List d = yearlyPattern.mo58733d();
        ArrayList arrayList = null;
        this.f107199a = c != null ? new MonthlyPatternEntity(c) : null;
        this.f107200b = d != null ? new ArrayList(d) : arrayList;
    }

    /* renamed from: a */
    public static boolean m92227a(YearlyPattern yearlyPattern, YearlyPattern yearlyPattern2) {
        return sdg.m34949a(yearlyPattern.mo58732c(), yearlyPattern2.mo58732c()) && sdg.m34949a(yearlyPattern.mo58733d(), yearlyPattern2.mo58733d());
    }
}
