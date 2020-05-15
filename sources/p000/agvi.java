package p000;

import android.content.Context;
import android.os.Build;
import android.text.BidiFormatter;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.felicanetworks.mfc.C0126R;
import java.util.Locale;

/* renamed from: agvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agvi {
    static {
        srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);
    }

    /* renamed from: a */
    public static String m55173a(Context context, long j) {
        int i;
        int intValue = agqg.m54867v().intValue();
        if (intValue == 0) {
            return Formatter.formatShortFileSize(context, j);
        }
        if (context == null) {
            return "";
        }
        int i2 = Build.VERSION.SDK_INT;
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        agvk a = agvk.m55174a(j, intValue, locale);
        agvj agvj = a.f66659b;
        agvj agvj2 = agvj.B;
        int ordinal = agvj.ordinal();
        if (ordinal == 0) {
            i = C0126R.string.common_byte_short;
        } else if (ordinal == 1) {
            i = C0126R.string.common_kilobyte_short;
        } else if (ordinal == 2) {
            i = C0126R.string.common_megabyte_short;
        } else if (ordinal == 3) {
            i = C0126R.string.common_gigabyte_short;
        } else if (ordinal == 4) {
            i = C0126R.string.common_terabyte_short;
        } else if (ordinal == 5) {
            i = C0126R.string.common_petabyte_short;
        } else {
            throw new IllegalArgumentException("Wrong byte unit suffix");
        }
        String string = context.getString(C0126R.string.file_size_suffix, a.f66658a, context.getString(i));
        if (TextUtils.getLayoutDirectionFromLocale(locale) == 1) {
            return BidiFormatter.getInstance(true).unicodeWrap(string);
        }
        return string;
    }
}
