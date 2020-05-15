package p000;

import android.content.Context;
import android.text.format.DateUtils;
import android.text.format.Time;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: anmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anmt {

    /* renamed from: a */
    private static Time f77163a;

    /* renamed from: a */
    private static synchronized long m64786a(long j, long j2) {
        long abs;
        synchronized (anmt.class) {
            if (f77163a == null) {
                f77163a = new Time();
            }
            f77163a.set(j);
            int julianDay = Time.getJulianDay(j, f77163a.gmtoff);
            f77163a.set(j2);
            abs = (long) Math.abs(Time.getJulianDay(j2, f77163a.gmtoff) - julianDay);
        }
        return abs;
    }

    /* renamed from: a */
    public static CharSequence m64787a(Context context, long j) {
        int i;
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j < 60000) {
            return context.getResources().getText(C0126R.string.plus_posted_just_now);
        }
        try {
            return DateUtils.getRelativeTimeSpanString(j, currentTimeMillis, 60000, AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE).toString();
        } catch (Exception e) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long j3 = currentTimeMillis2 - j;
            if (j3 < 60000) {
                return context.getResources().getText(C0126R.string.plus_posted_just_now);
            }
            long abs = Math.abs(j3);
            if (abs < 3600000) {
                j2 = abs / 60000;
                i = C0126R.plurals.plus_num_minutes_ago;
            } else if (abs < 86400000) {
                j2 = abs / 3600000;
                i = C0126R.plurals.plus_num_hours_ago;
            } else if (abs >= 604800000) {
                return DateUtils.formatDateRange(context, j, j, AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
            } else {
                j2 = m64786a(j, currentTimeMillis2);
                i = C0126R.plurals.plus_num_days_ago;
            }
            return String.format(context.getResources().getQuantityString(i, (int) j2), Long.valueOf(j2));
        }
    }
}
