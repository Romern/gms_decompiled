package com.google.android.gms.auth.frp;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.login.BrowserChimeraActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FactoryResetProtectionChimeraActivity extends Activity {

    /* renamed from: a */
    private static final sek f10928a = new sek("GLSActivity", "FactoryResetProtectionActivity");

    /* renamed from: b */
    private static String f10929b = "url";

    /* renamed from: c */
    private String f10930c;

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
    /* renamed from: a */
    private final void m6631a() {
        Intent a = BrowserChimeraActivity.m6653a(null, this.f10930c, null, false, null, null, null);
        a.putExtra("firstRun", true);
        a.putExtra("useImmersiveMode", true);
        startActivityForResult(a, 1001);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            setResult(0);
            finish();
        } else if (i2 != -1) {
            m6631a();
        } else if (i != 1001) {
            if (i == 1002) {
                setResult(-1);
                finish();
            }
        } else if (intent != null) {
            jen a = jen.m16608a(intent);
            String string = a.f22297a.getString("obfuscated_gaia_id");
            String b = a.mo13663b();
            if (string == null || b == null) {
                Object[] objArr = new Object[2];
                objArr[0] = string;
                if (b == null) {
                    z = true;
                } else {
                    z = false;
                }
                objArr[1] = Boolean.valueOf(z);
                f10928a.mo25416d(String.format("gaiaid (%s) or authCode (%s) is null.", objArr), new Object[0]);
                m6631a();
                return;
            }
            startActivityForResult(new Intent().setClassName(this, "com.google.android.gms.auth.frp.FrpInterstitialActivity").putExtra("account_id", string), 1002);
        } else {
            m6631a();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f10930c = getIntent().getStringExtra(f10929b);
        } else {
            this.f10930c = bundle.getString(f10929b);
        }
        m6631a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(f10929b, this.f10930c);
    }
}
