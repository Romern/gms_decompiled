package com.google.android.gms.ads.internal.p012js;

import com.google.android.gms.ads.internal.util.client.C0633h;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.js.h */
public final /* synthetic */ class C0490h {
    /* renamed from: a */
    public static void m5473a(C0491i iVar, String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        iVar.mo6661d(sb.toString());
    }

    /* renamed from: b */
    public static void m5475b(C0491i iVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        C0633h.m5664a(valueOf.length() == 0 ? new String("Dispatching AFMA event: ") : "Dispatching AFMA event: ".concat(valueOf));
        iVar.mo6661d(sb.toString());
    }

    /* renamed from: a */
    public static void m5474a(C0491i iVar, String str, JSONObject jSONObject) {
        iVar.mo6659a(str, jSONObject.toString());
    }
}
