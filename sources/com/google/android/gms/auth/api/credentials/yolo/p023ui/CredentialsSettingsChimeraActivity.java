package com.google.android.gms.auth.api.credentials.yolo.p023ui;

import android.accounts.Account;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p002v7.widget.SwitchCompat;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.auth.api.credentials.internal.AccountCredentialSettings;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CredentialsSettingsChimeraActivity extends deu implements CompoundButton.OnCheckedChangeListener, AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* renamed from: j */
    public static final /* synthetic */ int f10180j = 0;

    /* renamed from: b */
    public SwitchCompat f10181b;

    /* renamed from: c */
    public SwitchCompat f10182c;

    /* renamed from: d */
    public ViewGroup f10183d;

    /* renamed from: e */
    public gwh f10184e;

    /* renamed from: f */
    public View f10185f;

    /* renamed from: g */
    public View f10186g;

    /* renamed from: h */
    public AccountCredentialSettings f10187h;

    /* renamed from: i */
    public Account f10188i;

    /* renamed from: k */
    private suo f10189k;

    /* renamed from: l */
    private View f10190l;

    /* renamed from: m */
    private View f10191m;

    /* renamed from: n */
    private TextView f10192n;

    /* renamed from: o */
    private adan f10193o;

    /* renamed from: p */
    private sox f10194p;

    /* renamed from: com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity$SettingsIntentOperation */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SettingsIntentOperation extends qld {
        /* renamed from: b */
        public final GoogleSettingsItem mo7154b() {
            if (!((Boolean) hfb.f19635a.mo58455c()).booleanValue()) {
                return null;
            }
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.settings.CREDENTIALS_SETTINGS"), 4, (int) C0126R.string.common_google_settings_credentials_title, 19);
            googleSettingsItem.f29960f = true;
            return googleSettingsItem;
        }
    }

    /* renamed from: a */
    public static bodk m6382a(int i) {
        bxvd da = bodk.f132702h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bodk bodk = (bodk) da.f164949b;
        bodk.f132705b = i - 1;
        bodk.f132704a |= 1;
        return (bodk) da.mo74062i();
    }

    /* renamed from: b */
    public final void mo7444b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
            return;
        }
        Log.e("CredentialsSettings", "Unable to find the browser.");
        Toast.makeText(getContainerActivity(), getResources().getString(C0126R.string.common_no_browser_found), 1).show();
    }

    /* renamed from: e */
    public final void mo7446e() {
        boolean a = ssk.m36235a(this);
        this.f10191m.setVisibility(!a ? 0 : 8);
        mo7443a(a);
    }

    /* renamed from: g */
    public final void mo7447g() {
        Account account = this.f10188i;
        if (account != null) {
            bqga.m112781a(this.f10193o.mo33294b(1, new hts(this, account)), new htx(this), bqfb.INSTANCE);
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i;
        int i2;
        if (this.f10187h == null) {
            return;
        }
        if (compoundButton.getId() != this.f10181b.getId()) {
            if (compoundButton.getId() == this.f10182c.getId() && this.f10187h.f10135b != z) {
                mo7441a(3, new htp(this, z), getString(C0126R.string.credentials_pref_failed_save_auto_signin));
                if (!z) {
                    i2 = 503;
                } else {
                    i2 = 504;
                }
                his.m14426a().mo12510a(m6382a(i2));
            }
        } else if (this.f10187h.f10134a != z) {
            mo7441a(2, new hto(this, z), getString(C0126R.string.credentials_pref_failed_save_storage_enabled));
            if (!z) {
                i = 501;
            } else {
                i = 502;
            }
            his.m14426a().mo12510a(m6382a(i));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.List<android.content.pm.ApplicationInfo>, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.util.Collection, java.lang.Iterable):boolean
     arg types: [java.util.TreeSet, java.lang.Iterable]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean */
    public void onClick(View view) {
        bngx bngx;
        View view2 = this.f10190l;
        if (view2 != null && view != null && view2.getId() == view.getId()) {
            List<ApplicationInfo> installedApplications = getPackageManager().getInstalledApplications(128);
            if (installedApplications == null) {
                Log.e("CredentialsSettings", "Unable to get any apps.");
                bngx = bngx.m109376e();
            } else {
                Iterable a = bnjd.m109575a(bnjd.m109586b((Iterable) installedApplications, htq.f20413a), htr.f20414a);
                TreeSet treeSet = new TreeSet();
                bnjd.m109582a((Collection) treeSet, a);
                treeSet.removeAll(this.f10187h.f10136c);
                bngx = bngx.m109368a((Collection) treeSet);
            }
            new AlertDialog.Builder(this).setTitle(getResources().getString(C0126R.string.credentials_add_never_save_app_dialog_title)).setAdapter(new htz(this, this, bngx), new htn(this, bngx)).setCancelable(true).show();
            his.m14426a().mo12510a(m6382a(505));
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(2132019668);
        setContentView((int) C0126R.C0128layout.credentials_settings);
        this.f10184e = gvq.m14020a(this, hid.m14370a(adbv.m50143a()).mo12481a());
        this.f10193o = adan.m50084a((FragmentActivity) this);
        this.f10191m = findViewById(C0126R.C0129id.no_connection_snackbar);
        Button button = (Button) findViewById(C0126R.C0129id.retry_connection);
        this.f10192n = button;
        button.setOnClickListener(new hti(this));
        SwitchCompat switchCompat = (SwitchCompat) findViewById(C0126R.C0129id.credentials_pref_storage_enabled);
        this.f10181b = switchCompat;
        switchCompat.setOnCheckedChangeListener(this);
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(C0126R.C0129id.credentials_pref_auto_signin);
        this.f10182c = switchCompat2;
        switchCompat2.setOnCheckedChangeListener(this);
        this.f10183d = (ViewGroup) findViewById(C0126R.C0129id.credentials_pref_never_save_list);
        View findViewById = findViewById(C0126R.C0129id.credentials_add_never_save_app);
        this.f10190l = findViewById;
        findViewById.setOnClickListener(this);
        String string = getResources().getString(C0126R.string.credentials_saved_passwords_link_prefix);
        String string2 = getResources().getString(C0126R.string.credentials_saved_passwords_link_text);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(new DefensiveURLSpan((String) ((bmzm) rsv.f43627p).f131273a, true), length, spannableStringBuilder.length(), 33);
        if (!TextUtils.isEmpty(null)) {
            spannableStringBuilder.append((CharSequence) null);
        }
        TextView textView = (TextView) findViewById(C0126R.C0129id.saved_passwords_link);
        textView.setText(spannableStringBuilder);
        textView.setOnClickListener(new htl(this));
        this.f10186g = findViewById(C0126R.C0129id.all_settings);
        this.f10185f = findViewById(C0126R.C0129id.custom_passphrase_warning);
        mo7446e();
        Account account = (Account) ((Bundle) bmxu.m108565a(bundle, (Bundle) bmxu.m108565a(getIntent().getExtras(), Bundle.EMPTY))).getParcelable("EXTRA_ACCOUNT");
        C1341rz aW = mo8628aW();
        sdo.m34959a(aW);
        aW.mo15841a(4, 4);
        aW.mo15853b(true);
        sun sun = new sun(aW);
        sun.mo26112a(C0126R.string.common_google_settings_credentials_title);
        suo a = sun.mo26111a();
        this.f10189k = a;
        a.f45184c = this;
        if (account != null) {
            a.mo26119b(account.name);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.credentials_settings_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String b = this.f10189k.getItem(i);
        sdo.m34959a((Object) b);
        m6383a(new Account(b, "com.google"));
    }

    public final void onNothingSelected(AdapterView adapterView) {
        m6383a((Account) null);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C0126R.C0129id.action_help_center) {
            mo7444b((String) hfe.f19643e.mo58455c());
            his.m14426a().mo12510a(m6382a(508));
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("EXTRA_ACCOUNT", this.f10188i);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    private final void m6383a(Account account) {
        if (!bmxi.m108538a(account, this.f10188i)) {
            this.f10188i = account;
            mo7445b(true);
            mo7447g();
        }
    }

    /* renamed from: b */
    public final void mo7445b(boolean z) {
        int i;
        View findViewById = findViewById(C0126R.C0129id.progress_indicator_container);
        if (!z) {
            i = 8;
        } else {
            i = 0;
        }
        findViewById.setVisibility(i);
        ImageView imageView = (ImageView) findViewById(C0126R.C0129id.progress_indicator);
        this.f10186g.setVisibility(8);
        if (this.f10194p == null) {
            sox sox = new sox(this, imageView);
            this.f10194p = sox;
            sox.setAlpha(255);
            this.f10194p.mo25910a(0);
            this.f10194p.mo25911a(-12417548);
            imageView.setImageDrawable(this.f10194p);
        }
        if (!z) {
            this.f10194p.stop();
        } else {
            this.f10194p.start();
        }
    }

    /* renamed from: a */
    public final C1240of mo7440a(String str) {
        try {
            return svr.m36484b(this).mo26179c(str);
        } catch (PackageManager.NameNotFoundException e) {
            return C1240of.m19758a(str, null);
        }
    }

    /* renamed from: a */
    public final void mo7441a(int i, bmzi bmzi, String str) {
        bqga.m112781a(this.f10193o.mo33294b(Integer.valueOf(i), bmzi), new hty(this, str), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo7442a(View view, String str) {
        C1240of a = mo7440a(str);
        ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.credentials_app_image);
        imageView.setImageDrawable((Drawable) a.f26799b);
        CharSequence charSequence = (CharSequence) a.f26798a;
        imageView.setContentDescription(String.format(getString(C0126R.string.credentials_pref_app_icon_description), charSequence));
        ((TextView) view.findViewById(C0126R.C0129id.credentials_app_name)).setText(charSequence);
        view.findViewById(C0126R.C0129id.credentials_app_credential_name).setVisibility(8);
    }

    /* renamed from: a */
    public final void mo7443a(boolean z) {
        this.f10181b.setEnabled(z);
        this.f10182c.setEnabled(z);
        this.f10183d.setEnabled(z);
    }
}
