package p000;

import android.content.IntentFilter;
import android.content.pm.InstantAppIntentFilter;
import android.content.pm.InstantAppResolveInfo;
import android.util.ArrayMap;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: adjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adjp {

    /* renamed from: a */
    private static final String[] f61935a = {"http", "https"};

    /* renamed from: b */
    private static final String[] f61936b = {"NONE", "android.intent.action.VIEW", "android.nfc.action.NDEF_DISCOVERED"};

    /* JADX WARNING: Removed duplicated region for block: B:155:0x016f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x016c  */
    /* renamed from: a */
    static List m50665a(String str, adip adip, Map map, boolean z) {
        adip adip2;
        ArrayList arrayList;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList2;
        int i;
        bxwc bxwc;
        List<String> list;
        int i2;
        String str7;
        int i3;
        int b;
        bxtx bxtx;
        bxtx bxtx2;
        bxtx bxtx3;
        bxtx bxtx4;
        String str8 = str;
        adip adip3 = adip;
        if (adip3 == null || adip3.f61828a.size() == 0 || adip3.f61829b.size() == 0) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList(adip3.f61829b.size());
        for (int i4 = 0; i4 < adip3.f61829b.size(); i4++) {
            arrayList3.add(new ArrayList());
        }
        bxwc bxwc2 = adip3.f61828a;
        int size = bxwc2.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            adis adis = (adis) bxwc2.get(i5);
            List list2 = (List) arrayList3.get(adis.f61840c);
            if (adir.m50551a(adis.f61838a) == 3) {
                if (adis.f61838a == 2) {
                    bxtx4 = (bxtx) adis.f61839b;
                } else {
                    bxtx4 = bxtx.f164797b;
                }
                str3 = bxtx4.mo73773b(adfh.f61554b);
            } else {
                str3 = null;
            }
            if (adir.m50551a(adis.f61838a) == 4) {
                if (adis.f61838a == 3) {
                    bxtx3 = (bxtx) adis.f61839b;
                } else {
                    bxtx3 = bxtx.f164797b;
                }
                str4 = bxtx3.mo73773b(adfh.f61554b);
            } else {
                str4 = null;
            }
            if (adir.m50551a(adis.f61838a) == 5) {
                if (adis.f61838a == 4) {
                    bxtx2 = (bxtx) adis.f61839b;
                } else {
                    bxtx2 = bxtx.f164797b;
                }
                str5 = bxtx2.mo73773b(adfh.f61554b);
            } else {
                str5 = null;
            }
            if (adir.m50551a(adis.f61838a) == 6) {
                if (adis.f61838a == 5) {
                    bxtx = (bxtx) adis.f61839b;
                } else {
                    bxtx = bxtx.f164797b;
                }
                str6 = bxtx.mo73773b(adfh.f61554b);
            } else {
                str6 = null;
            }
            boolean booleanValue = adis.f61838a == 1 ? ((Boolean) adis.f61839b).booleanValue() : false;
            if (!cepu.f183241a.mo6606a().mo79570a()) {
                arrayList2 = arrayList3;
                bxwc = bxwc2;
                i = size;
                list = bngx.m109356a("android.intent.action.VIEW");
            } else {
                list = new ArrayList();
                bxvt bxvt = adis.f61841d;
                bxwc = bxwc2;
                int size2 = bxvt.size();
                i = size;
                int i7 = 0;
                while (i7 < size2) {
                    int i8 = size2;
                    bxvt bxvt2 = bxvt;
                    adiv adiv = (adiv) adip3.f61830c.get(((Integer) bxvt.get(i7)).intValue());
                    ArrayList arrayList4 = arrayList3;
                    if (adiu.m50554a(adiv.f61847a) == 2) {
                        if (!(adiv.f61847a == 1 && ((b = cami.m126785b(((Integer) adiv.f61848b).intValue())) == 0 || b == 1))) {
                            String[] strArr = f61936b;
                            if (adiv.f61847a == 1) {
                                i3 = cami.m126785b(((Integer) adiv.f61848b).intValue());
                                if (i3 == 0) {
                                    i3 = 1;
                                }
                            } else {
                                i3 = 2;
                            }
                            str7 = strArr[cami.m126784a(i3)];
                            if (str7 == null) {
                                list.add(str7);
                            }
                            i7++;
                            adip3 = adip;
                            bxvt = bxvt2;
                            size2 = i8;
                            arrayList3 = arrayList4;
                        }
                    }
                    if (adiu.m50554a(adiv.f61847a) == 3) {
                        str7 = adiv.f61847a == 2 ? (String) adiv.f61848b : "";
                    } else {
                        str7 = null;
                    }
                    if (str7 == null) {
                    }
                    i7++;
                    adip3 = adip;
                    bxvt = bxvt2;
                    size2 = i8;
                    arrayList3 = arrayList4;
                }
                arrayList2 = arrayList3;
                if (list.isEmpty()) {
                    list.add("android.intent.action.VIEW");
                }
            }
            int i9 = i6 + 1;
            IntentFilter intentFilter = new IntentFilter();
            for (String str9 : list) {
                intentFilter.addAction(str9);
            }
            intentFilter.addCategory("android.intent.category.BROWSABLE");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            intentFilter.addDataAuthority(str8, null);
            for (String str10 : f61935a) {
                intentFilter.addDataScheme(str10);
            }
            if (booleanValue) {
                i2 = 0;
                str3 = null;
            } else if (str3 != null) {
                i2 = 0;
            } else if (str4 != null) {
                str3 = str4;
                i2 = 1;
            } else if (str5 != null) {
                str3 = str5;
                i2 = 2;
            } else if (str6 == null) {
                i2 = 0;
                str3 = null;
            } else {
                str3 = str6;
                i2 = 3;
            }
            if (str3 != null) {
                intentFilter.addDataPath(str3, i2);
            }
            intentFilter.setOrder(i6);
            list2.add(intentFilter);
            i5++;
            i6 = i9;
            bxwc2 = bxwc;
            size = i;
            arrayList3 = arrayList2;
            adip3 = adip;
        }
        ArrayList arrayList5 = arrayList3;
        ArrayMap arrayMap = new ArrayMap();
        int i10 = 0;
        while (true) {
            adip2 = adip;
            if (i10 >= adip2.f61829b.size()) {
                break;
            }
            List list3 = (List) arrayMap.get(((adiy) adip2.f61829b.get(i10)).f61856a);
            if (list3 == null) {
                list3 = new ArrayList();
                arrayMap.put(((adiy) adip2.f61829b.get(i10)).f61856a, list3);
            }
            list3.add(Integer.valueOf(i10));
            i10++;
        }
        if (str8.startsWith("*.")) {
            str8 = str8.substring(2);
        }
        InstantAppResolveInfo.InstantAppDigest instantAppDigest = new InstantAppResolveInfo.InstantAppDigest(str8);
        ArrayList arrayList6 = new ArrayList();
        for (Map.Entry entry : arrayMap.entrySet()) {
            String str11 = (String) entry.getKey();
            ArrayList arrayList7 = new ArrayList();
            int i11 = -1;
            for (Integer num : (List) entry.getValue()) {
                int intValue = num.intValue();
                adiy adiy = (adiy) adip2.f61829b.get(intValue);
                ArrayList arrayList8 = arrayList;
                List list4 = (List) arrayList8.get(intValue);
                if (!adiy.f61860e) {
                    i11 = adiy.f61858c;
                    byte[] bArr = (byte[]) map.get(adiy.f61856a);
                    if (z) {
                        bxvd da = caei.f172825d.mo74144da();
                        String str12 = adiy.f61857b;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        caei caei = (caei) da.f164949b;
                        str12.getClass();
                        caei.f172827a = str12;
                        caei.f172828b = adiy.f61859d;
                        bxtx a = bArr != null ? bxtx.m123261a(bArr) : bxtx.f164797b;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        a.getClass();
                        ((caei) da.f164949b).f172829c = a;
                        String valueOf = String.valueOf(Base64.encodeToString(((caei) da.mo74062i()).mo73642k(), 2));
                        str2 = valueOf.length() == 0 ? new String("packageMetadata:") : "packageMetadata:".concat(valueOf);
                    } else {
                        str2 = !adiy.f61857b.isEmpty() ? adiy.f61857b : null;
                    }
                    arrayList7.add(new InstantAppIntentFilter(str2, list4));
                    arrayList = arrayList8;
                } else {
                    arrayList = arrayList8;
                }
            }
            ArrayList arrayList9 = arrayList;
            if (!arrayList7.isEmpty()) {
                arrayList6.add(new InstantAppResolveInfo(instantAppDigest, str11, arrayList7, i11));
                arrayList5 = arrayList9;
            } else {
                arrayList5 = arrayList9;
            }
        }
        return arrayList6;
    }
}
