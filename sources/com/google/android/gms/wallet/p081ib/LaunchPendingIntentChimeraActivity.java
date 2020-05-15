package com.google.android.gms.wallet.p081ib;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.intentoperation.p083ib.ReportErrorChimeraIntentOperation;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.Locale;

/* renamed from: com.google.android.gms.wallet.ib.LaunchPendingIntentChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LaunchPendingIntentChimeraActivity extends Activity {

    /* renamed from: a */
    private int f110232a;

    /* renamed from: a */
    public static Intent m93989a(Context context, BuyFlowConfig buyFlowConfig, String str, PendingIntent pendingIntent) {
        sdo.m34959a(pendingIntent);
        byte[] bArr = new byte[32];
        awvz.m81273a().nextBytes(bArr);
        String a = srv.m36160a(bArr);
        Intent a2 = m93990a(a);
        a2.putExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivity.actualPendingIntentToLaunch", pendingIntent);
        a2.putExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivity.requestId", "DUMMY_REQUEST_ID_FOR_WRAPPER_PENDING_INTENT");
        a2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        a2.putExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivitygoogleTransactionId", str);
        PendingIntent activity = PendingIntent.getActivity(context, 0, a2, 0);
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.wallet.ib.LaunchPendingIntentActivity");
        intent.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent.putExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivitygoogleTransactionId", str);
        intent.putExtra("com.google.android.gms.wallet.EXTRA_PENDING_INTENT", activity);
        intent.putExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivity.requestId", a);
        return intent;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        if (i == 501) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Unexpected requestCode");
        m93991a(i2, intent);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f110232a = 0;
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivity.requestId");
            if (!stringExtra.equals("DUMMY_REQUEST_ID_FOR_WRAPPER_PENDING_INTENT")) {
                PendingIntent activity = PendingIntent.getActivity(this, 0, m93990a(stringExtra), 536870912);
                if (activity != null) {
                    try {
                        startIntentSenderForResult(activity.getIntentSender(), 502, null, 0, 0, 0);
                        this.f110232a = 1;
                    } catch (IntentSender.SendIntentException e) {
                        m93992a(intent, 1020);
                        Log.w("LPIActivity", "Failed to send wrapper pending intent", e);
                        m93991a(0, (Intent) null);
                    }
                    activity.cancel();
                    return;
                }
                throw new IllegalStateException(String.format(Locale.US, "Expected to find a wrapper intent for requestId = %s", stringExtra));
            }
            throw new IllegalStateException("Wrapper pending intent should not be fired!");
        }
        this.f110232a = bundle.getInt("processingState");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        boolean z = true;
        if (this.f110232a != 1) {
            z = false;
        }
        sdo.m34971a(z, (Object) "Not expecting a new intent!");
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivity.actualPendingIntentToLaunch");
        if ("com.google.android.gms".equals(awrt.m80832a(pendingIntent))) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 501, null, 0, 0, 0);
                this.f110232a = 2;
            } catch (IntentSender.SendIntentException e) {
                m93992a(intent, 1019);
                Log.w("LPIActivity", "Failed to send actual pending intent", e);
                m93991a(0, (Intent) null);
            }
        } else {
            throw new SecurityException("Given pending intent was not created by GMSCore!");
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("processingState", this.f110232a);
    }

    /* renamed from: a */
    private static Intent m93990a(String str) {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.wallet.ib.LaunchPendingIntentActivity");
        String valueOf = String.valueOf(str);
        intent.setAction(valueOf.length() == 0 ? new String("com.google.android.gms.wallet.ib.LaunchPendingIntentActivity.") : "com.google.android.gms.wallet.ib.LaunchPendingIntentActivity.".concat(valueOf));
        intent.setFlags(603979776);
        return intent;
    }

    /* renamed from: a */
    private final void m93991a(int i, Intent intent) {
        this.f110232a = 3;
        setResult(i, intent);
        finish();
    }

    /* renamed from: a */
    private final void m93992a(Intent intent, int i) {
        ReportErrorChimeraIntentOperation.m94035a((BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig"), intent.getStringExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivitygoogleTransactionId"), 3, 8, i - 1, this);
    }
}
