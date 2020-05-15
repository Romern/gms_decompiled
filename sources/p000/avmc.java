package p000;

import android.content.Context;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: avmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avmc {

    /* renamed from: a */
    public static final avmc f93371a = new avmc(-1, -1);

    /* renamed from: b */
    public static final avmc f93372b = new avmc(0, 0);

    /* renamed from: e */
    private static final Pattern f93373e = Pattern.compile("^([0-2][0-9])([0-5][0-9])-([0-2][0-9])([0-5][0-9])$");

    /* renamed from: c */
    public final long f93374c;

    /* renamed from: d */
    public final long f93375d;

    public avmc(long j, long j2) {
        if (j == -1 || j2 == -1) {
            this.f93374c = -1;
            this.f93375d = -1;
        } else if (j == j2) {
            this.f93374c = 0;
            this.f93375d = 0;
        } else {
            this.f93374c = j;
            this.f93375d = j2;
        }
    }

    /* renamed from: a */
    private static long m78776a(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        if (m78778d(j) > j2) {
            instance.add(5, 1);
        }
        instance.set(11, (int) TimeUnit.MILLISECONDS.toHours(j2));
        instance.set(12, (int) (TimeUnit.MILLISECONDS.toMinutes(j2) % 60));
        instance.set(13, 0);
        return instance.getTimeInMillis() - j;
    }

    /* renamed from: d */
    public static long m78778d(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return TimeUnit.HOURS.toMillis((long) instance.get(11)) + TimeUnit.MINUTES.toMillis((long) instance.get(12)) + TimeUnit.SECONDS.toMillis((long) instance.get(13)) + ((long) instance.get(14));
    }

    /* renamed from: a */
    public final boolean mo51367a() {
        return (this.f93374c == -1 || this.f93375d == -1) ? false : true;
    }

    /* renamed from: b */
    public final long mo51369b(long j) {
        if (!mo51367a()) {
            return Long.MAX_VALUE;
        }
        if (!mo51370b()) {
            return m78776a(j, TimeUnit.MINUTES.toMillis(this.f93374c));
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo51370b() {
        return this.f93374c == 0 && this.f93375d == 0;
    }

    /* renamed from: c */
    public final long mo51371c(long j) {
        if (!mo51367a()) {
            return 0;
        }
        if (!mo51370b()) {
            return m78776a(j, TimeUnit.MINUTES.toMillis(this.f93375d));
        }
        return Long.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avmc) {
            avmc avmc = (avmc) obj;
            if (this.f93374c == avmc.f93374c && this.f93375d == avmc.f93375d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f93374c), Long.valueOf(this.f93375d)});
    }

    /* renamed from: a */
    public static avmc m78777a(String str) {
        if (bmxx.m108577a(str) || "none".equalsIgnoreCase(str)) {
            return f93371a;
        }
        Matcher matcher = f93373e.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw new avlq(valueOf.length() == 0 ? new String("Unable to parse time window string: ") : "Unable to parse time window string: ".concat(valueOf));
        }
        try {
            int parseInt = (Integer.parseInt(bmxx.m108578b(matcher.group(1))) * 60) + Integer.parseInt(bmxx.m108578b(matcher.group(2)));
            int parseInt2 = (Integer.parseInt(bmxx.m108578b(matcher.group(3))) * 60) + Integer.parseInt(bmxx.m108578b(matcher.group(4)));
            if (parseInt < 1440 && parseInt2 < 1440) {
                return new avmc((long) parseInt, (long) parseInt2);
            }
            String valueOf2 = String.valueOf(str);
            throw new avlq(valueOf2.length() == 0 ? new String("Invalid time window: ") : "Invalid time window: ".concat(valueOf2));
        } catch (NumberFormatException e) {
            String valueOf3 = String.valueOf(str);
            throw new avlq(valueOf3.length() == 0 ? new String("Unable to parse time window string: ") : "Unable to parse time window string: ".concat(valueOf3), e);
        }
    }

    /* renamed from: a */
    public final String mo51366a(Context context, long j) {
        if (mo51368a(j)) {
            return DateUtils.formatDateTime(context, j, 1);
        }
        return DateUtils.formatDateTime(context, j + mo51369b(j), 1);
    }

    /* renamed from: a */
    public final boolean mo51368a(long j) {
        if (!mo51367a()) {
            return false;
        }
        if (mo51370b()) {
            return true;
        }
        long d = m78778d(j);
        long millis = TimeUnit.MINUTES.toMillis(this.f93374c);
        long millis2 = TimeUnit.MINUTES.toMillis(this.f93375d);
        if (millis > d || d > millis2) {
            if (millis <= millis2) {
                return false;
            }
            if (millis <= d || d <= millis2) {
                return true;
            }
            return false;
        }
        return true;
    }
}
