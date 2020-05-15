package com.google.android.gms.auth.frp;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PreFactoryResetChimeraActivity extends jwz implements AccountManagerCallback {

    /* renamed from: e */
    private static final sek f10960e = new sek("Auth", "PreFactoryResetChimeraActivity");

    /* renamed from: a */
    Account f10961a = null;

    /* renamed from: b */
    boolean f10962b = true;

    /* renamed from: c */
    sns f10963c;

    /* renamed from: d */
    adyd f10964d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: d */
    public static Intent m6649d() {
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.backup.ACTION_BACKUP_SETTINGS");
        intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.BackupSettingsActivity");
        intent.putExtra("hide_reset", true);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "PreFactoryResetChimeraActivity";
    }

    /* access modifiers changed from: protected */
    /* renamed from: ba */
    public final void mo7716ba() {
        String a = stn.m36304a("setupwizard.theme", "glif_v3_light");
        bjbb bjbb = new bjbb(bjbc.m103136a());
        bjbb.f122457a = 2132018266;
        bjbb.f122458b = false;
        int a2 = bjbb.mo64964a().mo64966a(a);
        bjbb bjbb2 = new bjbb(bjbc.m103136a());
        bjbb2.f122457a = a2;
        bjbb2.f122458b = false;
        setTheme(bjbb2.mo64964a().mo64965a(getIntent()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo7717c() {
        setResult(-1, new Intent());
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            mo7717c();
        }
    }

    public void onCheckCredClicked(View view) {
        this.f10962b = ((CheckBox) view).isChecked();
    }

    public void onContinue(View view) {
        if (this.f10962b) {
            this.f10964d.mo33909a(this.f10961a, new Bundle(), (Activity) null, this, new snr(this.f10963c));
        } else {
            mo7717c();
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (gnv.m13560e()) {
            adyd a = adyd.m51363a(this);
            this.f10964d = a;
            Account[] a2 = a.mo33916a("com.google");
            if (a2 == null || a2.length == 0) {
                mo7717c();
                return;
            }
            this.f10961a = a2[0];
            this.f10963c = new sns("PreFactoryResetChimerActivityHandler", 9);
            setContentView((int) C0126R.C0128layout.pre_factory_reset_activity);
            TextView textView = (TextView) findViewById(C0126R.C0129id.pre_frp_text);
            if (this.f10961a.name != null) {
                str = this.f10961a.name;
            } else {
                str = "";
            }
            String string = getString(C0126R.string.auth_pre_wipe_credential_desc_text_filler);
            String string2 = getString(C0126R.string.auth_pre_wipe_credential_desc_text, new Object[]{str, string});
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
            jeb jeb = new jeb(this);
            spannableStringBuilder.setSpan(new jec(), string2.indexOf(str), string2.indexOf(str) + str.length(), 33);
            spannableStringBuilder.setSpan(jeb, string2.indexOf(string), string2.indexOf(string) + string.length(), 33);
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            CheckBox checkBox = (CheckBox) findViewById(C0126R.C0129id.check_cred);
            this.f10962b = checkBox.isChecked();
            checkBox.setText(getString(C0126R.string.auth_pre_wipe_credential_check_text, new Object[]{this.f10961a.name}));
            return;
        }
        mo7717c();
    }

    public final void onDestroy() {
        super.onDestroy();
        sns sns = this.f10963c;
        if (sns != null) {
            sns.quitSafely();
        }
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            startActivityForResult((Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent"), 3);
        } catch (Exception e) {
            f10960e.mo25415d("Canceled account confirmation, do nothing", e, new Object[0]);
        }
    }
}
