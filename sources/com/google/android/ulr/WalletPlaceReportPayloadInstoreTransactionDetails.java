package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WalletPlaceReportPayloadInstoreTransactionDetails extends sip {

    /* renamed from: a */
    private static final TreeMap f151703a;

    static {
        TreeMap treeMap = new TreeMap();
        f151703a = treeMap;
        treeMap.put("timestampMillis", FastJsonResponse$Field.m22655b("timestampMillis"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151703a;
    }

    /* renamed from: b */
    public final Long mo71727b() {
        return (Long) this.f44540b.get("timestampMillis");
    }
}
