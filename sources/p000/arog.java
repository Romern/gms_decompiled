package p000;

import com.android.volley.Request;
import com.android.volley.Response;
import java.util.HashMap;

/* renamed from: arog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arog extends sia {
    public arog(int i, String str, byte[] bArr, Object obj, Response.Listener listener, Response.ErrorListener errorListener, HashMap hashMap, int i2) {
        super(i, str, bArr, obj, listener, errorListener, null, null, false, hashMap, 21248, i2);
    }

    public final String getBodyContentType() {
        return "application/protobuf";
    }

    public final Request.Priority getPriority() {
        return Request.Priority.IMMEDIATE;
    }
}
