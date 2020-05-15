package p000;

import android.content.Context;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: akjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akjp implements akjr {

    /* renamed from: a */
    private final aoob f72107a;

    /* renamed from: b */
    private final Context f72108b;

    public akjp(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f72108b = applicationContext;
        this.f72107a = aonx.m66186a(applicationContext);
    }

    /* renamed from: a */
    public final void mo39506a() {
    }

    /* renamed from: a */
    public final void mo39507a(Map map) {
        String str;
        try {
            str = ((PseudonymousIdToken) aucu.m76783a(this.f72107a.mo43118a(), cfpe.f185334a.mo6606a().mo82416h(), TimeUnit.MILLISECONDS)).f83468a;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            eoa.m10825a("NetRec", e, "couldn't get Zwieback cookie.", new Object[0]);
            str = null;
        }
        if (str != null) {
            String valueOf = String.valueOf(str);
            map.put("Cookie", valueOf.length() == 0 ? new String("NID=") : "NID=".concat(valueOf));
        }
    }
}
