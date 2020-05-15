package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WalletPlaceReportPayload extends sip {

    /* renamed from: a */
    private static final TreeMap f151700a;

    /* renamed from: c */
    private final HashMap f151701c = new HashMap();

    /* renamed from: d */
    private final HashMap f151702d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        f151700a = treeMap;
        treeMap.put("eventId", FastJsonResponse$Field.m22654a("eventId", WalletUserEventId.class));
        f151700a.put("instoreTransactionDetails", FastJsonResponse$Field.m22654a("instoreTransactionDetails", WalletPlaceReportPayloadInstoreTransactionDetails.class));
        f151700a.put("placeLikelihoodBuffers", FastJsonResponse$Field.m22658b("placeLikelihoodBuffers", WalletPlaceReportPayloadPlaceIdLikelihood.class));
        f151700a.put("userEvent", FastJsonResponse$Field.m22665f("userEvent"));
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f151700a;
    }

    /* renamed from: b */
    public final String mo71723b() {
        return (String) this.f44540b.get("userEvent");
    }

    public WalletUserEventId getEventId() {
        return (WalletUserEventId) this.f151701c.get("eventId");
    }

    public WalletPlaceReportPayloadInstoreTransactionDetails getInstoreTransactionDetails() {
        return (WalletPlaceReportPayloadInstoreTransactionDetails) this.f151701c.get("instoreTransactionDetails");
    }

    public ArrayList getPlaceLikelihoodBuffers() {
        return (ArrayList) this.f151702d.get("placeLikelihoodBuffers");
    }

    /* renamed from: a */
    public final void mo25595a(String str, ArrayList arrayList) {
        this.f151702d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo25599b(String str) {
        return this.f151701c.containsKey(str);
    }

    /* renamed from: a */
    public final void mo25598a(String str, sio sio) {
        this.f151701c.put(str, sio);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25596a(String str) {
        return this.f151702d.containsKey(str);
    }
}
