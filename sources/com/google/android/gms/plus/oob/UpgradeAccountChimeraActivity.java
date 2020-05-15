package com.google.android.gms.plus.oob;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpgradeAccountChimeraActivity extends anyz implements anzi, anzb, anyx, anzd, anxy {

    /* renamed from: d */
    private anzj f82588d;

    /* renamed from: e */
    private DialogFragment f82589e;

    /* renamed from: f */
    private Fragment f82590f;

    /* renamed from: g */
    private String f82591g;

    /* renamed from: h */
    private String f82592h;

    /* renamed from: i */
    private String f82593i;

    /* renamed from: j */
    private PlusCommonExtras f82594j;

    /* renamed from: k */
    private View f82595k;

    /* renamed from: l */
    private Drawable f82596l;

    /* renamed from: m */
    private int f82597m;

    /* renamed from: a */
    private final void m68523a(anze anze) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (supportFragmentManager.findFragmentByTag("content_fragment") == null) {
            beginTransaction.add(C0126R.C0129id.content_layout, anze, "content_fragment");
        } else {
            beginTransaction.replace(C0126R.C0129id.content_layout, anze, "content_fragment");
        }
        beginTransaction.commitAllowingStateLoss();
        this.f82590f = anze;
    }

    /* renamed from: b */
    private final void m68527b(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        m68524a(favaDiagnosticsEntity, anze.m65631a(mo42476c(), null, getString(C0126R.string.plus_oob_failure_text), null));
    }

    /* renamed from: g */
    private final void m68528g() {
        if (!m68530i()) {
            this.f82597m = 1;
            if (this.f77902c == 0) {
                if (this.f82596l == null) {
                    this.f82596l = getWindow().getDecorView().getBackground();
                }
                getWindow().setBackgroundDrawableResource(17170445);
            }
            this.f82595k.setVisibility(8);
            if (mo42476c()) {
                m68526a(getString(C0126R.string.plus_oob_interstitial_loading), getString(C0126R.string.plus_oob_interstitial_loading_text));
            } else {
                m68526a(getString(C0126R.string.plus_oob_loading), (String) null);
            }
        }
    }

    /* renamed from: h */
    private final void m68529h() {
        if (!m68530i()) {
            this.f82597m = 2;
            if (mo42476c()) {
                m68526a(getString(C0126R.string.plus_oob_interstitial_sending), getString(C0126R.string.plus_oob_interstitial_loading_text));
            } else {
                m68526a(getString(C0126R.string.plus_oob_sending), (String) null);
            }
        }
    }

    /* renamed from: i */
    private final boolean m68530i() {
        return ((DialogFragment) getSupportFragmentManager().findFragmentByTag("progress_dialog_fragment")) != null;
    }

    /* renamed from: j */
    private final void m68531j() {
        this.f82597m = 0;
        m68532k();
    }

    /* renamed from: k */
    private final void m68532k() {
        DialogFragment dialogFragment = this.f82589e;
        if (dialogFragment == null) {
            DialogFragment dialogFragment2 = (DialogFragment) getSupportFragmentManager().findFragmentByTag("progress_dialog_fragment");
            if (dialogFragment2 != null) {
                dialogFragment2.dismissAllowingStateLoss();
            }
        } else {
            dialogFragment.dismissAllowingStateLoss();
            this.f82589e = null;
        }
        if (this.f82596l != null) {
            getWindow().setBackgroundDrawable(this.f82596l);
            this.f82596l = null;
        }
        this.f82595k.setVisibility(0);
    }

    /* renamed from: f */
    public final void mo42481f() {
        mo42478e();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f82597m = bundle.getInt("UpgradeAccountActivity.dialogStateKey");
        }
        Bundle extras = getIntent().getExtras();
        this.f82591g = extras.getString("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_PACKAGE");
        this.f82592h = extras.getString("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_TEXT");
        this.f82593i = extras.getString("com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME");
        PlusCommonExtras b = PlusCommonExtras.m68418b(getIntent());
        this.f82594j = b;
        anku.m64689a(this, b, "");
        this.f82595k = getWindow().getDecorView().findViewById(16908290);
        getWindow().setSoftInputMode(3);
        setContentView((int) C0126R.C0128layout.plus_oob_upgrade_account_activity);
        if (!ssk.m36235a(this) || getIntent().getExtras().getBoolean("debug_no_connection", false)) {
            m68523a(anze.m65631a(mo42476c(), getString(C0126R.string.plus_oob_no_connection_title), getString(C0126R.string.plus_oob_no_connection_message), getString(17039370)));
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("content_fragment");
        this.f82590f = findFragmentByTag;
        if (findFragmentByTag == null) {
            boolean c = mo42476c();
            String str = this.f82591g;
            String str2 = this.f82592h;
            String str3 = this.f77901b;
            String str4 = this.f82593i;
            anzc anzc = new anzc();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("is_setup_wizard_theme", c);
            bundle2.putString("promo_app_package", str);
            bundle2.putString("promo_app_text", str2);
            bundle2.putString("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE", str3);
            bundle2.putString("back_button_name", str4);
            bundle2.putParcelable("upgrade_account", null);
            anzc.setArguments(bundle2);
            this.f82590f = anzc;
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.add(C0126R.C0129id.content_layout, this.f82590f, "content_fragment");
            beginTransaction.commit();
            m68528g();
        }
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        anzk anzk = (anzk) supportFragmentManager2.findFragmentByTag("upgrade_account_fragment");
        if (anzk == null) {
            String str5 = this.f77900a;
            String str6 = this.f77901b;
            PlusCommonExtras plusCommonExtras = this.f82594j;
            anzk anzk2 = new anzk();
            anzk2.setArguments(anzl.m65646a(str5, str6, plusCommonExtras));
            supportFragmentManager2.beginTransaction().add(anzk2, "upgrade_account_fragment").commit();
            anzk = anzk2;
        }
        if (this.f82588d == null) {
            this.f82588d = anzk.f77923a;
        }
    }

    public final void onPause() {
        super.onPause();
        m68532k();
    }

    public final void onResume() {
        super.onResume();
        int i = this.f82597m;
        if (i == 1) {
            m68528g();
        } else if (i == 2) {
            m68529h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("UpgradeAccountActivity.dialogStateKey", this.f82597m);
    }

    /* renamed from: a */
    private final void m68524a(FavaDiagnosticsEntity favaDiagnosticsEntity, anze anze) {
        mo42409a(favaDiagnosticsEntity);
        mo42411b(mo42412bH(), rin.f43080e);
        m68523a(anze);
    }

    /* renamed from: b */
    public final void mo42470b() {
        onBackPressed();
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("content_fragment");
        this.f82590f = findFragmentByTag;
        if (findFragmentByTag instanceof anzc) {
            ((anzc) findFragmentByTag).mo42482c();
        }
    }

    /* renamed from: a */
    private final void m68525a(FavaDiagnosticsEntity favaDiagnosticsEntity, UpgradeAccountEntity.DescriptionEntity descriptionEntity) {
        if (descriptionEntity == null || !descriptionEntity.f83071a.contains(4)) {
            m68527b(favaDiagnosticsEntity);
        } else if (TextUtils.isEmpty(descriptionEntity.f83075e)) {
            m68527b(favaDiagnosticsEntity);
        } else {
            boolean c = mo42476c();
            anze anze = new anze();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_setup_wizard_theme", c);
            bundle.putParcelable("description", descriptionEntity);
            anze.setArguments(bundle);
            m68524a(favaDiagnosticsEntity, anze);
        }
    }

    /* renamed from: b */
    public final void mo42488b(ConnectionResult connectionResult, UpgradeAccountEntity upgradeAccountEntity) {
        m68531j();
        if (!connectionResult.mo17671b() || upgradeAccountEntity == null) {
            m68527b(rim.f43063e);
        } else if (anzh.m65638a(upgradeAccountEntity)) {
            mo42409a(rim.f43068j);
            mo42477d();
        } else if (anzh.m65640b(upgradeAccountEntity)) {
            m68525a(rim.f43063e, upgradeAccountEntity.f83067c);
        } else if (anzh.m65643d(upgradeAccountEntity) != null) {
            aoed d = anzh.m65643d(upgradeAccountEntity);
            List b = d.mo42596b();
            if (anzh.m65637a(d)) {
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    aodv aodv = (aodv) b.get(i);
                    if (aodv.mo42566c()) {
                        String b2 = aodv.mo42565b();
                        if ("invalidNameHardFail".equals(b2)) {
                            mo42409a(rim.f43066h);
                        } else if ("invalidNameAppealable".equals(b2)) {
                            mo42409a(rim.f43065g);
                        } else {
                            mo42409a(rim.f43063e);
                        }
                        String b3 = aodv.mo42565b();
                        mo42411b(rin.f43079d, rin.f43079d);
                        boolean c = mo42476c();
                        anyy anyy = new anyy();
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("is_setup_wizard_theme", c);
                        bundle.putParcelable("upgrade_account", upgradeAccountEntity);
                        bundle.putString("error_id", b3);
                        anyy.setArguments(bundle);
                        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                        beginTransaction.replace(C0126R.C0129id.content_layout, anyy, "content_fragment");
                        beginTransaction.addToBackStack(null);
                        beginTransaction.commit();
                        this.f82590f = anyy;
                        return;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            int size2 = b.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList.add((AccountField.ErrorsEntity) b.get(i2));
            }
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                aodv aodv2 = (aodv) arrayList.get(i3);
                if (aodv2.mo42570h() && !TextUtils.isEmpty(aodv2.mo42569g())) {
                    FavaDiagnosticsEntity favaDiagnosticsEntity = rim.f43063e;
                    boolean c2 = mo42476c();
                    anze anze = new anze();
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("is_setup_wizard_theme", c2);
                    bundle2.putParcelableArrayList("errors", arrayList);
                    anze.setArguments(bundle2);
                    m68524a(favaDiagnosticsEntity, anze);
                    return;
                }
            }
            m68527b(rim.f43063e);
        } else {
            if (Log.isLoggable("UpgradeAccount", 5)) {
                Log.w("UpgradeAccount", "Unhandled error result");
            }
            m68527b(rim.f43063e);
        }
    }

    /* renamed from: a */
    private final void m68526a(String str, String str2) {
        if (!mo42476c()) {
            aoni a = aoni.m66138a(str);
            this.f82589e = a;
            a.setStyle(1, 2132019651);
        } else {
            rzz.m34730a(!TextUtils.isEmpty(str), "Title text must not be empty");
            rzz.m34730a(!TextUtils.isEmpty(str2), "Body text must not be empty");
            anyw anyw = new anyw();
            Bundle bundle = new Bundle();
            bundle.putString("title_text", str);
            bundle.putString("body_text", str2);
            anyw.setArguments(bundle);
            this.f82589e = anyw;
        }
        this.f82589e.show(getSupportFragmentManager(), "progress_dialog_fragment");
    }

    /* renamed from: a */
    public final void mo42408a() {
        Fragment fragment = this.f82590f;
        if (fragment instanceof anzc) {
            ((anzc) fragment).mo42482c();
        }
    }

    /* renamed from: a */
    public final void mo42487a(ConnectionResult connectionResult, UpgradeAccountEntity upgradeAccountEntity) {
        m68531j();
        if (!connectionResult.mo17671b() || upgradeAccountEntity == null) {
            m68527b(rim.f43063e);
        } else if (anzh.m65640b(upgradeAccountEntity)) {
            m68525a(rim.f43064f, upgradeAccountEntity.f83067c);
        } else if (anzh.m65638a(upgradeAccountEntity)) {
            Log.w("UpgradeAccount", "Account is already upgraded to G+");
            mo42409a(rim.f43059a);
            mo42477d();
        } else {
            Fragment fragment = this.f82590f;
            if (fragment instanceof anzc) {
                ((anzc) fragment).mo42473a(upgradeAccountEntity);
            }
        }
    }

    /* renamed from: a */
    public final void mo42480a(UpgradeAccountEntity upgradeAccountEntity) {
        m68529h();
        anzl anzl = (anzl) this.f82588d;
        if (!anzl.f77931h) {
            anzl.f77931h = true;
            anzl.f77933j = upgradeAccountEntity;
            if (anzl.f77928e.mo24648p()) {
                anzl.mo7257g(Bundle.EMPTY);
            } else if (!anzl.f77928e.mo24649q()) {
                anzl.f77928e.mo42332x();
            }
        } else {
            throw new IllegalStateException("Upgrade account already in progress");
        }
    }
}
