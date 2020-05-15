package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApiPlaceReportPayload extends sip {

    /* renamed from: a */
    private static final TreeMap f151623a;

    /* renamed from: c */
    private final HashMap f151624c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151623a = treeMap;
        treeMap.put("gmmPlaceReportPayload", FastJsonResponse$Field.m22654a("gmmPlaceReportPayload", GmmPlaceReportPayload.class));
        f151623a.put("walletPlaceReportPayload", FastJsonResponse$Field.m22654a("walletPlaceReportPayload", WalletPlaceReportPayload.class));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151623a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151624c.containsKey(str);
    }

    public GmmPlaceReportPayload getGmmPlaceReportPayload() {
        return (GmmPlaceReportPayload) this.f151624c.get("gmmPlaceReportPayload");
    }

    public WalletPlaceReportPayload getWalletPlaceReportPayload() {
        return (WalletPlaceReportPayload) this.f151624c.get("walletPlaceReportPayload");
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151624c.put(str, sio);
    }
}
