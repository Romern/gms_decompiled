package com.google.android.gms.notifications;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GunsNotificationChimeraActivity extends Activity {

    /* renamed from: a */
    private static final srn f81217a = srn.m36127a(sgj.GUNS);

    /* renamed from: a */
    private final void m67672a() {
        sendOrderedBroadcast(akny.m60109a(getApplicationContext(), getIntent()), null);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if ("com.google.android.gms.notifications.intents.START_ACTIVITY".equals(intent.getAction())) {
            bldb b = akoc.m60121b(intent);
            if (akoc.m60123b(b)) {
                blcq blcq = b.f126040c;
                if (blcq == null) {
                    blcq = blcq.f125965b;
                }
                blcp blcp = blcq.f125967a;
                if (blcp == null) {
                    blcp = blcp.f125957g;
                }
                if (aknx.m60108a(this, blcp)) {
                    m67672a();
                    finish();
                }
            }
            if (!akoc.m60120a(b)) {
                ((bnsl) f81217a.mo68387b()).mo68405a("Failed to start webview or intent targe due to invalid payload.");
                m67672a();
            } else {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    blcs a = akoc.m60116a(getIntent());
                    if (a != null) {
                        blda blda = a.f125980e;
                        if (blda == null) {
                            blda = blda.f126015t;
                        }
                        str = blda.f126026j;
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        Toast.makeText(getApplicationContext(), str, 1).show();
                    }
                } else {
                    bldc bldc = b.f126039b;
                    if (bldc == null) {
                        bldc = bldc.f126041c;
                    }
                    if (bldc.f126044b) {
                        Intent className = new Intent().setClassName(getApplicationContext(), "com.google.android.gms.notifications.GunsBrowserActivity");
                        className.setAction("com.google.android.gms.notifications.intents.LOAD_URL");
                        className.putExtras(getIntent().getExtras());
                        startActivity(className);
                    } else {
                        bldc bldc2 = b.f126039b;
                        if (bldc2 == null) {
                            bldc2 = bldc.f126041c;
                        }
                        startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(bldc2.f126043a)));
                    }
                    m67672a();
                }
            }
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }
}
