package com.google.android.gms.chimera.debug;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.debug.items.ModuleItem;
import com.google.android.gms.chimera.debug.items.ModuleSetItem;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChimeraDebugChimeraActivity extends deu implements qpp {

    /* renamed from: b */
    private ProgressDialog f29991b;

    /* renamed from: c */
    private UpdateModuleReceiver f29992c;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class UpdateModuleReceiver extends aacn {
        public UpdateModuleReceiver() {
            super("chimera");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            if ("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED".equals(intent.getAction())) {
                ChimeraDebugChimeraActivity.this.mo17640e();
            }
        }
    }

    /* renamed from: a */
    private final void m22417a(Fragment fragment, String str) {
        m22418a(fragment, str, true);
    }

    /* renamed from: e */
    public final void mo17640e() {
        if (!this.f29991b.isShowing()) {
            this.f29991b.show();
        }
        qoq qoq = new qoq(this);
        ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
        featureRequest.setUrgent(qoq);
        featureRequest.requestFeatureAtLatestVersion("chimera_debug");
        if (!ModuleManager.get(this).requestFeatures(featureRequest)) {
            Log.e("ChimeraDebug", "Feature request has failed");
            mo17644j();
        }
    }

    /* renamed from: g */
    public final void mo17641g() {
        Fragment findFragmentById;
        int a;
        int a2;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager != null) {
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("tag_moduleListFragment");
            Fragment findFragmentByTag2 = supportFragmentManager.findFragmentByTag("tag_moduleDetailsFragment");
            Fragment findFragmentByTag3 = supportFragmentManager.findFragmentByTag("tag_moduleSetDetailsFragment");
            dky a3 = qpr.m32628a(this);
            dky b = qpr.m32630b(this);
            if (b == null) {
                mo17639a(getString(C0126R.string.config_err_msg));
                return;
            }
            if (findFragmentByTag != null) {
                Bundle a4 = qpr.m32627a(findFragmentByTag);
                a4.putParcelableArrayList("chimera_module_set_list_key", new ArrayList(a3));
                a4.putParcelableArrayList("chimera_module_list_key", new ArrayList(b));
                findFragmentByTag.setArguments(a4);
            }
            if (findFragmentByTag3 != null) {
                Bundle a5 = qpr.m32627a(findFragmentByTag3);
                ModuleSetItem moduleSetItem = (ModuleSetItem) a5.getParcelable("chimera_module_set_item_key");
                if (moduleSetItem != null && (a2 = a3.mo9239a(moduleSetItem)) >= 0) {
                    a5.putParcelable("chimera_module_set_item_key", (ModuleSetItem) a3.get(a2));
                    findFragmentByTag3.setArguments(a5);
                }
            }
            if (findFragmentByTag2 != null) {
                Bundle a6 = qpr.m32627a(findFragmentByTag2);
                ModuleItem moduleItem = (ModuleItem) a6.getParcelable("chimera_module_item_key");
                if (moduleItem != null && (a = b.mo9239a(moduleItem)) >= 0) {
                    a6.putParcelable("chimera_module_item_key", (ModuleItem) b.get(a));
                    findFragmentByTag2.setArguments(a6);
                }
            }
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            if (supportFragmentManager2 != null && (findFragmentById = getSupportFragmentManager().findFragmentById(C0126R.C0129id.fragment_container)) != null) {
                supportFragmentManager2.beginTransaction().detach(findFragmentById).attach(findFragmentById).commit();
            }
        }
    }

    /* renamed from: h */
    public final void mo17642h() {
        mo17641g();
    }

    /* renamed from: i */
    public final void mo17643i() {
        mo17640e();
    }

    /* renamed from: j */
    public final void mo17644j() {
        if (this.f29991b.isShowing()) {
            this.f29991b.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        FragmentManager supportFragmentManager;
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.activity_chimera_debug);
        setTitle(getString(C0126R.string.activity_title));
        C1341rz aW = mo8628aW();
        if (aW != null) {
            aW.mo15853b(true);
        }
        if (!cdco.m132643b()) {
            qpc qpc = new qpc();
            Bundle bundle2 = new Bundle();
            bundle2.putString("chimera_message_key", getString(C0126R.string.disabled_err_msg));
            bundle2.putBoolean("chimera_enabled_flag_key", false);
            qpc.setArguments(bundle2);
            m22418a(qpc, "tag_messageFragment", false);
            return;
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f29991b = progressDialog;
        progressDialog.setMessage(getString(C0126R.string.updating_config_dialog_msg));
        this.f29992c = new UpdateModuleReceiver();
        if (bundle == null && (supportFragmentManager = getSupportFragmentManager()) != null) {
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("tag_moduleListFragment");
            if (findFragmentByTag == null) {
                findFragmentByTag = new qpk();
            }
            dky a = qpr.m32628a(this);
            dky b = qpr.m32630b(this);
            if (b == null) {
                mo17639a(getString(C0126R.string.config_err_msg));
                return;
            }
            Bundle bundle3 = new Bundle();
            bundle3.putParcelableArrayList("chimera_module_set_list_key", new ArrayList(a));
            bundle3.putParcelableArrayList("chimera_module_list_key", new ArrayList(b));
            findFragmentByTag.setArguments(bundle3);
            supportFragmentManager.popBackStack((String) null, 1);
            supportFragmentManager.beginTransaction().replace(C0126R.C0129id.fragment_container, findFragmentByTag, "tag_moduleListFragment").commitNow();
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        sre.m36089i(this);
        if (!cdco.m132643b()) {
            C1341rz aW = mo8628aW();
            if (aW == null) {
                return false;
            }
            aW.mo15862e();
            return false;
        }
        getMenuInflater().inflate(C0126R.C0130menu.menu_chimera_debug, menu);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != C0126R.C0129id.check_updates) {
            return false;
        } else {
            mo17640e();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        UpdateModuleReceiver updateModuleReceiver = this.f29992c;
        if (updateModuleReceiver != null) {
            registerReceiver(updateModuleReceiver, new IntentFilter("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED"));
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        UpdateModuleReceiver updateModuleReceiver = this.f29992c;
        if (updateModuleReceiver != null) {
            unregisterReceiver(updateModuleReceiver);
        }
    }

    /* renamed from: a */
    private final void m22418a(Fragment fragment, String str, boolean z) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager == null) {
            return;
        }
        if (z) {
            supportFragmentManager.beginTransaction().replace(C0126R.C0129id.fragment_container, fragment, str).addToBackStack(null).commit();
        } else {
            supportFragmentManager.beginTransaction().replace(C0126R.C0129id.fragment_container, fragment, str).commitNow();
        }
    }

    /* renamed from: a */
    public final void mo17637a(ModuleItem moduleItem) {
        qpe qpe = new qpe();
        Bundle bundle = new Bundle();
        bundle.putParcelable("chimera_module_item_key", moduleItem);
        qpe.setArguments(bundle);
        m22417a(qpe, "tag_moduleDetailsFragment");
    }

    /* renamed from: a */
    public final void mo17638a(ModuleSetItem moduleSetItem) {
        qpl qpl = new qpl();
        Bundle bundle = new Bundle();
        bundle.putParcelable("chimera_module_set_item_key", moduleSetItem);
        qpl.setArguments(bundle);
        m22417a(qpl, "tag_moduleSetDetailsFragment");
    }

    /* renamed from: a */
    public final void mo17639a(String str) {
        qpc qpc = new qpc();
        Bundle bundle = new Bundle();
        bundle.putString("chimera_message_key", str);
        qpc.setArguments(bundle);
        m22417a(qpc, "tag_messageFragment");
    }
}
