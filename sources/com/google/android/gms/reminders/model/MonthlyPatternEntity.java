package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MonthlyPatternEntity extends AbstractSafeParcelable implements MonthlyPattern {
    public static final Parcelable.Creator CREATOR = new aots();

    /* renamed from: a */
    public final List f107151a;

    /* renamed from: b */
    public final Integer f107152b;

    /* renamed from: c */
    public final Integer f107153c;

    public MonthlyPatternEntity(MonthlyPattern monthlyPattern) {
        List c = monthlyPattern.mo58666c();
        Integer d = monthlyPattern.mo58667d();
        Integer f = monthlyPattern.mo58669f();
        this.f107152b = d;
        this.f107153c = f;
        this.f107151a = c != null ? new ArrayList(c) : null;
    }

    /* renamed from: a */
    public static int m92104a(MonthlyPattern monthlyPattern) {
        return Arrays.hashCode(new Object[]{monthlyPattern.mo58666c(), monthlyPattern.mo58667d(), monthlyPattern.mo58669f()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final List mo58666c() {
        return this.f107151a;
    }

    /* renamed from: d */
    public final Integer mo58667d() {
        return this.f107152b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MonthlyPattern)) {
            return false;
        }
        if (this != obj) {
            return m92105a(this, (MonthlyPattern) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final Integer mo58669f() {
        return this.f107153c;
    }

    public final int hashCode() {
        return m92104a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aots.m69510a(this, parcel);
    }

    /* renamed from: a */
    public static boolean m92105a(MonthlyPattern monthlyPattern, MonthlyPattern monthlyPattern2) {
        return sdg.m34949a(monthlyPattern.mo58666c(), monthlyPattern2.mo58666c()) && sdg.m34949a(monthlyPattern.mo58667d(), monthlyPattern2.mo58667d()) && sdg.m34949a(monthlyPattern.mo58669f(), monthlyPattern2.mo58669f());
    }

    public MonthlyPatternEntity(List list, Integer num, Integer num2) {
        this.f107151a = list;
        this.f107152b = num;
        this.f107153c = num2;
    }
}
