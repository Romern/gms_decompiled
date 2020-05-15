package p000;

import android.os.StrictMode;
import android.text.TextUtils;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;

/* renamed from: ovn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ovn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f38486a;

    /* renamed from: b */
    final /* synthetic */ ovq f38487b;

    public ovn(ovq ovq, int i) {
        this.f38487b = ovq;
        this.f38486a = i;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [boolean], assign insn: PHI: (r1v12 ?) = (r1v20 ?), (r1v22 ?) binds: [B:54:0x0155, B:53:0x014d] */
    /* JADX WARN: Type inference failed for: r1v20, assign insn: 0x0155: CONST  (r1v20 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r1v22, assign insn: 0x014f: CONST  (r1v22 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pbp.a(com.google.android.gms.carsetup.CarInfoInternal, java.lang.String, boolean):com.google.android.gms.carsetup.CarInfoInternal
     arg types: [com.google.android.gms.carsetup.CarInfoInternal, java.lang.String, int]
     candidates:
      pbp.a(java.lang.String, java.lang.String, java.lang.String[]):com.google.android.gms.carsetup.CarInfoInternal
      pbp.a(java.lang.String, java.lang.String, java.lang.String):void
      pbp.a(com.google.android.gms.carsetup.CarInfoInternal, java.lang.String, boolean):com.google.android.gms.carsetup.CarInfoInternal */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0131  */
    public final void run() {
        bipi bipi;
        pbo pbo;
        boolean z;
        boolean z2;
        ? r1;
        int i;
        bpdu[] bpduArr;
        String str;
        Object obj;
        pbo pbo2;
        ors ors = this.f38487b.f38496f;
        int i2 = this.f38486a;
        CarSetupServiceImpl carSetupServiceImpl = ors.f38296a;
        if (!ors.f38297b) {
            if (npe.m27158a(npe.m27154a(ccui.f179964a.mo6606a().mo76832p()), carSetupServiceImpl.f29595l.f29539a)) {
                carSetupServiceImpl.mo17424h();
            } else {
                if (!carSetupServiceImpl.mo17425i()) {
                    carSetupServiceImpl.f29598o = new oyn(carSetupServiceImpl.f29597n);
                    carSetupServiceImpl.f29573L.mo22736a(carSetupServiceImpl.f29598o);
                }
                if (!carSetupServiceImpl.f29609z.mo22878d()) {
                    pbp d = carSetupServiceImpl.mo17420d();
                    StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        CarInfoInternal carInfoInternal = carSetupServiceImpl.f29595l;
                        CarInfoInternal a = d.mo22880a(carInfoInternal, "allowedcars", true);
                        if (a == null) {
                            a = d.mo22880a(carInfoInternal, "rejectedcars", true);
                        }
                        boolean b = d.mo22889b(carSetupServiceImpl.f29595l);
                        boolean a2 = d.mo22885a(carSetupServiceImpl.f29595l);
                        if (a != null) {
                            CarInfoInternal carInfoInternal2 = carSetupServiceImpl.f29595l;
                            carInfoInternal2.f29542d = a.f29542d;
                            carInfoInternal2.f29539a.f29335d = a.f29539a.f29335d;
                            carInfoInternal2.f29541c = a.f29541c;
                        }
                        if (b) {
                            pbo = pbo.REJECTED;
                        } else if (!a2) {
                            pbo = pbo.UNKNOWN;
                        } else {
                            pbo = pbo.ALLOWED;
                        }
                        bnsi d2 = CarSetupServiceImpl.f29560a.mo68390d();
                        d2.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 1471, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d2.mo68420a("Database authorization: %s", pbo);
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    }
                } else {
                    CarInfoInternal carInfoInternal3 = carSetupServiceImpl.f29595l;
                    if (!carInfoInternal3.f29553o) {
                        pbo2 = pbo.UNKNOWN;
                    } else if (carInfoInternal3.f29554p) {
                        pbo2 = pbo.ALLOWED;
                    } else {
                        pbo2 = pbo.REJECTED;
                    }
                    bnsi d3 = CarSetupServiceImpl.f29560a.mo68390d();
                    d3.mo68432a("com.google.android.gms.carsetup.CarSetupServiceImpl", "a", 1466, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d3.mo68420a("CarInfo authorization: %s", pbo);
                }
                oxe oxe = carSetupServiceImpl.f29573L;
                boolean z3 = carSetupServiceImpl.f29604u;
                int ordinal = pbo.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        z2 = true;
                        z = true;
                    } else if (ordinal != 2) {
                        z2 = false;
                        z = false;
                    } else {
                        z2 = true;
                    }
                    String str2 = "com.google.android.gms.car.AUTHORIZATION";
                    String str3 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                    String str4 = "com.google.android.gms.carsetup.CarSetupServiceImpl";
                    String str5 = "a";
                    carSetupServiceImpl.f29594k = new otw(carSetupServiceImpl.getApplicationContext(), carSetupServiceImpl.f29595l, carSetupServiceImpl.f29564C, i2, oxe, z3, z2, z, carSetupServiceImpl.f29562A, carSetupServiceImpl.f29592i);
                    if (!pbo.REJECTED.equals(pbo)) {
                        carSetupServiceImpl.f29598o = null;
                        carSetupServiceImpl.mo17424h();
                        carSetupServiceImpl.mo17421e();
                    } else {
                        if (!carSetupServiceImpl.f29609z.mo22878d()) {
                            int i3 = carSetupServiceImpl.f29564C.f36296c.getInt("car_connection_count", 0);
                            if (i3 > 30) {
                                carSetupServiceImpl.f29568G.mo22887b();
                                i3 = 0;
                            }
                            r1 = 1;
                            carSetupServiceImpl.f29564C.mo21381a(i3 + 1);
                        } else {
                            r1 = 1;
                        }
                        if (carSetupServiceImpl.f29590g == 0) {
                            carSetupServiceImpl.f29598o = null;
                            carSetupServiceImpl.f29595l.f29539a.f29335d = Long.toHexString(new Random().nextLong());
                            carSetupServiceImpl.f29594k.mo22635c(r1);
                            carSetupServiceImpl.mo17421e();
                            carSetupServiceImpl.mo17422f();
                        } else {
                            if (!carSetupServiceImpl.f29599p) {
                                otw otw = carSetupServiceImpl.f29594k;
                                String str6 = "false";
                                try {
                                    Class<?> cls = Class.forName("android.os.SystemProperties");
                                    i = 2;
                                    i = 2;
                                    try {
                                        Class[] clsArr = new Class[2];
                                        clsArr[0] = String.class;
                                        clsArr[r1] = String.class;
                                        Method method = cls.getMethod("get", clsArr);
                                        Object[] objArr = new Object[2];
                                        objArr[0] = "debug.car.skip_frx";
                                        objArr[r1] = str6;
                                        str6 = (String) method.invoke(null, objArr);
                                    } catch (Exception e) {
                                    }
                                } catch (Exception e2) {
                                    i = 2;
                                }
                                if (!"true".equalsIgnoreCase(str6)) {
                                    List a3 = oqx.m29633a(otw.f38440b, otw).mo22527a();
                                    if (!a3.isEmpty()) {
                                        bpduArr = new bpdu[a3.size()];
                                        int size = a3.size();
                                        int i4 = 0;
                                        int i5 = 0;
                                        while (i4 < size) {
                                            bpduArr[i5] = oqx.m29634b((String) a3.get(i4));
                                            i4++;
                                            i5++;
                                        }
                                    } else {
                                        bpduArr = null;
                                    }
                                    boolean isEmpty = TextUtils.isEmpty(ccui.m131664d().trim());
                                    bpdi bpdi = bpdi.EXPERIMENT;
                                    bpdh bpdh = isEmpty ^ r1 ? bpdh.MEDIA_APP_REQUIREMENT_CONTROL : bpdh.MEDIA_APP_REQUIREMENT_TREATMENT;
                                    bxvd da = bpdj.f136247f.mo74144da();
                                    int i6 = bpdi.f136246K;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bpdj bpdj = (bpdj) da.f164949b;
                                    int i7 = bpdj.f136249a | r1;
                                    bpdj.f136249a = i7;
                                    bpdj.f136250b = i6;
                                    int i8 = bpdh.f136208em;
                                    bpdj.f136249a = i | i7;
                                    bpdj.f136251c = i8;
                                    bpdj bpdj2 = (bpdj) da.mo74062i();
                                    bxvd da2 = bpcl.f135759L.mo74144da();
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bpcl bpcl = (bpcl) da2.f164949b;
                                    bpdj2.getClass();
                                    bpcl.f135785m = bpdj2;
                                    bpcl.f135773a |= 8192;
                                    otw.mo22627a((bpcl) da2.mo74062i(), 38);
                                    if (!otw.f38450l) {
                                        str = str3;
                                        bnsi d4 = otw.f38439a.mo68390d();
                                        d4.mo68432a("otw", "c", 345, str);
                                        d4.mo68405a("Triggering FRX: car connection is not allowed");
                                        otw.mo22626a(3, bpduArr);
                                    } else if (!otw.mo22637d()) {
                                        bnsi d5 = otw.f38439a.mo68390d();
                                        str = str3;
                                        d5.mo68432a("otw", "c", 350, str);
                                        d5.mo68405a("Triggering FRX: did not finish FRX");
                                        otw.mo22626a(4, bpduArr);
                                    } else {
                                        str = str3;
                                        if (bpduArr != null) {
                                            bnsi d6 = otw.f38439a.mo68390d();
                                            d6.mo68432a("otw", "c", 355, str);
                                            d6.mo68420a("Triggering FRX: applications are not up to date %s", a3);
                                            otw.mo22626a(5, bpduArr);
                                        } else if (nyz.m28216a()) {
                                            bnsi d7 = otw.f38439a.mo68390d();
                                            d7.mo68432a("otw", "c", 360, str);
                                            d7.mo68405a("Triggering FRX: GMSCore permissions missing");
                                            otw.mo22626a(6, (bpdu[]) null);
                                        } else {
                                            int i9 = otw.f38443e;
                                            if (i9 != 0 && i9 != r1) {
                                                bnsi d8 = otw.f38439a.mo68390d();
                                                d8.mo68432a("otw", "c", 366, str);
                                                d8.mo68405a("Triggering FRX: device not supported");
                                                otw.mo22626a(9, (bpdu[]) null);
                                            } else if (!otw.mo22639f()) {
                                                bnsi d9 = otw.f38439a.mo68390d();
                                                d9.mo68432a("otw", "c", 371, str);
                                                d9.mo68405a("Triggering FRX: TOS not accepted");
                                                otw.mo22626a(8, (bpdu[]) null);
                                            }
                                        }
                                    }
                                    if (carSetupServiceImpl.mo17425i()) {
                                        osq osq = carSetupServiceImpl.f29570I;
                                        osq.mo22567a();
                                        osq.f38350n = r1;
                                        pbm pbm = (pbm) osq.f38349m;
                                        pbm.f38780f.post(new pax(pbm, osq.f38340d.f29573L));
                                    } else {
                                        if (carSetupServiceImpl.f29589f == null) {
                                            bnsi b2 = CarSetupServiceImpl.f29560a.mo68387b();
                                            b2.mo68404a(bnsk.SMALL);
                                            b2.mo68432a(str4, str5, 1541, str);
                                            bryx a4 = bryx.m114908a(Integer.valueOf(carSetupServiceImpl.f29590g));
                                            bryx a5 = bryx.m114908a(Integer.valueOf(carSetupServiceImpl.f29586c));
                                            if (carSetupServiceImpl.f29570I != null) {
                                                obj = Boolean.valueOf(carSetupServiceImpl.f29570I.f38337a.get());
                                            } else {
                                                obj = "<null handoffStateManager>";
                                            }
                                            b2.mo68425a("protocolManager is unexpectedly null. connectionType: %s. connected state: %s. handoffStateManager.hasCleanedUp: %s.", a4, a5, bryx.m114908a(obj));
                                        }
                                        bmxy.m108582a(carSetupServiceImpl.f29589f, "protocolManager is null.");
                                        if (carSetupServiceImpl.f29589f.mo22212a((ojn) carSetupServiceImpl.f29598o) != r1) {
                                            carSetupServiceImpl.mo17418b(bpdn.PROTOCOL_WRONG_CONFIGURATION, bpdo.NO_SENSORS, "No sensors");
                                            carSetupServiceImpl.mo17421e();
                                        } else {
                                            carSetupServiceImpl.f29589f.mo22213a((ojl) new ose(carSetupServiceImpl));
                                        }
                                    }
                                } else {
                                    bnsi d10 = otw.f38439a.mo68390d();
                                    d10.mo68432a("otw", "c", 318, str3);
                                    d10.mo68405a("Skipping FRX: adb override");
                                }
                            }
                            if (ccql.m131269d()) {
                                ofd.m28611a(carSetupServiceImpl, str2, ofa.COMPLETED);
                            }
                            carSetupServiceImpl.f29598o = null;
                            carSetupServiceImpl.mo17422f();
                            carSetupServiceImpl.mo17421e();
                        }
                    }
                } else {
                    z2 = false;
                }
                z = false;
                String str22 = "com.google.android.gms.car.AUTHORIZATION";
                String str32 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                String str42 = "com.google.android.gms.carsetup.CarSetupServiceImpl";
                String str52 = "a";
                carSetupServiceImpl.f29594k = new otw(carSetupServiceImpl.getApplicationContext(), carSetupServiceImpl.f29595l, carSetupServiceImpl.f29564C, i2, oxe, z3, z2, z, carSetupServiceImpl.f29562A, carSetupServiceImpl.f29592i);
                if (!pbo.REJECTED.equals(pbo)) {
                }
            }
        } else {
            String str7 = "com.google.android.gms.car.AUTHORIZATION";
            if (i2 == 0 || i2 == 1) {
                bipi = bipi.PROBE_SUPPORTED;
                if (ccql.m131269d()) {
                    ofd.m28611a(carSetupServiceImpl, str7, ofa.COMPLETED);
                }
            } else {
                bipi = bipi.NOT_CURRENTLY_SUPPORTED;
                if (ccql.m131269d()) {
                    ofd.m28611a(carSetupServiceImpl, str7, ofa.FAILED);
                }
            }
            if (!carSetupServiceImpl.mo17425i()) {
                ojq ojq = carSetupServiceImpl.f29589f;
                if (ojq != null) {
                    ojq.mo22215a(bipi);
                }
            } else {
                carSetupServiceImpl.f29570I.mo22570a(bipi);
            }
        }
        carSetupServiceImpl.f29569H = null;
    }
}
