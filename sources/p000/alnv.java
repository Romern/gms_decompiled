package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: alnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alnv extends alnb {

    /* renamed from: b */
    private final String f73864b;

    /* renamed from: c */
    private final String f73865c;

    /* renamed from: d */
    private final boolean f73866d;

    /* renamed from: e */
    private final String f73867e;

    /* renamed from: f */
    private final String[] f73868f;

    /* renamed from: g */
    private final int f73869g;

    /* renamed from: s */
    private final int f73870s;

    /* renamed from: t */
    private final int f73871t;

    /* renamed from: u */
    private final String f73872u;

    /* renamed from: v */
    private final boolean f73873v;

    /* renamed from: w */
    private final bmza f73874w = bmza.m108659b(bmvy.f131119a);

    /* renamed from: x */
    private final SparseIntArray f73875x = new SparseIntArray();

    /* renamed from: a */
    public static boolean m61406a(String str) {
        amig.m62939a();
        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83419cq()).booleanValue()) {
            if ("com.google.android.apps.tachyon".equals(str)) {
                return true;
            }
            if (!Boolean.valueOf(cgbe.f186279a.mo6606a().mo83261R()).booleanValue() || !"com.google.android.gms.test".equals(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:109:0x04e7 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:114:0x04f2 */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v0, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v11, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v12, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v13, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: rtu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v16, resolved type: long} */
    /* JADX WARN: Type inference failed for: r21v0, types: [amus], assign insn: PHI: (r21v0 ?) = (r21v14 ?), (r21v15 ?) binds: [B:72:0x043b, B:71:0x0426] */
    /* JADX WARN: Type inference failed for: r21v7, assign insn: PHI: (r21v7 ?) = (r21v0 ?), (r21v9 ?) binds: [B:109:0x04e7, B:114:0x04f2] */
    /* JADX WARN: Type inference failed for: r21v9, assign insn: 0x04ea: MOVE  (r21v9 ? I:?[long, double]) = (r14v1 long) */
    /* JADX WARN: Type inference failed for: r21v10, assign insn: 0x04e4: MOVE  (r21v10 ? I:?[long, double]) = (r14v1 long) */
    /* JADX WARN: Type inference failed for: r21v14, assign insn: 0x043b: MOVE  (r21v14 ? I:?[OBJECT, ARRAY]) = (r2v0 amus) */
    /* JADX WARN: Type inference failed for: r21v15, assign insn: 0x0070: MOVE  (r21v15 ? I:?[OBJECT, ARRAY]) = (r2v0 amus) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0769, code lost:
        r2 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        r26.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0786, code lost:
        r0 = e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x079b  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x07c5  */
    /* renamed from: d */
    public final DataHolder mo40606d(Context context) {
        String str;
        String str2;
        long j;
        String str3;
        rtu rtu;
        String str4;
        String str5;
        Integer num;
        String str6;
        C1225nr nrVar;
        Cursor cursor;
        Cursor cursor2;
        alnv alnv;
        String str7;
        Integer num2;
        rtu rtu2;
        int i;
        String str8;
        String str9;
        rtu rtu3;
        Cursor cursor3;
        rtu rtu4;
        Cursor cursor4;
        String str10;
        String str11;
        rtu rtu5;
        long j2;
        Cursor cursor5;
        Integer num3;
        String str12;
        boolean z;
        alnv alnv2 = this;
        Context context2 = context;
        amus amus = new amus(context2, alnv2.f73872u, alnv2.f73871t);
        Bundle bundle = new Bundle();
        bundle.putString("account", alnv2.f73864b);
        bundle.putString("pagegaiaid", alnv2.f73865c);
        bundle.putString("query", alnv2.f73867e);
        int i2 = 2;
        if (alnv2.f73869g != 2) {
            alog.m61420a(context2, alnv2.f73864b, alnv2.f73865c, bundle);
        }
        rtu a = DataHolder.m22537a(alzi.f74545a);
        if (alnv2.f73868f.length == 0) {
            return a.mo25164a(0, bundle);
        }
        if (!alnv2.f73866d) {
            C1225nr nrVar2 = new C1225nr();
            String str13 = "value";
            String str14 = "item_type";
            String str15 = "person_key";
            String str16 = "data_source";
            Bundle bundle2 = bundle;
            String str17 = "avatar_location";
            String str18 = "avatar_source";
            String str19 = "BasePeopleOperation";
            if (alnv2.f73869g != 2) {
                j = amus;
                long a2 = alnv2.f73874w.mo66928a(TimeUnit.MICROSECONDS);
                String b = altn.m61774a(context).mo40739b(alnv2.f73864b, alnv2.f73865c);
                amig.m62939a();
                if (((Boolean) amgy.f74901a.mo41191a()).booleanValue()) {
                    alnv2.f73822a.f73707u = !TextUtils.isEmpty(b) ? 2 : 3;
                }
                ArrayList arrayList = new ArrayList();
                str2 = "custom_label";
                String str20 = "value_type";
                String a3 = alny.m61410a(b, alnv2.f73869g, alnv2.f73868f, arrayList, alnv2.f73870s);
                alto b2 = altq.m61806a(context).mo40763b();
                if (b2 != null) {
                    Cursor a4 = b2.mo40744a(a3, (String[]) arrayList.toArray(ancm.f76631b));
                    a4.getCount();
                    try {
                        ContentValues contentValues = new ContentValues();
                        while (a4.moveToNext() && a.mo25162a() < alnv2.f73870s) {
                            String string = a4.getString(0);
                            int i3 = a4.getInt(1);
                            int i4 = a4.getInt(2);
                            rtu rtu6 = a;
                            String string2 = a4.getString(3);
                            String str21 = str13;
                            String string3 = a4.getString(4);
                            int i5 = a4.getInt(5);
                            String string4 = a4.getString(6);
                            String str22 = str14;
                            String string5 = a4.getString(7);
                            Integer num4 = i2;
                            double d = a4.getDouble(8);
                            double d2 = a4.getDouble(9);
                            double d3 = a4.getDouble(10);
                            double d4 = a4.getDouble(11);
                            double d5 = a4.getDouble(12);
                            String string6 = a4.getString(13);
                            String string7 = a4.getString(14);
                            String string8 = a4.getString(15);
                            String string9 = a4.getString(16);
                            String string10 = a4.getString(17);
                            int i6 = a4.getInt(18);
                            String string11 = a4.getString(19);
                            String str23 = str17;
                            String string12 = a4.getString(20);
                            String string13 = a4.getString(21);
                            String string14 = a4.getString(22);
                            double d6 = a4.getDouble(23);
                            double d7 = a4.getDouble(24);
                            double d8 = a4.getDouble(25);
                            double d9 = a4.getDouble(26);
                            double d10 = a4.getDouble(27);
                            String string15 = a4.getString(28);
                            String string16 = a4.getString(29);
                            String string17 = a4.getString(30);
                            String string18 = a4.getString(31);
                            String string19 = a4.getString(32);
                            long j3 = a4.getLong(33);
                            String string20 = a4.getString(34);
                            if (!nrVar2.contains(string11)) {
                                cursor5 = a4;
                                if (i3 == 1) {
                                    try {
                                        contentValues.put("owner_account", alnv2.f73864b);
                                        contentValues.put("owner_page_id", alnv2.f73865c);
                                        contentValues.put(str16, (Integer) 0);
                                        SparseIntArray sparseIntArray = alnv2.f73875x;
                                        String str24 = str16;
                                        C1225nr nrVar3 = nrVar2;
                                        sparseIntArray.put(1, sparseIntArray.get(1, 0) + 1);
                                        contentValues.put(str15, string);
                                        contentValues.put("people_v2_id", string);
                                        contentValues.put("container_type", (Integer) 1);
                                        contentValues.put("gaia_id", string2);
                                        contentValues.put("contact_id", string3);
                                        contentValues.put("profile_type", Integer.valueOf(i4));
                                        contentValues.put("display_name", string4);
                                        if (i5 != 0) {
                                            str12 = str23;
                                        } else if (TextUtils.isEmpty(string5)) {
                                            contentValues.put(str18, (Integer) 0);
                                            str12 = str23;
                                            contentValues.putNull(str12);
                                            num3 = num4;
                                            String str25 = str22;
                                            contentValues.put(str25, Integer.valueOf(i6));
                                            String str26 = str21;
                                            contentValues.put(str26, string11);
                                            contentValues.put("value2", string12);
                                            String str27 = str20;
                                            contentValues.put(str27, string13);
                                            contentValues.put(str2, string14);
                                            Double valueOf = Double.valueOf(d6);
                                            contentValues.put("primary_affinity_sorted", valueOf);
                                            contentValues.put("primary_logging_id_sorted", string15);
                                            Double valueOf2 = Double.valueOf(d);
                                            str2 = str2;
                                            contentValues.put("person_affinity_sorted", valueOf2);
                                            contentValues.put("person_affinity1", valueOf2);
                                            contentValues.put("person_affinity2", Double.valueOf(d2));
                                            contentValues.put("person_affinity3", Double.valueOf(d3));
                                            contentValues.put("person_affinity4", Double.valueOf(d4));
                                            contentValues.put("person_affinity5", Double.valueOf(d5));
                                            contentValues.put("person_logging_id_sorted", string6);
                                            contentValues.put("person_logging_id1", string6);
                                            contentValues.put("person_logging_id2", string7);
                                            contentValues.put("person_logging_id3", string8);
                                            contentValues.put("person_logging_id4", string9);
                                            contentValues.put("person_logging_id5", string10);
                                            contentValues.put("item_affinity_sorted", valueOf);
                                            contentValues.put("item_affinity1", valueOf);
                                            contentValues.put("item_affinity2", Double.valueOf(d7));
                                            contentValues.put("item_affinity3", Double.valueOf(d8));
                                            contentValues.put("item_affinity4", Double.valueOf(d9));
                                            contentValues.put("item_affinity5", Double.valueOf(d10));
                                            contentValues.put("item_logging_id_sorted", string15);
                                            contentValues.put("item_logging_id1", string15);
                                            contentValues.put("item_logging_id2", string16);
                                            contentValues.put("item_logging_id3", string17);
                                            contentValues.put("item_logging_id4", string18);
                                            contentValues.put("item_logging_id5", string19);
                                            contentValues.put("item_certificate_expiration_millis", Long.valueOf(j3));
                                            contentValues.put("item_certificate_status", string20);
                                            rtu rtu7 = rtu6;
                                            rtu7.mo25160a(contentValues);
                                            C1225nr nrVar4 = nrVar3;
                                            nrVar4.add(string11);
                                            i2 = num3;
                                            str13 = str26;
                                            str14 = str25;
                                            a = rtu7;
                                            str20 = str27;
                                            str16 = str24;
                                            nrVar2 = nrVar4;
                                            str17 = str12;
                                            a4 = cursor5;
                                        } else {
                                            str12 = str23;
                                        }
                                        amig.m62939a();
                                        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83376c()).booleanValue()) {
                                            contentValues.put(str18, (Integer) 4);
                                            String str28 = alnv2.f73864b;
                                            sdo.m34977c(str28);
                                            if (!TextUtils.isEmpty(string3) || !TextUtils.isEmpty(string11)) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            sdo.m34970a(z);
                                            StringBuilder sb = new StringBuilder(str28);
                                            sb.append(9);
                                            if (string3 != null) {
                                                sb.append(string3);
                                            }
                                            sb.append(9);
                                            if (string11 != null) {
                                                sb.append(string11);
                                            }
                                            sb.append(9);
                                            if (!TextUtils.isEmpty(string5)) {
                                                sb.append(string5);
                                            }
                                            contentValues.put(str12, sb.toString());
                                            num3 = num4;
                                        } else if (i5 != 0) {
                                            num3 = num4;
                                            contentValues.put(str18, num3);
                                            String str29 = alnv2.f73864b;
                                            sdo.m34977c(str29);
                                            sdo.m34977c(string3);
                                            contentValues.put(str12, str29 + 9 + string3 + 9 + string11);
                                        } else {
                                            num3 = num4;
                                            contentValues.put(str18, (Integer) 0);
                                            contentValues.putNull(str12);
                                        }
                                        String str252 = str22;
                                        contentValues.put(str252, Integer.valueOf(i6));
                                        String str262 = str21;
                                        contentValues.put(str262, string11);
                                        contentValues.put("value2", string12);
                                        String str272 = str20;
                                        contentValues.put(str272, string13);
                                        contentValues.put(str2, string14);
                                        Double valueOf3 = Double.valueOf(d6);
                                        contentValues.put("primary_affinity_sorted", valueOf3);
                                        contentValues.put("primary_logging_id_sorted", string15);
                                        Double valueOf22 = Double.valueOf(d);
                                        str2 = str2;
                                        contentValues.put("person_affinity_sorted", valueOf22);
                                        contentValues.put("person_affinity1", valueOf22);
                                        contentValues.put("person_affinity2", Double.valueOf(d2));
                                        contentValues.put("person_affinity3", Double.valueOf(d3));
                                        contentValues.put("person_affinity4", Double.valueOf(d4));
                                        contentValues.put("person_affinity5", Double.valueOf(d5));
                                        contentValues.put("person_logging_id_sorted", string6);
                                        contentValues.put("person_logging_id1", string6);
                                        contentValues.put("person_logging_id2", string7);
                                        contentValues.put("person_logging_id3", string8);
                                        contentValues.put("person_logging_id4", string9);
                                        contentValues.put("person_logging_id5", string10);
                                        contentValues.put("item_affinity_sorted", valueOf3);
                                        contentValues.put("item_affinity1", valueOf3);
                                        contentValues.put("item_affinity2", Double.valueOf(d7));
                                        contentValues.put("item_affinity3", Double.valueOf(d8));
                                        contentValues.put("item_affinity4", Double.valueOf(d9));
                                        contentValues.put("item_affinity5", Double.valueOf(d10));
                                        contentValues.put("item_logging_id_sorted", string15);
                                        contentValues.put("item_logging_id1", string15);
                                        contentValues.put("item_logging_id2", string16);
                                        contentValues.put("item_logging_id3", string17);
                                        contentValues.put("item_logging_id4", string18);
                                        contentValues.put("item_logging_id5", string19);
                                        contentValues.put("item_certificate_expiration_millis", Long.valueOf(j3));
                                        contentValues.put("item_certificate_status", string20);
                                        rtu rtu72 = rtu6;
                                        rtu72.mo25160a(contentValues);
                                        C1225nr nrVar42 = nrVar3;
                                        nrVar42.add(string11);
                                        i2 = num3;
                                        str13 = str262;
                                        str14 = str252;
                                        a = rtu72;
                                        str20 = str272;
                                        str16 = str24;
                                        nrVar2 = nrVar42;
                                        str17 = str12;
                                        a4 = cursor5;
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor5.close();
                                        throw th;
                                    }
                                }
                            } else {
                                cursor5 = a4;
                            }
                            i2 = num4;
                            str13 = str21;
                            str14 = str22;
                            a = rtu6;
                            str16 = str16;
                            nrVar2 = nrVar2;
                            str17 = str23;
                            a4 = cursor5;
                        }
                        rtu = a;
                        str = str16;
                        num = i2;
                        str5 = str13;
                        str3 = str20;
                        str6 = str17;
                        nrVar = nrVar2;
                        str4 = str14;
                        a4.close();
                    } catch (Throwable th2) {
                        th = th2;
                        cursor5 = a4;
                        cursor5.close();
                        throw th;
                    }
                } else {
                    str6 = str17;
                    rtu = a;
                    str = str16;
                    num = 2;
                    nrVar = nrVar2;
                    str5 = str13;
                    str4 = str14;
                    str3 = str20;
                }
                alnv2.f73822a.mo40509a(almk.m61269b(3, alnv2.f73874w.mo66928a(TimeUnit.MICROSECONDS) - a2));
            } else {
                j = amus;
                rtu = a;
                str = str16;
                num = 2;
                str2 = "custom_label";
                str3 = "value_type";
                str5 = str13;
                str6 = str17;
                nrVar = nrVar2;
                str4 = str14;
            }
            if (!alnv2.f73873v) {
                str6 = rtu;
            } else if (rtu.mo25162a() < alnv2.f73870s) {
                amig.m62939a();
                if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83271aA()).booleanValue() && alnv2.f73869g == 1 && rtu.mo25162a() > 0) {
                    str6 = rtu;
                } else {
                    long a5 = alnv2.f73874w.mo66928a(TimeUnit.MICROSECONDS);
                    try {
                        if (alnv2.f73869g == 2 && !m61406a(alnv2.f73872u)) {
                            str6 = rtu;
                            j = a5;
                            alnv2.f73822a.mo40509a(almk.m61269b(4, alnv2.f73874w.mo66928a(TimeUnit.MICROSECONDS) - j));
                        } else if (j.mo41358a() || alnv2.f73869g == 2) {
                            String str30 = str19;
                            int i7 = alnv2.f73869g;
                            if (i7 == 0) {
                                j = a5;
                                cursor = context.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI.buildUpon().appendPath(alnv2.f73867e).appendQueryParameter("name_for_primary_account", alnv2.f73864b).appendQueryParameter("type_for_primary_account", "com.google").build(), alnt.f73862a, null, null, null);
                            } else if (i7 == 1) {
                                try {
                                    String[] strArr = alnv2.f73868f;
                                    j = a5;
                                    if (strArr.length > 1) {
                                        try {
                                            Log.w(str30, "Multiple token detected for EMAIL_EXACT autocomplete. Using the first token");
                                        } catch (Exception e) {
                                            e = e;
                                            j2 = j;
                                            str19 = str30;
                                            str6 = rtu;
                                            j = j2;
                                            if (rfy.m33543a()) {
                                            }
                                        }
                                    }
                                    String str31 = strArr[0];
                                    int i8 = Build.VERSION.SDK_INT;
                                    cursor = context.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, alnt.f73862a, "data1=?", new String[]{str31}, "starred DESC,in_default_directory DESC,last_time_contacted DESC,_id");
                                } catch (Exception e2) {
                                    e = e2;
                                    j2 = a5;
                                    str19 = str30;
                                    str6 = rtu;
                                    j = j2;
                                    if (rfy.m33543a()) {
                                    }
                                }
                            } else if (i7 != 2) {
                                sdo.m34970a(false);
                                str6 = rtu;
                                j = a5;
                                alnv2.f73822a.mo40509a(almk.m61269b(4, alnv2.f73874w.mo66928a(TimeUnit.MICROSECONDS) - j));
                            } else {
                                cursor = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI.buildUpon().appendPath(alnv2.f73867e).build(), alnu.f73863a, null, null, null);
                                j = a5;
                            }
                            if (cursor == null) {
                                Log.w(str30, "Contacts provider query failed");
                                str6 = rtu;
                            } else {
                                String str32 = "cp2_data_id";
                                String str33 = "cp2_contact_id";
                                str19 = str30;
                                String str34 = str3;
                                if (alnv2.f73869g == 2) {
                                    try {
                                        ContentValues contentValues2 = new ContentValues();
                                        while (cursor.moveToNext() && rtu.mo25162a() < alnv2.f73870s) {
                                            long j4 = (long) cursor.getInt(0);
                                            rtu rtu8 = rtu;
                                            try {
                                                String str35 = str32;
                                                String str36 = str33;
                                                long j5 = (long) cursor.getInt(1);
                                                String string21 = cursor.getString(2);
                                                try {
                                                    String string22 = cursor.getString(3);
                                                    if (TextUtils.isEmpty(string21) || nrVar.contains(string21)) {
                                                        alnv2 = this;
                                                        str33 = str36;
                                                        str32 = str35;
                                                        rtu4 = rtu8;
                                                        cursor4 = cursor;
                                                    } else {
                                                        contentValues2.put(str, num);
                                                        str = str;
                                                        cursor3 = cursor;
                                                        try {
                                                            StringBuilder sb2 = new StringBuilder(24);
                                                            sb2.append("cp2:");
                                                            sb2.append(j4);
                                                            contentValues2.put(str15, sb2.toString());
                                                            contentValues2.put("display_name", string22);
                                                            contentValues2.put(str4, num);
                                                            contentValues2.put(str5, string21);
                                                            str10 = str36;
                                                            contentValues2.put(str10, Long.valueOf(j4));
                                                            str11 = str35;
                                                            contentValues2.put(str11, Long.valueOf(j5));
                                                            alnv2 = this;
                                                            try {
                                                                SparseIntArray sparseIntArray2 = alnv2.f73875x;
                                                                sparseIntArray2.put(3, sparseIntArray2.get(3, 0) + 1);
                                                                rtu5 = rtu8;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                cursor3.close();
                                                                throw th;
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor3.close();
                                                            throw th;
                                                        }
                                                        try {
                                                            rtu5.mo25160a(contentValues2);
                                                            nrVar.add(string21);
                                                            str33 = str10;
                                                            str32 = str11;
                                                            rtu4 = rtu5;
                                                            cursor4 = cursor3;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            cursor3.close();
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    cursor3 = cursor;
                                                    cursor3.close();
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                cursor3 = cursor;
                                                cursor3.close();
                                                throw th;
                                            }
                                        }
                                        rtu rtu9 = rtu;
                                        try {
                                            cursor.close();
                                            str6 = rtu9;
                                        } catch (Exception e3) {
                                            e = e3;
                                            str6 = rtu9;
                                            if (rfy.m33543a()) {
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        cursor3 = cursor;
                                        cursor3.close();
                                        throw th;
                                    }
                                } else {
                                    Cursor cursor6 = cursor;
                                    rtu rtu10 = rtu;
                                    String str37 = str32;
                                    String str38 = str33;
                                    String str39 = str;
                                    try {
                                        ContentValues contentValues3 = new ContentValues();
                                        while (true) {
                                            if (!cursor6.moveToNext()) {
                                                str6 = rtu10;
                                                cursor6.close();
                                                break;
                                            }
                                            rtu rtu11 = rtu10;
                                            try {
                                                if (rtu10.mo25162a() >= alnv2.f73870s) {
                                                    break;
                                                }
                                                cursor2 = cursor6;
                                                try {
                                                    rtu rtu12 = str6;
                                                    long j6 = (long) cursor2.getInt(0);
                                                    String str40 = str37;
                                                    String str41 = str4;
                                                    String str42 = str15;
                                                    String string23 = cursor2.getString(2);
                                                    long j7 = (long) cursor2.getInt(1);
                                                    int i9 = cursor2.getInt(3);
                                                    String string24 = cursor2.getString(4);
                                                    String str43 = str38;
                                                    String string25 = cursor2.getString(5);
                                                    if (TextUtils.isEmpty(string23) || nrVar.contains(string23)) {
                                                        alnv = this;
                                                        str37 = str40;
                                                        str7 = str41;
                                                        cursor6 = cursor2;
                                                        str15 = str42;
                                                        str18 = str18;
                                                        num2 = num;
                                                        rtu10 = rtu11;
                                                        rtu2 = rtu12;
                                                        str38 = str43;
                                                    } else {
                                                        contentValues3.put(str39, num);
                                                        Integer num5 = num;
                                                        StringBuilder sb3 = new StringBuilder(24);
                                                        sb3.append("cp2:");
                                                        sb3.append(j6);
                                                        String str44 = str42;
                                                        contentValues3.put(str44, sb3.toString());
                                                        contentValues3.put("display_name", string25);
                                                        contentValues3.put(str18, (Integer) 3);
                                                        StringBuilder sb4 = new StringBuilder(Long.toString(j6));
                                                        sb4.append(9);
                                                        if (string23 != null) {
                                                            sb4.append(string23);
                                                        }
                                                        String str45 = rtu12;
                                                        contentValues3.put(str45, sb4.toString());
                                                        String str46 = str18;
                                                        String str47 = str41;
                                                        contentValues3.put(str47, (Integer) 1);
                                                        contentValues3.put(str5, string23);
                                                        if (i9 != 1) {
                                                            i = i9 != 2 ? i9 != 3 ? -1 : -1 : 2;
                                                        } else {
                                                            i = 1;
                                                        }
                                                        String str48 = str34;
                                                        contentValues3.put(str48, Integer.valueOf(i));
                                                        String str49 = str2;
                                                        contentValues3.put(str49, string24);
                                                        String str50 = str43;
                                                        contentValues3.put(str50, Long.valueOf(j6));
                                                        str37 = str40;
                                                        contentValues3.put(str37, Long.valueOf(j7));
                                                        alnv = this;
                                                        String str51 = str50;
                                                        try {
                                                            SparseIntArray sparseIntArray3 = alnv.f73875x;
                                                            str2 = str49;
                                                            str8 = str44;
                                                            str9 = str5;
                                                            sparseIntArray3.put(3, sparseIntArray3.get(3, 0) + 1);
                                                            rtu3 = rtu11;
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            cursor2.close();
                                                            throw th;
                                                        }
                                                        try {
                                                            rtu3.mo25160a(contentValues3);
                                                            nrVar.add(string23);
                                                            str34 = str48;
                                                            str7 = str47;
                                                            cursor6 = cursor2;
                                                            str15 = str8;
                                                            str18 = str46;
                                                            str5 = str9;
                                                            num2 = num5;
                                                            rtu10 = rtu3;
                                                            rtu2 = str45;
                                                            str38 = str51;
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            cursor2.close();
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    cursor2.close();
                                                    throw th;
                                                }
                                            } catch (Throwable th12) {
                                                th = th12;
                                                cursor2 = cursor6;
                                                cursor2.close();
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        cursor2 = cursor6;
                                        cursor2.close();
                                        throw th;
                                    }
                                }
                            }
                            alnv2.f73822a.mo40509a(almk.m61269b(4, alnv2.f73874w.mo66928a(TimeUnit.MICROSECONDS) - j));
                        } else {
                            String str52 = str19;
                            try {
                                Log.w(str52, "READ_CONTACTS permission is missing. Skipping loadCp2DataInner()");
                                str6 = rtu;
                                j = a5;
                            } catch (Exception e4) {
                                e = e4;
                                str19 = str52;
                                str6 = rtu;
                                j = a5;
                                if (rfy.m33543a()) {
                                }
                            }
                            alnv2.f73822a.mo40509a(almk.m61269b(4, alnv2.f73874w.mo66928a(TimeUnit.MICROSECONDS) - j));
                        }
                    } catch (Exception e5) {
                        e = e5;
                        str6 = rtu;
                        j = a5;
                        if (rfy.m33543a()) {
                            throw e;
                        } else if (cgbe.f186279a.mo6606a().mo83299ac()) {
                            Log.w(str19, "Exception from CP2 query", e);
                            alnv2.f73822a.mo40509a(almk.m61269b(4, alnv2.f73874w.mo66928a(TimeUnit.MICROSECONDS) - j));
                            DataHolder a6 = str6.mo25164a(0, bundle2);
                            alnv2.f73822a.mo40509a(almk.m61269b(2, alnv2.f73874w.mo66928a(TimeUnit.MICROSECONDS)));
                            alnv2.f73874w.mo66931e();
                            alnv2.f73822a.f73693g = alnv2.f73875x;
                            return a6;
                        } else {
                            throw e;
                        }
                    }
                }
            } else {
                str6 = rtu;
            }
            DataHolder a62 = str6.mo25164a(0, bundle2);
            alnv2.f73822a.mo40509a(almk.m61269b(2, alnv2.f73874w.mo66928a(TimeUnit.MICROSECONDS)));
            alnv2.f73874w.mo66931e();
            alnv2.f73822a.f73693g = alnv2.f73875x;
            return a62;
        }
        Log.e("BasePeopleOperation", "Not implemented");
        return null;
    }

    public alnv(String str, int i, alzm alzm, String str2, String str3, boolean z, String str4, int i2, int i3, boolean z2) {
        super(str, i, alzm, str2, "LoadAutocompleteList");
        this.f73864b = str2;
        this.f73865c = str3;
        this.f73866d = z;
        this.f73867e = str4;
        this.f73868f = altv.m61849a(str4);
        this.f73869g = i2;
        this.f73870s = i3;
        this.f73873v = z2;
        this.f73871t = i;
        this.f73872u = str;
        almh almh = this.f73822a;
        almh.f73692f = str4;
        almh.f73694h = i2;
        almh.f73695i = i3;
        almh.f73696j = z2;
    }
}
