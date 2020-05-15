package p000;

import com.google.android.gms.reminders.model.DailyPatternEntity;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEndEntity;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import com.google.android.gms.reminders.model.RecurrenceStartEntity;
import java.util.Iterator;

/* renamed from: aouv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aouv implements Iterator {

    /* renamed from: a */
    final Recurrence f83646a;

    /* renamed from: b */
    private final Integer f83647b;

    /* renamed from: c */
    private final DateTime f83648c;

    /* renamed from: d */
    private int f83649d = 0;

    /* renamed from: e */
    private DateTime f83650e = null;

    public aouv(Recurrence recurrence) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        sdo.m34959a(recurrence);
        this.f83646a = recurrence;
        RecurrenceEntity recurrenceEntity = (RecurrenceEntity) recurrence;
        Integer num = recurrenceEntity.f107159b;
        if (num != null) {
            z = num.intValue() > 0;
        } else {
            z = true;
        }
        sdo.m34974b(z);
        sdo.m34959a(recurrenceEntity.f107160c);
        sdo.m34959a(recurrenceEntity.f107160c.mo58693c());
        DailyPatternEntity dailyPatternEntity = recurrenceEntity.f107162e;
        if (dailyPatternEntity != null) {
            if (dailyPatternEntity.mo58625c() == null && recurrenceEntity.f107162e.mo58626d() == null) {
                z5 = false;
            } else {
                z5 = true;
            }
            sdo.m34974b(z5);
        }
        if (recurrenceEntity.f107160c.mo58693c() != null) {
            Boolean k = recurrenceEntity.f107160c.mo58693c().mo58638k();
            if (k == null || !k.booleanValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
            sdo.m34974b(z4);
        }
        if (recurrenceEntity.f107161d.mo58671c() != null) {
            Boolean k2 = recurrenceEntity.f107161d.mo58671c().mo58638k();
            if (k2 == null || !k2.booleanValue()) {
                z3 = true;
            } else {
                z3 = false;
            }
            sdo.m34974b(z3);
        }
        sdo.m34959a(recurrenceEntity.f107161d);
        RecurrenceEndEntity recurrenceEndEntity = recurrenceEntity.f107161d;
        if (recurrenceEndEntity.mo58671c() == null && recurrenceEndEntity.mo58672d() == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        sdo.m34974b(z2);
        if (recurrenceEndEntity.mo58672d() != null) {
            sdo.m34974b(recurrenceEndEntity.mo58672d().intValue() > 0 ? true : z6);
        }
        this.f83647b = recurrenceEndEntity.mo58672d();
        this.f83648c = recurrenceEndEntity.mo58671c();
        mo46921a();
        RecurrenceStartEntity recurrenceStartEntity = recurrenceEntity.f107160c;
        if (recurrenceStartEntity.mo58693c() != null) {
            this.f83650e = mo46922b(recurrenceStartEntity.mo58693c());
            return;
        }
        throw new IllegalArgumentException("recurrence_start must have start_date_time");
    }

    /* renamed from: a */
    public abstract DateTime mo46920a(DateTime dateTime);

    /* renamed from: a */
    public abstract void mo46921a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo46923b() {
        Integer num = ((RecurrenceEntity) this.f83646a).f107159b;
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: b */
    public abstract DateTime mo46922b(DateTime dateTime);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo46924c(DateTime dateTime) {
        DateTime dateTime2 = this.f83648c;
        return dateTime2 == null || aouq.m69544a(dateTime, dateTime2) <= 0;
    }

    public final boolean hasNext() {
        boolean z;
        boolean z2;
        if (this.f83650e != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        if (this.f83647b == null && this.f83648c == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        sdo.m34970a(z2);
        Integer num = this.f83647b;
        if (num != null && this.f83649d >= num.intValue()) {
            return false;
        }
        DateTime dateTime = this.f83648c;
        return dateTime == null || aouq.m69544a(this.f83650e, dateTime) <= 0;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        sdo.m34970a(hasNext());
        DateTime dateTime = this.f83650e;
        DailyPatternEntity dailyPatternEntity = ((RecurrenceEntity) this.f83646a).f107162e;
        if (dailyPatternEntity != null) {
            aotm aotm = new aotm(dateTime);
            if (Boolean.TRUE.equals(dailyPatternEntity.mo58628f())) {
                aotm.f83591e = dailyPatternEntity.mo58628f();
            }
            if (dailyPatternEntity.mo58625c() != null) {
                aotm.mo46875a(dailyPatternEntity.mo58625c());
            }
            if (dailyPatternEntity.mo58626d() != null) {
                aotm.mo46876a(dailyPatternEntity.mo58626d());
            }
            dateTime = aotm.mo46874a();
        }
        this.f83650e = mo46920a(this.f83650e);
        this.f83649d++;
        return dateTime;
    }
}
