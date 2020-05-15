package com.google.android.gms.ads.internal.p012js.function;

import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.gmsg.C0425d;
import com.google.android.gms.ads.internal.gmsg.C0427f;
import com.google.android.gms.ads.internal.p012js.C0459ao;
import com.google.android.gms.ads.internal.p012js.C0466av;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.future.C0648g;
import com.google.android.gms.ads.internal.util.promise.C0662c;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.js.function.m */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0485m implements C0662c {

    /* renamed from: a */
    final /* synthetic */ C0459ao f8472a;

    /* renamed from: b */
    final /* synthetic */ Object f8473b;

    /* renamed from: c */
    final /* synthetic */ C0648g f8474c;

    /* renamed from: d */
    final /* synthetic */ C0488p f8475d;

    public C0485m(C0488p pVar, C0459ao aoVar, Object obj, C0648g gVar) {
        this.f8475d = pVar;
        this.f8472a = aoVar;
        this.f8473b = obj;
        this.f8474c = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6648a(Object obj) {
        C0466av avVar = (C0466av) obj;
        C0488p pVar = this.f8475d;
        C0459ao aoVar = this.f8472a;
        Object obj2 = this.f8473b;
        C0648g gVar = this.f8474c;
        try {
            C0387d.m5363a();
            String uuid = UUID.randomUUID().toString();
            C0427f fVar = C0425d.f8381b;
            C0487o oVar = new C0487o(pVar, aoVar, gVar);
            synchronized (fVar.f8382a) {
                fVar.f8383b.put(uuid, oVar);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", pVar.f8482b.mo6421a(obj2));
            avVar.mo6660b(pVar.f8483c, jSONObject);
        } catch (Exception e) {
            try {
                gVar.mo6831a((Throwable) e);
                C0633h.m5669b("Unable to invokeJavascript", e);
            } finally {
                aoVar.mo6650a();
            }
        }
    }
}
