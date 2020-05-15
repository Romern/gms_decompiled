package com.google.android.gms.icing.p049ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.material.progress.MaterialProgressBar;

/* renamed from: com.google.android.gms.icing.ui.SettingsContainerChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsContainerChimeraActivity extends deu {

    /* renamed from: b */
    private actx f79101b;

    /* renamed from: aX */
    public final boolean mo8629aX() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            finish();
            return true;
        }
        getSupportFragmentManager().popBackStack();
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083  */
    public final void onCreate(Bundle bundle) {
        char c;
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (action == null) {
            absg.m48191b("SettingsContainerChimeraActivity received a null action.");
            return;
        }
        abym abym = new abym(getApplicationContext());
        int hashCode = action.hashCode();
        if (hashCode != -1422852856) {
            if (hashCode != -60840178) {
                if (hashCode == 2063728496 && action.equals("com.google.android.gms.icing.APP_INDEXING_DEBUG")) {
                    c = 0;
                    if (c == 0) {
                        if (c == 1) {
                            abym.mo32453b(8003);
                        } else if (c != 2) {
                            absg.m48191b(action.length() == 0 ? new String("SettingsContainerChimeraActivity received unknown intent action: ") : "SettingsContainerChimeraActivity received unknown intent action: ".concat(action));
                            return;
                        }
                        abym.mo32453b(8005);
                        if (this.f79101b == null) {
                            this.f79101b = new actx(this);
                            return;
                        }
                        return;
                    }
                    setContentView((int) C0126R.C0128layout.app_indexing_debug_activity);
                    if (bundle == null) {
                        getSupportFragmentManager().beginTransaction().add(C0126R.C0129id.debug_container, new acwa(), "packagesFragment").commit();
                    }
                    if (((Boolean) abzt.f58991k.mo58455c()).booleanValue()) {
                        abym.mo32453b(7003);
                        return;
                    }
                    return;
                }
            } else if (action.equals("com.google.android.gms.icing.ON_DEVICE_SHARING_UI")) {
                c = 2;
                if (c == 0) {
                }
            }
        } else if (action.equals("com.google.android.gms.icing.PRIVACY_SETTINGS")) {
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        setIntent(intent);
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("query");
            acve acve = (acve) getSupportFragmentManager().findFragmentByTag("indexablesFragment");
            if (acve != null) {
                acve.mo33131a(stringExtra);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        actx actx = this.f79101b;
        if (actx != null) {
            actx.f60773b = true;
            actx.f60772a.setTitle((int) C0126R.string.on_device_sharing_title);
            actx.f60772a.setContentView((int) C0126R.C0128layout.on_device_sharing_activity);
            actx.f60774c = actx.f60772a.getPackageManager();
            actx.f60775d = new svi(actx.f60772a);
            actx.f60780i = ((svi) actx.f60775d).mo26094a(actx.f60772a.getString(C0126R.string.on_device_sharing_ui_header), 0);
            actx.f60775d.mo26096a(actx.f60772a.getWindow());
            actx.f60776e = (MaterialProgressBar) actx.f60772a.findViewById(C0126R.C0129id.progress);
            actx.f60777f = (TextView) actx.f60772a.findViewById(C0126R.C0129id.empty);
            actx.f60777f.setText((int) C0126R.string.on_device_sharing_ui_empty);
            actx.f60778g = (TextView) actx.f60772a.findViewById(C0126R.C0129id.error);
            actx.f60778g.setText((int) C0126R.string.on_device_sharing_ui_error);
            new actq(actx).execute(new Void[0]);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        actx actx = this.f79101b;
        if (actx != null) {
            actx.f60773b = false;
        }
    }
}
