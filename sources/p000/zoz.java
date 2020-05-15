package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: zoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zoz {

    /* renamed from: a */
    private static final srn f55644a = zvt.m46581a();

    /* renamed from: b */
    private static final Map f55645b = new C1223np();

    /* renamed from: a */
    private static int m45924a(Context context, String str, String str2, cadt cadt, zow zow, zsr zsr) {
        yzs a = yzq.m45107a(context);
        sqv a2 = a.mo30869a();
        zre c = a.mo30877c(str);
        a.mo30880e(str);
        new zuo(zuw.m46538d(context, str), a2);
        try {
            zuu a3 = zow.mo31302a(str, str2);
            if (a3.mo30709b() == 1) {
                zsr.mo31465d(2);
            } else if (a3.mo30709b() == 2) {
                zsr.mo31465d(3);
            } else {
                zsr.mo31465d(1);
            }
            a.mo30872a(str).mo31406b();
            a.mo30873a(context, str, a3).mo31533a(zsr, cadt);
        } catch (zuv e) {
            bnsl bnsl = (bnsl) f55644a.mo68390d();
            bnsl.mo68432a("zoz", "a", 440, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("SyncService. User [%s] requested delete history", str);
            c.mo31379g();
        } catch (zox e2) {
            bnsl bnsl2 = (bnsl) f55644a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("zoz", "a", 444, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68424a("NoServerNodeException. Unable to sync %s to: %s", str, str2);
            m45928a(str, a2.mo20505a());
            return 15;
        } catch (yqh e3) {
            bnsl bnsl3 = (bnsl) f55644a.mo68387b();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("zoz", "a", 448, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68424a("SyncException. Unable to sync %s to: %s", str, str2);
            m45928a(str, a2.mo20505a());
            return 34;
        } catch (TimeoutException e4) {
            bnsl bnsl4 = (bnsl) f55644a.mo68387b();
            bnsl4.mo68437a(e4);
            bnsl4.mo68432a("zoz", "a", 451, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68424a("TimeoutException. Unable to sync %s to: %s", str, str2);
            m45928a(str, a2.mo20505a());
            return 6;
        } catch (IOException e5) {
            bnsl bnsl5 = (bnsl) f55644a.mo68387b();
            bnsl5.mo68437a(e5);
            bnsl5.mo68432a("zoz", "a", 455, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68424a("IOException. Unable to sync %s to: %s", str, str2);
            m45928a(str, a2.mo20505a());
            return 10;
        } catch (InterruptedException e6) {
            bnsl bnsl6 = (bnsl) f55644a.mo68387b();
            bnsl6.mo68437a(e6);
            bnsl6.mo68432a("zoz", "a", 458, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68424a("InterruptedException. Unable to sync %s to: %s", str, str2);
            m45928a(str, a2.mo20505a());
            return 8;
        } catch (Throwable th) {
            m45928a(str, a2.mo20505a());
            throw th;
        }
        m45928a(str, a2.mo20505a());
        return 2;
    }

    /* renamed from: a */
    private static long m45925a(Context context, String str) {
        if (cdyu.m135391i()) {
            return zuw.m46534a(context, str);
        }
        return ((Long) zvs.m46580a(f55645b, str, 0L)).longValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x031a  */
    /* renamed from: a */
    public static zoy m45926a(Context context, String str, zow zow, cadu cadu) {
        bpgz bpgz;
        zoy zoy;
        Pair pair;
        int i;
        Context context2 = context;
        String str2 = str;
        cadu cadu2 = cadu;
        if ("none".equals(str2)) {
            return zoy.IGNORED;
        }
        yzs a = yzq.m45107a(context);
        long b = a.mo30869a().mo20506b();
        long a2 = a.mo30869a().mo20505a();
        long a3 = m45925a(context, str);
        if (a3 > 0) {
            bxvd da = bpgz.f137612c.mo74144da();
            long j = a2 - a3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpgz bpgz2 = (bpgz) da.f164949b;
            bpgz2.f137614a |= 1;
            bpgz2.f137615b = j;
            bpgz = (bpgz) da.mo74062i();
        } else {
            bpgz = bpgz.f137612c;
        }
        cadu cadu3 = cadu.PERIODIC;
        ytq a4 = a.mo30887i().mo30767a(context2);
        a4.mo30755a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE);
        a4.mo30756a(0L);
        a4.mo30762a(str2);
        a4.mo30765d(2);
        a4.mo30761a(bpgz);
        a4.mo30763b(cadu2 != cadu3 ? 1 : 0);
        a4.mo30764c(cadu2.f172744k);
        a4.mo30754a();
        zvj.f55993b++;
        try {
            Pair a5 = zow.mo31301a();
            yzs a6 = yzq.m45107a(context);
            sqv a7 = a6.mo30869a();
            zre c = a6.mo30877c(str2);
            zrk e = a6.mo30880e(str2);
            ytp i2 = a6.mo30887i();
            if (a5 != null) {
                ytp ytp = i2;
                zre zre = c;
                zrk zrk = e;
                Pair pair2 = a5;
                if (!yud.m44848a(context, a2, yvq.m44911d(context), zre)) {
                    if (!cadu.PERIODIC.equals(cadu2)) {
                        SharedPreferences a8 = zvi.m46559a(context, str);
                        zvi.m46560a(a8, a2);
                        int i3 = a8.getInt(cadu.name(), 0);
                        cadu.name();
                        yvq.m44914g(context);
                        if (i3 < Integer.MAX_VALUE) {
                            SharedPreferences a9 = zvi.m46559a(context, str);
                            zvi.m46560a(a9, a2);
                            a9.edit().putInt(cadu.name(), a9.getInt(cadu.name(), 0) + 1).apply();
                            pair = pair2;
                        } else {
                            ytq a10 = ytp.mo30767a(context2);
                            a10.mo30755a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED);
                            a10.mo30756a(a7.mo20506b() - b);
                            a10.mo30762a(str2);
                            a10.mo30765d(59);
                            a10.mo30763b(cadu2.f172744k);
                            a10.mo30764c(Integer.MAX_VALUE);
                            a10.mo30754a();
                            zvj.f56000i++;
                        }
                    } else if (zmc.m45740a(zre, zrk)) {
                        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(a2 - m45925a(context, str));
                        if (seconds <= yvq.m44909b(context)) {
                            ytq a11 = ytp.mo30767a(context2);
                            a11.mo30755a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED);
                            a11.mo30756a(a7.mo20506b() - b);
                            a11.mo30762a(str2);
                            a11.mo30765d(46);
                            a11.mo30763b(cadu2.f172744k);
                            a11.mo30764c(seconds);
                            a11.mo30754a();
                            zvj.f55998g++;
                        } else {
                            pair = pair2;
                            if (pair.second == cadt.CELL_CONNECTIVITY && seconds <= yvq.m44910c(context)) {
                                ytq a12 = ytp.mo30767a(context2);
                                a12.mo30755a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED);
                                a12.mo30756a(a7.mo20506b() - b);
                                a12.mo30762a(str2);
                                a12.mo30765d(47);
                                a12.mo30763b(cadu2.f172744k);
                                a12.mo30764c(seconds);
                                a12.mo30754a();
                                zvj.f55999h++;
                            }
                        }
                    } else {
                        ytq a13 = ytp.mo30767a(context2);
                        a13.mo30755a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED);
                        a13.mo30756a(a7.mo20506b() - b);
                        a13.mo30762a(str2);
                        a13.mo30765d(45);
                        a13.mo30763b(cadu2.f172744k);
                        a13.mo30754a();
                        zvj.f55997f++;
                    }
                    bmxy.m108581a(pair);
                    yzs a14 = yzq.m45107a(context);
                    sqv a15 = a14.mo30869a();
                    String str3 = (String) pair.first;
                    cadt cadt = (cadt) pair.second;
                    zvj.f56003l++;
                    if (cadt == cadt.BT_CONNECTIVITY) {
                        zvj.f56005n++;
                    } else if (cadt == cadt.WIFI_CONNECTIVITY) {
                        zvj.f56004m++;
                    } else if (cadt == cadt.CELL_CONNECTIVITY) {
                        zvj.f56006o++;
                    }
                    zsr zsr = new zsr(a2);
                    zsr.mo31456a(cadu2);
                    zsr.mo31455a(cadt);
                    zsr zsr2 = zsr;
                    int a16 = m45924a(context, str, str3, cadt, zow, zsr2);
                    if (a16 == 2) {
                        zuw.m46535a(context2, str2, a2);
                        zvj.f56007p++;
                    } else {
                        zvj.f56008q++;
                    }
                    long b2 = a15.mo20506b() - b;
                    zsr2.mo31463c(b2);
                    bpgw a17 = zsr2.mo31451a();
                    ytq a18 = a14.mo30887i().mo30767a(context2);
                    a18.mo30755a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED);
                    a18.mo30756a(b2);
                    a18.mo30762a(str2);
                    a18.mo30765d(a16);
                    a18.mo30763b(cadu2.f172744k);
                    a18.mo30760a(a17);
                    a18.mo30754a();
                    a14.mo30894l(str2).mo31468a(a17);
                    if (!yvq.m44913f(context)) {
                        i = a16;
                    } else if (!cdyu.m135388f()) {
                        yzs a19 = yzq.m45107a(context);
                        zdq zdq = new zdq(context2, str2, a19.mo30874b());
                        zrk e2 = a19.mo30880e(str2);
                        zeb f = a19.mo30881f(str2);
                        zqx j2 = a19.mo30890j(str2);
                        i = a16;
                        new zds(str, e2, f, j2, zdq).mo30962a();
                    } else {
                        i = a16;
                    }
                    if (i == 2) {
                        zoy = zoy.SUCCESS;
                    } else {
                        zoy = zoy.FAILURE;
                    }
                    long a20 = a.mo30869a().mo20505a();
                    zvj.f55994c++;
                    zvj.m46561a(a20 - a2);
                    zvj.f56001j = a20;
                    if (zoy.SUCCESS.equals(zoy)) {
                        zvj.f56002k = a20;
                    }
                    m45927a(context);
                    return zoy;
                }
                ytq a21 = ytp.mo30767a(context2);
                a21.mo30755a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED);
                a21.mo30756a(a7.mo20506b() - b);
                a21.mo30762a(str2);
                a21.mo30765d(57);
                a21.mo30763b(cadu2.f172744k);
                a21.mo30754a();
                zvj.f55996e++;
            } else {
                ytq a22 = i2.mo30767a(context2);
                a22.mo30755a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED);
                a22.mo30756a(a7.mo20506b() - b);
                a22.mo30762a(str2);
                a22.mo30765d(60);
                a22.mo30763b(cadu2.f172744k);
                a22.mo30754a();
                zvj.f55995d++;
            }
            zoy = zoy.SKIPPED;
            long a202 = a.mo30869a().mo20505a();
            zvj.f55994c++;
            zvj.m46561a(a202 - a2);
            zvj.f56001j = a202;
            if (zoy.SUCCESS.equals(zoy)) {
            }
            m45927a(context);
            return zoy;
        } catch (Throwable th) {
            long a23 = a.mo30869a().mo20505a();
            zvj.f55994c++;
            zvj.m46561a(a23 - a2);
            zvj.f56001j = a23;
            if (zoy.SUCCESS.equals(null)) {
                zvj.f56002k = a23;
            }
            m45927a(context);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m45927a(Context context) {
        if (yvq.m44913f(context) && cdyu.m135388f()) {
            zme.m45749a(context, "com.google.android.gms.fitness.service.recording.FitRecordingBroker");
        }
    }

    /* renamed from: a */
    private static void m45928a(String str, long j) {
        synchronized (f55645b) {
            f55645b.put(str, Long.valueOf(j));
        }
    }
}
