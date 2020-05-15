package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: zwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zwa implements axou {

    /* renamed from: a */
    private static final srn f56040a = zvt.m46581a();

    /* renamed from: b */
    private final Context f56041b;

    /* renamed from: c */
    private final zrg f56042c;

    /* renamed from: d */
    private final zwc f56043d;

    /* renamed from: e */
    private final caaq f56044e;

    /* renamed from: f */
    private final sqv f56045f;

    /* renamed from: g */
    private final rjx f56046g;

    public zwa(Context context, zrg zrg, rjx rjx, zwc zwc, sqv sqv) {
        this.f56041b = context;
        this.f56042c = zrg;
        this.f56046g = rjx;
        this.f56043d = zwc;
        this.f56044e = zvn.m46574a(context);
        this.f56045f = sqv;
    }

    /* renamed from: a */
    private static caae m46591a(String str, Map map, zre zre) {
        if (str.isEmpty()) {
            return null;
        }
        caae caae = (caae) map.get(str);
        if (caae != null) {
            return caae;
        }
        caae a = zre.mo31377a(str);
        if (a == null) {
            bnsl bnsl = (bnsl) f56040a.mo68388c();
            bnsl.mo68432a("zwa", "a", 768, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("WearableSyncHostService unable to find dataSource: %s", str);
            return null;
        }
        map.put(str, a);
        return a;
    }

    /* renamed from: b */
    public static String[] m46601b(MessageEventParcelable messageEventParcelable) {
        return messageEventParcelable.f110947b.substring(15).split("/", 3);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(java.util.Set, long, long, boolean):void
     arg types: [bnic, long, long, int]
     candidates:
      zrc.a(caae, long, long, int):cadp
      zrc.a(long, long, caae, boolean):void
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(caae, java.util.List, boolean):void
     arg types: [caae, bngx, int]
     candidates:
      zrc.a(caae, long, int):cadp
      zrc.a(caae, long, long):cadp
      zrc.a(caae, java.util.List, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0105, code lost:
        if (r4.equals("/WearablesSync/UploadBatchData/") != false) goto L_0x0127;
     */
    /* renamed from: c */
    private final boolean m46602c(MessageEventParcelable messageEventParcelable) {
        String str;
        int i;
        String str2;
        int i2;
        long j;
        long j2;
        cabc cabc;
        caae caae;
        String str3;
        String str4;
        boolean z;
        long j3;
        bngs bngs;
        zrb zrb;
        long j4;
        zrb zrb2;
        String str5;
        cadz cadz;
        MessageEventParcelable messageEventParcelable2 = messageEventParcelable;
        String[] b = m46601b(messageEventParcelable);
        String str6 = b[0];
        char c = 16;
        StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 16);
        sb.append("/WearablesSync/");
        sb.append(str6);
        sb.append("/");
        String sb2 = sb.toString();
        int length = b.length;
        String str7 = length > 2 ? b[1] : null;
        if (length <= 2) {
            str = b[1];
        } else {
            str = b[2];
        }
        zre c2 = this.f56042c.mo30877c(str);
        zrk e = this.f56042c.mo30880e(str);
        int i3 = 5;
        switch (sb2.hashCode()) {
            case -2064704653:
                if (sb2.equals("/WearablesSync/DataPointsChangeSet/")) {
                    c = 13;
                    break;
                }
                c = 65535;
                break;
            case -1946385522:
                if (sb2.equals("/WearablesSync/GetDataSources/")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1700460151:
                if (sb2.equals("/WearablesSync/DataSourcesResponse/")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1676919147:
                break;
            case -1146361132:
                if (sb2.equals("/WearablesSync/UploadBatchResponseData/")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -975373646:
                if (sb2.equals("/WearablesSync/DataPoint/")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -308287469:
                if (sb2.equals("/WearablesSync/ListChanges/")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 37833191:
                if (sb2.equals("/WearablesSync/ChangeLogs/")) {
                    c = 12;
                    break;
                }
                c = 65535;
                break;
            case 241667407:
                if (sb2.equals("/WearablesSync/Ack/")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case 249053386:
                if (sb2.equals("/WearablesSync/DataSources/")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 766343652:
                if (sb2.equals("/WearablesSync/SessionList/")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1218520761:
                if (sb2.equals("/WearablesSync/ForceWearableSync/")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1541484866:
                if (sb2.equals("/WearablesSync/Subscriptions/")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1621498306:
                if (sb2.equals("/WearablesSync/DataSourcesChangeSet/")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1835579573:
                if (sb2.equals("/WearablesSync/GetDataPoints/")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1988158581:
                if (sb2.equals("/WearablesSync/HealthStats/")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case 2020023587:
                if (sb2.equals("/WearablesSync/SessionsChangeSet/")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2045222563:
                if (sb2.equals("/WearablesSync/GetChangeLogs/")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2068647941:
                if (sb2.equals("/WearablesSync/GetSessions/")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str8 = sb2;
        switch (c) {
            case 0:
                bxwc bxwc = ((cabd) GeneratedMessageLite.m124016a(cabd.f172424b, messageEventParcelable2.f110948c, bxus.m123744c())).f172426a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = new HashMap();
                ArrayList arrayList3 = new ArrayList(bxwc.size());
                int size = bxwc.size();
                int i4 = 0;
                long j5 = Long.MAX_VALUE;
                while (i4 < size) {
                    cabc cabc2 = (cabc) bxwc.get(i4);
                    int a = cabf.m126442a(cabc2.f172414b);
                    if (a == 0) {
                        str2 = str;
                        i = i4;
                        i2 = size;
                        j = j5;
                        cabc = cabc2;
                    } else if (a != 4) {
                        str2 = str;
                        i = i4;
                        i2 = size;
                        j = j5;
                        cabc = cabc2;
                    } else if (!cabc2.f172416d.isEmpty()) {
                        str2 = str;
                        i = i4;
                        i2 = size;
                        j = j5;
                        cabc = cabc2;
                    } else if (cabc2.f172422j.size() > 0) {
                        bnic a2 = bnic.m109495a((Collection) cabc2.f172422j);
                        caby caby = cabc2.f172421i;
                        if (caby == null) {
                            caby = caby.f172491d;
                        }
                        str2 = str;
                        long j6 = caby.f172494b;
                        caby caby2 = cabc2.f172421i;
                        if (caby2 == null) {
                            caby2 = caby.f172491d;
                        }
                        i = i4;
                        i2 = size;
                        j = j5;
                        cabc = cabc2;
                        c2.mo31370a((Set) a2, j6, caby2.f172495c, true);
                        caby caby3 = cabc.f172421i;
                        if (caby3 == null) {
                            caby3 = caby.f172491d;
                        }
                        j2 = caby3.f172495c;
                        arrayList.add(cabc);
                        j5 = Math.min(j, TimeUnit.NANOSECONDS.toMillis(j2));
                        i4 = i + 1;
                        size = i2;
                        str = str2;
                    } else {
                        str2 = str;
                        i = i4;
                        i2 = size;
                        j = j5;
                        cabc = cabc2;
                    }
                    caae a3 = m46591a(cabc.f172416d, hashMap, c2);
                    if (a3 == null) {
                        arrayList2.add(cabc);
                        j5 = j;
                        i4 = i + 1;
                        size = i2;
                        str = str2;
                    } else {
                        caaa caaa = cabc.f172417e;
                        if (caaa == null) {
                            caaa = caaa.f172305j;
                        }
                        if ((caaa.f172307a & 8) != 0) {
                            caaa caaa2 = cabc.f172417e;
                            if (caaa2 == null) {
                                caaa2 = caaa.f172305j;
                            }
                            caae = m46591a(caaa2.f172311e, hashMap, c2);
                        } else {
                            caae = null;
                        }
                        caaa caaa3 = cabc.f172417e;
                        if (caaa3 == null) {
                            caaa3 = caaa.f172305j;
                        }
                        cadn a4 = zrw.m46080a(caaa3, a3, caae);
                        if (cabc.f172415c) {
                            m46600a(c2, arrayList3);
                            arrayList3.clear();
                            c2.mo31369a(a3, (List) bngx.m109356a(a4), true);
                        } else {
                            arrayList3.add(a4);
                        }
                        j2 = a4.f172702b;
                        arrayList.add(cabc);
                        j5 = Math.min(j, TimeUnit.NANOSECONDS.toMillis(j2));
                        i4 = i + 1;
                        size = i2;
                        str = str2;
                    }
                }
                SharedPreferences d = zuw.m46538d(this.f56041b, str);
                d.edit().putLong("overlap_start", Math.min(j5, d.getLong("overlap_start", -1))).putLong("oldest_wear", Math.min(j5, d.getLong("oldest_wear", Long.MAX_VALUE))).apply();
                m46600a(c2, arrayList3);
                m46594a(messageEventParcelable, str, zdl.m45331a(arrayList), zdl.m45331a(arrayList2));
                return true;
            case 1:
                byte[] bArr = messageEventParcelable2.f110948c;
                bxus c3 = bxus.m123744c();
                ArrayList arrayList4 = new ArrayList();
                bxwc bxwc2 = ((cacm) GeneratedMessageLite.m124016a(cacm.f172578b, bArr, c3)).f172580a;
                int size2 = bxwc2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    cacl cacl = (cacl) bxwc2.get(i5);
                    int i6 = cacl.f172573b;
                    if (i6 == 2) {
                        cadz cadz2 = (cadz) cacl.f172574c;
                        if (zpc.m45934a(cadz2, c2, yym.m45036a(cadz2)) == null) {
                            c2.mo31394b(cadz2, 1);
                        } else {
                            c2.mo31395c(cadz2, 1);
                        }
                    } else {
                        if (i6 == 1) {
                            str3 = (String) cacl.f172574c;
                        } else {
                            str3 = "";
                        }
                        if (str3.isEmpty()) {
                            bnsl bnsl = (bnsl) f56040a.mo68387b();
                            bnsl.mo68432a("zwa", "a", 421, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("Session change with nothing to do");
                        } else {
                            if (cacl.f172573b != 1) {
                                str4 = "";
                            } else {
                                str4 = (String) cacl.f172574c;
                            }
                            cadz a5 = zpc.m45935a(str4, c2, cacl.f172575d);
                            if (a5 == null) {
                                bnsl bnsl2 = (bnsl) f56040a.mo68388c();
                                bnsl2.mo68432a("zwa", "a", 899, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68420a("Couldn't find session to delete: %s", str4);
                            } else {
                                c2.mo31393a(a5, 1);
                            }
                        }
                    }
                    arrayList4.add(cacl);
                }
                ArrayList arrayList5 = new ArrayList();
                zdm.m45335a(arrayList4, arrayList5);
                m46594a(messageEventParcelable2, str, arrayList5, bngx.m109376e());
                return true;
            case 2:
                cadw cadw = (cadw) GeneratedMessageLite.m124016a(cadw.f172748g, messageEventParcelable2.f110948c, bxus.m123744c());
                caae a6 = c2.mo31377a(cadw.f172752c);
                Iterator it = bmyx.m108640a('-').mo66918a((CharSequence) cadw.f172753d).iterator();
                List e2 = a6 == null ? bngx.m109376e() : c2.mo31364a(a6, Long.parseLong((String) it.next()), Long.parseLong((String) it.next())).f172714c;
                yrd b2 = yre.m44651b();
                b2.f54474a = e2;
                m46595a(messageEventParcelable2, str, b2.mo30685a(), yri.f54490c);
                return false;
            case 3:
                byte[] bArr2 = messageEventParcelable2.f110948c;
                bxus c4 = bxus.m123744c();
                HashSet<caae> hashSet = new HashSet();
                cabr cabr = ((cabs) GeneratedMessageLite.m124016a(cabs.f172471d, bArr2, c4)).f172475c;
                if (cabr == null) {
                    cabr = cabr.f172468b;
                }
                bxwc bxwc3 = cabr.f172470a;
                int size3 = bxwc3.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    caae a7 = c2.mo31377a((String) bxwc3.get(i7));
                    if (a7 != null) {
                        hashSet.add(a7);
                    }
                }
                cabp cabp = (cabp) cabq.f172465b.mo74144da();
                for (caae caae2 : hashSet) {
                    bxvd da = cabo.f172459e.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cabo cabo = (cabo) da.f164949b;
                    caae2.getClass();
                    cabo.f172464d = caae2;
                    cabo.f172461a |= 4;
                    cabp.mo74607a(da);
                }
                bxvd da2 = cabt.f172477c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cabt cabt = (cabt) da2.f164949b;
                cabq cabq = (cabq) cabp.mo74062i();
                cabq.getClass();
                cabt.f172480b = cabq;
                cabt.f172479a |= 1;
                m46593a(messageEventParcelable2, str, (cabt) da2.mo74062i(), "/WearablesSync/DataSourcesResponse/");
                return false;
            case 4:
                long d2 = zuq.m46521d(((cacn) GeneratedMessageLite.m124016a(cacn.f172581d, messageEventParcelable2.f110948c, bxus.m123744c())).f172585c);
                caco caco = (caco) cacp.f172587f.mo74144da();
                String str9 = "/WearablesSync/ChangeLogs/";
                zrb c5 = c2.mo31354c((int) ceab.m135730c(), d2);
                bngx bngx = c5.f55741b;
                if (bngx.size() == ((int) ceab.m135730c())) {
                    z = true;
                } else {
                    z = false;
                }
                if (caco.f164950c) {
                    caco.mo74035c();
                    caco.f164950c = false;
                }
                cacp cacp = (cacp) caco.f164949b;
                cacp.f172589a |= 2;
                cacp.f172592d = z;
                bngx a8 = zuq.m46511a(bngx, c2, zvz.f56039a);
                bngs j7 = bngx.m109377j();
                bndu r = bndu.m109109r();
                int size4 = a8.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    cabc cabc3 = (cabc) a8.get(i8);
                    r.mo67268a(cabc3.f172416d, cabc3);
                }
                for (Map.Entry entry : r.mo67318q().entrySet()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (cabc cabc4 : (Collection) entry.getValue()) {
                        caaa caaa4 = cabc4.f172417e;
                        if (caaa4 == null) {
                            caaa4 = caaa.f172305j;
                        }
                        bxvd bxvd = (bxvd) caaa4.mo74142c(i3);
                        bxvd.mo73625a((GeneratedMessageLite) caaa4);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        caaa caaa5 = (caaa) bxvd.f164949b;
                        caaa5.f172307a &= -17;
                        caaa5.f172313g = 0;
                        caaa caaa6 = (caaa) bxvd.mo74062i();
                        linkedHashMap.remove(caaa6);
                        linkedHashMap.put(caaa6, cabc4);
                        i3 = 5;
                    }
                    j7.mo67666b((Iterable) linkedHashMap.values());
                    i3 = 5;
                }
                caco.mo74609a(j7.mo67664a());
                String l = Long.toString(c5.f55740a + 1);
                if (caco.f164950c) {
                    caco.mo74035c();
                    caco.f164950c = false;
                }
                cacp cacp2 = (cacp) caco.f164949b;
                l.getClass();
                cacp2.f172589a |= 1;
                cacp2.f172591c = l;
                if (!cacp2.f172592d) {
                    long b3 = zuw.m46536b(this.f56041b, str);
                    if (caco.f164950c) {
                        caco.mo74035c();
                        caco.f164950c = false;
                    }
                    cacp cacp3 = (cacp) caco.f164949b;
                    cacp3.f172589a |= 4;
                    cacp3.f172593e = b3;
                }
                cacp cacp4 = (cacp) caco.f164949b;
                String str10 = cacp4.f172591c;
                cacp4.f172590b.size();
                m46593a(messageEventParcelable2, str, (cacp) caco.mo74062i(), str9);
                return false;
            case 5:
                cacd cacd = (cacd) GeneratedMessageLite.m124016a(cacd.f172516i, messageEventParcelable2.f110948c, bxus.m123744c());
                String str11 = cacd.f172520c;
                String str12 = cacd.f172521d;
                bngs j8 = bngx.m109377j();
                bngs j9 = bngx.m109377j();
                caae a9 = c2.mo31377a(str11);
                long d3 = zuq.m46521d(str12);
                if (a9 == null) {
                    yrd b4 = yre.m44651b();
                    b4.f54479f = Long.toString(d3 + 1);
                    m46595a(messageEventParcelable2, str, b4.mo30685a(), yri.f54490c);
                    return false;
                }
                if (d3 >= c2.mo31345a()) {
                    int c6 = (int) ceab.m135730c();
                    long j10 = d3;
                    while (true) {
                        zrb c7 = c2.mo31354c(c6, d3);
                        bnre i9 = c7.f55741b.listIterator();
                        j3 = j10;
                        long j11 = d3;
                        int i10 = 0;
                        while (true) {
                            if (i9.hasNext()) {
                                cabc cabc5 = (cabc) i9.next();
                                int i11 = i10;
                                j11 = Math.max(j11, cabc5.f172420h);
                                if (!cabc5.f172416d.equals(str11)) {
                                    i10 = i11;
                                } else {
                                    int i12 = i11;
                                    if (i12 < ((int) ceab.m135730c())) {
                                        long j12 = j11;
                                        long j13 = cabc5.f172420h;
                                        if (!cabc5.f172415c) {
                                            bngs = j8;
                                        } else {
                                            bngs = j9;
                                        }
                                        caaa caaa7 = cabc5.f172417e;
                                        if (caaa7 == null) {
                                            caaa7 = caaa.f172305j;
                                        }
                                        bngs.mo67666b((Iterable) yrm.m44667a(bngx.m109356a(caaa7), a9, c2));
                                        j3 = j13;
                                        j11 = j12;
                                        i10 = i12 + 1;
                                    }
                                }
                            } else if (c7.f55741b.size() >= c6) {
                                d3 = j11 + 1;
                                j10 = j3;
                            }
                        }
                    }
                } else {
                    cadp a10 = c2.mo31363a(a9, TimeUnit.MILLISECONDS.toNanos(d3), (int) ceab.m135730c());
                    j8.mo67666b((Iterable) a10.f172714c);
                    bxwc bxwc4 = a10.f172714c;
                    int size5 = bxwc4.size();
                    for (int i13 = 0; i13 < size5; i13++) {
                        cadn cadn = (cadn) bxwc4.get(i13);
                        caah caah = a9.f172330f;
                        if (caah == null) {
                            caah = caah.f172333d;
                        }
                        long millis = caah.f172336b.equals("com.google.internal.goal") ? TimeUnit.NANOSECONDS.toMillis(cadn.f172703c) : TimeUnit.NANOSECONDS.toMillis(cadn.f172702b);
                        if (millis > d3) {
                            d3 = millis;
                        }
                    }
                    j3 = d3;
                }
                bngx a11 = j8.mo67664a();
                bngx a12 = j9.mo67664a();
                a11.size();
                a12.size();
                yrd b5 = yre.m44651b();
                b5.f54474a = a11;
                b5.f54475b = a12;
                b5.f54479f = Long.toString(j3 + 1);
                m46595a(messageEventParcelable2, str, b5.mo30685a(), yri.f54490c);
                return false;
            case 6:
                cacq cacq = (cacq) GeneratedMessageLite.m124016a(cacq.f172595h, messageEventParcelable2.f110948c, bxus.m123744c());
                long d4 = zuq.m46521d(cacq.f172602f);
                cabq cabq2 = cacq.f172600d;
                if (cabq2 == null) {
                    cabq2 = cabq.f172465b;
                }
                Long valueOf = Long.valueOf(d4);
                bngs j14 = bngx.m109377j();
                bngs j15 = bngx.m109377j();
                HashSet hashSet2 = new HashSet();
                if (valueOf.longValue() == 0) {
                    j14.mo67666b((Iterable) c2.mo31389i().keySet());
                    zrb = null;
                } else {
                    zrb = c2.mo31351b(valueOf.longValue());
                    bnre i14 = zrb.f55741b.listIterator();
                    while (i14.hasNext()) {
                        cabo cabo2 = (cabo) i14.next();
                        if (!cabo2.f172462b.isEmpty()) {
                            j15.mo67668c(yyd.m44992c(cabo2.f172462b));
                            hashSet2.add(cabo2.f172462b);
                        } else if ((cabo2.f172461a & 4) != 0) {
                            caae caae3 = cabo2.f172464d;
                            if (caae3 == null) {
                                caae3 = caae.f172323i;
                            }
                            j14.mo67668c(caae3);
                        }
                    }
                }
                bngs b6 = bngx.m109371b(cabq2.f172467a.size());
                bxwc bxwc5 = cabq2.f172467a;
                int size6 = bxwc5.size();
                for (int i15 = 0; i15 < size6; i15++) {
                    cabo cabo3 = (cabo) bxwc5.get(i15);
                    if ((cabo3.f172461a & 4) != 0) {
                        caae caae4 = cabo3.f172464d;
                        if (caae4 == null) {
                            caae4 = caae.f172323i;
                        }
                        if (!hashSet2.contains(caae4.f172326b)) {
                            caae caae5 = cabo3.f172464d;
                            if (caae5 == null) {
                                caae5 = caae.f172323i;
                            }
                            b6.mo67668c(caae5);
                        }
                    }
                }
                c2.mo31380a((Collection) b6.mo67664a());
                if (zrb != null) {
                    j4 = zrb.f55740a + 1;
                } else {
                    j4 = this.f56045f.mo20505a();
                }
                Long valueOf2 = Long.valueOf(j4);
                yrd b7 = yre.m44651b();
                b7.f54474a = j14.mo67664a();
                b7.f54476c = j15.mo67664a();
                b7.f54479f = Long.toString(valueOf2.longValue());
                m46595a(messageEventParcelable2, str, b7.mo30685a(), yri.f54488a);
                return false;
            case 7:
                Context context = this.f56041b;
                if (!cdzd.f182003a.mo6606a().mo78569ai()) {
                    return false;
                }
                bxwc bxwc6 = ((cads) GeneratedMessageLite.m124016a(cads.f172724b, messageEventParcelable2.f110948c, bxus.m123744c())).f172726a;
                int size7 = bxwc6.size();
                for (int i16 = 0; i16 < size7; i16++) {
                    cadr cadr = (cadr) bxwc6.get(i16);
                    bxvd bxvd2 = (bxvd) cadr.mo74142c(5);
                    bxvd2.mo73625a((GeneratedMessageLite) cadr);
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    cadr cadr2 = (cadr) bxvd2.f164949b;
                    cadr cadr3 = cadr.f172717f;
                    cadr2.f172719a |= 4;
                    cadr2.f172722d = -1;
                    e.mo31398a(new yqe("com.google.android.gms.paired", (cadr) bxvd2.mo74062i(), 2));
                }
                zvm.m46571a(context, str);
                return false;
            case 8:
                Long valueOf3 = Long.valueOf(zuq.m46521d(((cadx) GeneratedMessageLite.m124016a(cadx.f172757h, messageEventParcelable2.f110948c, bxus.m123744c())).f172764f));
                sqv sqv = this.f56045f;
                bngs j16 = bngx.m109377j();
                bngs j17 = bngx.m109377j();
                if (valueOf3.longValue() == 0) {
                    j16.mo67666b((Iterable) c2.mo31392a(null, null, null, -1, -1));
                    zrb2 = null;
                } else {
                    zrb2 = c2.mo31347a(valueOf3.longValue());
                    bnre i17 = zrb2.f55741b.listIterator();
                    while (i17.hasNext()) {
                        cacl cacl2 = (cacl) i17.next();
                        if (cacl2.f172573b == 1) {
                            str5 = (String) cacl2.f172574c;
                        } else {
                            str5 = "";
                        }
                        if (!str5.isEmpty()) {
                            cadz cadz3 = cacl2.f172577f;
                            if (cadz3 == null) {
                                cadz3 = cadz.f172773j;
                            }
                            j17.mo67668c(cadz3);
                        } else {
                            if (cacl2.f172573b == 2) {
                                cadz = (cadz) cacl2.f172574c;
                            } else {
                                cadz = cadz.f172773j;
                            }
                            j16.mo67668c(cadz);
                        }
                    }
                }
                Long valueOf4 = Long.valueOf(zrb2 != null ? zrb2.f55740a + 1 : sqv.mo20505a());
                yrd b8 = yre.m44651b();
                b8.f54474a = j16.mo67664a();
                b8.f54475b = j17.mo67664a();
                b8.f54479f = Long.toString(valueOf4.longValue());
                m46595a(messageEventParcelable2, str, b8.mo30685a(), yri.f54489b);
                return false;
            case 9:
                return false;
            case 10:
                cabb cabb = (cabb) GeneratedMessageLite.m124016a(cabb.f172405e, messageEventParcelable2.f110948c, bxus.m123744c());
                if (str7 == null) {
                    int i18 = cabb.f172410d;
                    if (i18 <= 0) {
                        c2.mo31344a((List) cabb.f172408b);
                        c2.mo31348a((Set) new C1225nr(cabb.f172409c));
                    } else {
                        this.f56043d.mo31543a(i18, cabb);
                    }
                } else {
                    this.f56043d.mo31543a(Integer.parseInt(str7), cabb);
                }
                zvj.f56009r += cabb.f172408b.size();
                zvj.f56010s += cabb.f172409c.size();
                cabb.f172408b.size();
                cabb.f172409c.size();
                return false;
            case 11:
                m46598a(str7);
                this.f56043d.mo31543a(Integer.parseInt(str7), (cabt) GeneratedMessageLite.m124016a(cabt.f172477c, messageEventParcelable2.f110948c, bxus.m123744c()));
                return false;
            case 12:
                m46598a(str7);
                this.f56043d.mo31543a(Integer.parseInt(str7), (cacp) GeneratedMessageLite.m124016a(cacp.f172587f, messageEventParcelable2.f110948c, bxus.m123744c()));
                return false;
            case 13:
                m46598a(str7);
                m46597a(messageEventParcelable2, str7, c2, yri.f54490c);
                return false;
            case 14:
                m46598a(str7);
                m46597a(messageEventParcelable2, str7, c2, yri.f54488a);
                return false;
            case 15:
                m46598a(str7);
                m46597a(messageEventParcelable2, str7, c2, yri.f54489b);
                return false;
            case 16:
            case 17:
            case 18:
                return false;
            default:
                bnsl bnsl3 = (bnsl) f56040a.mo68388c();
                bnsl3.mo68432a("zwa", "c", 303, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Unrecognized request: %s", str8);
                return false;
        }
    }

    /* renamed from: a */
    private final zut m46592a(String str, String str2) {
        return new zuy(this.f56046g, str, str2);
    }

    /* renamed from: a */
    private final void m46593a(MessageEventParcelable messageEventParcelable, String str, bxxc bxxc, String str2) {
        zuy.m46543a(((zvl) m46592a(str, messageEventParcelable.f110949d)).mo31538a(str2, messageEventParcelable.f110946a, bxxc), "Message response");
    }

    /* renamed from: a */
    private final void m46594a(MessageEventParcelable messageEventParcelable, String str, List list, List list2) {
        zut a = m46592a(str, messageEventParcelable.f110949d);
        int i = messageEventParcelable.f110946a;
        list.size();
        list2.size();
        caba caba = (caba) cabb.f172405e.mo74144da();
        caba.mo74606b(list);
        caba.mo74605a(list2);
        if (caba.f164950c) {
            caba.mo74035c();
            caba.f164950c = false;
        }
        cabb cabb = (cabb) caba.f164949b;
        cabb.f172407a |= 1;
        cabb.f172410d = i;
        zuy.m46543a(((zvl) a).mo31539a("/WearablesSync/Ack/", (cabb) caba.mo74062i()), "Data point ACK");
    }

    /* renamed from: a */
    private final void m46595a(MessageEventParcelable messageEventParcelable, String str, yre yre, yri yri) {
        String str2;
        zut a = m46592a(str, messageEventParcelable.f110949d);
        int i = messageEventParcelable.f110946a;
        yre.f54481a.size();
        yre.f54482b.size();
        bxxc a2 = yri.mo30687a(yre);
        if (yri == yri.f54488a) {
            str2 = "/WearablesSync/DataSourcesChangeSet/";
        } else if (yri == yri.f54490c) {
            str2 = "/WearablesSync/DataPointsChangeSet/";
        } else if (yri == yri.f54489b) {
            str2 = "/WearablesSync/SessionsChangeSet/";
        } else {
            String valueOf = String.valueOf(yri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("Unknown change set type: ");
            sb.append(valueOf);
            throw new AssertionError(sb.toString());
        }
        zuy.m46543a(((zvl) a).mo31538a(str2, i, a2), "ChangeSet response");
    }

    /* renamed from: a */
    private final void m46596a(MessageEventParcelable messageEventParcelable, String str, zre zre) {
        String str2;
        byte[] bArr = messageEventParcelable.f110948c;
        bxus c = bxus.m123744c();
        ArrayList arrayList = new ArrayList();
        bxwc bxwc = ((cacm) GeneratedMessageLite.m124016a(cacm.f172578b, bArr, c)).f172580a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            cacl cacl = (cacl) bxwc.get(i);
            int i2 = cacl.f172573b;
            if (i2 == 2) {
                cadz cadz = (cadz) cacl.f172574c;
                if (zpc.m45934a(cadz, zre, yym.m45036a(cadz)) == null) {
                    zre.mo31394b(cadz, 1);
                } else {
                    zre.mo31395c(cadz, 1);
                }
            } else {
                String str3 = "";
                if (i2 == 1) {
                    str2 = (String) cacl.f172574c;
                } else {
                    str2 = str3;
                }
                if (str2.isEmpty()) {
                    bnsl bnsl = (bnsl) f56040a.mo68387b();
                    bnsl.mo68432a("zwa", "a", 421, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Session change with nothing to do");
                } else {
                    if (cacl.f172573b == 1) {
                        str3 = (String) cacl.f172574c;
                    }
                    cadz a = zpc.m45935a(str3, zre, cacl.f172575d);
                    if (a == null) {
                        bnsl bnsl2 = (bnsl) f56040a.mo68388c();
                        bnsl2.mo68432a("zwa", "a", 899, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("Couldn't find session to delete: %s", str3);
                    } else {
                        zre.mo31393a(a, 1);
                    }
                }
            }
            arrayList.add(cacl);
        }
        ArrayList arrayList2 = new ArrayList();
        zdm.m45335a(arrayList, arrayList2);
        m46594a(messageEventParcelable, str, arrayList2, bngx.m109376e());
    }

    /* renamed from: a */
    private final void m46597a(MessageEventParcelable messageEventParcelable, String str, zre zre, yri yri) {
        this.f56043d.mo31543a(Integer.parseInt(str), yri.mo30688a(messageEventParcelable.f110948c, zre));
    }

    /* renamed from: a */
    private static void m46598a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    private static void m46599a(zre zre, String str, String str2) {
        cadz a = zpc.m45935a(str, zre, str2);
        if (a != null) {
            zre.mo31393a(a, 1);
            return;
        }
        bnsl bnsl = (bnsl) f56040a.mo68388c();
        bnsl.mo68432a("zwa", "a", 899, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Couldn't find session to delete: %s", str);
    }

    /* renamed from: a */
    private final void m46600a(zre zre, List list) {
        caap caap = caap.WATCH;
        caap a = caap.m126421a(this.f56044e.f172360c);
        if (a == null) {
            a = caap.UNKNOWN;
        }
        boolean z = !caap.equals(a);
        if (!list.isEmpty()) {
            zre.mo31361a(list, z);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(java.util.Set, long, long, boolean):void
     arg types: [bnic, long, long, int]
     candidates:
      zrc.a(caae, long, long, int):cadp
      zrc.a(long, long, caae, boolean):void
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(caae, java.util.List, boolean):void
     arg types: [caae, bngx, int]
     candidates:
      zrc.a(caae, long, int):cadp
      zrc.a(caae, long, long):cadp
      zrc.a(caae, java.util.List, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x0aff A[Catch:{ IOException | IllegalArgumentException -> 0x0b26 }] */
    /* JADX WARNING: Removed duplicated region for block: B:511:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo7590a(MessageEventParcelable messageEventParcelable) {
        String str;
        String str2;
        String str3;
        Throwable th;
        String str4;
        String str5;
        char c;
        boolean z;
        zwa zwa;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j;
        String str6;
        String str7;
        HashMap hashMap;
        String str8;
        long j2;
        Throwable th2;
        Iterator it;
        zwa zwa2;
        long j3;
        String str9;
        caae caae;
        SharedPreferences d;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        zwa zwa3;
        caco caco;
        zrb c2;
        boolean z2;
        bngs j4;
        String str15;
        long j5;
        bngs bngs;
        long j6;
        zrb zrb;
        long j7;
        zrb zrb2;
        long j8;
        String str16;
        cadz cadz;
        bnsl bnsl;
        MessageEventParcelable messageEventParcelable2 = messageEventParcelable;
        String str17 = "zwa";
        String str18 = messageEventParcelable2.f110947b;
        bmxy.m108605b(str18.startsWith("/WearablesSync/"), "Path %s", str18);
        long b = this.f56045f.mo20506b();
        try {
            String[] b2 = m46601b(messageEventParcelable);
            String str19 = b2[0];
            String str20 = str18;
            StringBuilder sb = new StringBuilder(String.valueOf(str19).length() + 16);
            sb.append("/WearablesSync/");
            sb.append(str19);
            sb.append("/");
            String sb2 = sb.toString();
            int length = b2.length;
            String str21 = length > 2 ? b2[1] : null;
            if (length <= 2) {
                str5 = b2[1];
            } else {
                str5 = b2[2];
            }
            zre c3 = this.f56042c.mo30877c(str5);
            zrk e = this.f56042c.mo30880e(str5);
            String str22 = "/WearablesSync/ChangeLogs/";
            String str23 = "/";
            long j9 = b;
            int i = 5;
            switch (sb2.hashCode()) {
                case -2064704653:
                    if (sb2.equals("/WearablesSync/DataPointsChangeSet/")) {
                        c = 13;
                        break;
                    }
                    c = 65535;
                    break;
                case -1946385522:
                    if (sb2.equals("/WearablesSync/GetDataSources/")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1700460151:
                    if (sb2.equals("/WearablesSync/DataSourcesResponse/")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1676919147:
                    if (sb2.equals("/WearablesSync/UploadBatchData/")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146361132:
                    if (sb2.equals("/WearablesSync/UploadBatchResponseData/")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -975373646:
                    if (sb2.equals("/WearablesSync/DataPoint/")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -308287469:
                    if (sb2.equals("/WearablesSync/ListChanges/")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 37833191:
                    if (sb2.equals(str22)) {
                        c = 12;
                        break;
                    }
                    c = 65535;
                    break;
                case 241667407:
                    if (sb2.equals("/WearablesSync/Ack/")) {
                        c = 10;
                        break;
                    }
                    c = 65535;
                    break;
                case 249053386:
                    if (sb2.equals("/WearablesSync/DataSources/")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 766343652:
                    if (sb2.equals("/WearablesSync/SessionList/")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1218520761:
                    if (sb2.equals("/WearablesSync/ForceWearableSync/")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 1541484866:
                    if (sb2.equals("/WearablesSync/Subscriptions/")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1621498306:
                    if (sb2.equals("/WearablesSync/DataSourcesChangeSet/")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1835579573:
                    if (sb2.equals("/WearablesSync/GetDataPoints/")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1988158581:
                    if (sb2.equals("/WearablesSync/HealthStats/")) {
                        c = 9;
                        break;
                    }
                    c = 65535;
                    break;
                case 2020023587:
                    if (sb2.equals("/WearablesSync/SessionsChangeSet/")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 2045222563:
                    if (sb2.equals("/WearablesSync/GetChangeLogs/")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 2068647941:
                    if (sb2.equals("/WearablesSync/GetSessions/")) {
                        c = 8;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            str = "a";
            String str24 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
            switch (c) {
                case 0:
                    zwa zwa4 = this;
                    String str25 = str;
                    String str26 = str24;
                    try {
                        bxwc bxwc = ((cabd) GeneratedMessageLite.m124016a(cabd.f172424b, messageEventParcelable2.f110948c, bxus.m123744c())).f172426a;
                        arrayList = new ArrayList();
                        arrayList2 = new ArrayList();
                        HashMap hashMap2 = new HashMap();
                        arrayList3 = new ArrayList(bxwc.size());
                        Iterator it2 = bxwc.iterator();
                        str = str25;
                        j = Long.MAX_VALUE;
                        while (it2.hasNext()) {
                            try {
                                hashMap = hashMap2;
                                str6 = str17;
                                str8 = str5;
                                str7 = str26;
                                j2 = j;
                            } catch (IOException | IllegalArgumentException e2) {
                                e = e2;
                                th = e;
                                str3 = str17;
                                str2 = str26;
                                bnsl bnsl2 = (bnsl) f56040a.mo68388c();
                                bnsl2.mo68437a(th);
                                bnsl2.mo68432a(str3, str, 180, str2);
                                bnsl2.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                            }
                            try {
                                cabc cabc = (cabc) it2.next();
                                int a = cabf.m126442a(cabc.f172414b);
                                if (a == 0) {
                                    it = it2;
                                } else if (a == 4) {
                                    try {
                                        if (!cabc.f172416d.isEmpty()) {
                                            it = it2;
                                        } else if (cabc.f172422j.size() > 0) {
                                            bnic a2 = bnic.m109495a((Collection) cabc.f172422j);
                                            caby caby = cabc.f172421i;
                                            if (caby == null) {
                                                caby = caby.f172491d;
                                            }
                                            long j10 = caby.f172494b;
                                            caby caby2 = cabc.f172421i;
                                            if (caby2 == null) {
                                                caby2 = caby.f172491d;
                                            }
                                            it = it2;
                                            c3.mo31370a((Set) a2, j10, caby2.f172495c, true);
                                            caby caby3 = cabc.f172421i;
                                            if (caby3 == null) {
                                                caby3 = caby.f172491d;
                                            }
                                            j3 = caby3.f172495c;
                                            zwa2 = this;
                                            arrayList.add(cabc);
                                            j = Math.min(j2, TimeUnit.NANOSECONDS.toMillis(j3));
                                            messageEventParcelable2 = messageEventParcelable;
                                            zwa4 = zwa2;
                                            str9 = str8;
                                            hashMap2 = hashMap;
                                            it2 = it;
                                            str26 = str7;
                                            str17 = str6;
                                        } else {
                                            it = it2;
                                        }
                                    } catch (IOException | IllegalArgumentException e3) {
                                        e = e3;
                                        th2 = e;
                                        str2 = str7;
                                        str3 = str6;
                                        bnsl bnsl22 = (bnsl) f56040a.mo68388c();
                                        bnsl22.mo68437a(th);
                                        bnsl22.mo68432a(str3, str, 180, str2);
                                        bnsl22.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                                    }
                                } else {
                                    it = it2;
                                }
                                caae a3 = m46591a(cabc.f172416d, hashMap, c3);
                                if (a3 == null) {
                                    arrayList2.add(cabc);
                                    zwa4 = this;
                                    messageEventParcelable2 = messageEventParcelable;
                                    j = j2;
                                    str9 = str8;
                                    hashMap2 = hashMap;
                                    it2 = it;
                                    str26 = str7;
                                    str17 = str6;
                                } else {
                                    caaa caaa = cabc.f172417e;
                                    if (caaa == null) {
                                        caaa = caaa.f172305j;
                                    }
                                    if ((caaa.f172307a & 8) != 0) {
                                        caaa caaa2 = cabc.f172417e;
                                        if (caaa2 == null) {
                                            caaa2 = caaa.f172305j;
                                        }
                                        caae = m46591a(caaa2.f172311e, hashMap, c3);
                                    } else {
                                        caae = null;
                                    }
                                    caaa caaa3 = cabc.f172417e;
                                    if (caaa3 == null) {
                                        caaa3 = caaa.f172305j;
                                    }
                                    cadn a4 = zrw.m46080a(caaa3, a3, caae);
                                    if (cabc.f172415c) {
                                        zwa2 = this;
                                        try {
                                            zwa2.m46600a(c3, arrayList3);
                                            arrayList3.clear();
                                            c3.mo31369a(a3, (List) bngx.m109356a(a4), true);
                                        } catch (IOException | IllegalArgumentException e4) {
                                            e = e4;
                                            th2 = e;
                                            str2 = str7;
                                            str3 = str6;
                                            bnsl bnsl222 = (bnsl) f56040a.mo68388c();
                                            bnsl222.mo68437a(th);
                                            bnsl222.mo68432a(str3, str, 180, str2);
                                            bnsl222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                                        }
                                    } else {
                                        zwa2 = this;
                                        arrayList3.add(a4);
                                    }
                                    j3 = a4.f172702b;
                                    arrayList.add(cabc);
                                    j = Math.min(j2, TimeUnit.NANOSECONDS.toMillis(j3));
                                    messageEventParcelable2 = messageEventParcelable;
                                    zwa4 = zwa2;
                                    str9 = str8;
                                    hashMap2 = hashMap;
                                    it2 = it;
                                    str26 = str7;
                                    str17 = str6;
                                }
                            } catch (IOException | IllegalArgumentException e5) {
                                e = e5;
                                th2 = e;
                                str2 = str7;
                                str3 = str6;
                                bnsl bnsl2222 = (bnsl) f56040a.mo68388c();
                                bnsl2222.mo68437a(th);
                                bnsl2222.mo68432a(str3, str, 180, str2);
                                bnsl2222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                            }
                        }
                    } catch (IOException | IllegalArgumentException e6) {
                        e = e6;
                        str = str25;
                        th = e;
                        str3 = str17;
                        str2 = str26;
                        bnsl bnsl22222 = (bnsl) f56040a.mo68388c();
                        bnsl22222.mo68437a(th);
                        bnsl22222.mo68432a(str3, str, 180, str2);
                        bnsl22222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                    }
                    try {
                        d = zuw.m46538d(zwa4.f56041b, str5);
                        str10 = str5;
                        str7 = str26;
                    } catch (IOException | IllegalArgumentException e7) {
                        th = e7;
                        str3 = str17;
                        str2 = str26;
                        bnsl bnsl222222 = (bnsl) f56040a.mo68388c();
                        bnsl222222.mo68437a(th);
                        bnsl222222.mo68432a(str3, str, 180, str2);
                        bnsl222222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                    }
                    try {
                        str6 = str17;
                        long j11 = j;
                        try {
                            d.edit().putLong("overlap_start", Math.min(j11, d.getLong("overlap_start", -1))).putLong("oldest_wear", Math.min(j11, d.getLong("oldest_wear", Long.MAX_VALUE))).apply();
                            zwa4.m46600a(c3, arrayList3);
                            zwa4.m46594a(messageEventParcelable2, str10, zdl.m45331a(arrayList), zdl.m45331a(arrayList2));
                            zwa = zwa4;
                            z = true;
                            zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                            if (!z) {
                                Intent intent = new Intent();
                                intent.setClassName("com.google.android.apps.fitness", "com.google.android.apps.fitness.wearable.WearableSyncReceiver");
                                intent.setAction("com.google.android.gms.fitness.wearables.SYNC_COMPLETED");
                                intent.addFlags(32);
                                intent.putExtra("TimestampMillis", zwa.f56045f.mo20505a());
                                zwa.f56041b.sendBroadcast(intent);
                                return;
                            }
                            return;
                        } catch (IOException | IllegalArgumentException e8) {
                            th2 = e8;
                            str2 = str7;
                            str3 = str6;
                            bnsl bnsl2222222 = (bnsl) f56040a.mo68388c();
                            bnsl2222222.mo68437a(th);
                            bnsl2222222.mo68432a(str3, str, 180, str2);
                            bnsl2222222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                        }
                    } catch (IOException | IllegalArgumentException e9) {
                        th = e9;
                        str3 = str17;
                        str2 = str7;
                        bnsl bnsl22222222 = (bnsl) f56040a.mo68388c();
                        bnsl22222222.mo68437a(th);
                        bnsl22222222.mo68432a(str3, str, 180, str2);
                        bnsl22222222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                    }
                case 1:
                    byte[] bArr = messageEventParcelable2.f110948c;
                    bxus c4 = bxus.m123744c();
                    ArrayList arrayList4 = new ArrayList();
                    for (cacl cacl : ((cacm) GeneratedMessageLite.m124016a(cacm.f172578b, bArr, c4)).f172580a) {
                        int i2 = cacl.f172573b;
                        if (i2 == 2) {
                            cadz cadz2 = (cadz) cacl.f172574c;
                            if (zpc.m45934a(cadz2, c3, yym.m45036a(cadz2)) == null) {
                                c3.mo31394b(cadz2, 1);
                                str11 = str;
                                str12 = str24;
                            } else {
                                c3.mo31395c(cadz2, 1);
                                str11 = str;
                                str12 = str24;
                            }
                        } else {
                            if (i2 == 1) {
                                str13 = (String) cacl.f172574c;
                            } else {
                                str13 = "";
                            }
                            if (str13.isEmpty()) {
                                bnsl bnsl3 = (bnsl) f56040a.mo68387b();
                                str11 = str;
                                str12 = str24;
                                try {
                                    bnsl3.mo68432a(str17, str11, 421, str12);
                                    bnsl3.mo68405a("Session change with nothing to do");
                                } catch (IOException | IllegalArgumentException e10) {
                                    th = e10;
                                    str3 = str17;
                                    str2 = str12;
                                    str = str11;
                                    bnsl bnsl222222222 = (bnsl) f56040a.mo68388c();
                                    bnsl222222222.mo68437a(th);
                                    bnsl222222222.mo68432a(str3, str, 180, str2);
                                    bnsl222222222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                                }
                            } else {
                                str11 = str;
                                str12 = str24;
                                if (cacl.f172573b == 1) {
                                    str14 = (String) cacl.f172574c;
                                } else {
                                    str14 = "";
                                }
                                cadz a5 = zpc.m45935a(str14, c3, cacl.f172575d);
                                if (a5 == null) {
                                    bnsl bnsl4 = (bnsl) f56040a.mo68388c();
                                    bnsl4.mo68432a(str17, str11, 899, str12);
                                    bnsl4.mo68420a("Couldn't find session to delete: %s", str14);
                                } else {
                                    c3.mo31393a(a5, 1);
                                }
                            }
                        }
                        arrayList4.add(cacl);
                        str24 = str12;
                        str = str11;
                    }
                    String str27 = str;
                    String str28 = str24;
                    ArrayList arrayList5 = new ArrayList();
                    zdm.m45335a(arrayList4, arrayList5);
                    m46594a(messageEventParcelable2, str5, arrayList5, bngx.m109376e());
                    zwa = this;
                    z = true;
                    zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                    if (!z) {
                    }
                    break;
                case 2:
                    cadw cadw = (cadw) GeneratedMessageLite.m124016a(cadw.f172748g, messageEventParcelable2.f110948c, bxus.m123744c());
                    caae a6 = c3.mo31377a(cadw.f172752c);
                    Iterator it3 = bmyx.m108640a('-').mo66918a((CharSequence) cadw.f172753d).iterator();
                    List e11 = a6 != null ? c3.mo31364a(a6, Long.parseLong((String) it3.next()), Long.parseLong((String) it3.next())).f172714c : bngx.m109376e();
                    yrd b3 = yre.m44651b();
                    b3.f54474a = e11;
                    m46595a(messageEventParcelable2, str5, b3.mo30685a(), yri.f54490c);
                    zwa = this;
                    z = false;
                    zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                    if (!z) {
                    }
                    break;
                case 3:
                    byte[] bArr2 = messageEventParcelable2.f110948c;
                    bxus c5 = bxus.m123744c();
                    HashSet<caae> hashSet = new HashSet();
                    cabr cabr = ((cabs) GeneratedMessageLite.m124016a(cabs.f172471d, bArr2, c5)).f172475c;
                    if (cabr == null) {
                        cabr = cabr.f172468b;
                    }
                    for (String str29 : cabr.f172470a) {
                        caae a7 = c3.mo31377a(str29);
                        if (a7 != null) {
                            hashSet.add(a7);
                        }
                    }
                    cabp cabp = (cabp) cabq.f172465b.mo74144da();
                    for (caae caae2 : hashSet) {
                        bxvd da = cabo.f172459e.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cabo cabo = (cabo) da.f164949b;
                        caae2.getClass();
                        cabo.f172464d = caae2;
                        cabo.f172461a |= 4;
                        cabp.mo74607a(da);
                    }
                    bxvd da2 = cabt.f172477c.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    cabt cabt = (cabt) da2.f164949b;
                    cabq cabq = (cabq) cabp.mo74062i();
                    cabq.getClass();
                    cabt.f172480b = cabq;
                    cabt.f172479a |= 1;
                    m46593a(messageEventParcelable2, str5, (cabt) da2.mo74062i(), "/WearablesSync/DataSourcesResponse/");
                    zwa = this;
                    z = false;
                    zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                    if (!z) {
                    }
                    break;
                case 4:
                    zwa3 = this;
                    try {
                        long d2 = zuq.m46521d(((cacn) GeneratedMessageLite.m124016a(cacn.f172581d, messageEventParcelable2.f110948c, bxus.m123744c())).f172585c);
                        caco = (caco) cacp.f172587f.mo74144da();
                        c2 = c3.mo31354c((int) ceab.m135730c(), d2);
                        bngx bngx = c2.f55741b;
                        if (bngx.size() == ((int) ceab.m135730c())) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (caco.f164950c) {
                            caco.mo74035c();
                            caco.f164950c = false;
                        }
                        cacp cacp = (cacp) caco.f164949b;
                        cacp.f172589a |= 2;
                        cacp.f172592d = z2;
                        bngx<cabc> a8 = zuq.m46511a(bngx, c3, zvz.f56039a);
                        j4 = bngx.m109377j();
                        bndu r = bndu.m109109r();
                        for (cabc cabc2 : a8) {
                            r.mo67268a(cabc2.f172416d, cabc2);
                        }
                        for (Map.Entry entry : r.mo67318q().entrySet()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (cabc cabc3 : (Collection) entry.getValue()) {
                                caaa caaa4 = cabc3.f172417e;
                                if (caaa4 == null) {
                                    caaa4 = caaa.f172305j;
                                }
                                bxvd bxvd = (bxvd) caaa4.mo74142c(i);
                                bxvd.mo73625a((GeneratedMessageLite) caaa4);
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                caaa caaa5 = (caaa) bxvd.f164949b;
                                caaa5.f172307a &= -17;
                                caaa5.f172313g = 0;
                                caaa caaa6 = (caaa) bxvd.mo74062i();
                                linkedHashMap.remove(caaa6);
                                linkedHashMap.put(caaa6, cabc3);
                                str22 = str22;
                                i = 5;
                            }
                            String str30 = str22;
                            j4.mo67666b((Iterable) linkedHashMap.values());
                            str22 = str30;
                            i = 5;
                        }
                        str15 = str22;
                    } catch (IOException e12) {
                        e = e12;
                        th = e;
                        str3 = str17;
                        str2 = str24;
                        bnsl bnsl2222222222 = (bnsl) f56040a.mo68388c();
                        bnsl2222222222.mo68437a(th);
                        bnsl2222222222.mo68432a(str3, str, 180, str2);
                        bnsl2222222222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                    } catch (IllegalArgumentException e13) {
                        e = e13;
                        th = e;
                        str3 = str17;
                        str2 = str24;
                        bnsl bnsl22222222222 = (bnsl) f56040a.mo68388c();
                        bnsl22222222222.mo68437a(th);
                        bnsl22222222222.mo68432a(str3, str, 180, str2);
                        bnsl22222222222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                    }
                    try {
                        caco.mo74609a(j4.mo67664a());
                        String l = Long.toString(c2.f55740a + 1);
                        if (caco.f164950c) {
                            caco.mo74035c();
                            caco.f164950c = false;
                        }
                        cacp cacp2 = (cacp) caco.f164949b;
                        l.getClass();
                        cacp2.f172589a |= 1;
                        cacp2.f172591c = l;
                        if (!cacp2.f172592d) {
                            long b4 = zuw.m46536b(zwa3.f56041b, str5);
                            if (caco.f164950c) {
                                caco.mo74035c();
                                caco.f164950c = false;
                            }
                            cacp cacp3 = (cacp) caco.f164949b;
                            cacp3.f172589a |= 4;
                            cacp3.f172593e = b4;
                        }
                        cacp cacp4 = (cacp) caco.f164949b;
                        String str31 = cacp4.f172591c;
                        cacp4.f172590b.size();
                        zwa3.m46593a(messageEventParcelable, str5, (cacp) caco.mo74062i(), str15);
                        zwa = zwa3;
                        z = false;
                        zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                        if (!z) {
                        }
                    } catch (IOException e14) {
                        e = e14;
                        th = e;
                        str3 = str17;
                        str2 = str24;
                        bnsl bnsl222222222222 = (bnsl) f56040a.mo68388c();
                        bnsl222222222222.mo68437a(th);
                        bnsl222222222222.mo68432a(str3, str, 180, str2);
                        bnsl222222222222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                    } catch (IllegalArgumentException e15) {
                        e = e15;
                        th = e;
                        str3 = str17;
                        str2 = str24;
                        bnsl bnsl2222222222222 = (bnsl) f56040a.mo68388c();
                        bnsl2222222222222.mo68437a(th);
                        bnsl2222222222222.mo68432a(str3, str, 180, str2);
                        bnsl2222222222222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                    }
                    break;
                case 5:
                    try {
                        cacd cacd = (cacd) GeneratedMessageLite.m124016a(cacd.f172516i, messageEventParcelable2.f110948c, bxus.m123744c());
                        String str32 = cacd.f172520c;
                        String str33 = cacd.f172521d;
                        bngs j12 = bngx.m109377j();
                        bngs j13 = bngx.m109377j();
                        caae a9 = c3.mo31377a(str32);
                        long d3 = zuq.m46521d(str33);
                        if (a9 != null) {
                            if (d3 < c3.mo31345a()) {
                                cadp a10 = c3.mo31363a(a9, TimeUnit.MILLISECONDS.toNanos(d3), (int) ceab.m135730c());
                                j12.mo67666b((Iterable) a10.f172714c);
                                for (cadn cadn : a10.f172714c) {
                                    caah caah = a9.f172330f;
                                    if (caah == null) {
                                        caah = caah.f172333d;
                                    }
                                    if (caah.f172336b.equals("com.google.internal.goal")) {
                                        j6 = TimeUnit.NANOSECONDS.toMillis(cadn.f172703c);
                                    } else {
                                        j6 = TimeUnit.NANOSECONDS.toMillis(cadn.f172702b);
                                    }
                                    if (j6 > d3) {
                                        d3 = j6;
                                    }
                                }
                            } else {
                                int c6 = (int) ceab.m135730c();
                                long j14 = d3;
                                while (true) {
                                    zrb c7 = c3.mo31354c(c6, d3);
                                    bnre i3 = c7.f55741b.listIterator();
                                    int i4 = 0;
                                    long j15 = d3;
                                    j5 = j14;
                                    while (true) {
                                        if (i3.hasNext()) {
                                            try {
                                                bnre bnre = i3;
                                                cabc cabc4 = (cabc) i3.next();
                                                j15 = Math.max(j15, cabc4.f172420h);
                                                if (!cabc4.f172416d.equals(str32)) {
                                                    i3 = bnre;
                                                } else if (i4 < ((int) ceab.m135730c())) {
                                                    j5 = cabc4.f172420h;
                                                    if (!cabc4.f172415c) {
                                                        bngs = j12;
                                                    } else {
                                                        bngs = j13;
                                                    }
                                                    caaa caaa7 = cabc4.f172417e;
                                                    if (caaa7 == null) {
                                                        caaa7 = caaa.f172305j;
                                                    }
                                                    bngs.mo67666b((Iterable) yrm.m44667a(bngx.m109356a(caaa7), a9, c3));
                                                    i4++;
                                                    i3 = bnre;
                                                }
                                            } catch (IOException | IllegalArgumentException e16) {
                                                e = e16;
                                                th = e;
                                                str3 = str17;
                                                str2 = str24;
                                                bnsl bnsl22222222222222 = (bnsl) f56040a.mo68388c();
                                                bnsl22222222222222.mo68437a(th);
                                                bnsl22222222222222.mo68432a(str3, str, 180, str2);
                                                bnsl22222222222222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                                            }
                                        } else {
                                            try {
                                                if (c7.f55741b.size() >= c6) {
                                                    d3 = j15 + 1;
                                                    j14 = j5;
                                                }
                                            } catch (IOException | IllegalArgumentException e17) {
                                                e = e17;
                                                th = e;
                                                str3 = str17;
                                                str2 = str24;
                                                bnsl bnsl222222222222222 = (bnsl) f56040a.mo68388c();
                                                bnsl222222222222222.mo68437a(th);
                                                bnsl222222222222222.mo68432a(str3, str, 180, str2);
                                                bnsl222222222222222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                                            }
                                        }
                                    }
                                }
                                d3 = j5;
                            }
                            bngx a11 = j12.mo67664a();
                            bngx a12 = j13.mo67664a();
                            a11.size();
                            a12.size();
                            yrd b5 = yre.m44651b();
                            b5.f54474a = a11;
                            b5.f54475b = a12;
                            b5.f54479f = Long.toString(d3 + 1);
                            zwa3 = this;
                            try {
                                zwa3.m46595a(messageEventParcelable, str5, b5.mo30685a(), yri.f54490c);
                                zwa = zwa3;
                                z = false;
                                zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                                if (!z) {
                                }
                            } catch (IOException e18) {
                                e = e18;
                                break;
                            } catch (IllegalArgumentException e19) {
                                e = e19;
                                break;
                            }
                        } else {
                            yrd b6 = yre.m44651b();
                            b6.f54479f = Long.toString(d3 + 1);
                            m46595a(messageEventParcelable2, str5, b6.mo30685a(), yri.f54490c);
                            zwa = this;
                            z = false;
                            zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                            if (!z) {
                            }
                        }
                    } catch (IOException | IllegalArgumentException e20) {
                        e = e20;
                        str4 = str17;
                        str2 = str24;
                        th = e;
                        bnsl bnsl2222222222222222 = (bnsl) f56040a.mo68388c();
                        bnsl2222222222222222.mo68437a(th);
                        bnsl2222222222222222.mo68432a(str3, str, 180, str2);
                        bnsl2222222222222222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                    }
                    break;
                case 6:
                    cacq cacq = (cacq) GeneratedMessageLite.m124016a(cacq.f172595h, messageEventParcelable2.f110948c, bxus.m123744c());
                    long d4 = zuq.m46521d(cacq.f172602f);
                    cabq cabq2 = cacq.f172600d;
                    if (cabq2 == null) {
                        cabq2 = cabq.f172465b;
                    }
                    Long valueOf = Long.valueOf(d4);
                    bngs j16 = bngx.m109377j();
                    bngs j17 = bngx.m109377j();
                    HashSet hashSet2 = new HashSet();
                    if (valueOf.longValue() != 0) {
                        zrb = c3.mo31351b(valueOf.longValue());
                        bnre i5 = zrb.f55741b.listIterator();
                        while (i5.hasNext()) {
                            cabo cabo2 = (cabo) i5.next();
                            if (!cabo2.f172462b.isEmpty()) {
                                j17.mo67668c(yyd.m44992c(cabo2.f172462b));
                                hashSet2.add(cabo2.f172462b);
                            } else if ((cabo2.f172461a & 4) != 0) {
                                caae caae3 = cabo2.f172464d;
                                if (caae3 == null) {
                                    caae3 = caae.f172323i;
                                }
                                j16.mo67668c(caae3);
                            }
                        }
                    } else {
                        j16.mo67666b((Iterable) c3.mo31389i().keySet());
                        zrb = null;
                    }
                    bngs b7 = bngx.m109371b(cabq2.f172467a.size());
                    for (cabo cabo3 : cabq2.f172467a) {
                        if ((cabo3.f172461a & 4) != 0) {
                            caae caae4 = cabo3.f172464d;
                            if (caae4 == null) {
                                caae4 = caae.f172323i;
                            }
                            if (!hashSet2.contains(caae4.f172326b)) {
                                caae caae5 = cabo3.f172464d;
                                if (caae5 == null) {
                                    caae5 = caae.f172323i;
                                }
                                b7.mo67668c(caae5);
                            }
                        }
                    }
                    c3.mo31380a((Collection) b7.mo67664a());
                    if (zrb == null) {
                        j7 = this.f56045f.mo20505a();
                    } else {
                        j7 = zrb.f55740a + 1;
                    }
                    Long valueOf2 = Long.valueOf(j7);
                    yrd b8 = yre.m44651b();
                    b8.f54474a = j16.mo67664a();
                    b8.f54476c = j17.mo67664a();
                    b8.f54479f = Long.toString(valueOf2.longValue());
                    m46595a(messageEventParcelable2, str5, b8.mo30685a(), yri.f54488a);
                    zwa = this;
                    z = false;
                    zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                    if (!z) {
                    }
                    break;
                case 7:
                    Context context = this.f56041b;
                    if (cdzd.f182003a.mo6606a().mo78569ai()) {
                        for (cadr cadr : ((cads) GeneratedMessageLite.m124016a(cads.f172724b, messageEventParcelable2.f110948c, bxus.m123744c())).f172726a) {
                            bxvd bxvd2 = (bxvd) cadr.mo74142c(5);
                            bxvd2.mo73625a((GeneratedMessageLite) cadr);
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            cadr cadr2 = (cadr) bxvd2.f164949b;
                            cadr cadr3 = cadr.f172717f;
                            cadr2.f172719a |= 4;
                            cadr2.f172722d = -1;
                            e.mo31398a(new yqe("com.google.android.gms.paired", (cadr) bxvd2.mo74062i(), 2));
                        }
                        zvm.m46571a(context, str5);
                    }
                    zwa = this;
                    z = false;
                    zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                    if (!z) {
                    }
                    break;
                case 8:
                    Long valueOf3 = Long.valueOf(zuq.m46521d(((cadx) GeneratedMessageLite.m124016a(cadx.f172757h, messageEventParcelable2.f110948c, bxus.m123744c())).f172764f));
                    sqv sqv = this.f56045f;
                    bngs j18 = bngx.m109377j();
                    bngs j19 = bngx.m109377j();
                    if (valueOf3.longValue() != 0) {
                        zrb2 = c3.mo31347a(valueOf3.longValue());
                        bnre i6 = zrb2.f55741b.listIterator();
                        while (i6.hasNext()) {
                            cacl cacl2 = (cacl) i6.next();
                            if (cacl2.f172573b == 1) {
                                str16 = (String) cacl2.f172574c;
                            } else {
                                str16 = "";
                            }
                            if (str16.isEmpty()) {
                                if (cacl2.f172573b == 2) {
                                    cadz = (cadz) cacl2.f172574c;
                                } else {
                                    cadz = cadz.f172773j;
                                }
                                j18.mo67668c(cadz);
                            } else {
                                cadz cadz3 = cacl2.f172577f;
                                if (cadz3 == null) {
                                    cadz3 = cadz.f172773j;
                                }
                                j19.mo67668c(cadz3);
                            }
                        }
                    } else {
                        j18.mo67666b((Iterable) c3.mo31392a(null, null, null, -1, -1));
                        zrb2 = null;
                    }
                    if (zrb2 != null) {
                        j8 = zrb2.f55740a + 1;
                    } else {
                        j8 = sqv.mo20505a();
                    }
                    Long valueOf4 = Long.valueOf(j8);
                    yrd b9 = yre.m44651b();
                    b9.f54474a = j18.mo67664a();
                    b9.f54475b = j19.mo67664a();
                    b9.f54479f = Long.toString(valueOf4.longValue());
                    m46595a(messageEventParcelable2, str5, b9.mo30685a(), yri.f54489b);
                    zwa = this;
                    z = false;
                    zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                    if (!z) {
                    }
                    break;
                case 9:
                case 16:
                case 17:
                case 18:
                    zwa = this;
                    z = false;
                    zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                    if (!z) {
                    }
                    break;
                case 10:
                    String str34 = str21;
                    cabb cabb = (cabb) GeneratedMessageLite.m124016a(cabb.f172405e, messageEventParcelable2.f110948c, bxus.m123744c());
                    if (str34 != null) {
                        this.f56043d.mo31543a(Integer.parseInt(str34), cabb);
                    } else {
                        int i7 = cabb.f172410d;
                        if (i7 <= 0) {
                            c3.mo31344a((List) cabb.f172408b);
                            c3.mo31348a((Set) new C1225nr(cabb.f172409c));
                        } else {
                            this.f56043d.mo31543a(i7, cabb);
                        }
                    }
                    zvj.f56009r += cabb.f172408b.size();
                    zvj.f56010s += cabb.f172409c.size();
                    cabb.f172408b.size();
                    cabb.f172409c.size();
                    zwa = this;
                    z = false;
                    zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                    if (!z) {
                    }
                    break;
                case 11:
                    m46598a(str21);
                    this.f56043d.mo31543a(Integer.parseInt(str21), (cabt) GeneratedMessageLite.m124016a(cabt.f172477c, messageEventParcelable2.f110948c, bxus.m123744c()));
                    zwa = this;
                    z = false;
                    zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                    if (!z) {
                    }
                    break;
                case 12:
                    m46598a(str21);
                    this.f56043d.mo31543a(Integer.parseInt(str21), (cacp) GeneratedMessageLite.m124016a(cacp.f172587f, messageEventParcelable2.f110948c, bxus.m123744c()));
                    zwa = this;
                    z = false;
                    zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                    if (!z) {
                    }
                    break;
                case 13:
                    m46598a(str21);
                    m46597a(messageEventParcelable2, str21, c3, yri.f54490c);
                    zwa = this;
                    z = false;
                    zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                    if (!z) {
                    }
                    break;
                case 14:
                    m46598a(str21);
                    m46597a(messageEventParcelable2, str21, c3, yri.f54488a);
                    zwa = this;
                    z = false;
                    zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                    if (!z) {
                    }
                    break;
                case 15:
                    try {
                        m46598a(str21);
                        m46597a(messageEventParcelable2, str21, c3, yri.f54489b);
                        zwa = this;
                        z = false;
                        zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                        if (!z) {
                        }
                    } catch (IOException | IllegalArgumentException e21) {
                        e = e21;
                        str4 = str17;
                        str2 = str24;
                        th = e;
                        bnsl bnsl22222222222222222 = (bnsl) f56040a.mo68388c();
                        bnsl22222222222222222.mo68437a(th);
                        bnsl22222222222222222.mo68432a(str3, str, 180, str2);
                        bnsl22222222222222222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                    }
                    break;
                default:
                    zwa = this;
                    String str35 = str24;
                    String str36 = str17;
                    try {
                        bnsl = (bnsl) f56040a.mo68388c();
                        str2 = str35;
                        str4 = str36;
                    } catch (IOException | IllegalArgumentException e22) {
                        e = e22;
                        str2 = str35;
                        str4 = str36;
                    }
                    try {
                        bnsl.mo68432a(str4, "c", 303, str2);
                        bnsl.mo68420a("Unrecognized request: %s", sb2);
                        z = false;
                        zvj.m46563a(str20.substring(15).split(str23, 3)[0], zwa.f56045f.mo20506b() - j9);
                        if (!z) {
                        }
                    } catch (IOException | IllegalArgumentException e23) {
                        e = e23;
                        th = e;
                        bnsl bnsl222222222222222222 = (bnsl) f56040a.mo68388c();
                        bnsl222222222222222222.mo68437a(th);
                        bnsl222222222222222222.mo68432a(str3, str, 180, str2);
                        bnsl222222222222222222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
                    }
                    break;
            }
        } catch (IOException | IllegalArgumentException e24) {
            e = e24;
            str = "a";
            str2 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
            str4 = str17;
            th = e;
            bnsl bnsl2222222222222222222 = (bnsl) f56040a.mo68388c();
            bnsl2222222222222222222.mo68437a(th);
            bnsl2222222222222222222.mo68432a(str3, str, 180, str2);
            bnsl2222222222222222222.mo68420a("WearableSyncHostService unable to sync: %s", messageEventParcelable);
        }
    }
}
