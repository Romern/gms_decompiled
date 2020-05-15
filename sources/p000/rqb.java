package p000;

import android.content.Intent;
import android.text.TextUtils;

/* renamed from: rqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rqb {

    /* renamed from: a */
    public final Intent f43514a = new Intent("com.google.android.gms.plus.audience.ACTION_CIRCLE_CREATION");

    public rqb(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f43514a.putExtra("com.google.android.gms.common.audience.EXTRA_ACCOUNT_NAME", str);
            this.f43514a.putExtra("com.google.android.gms.common.audience.EXTRA_APP_ID", str2);
            return;
        }
        throw new IllegalArgumentException("The account name is required.");
    }
}
