package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiBatteryCondition extends sip {

    /* renamed from: a */
    private static final TreeMap f151597a;

    static {
        TreeMap treeMap = new TreeMap();
        f151597a = treeMap;
        treeMap.put("charging", FastJsonResponse$Field.m22665f("charging"));
        f151597a.put("level", FastJsonResponse$Field.m22650a("level"));
        f151597a.put("scale", FastJsonResponse$Field.m22650a("scale"));
        f151597a.put("voltage", FastJsonResponse$Field.m22650a("voltage"));
    }

    public ApiBatteryCondition() {
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151597a;
    }

    /* renamed from: b */
    public final String mo71491b() {
        return (String) this.f44540b.get("charging");
    }

    /* renamed from: c */
    public final Integer mo71492c() {
        return (Integer) this.f44540b.get("level");
    }

    /* renamed from: d */
    public final Integer mo71493d() {
        return (Integer) this.f44540b.get("scale");
    }

    /* renamed from: e */
    public final Integer mo71494e() {
        return (Integer) this.f44540b.get("voltage");
    }

    public ApiBatteryCondition(String str, Integer num, Integer num2, Integer num3) {
        if (str != null) {
            mo25604a("charging", str);
        }
        mo25602a("level", num.intValue());
        mo25602a("scale", num2.intValue());
        mo25602a("voltage", num3.intValue());
    }
}
