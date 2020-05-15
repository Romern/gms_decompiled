package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecurrenceEntity extends AbstractSafeParcelable implements Recurrence {
    public static final Parcelable.Creator CREATOR = new aotu();

    /* renamed from: a */
    public final Integer f107158a;

    /* renamed from: b */
    public final Integer f107159b;

    /* renamed from: c */
    public final RecurrenceStartEntity f107160c;

    /* renamed from: d */
    public final RecurrenceEndEntity f107161d;

    /* renamed from: e */
    public final DailyPatternEntity f107162e;

    /* renamed from: f */
    public final WeeklyPatternEntity f107163f;

    /* renamed from: g */
    public final MonthlyPatternEntity f107164g;

    /* renamed from: h */
    public final YearlyPatternEntity f107165h;

    public RecurrenceEntity(Recurrence recurrence) {
        this(recurrence.mo58683c(), recurrence.mo58684d(), recurrence.mo58686f(), recurrence.mo58687g(), recurrence.mo58688h(), recurrence.mo58689i(), recurrence.mo58690j(), recurrence.mo58691k(), false);
    }

    /* renamed from: a */
    public static int m92129a(Recurrence recurrence) {
        return Arrays.hashCode(new Object[]{recurrence.mo58683c(), recurrence.mo58684d(), recurrence.mo58686f(), recurrence.mo58687g(), recurrence.mo58688h(), recurrence.mo58689i(), recurrence.mo58690j(), recurrence.mo58691k()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final Integer mo58683c() {
        return this.f107158a;
    }

    /* renamed from: d */
    public final Integer mo58684d() {
        return this.f107159b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Recurrence)) {
            return false;
        }
        if (this != obj) {
            return m92130a(this, (Recurrence) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final RecurrenceStart mo58686f() {
        return this.f107160c;
    }

    /* renamed from: g */
    public final RecurrenceEnd mo58687g() {
        return this.f107161d;
    }

    /* renamed from: h */
    public final DailyPattern mo58688h() {
        return this.f107162e;
    }

    public final int hashCode() {
        return m92129a(this);
    }

    /* renamed from: i */
    public final WeeklyPattern mo58689i() {
        return this.f107163f;
    }

    /* renamed from: j */
    public final MonthlyPattern mo58690j() {
        return this.f107164g;
    }

    /* renamed from: k */
    public final YearlyPattern mo58691k() {
        return this.f107165h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotu.m69511a(this, parcel, i);
    }

    public RecurrenceEntity(Integer num, Integer num2, RecurrenceStart recurrenceStart, RecurrenceEnd recurrenceEnd, DailyPattern dailyPattern, WeeklyPattern weeklyPattern, MonthlyPattern monthlyPattern, YearlyPattern yearlyPattern, boolean z) {
        this.f107158a = num;
        this.f107159b = num2;
        if (z) {
            this.f107160c = (RecurrenceStartEntity) recurrenceStart;
            this.f107161d = (RecurrenceEndEntity) recurrenceEnd;
            this.f107162e = (DailyPatternEntity) dailyPattern;
            this.f107163f = (WeeklyPatternEntity) weeklyPattern;
            this.f107164g = (MonthlyPatternEntity) monthlyPattern;
            this.f107165h = (YearlyPatternEntity) yearlyPattern;
            return;
        }
        YearlyPatternEntity yearlyPatternEntity = null;
        this.f107160c = recurrenceStart != null ? new RecurrenceStartEntity(recurrenceStart) : null;
        this.f107161d = recurrenceEnd != null ? new RecurrenceEndEntity(recurrenceEnd) : null;
        this.f107162e = dailyPattern != null ? new DailyPatternEntity(dailyPattern) : null;
        this.f107163f = weeklyPattern != null ? new WeeklyPatternEntity(weeklyPattern) : null;
        this.f107164g = monthlyPattern != null ? new MonthlyPatternEntity(monthlyPattern) : null;
        this.f107165h = yearlyPattern != null ? new YearlyPatternEntity(yearlyPattern) : yearlyPatternEntity;
    }

    /* renamed from: a */
    public static boolean m92130a(Recurrence recurrence, Recurrence recurrence2) {
        return sdg.m34949a(recurrence.mo58683c(), recurrence2.mo58683c()) && sdg.m34949a(recurrence.mo58684d(), recurrence2.mo58684d()) && sdg.m34949a(recurrence.mo58686f(), recurrence2.mo58686f()) && sdg.m34949a(recurrence.mo58687g(), recurrence2.mo58687g()) && sdg.m34949a(recurrence.mo58688h(), recurrence2.mo58688h()) && sdg.m34949a(recurrence.mo58689i(), recurrence2.mo58689i()) && sdg.m34949a(recurrence.mo58690j(), recurrence2.mo58690j()) && sdg.m34949a(recurrence.mo58691k(), recurrence2.mo58691k());
    }

    public RecurrenceEntity(Integer num, Integer num2, RecurrenceStartEntity recurrenceStartEntity, RecurrenceEndEntity recurrenceEndEntity, DailyPatternEntity dailyPatternEntity, WeeklyPatternEntity weeklyPatternEntity, MonthlyPatternEntity monthlyPatternEntity, YearlyPatternEntity yearlyPatternEntity) {
        this.f107158a = num;
        this.f107159b = num2;
        this.f107160c = recurrenceStartEntity;
        this.f107161d = recurrenceEndEntity;
        this.f107162e = dailyPatternEntity;
        this.f107163f = weeklyPatternEntity;
        this.f107164g = monthlyPatternEntity;
        this.f107165h = yearlyPatternEntity;
    }
}
