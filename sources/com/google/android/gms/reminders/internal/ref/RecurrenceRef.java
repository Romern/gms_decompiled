package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.DailyPattern;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEnd;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import com.google.android.gms.reminders.model.RecurrenceStart;
import com.google.android.gms.reminders.model.WeeklyPattern;
import com.google.android.gms.reminders.model.YearlyPattern;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecurrenceRef extends aotf implements Recurrence {

    /* renamed from: f */
    private boolean f107076f = false;

    /* renamed from: g */
    private RecurrenceStartRef f107077g;

    /* renamed from: h */
    private boolean f107078h = false;

    /* renamed from: i */
    private RecurrenceEndRef f107079i;

    /* renamed from: j */
    private boolean f107080j = false;

    /* renamed from: k */
    private DailyPatternRef f107081k;

    /* renamed from: l */
    private boolean f107082l = false;

    /* renamed from: m */
    private WeeklyPatternRef f107083m;

    /* renamed from: n */
    private boolean f107084n = false;

    /* renamed from: o */
    private MonthlyPatternRef f107085o;

    /* renamed from: p */
    private boolean f107086p = false;

    /* renamed from: q */
    private YearlyPatternRef f107087q;

    public RecurrenceRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public static boolean m91932a(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo17773f(aotf.m69487b(str, "recurrence_frequency"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "recurrence_every"), i, i2) && RecurrenceStartRef.m91942a(dataHolder, i, i2, str) && RecurrenceEndRef.m91921a(dataHolder, i, i2, str) && DailyPatternRef.m91878a(dataHolder, i, i2, str) && WeeklyPatternRef.m91976a(dataHolder, i, i2, str) && MonthlyPatternRef.m91916a(dataHolder, i, i2, str) && YearlyPatternRef.m91979a(dataHolder, i, i2, str);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new RecurrenceEntity(this);
    }

    /* renamed from: c */
    public final Integer mo58683c() {
        return mo46856i(mo46858k("recurrence_frequency"));
    }

    /* renamed from: d */
    public final Integer mo58684d() {
        return mo46856i(mo46858k("recurrence_every"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Recurrence)) {
            return false;
        }
        if (this != obj) {
            return RecurrenceEntity.m92130a(this, (Recurrence) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final RecurrenceStart mo58686f() {
        if (!this.f107076f) {
            this.f107076f = true;
            this.f107077g = !RecurrenceStartRef.m91942a(this.f43672a, this.f43673b, this.f83582e, this.f83581d) ? new RecurrenceStartRef(this.f43672a, this.f43673b, this.f83581d) : null;
        }
        return this.f107077g;
    }

    /* renamed from: g */
    public final RecurrenceEnd mo58687g() {
        if (!this.f107078h) {
            this.f107078h = true;
            this.f107079i = !RecurrenceEndRef.m91921a(this.f43672a, this.f43673b, this.f83582e, this.f83581d) ? new RecurrenceEndRef(this.f43672a, this.f43673b, this.f83581d) : null;
        }
        return this.f107079i;
    }

    /* renamed from: h */
    public final DailyPattern mo58688h() {
        if (!this.f107080j) {
            this.f107080j = true;
            this.f107081k = !DailyPatternRef.m91878a(this.f43672a, this.f43673b, this.f83582e, this.f83581d) ? new DailyPatternRef(this.f43672a, this.f43673b, this.f83581d) : null;
        }
        return this.f107081k;
    }

    public final int hashCode() {
        return RecurrenceEntity.m92129a(this);
    }

    /* renamed from: i */
    public final WeeklyPattern mo58689i() {
        if (!this.f107082l) {
            this.f107082l = true;
            this.f107083m = !WeeklyPatternRef.m91976a(this.f43672a, this.f43673b, this.f83582e, this.f83581d) ? new WeeklyPatternRef(this.f43672a, this.f43673b, this.f83581d) : null;
        }
        return this.f107083m;
    }

    /* renamed from: j */
    public final MonthlyPattern mo58690j() {
        if (!this.f107084n) {
            this.f107084n = true;
            this.f107085o = !MonthlyPatternRef.m91916a(this.f43672a, this.f43673b, this.f83582e, this.f83581d) ? new MonthlyPatternRef(this.f43672a, this.f43673b, this.f83581d) : null;
        }
        return this.f107085o;
    }

    /* renamed from: k */
    public final YearlyPattern mo58691k() {
        if (!this.f107086p) {
            this.f107086p = true;
            this.f107087q = !YearlyPatternRef.m91979a(this.f43672a, this.f43673b, this.f83582e, this.f83581d) ? new YearlyPatternRef(this.f43672a, this.f43673b, this.f83581d) : null;
        }
        return this.f107087q;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotu.m69511a(new RecurrenceEntity(this), parcel, i);
    }
}
