package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: ztg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ztg extends srp {

    /* renamed from: a */
    public static final srn f55874a = zvt.m46581a();

    /* renamed from: b */
    private final Context f55875b;

    /* renamed from: c */
    private final String f55876c;

    /* renamed from: d */
    private final ytp f55877d;

    /* renamed from: a */
    public static ztg m46273a(Context context, String str, ytp ytp) {
        String valueOf = String.valueOf(str.replaceAll("[^a-zA-Z0-9.-]", "_"));
        return new ztg(context, valueOf.length() == 0 ? new String("fitness.db.") : "fitness.db.".concat(valueOf), str, ytp);
    }

    /* renamed from: b */
    private static void m46277b(SQLiteDatabase sQLiteDatabase, boolean z) {
        sQLiteDatabase.endTransaction();
        m46276a(sQLiteDatabase, z);
        sQLiteDatabase.beginTransaction();
    }

    /* renamed from: c */
    private static void m46278c(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        Cursor cursor2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        Cursor cursor3;
        ContentValues contentValues;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        caah caah;
        Cursor cursor4;
        Throwable th;
        String str27;
        boolean z;
        Cursor query;
        caah b;
        Cursor query2;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        caaq caaq;
        Cursor query3;
        bzzz bzzz;
        SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
        String str33 = "application_id";
        String str34 = "source_name";
        String str35 = "version";
        String str36 = "data_source_id = ?";
        String str37 = "data_source_id";
        String str38 = "type";
        sQLiteDatabase.setTransactionSuccessful();
        m46277b(sQLiteDatabase3, false);
        zth zth = new zth(sQLiteDatabase3);
        String str39 = "ztg";
        String str40 = "c";
        try {
            String str41 = zth.f55879b;
            srn srn = ztl.f55885a;
            Cursor query4 = zth.f55880c.query(str41, new String[]{String.format("DST.%s", str37)}, null, null, null, null, null, null);
            try {
                ArrayList arrayList = new ArrayList(query4.getCount());
                while (cursor2.moveToNext()) {
                    String str42 = str8;
                    String str43 = str7;
                    String str44 = str5;
                    String str45 = str3;
                    String str46 = str2;
                    String str47 = str6;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    String str48 = str;
                    String str49 = str4;
                    cursor = cursor2;
                    try {
                        arrayList.add(Long.valueOf(ztl.m46302b(cursor, str49)));
                        query4 = cursor;
                        str35 = str47;
                        str39 = str46;
                        str36 = str44;
                        str34 = str43;
                        str33 = str42;
                        str38 = str45;
                        str40 = str48;
                        sQLiteDatabase3 = sQLiteDatabase2;
                        str37 = str49;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor.close();
                        throw th;
                    }
                }
                C1230nw nwVar = new C1230nw(arrayList.size());
                Iterator it = bnjd.m109574a(arrayList, 100).iterator();
                while (true) {
                    str9 = "DataTypes";
                    str10 = str4;
                    str11 = "%s = ?";
                    str12 = str5;
                    str13 = "format";
                    str14 = str2;
                    str15 = "field_name";
                    str16 = str;
                    str17 = "data_type_id";
                    str18 = "name";
                    cursor3 = cursor2;
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        List list = (List) it.next();
                        Iterator it2 = it;
                        C1230nw nwVar2 = nwVar;
                        String str50 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                        String str51 = str6;
                        Cursor query5 = zth.f55880c.query(zth.f55879b, new String[]{"_id", str7, str3, str8, "device_id", "stream_name", str17}, String.format("DS.%s IN (%s)", "_id", ztu.m46329a(list.size())), ztu.m46352c(list), null, null, null, null);
                        while (query5.moveToNext()) {
                            try {
                                long b2 = ztl.m46302b(query5, "_id");
                                String d = ztl.m46304d(query5, str7);
                                caad a = caad.m126389a(ztl.m46301a(query5, str3));
                                String str52 = str7;
                                long b3 = ztl.m46302b(query5, "device_id");
                                long b4 = ztl.m46302b(query5, str8);
                                String d2 = ztl.m46304d(query5, "stream_name");
                                long j = b2;
                                long b5 = ztl.m46302b(query5, str17);
                                if (b5 >= 0) {
                                    str27 = str8;
                                    z = true;
                                } else {
                                    str27 = str8;
                                    z = false;
                                }
                                cursor4 = query5;
                                try {
                                    bmxy.m108589a(z, "Missing data type");
                                    String format = String.format("DT.%s", "_id");
                                    String str53 = d2;
                                    String str54 = str17;
                                    String str55 = str9;
                                    query = zth.f55880c.query(String.format("%s DT JOIN %s F ON (%s = F.%s)", str9, "DataTypeFields", format, str17), new String[]{str18, str15, str13}, String.format(str11, format), new String[]{Long.toString(b5)}, null, null, null, null);
                                    bmxy.m108604b(query.moveToFirst(), "Couldn't find data type with ID %s", b5);
                                    int count = query.getCount();
                                    caal[] caalArr = new caal[count];
                                    String c = ztl.m46303c(query, str18);
                                    if (bzzn.m126366b(c)) {
                                        b = bzzn.m126359a(c);
                                    } else {
                                        for (int i = 0; i < count; i++) {
                                            caalArr[i] = bzzj.m126351a(ztl.m46303c(query, str15), caak.m126415a(ztl.m46301a(query, str13)));
                                            query.moveToNext();
                                        }
                                        b = bzzn.m126364b(c, Arrays.asList(caalArr));
                                    }
                                    query.close();
                                    query2 = zth.f55880c.query("Devices", new String[]{"make", "model", str51, "uid", str3, "platform_type"}, String.format(str11, "_id"), new String[]{Long.toString(b3)}, null, null, null, null);
                                    if (query2.moveToFirst()) {
                                        bxvd da = caaq.f172356h.mo74144da();
                                        String c2 = ztl.m46303c(query2, "make");
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        caaq caaq2 = (caaq) da.f164949b;
                                        c2.getClass();
                                        str30 = str13;
                                        caaq2.f172358a |= 16;
                                        caaq2.f172363f = c2;
                                        String c3 = ztl.m46303c(query2, "model");
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        caaq caaq3 = (caaq) da.f164949b;
                                        c3.getClass();
                                        caaq3.f172358a |= 8;
                                        caaq3.f172362e = c3;
                                        str32 = str51;
                                        String c4 = ztl.m46303c(query2, str32);
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        caaq caaq4 = (caaq) da.f164949b;
                                        c4.getClass();
                                        str29 = str15;
                                        caaq4.f172358a |= 4;
                                        caaq4.f172361d = c4;
                                        String d3 = ztl.m46304d(query2, "uid");
                                        if (d3 != null) {
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            caaq caaq5 = (caaq) da.f164949b;
                                            d3.getClass();
                                            caaq5.f172358a |= 1;
                                            caaq5.f172359b = d3;
                                        }
                                        int a2 = ztl.m46301a(query2, str3);
                                        caap a3 = caap.m126421a(a2);
                                        if (a3 == null) {
                                            bnsl bnsl = (bnsl) zth.f55878a.mo68387b();
                                            str28 = str3;
                                            str31 = str50;
                                            bnsl.mo68432a("zth", "a", 235, str31);
                                            bnsl.mo68409a("Invalid DeviceType [%d]", a2);
                                            a3 = caap.UNKNOWN;
                                        } else {
                                            str28 = str3;
                                            str31 = str50;
                                        }
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        caaq caaq6 = (caaq) da.f164949b;
                                        caaq6.f172360c = a3.f172355h;
                                        caaq6.f172358a |= 2;
                                        int a4 = ztl.m46301a(query2, "platform_type");
                                        int a5 = caan.m126419a(a4);
                                        if (a5 == 0) {
                                            bnsl bnsl2 = (bnsl) zth.f55878a.mo68387b();
                                            bnsl2.mo68432a("zth", "a", 243, str31);
                                            bnsl2.mo68409a("Invalid PlatformType [%d]", a4);
                                            a5 = 1;
                                        }
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        caaq caaq7 = (caaq) da.f164949b;
                                        caaq7.f172364g = a5 - 1;
                                        caaq7.f172358a |= 32;
                                        caaq = (caaq) da.mo74062i();
                                        query2.close();
                                    } else {
                                        str30 = str13;
                                        str29 = str15;
                                        str32 = str51;
                                        str28 = str3;
                                        str31 = str50;
                                        query2.close();
                                        caaq = null;
                                    }
                                    query3 = zth.f55880c.query("Applications", new String[]{"package", str32, str18, "details_url", "console_ids"}, String.format(str11, "_id"), new String[]{Long.toString(b4)}, null, null, null, null);
                                    if (query3.moveToFirst()) {
                                        bzzy bzzy = (bzzy) bzzz.f172298f.mo74144da();
                                        String c5 = ztl.m46303c(query3, "package");
                                        if (!c5.isEmpty()) {
                                            if (bzzy.f164950c) {
                                                bzzy.mo74035c();
                                                bzzy.f164950c = false;
                                            }
                                            bzzz bzzz2 = (bzzz) bzzy.f164949b;
                                            c5.getClass();
                                            bzzz2.f172300a |= 1;
                                            bzzz2.f172301b = c5;
                                        }
                                        String d4 = ztl.m46304d(query3, "details_url");
                                        if (d4 != null) {
                                            if (bzzy.f164950c) {
                                                bzzy.mo74035c();
                                                bzzy.f164950c = false;
                                            }
                                            bzzz bzzz3 = (bzzz) bzzy.f164949b;
                                            d4.getClass();
                                            bzzz3.f172300a |= 4;
                                            bzzz3.f172302c = d4;
                                        }
                                        String d5 = ztl.m46304d(query3, str18);
                                        if (d5 != null) {
                                            if (bzzy.f164950c) {
                                                bzzy.mo74035c();
                                                bzzy.f164950c = false;
                                            }
                                            bzzz bzzz4 = (bzzz) bzzy.f164949b;
                                            d5.getClass();
                                            bzzz4.f172300a |= 8;
                                            bzzz4.f172304e = d5;
                                        }
                                        String d6 = ztl.m46304d(query3, "console_ids");
                                        if (d6 != null && !d6.trim().isEmpty()) {
                                            for (String str56 : bmyx.m108640a(',').mo66918a((CharSequence) d6)) {
                                                bzzy.mo74586a(Long.parseLong(str56));
                                            }
                                        }
                                        bzzz = (bzzz) bzzy.mo74062i();
                                        query3.close();
                                    } else {
                                        query3.close();
                                        bzzz = null;
                                    }
                                    yyc a6 = yyd.m44987a();
                                    a6.mo30856a(a);
                                    a6.mo30857a(b);
                                    if (d != null) {
                                        a6.mo30860b(d);
                                    }
                                    a6.mo30858a(caaq);
                                    a6.mo30855a(bzzz);
                                    a6.mo30859a(bmxx.m108578b(str53));
                                    nwVar2.mo15540b(j, a6.mo30854a());
                                    nwVar2 = nwVar2;
                                    str50 = str31;
                                    str7 = str52;
                                    str15 = str29;
                                    str8 = str27;
                                    query5 = cursor4;
                                    str3 = str28;
                                    str17 = str54;
                                    str9 = str55;
                                    str51 = str32;
                                    str13 = str30;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                cursor4 = query5;
                                th = th;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                throw th;
                            }
                        }
                        String str57 = str8;
                        String str58 = str7;
                        Cursor cursor5 = query5;
                        C1230nw nwVar3 = nwVar2;
                        String str59 = str51;
                        String str60 = str3;
                        if (cursor5 != null) {
                            cursor5.close();
                            nwVar = nwVar3;
                            str6 = str59;
                            str4 = str10;
                            str5 = str12;
                            str2 = str14;
                            str = str16;
                            cursor2 = cursor3;
                            str7 = str58;
                            str8 = str57;
                            it = it2;
                            str3 = str60;
                        } else {
                            nwVar = nwVar3;
                            str6 = str59;
                            str4 = str10;
                            str5 = str12;
                            str2 = str14;
                            str = str16;
                            cursor2 = cursor3;
                            str7 = str58;
                            str8 = str57;
                            it = it2;
                            str3 = str60;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        sQLiteDatabase2 = sQLiteDatabase;
                        cursor = cursor3;
                        cursor.close();
                        throw th;
                    }
                }
                String str61 = str13;
                String str62 = str9;
                String str63 = str15;
                String str64 = str17;
                C1230nw nwVar4 = nwVar;
                String str65 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                try {
                    cursor3.close();
                    C1230nw nwVar5 = new C1230nw();
                    int i2 = 0;
                    while (i2 < nwVar4.mo15537b()) {
                        String str66 = str18;
                        String str67 = str11;
                        String str68 = str10;
                        String str69 = str14;
                        String str70 = str16;
                        String str71 = str63;
                        String str72 = str64;
                        String str73 = str62;
                        String str74 = str61;
                        String str75 = str65;
                        nwVar5.mo15540b(nwVar4.mo15533a(i2), (caae) nwVar4.mo15538b(i2));
                        i2++;
                        str16 = str70;
                        str18 = str66;
                        str62 = str73;
                        str10 = str68;
                        str64 = str72;
                        str14 = str69;
                        str11 = str67;
                        str61 = str74;
                        str65 = str75;
                        str63 = str71;
                    }
                    C1230nw nwVar6 = new C1230nw();
                    Cursor query6 = zth.f55880c.query("DataTypes", new String[]{"_id"}, null, null, null, null, null, null);
                    while (query6.moveToNext()) {
                        try {
                            long b6 = ztl.m46302b(query6, "_id");
                            String format2 = String.format("DT.%s", "_id");
                            query6 = zth.f55880c.query(String.format("%s DT JOIN %s F ON (%s = F.%s)", str62, "DataTypeFields", format2, str64), new String[]{str18, str63, str61}, String.format(str11, format2), new String[]{Long.toString(b6)}, null, null, null, null);
                            bmxy.m108604b(query6.moveToFirst(), "Couldn't find data type with ID %s", b6);
                            int count2 = query6.getCount();
                            caal[] caalArr2 = new caal[count2];
                            String c6 = ztl.m46303c(query6, str18);
                            if (bzzn.m126366b(c6)) {
                                caah = bzzn.m126359a(c6);
                                str25 = str11;
                                str26 = str63;
                                str24 = str61;
                            } else {
                                int i3 = 0;
                                while (i3 < count2) {
                                    String str76 = str11;
                                    String str77 = str63;
                                    caalArr2[i3] = bzzj.m126351a(ztl.m46303c(query6, str77), caak.m126415a(ztl.m46301a(query6, str61)));
                                    query6.moveToNext();
                                    i3++;
                                    str11 = str76;
                                    count2 = count2;
                                    str61 = str61;
                                    str63 = str77;
                                }
                                str25 = str11;
                                str26 = str63;
                                str24 = str61;
                                caah = bzzn.m126364b(c6, Arrays.asList(caalArr2));
                            }
                            nwVar6.mo15540b(b6, caah);
                            str11 = str25;
                            str61 = str24;
                            str63 = str26;
                        } catch (Throwable th6) {
                            sQLiteDatabase2 = sQLiteDatabase;
                            throw th6;
                        } finally {
                            query6.close();
                        }
                    }
                    query6.close();
                    sQLiteDatabase2 = sQLiteDatabase;
                    try {
                        sQLiteDatabase2.execSQL(zsy.f55852e);
                        sQLiteDatabase2.execSQL(zsz.f55855c);
                        sQLiteDatabase2.execSQL("DROP TABLE DataTypeFields");
                        sQLiteDatabase2.execSQL("DROP TABLE Applications");
                        sQLiteDatabase2.execSQL("DROP TABLE DataSourceTypes");
                        sQLiteDatabase2.execSQL("DROP TABLE Devices");
                        sQLiteDatabase2.execSQL(zsy.f55849b);
                        sQLiteDatabase2.execSQL(zsz.f55853a);
                        sQLiteDatabase2.execSQL(zsy.f55850c);
                        sQLiteDatabase2.execSQL(zsz.f55854b);
                        HashMap hashMap = new HashMap();
                        ContentValues contentValues2 = new ContentValues();
                        int i4 = 0;
                        while (i4 < nwVar6.mo15537b()) {
                            long a7 = nwVar6.mo15533a(i4);
                            caah caah2 = (caah) nwVar6.mo15538b(i4);
                            Long valueOf = Long.valueOf(a7);
                            contentValues2.put("_id", valueOf);
                            contentValues2.put(str18, caah2.f172336b);
                            contentValues2.put("proto", caah2.mo73642k());
                            sQLiteDatabase2.insertOrThrow(str62, null, contentValues2);
                            hashMap.put(caah2.f172336b, valueOf);
                            i4++;
                            str62 = str62;
                        }
                        ContentValues contentValues3 = new ContentValues();
                        HashMap hashMap2 = new HashMap();
                        int b7 = nwVar5.mo15537b() - 1;
                        while (b7 >= 0) {
                            long a8 = nwVar5.mo15533a(b7);
                            caae caae = (caae) nwVar5.mo15538b(b7);
                            Long l = (Long) hashMap2.get(caae.f172326b);
                            if (l == null) {
                                Long valueOf2 = Long.valueOf(a8);
                                contentValues3.put("_id", valueOf2);
                                caah caah3 = caae.f172330f;
                                if (caah3 == null) {
                                    caah3 = caah.f172333d;
                                }
                                str20 = str64;
                                contentValues3.put(str20, (Long) hashMap.get(caah3.f172336b));
                                contentValues3.put("identifier", caae.f172326b);
                                contentValues3.put("proto", caae.mo73642k());
                                sQLiteDatabase2.insertOrThrow("DataSources", null, contentValues3);
                                hashMap2.put(caae.f172326b, valueOf2);
                                str21 = str10;
                                str22 = str12;
                                str19 = str14;
                                contentValues = contentValues3;
                                str23 = str16;
                            } else {
                                str20 = str64;
                                bnsl bnsl3 = (bnsl) f55874a.mo68388c();
                                str19 = str14;
                                contentValues = contentValues3;
                                str23 = str16;
                                bnsl3.mo68432a(str19, str23, 385, str65);
                                bnsl3.mo68420a("Removing duplicated data source %s", caae.f172326b);
                                long longValue = l.longValue();
                                String[] strArr = {Long.toString(a8)};
                                str22 = str12;
                                sQLiteDatabase2.delete("SyncStatus", str22, strArr);
                                sQLiteDatabase2.delete("DataPointRows", str22, strArr);
                                ContentValues contentValues4 = new ContentValues();
                                str21 = str10;
                                contentValues4.put(str21, Long.valueOf(longValue));
                                sQLiteDatabase2.update("Subscriptions", contentValues4, str22, strArr);
                            }
                            b7--;
                            str16 = str23;
                            str12 = str22;
                            str10 = str21;
                            str64 = str20;
                            contentValues3 = contentValues;
                            str14 = str19;
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        m46277b(sQLiteDatabase2, true);
                    } catch (Throwable th7) {
                        th = th7;
                        m46277b(sQLiteDatabase2, true);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    sQLiteDatabase2 = sQLiteDatabase;
                    m46277b(sQLiteDatabase2, true);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                sQLiteDatabase2 = sQLiteDatabase3;
                cursor = query4;
                cursor.close();
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            sQLiteDatabase2 = sQLiteDatabase3;
            m46277b(sQLiteDatabase2, true);
            throw th;
        }
    }

    /* renamed from: d */
    private final void m46279d(SQLiteDatabase sQLiteDatabase) {
        Cursor query;
        bnsl bnsl = (bnsl) f55874a.mo68390d();
        bnsl.mo68432a("ztg", "d", 518, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Recreating database");
        m46277b(sQLiteDatabase, false);
        try {
            query = sQLiteDatabase.query("sqlite_master", new String[]{"name"}, "type='table' AND name != 'android_metadata' AND name NOT LIKE 'sqlite%'", null, null, null, null);
            while (query.moveToNext()) {
                String string = query.getString(0);
                bnsl bnsl2 = (bnsl) f55874a.mo68390d();
                bnsl2.mo68432a("ztg", "d", 534, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Dropping table %s", string);
                String valueOf = String.valueOf(string);
                sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP TABLE IF EXISTS ") : "DROP TABLE IF EXISTS ".concat(valueOf));
            }
            sQLiteDatabase.setTransactionSuccessful();
            if (query != null) {
                query.close();
            }
            m46277b(sQLiteDatabase, true);
            onCreate(sQLiteDatabase);
            return;
        } catch (Throwable th) {
            m46277b(sQLiteDatabase, true);
            throw th;
        }
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztg.a(android.database.sqlite.SQLiteDatabase, boolean):void
     arg types: [android.database.sqlite.SQLiteDatabase, int]
     candidates:
      ztg.a(android.database.sqlite.SQLiteDatabase, long):void
      ztg.a(android.database.sqlite.SQLiteDatabase, boolean):void */
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        m46276a(sQLiteDatabase, true);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        bnsl bnsl = (bnsl) f55874a.mo68388c();
        bnsl.mo68432a("ztg", "onDowngrade", 335, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("Unable to downgrade to: %d. Recreating db.", i2);
        m46279d(sQLiteDatabase);
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:22:0x00e4 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:5:0x004c */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:365:0x0b7b */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:358:0x0b6f */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:340:0x0aca */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:277:0x0842 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:264:0x07fb */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:202:0x06d6 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:196:0x0681 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:181:0x0618 */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v11, resolved type: zth} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v12, resolved type: zth} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v72, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v75, resolved type: java.lang.String} */
    /* JADX WARN: Type inference failed for: r11v1, types: [int], assign insn: PHI: (r11v1 ?) = (r11v0 int), (r11v6 ?) binds: [B:0:0x0000, B:382:0x0cac] */
    /* JADX WARN: Type inference failed for: r11v3, assign insn: 0x004a: MOVE  (r11v3 ? I:?[OBJECT, ARRAY]) = (r21v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r11v6, assign insn: 0x0cbc: MOVE  (r11v6 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r62v0 int) */
    /* JADX WARN: Type inference failed for: r11v8, assign insn: PHI: (r11v8 ?) = (r11v3 ?), (r11v3 ?), (r11v20 ?), (r11v32 ?), (r11v32 ?), (r11v1 ?) binds: [B:5:0x004c, B:6:?, B:365:0x0b7b, B:336:0x0ac1, B:337:?, B:22:0x00e4] */
    /* JADX WARN: Type inference failed for: r11v20, assign insn: PHI: (r11v20 ?) = (r11v21 ?), (r11v32 ?), (r11v71 ?) binds: [B:363:0x0b76, B:346:0x0b23, B:361:0x0b73] */
    /* JADX WARN: Type inference failed for: r11v21, assign insn: 0x0b77: MOVE  (r11v21 ? I:?[OBJECT, ARRAY]) = (r27v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r11v22, assign insn: PHI: (r11v22 ?) = (r11v23 java.lang.String), (r11v32 ?), (r11v32 ?) binds: [B:358:0x0b6f, B:340:0x0aca, B:318:0x0974] */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.String], assign insn: 0x0866: MOVE  (r11v32 ? I:?[OBJECT, ARRAY]) = (r27v7 java.lang.String) */
    /* JADX WARN: Type inference failed for: r11v57, assign insn: 0x030d: MOVE  (r11v57 ? I:?[OBJECT, ARRAY]) = (r27v20 java.lang.String) */
    /* JADX WARN: Type inference failed for: r11v61, assign insn: 0x0199: MOVE  (r11v61 ? I:?[OBJECT, ARRAY]) = (r27v21 java.lang.String) */
    /* JADX WARN: Type inference failed for: r11v62, assign insn: 0x0181: MOVE  (r11v62 ? I:?[OBJECT, ARRAY]) = (r27v22 java.lang.String) */
    /* JADX WARN: Type inference failed for: r11v64, assign insn: 0x013e: MOVE  (r11v64 ? I:?[OBJECT, ARRAY]) = (r27v23 java.lang.String) */
    /* JADX WARN: Type inference failed for: r11v65, assign insn: 0x0133: MOVE  (r11v65 ? I:?[OBJECT, ARRAY]) = (r27v23 java.lang.String) */
    /* JADX WARN: Type inference failed for: r11v66, assign insn: 0x00aa: MOVE  (r11v66 ? I:?[OBJECT, ARRAY]) = (r21v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r11v67, assign insn: 0x0099: MOVE  (r11v67 ? I:?[OBJECT, ARRAY]) = (r21v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r11v68, assign insn: 0x007d: MOVE  (r11v68 ? I:?[OBJECT, ARRAY]) = (r21v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r11v69, assign insn: 0x006c: MOVE  (r11v69 ? I:?[OBJECT, ARRAY]) = (r21v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r11v71, assign insn: ?: MOVE  (r11v71 ?) = (r11v22 ?) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x083c A[SYNTHETIC, Splitter:B:273:0x083c] */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str;
        int i3;
        String str2;
        String str3;
        String str4;
        String str5;
        int i4;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        SQLiteDatabase sQLiteDatabase2;
        Throwable th;
        Cursor cursor;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        Cursor cursor2;
        String str20;
        String str21;
        String str22;
        HashMap hashMap;
        ContentValues contentValues;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        Cursor query;
        String str29;
        String str30;
        caah caah;
        String str31;
        String str32;
        Cursor cursor3;
        Throwable th2;
        String str33;
        boolean z;
        Throwable th3;
        caah caah2;
        String str34;
        String str35;
        caaq caaq;
        Cursor query2;
        bzzz bzzz;
        bzzy bzzy;
        Cursor query3;
        bxvd bxvd;
        String str36;
        int i5;
        ContentValues contentValues2;
        bnic bnic;
        Throwable th4;
        long j;
        SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
        int i6 = i;
        int i7 = i2;
        String str37 = "data_source_id = ?";
        String str38 = "data_point";
        String str39 = "data_source_id";
        String str40 = "type";
        bnsl bnsl = (bnsl) f55874a.mo68390d();
        String str41 = "ztg";
        String str42 = "onUpgrade";
        String str43 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
        bnsl.mo68432a(str41, str42, 149, str43);
        bnsl.mo68411a("Upgrading database from v%d to v%d", i6, i7);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i8 = i6;
        while (i8 < i7) {
            String str44 = "proto";
            String str45 = str41;
            String str46 = str42;
            String str47 = str43;
            String str48 = "DataPointRows";
            switch (i8) {
                case 17:
                    i3 = i8;
                    str7 = str40;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    str11 = str37;
                    str10 = str39;
                    str2 = str45;
                    str3 = str46;
                    str = str47;
                    str9 = str38;
                    break;
                case 18:
                    i3 = i8;
                    str7 = str40;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    str11 = str37;
                    str10 = str39;
                    str2 = str45;
                    str3 = str46;
                    str = str47;
                    str9 = str38;
                    sQLiteDatabase2.execSQL(zsw.f55841b);
                    sQLiteDatabase2.execSQL(zsw.f55842c);
                    sQLiteDatabase2.execSQL(zsw.f55843d);
                    sQLiteDatabase2.execSQL(zsw.f55844e);
                    sQLiteDatabase2.execSQL(zsw.f55845f);
                    sQLiteDatabase2.execSQL(zsw.f55846g);
                    break;
                case 19:
                    i3 = i8;
                    str7 = str40;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    str11 = str37;
                    str10 = str39;
                    str2 = str45;
                    str3 = str46;
                    str = str47;
                    str9 = str38;
                    sQLiteDatabase2.execSQL("ALTER TABLE Devices ADD COLUMN platform_type INTEGER");
                    break;
                case 20:
                    i3 = i8;
                    str7 = str40;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    str11 = str37;
                    str10 = str39;
                    str2 = str45;
                    str3 = str46;
                    str = str47;
                    str9 = str38;
                    sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS DataPoints");
                    sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS DataValues");
                    sQLiteDatabase2.execSQL("DROP VIEW IF EXISTS DataView");
                    sQLiteDatabase2.execSQL(zsz.f55854b);
                    sQLiteDatabase2.execSQL(zta.f55857b);
                    sQLiteDatabase2.execSQL(zta.f55858c);
                    break;
                case 21:
                    i3 = i8;
                    str7 = str40;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    str11 = str37;
                    str10 = str39;
                    str2 = str45;
                    str3 = str46;
                    str = str47;
                    str9 = str38;
                    sQLiteDatabase2.execSQL(zsv.f55838b);
                    break;
                case 22:
                    i3 = i8;
                    str7 = str40;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    str11 = str37;
                    str10 = str39;
                    str2 = str45;
                    str3 = str46;
                    str = str47;
                    str9 = str38;
                    sQLiteDatabase2.execSQL(ztb.f55861b);
                    break;
                case 23:
                    i3 = i8;
                    str7 = str40;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    str11 = str37;
                    str10 = str39;
                    str2 = str45;
                    str3 = str46;
                    str = str47;
                    str9 = str38;
                    sQLiteDatabase2.execSQL("ALTER TABLE Applications ADD COLUMN name TEXT");
                    sQLiteDatabase2.execSQL("ALTER TABLE Applications ADD COLUMN console_ids TEXT");
                    break;
                case 24:
                    i3 = i8;
                    str7 = str40;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    str11 = str37;
                    str10 = str39;
                    str2 = str45;
                    str3 = str46;
                    str = str47;
                    str9 = str38;
                    sQLiteDatabase2.execSQL(ztb.f55863d);
                    break;
                case 25:
                    i3 = i8;
                    str7 = str40;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    str11 = str37;
                    str10 = str39;
                    str2 = str45;
                    str3 = str46;
                    str = str47;
                    str9 = str38;
                    sQLiteDatabase2.execSQL(ztc.f55866c);
                    sQLiteDatabase2.execSQL(ztd.f55868b);
                    sQLiteDatabase2.execSQL(String.format("DELETE FROM DataSourceTypes WHERE data_source_id IN (%s)", zsy.f55848a));
                    sQLiteDatabase2.execSQL(zsy.f55851d);
                    break;
                case 26:
                    i3 = i8;
                    str7 = str40;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    str11 = str37;
                    str10 = str39;
                    str2 = str45;
                    str3 = str46;
                    str = str47;
                    str9 = str38;
                    sQLiteDatabase2.execSQL(zsv.f55839c);
                    break;
                case 27:
                    i3 = i8;
                    String str49 = "_id";
                    String str50 = str40;
                    str2 = str45;
                    str3 = str46;
                    String str51 = str47;
                    String str52 = str48;
                    String str53 = "ztg";
                    String str54 = "c";
                    sQLiteDatabase.setTransactionSuccessful();
                    m46277b(sQLiteDatabase3, false);
                    zth zth = new zth(sQLiteDatabase3);
                    try {
                        String str55 = zth.f55879b;
                        srn srn = ztl.f55885a;
                        Cursor query4 = zth.f55880c.query(str55, new String[]{String.format("DST.%s", str39)}, null, null, null, null, null, null);
                        try {
                            ArrayList arrayList = new ArrayList(query4.getCount());
                            zth zth2 = zth;
                            while (cursor2.moveToNext()) {
                                String str56 = str19;
                                sQLiteDatabase2 = sQLiteDatabase3;
                                String str57 = str16;
                                String str58 = str49;
                                String str59 = str14;
                                String str60 = str13;
                                String str61 = str8;
                                String str62 = str18;
                                zth zth3 = zth2;
                                String str63 = str17;
                                String str64 = str15;
                                String str65 = str20;
                                cursor = cursor2;
                                try {
                                    arrayList.add(Long.valueOf(ztl.m46302b(cursor, str60)));
                                    query4 = cursor;
                                    str39 = str60;
                                    str54 = str62;
                                    str44 = str65;
                                    str38 = str59;
                                    str53 = str56;
                                    str49 = str58;
                                    sQLiteDatabase3 = sQLiteDatabase2;
                                    str37 = str64;
                                    str52 = str63;
                                    zth2 = zth3;
                                    str51 = str61;
                                    str50 = str57;
                                } catch (Throwable th5) {
                                    th = th5;
                                    str12 = str61;
                                    th = th;
                                    str = str12;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            try {
                                C1230nw nwVar = new C1230nw(arrayList.size());
                                Iterator it = bnjd.m109574a(arrayList, 100).iterator();
                                while (true) {
                                    str9 = str14;
                                    String str66 = "DataTypes";
                                    String str67 = str13;
                                    String str68 = str17;
                                    String str69 = "format";
                                    String str70 = str15;
                                    String str71 = "field_name";
                                    String str72 = str19;
                                    String str73 = "data_type_id";
                                    String str74 = str18;
                                    String str75 = "name";
                                    if (it.hasNext()) {
                                        try {
                                            List list = (List) it.next();
                                            Iterator it2 = it;
                                            String str76 = str20;
                                            Cursor cursor4 = cursor2;
                                            try {
                                                Cursor query5 = zth2.f55880c.query(zth.f55879b, new String[]{str49, "source_name", str16, "application_id", "device_id", "stream_name", str73}, String.format("DS.%s IN (%s)", str49, ztu.m46329a(list.size())), ztu.m46352c(list), null, null, null, null);
                                                while (query5.moveToNext()) {
                                                    try {
                                                        long b = ztl.m46302b(query5, str49);
                                                        String d = ztl.m46304d(query5, "source_name");
                                                        caad a = caad.m126389a(ztl.m46301a(query5, str16));
                                                        C1230nw nwVar2 = nwVar;
                                                        long b2 = ztl.m46302b(query5, "device_id");
                                                        long b3 = ztl.m46302b(query5, "application_id");
                                                        String d2 = ztl.m46304d(query5, "stream_name");
                                                        long j2 = b;
                                                        long b4 = ztl.m46302b(query5, str73);
                                                        if (b4 >= 0) {
                                                            cursor3 = query5;
                                                            z = true;
                                                        } else {
                                                            cursor3 = query5;
                                                            z = false;
                                                        }
                                                        String str77 = d2;
                                                        try {
                                                            bmxy.m108589a(z, "Missing data type");
                                                            Object format = String.format("DT.%s", str49);
                                                            String str78 = d;
                                                            String str79 = str73;
                                                            String str80 = str66;
                                                            Cursor query6 = zth2.f55880c.query(String.format("%s DT JOIN %s F ON (%s = F.%s)", str66, "DataTypeFields", format, str73), new String[]{str75, str71, str69}, String.format("%s = ?", format), new String[]{Long.toString(b4)}, null, null, null, null);
                                                            try {
                                                                bmxy.m108604b(query6.moveToFirst(), "Couldn't find data type with ID %s", b4);
                                                                int count = query6.getCount();
                                                                caal[] caalArr = new caal[count];
                                                                String c = ztl.m46303c(query6, str75);
                                                                if (bzzn.m126366b(c)) {
                                                                    try {
                                                                        caah2 = bzzn.m126359a(c);
                                                                        try {
                                                                            query6.close();
                                                                        } catch (Throwable th6) {
                                                                            th2 = th6;
                                                                            str32 = str8;
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th3 = th7;
                                                                        query6.close();
                                                                        throw th3;
                                                                    }
                                                                } else {
                                                                    for (int i9 = 0; i9 < count; i9++) {
                                                                        caalArr[i9] = bzzj.m126351a(ztl.m46303c(query6, str71), caak.m126415a(ztl.m46301a(query6, str69)));
                                                                        query6.moveToNext();
                                                                    }
                                                                    caah2 = bzzn.m126364b(c, Arrays.asList(caalArr));
                                                                    query6.close();
                                                                }
                                                                Cursor query7 = zth2.f55880c.query("Devices", new String[]{"make", "model", "version", "uid", str16, "platform_type"}, String.format("%s = ?", str49), new String[]{Long.toString(b2)}, null, null, null, null);
                                                                try {
                                                                    if (query7.moveToFirst()) {
                                                                        bxvd da = caaq.f172356h.mo74144da();
                                                                        String c2 = ztl.m46303c(query7, "make");
                                                                        if (da.f164950c) {
                                                                            da.mo74035c();
                                                                            da.f164950c = false;
                                                                        }
                                                                        caaq caaq2 = (caaq) da.f164949b;
                                                                        c2.getClass();
                                                                        str35 = str69;
                                                                        caaq2.f172358a |= 16;
                                                                        caaq2.f172363f = c2;
                                                                        String c3 = ztl.m46303c(query7, "model");
                                                                        if (da.f164950c) {
                                                                            da.mo74035c();
                                                                            da.f164950c = false;
                                                                        }
                                                                        caaq caaq3 = (caaq) da.f164949b;
                                                                        c3.getClass();
                                                                        caaq3.f172358a |= 8;
                                                                        caaq3.f172362e = c3;
                                                                        String c4 = ztl.m46303c(query7, "version");
                                                                        if (da.f164950c) {
                                                                            da.mo74035c();
                                                                            da.f164950c = false;
                                                                        }
                                                                        caaq caaq4 = (caaq) da.f164949b;
                                                                        c4.getClass();
                                                                        caaq4.f172358a |= 4;
                                                                        caaq4.f172361d = c4;
                                                                        String d3 = ztl.m46304d(query7, "uid");
                                                                        if (d3 != null) {
                                                                            if (da.f164950c) {
                                                                                da.mo74035c();
                                                                                da.f164950c = false;
                                                                            }
                                                                            caaq caaq5 = (caaq) da.f164949b;
                                                                            d3.getClass();
                                                                            caaq5.f172358a |= 1;
                                                                            caaq5.f172359b = d3;
                                                                        }
                                                                        int a2 = ztl.m46301a(query7, str16);
                                                                        caap a3 = caap.m126421a(a2);
                                                                        if (a3 == null) {
                                                                            bnsl bnsl2 = (bnsl) zth.f55878a.mo68387b();
                                                                            str34 = str16;
                                                                            str16 = str8;
                                                                            try {
                                                                                bnsl2.mo68432a("zth", "a", 235, str16);
                                                                                bnsl2.mo68409a("Invalid DeviceType [%d]", a2);
                                                                                a3 = caap.UNKNOWN;
                                                                            } catch (Throwable th8) {
                                                                                th = th8;
                                                                                str33 = str16;
                                                                                th2 = th;
                                                                                str32 = str33;
                                                                                if (cursor3 != null) {
                                                                                    cursor3.close();
                                                                                }
                                                                                throw th2;
                                                                            }
                                                                        } else {
                                                                            str34 = str16;
                                                                            str16 = str8;
                                                                        }
                                                                        if (da.f164950c) {
                                                                            da.mo74035c();
                                                                            da.f164950c = false;
                                                                        }
                                                                        caaq caaq6 = (caaq) da.f164949b;
                                                                        caaq6.f172360c = a3.f172355h;
                                                                        caaq6.f172358a |= 2;
                                                                        int a4 = ztl.m46301a(query7, "platform_type");
                                                                        int a5 = caan.m126419a(a4);
                                                                        if (a5 == 0) {
                                                                            bnsl bnsl3 = (bnsl) zth.f55878a.mo68387b();
                                                                            bnsl3.mo68432a("zth", "a", 243, str16);
                                                                            bnsl3.mo68409a("Invalid PlatformType [%d]", a4);
                                                                            a5 = 1;
                                                                        }
                                                                        if (da.f164950c) {
                                                                            da.mo74035c();
                                                                            da.f164950c = false;
                                                                        }
                                                                        caaq caaq7 = (caaq) da.f164949b;
                                                                        caaq7.f172364g = a5 - 1;
                                                                        caaq7.f172358a |= 32;
                                                                        caaq = (caaq) da.mo74062i();
                                                                        query7.close();
                                                                    } else {
                                                                        str35 = str69;
                                                                        str34 = str16;
                                                                        str16 = str8;
                                                                        query7.close();
                                                                        caaq = null;
                                                                    }
                                                                    query2 = zth2.f55880c.query("Applications", new String[]{"package", "version", str75, "details_url", "console_ids"}, String.format("%s = ?", str49), new String[]{Long.toString(b3)}, null, null, null, null);
                                                                    if (query2.moveToFirst()) {
                                                                        bzzy bzzy2 = (bzzy) bzzz.f172298f.mo74144da();
                                                                        String c5 = ztl.m46303c(query2, "package");
                                                                        if (!c5.isEmpty()) {
                                                                            if (bzzy2.f164950c) {
                                                                                bzzy2.mo74035c();
                                                                                bzzy2.f164950c = false;
                                                                            }
                                                                            bzzz bzzz2 = (bzzz) bzzy2.f164949b;
                                                                            c5.getClass();
                                                                            bzzz2.f172300a |= 1;
                                                                            bzzz2.f172301b = c5;
                                                                        }
                                                                        String d4 = ztl.m46304d(query2, "details_url");
                                                                        if (d4 != null) {
                                                                            if (bzzy2.f164950c) {
                                                                                bzzy2.mo74035c();
                                                                                bzzy2.f164950c = false;
                                                                            }
                                                                            bzzz bzzz3 = (bzzz) bzzy2.f164949b;
                                                                            d4.getClass();
                                                                            bzzz3.f172300a |= 4;
                                                                            bzzz3.f172302c = d4;
                                                                        }
                                                                        String d5 = ztl.m46304d(query2, str75);
                                                                        if (d5 != null) {
                                                                            if (bzzy2.f164950c) {
                                                                                bzzy2.mo74035c();
                                                                                bzzy2.f164950c = false;
                                                                            }
                                                                            bzzz bzzz4 = (bzzz) bzzy2.f164949b;
                                                                            d5.getClass();
                                                                            bzzz4.f172300a |= 8;
                                                                            bzzz4.f172304e = d5;
                                                                        }
                                                                        String d6 = ztl.m46304d(query2, "console_ids");
                                                                        if (d6 == null) {
                                                                            bzzy = bzzy2;
                                                                        } else if (!d6.trim().isEmpty()) {
                                                                            for (String str81 : bmyx.m108640a(',').mo66918a((CharSequence) d6)) {
                                                                                bzzy2.mo74586a(Long.parseLong(str81));
                                                                                bzzy2 = bzzy2;
                                                                            }
                                                                            bzzy = bzzy2;
                                                                        } else {
                                                                            bzzy = bzzy2;
                                                                        }
                                                                        bzzz = (bzzz) bzzy.mo74062i();
                                                                        query2.close();
                                                                    } else {
                                                                        query2.close();
                                                                        bzzz = null;
                                                                    }
                                                                    yyc a6 = yyd.m44987a();
                                                                    a6.mo30856a(a);
                                                                    a6.mo30857a(caah2);
                                                                    if (str78 != null) {
                                                                        a6.mo30860b(str78);
                                                                    }
                                                                    a6.mo30858a(caaq);
                                                                    a6.mo30855a(bzzz);
                                                                    a6.mo30859a(bmxx.m108578b(str77));
                                                                    nwVar2.mo15540b(j2, a6.mo30854a());
                                                                    nwVar = nwVar2;
                                                                    str8 = str16;
                                                                    str69 = str35;
                                                                    str16 = str34;
                                                                    query5 = cursor3;
                                                                    str73 = str79;
                                                                    str66 = str80;
                                                                } catch (Throwable th9) {
                                                                    th = th9;
                                                                    Throwable th10 = th;
                                                                    query7.close();
                                                                    throw th10;
                                                                }
                                                            } catch (Throwable th11) {
                                                                th3 = th11;
                                                                query6.close();
                                                                throw th3;
                                                            }
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                            str33 = str8;
                                                            th2 = th;
                                                            str32 = str33;
                                                            if (cursor3 != null) {
                                                            }
                                                            throw th2;
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        cursor3 = query5;
                                                        str33 = str8;
                                                        th2 = th;
                                                        str32 = str33;
                                                        if (cursor3 != null) {
                                                        }
                                                        throw th2;
                                                    }
                                                }
                                                Cursor cursor5 = query5;
                                                C1230nw nwVar3 = nwVar;
                                                String str82 = str16;
                                                str32 = str8;
                                                if (cursor5 != null) {
                                                    try {
                                                        cursor5.close();
                                                        nwVar = nwVar3;
                                                        str8 = str32;
                                                        str14 = str9;
                                                        str13 = str67;
                                                        str15 = str70;
                                                        str19 = str72;
                                                        str18 = str74;
                                                        str17 = str68;
                                                        str16 = str82;
                                                        it = it2;
                                                        str20 = str76;
                                                        cursor2 = cursor4;
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                        str31 = str32;
                                                        sQLiteDatabase2 = sQLiteDatabase;
                                                        th = th;
                                                        cursor = cursor4;
                                                        str = str31;
                                                        cursor.close();
                                                        throw th;
                                                    }
                                                } else {
                                                    nwVar = nwVar3;
                                                    str8 = str32;
                                                    str14 = str9;
                                                    str13 = str67;
                                                    str15 = str70;
                                                    str19 = str72;
                                                    str18 = str74;
                                                    str17 = str68;
                                                    str16 = str82;
                                                    it = it2;
                                                    str20 = str76;
                                                    cursor2 = cursor4;
                                                }
                                            } catch (Throwable th15) {
                                                th = th15;
                                                str31 = str8;
                                                sQLiteDatabase2 = sQLiteDatabase;
                                                th = th;
                                                cursor = cursor4;
                                                str = str31;
                                                cursor.close();
                                                throw th;
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            str21 = str8;
                                            sQLiteDatabase2 = sQLiteDatabase;
                                            cursor = cursor2;
                                            str12 = str21;
                                            th = th;
                                            str = str12;
                                            cursor.close();
                                            throw th;
                                        }
                                    } else {
                                        String str83 = str20;
                                        Cursor cursor6 = cursor2;
                                        String str84 = str73;
                                        C1230nw nwVar4 = nwVar;
                                        String str85 = str69;
                                        str7 = str16;
                                        String str86 = str66;
                                        str = str8;
                                        try {
                                            cursor6.close();
                                            C1230nw nwVar5 = new C1230nw();
                                            int i10 = 0;
                                            zth zth4 = zth2;
                                            while (i10 < nwVar4.mo15537b()) {
                                                str8 = zth4;
                                                String str87 = str71;
                                                String str88 = str67;
                                                String str89 = str70;
                                                String str90 = str68;
                                                String str91 = str85;
                                                String str92 = str83;
                                                String str93 = str84;
                                                String str94 = str86;
                                                String str95 = str49;
                                                String str96 = str74;
                                                String str97 = str72;
                                                String str98 = str75;
                                                C1230nw nwVar6 = nwVar4;
                                                nwVar5.mo15540b(nwVar4.mo15533a(i10), (caae) nwVar4.mo15538b(i10));
                                                i10++;
                                                str68 = str90;
                                                str86 = str94;
                                                str67 = str88;
                                                str83 = str92;
                                                str84 = str93;
                                                str75 = str98;
                                                zth4 = str8;
                                                nwVar4 = nwVar6;
                                                str71 = str87;
                                                str85 = str91;
                                                str74 = str96;
                                                str49 = str95;
                                                str72 = str97;
                                                str70 = str89;
                                            }
                                            C1230nw nwVar7 = new C1230nw();
                                            Cursor query8 = zth4.f55880c.query("DataTypes", new String[]{str49}, null, null, null, null, null, null);
                                            zth zth5 = zth4;
                                            while (query8.moveToNext()) {
                                                try {
                                                    long b5 = ztl.m46302b(query8, str49);
                                                    Object format2 = String.format("DT.%s", str49);
                                                    str8 = zth5;
                                                    query = zth5.f55880c.query(String.format("%s DT JOIN %s F ON (%s = F.%s)", str86, "DataTypeFields", format2, str84), new String[]{str75, str71, str85}, String.format("%s = ?", format2), new String[]{Long.toString(b5)}, null, null, null, null);
                                                    bmxy.m108604b(query.moveToFirst(), "Couldn't find data type with ID %s", b5);
                                                    int count2 = query.getCount();
                                                    caal[] caalArr2 = new caal[count2];
                                                    String c6 = ztl.m46303c(query, str75);
                                                    if (bzzn.m126366b(c6)) {
                                                        caah = bzzn.m126359a(c6);
                                                        query.close();
                                                        str30 = str71;
                                                        str29 = str85;
                                                    } else {
                                                        int i11 = 0;
                                                        while (i11 < count2) {
                                                            int i12 = count2;
                                                            caalArr2[i11] = bzzj.m126351a(ztl.m46303c(query, str71), caak.m126415a(ztl.m46301a(query, str85)));
                                                            query.moveToNext();
                                                            i11++;
                                                            count2 = i12;
                                                            str71 = str71;
                                                            str85 = str85;
                                                        }
                                                        str30 = str71;
                                                        str29 = str85;
                                                        caah = bzzn.m126364b(c6, Arrays.asList(caalArr2));
                                                        query.close();
                                                    }
                                                    nwVar7.mo15540b(b5, caah);
                                                    zth5 = str8;
                                                    str71 = str30;
                                                    str85 = str29;
                                                } catch (Throwable th17) {
                                                    sQLiteDatabase2 = sQLiteDatabase;
                                                    Throwable th18 = th17;
                                                    query8.close();
                                                    throw th18;
                                                }
                                            }
                                            query8.close();
                                            sQLiteDatabase2 = sQLiteDatabase;
                                            try {
                                                sQLiteDatabase2.execSQL(zsy.f55852e);
                                                sQLiteDatabase2.execSQL(zsz.f55855c);
                                                sQLiteDatabase2.execSQL("DROP TABLE DataTypeFields");
                                                sQLiteDatabase2.execSQL("DROP TABLE Applications");
                                                sQLiteDatabase2.execSQL("DROP TABLE DataSourceTypes");
                                                sQLiteDatabase2.execSQL("DROP TABLE Devices");
                                                sQLiteDatabase2.execSQL(zsy.f55849b);
                                                sQLiteDatabase2.execSQL(zsz.f55853a);
                                                sQLiteDatabase2.execSQL(zsy.f55850c);
                                                sQLiteDatabase2.execSQL(zsz.f55854b);
                                                HashMap hashMap2 = new HashMap();
                                                ContentValues contentValues3 = new ContentValues();
                                                int i13 = 0;
                                                while (i13 < nwVar7.mo15537b()) {
                                                    long a7 = nwVar7.mo15533a(i13);
                                                    caah caah3 = (caah) nwVar7.mo15538b(i13);
                                                    Long valueOf = Long.valueOf(a7);
                                                    contentValues3.put(str49, valueOf);
                                                    contentValues3.put(str75, caah3.f172336b);
                                                    contentValues3.put(str83, caah3.mo73642k());
                                                    sQLiteDatabase2.insertOrThrow(str86, null, contentValues3);
                                                    hashMap2.put(caah3.f172336b, valueOf);
                                                    i13++;
                                                    str86 = str86;
                                                    str83 = str83;
                                                }
                                                String str99 = str83;
                                                ContentValues contentValues4 = new ContentValues();
                                                HashMap hashMap3 = new HashMap();
                                                int b6 = nwVar5.mo15537b() - 1;
                                                while (b6 >= 0) {
                                                    long a8 = nwVar5.mo15533a(b6);
                                                    caae caae = (caae) nwVar5.mo15538b(b6);
                                                    Long l = (Long) hashMap3.get(caae.f172326b);
                                                    if (l == null) {
                                                        Long valueOf2 = Long.valueOf(a8);
                                                        contentValues4.put(str49, valueOf2);
                                                        caah caah4 = caae.f172330f;
                                                        if (caah4 == null) {
                                                            caah4 = caah.f172333d;
                                                        }
                                                        str23 = str84;
                                                        contentValues4.put(str23, (Long) hashMap2.get(caah4.f172336b));
                                                        contentValues4.put("identifier", caae.f172326b);
                                                        contentValues4.put(str99, caae.mo73642k());
                                                        sQLiteDatabase2.insertOrThrow("DataSources", null, contentValues4);
                                                        hashMap3.put(caae.f172326b, valueOf2);
                                                        contentValues = contentValues4;
                                                        hashMap = hashMap3;
                                                        str25 = str67;
                                                        str27 = str70;
                                                        str28 = str72;
                                                        str26 = str68;
                                                        str22 = str49;
                                                        str24 = str74;
                                                    } else {
                                                        str23 = str84;
                                                        bnsl bnsl4 = (bnsl) f55874a.mo68388c();
                                                        contentValues = contentValues4;
                                                        hashMap = hashMap3;
                                                        str28 = str72;
                                                        str22 = str49;
                                                        str24 = str74;
                                                        bnsl4.mo68432a(str28, str24, 385, (String) str);
                                                        bnsl4.mo68420a("Removing duplicated data source %s", caae.f172326b);
                                                        long longValue = l.longValue();
                                                        String[] strArr = {Long.toString(a8)};
                                                        str27 = str70;
                                                        sQLiteDatabase2.delete("SyncStatus", str27, strArr);
                                                        str26 = str68;
                                                        sQLiteDatabase2.delete(str26, str27, strArr);
                                                        ContentValues contentValues5 = new ContentValues();
                                                        str25 = str67;
                                                        contentValues5.put(str25, Long.valueOf(longValue));
                                                        sQLiteDatabase2.update("Subscriptions", contentValues5, str27, strArr);
                                                    }
                                                    b6--;
                                                    str70 = str27;
                                                    str68 = str26;
                                                    str67 = str25;
                                                    str74 = str24;
                                                    str84 = str23;
                                                    contentValues4 = contentValues;
                                                    str49 = str22;
                                                    str72 = str28;
                                                    hashMap3 = hashMap;
                                                }
                                                str10 = str67;
                                                str11 = str70;
                                                sQLiteDatabase.setTransactionSuccessful();
                                                m46277b(sQLiteDatabase2, true);
                                                break;
                                            } catch (Throwable th19) {
                                                th = th19;
                                                str = str;
                                                Throwable th20 = th;
                                                m46277b(sQLiteDatabase2, true);
                                                throw th20;
                                            }
                                        } catch (Throwable th21) {
                                            th = th21;
                                            sQLiteDatabase2 = sQLiteDatabase;
                                            Throwable th202 = th;
                                            m46277b(sQLiteDatabase2, true);
                                            throw th202;
                                        }
                                    }
                                }
                            } catch (Throwable th22) {
                                th = th22;
                                sQLiteDatabase2 = sQLiteDatabase3;
                                str21 = str8;
                                cursor = cursor2;
                                str12 = str21;
                                th = th;
                                str = str12;
                                cursor.close();
                                throw th;
                            }
                        } catch (Throwable th23) {
                            th = th23;
                            cursor = query4;
                            sQLiteDatabase2 = sQLiteDatabase3;
                            str12 = str51;
                            th = th;
                            str = str12;
                            cursor.close();
                            throw th;
                        }
                    } catch (Throwable th24) {
                        th = th24;
                        sQLiteDatabase2 = sQLiteDatabase3;
                        str = str51;
                        Throwable th2022 = th;
                        m46277b(sQLiteDatabase2, true);
                        throw th2022;
                    }
                case 28:
                    i3 = i8;
                    str2 = str45;
                    str3 = str46;
                    str8 = str47;
                    int i14 = 2;
                    sQLiteDatabase3.execSQL(zta.f55859d);
                    ContentValues contentValues6 = new ContentValues();
                    String str100 = str48;
                    bxvd da2 = caea.f172784f.mo74144da();
                    ContentValues contentValues7 = contentValues6;
                    String str101 = "_id";
                    query3 = sQLiteDatabase.query("DataSources", new String[]{"_id"}, null, null, null, null, null);
                    bnia c7 = bnic.m109499c(query3.getCount());
                    while (query3.moveToNext()) {
                        String str102 = str40;
                        String str103 = str100;
                        bxvd bxvd2 = da2;
                        ContentValues contentValues8 = contentValues7;
                        String str104 = str101;
                        c7.mo67629b(Long.valueOf(ztl.m46302b(query3, str104)));
                        da2 = bxvd2;
                        str100 = str103;
                        contentValues7 = contentValues8;
                        str40 = str102;
                        str101 = str104;
                        i14 = 2;
                    }
                    bnic a9 = c7.mo67751a();
                    query3.close();
                    long j3 = -1;
                    while (true) {
                        String[] strArr2 = new String[i14];
                        strArr2[0] = str101;
                        strArr2[1] = str38;
                        String str105 = str101;
                        bnic bnic2 = a9;
                        String str106 = str40;
                        Cursor query9 = sQLiteDatabase.query("DataPointRows", strArr2, "_id > ?", new String[]{Long.toString(j3)}, null, null, "_id", Integer.toString(100));
                        if (query9.getCount() == 0) {
                            sQLiteDatabase2 = sQLiteDatabase3;
                            str7 = str106;
                            str11 = str37;
                            str9 = str38;
                            str10 = str39;
                            str = str8;
                            break;
                        } else {
                            while (query9.moveToNext()) {
                                try {
                                    byte[] e = ztl.m46305e(query9, str38);
                                    j3 = ztl.m46302b(query9, str105);
                                    bxvd = da2;
                                    bxvd.f164949b = (bxvk) bxvd.f164949b.mo74142c(4);
                                    bxvd.mo73635b(e, bxus.m123744c());
                                    str36 = str100;
                                    i5 = 0;
                                } catch (bxwf e2) {
                                    i5 = 0;
                                    str36 = str100;
                                    sQLiteDatabase3.delete(str36, "_id = ?", new String[]{Long.toString(j3)});
                                } catch (Throwable th25) {
                                    Throwable th26 = th25;
                                    query9.close();
                                    throw th26;
                                }
                                caea caea = (caea) bxvd.f164949b;
                                if ((caea.f172786a & 2) != 0) {
                                    bnic = bnic2;
                                    if (bnic.contains(Long.valueOf(caea.f172787b))) {
                                        contentValues2 = contentValues7;
                                        contentValues2.put("origin_data_source_id", Long.valueOf(((caea) bxvd.f164949b).f172787b));
                                        contentValues2.put(str38, zrw.m46080a((caaa) ((caea) bxvd.f164949b).f172788c.get(i5), null, null).mo73642k());
                                        String[] strArr3 = new String[1];
                                        strArr3[i5] = Long.toString(j3);
                                        sQLiteDatabase3.update(str36, contentValues2, "_id = ?", strArr3);
                                        contentValues2.clear();
                                        da2 = bxvd;
                                        bnic2 = bnic;
                                        str100 = str36;
                                        contentValues7 = contentValues2;
                                    } else {
                                        contentValues2 = contentValues7;
                                    }
                                } else {
                                    contentValues2 = contentValues7;
                                    bnic = bnic2;
                                }
                                contentValues2.putNull("origin_data_source_id");
                                contentValues2.put(str38, zrw.m46080a((caaa) ((caea) bxvd.f164949b).f172788c.get(i5), null, null).mo73642k());
                                String[] strArr32 = new String[1];
                                strArr32[i5] = Long.toString(j3);
                                sQLiteDatabase3.update(str36, contentValues2, "_id = ?", strArr32);
                                contentValues2.clear();
                                da2 = bxvd;
                                bnic2 = bnic;
                                str100 = str36;
                                contentValues7 = contentValues2;
                            }
                            String str107 = str100;
                            bxvd bxvd3 = da2;
                            ContentValues contentValues9 = contentValues7;
                            bnic bnic3 = bnic2;
                            query9.close();
                            da2 = bxvd3;
                            a9 = bnic3;
                            str100 = str107;
                            contentValues7 = contentValues9;
                            str40 = str106;
                            str101 = str105;
                            i14 = 2;
                        }
                    }
                case 29:
                    i3 = i8;
                    str2 = str45;
                    str3 = str46;
                    str8 = str47;
                    sQLiteDatabase3.execSQL("DROP TABLE IF EXISTS BleCharacteristics");
                    str7 = str40;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    str11 = str37;
                    str9 = str38;
                    str10 = str39;
                    str = str8;
                    break;
                case 30:
                    i3 = i8;
                    str2 = str45;
                    str3 = str46;
                    str8 = str47;
                    sQLiteDatabase3.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT 0", "ChangeLog", "value_timestamp"));
                    str7 = str40;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    str11 = str37;
                    str9 = str38;
                    str10 = str39;
                    str = str8;
                    break;
                case 31:
                    try {
                        i3 = i8;
                        str8 = str47;
                        str3 = str46;
                        str2 = str45;
                    } catch (Exception e3) {
                        i4 = i8;
                        str4 = str45;
                        str5 = str46;
                        str6 = str47;
                        bnsl bnsl5 = (bnsl) f55874a.mo68388c();
                        bnsl5.mo68432a(str4, str5, (int) MfiClientException.TYPE_CARD_NOT_CACHED, str6);
                        bnsl5.mo68409a("Unable to upgrade from v%d. Recreating db.", i);
                        m46279d(sQLiteDatabase);
                        m46274a(3, i, i4, elapsedRealtime);
                        return;
                    }
                    try {
                        Cursor query10 = sQLiteDatabase.query("DataSources", new String[]{"_id", "identifier", str44}, null, null, null, null, null);
                        while (query10.moveToNext()) {
                            try {
                                j = query10.getLong(0);
                                String string = query10.getString(1);
                                caae caae2 = (caae) bxvk.m124016a(caae.f172323i, query10.getBlob(2), bxus.m123744c());
                                String yyf = yyd.m44988a((caaf) caae2).toString();
                                if (!yyf.equals(string) || !yyf.equals(caae2.f172326b)) {
                                    m46275a(sQLiteDatabase3, j);
                                }
                            } catch (bxwf e4) {
                                m46275a(sQLiteDatabase3, j);
                            } catch (Throwable th27) {
                                th4 = th27;
                                if (query10 != null) {
                                    query10.close();
                                }
                                throw th4;
                            }
                        }
                        if (query10 == null) {
                            str7 = str40;
                            sQLiteDatabase2 = sQLiteDatabase3;
                            str11 = str37;
                            str9 = str38;
                            str10 = str39;
                            str = str8;
                            break;
                        } else {
                            query10.close();
                            str7 = str40;
                            sQLiteDatabase2 = sQLiteDatabase3;
                            str11 = str37;
                            str9 = str38;
                            str10 = str39;
                            str = str8;
                            break;
                        }
                    } catch (Exception e5) {
                        str6 = str8;
                        bnsl bnsl52 = (bnsl) f55874a.mo68388c();
                        bnsl52.mo68432a(str4, str5, (int) MfiClientException.TYPE_CARD_NOT_CACHED, str6);
                        bnsl52.mo68409a("Unable to upgrade from v%d. Recreating db.", i);
                        m46279d(sQLiteDatabase);
                        m46274a(3, i, i4, elapsedRealtime);
                        return;
                    } catch (Throwable th28) {
                        bqye.m113761a(th4, th28);
                    }
                    break;
                case 32:
                    if (!cdzv.m135694b()) {
                        i3 = i8;
                        str7 = str40;
                        sQLiteDatabase2 = sQLiteDatabase3;
                        str11 = str37;
                        str10 = str39;
                        str2 = str45;
                        str3 = str46;
                        str = str47;
                        str9 = str38;
                        break;
                    } else {
                        sQLiteDatabase3.execSQL(zsx.f55847a);
                        i3 = i8;
                        str7 = str40;
                        sQLiteDatabase2 = sQLiteDatabase3;
                        str11 = str37;
                        str10 = str39;
                        str2 = str45;
                        str3 = str46;
                        str = str47;
                        str9 = str38;
                        break;
                    }
                case 33:
                    try {
                        if (!cdyu.f181962a.mo6606a().mo78500d()) {
                            i3 = i8;
                            str7 = str40;
                            sQLiteDatabase2 = sQLiteDatabase3;
                            str11 = str37;
                            str10 = str39;
                            str2 = str45;
                            str3 = str46;
                            str = str47;
                            str9 = str38;
                            break;
                        } else {
                            sQLiteDatabase3.execSQL(ztb.f55862c);
                            i3 = i8;
                            str7 = str40;
                            sQLiteDatabase2 = sQLiteDatabase3;
                            str11 = str37;
                            str10 = str39;
                            str2 = str45;
                            str3 = str46;
                            str = str47;
                            str9 = str38;
                            break;
                        }
                    } catch (Exception e6) {
                        i4 = i8;
                        str4 = str45;
                        str5 = str46;
                        str6 = str47;
                        bnsl bnsl522 = (bnsl) f55874a.mo68388c();
                        bnsl522.mo68432a(str4, str5, (int) MfiClientException.TYPE_CARD_NOT_CACHED, str6);
                        bnsl522.mo68409a("Unable to upgrade from v%d. Recreating db.", i);
                        m46279d(sQLiteDatabase);
                        m46274a(3, i, i4, elapsedRealtime);
                        return;
                    }
                default:
                    i3 = i8;
                    str2 = str45;
                    str3 = str46;
                    str = str47;
                    try {
                        throw new IllegalArgumentException(String.format("Missing upgrade step from %s", Integer.valueOf(i3)));
                    } catch (Exception e7) {
                        str6 = str;
                        break;
                    }
            }
            i8 = i3 + 1;
            i7 = i2;
            str37 = str11;
            str39 = str10;
            str38 = str9;
            str42 = str3;
            str41 = str2;
            str40 = str7;
            sQLiteDatabase3 = sQLiteDatabase2;
            str43 = str;
            i6 = i;
        }
        m46274a(2, i, i2, elapsedRealtime);
        bnsl bnsl6 = (bnsl) f55874a.mo68390d();
        bnsl6.mo68432a(str41, str42, 164, str43);
        bnsl6.mo68411a("Upgraded database from v%d to v%d", (int) str, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ztg(Context context, String str, String str2, ytp ytp) {
        super(context, str, "fitness.db", 34, cdyu.f181962a.mo6606a().mo78508l() ? new ztf(context, str2, ytp, str) : new DefaultDatabaseErrorHandler());
        this.f55875b = context;
        this.f55876c = str2;
        this.f55877d = ytp;
        setWriteAheadLoggingEnabled(true);
    }

    /* renamed from: a */
    private final void m46274a(int i, int i2, int i3, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ytq a = this.f55877d.mo30767a(this.f55875b);
        a.mo30762a(this.f55876c);
        a.mo30755a(415);
        a.mo30765d(i);
        a.mo30763b(i2);
        a.mo30764c(i3);
        a.mo30756a(elapsedRealtime - j);
        a.mo30754a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("PRAGMA synchronous=NORMAL;");
    }

    /* renamed from: a */
    private static void m46275a(SQLiteDatabase sQLiteDatabase, long j) {
        String[] strArr = {String.valueOf(j)};
        sQLiteDatabase.delete("DataPointRows", String.format("%s = ?", "data_source_id"), strArr);
        sQLiteDatabase.delete("DataPointRows", String.format("%s = ?", "origin_data_source_id"), strArr);
        sQLiteDatabase.delete("SyncStatus", String.format("%s = ?", "data_source_id"), strArr);
        sQLiteDatabase.delete("Subscriptions", String.format("%s = ?", "data_source_id"), strArr);
        sQLiteDatabase.delete("DataSources", String.format("%s = ?", "_id"), strArr);
    }

    /* renamed from: a */
    private static void m46276a(SQLiteDatabase sQLiteDatabase, boolean z) {
        int i = Build.VERSION.SDK_INT;
        sQLiteDatabase.setForeignKeyConstraintsEnabled(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(zsv.f55837a);
        sQLiteDatabase.execSQL(zsw.f55840a);
        sQLiteDatabase.execSQL(zta.f55856a);
        sQLiteDatabase.execSQL(zsy.f55849b);
        sQLiteDatabase.execSQL(zsz.f55853a);
        sQLiteDatabase.execSQL(ztd.f55867a);
        sQLiteDatabase.execSQL(ztb.f55860a);
        sQLiteDatabase.execSQL(ztc.f55864a);
        if (cdzv.m135694b()) {
            sQLiteDatabase.execSQL(zsx.f55847a);
        }
        sQLiteDatabase.execSQL(zta.f55857b);
        sQLiteDatabase.execSQL(zta.f55858c);
        sQLiteDatabase.execSQL(zsy.f55850c);
        sQLiteDatabase.execSQL(zsz.f55854b);
        sQLiteDatabase.execSQL(zsv.f55838b);
        sQLiteDatabase.execSQL(zsv.f55839c);
        zuw.m46537c(this.f55875b, this.f55876c);
    }
}
