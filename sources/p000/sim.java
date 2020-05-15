package p000;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sim extends sip {

    /* renamed from: c */
    private static final HashMap f44537c;

    /* renamed from: a */
    public final HashMap f44538a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f44537c = hashMap;
        hashMap.put("error", FastJsonResponse$Field.m22654a("error", sik.class));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f44537c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f44538a.containsKey(str);
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f44538a.put(str, sio);
    }
}
