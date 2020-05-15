package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acwl {

    /* renamed from: a */
    public static final Object f60968a = new Object();

    /* renamed from: a */
    private static String m49903a(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? "UNKNOWN" : "END" : "START";
    }

    /* JADX WARN: Type inference failed for: r5v0, assign insn: 0x000a: CONST  (r5v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean], assign insn: PHI: (r5v1 ?) = (r5v0 ?), (r5v2 ?) binds: [B:0:0x0000, B:180:0x03ae] */
    /* JADX WARN: Type inference failed for: r5v2, assign insn: 0x03b6: CONST  (r5v2 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0362 A[Catch:{ bxwf -> 0x034b, bxwf -> 0x0389 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0369 A[Catch:{ bxwf -> 0x034b, bxwf -> 0x0389 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0378 A[Catch:{ bxwf -> 0x034b, bxwf -> 0x0389 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0382 A[Catch:{ bxwf -> 0x034b, bxwf -> 0x0389 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01fb  */
    /* renamed from: a */
    public static List m49904a(Context context, String str, List list, UsageInfo[] usageInfoArr) {
        UsageInfo usageInfo;
        int i;
        String str2;
        abqe abqe;
        abqe abqe2;
        bxvd da;
        int size;
        String str3;
        int i2;
        String str4;
        abuy a;
        int a2;
        abtc a3;
        int a4;
        cixk a5;
        cixm cixm;
        String str5;
        acqi acqi;
        String str6 = str;
        UsageInfo[] usageInfoArr2 = usageInfoArr;
        ArrayList arrayList = new ArrayList();
        int length = usageInfoArr2.length;
        ? r5 = 0;
        int i3 = 0;
        while (i3 < length) {
            UsageInfo usageInfo2 = usageInfoArr2[i3];
            if (!(usageInfo2 == null || usageInfo2.f9698e == null)) {
                abuu a6 = acxo.m49957a(usageInfo2, str6, System.currentTimeMillis(), list);
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str6, 64);
                    i = packageInfo.versionCode;
                    try {
                        str2 = spn.m35850a(packageInfo);
                    } catch (PackageManager.NameNotFoundException e) {
                        e = e;
                        Object[] objArr = new Object[1];
                        objArr[r5] = str6;
                        absg.m48200c(e, "Information for package not found: %s", objArr);
                        str2 = null;
                        if (str2 == null) {
                        }
                        abqe = a6.f58479i;
                        if (abqe == null) {
                        }
                        absr a7 = abzm.m48650a(str6, abqe);
                        abqe2 = a6.f58479i;
                        if (abqe2 == null) {
                        }
                        abto a8 = acxs.m49969a(a7, a6);
                        da = acqi.f60472q.mo74144da();
                        long j = abqe2.f57956f;
                        if (da.f164950c) {
                        }
                        acqi acqi2 = (acqi) da.f164949b;
                        int i4 = acqi2.f60474a | 1;
                        acqi2.f60474a = i4;
                        acqi2.f60475b = j;
                        String str7 = a7.f58140e;
                        str7.getClass();
                        int i5 = i4 | 2;
                        acqi2.f60474a = i5;
                        acqi2.f60476c = str7;
                        int i6 = i5 | 16;
                        acqi2.f60474a = i6;
                        acqi2.f60478e = i;
                        str2.getClass();
                        acqi2.f60474a = i6 | 4;
                        acqi2.f60477d = str2;
                        bxwc bxwc = abqe2.f57955e;
                        size = bxwc.size();
                        str3 = null;
                        i2 = 0;
                        str4 = null;
                        String str8 = null;
                        Uri uri = null;
                        while (i2 < size) {
                        }
                        Intent intent = new Intent();
                        intent.setAction(str8);
                        intent.setData(uri);
                        if (str4 == null) {
                        }
                        if (str3 != null) {
                        }
                        String uri2 = fts.m12362a(intent).toString();
                        if (da.f164950c) {
                        }
                        acqi acqi3 = (acqi) da.f164949b;
                        uri2.getClass();
                        int i7 = acqi3.f60474a | 1024;
                        acqi3.f60474a = i7;
                        acqi3.f60483j = uri2;
                        String str9 = abqe2.f57953c;
                        str9.getClass();
                        int i8 = i7 | 4096;
                        acqi3.f60474a = i8;
                        acqi3.f60485l = str9;
                        String str10 = a7.f58152q;
                        str10.getClass();
                        acqi3.f60474a = i8 | 8192;
                        acqi3.f60486m = str10;
                        a = abuy.m48299a(a8.f58282e);
                        if (a == null) {
                        }
                        a2 = acqf.m49698a(a.f58502g);
                        if (a2 != 0) {
                        }
                        a3 = abtc.m48241a(a8.f58285h);
                        if (a3 == null) {
                        }
                        a4 = acqh.m49700a(a3.f58200d);
                        if (a4 != 0) {
                        }
                        int i9 = a8.f58283f;
                        if (da.f164950c) {
                        }
                        acqi acqi4 = (acqi) da.f164949b;
                        acqi4.f60474a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                        acqi4.f60488o = i9;
                        acqi acqi5 = (acqi) da.mo74062i();
                        bxvd bxvd = (bxvd) acqi5.mo74142c(5);
                        bxvd.mo73625a((bxvk) acqi5);
                        a5 = fsi.m12248a("object", usageInfo2);
                        if (a5 != null) {
                        }
                        arrayList.add((acqi) bxvd.mo74062i());
                        i3++;
                        str6 = str;
                        usageInfoArr2 = usageInfoArr;
                        length = length;
                        r5 = 0;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    e = e2;
                    i = 0;
                    Object[] objArr2 = new Object[1];
                    objArr2[r5] = str6;
                    absg.m48200c(e, "Information for package not found: %s", objArr2);
                    str2 = null;
                    if (str2 == null) {
                    }
                    abqe = a6.f58479i;
                    if (abqe == null) {
                    }
                    absr a72 = abzm.m48650a(str6, abqe);
                    abqe2 = a6.f58479i;
                    if (abqe2 == null) {
                    }
                    abto a82 = acxs.m49969a(a72, a6);
                    da = acqi.f60472q.mo74144da();
                    long j2 = abqe2.f57956f;
                    if (da.f164950c) {
                    }
                    acqi acqi22 = (acqi) da.f164949b;
                    int i42 = acqi22.f60474a | 1;
                    acqi22.f60474a = i42;
                    acqi22.f60475b = j2;
                    String str72 = a72.f58140e;
                    str72.getClass();
                    int i52 = i42 | 2;
                    acqi22.f60474a = i52;
                    acqi22.f60476c = str72;
                    int i62 = i52 | 16;
                    acqi22.f60474a = i62;
                    acqi22.f60478e = i;
                    str2.getClass();
                    acqi22.f60474a = i62 | 4;
                    acqi22.f60477d = str2;
                    bxwc bxwc2 = abqe2.f57955e;
                    size = bxwc2.size();
                    str3 = null;
                    i2 = 0;
                    str4 = null;
                    String str82 = null;
                    Uri uri3 = null;
                    while (i2 < size) {
                    }
                    Intent intent2 = new Intent();
                    intent2.setAction(str82);
                    intent2.setData(uri3);
                    if (str4 == null) {
                    }
                    if (str3 != null) {
                    }
                    String uri22 = fts.m12362a(intent2).toString();
                    if (da.f164950c) {
                    }
                    acqi acqi32 = (acqi) da.f164949b;
                    uri22.getClass();
                    int i72 = acqi32.f60474a | 1024;
                    acqi32.f60474a = i72;
                    acqi32.f60483j = uri22;
                    String str92 = abqe2.f57953c;
                    str92.getClass();
                    int i82 = i72 | 4096;
                    acqi32.f60474a = i82;
                    acqi32.f60485l = str92;
                    String str102 = a72.f58152q;
                    str102.getClass();
                    acqi32.f60474a = i82 | 8192;
                    acqi32.f60486m = str102;
                    a = abuy.m48299a(a82.f58282e);
                    if (a == null) {
                    }
                    a2 = acqf.m49698a(a.f58502g);
                    if (a2 != 0) {
                    }
                    a3 = abtc.m48241a(a82.f58285h);
                    if (a3 == null) {
                    }
                    a4 = acqh.m49700a(a3.f58200d);
                    if (a4 != 0) {
                    }
                    int i92 = a82.f58283f;
                    if (da.f164950c) {
                    }
                    acqi acqi42 = (acqi) da.f164949b;
                    acqi42.f60474a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                    acqi42.f60488o = i92;
                    acqi acqi52 = (acqi) da.mo74062i();
                    bxvd bxvd2 = (bxvd) acqi52.mo74142c(5);
                    bxvd2.mo73625a((bxvk) acqi52);
                    a5 = fsi.m12248a("object", usageInfo2);
                    if (a5 != null) {
                    }
                    arrayList.add((acqi) bxvd2.mo74062i());
                    i3++;
                    str6 = str;
                    usageInfoArr2 = usageInfoArr;
                    length = length;
                    r5 = 0;
                }
                if (str2 == null) {
                    str2 = "";
                }
                abqe = a6.f58479i;
                if (abqe == null) {
                    abqe = abqe.f57949g;
                }
                absr a722 = abzm.m48650a(str6, abqe);
                abqe2 = a6.f58479i;
                if (abqe2 == null) {
                    abqe2 = abqe.f57949g;
                }
                abto a822 = acxs.m49969a(a722, a6);
                da = acqi.f60472q.mo74144da();
                long j22 = abqe2.f57956f;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = r5;
                }
                acqi acqi222 = (acqi) da.f164949b;
                int i422 = acqi222.f60474a | 1;
                acqi222.f60474a = i422;
                acqi222.f60475b = j22;
                String str722 = a722.f58140e;
                str722.getClass();
                int i522 = i422 | 2;
                acqi222.f60474a = i522;
                acqi222.f60476c = str722;
                int i622 = i522 | 16;
                acqi222.f60474a = i622;
                acqi222.f60478e = i;
                str2.getClass();
                acqi222.f60474a = i622 | 4;
                acqi222.f60477d = str2;
                bxwc bxwc22 = abqe2.f57955e;
                size = bxwc22.size();
                str3 = null;
                i2 = 0;
                str4 = null;
                String str822 = null;
                Uri uri32 = null;
                while (i2 < size) {
                    abqd abqd = (abqd) bxwc22.get(i2);
                    String str11 = str3;
                    abqo abqo = abqd.f57948d;
                    if (abqo == null) {
                        abqo = abqo.f57975r;
                    }
                    String str12 = abqo.f57978b;
                    int i10 = length;
                    abqo abqo2 = abqd.f57948d;
                    if (abqo2 == null) {
                        abqo2 = abqo.f57975r;
                    }
                    String str13 = abqo2.f57988m;
                    bxwc bxwc3 = bxwc22;
                    if ("name".equals(str13)) {
                        String l = abqd.f57947c.mo73781l();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        acqi acqi6 = (acqi) da.f164949b;
                        l.getClass();
                        acqi6.f60474a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        acqi6.f60481h = l;
                        usageInfo = usageInfo2;
                    } else if ("url".equals(str13)) {
                        String l2 = abqd.f57947c.mo73781l();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        acqi acqi7 = (acqi) da.f164949b;
                        l2.getClass();
                        acqi7.f60474a |= 2048;
                        acqi7.f60484k = l2;
                        usageInfo = usageInfo2;
                    } else if (".private:action".equals(str13)) {
                        try {
                            bxtx bxtx = abqd.f57947c;
                            bxus c = bxus.m123744c();
                            cixm cixm2 = cixm.f191686d;
                            try {
                                bxuc h = bxtx.mo73764h();
                                bxvk bxvk = (bxvk) cixm2.mo74142c(4);
                                try {
                                    bxxv a9 = bxxm.f165037a.mo74228a(bxvk);
                                    usageInfo = usageInfo2;
                                    try {
                                        a9.mo74220a(bxvk, bxud.m123454a(h), c);
                                        a9.mo74225d(bxvk);
                                    } catch (IOException e3) {
                                        e = e3;
                                        if (e.getCause() instanceof bxwf) {
                                            throw new bxwf(e.getMessage());
                                        }
                                        throw ((bxwf) e.getCause());
                                    } catch (RuntimeException e4) {
                                        e = e4;
                                        if (!(e.getCause() instanceof bxwf)) {
                                            throw ((bxwf) e.getCause());
                                        }
                                        throw e;
                                    }
                                    try {
                                        h.mo73787a(0);
                                        try {
                                            bxvk.m124027b(bxvk);
                                            cixm = (cixm) bxvk;
                                            str5 = cixm.f191689b;
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                try {
                                                    da.f164950c = false;
                                                } catch (bxwf e5) {
                                                    absg.m48191b("Failed to parse schemaOrgAction proto.");
                                                    i2++;
                                                    str3 = str11;
                                                    length = i10;
                                                    bxwc22 = bxwc3;
                                                    usageInfo2 = usageInfo;
                                                }
                                            }
                                            acqi = (acqi) da.f164949b;
                                            str5.getClass();
                                        } catch (bxwf e6) {
                                            absg.m48191b("Failed to parse schemaOrgAction proto.");
                                            i2++;
                                            str3 = str11;
                                            length = i10;
                                            bxwc22 = bxwc3;
                                            usageInfo2 = usageInfo;
                                        }
                                        try {
                                            acqi.f60474a |= 64;
                                            acqi.f60480g = str5;
                                            bxwc bxwc4 = cixm.f191690c;
                                            if (!acqi.f60487n.mo73666a()) {
                                                acqi.f60487n = bxvk.m124021a(acqi.f60487n);
                                            }
                                            bxsy.m123078a(bxwc4, acqi.f60487n);
                                        } catch (bxwf e7) {
                                        }
                                    } catch (bxwf e8) {
                                        throw e8;
                                    } catch (bxwf e9) {
                                        e = e9;
                                        throw e;
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                    if (e.getCause() instanceof bxwf) {
                                    }
                                } catch (RuntimeException e11) {
                                    e = e11;
                                    if (!(e.getCause() instanceof bxwf)) {
                                    }
                                }
                            } catch (bxwf e12) {
                                e = e12;
                                usageInfo = usageInfo2;
                                throw e;
                            }
                        } catch (bxwf e13) {
                            usageInfo = usageInfo2;
                            absg.m48191b("Failed to parse schemaOrgAction proto.");
                            i2++;
                            str3 = str11;
                            length = i10;
                            bxwc22 = bxwc3;
                            usageInfo2 = usageInfo;
                        }
                    } else if ("intent_action".equals(str12)) {
                        str822 = abqd.f57947c.mo73781l();
                        usageInfo = usageInfo2;
                    } else if ("intent_data".equals(str12)) {
                        uri32 = Uri.parse(abqd.f57947c.mo73781l());
                        usageInfo = usageInfo2;
                    } else if ("intent_activity".equals(str12)) {
                        str4 = abqd.f57947c.mo73781l();
                        usageInfo = usageInfo2;
                    } else {
                        if ("intent_extra_data".equals(str12)) {
                            str11 = abqd.f57947c.mo73781l();
                        }
                        usageInfo = usageInfo2;
                    }
                    i2++;
                    str3 = str11;
                    length = i10;
                    bxwc22 = bxwc3;
                    usageInfo2 = usageInfo;
                }
                Intent intent22 = new Intent();
                intent22.setAction(str822);
                intent22.setData(uri32);
                if (str4 == null) {
                    intent22.setPackage(a722.f58140e);
                } else {
                    intent22.setClassName(a722.f58140e, str4);
                }
                if (str3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("intent_extra_data_key", str3);
                    intent22.putExtras(bundle);
                }
                String uri222 = fts.m12362a(intent22).toString();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                acqi acqi322 = (acqi) da.f164949b;
                uri222.getClass();
                int i722 = acqi322.f60474a | 1024;
                acqi322.f60474a = i722;
                acqi322.f60483j = uri222;
                String str922 = abqe2.f57953c;
                str922.getClass();
                int i822 = i722 | 4096;
                acqi322.f60474a = i822;
                acqi322.f60485l = str922;
                String str1022 = a722.f58152q;
                str1022.getClass();
                acqi322.f60474a = i822 | 8192;
                acqi322.f60486m = str1022;
                a = abuy.m48299a(a822.f58282e);
                if (a == null) {
                    a = abuy.GENERAL_USE;
                }
                a2 = acqf.m49698a(a.f58502g);
                if (a2 != 0) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    acqi acqi8 = (acqi) da.f164949b;
                    acqi8.f60479f = a2 - 1;
                    acqi8.f60474a |= 32;
                }
                a3 = abtc.m48241a(a822.f58285h);
                if (a3 == null) {
                    a3 = abtc.UNKNOWN;
                }
                a4 = acqh.m49700a(a3.f58200d);
                if (a4 != 0) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    acqi acqi9 = (acqi) da.f164949b;
                    acqi9.f60489p = a4 - 1;
                    acqi9.f60474a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                }
                int i922 = a822.f58283f;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                acqi acqi422 = (acqi) da.f164949b;
                acqi422.f60474a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                acqi422.f60488o = i922;
                acqi acqi522 = (acqi) da.mo74062i();
                bxvd bxvd22 = (bxvd) acqi522.mo74142c(5);
                bxvd22.mo73625a((bxvk) acqi522);
                a5 = fsi.m12248a("object", usageInfo2);
                if (a5 != null) {
                    cixn cixn = a5.f191685c;
                    if (cixn == null) {
                        cixn = cixn.f191691g;
                    }
                    cixm cixm3 = cixn.f191698f;
                    if (cixm3 == null) {
                        cixm3 = cixm.f191686d;
                    }
                    bxwc bxwc5 = cixm3.f191690c;
                    int size2 = bxwc5.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        cixk cixk = (cixk) bxwc5.get(i11);
                        int i12 = cixk.f191683a;
                        if ((i12 & 1) == 0 || (i12 & 2) == 0 || !"description".equals(cixk.f191684b)) {
                            i11++;
                        } else {
                            cixn cixn2 = cixk.f191685c;
                            if (cixn2 == null) {
                                cixn2 = cixn.f191691g;
                            }
                            String str14 = cixn2.f191695c;
                            if (bxvd22.f164950c) {
                                bxvd22.mo74035c();
                                bxvd22.f164950c = false;
                            }
                            acqi acqi10 = (acqi) bxvd22.f164949b;
                            str14.getClass();
                            acqi10.f60474a |= 512;
                            acqi10.f60482i = str14;
                        }
                    }
                }
                arrayList.add((acqi) bxvd22.mo74062i());
            }
            i3++;
            str6 = str;
            usageInfoArr2 = usageInfoArr;
            length = length;
            r5 = 0;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m49905a(Context context, String str, UsageInfo[] usageInfoArr, String str2) {
        Intent intent;
        String str3 = str2;
        if (Log.isLoggable(str3, 3)) {
            List a = m49904a(context, str, (List) null, usageInfoArr);
            int size = a.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                acqi acqi = (acqi) a.get(i2);
                Log.d(str3, "Action:");
                int i3 = 1;
                if (str3.equals("AppIndexApi")) {
                    Object[] objArr = new Object[2];
                    objArr[i] = acqi.f60476c;
                    objArr[1] = Long.valueOf(acqi.f60475b);
                    Log.d(str3, String.format("  pkg: %s    ts: %d", objArr));
                    Object[] objArr2 = new Object[1];
                    objArr2[i] = acqi.f60481h;
                    Log.d(str3, String.format("  title: [%s]", objArr2));
                    Object[] objArr3 = new Object[1];
                    objArr3[i] = acqi.f60482i;
                    Log.d(str3, String.format("  description: [%s]", objArr3));
                    Object[] objArr4 = new Object[1];
                    objArr4[i] = acqi.f60483j;
                    Log.d(str3, String.format("  appUri: %s", objArr4));
                    Object[] objArr5 = new Object[1];
                    objArr5[i] = acqi.f60484k;
                    Log.d(str3, String.format("  webUrl: %s", objArr5));
                    Object[] objArr6 = new Object[1];
                    objArr6[i] = acqi.f60480g;
                    Log.d(str3, String.format("  actionType: %s", objArr6));
                    Object[] objArr7 = new Object[1];
                    int a2 = acqh.m49700a(acqi.f60489p);
                    if (a2 != 0) {
                        i3 = a2;
                    }
                    objArr7[i] = m49903a(i3);
                    Log.d(str3, String.format("  eventStatus: %s", objArr7));
                } else if (str3.equals("FirebaseUserActions")) {
                    try {
                        Object[] objArr8 = new Object[1];
                        objArr8[i] = acqi.f60480g.substring(18);
                        Log.d(str3, String.format("  type: %s", objArr8));
                        Object[] objArr9 = new Object[1];
                        objArr9[i] = acqi.f60481h;
                        Log.d(str3, String.format("  name: [%s]", objArr9));
                        String str4 = acqi.f60476c;
                        Uri parse = Uri.parse(acqi.f60483j);
                        if (fts.m12363a(parse)) {
                            if (parse.getHost().isEmpty()) {
                                String valueOf = String.valueOf(parse);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 98);
                                sb.append("AppIndex: The web URL must have a host (follow the format http(s)://<host>/<path>). Provided URI: ");
                                sb.append(valueOf);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else if (fts.m12364b(parse)) {
                            if (str4 != null) {
                                if (!str4.equals(parse.getHost())) {
                                    String valueOf2 = String.valueOf(parse);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED);
                                    sb2.append("AppIndex: The android-app URI host must match the package name and follow the format android-app://<package_name>/<scheme>/<host_path>. Provided URI: ");
                                    sb2.append(valueOf2);
                                    throw new IllegalArgumentException(sb2.toString());
                                }
                            }
                            List<String> pathSegments = parse.getPathSegments();
                            if (pathSegments.isEmpty() || pathSegments.get(i).isEmpty()) {
                                String valueOf3 = String.valueOf(parse);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 128);
                                sb3.append("AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/<host_path>). Provided URI: ");
                                sb3.append(valueOf3);
                                throw new IllegalArgumentException(sb3.toString());
                            }
                        } else {
                            String valueOf4 = String.valueOf(parse);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER);
                            sb4.append("AppIndex: The URI scheme must either be 'http(s)' or 'android-app'. If the latter, it must follow the format 'android-app://<package_name>/<scheme>/<host_path>'. Provided URI: ");
                            sb4.append(valueOf4);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        if (fts.m12363a(parse)) {
                            intent = new Intent("android.intent.action.VIEW", parse);
                        } else if (fts.m12364b(parse)) {
                            List<String> pathSegments2 = parse.getPathSegments();
                            Uri.Builder builder = new Uri.Builder();
                            builder.scheme(pathSegments2.get(i));
                            if (pathSegments2.size() <= 1) {
                                String str5 = fts.f17224a;
                                String valueOf5 = String.valueOf(parse);
                                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 88);
                                sb5.append("The app URI must have the format: android-app://<package_name>/<scheme>/<path>. But got ");
                                sb5.append(valueOf5);
                                Log.e(str5, sb5.toString());
                            } else {
                                builder.authority(pathSegments2.get(1));
                                for (int i4 = 2; i4 < pathSegments2.size(); i4++) {
                                    builder.appendPath(pathSegments2.get(i4));
                                }
                            }
                            builder.encodedQuery(parse.getEncodedQuery());
                            builder.encodedFragment(parse.getEncodedFragment());
                            intent = new Intent("android.intent.action.VIEW", builder.build());
                        } else {
                            String valueOf6 = String.valueOf(parse);
                            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 70);
                            sb6.append("appIndexingUri is neither an HTTP(S) URL nor an \"android-app://\" URL: ");
                            sb6.append(valueOf6);
                            throw new RuntimeException(sb6.toString());
                        }
                        Log.d(str3, String.format("  url: %s", intent.getData()));
                        if (!acqi.f60484k.isEmpty()) {
                            Log.d(str3, String.format("  webUrl: %s", acqi.f60484k));
                        }
                        Log.d(str3, String.format("  pkg: %s", acqi.f60476c));
                        Object[] objArr10 = new Object[1];
                        int a3 = acqh.m49700a(acqi.f60489p);
                        if (a3 != 0) {
                            i3 = a3;
                        }
                        try {
                            objArr10[0] = m49903a(i3);
                            Log.d(str3, String.format("  eventStatus: %s", objArr10));
                        } catch (RuntimeException e) {
                            e = e;
                            absg.m48189a(e, "Exception in debug logging of the action.");
                            i2++;
                            i = 0;
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                        absg.m48189a(e, "Exception in debug logging of the action.");
                        i2++;
                        i = 0;
                    }
                } else {
                    absg.m48191b("Unknown logging tag for the action.");
                }
                i2++;
                i = 0;
            }
        }
    }
}
