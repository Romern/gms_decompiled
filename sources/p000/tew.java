package p000;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.text.format.Time;
import com.felicanetworks.mfc.C0126R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: tew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tew {

    /* renamed from: a */
    public static final TimeZone f45804a = TimeZone.getTimeZone("UTC");

    /* renamed from: b */
    public static final SimpleDateFormat f45805b = new SimpleDateFormat("--MM-dd", Locale.US);

    /* renamed from: c */
    private static final SimpleDateFormat[] f45806c;

    static {
        SimpleDateFormat[] simpleDateFormatArr = {new SimpleDateFormat("yyyy-MM-dd", Locale.US), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'", Locale.US), new SimpleDateFormat("yyyyMMdd", Locale.US), new SimpleDateFormat("yyyyMMdd'T'HHmmssSSS'Z'", Locale.US), new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'", Locale.US), new SimpleDateFormat("yyyyMMdd'T'HHmm'Z'", Locale.US)};
        f45806c = simpleDateFormatArr;
        for (int i = 0; i < 7; i++) {
            SimpleDateFormat simpleDateFormat = simpleDateFormatArr[i];
            simpleDateFormat.setLenient(true);
            simpleDateFormat.setTimeZone(f45804a);
        }
        f45805b.setTimeZone(f45804a);
    }

    /* renamed from: a */
    private static long m36876a(long j, String str) {
        Time time = new Time();
        time.timezone = "UTC";
        time.set(j);
        time.timezone = str;
        return time.normalize(true);
    }

    /* renamed from: b */
    private static int m36883b(long j, long j2, long j3) {
        int julianDay = Time.getJulianDay(j, j3) - Time.getJulianDay(j2, j3);
        if (julianDay == 1) {
            return 2;
        }
        if (julianDay == 0 || DateUtils.isToday(j)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static String m36877a(long j, long j2, long j3, String str, boolean z, Context context) {
        int i;
        int i2;
        long j4 = j;
        long j5 = j3;
        String str2 = str;
        if (!m36881a(j4, j5)) {
            i = m36881a(j5, j4) ? 18 : 16;
        } else {
            i = 18;
        }
        if (!DateFormat.is24HourFormat(context)) {
            i2 = 1;
        } else {
            i2 = 129;
        }
        Time time = new Time(str2);
        time.set(j5);
        Resources resources = context.getResources();
        if (z) {
            long a = m36876a(j4, str2);
            String str3 = null;
            if (m36882a(a, m36876a(j2, str2), time.gmtoff)) {
                int b = m36883b(a, j3, time.gmtoff);
                if (b == 1) {
                    str3 = resources.getString(C0126R.string.common_today);
                } else if (b == 2) {
                    str3 = resources.getString(C0126R.string.profile_timestamp_string_tomorrow);
                }
            }
            return str3 == null ? DateUtils.formatDateRange(context, new Formatter(new StringBuilder(50), Locale.getDefault()), j, j2, i, "UTC").toString() : str3;
        } else if (!m36882a(j, j2, time.gmtoff)) {
            return m36879a(context, j, j2, i | i2 | 98304);
        } else {
            String a2 = m36879a(context, j, j2, i2);
            int b2 = m36883b(j, j3, time.gmtoff);
            if (b2 == 1) {
                return resources.getString(C0126R.string.profile_today_at_time_fmt, a2);
            } else if (b2 != 2) {
                return resources.getString(C0126R.string.profile_date_time_fmt, m36879a(context, j, j2, i), a2);
            } else {
                return resources.getString(C0126R.string.profile_tomorrow_at_time_fmt, a2);
            }
        }
    }

    /* renamed from: a */
    public static String m36878a(long j, long j2, Context context) {
        if (DateUtils.isToday(j)) {
            return DateUtils.formatDateTime(context, j, 1);
        }
        if (m36881a(j, j2)) {
            return new SimpleDateFormat("EEE h:mm a", Locale.getDefault()).format(new Date(j));
        }
        return new SimpleDateFormat("MMM d, yyyy", Locale.getDefault()).format(new Date(j));
    }

    /* renamed from: a */
    private static String m36879a(Context context, long j, long j2, int i) {
        String str;
        if ((i & 8192) == 0) {
            str = Time.getCurrentTimezone();
        } else {
            str = "UTC";
        }
        StringBuilder sb = new StringBuilder(50);
        Formatter formatter = new Formatter(sb, Locale.getDefault());
        sb.setLength(0);
        return DateUtils.formatDateRange(context, formatter, j, j2, i, str).toString();
    }

    /* renamed from: a */
    public static java.text.DateFormat m36880a(Context context) {
        String str;
        String str2;
        char c;
        String pattern = ((SimpleDateFormat) SimpleDateFormat.getDateInstance(1)).toPattern();
        if (!pattern.contains("de")) {
            str = "[^DdMm]*[Yy]+[^DdMm]*";
        } else {
            str = "[^Mm]*[Yy]+[^Mm]*";
        }
        try {
            return new SimpleDateFormat(pattern.replaceAll(str, ""), Locale.getDefault());
        } catch (IllegalArgumentException e) {
            char[] dateFormatOrder = DateFormat.getDateFormatOrder(context);
            int i = 0;
            while (true) {
                if (i >= dateFormatOrder.length || (c = dateFormatOrder[i]) == 'd') {
                    str2 = "dd MMMM";
                } else if (c == 'M') {
                    str2 = "MMMM dd";
                    break;
                } else {
                    i++;
                }
            }
            return new SimpleDateFormat(str2, Locale.getDefault());
        }
    }

    /* renamed from: a */
    public static boolean m36881a(long j, long j2) {
        Time time = new Time(TimeZone.getDefault().getDisplayName());
        time.set(j2);
        long j3 = time.gmtoff;
        return Time.getJulianDay(j, j3) - Time.getJulianDay(j2, j3) >= -5;
    }

    /* renamed from: a */
    private static boolean m36882a(long j, long j2, long j3) {
        return j == j2 || Time.getJulianDay(j, j3) == Time.getJulianDay(j2 + -1, j3);
    }
}
