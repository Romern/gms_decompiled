package p000;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhav {

    /* renamed from: a */
    public String f118214a;

    /* renamed from: b */
    public boolean f118215b;

    /* renamed from: c */
    public int f118216c;

    public bhav(boolean z, int i) {
        this.f118215b = z;
        this.f118216c = i;
    }

    /* renamed from: a */
    public static bhav m100529a(Uri uri) {
        try {
            return new bhav(Boolean.parseBoolean(uri.getPathSegments().get(0)), Integer.parseInt(uri.getPathSegments().get(1)));
        } catch (IndexOutOfBoundsException | NullPointerException | NumberFormatException e) {
            String valueOf = String.valueOf(uri.toString());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Could not parse ") : "Could not parse ".concat(valueOf));
        }
    }

    /* renamed from: b */
    public static String m100530b(Context context) {
        if (bhaw.m100532a(context)) {
            return context.getString(C0126R.string.driving_mode_driving);
        }
        return context.getString(C0126R.string.dnd_driving);
    }

    /* renamed from: a */
    public final AutomaticZenRule mo63496a(Context context) {
        return new AutomaticZenRule(m100530b(context), new ComponentName(context.getPackageName(), "com.google.android.location.settings.DrivingConditionProvider"), new Uri.Builder().scheme("condition").authority(context.getPackageName()).appendPath(Boolean.toString(this.f118215b)).appendPath(Integer.toString(this.f118216c)).appendQueryParameter("provider", m100530b(context)).build(), this.f118216c, this.f118215b);
    }
}
