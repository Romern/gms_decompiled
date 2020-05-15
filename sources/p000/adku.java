package p000;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.AtomInfo;
import com.google.android.gms.instantapps.internal.Route;
import com.google.android.gms.instantapps.internal.SharedLibInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: adku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adku {
    /* renamed from: a */
    public static AppInfo m50768a(adkt adkt, adhv adhv, String str, PackageInfo packageInfo) {
        ArrayList arrayList;
        List list;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        String str7;
        adhv adhv2 = adhv;
        List emptyList = Collections.emptyList();
        adkw adkw = (adkw) adkt;
        if (adkw.f62092e) {
            bxwc bxwc = adhv2.f61730a;
            int i2 = 4;
            if (bxwc == null || bxwc.isEmpty()) {
                list = Collections.emptyList();
            } else {
                ArrayList arrayList2 = new ArrayList(bxwc.size());
                int size = bxwc.size();
                int i3 = 0;
                while (i3 < size) {
                    adig adig = (adig) bxwc.get(i3);
                    String str8 = adig.f61789c;
                    try {
                        i = Integer.parseInt(adig.f61790d);
                    } catch (NumberFormatException e) {
                        i = 0;
                    }
                    if (adif.m50509a(adig.f61787a) == i2) {
                        str5 = adig.f61787a != 3 ? "" : (String) adig.f61788b;
                    } else {
                        str5 = null;
                    }
                    if (adif.m50509a(adig.f61787a) == 5) {
                        str6 = adig.f61787a != i2 ? "" : (String) adig.f61788b;
                    } else {
                        str6 = null;
                    }
                    if (adif.m50509a(adig.f61787a) == 6) {
                        str7 = adig.f61787a != 5 ? "" : (String) adig.f61788b;
                    } else {
                        str7 = null;
                    }
                    if (adif.m50509a(adig.f61787a) == 9 && adig.f61787a == 8) {
                        String str9 = (String) adig.f61788b;
                    }
                    arrayList2.add(new Route(str8, i, str5, str6, str7, adig.f61791e, adig.f61792f));
                    i3++;
                    i2 = 4;
                }
                list = arrayList2;
            }
            if (adkw.f62095h) {
                String str10 = adkw.f62088a;
                int i4 = adkw.f62089b;
                int i5 = adkw.f62090c;
                String str11 = adkw.f62093f;
                String str12 = adkw.f62094g;
                if (TextUtils.isEmpty(str10) || TextUtils.isEmpty(str12)) {
                    str2 = null;
                } else {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[5];
                    objArr[0] = str10;
                    objArr[1] = Integer.valueOf(i4);
                    objArr[2] = Integer.valueOf(i5);
                    if (TextUtils.isEmpty(str11)) {
                        str4 = "-";
                    } else {
                        str4 = str11;
                    }
                    objArr[3] = str4;
                    objArr[4] = str12;
                    str2 = String.format(locale, "/%s/%d/%d/%s/%s", objArr);
                }
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str12)) {
                    String valueOf = String.valueOf(str10);
                    Log.w("InstantApps", valueOf.length() == 0 ? new String("Failed to create synthetic route for ") : "Failed to create synthetic route for ".concat(valueOf));
                } else {
                    if (str11 == null) {
                        str3 = "";
                    } else {
                        str3 = str11;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new Route("instant.app", 0, str2, null, null, str3, str12));
                    arrayList3.addAll(list);
                    arrayList = arrayList3;
                }
            }
            arrayList = list;
        } else {
            arrayList = emptyList;
        }
        if (packageInfo == null) {
            return new AppInfo(adkw.f62088a, str, arrayList, m50769a(adhv2.f61731b), m50770b(adhv2.f61732c), adhv2.f61733d, adhv2.f61734e.mo73780k(), null, adhv2.f61737h.mo73780k());
        }
        return new AppInfo(adkw.f62088a, str, arrayList, m50769a(adhv2.f61731b), m50770b(adhv2.f61732c), adhv2.f61733d, null, packageInfo, adhv2.f61737h.mo73780k());
    }

    /* renamed from: b */
    private static List m50770b(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            adih adih = (adih) list.get(i);
            arrayList.add(new SharedLibInfo(adih.f61795a, adih.f61796b, adih.f61797c, adih.f61798d, adih.f61799e, adih.f61800f.mo73780k()));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List m50769a(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            adib adib = (adib) list.get(i);
            String str = adib.f61764a;
            String str2 = adib.f61765b;
            String[] strArr = (String[]) adib.f61766c.toArray(new String[0]);
            int[] a = bqcn.m112584a(adib.f61767d);
            int i2 = adib.f61768e;
            byte[] k = adib.f61769f.mo73780k();
            if (k.length == 0) {
                k = null;
            }
            arrayList.add(new AtomInfo(str, str2, strArr, a, i2, k, adib.f61770g));
        }
        return arrayList;
    }
}
