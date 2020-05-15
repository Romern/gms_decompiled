package p000;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: awz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awz implements Comparable {

    /* renamed from: a */
    public int f2461a = 0;

    /* renamed from: b */
    public int f2462b = 0;

    /* renamed from: c */
    public int f2463c = 0;

    /* renamed from: d */
    public int f2464d = 0;

    /* renamed from: e */
    public int f2465e = 0;

    /* renamed from: f */
    public int f2466f = 0;

    /* renamed from: g */
    public TimeZone f2467g = TimeZone.getTimeZone("UTC");

    /* renamed from: h */
    public int f2468h;

    public awz() {
    }

    /* renamed from: a */
    public final Calendar mo2781a() {
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(this.f2467g);
        gregorianCalendar.set(1, this.f2461a);
        gregorianCalendar.set(2, this.f2462b - 1);
        gregorianCalendar.set(5, this.f2463c);
        gregorianCalendar.set(11, this.f2464d);
        gregorianCalendar.set(12, this.f2465e);
        gregorianCalendar.set(13, this.f2466f);
        gregorianCalendar.set(14, this.f2468h / 1000000);
        return gregorianCalendar;
    }

    /* renamed from: a */
    public final void mo2782a(int i) {
        if (i <= 0) {
            this.f2462b = 1;
        } else if (i <= 12) {
            this.f2462b = i;
        } else {
            this.f2462b = 12;
        }
    }

    /* renamed from: b */
    public final void mo2783b(int i) {
        if (i <= 0) {
            this.f2463c = 1;
        } else if (i <= 31) {
            this.f2463c = i;
        } else {
            this.f2463c = 31;
        }
    }

    public final int compareTo(Object obj) {
        awz awz = (awz) obj;
        long timeInMillis = mo2781a().getTimeInMillis() - awz.mo2781a().getTimeInMillis();
        if (timeInMillis == 0) {
            timeInMillis = (long) (this.f2468h - awz.f2468h);
        }
        return (int) (timeInMillis % 2);
    }

    public final String toString() {
        return awt.m2286a(this);
    }

    public awz(Calendar calendar) {
        Date time = calendar.getTime();
        TimeZone timeZone = calendar.getTimeZone();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(timeZone);
        gregorianCalendar.setTime(time);
        this.f2461a = gregorianCalendar.get(1);
        this.f2462b = gregorianCalendar.get(2) + 1;
        this.f2463c = gregorianCalendar.get(5);
        this.f2464d = gregorianCalendar.get(11);
        this.f2465e = gregorianCalendar.get(12);
        this.f2466f = gregorianCalendar.get(13);
        this.f2468h = gregorianCalendar.get(14) * 1000000;
        this.f2467g = gregorianCalendar.getTimeZone();
    }
}
