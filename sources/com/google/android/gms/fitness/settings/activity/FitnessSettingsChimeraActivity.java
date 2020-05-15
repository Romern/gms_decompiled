package com.google.android.gms.fitness.settings.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitnessSettingsChimeraActivity extends zpn implements View.OnClickListener {
    static {
        zvt.m46581a();
    }

    public FitnessSettingsChimeraActivity() {
        super(C0126R.string.common_fitness_settings_title);
    }

    /* renamed from: a */
    private final void m23817a(int i) {
        if (!ssk.m36235a(this)) {
            Toast.makeText(this, (int) C0126R.string.common_no_network, 1).show();
            return;
        }
        long b = cdyl.f181915a.mo6606a().mo78453b();
        long a = cdyl.f181915a.mo6606a().mo78452a();
        String d = cdyl.f181915a.mo6606a().mo78455d();
        int i2 = Build.VERSION.SDK_INT;
        String languageTags = LocaleList.getDefault().toLanguageTags();
        if (languageTags != null) {
            d = Uri.parse(d).buildUpon().appendQueryParameter("hl", languageTags).build().toString();
        }
        startActivityForResult(akvm.m60559a(d, mo31315e()).putExtra("extra.initialTitleType", (int) b).putExtra("extra.initialAccountDisplay", (int) a), i);
    }

    /* renamed from: g */
    private final void m23818g() {
        Intent className = new Intent().setClassName(this, "com.google.android.gms.fitness.settings.ManageDataSourcesActivity");
        className.putExtra("EXTRA_ACCOUNT", mo31315e());
        className.setPackage(getPackageName());
        startActivity(className);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19186a(String str) {
    }

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
    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 || i == 2) {
            Intent intent2 = new Intent("com.google.android.gms.fitness.START_SYNC");
            intent2.setPackage("com.google.android.gms");
            intent2.putExtra("account", mo31315e());
            intent2.putExtra("sync_source", 4);
            intent2.putExtra("sync_server", true);
            sendBroadcast(intent2);
            if (i == 2) {
                finish();
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C0126R.C0129id.connected_apps_and_devices) {
            Intent intent = new Intent("com.google.android.gms.plus.action.MANAGE_APPS");
            intent.putExtra("com.google.android.gms.extras.ACCOUNT_NAME", mo31315e());
            intent.putExtra("com.google.android.gms.extras.PRESELECTED_FILTER", 2);
            intent.setPackage(getPackageName());
            startActivity(intent);
        } else if (id != C0126R.C0129id.manage_data_sources) {
        } else {
            if (cdyl.m135292b()) {
                m23817a(1);
            } else {
                m23818g();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!cdyu.f181962a.mo6606a().mo78517u() || !"com.google.android.gms.fitness.settings.DELETE_HISTORY".equals(getIntent().getAction())) {
            setContentView((int) C0126R.C0128layout.fitness_settings);
            View findViewById = findViewById(C0126R.C0129id.connected_apps_and_devices);
            View findViewById2 = findViewById(C0126R.C0129id.manage_data_sources);
            findViewById.setOnClickListener(this);
            findViewById2.setOnClickListener(this);
        } else if (cdyl.m135292b()) {
            m23817a(2);
        } else {
            m23818g();
            finish();
        }
    }
}
