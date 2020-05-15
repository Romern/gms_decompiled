package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Patterns;
import com.felicanetworks.mfc.C0126R;
import java.util.Calendar;

/* renamed from: apel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apel {
    /* renamed from: a */
    public static String m70097a(Context context, long j) {
        String c = m70104c(context, j);
        return context.getResources().getString(C0126R.string.romanesco_last_backup_date, c);
    }

    /* renamed from: b */
    public static SharedPreferences m70102b(Context context) {
        return context.getApplicationContext().getSharedPreferences("people_ui_contacts_backup_and_restore_settings", 0);
    }

    /* renamed from: c */
    public static String m70104c(Context context, long j) {
        Calendar instance = Calendar.getInstance();
        int i = instance.get(1);
        instance.setTimeInMillis(j);
        if (instance.get(1) == i) {
            return DateUtils.formatDateTime(context, j, 65560);
        }
        return DateUtils.formatDateTime(context, j, 65556);
    }

    /* renamed from: a */
    public static String m70098a(apej apej) {
        return apej.mo47137a() ? Long.toString(apej.f84230b.longValue()) : apej.f84229a;
    }

    /* renamed from: b */
    public static String m70103b(Context context, long j) {
        String c = m70104c(context, j);
        return context.getResources().getString(C0126R.string.romanesco_last_restore_date, c);
    }

    /* renamed from: a */
    public static boolean m70099a(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
    }

    /* renamed from: a */
    public static boolean m70100a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return aoxs.m69790b(context).contains(str);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m70101a(String str) {
        return !TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }
}
