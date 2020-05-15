package com.google.android.gms.ads.internal.p012js.function;

import com.google.android.gms.ads.internal.p012js.C0459ao;
import com.google.android.gms.ads.internal.util.future.C0648g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.js.function.o */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0487o {

    /* renamed from: a */
    final /* synthetic */ C0488p f8478a;

    /* renamed from: b */
    private final C0459ao f8479b;

    /* renamed from: c */
    private final C0648g f8480c;

    public C0487o(C0488p pVar, C0459ao aoVar, C0648g gVar) {
        this.f8478a = pVar;
        this.f8479b = aoVar;
        this.f8480c = gVar;
    }

    /* renamed from: a */
    public final void mo6673a(String str) {
        C0459ao aoVar;
        if (str != null) {
            try {
                this.f8480c.mo6831a((Throwable) new C0473a(str));
            } catch (IllegalStateException e) {
                aoVar = this.f8479b;
            } catch (Throwable th) {
                this.f8479b.mo6650a();
                throw th;
            }
        } else {
            this.f8480c.mo6831a((Throwable) new C0473a());
        }
        aoVar = this.f8479b;
        aoVar.mo6650a();
    }

    /* renamed from: a */
    public final void mo6674a(JSONObject jSONObject) {
        C0459ao aoVar;
        try {
            this.f8480c.mo6830a(this.f8478a.f8481a.mo6420a(jSONObject));
            aoVar = this.f8479b;
        } catch (IllegalStateException e) {
            aoVar = this.f8479b;
        } catch (JSONException e2) {
            this.f8480c.mo6831a((Throwable) e2);
            aoVar = this.f8479b;
        } catch (Throwable th) {
            this.f8479b.mo6650a();
            throw th;
        }
        aoVar.mo6650a();
    }
}
