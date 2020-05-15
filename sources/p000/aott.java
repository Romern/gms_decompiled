package p000;

import com.google.android.gms.reminders.model.DailyPattern;
import com.google.android.gms.reminders.model.DailyPatternEntity;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.MonthlyPatternEntity;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEnd;
import com.google.android.gms.reminders.model.RecurrenceEndEntity;
import com.google.android.gms.reminders.model.RecurrenceStart;
import com.google.android.gms.reminders.model.RecurrenceStartEntity;
import com.google.android.gms.reminders.model.WeeklyPattern;
import com.google.android.gms.reminders.model.WeeklyPatternEntity;
import com.google.android.gms.reminders.model.YearlyPattern;
import com.google.android.gms.reminders.model.YearlyPatternEntity;

/* renamed from: aott */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aott {

    /* renamed from: a */
    public Integer f83596a;

    /* renamed from: b */
    public Integer f83597b;

    /* renamed from: c */
    public RecurrenceStart f83598c;

    /* renamed from: d */
    public RecurrenceEnd f83599d;

    /* renamed from: e */
    public DailyPattern f83600e;

    /* renamed from: f */
    public WeeklyPattern f83601f;

    /* renamed from: g */
    public MonthlyPattern f83602g;

    /* renamed from: h */
    public YearlyPattern f83603h;

    public aott() {
    }

    public aott(Recurrence recurrence) {
        RecurrenceStartEntity recurrenceStartEntity;
        RecurrenceEndEntity recurrenceEndEntity;
        DailyPatternEntity dailyPatternEntity;
        WeeklyPatternEntity weeklyPatternEntity;
        MonthlyPatternEntity monthlyPatternEntity;
        this.f83596a = recurrence.mo58683c();
        this.f83597b = recurrence.mo58684d();
        YearlyPatternEntity yearlyPatternEntity = null;
        if (recurrence.mo58686f() != null) {
            recurrenceStartEntity = new RecurrenceStartEntity(recurrence.mo58686f());
        } else {
            recurrenceStartEntity = null;
        }
        this.f83598c = recurrenceStartEntity;
        if (recurrence.mo58687g() != null) {
            recurrenceEndEntity = new RecurrenceEndEntity(recurrence.mo58687g());
        } else {
            recurrenceEndEntity = null;
        }
        this.f83599d = recurrenceEndEntity;
        if (recurrence.mo58688h() != null) {
            dailyPatternEntity = new DailyPatternEntity(recurrence.mo58688h());
        } else {
            dailyPatternEntity = null;
        }
        this.f83600e = dailyPatternEntity;
        if (recurrence.mo58689i() != null) {
            weeklyPatternEntity = new WeeklyPatternEntity(recurrence.mo58689i());
        } else {
            weeklyPatternEntity = null;
        }
        this.f83601f = weeklyPatternEntity;
        if (recurrence.mo58690j() != null) {
            monthlyPatternEntity = new MonthlyPatternEntity(recurrence.mo58690j());
        } else {
            monthlyPatternEntity = null;
        }
        this.f83602g = monthlyPatternEntity;
        this.f83603h = recurrence.mo58691k() != null ? new YearlyPatternEntity(recurrence.mo58691k()) : yearlyPatternEntity;
    }
}
