package p000;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.RetryPolicy;
import java.util.HashMap;

/* renamed from: arof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arof extends aroh {
    public arof(Context context, RequestQueue requestQueue, RetryPolicy retryPolicy) {
        super(context, requestQueue, retryPolicy);
    }

    /* renamed from: a */
    public final Request mo48706a(Context context, int i, String str, byte[] bArr, Object obj, aroe aroe) {
        HashMap hashMap = new HashMap();
        aroc.m73212a(context, hashMap, context.getPackageName());
        return new arod(i, str, bArr, obj, aroe, aroe, hashMap);
    }
}
