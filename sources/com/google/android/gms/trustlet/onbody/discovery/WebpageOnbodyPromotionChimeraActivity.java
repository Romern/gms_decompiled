package com.google.android.gms.trustlet.onbody.discovery;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WebpageOnbodyPromotionChimeraActivity extends Activity {

    /* renamed from: a */
    public static final aumh f109247a = new auvo();

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            setResult(i2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!chac.f188164a.mo6606a().mo84852h()) {
            setResult(0);
            finish();
        }
        Intent intent = new Intent();
        intent.setClassName(this, "com.google.android.gms.trustagent.discovery.PromoteScreenLockAndOnbodyActivity");
        intent.putExtra("extra_from_intent", "com.google.android.gms.trustagent.discovery.WebpageOnbodyPromotionActivity");
        startActivityForResult(intent, 1);
    }
}
