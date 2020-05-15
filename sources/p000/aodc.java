package p000;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aodc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aodc extends sip {

    /* renamed from: c */
    private static final HashMap f78214c;

    /* renamed from: a */
    public ArrayList f78215a;

    static {
        HashMap hashMap = new HashMap();
        f78214c = hashMap;
        hashMap.put("items", FastJsonResponse$Field.m22658b("items", aodb.class));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f78214c;
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f78215a = arrayList;
    }
}
