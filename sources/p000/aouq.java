package p000;

import com.google.android.gms.reminders.model.DateTime;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: aouq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aouq {

    /* renamed from: a */
    private static final TimeZone f83645a = TimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public static int m69544a(DateTime dateTime, DateTime dateTime2) {
        if (dateTime.mo58630c().intValue() < dateTime2.mo58630c().intValue()) {
            return -1;
        }
        if (dateTime.mo58630c().intValue() > dateTime2.mo58630c().intValue()) {
            return 1;
        }
        if (dateTime.mo58631d().intValue() < dateTime2.mo58631d().intValue()) {
            return -1;
        }
        if (dateTime.mo58631d().intValue() > dateTime2.mo58631d().intValue()) {
            return 1;
        }
        if (dateTime.mo58633f().intValue() < dateTime2.mo58633f().intValue()) {
            return -1;
        }
        if (dateTime.mo58633f().intValue() <= dateTime2.mo58633f().intValue()) {
            return 0;
        }
        return 1;
    }

    /* renamed from: b */
    static int m69550b(DateTime dateTime) {
        int i = m69557f(dateTime).get(7);
        if (i != 1) {
            return i - 1;
        }
        return 7;
    }

    /* renamed from: c */
    static int m69553c(DateTime dateTime) {
        return m69557f(dateTime).getActualMaximum(5);
    }

    /* renamed from: d */
    static DateTime m69555d(DateTime dateTime) {
        aotm aotm = new aotm(dateTime);
        aotm.f83589c = 1;
        return aotm.mo46874a();
    }

    /* renamed from: e */
    static DateTime m69556e(DateTime dateTime) {
        aotm aotm = new aotm(dateTime);
        aotm.f83589c = Integer.valueOf(m69553c(dateTime));
        return aotm.mo46874a();
    }

    /* renamed from: f */
    public static Calendar m69557f(DateTime dateTime) {
        Calendar a = m69549a();
        a.set(dateTime.mo58630c().intValue(), dateTime.mo58631d().intValue() - 1, dateTime.mo58633f().intValue());
        if (dateTime.mo58634g() != null) {
            a.set(11, dateTime.mo58634g().mo58724c().intValue());
            a.set(12, dateTime.mo58634g().mo58725d().intValue());
            a.set(13, dateTime.mo58634g().mo58727f().intValue());
        }
        return a;
    }

    /* renamed from: b */
    static DateTime m69551b(DateTime dateTime, int i) {
        return m69547a(dateTime, i * 7);
    }

    /* renamed from: c */
    static DateTime m69554c(DateTime dateTime, int i) {
        Calendar f = m69557f(dateTime);
        f.add(5, i - m69550b(dateTime));
        return m69548a(f);
    }

    /* renamed from: b */
    public static boolean m69552b(DateTime dateTime, DateTime dateTime2) {
        return Boolean.TRUE.equals(dateTime.mo58638k()) || m69545a(dateTime) > m69545a(dateTime2);
    }

    /* renamed from: a */
    public static long m69545a(DateTime dateTime) {
        int i;
        int i2;
        int i3;
        if (dateTime.mo58637j() != null) {
            return dateTime.mo58637j().longValue();
        }
        int intValue = dateTime.mo58630c().intValue();
        int intValue2 = dateTime.mo58631d().intValue() - 1;
        int intValue3 = dateTime.mo58633f().intValue();
        if (dateTime.mo58634g() != null) {
            int intValue4 = dateTime.mo58634g().mo58724c().intValue();
            int intValue5 = dateTime.mo58634g().mo58725d().intValue();
            i = dateTime.mo58634g().mo58727f().intValue();
            i3 = intValue4;
            i2 = intValue5;
        } else if (dateTime.mo58635h() != null) {
            i2 = 0;
            i = 0;
            i3 = aowr.m69713a(dateTime.mo58635h().intValue());
        } else {
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        Calendar a = m69549a();
        a.set(intValue, intValue2, intValue3, i3, i2, i);
        return a.getTimeInMillis();
    }

    /* renamed from: a */
    public static DateTime m69546a(long j, TimeZone timeZone) {
        int offset = timeZone.getOffset(j);
        Calendar a = m69549a();
        a.setTimeInMillis(j + ((long) offset));
        aotm aotm = new aotm();
        aotm.f83587a = Integer.valueOf(a.get(1));
        aotm.f83588b = Integer.valueOf(a.get(2) + 1);
        aotm.f83589c = Integer.valueOf(a.get(5));
        aoue aoue = new aoue();
        aoue.f83627a = Integer.valueOf(a.get(11));
        aoue.f83628b = Integer.valueOf(a.get(12));
        aoue.f83629c = Integer.valueOf(a.get(13));
        aotm.mo46875a(aoue.mo46905a());
        return aotm.mo46874a();
    }

    /* renamed from: a */
    public static DateTime m69547a(DateTime dateTime, int i) {
        Calendar f = m69557f(dateTime);
        f.add(5, i);
        return m69548a(f);
    }

    /* renamed from: a */
    public static DateTime m69548a(Calendar calendar) {
        aotm aotm = new aotm();
        aotm.f83587a = Integer.valueOf(calendar.get(1));
        aotm.f83588b = Integer.valueOf(calendar.get(2) + 1);
        aotm.f83589c = Integer.valueOf(calendar.get(5));
        return aotm.mo46874a();
    }

    /* renamed from: a */
    private static Calendar m69549a() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(f83645a);
        instance.setLenient(false);
        instance.clear();
        return instance;
    }
}
