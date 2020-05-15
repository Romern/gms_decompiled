package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LocationHistorianBatchData extends sip {

    /* renamed from: a */
    private static final TreeMap f151680a;

    static {
        TreeMap treeMap = new TreeMap();
        f151680a = treeMap;
        treeMap.put("data", FastJsonResponse$Field.m22665f("data"));
        f151680a.put("timeZone", FastJsonResponse$Field.m22665f("timeZone"));
        f151680a.put("version", FastJsonResponse$Field.m22650a("version"));
    }

    public LocationHistorianBatchData() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151680a;
    }

    /* renamed from: b */
    public final String mo71687b() {
        return (String) this.f44540b.get("data");
    }

    /* renamed from: c */
    public final String mo71688c() {
        return (String) this.f44540b.get("timeZone");
    }

    /* renamed from: d */
    public final Integer mo71689d() {
        return (Integer) this.f44540b.get("version");
    }

    public LocationHistorianBatchData(String str, String str2, Integer num) {
        if (str != null) {
            mo25604a("data", str);
        }
        if (str2 != null) {
            mo25604a("timeZone", str2);
        }
        mo25602a("version", num.intValue());
    }
}
