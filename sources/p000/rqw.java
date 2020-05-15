package p000;

import android.content.Context;
import android.os.Process;
import com.android.volley.Request;
import java.util.HashMap;

/* renamed from: rqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rqw extends sia {
    protected rqw(String str, HashMap hashMap, bxxc bxxc, bxxc bxxc2, rqx rqx) {
        super(1, str, bxxc.mo73642k(), bxxc2, rqx, rqx, null, null, false, hashMap, 1025, Process.myUid());
    }

    /* renamed from: a */
    public static rqw m34279a(Context context, String str, bxxc bxxc, bxxc bxxc2, rqx rqx) {
        HashMap hashMap = new HashMap();
        rqv.m34278a(context, hashMap, context.getPackageName());
        return new rqw(str, hashMap, bxxc, bxxc2, rqx);
    }

    public final String getBodyContentType() {
        return "application/protobuf";
    }

    public final Request.Priority getPriority() {
        return Request.Priority.IMMEDIATE;
    }
}
