package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WeeklyPatternEntity extends AbstractSafeParcelable implements WeeklyPattern {
    public static final Parcelable.Creator CREATOR = new aoug();

    /* renamed from: a */
    public final List f107198a;

    public WeeklyPatternEntity(WeeklyPattern weeklyPattern) {
        List c = weeklyPattern.mo58729c();
        this.f107198a = c != null ? new ArrayList(c) : null;
    }

    /* renamed from: a */
    public static int m92220a(WeeklyPattern weeklyPattern) {
        return Arrays.hashCode(new Object[]{weeklyPattern.mo58729c()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final List mo58729c() {
        return this.f107198a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WeeklyPattern)) {
            return false;
        }
        if (this != obj) {
            return m92221a(this, (WeeklyPattern) obj);
        }
        return true;
    }

    public final int hashCode() {
        return m92220a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aoug.m69524a(this, parcel);
    }

    /* renamed from: a */
    public static boolean m92221a(WeeklyPattern weeklyPattern, WeeklyPattern weeklyPattern2) {
        return sdg.m34949a(weeklyPattern.mo58729c(), weeklyPattern2.mo58729c());
    }

    public WeeklyPatternEntity(List list) {
        this.f107198a = list;
    }
}
