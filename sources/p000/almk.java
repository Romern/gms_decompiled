package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: almk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class almk {

    /* renamed from: a */
    public static final Random f73722a = new Random();

    /* renamed from: b */
    private static almk f73723b;

    /* renamed from: a */
    public static synchronized almk m61263a() {
        almk almk;
        synchronized (almk.class) {
            if (f73723b == null) {
                alml.m61286a();
                if (almj.f73721a == null) {
                    almj.f73721a = new almj();
                }
                f73723b = new almk();
            }
            almk = f73723b;
        }
        return almk;
    }

    /* renamed from: b */
    public static int m61268b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /* renamed from: c */
    public static amnr m61270c(int i, long j) {
        bxvd da = amnr.f75534d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amnr amnr = (amnr) da.f164949b;
        amnr.f75537b = i - 1;
        int i2 = amnr.f75536a | 1;
        amnr.f75536a = i2;
        amnr.f75536a = i2 | 2;
        amnr.f75538c = j;
        return (amnr) da.mo74062i();
    }

    /* renamed from: d */
    public static amno m61271d(int i, long j) {
        bxvd da = amno.f75521d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amno amno = (amno) da.f164949b;
        amno.f75524b = i - 1;
        int i2 = amno.f75523a | 1;
        amno.f75523a = i2;
        amno.f75523a = i2 | 2;
        amno.f75525c = j;
        return (amno) da.mo74062i();
    }

    /* renamed from: b */
    public static amlv m61269b(int i, long j) {
        bxvd da = amlv.f75221d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amlv amlv = (amlv) da.f164949b;
        amlv.f75224b = i - 1;
        int i2 = amlv.f75223a | 1;
        amlv.f75223a = i2;
        amlv.f75223a = i2 | 2;
        amlv.f75225c = j;
        return (amlv) da.mo74062i();
    }

    /* renamed from: a */
    public static amnw m61264a(Context context, String str, String str2) {
        return m61265a(context, str, str2, 0);
    }

    /* renamed from: a */
    public static amnw m61265a(Context context, String str, String str2, int i) {
        int i2;
        bxvd da = amnw.f75565e.mo74144da();
        bnic a = anbx.INSTANCE.mo41677a(context);
        if (a != null) {
            i2 = a.mo67639g().indexOf(str);
        } else {
            i2 = -1;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amnw amnw = (amnw) da.f164949b;
        amnw.f75567a |= 1;
        amnw.f75568b = i2;
        boolean z = !TextUtils.isEmpty(str2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amnw amnw2 = (amnw) da.f164949b;
        amnw2.f75567a |= 2;
        amnw2.f75569c = z;
        amig.m62939a();
        if (((Boolean) amhl.f74914a.mo41191a()).booleanValue() && i != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amnw amnw3 = (amnw) da.f164949b;
            amnw3.f75570d = i - 1;
            amnw3.f75567a |= 4;
        }
        return (amnw) da.mo74062i();
    }

    /* renamed from: a */
    public static void m61266a(ammr ammr, int i, int i2, Throwable th, int i3, int i4, long j, String str) {
        if (i != 1 && i != 9) {
            if (ammr.f164950c) {
                ammr.mo74035c();
                ammr.f164950c = false;
            }
            amnu amnu = (amnu) ammr.f164949b;
            amnu amnu2 = amnu.f75540w;
            amnu.f75542a |= 32;
            amnu.f75548g = i2;
            if (th != null) {
                String name = th.getClass().getName();
                if (ammr.f164950c) {
                    ammr.mo74035c();
                    ammr.f164950c = false;
                }
                amnu amnu3 = (amnu) ammr.f164949b;
                name.getClass();
                amnu3.f75542a |= 64;
                amnu3.f75549h = name;
                int cr = (int) cgbe.f186279a.mo6606a().mo83420cr();
                String stackTraceString = Log.getStackTraceString(th);
                String str2 = "";
                if (!TextUtils.isEmpty(stackTraceString)) {
                    str2 = stackTraceString.replaceAll("^.*?\\s+", str2).replaceAll("foreign key constraint failed.*?\\s+at\\s+", "FK ").replaceAll("\\s+", " ").replace(" at ", " ").replace("People", "P").replace("SQLite", "S").replace("(Native Method)", str2).replaceAll("SourceFile\\:", str2).replaceAll("\\b(?:android|com|org)\\.(?:[a-z0-9_]+\\.)*", str2);
                    if (str2.length() > cr) {
                        str2 = str2.substring(0, cr);
                    }
                }
                if (ammr.f164950c) {
                    ammr.mo74035c();
                    ammr.f164950c = false;
                }
                amnu amnu4 = (amnu) ammr.f164949b;
                str2.getClass();
                amnu4.f75542a |= 128;
                amnu4.f75550i = str2;
            }
            if (i == 8 && !TextUtils.isEmpty(str)) {
                if (ammr.f164950c) {
                    ammr.mo74035c();
                    ammr.f164950c = false;
                }
                amnu amnu5 = (amnu) ammr.f164949b;
                str.getClass();
                amnu5.f75542a |= 64;
                amnu5.f75549h = str;
            }
            if (ammr.f164950c) {
                ammr.mo74035c();
                ammr.f164950c = false;
            }
            amnu amnu6 = (amnu) ammr.f164949b;
            int i5 = amnu6.f75542a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            amnu6.f75542a = i5;
            amnu6.f75551j = i3;
            int i6 = i5 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            amnu6.f75542a = i6;
            amnu6.f75559r = i4;
            amnu6.f75542a = i6 | 512;
            amnu6.f75552k = j;
        }
    }

    /* renamed from: a */
    public static void m61267a(ammr ammr, Context context, String str, bmxv bmxv, int i, String str2, int i2, int i3, int i4, long j, boolean z, boolean z2, amnm amnm, List list) {
        amnw amnw;
        boolean z3;
        ammr ammr2 = ammr;
        Context context2 = context;
        int i5 = i4;
        amnm amnm2 = amnm;
        List list2 = list;
        amnw a = m61264a(context2, str, (String) null);
        if (ammr2.f164950c) {
            ammr.mo74035c();
            ammr2.f164950c = false;
        }
        amnu amnu = (amnu) ammr2.f164949b;
        amnu amnu2 = amnu.f75540w;
        a.getClass();
        amnu.f75543b = a;
        int i6 = 1;
        int i7 = amnu.f75542a | 1;
        amnu.f75542a = i7;
        int i8 = 2;
        amnu.f75542a = i7 | 2;
        amnu.f75544c = i;
        int b = m61268b(str2);
        if (ammr2.f164950c) {
            ammr.mo74035c();
            ammr2.f164950c = false;
        }
        amnu amnu3 = (amnu) ammr2.f164949b;
        int i9 = amnu3.f75542a | 8;
        amnu3.f75542a = i9;
        amnu3.f75546e = b;
        amnu3.f75545d = i2 - 1;
        int i10 = i9 | 4;
        amnu3.f75542a = i10;
        amnu3.f75542a = i10 | 4096;
        amnu3.f75556o = i3;
        if (bmxv.mo66813a()) {
            String str3 = (String) bmxv.mo66814b();
            if (ammr2.f164950c) {
                ammr.mo74035c();
                ammr2.f164950c = false;
            }
            amnu amnu4 = (amnu) ammr2.f164949b;
            str3.getClass();
            amnu4.f75542a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            amnu4.f75560s = str3;
        }
        if (i5 != 0) {
            if (ammr2.f164950c) {
                ammr.mo74035c();
                ammr2.f164950c = false;
            }
            amnu amnu5 = (amnu) ammr2.f164949b;
            amnu5.f75547f = i5;
            amnu5.f75542a |= 16;
        }
        if (ammr2.f164950c) {
            ammr.mo74035c();
            ammr2.f164950c = false;
        }
        amnu amnu6 = (amnu) ammr2.f164949b;
        int i11 = amnu6.f75542a | 1024;
        amnu6.f75542a = i11;
        amnu6.f75554m = j;
        amnu6.f75542a = i11 | 8192;
        amnu6.f75558q = 0;
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(1);
        }
        if (z2) {
            arrayList.add(2);
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = ((Integer) arrayList.get(i12)).intValue();
        }
        List b2 = bqcn.m112586b(iArr);
        if (ammr2.f164950c) {
            ammr.mo74035c();
            ammr2.f164950c = false;
        }
        amnu amnu7 = (amnu) ammr2.f164949b;
        if (!amnu7.f75557p.mo73666a()) {
            amnu7.f75557p = bxvk.m124019a(amnu7.f75557p);
        }
        bxsy.m123078a(b2, amnu7.f75557p);
        if (amnm2 != null) {
            if (ammr2.f164950c) {
                ammr.mo74035c();
                ammr2.f164950c = false;
            }
            amnu amnu8 = (amnu) ammr2.f164949b;
            amnm.getClass();
            amnu8.f75555n = amnm2;
            int i13 = amnu8.f75542a | 2048;
            amnu8.f75542a = i13;
            long j2 = amnu8.f75558q;
            long j3 = amnm2.f75515c;
            amnu8.f75542a = i13 | 8192;
            amnu8.f75558q = j2 + j3;
        }
        if (list2 != null) {
            int size2 = list.size();
            ammo[] ammoArr = new ammo[size2];
            int i14 = 0;
            while (i14 < size2) {
                almm almm = (almm) list2.get(i14);
                bxvd da = ammo.f75321J.mo74144da();
                amig.m62939a();
                if (((Boolean) amhl.f74914a.mo41191a()).booleanValue()) {
                    amnw = m61265a(context2, almm.f73751a, almm.f73754b, almm.f73750Z);
                } else {
                    amnw = m61264a(context2, almm.f73751a, almm.f73754b);
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ammo ammo = (ammo) da.f164949b;
                amnw.getClass();
                ammo.f75334c = amnw;
                int i15 = ammo.f75332a | i6;
                ammo.f75332a = i15;
                boolean z4 = almm.f73755c;
                int i16 = i15 | i8;
                ammo.f75332a = i16;
                ammo.f75335d = z4;
                int i17 = almm.f73756d;
                int i18 = i16 | 4;
                ammo.f75332a = i18;
                ammo.f75336e = i17;
                boolean z5 = almm.f73760h;
                int i19 = i18 | 2097152;
                ammo.f75332a = i19;
                ammo.f75342k = z5;
                boolean z6 = almm.f73759g;
                int i20 = i19 | 4194304;
                ammo.f75332a = i20;
                ammo.f75343l = z6;
                boolean z7 = almm.f73758f;
                int i21 = i20 | 8388608;
                ammo.f75332a = i21;
                ammo.f75344m = z7;
                boolean z8 = almm.f73757e;
                int i22 = i21 | 16777216;
                ammo.f75332a = i22;
                ammo.f75345n = z8;
                int i23 = i22 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                ammo.f75332a = i23;
                ammo.f75337f = false;
                int i24 = i23 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                ammo.f75332a = i24;
                ammo.f75338g = 0;
                int i25 = i24 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                ammo.f75332a = i25;
                ammo.f75339h = 0;
                int i26 = i25 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                ammo.f75332a = i26;
                ammo.f75340i = 0;
                int i27 = i26 | 1048576;
                ammo.f75332a = i27;
                ammo.f75341j = 0;
                boolean z9 = almm.f73761i;
                int i28 = i27 | 33554432;
                ammo.f75332a = i28;
                ammo.f75346o = z9;
                int i29 = almm.f73762j;
                int i30 = i28 | 67108864;
                ammo.f75332a = i30;
                ammo.f75347p = i29;
                int i31 = 134217728 | i30;
                ammo.f75332a = i31;
                ammo.f75348q = false;
                int i32 = i31 | 268435456;
                ammo.f75332a = i32;
                ammo.f75349r = 0;
                int i33 = i32 | 536870912;
                ammo.f75332a = i33;
                ammo.f75350s = 0;
                ammo.f75332a = i33 | JGCastService.FLAG_PRIVATE_DISPLAY;
                ammo.f75351t = 0;
                boolean z10 = almm.f73763k;
                int i34 = ammo.f75333b | i6;
                ammo.f75333b = i34;
                ammo.f75352u = z10;
                int i35 = almm.f73764l;
                int i36 = i34 | i8;
                ammo.f75333b = i36;
                ammo.f75353v = i35;
                int i37 = almm.f73765m;
                int i38 = i36 | 4;
                ammo.f75333b = i38;
                ammo.f75354w = i37;
                int i39 = almm.f73766n;
                int i40 = i38 | 8;
                ammo.f75333b = i40;
                ammo.f75355x = i39;
                int i41 = almm.f73767o;
                int i42 = i40 | 16;
                ammo.f75333b = i42;
                ammo.f75356y = i41;
                int i43 = almm.f73768p;
                int i44 = i42 | 32;
                ammo.f75333b = i44;
                ammo.f75357z = i43;
                int i45 = almm.f73769q;
                int i46 = i44 | 64;
                ammo.f75333b = i46;
                ammo.f75323A = i45;
                int i47 = almm.f73770r;
                int i48 = i46 | 128;
                ammo.f75333b = i48;
                ammo.f75324B = i47;
                int i49 = almm.f73771s;
                int i50 = i48 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                ammo.f75333b = i50;
                ammo.f75325C = i49;
                long j4 = almm.f73775w;
                ammo.f75333b = i50 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                ammo.f75326D = j4;
                if (cgay.m144134g()) {
                    long j5 = almm.f73739O;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ammo ammo2 = (ammo) da.f164949b;
                    ammo2.f75333b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                    ammo2.f75327E = j5;
                }
                if (cgay.m144132e()) {
                    long j6 = almm.f73740P;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ammo ammo3 = (ammo) da.f164949b;
                    ammo3.f75333b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                    ammo3.f75328F = j6;
                }
                if (cgay.m144133f()) {
                    long j7 = almm.f73741Q;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ammo ammo4 = (ammo) da.f164949b;
                    ammo4.f75333b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                    ammo4.f75329G = j7;
                }
                if (cgay.m144135h()) {
                    int i51 = almm.f73752aa;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ammo ammo5 = (ammo) da.f164949b;
                    int i52 = i51 - 1;
                    if (i51 != 0) {
                        ammo5.f75330H = i52;
                        int i53 = ammo5.f75333b | AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                        ammo5.f75333b = i53;
                        int i54 = almm.f73753ab;
                        int i55 = i54 - 1;
                        if (i54 != 0) {
                            ammo5.f75331I = i55;
                            ammo5.f75333b = i53 | 1048576;
                            z3 = false;
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    z3 = false;
                }
                ammoArr[i14] = (ammo) da.mo74062i();
                long j8 = ((amnu) ammr2.f164949b).f75558q + almm.f73731G;
                if (ammr2.f164950c) {
                    ammr.mo74035c();
                    ammr2.f164950c = false;
                }
                amnu amnu9 = (amnu) ammr2.f164949b;
                amnu9.f75542a |= 8192;
                amnu9.f75558q = j8;
                i14++;
                i6 = 1;
                i8 = 2;
            }
            List asList = Arrays.asList(ammoArr);
            if (ammr2.f164950c) {
                ammr.mo74035c();
                ammr2.f164950c = false;
            }
            amnu amnu10 = (amnu) ammr2.f164949b;
            if (!amnu10.f75553l.mo73666a()) {
                amnu10.f75553l = bxvk.m124021a(amnu10.f75553l);
            }
            bxsy.m123078a(asList, amnu10.f75553l);
        }
    }

    /* renamed from: a */
    public final void mo40511a(int i, long j) {
        bxvd da = ammb.f75247o.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ammb ammb = (ammb) da.f164949b;
        ammb.f75253e = i - 1;
        int i2 = ammb.f75249a | 8;
        ammb.f75249a = i2;
        ammb.f75249a = i2 | 4;
        ammb.f75252d = j;
        ammb ammb2 = (ammb) da.mo74062i();
        bxvd da2 = amoh.f75593x.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        amoh amoh = (amoh) da2.f164949b;
        ammb2.getClass();
        amoh.f75607m = ammb2;
        amoh.f75595a |= 1024;
        alml.m61288a(null, da2);
    }

    /* renamed from: a */
    public final void mo40512a(int i, String str, String str2, String str3, int i2, int i3, int i4, List list, amlq amlq, amli amli, amlt amlt, double d) {
        String str4 = str;
        String str5 = str3;
        amlq amlq2 = amlq;
        amli amli2 = amli;
        amlt amlt2 = amlt;
        amig.m62939a();
        if (!Boolean.valueOf(cgbe.f186279a.mo6606a().mo83320ax()).booleanValue() || f73722a.nextDouble() < d) {
            bxvd da = amlx.f75227l.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amlx amlx = (amlx) da.f164949b;
            amlx.f75230b = i - 1;
            int i5 = amlx.f75229a | 1;
            amlx.f75229a = i5;
            int i6 = i5 | 2;
            amlx.f75229a = i6;
            amlx.f75231c = i3;
            int i7 = i2 - 1;
            if (i2 != 0) {
                amlx.f75235g = i7;
                int i8 = i6 | 16;
                amlx.f75229a = i8;
                if (str5 != null) {
                    str3.getClass();
                    amlx.f75229a = i8 | 4;
                    amlx.f75232d = str5;
                }
                if (cfyx.m143986c() && str4 != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amlx amlx2 = (amlx) da.f164949b;
                    str.getClass();
                    amlx2.f75229a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    amlx2.f75239k = str4;
                }
                if (((Boolean) amgy.f74901a.mo41191a()).booleanValue()) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amlx amlx3 = (amlx) da.f164949b;
                    int i9 = i4 - 1;
                    if (i4 != 0) {
                        amlx3.f75237i = i9;
                        amlx3.f75229a |= 64;
                    } else {
                        throw null;
                    }
                }
                if (!sqw.m36041a((Collection) list)) {
                    amlv[] amlvArr = new amlv[list.size()];
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        amlvArr[i10] = (amlv) list.get(i10);
                    }
                    List asList = Arrays.asList(amlvArr);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amlx amlx4 = (amlx) da.f164949b;
                    if (!amlx4.f75234f.mo73666a()) {
                        amlx4.f75234f = bxvk.m124021a(amlx4.f75234f);
                    }
                    bxsy.m123078a(asList, amlx4.f75234f);
                }
                if (amlq2 != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amlx amlx5 = (amlx) da.f164949b;
                    amlq.getClass();
                    amlx5.f75233e = amlq2;
                    amlx5.f75229a |= 8;
                }
                if (amli2 != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amlx amlx6 = (amlx) da.f164949b;
                    amli.getClass();
                    amlx6.f75236h = amli2;
                    amlx6.f75229a |= 32;
                }
                if (amlt2 != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amlx amlx7 = (amlx) da.f164949b;
                    amlt.getClass();
                    amlx7.f75238j = amlt2;
                    amlx7.f75229a |= 128;
                }
                bxvd da2 = amoh.f75593x.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                amoh amoh = (amoh) da2.f164949b;
                amlx amlx8 = (amlx) da.mo74062i();
                amlx8.getClass();
                amoh.f75606l = amlx8;
                amoh.f75595a |= 512;
                alml.m61288a(str2, da2);
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo40513a(long j, long j2, long j3, long j4, int i, int i2) {
        bxvd da = ammb.f75247o.mo74144da();
        int i3 = (int) j;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ammb ammb = (ammb) da.f164949b;
        int i4 = ammb.f75249a | 16;
        ammb.f75249a = i4;
        ammb.f75254f = i3;
        int i5 = i4 | 32;
        ammb.f75249a = i5;
        ammb.f75255g = (int) j2;
        int i6 = i5 | 64;
        ammb.f75249a = i6;
        ammb.f75256h = (int) j3;
        int i7 = i6 | 128;
        ammb.f75249a = i7;
        ammb.f75257i = (int) j4;
        ammb.f75249a = i7 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        ammb.f75258j = i;
        amig.m62939a();
        if (((Boolean) amhb.f74904a.mo41191a()).booleanValue()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ammb ammb2 = (ammb) da.f164949b;
            ammb2.f75249a |= 512;
            ammb2.f75259k = i2;
        }
        bxvd da2 = amoh.f75593x.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        amoh amoh = (amoh) da2.f164949b;
        ammb ammb3 = (ammb) da.mo74062i();
        ammb3.getClass();
        amoh.f75607m = ammb3;
        amoh.f75595a |= 1024;
        alml.m61288a(null, da2);
    }

    /* renamed from: a */
    public final void mo40514a(amkv amkv) {
        bxvd da = amoh.f75593x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amoh amoh = (amoh) da.f164949b;
        amkv.getClass();
        amoh.f75601g = amkv;
        amoh.f75595a |= 64;
        alml.m61288a(null, da);
    }

    /* renamed from: a */
    public final void mo40515a(amkw amkw) {
        bxvd da = amoh.f75593x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amoh amoh = (amoh) da.f164949b;
        amkw.getClass();
        amoh.f75614t = amkw;
        amoh.f75595a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        alml.m61288a(null, da);
    }

    /* renamed from: a */
    public final void mo40516a(amkx amkx, String str) {
        bxvd da = amoh.f75593x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amoh amoh = (amoh) da.f164949b;
        amkx.getClass();
        amoh.f75615u = amkx;
        amoh.f75595a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        alml.m61288a(str, da);
    }

    /* renamed from: a */
    public final void mo40517a(amkz amkz) {
        bxvd da = amoh.f75593x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amoh amoh = (amoh) da.f164949b;
        amkz.getClass();
        amoh.f75613s = amkz;
        amoh.f75595a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        alml.m61288a(null, da);
    }

    /* renamed from: a */
    public final void mo40518a(amlc amlc, String str) {
        bxvd da = amoh.f75593x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amoh amoh = (amoh) da.f164949b;
        amlc.getClass();
        amoh.f75617w = amlc;
        amoh.f75595a |= 1048576;
        alml.m61288a(str, da);
    }

    /* renamed from: a */
    public final void mo40519a(ammn ammn, String str) {
        bxvd da = amoh.f75593x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amoh amoh = (amoh) da.f164949b;
        ammn.getClass();
        amoh.f75611q = ammn;
        amoh.f75595a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        alml.m61288a(str, da);
    }

    /* renamed from: a */
    public final void mo40520a(Context context, bxvd bxvd) {
        Collection collection;
        ModuleManager.ModuleSetInfo moduleSetInfo = null;
        try {
            ModuleManager.ConfigInfo currentConfig = ModuleManager.get(context).getCurrentConfig();
            if (currentConfig != null && (collection = currentConfig.moduleSets) != null) {
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ModuleManager.ModuleSetInfo moduleSetInfo2 = (ModuleManager.ModuleSetInfo) it.next();
                    if (moduleSetInfo2 == null) {
                        amdk.m62658a("ModuleSetExtractor", "moduleSetInfo is null", new Object[0]);
                    } else if ("dogfood_people".equals(moduleSetInfo2.moduleSetId)) {
                        moduleSetInfo = moduleSetInfo2;
                        break;
                    }
                }
            }
        } catch (InvalidConfigException e) {
            Log.w("ModuleSetExtractor", "Invalid configuration", e);
        }
        if (moduleSetInfo != null) {
            bxvd da = amme.f75277d.mo74144da();
            String str = moduleSetInfo.moduleSetId;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amme amme = (amme) da.f164949b;
            str.getClass();
            int i = amme.f75279a | 1;
            amme.f75279a = i;
            amme.f75280b = str;
            int i2 = moduleSetInfo.moduleSetVariant;
            amme.f75279a = i | 2;
            amme.f75281c = i2;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            amoh amoh = (amoh) bxvd.f164949b;
            amme amme2 = (amme) da.mo74062i();
            amoh amoh2 = amoh.f75593x;
            amme2.getClass();
            if (!amoh.f75604j.mo73666a()) {
                amoh.f75604j = bxvk.m124021a(amoh.f75604j);
            }
            amoh.f75604j.add(amme2);
        }
    }

    /* renamed from: a */
    public final void mo40521a(Context context, String str, amnu amnu, amlb[] amlbArr, String str2) {
        if (((double) ancm.f76635f.nextFloat()) < cgbe.m144186o()) {
            bxvd da = amoh.f75593x.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amoh amoh = (amoh) da.f164949b;
            amnu.getClass();
            amoh.f75598d = amnu;
            amoh.f75595a |= 4;
            boolean c = soz.m35800c(context);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amoh amoh2 = (amoh) da.f164949b;
            int i = amoh2.f75595a | 8;
            amoh2.f75595a = i;
            amoh2.f75599e = c;
            amoh2.f75600f = 2;
            amoh2.f75595a = i | 32;
            if (amlbArr != null) {
                List asList = Arrays.asList(amlbArr);
                if (!asList.contains(null)) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amoh amoh3 = (amoh) da.f164949b;
                    if (!amoh3.f75605k.mo73666a()) {
                        amoh3.f75605k = bxvk.m124021a(amoh3.f75605k);
                    }
                    bxsy.m123078a(asList, amoh3.f75605k);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                bxvd da2 = ammq.f75359l.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ammq ammq = (ammq) da2.f164949b;
                str2.getClass();
                ammq.f75361a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                ammq.f75370j = str2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                amoh amoh4 = (amoh) da.f164949b;
                ammq ammq2 = (ammq) da2.mo74062i();
                ammq2.getClass();
                amoh4.f75597c = ammq2;
                amoh4.f75595a = 2 | amoh4.f75595a;
            }
            mo40520a(context, da);
            alml.m61288a(str, da);
        }
    }

    /* renamed from: a */
    public final void mo40522a(String str) {
        bxvd da = ammk.f75296c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ammk ammk = (ammk) da.f164949b;
        str.getClass();
        ammk.f75298a |= 1;
        ammk.f75299b = str;
        ammk ammk2 = (ammk) da.mo74062i();
        bxvd da2 = amoh.f75593x.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        amoh amoh = (amoh) da2.f164949b;
        ammk2.getClass();
        amoh.f75603i = ammk2;
        amoh.f75595a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        alml.m61288a(null, da2);
    }

    /* renamed from: a */
    public final void mo40523a(String str, int i, int i2, int i3) {
        bxvd da = ammb.f75247o.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ammb ammb = (ammb) da.f164949b;
        int i4 = ammb.f75249a | 1024;
        ammb.f75249a = i4;
        ammb.f75260l = i;
        int i5 = i4 | 2048;
        ammb.f75249a = i5;
        ammb.f75261m = i2;
        ammb.f75262n = i3 - 1;
        ammb.f75249a = i5 | 4096;
        ammb ammb2 = (ammb) da.mo74062i();
        bxvd da2 = amoh.f75593x.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        amoh amoh = (amoh) da2.f164949b;
        ammb2.getClass();
        amoh.f75607m = ammb2;
        amoh.f75595a |= 1024;
        alml.m61288a(str, da2);
    }

    /* renamed from: a */
    public final void mo40524a(String str, long j, int i) {
        bxvd da = amod.f75579f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amod amod = (amod) da.f164949b;
        amod.f75582b = 2;
        int i2 = amod.f75581a | 1;
        amod.f75581a = i2;
        str.getClass();
        int i3 = 2 | i2;
        amod.f75581a = i3;
        amod.f75583c = str;
        amod.f75581a = i3 | 8;
        amod.f75585e = j;
        int a = amoc.m63112a(i - 1);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amod amod2 = (amod) da.f164949b;
        int i4 = a - 1;
        if (a != 0) {
            amod2.f75584d = i4;
            amod2.f75581a |= 4;
            amod amod3 = (amod) da.mo74062i();
            bxvd da2 = amoh.f75593x.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            amoh amoh = (amoh) da2.f164949b;
            amod3.getClass();
            amoh.f75602h = amod3;
            amoh.f75595a |= 128;
            alml.m61288a(null, da2);
            return;
        }
        throw null;
    }
}
