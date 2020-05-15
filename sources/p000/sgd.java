package p000;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.io.File;
import java.util.Random;

/* renamed from: sgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sgd {

    /* renamed from: a */
    public static final /* synthetic */ int f44162a = 0;

    /* renamed from: b */
    private static final bdpp f44163b;

    static {
        bdpm e = bdpp.m91246e();
        e.mo58275a(false);
        f44163b = e.mo58272a();
    }

    /* renamed from: a */
    public static SharedPreferences m35193a(Context context) {
        aytw.m84814b();
        return aytw.m84816c(context).getSharedPreferences("primes", 4);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sqo.a(android.content.Context, boolean):boolean
     arg types: [android.content.Context, int]
     candidates:
      sqo.a(android.content.Context, rjx):boolean
      sqo.a(android.content.Context, boolean):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        if (r13.nextInt(r11) != 0) goto L_0x00a6;
     */
    /* renamed from: a */
    static bdhj m35194a(boolean z, Context context, boolean z2, Random random) {
        String str;
        String str2;
        bdhj bdhj = new bdhj(null);
        bdmc m = bdmd.m91075m();
        m.mo58178a(false);
        bdhj.f105650a = m.mo58176a();
        if (!cdmr.m134059b() || (!z2 && !sqo.m35986a(context, true))) {
            return bdhj;
        }
        int Q = (int) cdoz.f181455a.mo6606a().mo78104Q();
        if (cdmr.f181248a.mo6606a().mo77907g()) {
            if (!z2 && Q > 1) {
                random.nextLong();
            }
            bdpm e = bdpp.m91246e();
            e.mo58275a(true);
            e.mo58273a((int) cdmr.f181248a.mo6606a().mo77918r());
            e.mo58276b(false);
            if (z2) {
                e.mo58274a(new bdpo());
            } else {
                e.mo58274a(new aabe(Math.min(0.1f, (float) cdmr.f181248a.mo6606a().mo77919s()), new aaaw(random, cdmr.f181248a.mo6606a().mo77917q()), Q));
            }
            bmxv c = bmxv.m108567c(e.mo58272a());
            if (c != null) {
                bdhj.f105654e = c;
            } else {
                throw new NullPointerException("Null tikTokTraceConfigurations");
            }
        }
        bdoi bdoi = new bdoi(null);
        bdoi.mo58235a(false);
        bdoi.mo58236b(false);
        bdoi.f106138c = bmvz.f131120a;
        bdoi.mo58235a(cdmr.m134060c());
        bdoi.mo58236b(true);
        String str3 = " enabled";
        String str4 = bdoi.f106136a == null ? str3 : "";
        if (bdoi.f106137b == null) {
            str4 = str4.concat(" manualCapture");
        }
        if (!str4.isEmpty()) {
            String valueOf = String.valueOf(str4);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        bmxv c2 = bmxv.m108567c(new bdoe(bdoi.f106136a.booleanValue(), bdoi.f106137b.booleanValue(), bdoi.f106138c));
        if (c2 != null) {
            bdhj.f105653d = c2;
            bdpa bdpa = new bdpa(null);
            bdpa.mo58259a(false);
            bdpa.mo58258a(10);
            bdpa.mo58257a(1.0f);
            bdpa.f106186d = bmvz.f131120a;
            bdpa.mo58259a(cdmr.f181248a.mo6606a().mo77906f());
            bdpa.mo58258a((int) cdmr.f181248a.mo6606a().mo77916p());
            bdpa.mo58257a((float) cdmr.f181248a.mo6606a().mo77915o());
            if (bdpa.f106183a == null) {
                str = str3;
            } else {
                str = "";
            }
            if (bdpa.f106184b == null) {
                str = str.concat(" probabilitySampler");
            }
            if (bdpa.f106185c == null) {
                str = String.valueOf(str).concat(" sampleRatePerSecond");
            }
            if (!str.isEmpty()) {
                String valueOf2 = String.valueOf(str);
                throw new IllegalStateException(valueOf2.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf2));
            }
            bdov bdov = new bdov(bdpa.f106183a.booleanValue(), bdpa.f106184b, bdpa.f106185c.intValue(), bdpa.f106186d);
            bmxy.m108601b(bdov.f106169a >= 0, "Samples rate per second shall be >= 0");
            bmxv c3 = bmxv.m108567c(bdov);
            if (c3 != null) {
                bdhj.f105651b = c3;
                if (z) {
                    String a = ssy.m36271a();
                    asig b = cdki.f181114a.mo6606a().mo77796b();
                    asif a2 = cdki.f181114a.mo6606a().mo77795a();
                    bxwc bxwc = b.f89016a;
                    int size = bxwc.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        asif asif = (asif) bxwc.get(i);
                        i++;
                        if (asif.f89007a.equals(a)) {
                            a2 = asif;
                            break;
                        }
                    }
                    bdmc m2 = bdmd.m91075m();
                    m2.mo58178a(cdmr.f181248a.mo6606a().mo77902b());
                    m2.mo58177a((int) cdmr.f181248a.mo6606a().mo77910j());
                    bdhj.f105650a = m2.mo58176a();
                    bdnb bdnb = new bdnb(null);
                    bdnb.mo58200a(false);
                    bdnb.f106027c = false;
                    bdnb.f106026b = 50;
                    bdnb.f106028d = bmvz.f131120a;
                    bdnb.mo58200a(cdmr.f181248a.mo6606a().mo77903c());
                    if (bdnb.f106025a == null) {
                        str2 = str3;
                    } else {
                        str2 = "";
                    }
                    if (bdnb.f106026b == null) {
                        str2 = str2.concat(" batchSize");
                    }
                    if (bdnb.f106027c == null) {
                        str2 = String.valueOf(str2).concat(" enableUrlAutoSanitization");
                    }
                    if (!str2.isEmpty()) {
                        String valueOf3 = String.valueOf(str2);
                        throw new IllegalStateException(valueOf3.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf3));
                    }
                    bdmz bdmz = new bdmz(bdnb.f106025a.booleanValue(), bdnb.f106026b.intValue(), bdnb.f106027c.booleanValue(), bdnb.f106028d);
                    bmxy.m108589a(true, (Object) "only one of auto url auto sanitization and custom url sanitizer can be enabled.");
                    bmxv c4 = bmxv.m108567c(bdmz);
                    if (c4 != null) {
                        bdhj.f105652c = c4;
                        bdhs bdhs = new bdhs();
                        bdkl bdkl = new bdkl();
                        bdkl.mo58117a(2097152);
                        bdkl.mo58118b(30000);
                        bdkl.mo58119c(5000);
                        bdkl.mo58120d(1000);
                        bdkl.mo58116a(5.0d);
                        bdkl.f105811a = Boolean.valueOf(cdmr.f181248a.mo6606a().mo77905e());
                        bdkl.mo58117a(a2.f89011e);
                        bdkl.mo58118b(a2.f89008b);
                        bdkl.mo58119c(a2.f89012f);
                        bdkl.mo58120d(a2.f89009c);
                        bdkl.mo58116a((double) a2.f89010d);
                        if (bdkl.f105811a != null) {
                            str3 = "";
                        }
                        if (bdkl.f105812b == null) {
                            str3 = str3.concat(" maxBufferSizeBytes");
                        }
                        if (bdkl.f105813c == null) {
                            str3 = String.valueOf(str3).concat(" sampleDurationMs");
                        }
                        if (bdkl.f105814d == null) {
                            str3 = String.valueOf(str3).concat(" sampleDurationSkewMs");
                        }
                        if (bdkl.f105815e == null) {
                            str3 = String.valueOf(str3).concat(" sampleFrequencyMicro");
                        }
                        if (bdkl.f105816f == null) {
                            str3 = String.valueOf(str3).concat(" samplesPerEpoch");
                        }
                        if (!str3.isEmpty()) {
                            String valueOf4 = String.valueOf(str3);
                            throw new IllegalStateException(valueOf4.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf4));
                        }
                        bdhs.f105671a = bmxv.m108567c(new bdkk(bdkl.f105811a.booleanValue(), bdkl.f105812b.intValue(), bdkl.f105813c.intValue(), bdkl.f105814d.intValue(), bdkl.f105815e.intValue(), bdkl.f105816f.doubleValue()));
                        bmxv c5 = bmxv.m108567c(new bdht(bdhs.f105671a, bdhs.f105672b));
                        if (c5 != null) {
                            bdhj.f105655f = c5;
                        } else {
                            throw new NullPointerException("Null experimentalConfigurations");
                        }
                    } else {
                        throw new NullPointerException("Null networkConfigurations");
                    }
                }
                return bdhj;
            }
            throw new NullPointerException("Null timerConfigurations");
        }
        throw new NullPointerException("Null storageConfigurations");
    }

    /* renamed from: a */
    private static bdic m35195a() {
        bdib i = bdic.m90842i();
        i.f105682a = snp.m35703a(2, 10);
        return i.mo58064a();
    }

    /* renamed from: a */
    public static bdqj m35196a(Context context, boolean z) {
        if (!z) {
            int i = aytg.f98445a;
            return new bdqq(context, new sgf((int) cdmr.f181248a.mo6606a().mo77913m(), (int) cdmr.f181248a.mo6606a().mo77912l(), (int) cdmr.f181248a.mo6606a().mo77914n()), (int) cdmr.f181248a.mo6606a().mo77909i(), new sgb(context));
        }
        String valueOf = String.valueOf(Environment.getExternalStorageDirectory());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append(valueOf);
        sb.append("/googletest/test_outputfiles/");
        return new bdqs(new File(sb.toString(), "GMSCORE_ANDROID_PRIMES"));
    }

    /* renamed from: a */
    public static void m35197a(Application application) {
        boolean z = false;
        if (m35200a(Build.HARDWARE, Build.TYPE) && cdmr.m134061d()) {
            z = true;
        }
        bdhj a = m35194a(true, application, z, new Random());
        a.mo58041a(new sfv(application, z));
        bdhk a2 = a.mo58040a();
        if (m35199a(a2)) {
            bdhi a3 = bdhe.m90802a(application);
            a3.mo58039a(new sfw(a2));
            a3.mo58037a(m35195a());
            a3.mo58038a(new sfx(application));
            bdgs.m90765a(a3.mo58036a());
            bdfg bdfg = (bdfg) a2;
            if (bdfg.f105441a.mo58161a()) {
                bdgs.m90764a().f105605a.mo58002c();
                sns sns = new sns("PrimesHelper", 10);
                sns.start();
                new sgc(sns).sendEmptyMessageDelayed(1, cdmr.f181248a.mo6606a().mo77911k());
            }
            aacl.m21090a((bdpp) bdfg.f105445e.mo66812a(f44163b), z);
            return;
        }
        aacl.m21090a(f44163b, z);
    }

    /* renamed from: a */
    public static void m35198a(BaseApplicationContext baseApplicationContext) {
        boolean z;
        if (!m35200a(Build.HARDWARE, Build.TYPE) || !cdmr.m134061d()) {
            z = false;
        } else {
            z = true;
        }
        bdhj a = m35194a(false, baseApplicationContext, z, new Random());
        a.mo58041a(new sfy(baseApplicationContext, z));
        bdhk a2 = a.mo58040a();
        if (m35199a(a2)) {
            Context baseContext = baseApplicationContext.getBaseContext();
            if (baseContext instanceof Application) {
                bdhi a3 = bdhe.m90802a((Application) baseContext);
                a3.mo58039a(new sfz(a2));
                a3.mo58037a(m35195a());
                a3.mo58038a(new sga(baseContext));
                bdgs.m90765a(a3.mo58036a());
            } else {
                Log.e("PrimesHelper", "The base Context of BaseApplicationContext should be an Application.");
            }
            aacl.m21090a((bdpp) ((bdfg) a2).f105445e.mo66812a(f44163b), z);
            return;
        }
        aacl.m21090a(f44163b, z);
    }

    /* renamed from: a */
    static boolean m35199a(bdhk bdhk) {
        bdfg bdfg = (bdfg) bdhk;
        return (bdfg.f105444d.mo66813a() && ((bdoj) bdfg.f105444d.mo66814b()).mo58226a()) || (bdfg.f105442b.mo66813a() && ((bdpb) bdfg.f105442b.mo66814b()).mo58248a()) || ((bdfg.f105445e.mo66813a() && ((bdpp) bdfg.f105445e.mo66814b()).mo58264a()) || bdfg.f105441a.mo58161a() || (bdfg.f105443c.mo66813a() && ((bdnc) bdfg.f105443c.mo66814b()).mo58192a()));
    }

    /* renamed from: a */
    static boolean m35200a(String str, String str2) {
        if (str.equals("goldfish") || str.equals("ranchu")) {
            return str2.equals("eng") || str2.equals("userdebug");
        }
        return false;
    }
}
