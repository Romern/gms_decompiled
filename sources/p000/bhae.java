package p000;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhae {
    /* renamed from: a */
    public static Uri m100520a(Context context, boolean z) {
        return new Uri.Builder().scheme("condition").authority(context.getPackageName()).appendPath(Boolean.toString(z)).appendPath(Integer.toString((int) ceyg.m138422c())).appendQueryParameter("provider", m100521a(context)).appendQueryParameter("rule_source", "driving_mode").appendQueryParameter("driving_mode_enable_dnd_rule", !z ? "false" : "true").build();
    }

    /* renamed from: a */
    static String m100521a(Context context) {
        return context.getString(C0126R.string.driving_mode_driving);
    }

    /* renamed from: a */
    public static void m100522a(Context context, sex sex, boolean z) {
        sex.mo25438a(new AutomaticZenRule(m100521a(context), new ComponentName(context.getPackageName(), "com.google.android.location.settings.DrivingConditionProvider"), m100520a(context, z), (int) ceyg.m138422c(), true));
    }
}
