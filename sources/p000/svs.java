package p000;

import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* renamed from: svs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class svs extends soa {

    /* renamed from: a */
    final /* synthetic */ PackageManager f45248a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public svs(PackageManager packageManager) {
        super(10);
        this.f45248a = packageManager;
    }

    public final void run() {
        if (svu.f45252d == null || !svu.f45252d.booleanValue()) {
            Log.i("CheckinCompat", "Enabling old GoogleServicesFramework version");
        } else {
            Log.i("CheckinCompat", "Disabling old GoogleServicesFramework version");
        }
        if (!svu.f45252d.booleanValue()) {
            svu.m36487a(this.f45248a, "com.google.android.gsf", ".checkin.CheckinService", svu.f45252d.booleanValue());
        }
        svu.m36487a(this.f45248a, "com.google.android.gsf", ".checkin.CheckinService$Receiver", svu.f45252d.booleanValue());
        svu.m36487a(this.f45248a, "com.google.android.gsf", ".checkin.CheckinService$TriggerReceiver", svu.f45252d.booleanValue());
        svu.m36487a(this.f45248a, "com.google.android.gsf", ".checkin.CheckinService$SecretCodeReceiver", svu.f45252d.booleanValue());
        if (svu.f45252d.booleanValue()) {
            svu.m36489b();
            svu.m36487a(this.f45248a, "com.google.android.gsf", ".checkin.CheckinService", svu.f45252d.booleanValue());
        }
        int i = Build.VERSION.SDK_INT;
        svu.m36487a(this.f45248a, "com.google.android.gsf", ".update.SystemUpdateActivity", svu.f45251c.booleanValue());
        if (!svu.f45251c.booleanValue()) {
            svu.m36487a(this.f45248a, "com.google.android.gsf", ".update.SystemUpdateService", svu.f45251c.booleanValue());
        }
        svu.m36487a(this.f45248a, "com.google.android.gsf", ".update.SystemUpdateService$SecretCodeReceiver", svu.f45251c.booleanValue());
        svu.m36487a(this.f45248a, "com.google.android.gsf", ".update.SystemUpdateService$Receiver", svu.f45251c.booleanValue());
        if (svu.f45251c.booleanValue()) {
            svu.m36489b();
            svu.m36487a(this.f45248a, "com.google.android.gsf", ".update.SystemUpdateService", svu.f45251c.booleanValue());
        }
        svu.m36487a(this.f45248a, "com.google.android.gsf", ".checkin.EventLogService", svu.f45252d.booleanValue());
        svu.m36487a(this.f45248a, "com.google.android.gsf", ".checkin.EventLogService$Receiver", svu.f45252d.booleanValue());
        if (svu.f45252d == null || !svu.f45252d.booleanValue()) {
            Log.i("CheckinCompat", "Done enabling old GoogleServicesFramework version");
        } else {
            Log.i("CheckinCompat", "Done disabling old GoogleServicesFramework version");
        }
    }
}
