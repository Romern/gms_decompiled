package com.google.android.gms.config;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.config.internal.ConfigExperimentPayload;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;
import com.google.android.gms.config.internal.PackageConfigTable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ConfigChimeraService extends Service {

    /* renamed from: h */
    static final Charset f30429h = Charset.forName("UTF-8");

    /* renamed from: l */
    public static final /* synthetic */ int f30430l = 0;

    /* renamed from: n */
    private static final char[] f30431n = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public final Object f30432a = new Object();

    /* renamed from: b */
    public Map f30433b = null;

    /* renamed from: c */
    public Map f30434c = null;

    /* renamed from: d */
    public Map f30435d = null;

    /* renamed from: e */
    public Map f30436e = null;

    /* renamed from: f */
    public final Object f30437f = new Object();

    /* renamed from: g */
    public Set f30438g = null;

    /* renamed from: i */
    public boolean f30439i = false;

    /* renamed from: j */
    public swi f30440j;

    /* renamed from: k */
    public swz f30441k;

    /* renamed from: m */
    private PackageManager f30442m;

    /* renamed from: a */
    public static String m22756a(List list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final int mo17956b(String str) {
        return mo17949a(str, "throttling_success_rate", 5, 1, 20);
    }

    /* renamed from: c */
    public final int mo17960c(String str) {
        return mo17949a(str, "throttling_failure_rate", 5, 1, 20);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo17961d(String str) {
        PackageInfo packageInfo;
        if (str == null) {
            Log.w("ConfigChimeraService", "specify package to override in __package__ extra");
            return false;
        }
        if (!"all_packages".equals(str)) {
            try {
                packageInfo = this.f30442m.getPackageInfo(str, 64);
                if (packageInfo == null) {
                    Log.w("ConfigChimeraService", "failed to get target package info");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("ConfigChimeraService", "target package not installed");
                return false;
            }
        } else {
            packageInfo = null;
        }
        if (rfy.m33543a() || !rfy.m33549f(this)) {
            try {
                PackageInfo packageInfo2 = this.f30442m.getPackageInfo("com.google.android.gms.config.override", 64);
                if (packageInfo2 == null) {
                    Log.w("ConfigChimeraService", "failed to get signal package info");
                    return false;
                } else if (packageInfo2.sharedUserId != null) {
                    Log.w("ConfigChimeraService", "signal package may not have a shared user id");
                    return false;
                } else {
                    HashSet hashSet = new HashSet();
                    for (Signature signature : packageInfo2.signatures) {
                        hashSet.add(signature);
                    }
                    for (Signature signature2 : packageInfo.signatures) {
                        if (!hashSet.contains(signature2)) {
                            Log.w("ConfigChimeraService", "signatures aren't compatible; override disallowed");
                            return false;
                        }
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("ConfigChimeraService", "signal package not installed");
                return false;
            }
        } else {
            Log.w("ConfigChimeraService", "non-user-build device with test-keys GmsCore; override allowed");
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str;
        if ("userdebug".equals(Build.TYPE) || "eng".equals(Build.TYPE)) {
            printWriter.print("=== dumping config for all packages\n");
            synchronized (this.f30432a) {
                for (Map.Entry entry : this.f30433b.entrySet()) {
                    String str2 = (String) entry.getKey();
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14);
                    sb.append("  -- package ");
                    sb.append(str2);
                    sb.append("\n");
                    printWriter.print(sb.toString());
                    for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                        String str3 = (String) entry2.getKey();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 18);
                        sb2.append("    -- namespace ");
                        sb2.append(str3);
                        sb2.append("\n");
                        printWriter.print(sb2.toString());
                        for (Map.Entry entry3 : ((TreeMap) entry2.getValue()).entrySet()) {
                            if (entry3.getValue() != null) {
                                String str4 = (String) entry3.getKey();
                                byte[] bArr = (byte[]) entry3.getValue();
                                if (bArr != null) {
                                    String str5 = new String(bArr, f30429h);
                                    if (Arrays.equals(bArr, str5.getBytes(f30429h))) {
                                        StringBuilder sb3 = new StringBuilder(str5.length() + 2);
                                        sb3.append("\"");
                                        sb3.append(str5);
                                        sb3.append("\"");
                                        str = sb3.toString();
                                    } else {
                                        StringBuilder sb4 = new StringBuilder();
                                        for (byte b : bArr) {
                                            sb4.append(f30431n[(b >> 4) & 15]);
                                            sb4.append(f30431n[b & 15]);
                                        }
                                        String sb5 = sb4.toString();
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(sb5).length() + 2);
                                        sb6.append("<");
                                        sb6.append(sb5);
                                        sb6.append(">");
                                        str = sb6.toString();
                                    }
                                } else {
                                    str = "null";
                                }
                                StringBuilder sb7 = new StringBuilder(String.valueOf(str4).length() + 10 + String.valueOf(str).length());
                                sb7.append("      ");
                                sb7.append(str4);
                                sb7.append(" = ");
                                sb7.append(str);
                                sb7.append("\n");
                                printWriter.print(sb7.toString());
                            }
                        }
                    }
                }
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.config.START".equals(intent.getAction())) {
            return null;
        }
        mo17959b();
        return new swl(this, this);
    }

    public final void onCreate() {
        super.onCreate();
        this.f30441k = new swz(this);
        this.f30442m = getPackageManager();
        this.f30440j = new swi(this);
        synchronized (this.f30437f) {
            this.f30438g = new HashSet();
        }
        this.f30439i = true;
        new Thread(new swe(this)).start();
    }

    public final void onDestroy() {
        super.onDestroy();
        mo17959b();
        this.f30440j.close();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x019b A[Catch:{ all -> 0x0201 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01c4 A[Catch:{ all -> 0x0201 }] */
    public final int onStartCommand(Intent intent, int i, int i2) {
        String schemeSpecificPart;
        HashMap hashMap;
        IllegalStateException illegalStateException;
        IllegalStateException illegalStateException2;
        byte[] bArr;
        int i3;
        Intent intent2 = intent;
        int i4 = 2;
        if (intent2 != null) {
            int i5 = 0;
            if ("com.google.android.gms.config.OVERRIDE".equals(intent.getAction())) {
                mo17959b();
                String stringExtra = intent2.getStringExtra("__package__");
                if (mo17961d(stringExtra)) {
                    String stringExtra2 = intent2.getStringExtra("__namespace__");
                    if (stringExtra2 == null) {
                        Log.w("ConfigChimeraService", "specify namespace to override in __namespace__ extra");
                    } else {
                        SQLiteDatabase writableDatabase = this.f30440j.getWritableDatabase();
                        SQLiteStatement compileStatement = writableDatabase.compileStatement("DELETE FROM override WHERE package = ? AND namespace = ? AND key = ?");
                        SQLiteStatement compileStatement2 = writableDatabase.compileStatement("INSERT OR REPLACE INTO override (package, namespace, key, value) VALUES (?, ?, ?, ?)");
                        writableDatabase.beginTransaction();
                        try {
                            Bundle extras = intent.getExtras();
                            for (String str : extras.keySet()) {
                                if (str == null) {
                                    i5 = 0;
                                    i4 = 2;
                                } else if (str.equals("__package__")) {
                                    i5 = 0;
                                    i4 = 2;
                                } else if (!str.equals("__namespace__")) {
                                    Object obj = extras.get(str);
                                    if (obj == null) {
                                        compileStatement2.bindString(1, stringExtra);
                                        compileStatement2.bindString(i4, stringExtra2);
                                        compileStatement2.bindString(3, str);
                                        compileStatement2.bindNull(4);
                                        compileStatement2.execute();
                                    } else if (obj instanceof String) {
                                        compileStatement2.bindString(1, stringExtra);
                                        compileStatement2.bindString(i4, stringExtra2);
                                        compileStatement2.bindString(3, str);
                                        compileStatement2.bindBlob(4, ((String) obj).getBytes(f30429h));
                                        compileStatement2.execute();
                                    } else if (obj instanceof String[]) {
                                        String str2 = ((String[]) obj)[i5];
                                        if (str2.length() % i4 == 0) {
                                            bArr = new byte[(str2.length() / i4)];
                                            while (true) {
                                                if (i5 >= str2.length()) {
                                                    break;
                                                }
                                                char charAt = str2.charAt(i5);
                                                if (charAt >= '0' && charAt <= '9') {
                                                    i3 = charAt - '0';
                                                } else if (charAt < 'A' || charAt > 'F') {
                                                    if (charAt >= 'a') {
                                                        if (charAt > 'f') {
                                                            bArr = null;
                                                            break;
                                                        }
                                                        i3 = charAt - 'W';
                                                    } else {
                                                        break;
                                                    }
                                                } else {
                                                    i3 = charAt - '7';
                                                }
                                                if (i5 % 2 == 0) {
                                                    int i6 = i5 / 2;
                                                    bArr[i6] = (byte) ((bArr[i6] & 15) | (i3 << 4));
                                                } else {
                                                    int i7 = i5 / 2;
                                                    bArr[i7] = (byte) ((bArr[i7] & 240) | i3);
                                                }
                                                i5++;
                                            }
                                            if (bArr != null) {
                                                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 25);
                                                sb.append("failed to parse \"");
                                                sb.append(str2);
                                                sb.append("\" as hex");
                                                Log.w("ConfigChimeraService", sb.toString());
                                                i5 = 0;
                                                i4 = 2;
                                            } else {
                                                compileStatement2.bindString(1, stringExtra);
                                                compileStatement2.bindString(2, stringExtra2);
                                                compileStatement2.bindString(3, str);
                                                compileStatement2.bindBlob(4, bArr);
                                                compileStatement2.execute();
                                                i5 = 0;
                                                i4 = 2;
                                            }
                                        }
                                        bArr = null;
                                        if (bArr != null) {
                                        }
                                    } else if (obj instanceof Boolean) {
                                        compileStatement.bindString(1, stringExtra);
                                        compileStatement.bindString(2, stringExtra2);
                                        compileStatement.bindString(3, str);
                                        compileStatement.execute();
                                        i5 = 0;
                                        i4 = 2;
                                    } else {
                                        i5 = 0;
                                        i4 = 2;
                                    }
                                } else {
                                    i5 = 0;
                                    i4 = 2;
                                }
                            }
                            this.f30440j.f45274a = true;
                            writableDatabase.setTransactionSuccessful();
                            try {
                                SQLiteDatabase readableDatabase = this.f30440j.getReadableDatabase();
                                HashMap hashMap2 = new HashMap();
                                String[] strArr = new String[1];
                                strArr[i5] = stringExtra;
                                Cursor rawQuery = readableDatabase.rawQuery("SELECT namespace, key, value FROM main WHERE package = ? ORDER BY namespace, key", strArr);
                                while (rawQuery.moveToNext()) {
                                    try {
                                        String string = rawQuery.getString(i5);
                                        String string2 = rawQuery.getString(1);
                                        byte[] blob = rawQuery.getBlob(i4);
                                        if (!(string2 == null || string == null || blob == null)) {
                                            TreeMap treeMap = (TreeMap) hashMap2.get(string);
                                            if (treeMap == null) {
                                                treeMap = new TreeMap();
                                                hashMap2.put(string, treeMap);
                                            }
                                            treeMap.put(string2, blob);
                                        }
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                rawQuery.close();
                                if (this.f30440j.f45275b) {
                                    m22761a("experiment", stringExtra, hashMap2);
                                }
                                if (this.f30440j.f45274a) {
                                    m22761a("override", stringExtra, hashMap2);
                                }
                                synchronized (this.f30432a) {
                                    if (!hashMap2.isEmpty()) {
                                        this.f30433b.put(stringExtra, hashMap2);
                                    }
                                }
                            } catch (IllegalStateException e) {
                                illegalStateException2 = e;
                                Log.e("ConfigChimeraService", "Exception while ending the db transaction.", illegalStateException2);
                                stopSelf();
                                return 2;
                            }
                        } finally {
                            compileStatement.close();
                            compileStatement2.close();
                            try {
                                writableDatabase.endTransaction();
                            } catch (IllegalStateException e2) {
                                illegalStateException2 = e2;
                                Log.e("ConfigChimeraService", "Exception while ending the db transaction.", illegalStateException2);
                                stopSelf();
                                return 2;
                            }
                        }
                    }
                }
            } else if ("com.google.android.gms.config.INTERNAL_METADATA_OVERRIDE".equals(intent.getAction())) {
                mo17959b();
                String stringExtra3 = intent2.getStringExtra("__package__");
                if (mo17961d(stringExtra3)) {
                    SQLiteDatabase writableDatabase2 = this.f30440j.getWritableDatabase();
                    SQLiteStatement compileStatement3 = writableDatabase2.compileStatement("DELETE FROM internal_metadata WHERE key = ?");
                    SQLiteStatement compileStatement4 = writableDatabase2.compileStatement("INSERT OR REPLACE INTO internal_metadata (key, value) VALUES (?, ?)");
                    writableDatabase2.beginTransaction();
                    try {
                        Bundle extras2 = intent.getExtras();
                        for (String str3 : extras2.keySet()) {
                            if (str3 != null && !str3.equals("__package__")) {
                                Object obj2 = extras2.get(str3);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(stringExtra3).length() + 1 + str3.length());
                                sb2.append(stringExtra3);
                                sb2.append(":");
                                sb2.append(str3);
                                String sb3 = sb2.toString();
                                if (obj2 == null) {
                                    compileStatement4.bindString(1, sb3);
                                    compileStatement4.bindNull(2);
                                    compileStatement4.execute();
                                } else if (obj2 instanceof String) {
                                    compileStatement4.bindString(1, sb3);
                                    compileStatement4.bindBlob(2, ((String) obj2).getBytes(f30429h));
                                    compileStatement4.execute();
                                } else if (obj2 instanceof Boolean) {
                                    compileStatement3.bindString(1, sb3);
                                    compileStatement3.execute();
                                }
                            }
                        }
                        writableDatabase2.setTransactionSuccessful();
                        try {
                            SQLiteDatabase readableDatabase2 = this.f30440j.getReadableDatabase();
                            HashMap hashMap3 = new HashMap();
                            Cursor rawQuery2 = readableDatabase2.rawQuery("SELECT key, value FROM internal_metadata", null);
                            while (rawQuery2.moveToNext()) {
                                try {
                                    hashMap3.put(rawQuery2.getString(0), rawQuery2.getBlob(1));
                                } catch (Throwable th2) {
                                    rawQuery2.close();
                                    throw th2;
                                }
                            }
                            rawQuery2.close();
                            synchronized (this.f30432a) {
                                this.f30435d = hashMap3;
                            }
                        } catch (IllegalStateException e3) {
                            illegalStateException = e3;
                            Log.e("ConfigChimeraService", "Exception while ending the db transaction.", illegalStateException);
                            stopSelf();
                            return 2;
                        }
                    } finally {
                        compileStatement3.close();
                        compileStatement4.close();
                        try {
                            writableDatabase2.endTransaction();
                        } catch (IllegalStateException e4) {
                            illegalStateException = e4;
                            Log.e("ConfigChimeraService", "Exception while ending the db transaction.", illegalStateException);
                            stopSelf();
                            return 2;
                        }
                    }
                }
            } else if ("com.google.android.gms.config.ACTION_PACKAGE_DATA_CLEARED".equals(intent.getAction()) || "com.google.android.gms.config.ACTION_PACKAGE_FULLY_REMOVED".equals(intent.getAction())) {
                String action = intent.getAction();
                if (("com.google.android.gms.config.ACTION_PACKAGE_DATA_CLEARED".equals(action) || "com.google.android.gms.config.ACTION_PACKAGE_FULLY_REMOVED".equals(action)) && (schemeSpecificPart = intent.getData().getSchemeSpecificPart()) != null && !schemeSpecificPart.isEmpty()) {
                    synchronized (this.f30432a) {
                        Map map = this.f30435d;
                        if (map != null) {
                            hashMap = new HashMap(map);
                        } else {
                            hashMap = null;
                        }
                    }
                    m22762a(hashMap, schemeSpecificPart);
                    mo17952a(schemeSpecificPart, (HashMap) null, (swk) null, hashMap, (List) null);
                }
            }
        }
        stopSelf();
        return 2;
    }

    /* renamed from: b */
    public final DataHolder mo17957b(List list) {
        rtu d = rts.m34440d();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rts.m34439a(d, new ConfigExperimentPayload((byte[]) it.next()));
            }
        }
        return d.mo25163a(0);
    }

    /* renamed from: a */
    public static String m22757a(Map map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append("@@");
            sb.append((String) entry.getValue());
            sb.append("##");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final DataHolder mo17958b(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry2 : ((TreeMap) entry.getValue()).entrySet()) {
                    bundle2.putByteArray((String) entry2.getKey(), (byte[]) entry2.getValue());
                }
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
        PackageConfigTable packageConfigTable = new PackageConfigTable(bundle);
        rtu d = rts.m34440d();
        rts.m34439a(d, packageConfigTable);
        return d.mo25163a(0);
    }

    /* renamed from: a */
    static List m22758a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(",");
            for (String str2 : split) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(str2)));
                } catch (NumberFormatException e) {
                    String valueOf = String.valueOf(str2);
                    Log.e("ConfigChimeraService", valueOf.length() == 0 ? new String("Cannot parse fetch metadata timestamp ") : "Cannot parse fetch metadata timestamp ".concat(valueOf), e);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo17959b() {
        try {
            synchronized (this.f30440j) {
                while (this.f30439i) {
                    this.f30440j.wait();
                }
            }
        } catch (InterruptedException e) {
            Log.e("ConfigChimeraService", "interrupted during initial load", e);
        }
    }

    /* renamed from: a */
    public static List m22759a(List list, long j, int i) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        arrayList.add(0, Long.valueOf(j));
        return arrayList.size() > i ? arrayList.subList(0, i) : arrayList;
    }

    /* renamed from: a */
    private static final void m22760a(SQLiteDatabase sQLiteDatabase, String str, Map map) {
        byte[] bArr;
        Cursor rawQuery = sQLiteDatabase.rawQuery(str.length() == 0 ? new String("SELECT package, namespace, key, value FROM ") : "SELECT package, namespace, key, value FROM ".concat(str), null);
        while (rawQuery.moveToNext()) {
            try {
                String string = rawQuery.getString(0);
                String string2 = rawQuery.getString(1);
                String string3 = rawQuery.getString(2);
                if (!rawQuery.isNull(3)) {
                    bArr = rawQuery.getBlob(3);
                } else {
                    bArr = null;
                }
                if (!(string == null || string2 == null || string3 == null)) {
                    HashMap hashMap = (HashMap) map.get(string);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        map.put(string, hashMap);
                    }
                    TreeMap treeMap = (TreeMap) hashMap.get(string2);
                    if (treeMap == null) {
                        treeMap = new TreeMap();
                        hashMap.put(string2, treeMap);
                    }
                    if (bArr != null) {
                        treeMap.put(string3, bArr);
                    } else {
                        treeMap.remove(string3);
                    }
                }
            } finally {
                rawQuery.close();
            }
        }
    }

    /* renamed from: a */
    private final void m22761a(String str, String str2, Map map) {
        byte[] bArr;
        StringBuilder sb = new StringBuilder(str.length() + 52);
        sb.append("SELECT namespace, key, value FROM ");
        sb.append(str);
        sb.append(" WHERE package = ?");
        Cursor rawQuery = this.f30440j.getReadableDatabase().rawQuery(sb.toString(), new String[]{str2});
        while (rawQuery.moveToNext()) {
            try {
                String string = rawQuery.getString(0);
                String string2 = rawQuery.getString(1);
                if (!rawQuery.isNull(2)) {
                    bArr = rawQuery.getBlob(2);
                } else {
                    bArr = null;
                }
                "experiment".equals(str);
                if (!(string == null || string2 == null)) {
                    TreeMap treeMap = (TreeMap) map.get(string);
                    if (bArr != null) {
                        if (treeMap == null) {
                            treeMap = new TreeMap();
                            map.put(string, treeMap);
                        }
                        treeMap.put(string2, bArr);
                    } else if (treeMap != null) {
                        treeMap.remove(string2);
                    }
                }
            } finally {
                rawQuery.close();
            }
        }
    }

    /* renamed from: a */
    public static final void m22762a(Map map, String str) {
        if (map != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
            sb.append(str);
            sb.append(":http_read_timeout_millis");
            map.remove(sb.toString());
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 31);
            sb2.append(str);
            sb2.append(":http_connection_timeout_millis");
            map.remove(sb2.toString());
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 36);
            sb3.append(str);
            sb3.append(":throttling_failure_interval_seconds");
            map.remove(sb3.toString());
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 36);
            sb4.append(str);
            sb4.append(":throttling_success_interval_seconds");
            map.remove(sb4.toString());
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 24);
            sb5.append(str);
            sb5.append(":throttling_failure_rate");
            map.remove(sb5.toString());
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 24);
            sb6.append(str);
            sb6.append(":throttling_success_rate");
            map.remove(sb6.toString());
        }
    }

    /* renamed from: a */
    public final int mo17949a(String str, String str2, int i, int i2, int i3) {
        HashMap hashMap;
        synchronized (this.f30432a) {
            Map map = this.f30435d;
            if (map != null) {
                hashMap = new HashMap(map);
            } else {
                hashMap = null;
            }
        }
        if (hashMap == null || hashMap.isEmpty()) {
            return i;
        }
        if (!hashMap.isEmpty()) {
            String str3 = str2.length() == 0 ? new String("all_packages:") : "all_packages:".concat(str2);
            if (hashMap.get(str3) != null) {
                try {
                    i = Integer.parseInt(new String((byte[]) hashMap.get(str3), f30429h));
                } catch (NumberFormatException e) {
                    Log.w("ConfigChimeraService", "metadata not in the right format", e);
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            String sb2 = sb.toString();
            if (hashMap.get(sb2) != null) {
                try {
                    i = Integer.parseInt(new String((byte[]) hashMap.get(sb2), f30429h));
                } catch (NumberFormatException e2) {
                    Log.w("ConfigChimeraService", "metadata not in the right format", e2);
                }
            }
        }
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo17950a() {
        int i;
        HashMap hashMap;
        try {
            SQLiteDatabase readableDatabase = this.f30440j.getReadableDatabase();
            HashMap hashMap2 = new HashMap();
            Cursor rawQuery = readableDatabase.rawQuery("SELECT package, namespace, key, value FROM main ORDER BY package, namespace, key", null);
            String str = null;
            String str2 = null;
            HashMap hashMap3 = null;
            TreeMap treeMap = null;
            while (true) {
                try {
                    i = 3;
                    if (!rawQuery.moveToNext()) {
                        break;
                    }
                    String string = rawQuery.getString(0);
                    String string2 = rawQuery.getString(1);
                    String string3 = rawQuery.getString(2);
                    byte[] blob = rawQuery.getBlob(3);
                    if (!(string == null || string2 == null || string3 == null || blob == null)) {
                        if (!string.equals(str)) {
                            treeMap = new TreeMap();
                            HashMap hashMap4 = new HashMap();
                            hashMap4.put(string2, treeMap);
                            hashMap2.put(string, hashMap4);
                            hashMap3 = hashMap4;
                            str = string;
                            str2 = string2;
                        }
                        if (!string2.equals(str2)) {
                            TreeMap treeMap2 = new TreeMap();
                            hashMap3.put(string2, treeMap2);
                            treeMap = treeMap2;
                            str2 = string2;
                        }
                        treeMap.put(string3, blob);
                    }
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
            rawQuery.close();
            if (this.f30440j.f45275b) {
                m22760a(readableDatabase, "experiment", hashMap2);
            }
            if (this.f30440j.f45274a) {
                m22760a(readableDatabase, "override", hashMap2);
            }
            HashMap hashMap5 = new HashMap();
            Cursor rawQuery2 = readableDatabase.rawQuery("SELECT package, namespace_digest, recent_success_times, recent_failure_times, device_context_digest, app_context_digest FROM fetch_metadata", null);
            while (rawQuery2.moveToNext()) {
                try {
                    String string4 = rawQuery2.getString(0);
                    String string5 = rawQuery2.getString(1);
                    String string6 = rawQuery2.getString(2);
                    String string7 = rawQuery2.getString(i);
                    byte[] blob2 = rawQuery2.getBlob(4);
                    byte[] blob3 = rawQuery2.getBlob(5);
                    List a = m22758a(string6);
                    List a2 = m22758a(string7);
                    if (!TextUtils.isEmpty(string5)) {
                        HashMap hashMap6 = new HashMap();
                        for (String str3 : string5.split("##")) {
                            String[] split = str3.split("@@");
                            if (split != null && split.length == 2) {
                                hashMap6.put(split[0], split[1]);
                            }
                        }
                        hashMap = hashMap6;
                    } else {
                        hashMap = new HashMap();
                    }
                    hashMap5.put(string4, new swk(a, a2, hashMap, blob2, blob3));
                    i = 3;
                } catch (Throwable th2) {
                    rawQuery2.close();
                    throw th2;
                }
            }
            rawQuery2.close();
            HashMap hashMap7 = new HashMap();
            Cursor rawQuery3 = readableDatabase.rawQuery("SELECT key, value FROM internal_metadata", null);
            while (rawQuery3.moveToNext()) {
                try {
                    hashMap7.put(rawQuery3.getString(0), rawQuery3.getBlob(1));
                } catch (Throwable th3) {
                    rawQuery3.close();
                    throw th3;
                }
            }
            rawQuery3.close();
            HashMap hashMap8 = new HashMap();
            Cursor rawQuery4 = readableDatabase.rawQuery("SELECT package, payload FROM experiment_payload", null);
            while (rawQuery4.moveToNext()) {
                try {
                    String string8 = rawQuery4.getString(0);
                    byte[] blob4 = rawQuery4.getBlob(1);
                    List list = (List) hashMap8.get(string8);
                    if (list == null) {
                        list = new ArrayList();
                        hashMap8.put(string8, list);
                    }
                    list.add(blob4);
                } catch (Throwable th4) {
                    rawQuery4.close();
                    throw th4;
                }
            }
            rawQuery4.close();
            synchronized (this.f30432a) {
                this.f30433b = hashMap2;
                this.f30434c = hashMap5;
                this.f30435d = hashMap7;
                this.f30436e = hashMap8;
            }
        } catch (Exception e) {
            Log.e("ConfigChimeraService", "Cannot open config database.", e);
        }
    }

    /* renamed from: a */
    public final void mo17951a(asfb asfb) {
        if (asfb.mo49124e()) {
            asfb.mo49120c();
        }
    }

    /* renamed from: a */
    public final void mo17952a(String str, HashMap hashMap, swk swk, Map map, List list) {
        SQLiteDatabase sQLiteDatabase;
        IllegalStateException illegalStateException;
        HashMap hashMap2;
        String str2 = str;
        HashMap hashMap3 = hashMap;
        swk swk2 = swk;
        Map map2 = map;
        List list2 = list;
        try {
            sQLiteDatabase = this.f30440j.getWritableDatabase();
        } catch (IllegalStateException e) {
            Log.e("ConfigChimeraService", "Database not in a state to be opened. We are probably being destroyed.", e);
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase != null) {
            try {
                SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("DELETE FROM main WHERE package = ?");
                SQLiteStatement compileStatement2 = sQLiteDatabase.compileStatement("INSERT INTO main (package, namespace, key, value) VALUES (?, ?, ?, ?)");
                SQLiteStatement compileStatement3 = sQLiteDatabase.compileStatement("DELETE FROM fetch_metadata WHERE package = ?");
                SQLiteStatement compileStatement4 = sQLiteDatabase.compileStatement("INSERT INTO fetch_metadata (package, namespace_digest, recent_success_times, recent_failure_times, device_context_digest, app_context_digest) VALUES (?, ?, ?, ?, ?, ?)");
                SQLiteStatement compileStatement5 = sQLiteDatabase.compileStatement("DELETE FROM internal_metadata");
                SQLiteStatement compileStatement6 = sQLiteDatabase.compileStatement("INSERT INTO internal_metadata (key, value) VALUES (?, ?)");
                SQLiteStatement compileStatement7 = sQLiteDatabase.compileStatement("DELETE FROM experiment_payload WHERE package = ?");
                SQLiteStatement compileStatement8 = sQLiteDatabase.compileStatement("INSERT INTO experiment_payload (package, payload) values (?, ?)");
                sQLiteDatabase.beginTransaction();
                try {
                    compileStatement.bindString(1, str2);
                    compileStatement.execute();
                    if (hashMap3 != null) {
                        try {
                            compileStatement2.bindString(1, str2);
                            Iterator it = hashMap.keySet().iterator();
                            while (it.hasNext()) {
                                Iterator it2 = it;
                                String str3 = (String) it.next();
                                TreeMap treeMap = (TreeMap) hashMap3.get(str3);
                                if (treeMap != null) {
                                    compileStatement2.bindString(2, str3);
                                    for (Iterator it3 = treeMap.entrySet().iterator(); it3.hasNext(); it3 = it3) {
                                        Map.Entry entry = (Map.Entry) it3.next();
                                        compileStatement2.bindString(3, (String) entry.getKey());
                                        compileStatement2.bindBlob(4, (byte[]) entry.getValue());
                                        compileStatement2.execute();
                                    }
                                    hashMap3 = hashMap;
                                    it = it2;
                                } else {
                                    hashMap3 = hashMap;
                                    it = it2;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            compileStatement.close();
                            compileStatement2.close();
                            compileStatement3.close();
                            compileStatement4.close();
                            compileStatement5.close();
                            compileStatement6.close();
                            compileStatement7.close();
                            compileStatement8.close();
                            try {
                                sQLiteDatabase.endTransaction();
                                throw th;
                            } catch (IllegalStateException e2) {
                                illegalStateException = e2;
                                Log.e("ConfigChimeraService", "Exception while ending the db transaction.", illegalStateException);
                            }
                        }
                    }
                    compileStatement3.bindString(1, str2);
                    compileStatement3.execute();
                    if (swk2 != null) {
                        compileStatement4.bindString(1, str2);
                        compileStatement4.bindString(2, swk.mo26202b());
                        compileStatement4.bindString(3, m22756a(swk2.f45287d));
                        compileStatement4.bindString(4, swk.mo26200a());
                        byte[] bArr = swk2.f45285b;
                        if (bArr != null) {
                            compileStatement4.bindBlob(5, bArr);
                        } else {
                            compileStatement4.bindNull(5);
                        }
                        byte[] bArr2 = swk2.f45286c;
                        if (bArr2 != null) {
                            compileStatement4.bindBlob(6, bArr2);
                        } else {
                            compileStatement4.bindNull(6);
                        }
                        compileStatement4.execute();
                    }
                    compileStatement5.execute();
                    if (map2 != null) {
                        for (Iterator it4 = map.entrySet().iterator(); it4.hasNext(); it4 = it4) {
                            Map.Entry entry2 = (Map.Entry) it4.next();
                            compileStatement6.bindString(1, (String) entry2.getKey());
                            compileStatement6.bindBlob(2, (byte[]) entry2.getValue());
                            compileStatement6.execute();
                        }
                    }
                    compileStatement7.bindString(1, str2);
                    compileStatement7.execute();
                    if (list2 != null && !list.isEmpty()) {
                        Iterator it5 = list.iterator();
                        while (it5.hasNext()) {
                            compileStatement8.bindString(1, str2);
                            compileStatement8.bindBlob(2, (byte[]) it5.next());
                            compileStatement8.execute();
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    compileStatement.close();
                    compileStatement2.close();
                    compileStatement3.close();
                    compileStatement4.close();
                    compileStatement5.close();
                    compileStatement6.close();
                    compileStatement7.close();
                    compileStatement8.close();
                    try {
                        sQLiteDatabase.endTransaction();
                        if (!this.f30440j.f45275b) {
                            hashMap2 = hashMap;
                        } else {
                            if (hashMap == null) {
                                hashMap2 = new HashMap();
                            } else {
                                hashMap2 = hashMap;
                            }
                            m22761a("experiment", str2, hashMap2);
                        }
                        if (this.f30440j.f45274a) {
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap();
                            }
                            m22761a("override", str2, hashMap2);
                        }
                        synchronized (this.f30432a) {
                            Map map3 = this.f30433b;
                            if (map3 != null) {
                                if (hashMap2 == null) {
                                    map3.remove(str2);
                                } else {
                                    map3.put(str2, hashMap2);
                                }
                            }
                            Map map4 = this.f30434c;
                            if (map4 != null) {
                                if (swk2 != null) {
                                    map4.put(str2, swk2);
                                } else {
                                    map4.remove(str2);
                                }
                            }
                            Map map5 = this.f30435d;
                            if (map5 != null) {
                                map5.clear();
                                if (map2 != null) {
                                    this.f30435d.putAll(map2);
                                }
                            }
                            Map map6 = this.f30436e;
                            if (map6 != null) {
                                if (list2 != null) {
                                    map6.put(str2, list2);
                                } else {
                                    map6.remove(str2);
                                }
                            }
                        }
                    } catch (IllegalStateException e3) {
                        illegalStateException = e3;
                        Log.e("ConfigChimeraService", "Exception while ending the db transaction.", illegalStateException);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    compileStatement.close();
                    compileStatement2.close();
                    compileStatement3.close();
                    compileStatement4.close();
                    compileStatement5.close();
                    compileStatement6.close();
                    compileStatement7.close();
                    compileStatement8.close();
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            } catch (IllegalStateException e4) {
                Log.e("ConfigChimeraService", "Couldn't compile db statements.", e4);
            }
        }
    }

    /* renamed from: a */
    public final void mo17953a(swy swy, int i) {
        DataHolder b = mo17958b((Map) null);
        DataHolder b2 = mo17957b((List) null);
        swy.mo26197a(Status.f30107a, new FetchConfigIpcResponse(i, b, b2));
        if (b != null && !b.mo17768b()) {
            b.close();
        }
        if (b2 != null && !b2.mo17768b()) {
            b2.close();
        }
    }

    /* renamed from: a */
    public final boolean mo17954a(int i, String str) {
        int i2 = -1;
        try {
            ApplicationInfo applicationInfo = this.f30442m.getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                i2 = applicationInfo.uid;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("ConfigChimeraService", "no such package to check permission for", e);
        }
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final byte[] mo17955a(String str, Map map) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update((byte) 0);
            instance.update(str.getBytes(f30429h));
            instance.update((byte) 0);
            for (Map.Entry entry : map.entrySet()) {
                instance.update(((String) entry.getKey()).getBytes(f30429h));
                instance.update((byte) 0);
                instance.update(((String) entry.getValue()).getBytes(f30429h));
                instance.update((byte) 0);
            }
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
