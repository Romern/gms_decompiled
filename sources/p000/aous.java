package p000;

import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import java.util.Calendar;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: aous */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aous extends aouv {
    public aous(Recurrence recurrence) {
        super(recurrence);
    }

    /* renamed from: a */
    private static DateTime m69561a(DateTime dateTime, int i, int i2) {
        sdo.m34970a(true);
        DateTime d = aouq.m69555d(dateTime);
        DateTime c = aouq.m69554c(d, i);
        DateTime b = d.mo58631d() != c.mo58631d() ? aouq.m69551b(c, i2) : aouq.m69551b(c, i2 - 1);
        if (b.mo58631d() != dateTime.mo58631d()) {
            return null;
        }
        return b;
    }

    /* renamed from: b */
    private static DateTime m69565b(DateTime dateTime, int i, int i2) {
        boolean z;
        if (i2 < 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        DateTime e = aouq.m69556e(dateTime);
        DateTime c = aouq.m69554c(e, i);
        DateTime b = e.mo58631d() != c.mo58631d() ? aouq.m69551b(c, i2) : aouq.m69551b(c, i2 + 1);
        if (b.mo58631d() != dateTime.mo58631d()) {
            return null;
        }
        return b;
    }

    /* renamed from: a */
    static DateTime m69562a(MonthlyPattern monthlyPattern, DateTime dateTime, int i) {
        DateTime dateTime2;
        for (Integer num : m69566b(monthlyPattern, dateTime)) {
            int intValue = num.intValue();
            if (intValue > i) {
                aotm aotm = new aotm(dateTime);
                aotm.f83589c = Integer.valueOf(intValue);
                return aotm.mo46874a();
            }
        }
        if (monthlyPattern.mo58667d() == null) {
            return null;
        }
        int intValue2 = monthlyPattern.mo58669f().intValue();
        if (intValue2 > 0) {
            dateTime2 = m69561a(dateTime, monthlyPattern.mo58667d().intValue(), intValue2);
        } else {
            dateTime2 = m69565b(dateTime, monthlyPattern.mo58667d().intValue(), intValue2);
        }
        if (dateTime2 == null || dateTime2.mo58633f().intValue() <= i) {
            return null;
        }
        return dateTime2;
    }

    /* renamed from: b */
    private static SortedSet m69566b(MonthlyPattern monthlyPattern, DateTime dateTime) {
        int c = aouq.m69553c(dateTime);
        TreeSet treeSet = new TreeSet();
        if (monthlyPattern.mo58666c() != null) {
            for (Integer num : monthlyPattern.mo58666c()) {
                int intValue = num.intValue();
                if (intValue <= 0) {
                    intValue = intValue + c + 1;
                }
                if (intValue > 0 && intValue <= c) {
                    treeSet.add(Integer.valueOf(intValue));
                }
            }
        }
        return treeSet;
    }

    /* renamed from: b */
    public final DateTime mo46922b(DateTime dateTime) {
        while (!m69564a(((RecurrenceEntity) this.f83646a).f107164g, dateTime) && mo46924c(dateTime)) {
            dateTime = aouq.m69547a(dateTime, 1);
        }
        return dateTime;
    }

    /* renamed from: a */
    static void m69563a(MonthlyPattern monthlyPattern) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (monthlyPattern.mo58666c() == null || monthlyPattern.mo58666c().isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (monthlyPattern.mo58667d() == null && monthlyPattern.mo58669f() == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        sdo.m34974b(z3);
        if (z) {
            for (Integer num : monthlyPattern.mo58666c()) {
                int intValue = num.intValue();
                sdo.m34974b(intValue != 0);
                sdo.m34974b(Math.abs(intValue) <= 31);
            }
        }
        if (z2) {
            sdo.m34959a(monthlyPattern.mo58667d());
            if (monthlyPattern.mo58669f().intValue() == 0) {
                z4 = false;
            }
            sdo.m34974b(z4);
        }
    }

    /* renamed from: a */
    static boolean m69564a(MonthlyPattern monthlyPattern, DateTime dateTime) {
        DateTime dateTime2;
        if (m69566b(monthlyPattern, dateTime).contains(dateTime.mo58633f())) {
            return true;
        }
        if (monthlyPattern.mo58667d() == null) {
            return false;
        }
        int intValue = monthlyPattern.mo58669f().intValue();
        if (intValue > 0) {
            dateTime2 = m69561a(dateTime, monthlyPattern.mo58667d().intValue(), intValue);
        } else {
            dateTime2 = m69565b(dateTime, monthlyPattern.mo58667d().intValue(), intValue);
        }
        if (dateTime2 == null || aouq.m69544a(dateTime2, dateTime) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final DateTime mo46920a(DateTime dateTime) {
        DateTime d = aouq.m69555d(dateTime);
        int intValue = dateTime.mo58633f().intValue();
        while (true) {
            DateTime a = m69562a(((RecurrenceEntity) this.f83646a).f107164g, d, intValue);
            if (a != null) {
                return a;
            }
            int b = mo46923b();
            Calendar f = aouq.m69557f(d);
            f.add(2, b);
            d = aouq.m69548a(f);
            intValue = 0;
        }
    }

    /* renamed from: a */
    public final void mo46921a() {
        boolean z;
        if (((RecurrenceEntity) this.f83646a).f107158a.intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        sdo.m34959a(((RecurrenceEntity) this.f83646a).f107164g);
        m69563a(((RecurrenceEntity) this.f83646a).f107164g);
    }
}
