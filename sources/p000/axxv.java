package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.util.TimingLogger;
import com.google.android.gms.common.data.DataHolder;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: axxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axxv implements ayjm, ayjh {

    /* renamed from: a */
    public static axxv f96690a;

    /* renamed from: A */
    private long f96691A = 1000;

    /* renamed from: B */
    private long f96692B;

    /* renamed from: C */
    private final Object f96693C = new Object();

    /* renamed from: b */
    public final Context f96694b;

    /* renamed from: c */
    public final axze f96695c;

    /* renamed from: d */
    public final axui f96696d;

    /* renamed from: e */
    public final axuo f96697e;

    /* renamed from: f */
    public final AtomicInteger f96698f = new AtomicInteger(0);

    /* renamed from: g */
    public final AtomicInteger f96699g = new AtomicInteger(0);

    /* renamed from: h */
    public final Set f96700h = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: i */
    public final Set f96701i = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: j */
    public final ayjm f96702j = new axxn(this);

    /* renamed from: k */
    final qxh f96703k;

    /* renamed from: l */
    final qxh f96704l;

    /* renamed from: m */
    final qxh f96705m;

    /* renamed from: n */
    final qxh f96706n;

    /* renamed from: o */
    final qxh f96707o;

    /* renamed from: p */
    final qxh f96708p;

    /* renamed from: q */
    public long f96709q = 0;

    /* renamed from: r */
    public BroadcastReceiver f96710r;

    /* renamed from: s */
    public final axzt f96711s;

    /* renamed from: t */
    private final SharedPreferences f96712t;

    /* renamed from: u */
    private final axxd f96713u;

    /* renamed from: v */
    private final axxm f96714v;

    /* renamed from: w */
    private final LinkedBlockingQueue f96715w = new LinkedBlockingQueue();

    /* renamed from: x */
    private final boolean f96716x;

    /* renamed from: y */
    private final ExecutorService f96717y;

    /* renamed from: z */
    private final AtomicInteger f96718z = new AtomicInteger(0);

    public axxv(Context context, sqv sqv, boolean z, axzt axzt, axze axze, SharedPreferences sharedPreferences, axui axui, axuo axuo, axxd axxd) {
        this.f96716x = z;
        sdo.m34959a(context);
        this.f96694b = context;
        sdo.m34959a(sqv);
        sdo.m34959a(axzt);
        this.f96711s = axzt;
        sdo.m34959a(axze);
        this.f96695c = axze;
        sdo.m34959a(sharedPreferences);
        this.f96712t = sharedPreferences;
        sdo.m34959a(axui);
        this.f96696d = axui;
        sdo.m34959a(axuo);
        this.f96697e = axuo;
        sdo.m34959a(axxd);
        this.f96713u = axxd;
        this.f96714v = new axxm(this, this.f96695c, this.f96715w, this.f96718z, this.f96716x);
        ExecutorService b = adzl.f62962b.mo25879b(2);
        this.f96717y = b;
        b.submit(this.f96714v);
        axty axty = axty.f96348a;
        this.f96703k = axty.mo53544a("dataservice-set-dataitem");
        this.f96704l = axty.mo53544a("dataservice-delete-dataitems");
        this.f96705m = axty.mo53544a("dataservice-dataitems-changed");
        this.f96706n = axty.mo53544a("dataservice-dataitems-purged");
        this.f96707o = axty.mo53544a("dataservice-gc-deleted-dataitems-success");
        this.f96708p = axty.mo53544a("dataservice-gc-deleted-dataitems-failure");
    }

    /* renamed from: a */
    static final long m83488a(SQLiteDatabase sQLiteDatabase, axue axue) {
        try {
            return DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT _id FROM appkeys WHERE packageName=? AND signatureDigest=?", new String[]{axue.f96377a, axue.f96379c});
        } catch (SQLiteDoneException e) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("packageName", axue.f96377a);
            contentValues.put("signatureDigest", axue.f96379c);
            return sQLiteDatabase.insert("appkeys", "packageName", contentValues);
        }
    }

    /* renamed from: b */
    public static String m83503b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11));
    }

    /* renamed from: c */
    private final Cursor m83505c(axue axue, Uri uri, boolean z) {
        String str;
        String str2 = null;
        if (uri != null) {
            str2 = m83493a(uri);
            str = uri.getPath();
        } else {
            str = null;
        }
        if (Log.isLoggable("DataItems", 3)) {
            String valueOf = String.valueOf(axue);
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34 + String.valueOf(valueOf2).length());
            sb.append("getDataItemsByUriHelper: ");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(", ");
            sb.append(z);
            Log.d("DataItems", sb.toString());
        }
        Cursor a = m83490a(this.f96695c.getReadableDatabase(), axue, str2, str, false, true, z);
        m83500a(axue, str2, str, z);
        return a;
    }

    /* renamed from: d */
    private static String m83506d(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace("[", "[[]").replace("*", "[*]").replace("?", "[?]");
        if (replace.isEmpty() || replace.charAt(replace.length() - 1) != '/') {
            return String.valueOf(replace).concat("/*");
        }
        return String.valueOf(replace).concat("*");
    }

    /* renamed from: g */
    private final void m83508g() {
        if (chnj.m149036l()) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (this.f96709q >= 0) {
                long P = chnj.f188812a.mo6606a().mo85390P();
                if (this.f96709q == 0 || SystemClock.elapsedRealtime() > P + this.f96709q) {
                    mo53747e();
                }
            }
        } else if (Log.isLoggable("DataItems", 2)) {
            Log.v("DataItems", "In main thread, skip performing GC.");
        }
    }

    /* renamed from: f */
    public final Map mo53748f() {
        SQLiteDatabase readableDatabase = this.f96695c.getReadableDatabase();
        HashMap hashMap = new HashMap();
        Cursor rawQuery = readableDatabase.rawQuery("SELECT node, seqId FROM nodeinfo WHERE seqId IS NOT NULL", null);
        while (rawQuery.moveToNext()) {
            try {
                hashMap.put(rawQuery.getString(0), Long.valueOf(rawQuery.getLong(1)));
            } finally {
                rawQuery.close();
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static final boolean m83504b(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z = true;
        Cursor query = sQLiteDatabase.query("assetsReadyStatus", axyw.f96803a, "dataitems_id=?", new String[]{str}, null, null, null);
        try {
            if (!query.moveToNext()) {
                z = false;
            } else if (query.getLong(1) == 0) {
                z = false;
            }
            return z;
        } finally {
            query.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo53747e() {
        Cursor rawQuery;
        Throwable th;
        Iterator it;
        int i;
        File[] fileArr;
        int i2;
        File[] fileArr2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (Log.isLoggable("DataItems", 3)) {
            Log.d("DataItems", "gcAssets: starting...");
        }
        SQLiteDatabase writableDatabase = this.f96695c.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            rawQuery = writableDatabase.rawQuery("SELECT COUNT(dataitems_id ), digest FROM assets LEFT OUTER JOIN assetrefs ON digest=assets_digest GROUP BY digest", null);
            HashSet<String> hashSet = new HashSet();
            axui axui = this.f96696d;
            HashSet hashSet2 = new HashSet();
            File[] listFiles = new File(((axzr) axui).f96855a.getFilesDir(), "assets").listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i3 = 0;
                while (i3 < length) {
                    File file = listFiles[i3];
                    if (!file.isDirectory()) {
                        fileArr = listFiles;
                        i = length;
                    } else {
                        File[] listFiles2 = file.listFiles();
                        if (listFiles2 != null) {
                            int length2 = listFiles2.length;
                            int i4 = 0;
                            while (i4 < length2) {
                                File file2 = listFiles2[i4];
                                if (file2.isFile()) {
                                    String name = file2.getName();
                                    fileArr2 = listFiles;
                                    if (name.endsWith(".asset")) {
                                        i2 = length;
                                        hashSet2.add(name.substring(0, name.length() - 6));
                                    } else {
                                        i2 = length;
                                    }
                                } else {
                                    fileArr2 = listFiles;
                                    i2 = length;
                                }
                                i4++;
                                listFiles = fileArr2;
                                length = i2;
                            }
                        }
                        fileArr = listFiles;
                        i = length;
                    }
                    i3++;
                    listFiles = fileArr;
                    length = i;
                }
            }
            int size = hashSet2.size();
            if (Log.isLoggable("DataItems", 3)) {
                int size2 = hashSet2.size();
                StringBuilder sb = new StringBuilder(46);
                sb.append("gcAssets: storage has ");
                sb.append(size2);
                sb.append(" known assets");
                Log.d("DataItems", sb.toString());
            }
            int count = rawQuery.getCount();
            if (Log.isLoggable("DataItems", 3)) {
                StringBuilder sb2 = new StringBuilder(42);
                sb2.append("gcAssets: db has ");
                sb2.append(count);
                sb2.append(" asset records");
                Log.d("DataItems", sb2.toString());
            }
            while (rawQuery.moveToNext()) {
                int i5 = rawQuery.getInt(0);
                String string = rawQuery.getString(1);
                if (i5 <= 0) {
                    hashSet.add(string);
                } else {
                    hashSet2.remove(string);
                }
            }
            if (Log.isLoggable("DataItems", 3)) {
                int size3 = hashSet2.size();
                StringBuilder sb3 = new StringBuilder(61);
                sb3.append("gcAssets: there are ");
                sb3.append(size3);
                sb3.append(" assets to remove from storage");
                Log.d("DataItems", sb3.toString());
            }
            int i6 = 0;
            for (String str : hashSet) {
                if (Log.isLoggable("DataItems", 3)) {
                    String valueOf = String.valueOf(str);
                    Log.d("DataItems", valueOf.length() == 0 ? new String("gcAssets: deleting asset row ") : "gcAssets: deleting asset row ".concat(valueOf));
                }
                writableDatabase.delete("assets", "digest=?", new String[]{str});
                i6++;
            }
            writableDatabase.setTransactionSuccessful();
            Iterator it2 = hashSet2.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (Log.isLoggable("DataItems", 3)) {
                    String valueOf2 = String.valueOf(str2);
                    Log.d("DataItems", valueOf2.length() == 0 ? new String("gcAssets: deleting asset file ") : "gcAssets: deleting asset file ".concat(valueOf2));
                }
                axui axui2 = this.f96696d;
                if (Log.isLoggable("assets", 3)) {
                    String valueOf3 = String.valueOf(str2);
                    it = it2;
                    Log.d("assets", valueOf3.length() == 0 ? new String("removeAsset: digest=") : "removeAsset: digest=".concat(valueOf3));
                } else {
                    it = it2;
                }
                ((axzr) axui2).mo53806b(str2).delete();
                i7++;
                it2 = it;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            writableDatabase.endTransaction();
            this.f96709q = SystemClock.elapsedRealtime();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (Log.isLoggable("DataItems", 4)) {
                StringBuilder sb4 = new StringBuilder(132);
                sb4.append("gcAssets: complete, took ");
                sb4.append(elapsedRealtime2 - elapsedRealtime);
                sb4.append(" ms, removed ");
                sb4.append(i7);
                sb4.append(" of ");
                sb4.append(size);
                sb4.append(" files, ");
                sb4.append(i6);
                sb4.append(" of ");
                sb4.append(count);
                sb4.append(" asset records");
                Log.i("DataItems", sb4.toString());
                return;
            }
            return;
        } catch (Throwable th2) {
            writableDatabase.endTransaction();
            throw th2;
        }
        throw th;
    }

    /* renamed from: a */
    public static final long m83489a(Long l) {
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    /* renamed from: a */
    static final Cursor m83490a(SQLiteDatabase sQLiteDatabase, axue axue, String str, String str2, boolean z, Boolean bool, boolean z2) {
        return m83491a(sQLiteDatabase, axue, str, str2, z, bool, z2, null);
    }

    /* renamed from: a */
    static final Cursor m83491a(SQLiteDatabase sQLiteDatabase, axue axue, String str, String str2, boolean z, Boolean bool, boolean z2, String str3) {
        String str4;
        String[] strArr;
        String str5;
        boolean z3 = z2;
        String str6 = axue.f96377a;
        String str7 = axue.f96379c;
        if (z3) {
            str4 = m83506d(str2);
        } else {
            str4 = str2;
        }
        String str8 = "packageName=? AND signatureDigest=? AND deleted=0";
        if (z && str4 == null) {
            strArr = new String[]{str6, str7};
            str8 = "packageName=? AND signatureDigest=?";
        } else if (!z && str4 == null) {
            strArr = new String[]{str6, str7};
        } else if (z && str == null) {
            strArr = new String[]{str6, str7, str4};
            str8 = m83494a("packageName=? AND signatureDigest=?", z3);
        } else if (z && str6 != null) {
            strArr = new String[]{str6, str7, str, str4};
            str8 = m83494a("packageName=? AND signatureDigest=? AND host=?", z3);
        } else if (str != null) {
            strArr = new String[]{str6, str7, str, str4};
            str8 = m83494a("packageName=? AND signatureDigest=? AND host=? AND deleted=0", z3);
        } else {
            str8 = m83494a(str8, z3);
            strArr = new String[]{str6, str7, str4};
        }
        if (bool != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str8).length() + 18);
            sb.append(str8);
            sb.append(" AND assetsPresent");
            String sb2 = sb.toString();
            str5 = bool.booleanValue() ? String.valueOf(sb2).concat(" !=0") : String.valueOf(sb2).concat(" =0");
        } else {
            str5 = str8;
        }
        if (Log.isLoggable("DataItems", 3)) {
            String join = TextUtils.join(",", strArr);
            StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 33 + String.valueOf(join).length());
            sb3.append("getDataItemsByHostAndPath: ");
            sb3.append(str5);
            sb3.append(" args=");
            sb3.append(join);
            Log.d("DataItems", sb3.toString());
        }
        return sQLiteDatabase.query("dataItemsAndAssets", axyx.f96804a, str5, strArr, null, null, "packageName, signatureDigest, host, path", str3);
    }

    /* renamed from: d */
    public static MessageDigest m83507d() {
        try {
            return MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("proper crypto support not installed", e);
        }
    }

    /* renamed from: b */
    public final Cursor mo53741b(axue axue, Uri uri) {
        return m83505c(axue, uri, true);
    }

    /* renamed from: b */
    public final axxo mo53742b(axue axue, Uri uri, boolean z) {
        String str;
        String str2;
        axty.m83205b(3, axue.f96377a);
        this.f96704l.mo24359a();
        if (uri != null) {
            try {
                String a = m83493a(uri);
                str = uri.getPath();
                str2 = a;
            } catch (IllegalArgumentException e) {
                Log.d("DataItems", "deleteDataItemsByUri: error while parsing URI", e);
                return new axxo(this, e);
            }
        } else {
            str2 = null;
            str = null;
        }
        axxo axxo = new axxo(this, axue, str2, str, z);
        this.f96715w.add(axxo);
        return axxo;
    }

    /* renamed from: c */
    public final void mo53745c() {
        long L = chnj.f188812a.mo6606a().mo85386L();
        new skc(this.f96694b).mo25675a("DataServiceDataItems", 2, SystemClock.elapsedRealtime() + L, PendingIntent.getBroadcast(this.f96694b, 0, new Intent("action_database_maintenance"), 134217728), "com.google.android.gms");
    }

    /* renamed from: b */
    public final String mo53743b() {
        return this.f96711s.mo53808b().f96814a;
    }

    /* renamed from: b */
    public final Set mo53744b(String str) {
        HashSet hashSet = new HashSet();
        Cursor query = this.f96695c.getReadableDatabase().query("appKeyAcls", null, "assets_digest=?", new String[]{str}, null, null, null);
        while (query.moveToNext()) {
            try {
                hashSet.add(axue.m83239a(query.getString(1), query.getString(2)));
            } finally {
                query.close();
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public final void mo53746c(String str) {
        int count;
        SQLiteDatabase writableDatabase = this.f96695c.getWritableDatabase();
        do {
            Cursor query = writableDatabase.query("dataItemsAndAssets", axyx.f96804a, "packageName=? AND host=? AND deleted=0", new String[]{str, mo53743b()}, null, null, null, "100");
            count = query.getCount();
            try {
                writableDatabase.beginTransaction();
                ArrayList a = mo53732a(writableDatabase, query);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                mo53735a((TimingLogger) null, a);
                a.size();
            } catch (SQLiteException e) {
                Log.w("DataItems", "error while deleting data items by cursor", e);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } while (count >= 100);
    }

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
    /* renamed from: a */
    public static final axxu m83492a(SQLiteDatabase sQLiteDatabase, String str, boolean z, axue... axueArr) {
        boolean z2;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String str2 = str;
        boolean z3 = z;
        axue[] axueArr2 = axueArr;
        if (Log.isLoggable("DataItems", 2)) {
            String join = TextUtils.join(",", axueArr2);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(join).length());
            sb.append("writeAssetMetadata: digest=");
            sb.append(str2);
            sb.append(", dataPresent=");
            sb.append(z3);
            sb.append(", owners=");
            sb.append(join);
            Log.v("DataItems", sb.toString());
        }
        String[] strArr = {str2};
        try {
            if (Log.isLoggable("DataItems", 2)) {
                Log.v("DataItems", "  query: SELECT dataPresent FROM assets WHERE digest=?");
                String valueOf = String.valueOf(str);
                Log.v("DataItems", valueOf.length() == 0 ? new String("  digest: ") : "  digest: ".concat(valueOf));
            }
            if (DatabaseUtils.longForQuery(sQLiteDatabase2, "SELECT dataPresent FROM assets WHERE digest=?", strArr) != 0) {
                z2 = false;
            } else if (z3) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dataPresent", (Integer) 1);
                contentValues.put("timestampMs", Long.valueOf(System.currentTimeMillis()));
                sQLiteDatabase2.update("assets", contentValues, "digest=?", strArr);
                z2 = true;
            } else {
                z2 = false;
            }
        } catch (SQLiteDoneException e) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("digest", str2);
            contentValues2.put("dataPresent", Integer.valueOf(z ? 1 : 0));
            contentValues2.put("timestampMs", Long.valueOf(System.currentTimeMillis()));
            sQLiteDatabase2.insert("assets", "digest", contentValues2);
            z2 = z3;
        }
        boolean z4 = false;
        for (axue axue : axueArr2) {
            long a = m83488a(sQLiteDatabase2, axue);
            if (Log.isLoggable("DataItems", 2)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 51);
                sb2.append("writing to AssetAcls, digest ");
                sb2.append(str2);
                sb2.append(", ");
                sb2.append(a);
                Log.v("DataItems", sb2.toString());
            }
            if (DatabaseUtils.longForQuery(sQLiteDatabase2, "SELECT COUNT(*) FROM assetsacls WHERE assets_digest=? AND appkeys_id=?", new String[]{str2, Long.toString(a)}) <= 0) {
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("appkeys_id", Long.valueOf(a));
                contentValues3.put("assets_digest", str2);
                sQLiteDatabase2.insert("assetsacls", "appkeys_id", contentValues3);
                z4 = true;
            } else {
                z4 = false;
            }
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = sQLiteDatabase.query("assetsReadyStatus", axyw.f96803a, "nowReady !=markedReady", null, null, null, null);
        while (query.moveToNext()) {
            try {
                ContentValues contentValues4 = new ContentValues();
                long j = query.getLong(1);
                contentValues4.put("assetsPresent", Long.valueOf(j));
                String string = query.getString(0);
                sQLiteDatabase2.update("dataitems", contentValues4, "_id=?", new String[]{string});
                if (j != 0) {
                    if (Log.isLoggable("DataItems", 3)) {
                        String valueOf2 = String.valueOf(string);
                        Log.d("DataItems", valueOf2.length() == 0 ? new String("marked dataitem assets ready, dataitem ") : "marked dataitem assets ready, dataitem ".concat(valueOf2));
                    }
                    arrayList.add(string);
                    arrayList = arrayList;
                }
            } finally {
                query.close();
            }
        }
        return new axxu(arrayList, z2, z4);
    }

    /* renamed from: a */
    private final String m83493a(Uri uri) {
        int a = ayao.m83708a(uri);
        if (a == 1) {
            return mo53743b();
        }
        if (a != 2) {
            return null;
        }
        return uri.getHost();
    }

    /* renamed from: a */
    private static String m83494a(String str, boolean z) {
        String str2 = !z ? " AND path =?" : " AND path GLOB ?";
        return str2.length() == 0 ? new String(str) : str.concat(str2);
    }

    /* renamed from: a */
    public static String m83495a(byte[] bArr) {
        return m83503b(m83507d().digest(bArr));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static final Map m83496a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2) {
        StringBuilder sb = new StringBuilder("select ");
        sb.append(str2);
        sb.append(", sum(");
        int i = 0;
        while (true) {
            int length = strArr.length;
            if (i >= length) {
                break;
            }
            sb.append(String.format("length(%s)", strArr[i]));
            if (i < length - 1) {
                sb.append(" + ");
            } else {
                sb.append(") from ");
                sb.append(str);
                sb.append(" group by ");
                sb.append(str2);
            }
            i++;
        }
        if (Log.isLoggable("DataItems", 3)) {
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 10);
            sb2.append("DB query: ");
            sb2.append(valueOf);
            Log.d("DataItems", sb2.toString());
        }
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        HashMap hashMap = new HashMap();
        while (rawQuery.moveToNext()) {
            try {
                hashMap.put(rawQuery.getString(0), Long.valueOf(rawQuery.getLong(1)));
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }
        rawQuery.close();
        if (Log.isLoggable("DataItems", 3)) {
            String valueOf2 = String.valueOf(hashMap);
            StringBuilder sb3 = new StringBuilder(str.length() + 23 + String.valueOf(valueOf2).length());
            sb3.append("Table ");
            sb3.append(str);
            sb3.append(", total storage: ");
            sb3.append(valueOf2);
            Log.d("DataItems", sb3.toString());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m83497a(Cursor cursor, axxq axxq) {
        try {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                axxq.mo53667a(axxj.m83472a(cursor));
            }
        } finally {
            cursor.close();
        }
    }

    /* renamed from: a */
    private static final void m83498a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.delete("assetrefs", "dataitems_id=? AND assetname=?", new String[]{str, str2});
    }

    /* renamed from: a */
    public static final void m83499a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        if (Log.isLoggable("DataItems", 3)) {
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb.append("insertAssetRef: ");
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            sb.append("->");
            sb.append(str3);
            Log.d("DataItems", sb.toString());
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("assets_digest", str3);
        contentValues.put("dataitems_id", str);
        contentValues.put("assetname", str2);
        sQLiteDatabase.insert("assetrefs", "assetname", contentValues);
    }

    /* renamed from: a */
    private final void m83500a(axue axue, String str, String str2, boolean z) {
        if (Log.isLoggable("DataItems", 3)) {
            String valueOf = String.valueOf(axue);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(str).length() + String.valueOf(str2).length());
            sb.append("requestMissingAssets: ");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            Log.d("DataItems", sb.toString());
        }
        SQLiteDatabase readableDatabase = this.f96695c.getReadableDatabase();
        Cursor a = m83490a(this.f96695c.getReadableDatabase(), axue, str, str2, false, false, z);
        try {
            HashSet<String> hashSet = new HashSet();
            while (a.moveToNext()) {
                String string = a.getString(12);
                if (Log.isLoggable("DataItems", 3)) {
                    String valueOf2 = String.valueOf(string);
                    Log.d("DataItems", valueOf2.length() == 0 ? new String("requestMissingAssets: found digest of missing asset, ") : "requestMissingAssets: found digest of missing asset, ".concat(valueOf2));
                }
                if (!TextUtils.isEmpty(string)) {
                    hashSet.add(string);
                }
            }
            if (Log.isLoggable("DataItems", 3)) {
                int size = hashSet.size();
                StringBuilder sb2 = new StringBuilder(54);
                sb2.append("requestMissingAssets: found ");
                sb2.append(size);
                sb2.append(" missing assets");
                Log.d("DataItems", sb2.toString());
            }
            for (String str3 : hashSet) {
                if (Log.isLoggable("DataItems", 3)) {
                    String valueOf3 = String.valueOf(str3);
                    Log.d("DataItems", valueOf3.length() == 0 ? new String("requestMissingAssets: calling onAssetMissing ") : "requestMissingAssets: calling onAssetMissing ".concat(valueOf3));
                }
                if (!m83502a(readableDatabase, str3)) {
                    this.f96697e.mo53587a(axue, str3);
                } else if (!m83501a(readableDatabase, axue, str3)) {
                    this.f96697e.mo53592b(axue, str3);
                }
            }
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    public static final boolean m83501a(SQLiteDatabase sQLiteDatabase, axue axue, String str) {
        return DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT COUNT(*) FROM appKeyAcls WHERE assets_digest=? AND packageName=? AND signatureDigest=?", new String[]{str, axue.f96377a, axue.f96379c}) != 0;
    }

    /* renamed from: a */
    public static final boolean m83502a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            return DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT dataPresent FROM assets WHERE digest=?", new String[]{str}) != 0;
        } catch (SQLiteDoneException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final Cursor mo53726a(axue axue, Uri uri) {
        return m83505c(axue, uri, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0142  */
    /* renamed from: a */
    public final axxi mo53727a(TimingLogger timingLogger, SQLiteDatabase sQLiteDatabase, String str, axxi axxi, axxi axxi2) {
        String str2;
        boolean z;
        TimingLogger timingLogger2 = timingLogger;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String str3 = str;
        axxi axxi3 = axxi;
        axxi axxi4 = axxi2;
        if (Log.isLoggable("DataItems", 3)) {
            String valueOf = String.valueOf(axxi);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(valueOf).length());
            sb.append("updateExistingDataItem: ");
            sb.append(str3);
            sb.append(" to ");
            sb.append(valueOf);
            Log.d("DataItems", sb.toString());
        }
        if (axxi3.f96648c) {
            if (axxi4.f96648c) {
                str2 = "dropping already deleted data item";
                if (str2 == null) {
                    mo53737a(axxi3);
                }
                timingLogger2.addSplit("setup");
                if (axxi3.f96651f != -1) {
                    mo53734a(sQLiteDatabase2, axxi3);
                    timingLogger2.addSplit("updateNodeInfo");
                }
                if (str2 != null) {
                    if (!Log.isLoggable("DataItems", 3)) {
                        return null;
                    }
                    String valueOf2 = String.valueOf(axxi);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 26 + String.valueOf(valueOf2).length());
                    sb2.append("updateExistingDataItem: ");
                    sb2.append(str2);
                    sb2.append(": ");
                    sb2.append(valueOf2);
                    Log.d("DataItems", sb2.toString());
                    return null;
                } else if (axxi3.f96648c) {
                    sQLiteDatabase2.delete("assetrefs", "dataitems_id=?", new String[]{str3});
                    timingLogger2.addSplit("delete assetrefs");
                    sQLiteDatabase2.update("dataitems", axxj.m83475b(axxi), "_id =?", new String[]{str3});
                    timingLogger2.addSplit("update data item");
                    m83508g();
                    timingLogger2.addSplit("maybePerformGC");
                    return axxi3;
                } else {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : axxi3.f96647b.mo53710a().entrySet()) {
                        hashMap.put((String) entry.getKey(), ((axuh) entry.getValue()).f96387b);
                    }
                    for (Map.Entry entry2 : axxi4.f96647b.mo53710a().entrySet()) {
                        String str4 = (String) entry2.getKey();
                        String str5 = ((axuh) entry2.getValue()).f96387b;
                        if (!hashMap.containsKey(str4)) {
                            m83498a(sQLiteDatabase2, str3, str4);
                            timingLogger2.addSplit("deleteAssetRef1");
                        } else if (!((String) hashMap.get(str4)).equals(str5)) {
                            m83498a(sQLiteDatabase2, str3, str4);
                            timingLogger2.addSplit("deleteAssetRef2");
                        } else {
                            hashMap.remove(str4);
                        }
                    }
                    for (Map.Entry entry3 : hashMap.entrySet()) {
                        m83499a(sQLiteDatabase2, str3, (String) entry3.getKey(), (String) entry3.getValue());
                        timingLogger2.addSplit("insertAssetRef");
                    }
                    if (axxi3.f96648c || axxi3.f96647b.mo53710a().isEmpty() || m83504b(sQLiteDatabase, str)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    axxi3.f96649d = z;
                    timingLogger2.addSplit("compute assetsAreReader");
                    sQLiteDatabase2.update("dataitems", axxj.m83475b(axxi), "_id =?", new String[]{str3});
                    timingLogger2.addSplit("update data item2");
                    m83508g();
                    timingLogger2.addSplit("maybePerformGC2");
                    return axxi3;
                }
            }
        } else if (!axxi4.f96648c) {
            axxf axxf = axxi3.f96647b;
            axxf axxf2 = axxi4.f96647b;
            if (Arrays.equals(axxf.f96642d, axxf2.f96642d) && axxf.mo53710a().size() == axxf2.mo53710a().size()) {
                Iterator it = axxf.mo53710a().entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str2 = "dropping duplicate data item";
                        break;
                    }
                    Map.Entry entry4 = (Map.Entry) it.next();
                    axuh axuh = (axuh) entry4.getValue();
                    axuh axuh2 = (axuh) axxf2.mo53710a().get(entry4.getKey());
                    if (axuh2 != null) {
                        if (!axuh.f96387b.equals(axuh2.f96387b)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (str2 == null) {
                }
                timingLogger2.addSplit("setup");
                if (axxi3.f96651f != -1) {
                }
                if (str2 != null) {
                }
            }
        }
        if (axxi3.f96650e.equals(axxi4.f96650e)) {
            long j = axxi3.f96651f;
            if (j != -1 && j <= axxi4.f96651f) {
                str2 = "dropping out of order update by sequence id";
                if (str2 == null) {
                }
                timingLogger2.addSplit("setup");
                if (axxi3.f96651f != -1) {
                }
                if (str2 != null) {
                }
            }
        }
        if (!axxi3.f96650e.equals(axxi4.f96650e)) {
            long j2 = axxi3.f96653h;
            if (j2 != 0 && j2 <= axxi4.f96653h) {
                str2 = "dropping out of order update by timestamp";
                if (str2 == null) {
                }
                timingLogger2.addSplit("setup");
                if (axxi3.f96651f != -1) {
                }
                if (str2 != null) {
                }
            }
        }
        str2 = null;
        if (str2 == null) {
        }
        timingLogger2.addSplit("setup");
        if (axxi3.f96651f != -1) {
        }
        if (str2 != null) {
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axxv.a(axxi, boolean, java.lang.String):axxr
     arg types: [axxi, int, ?[OBJECT, ARRAY]]
     candidates:
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):void
      axxv.a(android.database.sqlite.SQLiteDatabase, axue, java.lang.String):boolean
      axxv.a(axue, android.net.Uri, boolean):com.google.android.gms.common.data.DataHolder
      axxv.a(ssb, boolean, boolean):void
      ayjm.a(ssb, boolean, boolean):void
      axxv.a(axxi, boolean, java.lang.String):axxr */
    /* renamed from: a */
    public final axxr mo53728a(axue axue, axxf axxf) {
        axty.m83205b(2, axue.f96377a);
        this.f96703k.mo24359a();
        axxi axxi = new axxi(axue);
        axxi.f96648c = false;
        axxi.f96650e = mo53743b();
        axxi.f96647b = axxf;
        return mo53729a(axxi, true, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final axxr mo53729a(axxi axxi, boolean z, String str) {
        if (Log.isLoggable("DataItems", 3)) {
            String str2 = str != null ? str.length() == 0 ? new String("peer=") : "peer=".concat(str) : "internal";
            String valueOf = String.valueOf(axxi);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 15 + String.valueOf(valueOf).length());
            sb.append("setDataItem: ");
            sb.append(str2);
            sb.append(", ");
            sb.append(valueOf);
            Log.d("DataItems", sb.toString());
        }
        axxr axxr = new axxr(this, axxi, z, str);
        this.f96715w.add(axxr);
        return axxr;
    }

    /* renamed from: a */
    public final DataHolder mo53730a(axue axue, Uri uri, boolean z) {
        String str;
        String str2;
        axxt axxt;
        String str3;
        String[] strArr;
        axue axue2 = axue;
        Uri uri2 = uri;
        boolean z2 = z;
        if (Log.isLoggable("DataItems", 3)) {
            String valueOf = String.valueOf(axue);
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27 + String.valueOf(valueOf2).length());
            sb.append("getDataItemsHolderByUri: ");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            Log.d("DataItems", sb.toString());
        }
        SQLiteDatabase readableDatabase = this.f96695c.getReadableDatabase();
        readableDatabase.beginTransaction();
        if (uri2 != null) {
            try {
                str = m83493a(uri2);
                str2 = uri.getPath();
            } catch (Throwable th) {
                readableDatabase.endTransaction();
                throw th;
            }
        } else {
            str2 = null;
            str = null;
        }
        String str4 = axue2.f96377a;
        String str5 = axue2.f96379c;
        if (z2) {
            str3 = m83506d(str2);
        } else {
            str3 = str2;
        }
        String str6 = "packageName=? AND signatureDigest=? AND deleted=0";
        if (str3 == null) {
            strArr = new String[]{str4, str5};
        } else if (str != null) {
            strArr = new String[]{str4, str5, str, str3};
            str6 = m83494a("packageName=? AND signatureDigest=? AND host=? AND deleted=0", z2);
        } else {
            str6 = m83494a(str6, z2);
            strArr = new String[]{str4, str5, str3};
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 18);
        sb2.append(str6);
        sb2.append(" AND assetsPresent");
        String valueOf3 = String.valueOf(String.valueOf(sb2.toString()).concat(" !=0"));
        String str7 = valueOf3.length() == 0 ? new String("SELECT host AS host, path AS path, data AS data, '' AS tags, assetname AS asset_key, assets_digest AS asset_id FROM dataItemsAndAssets WHERE ") : "SELECT host AS host, path AS path, data AS data, '' AS tags, assetname AS asset_key, assets_digest AS asset_id FROM dataItemsAndAssets WHERE ".concat(valueOf3);
        if (Log.isLoggable("DataItems", 3)) {
            String valueOf4 = String.valueOf(str7);
            Log.d("DataItems", valueOf4.length() == 0 ? new String("Raw query for getDataItemsForDataHolderByHostAndPath:\n") : "Raw query for getDataItemsForDataHolderByHostAndPath:\n".concat(valueOf4));
            for (String str8 : strArr) {
                String valueOf5 = String.valueOf(str8);
                Log.d("DataItems", valueOf5.length() == 0 ? new String("selection arg: ") : "selection arg: ".concat(valueOf5));
            }
        }
        axxt = new axxt(readableDatabase.rawQuery(str7, strArr));
        m83500a(axue2, str, str2, z2);
        DataHolder dataHolder = new DataHolder(axxt, null);
        axxt.close();
        readableDatabase.setTransactionSuccessful();
        readableDatabase.endTransaction();
        return dataHolder;
    }

    /* renamed from: a */
    public final File mo53731a(String str) {
        return this.f96696d.mo53578a(str);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final ArrayList mo53732a(SQLiteDatabase sQLiteDatabase, Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        try {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                arrayList.add(new Pair(axxj.m83477b(cursor), axxj.m83472a(cursor)));
            }
            cursor.close();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Pair pair = (Pair) arrayList.get(i);
                axxi axxi = new axxi(((axxi) pair.second).f96646a);
                axxi.f96650e = mo53743b();
                axxi.f96648c = true;
                axxi.f96649d = true;
                axxi.f96647b = new axxf(((axxi) pair.second).f96647b.f96639a, ((axxi) pair.second).f96647b.f96640b);
                arrayList2.add(mo53727a(new TimingLogger("DataItemsTiming", "deleteDataItemByCursorAndNotify"), sQLiteDatabase, (String) pair.first, axxi, (axxi) pair.second));
            }
            return arrayList2;
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
    }

    /* renamed from: a */
    public final Map mo53733a(Map map) {
        long j;
        Map f = mo53748f();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : f.entrySet()) {
            String str = (String) entry.getKey();
            long longValue = ((Long) entry.getValue()).longValue();
            if (map.containsKey(str)) {
                j = ((Long) map.get(str)).longValue();
            } else {
                j = -1;
            }
            if (j < longValue) {
                hashMap.put(str, Long.valueOf(j));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo53580a() {
        SQLiteDatabase writableDatabase = this.f96695c.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            Log.d("DataItems", "DataService.clearStorage: clearing shared prefs");
            this.f96712t.edit().clear().commit();
            Log.d("DataItems", "DataService.clearStorage: clearing asset storage");
            this.f96696d.mo53580a();
            Log.d("DataItems", "DataService.clearStorage: clearing db tables");
            writableDatabase.delete("assetsacls", null, null);
            writableDatabase.delete("assetrefs", null, null);
            writableDatabase.delete("nodeinfo", null, null);
            writableDatabase.delete("dataitems", null, null);
            writableDatabase.delete("assets", null, null);
            writableDatabase.delete("appkeys", null, null);
            writableDatabase.setTransactionSuccessful();
            Log.d("DataItems", "DataService.clearStorage: success");
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* renamed from: a */
    public final void mo53734a(SQLiteDatabase sQLiteDatabase, axxi axxi) {
        String str = axxi.f96650e;
        long j = axxi.f96651f;
        String str2 = axxi.f96647b.f96639a;
        long currentTimeMillis = System.currentTimeMillis();
        if (Log.isLoggable("DataItems", 2)) {
            String b = mo53743b();
            String valueOf = String.valueOf(axxi);
            int length = String.valueOf(b).length();
            int length2 = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 109 + length2 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
            sb.append("updateNodeInfo: node=");
            sb.append(b);
            sb.append(", peer=");
            sb.append(str);
            sb.append(", seqId=");
            sb.append(j);
            sb.append(", host=");
            sb.append(str2);
            sb.append(", lastActivity=");
            sb.append(currentTimeMillis);
            sb.append(", dataitem=");
            sb.append(valueOf);
            Log.v("DataItems", sb.toString());
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("seqId", Long.valueOf(j));
        contentValues.put("lastActivityMs", Long.valueOf(currentTimeMillis));
        if (sQLiteDatabase.update("nodeinfo", contentValues, "node=?", new String[]{str}) == 0) {
            contentValues.put("node", str);
            sQLiteDatabase.insert("nodeinfo", null, contentValues);
        }
    }

    /* renamed from: a */
    public final void mo53735a(TimingLogger timingLogger, ArrayList arrayList) {
        if (Log.isLoggable("DataItems", 2)) {
            int size = arrayList.size();
            StringBuilder sb = new StringBuilder(35);
            sb.append("notifyDataItemsChanged: ");
            sb.append(size);
            Log.v("DataItems", sb.toString());
        }
        this.f96705m.mo24359a();
        for (axxg axxg : this.f96700h) {
            axxg.mo53557a(arrayList);
            if (timingLogger != null) {
                String valueOf = String.valueOf(axxg.getClass().getCanonicalName());
                timingLogger.addSplit(valueOf.length() == 0 ? new String("onDataItemChanged:") : "onDataItemChanged:".concat(valueOf));
            }
        }
    }

    /* renamed from: a */
    public final void mo53736a(axxg axxg) {
        this.f96700h.add(axxg);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53737a(axxi axxi) {
        long j;
        synchronized (this.f96693C) {
            if (this.f96691A >= 1000) {
                this.f96692B = this.f96712t.getLong("nextSeqIdBlock", 100);
                this.f96691A = 0;
                this.f96712t.edit().putLong("nextSeqIdBlock", this.f96692B + 1000).commit();
                if (Log.isLoggable("DataItems", 2)) {
                    long j2 = this.f96692B;
                    StringBuilder sb = new StringBuilder(47);
                    sb.append("retrieved new seqId block, ");
                    sb.append(j2);
                    Log.v("DataItems", sb.toString());
                }
            }
            long j3 = this.f96692B;
            long j4 = this.f96691A;
            this.f96691A = 1 + j4;
            j = j3 + j4;
            if (Log.isLoggable("DataItems", 2)) {
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("issued seqId ");
                sb2.append(j);
                Log.v("DataItems", sb2.toString());
            }
        }
        if (Log.isLoggable("DataItems", 2)) {
            String b = mo53743b();
            StringBuilder sb3 = new StringBuilder(String.valueOf(b).length() + 54);
            sb3.append("updated local seqId: node=");
            sb3.append(b);
            sb3.append(", seqId=");
            sb3.append(j);
            Log.v("DataItems", sb3.toString());
        }
        axxi.f96652g = j;
        if (mo53743b().equals(axxi.f96650e)) {
            axxi.f96651f = j;
        } else if (axxi.f96653h != 0) {
            return;
        }
        axxi.f96653h = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo53738a(String str, long j, int i, boolean z, axxq axxq) {
        String str2;
        String str3;
        String str4 = str;
        int i2 = i;
        boolean z2 = z;
        SQLiteDatabase writableDatabase = this.f96695c.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            if (Log.isLoggable("DataItems", 3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
                sb.append("getModifiedDataItems: nodeId=");
                sb.append(str4);
                sb.append(", seqId=");
                sb.append(j);
                sb.append(", limit=");
                sb.append(i2);
                sb.append(", excludeDeleted=");
                sb.append(z2);
                Log.d("DataItems", sb.toString());
            }
            if (!z2) {
                str2 = "sourceNode=? AND seqId > ?";
            } else {
                str2 = "sourceNode=? AND seqId > ? AND deleted=0";
            }
            SQLiteDatabase readableDatabase = this.f96695c.getReadableDatabase();
            String[] strArr = axyx.f96804a;
            String[] strArr2 = {str4, Long.toString(j)};
            if (i2 != -1) {
                str3 = Integer.toString(i);
            } else {
                str3 = null;
            }
            m83497a(readableDatabase.query("dataItemsAndAssets", strArr, str2, strArr2, null, null, "seqId", str3), axxq);
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo53739a(ArrayList arrayList) {
        SQLiteDatabase readableDatabase = this.f96695c.getReadableDatabase();
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        int i = 0;
        while (i < size) {
            Cursor query = readableDatabase.query("dataItemsAndAssets", axyx.f96804a, "dataitems_id=?", new String[]{(String) arrayList.get(i)}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    axxi a = axxj.m83472a(query);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(a);
                    query.close();
                    i++;
                } else {
                    query.close();
                    return;
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        if (arrayList2 != null) {
            mo53735a((TimingLogger) null, arrayList2);
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        Cursor cursor;
        String str;
        String str2;
        byte[] bArr;
        ssb ssb2 = ssb;
        SQLiteDatabase readableDatabase = this.f96695c.getReadableDatabase();
        ssb2.printf("num batches: %d, num set requests: %d, num delete requests: %d\n", Integer.valueOf(this.f96718z.get()), Integer.valueOf(this.f96698f.get()), Integer.valueOf(this.f96699g.get()));
        ssb.println();
        ssb2.println("All Data Items:");
        ssb.println();
        ssb.mo26034a();
        Cursor query = readableDatabase.query("dataItemsAndAssets", axyx.f96804a, null, null, null, null, "packageName, signatureDigest, host, path");
        try {
            StringBuilder sb = new StringBuilder();
            query.moveToFirst();
            axue axue = null;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (!query.isAfterLast()) {
                axxi a = axxj.m83472a(query);
                if (!a.f96646a.equals(axue)) {
                    if (axue != null) {
                        String valueOf = String.valueOf(axue);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 67);
                        sb2.append(valueOf);
                        sb2.append(": ");
                        sb2.append(i);
                        sb2.append(" dataitems (");
                        sb2.append(i2);
                        sb2.append(" deleted, ");
                        sb2.append(i3);
                        sb2.append(" buffered)");
                        ssb2.println(sb2.toString());
                        ssb.mo26034a();
                        ssb2.print(sb);
                        ssb.mo26035b();
                        ssb.println();
                    }
                    axue = a.f96646a;
                    sb = new StringBuilder();
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                }
                if (z2 || !a.f96648c) {
                    int i4 = i + 1;
                    String str3 = "";
                    if (a.f96648c) {
                        i2++;
                        str = " DELETED";
                    } else {
                        str = str3;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    if (!a.f96648c) {
                        if (!a.f96649d) {
                            i3++;
                            sb3.append(" BUFFERED: [");
                            for (axuh axuh : a.f96647b.mo53710a().values()) {
                                sb3.append(str3);
                                sb3.append(axuh.f96387b);
                                str3 = ", ";
                            }
                            sb3.append("]");
                        }
                    }
                    axxf axxf = a.f96647b;
                    if (axxf == null || (bArr = axxf.f96642d) == null) {
                        str2 = null;
                    } else {
                        str2 = Integer.toString(bArr.length);
                    }
                    StringBuilder sb4 = sb3;
                    String b = ayjl.m84113b(a.f96653h);
                    String str4 = a.f96647b.f96640b;
                    if (z) {
                        if (!z2) {
                            String valueOf2 = String.valueOf(Integer.toHexString(str4.hashCode()));
                            str4 = valueOf2.length() == 0 ? new String("pathhash=") : "pathhash=".concat(valueOf2);
                        }
                    }
                    String str5 = a.f96650e;
                    axue axue2 = axue;
                    int i5 = i4;
                    long j = a.f96651f;
                    int i6 = i2;
                    int i7 = i3;
                    long j2 = a.f96652g;
                    axxf axxf2 = a.f96647b;
                    String str6 = axxf2.f96639a;
                    int size = axxf2.mo53710a().size();
                    String valueOf3 = String.valueOf(sb4);
                    cursor = query;
                    try {
                        StringBuilder sb5 = new StringBuilder(String.valueOf(str5).length() + 79 + String.valueOf(b).length() + String.valueOf(str6).length() + String.valueOf(str4).length() + String.valueOf(str2).length() + String.valueOf(valueOf3).length() + str.length());
                        sb5.append(str5);
                        sb5.append(", ");
                        sb5.append(j);
                        sb5.append(", ");
                        sb5.append(j2);
                        sb5.append(", ");
                        sb5.append(b);
                        sb5.append(", ");
                        sb5.append(str6);
                        sb5.append(", ");
                        sb5.append(str4);
                        sb5.append(", data ");
                        sb5.append(str2);
                        sb5.append(", assets: ");
                        sb5.append(size);
                        sb5.append(valueOf3);
                        sb5.append(str);
                        sb5.append("\n");
                        sb.append(sb5.toString());
                        ssb2 = ssb;
                        axue = axue2;
                        i = i5;
                        i2 = i6;
                        i3 = i7;
                        query = cursor;
                    } catch (Throwable th) {
                        th = th;
                        cursor.close();
                        throw th;
                    }
                }
            }
            Cursor cursor2 = query;
            if (axue != null) {
                String valueOf4 = String.valueOf(axue);
                StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf4).length() + 67);
                sb6.append(valueOf4);
                sb6.append(": ");
                sb6.append(i);
                sb6.append(" dataitems (");
                sb6.append(i2);
                sb6.append(" deleted, ");
                sb6.append(i3);
                sb6.append(" buffered)");
                ssb.println(sb6.toString());
                ssb.mo26034a();
                ssb.print(sb);
                ssb.mo26035b();
                ssb.println();
            }
            cursor2.close();
            ssb.mo26035b();
        } catch (Throwable th2) {
            th = th2;
            cursor = query;
            cursor.close();
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo53740a(axxi axxi, int i, boolean z, String str) {
        return this.f96713u.mo53708a(axxi, i, z, str);
    }
}
