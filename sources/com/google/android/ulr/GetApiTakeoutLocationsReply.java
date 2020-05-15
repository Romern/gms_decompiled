package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetApiTakeoutLocationsReply extends sip {

    /* renamed from: a */
    private static final TreeMap f151653a;

    /* renamed from: c */
    private final HashMap f151654c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151653a = treeMap;
        treeMap.put("locations", FastJsonResponse$Field.m22658b("locations", ApiTakeoutLocation.class));
        f151653a.put("somePointsHidden", FastJsonResponse$Field.m22663e("somePointsHidden"));
        f151653a.put("somePointsTruncated", FastJsonResponse$Field.m22663e("somePointsTruncated"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151653a;
    }

    public ArrayList getLocations() {
        return (ArrayList) this.f151654c.get("locations");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151654c.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151654c.containsKey(str);
    }
}
