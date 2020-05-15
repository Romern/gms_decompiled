package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: ajwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajwp {

    /* renamed from: a */
    public final sqv f71451a;

    /* renamed from: b */
    private final Context f71452b;

    public ajwp(Context context, sqv sqv) {
        this.f71452b = context;
        this.f71451a = sqv;
    }

    /* renamed from: a */
    public static ajwp m59150a(Context context) {
        return new ajwp(context, srb.f45012a);
    }

    /* renamed from: b */
    public final void mo39009b() {
        mo39010c().edit().remove("dont_show_notification_again").remove("most_recent_notification_dismissed_timestamp").apply();
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("ajwp", "b", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Resetting the fast init notification blacklist.");
    }

    /* renamed from: c */
    public final SharedPreferences mo39010c() {
        return this.f71452b.getSharedPreferences("nearbysharing:fastinitblacklist:state", 0);
    }

    /* renamed from: a */
    public final void mo39007a() {
        mo39010c().edit().putLong("most_recent_notification_dismissed_timestamp", this.f71451a.mo20505a()).apply();
        String format = DateFormat.getDateTimeInstance().format(new Date(System.currentTimeMillis() + cfov.m142072y()));
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("ajwp", "a", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("User dismissed the fast init notification. Not showing the notification until %s.", format);
    }

    /* renamed from: a */
    public final boolean mo39008a(boolean z, boolean z2) {
        if (this.f71451a.mo20505a() - mo39010c().getLong("most_recent_notification_dismissed_timestamp", 0) < cfov.m142072y()) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("ajwp", "a", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Not showing fast init notifications: the user recently dismissed the notification.");
            return true;
        } else if (z) {
            return !z2;
        } else {
            return mo39010c().getBoolean("dont_show_notification_again", false);
        }
    }
}
