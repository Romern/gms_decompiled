package p000;

import android.content.Intent;
import com.google.android.gms.common.api.Status;

/* renamed from: hxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hxv {
    /* renamed from: a */
    public static Intent m14997a(String str, Status status) {
        return new Intent("com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED").setPackage(str).putExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS", status);
    }
}
