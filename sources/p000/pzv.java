package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.cast.settings.CastSettingsChimeraActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: pzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pzv extends qab {

    /* renamed from: a */
    public svm f40757a;

    /* renamed from: b */
    public phy f40758b;

    /* renamed from: c */
    public rjx f40759c;

    /* renamed from: e */
    private pes f40760e;

    /* renamed from: f */
    private SharedPreferences f40761f;

    public pzv(CastSettingsChimeraActivity castSettingsChimeraActivity) {
        super(castSettingsChimeraActivity);
    }

    /* renamed from: a */
    public static Intent m31724a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.cast.settings.CastSettingsActivity").putExtra("ACTIVITY_TYPE", "RCN");
    }

    /* renamed from: b */
    public final SharedPreferences mo23831b() {
        if (this.f40761f == null) {
            this.f40761f = this.f40775d.getSharedPreferences("googlecast-setting-prefs", 0);
        }
        return this.f40761f;
    }

    /* renamed from: a */
    public final void mo23829a() {
        this.f40758b = null;
        pes pes = this.f40760e;
        if (pes != null) {
            pes.mo22984a("CastSettings");
            this.f40760e = null;
        }
    }

    /* renamed from: a */
    public final void mo23823a(Bundle bundle) {
        Context applicationContext = this.f40775d.getApplicationContext();
        this.f40760e = pes.m30267a(applicationContext, "CastSettings");
        String string = applicationContext.getString(C0126R.string.cast_media_control);
        C1341rz aW = this.f40775d.mo8628aW();
        aW.mo15845a(string);
        aW.mo15853b(true);
        if (this.f40758b == null) {
            this.f40758b = new phy(applicationContext, this.f40760e.f38981e);
        }
        if (this.f40759c == null) {
            this.f40759c = pqj.m31021a(this.f40775d);
        }
        this.f40775d.mo17606a(bundle);
    }

    /* renamed from: a */
    public final void mo23824a(sug sug) {
        String str;
        View.OnClickListener onClickListener;
        String str2;
        if (qay.m31789c()) {
            if (this.f40759c == null) {
                this.f40759c = pqj.m31021a(this.f40775d);
            }
            this.f40759c.mo24701a((rpa) new pql()).mo50371a(new pzr(this));
            svf e = sug.mo26098e(C0126R.string.cast_settings_notification_category_title);
            svm svm = new svm(this.f40775d);
            svm.mo26084a((int) C0126R.string.cast_settings_remote_control_notification_title);
            svm.mo26106c(C0126R.string.cast_settings_remote_control_notification_title);
            svm.mo26107d(C0126R.string.cast_settings_remote_control_notification_summary);
            svm.mo26086b(0);
            this.f40757a = svm;
            svm.mo26102a(new pzs(this));
            this.f40757a.setChecked(mo23830a("googlecast-isEnabled", !sre.m36084d(this.f40775d.getBaseContext())));
            e.mo26149a((sui) this.f40757a);
            if (cday.f180398a.mo6606a().mo77189k()) {
                pzm pzm = new pzm(this.f40775d);
                Context applicationContext = this.f40775d.getApplicationContext();
                if (!this.f40775d.getPackageManager().queryIntentActivities(new Intent("com.google.android.apps.chromecast.app.DEVICE_NOTIFICATION"), AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE).isEmpty()) {
                    if (!this.f40775d.getPackageManager().queryIntentActivities(new Intent("com.google.android.apps.chromecast.app.DEVICE_SETTINGS"), AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE).isEmpty()) {
                        onClickListener = new pzt(this);
                        str = applicationContext.getString(C0126R.string.cast_settings_open_home_app);
                        str2 = applicationContext.getString(C0126R.string.cast_settings_rcn_device_settings_text_open_app, str);
                        pzm.f40747b = str2;
                        pzm.f40748c = str;
                        pzm.f40746a = onClickListener;
                        e.mo26149a((sui) pzm);
                    }
                }
                onClickListener = new pzu(this);
                str = applicationContext.getString(C0126R.string.cast_settings_get_home_app);
                str2 = applicationContext.getString(C0126R.string.cast_settings_rcn_device_settings_text_open_app, str);
                pzm.f40747b = str2;
                pzm.f40748c = str;
                pzm.f40746a = onClickListener;
                e.mo26149a((sui) pzm);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo23825a(Menu menu) {
        this.f40775d.getMenuInflater().inflate(C0126R.C0130menu.cast_settings, menu);
        MenuItem findItem = menu.findItem(C0126R.C0129id.cast_help);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(ccxv.f180201a.mo6606a().mo77022h()));
        intent.setFlags(276824064);
        findItem.setIntent(intent);
        return this.f40775d.mo17607a(menu);
    }

    /* renamed from: a */
    public final boolean mo23826a(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return this.f40775d.mo17608a(menuItem);
        }
        this.f40775d.onBackPressed();
        return true;
    }

    /* renamed from: a */
    public final boolean mo23830a(String str, boolean z) {
        return mo23831b().getBoolean(str, z);
    }
}
