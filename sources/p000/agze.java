package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.text.style.URLSpan;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.util.TimeTextUtils$URLSpanMediumNoUnderline;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: agze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agze {

    /* renamed from: a */
    public static final Typeface f66901a = Typeface.create("sans-serif-medium", 0);

    /* renamed from: b */
    private static final List f66902b = Arrays.asList(new agzd("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));

    static {
        srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);
    }

    /* renamed from: a */
    public static double m55326a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return d / 1000000.0d;
    }

    /* renamed from: b */
    public static CharSequence m55337b(Context context, bxyk bxyk, bxyk bxyk2) {
        long j;
        long j2;
        if (bxyk2 == null) {
            j = System.currentTimeMillis();
        } else {
            j = bxzt.m124578a(bxyk2);
        }
        if (bxyk != null) {
            j2 = bxzt.m124578a(bxyk);
        } else {
            j2 = j;
        }
        if (j - j2 < TimeUnit.MINUTES.toMillis(1)) {
            return context.getString(C0126R.string.just_now);
        }
        return DateUtils.getRelativeTimeSpanString(Math.min(j2, j), j, 60000, AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
    }

    /* renamed from: c */
    public static long m55341c(String str) {
        if (!TextUtils.isEmpty(str)) {
            String b = m55339b(str);
            for (ThreadLocal threadLocal : f66902b) {
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) threadLocal.get();
                try {
                    return simpleDateFormat.parse(b).getTime() - System.currentTimeMillis();
                } catch (ParseException e) {
                    simpleDateFormat.toPattern();
                }
            }
            String valueOf = String.valueOf(b);
            throw new ParseException(valueOf.length() == 0 ? new String("Unparseable date: ") : "Unparseable date: ".concat(valueOf), -1);
        }
        throw new ParseException("Time string is empty or null", -1);
    }

    /* renamed from: d */
    public static ZonedDateTime m55342d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return ZonedDateTime.parse(m55339b(str), DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
            } catch (DateTimeParseException e) {
                throw new ParseException(e.getMessage(), e.getErrorIndex());
            }
        } else {
            throw new ParseException("Time string is empty or null", -1);
        }
    }

    /* renamed from: e */
    public static String m55343e(String str) {
        String valueOf = String.valueOf(str.substring(0, 1).toUpperCase());
        String valueOf2 = String.valueOf(str.substring(1).toLowerCase());
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: a */
    public static Spanned m55327a(String str) {
        int i = Build.VERSION.SDK_INT;
        return Html.fromHtml(str, 0);
    }

    /* renamed from: a */
    public static Spanned m55328a(String str, String str2) {
        Spanned a = m55327a(str2);
        CharSequence[] charSequenceArr = new CharSequence[2];
        charSequenceArr[0] = str;
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(a);
        URLSpan[] uRLSpanArr = (URLSpan[]) newSpannable.getSpans(0, newSpannable.length(), URLSpan.class);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = newSpannable.getSpanStart(uRLSpan);
            int spanEnd = newSpannable.getSpanEnd(uRLSpan);
            newSpannable.removeSpan(uRLSpan);
            newSpannable.setSpan(new TimeTextUtils$URLSpanMediumNoUnderline(uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        charSequenceArr[1] = newSpannable;
        return (Spanned) TextUtils.concat(charSequenceArr);
    }

    /* renamed from: a */
    public static CharSequence m55329a(Context context, bxyk bxyk, bxyk bxyk2) {
        bxun a = bxzt.m124579a(bxyk, bxyk2);
        bxzr.m124577b(a);
        if (a.f164863a / 60 < 1) {
            return context.getString(C0126R.string.updated_just_now);
        }
        return context.getString(C0126R.string.update_info_viewholder_last_updated_at, m55337b(context, bxyk, bxyk2));
    }

    /* renamed from: b */
    public static String m55338b(long j, Context context) {
        if (j >= 0) {
            long days = TimeUnit.MILLISECONDS.toDays(j);
            if (days >= 30) {
                return DateUtils.formatDateTime(context, j + System.currentTimeMillis(), 0);
            }
            if (days == 0) {
                return m55330a(j, context);
            }
            return context.getResources().getQuantityString(C0126R.plurals.unit_days, (int) days, Long.valueOf(days));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Negative time left duration %d", Long.valueOf(j)));
    }

    /* renamed from: a */
    public static String m55330a(long j, Context context) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(hours);
        if ((hours == 0 && minutes == 0) || hours < 0 || minutes < 0) {
            return context.getResources().getQuantityString(C0126R.plurals.unit_minutes, 0, 0);
        } else if (hours > 0 && minutes > 0) {
            return context.getString(C0126R.string.hour_minute_time, context.getResources().getQuantityString(C0126R.plurals.unit_hours, (int) hours, Long.valueOf(hours)), context.getResources().getQuantityString(C0126R.plurals.unit_minutes, (int) minutes, Long.valueOf(minutes)));
        } else if (hours <= 0) {
            return context.getResources().getQuantityString(C0126R.plurals.unit_minutes, (int) minutes, Long.valueOf(minutes));
        } else {
            return context.getResources().getQuantityString(C0126R.plurals.unit_hours, (int) hours, Long.valueOf(hours));
        }
    }

    /* renamed from: b */
    public static String m55339b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String replace = str.replace("Z", "+00:00");
            int lastIndexOf = replace.lastIndexOf(58);
            if (lastIndexOf >= 0) {
                String valueOf = String.valueOf(replace.substring(0, lastIndexOf));
                String valueOf2 = String.valueOf(replace.substring(lastIndexOf + 1));
                return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            }
            StringBuilder sb = new StringBuilder(String.valueOf(replace).length() + 36);
            sb.append("Time string \"");
            sb.append(replace);
            sb.append("\" doesn't contain colon");
            throw new ParseException(sb.toString(), -1);
        }
        throw new ParseException("Time string is empty or null", -1);
    }

    /* renamed from: a */
    public static String m55331a(String str, Context context) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(m55339b(str));
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(parse);
            if (!DateFormat.is24HourFormat(context)) {
                str2 = "MMM d, h:mm a";
            } else {
                str2 = "MMM d, H:mm";
            }
            if (gregorianCalendar.get(1) != new GregorianCalendar().get(1)) {
                str2 = str2.replace("d, ", "d, yyyy, ");
            }
            return new SimpleDateFormat(str2, Locale.getDefault()).format(parse);
        }
        throw new ParseException("Expiration time string is empty or null", -1);
    }

    /* renamed from: b */
    public static boolean m55340b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new ParseException("Time string is empty or null", -1);
        }
        String b = m55339b(str);
        String b2 = m55339b(str2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSSZ");
        Date parse = simpleDateFormat.parse(b);
        Date parse2 = simpleDateFormat.parse(b2);
        Calendar instance = Calendar.getInstance();
        instance.setTime(parse);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(parse2);
        Calendar instance3 = Calendar.getInstance();
        m55335a(instance3, instance);
        m55335a(instance3, instance2);
        return instance.compareTo(instance2) > 0 ? instance.compareTo(instance3) <= 0 || instance3.compareTo(instance2) <= 0 : instance.compareTo(instance3) <= 0 && instance3.compareTo(instance2) <= 0;
    }

    /* renamed from: a */
    public static String m55332a(String str, String str2, Context context) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSSZ");
        Date parse = simpleDateFormat.parse(m55339b(str));
        Date parse2 = simpleDateFormat.parse(m55339b(str2));
        String a = m55333a(parse, context);
        String a2 = m55333a(parse2, context);
        if (!DateFormat.is24HourFormat(context)) {
            a2 = a2.concat(" a");
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance.setTime(parse);
            instance2.setTime(parse2);
            if (instance.get(9) != instance2.get(9)) {
                a = a.concat(" a");
            }
        }
        return context.getString(C0126R.string.time_range, new SimpleDateFormat(a).format(parse), new SimpleDateFormat(a2).format(parse2));
    }

    /* renamed from: a */
    private static String m55333a(Date date, Context context) {
        if (DateFormat.is24HourFormat(context)) {
            return "HH:mm";
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return instance.get(12) != 0 ? "h:mm" : "h";
    }

    /* renamed from: a */
    public static void m55334a(StringBuilder sb, String str) {
        sb.append(10);
        sb.append(str);
        sb.append(10);
    }

    /* renamed from: a */
    public static void m55335a(Calendar calendar, Calendar calendar2) {
        calendar2.set(1, calendar.get(1));
        calendar2.set(2, calendar.get(2));
        calendar2.set(5, calendar.get(5));
    }

    /* renamed from: a */
    public static boolean m55336a(MdpDataPlanStatus[] mdpDataPlanStatusArr) {
        int length;
        if (mdpDataPlanStatusArr == null || (length = mdpDataPlanStatusArr.length) == 0) {
            return false;
        }
        if (length < 2) {
            return true;
        }
        String str = mdpDataPlanStatusArr[0].f80164c;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i = 1; i < mdpDataPlanStatusArr.length; i++) {
            if (!str.equals(mdpDataPlanStatusArr[i].f80164c)) {
                return false;
            }
        }
        return true;
    }
}
