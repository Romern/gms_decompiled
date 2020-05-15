package p000;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.location.quake.stages.SettingsChangeListener$1;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bgtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bgtd extends bgtb {

    /* renamed from: b */
    public static final /* synthetic */ int f117477b = 0;

    /* renamed from: a */
    protected final Context f117478a;

    /* renamed from: c */
    private BroadcastReceiver f117479c;

    static {
        srn.m36125a("QStage");
    }

    public bgtd(Context context, bgsq bgsq) {
        super(bgsq);
        this.f117478a = context;
    }

    /* renamed from: c */
    protected static boolean m99887c(Context context) {
        List<Account> d = soz.m35801d(context, context.getPackageName());
        if (d != null && !d.isEmpty()) {
            for (Account account : d) {
                try {
                    ReportingState reportingState = (ReportingState) aucu.m76783a(aeqc.m52384a(context).mo24736c(account), cevi.f183455a.mo6606a().connectionlessTimeoutSeconds(), TimeUnit.SECONDS);
                    if (reportingState != null && reportingState.f79601b) {
                        return true;
                    }
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    protected static boolean m99888d(Context context) {
        List<Account> d = soz.m35801d(context, context.getPackageName());
        if (d != null && !d.isEmpty()) {
            for (Account account : d) {
                if (soz.m35808f(context, account.name)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public static String m99889g() {
        int i = Build.VERSION.SDK_INT;
        return "android.location.MODE_CHANGED";
    }

    /* renamed from: a */
    public final int mo63067a() {
        if (!mo63123e()) {
            return !mo63124f() ? 3 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public final void mo63068b() {
        SettingsChangeListener$1 settingsChangeListener$1 = new SettingsChangeListener$1(this, "location");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(m99889g());
        intentFilter.addAction("com.google.android.gms.phenotype.COMMITTED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        intentFilter.addAction("com.google.android.gms.location.reporting.SETTINGS_CHANGED");
        this.f117478a.registerReceiver(settingsChangeListener$1, intentFilter);
        this.f117479c = settingsChangeListener$1;
    }

    /* renamed from: c */
    public final void mo63069c() {
        BroadcastReceiver broadcastReceiver = this.f117479c;
        if (broadcastReceiver != null) {
            this.f117478a.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: e */
    public boolean mo63123e() {
        if (aymk.m84257a(this.f117478a.getContentResolver(), "network_location_opt_in", -1) != 1 || !soz.m35811h(rpr.m34216b()) || !srs.m36149a(this.f117478a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo63124f() {
        if (aeri.m52437b(this.f117478a)) {
            Context context = this.f117478a;
            int i = Build.VERSION.SDK_INT;
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 1) {
                return false;
            }
        }
        return true;
    }
}
