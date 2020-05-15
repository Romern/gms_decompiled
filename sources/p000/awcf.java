package p000;

import android.os.Build;
import com.android.volley.RequestQueue;
import com.google.android.chimera.Activity;

/* renamed from: awcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awcf {
    /* renamed from: a */
    public static void m79640a(deu deu) {
        bjzc.f123663a = awfz.f94285a;
        spn.m35879d((Activity) deu);
        int i = Build.VERSION.SDK_INT;
        deu.findViewById(16908290).setImportantForAutofill(8);
        RequestQueue requestQueue = rpr.m34216b().getRequestQueue();
        bjtx.m104622b(requestQueue);
        bjtx.m104620a(requestQueue);
        bjtx.m104624c(requestQueue);
        bjvn.m104716a(new axal());
    }

    /* renamed from: a */
    public static void m79641a(dnx dnx) {
        String action = dnx.getIntent().getAction();
        try {
            spn.m35870c((Activity) dnx);
        } catch (Throwable th) {
            throw new RuntimeException(String.format("Cannot start Activity for action: %s called by non-Google app %s", action, spn.m35852a((Activity) dnx)), th);
        }
    }
}
