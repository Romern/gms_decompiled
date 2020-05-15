package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.cast.JGCastService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ahvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahvd {

    /* renamed from: a */
    public static rjx f68151a;

    /* renamed from: a */
    public static ahyw m56704a(Context context, String str) {
        return (ahyw) ((ahxa) ahgz.m55754a(context, ahxa.class)).get(str);
    }

    /* renamed from: b */
    public static ahyw m56714b(aiaa aiaa) {
        bxvd da = ahyw.f68389A.mo74144da();
        long j = aiaa.f68524l;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyw ahyw = (ahyw) da.f164949b;
        int i = ahyw.f68392a | 2097152;
        ahyw.f68392a = i;
        ahyw.f68415y = j;
        long j2 = aiaa.f68523k;
        int i2 = i | 32;
        ahyw.f68392a = i2;
        ahyw.f68398g = j2;
        String str = aiaa.f68518f;
        str.getClass();
        int i3 = i2 | 64;
        ahyw.f68392a = i3;
        ahyw.f68399h = str;
        String str2 = aiaa.f68520h;
        str2.getClass();
        int i4 = i3 | 16;
        ahyw.f68392a = i4;
        ahyw.f68397f = str2;
        String str3 = aiaa.f68517e;
        str3.getClass();
        int i5 = i4 | 128;
        ahyw.f68392a = i5;
        ahyw.f68400i = str3;
        String str4 = aiaa.f68537y;
        str4.getClass();
        int i6 = 1;
        int i7 = i5 | 1;
        ahyw.f68392a = i7;
        ahyw.f68393b = str4;
        ByteString bxtx = aiaa.f68538z;
        bxtx.getClass();
        int i8 = i7 | 8;
        ahyw.f68392a = i8;
        ahyw.f68396e = bxtx;
        ByteString bxtx2 = aiaa.f68510H;
        bxtx2.getClass();
        ahyw.f68392a = i8 | 4096;
        ahyw.f68405n = bxtx2;
        bxvd da2 = ahyt.f68381d.mo74144da();
        String str5 = aiaa.f68521i;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ahyt ahyt = (ahyt) da2.f164949b;
        str5.getClass();
        ahyt.f68383a |= 2;
        ahyt.f68385c = str5;
        ahyt ahyt2 = (ahyt) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyw ahyw2 = (ahyw) da.f164949b;
        ahyt2.getClass();
        ahyw2.f68404m = ahyt2;
        ahyw2.f68392a |= 2048;
        byzb byzb = aiaa.f68511I;
        if (byzb == null) {
            byzb = byzb.f169045j;
        }
        boolean z = byzb.f169048b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyw ahyw3 = (ahyw) da.f164949b;
        ahyw3.f68392a |= 8192;
        ahyw3.f68406o = z;
        byzb byzb2 = aiaa.f68511I;
        if (byzb2 == null) {
            byzb2 = byzb.f169045j;
        }
        int a = bzbc.m125607a(byzb2.f169049c);
        if (a == 0) {
            a = 1;
        }
        int i9 = a - 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyw ahyw4 = (ahyw) da.f164949b;
        ahyw4.f68392a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        ahyw4.f68407p = i9;
        byzb byzb3 = aiaa.f68511I;
        if (byzb3 == null) {
            byzb3 = byzb.f169045j;
        }
        bzaa bzaa = byzb3.f169050d;
        if (bzaa == null) {
            bzaa = bzaa.f169202d;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyw ahyw5 = (ahyw) da.f164949b;
        bzaa.getClass();
        ahyw5.f68408q = bzaa;
        ahyw5.f68392a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        byzb byzb4 = aiaa.f68511I;
        if (byzb4 == null) {
            byzb4 = byzb.f169045j;
        }
        boolean z2 = byzb4.f169051e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyw ahyw6 = (ahyw) da.f164949b;
        ahyw6.f68392a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        ahyw6.f68409r = z2;
        byzb byzb5 = aiaa.f68511I;
        if (byzb5 == null) {
            byzb5 = byzb.f169045j;
        }
        String str6 = byzb5.f169053h;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyw ahyw7 = (ahyw) da.f164949b;
        str6.getClass();
        ahyw7.f68392a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        ahyw7.f68410s = str6;
        byzb byzb6 = aiaa.f68511I;
        if (byzb6 == null) {
            byzb6 = byzb.f169045j;
        }
        int a2 = bzap.m125587a(byzb6.f169054i);
        if (a2 != 0) {
            i6 = a2;
        }
        int i10 = i6 - 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyw ahyw8 = (ahyw) da.f164949b;
        ahyw8.f68392a |= 4194304;
        ahyw8.f68416z = i10;
        byzb byzb7 = aiaa.f68511I;
        if (byzb7 == null) {
            byzb7 = byzb.f169045j;
        }
        bxvv<bzay> bxvv = new bxvv(byzb7.f169052f, byzb.f169044g);
        bngs bngs = new bngs();
        for (bzay bzay : bxvv) {
            bngs.mo67668c(bvkm.m121206a(bzay.f169240d));
        }
        da.mo74021aa(bngs.mo67664a());
        bvki bvki = aiaa.f68512J;
        if (bvki == null) {
            bvki = bvki.f156415c;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ahyw ahyw9 = (ahyw) da.f164949b;
        bvki.getClass();
        ahyw9.f68414x = bvki;
        ahyw9.f68392a |= 1048576;
        return (ahyw) da.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public static aiaa m56705a(ahst ahst, ahxa ahxa, ahvm ahvm, String str) {
        Object obj;
        if (ahst.mo37045b() != null) {
            for (ahsu ahsu : ahst.mo37045b()) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("FastPairUtils: CachedItem: id=%s, triggerId=%s", ahsu.mo37084i(), ahsu.mo37060G());
                if (bmwb.m108443a(str, bmxx.m108578b(ahsu.mo37060G()))) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairUtils: CachedItem for %s found", str);
                    return ahsu.f67969b;
                }
            }
        }
        int i = 1;
        if (cfoj.f184966a.mo6606a().mo82126ax()) {
            ahww ahww = new ahww(ahxa, str);
            try {
                ahxa.f68275c.mo72984b();
                srn srn = ahsd.f67925a;
                obj = ahww.mo6606a();
            } catch (IllegalStateException | NullPointerException e) {
                srn srn2 = ahsd.f67925a;
                AtomicReference atomicReference = new AtomicReference();
                try {
                    ahxa.f68275c.mo72982a(new ahwz(String.format("postAndWait: %s", "getObservedDeviceInfo"), atomicReference, ahww));
                    obj = atomicReference.get();
                } catch (InterruptedException e2) {
                    bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                    bnsl.mo68437a(e2);
                    bnsl.mo68420a("postAndWait failed: %s", "getObservedDeviceInfo");
                    obj = null;
                }
            }
            bvkr bvkr = (bvkr) obj;
            if (bvkr != null) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairUtils: CachedObservedDevice: %s", str);
                return m56707a(bvkr);
            }
        }
        if (cfoj.f184966a.mo6606a().mo82110ah()) {
            long max = Math.max(cfog.f184854a.mo6606a().mo81978aM(), 1L);
            while (((long) i) <= max) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68412a("FastPairUtils: Query device information, attempt %s/%s", i, max);
                bvkr a = ahvm.mo37205a(str);
                if (a == null) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairUtils: Failed to get device for %s", str);
                    i++;
                } else {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairUtils: Get device for %s", str);
                    return m56707a(a);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static aiaa m56706a(ahyw ahyw) {
        bxvd da = aiaa.f68501K.mo74144da();
        String str = ahyw.f68393b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aiaa aiaa = (aiaa) da.f164949b;
        str.getClass();
        int i = 1;
        int i2 = aiaa.f68513a | 1;
        aiaa.f68513a = i2;
        aiaa.f68515c = str;
        long j = ahyw.f68415y;
        int i3 = i2 | 512;
        aiaa.f68513a = i3;
        aiaa.f68524l = j;
        long j2 = ahyw.f68398g;
        aiaa.f68513a = i3 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        aiaa.f68523k = j2;
        bzbk bzbk = bzbk.NEARBY_DEVICE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aiaa aiaa2 = (aiaa) da.f164949b;
        aiaa2.f68516d = bzbk.f169257h;
        int i4 = aiaa2.f68513a | 2;
        aiaa2.f68513a = i4;
        String str2 = ahyw.f68399h;
        str2.getClass();
        int i5 = i4 | 8;
        aiaa2.f68513a = i5;
        aiaa2.f68518f = str2;
        aiaa2.f68526n = 2;
        int i6 = i5 | 2048;
        aiaa2.f68513a = i6;
        String str3 = ahyw.f68397f;
        str3.getClass();
        int i7 = i6 | 32;
        aiaa2.f68513a = i7;
        aiaa2.f68520h = str3;
        String str4 = ahyw.f68400i;
        str4.getClass();
        int i8 = i7 | 4;
        aiaa2.f68513a = i8;
        aiaa2.f68517e = str4;
        aiaa2.f68525m = 1;
        aiaa2.f68513a = i8 | 1024;
        da.mo74023ac(ahsf.m56460a(601));
        String str5 = ahyw.f68393b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aiaa aiaa3 = (aiaa) da.f164949b;
        str5.getClass();
        int i9 = aiaa3.f68513a | 4194304;
        aiaa3.f68513a = i9;
        aiaa3.f68537y = str5;
        ByteString bxtx = ahyw.f68396e;
        bxtx.getClass();
        aiaa3.f68513a = i9 | 8388608;
        aiaa3.f68538z = bxtx;
        ahyt ahyt = ahyw.f68404m;
        if (ahyt == null) {
            ahyt = ahyt.f68381d;
        }
        String str6 = ahyt.f68385c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aiaa aiaa4 = (aiaa) da.f164949b;
        str6.getClass();
        int i10 = aiaa4.f68513a | 64;
        aiaa4.f68513a = i10;
        aiaa4.f68521i = str6;
        ByteString bxtx2 = ahyw.f68405n;
        bxtx2.getClass();
        aiaa4.f68513a = i10 | JGCastService.FLAG_PRIVATE_DISPLAY;
        aiaa4.f68510H = bxtx2;
        bvki bvki = ahyw.f68414x;
        if (bvki == null) {
            bvki = bvki.f156415c;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aiaa aiaa5 = (aiaa) da.f164949b;
        bvki.getClass();
        aiaa5.f68512J = bvki;
        aiaa5.f68514b |= 1;
        byza byza = (byza) byzb.f169045j.mo74144da();
        boolean z = ahyw.f68406o;
        if (byza.f164950c) {
            byza.mo74035c();
            byza.f164950c = false;
        }
        byzb byzb = (byzb) byza.f164949b;
        byzb.f169047a |= 1;
        byzb.f169048b = z;
        int a = bzbc.m125607a(ahyw.f68407p);
        if (byza.f164950c) {
            byza.mo74035c();
            byza.f164950c = false;
        }
        byzb byzb2 = (byzb) byza.f164949b;
        int i11 = a - 1;
        if (a != 0) {
            byzb2.f169049c = i11;
            byzb2.f169047a |= 2;
            bzaa bzaa = ahyw.f68408q;
            if (bzaa == null) {
                bzaa = bzaa.f169202d;
            }
            if (byza.f164950c) {
                byza.mo74035c();
                byza.f164950c = false;
            }
            byzb byzb3 = (byzb) byza.f164949b;
            bzaa.getClass();
            byzb3.f169050d = bzaa;
            int i12 = byzb3.f169047a | 4;
            byzb3.f169047a = i12;
            boolean z2 = ahyw.f68409r;
            int i13 = i12 | 8;
            byzb3.f169047a = i13;
            byzb3.f169051e = z2;
            String str7 = ahyw.f68410s;
            str7.getClass();
            byzb3.f169047a = i13 | 16;
            byzb3.f169053h = str7;
            if ((ahyw.f68392a & 4194304) != 0) {
                i = bzap.m125587a(ahyw.f68416z);
            }
            if (byza.f164950c) {
                byza.mo74035c();
                byza.f164950c = false;
            }
            byzb byzb4 = (byzb) byza.f164949b;
            int i14 = i - 1;
            if (i != 0) {
                byzb4.f169054i = i14;
                byzb4.f169047a |= 32;
                byza.mo74512a(m56711a(new bxvv(ahyw.f68411t, ahyw.f68391u)));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aiaa aiaa6 = (aiaa) da.f164949b;
                byzb byzb5 = (byzb) byza.mo74062i();
                byzb5.getClass();
                aiaa6.f68511I = byzb5;
                aiaa6.f68513a |= Integer.MIN_VALUE;
                return (aiaa) da.mo74062i();
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: b */
    public static boolean m56715b(Context context, Intent intent) {
        return context.startService(intent) != null;
    }

    /* renamed from: a */
    public static aiaa m56707a(bvkr bvkr) {
        bvkk bvkk = bvkr.f156462a;
        if (bvkk == null) {
            bvkk = bvkk.f156420q;
        }
        bxvd da = aiaa.f68501K.mo74144da();
        String a = m56708a(bvkk.f156422a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aiaa aiaa = (aiaa) da.f164949b;
        a.getClass();
        aiaa.f68513a |= 1;
        aiaa.f68515c = a;
        bzbk bzbk = bzbk.NEARBY_DEVICE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aiaa aiaa2 = (aiaa) da.f164949b;
        aiaa2.f68516d = bzbk.f169257h;
        int i = 2;
        int i2 = aiaa2.f68513a | 2;
        aiaa2.f68513a = i2;
        String str = bvkk.f156424c;
        str.getClass();
        int i3 = i2 | 8;
        aiaa2.f68513a = i3;
        aiaa2.f68518f = str;
        String str2 = bvkk.f156423b;
        str2.getClass();
        aiaa2.f68513a = i3 | 32;
        aiaa2.f68520h = str2;
        bvku bvku = bvkr.f156464c;
        if (bvku == null) {
            bvku = bvku.f156466c;
        }
        String str3 = bvku.f156469b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aiaa aiaa3 = (aiaa) da.f164949b;
        str3.getClass();
        int i4 = aiaa3.f68513a | 64;
        aiaa3.f68513a = i4;
        aiaa3.f68521i = str3;
        aiaa3.f68526n = 2;
        aiaa3.f68513a = i4 | 2048;
        String a2 = m56708a(bvkk.f156422a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aiaa aiaa4 = (aiaa) da.f164949b;
        a2.getClass();
        int i5 = aiaa4.f68513a | 4194304;
        aiaa4.f68513a = i5;
        aiaa4.f68537y = a2;
        ByteString bxtx = bvkr.f156463b;
        bxtx.getClass();
        aiaa4.f68513a = 8388608 | i5;
        aiaa4.f68538z = bxtx;
        bvkh bvkh = bvkk.f156427f;
        if (bvkh == null) {
            bvkh = bvkh.f156412b;
        }
        ByteString bxtx2 = bvkh.f156414a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aiaa aiaa5 = (aiaa) da.f164949b;
        bxtx2.getClass();
        aiaa5.f68513a |= JGCastService.FLAG_PRIVATE_DISPLAY;
        aiaa5.f68510H = bxtx2;
        bvki bvki = bvkk.f156436p;
        if (bvki == null) {
            bvki = bvki.f156415c;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aiaa aiaa6 = (aiaa) da.f164949b;
        bvki.getClass();
        aiaa6.f68512J = bvki;
        aiaa6.f68514b |= 1;
        byza byza = (byza) byzb.f169045j.mo74144da();
        boolean z = bvkk.f156432k;
        if (byza.f164950c) {
            byza.mo74035c();
            byza.f164950c = false;
        }
        byzb byzb = (byzb) byza.f164949b;
        byzb.f169047a |= 1;
        byzb.f169048b = z;
        int i6 = bvkk.f156429h;
        int i7 = i6 != 0 ? i6 != 1 ? i6 != 2 ? 0 : 4 : 3 : 2;
        if (i7 == 0) {
            i7 = 1;
        }
        if (i7 != 1) {
            int a3 = bzbc.m125607a(i7 - 2);
            if (byza.f164950c) {
                byza.mo74035c();
                byza.f164950c = false;
            }
            byzb byzb2 = (byzb) byza.f164949b;
            int i8 = a3 - 1;
            if (a3 != 0) {
                byzb2.f169049c = i8;
                byzb2.f169047a |= 2;
                bzaa bzaa = bvkk.f156430i;
                if (bzaa == null) {
                    bzaa = bzaa.f169202d;
                }
                if (byza.f164950c) {
                    byza.mo74035c();
                    byza.f164950c = false;
                }
                byzb byzb3 = (byzb) byza.f164949b;
                bzaa.getClass();
                byzb3.f169050d = bzaa;
                int i9 = byzb3.f169047a | 4;
                byzb3.f169047a = i9;
                boolean z2 = bvkk.f156431j;
                byzb3.f169047a = i9 | 8;
                byzb3.f169051e = z2;
                byza.mo74512a(m56711a(new bxvv(bvkk.f156434m, bvkk.f156419n)));
                String str4 = bvkk.f156433l;
                if (byza.f164950c) {
                    byza.mo74035c();
                    byza.f164950c = false;
                }
                byzb byzb4 = (byzb) byza.f164949b;
                str4.getClass();
                byzb4.f169047a |= 16;
                byzb4.f169053h = str4;
                switch (bvkk.f156428g) {
                    case 0:
                        break;
                    case 1:
                        i = 3;
                        break;
                    case 2:
                        i = 4;
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 6;
                        break;
                    case 5:
                        i = 7;
                        break;
                    case 6:
                        i = 8;
                        break;
                    case 7:
                        i = 9;
                        break;
                    case 8:
                        i = 10;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == 0) {
                    i = 1;
                }
                if (i != 1) {
                    int a4 = bzap.m125587a(i - 2);
                    if (byza.f164950c) {
                        byza.mo74035c();
                        byza.f164950c = false;
                    }
                    byzb byzb5 = (byzb) byza.f164949b;
                    int i10 = a4 - 1;
                    if (a4 != 0) {
                        byzb5.f169054i = i10;
                        byzb5.f169047a |= 32;
                        byzb byzb6 = (byzb) byza.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        aiaa aiaa7 = (aiaa) da.f164949b;
                        byzb6.getClass();
                        aiaa7.f68511I = byzb6;
                        aiaa7.f68513a |= Integer.MIN_VALUE;
                        return (aiaa) da.mo74062i();
                    }
                    throw null;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            throw null;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: a */
    private static String m56708a(long j) {
        byte[] b = bqcr.m112599b(j);
        int length = b.length;
        return boan.f132472f.mo68794a(Arrays.copyOfRange(b, length - 3, length));
    }

    /* renamed from: a */
    public static String m56709a(aiaa aiaa) {
        return m56710a(aiaa.f68518f);
    }

    /* renamed from: a */
    public static String m56710a(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (parseUri.getAction().equals("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR")) {
                return parseUri.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP");
            }
            srn srn = ahsd.f67925a;
            return null;
        } catch (URISyntaxException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68405a("FastPair: fail to get companion app info from discovery item");
            return null;
        }
    }

    /* renamed from: a */
    private static List m56711a(List list) {
        bngs bngs = new bngs();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bngs.mo67668c(bzay.m125601a(((bvkm) it.next()).mo3214a()));
        }
        return bngs.mo67664a();
    }

    /* renamed from: a */
    public static boolean m56712a(Context context, Intent intent) {
        int i;
        try {
            if (!cfom.m141867b()) {
                i = 0;
            } else {
                i = AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            }
            context.startActivity(intent.setFlags(i | 268435456));
            return true;
        } catch (ActivityNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m56713a(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
