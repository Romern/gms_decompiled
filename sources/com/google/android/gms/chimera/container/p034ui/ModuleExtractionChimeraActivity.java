package com.google.android.gms.chimera.container.p034ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.chimera.container.FileApkIntentOperation;
import com.google.android.setupdesign.GlifLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.chimera.container.ui.ModuleExtractionChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleExtractionChimeraActivity extends deu {

    /* renamed from: com.google.android.gms.chimera.container.ui.ModuleExtractionChimeraActivity$ExtractionCompleteListener */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class ExtractionCompleteListener extends ResultReceiver {

        /* renamed from: a */
        private final WeakReference f29989a;

        public ExtractionCompleteListener(Handler handler, Activity activity) {
            super(handler);
            this.f29989a = new WeakReference(activity);
        }

        /* access modifiers changed from: protected */
        public final void onReceiveResult(int i, Bundle bundle) {
            Activity activity = (Activity) this.f29989a.get();
            if (activity != null && !activity.getSupportFragmentManager().isDestroyed()) {
                activity.setResult(-1);
                activity.finish();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.chimera.container.FileApkIntentOperation.a(boolean, android.content.Context, java.lang.String, android.os.ResultReceiver):void
     arg types: [int, com.google.android.gms.chimera.container.ui.ModuleExtractionChimeraActivity, java.lang.String, com.google.android.gms.chimera.container.ui.ModuleExtractionChimeraActivity$ExtractionCompleteListener]
     candidates:
      com.google.android.gms.chimera.container.FileApkIntentOperation.a(android.content.Context, java.lang.String, android.os.ResultReceiver, android.content.Intent):void
      com.google.android.gms.chimera.container.FileApkIntentOperation.a(boolean, android.content.Context, java.lang.String, android.os.ResultReceiver):void */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("asset_name");
        if (stringExtra == null) {
            setResult(0);
            finish();
            return;
        }
        bjbb bjbb = new bjbb(bjbc.m103136a());
        bjbb.f122457a = 2132018260;
        bjbb.f122458b = false;
        setTheme(bjbb.mo64964a().mo64965a(getIntent()));
        setContentView((int) C0126R.C0128layout.module_loading_activity);
        ((biyn) ((GlifLayout) findViewById(C0126R.C0129id.module_loading_layout)).mo71342a(biyn.class)).mo64874a().setVisibility(8);
        FileApkIntentOperation.m22398a(true, (Context) this, stringExtra, (ResultReceiver) new ExtractionCompleteListener(new adzt(), this));
    }
}
