package p000;

import android.content.Context;
import android.os.Process;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.RetryPolicy;
import java.util.HashMap;

/* renamed from: aroh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aroh implements arob {

    /* renamed from: a */
    private final Context f87992a;

    /* renamed from: b */
    private final RequestQueue f87993b;

    /* renamed from: c */
    private final RetryPolicy f87994c;

    /* renamed from: d */
    private boolean f87995d = false;

    public aroh(Context context, RequestQueue requestQueue, RetryPolicy retryPolicy) {
        sdo.m34959a(context);
        this.f87992a = context;
        sdo.m34959a(requestQueue);
        this.f87993b = requestQueue;
        sdo.m34959a(retryPolicy);
        this.f87994c = retryPolicy;
        this.f87995d = true;
    }

    /* renamed from: a */
    public final bqgg mo48705a(String str, String str2, byte[] bArr, Object obj) {
        int i;
        if ("get".equalsIgnoreCase(str)) {
            i = 0;
        } else if (!"post".equalsIgnoreCase(str)) {
            throw new IllegalArgumentException(str.length() == 0 ? new String("Unsupported method: ") : "Unsupported method: ".concat(str));
        } else {
            i = 1;
        }
        sdo.m34977c(str2);
        sdo.m34959a(bArr);
        sdo.m34959a(obj);
        aroe aroe = new aroe();
        Request a = mo48706a(this.f87992a, i, str2, bArr, obj, aroe);
        a.setRetryPolicy(this.f87994c);
        a.setShouldRetryServerErrors(this.f87995d);
        this.f87993b.add(a);
        return aroe;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Request mo48706a(Context context, int i, String str, byte[] bArr, Object obj, aroe aroe) {
        HashMap hashMap = new HashMap();
        aroc.m73212a(context, hashMap, context.getPackageName());
        return new arog(i, str, bArr, obj, aroe, aroe, hashMap, Process.myUid());
    }
}
