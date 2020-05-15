package p000;

import android.content.Context;
import android.content.pm.Signature;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: adim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adim {

    /* renamed from: b */
    private static final adfs f61816b = new adfs("AppInfoFetcher");

    /* renamed from: a */
    public final Context f61817a;

    /* renamed from: c */
    private final adik f61818c;

    /* renamed from: d */
    private final adeo f61819d;

    /* renamed from: e */
    private final adhk f61820e;

    /* renamed from: f */
    private final adfd f61821f;

    public adim(adik adik, adeo adeo, adhk adhk, adfd adfd, Context context) {
        this.f61818c = adik;
        this.f61819d = adeo;
        this.f61820e = adhk;
        this.f61821f = adfd;
        this.f61817a = context;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04f1 A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04fd A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x051b A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0533 A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x054b A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0564 A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0565 A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x058c A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x058d A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* renamed from: a */
    public final AppInfo mo33552a(adkt adkt) {
        btib btib;
        adii adii;
        adic adic;
        boolean z;
        WriteBatch create;
        Throwable th;
        adii adii2;
        String str;
        String str2;
        String str3;
        adic adic2;
        bxwc bxwc;
        adkt adkt2 = adkt;
        adfb a = this.f61821f.mo33411a();
        List a2 = adkx.m50779a(this.f61817a);
        int i = this.f61817a.getResources().getDisplayMetrics().densityDpi;
        AppInfo a3 = mo33553a(adkt2, a2, i);
        if (a3 == null) {
            adkw adkw = (adkw) adkt2;
            String str4 = adkw.f62088a;
            int i2 = adkw.f62089b;
            int i3 = adkw.f62090c;
            adfb a4 = this.f61821f.mo33411a();
            try {
                btib = (btib) this.f61819d.mo33392a(str4, i2, i3, a2).get();
                a4.mo33409a("AppInfoFetcher.success");
            } catch (InterruptedException e) {
                a4.mo33409a("AppInfoFetcher.interrupted");
                f61816b.mo33425a(e, "RPC interrupted", new Object[0]);
                btib = null;
            } catch (ExecutionException e2) {
                if (!(e2.getCause() instanceof chuw) || !((chuw) e2.getCause()).f189236a.f189233s.equals(chuv.f189220g.f189233s)) {
                    a4.mo33409a("AppInfoFetcher.failed");
                    f61816b.mo33425a(e2, "RPC failed", new Object[0]);
                    btib = null;
                } else {
                    a4.mo33409a("AppInfoFetcher.appNotFound");
                    new Object[1][0] = str4;
                    btib = null;
                }
            }
            if (btib == null) {
                return null;
            }
            int i4 = adkw.f62089b;
            int i5 = adkw.f62090c;
            long currentTimeMillis = System.currentTimeMillis();
            bxvd da = adhv.f61728m.mo74144da();
            long j = btib.f148949l + currentTimeMillis;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            adhv adhv = (adhv) da.f164949b;
            adhv.f61736g = j;
            String str5 = btib.f148939b;
            str5.getClass();
            adhv.f61735f = str5;
            ByteString bxtx = btib.f148946i;
            bxtx.getClass();
            adhv.f61734e = bxtx;
            bxwc bxwc2 = btib.f148940c;
            ArrayList arrayList = new ArrayList(bxwc2.size());
            int size = bxwc2.size();
            int i6 = 0;
            while (i6 < size) {
                btir btir = (btir) bxwc2.get(i6);
                bxvd da2 = adib.f61762h.mo74144da();
                String str6 = btir.f149022a;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                adib adib = (adib) da2.f164949b;
                str6.getClass();
                adib.f61764a = str6;
                String str7 = btir.f149023b;
                str7.getClass();
                adib.f61765b = str7;
                bxwc bxwc3 = btir.f149027f;
                bxwc bxwc4 = bxwc2;
                if (!adib.f61766c.mo73666a()) {
                    adib.f61766c = GeneratedMessageLite.m124021a(adib.f61766c);
                }
                bxsy.m123078a(bxwc3, adib.f61766c);
                bxvt bxvt = btir.f149028g;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                adib adib2 = (adib) da2.f164949b;
                if (!adib2.f61767d.mo73666a()) {
                    adib2.f61767d = GeneratedMessageLite.m124019a(adib2.f61767d);
                }
                bxsy.m123078a(bxvt, adib2.f61767d);
                int i7 = (int) btir.f149024c;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                adib adib3 = (adib) da2.f164949b;
                adib3.f61768e = i7;
                ByteString bxtx2 = btir.f149025d;
                bxtx2.getClass();
                adib3.f61769f = bxtx2;
                adib3.f61770g = btir.f149026e;
                arrayList.add((adib) da2.mo74062i());
                i6++;
                bxwc2 = bxwc4;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            adhv adhv2 = (adhv) da.f164949b;
            if (!adhv2.f61731b.mo73666a()) {
                adhv2.f61731b = GeneratedMessageLite.m124021a(adhv2.f61731b);
            }
            bxsy.m123078a(arrayList, adhv2.f61731b);
            bxwc bxwc5 = btib.f148944g;
            ArrayList arrayList2 = new ArrayList(bxwc5.size());
            int size2 = bxwc5.size();
            for (int i8 = 0; i8 < size2; i8++) {
                btip btip = (btip) bxwc5.get(i8);
                bxvd da3 = adih.f61793g.mo74144da();
                camk camk = btip.f149010a;
                if (camk == null) {
                    camk = camk.f175296d;
                }
                String str8 = camk.f175298a;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                str8.getClass();
                ((adih) da3.f164949b).f61795a = str8;
                camk camk2 = btip.f149010a;
                if (camk2 == null) {
                    camk2 = camk.f175296d;
                }
                int i9 = camk2.f175299b;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((adih) da3.f164949b).f61796b = i9;
                camk camk3 = btip.f149010a;
                if (camk3 == null) {
                    camk3 = camk.f175296d;
                }
                String str9 = camk3.f175300c;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                adih adih = (adih) da3.f164949b;
                str9.getClass();
                adih.f61797c = str9;
                String str10 = btip.f149011b;
                str10.getClass();
                adih.f61798d = str10;
                adih.f61799e = btip.f149012c;
                ByteString bxtx3 = btip.f149013d;
                bxtx3.getClass();
                adih.f61800f = bxtx3;
                arrayList2.add((adih) da3.mo74062i());
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            adhv adhv3 = (adhv) da.f164949b;
            if (!adhv3.f61732c.mo73666a()) {
                adhv3.f61732c = GeneratedMessageLite.m124021a(adhv3.f61732c);
            }
            bxsy.m123078a(arrayList2, adhv3.f61732c);
            bxwc bxwc6 = btib.f148947j;
            ArrayList arrayList3 = new ArrayList(bxwc6.size());
            int size3 = bxwc6.size();
            int i10 = 0;
            while (i10 < size3) {
                camg camg = (camg) bxwc6.get(i10);
                bxvd da4 = adig.f61785g.mo74144da();
                String str11 = camg.f175271c;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                adig adig = (adig) da4.f164949b;
                str11.getClass();
                adig.f61792f = str11;
                String str12 = camg.f175270b;
                str12.getClass();
                adig.f61791e = str12;
                camm camm = camg.f175269a;
                if (camm == null) {
                    camm = camm.f175301e;
                }
                int a5 = caml.m126789a(camm.f175303a);
                int i11 = a5 - 1;
                if (a5 != 0) {
                    String str13 = "";
                    if (i11 != 1) {
                        bxwc = bxwc6;
                        if (i11 == 2) {
                            camm camm2 = camg.f175269a;
                            if (camm2 == null) {
                                camm2 = camm.f175301e;
                            }
                            if (camm2.f175303a == 4) {
                                str13 = (String) camm2.f175304b;
                            }
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            adig adig2 = (adig) da4.f164949b;
                            str13.getClass();
                            adig2.f61787a = 4;
                            adig2.f61788b = str13;
                        } else if (i11 == 3) {
                            camm camm3 = camg.f175269a;
                            if (camm3 == null) {
                                camm3 = camm.f175301e;
                            }
                            if (camm3.f175303a == 5) {
                                str13 = (String) camm3.f175304b;
                            }
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            adig adig3 = (adig) da4.f164949b;
                            str13.getClass();
                            adig3.f61787a = 5;
                            adig3.f61788b = str13;
                        } else if (i11 == 4) {
                            camm camm4 = camg.f175269a;
                            if (camm4 == null) {
                                camm4 = camm.f175301e;
                            }
                            if (camm4.f175303a == 7) {
                                str13 = (String) camm4.f175304b;
                            }
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            adig adig4 = (adig) da4.f164949b;
                            str13.getClass();
                            adig4.f61787a = 8;
                            adig4.f61788b = str13;
                        }
                    } else {
                        bxwc = bxwc6;
                        camm camm5 = camg.f175269a;
                        if (camm5 == null) {
                            camm5 = camm.f175301e;
                        }
                        if (camm5.f175303a == 3) {
                            str13 = (String) camm5.f175304b;
                        }
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        adig adig5 = (adig) da4.f164949b;
                        str13.getClass();
                        adig5.f61787a = 3;
                        adig5.f61788b = str13;
                    }
                    camm camm6 = camg.f175269a;
                    if (camm6 == null) {
                        camm6 = camm.f175301e;
                    }
                    String str14 = camm6.f175305c;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    str14.getClass();
                    ((adig) da4.f164949b).f61789c = str14;
                    camm camm7 = camg.f175269a;
                    if (camm7 == null) {
                        camm7 = camm.f175301e;
                    }
                    String str15 = camm7.f175306d;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    str15.getClass();
                    ((adig) da4.f164949b).f61790d = str15;
                    arrayList3.add((adig) da4.mo74062i());
                    i10++;
                    bxwc6 = bxwc;
                } else {
                    throw null;
                }
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            adhv adhv4 = (adhv) da.f164949b;
            if (!adhv4.f61730a.mo73666a()) {
                adhv4.f61730a = GeneratedMessageLite.m124021a(adhv4.f61730a);
            }
            bxsy.m123078a(arrayList3, adhv4.f61730a);
            ByteString bxtx4 = btib.f148948k;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            adhv adhv5 = (adhv) da.f164949b;
            bxtx4.getClass();
            adhv5.f61737h = bxtx4;
            adhv5.f61738i = i4;
            adhv5.f61739j = i5;
            if (!adhv5.f61740k.mo73666a()) {
                adhv5.f61740k = GeneratedMessageLite.m124021a(adhv5.f61740k);
            }
            bxsy.m123078a(a2, adhv5.f61740k);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((adhv) da.f164949b).f61741l = i;
            adhv adhv6 = (adhv) da.mo74062i();
            bxwc bxwc7 = btib.f148945h;
            if (!bxwc7.isEmpty()) {
                bxvd da5 = adii.f61801b.mo74144da();
                for (int i12 = 0; i12 < bxwc7.size(); i12++) {
                    da5.mo74041d(bxtx.m123261a(new Signature((String) bxwc7.get(i12)).toByteArray()));
                }
                adii = (adii) da5.mo74062i();
            } else {
                adii = null;
            }
            came came = btib.f148943f;
            if (came != null) {
                bxvd da6 = adic.f61771c.mo74144da();
                String str16 = came.f175262a;
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                adic adic3 = (adic) da6.f164949b;
                str16.getClass();
                adic3.f61773a = str16;
                String str17 = came.f175263b;
                str17.getClass();
                adic3.f61774b = str17;
                adic = (adic) da6.mo74062i();
            } else {
                adic = null;
            }
            adkv adkv = new adkv(adhv6, adii, btib.f148938a, btib.f148941d, btib.f148942e, adic);
            try {
                adik adik = this.f61818c;
                adkt adkt3 = adkt;
                String str18 = ((adkw) adkt3).f62088a;
                adik.mo33534b();
                adhv f = adik.mo33538f(str18);
                if (f != null) {
                    if (sdg.m34949a(f.f61734e, adkv.f62082a.f61734e)) {
                        bxwc bxwc8 = adkv.f62082a.f61731b;
                        bxwc bxwc9 = f.f61731b;
                        if (bxwc8.size() == bxwc9.size()) {
                            int i13 = 0;
                            while (true) {
                                if (i13 >= bxwc8.size()) {
                                    break;
                                }
                                adib adib4 = (adib) bxwc8.get(i13);
                                adib adib5 = (adib) bxwc9.get(i13);
                                if (sdg.m34949a(adib4.f61764a, adib5.f61764a) && sdg.m34949a(adib4.f61769f, adib5.f61769f)) {
                                    if (!sdg.m34949a(adib4.f61765b, adib5.f61765b)) {
                                        z = true;
                                        break;
                                    }
                                    i13++;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    z = true;
                    create = WriteBatch.create();
                    adfb a6 = adik.f61807b.mo33411a();
                    adii2 = adkv.f62083b;
                    if (adii2 == null) {
                        create.put(adik.mo33541i(str18), adii2.serializeToBytes());
                    } else {
                        create.delete(adik.mo33541i(str18));
                    }
                    create.put(adik.mo33543k(str18), adkv.f62082a.serializeToBytes());
                    bxvd da7 = adhz.f61753e.mo74144da();
                    str = adkv.f62084c;
                    if (str != null) {
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        str.getClass();
                        ((adhz) da7.f164949b).f61755a = str;
                    }
                    str2 = adkv.f62085d;
                    if (str2 != null) {
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        str2.getClass();
                        ((adhz) da7.f164949b).f61756b = str2;
                    }
                    str3 = adkv.f62086e;
                    if (str3 != null) {
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        str3.getClass();
                        ((adhz) da7.f164949b).f61757c = str3;
                    }
                    adic2 = adkv.f62087f;
                    if (adic2 == null) {
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        adic2.getClass();
                        ((adhz) da7.f164949b).f61758d = adic2;
                    }
                    create.put(adik.mo33536d(str18), ((adhz) da7.mo74062i()).serializeToBytes());
                    if (!z) {
                        create.delete(adik.mo33542j(str18));
                    }
                    adik.f61808c.mo33510a(create);
                    a6.mo33409a("MetadataDatastore.writeAppMetadata");
                    create.close();
                    return adku.m50768a(adkt3, adkv.f62082a, adkv.f62084c, this.f61820e.mo33520a(((adkw) adkt3).f62088a, 20685));
                }
                z = false;
                create = WriteBatch.create();
                adfb a62 = adik.f61807b.mo33411a();
                adii2 = adkv.f62083b;
                if (adii2 == null) {
                }
                create.put(adik.mo33543k(str18), adkv.f62082a.serializeToBytes());
                bxvd da72 = adhz.f61753e.mo74144da();
                str = adkv.f62084c;
                if (str != null) {
                }
                str2 = adkv.f62085d;
                if (str2 != null) {
                }
                str3 = adkv.f62086e;
                if (str3 != null) {
                }
                adic2 = adkv.f62087f;
                if (adic2 == null) {
                }
                create.put(adik.mo33536d(str18), ((adhz) da72.mo74062i()).serializeToBytes());
                if (!z) {
                }
                adik.f61808c.mo33510a(create);
                a62.mo33409a("MetadataDatastore.writeAppMetadata");
                create.close();
                return adku.m50768a(adkt3, adkv.f62082a, adkv.f62084c, this.f61820e.mo33520a(((adkw) adkt3).f62088a, 20685));
            } catch (IOException e3) {
                f61816b.mo33425a(e3, "DB write failed", new Object[0]);
                return null;
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
        } else {
            a.mo33409a("AppInfoFetcher.cacheHit");
            return a3;
        }
        throw th;
    }

    /* renamed from: a */
    public final AppInfo mo33553a(adkt adkt, List list, int i) {
        int i2;
        String str;
        AppInfo appInfo = null;
        try {
            adhv f = this.f61818c.mo33538f(((adkw) adkt).f62088a);
            adhz c = this.f61818c.mo33535c(((adkw) adkt).f62088a);
            if (c != null) {
                str = c.f61755a;
            } else {
                str = null;
            }
            if (f != null) {
                if (str != null && (cepl.m137723d() || f.f61736g >= System.currentTimeMillis())) {
                    if (cepl.m137723d() || cepl.f183185a.mo6606a().mo79529M()) {
                        if (f.f61738i == ((adkw) adkt).f62089b && f.f61739j == ((adkw) adkt).f62090c && f.f61741l == i) {
                            if (!new C1225nr(f.f61740k).containsAll(new C1225nr(list))) {
                            }
                        }
                    }
                    appInfo = adku.m50768a(adkt, f, str, this.f61820e.mo33520a(((adkw) adkt).f62088a, 20685));
                }
            }
        } catch (IOException e) {
            f61816b.mo33424a(e);
        }
        adkz adkz = ((adkw) adkt).f62091d;
        if (appInfo == null) {
            i2 = 1415;
        } else {
            i2 = 1414;
        }
        adkz.mo33627a(i2);
        return appInfo;
    }
}
