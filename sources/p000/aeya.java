package p000;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.locationsharing.common.model.SharingCondition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: aeya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeya {

    /* renamed from: a */
    private static final long f63996a = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: a */
    public static long m52671a(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance.set(14, 0);
        instance.set(13, 0);
        return instance.getTimeInMillis();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aeya.a(android.content.Context, boolean, long):java.lang.String
     arg types: [android.content.Context, int, long]
     candidates:
      aeya.a(android.content.Context, long, long):java.lang.String
      aeya.a(android.content.Context, boolean, long):java.lang.String */
    /* renamed from: b */
    public static String m52676b(Context context, long j) {
        return context.getString(C0126R.string.location_sharing_temporary_duration, m52675a(context, true, j));
    }

    /* renamed from: a */
    public static String m52672a(Context context, long j) {
        return m52673a(context, j, System.currentTimeMillis());
    }

    /* renamed from: a */
    static String m52673a(Context context, long j, long j2) {
        String str;
        Date date = new Date(j2 + j);
        long days = TimeUnit.MILLISECONDS.toDays(j);
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        if (days <= 0) {
            str = !is24HourFormat ? "h:mm a" : "H:mm";
        } else {
            str = !is24HourFormat ? "EEE h:mm a" : "EEE H:mm";
        }
        return new SimpleDateFormat(str, Locale.getDefault()).format(date);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aeya.a(android.content.Context, boolean, long):java.lang.String
     arg types: [android.content.Context, int, long]
     candidates:
      aeya.a(android.content.Context, long, long):java.lang.String
      aeya.a(android.content.Context, boolean, long):java.lang.String */
    /* renamed from: a */
    public static String m52674a(Context context, SharingCondition sharingCondition) {
        long currentTimeMillis = System.currentTimeMillis();
        int c = sharingCondition.mo43781c();
        int i = c - 1;
        if (c == 0) {
            throw null;
        } else if (i == 0) {
            return context.getString(C0126R.string.location_sharing_persistent_share);
        } else {
            if (i == 1) {
                long b = sharingCondition.mo43780b();
                if (b < f63996a) {
                    return context.getString(C0126R.string.location_sharing_expiration_soon);
                }
                return context.getString(C0126R.string.location_sharing_expiration, m52675a(context, false, b), m52673a(context, b, currentTimeMillis));
            } else if (i != 2) {
                return null;
            } else {
                return context.getString(C0126R.string.location_sharing_expiration_destination, sharingCondition.f79645c.f79647a);
            }
        }
    }

    /* renamed from: a */
    public static String m52675a(Context context, boolean z, long j) {
        String str;
        String str2;
        int days = (int) TimeUnit.MILLISECONDS.toDays(j);
        long millis = j - TimeUnit.DAYS.toMillis((long) days);
        int hours = (int) TimeUnit.MILLISECONDS.toHours(millis);
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(millis - TimeUnit.HOURS.toMillis((long) hours));
        Resources resources = context.getResources();
        String quantityString = resources.getQuantityString(C0126R.plurals.location_sharing_expiration_days, days, Integer.valueOf(days));
        if (z) {
            str = resources.getQuantityString(C0126R.plurals.location_sharing_expiration_hours_extended, hours, Integer.valueOf(hours));
            str2 = resources.getQuantityString(C0126R.plurals.location_sharing_expiration_minutes_extended, minutes, Integer.valueOf(minutes));
        } else {
            str = resources.getQuantityString(C0126R.plurals.location_sharing_expiration_hours, hours, Integer.valueOf(hours));
            str2 = resources.getQuantityString(C0126R.plurals.location_sharing_expiration_minutes, minutes, Integer.valueOf(minutes));
        }
        if (days != 0) {
            if (hours == 0) {
                return quantityString;
            }
            return resources.getString(C0126R.string.location_sharing_expiration_days_hours, quantityString, str);
        } else if (hours == 0) {
            return str2;
        } else {
            if (minutes == 0) {
                return str;
            }
            return resources.getString(C0126R.string.location_sharing_expiration_hours_minutes, str, str2);
        }
    }
}
