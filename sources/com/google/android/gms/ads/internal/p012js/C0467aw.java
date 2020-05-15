package com.google.android.gms.ads.internal.p012js;

import com.google.android.gms.ads.internal.gmsg.C0426e;
import java.util.AbstractMap;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.js.aw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0467aw implements C0491i, C0466av {

    /* renamed from: a */
    public final C0466av f8451a;

    /* renamed from: b */
    public final HashSet f8452b = new HashSet();

    public C0467aw(C0466av avVar) {
        this.f8451a = avVar;
    }

    /* renamed from: a */
    public final void mo6657a(String str, C0426e eVar) {
        throw null;
    }

    /* renamed from: a */
    public final void mo6659a(String str, String str2) {
        C0490h.m5473a(this, str, str2);
    }

    /* renamed from: a */
    public final void mo6641a(String str, JSONObject jSONObject) {
        throw null;
    }

    /* renamed from: b */
    public final void mo6658b(String str, C0426e eVar) {
        this.f8451a.mo6658b(str, eVar);
        this.f8452b.remove(new AbstractMap.SimpleEntry(str, eVar));
    }

    /* renamed from: b */
    public final void mo6660b(String str, JSONObject jSONObject) {
        C0490h.m5474a(this, str, jSONObject);
    }

    /* renamed from: d */
    public final void mo6661d(String str) {
        this.f8451a.mo6661d(str);
    }
}
