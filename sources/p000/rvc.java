package p000;

import android.content.Context;
import android.util.Log;

/* renamed from: rvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rvc {
    /* renamed from: a */
    public static void m34510a(RuntimeException runtimeException, Context context, bpun bpun, String str) {
        if (bpun == bpun.STARTUP || bpun == bpun.SAFEBOOT_STARTUP) {
            try {
                sqx.m36054a(context, runtimeException, 0);
                String valueOf = String.valueOf(str);
                Log.e("ExceptionUtil", valueOf.length() == 0 ? new String("RuntimeException while safely performing function: ") : "RuntimeException while safely performing function: ".concat(valueOf), runtimeException);
            } catch (RuntimeException e) {
            }
        } else {
            throw runtimeException;
        }
    }

    /* renamed from: a */
    public static void m34511a(RuntimeException runtimeException, rvl rvl, String str) {
        m34510a(runtimeException, rvl.f43760b, rvl.f43759a, str);
    }
}
