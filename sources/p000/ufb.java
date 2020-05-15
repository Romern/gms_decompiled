package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.net.HttpURLConnection;

/* renamed from: ufb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ufb {
    /* renamed from: a */
    public static final sie m38262a(HttpURLConnection httpURLConnection, ClientContext clientContext, Context context) {
        sie sie = new sie(clientContext);
        String valueOf = String.valueOf(sie.mo25586b(context));
        httpURLConnection.setRequestProperty("Authorization", valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
        return sie;
    }
}
