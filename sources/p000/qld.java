package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.List;

/* renamed from: qld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qld extends IntentOperation {

    /* renamed from: a */
    private Boolean f41636a;

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
    private final void m32333a(GoogleSettingsItem googleSettingsItem, List list) {
        if (googleSettingsItem != null) {
            if (googleSettingsItem.f29958d == null && googleSettingsItem.f29970p >= 0) {
                googleSettingsItem.f29958d = getResources().getString(googleSettingsItem.f29970p);
            }
            if (googleSettingsItem.f29963i == null && googleSettingsItem.f29971q >= 0) {
                googleSettingsItem.f29963i = getResources().getString(googleSettingsItem.f29971q);
            }
            if (cdlk.m133968c() && googleSettingsItem.f29956b != null && !mo24068c()) {
                googleSettingsItem.f29956b.putExtra("calledFromGoogleSettings", true);
            }
            Parcel obtain = Parcel.obtain();
            qle.m32339a(googleSettingsItem, obtain, 0);
            list.add(obtain);
        }
    }

    /* renamed from: a */
    public List mo6342a() {
        return null;
    }

    /* renamed from: b */
    public GoogleSettingsItem mo7154b() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo24068c() {
        bmzs.m108696a(this.f41636a);
        return this.f41636a.booleanValue();
    }

    public void onHandleIntent(Intent intent) {
        vzr vzr;
        if ("com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            boolean z = false;
            if (intent.getBooleanExtra("isSearchIndexingIntent", false)) {
                z = true;
            } else if ("GoogleSettingsIndexGetter".equals(intent.getStringExtra("className"))) {
                z = true;
            }
            this.f41636a = Boolean.valueOf(z);
            if (extras != null) {
                IBinder a = C1004fv.m12454a(extras, "settingsListKey");
                if (a != null && a.pingBinder()) {
                    IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof vzr) {
                        vzr = (vzr) queryLocalInterface;
                    } else {
                        vzr = new vzp(a);
                    }
                    List list = (List) vzs.m41641a(vzr);
                    bmzs.m108696a(list);
                    m32333a(mo7154b(), list);
                    List<GoogleSettingsItem> a2 = mo6342a();
                    if (a2 != null) {
                        for (GoogleSettingsItem googleSettingsItem : a2) {
                            m32333a(googleSettingsItem, list);
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Bundle passed from GoogleSettingsActivity must not be null.");
        }
        throw new IllegalArgumentException("GoogleSettingsIntentOperation should only be called with the com.google.android.gms.GOOGLE_SETTINGS_OPERATION action.");
    }

    /* renamed from: a */
    protected static final boolean m32334a(Intent intent, String str) {
        return !str.equals(intent.getStringExtra("className"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo24067a(String str) {
        return new Intent(str).setPackage(getPackageName()).addCategory("android.intent.category.DEFAULT");
    }
}
