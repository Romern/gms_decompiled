package com.google.android.ads.tasks;

import android.content.Context;
import com.google.ads.afma.proto2api.C0152c;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.ads.tasks.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0162c extends C0181v {

    /* renamed from: h */
    private static final C0182w f7572h = new C0182w();

    /* renamed from: i */
    private final Context f7573i;

    public C0162c(dca dca, String str, String str2, bxvd bxvd, int i, Context context) {
        super(dca, str, str2, bxvd, i, 27);
        this.f7573i = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5035a() {
        dac dac;
        int i;
        boolean z;
        Boolean bool;
        AtomicReference a = f7572h.mo5040a(this.f7573i.getPackageName());
        synchronized (a) {
            dac dac2 = (dac) a.get();
            if (dac2 == null || dcc.m8147b(dac2.f12491a) || dac2.f12491a.equals("E") || dac2.f12491a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                String str = null;
                if (dcc.m8147b(null)) {
                    if (!dcc.m8147b(null)) {
                        bool = false;
                    } else {
                        bool = false;
                    }
                    if (!bool.booleanValue() || !this.f7592a.f12778n) {
                        i = 3;
                    } else {
                        i = 4;
                    }
                } else {
                    i = 5;
                }
                Method method = this.f7595d;
                Object[] objArr = new Object[3];
                objArr[0] = this.f7573i;
                if (i == 3) {
                    z = true;
                } else {
                    z = false;
                }
                objArr[1] = Boolean.valueOf(z);
                objArr[2] = C0371o.f8202P.mo6604a();
                dac dac3 = new dac((String) method.invoke(null, objArr));
                if (dcc.m8147b(dac3.f12491a) || dac3.f12491a.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        try {
                            Future future = this.f7592a.f12775k;
                            if (future != null) {
                                future.get();
                            }
                            C0152c cVar = this.f7592a.f12774j;
                            if (!(cVar == null || (cVar.f7518a & 4194304) == 0)) {
                                str = cVar.f7532o;
                            }
                        } catch (InterruptedException | ExecutionException e) {
                        }
                        if (!dcc.m8147b(str)) {
                            dac3.f12491a = str;
                        }
                        a.set(dac3);
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                a.set(dac3);
            }
            dac = (dac) a.get();
        }
        synchronized (this.f7598g) {
            if (dac != null) {
                bxvd bxvd = this.f7598g;
                String str2 = dac.f12491a;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                C0152c cVar2 = (C0152c) bxvd.f164949b;
                C0152c cVar3 = C0152c.f7500Q;
                str2.getClass();
                cVar2.f7518a = 4194304 | cVar2.f7518a;
                cVar2.f7532o = str2;
                bxvd bxvd2 = this.f7598g;
                long j = dac.f12492b;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                C0152c cVar4 = (C0152c) bxvd2.f164949b;
                cVar4.f7518a |= 536870912;
                cVar4.f7538u = j;
                bxvd bxvd3 = this.f7598g;
                String str3 = dac.f12493c;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                C0152c cVar5 = (C0152c) bxvd3.f164949b;
                str3.getClass();
                cVar5.f7518a |= 268435456;
                cVar5.f7537t = str3;
                bxvd bxvd4 = this.f7598g;
                String str4 = dac.f12494d;
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                C0152c cVar6 = (C0152c) bxvd4.f164949b;
                str4.getClass();
                cVar6.f7519b |= 128;
                cVar6.f7540w = str4;
                bxvd bxvd5 = this.f7598g;
                String str5 = dac.f12495e;
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                C0152c cVar7 = (C0152c) bxvd5.f164949b;
                str5.getClass();
                cVar7.f7519b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                cVar7.f7541x = str5;
            }
        }
    }
}
