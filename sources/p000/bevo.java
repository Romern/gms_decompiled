package p000;

import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: bevo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bevo {

    /* renamed from: a */
    public final int f112699a;

    /* renamed from: b */
    public final int f112700b;

    /* renamed from: c */
    public final int f112701c;

    /* renamed from: d */
    public final int f112702d;

    public bevo(int i, int i2, int i3, int i4) {
        this.f112699a = i;
        this.f112700b = i2;
        this.f112701c = i3;
        this.f112702d = i4;
    }

    /* renamed from: a */
    public final bfne mo61183a(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
        gregorianCalendar.setTimeInMillis(j);
        gregorianCalendar.set(11, this.f112699a);
        gregorianCalendar.set(12, this.f112700b);
        gregorianCalendar.set(13, 0);
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        if (timeInMillis > j) {
            gregorianCalendar.add(6, -1);
            timeInMillis = gregorianCalendar.getTimeInMillis();
        }
        gregorianCalendar.set(11, this.f112701c);
        gregorianCalendar.set(12, this.f112702d);
        gregorianCalendar.set(13, 0);
        long timeInMillis2 = gregorianCalendar.getTimeInMillis();
        if (timeInMillis2 < timeInMillis) {
            gregorianCalendar.add(6, 1);
            timeInMillis2 = gregorianCalendar.getTimeInMillis();
        }
        return new bfne(Long.valueOf(timeInMillis), Long.valueOf(timeInMillis2));
    }

    public final String toString() {
        int i = this.f112699a;
        int i2 = this.f112700b;
        int i3 = this.f112701c;
        int i4 = this.f112702d;
        StringBuilder sb = new StringBuilder(90);
        sb.append("startHour=");
        sb.append(i);
        sb.append(", startMinute=");
        sb.append(i2);
        sb.append(", endHour=");
        sb.append(i3);
        sb.append(", endMinute=");
        sb.append(i4);
        return sb.toString();
    }
}
