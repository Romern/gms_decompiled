package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bjys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjys {
    /* renamed from: a */
    public static boolean m104924a(Context context, String str, Intent intent) {
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        if (resolveActivity != null) {
            int i = resolveActivity.activityInfo.theme;
            try {
                Resources.Theme newTheme = packageManager.getResourcesForApplication(str).newTheme();
                newTheme.applyStyle(i, true);
                TypedArray obtainStyledAttributes = newTheme.obtainStyledAttributes(new int[]{16842840});
                boolean z = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                return z;
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalStateException("Native app redirect flow activity not found for checking theme translucency.");
        }
    }

    /* renamed from: a */
    public static boolean m104925a(String str, int i, String str2, int i2) {
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = Pattern.compile(str2).matcher(Integer.toString(i2));
            if (!matcher.find()) {
                Log.e("AppValidationUtils", String.format(Locale.US, "Version code regex (%s) for package=%s failed to find a match with version=%d.", str2, str, Integer.valueOf(i2)));
                return false;
            }
            i2 = Integer.parseInt(matcher.group());
        }
        return i2 >= i;
    }
}
