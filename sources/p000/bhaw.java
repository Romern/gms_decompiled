package p000;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.service.notification.Condition;
import android.text.TextUtils;
import android.util.ArraySet;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.ConditionProviderService;
import java.util.Set;

/* renamed from: bhaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bhaw extends ConditionProviderService {

    /* renamed from: a */
    protected final Set f118217a = new ArraySet();

    /* renamed from: b */
    private boolean f118218b = false;

    /* renamed from: a */
    protected static boolean m100532a(Context context) {
        sex a = sex.m35104a(context);
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.google.android.location.settings.DrivingConditionProvider");
        for (AutomaticZenRule automaticZenRule : a.mo25454f().values()) {
            if (componentName.equals(automaticZenRule.getOwner())) {
                return m100533a(automaticZenRule.getConditionId());
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m100534b(Uri uri) {
        if (m100533a(uri)) {
            m100535c(3);
        } else {
            m100535c(2);
        }
    }

    /* renamed from: c */
    private final void m100535c(int i) {
        synchronized (this.f118217a) {
            if (!m100536e()) {
                if (this.f118218b) {
                    mo63501b(i);
                    this.f118218b = false;
                }
            } else if (!this.f118218b) {
                mo63498a(i);
                this.f118218b = true;
            }
        }
    }

    /* renamed from: e */
    private final boolean m100536e() {
        sex a = sex.m35104a(getApplicationContext());
        ComponentName componentName = new ComponentName(getApplicationContext().getPackageName(), mo63497a());
        for (AutomaticZenRule automaticZenRule : a.mo25454f().values()) {
            if (automaticZenRule.isEnabled() && componentName.equals(automaticZenRule.getOwner())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo63497a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo63498a(int i);

    /* renamed from: b */
    public abstract String mo63500b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo63501b(int i);

    /* renamed from: c */
    public abstract bhav mo63502c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo63503d() {
        if (!m100536e()) {
            int i = Build.VERSION.SDK_INT;
            if (ceuw.m138274b()) {
                super.requestUnbind();
            }
        }
    }

    public IBinder onBind(Intent intent) {
        IBinder onBind = super.onBind(intent);
        SharedPreferences sharedPreferences = getSharedPreferences("dnd_providers", 0);
        String concat = String.valueOf(mo63500b()).concat("_first_run");
        if (sharedPreferences.getBoolean(concat, true) && ceyg.f183508a.mo6606a().addDndRuleOnBind()) {
            try {
                sex.m35104a(this).mo25438a(mo63502c().mo63496a(this));
            } catch (IllegalArgumentException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("ZenCondProv", valueOf.length() == 0 ? new String("IllegalArgument exception = ") : "IllegalArgument exception = ".concat(valueOf));
            } catch (SecurityException e2) {
                String valueOf2 = String.valueOf(e2.getMessage());
                Log.w("ZenCondProv", valueOf2.length() == 0 ? new String("Security exception = ") : "Security exception = ".concat(valueOf2));
            }
            sharedPreferences.edit().putBoolean(concat, false).apply();
        }
        return onBind;
    }

    public final void onConnected() {
        mo63503d();
    }

    public final void onSubscribe(Uri uri) {
        if (uri != null) {
            try {
                synchronized (this.f118217a) {
                    this.f118217a.add(uri);
                }
                m100534b(uri);
            } catch (SecurityException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("ZenCondProv", valueOf.length() == 0 ? new String("Security exception = ") : "Security exception = ".concat(valueOf));
                return;
            }
        }
        if (ceut.m138271b() && uri != null && m100533a(uri)) {
            mo63499a(uri.getBooleanQueryParameter("driving_mode_enable_dnd_rule", false), getString(C0126R.string.dnd_state_driving));
        }
    }

    public final void onUnsubscribe(Uri uri) {
        if (uri != null) {
            try {
                synchronized (this.f118217a) {
                    this.f118217a.remove(uri);
                }
                m100534b(uri);
                mo63503d();
            } catch (SecurityException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("ZenCondProv", valueOf.length() == 0 ? new String("Security exception = ") : "Security exception = ".concat(valueOf));
            }
        }
    }

    /* renamed from: a */
    protected static boolean m100533a(Uri uri) {
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("rule_source");
            return !TextUtils.isEmpty(queryParameter) && queryParameter.equalsIgnoreCase("driving_mode");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63499a(boolean z, String str) {
        synchronized (this.f118217a) {
            for (Uri uri : this.f118217a) {
                notifyCondition(new Condition(uri, str, z ? 1 : 0));
            }
        }
    }
}
