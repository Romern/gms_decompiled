package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DailyPatternEntity extends AbstractSafeParcelable implements DailyPattern {
    public static final Parcelable.Creator CREATOR = new aotl();

    /* renamed from: a */
    public final TimeEntity f107122a;

    /* renamed from: b */
    public final Integer f107123b;

    /* renamed from: c */
    public final Boolean f107124c;

    public DailyPatternEntity(DailyPattern dailyPattern) {
        Time c = dailyPattern.mo58625c();
        Integer d = dailyPattern.mo58626d();
        Boolean f = dailyPattern.mo58628f();
        this.f107123b = d;
        this.f107124c = f;
        this.f107122a = c != null ? new TimeEntity(c) : null;
    }

    /* renamed from: a */
    public static int m92028a(DailyPattern dailyPattern) {
        return Arrays.hashCode(new Object[]{dailyPattern.mo58625c(), dailyPattern.mo58626d(), dailyPattern.mo58628f()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final Time mo58625c() {
        return this.f107122a;
    }

    /* renamed from: d */
    public final Integer mo58626d() {
        return this.f107123b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DailyPattern)) {
            return false;
        }
        if (this != obj) {
            return m92029a(this, (DailyPattern) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo58628f() {
        return this.f107124c;
    }

    public final int hashCode() {
        return m92028a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotl.m69501a(this, parcel, i);
    }

    /* renamed from: a */
    public static boolean m92029a(DailyPattern dailyPattern, DailyPattern dailyPattern2) {
        return sdg.m34949a(dailyPattern.mo58625c(), dailyPattern2.mo58625c()) && sdg.m34949a(dailyPattern.mo58626d(), dailyPattern2.mo58626d()) && sdg.m34949a(dailyPattern.mo58628f(), dailyPattern2.mo58628f());
    }

    public DailyPatternEntity(TimeEntity timeEntity, Integer num, Boolean bool) {
        this.f107122a = timeEntity;
        this.f107123b = num;
        this.f107124c = bool;
    }
}
