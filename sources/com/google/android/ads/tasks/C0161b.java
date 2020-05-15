package com.google.android.ads.tasks;

import android.content.Context;
import com.google.ads.afma.proto2api.C0152c;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.ads.tasks.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0161b extends C0181v {

    /* renamed from: h */
    private static final C0182w f7570h = new C0182w();

    /* renamed from: i */
    private final Context f7571i;

    public C0161b(dca dca, String str, String str2, bxvd bxvd, int i, Context context) {
        super(dca, str, str2, bxvd, i, 29);
        this.f7571i = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dab.a(byte[], boolean):java.lang.String
     arg types: [byte[], int]
     candidates:
      dab.a(java.lang.String, boolean):byte[]
      dab.a(byte[], boolean):java.lang.String */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5035a() {
        bxvd bxvd = this.f7598g;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        C0152c cVar = (C0152c) bxvd.f164949b;
        C0152c cVar2 = C0152c.f7500Q;
        "E".getClass();
        cVar.f7518a |= 16777216;
        cVar.f7533p = "E";
        AtomicReference a = f7570h.mo5040a(this.f7571i.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.f7595d.invoke(null, this.f7571i));
                }
            }
        }
        String str = (String) a.get();
        synchronized (this.f7598g) {
            bxvd bxvd2 = this.f7598g;
            String a2 = dab.m8076a(str.getBytes(), true);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            C0152c cVar3 = (C0152c) bxvd2.f164949b;
            a2.getClass();
            cVar3.f7518a |= 16777216;
            cVar3.f7533p = a2;
        }
    }
}
