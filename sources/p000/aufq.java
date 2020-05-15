package p000;

import android.content.Context;
import android.location.Location;
import android.telephony.PhoneNumberUtils;
import android.util.Log;
import com.google.android.gms.thunderbird.state.DeviceState;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: aufq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aufq {

    /* renamed from: a */
    public final String f91719a;

    /* renamed from: b */
    public final boolean f91720b;

    /* renamed from: c */
    final float f91721c;

    /* renamed from: d */
    final List f91722d;

    /* renamed from: e */
    final List f91723e;

    /* renamed from: f */
    final List f91724f;

    /* renamed from: g */
    final List f91725g;

    /* renamed from: h */
    final List f91726h;

    /* renamed from: i */
    final List f91727i;

    /* renamed from: j */
    final List f91728j;

    /* renamed from: k */
    final List f91729k;

    /* renamed from: l */
    public final aufr f91730l;

    /* renamed from: m */
    public final float f91731m;

    /* renamed from: n */
    public final boolean f91732n;

    /* renamed from: o */
    public final boolean f91733o;

    /* renamed from: p */
    public final List f91734p;

    /* renamed from: q */
    public final long f91735q;

    /* renamed from: r */
    public final List f91736r;

    public aufq(String str, boolean z, float f, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, aufr aufr, float f2, boolean z2, boolean z3, List list9, long j, List list10) {
        this.f91719a = str;
        this.f91720b = z;
        this.f91721c = f;
        this.f91722d = bngx.m109368a((Collection) list);
        this.f91723e = bngx.m109368a((Collection) list2);
        this.f91724f = bngx.m109368a((Collection) list3);
        this.f91725g = bngx.m109368a((Collection) list4);
        this.f91726h = bngx.m109368a((Collection) list5);
        this.f91727i = bngx.m109368a((Collection) list6);
        this.f91728j = bngx.m109368a((Collection) list7);
        this.f91729k = bngx.m109368a((Collection) list8);
        this.f91730l = aufr;
        this.f91731m = f2;
        this.f91732n = z2;
        this.f91733o = z3;
        this.f91734p = bngx.m109372b(list9);
        this.f91735q = j;
        this.f91736r = bngx.m109368a((Collection) list10);
    }

    /* renamed from: a */
    public static List m76988a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aufq aufq = (aufq) it.next();
            bxvd da = auff.f91640C.mo74144da();
            String str = aufq.f91719a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            auff auff = (auff) da.f164949b;
            str.getClass();
            int i = auff.f91648a | 1;
            auff.f91648a = i;
            auff.f91649b = str;
            float f = aufq.f91721c;
            auff.f91648a = i | 2;
            double d = (double) f;
            Double.isNaN(d);
            auff.f91650c = (int) (d * 100.0d);
            List list = aufq.f91722d;
            if (!auff.f91651d.mo73666a()) {
                auff.f91651d = bxvk.m124021a(auff.f91651d);
            }
            bxsy.m123078a(list, auff.f91651d);
            List list2 = aufq.f91723e;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            auff auff2 = (auff) da.f164949b;
            if (!auff2.f91652e.mo73666a()) {
                auff2.f91652e = bxvk.m124021a(auff2.f91652e);
            }
            bxsy.m123078a(list2, auff2.f91652e);
            List list3 = aufq.f91724f;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            auff auff3 = (auff) da.f164949b;
            if (!auff3.f91653f.mo73666a()) {
                auff3.f91653f = bxvk.m124021a(auff3.f91653f);
            }
            bxsy.m123078a(list3, auff3.f91653f);
            List list4 = aufq.f91725g;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            auff auff4 = (auff) da.f164949b;
            if (!auff4.f91654g.mo73666a()) {
                auff4.f91654g = bxvk.m124021a(auff4.f91654g);
            }
            bxsy.m123078a(list4, auff4.f91654g);
            List list5 = aufq.f91726h;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            auff auff5 = (auff) da.f164949b;
            if (!auff5.f91655h.mo73666a()) {
                auff5.f91655h = bxvk.m124021a(auff5.f91655h);
            }
            bxsy.m123078a(list5, auff5.f91655h);
            List list6 = aufq.f91727i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            auff auff6 = (auff) da.f164949b;
            if (!auff6.f91656i.mo73666a()) {
                auff6.f91656i = bxvk.m124021a(auff6.f91656i);
            }
            bxsy.m123078a(list6, auff6.f91656i);
            List list7 = aufq.f91728j;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            auff auff7 = (auff) da.f164949b;
            if (!auff7.f91657j.mo73666a()) {
                auff7.f91657j = bxvk.m124021a(auff7.f91657j);
            }
            bxsy.m123078a(list7, auff7.f91657j);
            List list8 = aufq.f91729k;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            auff auff8 = (auff) da.f164949b;
            if (!auff8.f91658k.mo73666a()) {
                auff8.f91658k = bxvk.m124021a(auff8.f91658k);
            }
            bxsy.m123078a(list8, auff8.f91658k);
            float f2 = aufq.f91731m;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            auff auff9 = (auff) da.f164949b;
            int i2 = auff9.f91648a | 8;
            auff9.f91648a = i2;
            auff9.f91660m = f2;
            boolean z = aufq.f91732n;
            int i3 = i2 | 16;
            auff9.f91648a = i3;
            auff9.f91661n = z;
            boolean z2 = aufq.f91733o;
            auff9.f91648a = i3 | 32;
            auff9.f91662o = z2;
            List list9 = aufq.f91734p;
            if (!auff9.f91663p.mo73666a()) {
                auff9.f91663p = bxvk.m124020a(auff9.f91663p);
            }
            bxsy.m123078a(list9, auff9.f91663p);
            long j = aufq.f91735q;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            auff auff10 = (auff) da.f164949b;
            auff10.f91648a |= 64;
            auff10.f91664q = j;
            aufr aufr = aufq.f91730l;
            bxvd da2 = aufh.f91678c.mo74144da();
            bnwr bnwr = aufr.f91737a;
            bxvd da3 = bsam.f143872d.mo74144da();
            for (bnwi bnwi : new bnwq(bnwr)) {
                bxvd da4 = bsan.f143878b.mo74144da();
                for (int i4 = 0; i4 < bnwi.f132284b; i4++) {
                    bnwc bnwc = new bnwc(bnwi.mo68642a(i4));
                    bxvd da5 = bsal.f143866d.mo74144da();
                    int b = bnwc.mo68614a().mo68546b();
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bsal bsal = (bsal) da5.f164949b;
                    bsal.f143868a |= 1;
                    bsal.f143869b = b;
                    int b2 = bnwc.mo68616c().mo68546b();
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bsal bsal2 = (bsal) da5.f164949b;
                    bsal2.f143868a |= 2;
                    bsal2.f143870c = b2;
                    bsal bsal3 = (bsal) da5.mo74062i();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bsan bsan = (bsan) da4.f164949b;
                    bsal3.getClass();
                    if (!bsan.f143880a.mo73666a()) {
                        bsan.f143880a = bxvk.m124021a(bsan.f143880a);
                    }
                    bsan.f143880a.add(bsal3);
                }
                bsan bsan2 = (bsan) da4.mo74062i();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bsam bsam = (bsam) da3.f164949b;
                bsan2.getClass();
                if (!bsam.f143875b.mo73666a()) {
                    bsam.f143875b = bxvk.m124021a(bsam.f143875b);
                }
                bsam.f143875b.add(bsan2);
            }
            bsam bsam2 = (bsam) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aufh aufh = (aufh) da2.f164949b;
            bsam2.getClass();
            aufh.f91681b = bsam2;
            aufh.f91680a |= 1;
            aufh aufh2 = (aufh) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            auff auff11 = (auff) da.f164949b;
            aufh2.getClass();
            auff11.f91659l = aufh2;
            auff11.f91648a |= 4;
            List list10 = aufq.f91736r;
            int size = list10.size();
            for (int i5 = 0; i5 < size; i5++) {
                aufk b3 = ((auft) list10.get(i5)).mo50500b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                auff auff12 = (auff) da.f164949b;
                b3.getClass();
                if (!auff12.f91665r.mo73666a()) {
                    auff12.f91665r = bxvk.m124021a(auff12.f91665r);
                }
                auff12.f91665r.add(b3);
            }
            arrayList.add((auff) da.mo74062i());
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f91719a);
        sb.append("{");
        if (this.f91720b) {
            sb.append("Mock, ");
        }
        if (this.f91721c > 0.0f) {
            sb.append("Battery=");
            sb.append(this.f91721c);
            sb.append(", ");
        }
        if (!this.f91722d.isEmpty()) {
            sb.append("CallPhoneNumbers=");
            sb.append(this.f91722d);
            sb.append(", ");
        }
        if (!this.f91723e.isEmpty()) {
            sb.append("SmsPhoneNumbers=");
            sb.append(this.f91723e);
            sb.append(", ");
        }
        if (!this.f91724f.isEmpty()) {
            sb.append("HomeMccMncPrefixes=");
            sb.append(this.f91724f);
            sb.append(", ");
        }
        if (!this.f91725g.isEmpty()) {
            sb.append("BlockedHomeMccMncPrefixes=");
            sb.append(this.f91725g);
            sb.append(", ");
        }
        if (!this.f91726h.isEmpty()) {
            sb.append("NetworkMccMncPrefixes=");
            sb.append(this.f91726h);
            sb.append(", ");
        }
        if (!this.f91727i.isEmpty()) {
            sb.append("BlockedNetworkMccMncPrefixes=");
            sb.append(this.f91727i);
            sb.append(", ");
        }
        if (!this.f91728j.isEmpty()) {
            sb.append("ImsiPrefixes=");
            sb.append(this.f91728j);
            sb.append(", ");
        }
        if (!this.f91729k.isEmpty()) {
            sb.append("BlockedImsiPrefixes=");
            sb.append(this.f91729k);
            sb.append(", ");
        }
        if (!this.f91730l.mo50497a()) {
            sb.append("HasGeofilter, ");
        }
        if (!auft.m76997a(this.f91731m)) {
            sb.append("ReportAccuracyConfidence, ");
        }
        if (this.f91732n) {
            sb.append("ReportAdr, ");
        }
        if (this.f91733o) {
            sb.append("ReportFirstLocation, ");
        }
        if (!this.f91734p.isEmpty()) {
            sb.append("ReportSamplingDeltas=");
            sb.append(this.f91734p);
            sb.append(", ");
        }
        if (this.f91735q != 0) {
            sb.append("ReportTrackingPeriod=");
            sb.append(this.f91735q);
            sb.append(", ");
        }
        if (!this.f91736r.isEmpty()) {
            sb.append("Reporters=");
            sb.append(this.f91736r);
            sb.append(", ");
        }
        if (sb.length() >= 2 && sb.charAt(sb.length() - 2) == ',') {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m76989a(String str, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) list.get(i);
            if (str != null) {
                if (str2 != null && str.startsWith(str2)) {
                    return true;
                }
            } else if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: beao.a(beat, java.lang.CharSequence):int
     arg types: [beat, java.lang.String]
     candidates:
      beao.a(java.lang.CharSequence, beaq):int
      beao.a(java.lang.String, beaq):int
      beao.a(int, java.lang.String):beaq
      beao.a(beaq, int):beas
      beao.a(beat, beat):int
      beao.a(java.lang.CharSequence, java.lang.String):beat
      beao.a(beat, int):java.lang.String
      beao.a(beat, java.lang.String):boolean
      beao.a(java.lang.String, beas):boolean
      beao.a(beat, java.lang.CharSequence):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: beao.a(java.lang.CharSequence, java.lang.String, boolean, beat):void
     arg types: [java.lang.String, ?[OBJECT, ARRAY], int, beat]
     candidates:
      beao.a(java.lang.CharSequence, beaq, java.lang.StringBuilder, beat):int
      beao.a(java.lang.CharSequence, java.lang.String, boolean, beat):void */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x016d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00cf A[SYNTHETIC] */
    /* renamed from: a */
    public final EmergencyInfo mo50494a(Context context, EmergencyInfo emergencyInfo, Location location) {
        bnvn bnvn;
        char c;
        List list;
        int size;
        int i;
        boolean z;
        int i2;
        EmergencyInfo emergencyInfo2 = emergencyInfo;
        if (emergencyInfo2.f109087b.isEmpty() || (emergencyInfo.mo59539c() && !this.f91720b)) {
            return null;
        }
        String b = emergencyInfo.mo59538b();
        String a = emergencyInfo.mo59537a();
        if (!this.f91722d.isEmpty() || !this.f91723e.isEmpty()) {
            int hashCode = b.hashCode();
            if (hashCode != 82233) {
                if (hashCode == 2060894 && b.equals("CALL")) {
                    c = 0;
                    if (c != 0) {
                        if (c == 1) {
                            list = this.f91723e;
                        }
                        return null;
                    }
                    list = this.f91722d;
                    size = list.size();
                    i = 0;
                    while (i < size) {
                        String str = (String) list.get(i);
                        try {
                            beao a2 = beao.m91670a();
                            try {
                                i2 = a2.mo58480a(a2.mo58483a(a, "ZZ"), (CharSequence) str);
                            } catch (bean e) {
                                if (e.f106746a == 1) {
                                    try {
                                        i2 = a2.mo58480a(a2.mo58483a(str, "ZZ"), (CharSequence) a);
                                    } catch (bean e2) {
                                        if (e2.f106746a == 1) {
                                            try {
                                                beat beat = new beat();
                                                beat beat2 = new beat();
                                                a2.mo58487a((CharSequence) a, (String) null, false, beat);
                                                a2.mo58487a((CharSequence) str, (String) null, false, beat2);
                                                i2 = a2.mo58479a(beat, beat2);
                                            } catch (bean e3) {
                                                i2 = 1;
                                                if (i2 != 4) {
                                                }
                                                i++;
                                                if (z) {
                                                }
                                            }
                                        }
                                        i2 = 1;
                                    }
                                } else {
                                    i2 = 1;
                                }
                            }
                            z = i2 != 4 || i2 == 5;
                        } catch (IllegalStateException e4) {
                            Log.w("Thunderbird", "unable to use libphonenumber", e4);
                            if (!PhoneNumberUtils.compare(a, str)) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        i++;
                        if (z) {
                            if (srf.m36096e(context) >= this.f91721c) {
                                return null;
                            }
                            if (location != null && !this.f91730l.mo50497a()) {
                                aufr aufr = this.f91730l;
                                bnwk e5 = bnwc.m110613b(location.getLatitude(), location.getLongitude()).mo68618e();
                                if (!aufr.f91737a.mo68676a(e5)) {
                                    bnwr bnwr = aufr.f91737a;
                                    if (bnwr.mo68676a(e5)) {
                                        bnvn = bnvn.m110521a(0.0d);
                                    } else {
                                        bnvn a3 = bnvn.m110521a(3.141592653589793d);
                                        for (int i3 = 0; i3 < bnwr.mo68674a(); i3++) {
                                            bnwi a4 = bnwr.mo68675a(i3);
                                            bnwk b2 = bnwk.m110665b(e5);
                                            bnvn a5 = bnvn.m110521a(3.141592653589793d);
                                            int i4 = 0;
                                            while (i4 < a4.f132284b) {
                                                int i5 = i4 + 1;
                                                a5 = bnvn.m110523a(a5, bnvx.m110601a(b2, a4.mo68642a(i4), a4.mo68642a(i5)));
                                                i4 = i5;
                                            }
                                            a3 = bnvn.m110523a(a3, a5);
                                        }
                                        bnvn = a3;
                                    }
                                    if (bnvn.mo68547c() >= ((double) location.getAccuracy())) {
                                        return null;
                                    }
                                }
                            }
                            EmergencyInfo a6 = emergencyInfo2.mo59536a(new aufo(this));
                            if (!a6.f109087b.isEmpty()) {
                                return a6;
                            }
                            return null;
                        }
                    }
                    return null;
                }
            } else if (b.equals("SMS")) {
                c = 1;
                if (c != 0) {
                }
                size = list.size();
                i = 0;
                while (i < size) {
                }
                return null;
            }
            c = 65535;
            if (c != 0) {
            }
            size = list.size();
            i = 0;
            while (i < size) {
            }
            return null;
        } else if (srf.m36096e(context) >= this.f91721c) {
        }
    }

    /* renamed from: a */
    public final boolean mo50495a(DeviceState deviceState) {
        String str = deviceState.f109083g;
        if ((this.f91724f.isEmpty() || m76989a(str, this.f91724f)) && !m76989a(str, this.f91725g)) {
            String str2 = deviceState.f109084h;
            if ((this.f91726h.isEmpty() || m76989a(str2, this.f91726h)) && !m76989a(str2, this.f91727i)) {
                String str3 = deviceState.f109079c;
                if ((this.f91728j.isEmpty() || m76989a(str3, this.f91728j)) && !m76989a(str3, this.f91729k)) {
                    return true;
                }
            }
        }
        return false;
    }
}
