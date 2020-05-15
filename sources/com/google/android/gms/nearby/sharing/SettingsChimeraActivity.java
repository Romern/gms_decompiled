package com.google.android.gms.nearby.sharing;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p002v7.widget.SwitchCompat;
import android.support.p002v7.widget.Toolbar;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.sharing.view.GoogleAccountAvatar;
import com.google.android.gms.nearby.sharing.view.RadioButtonChoiceView;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsChimeraActivity extends deu {

    /* renamed from: b */
    public ajty f80963b;

    /* renamed from: c */
    public SwitchCompat f80964c;

    /* renamed from: d */
    public View f80965d;

    /* renamed from: e */
    public TextView f80966e;

    /* renamed from: f */
    public TextView f80967f;

    /* renamed from: g */
    public GoogleAccountAvatar f80968g;

    /* renamed from: h */
    public TextView f80969h;

    /* renamed from: i */
    public C1350sh f80970i;

    /* renamed from: j */
    public TextView f80971j;

    /* renamed from: k */
    public TextView f80972k;

    /* renamed from: l */
    public TextView f80973l;

    /* renamed from: m */
    public C1350sh f80974m;

    /* renamed from: n */
    private final BroadcastReceiver f80975n = new aacn("nearby") {
        /* class com.google.android.gms.nearby.sharing.SettingsChimeraActivity.C16191 */

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            SettingsChimeraActivity.this.mo44473e();
        }
    };

    /* renamed from: o */
    private boolean f80976o = false;

    /* renamed from: a */
    public static Intent m67544a(Context context) {
        return new Intent().addFlags(268435456).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT).setClassName(context, "com.google.android.gms.nearby.sharing.SettingsActivity");
    }

    /* renamed from: b */
    public final void mo44472b(Bundle bundle) {
        View inflate = View.inflate(this, C0126R.C0128layout.sharing_dialog_data_usage, null);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(C0126R.C0129id.data_usage_radio_group);
        RadioButton radioButton = (RadioButton) inflate.findViewById(C0126R.C0129id.data_usage_button_always);
        RadioButton radioButton2 = (RadioButton) inflate.findViewById(C0126R.C0129id.data_usage_button_wifi);
        RadioButton radioButton3 = (RadioButton) inflate.findViewById(C0126R.C0129id.data_usage_button_never);
        RadioButtonChoiceView radioButtonChoiceView = (RadioButtonChoiceView) inflate.findViewById(C0126R.C0129id.radioButtonChoices);
        if (radioGroup.getChildCount() == radioButtonChoiceView.getChildCount()) {
            for (int i = 0; i < radioButtonChoiceView.getChildCount(); i++) {
                radioButtonChoiceView.getChildAt(i).setOnTouchListener(new akjg(radioGroup.getChildAt(i)));
            }
            bhia bhia = new bhia(this);
            bhia.mo63791f(C0126R.string.sharing_settings_button_data_usage);
            bhia.mo63786d((int) C0126R.string.common_update, new ajpm(this, radioButton, radioButton2, radioButton3));
            bhia.mo63781c((int) C0126R.string.common_cancel, ajpo.f71107a);
            bhia.mo63787d(inflate);
            C1350sh b = bhia.mo15904b();
            radioGroup.setOnCheckedChangeListener(new ajpp(b, radioButton, radioButton2, radioButton3, radioGroup));
            b.setOnShowListener(new ajpq(this, b, radioButton, radioButton2, radioButton3, radioGroup));
            this.f80963b.mo38908c().mo50373a(new ajpr(this, radioGroup, radioButton, radioButton2, radioButton3, b, bundle));
            return;
        }
        throw new IllegalArgumentException("Invalid RadioGroup has a different number of children from RadioButtonChoiceView");
    }

    /* renamed from: e */
    public final void mo44473e() {
        this.f80963b.mo38904b().mo50373a(new ajqd(this));
        this.f80963b.mo38912e().mo50373a(new ajqe(this));
        this.f80963b.mo38893G().mo50373a(new ajqf(this));
        this.f80963b.mo38910d().mo50373a(new ajpd(this, this.f80971j.isLaidOut()));
        this.f80963b.mo38908c().mo50373a(new ajpe(this));
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        Account a;
        switch (i) {
            case 1000:
                if (i2 != -1) {
                    finish();
                    return;
                }
                return;
            case 1001:
                if (i2 == -1 && (a = akhu.m59724a(intent)) != null) {
                    this.f80963b.mo38903a(a);
                    return;
                }
                return;
            case 1002:
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!cfov.m142066s()) {
            this.f80976o = true;
            finish();
            return;
        }
        setContentView((int) C0126R.C0128layout.sharing_activity_settings);
        mo8626a((Toolbar) findViewById(C0126R.C0129id.toolbar));
        mo8628aW().mo15853b(true);
        mo8628aW().mo15846a(true);
        mo8628aW().mo15865f((int) C0126R.string.sharing_settings_home_as_up_description);
        if (this.f80963b == null) {
            this.f80963b = ahcb.m55442c(this);
        }
        SwitchCompat switchCompat = (SwitchCompat) findViewById(C0126R.C0129id.enable_switch);
        this.f80964c = switchCompat;
        switchCompat.setOnCheckedChangeListener(new ajpc(this));
        this.f80969h = (TextView) findViewById(C0126R.C0129id.device_name_label);
        findViewById(C0126R.C0129id.device_name).setOnClickListener(new ajpn(this));
        View findViewById = findViewById(C0126R.C0129id.change_account);
        this.f80965d = findViewById;
        this.f80966e = (TextView) findViewById.findViewById(C0126R.C0129id.account_name);
        this.f80967f = (TextView) this.f80965d.findViewById(C0126R.C0129id.account_email);
        this.f80968g = (GoogleAccountAvatar) this.f80965d.findViewById(C0126R.C0129id.sharing_one_google_account_disc);
        this.f80971j = (TextView) findViewById(C0126R.C0129id.visibility_label);
        View findViewById2 = findViewById(C0126R.C0129id.visibility);
        if (!cfov.m142061n() || !sre.m36082b(this)) {
            findViewById2.setOnClickListener(new ajpy(this));
        } else {
            ((TextView) findViewById(C0126R.C0129id.sharing_settings_subtitle)).setText(getString(C0126R.string.sharing_settings_subtitle_account_latchsky));
            this.f80965d.setVisibility(8);
            findViewById2.setVisibility(8);
            TextView textView = (TextView) findViewById(C0126R.C0129id.sharing_settings_info_text);
            textView.setText((CharSequence) bmyx.m108643a("\n\n").mo66925c((CharSequence) textView.getText().toString()).get(0));
        }
        this.f80972k = (TextView) findViewById(C0126R.C0129id.data_usage_title);
        this.f80973l = (TextView) findViewById(C0126R.C0129id.data_usage_label);
        View findViewById3 = findViewById(C0126R.C0129id.data_usage);
        if (!cfov.f185185a.mo6606a().mo82358bf()) {
            findViewById3.setVisibility(8);
        }
        findViewById3.setOnClickListener(new ajpz(this));
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.sharing_menu_settings, menu);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() == C0126R.C0129id.action_help) {
            ahcb.m55442c(this).mo38893G().mo50373a(new ajqa(this));
            return true;
        } else if (menuItem.getItemId() != C0126R.C0129id.action_feedback) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            ahcb.m55442c(this).mo38893G().mo50373a(new ajqb(this));
            return true;
        }
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(C0126R.C0129id.action_feedback).setVisible(cfov.m142040P());
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey("device_name_dialog")) {
            mo44470a(bundle.getBundle("device_name_dialog"));
        }
        if (bundle.containsKey("data_usage_dialog")) {
            mo44472b(bundle.getBundle("data_usage_dialog"));
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f80963b.mo38894a().mo50373a(new ajqc(this));
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("SettingsChimeraActivity has resumed");
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1350sh shVar = this.f80970i;
        if (shVar != null) {
            bundle.putBundle("device_name_dialog", shVar.onSaveInstanceState());
        }
        C1350sh shVar2 = this.f80974m;
        if (shVar2 != null) {
            bundle.putBundle("data_usage_dialog", shVar2.onSaveInstanceState());
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        if (!this.f80976o) {
            super.onStart();
            ahhd.m55767a(this, this.f80975n, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
            mo44473e();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("SettingsChimeraActivity has started");
            return;
        }
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        if (!this.f80976o) {
            ahhd.m55766a(this, this.f80975n);
            super.onStop();
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("SettingsChimeraActivity has stopped");
            return;
        }
        super.onStop();
    }

    /* renamed from: a */
    public final void mo44469a(int i) {
        ajty ajty = this.f80963b;
        roz b = rpa.m34196b();
        b.f43472a = new ajtm(i);
        b.f43473b = new Feature[]{ahca.f66970a};
        ajty.mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final void mo44470a(Bundle bundle) {
        View inflate = View.inflate(this, C0126R.C0128layout.sharing_dialog_device_name, null);
        EditText editText = (EditText) inflate.findViewById(16908308);
        bhia bhia = new bhia(this);
        bhia.mo63791f(C0126R.string.sharing_settings_button_device_name);
        bhia.mo63786d((int) C0126R.string.sharing_action_rename, new ajpg(this, editText));
        bhia.mo63781c((int) C0126R.string.common_cancel, ajph.f71090a);
        bhia.mo63787d(inflate);
        C1350sh b = bhia.mo15904b();
        editText.setFilters(new InputFilter[]{new butm(getResources().getInteger(C0126R.integer.sharing_max_name_length_bytes))});
        editText.setOnEditorActionListener(new ajpi(this, b, editText));
        editText.addTextChangedListener(new ajqg(b, editText));
        b.setOnShowListener(new ajpj(this, editText, b));
        b.getWindow().setSoftInputMode(36);
        this.f80963b.mo38912e().mo50373a(new ajpk(this, editText, b, bundle));
    }

    /* renamed from: a */
    public final void mo44471a(CharSequence charSequence) {
        this.f80963b.mo38898a(charSequence).mo50371a(new ajpl(this));
    }
}
