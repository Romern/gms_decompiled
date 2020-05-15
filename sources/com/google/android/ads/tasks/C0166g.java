package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.C0152c;
import com.google.android.gms.ads.identifier.C0271c;
import com.google.android.gms.ads.identifier.C0272d;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;

/* renamed from: com.google.android.ads.tasks.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0166g extends C0181v {
    public C0166g(dca dca, String str, String str2, bxvd bxvd, int i) {
        super(dca, str, str2, bxvd, i, 24);
    }

    /* renamed from: c */
    private final void m4830c() {
        C0272d a = this.f7592a.mo8503a();
        if (a != null) {
            try {
                C0271c c = a.mo6490c();
                String a2 = dcc.m8144a(c.f7985a);
                if (a2 != null) {
                    synchronized (this.f7598g) {
                        bxvd bxvd = this.f7598g;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        C0152c cVar = (C0152c) bxvd.f164949b;
                        C0152c cVar2 = C0152c.f7500Q;
                        a2.getClass();
                        cVar.f7520c |= 128;
                        cVar.f7513L = a2;
                        bxvd bxvd2 = this.f7598g;
                        boolean z = c.f7986b;
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        C0152c cVar3 = (C0152c) bxvd2.f164949b;
                        cVar3.f7520c |= 512;
                        cVar3.f7515N = z;
                        bxvd bxvd3 = this.f7598g;
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        C0152c cVar4 = (C0152c) bxvd3.f164949b;
                        cVar4.f7514M = 5;
                        cVar4.f7520c |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                }
            } catch (IOException e) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5035a() {
        if (!this.f7592a.f12777m) {
            synchronized (this.f7598g) {
                bxvd bxvd = this.f7598g;
                String str = (String) this.f7595d.invoke(null, this.f7592a.f12765a);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                C0152c cVar = (C0152c) bxvd.f164949b;
                C0152c cVar2 = C0152c.f7500Q;
                str.getClass();
                cVar.f7520c |= 128;
                cVar.f7513L = str;
            }
            return;
        }
        m4830c();
    }

    /* renamed from: b */
    public final Void mo5036b() {
        dca dca = this.f7592a;
        if (dca.f12779o) {
            return super.call();
        }
        if (!dca.f12777m) {
            return null;
        }
        m4830c();
        return null;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return call();
    }
}
