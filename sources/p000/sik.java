package p000;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sik extends sip {

    /* renamed from: a */
    private static final HashMap f44535a;

    /* renamed from: c */
    private final HashMap f44536c = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f44535a = hashMap;
        hashMap.put("errors", FastJsonResponse$Field.m22658b("errors", sij.class));
        f44535a.put("code", FastJsonResponse$Field.m22650a("code"));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f44535a;
    }

    public ArrayList getErrors() {
        return (ArrayList) this.f44536c.get("errors");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f44536c.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f44536c.containsKey(str);
    }
}
