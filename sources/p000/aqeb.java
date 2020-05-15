package p000;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: aqeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqeb {

    /* renamed from: a */
    private final Context f85840a;

    /* renamed from: b */
    private final aqfv f85841b;

    /* renamed from: c */
    private final aqea f85842c;

    /* renamed from: d */
    private final aqfw f85843d;

    /* renamed from: e */
    private final boolean f85844e;

    public aqeb(Context context, aqfv aqfv, aqea aqea, aqfw aqfw, boolean z) {
        this.f85840a = context;
        this.f85841b = aqfv;
        this.f85842c = aqea;
        this.f85843d = aqfw;
        this.f85844e = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnmu.a(java.lang.Object, java.lang.Iterable):void
     arg types: [bxtx, java.util.List]
     candidates:
      bndu.a(int, int):bndu
      bnci.a(java.lang.Object, java.util.Collection):java.util.Collection
      bndd.a(bndd, int):void
      bndd.a(java.lang.Object, java.util.Collection):java.util.Collection
      bndd.a(java.lang.Object, java.lang.Object):boolean
      bndl.a(java.lang.Object, java.lang.Object):boolean
      bnmu.a(java.lang.Object, java.lang.Object):boolean
      bnmu.a(java.lang.Object, java.lang.Object):boolean
      bnmu.a(java.lang.Object, java.lang.Iterable):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47767a(long j) {
        byte[] a;
        int i = Build.VERSION.SDK_INT;
        if (this.f85844e || new SecureRandom().nextInt(1000) < 50) {
            long j2 = this.f85843d.f86016a.getLong("snet_app_ops_last_timestamp", -1);
            if (j2 == -1) {
                j2 = 0;
            }
            bnkd a2 = this.f85842c.mo47766a(j2);
            Set<String> o = a2.mo67316o();
            HashMap hashMap = new HashMap();
            for (String str : o) {
                File a3 = aqfy.m71553a(str, this.f85840a);
                if (!(a3 == null || (a = aqfy.m71560a(a3)) == null)) {
                    hashMap.put(str, bxtx.m123261a(a));
                }
            }
            bndu r = bndu.m109109r();
            for (String str2 : a2.mo67316o()) {
                bxtx bxtx = (bxtx) hashMap.get(str2);
                if (bxtx != null) {
                    r.mo67308a((Object) bxtx, (Iterable) a2.mo67124a(str2));
                }
            }
            aqfv aqfv = this.f85841b;
            aqfv.mo47843a();
            if (!r.mo67314m()) {
                for (bxtx bxtx2 : r.mo67316o()) {
                    List<aqdz> a4 = r.mo67124a(bxtx2);
                    bxvd a5 = aqfv.mo47842a(bxtx2);
                    for (aqdz aqdz : a4) {
                        bxvd da = apzh.f85246g.mo74144da();
                        int intValue = aqdz.f85831a.intValue();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        apzh apzh = (apzh) da.f164949b;
                        apzh.f85248a |= 1;
                        apzh.f85249b = intValue;
                        if (aqdz.f85832b > 0) {
                            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(aqdz.f85832b);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            apzh apzh2 = (apzh) da.f164949b;
                            apzh2.f85248a |= 2;
                            apzh2.f85250c = seconds;
                        }
                        if (aqdz.f85833c > 0) {
                            int seconds2 = (int) TimeUnit.MILLISECONDS.toSeconds(aqdz.f85833c);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            apzh apzh3 = (apzh) da.f164949b;
                            apzh3.f85248a |= 16;
                            apzh3.f85253f = seconds2;
                        }
                        if (aqdz.f85834d > 0) {
                            int seconds3 = (int) TimeUnit.MILLISECONDS.toSeconds(aqdz.f85834d);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            apzh apzh4 = (apzh) da.f164949b;
                            apzh4.f85248a |= 4;
                            apzh4.f85251d = seconds3;
                        }
                        long j3 = aqdz.f85835e;
                        if (j3 > 0) {
                            int min = (int) Math.min(2147483647L, j3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            apzh apzh5 = (apzh) da.f164949b;
                            apzh5.f85248a |= 8;
                            apzh5.f85252e = min;
                        }
                        apzh apzh6 = (apzh) da.mo74062i();
                        if (a5.f164950c) {
                            a5.mo74035c();
                            a5.f164950c = false;
                        }
                        apze apze = (apze) a5.f164949b;
                        apze apze2 = apze.f85221e;
                        apzh6.getClass();
                        if (!apze.f85225c.mo73666a()) {
                            apze.f85225c = bxvk.m124021a(apze.f85225c);
                        }
                        apze.f85225c.add(apzh6);
                    }
                }
            }
            this.f85843d.mo47851a("snet_app_ops_last_timestamp", j);
            return;
        }
        cgkr.m145927c();
    }
}
