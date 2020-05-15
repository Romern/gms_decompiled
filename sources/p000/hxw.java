package p000;

import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.api.Status;

/* renamed from: hxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hxw {
    /* renamed from: a */
    public static Intent m14998a(String str, Status status) {
        Intent putExtra = new Intent("com.google.android.gms.auth.api.phone.SMS_RETRIEVED").setPackage(str).putExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS", status);
        int i = Build.VERSION.SDK_INT;
        putExtra.addFlags(2097152);
        return putExtra;
    }
}
