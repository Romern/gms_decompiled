package com.google.android.gms.chimera.container.p034ui;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.config.FeatureRequestExtras;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.setupdesign.GlifLayout;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.chimera.container.ui.ModuleDownloadChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleDownloadChimeraActivity extends deu {

    /* renamed from: b */
    public ModuleManager.FeatureList f29984b;

    /* renamed from: c */
    public int f29985c = 0;

    /* renamed from: d */
    public Handler f29986d;

    /* renamed from: e */
    qod f29987e;

    /* renamed from: f */
    private GlifLayout f29988f;

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
    /* renamed from: b */
    private final void m22414b(int i) {
        int i2 = 1;
        Intent putExtra = new Intent().putExtra("_chimera_fallback_only", true);
        FeatureRequestExtras.ResultBuilder resultBuilder = new FeatureRequestExtras.ResultBuilder();
        if (i != 2) {
            if (i == 3) {
                i2 = 2;
            } else if (i == 4) {
                i2 = 3;
            } else if (i == 5) {
                i2 = 4;
            } else if (i != 6) {
                StringBuilder sb = new StringBuilder(57);
                sb.append("Unexpected result code from download activity ");
                sb.append(i);
                Log.w("ModuleDownloadActivity", sb.toString());
            } else {
                i2 = 5;
            }
        }
        resultBuilder.setDownloadResult(i2);
        resultBuilder.addToIntent(putExtra);
        setResult(-1, putExtra);
        finish();
    }

    /* renamed from: a */
    public final void mo17635a(int i) {
        int i2;
        String str;
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if ((i == 3 || i == 4) && ((connectivityManager = (ConnectivityManager) getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected())) {
            i = 5;
        }
        this.f29985c = i;
        int i3 = C0126R.string.zapp_checkin_failure_subtitle;
        int i4 = C0126R.string.zapp_checkin_title;
        int i5 = C0126R.string.common_cancel;
        if (i == 0) {
            ModuleManager moduleManager = ModuleManager.get(this);
            ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
            String sessionId = new FeatureRequestExtras.RequestReader(getIntent()).getSessionId();
            if (cdjl.m133600f() && sessionId != null) {
                featureRequest.setSessionId(sessionId);
            }
            try {
                featureRequest.requestFeatures(this.f29984b);
                qod qod = this.f29987e;
                if (qod != null) {
                    qod.mo24150b();
                }
                qod qod2 = new qod(this.f29986d, this.f29984b, moduleManager);
                this.f29987e = qod2;
                featureRequest.setUrgent(qod2);
                if (!moduleManager.requestFeatures(featureRequest)) {
                    mo17635a(3);
                    i2 = 0;
                    i3 = C0126R.string.zapp_checkin_description_text;
                    i5 = 0;
                } else {
                    this.f29986d.sendMessageDelayed(this.f29986d.obtainMessage(0, 4, 0), TimeUnit.SECONDS.toMillis(cdji.m133564e()));
                    i2 = 0;
                    i3 = C0126R.string.zapp_checkin_description_text;
                    i5 = 0;
                }
            } catch (bxwf e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Invalid FeatureList: ");
                sb.append(valueOf);
                Log.e("ModuleDownloadActivity", sb.toString());
                mo17635a(2);
                i2 = 0;
                i3 = C0126R.string.zapp_checkin_description_text;
                i5 = 0;
            }
        } else if (i != 1) {
            if (i == 2) {
                i2 = 8;
                i3 = 0;
            } else if (i == 3 || i == 4) {
                i2 = 8;
            } else if (i == 5) {
                i4 = C0126R.string.zapp_checkin_offline_title;
                i3 = C0126R.string.zapp_checkin_offline_subtitle;
                i5 = C0126R.string.common_retry;
                i2 = 8;
            } else {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append(i);
                sb2.append(" is not a valid state");
                throw new IllegalArgumentException(sb2.toString());
            }
            i4 = C0126R.string.common_something_went_wrong;
        } else {
            m22414b(1);
            return;
        }
        TextView textView = (TextView) this.f29988f.findViewById(C0126R.C0129id.description_text);
        if (i3 != 0) {
            str = getString(i3);
        } else {
            str = "";
        }
        textView.setText(str);
        this.f29988f.findViewById(C0126R.C0129id.circular_progress_bar).setVisibility(i2);
        this.f29988f.mo71365c(i4);
        biyp biyp = ((biyn) this.f29988f.mo71342a(biyn.class)).f122314f;
        if (i5 != 0) {
            biyp.mo64885a(0);
            biyp.mo64886a(this, i5);
            return;
        }
        biyp.mo64885a(8);
    }

    public final void onBackPressed() {
        int i = this.f29985c;
        if (i == 0) {
            i = 6;
        }
        m22414b(i);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29986d = new adzt(new qob(this));
        Intent intent = getIntent();
        byte[] byteArrayExtra = intent.getByteArrayExtra("chimera.FEATURE_LIST");
        if (byteArrayExtra == null) {
            Log.w("ModuleDownloadActivity", "No features specified. Finishing...");
            m22414b(2);
            return;
        }
        this.f29984b = ModuleManager.FeatureList.fromProto(byteArrayExtra);
        bjbb bjbb = new bjbb(bjbc.m103136a());
        bjbb.f122457a = 2132018260;
        bjbb.f122458b = false;
        setTheme(bjbb.mo64964a().mo64965a(intent));
        if (intent.getBooleanExtra("useImmersiveMode", false)) {
            bizb.m103017a(getWindow());
        }
        setContentView((int) C0126R.C0128layout.module_loading_activity);
        GlifLayout glifLayout = (GlifLayout) findViewById(C0126R.C0129id.module_loading_layout);
        this.f29988f = glifLayout;
        ((biyn) glifLayout.mo71342a(biyn.class)).f122314f.f122336f = new qoc(this);
        if (bundle != null) {
            this.f29985c = bundle.getInt("state", 0);
        }
        mo17635a(this.f29985c);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        qod qod = this.f29987e;
        if (qod != null) {
            qod.mo24150b();
            this.f29987e = null;
            this.f29986d.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("state", this.f29985c);
    }
}
