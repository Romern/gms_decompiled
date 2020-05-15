package p000;

import android.os.Process;
import com.android.volley.Request;
import com.android.volley.Response;
import java.util.HashMap;

/* renamed from: arod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arod extends sia {
    public arod(int i, String str, byte[] bArr, Object obj, Response.Listener listener, Response.ErrorListener errorListener, HashMap hashMap) {
        super(i, str, bArr, obj, listener, errorListener, null, null, false, hashMap, 21248, Process.myUid());
    }

    public final String getBodyContentType() {
        return "application/octet-stream";
    }

    public final Request.Priority getPriority() {
        return Request.Priority.IMMEDIATE;
    }
}
