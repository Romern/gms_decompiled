package p000;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: amwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amwv {

    /* renamed from: a */
    private static final alse f76227a = alse.f74192a;

    /* renamed from: b */
    private static final bnhe f76228b;

    /* renamed from: c */
    private static final Map f76229c;

    /* renamed from: d */
    private static final bnhe f76230d;

    /* renamed from: e */
    private static final Map f76231e;

    /* renamed from: f */
    private static final bnhe f76232f;

    /* renamed from: g */
    private static final Map f76233g;

    /* renamed from: h */
    private static final bnhe f76234h;

    /* renamed from: i */
    private static final Map f76235i;

    static {
        bnhe a = bnhe.m109409a("male", 1, "female", 2);
        f76228b = a;
        f76229c = alse.m61625a(a);
        bnhe a2 = bnhe.m109411a((byte) 1, 1, (byte) 2, 2, (byte) 3, 3, (byte) -1, 4);
        f76230d = a2;
        f76231e = alse.m61625a(a2);
        bnhe a3 = bnhe.m109412a((byte) 1, 1, (byte) 2, 2, (byte) 3, 3, (byte) 4, 4, (byte) -1, 5);
        f76232f = a3;
        f76233g = alse.m61625a(a3);
        bnhe a4 = bnhe.m109412a("user", 4, "keyword", 3, "home", 2, "work", 1, "other", 5);
        f76234h = a4;
        f76235i = alse.m61625a(a4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x04c6 A[SYNTHETIC] */
    /* renamed from: a */
    public static bler m63574a(amvp amvp) {
        ArrayList arrayList;
        List list;
        Iterable iterable;
        List list2;
        ArrayList arrayList2;
        List list3;
        int i;
        List list4;
        List list5;
        String asString;
        String asString2;
        String asString3;
        String asString4;
        String asString5;
        Integer asInteger;
        Integer asInteger2;
        boolean z;
        List list6;
        String str;
        amvp amvp2 = amvp;
        String str2 = amvp2.f76092a;
        String a = anaw.m63872a(str2);
        String str3 = amvp2.f76093b;
        bleq bleq = (bleq) bler.f126245D.mo74144da();
        if (a != null) {
            if (bleq.f164950c) {
                bleq.mo74035c();
                bleq.f164950c = false;
            }
            bler bler = (bler) bleq.f164949b;
            a.getClass();
            bler.f126251a |= 1;
            bler.f126252b = a;
        }
        bxvd da = blfd.f126337g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blfd blfd = (blfd) da.f164949b;
        blfd.f126340b = 2;
        int i2 = blfd.f126339a | 2;
        blfd.f126339a = i2;
        String str4 = amvp2.f76093b;
        if (str4 != null) {
            str4.getClass();
            i2 |= 64;
            blfd.f126339a = i2;
            blfd.f126344f = str4;
        }
        String str5 = amvp2.f76092a;
        if (str5 != null) {
            str5.getClass();
            blfd.f126339a = i2 | 4;
            blfd.f126341c = str5;
        }
        Long l = amvp2.f76096e;
        if (l != null) {
            long longValue = l.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blfd blfd2 = (blfd) da.f164949b;
            blfd2.f126339a |= 16;
            blfd2.f126343e = longValue;
        }
        blfd blfd3 = (blfd) da.mo74062i();
        bxvd da2 = blew.f126288f.mo74144da();
        bxvd da3 = blec.f126173b.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        blec blec = (blec) da3.f164949b;
        blfd3.getClass();
        if (!blec.f126175a.mo73666a()) {
            blec.f126175a = GeneratedMessageLite.m124021a(blec.f126175a);
        }
        blec.f126175a.add(blfd3);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blew blew = (blew) da2.f164949b;
        blec blec2 = (blec) da3.mo74062i();
        blec2.getClass();
        blew.f126293d = blec2;
        blew.f126290a |= 128;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blew blew2 = (blew) da2.f164949b;
        blew2.f126291b = 2;
        blew2.f126290a |= 1;
        if (!TextUtils.isEmpty(str2)) {
            long parseLong = Long.parseLong(str2, 16);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blew blew3 = (blew) da2.f164949b;
            if (!blew3.f126292c.mo73666a()) {
                blew3.f126292c = GeneratedMessageLite.m124020a(blew3.f126292c);
            }
            blew3.f126292c.mo74161a(parseLong);
        }
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler2 = (bler) bleq.f164949b;
        blew blew4 = (blew) da2.mo74062i();
        blew4.getClass();
        bler2.f126253c = blew4;
        bler2.f126251a |= 2;
        if (amvp2.f76091K.isEmpty()) {
            return (bler) bleq.mo74062i();
        }
        List b = m63580b(amvp2.f76083C, str2);
        List a2 = m63575a(amvp2.f76087G, str2);
        List a3 = alse.m61623a(ancm.m64003a(amvp2.f76103l), str2, f76227a.mo40674a(bldi.class));
        List a4 = m63575a(amvp2.f76104m, str2);
        List list7 = amvp2.f76108q;
        if (ancm.m64008a((Collection) list7)) {
            arrayList = new ArrayList();
        } else {
            JSONObject jSONObject = new JSONObject();
            int size = list7.size();
            for (int i3 = 0; i3 < size; i3++) {
                ContentValues contentValues = (ContentValues) list7.get(i3);
                jSONObject.put(contentValues.getAsString("data1"), contentValues.getAsString("data2"));
            }
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                String valueOf = String.valueOf(jSONObject2);
                throw new JSONException(valueOf.length() == 0 ? new String("Failed to convert JSON object: ") : "Failed to convert JSON object: ".concat(valueOf));
            }
            bxvd da4 = bldk.f126094f.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bldk bldk = (bldk) da4.f164949b;
            "gdataExtendedProperty".getClass();
            int i4 = bldk.f126096a | 8;
            bldk.f126096a = i4;
            bldk.f126100e = "gdataExtendedProperty";
            "android".getClass();
            int i5 = i4 | 2;
            bldk.f126096a = i5;
            bldk.f126098c = "android";
            jSONObject2.getClass();
            bldk.f126096a = i5 | 4;
            bldk.f126099d = jSONObject2;
            bleu f = alse.m61636f(str2);
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bldk bldk2 = (bldk) da4.f164949b;
            f.getClass();
            bldk2.f126097b = f;
            bldk2.f126096a |= 1;
            arrayList = new ArrayList(bngx.m109356a((bldk) da4.mo74062i()));
        }
        List a5 = m63575a(amvp2.f76106o, str2);
        List a6 = alse.m61623a(amvp2.f76107p, str2, f76227a.mo40674a(bldv.class));
        List a7 = m63575a(amvp2.f76109r, str2);
        List b2 = m63580b(amvp2.f76110s, str2);
        ArrayList arrayList3 = new ArrayList();
        List a8 = m63575a(amvp2.f76114w, str2);
        List a9 = m63575a(amvp2.f76112u, str2);
        List a10 = m63575a(amvp2.f76116y, str2);
        alse alse = f76227a;
        List list8 = b2;
        List list9 = amvp2.f76111t;
        if (!ancm.m64008a((Collection) list9)) {
            list = a7;
            iterable = alse.m61623a(list9, str2, alse.mo40674a(bldl.class));
        } else {
            list = a7;
            iterable = new ArrayList();
        }
        List b3 = m63580b(amvp2.f76081A, str2);
        List a11 = m63575a(amvp2.f76082B, str2);
        List list10 = b3;
        ArrayList arrayList4 = new ArrayList();
        Iterable iterable2 = iterable;
        List a12 = m63575a(amvp2.f76084D, str2);
        ArrayList arrayList5 = new ArrayList();
        List list11 = a6;
        List a13 = m63575a(amvp2.f76085E, str2);
        List a14 = m63575a(amvp2.f76086F, str2);
        List a15 = m63575a(amvp2.f76088H, str2);
        List a16 = m63575a(amvp2.f76089I, str2);
        List a17 = m63575a(amvp2.f76105n, str2);
        List a18 = m63575a(amvp2.f76090J, str2);
        List list12 = amvp2.f76115x;
        List list13 = amvp2.f76117z;
        bleu f2 = alse.m61636f(str2);
        if (!ancm.m64008a((Collection) list12)) {
            list3 = a5;
            int size2 = list12.size();
            arrayList2 = arrayList;
            int i6 = 0;
            while (i6 < size2) {
                int i7 = size2;
                ContentValues contentValues2 = (ContentValues) list12.get(i6);
                List list14 = list12;
                Integer asInteger3 = contentValues2.getAsInteger("data2");
                if (asInteger3 != null) {
                    list6 = a4;
                    str = (String) f76235i.get(asInteger3);
                } else {
                    list6 = a4;
                    str = null;
                }
                if (str == null) {
                    str = "other";
                }
                m63577a(str, contentValues2.getAsString("data1"), f2, arrayList5);
                i6++;
                size2 = i7;
                list12 = list14;
                a4 = list6;
            }
            list2 = a4;
        } else {
            list3 = a5;
            list2 = a4;
            arrayList2 = arrayList;
        }
        if (!ancm.m64008a((Collection) list13)) {
            int size3 = list13.size();
            int i8 = 0;
            boolean z2 = false;
            while (i8 < size3) {
                ContentValues contentValues3 = (ContentValues) list13.get(i8);
                List list15 = list13;
                Integer asInteger4 = contentValues3.getAsInteger("data3");
                if (asInteger4 == null) {
                    i = size3;
                    list4 = a2;
                    list5 = a3;
                } else if (arrayList3.isEmpty()) {
                    i = size3;
                    bxvd da5 = bleb.f126167e.mo74144da();
                    list5 = a3;
                    String str6 = (String) f76229c.get(asInteger4);
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bleb bleb = (bleb) da5.f164949b;
                    str6.getClass();
                    list4 = a2;
                    int i9 = bleb.f126169a | 2;
                    bleb.f126169a = i9;
                    bleb.f126171c = str6;
                    f2.getClass();
                    bleb.f126170b = f2;
                    bleb.f126169a = i9 | 1;
                    arrayList3.add((bleb) da5.mo74062i());
                } else {
                    i = size3;
                    list4 = a2;
                    list5 = a3;
                }
                String asString6 = contentValues3.getAsString("data4");
                String asString7 = contentValues3.getAsString("data5");
                String asString8 = contentValues3.getAsString("data10");
                if (!z2) {
                    z = z2;
                    if (!ancm.m64013b(asString6, asString7, asString8)) {
                        m63576a(5, asString6, f2, a11);
                        m63576a(3, asString7, f2, a11);
                        m63576a(4, asString8, f2, a11);
                        z2 = true;
                        asString = contentValues3.getAsString("data7");
                        if (asString == null) {
                            bxvd da6 = blel.f126222d.mo74144da();
                            if (da6.f164950c) {
                                da6.mo74035c();
                                da6.f164950c = false;
                            }
                            blel blel = (blel) da6.f164949b;
                            asString.getClass();
                            int i10 = blel.f126224a | 2;
                            blel.f126224a = i10;
                            blel.f126226c = asString;
                            f2.getClass();
                            blel.f126225b = f2;
                            blel.f126224a = i10 | 1;
                            arrayList4.add((blel) da6.mo74062i());
                        }
                        asString2 = contentValues3.getAsString("data1");
                        if (asString2 != null) {
                            m63577a("billinginformation", asString2, f2, arrayList5);
                        }
                        asString3 = contentValues3.getAsString("data2");
                        if (asString3 != null) {
                            m63577a("directoryserver", asString3, f2, arrayList5);
                        }
                        asString4 = contentValues3.getAsString("data6");
                        if (asString4 != null) {
                            m63577a("mileage", asString4, f2, arrayList5);
                        }
                        asString5 = contentValues3.getAsString("data11");
                        if (asString5 != null) {
                            m63577a("subject", asString5, f2, arrayList5);
                        }
                        asInteger = contentValues3.getAsInteger("data8");
                        if (asInteger != null) {
                            byte b4 = (Byte) f76231e.get(asInteger);
                            if (b4 == null) {
                                b4 = (byte) -1;
                            }
                            String valueOf2 = String.valueOf(b4);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length());
                            sb.append(valueOf2);
                            m63577a("priority", sb.toString(), f2, arrayList5);
                        }
                        asInteger2 = contentValues3.getAsInteger("data9");
                        if (asInteger2 != null) {
                            byte b5 = (Byte) f76233g.get(asInteger2);
                            if (b5 == null) {
                                b5 = (byte) -1;
                            }
                            String valueOf3 = String.valueOf(b5);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length());
                            sb2.append(valueOf3);
                            m63577a("sensitivity", sb2.toString(), f2, arrayList5);
                        }
                        i8++;
                        size3 = i;
                        list13 = list15;
                        a3 = list5;
                        a2 = list4;
                    }
                } else {
                    z = z2;
                }
                z2 = z;
                asString = contentValues3.getAsString("data7");
                if (asString == null) {
                }
                asString2 = contentValues3.getAsString("data1");
                if (asString2 != null) {
                }
                asString3 = contentValues3.getAsString("data2");
                if (asString3 != null) {
                }
                asString4 = contentValues3.getAsString("data6");
                if (asString4 != null) {
                }
                asString5 = contentValues3.getAsString("data11");
                if (asString5 != null) {
                }
                asInteger = contentValues3.getAsInteger("data8");
                if (asInteger != null) {
                }
                asInteger2 = contentValues3.getAsInteger("data9");
                if (asInteger2 != null) {
                }
                i8++;
                size3 = i;
                list13 = list15;
                a3 = list5;
                a2 = list4;
            }
        }
        List list16 = a2;
        List list17 = a3;
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler3 = (bler) bleq.f164949b;
        if (!bler3.f126259i.mo73666a()) {
            bler3.f126259i = GeneratedMessageLite.m124021a(bler3.f126259i);
        }
        bxsy.m123078a(b, bler3.f126259i);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler4 = (bler) bleq.f164949b;
        bler4.mo66476d();
        bxsy.m123078a(list16, bler4.f126265o);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler5 = (bler) bleq.f164949b;
        if (!bler5.f126261k.mo73666a()) {
            bler5.f126261k = GeneratedMessageLite.m124021a(bler5.f126261k);
        }
        bxsy.m123078a(list17, bler5.f126261k);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler6 = (bler) bleq.f164949b;
        if (!bler6.f126274x.mo73666a()) {
            bler6.f126274x = GeneratedMessageLite.m124021a(bler6.f126274x);
        }
        bxsy.m123078a(list2, bler6.f126274x);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler7 = (bler) bleq.f164949b;
        if (!bler7.f126247A.mo73666a()) {
            bler7.f126247A = GeneratedMessageLite.m124021a(bler7.f126247A);
        }
        bxsy.m123078a(arrayList2, bler7.f126247A);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler8 = (bler) bleq.f164949b;
        bler8.mo66474b();
        bxsy.m123078a(list3, bler8.f126257g);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler9 = (bler) bleq.f164949b;
        if (!bler9.f126268r.mo73666a()) {
            bler9.f126268r = GeneratedMessageLite.m124021a(bler9.f126268r);
        }
        bxsy.m123078a(list11, bler9.f126268r);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler10 = (bler) bleq.f164949b;
        if (!bler10.f126276z.mo73666a()) {
            bler10.f126276z = GeneratedMessageLite.m124021a(bler10.f126276z);
        }
        bxsy.m123078a(list, bler10.f126276z);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler11 = (bler) bleq.f164949b;
        if (!bler11.f126270t.mo73666a()) {
            bler11.f126270t = GeneratedMessageLite.m124021a(bler11.f126270t);
        }
        bxsy.m123078a(list8, bler11.f126270t);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler12 = (bler) bleq.f164949b;
        if (!bler12.f126256f.mo73666a()) {
            bler12.f126256f = GeneratedMessageLite.m124021a(bler12.f126256f);
        }
        bxsy.m123078a(arrayList3, bler12.f126256f);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler13 = (bler) bleq.f164949b;
        if (!bler13.f126267q.mo73666a()) {
            bler13.f126267q = GeneratedMessageLite.m124021a(bler13.f126267q);
        }
        bxsy.m123078a(a8, bler13.f126267q);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler14 = (bler) bleq.f164949b;
        if (!bler14.f126272v.mo73666a()) {
            bler14.f126272v = GeneratedMessageLite.m124021a(bler14.f126272v);
        }
        bxsy.m123078a(a9, bler14.f126272v);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler15 = (bler) bleq.f164949b;
        if (!bler15.f126275y.mo73666a()) {
            bler15.f126275y = GeneratedMessageLite.m124021a(bler15.f126275y);
        }
        bxsy.m123078a(a10, bler15.f126275y);
        bleq.mo66472a(iterable2);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler16 = (bler) bleq.f164949b;
        bler16.mo66473a();
        bxsy.m123078a(list10, bler16.f126254d);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler17 = (bler) bleq.f164949b;
        if (!bler17.f126262l.mo73666a()) {
            bler17.f126262l = GeneratedMessageLite.m124021a(bler17.f126262l);
        }
        bxsy.m123078a(a11, bler17.f126262l);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler18 = (bler) bleq.f164949b;
        if (!bler18.f126264n.mo73666a()) {
            bler18.f126264n = GeneratedMessageLite.m124021a(bler18.f126264n);
        }
        bxsy.m123078a(arrayList4, bler18.f126264n);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler19 = (bler) bleq.f164949b;
        if (!bler19.f126263m.mo73666a()) {
            bler19.f126263m = GeneratedMessageLite.m124021a(bler19.f126263m);
        }
        bxsy.m123078a(a12, bler19.f126263m);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler20 = (bler) bleq.f164949b;
        if (!bler20.f126273w.mo73666a()) {
            bler20.f126273w = GeneratedMessageLite.m124021a(bler20.f126273w);
        }
        bxsy.m123078a(arrayList5, bler20.f126273w);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler21 = (bler) bleq.f164949b;
        bler21.mo66475c();
        bxsy.m123078a(a13, bler21.f126258h);
        amig.m62939a();
        List arrayList6 = Boolean.valueOf(cfvk.f185780a.mo6606a().mo82911B()).booleanValue() ? new ArrayList() : a14;
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler22 = (bler) bleq.f164949b;
        if (!bler22.f126255e.mo73666a()) {
            bler22.f126255e = GeneratedMessageLite.m124021a(bler22.f126255e);
        }
        bxsy.m123078a(arrayList6, bler22.f126255e);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler23 = (bler) bleq.f164949b;
        if (!bler23.f126266p.mo73666a()) {
            bler23.f126266p = GeneratedMessageLite.m124021a(bler23.f126266p);
        }
        bxsy.m123078a(a15, bler23.f126266p);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler24 = (bler) bleq.f164949b;
        if (!bler24.f126271u.mo73666a()) {
            bler24.f126271u = GeneratedMessageLite.m124021a(bler24.f126271u);
        }
        bxsy.m123078a(a16, bler24.f126271u);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler25 = (bler) bleq.f164949b;
        if (!bler25.f126269s.mo73666a()) {
            bler25.f126269s = GeneratedMessageLite.m124021a(bler25.f126269s);
        }
        bxsy.m123078a(a17, bler25.f126269s);
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        bler bler26 = (bler) bleq.f164949b;
        if (!bler26.f126260j.mo73666a()) {
            bler26.f126260j = GeneratedMessageLite.m124021a(bler26.f126260j);
        }
        bxsy.m123078a(a18, bler26.f126260j);
        return (bler) bleq.mo74062i();
    }

    /* renamed from: b */
    public static bler m63579b(amvp amvp) {
        bler a = m63574a(amvp);
        if (a == null) {
            return null;
        }
        bxwc bxwc = a.f126249C;
        ArrayList arrayList = new ArrayList(bxwc.size());
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bldl bldl = (bldl) bxwc.get(i);
            if (anan.m63843c(bldl.f126105c)) {
                arrayList.add(bldl);
            }
        }
        if (bxwc.size() == arrayList.size()) {
            return a;
        }
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        bleq bleq = (bleq) bxvd;
        if (bleq.f164950c) {
            bleq.mo74035c();
            bleq.f164950c = false;
        }
        ((bler) bleq.f164949b).f126249C = GeneratedMessageLite.m124030de();
        bleq.mo66472a(arrayList);
        return (bler) bleq.mo74062i();
    }

    /* renamed from: b */
    private static List m63580b(List list, String str) {
        return f76227a.mo40676c(ancm.m64003a(list), str);
    }

    /* renamed from: a */
    private static List m63575a(List list, String str) {
        return f76227a.mo40676c(list, str);
    }

    /* renamed from: a */
    private static void m63576a(int i, String str, bleu bleu, List list) {
        if (!TextUtils.isEmpty(str)) {
            bxvd da = blek.f126216e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blek blek = (blek) da.f164949b;
            blek.f126221d = i - 1;
            int i2 = blek.f126218a | 4;
            blek.f126218a = i2;
            str.getClass();
            int i3 = i2 | 2;
            blek.f126218a = i3;
            blek.f126220c = str;
            bleu.getClass();
            blek.f126219b = bleu;
            blek.f126218a = i3 | 1;
            list.add((blek) da.mo74062i());
        }
    }

    /* renamed from: a */
    private static void m63577a(String str, String str2, bleu bleu, List list) {
        bxvd da = blep.f126239e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blep blep = (blep) da.f164949b;
        str.getClass();
        int i = blep.f126241a | 4;
        blep.f126241a = i;
        blep.f126244d = str;
        str2.getClass();
        int i2 = i | 2;
        blep.f126241a = i2;
        blep.f126243c = str2;
        bleu.getClass();
        blep.f126242b = bleu;
        blep.f126241a = i2 | 1;
        list.add((blep) da.mo74062i());
    }

    /* renamed from: a */
    public static bzks[] m63578a(List list) {
        bzkp bzkp;
        int size = list.size();
        bzks[] bzksArr = new bzks[size];
        for (int i = 0; i < size; i++) {
            amvr amvr = (amvr) list.get(i);
            if (amvr != null) {
                bxvd da = bzkp.f170452g.mo74144da();
                if (!TextUtils.isEmpty(amvr.mo41404j())) {
                    bxvd da2 = bzkq.f170460c.mo74144da();
                    String j = amvr.mo41404j();
                    if (j != null) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bzkq bzkq = (bzkq) da2.f164949b;
                        j.getClass();
                        bzkq.f170462a |= 1;
                        bzkq.f170463b = j;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzkp bzkp2 = (bzkp) da.f164949b;
                    bzkq bzkq2 = (bzkq) da2.mo74062i();
                    bzkq2.getClass();
                    bzkp2.f170455b = bzkq2;
                    bzkp2.f170454a |= 1;
                }
                if (!TextUtils.isEmpty(amvr.mo41406l())) {
                    bxvd da3 = bzkr.f170464d.mo74144da();
                    String l = amvr.mo41406l();
                    if (l != null) {
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bzkr bzkr = (bzkr) da3.f164949b;
                        l.getClass();
                        bzkr.f170466a |= 1;
                        bzkr.f170467b = l;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzkp bzkp3 = (bzkp) da.f164949b;
                    bzkr bzkr2 = (bzkr) da3.mo74062i();
                    bzkr2.getClass();
                    bzkp3.f170456c = bzkr2;
                    bzkp3.f170454a |= 2;
                }
                bxvd da4 = bzky.f170485c.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bzky bzky = (bzky) da4.f164949b;
                bzky.f170488b = 0;
                bzky.f170487a |= 1;
                if (amvr.mo41405k() != null) {
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bzky bzky2 = (bzky) da4.f164949b;
                    bzky2.f170488b = 2;
                    bzky2.f170487a |= 1;
                } else if (!TextUtils.isEmpty(amvr.mo41406l())) {
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bzky bzky3 = (bzky) da4.f164949b;
                    bzky3.f170488b = 1;
                    bzky3.f170487a |= 1;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzkp bzkp4 = (bzkp) da.f164949b;
                bzky bzky4 = (bzky) da4.mo74062i();
                bzky4.getClass();
                bzkp4.f170459f = bzky4;
                bzkp4.f170454a |= 8;
                bzkp = (bzkp) da.mo74062i();
            } else {
                bzkp = null;
            }
            bxvd da5 = bzks.f170469e.mo74144da();
            if (bzkp != null) {
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bzks bzks = (bzks) da5.f164949b;
                bzkp.getClass();
                bzks.f170473c = bzkp;
                bzks.f170471a = 2 | bzks.f170471a;
                if ((bzkp.f170454a & 1) != 0) {
                    bzkq bzkq3 = bzkp.f170455b;
                    if (bzkq3 == null) {
                        bzkq3 = bzkq.f170460c;
                    }
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bzks bzks2 = (bzks) da5.f164949b;
                    bzkq3.getClass();
                    bzks2.f170472b = bzkq3;
                    bzks2.f170471a |= 1;
                }
                String m = amvr.mo41407m();
                if (m != null) {
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bzks bzks3 = (bzks) da5.f164949b;
                    m.getClass();
                    bzks3.f170471a |= 4;
                    bzks3.f170474d = m;
                }
                bzksArr[i] = (bzks) da5.mo74062i();
            }
        }
        return bzksArr;
    }
}
