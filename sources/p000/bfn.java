package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: bfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfn extends bew {
    /* renamed from: a */
    public final void mo3074a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        boolean z;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11 = "HCECLIENT_META_DATA";
        String a = new bhl().mo3128a(bgp.OPERATION.f3180c, str11);
        String valueOf = String.valueOf(a);
        if (valueOf.length() == 0) {
            new String("::metaDataJSONString retrieved from Stash::");
        } else {
            "::metaDataJSONString retrieved from Stash::".concat(valueOf);
        }
        String str12 = "LUPC_REFRESH_CHECK_BACK";
        String str13 = "REFRESH_REQUIRED";
        if (a == null) {
            HashMap hashMap = new HashMap();
            bia bia = new bia();
            bia.f3270h = "00";
            hashMap.put(bev.m2859b("LUPC_COUNT"), bia);
            bia bia2 = new bia();
            bia2.f3270h = "true";
            hashMap.put(bev.m2859b(str13), bia2);
            bia bia3 = new bia();
            bia3.f3270h = "0000";
            hashMap.put(bev.m2859b("MAX_ATC"), bia3);
            bia bia4 = new bia();
            bia4.f3270h = null;
            hashMap.put(bev.m2859b(str12), bia4);
            bia bia5 = new bia();
            bia5.f3270h = null;
            hashMap.put(bev.m2859b("TOKEN_DATA_VERSION"), bia5);
            bia bia6 = new bia();
            bia6.f3270h = "00";
            hashMap.put(bev.m2859b("TOKEN_STATUS"), bia6);
            bet a2 = bet.m2847a();
            a2.f3122d = hashMap;
            String valueOf2 = String.valueOf(a2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 74);
            sb.append("::TokenRefreshStatusDelegate::nonExistingTokenRefIdResponse::dataContext::");
            sb.append(valueOf2);
            sb.toString();
            return;
        }
        String obj = bgz.m3021a(a.getBytes())[0].toString();
        String valueOf3 = String.valueOf(obj);
        if (valueOf3.length() == 0) {
            new String("::metaDataJson retrieved from LLVAR::");
        } else {
            "::metaDataJson retrieved from LLVAR::".concat(valueOf3);
        }
        bet.m2847a().f3122d = bev.m2857a(obj);
        List a3 = bev.m2855a(beu.m2849a(), bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a("NFC_LUPC_TAG"));
        String str14 = "MST_LUPC_TAG";
        bev.m2855a(beu.m2849a(), bgt.m2993a("MST_LUPC_DGI"), bgt.m2993a(str14));
        ArrayList arrayList = new ArrayList();
        String str15 = "::lupcExpiryThreshold::";
        if (a3.size() > 0) {
            int parseInt = Integer.parseInt(bgx.m3001a(beu.m2848a("LUPC_THRESHOLD"), 0), 16);
            StringBuilder sb2 = new StringBuilder(34);
            sb2.append(str15);
            sb2.append(parseInt);
            sb2.toString();
            int i2 = parseInt * 3600;
            StringBuilder sb3 = new StringBuilder(27);
            sb3.append("::letInSeconds::");
            sb3.append(i2);
            sb3.toString();
            Iterator it = beu.m2849a().entrySet().iterator();
            i = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry == null) {
                    str8 = str12;
                    str9 = str11;
                    str6 = str13;
                    str10 = str14;
                    str7 = str15;
                } else if (entry.getValue() instanceof bhw) {
                    bhw bhw = (bhw) beu.m2849a().get(entry.getKey());
                    long parseLong = Long.parseLong(bhw.f3258g);
                    str10 = str14;
                    long j = bgp.OPERATION.f3182e;
                    String str16 = bhw.f3258g;
                    str9 = str11;
                    str8 = str12;
                    long j2 = bgp.OPERATION.f3182e;
                    str7 = str15;
                    str6 = str13;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str16).length() + 124);
                    sb4.append("::timeToExpiry::");
                    sb4.append(parseLong - j);
                    sb4.append("::currentLupcTagValue.getEndDate()::");
                    sb4.append(str16);
                    sb4.append("::OPERATION.getRealTimestamp()::");
                    sb4.append(j2);
                    sb4.toString();
                    if (Long.parseLong(bhw.f3258g) <= bgp.OPERATION.f3182e) {
                        it.remove();
                        arrayList.add(entry.getKey());
                    } else if (!(entry.getValue() instanceof bhv)) {
                        long parseLong2 = Long.parseLong(bhw.f3258g) - bgp.OPERATION.f3182e;
                        StringBuilder sb5 = new StringBuilder(85);
                        sb5.append("::TokenRefreshStatusDelegate::purgeLUPCs::belowMinimumThreshold::");
                        sb5.append(parseLong2);
                        sb5.toString();
                        if (parseLong2 < ((long) i2)) {
                            i++;
                            str14 = str10;
                            str11 = str9;
                            str12 = str8;
                            str15 = str7;
                            str13 = str6;
                        }
                    }
                } else {
                    str8 = str12;
                    str9 = str11;
                    str6 = str13;
                    str10 = str14;
                    str7 = str15;
                }
                str14 = str10;
                str11 = str9;
                str12 = str8;
                str15 = str7;
                str13 = str6;
            }
            str3 = str12;
            str4 = str11;
            str = str13;
            str5 = str14;
            str2 = str15;
        } else {
            str3 = str12;
            str4 = str11;
            str = str13;
            str5 = str14;
            str2 = str15;
            i = 0;
        }
        if (arrayList.size() > 0) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                bhz a4 = bhz.m3068a(arrayList.get(i3).toString());
                if (a4 != null) {
                    if (bgt.m2993a("NFC_LUPC_DGI").equals(a4.f3263a)) {
                        String a5 = bgt.m2993a("MST_LUPC_DGI");
                        String a6 = bgt.m2993a(str5);
                        int i4 = a4.f3266d;
                        StringBuilder sb6 = new StringBuilder(String.valueOf(a5).length() + 13 + String.valueOf(a6).length());
                        sb6.append(a5);
                        sb6.append("-");
                        sb6.append(a6);
                        sb6.append("-");
                        sb6.append(i4);
                        bhz a7 = bhz.m3068a(sb6.toString());
                        if (((bhv) bev.m2853a(beu.m2849a(), a7)) != null) {
                            beu.m2850a(a7);
                        }
                    } else if (bgt.m2993a("MST_LUPC_DGI").equals(a4.f3263a)) {
                        String a8 = bgt.m2993a("NFC_LUPC_DGI");
                        String a9 = bgt.m2993a("NFC_LUPC_TAG");
                        int i5 = a4.f3266d;
                        StringBuilder sb7 = new StringBuilder(String.valueOf(a8).length() + 13 + String.valueOf(a9).length());
                        sb7.append(a8);
                        sb7.append("-");
                        sb7.append(a9);
                        sb7.append("-");
                        sb7.append(i5);
                        bhz a10 = bhz.m3068a(sb7.toString());
                        if (((bhw) bev.m2853a(beu.m2849a(), a10)) != null) {
                            beu.m2850a(a10);
                        }
                    }
                }
            }
        }
        StringBuilder sb8 = new StringBuilder(73);
        sb8.append("::TokenRefreshStatusDelegate::purgeLUPCs::withinMinThreshold::");
        sb8.append(i);
        sb8.toString();
        for (Map.Entry entry2 : beu.m2849a().entrySet()) {
            String valueOf4 = String.valueOf(entry2.getKey());
            String valueOf5 = String.valueOf(entry2.getValue());
            StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf4).length() + 37 + String.valueOf(valueOf5).length());
            sb9.append("::newMetaDataMap Map Keys::");
            sb9.append(valueOf4);
            sb9.append("::Values::");
            sb9.append(valueOf5);
            sb9.toString();
        }
        Map a11 = beu.m2849a();
        StringBuilder sb10 = new StringBuilder(85);
        sb10.append("::TokenRefreshStatusDelegate::checkRefreshConditions::withinMinThreshold::");
        sb10.append(i);
        sb10.toString();
        String a12 = bgt.m2993a("NFC_LUPC_DGI");
        String a13 = bgt.m2993a("NFC_LUPC_TAG");
        int size = bev.m2855a(a11, a12, a13).size();
        StringBuilder sb11 = new StringBuilder(27);
        sb11.append("::Usable Lupcs::");
        sb11.append(size);
        sb11.toString();
        bia bia7 = new bia();
        bia7.f3270h = String.valueOf(size);
        a11.put(bev.m2859b("LUPC_COUNT"), bia7);
        int parseInt2 = Integer.parseInt(bgx.m3001a(((bia) a11.get(bev.m2859b("LUPC_THRESHOLD"))).f3270h, 2), 16);
        StringBuilder sb12 = new StringBuilder(35);
        sb12.append("::minimumThresholdLUPC::");
        sb12.append(parseInt2);
        sb12.toString();
        if (size <= parseInt2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (size - i <= parseInt2) {
                z = true;
            } else {
                z = false;
            }
        }
        bia bia8 = new bia();
        bia8.f3270h = String.valueOf(z);
        a11.put(bev.m2859b(str), bia8);
        String valueOf6 = String.valueOf(bia8.f3270h);
        if (valueOf6.length() == 0) {
            new String("::refreshReqdTagValue::");
        } else {
            "::refreshReqdTagValue::".concat(valueOf6);
        }
        if (size != 0) {
            bhw bhw2 = (bhw) bev.m2854a(a11, a12, a13, true);
            a11.put(bev.m2859b("RUNNING_ATC"), bia.m3070a(bhw2.f3253b));
            String valueOf7 = String.valueOf(beu.m2848a("RUNNING_ATC"));
            if (valueOf7.length() == 0) {
                new String("::RUNNING_ATC::");
            } else {
                "::RUNNING_ATC::".concat(valueOf7);
            }
            if (!z) {
                int parseInt3 = Integer.parseInt(bgx.m3001a(((bia) a11.get(bev.m2859b("LUPC_THRESHOLD"))).f3270h, 0), 16);
                StringBuilder sb13 = new StringBuilder(34);
                sb13.append(str2);
                sb13.append(parseInt3);
                sb13.toString();
                bia bia9 = new bia();
                long parseLong3 = (Long.parseLong(bhw2.f3258g) - bgp.OPERATION.f3182e) - ((long) (parseInt3 * 3600));
                bia9.f3270h = String.valueOf(parseLong3);
                a11.put(bev.m2859b(str3), bia9);
                StringBuilder sb14 = new StringBuilder(47);
                sb14.append("::LUPC_REFRESH_CHECK_BACK::");
                sb14.append(parseLong3);
                sb14.toString();
            }
        }
        Map a14 = beu.m2849a();
        bhl bhl = new bhl();
        String a15 = bhf.m3035a(a14);
        StringBuilder sb15 = new StringBuilder(String.valueOf(a15).length() + 1);
        sb15.append('1');
        sb15.append(a15);
        bhl.mo3130a(bgp.OPERATION.f3180c, str4, new String(bgz.m3020a(sb15.toString())));
    }
}
