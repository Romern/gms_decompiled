package p000;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.gms.plus.internal.PlusCommonExtras;

/* renamed from: anku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anku {
    /* renamed from: a */
    public static void m64689a(Activity activity, PlusCommonExtras plusCommonExtras, String str) {
        Intent intent = activity.getIntent();
        if (TextUtils.isEmpty(plusCommonExtras.f82349c)) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE");
            if (TextUtils.isEmpty(stringExtra)) {
                String a = spn.m35852a(activity);
                if (!TextUtils.isEmpty(a)) {
                    plusCommonExtras.f82349c = a;
                }
            } else {
                plusCommonExtras.f82349c = stringExtra;
            }
        }
        if (TextUtils.isEmpty(plusCommonExtras.f82348b)) {
            String stringExtra2 = intent.getStringExtra("com.google.android.gms.plus.intent.extra.GPSRC");
            if (!TextUtils.isEmpty(stringExtra2)) {
                plusCommonExtras.f82348b = stringExtra2;
            } else {
                plusCommonExtras.f82348b = str;
            }
        }
    }
}
