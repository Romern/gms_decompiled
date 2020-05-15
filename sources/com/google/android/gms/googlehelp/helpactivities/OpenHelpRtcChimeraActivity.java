package com.google.android.gms.googlehelp.helpactivities;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.Activity;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OpenHelpRtcChimeraActivity extends Activity {

    /* renamed from: a */
    private bqgj f78978a;

    /* renamed from: b */
    private abcr f78979b;

    /* renamed from: c */
    private boolean f78980c = false;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class OnPackageChangeOperation extends IntentOperation {
        public final void onHandleIntent(Intent intent) {
            String str;
            String action = intent.getAction();
            if ("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_CHANGED".equals(action)) {
                Uri data = intent.getData();
                if (data != null) {
                    str = data.getSchemeSpecificPart();
                } else {
                    str = "";
                }
                if (str != null && "com.google.android.apps.helprtc".equals(str)) {
                    Intent addFlags = new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcActivity")).addFlags(268435456);
                    addFlags.putExtra("launch_source_key", "launch_source_package_update_value");
                    addFlags.putExtra("package_change_type_key", action);
                    startActivity(addFlags);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m66589a(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("invitationId");
        }
        return null;
    }

    /* renamed from: b */
    private final void m66592b() {
        String str;
        if (!mo43366a() || ((long) new aavf(this).mo31825a()) <= ceeg.m136411p()) {
            mo43365a(getIntent().getExtras().getString("invitationId"), !mo43366a() ? MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA : MfiClientException.TYPE_NO_ACCOUNT_INFO);
            String a = m66589a(getIntent().getExtras());
            Intent className = new Intent().setClassName(getApplicationContext(), "com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcActivity");
            className.putExtra("play_store_key", "play_store_value");
            className.putExtra("invitationId", a);
            PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 10104, className, 134217728);
            Context applicationContext = getApplicationContext();
            sex a2 = sex.m35104a(applicationContext);
            C1102je jeVar = new C1102je(applicationContext, "open_helprtc_channel_id");
            jeVar.mo13640e(getString(C0126R.string.gh_notify_install_google_support_services_title));
            jeVar.f22258j = 1;
            jeVar.mo13616a(3);
            jeVar.mo13630b(qkj.m32287a(this, C0126R.C0127drawable.quantum_ic_brightness_1_googblue_24));
            jeVar.mo13632b(getString(C0126R.string.gh_notify_install_google_support_services_content));
            jeVar.f22254f = activity;
            jeVar.mo13627a(true);
            int i = Build.VERSION.SDK_INT;
            if (a2.mo25437a("open_helprtc_channel_id") == null) {
                if (aaya.m47229b(ceik.m136924b())) {
                    str = getString(C0126R.string.gh_top_appbar_support_label);
                } else {
                    str = "open helprtc channel name";
                }
                a2.mo25442a(new NotificationChannel("open_helprtc_channel_id", str, 4));
            }
            a2.mo25441a(4104, jeVar.mo13629b());
            moveTaskToBack(true);
            return;
        }
        Intent addFlags = new Intent().setComponent(new ComponentName("com.google.android.apps.helprtc", "com.google.android.apps.helprtc.ui.ScreenshareActivity")).addFlags(805306368);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            for (String str2 : extras.keySet()) {
                Object obj = extras.get(str2);
                if (obj != null) {
                    addFlags.putExtra(str2, obj.toString());
                }
            }
        }
        try {
            startActivity(addFlags);
        } catch (Exception e) {
            Log.e("gH_OpenHelpRtcActivity", "Unable to start the screenshare activity.", e);
        } catch (Throwable th) {
            finishAndRemoveTask();
            throw th;
        }
        finishAndRemoveTask();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundle;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            int a = new aavf(this).mo31825a();
            long j = (long) a;
            long p = ceeg.m136411p();
            if (a <= 0 || j <= p) {
                if (getIntent() != null) {
                    bundle = getIntent().getExtras();
                } else {
                    bundle = null;
                }
                String a2 = m66589a(bundle);
                HelpConfig helpConfig = new HelpConfig();
                helpConfig.f78827b = "com.google.android.apps.helprtc";
                helpConfig.f78830e = abcx.m47461a(a2);
                Context applicationContext = getApplicationContext();
                if (this.f78978a == null) {
                    this.f78978a = snp.m35702a(9);
                }
                bqgj bqgj = this.f78978a;
                bqgj.execute(new abff(applicationContext, helpConfig, a2, bqgj, this.f78979b));
                if (a > 0) {
                    i3 = 161;
                } else {
                    i3 = 160;
                }
                mo43365a(a2, i3);
                Toast.makeText(this, getString(C0126R.string.gh_google_support_services_not_installed), 1).show();
                finishAndRemoveTask();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f78979b = new abcr(this);
        requestWindowFeature(1);
        if (m66591a(getIntent())) {
            m66592b();
        } else {
            finishAndRemoveTask();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        abcr abcr = this.f78979b;
        if (abcr != null) {
            abcr.close();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private final void m66590a(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.helprtc"));
            this.f78980c = true;
            startActivityForResult(intent, 100);
        } catch (ActivityNotFoundException e) {
            mo43365a(str, MfiClientException.TYPE_CARD_NOT_CACHED);
            String string = getString(C0126R.string.gh_play_store_activity_or_browser_not_found);
            Log.e("gH_OpenHelpRtcActivity", string, e);
            Toast.makeText(this, string, 1).show();
            finishAndRemoveTask();
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        int i;
        super.onNewIntent(intent);
        if (m66591a(intent) && this.f78980c) {
            startActivity(intent);
        } else if (m66591a(intent) && !this.f78980c) {
            setIntent(intent);
            m66592b();
        } else if (intent.getExtras() != null && "play_store_value".equals(intent.getExtras().getString("play_store_key"))) {
            m66590a(intent.getExtras().getString("invitationId"));
        } else if (intent.getExtras() != null && "launch_source_package_update_value".equals(intent.getExtras().getString("launch_source_key"))) {
            String a = m66589a(getIntent().getExtras());
            if (!"android.intent.action.PACKAGE_CHANGED".equals(intent.getExtras().getString("package_change_type_key"))) {
                i = MfiClientException.TYPE_ILLEGAL_CARD_OPERATION;
            } else {
                i = MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE;
            }
            mo43365a(a, i);
            m66592b();
        }
    }

    /* renamed from: a */
    private static boolean m66591a(Intent intent) {
        return intent.getExtras() != null && "launch_source_gcm_value".equals(intent.getExtras().getString("launch_source_key"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43365a(String str, int i) {
        MetricsIntentOperation.m66597a(getApplicationContext(), abcx.m47461a(str), "com.google.android.apps.helprtc", 108, i, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo43366a() {
        return new aavf(this).mo31825a() > 0;
    }
}
