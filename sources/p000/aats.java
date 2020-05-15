package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: aats */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aats extends aayk {
    public aats(Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr) {
        super(context, helpConfig, bqgj, abcr, 13);
    }

    /* renamed from: a */
    public static bzqp m46994a(Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr) {
        sdo.m34973b("Must be called from a worker thread.");
        if (!ssk.m36235a(context)) {
            return null;
        }
        aats aats = new aats(context, helpConfig, bqgj, abcr);
        try {
            aays k = aats.mo31910k();
            if (!aats.mo31909a(k)) {
                return null;
            }
            try {
                return (bzqp) bxvk.m124016a(bzqp.f171047j, k.f56844c, bxus.m123744c());
            } catch (bxwf e) {
                Log.e("gH_EscOptionsCronetReq", "Parsing EscalationOptions failed!", e);
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("gH_EscOptionsCronetReq", "Fetching EscalationOptions failed.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29520b() {
        return Uri.parse(ceeg.m136397b()).buildUpon().encodedPath(ceeg.f182447a.mo6606a().mo78938F()).appendQueryParameter("e", ceeg.m136406k()).build().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29518a() {
        return aayq.m47281a(ceev.f182568a.mo6606a().mo79061m());
    }
}
