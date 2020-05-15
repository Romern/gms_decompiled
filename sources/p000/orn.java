package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.OutputStream;
import java.util.List;

/* renamed from: orn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class orn {

    /* renamed from: a */
    public final orl f38280a;

    /* renamed from: b */
    public OutputStream f38281b;

    /* renamed from: c */
    public volatile int f38282c;

    /* renamed from: d */
    private final Context f38283d;

    /* renamed from: e */
    private final npd f38284e;

    /* renamed from: f */
    private final boolean f38285f;

    public orn(Context context, npd npd) {
        this.f38283d = context.getApplicationContext();
        this.f38284e = npd;
        boolean b = ccqc.f179744a.mo6606a().mo76636b();
        this.f38285f = b;
        if (b) {
            this.f38280a = new orm(ocx.m28405a(context));
        } else {
            this.f38280a = new ork(new omq(this.f38283d));
        }
    }

    /* renamed from: a */
    static int m29651a(Integer num) {
        return ((Integer) ooe.m29303a(num).mo22383a((Object) 0)).intValue();
    }

    /* renamed from: b */
    public final bxvd mo22550b() {
        if (this.f38285f) {
            return bpcl.f135759L.mo74144da();
        }
        bpcl a = this.f38280a.mo22539a();
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        return bxvd;
    }

    /* renamed from: a */
    private final void m29652a(int i, bxvd bxvd) {
        int i2 = this.f38282c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpcl bpcl = (bpcl) bxvd.f164949b;
        bpcl bpcl2 = bpcl.f135759L;
        bpcl.f135773a |= 8388608;
        bpcl.f135793u = i2;
        this.f38280a.mo22540a(i, (bpcl) bxvd.mo74062i(), bngx.m109376e());
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo22542a() {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            SharedPreferences sharedPreferences = this.f38283d.getSharedPreferences("gearhead_analytics", 0);
            this.f38282c = sharedPreferences.getInt("car_session", 0);
            sharedPreferences.edit().putInt("car_session", this.f38282c + 1).commit();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            this.f38280a.mo22541a(this.f38282c, this.f38281b);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo22543a(int i, int i2, int i3, int i4, int i5, Integer num, int i6) {
        int i7;
        bxvd b = mo22550b();
        bxvd da = bpdv.f136400i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpdv bpdv = (bpdv) da.f164949b;
        int i8 = bpdv.f136402a | 1;
        bpdv.f136402a = i8;
        bpdv.f136403b = i;
        int i9 = i8 | 2;
        bpdv.f136402a = i9;
        bpdv.f136404c = i2;
        int i10 = i9 | 4;
        bpdv.f136402a = i10;
        bpdv.f136405d = i3;
        int i11 = i10 | 8;
        bpdv.f136402a = i11;
        bpdv.f136406e = i4;
        if (i5 != 0) {
            i7 = i5 - 1;
        } else {
            i7 = 0;
        }
        bpdv.f136402a = i11 | 16;
        bpdv.f136407f = i7;
        int a = m29651a(num);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpdv bpdv2 = (bpdv) da.f164949b;
        int i12 = bpdv2.f136402a | 32;
        bpdv2.f136402a = i12;
        bpdv2.f136408g = a;
        bpdv2.f136402a = i12 | 64;
        bpdv2.f136409h = i6 - 1;
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bpcl bpcl = (bpcl) b.f164949b;
        bpdv bpdv3 = (bpdv) da.mo74062i();
        bpcl bpcl2 = bpcl.f135759L;
        bpdv3.getClass();
        bpcl.f135798z = bpdv3;
        bpcl.f135774b |= 8;
        mo22547a(b, 45);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bxwc, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public final void mo22544a(int i, int i2, bivd bivd) {
        List list;
        biuy biuy;
        List list2;
        List list3;
        bxwc bxwc = bivd.f121949a;
        int size = bxwc.size();
        int i3 = 0;
        while (true) {
            list = null;
            if (i3 >= size) {
                biuy = null;
                break;
            }
            bivb bivb = (bivb) bxwc.get(i3);
            i3++;
            if ((bivb.f121923a & 2) != 0) {
                biuy = bivb.f121925c;
                if (biuy == null) {
                    biuy = biuy.f121888g;
                }
            }
        }
        if (biuy != null) {
            bxvv bxvv = new bxvv(biuy.f121892c, biuy.f121886d);
            sdo.m34959a(bxvv);
            list = bqcn.m112586b(bxzo.m124571a(bxvv));
            bxvv bxvv2 = new bxvv(biuy.f121893e, biuy.f121887f);
            sdo.m34959a(bxvv2);
            list2 = bqcn.m112586b(bxzo.m124571a(bxvv2));
            list3 = bqcn.m112586b(bxzo.m124572a((biva[]) sdo.m34959a((biva[]) bnjd.m109584a(bnjd.m109575a((Iterable) biuy.f121890a, orj.f38277a), biva.class))));
        } else {
            list3 = null;
            list2 = null;
        }
        bxvd b = mo22550b();
        bxvd da = bpcs.f135833p.mo74144da();
        String str = bivd.f121950b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpcs bpcs = (bpcs) da.f164949b;
        str.getClass();
        int i4 = bpcs.f135835a | 1;
        bpcs.f135835a = i4;
        bpcs.f135836b = str;
        String str2 = bivd.f121951c;
        str2.getClass();
        int i5 = i4 | 2;
        bpcs.f135835a = i5;
        bpcs.f135837c = str2;
        String str3 = bivd.f121952d;
        str3.getClass();
        int i6 = i5 | 4;
        bpcs.f135835a = i6;
        bpcs.f135838d = str3;
        String str4 = bivd.f121957i;
        str4.getClass();
        int i7 = i6 | 32;
        bpcs.f135835a = i7;
        bpcs.f135841g = str4;
        String str5 = bivd.f121955g;
        str5.getClass();
        int i8 = i7 | 8;
        bpcs.f135835a = i8;
        bpcs.f135839e = str5;
        String str6 = bivd.f121956h;
        str6.getClass();
        int i9 = i8 | 16;
        bpcs.f135835a = i9;
        bpcs.f135840f = str6;
        String str7 = bivd.f121958j;
        str7.getClass();
        int i10 = i9 | 64;
        bpcs.f135835a = i10;
        bpcs.f135842h = str7;
        int i11 = i10 | 512;
        bpcs.f135835a = i11;
        bpcs.f135843i = i;
        int i12 = i11 | 1024;
        bpcs.f135835a = i12;
        bpcs.f135844j = i2;
        String str8 = bivd.f121961m;
        str8.getClass();
        bpcs.f135835a = i12 | 2048;
        bpcs.f135845k = str8;
        int a = biqb.m102716a(bivd.f121954f);
        if (a == 0) {
            a = 1;
        }
        int i13 = a - 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpcs bpcs2 = (bpcs) da.f164949b;
        bpcs2.f135835a |= 4096;
        bpcs2.f135846l = i13;
        if (list != null) {
            if (!bpcs2.f135847m.mo73666a()) {
                bpcs2.f135847m = bxvk.m124019a(bpcs2.f135847m);
            }
            bxsy.m123078a(list, bpcs2.f135847m);
        }
        if (list2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcs bpcs3 = (bpcs) da.f164949b;
            if (!bpcs3.f135848n.mo73666a()) {
                bpcs3.f135848n = bxvk.m124019a(bpcs3.f135848n);
            }
            bxsy.m123078a(list2, bpcs3.f135848n);
        }
        if (list3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcs bpcs4 = (bpcs) da.f164949b;
            if (!bpcs4.f135849o.mo73666a()) {
                bpcs4.f135849o = bxvk.m124019a(bpcs4.f135849o);
            }
            bxsy.m123078a(list3, bpcs4.f135849o);
        }
        bpcq bpcq = (bpcq) bpcv.f135867i.mo74144da();
        if (bpcq.f164950c) {
            bpcq.mo74035c();
            bpcq.f164950c = false;
        }
        bpcv bpcv = (bpcv) bpcq.f164949b;
        bpcs bpcs5 = (bpcs) da.mo74062i();
        bpcs5.getClass();
        bpcv.f135871c = bpcs5;
        bpcv.f135869a |= 2;
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bpcl bpcl = (bpcl) b.f164949b;
        bpcv bpcv2 = (bpcv) bpcq.mo74062i();
        bpcl bpcl2 = bpcl.f135759L;
        bpcv2.getClass();
        bpcl.f135775c = bpcv2;
        bpcl.f135773a |= 1;
        mo22547a(b, 35);
    }

    /* renamed from: a */
    public final void mo22545a(bpcl bpcl, int i) {
        bxvd bxvd = (bxvd) bpcl.mo74142c(5);
        bxvd.mo73625a((bxvk) bpcl);
        mo22547a(bxvd, i);
    }

    /* renamed from: a */
    public final void mo22546a(bpdn bpdn, bpdo bpdo) {
        sdo.m34966a(bpdn, "errorCode is necessary");
        bxvd da = bpdp.f136352f.mo74144da();
        int i = bpdn.f136282v;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpdp bpdp = (bpdp) da.f164949b;
        int i2 = bpdp.f136354a | 1;
        bpdp.f136354a = i2;
        bpdp.f136355b = i;
        int i3 = bpdo.f136351ap;
        bpdp.f136354a = i2 | 2;
        bpdp.f136356c = i3;
        bpdp bpdp2 = (bpdp) da.mo74062i();
        bxvd b = mo22550b();
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bpcl bpcl = (bpcl) b.f164949b;
        bpcl bpcl2 = bpcl.f135759L;
        bpdp2.getClass();
        bpcl.f135787o = bpdp2;
        bpcl.f135773a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        m29652a(42, b);
    }

    /* renamed from: a */
    public final void mo22547a(bxvd bxvd, int i) {
        if (this.f38284e.f36297d) {
            m29652a(i, bxvd);
        } else if (Log.isLoggable("CAR.ANALYTICS", 3)) {
            Log.d("CAR.ANALYTICS", "Dropping log, telemetry disabled");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo22548a(odg odg) {
        sdo.m34971a(odg.mo21991d().isEmpty(), (Object) "TestCodes not implemented pending b/131928884");
        mo22547a(odg.mo22020C(), odg.mo21987B());
    }

    /* renamed from: a */
    public final void mo22549a(boolean z, bpeg bpeg, Integer num) {
        bxvd b = mo22550b();
        bxvd da = bpej.f137288f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpej bpej = (bpej) da.f164949b;
        int i = bpej.f137290a | 1;
        bpej.f137290a = i;
        bpej.f137291b = 1;
        int i2 = i | 2;
        bpej.f137290a = i2;
        bpej.f137292c = z;
        bpeg.getClass();
        bpej.f137293d = bpeg;
        bpej.f137290a = i2 | 4;
        int a = m29651a(num);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpej bpej2 = (bpej) da.f164949b;
        bpej2.f137290a |= 8;
        bpej2.f137294e = a;
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bpcl bpcl = (bpcl) b.f164949b;
        bpej bpej3 = (bpej) da.mo74062i();
        bpcl bpcl2 = bpcl.f135759L;
        bpej3.getClass();
        bpcl.f135761A = bpej3;
        bpcl.f135774b |= 16;
        mo22547a(b, 46);
    }
}
