package com.google.android.gms.tapandpay.wear;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearProxyMessageIntentOperation extends asjx {
    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("shouldCompressRpcs", false);
        Bundle bundleExtra = intent.getBundleExtra("data");
        bundleExtra.putBoolean("shouldCompressRpcs", booleanExtra);
        axoz.m82854b(getBaseContext()).mo24694a(intent.getStringExtra("nodeId"), "/tapandpay/proxy", auai.m76649a(bundleExtra, booleanExtra));
    }
}
