package p000;

import android.content.Context;
import android.text.format.DateUtils;
import com.felicanetworks.mfc.C0126R;
import java.text.DateFormat;
import java.util.Calendar;

/* renamed from: aqqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqqv {
    /* renamed from: a */
    public static String m71995a(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        StringBuilder sb = new StringBuilder("(?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m71996a(long j, Context context) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j);
        if (m71997a(instance2, instance)) {
            return DateFormat.getTimeInstance(3).format(instance2.getTime());
        }
        instance.add(6, -1);
        if (m71997a(instance2, instance)) {
            return context.getString(C0126R.string.common_yesterday);
        }
        instance.add(6, 2);
        if (m71997a(instance2, instance)) {
            return context.getString(C0126R.string.profile_timestamp_string_tomorrow);
        }
        return DateUtils.formatDateTime(context, instance2.getTimeInMillis(), 24);
    }

    /* renamed from: a */
    private static boolean m71997a(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }
}
