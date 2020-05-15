package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.googlehelp.gcm.InvalidateGcmTokenGcmTaskChimeraService;
import com.google.android.gms.googlehelp.helpactivities.ClickToCallChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: aazt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aazt {

    /* renamed from: a */
    public static String f56904a;

    /* renamed from: b */
    private static bqgj f56905b;

    /* renamed from: a */
    public static synchronized void m47336a(Context context) {
        synchronized (aazt.class) {
            soc soc = new soc(1, 10);
            f56905b = soc;
            soc.execute(new aazs(context));
            f56905b.shutdown();
        }
    }

    /* renamed from: b */
    public static String m47337b(Context context) {
        if (f56905b == null) {
            Log.w("gH_GcmTokenManager", "initTokenAsync() should have been called on this process before calling getToken().");
            m47336a(context);
        }
        try {
            f56905b.awaitTermination(ceeg.f182447a.mo6606a().mo78944L(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Log.w("gH_GcmTokenManager", "Interrupted while waiting for GCM token.", e);
        }
        if (!TextUtils.isEmpty(f56904a)) {
            InvalidateGcmTokenGcmTaskChimeraService.m66507a(context);
            if ((context instanceof ClickToCallChimeraActivity) && aayh.m47254a(((aasf) context).mo18626g().f78827b, ceeg.f182447a.mo6606a().mo78978aS())) {
                InvalidateGcmTokenGcmTaskChimeraService.m66508a(context, (int) ceeg.f182447a.mo6606a().mo78942J());
            }
            return f56904a;
        } else if (!(context instanceof aasf)) {
            return null;
        } else {
            abcx.m47510c((aasf) context);
            return null;
        }
    }
}
