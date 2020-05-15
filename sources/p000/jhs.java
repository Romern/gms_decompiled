package p000;

import android.content.Context;
import com.android.volley.RequestQueue;

/* renamed from: jhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jhs {

    /* renamed from: a */
    private final Context f22503a;

    /* renamed from: b */
    private final RequestQueue f22504b;

    public jhs(Context context, RequestQueue requestQueue) {
        sdo.m34959a(context);
        this.f22503a = context;
        sdo.m34959a(requestQueue);
        this.f22504b = requestQueue;
    }

    /* renamed from: a */
    public final bqgg mo13754a(String str, String str2, bxxc bxxc, bxxc bxxc2) {
        if ("get".equalsIgnoreCase(str) || "post".equalsIgnoreCase(str)) {
            sdo.m34977c(str2);
            sdo.m34959a(bxxc);
            sdo.m34959a(bxxc2);
            rqx rqx = new rqx();
            this.f22504b.add(rqw.m34279a(this.f22503a, str2, bxxc, bxxc2, rqx));
            return rqx;
        }
        throw new IllegalArgumentException(str.length() == 0 ? new String("Unsupported method: ") : "Unsupported method: ".concat(str));
    }
}
