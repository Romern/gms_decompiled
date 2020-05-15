package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: abgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abgr extends abgl {

    /* renamed from: f */
    private final HelpConfig f57423f;

    /* renamed from: g */
    private final String f57424g;

    /* renamed from: h */
    private final String f57425h;

    /* renamed from: i */
    private final String f57426i;

    public abgr(GoogleHelpChimeraService googleHelpChimeraService, String str, abcf abcf, HelpConfig helpConfig, String str2, String str3, String str4) {
        super("RequestClickToCallOperation", googleHelpChimeraService, str, abcf);
        this.f57423f = helpConfig;
        this.f57424g = str2;
        this.f57425h = str3;
        this.f57426i = str4;
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        if (TextUtils.isEmpty(this.f57424g)) {
            Log.w("gH_RequestClickToCallOp", "Requester phone number is required for C2C support.");
            this.f57414e.mo32007e();
            return;
        }
        RequestFuture newFuture = RequestFuture.newFuture();
        GoogleHelpChimeraService googleHelpChimeraService = this.f57412a;
        aatm.m46988a(googleHelpChimeraService, this.f57423f, googleHelpChimeraService.mo43374a(), null, this.f57424g, this.f57425h, this.f57426i, newFuture, newFuture);
        try {
            newFuture.get(ceeg.m136412q(), TimeUnit.SECONDS);
            this.f57414e.mo32006d();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("gH_RequestClickToCallOp", "C2C support request failed.", e);
            this.f57414e.mo32007e();
        }
    }
}
