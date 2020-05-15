package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: axze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axze extends srp {

    /* renamed from: a */
    public final Context f96810a;

    /* renamed from: b */
    private final axui f96811b;

    /* renamed from: c */
    private final boolean f96812c;

    /* renamed from: d */
    private final axzt f96813d;

    /* renamed from: a */
    private static void m83585a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 16 + str2.length());
        sb.append("CREATE TABLE ");
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: b */
    private static void m83587b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 16 + str2.length());
        sb.append("DROP ");
        sb.append(str);
        sb.append(" IF EXISTS ");
        sb.append(str2);
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: c */
    private static void m83588c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS dataItemRecords");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS dataItemRecords_PackageDataItem");
    }

    /* renamed from: d */
    private static void m83589d(SQLiteDatabase sQLiteDatabase) {
        m83585a(sQLiteDatabase, "appkeys", "_id INTEGER PRIMARY KEY AUTOINCREMENT,packageName TEXT NOT NULL,signatureDigest TEXT NOT NULL");
        m83585a(sQLiteDatabase, "dataitems", "_id INTEGER PRIMARY KEY AUTOINCREMENT, appkeys_id INTEGER NOT NULL REFERENCES appkeys(_id), host TEXT NOT NULL, path TEXT NOT NULL, seqId INTEGER NOT NULL, deleted INTEGER NOT NULL, sourceNode TEXT NOT NULL, data BLOB, timestampMs INTEGER NOT NULL, assetsPresent INTEGER NOT NULL, v1SourceNode TEXT NOT NULL, v1SeqId INTEGER NOT NULL");
        m83585a(sQLiteDatabase, "assets", "digest TEXT PRIMARY KEY, dataPresent INTEGER NOT NULL DEFAULT 0, timestampMs INTEGER NOT NULL");
        m83585a(sQLiteDatabase, "assetrefs", "assetname TEXT NOT NULL, dataitems_id INTEGER NOT NULL REFERENCES dataitems(_id), assets_digest TEXT NOT NULL REFERENCES assets(digest)");
        m83585a(sQLiteDatabase, "assetsacls", "appkeys_id INTEGER NOT NULL REFERENCES appkeys(_id), assets_digest TEXT NOT NULL");
        m83585a(sQLiteDatabase, "nodeinfo", "node TEXT NOT NULL PRIMARY KEY, seqId INTEGER, lastActivityMs INTEGER");
        sQLiteDatabase.execSQL("CREATE VIEW appKeyDataItems AS SELECT appkeys._id AS appkeys_id, appkeys.packageName AS packageName, appkeys.signatureDigest AS signatureDigest, dataitems._id AS dataitems_id, dataitems.host AS host, dataitems.path AS path, dataitems.seqId AS seqId, dataitems.deleted AS deleted, dataitems.sourceNode AS sourceNode, dataitems.data AS data, dataitems.timestampMs AS timestampMs, dataitems.assetsPresent AS assetsPresent, dataitems.v1SourceNode AS v1SourceNode, dataitems.v1SeqId AS v1SeqId FROM appkeys, dataitems WHERE appkeys._id=dataitems.appkeys_id");
        sQLiteDatabase.execSQL("CREATE VIEW appKeyAcls AS SELECT appkeys._id AS appkeys_id, appkeys.packageName AS packageName, appkeys.signatureDigest AS signatureDigest, assetsacls.assets_digest AS assets_digest FROM appkeys, assetsacls WHERE _id=appkeys_id");
        sQLiteDatabase.execSQL("CREATE VIEW dataItemsAndAssets AS SELECT appKeyDataItems.packageName AS packageName, appKeyDataItems.signatureDigest AS signatureDigest, appKeyDataItems.dataitems_id AS dataitems_id, appKeyDataItems.host AS host, appKeyDataItems.path AS path, appKeyDataItems.seqId AS seqId, appKeyDataItems.deleted AS deleted, appKeyDataItems.sourceNode AS sourceNode, appKeyDataItems.data AS data, appKeyDataItems.timestampMs AS timestampMs, appKeyDataItems.assetsPresent AS assetsPresent, assetrefs.assetname AS assetname, assetrefs.assets_digest AS assets_digest, appKeyDataItems.v1SourceNode AS v1SourceNode, appKeyDataItems.v1SeqId AS v1SeqId FROM appKeyDataItems LEFT OUTER JOIN assetrefs ON appKeyDataItems.dataitems_id=assetrefs.dataitems_id");
        sQLiteDatabase.execSQL("CREATE VIEW assetsReadyStatus AS SELECT dataitems_id AS dataitems_id,  COUNT(*) = SUM(dataPresent) AS nowReady, assetsPresent AS markedReady FROM assetrefs, dataitems LEFT OUTER JOIN assets ON assetrefs.assets_digest=assets.digest WHERE assetrefs.dataitems_id=dataitems._id GROUP BY dataitems_id;");
        m83586a(sQLiteDatabase, true, "appkeys", "NAME_AND_SIG", "packageName", "signatureDigest");
        m83586a(sQLiteDatabase, true, "assetrefs", "ASSET_REFS", "assets_digest", "dataitems_id", "assetname");
        m83586a(sQLiteDatabase, false, "assetrefs", "DATAITEM_ID", "dataitems_id");
        m83586a(sQLiteDatabase, true, "assets", "DIGEST", "digest");
        m83586a(sQLiteDatabase, true, "assetsacls", "APPKEY_AND_DIGEST", "appkeys_id", "assets_digest");
        m83586a(sQLiteDatabase, true, "dataitems", "APPPKEY_PATH_AND_HOST", "appkeys_id", "path", "host");
        m83586a(sQLiteDatabase, true, "dataitems", "SOURCENODE_AND_SEQID", "sourceNode", "seqId");
        m83586a(sQLiteDatabase, true, "dataitems", "SOURCENODE_DELETED_AND_SEQID", "sourceNode", "deleted", "seqId");
    }

    public final synchronized SQLiteDatabase getReadableDatabase() {
        try {
        } catch (axzd e) {
            Log.e("DataItems", "Error during database upgrade, the database will be cleared", e);
            this.f96810a.deleteDatabase("node.db");
            return super.getReadableDatabase();
        }
        return super.getReadableDatabase();
    }

    public final synchronized SQLiteDatabase getWritableDatabase() {
        try {
        } catch (axzd e) {
            Log.e("DataItems", "Error during database upgrade, the database will be cleared", e);
            this.f96810a.deleteDatabase("node.db");
            return super.getWritableDatabase();
        }
        return super.getWritableDatabase();
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new axzd("downgrade is not supported");
    }

    /* JADX INFO: finally extract failed */
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
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x080a, code lost:
        if (r2 == 9) goto L_0x080c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x06f7  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0804  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0814  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x081d A[SYNTHETIC, Splitter:B:211:0x081d] */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        axze axze;
        String str8;
        String str9;
        int i4;
        int columnIndex;
        HashSet hashSet;
        String str10;
        HashMap hashMap;
        int i5;
        File[] fileArr;
        HashMap hashMap2;
        HashSet hashSet2;
        HashSet hashSet3;
        int i6;
        HashSet hashSet4;
        HashSet hashSet5;
        File[] fileArr2;
        int i7;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i8 = i;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Upgrade Wear db from version ");
        sb.append(i8);
        sb.append(" to ");
        sb.append(i2);
        Log.w("DataItems", sb.toString());
        if (i8 < 6) {
            if (Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "upgradeFromPre6To8");
            }
            m83588c(sQLiteDatabase);
            m83589d(sQLiteDatabase);
            i3 = 8;
        } else {
            i3 = i8;
        }
        String str11 = "seqId";
        String str12 = "dataitems";
        String str13 = "appkeys_id";
        if (i3 == 6) {
            if (Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "upgradeFrom6To8");
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "create the new tables and views");
            }
            m83589d(sQLiteDatabase);
            if (Log.isLoggable("DataItems", 3)) {
                Log.d("DataItems", "process the app keys");
            }
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = hashMap3;
            String str14 = "path";
            String str15 = "host";
            String str16 = "sourceNode";
            String str17 = str11;
            String str18 = "dataitems_id";
            ContentValues contentValues = new ContentValues();
            HashMap hashMap6 = hashMap4;
            String str19 = "DataItems";
            String str20 = str12;
            String str21 = str13;
            Cursor query = sQLiteDatabase.query(true, "dataItemRecords", new String[]{"packageName, signatureDigest"}, null, null, null, null, "packageName, signatureDigest", null);
            while (query.moveToNext()) {
                try {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    axue a = axue.m83239a(string, string2);
                    ContentValues contentValues2 = contentValues;
                    contentValues2.put("packageName", string);
                    contentValues2.put("signatureDigest", string2);
                    Long valueOf = Long.valueOf(sQLiteDatabase2.insert("appkeys", "packageName", contentValues2));
                    HashMap hashMap7 = hashMap5;
                    hashMap7.put(a, valueOf);
                    HashMap hashMap8 = hashMap6;
                    hashMap8.put(valueOf, new HashMap());
                    String str22 = str19;
                    if (Log.isLoggable(str22, 3)) {
                        String valueOf2 = String.valueOf(a);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 3);
                        sb2.append("   ");
                        sb2.append(valueOf2);
                        Log.d(str22, sb2.toString());
                        str19 = str22;
                        hashMap6 = hashMap8;
                        hashMap5 = hashMap7;
                        contentValues = contentValues2;
                    } else {
                        str19 = str22;
                        hashMap6 = hashMap8;
                        hashMap5 = hashMap7;
                        contentValues = contentValues2;
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            HashMap hashMap9 = hashMap5;
            HashMap hashMap10 = hashMap6;
            ContentValues contentValues3 = contentValues;
            String str23 = str19;
            query.close();
            if (Log.isLoggable(str23, 3)) {
                Log.d(str23, "read the old assets and save any found");
            }
            HashSet hashSet6 = new HashSet();
            HashSet hashSet7 = new HashSet();
            HashSet hashSet8 = new HashSet();
            File[] listFiles = new File(this.f96810a.getFilesDir(), "assets").listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i9 = 0;
                while (i9 < length) {
                    File file = listFiles[i9];
                    if (!file.isDirectory()) {
                        fileArr = listFiles;
                        hashSet3 = hashSet7;
                        hashSet2 = hashSet6;
                        hashMap2 = hashMap10;
                        i6 = length;
                    } else {
                        File[] listFiles2 = file.listFiles();
                        if (listFiles2 != null) {
                            fileArr = listFiles;
                            int length2 = listFiles2.length;
                            hashMap2 = hashMap10;
                            int i10 = 0;
                            while (i10 < length2) {
                                int i11 = length2;
                                File file2 = listFiles2[i10];
                                if (file2.isFile()) {
                                    String name = file2.getName();
                                    i7 = length;
                                    if (name.endsWith(".asset")) {
                                        fileArr2 = listFiles2;
                                        String substring = name.substring(0, name.length() - 6);
                                        try {
                                            this.f96811b.mo53581a(substring, file2);
                                            hashSet6.add(substring);
                                            hashSet7.add(substring);
                                            hashSet5 = hashSet7;
                                            hashSet4 = hashSet6;
                                        } catch (IOException e) {
                                            String valueOf3 = String.valueOf(file2);
                                            hashSet4 = hashSet6;
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(substring).length() + 30 + String.valueOf(valueOf3).length());
                                            sb3.append("error saving asset ");
                                            sb3.append(substring);
                                            sb3.append(" from file ");
                                            sb3.append(valueOf3);
                                            Log.w(str23, sb3.toString(), e);
                                            hashSet5 = hashSet7;
                                        }
                                    } else {
                                        hashSet4 = hashSet6;
                                        fileArr2 = listFiles2;
                                        if (name.endsWith(".acl")) {
                                            String substring2 = name.substring(0, name.length() - 4);
                                            try {
                                                byte[] a2 = srz.m36174a(file2);
                                                file2.delete();
                                                for (ayec ayec : ((ayeb) bxvk.m124014a(ayeb.f97275b, a2)).f97277a) {
                                                    hashSet8.add(Pair.create(axue.m83239a(ayec.f97282b, ayec.f97283c), substring2));
                                                    hashSet7.add(substring2);
                                                }
                                                hashSet5 = hashSet7;
                                            } catch (IOException e2) {
                                                String valueOf4 = String.valueOf(file2);
                                                hashSet5 = hashSet7;
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(substring2).length() + 34 + String.valueOf(valueOf4).length());
                                                sb4.append("error parsing asset acl");
                                                sb4.append(substring2);
                                                sb4.append(" from file ");
                                                sb4.append(valueOf4);
                                                Log.w(str23, sb4.toString(), e2);
                                            }
                                        } else {
                                            hashSet5 = hashSet7;
                                        }
                                    }
                                } else {
                                    hashSet5 = hashSet7;
                                    hashSet4 = hashSet6;
                                    i7 = length;
                                    fileArr2 = listFiles2;
                                }
                                i10++;
                                length2 = i11;
                                length = i7;
                                listFiles2 = fileArr2;
                                hashSet7 = hashSet5;
                                hashSet6 = hashSet4;
                            }
                            hashSet3 = hashSet7;
                            hashSet2 = hashSet6;
                            i6 = length;
                            file.delete();
                        } else {
                            fileArr = listFiles;
                            hashSet3 = hashSet7;
                            hashSet2 = hashSet6;
                            hashMap2 = hashMap10;
                            i6 = length;
                            file.delete();
                        }
                    }
                    i9++;
                    listFiles = fileArr;
                    length = i6;
                    hashSet7 = hashSet3;
                    hashSet6 = hashSet2;
                    hashMap10 = hashMap2;
                }
            }
            HashSet hashSet9 = hashSet7;
            HashSet hashSet10 = hashSet6;
            HashMap hashMap11 = hashMap10;
            if (Log.isLoggable(str23, 3)) {
                Log.d(str23, "write the asset acls");
            }
            contentValues3.clear();
            Iterator it = hashSet8.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                axue axue = (axue) pair.first;
                String str24 = (String) pair.second;
                if (hashMap9.containsKey(axue)) {
                    String str25 = str21;
                    contentValues3.put(str25, Long.valueOf(((Long) hashMap9.get(axue)).longValue()));
                    contentValues3.put("assets_digest", str24);
                    sQLiteDatabase2.insert("assetsacls", str25, contentValues3);
                    if (Log.isLoggable(str23, 3)) {
                        String valueOf5 = String.valueOf(axue);
                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 18 + String.valueOf(str24).length());
                        sb5.append("  added acl for ");
                        sb5.append(valueOf5);
                        sb5.append(", ");
                        sb5.append(str24);
                        Log.d(str23, sb5.toString());
                        str21 = str25;
                    } else {
                        str21 = str25;
                    }
                } else if (Log.isLoggable(str23, 3)) {
                    String valueOf6 = String.valueOf(axue);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 55);
                    sb6.append("  acl processing encountered unknown appkey, skipping: ");
                    sb6.append(valueOf6);
                    Log.d(str23, sb6.toString());
                }
            }
            str2 = str21;
            if (Log.isLoggable(str23, 3)) {
                Log.d(str23, "reading dataitemrecords for data");
            }
            contentValues3.clear();
            ContentValues contentValues4 = new ContentValues();
            HashSet hashSet11 = hashSet9;
            HashSet hashSet12 = hashSet10;
            String str26 = str23;
            HashMap hashMap12 = hashMap11;
            HashMap hashMap13 = hashMap9;
            Cursor query2 = sQLiteDatabase.query("dataItemRecords", null, null, null, null, null, null);
            try {
                columnIndex = query2.getColumnIndex("content");
                while (query2.moveToNext()) {
                    hashSet = hashSet12;
                    str10 = str26;
                    ayez ayez = (ayez) bxvk.m124014a(ayez.f97415i, query2.getBlob(columnIndex));
                    Uri parse = Uri.parse(ayez.f97419c);
                    long longValue = ((Long) hashMap13.get(axue.m83239a(ayez.f97417a, ayez.f97418b))).longValue();
                    Iterator it2 = ayez.f97424h.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            hashMap = hashMap13;
                            i5 = 0;
                            break;
                        }
                        hashMap = hashMap13;
                        ayee ayee = ((ayef) it2.next()).f97295c;
                        if (ayee == null) {
                            ayee = ayee.f97286c;
                        }
                        if (!hashSet.contains(ayee.f97289b)) {
                            i5 = 1;
                            break;
                        }
                        hashMap13 = hashMap;
                    }
                    Long valueOf7 = Long.valueOf(longValue);
                    contentValues3.put(str2, valueOf7);
                    String str27 = str15;
                    contentValues3.put(str27, parse.getHost());
                    String str28 = str14;
                    contentValues3.put(str28, parse.getPath());
                    int i12 = columnIndex;
                    contentValues3.put("data", ayez.f97420d.mo73780k());
                    hashSet12 = hashSet;
                    String str29 = str17;
                    contentValues3.put(str29, Long.valueOf(ayez.f97421e));
                    contentValues3.put("deleted", Integer.valueOf(ayez.f97422f ? 1 : 0));
                    String str30 = str16;
                    contentValues3.put(str30, ayez.f97423g);
                    contentValues3.put("assetsPresent", Integer.valueOf(i5 ^ 1));
                    contentValues3.put("timestampMs", Long.valueOf(currentTimeMillis));
                    contentValues3.put("v1SourceNode", "---");
                    contentValues3.put("v1SeqId", (Integer) -1);
                    String str31 = str20;
                    long insert = sQLiteDatabase2.insert(str31, str2, contentValues3);
                    HashMap hashMap14 = hashMap12;
                    ContentValues contentValues5 = contentValues3;
                    ((Map) hashMap12.get(valueOf7)).put(ayez.f97419c, Long.valueOf(insert));
                    Iterator it3 = ayez.f97424h.iterator();
                    while (it3.hasNext()) {
                        ayef ayef = (ayef) it3.next();
                        ayee ayee2 = ayef.f97295c;
                        if (ayee2 == null) {
                            ayee2 = ayee.f97286c;
                        }
                        hashSet11.add(ayee2.f97289b);
                        hashSet11 = hashSet11;
                        String str32 = str18;
                        contentValues4.put(str32, Long.valueOf(insert));
                        Iterator it4 = it3;
                        contentValues4.put("assetname", ayef.f97294b);
                        ayee ayee3 = ayef.f97295c;
                        if (ayee3 == null) {
                            ayee3 = ayee.f97286c;
                        }
                        contentValues4.put("assets_digest", ayee3.f97289b);
                        sQLiteDatabase2.insert("assetrefs", str32, contentValues4);
                        str18 = str32;
                        it3 = it4;
                    }
                    str20 = str31;
                    str26 = str10;
                    str17 = str29;
                    str16 = str30;
                    str14 = str28;
                    str15 = str27;
                    columnIndex = i12;
                    hashMap13 = hashMap;
                    hashMap12 = hashMap14;
                    contentValues3 = contentValues5;
                }
                query2.close();
                str6 = str26;
                if (Log.isLoggable(str6, 3)) {
                    Log.d(str6, "write the assets table");
                }
                contentValues3.clear();
                Iterator it5 = hashSet11.iterator();
                while (it5.hasNext()) {
                    String str33 = (String) it5.next();
                    contentValues3.put("digest", str33);
                    contentValues3.put("dataPresent", Integer.valueOf(hashSet12.contains(str33) ? 1 : 0));
                    contentValues3.put("timestampMs", Long.valueOf(currentTimeMillis));
                    sQLiteDatabase2.insert("assets", "digest", contentValues3);
                }
                if (Log.isLoggable(str6, 3)) {
                    Log.d(str6, "drop old tables");
                }
                m83588c(sQLiteDatabase);
                str4 = str14;
                str3 = str15;
                str5 = str16;
                str11 = str17;
                str = str18;
                str7 = str20;
                i3 = 8;
            } catch (bxwf e3) {
                HashMap hashMap15 = hashMap13;
                int i13 = columnIndex;
                hashSet12 = hashSet;
                ContentValues contentValues6 = contentValues3;
                String str34 = str14;
                String str35 = str15;
                String str36 = str16;
                String str37 = str17;
                String str38 = str18;
                String str39 = str20;
                HashMap hashMap16 = hashMap12;
                Log.e(str10, "Invalid dataItem format", e3);
                str20 = str39;
                str26 = str10;
                str17 = str37;
                str16 = str36;
                str14 = str34;
                str15 = str35;
                str18 = str38;
                columnIndex = i13;
                hashMap13 = hashMap15;
                hashMap12 = hashMap16;
                contentValues3 = contentValues6;
            } catch (Throwable th2) {
                query2.close();
                throw th2;
            }
        } else {
            str7 = str12;
            str4 = "path";
            str3 = "host";
            str = "dataitems_id";
            str5 = "sourceNode";
            str6 = "DataItems";
            str2 = str13;
        }
        String str40 = str;
        String str41 = str11;
        String str42 = "index";
        if (i3 == 7) {
            if (Log.isLoggable(str6, 3)) {
                Log.d(str6, "upgradeFrom7To8");
            }
            try {
                sQLiteDatabase2.execSQL("savepoint version7");
                m83587b(sQLiteDatabase2, str42, "appkeys_NAME_AND_SIG");
                m83587b(sQLiteDatabase2, str42, "assetrefs_ASSET_REFS");
                m83587b(sQLiteDatabase2, str42, "assets_DIGEST");
                m83587b(sQLiteDatabase2, str42, "assetsacls_APPKEY_AND_DIGEST");
                m83587b(sQLiteDatabase2, str42, "dataitems_APPKEY_HOST_AND_PATH");
                m83587b(sQLiteDatabase2, "view", "appKeyDataItems");
                m83587b(sQLiteDatabase2, "view", "appKeyAcls");
                m83587b(sQLiteDatabase2, "view", "assetsReadyStatus");
                m83587b(sQLiteDatabase2, "view", "dataItemsAndAssets");
                sQLiteDatabase2.execSQL("alter table appkeys rename to appkeys_old");
                sQLiteDatabase2.execSQL("alter table assets rename to assets_old");
                sQLiteDatabase2.execSQL("alter table assetrefs rename to assetrefs_old");
                sQLiteDatabase2.execSQL("alter table assetsacls rename to assetsacls_old");
                sQLiteDatabase2.execSQL("alter table dataitems rename to dataitems_old");
                m83589d(sQLiteDatabase);
                sQLiteDatabase2.execSQL("insert into appkeys select * from appkeys_old");
                sQLiteDatabase2.execSQL("insert into assets select * from assets_old");
                sQLiteDatabase2.execSQL("insert into assetrefs select * from assetrefs_old");
                sQLiteDatabase2.execSQL("insert into assetsacls select * from assetsacls_old");
                sQLiteDatabase2.execSQL("insert into dataitems select *, '---', -1 from dataitems_old");
                sQLiteDatabase2.execSQL("drop table appkeys_old");
                sQLiteDatabase2.execSQL("drop table assets_old");
                sQLiteDatabase2.execSQL("drop table assetrefs_old");
                sQLiteDatabase2.execSQL("drop table assetsacls_old");
                sQLiteDatabase2.execSQL("drop table dataitems_old");
                i3 = 8;
                axze = this;
            } catch (SQLiteException e4) {
                try {
                    Log.e(str6, "wearable database upgrade failed, clearing data");
                    sQLiteDatabase2.execSQL(";rollback to version7");
                    m83587b(sQLiteDatabase2, str42, "appkeys_NAME_AND_SIG");
                    m83587b(sQLiteDatabase2, str42, "assetrefs_ASSET_REFS");
                    m83587b(sQLiteDatabase2, str42, "assets_DIGEST");
                    m83587b(sQLiteDatabase2, str42, "assetsacls_APPKEY_AND_DIGEST");
                    m83587b(sQLiteDatabase2, str42, "dataitems_APPKEY_HOST_AND_PATH");
                    m83587b(sQLiteDatabase2, "view", "appKeyDataItems");
                    m83587b(sQLiteDatabase2, "view", "appKeyAcls");
                    m83587b(sQLiteDatabase2, "view", "assetsReadyStatus");
                    m83587b(sQLiteDatabase2, "view", "dataItemsAndAssets");
                    sQLiteDatabase2.execSQL("drop table appkeys");
                    sQLiteDatabase2.execSQL("drop table assets");
                    sQLiteDatabase2.execSQL("drop table assetrefs");
                    sQLiteDatabase2.execSQL("drop table assetsacls");
                    sQLiteDatabase2.execSQL("drop table dataitems");
                    m83589d(sQLiteDatabase);
                    axze = this;
                    try {
                        if (axze.f96812c) {
                            Log.e(str6, "wearable database upgrade failed, clearing device configs");
                            try {
                                ayfm.m83927a(axze.f96810a).getWritableDatabase().execSQL("delete from connectionConfigurations");
                                i3 = 8;
                            } catch (Exception e5) {
                                Log.e(str6, "failed to clear device configs", e5);
                                i3 = 8;
                            }
                        }
                    } catch (Exception e6) {
                        e = e6;
                        Log.e(str6, "failed to clear data", e);
                        sQLiteDatabase2.execSQL(";rollback to version7");
                        i3 = 8;
                        if (i3 == 8) {
                        }
                        if (Log.isLoggable(str9, 3)) {
                        }
                        if (i4 >= 8) {
                        }
                        sQLiteDatabase2.setVersion(10);
                    }
                } catch (Exception e7) {
                    e = e7;
                    axze = this;
                    Log.e(str6, "failed to clear data", e);
                    sQLiteDatabase2.execSQL(";rollback to version7");
                    i3 = 8;
                    if (i3 == 8) {
                    }
                    if (Log.isLoggable(str9, 3)) {
                    }
                    if (i4 >= 8) {
                    }
                    sQLiteDatabase2.setVersion(10);
                }
                i3 = 8;
            }
        } else {
            axze = this;
        }
        if (i3 == 8) {
            if (Log.isLoggable(str6, 3)) {
                Log.d(str6, "upgradeFrom8To9");
            }
            int i14 = i;
            String str43 = str6;
            if (i14 == 8) {
                try {
                    m83587b(sQLiteDatabase2, str42, "dataitems_APPKEY_HOST_AND_PATH");
                    m83587b(sQLiteDatabase2, "view", "appKeyDataItems");
                    m83587b(sQLiteDatabase2, "view", "dataItemsAndAssets");
                    sQLiteDatabase2.execSQL("alter table dataitems rename to dataitems_old");
                    m83585a(sQLiteDatabase2, str7, "_id INTEGER PRIMARY KEY AUTOINCREMENT, appkeys_id INTEGER NOT NULL REFERENCES appkeys(_id), host TEXT NOT NULL, path TEXT NOT NULL, seqId INTEGER NOT NULL, deleted INTEGER NOT NULL, sourceNode TEXT NOT NULL, data BLOB, timestampMs INTEGER NOT NULL, assetsPresent INTEGER NOT NULL, v1SourceNode TEXT NOT NULL, v1SeqId INTEGER NOT NULL");
                    sQLiteDatabase2.execSQL("insert into dataitems select *, '---', -1 from dataitems_old");
                    sQLiteDatabase2.execSQL("drop table dataitems_old");
                    sQLiteDatabase2.execSQL("CREATE VIEW appKeyDataItems AS SELECT appkeys._id AS appkeys_id, appkeys.packageName AS packageName, appkeys.signatureDigest AS signatureDigest, dataitems._id AS dataitems_id, dataitems.host AS host, dataitems.path AS path, dataitems.seqId AS seqId, dataitems.deleted AS deleted, dataitems.sourceNode AS sourceNode, dataitems.data AS data, dataitems.timestampMs AS timestampMs, dataitems.assetsPresent AS assetsPresent, dataitems.v1SourceNode AS v1SourceNode, dataitems.v1SeqId AS v1SeqId FROM appkeys, dataitems WHERE appkeys._id=dataitems.appkeys_id");
                    sQLiteDatabase2.execSQL("CREATE VIEW dataItemsAndAssets AS SELECT appKeyDataItems.packageName AS packageName, appKeyDataItems.signatureDigest AS signatureDigest, appKeyDataItems.dataitems_id AS dataitems_id, appKeyDataItems.host AS host, appKeyDataItems.path AS path, appKeyDataItems.seqId AS seqId, appKeyDataItems.deleted AS deleted, appKeyDataItems.sourceNode AS sourceNode, appKeyDataItems.data AS data, appKeyDataItems.timestampMs AS timestampMs, appKeyDataItems.assetsPresent AS assetsPresent, assetrefs.assetname AS assetname, assetrefs.assets_digest AS assets_digest, appKeyDataItems.v1SourceNode AS v1SourceNode, appKeyDataItems.v1SeqId AS v1SeqId FROM appKeyDataItems LEFT OUTER JOIN assetrefs ON appKeyDataItems.dataitems_id=assetrefs.dataitems_id");
                    m83586a(sQLiteDatabase2, true, str7, "APPKEY_HOST_AND_PATH", str2, str3, str4);
                    m83586a(sQLiteDatabase2, true, str7, "SOURCENODE_AND_SEQID", str5, str41);
                    m83586a(sQLiteDatabase2, true, str7, "SOURCENODE_DELETED_AND_SEQID", str5, "deleted", str41);
                    m83586a(sQLiteDatabase2, false, "assetrefs", "DATAITEM_ID", str40);
                    m83585a(sQLiteDatabase2, "nodeinfo", "node TEXT NOT NULL PRIMARY KEY, seqId INTEGER, lastActivityMs INTEGER");
                } catch (SQLiteException e8) {
                    throw new axzd(e8);
                }
            }
            String[] strArr = {axze.f96813d.mo53808b().f96814a};
            sQLiteDatabase2.execSQL("update dataitems set v1SourceNode = sourceNode");
            sQLiteDatabase2.execSQL("update dataitems set v1SeqId = seqId");
            sQLiteDatabase2.execSQL("update dataitems set sourceNode = ?", strArr);
            sQLiteDatabase2.execSQL("insert into nodeinfo select ?, max(seqid), 0 from dataitems", strArr);
            try {
                SharedPreferences sharedPreferences = axze.f96810a.getSharedPreferences("wearable.data_transport.settings", 0);
                for (String str44 : sharedPreferences.getAll().keySet()) {
                    str8 = str42;
                    try {
                        long j = sharedPreferences.getLong(str44, -1);
                        StringBuilder sb7 = new StringBuilder(String.valueOf(str44).length() + 56);
                        sb7.append("insert into nodeinfo values('");
                        sb7.append(str44);
                        sb7.append("', ");
                        sb7.append(j);
                        sb7.append(", 0)");
                        sQLiteDatabase2.execSQL(sb7.toString());
                        str42 = str8;
                    } catch (Exception e9) {
                        e = e9;
                        str9 = str43;
                        Log.w(str9, "Failed to initialize sync table", e);
                        i4 = i14;
                        if (Log.isLoggable(str9, 3)) {
                        }
                        if (i4 >= 8) {
                        }
                        sQLiteDatabase2.setVersion(10);
                    }
                }
                str8 = str42;
                i4 = i14;
                str9 = str43;
            } catch (Exception e10) {
                e = e10;
                str8 = str42;
                str9 = str43;
                Log.w(str9, "Failed to initialize sync table", e);
                i4 = i14;
                if (Log.isLoggable(str9, 3)) {
                }
                if (i4 >= 8) {
                }
                sQLiteDatabase2.setVersion(10);
            }
        } else {
            i4 = i;
            str9 = str6;
            str8 = str42;
        }
        if (Log.isLoggable(str9, 3)) {
            Log.d(str9, "upgradeFrom9To10");
        }
        if (i4 >= 8) {
            try {
                m83587b(sQLiteDatabase2, str8, "dataitems_APPKEY_HOST_AND_PATH");
                m83586a(sQLiteDatabase2, true, str7, "APPPKEY_PATH_AND_HOST", str2, str4, str3);
            } catch (SQLiteException e11) {
                throw new axzd(e11);
            }
        }
        sQLiteDatabase2.setVersion(10);
    }

    public axze(Context context, String str, axzt axzt, axui axui, boolean z) {
        super(context, str, str, 10);
        this.f96810a = context;
        this.f96813d = axzt;
        this.f96811b = axui;
        this.f96812c = z;
    }

    /* renamed from: a */
    private static void m83586a(SQLiteDatabase sQLiteDatabase, boolean z, String str, String str2, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE ");
        if (z) {
            sb.append("UNIQUE ");
        }
        sb.append("INDEX ");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append(" ON ");
        sb.append(str);
        sb.append(" (");
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(strArr[i]);
        }
        sb.append(");");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        m83589d(sQLiteDatabase);
    }
}
