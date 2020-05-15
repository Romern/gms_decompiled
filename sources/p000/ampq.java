package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: ampq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ampq {
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04a9, code lost:
        if (r4 != false) goto L_0x051c;
     */
    /* renamed from: a */
    static Cursor m63149a(String[] strArr, btdn btdn, String str, String str2, long j, boolean z, boolean z2, boolean z3, bxvd bxvd) {
        int i;
        String str3;
        String str4;
        int i2;
        int i3;
        char c;
        bxvd bxvd2;
        bler bler;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str5;
        int i11;
        String str6;
        int i12;
        int i13;
        int i14;
        int i15;
        bxvd bxvd3;
        String str7;
        int i16;
        String str8;
        boolean z4;
        int i17;
        Iterator it;
        int i18;
        HashSet hashSet;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        String[] strArr2 = strArr;
        btdn btdn2 = btdn;
        String str9 = str;
        String str10 = str2;
        int i25 = -1;
        int i26 = 0;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        int i30 = -1;
        int i31 = -1;
        int i32 = -1;
        int i33 = -1;
        int i34 = -1;
        int i35 = -1;
        int i36 = -1;
        int i37 = -1;
        int i38 = -1;
        int i39 = -1;
        int i40 = -1;
        int i41 = -1;
        while (true) {
            i = i32;
            str3 = "data4";
            str4 = "data3";
            i2 = i34;
            i3 = i33;
            if (i26 >= strArr2.length) {
                break;
            }
            String str11 = strArr2[i26];
            int i42 = i31;
            if ("display_name".equals(str11)) {
                i25 = i26;
            } else {
                if ("display_name_alt".equals(str11)) {
                    i27 = i26;
                    i32 = i;
                    i34 = i2;
                    i33 = i3;
                    i31 = i42;
                } else if ("display_name_source".equals(str11)) {
                    i28 = i26;
                    i32 = i;
                    i34 = i2;
                    i33 = i3;
                    i31 = i42;
                } else if ("has_phone_number".equals(str11)) {
                    i29 = i26;
                    i32 = i;
                    i34 = i2;
                    i33 = i3;
                    i31 = i42;
                } else if ("photo_uri".equals(str11)) {
                    i30 = i26;
                    i32 = i;
                    i34 = i2;
                    i33 = i3;
                    i31 = i42;
                } else if ("photo_thumb_uri".equals(str11)) {
                    i31 = i26;
                    i32 = i;
                    i34 = i2;
                    i33 = i3;
                } else if ("_id".equals(str11)) {
                    i32 = i26;
                    i34 = i2;
                    i33 = i3;
                    i31 = i42;
                } else if ("contact_id".equals(str11)) {
                    i33 = i26;
                    i32 = i;
                    i34 = i2;
                    i31 = i42;
                } else if ("lookup".equals(str11)) {
                    i34 = i26;
                    i32 = i;
                    i33 = i3;
                    i31 = i42;
                } else if (!z2) {
                    if ("data1".equals(str11)) {
                        i39 = i26;
                        i32 = i;
                        i34 = i2;
                        i33 = i3;
                        i31 = i42;
                    } else if ("data2".equals(str11)) {
                        i40 = i26;
                        i32 = i;
                        i34 = i2;
                        i33 = i3;
                        i31 = i42;
                    } else if (str4.equals(str11)) {
                        i41 = i26;
                        i32 = i;
                        i34 = i2;
                        i33 = i3;
                        i31 = i42;
                    }
                } else if ("data1".equals(str11)) {
                    i35 = i26;
                    i32 = i;
                    i34 = i2;
                    i33 = i3;
                    i31 = i42;
                } else if ("data2".equals(str11)) {
                    i36 = i26;
                    i32 = i;
                    i34 = i2;
                    i33 = i3;
                    i31 = i42;
                } else if (str4.equals(str11)) {
                    i37 = i26;
                    i32 = i;
                    i34 = i2;
                    i33 = i3;
                    i31 = i42;
                } else if (str3.equals(str11)) {
                    i38 = i26;
                    i32 = i;
                    i34 = i2;
                    i33 = i3;
                    i31 = i42;
                }
                i26++;
            }
            i32 = i;
            i34 = i2;
            i33 = i3;
            i31 = i42;
            i26++;
        }
        int i43 = i31;
        if ("sort_key".equals(str10)) {
            c = 1;
        } else if (!"sort_key_alt".equals(str10)) {
            String valueOf = String.valueOf(str2);
            Log.w("PeopleGalProvider", valueOf.length() == 0 ? new String("Ignoring unsupported sort order: ") : "Ignoring unsupported sort order: ".concat(valueOf));
            c = 3;
        } else {
            c = 2;
        }
        TreeMap treeMap = new TreeMap(ampp.f75689a);
        int i44 = 0;
        int i45 = 1;
        while (true) {
            if (i44 >= btdn2.f148414a.size()) {
                bxvd2 = bxvd;
                break;
            }
            btbu btbu = (btbu) btdn2.f148414a.get(i44);
            String str12 = str4;
            if (btbu.f148217a == 4) {
                bler = (bler) btbu.f148218b;
            } else {
                bler = bler.f126245D;
            }
            Pair a = ampt.m63151a(bler);
            if (a != null) {
                i4 = i44;
                if (a.first == null) {
                    bxvd3 = bxvd;
                    c2 = c;
                    i6 = i30;
                    str7 = str3;
                    i13 = i40;
                    i15 = i;
                    i9 = i27;
                    i7 = i29;
                    i16 = i37;
                    i12 = i41;
                    i8 = i28;
                    str6 = str12;
                    i5 = i43;
                    i10 = i25;
                    i14 = i39;
                } else {
                    String a2 = ampt.m63152a(bler, (String) a.first);
                    String str13 = str3;
                    String str14 = (String) a.first;
                    if (c == 1) {
                        str8 = str14;
                    } else {
                        str8 = c != 2 ? "" : a2;
                    }
                    c2 = c;
                    Object[] objArr = new Object[strArr2.length];
                    if (i25 != -1) {
                        objArr[i25] = a.first;
                    }
                    if (i28 != -1) {
                        objArr[i28] = a.second;
                    }
                    if (i27 != -1) {
                        objArr[i27] = a2;
                    }
                    if (i29 != -1) {
                        objArr[i29] = Boolean.valueOf(!bler.f126258h.isEmpty());
                    }
                    if (i30 != -1 && PeopleGalChimeraProvider.m68189a(bler)) {
                        objArr[i30] = PeopleGalChimeraProvider.m68188a(str9, false, bler.f126252b);
                    }
                    int i46 = i43;
                    if (i46 != -1 && PeopleGalChimeraProvider.m68189a(bler)) {
                        objArr[i46] = PeopleGalChimeraProvider.m68188a(str9, true, bler.f126252b);
                    }
                    int i47 = i3;
                    if (i47 != -1) {
                        objArr[i47] = Integer.valueOf(i45);
                    }
                    i3 = i47;
                    int i48 = i2;
                    if (i48 != -1) {
                        objArr[i48] = bler.f126252b;
                    }
                    if (z) {
                        HashSet hashSet2 = new HashSet();
                        i2 = i48;
                        if (!bler.f126257g.isEmpty()) {
                            List b = alse.m61631b(bler.f126257g, bler.f126252b);
                            if (b == null) {
                                bxvd bxvd4 = bxvd;
                                String str15 = str12;
                                if (bxvd4.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd4.f164950c = false;
                                }
                                amlc amlc = (amlc) bxvd4.f164949b;
                                amlc amlc2 = amlc.f75159h;
                                amlc.f75164d = 3;
                                amlc.f75161a |= 4;
                                Log.e("AutocompleteCursorUtil", "Error converting emails.");
                                i6 = i30;
                                i5 = i46;
                                i13 = i40;
                                str5 = str13;
                                i9 = i27;
                                i12 = i41;
                                i8 = i28;
                                str6 = str15;
                                i15 = i;
                                i7 = i29;
                                i11 = i37;
                                i10 = i25;
                                i14 = i39;
                            } else {
                                String str16 = str12;
                                int size = b.size();
                                int i49 = 0;
                                boolean z5 = false;
                                while (i49 < size) {
                                    List list = b;
                                    ContentValues contentValues = (ContentValues) b.get(i49);
                                    if (z3) {
                                        i18 = size;
                                        if (!hashSet2.add(bmwb.m108442a(contentValues.getAsString("data1")))) {
                                            hashSet = hashSet2;
                                            i23 = i40;
                                            i24 = i;
                                            i20 = i27;
                                            i22 = i41;
                                            i19 = i39;
                                            i21 = i25;
                                            i49++;
                                            i = i24;
                                            i25 = i21;
                                            i39 = i19;
                                            size = i18;
                                            b = list;
                                            i41 = i22;
                                            i27 = i20;
                                            i40 = i23;
                                            hashSet2 = hashSet;
                                        }
                                    } else {
                                        i18 = size;
                                    }
                                    int i50 = i39;
                                    i21 = i25;
                                    if (i50 != -1) {
                                        objArr[i50] = contentValues.get("data1");
                                    }
                                    hashSet = hashSet2;
                                    i23 = i40;
                                    if (i23 != -1) {
                                        objArr[i23] = contentValues.get("data2");
                                    }
                                    i20 = i27;
                                    i22 = i41;
                                    if (i22 != -1) {
                                        objArr[i22] = contentValues.get(str16);
                                    }
                                    i24 = i;
                                    if (i24 != -1) {
                                        objArr[i24] = Integer.valueOf(treeMap.size() + 1);
                                    }
                                    i19 = i50;
                                    treeMap.put(new Pair(str8, Integer.valueOf(i45)), (Object[]) objArr.clone());
                                    z5 = true;
                                    i49++;
                                    i = i24;
                                    i25 = i21;
                                    i39 = i19;
                                    size = i18;
                                    b = list;
                                    i41 = i22;
                                    i27 = i20;
                                    i40 = i23;
                                    hashSet2 = hashSet;
                                }
                                i13 = i40;
                                i15 = i;
                                i9 = i27;
                                i12 = i41;
                                i10 = i25;
                                bxvd2 = bxvd;
                                i7 = i29;
                                i5 = i46;
                                i17 = i35;
                                i11 = i37;
                                i14 = i39;
                                i8 = i28;
                                str6 = str16;
                                z4 = z5;
                                i6 = i30;
                                str5 = str13;
                            }
                        } else {
                            i13 = i40;
                            i15 = i;
                            i9 = i27;
                            i12 = i41;
                            i10 = i25;
                            i7 = i29;
                            i6 = i30;
                            i5 = i46;
                            i11 = i37;
                            i14 = i39;
                            str5 = str13;
                            i8 = i28;
                            str6 = str12;
                        }
                        str9 = str;
                        i44 = i4 + 1;
                        str4 = str6;
                        i37 = i11;
                        str3 = str5;
                        i28 = i8;
                        i29 = i7;
                        i30 = i6;
                        i43 = i5;
                        c = c2;
                        btdn2 = btdn;
                        i = i15;
                        i41 = i12;
                        i27 = i9;
                        strArr2 = strArr;
                        i40 = i13;
                        i39 = i14;
                        i25 = i10;
                    } else {
                        bxvd2 = bxvd;
                        i2 = i48;
                        i13 = i40;
                        i15 = i;
                        i9 = i27;
                        i12 = i41;
                        i8 = i28;
                        str6 = str12;
                        i10 = i25;
                        i14 = i39;
                        if (z2) {
                            i7 = i29;
                            HashSet hashSet3 = new HashSet();
                            i6 = i30;
                            if (!bler.f126258h.isEmpty()) {
                                i5 = i46;
                                List a3 = alse.f74192a.mo40675a(bler.f126258h, bler.f126252b);
                                if (a3 == null) {
                                    if (bxvd2.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    amlc amlc3 = (amlc) bxvd2.f164949b;
                                    amlc amlc4 = amlc.f75159h;
                                    amlc3.f75164d = 2;
                                    amlc3.f75161a |= 4;
                                    Log.e("AutocompleteCursorUtil", "Error converting phone numbers");
                                    i11 = i37;
                                    str5 = str13;
                                } else {
                                    Iterator it2 = a3.iterator();
                                    z4 = false;
                                    while (it2.hasNext()) {
                                        ContentValues contentValues2 = (ContentValues) it2.next();
                                        String str17 = str13;
                                        String asString = contentValues2.getAsString(str17);
                                        if (z3) {
                                            it = it2;
                                            if (!hashSet3.add(beao.m91678b((CharSequence) (asString == null ? contentValues2.getAsString("data1") : asString)))) {
                                                it2 = it;
                                                str13 = str17;
                                            }
                                        } else {
                                            it = it2;
                                        }
                                        int i51 = i35;
                                        if (i51 != -1) {
                                            objArr[i51] = contentValues2.get("data1");
                                        }
                                        HashSet hashSet4 = hashSet3;
                                        int i52 = i38;
                                        if (i52 != -1) {
                                            objArr[i52] = asString;
                                        }
                                        i38 = i52;
                                        int i53 = i36;
                                        if (i53 != -1) {
                                            objArr[i53] = contentValues2.get("data2");
                                        }
                                        i36 = i53;
                                        int i54 = i37;
                                        if (i54 != -1) {
                                            objArr[i54] = contentValues2.get(str6);
                                        }
                                        if (i15 != -1) {
                                            objArr[i15] = Integer.valueOf(treeMap.size() + 1);
                                        }
                                        treeMap.put(new Pair(str8, Integer.valueOf(i45)), (Object[]) objArr.clone());
                                        i37 = i54;
                                        str13 = str17;
                                        hashSet3 = hashSet4;
                                        z4 = true;
                                        i35 = i51;
                                        it2 = it;
                                    }
                                    i17 = i35;
                                    i11 = i37;
                                    str5 = str13;
                                }
                            } else {
                                i5 = i46;
                                i11 = i37;
                                str5 = str13;
                            }
                        } else {
                            i7 = i29;
                            i6 = i30;
                            i5 = i46;
                            i11 = i37;
                            str5 = str13;
                            if (i15 != -1) {
                                objArr[i15] = Integer.valueOf(i45);
                            }
                            if (!bler.f126257g.isEmpty()) {
                                List b2 = alse.m61631b(bler.f126257g, bler.f126252b);
                                if (b2 != null) {
                                    if (!b2.isEmpty()) {
                                        ContentValues contentValues3 = (ContentValues) b2.get(0);
                                        if (i14 != -1) {
                                            objArr[i14] = contentValues3.get("data1");
                                        }
                                        if (i13 != -1) {
                                            objArr[i13] = contentValues3.get("data2");
                                        }
                                        if (i12 != -1) {
                                            objArr[i12] = contentValues3.get(str6);
                                        }
                                    }
                                }
                            }
                            treeMap.put(new Pair(str8, Integer.valueOf(i45)), objArr);
                            int i55 = i45 + 1;
                            if (((long) i55) > j) {
                                break;
                            }
                            i45 = i55;
                        }
                        str9 = str;
                        i44 = i4 + 1;
                        str4 = str6;
                        i37 = i11;
                        str3 = str5;
                        i28 = i8;
                        i29 = i7;
                        i30 = i6;
                        i43 = i5;
                        c = c2;
                        btdn2 = btdn;
                        i = i15;
                        i41 = i12;
                        i27 = i9;
                        strArr2 = strArr;
                        i40 = i13;
                        i39 = i14;
                        i25 = i10;
                    }
                    i35 = i17;
                }
            } else {
                bxvd3 = bxvd;
                c2 = c;
                i6 = i30;
                i4 = i44;
                str7 = str3;
                i13 = i40;
                i15 = i;
                i9 = i27;
                i7 = i29;
                i16 = i37;
                i12 = i41;
                i8 = i28;
                str6 = str12;
                i5 = i43;
                i10 = i25;
                i14 = i39;
            }
            if (bxvd3.f164950c) {
                bxvd.mo74035c();
                bxvd3.f164950c = false;
            }
            amlc amlc5 = (amlc) bxvd3.f164949b;
            amlc amlc6 = amlc.f75159h;
            amlc5.f75164d = 1;
            amlc5.f75161a |= 4;
            Log.e("AutocompleteCursorUtil", "Can't find appropriate name for the contact.");
            str9 = str;
            i44 = i4 + 1;
            str4 = str6;
            i37 = i11;
            str3 = str5;
            i28 = i8;
            i29 = i7;
            i30 = i6;
            i43 = i5;
            c = c2;
            btdn2 = btdn;
            i = i15;
            i41 = i12;
            i27 = i9;
            strArr2 = strArr;
            i40 = i13;
            i39 = i14;
            i25 = i10;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr, treeMap.size());
        for (Object[] objArr2 : treeMap.values()) {
            matrixCursor.addRow(objArr2);
        }
        int count = matrixCursor.getCount();
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        amlc amlc7 = (amlc) bxvd2.f164949b;
        amlc amlc8 = amlc.f75159h;
        amlc7.f75161a |= 32;
        amlc7.f75167g = count;
        return matrixCursor;
    }
}
