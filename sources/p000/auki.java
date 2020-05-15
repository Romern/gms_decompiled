package p000;

import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.cast.JGCastService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: auki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auki {

    /* renamed from: a */
    SparseArray f91977a;

    /* renamed from: b */
    int f91978b = 0;

    public auki() {
        byte[] bArr;
        cixp j = cgzf.f188102a.mo6606a().mo84801j();
        if (j != null) {
            bArr = j.mo73642k();
        } else {
            bArr = null;
        }
        if (bArr != null) {
            try {
                cixp cixp = (cixp) bxvk.m124016a(cixp.f191704b, bArr, bxus.m123744c());
                SparseArray sparseArray = this.f91977a;
                if (sparseArray == null) {
                    this.f91977a = new SparseArray(64);
                } else {
                    sparseArray.clear();
                }
                for (cixo cixo : cixp.f191706a) {
                    this.f91977a.put(cixo.f191701a, Integer.valueOf(cixo.f191702b));
                }
            } catch (bxwf e) {
                Log.e("TronConfig", "failed to decode field mapping configuration", e);
                SparseArray sparseArray2 = this.f91977a;
                if (sparseArray2 == null || sparseArray2.size() == 0) {
                    this.f91977a = m77220a();
                }
            }
        } else {
            this.f91977a = m77220a();
        }
    }

    /* renamed from: a */
    private static SparseArray m77220a() {
        SparseArray sparseArray = new SparseArray(64);
        sparseArray.put(826, 1000002);
        sparseArray.put(827, 1000001);
        sparseArray.put(825, 1000004);
        sparseArray.put(319, 1000018);
        sparseArray.put(325, 1000014);
        sparseArray.put(871, 1000015);
        sparseArray.put(320, 759);
        sparseArray.put(904, 799);
        sparseArray.put(905, 10000016);
        sparseArray.put(321, 1000019);
        sparseArray.put(322, 1000020);
        sparseArray.put(945, 1000021);
        sparseArray.put(901, 1000007);
        sparseArray.put(902, 759);
        sparseArray.put(793, 1000007);
        sparseArray.put(794, 1000009);
        sparseArray.put(795, 1000008);
        sparseArray.put(796, 1000010);
        sparseArray.put(797, 1000011);
        sparseArray.put(798, 1000013);
        sparseArray.put(825, 1000004);
        sparseArray.put(908, 1000015);
        sparseArray.put(909, 1000001);
        sparseArray.put(911, 759);
        sparseArray.put(914, 1000001);
        sparseArray.put(915, 759);
        sparseArray.put(917, 1000001);
        sparseArray.put(833, 1000001);
        sparseArray.put(865, 10000016);
        sparseArray.put(943, 10000016);
        sparseArray.put(903, 1000017);
        return sparseArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo50608b(int i, Object obj) {
        if (cgzf.m147724c()) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb.append("Unpackable field in log: ");
            sb.append(i);
            sb.append(" with value ");
            sb.append(valueOf);
            sb.toString();
        }
        this.f91978b++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50606a(int i, Object obj) {
        if (cgzf.m147724c()) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
            sb.append("Overpacked field in log: ");
            sb.append(i);
            sb.append(" with second value ");
            sb.append(valueOf);
            sb.toString();
        }
        this.f91978b++;
    }

    /* renamed from: a */
    public final void mo50607a(int i, Object obj, bxvd bxvd) {
        Object obj2 = obj;
        bxvd bxvd2 = bxvd;
        Integer num = (Integer) this.f91977a.get(i);
        if (num == null) {
            num = Integer.valueOf(i);
        }
        try {
            int intValue = num.intValue();
            if (intValue == 799) {
                if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172293v)) {
                    mo50606a(num.intValue(), obj2);
                }
                String str = (String) obj2;
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                bzzx bzzx = (bzzx) bxvd2.f164949b;
                bzzx bzzx2 = bzzx.f172237al;
                str.getClass();
                bzzx.f172265a |= 1048576;
                bzzx.f172293v = str;
            } else if (intValue != 10000016) {
                switch (intValue) {
                    case 757:
                        bkb a = bkb.m3247a(((bzzx) bxvd2.f164949b).f172275d);
                        if (a == null) {
                            a = bkb.VIEW_UNKNOWN;
                        }
                        if (a != bkb.VIEW_UNKNOWN) {
                            mo50606a(num.intValue(), obj2);
                        }
                        bkb a2 = bkb.m3247a(((Integer) obj2).intValue());
                        if (a2 != null) {
                            if (bxvd2.f164950c) {
                                bxvd.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            bzzx bzzx3 = (bzzx) bxvd2.f164949b;
                            bzzx bzzx4 = bzzx.f172237al;
                            bzzx3.f172275d = a2.f4944CA;
                            bzzx3.f172265a |= 2;
                            return;
                        }
                        return;
                    case 758:
                        int a3 = bjz.m3242a(((bzzx) bxvd2.f164949b).f172274c);
                        if (a3 != 0) {
                            if (a3 != 1) {
                                mo50606a(num.intValue(), obj2);
                            }
                        }
                        int a4 = bjz.m3242a(((Integer) obj2).intValue());
                        if (a4 != 0) {
                            if (bxvd2.f164950c) {
                                bxvd.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            bzzx bzzx5 = (bzzx) bxvd2.f164949b;
                            bzzx bzzx6 = bzzx.f172237al;
                            bzzx5.f172274c = a4 - 1;
                            bzzx5.f172265a |= 1;
                            return;
                        }
                        return;
                    case 759:
                        if (((bzzx) bxvd2.f164949b).f172278g != 0) {
                            mo50606a(num.intValue(), obj2);
                        }
                        int intValue2 = ((Integer) obj2).intValue();
                        if (bxvd2.f164950c) {
                            bxvd.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        bzzx bzzx7 = (bzzx) bxvd2.f164949b;
                        bzzx bzzx8 = bzzx.f172237al;
                        bzzx7.f172265a |= 32;
                        bzzx7.f172278g = intValue2;
                        return;
                    default:
                        switch (intValue) {
                            case 801:
                            case 802:
                            case 803:
                            case 804:
                                mo50608b(num.intValue(), obj2);
                                return;
                            case 805:
                                if (((bzzx) bxvd2.f164949b).f172276e != 0) {
                                    mo50606a(num.intValue(), obj2);
                                }
                                long longValue = ((Number) obj2).longValue();
                                if (bxvd2.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                bzzx bzzx9 = (bzzx) bxvd2.f164949b;
                                bzzx bzzx10 = bzzx.f172237al;
                                bzzx9.f172265a |= 4;
                                bzzx9.f172276e = longValue;
                                return;
                            case 806:
                                if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172277f)) {
                                    mo50606a(num.intValue(), obj2);
                                }
                                String str2 = (String) obj2;
                                if (bxvd2.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                bzzx bzzx11 = (bzzx) bxvd2.f164949b;
                                bzzx bzzx12 = bzzx.f172237al;
                                str2.getClass();
                                bzzx11.f172265a |= 16;
                                bzzx11.f172277f = str2;
                                return;
                            default:
                                switch (intValue) {
                                    case 1000001:
                                        if (((bzzx) bxvd2.f164949b).f172290s != 0) {
                                            mo50606a(num.intValue(), obj2);
                                        }
                                        int intValue3 = ((Integer) obj2).intValue();
                                        if (bxvd2.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        bzzx bzzx13 = (bzzx) bxvd2.f164949b;
                                        bzzx bzzx14 = bzzx.f172237al;
                                        bzzx13.f172265a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                                        bzzx13.f172290s = intValue3;
                                        return;
                                    case 1000002:
                                        if (((bzzx) bxvd2.f164949b).f172289r != 0) {
                                            mo50606a(num.intValue(), obj2);
                                        }
                                        int intValue4 = ((Integer) obj2).intValue();
                                        if (bxvd2.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        bzzx bzzx15 = (bzzx) bxvd2.f164949b;
                                        bzzx bzzx16 = bzzx.f172237al;
                                        bzzx15.f172265a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                        bzzx15.f172289r = intValue4;
                                        return;
                                    case 1000003:
                                        bkb a5 = bkb.m3247a(((bzzx) bxvd2.f164949b).f172291t);
                                        if (a5 == null) {
                                            a5 = bkb.VIEW_UNKNOWN;
                                        }
                                        if (a5 != bkb.VIEW_UNKNOWN) {
                                            mo50606a(num.intValue(), obj2);
                                        }
                                        bkb a6 = bkb.m3247a(((Integer) obj2).intValue());
                                        if (a6 != null) {
                                            if (bxvd2.f164950c) {
                                                bxvd.mo74035c();
                                                bxvd2.f164950c = false;
                                            }
                                            bzzx bzzx17 = (bzzx) bxvd2.f164949b;
                                            bzzx bzzx18 = bzzx.f172237al;
                                            bzzx17.f172291t = a6.f4944CA;
                                            bzzx17.f172265a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                                            return;
                                        }
                                        return;
                                    case 1000004:
                                        if (((bzzx) bxvd2.f164949b).f172292u != 0.0f) {
                                            mo50606a(num.intValue(), obj2);
                                        }
                                        float floatValue = ((Float) obj2).floatValue();
                                        if (bxvd2.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        bzzx bzzx19 = (bzzx) bxvd2.f164949b;
                                        bzzx bzzx20 = bzzx.f172237al;
                                        bzzx19.f172265a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                                        bzzx19.f172292u = floatValue;
                                        return;
                                    default:
                                        switch (intValue) {
                                            case 1000007:
                                                if (((bzzx) bxvd2.f164949b).f172279h != 0) {
                                                    mo50606a(num.intValue(), obj2);
                                                }
                                                long longValue2 = ((Number) obj2).longValue();
                                                if (bxvd2.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                bzzx bzzx21 = (bzzx) bxvd2.f164949b;
                                                bzzx bzzx22 = bzzx.f172237al;
                                                bzzx21.f172265a |= 64;
                                                bzzx21.f172279h = longValue2;
                                                return;
                                            case 1000008:
                                                if (((bzzx) bxvd2.f164949b).f172280i != 0) {
                                                    mo50606a(num.intValue(), obj2);
                                                }
                                                long longValue3 = ((Number) obj2).longValue();
                                                if (bxvd2.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                bzzx bzzx23 = (bzzx) bxvd2.f164949b;
                                                bzzx bzzx24 = bzzx.f172237al;
                                                bzzx23.f172265a |= 128;
                                                bzzx23.f172280i = longValue3;
                                                return;
                                            case 1000009:
                                                if (((bzzx) bxvd2.f164949b).f172281j != 0) {
                                                    mo50606a(num.intValue(), obj2);
                                                }
                                                long longValue4 = ((Number) obj2).longValue();
                                                if (bxvd2.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                bzzx bzzx25 = (bzzx) bxvd2.f164949b;
                                                bzzx bzzx26 = bzzx.f172237al;
                                                bzzx25.f172265a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                                bzzx25.f172281j = longValue4;
                                                return;
                                            case 1000010:
                                                if (((bzzx) bxvd2.f164949b).f172282k != 0) {
                                                    mo50606a(num.intValue(), obj2);
                                                }
                                                int intValue5 = ((Integer) obj2).intValue();
                                                if (bxvd2.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                bzzx bzzx27 = (bzzx) bxvd2.f164949b;
                                                bzzx bzzx28 = bzzx.f172237al;
                                                bzzx27.f172265a |= 512;
                                                bzzx27.f172282k = intValue5;
                                                return;
                                            case 1000011:
                                                if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172283l)) {
                                                    mo50606a(num.intValue(), obj2);
                                                }
                                                String str3 = (String) obj2;
                                                if (bxvd2.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                bzzx bzzx29 = (bzzx) bxvd2.f164949b;
                                                bzzx bzzx30 = bzzx.f172237al;
                                                str3.getClass();
                                                bzzx29.f172265a |= 1024;
                                                bzzx29.f172283l = str3;
                                                return;
                                            case 1000012:
                                                if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172284m)) {
                                                    mo50606a(num.intValue(), obj2);
                                                }
                                                String str4 = (String) obj2;
                                                if (bxvd2.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                bzzx bzzx31 = (bzzx) bxvd2.f164949b;
                                                bzzx bzzx32 = bzzx.f172237al;
                                                str4.getClass();
                                                bzzx31.f172265a |= 2048;
                                                bzzx31.f172284m = str4;
                                                return;
                                            case 1000013:
                                                int intValue6 = ((Integer) obj2).intValue();
                                                if (bxvd2.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                bzzx bzzx33 = (bzzx) bxvd2.f164949b;
                                                bzzx bzzx34 = bzzx.f172237al;
                                                bzzx33.f172265a |= 8192;
                                                bzzx33.f172286o = intValue6;
                                                return;
                                            case 1000014:
                                                if (((bzzx) bxvd2.f164949b).f172287p > 0) {
                                                    mo50606a(num.intValue(), obj2);
                                                }
                                                long longValue5 = ((Number) obj2).longValue();
                                                if (bxvd2.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                bzzx bzzx35 = (bzzx) bxvd2.f164949b;
                                                bzzx bzzx36 = bzzx.f172237al;
                                                bzzx35.f172265a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                                bzzx35.f172287p = longValue5;
                                                return;
                                            case 1000015:
                                                if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172288q)) {
                                                    mo50606a(num.intValue(), obj2);
                                                }
                                                String str5 = (String) obj2;
                                                if (bxvd2.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                bzzx bzzx37 = (bzzx) bxvd2.f164949b;
                                                bzzx bzzx38 = bzzx.f172237al;
                                                str5.getClass();
                                                bzzx37.f172265a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                                                bzzx37.f172288q = str5;
                                                return;
                                            default:
                                                switch (intValue) {
                                                    case 1000017:
                                                        if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172294w)) {
                                                            mo50606a(num.intValue(), obj2);
                                                        }
                                                        String str6 = (String) obj2;
                                                        if (bxvd2.f164950c) {
                                                            bxvd.mo74035c();
                                                            bxvd2.f164950c = false;
                                                        }
                                                        bzzx bzzx39 = (bzzx) bxvd2.f164949b;
                                                        bzzx bzzx40 = bzzx.f172237al;
                                                        str6.getClass();
                                                        bzzx39.f172265a |= 2097152;
                                                        bzzx39.f172294w = str6;
                                                        return;
                                                    case 1000018:
                                                        if (((bzzx) bxvd2.f164949b).f172296y != 0) {
                                                            mo50606a(num.intValue(), obj2);
                                                        }
                                                        long longValue6 = ((Number) obj2).longValue();
                                                        if (bxvd2.f164950c) {
                                                            bxvd.mo74035c();
                                                            bxvd2.f164950c = false;
                                                        }
                                                        bzzx bzzx41 = (bzzx) bxvd2.f164949b;
                                                        bzzx bzzx42 = bzzx.f172237al;
                                                        bzzx41.f172265a |= 8388608;
                                                        bzzx41.f172296y = longValue6;
                                                        return;
                                                    case 1000019:
                                                        if (((bzzx) bxvd2.f164949b).f172297z != 0) {
                                                            mo50606a(num.intValue(), obj2);
                                                        }
                                                        long longValue7 = ((Number) obj2).longValue();
                                                        if (bxvd2.f164950c) {
                                                            bxvd.mo74035c();
                                                            bxvd2.f164950c = false;
                                                        }
                                                        bzzx bzzx43 = (bzzx) bxvd2.f164949b;
                                                        bzzx bzzx44 = bzzx.f172237al;
                                                        bzzx43.f172265a |= 16777216;
                                                        bzzx43.f172297z = longValue7;
                                                        return;
                                                    case 1000020:
                                                        if (((bzzx) bxvd2.f164949b).f172239A != 0) {
                                                            mo50606a(num.intValue(), obj2);
                                                        }
                                                        long longValue8 = ((Number) obj2).longValue();
                                                        if (bxvd2.f164950c) {
                                                            bxvd.mo74035c();
                                                            bxvd2.f164950c = false;
                                                        }
                                                        bzzx bzzx45 = (bzzx) bxvd2.f164949b;
                                                        bzzx bzzx46 = bzzx.f172237al;
                                                        bzzx45.f172265a |= 33554432;
                                                        bzzx45.f172239A = longValue8;
                                                        return;
                                                    case 1000021:
                                                        if (((bzzx) bxvd2.f164949b).f172240B != 0) {
                                                            mo50606a(num.intValue(), obj2);
                                                        }
                                                        long longValue9 = ((Number) obj2).longValue();
                                                        if (bxvd2.f164950c) {
                                                            bxvd.mo74035c();
                                                            bxvd2.f164950c = false;
                                                        }
                                                        bzzx bzzx47 = (bzzx) bxvd2.f164949b;
                                                        bzzx bzzx48 = bzzx.f172237al;
                                                        bzzx47.f172265a |= 67108864;
                                                        bzzx47.f172240B = longValue9;
                                                        return;
                                                    case 1000022:
                                                        if (((bzzx) bxvd2.f164949b).f172241C != 0) {
                                                            mo50606a(num.intValue(), obj2);
                                                        }
                                                        long longValue10 = ((Number) obj2).longValue();
                                                        if (bxvd2.f164950c) {
                                                            bxvd.mo74035c();
                                                            bxvd2.f164950c = false;
                                                        }
                                                        bzzx bzzx49 = (bzzx) bxvd2.f164949b;
                                                        bzzx bzzx50 = bzzx.f172237al;
                                                        bzzx49.f172265a |= 134217728;
                                                        bzzx49.f172241C = longValue10;
                                                        return;
                                                    case 1000023:
                                                        if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172242D)) {
                                                            mo50606a(num.intValue(), obj2);
                                                        }
                                                        String str7 = (String) obj2;
                                                        if (bxvd2.f164950c) {
                                                            bxvd.mo74035c();
                                                            bxvd2.f164950c = false;
                                                        }
                                                        bzzx bzzx51 = (bzzx) bxvd2.f164949b;
                                                        bzzx bzzx52 = bzzx.f172237al;
                                                        str7.getClass();
                                                        bzzx51.f172265a |= 268435456;
                                                        bzzx51.f172242D = str7;
                                                        return;
                                                    case 1000024:
                                                        if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172243E)) {
                                                            mo50606a(num.intValue(), obj2);
                                                        }
                                                        String str8 = (String) obj2;
                                                        if (bxvd2.f164950c) {
                                                            bxvd.mo74035c();
                                                            bxvd2.f164950c = false;
                                                        }
                                                        bzzx bzzx53 = (bzzx) bxvd2.f164949b;
                                                        bzzx bzzx54 = bzzx.f172237al;
                                                        str8.getClass();
                                                        bzzx53.f172265a |= 536870912;
                                                        bzzx53.f172243E = str8;
                                                        return;
                                                    case 1000025:
                                                        if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172244F)) {
                                                            mo50606a(num.intValue(), obj2);
                                                        }
                                                        String str9 = (String) obj2;
                                                        if (bxvd2.f164950c) {
                                                            bxvd.mo74035c();
                                                            bxvd2.f164950c = false;
                                                        }
                                                        bzzx bzzx55 = (bzzx) bxvd2.f164949b;
                                                        bzzx bzzx56 = bzzx.f172237al;
                                                        str9.getClass();
                                                        bzzx55.f172265a |= JGCastService.FLAG_PRIVATE_DISPLAY;
                                                        bzzx55.f172244F = str9;
                                                        return;
                                                    case 1000026:
                                                        if (((bzzx) bxvd2.f164949b).f172245G != 0) {
                                                            mo50606a(num.intValue(), obj2);
                                                        }
                                                        int intValue7 = ((Integer) obj2).intValue();
                                                        if (bxvd2.f164950c) {
                                                            bxvd.mo74035c();
                                                            bxvd2.f164950c = false;
                                                        }
                                                        bzzx bzzx57 = (bzzx) bxvd2.f164949b;
                                                        bzzx bzzx58 = bzzx.f172237al;
                                                        bzzx57.f172265a |= Integer.MIN_VALUE;
                                                        bzzx57.f172245G = intValue7;
                                                        return;
                                                    default:
                                                        switch (intValue) {
                                                            case 1000028:
                                                                if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172246H)) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                String str10 = (String) obj2;
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx59 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx60 = bzzx.f172237al;
                                                                str10.getClass();
                                                                bzzx59.f172273b |= 1;
                                                                bzzx59.f172246H = str10;
                                                                return;
                                                            case 1000029:
                                                                if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172247I)) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                String str11 = (String) obj2;
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx61 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx62 = bzzx.f172237al;
                                                                str11.getClass();
                                                                bzzx61.f172273b |= 2;
                                                                bzzx61.f172247I = str11;
                                                                return;
                                                            case 1000030:
                                                                if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172248J)) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                String str12 = (String) obj2;
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx63 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx64 = bzzx.f172237al;
                                                                str12.getClass();
                                                                bzzx63.f172273b |= 4;
                                                                bzzx63.f172248J = str12;
                                                                return;
                                                            case 1000031:
                                                                if (((bzzx) bxvd2.f164949b).f172249K != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue8 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx65 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx66 = bzzx.f172237al;
                                                                bzzx65.f172273b |= 8;
                                                                bzzx65.f172249K = intValue8;
                                                                return;
                                                            case 1000032:
                                                                if (((bzzx) bxvd2.f164949b).f172250L != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue9 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx67 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx68 = bzzx.f172237al;
                                                                bzzx67.f172273b |= 16;
                                                                bzzx67.f172250L = intValue9;
                                                                return;
                                                            case 1000033:
                                                                if (((bzzx) bxvd2.f164949b).f172251M != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue10 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx69 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx70 = bzzx.f172237al;
                                                                bzzx69.f172273b |= 32;
                                                                bzzx69.f172251M = intValue10;
                                                                return;
                                                            case 1000034:
                                                                if (((bzzx) bxvd2.f164949b).f172252N != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue11 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx71 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx72 = bzzx.f172237al;
                                                                bzzx71.f172273b |= 64;
                                                                bzzx71.f172252N = intValue11;
                                                                return;
                                                            case 1000035:
                                                                if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172253O)) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                String str13 = (String) obj2;
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx73 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx74 = bzzx.f172237al;
                                                                str13.getClass();
                                                                bzzx73.f172273b |= 128;
                                                                bzzx73.f172253O = str13;
                                                                return;
                                                            case 1000036:
                                                                if (((bzzx) bxvd2.f164949b).f172254P != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue12 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx75 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx76 = bzzx.f172237al;
                                                                bzzx75.f172273b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                                                bzzx75.f172254P = intValue12;
                                                                return;
                                                            case 1000037:
                                                                if (((bzzx) bxvd2.f164949b).f172255Q != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue13 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx77 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx78 = bzzx.f172237al;
                                                                bzzx77.f172273b |= 512;
                                                                bzzx77.f172255Q = intValue13;
                                                                return;
                                                            case 1000038:
                                                                if (((bzzx) bxvd2.f164949b).f172256R != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue14 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx79 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx80 = bzzx.f172237al;
                                                                bzzx79.f172273b |= 1024;
                                                                bzzx79.f172256R = intValue14;
                                                                return;
                                                            case 1000039:
                                                                if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172257S)) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                String str14 = (String) obj2;
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx81 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx82 = bzzx.f172237al;
                                                                str14.getClass();
                                                                bzzx81.f172273b |= 2048;
                                                                bzzx81.f172257S = str14;
                                                                return;
                                                            case 1000040:
                                                                if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172258T)) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                String str15 = (String) obj2;
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx83 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx84 = bzzx.f172237al;
                                                                str15.getClass();
                                                                bzzx83.f172273b |= 4096;
                                                                bzzx83.f172258T = str15;
                                                                return;
                                                            case 1000041:
                                                                if (((bzzx) bxvd2.f164949b).f172259U != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue15 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx85 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx86 = bzzx.f172237al;
                                                                bzzx85.f172273b |= 8192;
                                                                bzzx85.f172259U = intValue15;
                                                                return;
                                                            case 1000042:
                                                                if (((bzzx) bxvd2.f164949b).f172260V != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue16 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx87 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx88 = bzzx.f172237al;
                                                                bzzx87.f172273b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                                                bzzx87.f172260V = intValue16;
                                                                return;
                                                            case 1000043:
                                                                if (((bzzx) bxvd2.f164949b).f172261W != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue17 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx89 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx90 = bzzx.f172237al;
                                                                bzzx89.f172273b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                                                                bzzx89.f172261W = intValue17;
                                                                return;
                                                            case 1000044:
                                                                if (((bzzx) bxvd2.f164949b).f172262X != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue18 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx91 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx92 = bzzx.f172237al;
                                                                bzzx91.f172273b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                                                bzzx91.f172262X = intValue18;
                                                                return;
                                                            case 1000045:
                                                                if (((bzzx) bxvd2.f164949b).f172263Y != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue19 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx93 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx94 = bzzx.f172237al;
                                                                bzzx93.f172273b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                                                                bzzx93.f172263Y = intValue19;
                                                                return;
                                                            case 1000046:
                                                                if (((bzzx) bxvd2.f164949b).f172264Z != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue20 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx95 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx96 = bzzx.f172237al;
                                                                bzzx95.f172273b = 262144 | bzzx95.f172273b;
                                                                bzzx95.f172264Z = intValue20;
                                                                return;
                                                            case 1000047:
                                                                if (((bzzx) bxvd2.f164949b).f172266aa != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue21 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx97 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx98 = bzzx.f172237al;
                                                                bzzx97.f172273b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                                                                bzzx97.f172266aa = intValue21;
                                                                return;
                                                            case 1000048:
                                                                if (((bzzx) bxvd2.f164949b).f172267ab != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue22 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx99 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx100 = bzzx.f172237al;
                                                                bzzx99.f172273b |= 1048576;
                                                                bzzx99.f172267ab = intValue22;
                                                                return;
                                                            case 1000049:
                                                                if (((bzzx) bxvd2.f164949b).f172268ac != 0) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                int intValue23 = ((Integer) obj2).intValue();
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx101 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx102 = bzzx.f172237al;
                                                                bzzx101.f172273b |= 2097152;
                                                                bzzx101.f172268ac = intValue23;
                                                                return;
                                                            case 1000050:
                                                                if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172269ad)) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                String str16 = (String) obj2;
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx103 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx104 = bzzx.f172237al;
                                                                str16.getClass();
                                                                bzzx103.f172273b |= 33554432;
                                                                bzzx103.f172269ad = str16;
                                                                return;
                                                            case 1000051:
                                                                if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172270ae)) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                String str17 = (String) obj2;
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx105 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx106 = bzzx.f172237al;
                                                                str17.getClass();
                                                                bzzx105.f172273b |= 67108864;
                                                                bzzx105.f172270ae = str17;
                                                                return;
                                                            case 1000052:
                                                                if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172271af)) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                String str18 = (String) obj2;
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx107 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx108 = bzzx.f172237al;
                                                                str18.getClass();
                                                                bzzx107.f172273b |= 134217728;
                                                                bzzx107.f172271af = str18;
                                                                return;
                                                            case 1000053:
                                                                if (!TextUtils.isEmpty(((bzzx) bxvd2.f164949b).f172272ak)) {
                                                                    mo50606a(num.intValue(), obj2);
                                                                }
                                                                String str19 = (String) obj2;
                                                                if (bxvd2.f164950c) {
                                                                    bxvd.mo74035c();
                                                                    bxvd2.f164950c = false;
                                                                }
                                                                bzzx bzzx109 = (bzzx) bxvd2.f164949b;
                                                                bzzx bzzx110 = bzzx.f172237al;
                                                                str19.getClass();
                                                                bzzx109.f172273b |= 268435456;
                                                                bzzx109.f172272ak = str19;
                                                                return;
                                                            default:
                                                                mo50608b(num.intValue(), obj2);
                                                                return;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            }
        } catch (ClassCastException e) {
            ClassCastException classCastException = e;
            int intValue24 = num.intValue();
            if (cgzf.m147724c()) {
                String valueOf = String.valueOf(obj);
                String message = classCastException.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60 + String.valueOf(message).length());
                sb.append("Unpackable field in log: ");
                sb.append(intValue24);
                sb.append(" with value ");
                sb.append(valueOf);
                sb.append("Wrong type: ");
                sb.append(message);
                sb.toString();
            }
            this.f91978b++;
        }
    }
}
