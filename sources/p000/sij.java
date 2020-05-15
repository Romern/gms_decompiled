package p000;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sij extends sip {

    /* renamed from: a */
    private static final HashMap f44534a;

    static {
        HashMap hashMap = new HashMap();
        f44534a = hashMap;
        hashMap.put("domain", FastJsonResponse$Field.m22665f("domain"));
        f44534a.put("reason", FastJsonResponse$Field.m22665f("reason"));
        f44534a.put("message", FastJsonResponse$Field.m22665f("message"));
        f44534a.put("locationType", FastJsonResponse$Field.m22665f("locationType"));
        f44534a.put("location", FastJsonResponse$Field.m22665f("location"));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f44534a;
    }
}
