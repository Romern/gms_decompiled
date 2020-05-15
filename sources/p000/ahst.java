package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ahst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahst {

    /* renamed from: a */
    public final sqv f67959a;

    /* renamed from: b */
    public final ahsv f67960b;

    /* renamed from: c */
    public final ahsx f67961c;

    /* renamed from: d */
    public final ahua f67962d;

    /* renamed from: e */
    public final Context f67963e;

    /* renamed from: f */
    public final buqh f67964f;

    /* renamed from: g */
    public final burh f67965g;

    /* renamed from: h */
    public boolean f67966h = true;

    public ahst(Context context) {
        this.f67959a = (sqv) ahgz.m55754a(context, sqv.class);
        this.f67960b = new ahsv(context);
        this.f67961c = new ahsx(context);
        this.f67962d = new ahua(context);
        this.f67963e = context;
        this.f67964f = (buqh) ahgz.m55754a(context, buqh.class);
        this.f67965g = (burh) ahgz.m55754a(context, burh.class);
        m56488f();
    }

    /* renamed from: a */
    private final Object m56485a(String str, bmzi bmzi) {
        if (mo37053e()) {
            srn srn = ahsd.f67925a;
            return bmzi.mo6606a();
        }
        srn srn2 = ahsd.f67925a;
        AtomicReference atomicReference = new AtomicReference();
        try {
            this.f67964f.mo72982a(new ahsr(String.format("postAndWait: %s", str), atomicReference, bmzi));
            return atomicReference.get();
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("postAndWait failed: %s", str);
            return null;
        }
    }

    /* renamed from: b */
    public static String m56487b(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    /* renamed from: f */
    public static void m56488f() {
        if (cfoj.f184966a.mo6606a().mo82063N()) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            srn srn = ahsd.f67925a;
            int length = stackTrace.length;
            for (int i = 1; i < stackTrace.length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                stackTraceElement.getClassName();
                stackTraceElement.getMethodName();
                stackTraceElement.getFileName();
                stackTraceElement.getLineNumber();
            }
        }
    }

    /* renamed from: c */
    public final List mo37048c() {
        return mo37034a(this.f67960b.mo36468d());
    }

    /* renamed from: d */
    public final List mo37050d() {
        ahua ahua = this.f67962d;
        ahua.getClass();
        return (List) m56485a("getAllFastPairItems", new ahsm(ahua));
    }

    /* renamed from: e */
    public final ahsu mo37052e(String str) {
        aiaa aiaa = (aiaa) this.f67960b.mo36459a(str);
        if (aiaa != null) {
            return new ahsu(this.f67963e, aiaa);
        }
        return null;
    }

    /* renamed from: b */
    public final int mo37044b(String str) {
        int i = 0;
        for (ahyz ahyz : mo37050d()) {
            if (bmwb.m108443a(str, ahyz.f68437k)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public final void mo37049c(String str) {
        m56485a("deleteFastPairItem", new ahsn(this, str));
        srn srn = ahsd.f67925a;
    }

    /* renamed from: d */
    public final boolean mo37051d(String str) {
        return this.f67962d.mo36465b(str);
    }

    /* renamed from: b */
    public final List mo37045b() {
        return (List) m56485a("getCurrentDiscoveryItems", new ahsj(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo37053e() {
        try {
            this.f67964f.mo72984b();
            srn srn = ahsd.f67925a;
            return true;
        } catch (IllegalStateException | NullPointerException e) {
            srn srn2 = ahsd.f67925a;
            return false;
        }
    }

    /* renamed from: b */
    public final void mo37046b(ahsu ahsu) {
        this.f67960b.mo36470e(ahsu.f67969b);
    }

    /* renamed from: b */
    public final void mo37047b(ahyz ahyz) {
        if (this.f67962d.mo36459a(ahyz.f68428b) != null) {
            mo37051d(ahyz.f68428b);
        }
        ahyz a = mo37032a(ahyz.f68429c);
        if (a != null) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: Delete item from cache: %s due to duplicated account key", a.f68428b);
            mo37051d(a.f68428b);
        }
        this.f67962d.mo36470e(ahyz);
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: Saved the device (%s) to local cache.", ahyz.f68428b);
    }

    /* renamed from: a */
    public static String m56486a(ahsu ahsu) {
        if (ahsu.mo37061H() == 0) {
            return String.format("[Invalid | %s] ", ahsu.mo37071b());
        }
        bzbk bzbk = bzbk.NEARBY_TYPE_UNKNOWN;
        int H = ahsu.mo37061H();
        int i = H - 1;
        if (H == 0) {
            throw null;
        } else if (i == 0) {
            return "[Evaluating...] ";
        } else {
            if (i == 1) {
                return "[Notification] ";
            }
            if (i != 2) {
                return String.format("[Invalid | %s] ", ahsu.mo37071b());
            }
            return String.format("[List View | %s] ", ahsu.mo37071b());
        }
    }

    /* renamed from: a */
    public final ahyz mo37032a(ByteString bxtx) {
        return (ahyz) m56485a("getFastPairItemByAccountKey", new ahsl(this, bxtx));
    }

    /* renamed from: a */
    public final ahyz mo37033a(String str) {
        return (ahyz) m56485a("getFastPairItem", new ahsk(this, str));
    }

    /* renamed from: a */
    public final List mo37034a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new ahsu(this.f67963e, (aiaa) it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo37035a() {
        this.f67964f.mo72984b();
        this.f67960b.mo37106e();
        this.f67961c.mo37106e();
    }

    /* renamed from: a */
    public final void mo37036a(ahyz ahyz) {
        if (mo37053e()) {
            mo37047b(ahyz);
        } else {
            this.f67964f.mo72987c(new ahsq(this, "putFastPairItem", ahyz));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, java.lang.String, boolean]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void */
    /* renamed from: a */
    public final void mo37037a(ahyz ahyz, boolean z) {
        ahyz a = mo37033a(ahyz.f68428b);
        if (a == null) {
            return;
        }
        if ((a.f68427a & 2048) != 0 && a.f68440o == z) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68431a("FastPair: updateFastPairItemFmaState for device (%s), skip because of same state(%s).", (Object) a.f68428b, z);
            return;
        }
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ahyz ahyz2 = (ahyz) bxvd.f164949b;
        ahyz2.f68427a |= 2048;
        ahyz2.f68440o = z;
        mo37036a((ahyz) bxvd.mo74062i());
        ((bnsl) ahsd.f67925a.mo68390d()).mo68431a("FastPair: updateFastPairItemFmaState for device (%s), update to (%s).", (Object) a.f68428b, z);
    }

    /* renamed from: a */
    public final void mo37038a(ahyz ahyz, boolean z, int i) {
        ahyz a = mo37033a(ahyz.f68428b);
        if (a != null) {
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ahyz ahyz2 = (ahyz) bxvd.f164949b;
            int i2 = ahyz2.f68427a | 8;
            ahyz2.f68427a = i2;
            ahyz2.f68431e = i;
            ahyz2.f68427a = i2 | 4;
            ahyz2.f68430d = z;
            mo37036a((ahyz) bxvd.mo74062i());
            srn srn = ahsd.f67925a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04e7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0214  */
    /* renamed from: a */
    public final void mo37039a(bxvd bxvd) {
        bxvd bxvd2;
        bzbk a;
        bzbk a2;
        int ordinal;
        aiaa aiaa;
        bxvd bxvd3;
        Long l;
        Integer num;
        Long l2;
        Long l3;
        Integer num2;
        Integer num3;
        bzbk bzbk;
        GeneratedMessageLite GeneratedMessageLite;
        if (bxvd != null) {
            srn srn = ahsd.f67925a;
            bzbk a3 = bzbk.m125615a(((aiac) bxvd.f164949b).f68548c);
            if (a3 == null) {
                a3 = bzbk.NEARBY_TYPE_UNKNOWN;
            }
            if (!ahsu.m56522b(a3)) {
                int i = ((aiac) bxvd.f164949b).f68546a & 2;
                return;
            }
            bzbk a4 = bzbk.m125615a(((aiac) bxvd.f164949b).f68548c);
            if (a4 == null) {
                a4 = bzbk.NEARBY_TYPE_UNKNOWN;
            }
            if (ahsu.m56519a(a4)) {
                aiac aiac = (aiac) bxvd.f164949b;
                if ((aiac.f68546a & 8) != 0) {
                    bzbk a5 = bzbk.m125615a(aiac.f68548c);
                    if (a5 == null) {
                        a5 = bzbk.NEARBY_TYPE_UNKNOWN;
                    }
                    if (a5 != bzbk.NEARBY_CHROMECAST || ((long) ((aiac) bxvd.f164949b).f68550e) >= cfod.f184793a.mo6606a().mo81922k()) {
                        bzbk a6 = bzbk.m125615a(((aiac) bxvd.f164949b).f68548c);
                        if (a6 == null) {
                            a6 = bzbk.NEARBY_TYPE_UNKNOWN;
                        }
                        if (a6 == bzbk.NEARBY_WEAR && ((long) ((aiac) bxvd.f164949b).f68550e) < cfod.f184793a.mo6606a().mo81912ag()) {
                            GeneratedMessageLite = bxvd.f164949b;
                        }
                    } else {
                        GeneratedMessageLite = bxvd.f164949b;
                    }
                    aiac aiac2 = (aiac) GeneratedMessageLite;
                    return;
                }
            }
            aiac aiac3 = (aiac) this.f67961c.mo36459a(((aiac) bxvd.f164949b).f68547b);
            if (aiac3 != null) {
                if ((((aiac) bxvd.f164949b).f68546a & 4) == 0 && (aiac3.f68546a & 4) != 0) {
                    String str = aiac3.f68549d;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    aiac aiac4 = (aiac) bxvd.f164949b;
                    str.getClass();
                    aiac4.f68546a |= 4;
                    aiac4.f68549d = str;
                }
                if ((((aiac) bxvd.f164949b).f68546a & 8) == 0 && (aiac3.f68546a & 8) != 0) {
                    int i2 = aiac3.f68550e;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    aiac aiac5 = (aiac) bxvd.f164949b;
                    aiac5.f68546a |= 8;
                    aiac5.f68550e = i2;
                }
                if ((((aiac) bxvd.f164949b).f68546a & 16) == 0 && (aiac3.f68546a & 16) != 0) {
                    int i3 = aiac3.f68551f;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    aiac aiac6 = (aiac) bxvd.f164949b;
                    aiac6.f68546a |= 16;
                    aiac6.f68551f = i3;
                }
                if ((aiac3.f68546a & 128) != 0) {
                    long j = aiac3.f68554i;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    aiac aiac7 = (aiac) bxvd.f164949b;
                    aiac7.f68546a |= 128;
                    aiac7.f68554i = j;
                }
            }
            aiac aiac8 = (aiac) bxvd.mo74062i();
            bxvd bxvd4 = (bxvd) aiac8.mo74142c(5);
            bxvd4.mo73625a((GeneratedMessageLite) aiac8);
            aiac aiac9 = (aiac) bxvd4.f164949b;
            if ((aiac9.f68546a & 4) != 0) {
                bzbk a7 = bzbk.m125615a(aiac9.f68548c);
                if (a7 == null) {
                    a7 = bzbk.NEARBY_TYPE_UNKNOWN;
                }
                int ordinal2 = a7.ordinal();
                Integer num4 = null;
                if (ordinal2 != 3) {
                    if (ordinal2 != 4) {
                        bnsl bnsl = (bnsl) ahsd.f67925a.mo68387b();
                        aiac aiac10 = (aiac) bxvd4.f164949b;
                        if ((aiac10.f68546a & 2) != 0) {
                            bzbk = bzbk.m125615a(aiac10.f68548c);
                            if (bzbk == null) {
                                bzbk = bzbk.NEARBY_TYPE_UNKNOWN;
                            }
                        } else {
                            bzbk = null;
                        }
                        bnsl.mo68420a("Unknown device type %s", bzbk);
                        this.f67961c.mo36470e((aiac) bxvd4.mo74062i());
                        ahsv ahsv = this.f67960b;
                        aiac aiac11 = (aiac) bxvd4.mo74062i();
                        aiaa a8 = ahsu.m56514a();
                        bxvd2 = (bxvd) a8.mo74142c(5);
                        bxvd2.mo73625a((GeneratedMessageLite) a8);
                        a = bzbk.m125615a(aiac11.f68548c);
                        if (a == null) {
                            a = bzbk.NEARBY_TYPE_UNKNOWN;
                        }
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        aiaa aiaa2 = (aiaa) bxvd2.f164949b;
                        aiaa aiaa3 = aiaa.f68501K;
                        aiaa2.f68516d = a.f169257h;
                        aiaa2.f68513a |= 2;
                        a2 = bzbk.m125615a(aiac11.f68548c);
                        if (a2 == null) {
                            a2 = bzbk.NEARBY_TYPE_UNKNOWN;
                        }
                        ordinal = a2.ordinal();
                        if (ordinal == 3) {
                            String b = cfod.m141142b();
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            aiaa aiaa4 = (aiaa) bxvd2.f164949b;
                            b.getClass();
                            int i4 = aiaa4.f68513a | 8;
                            aiaa4.f68513a = i4;
                            aiaa4.f68518f = b;
                            "cc_com.google.android.apps.chromecast.app".getClass();
                            aiaa4.f68513a = i4 | 1;
                            aiaa4.f68515c = "cc_com.google.android.apps.chromecast.app";
                            aiaa = (aiaa) bxvd2.mo74062i();
                        } else if (ordinal != 4) {
                            aiaa = null;
                        } else {
                            String c = cfod.f184793a.mo6606a().mo81914c();
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            aiaa aiaa5 = (aiaa) bxvd2.f164949b;
                            c.getClass();
                            int i5 = aiaa5.f68513a | 8;
                            aiaa5.f68513a = i5;
                            aiaa5.f68518f = c;
                            "wear_com.google.android.wearable.app".getClass();
                            aiaa5.f68513a = i5 | 1;
                            aiaa5.f68515c = "wear_com.google.android.wearable.app";
                            aiaa = (aiaa) bxvd2.mo74062i();
                        }
                        if (aiaa != null) {
                            bxvd3 = (bxvd) aiaa.mo74142c(5);
                            bxvd3.mo73625a((GeneratedMessageLite) aiaa);
                            if ((aiac11.f68546a & 128) != 0) {
                                l2 = Long.valueOf(aiac11.f68554i);
                            } else {
                                l2 = null;
                            }
                            if (l2 != null) {
                                long longValue = l2.longValue();
                                if (bxvd3.f164950c) {
                                    bxvd3.mo74035c();
                                    bxvd3.f164950c = false;
                                }
                                aiaa aiaa6 = (aiaa) bxvd3.f164949b;
                                aiaa6.f68513a |= 512;
                                aiaa6.f68524l = longValue;
                            } else {
                                if (bxvd3.f164950c) {
                                    bxvd3.mo74035c();
                                    bxvd3.f164950c = false;
                                }
                                aiaa aiaa7 = (aiaa) bxvd3.f164949b;
                                aiaa7.f68513a &= -513;
                                aiaa7.f68524l = 0;
                            }
                            if ((aiac11.f68546a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                l3 = Long.valueOf(aiac11.f68555j);
                            } else {
                                l3 = null;
                            }
                            if (l3 != null) {
                                long longValue2 = l3.longValue();
                                if (bxvd3.f164950c) {
                                    bxvd3.mo74035c();
                                    bxvd3.f164950c = false;
                                }
                                aiaa aiaa8 = (aiaa) bxvd3.f164949b;
                                aiaa8.f68513a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                aiaa8.f68523k = longValue2;
                            } else {
                                if (bxvd3.f164950c) {
                                    bxvd3.mo74035c();
                                    bxvd3.f164950c = false;
                                }
                                aiaa aiaa9 = (aiaa) bxvd3.f164949b;
                                aiaa9.f68513a &= -257;
                                aiaa9.f68523k = 0;
                            }
                            String str2 = aiac11.f68549d;
                            aiaa aiaa10 = (aiaa) bxvd3.f164949b;
                            str2.getClass();
                            aiaa10.f68513a |= 4;
                            aiaa10.f68517e = str2;
                            if ((aiac11.f68546a & 8) != 0) {
                                num2 = Integer.valueOf(aiac11.f68550e);
                            } else {
                                num2 = null;
                            }
                            if (num2 != null) {
                                int intValue = num2.intValue();
                                if (bxvd3.f164950c) {
                                    bxvd3.mo74035c();
                                    bxvd3.f164950c = false;
                                }
                                aiaa aiaa11 = (aiaa) bxvd3.f164949b;
                                aiaa11.f68513a |= 8192;
                                aiaa11.f68528p = intValue;
                            } else {
                                if (bxvd3.f164950c) {
                                    bxvd3.mo74035c();
                                    bxvd3.f164950c = false;
                                }
                                aiaa aiaa12 = (aiaa) bxvd3.f164949b;
                                aiaa12.f68513a &= -8193;
                                aiaa12.f68528p = 0;
                            }
                            if ((aiac11.f68546a & 16) != 0) {
                                num3 = Integer.valueOf(aiac11.f68551f);
                            } else {
                                num3 = null;
                            }
                            if (num3 != null) {
                                int intValue2 = num3.intValue();
                                if (bxvd3.f164950c) {
                                    bxvd3.mo74035c();
                                    bxvd3.f164950c = false;
                                }
                                aiaa aiaa13 = (aiaa) bxvd3.f164949b;
                                aiaa13.f68513a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                aiaa13.f68529q = intValue2;
                            } else {
                                if (bxvd3.f164950c) {
                                    bxvd3.mo74035c();
                                    bxvd3.f164950c = false;
                                }
                                aiaa aiaa14 = (aiaa) bxvd3.f164949b;
                                aiaa14.f68513a &= -16385;
                                aiaa14.f68529q = 0;
                            }
                            ((aiaa) bxvd3.f164949b).f68505C = GeneratedMessageLite.m124030de();
                            bxvd3.mo74023ac(ahsf.m56460a(501));
                        } else {
                            bxvd3 = null;
                        }
                        if (bxvd3 != null) {
                            aiaa aiaa15 = (aiaa) ahsv.mo36459a(((aiaa) bxvd3.f164949b).f68515c);
                            if (aiaa15 != null) {
                                bxvd3 = (bxvd) aiaa15.mo74142c(5);
                                bxvd3.mo73625a((GeneratedMessageLite) aiaa15);
                                bzbk a9 = bzbk.m125615a(aiac11.f68548c);
                                if (a9 == null) {
                                    a9 = bzbk.NEARBY_TYPE_UNKNOWN;
                                }
                                if (bxvd3.f164950c) {
                                    bxvd3.mo74035c();
                                    bxvd3.f164950c = false;
                                }
                                aiaa aiaa16 = (aiaa) bxvd3.f164949b;
                                aiaa16.f68516d = a9.f169257h;
                                int i6 = aiaa16.f68513a | 2;
                                aiaa16.f68513a = i6;
                                String str3 = aiac11.f68549d;
                                str3.getClass();
                                aiaa16.f68513a = i6 | 4;
                                aiaa16.f68517e = str3;
                                if ((aiac11.f68546a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                    l = Long.valueOf(aiac11.f68555j);
                                } else {
                                    l = null;
                                }
                                if (l != null) {
                                    long longValue3 = l.longValue();
                                    if (bxvd3.f164950c) {
                                        bxvd3.mo74035c();
                                        bxvd3.f164950c = false;
                                    }
                                    aiaa aiaa17 = (aiaa) bxvd3.f164949b;
                                    aiaa17.f68513a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    aiaa17.f68523k = longValue3;
                                } else {
                                    if (bxvd3.f164950c) {
                                        bxvd3.mo74035c();
                                        bxvd3.f164950c = false;
                                    }
                                    aiaa aiaa18 = (aiaa) bxvd3.f164949b;
                                    aiaa18.f68513a &= -257;
                                    aiaa18.f68523k = 0;
                                }
                                if ((aiac11.f68546a & 8) != 0) {
                                    num = Integer.valueOf(aiac11.f68550e);
                                } else {
                                    num = null;
                                }
                                if (num != null) {
                                    int intValue3 = num.intValue();
                                    if (bxvd3.f164950c) {
                                        bxvd3.mo74035c();
                                        bxvd3.f164950c = false;
                                    }
                                    aiaa aiaa19 = (aiaa) bxvd3.f164949b;
                                    aiaa19.f68513a |= 8192;
                                    aiaa19.f68528p = intValue3;
                                } else {
                                    if (bxvd3.f164950c) {
                                        bxvd3.mo74035c();
                                        bxvd3.f164950c = false;
                                    }
                                    aiaa aiaa20 = (aiaa) bxvd3.f164949b;
                                    aiaa20.f68513a &= -8193;
                                    aiaa20.f68528p = 0;
                                }
                                if ((aiac11.f68546a & 16) != 0) {
                                    num4 = Integer.valueOf(aiac11.f68551f);
                                }
                                if (num4 != null) {
                                    int intValue4 = num4.intValue();
                                    if (bxvd3.f164950c) {
                                        bxvd3.mo74035c();
                                        bxvd3.f164950c = false;
                                    }
                                    aiaa aiaa21 = (aiaa) bxvd3.f164949b;
                                    aiaa21.f68513a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                    aiaa21.f68529q = intValue4;
                                } else {
                                    if (bxvd3.f164950c) {
                                        bxvd3.mo74035c();
                                        bxvd3.f164950c = false;
                                    }
                                    aiaa aiaa22 = (aiaa) bxvd3.f164949b;
                                    aiaa22.f68513a &= -16385;
                                    aiaa22.f68529q = 0;
                                }
                            }
                            ahsv.mo36470e((aiaa) bxvd3.mo74062i());
                            return;
                        }
                        return;
                    }
                } else if (cfod.f184793a.mo6606a().mo81906aa() && ahsy.m56584b(((aiac) bxvd4.f164949b).f68553h)) {
                    if (((long) ((aiac) bxvd4.f164949b).f68553h) > cfod.m141145e()) {
                        aiac aiac12 = (aiac) bxvd4.f164949b;
                        return;
                    }
                    this.f67961c.mo36470e((aiac) bxvd4.mo74062i());
                    ahsv ahsv2 = this.f67960b;
                    aiac aiac112 = (aiac) bxvd4.mo74062i();
                    aiaa a82 = ahsu.m56514a();
                    bxvd2 = (bxvd) a82.mo74142c(5);
                    bxvd2.mo73625a((GeneratedMessageLite) a82);
                    a = bzbk.m125615a(aiac112.f68548c);
                    if (a == null) {
                    }
                    if (bxvd2.f164950c) {
                    }
                    aiaa aiaa23 = (aiaa) bxvd2.f164949b;
                    aiaa aiaa32 = aiaa.f68501K;
                    aiaa23.f68516d = a.f169257h;
                    aiaa23.f68513a |= 2;
                    a2 = bzbk.m125615a(aiac112.f68548c);
                    if (a2 == null) {
                    }
                    ordinal = a2.ordinal();
                    if (ordinal == 3) {
                    }
                    if (aiaa != null) {
                    }
                    if (bxvd3 != null) {
                    }
                }
                aiac aiac13 = (aiac) bxvd4.mo74062i();
                if ((aiac13.f68546a & 128) != 0 && this.f67959a.mo20505a() - aiac13.f68554i > cfod.m141145e() * 60000) {
                    aiac aiac14 = (aiac) bxvd4.f164949b;
                    return;
                }
                this.f67961c.mo36470e((aiac) bxvd4.mo74062i());
                ahsv ahsv22 = this.f67960b;
                aiac aiac1122 = (aiac) bxvd4.mo74062i();
                aiaa a822 = ahsu.m56514a();
                bxvd2 = (bxvd) a822.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) a822);
                a = bzbk.m125615a(aiac1122.f68548c);
                if (a == null) {
                }
                if (bxvd2.f164950c) {
                }
                aiaa aiaa232 = (aiaa) bxvd2.f164949b;
                aiaa aiaa322 = aiaa.f68501K;
                aiaa232.f68516d = a.f169257h;
                aiaa232.f68513a |= 2;
                a2 = bzbk.m125615a(aiac1122.f68548c);
                if (a2 == null) {
                }
                ordinal = a2.ordinal();
                if (ordinal == 3) {
                }
                if (aiaa != null) {
                }
                if (bxvd3 != null) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo37040a(String str, int i) {
        srn srn = ahsd.f67925a;
        ahsu e = mo37052e(str);
        if (e != null) {
            e.mo37072b(i);
        }
    }

    /* renamed from: a */
    public final void mo37041a(String str, String str2) {
        ahyz a = mo37033a(str);
        if (a == null || TextUtils.isEmpty(str2)) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: update fastPairItem fail with no valid update info");
            return;
        }
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ahyz ahyz = (ahyz) bxvd.f164949b;
        str2.getClass();
        ahyz.f68427a |= 16;
        ahyz.f68432f = str2;
        long a2 = ((sqv) ahgz.m55754a(this.f67963e, sqv.class)).mo20505a();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ahyz ahyz2 = (ahyz) bxvd.f164949b;
        int i = ahyz2.f68427a | 128;
        ahyz2.f68427a = i;
        ahyz2.f68435i = a2;
        ahyz2.f68427a = i | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        ahyz2.f68436j = true;
        mo37036a((ahyz) bxvd.mo74062i());
    }

    /* renamed from: a */
    public final void mo37042a(String str, boolean z) {
        ahyz a = mo37033a(str);
        if (a != null) {
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            long a2 = ((sqv) ahgz.m55754a(this.f67963e, sqv.class)).mo20505a();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ahyz ahyz = (ahyz) bxvd.f164949b;
            int i = ahyz.f68427a | 64;
            ahyz.f68427a = i;
            ahyz.f68434h = a2;
            ahyz.f68427a = i | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            ahyz.f68436j = z;
            mo37036a((ahyz) bxvd.mo74062i());
            srn srn = ahsd.f67925a;
        }
    }

    /* renamed from: a */
    public final void mo37043a(List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            mo37040a((String) list.get(i2), i);
        }
    }
}
