package p000;

import android.content.Intent;
import android.text.TextUtils;

/* renamed from: rqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rqe {

    /* renamed from: a */
    public final Intent f43519a = new Intent("com.google.android.gms.common.acl.ACTION_ONLY_UPDATE");

    public rqe(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f43519a.putExtra("EXTRA_ACCOUNT_NAME", str);
            this.f43519a.putExtra("EXTRA_CLIENT_APPLICATION_ID", str2);
            return;
        }
        throw new IllegalArgumentException("The account name is required.");
    }
}
