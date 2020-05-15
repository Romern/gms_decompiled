package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* renamed from: aunh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aunh extends srp {

    /* renamed from: a */
    private static final aunx f92149a = new aunx("TrustAgent", "SmartLockDbHelper");

    /* renamed from: b */
    private static WeakReference f92150b = new WeakReference(null);

    /* renamed from: a */
    public static synchronized aunh m77384a() {
        aunh aunh;
        synchronized (aunh.class) {
            aunh = (aunh) f92150b.get();
            if (aunh == null) {
                aunh = new aunh(rpr.m34216b());
                f92150b = new WeakReference(aunh);
            }
        }
        return aunh;
    }

    /* renamed from: b */
    private static String[] m77386b() {
        return new String[]{"Bluetooth", "ConnectionlessBle", "FaceUnlock", "NFC", "OnBody", "Place", "VoiceUnlock"};
    }

    /* renamed from: c */
    private final void m77387c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS SmartLock_status_model");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Bluetooth");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS OnBody");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS VoiceUnlock");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS FaceUnlock");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Place");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ConnectionlessBle");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS NFC");
        onCreate(sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        f92149a.mo50711a("onDowngrade from version %s to version %s", Integer.valueOf(i), Integer.valueOf(i2)).mo50709d();
        if (i == 2 && i2 == 1) {
            String[] b = m77386b();
            String join = TextUtils.join(",", m77388c());
            sQLiteDatabase.execSQL(m77385a("Bluetooth"));
            sQLiteDatabase.execSQL(m77385a("OnBody"));
            sQLiteDatabase.execSQL(m77385a("Place"));
            sQLiteDatabase.execSQL(m77385a("NFC"));
            sQLiteDatabase.execSQL(m77385a("FaceUnlock"));
            sQLiteDatabase.execSQL(m77385a("VoiceUnlock"));
            sQLiteDatabase.execSQL(m77385a("ConnectionlessBle"));
            for (String str : b) {
                sQLiteDatabase.execSQL(String.format("INSERT INTO %s (%s) SELECT %s FROM %s WHERE %s = '%s';", str, join, join, "Trustlet", aung.f92138b, str));
                f92149a.mo50711a("Copied over to version 1 table %s successfully.", str);
            }
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Trustlet;");
            return;
        }
        m77387c(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        f92149a.mo50711a("onUpgrade from version %s to version %s", Integer.valueOf(i), Integer.valueOf(i2)).mo50708c();
        if (i == 1 && i2 == 2) {
            String[] b = m77386b();
            String join = TextUtils.join(",", (String[]) sqc.m35962a((Object[][]) new String[][]{new String[]{aung.f92138b}, m77388c()}));
            sQLiteDatabase.execSQL(aung.f92148l);
            for (String str : b) {
                String str2 = aung.f92138b;
                f92149a.mo50711a("Adding column %s to %s.", str2, str);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + 5);
                sb.append("ALTER TABLE ");
                sb.append(str);
                sb.append(" ADD COLUMN ");
                sb.append(str2);
                sb.append("  TEXT");
                String valueOf = String.valueOf(sb.toString());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 11);
                sb2.append(valueOf);
                sb2.append(" DEFAULT ''");
                sQLiteDatabase.execSQL(String.valueOf(sb2.toString()).concat(";"));
                sQLiteDatabase.execSQL(String.format("UPDATE %s SET %s = '%s';", str, aung.f92138b, str));
                sQLiteDatabase.execSQL(String.format("INSERT INTO %s (%s) SELECT %s FROM %s;", "Trustlet", join, join, str));
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 22);
                sb3.append("DROP TABLE IF EXISTS ");
                sb3.append(str);
                sb3.append(";");
                sQLiteDatabase.execSQL(sb3.toString());
                f92149a.mo50711a("Old table %s copied over to new table successfully.", str);
            }
            return;
        }
        m77387c(sQLiteDatabase);
    }

    private aunh(Context context) {
        super(context, "SmartLockStatusMonitor.db", "SmartLockStatusMonitor.db", 2);
    }

    /* renamed from: c */
    private static String[] m77388c() {
        return new String[]{"__id__", aung.f92137a, aung.f92139c, aung.f92140d, aung.f92141e, aung.f92142f, aung.f92143g, aung.f92144h, aung.f92145i, aung.f92146j, aung.f92147k};
    }

    /* renamed from: a */
    private static String m77385a(String str) {
        String str2 = aung.f92137a;
        String str3 = aung.f92139c;
        String str4 = aung.f92140d;
        String str5 = aung.f92141e;
        String str6 = aung.f92142f;
        String str7 = aung.f92143g;
        String str8 = aung.f92144h;
        String str9 = aung.f92145i;
        String str10 = aung.f92146j;
        String str11 = aung.f92147k;
        int length = str.length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        int length6 = String.valueOf(str6).length();
        int length7 = String.valueOf(str7).length();
        int length8 = String.valueOf(str8).length();
        int length9 = String.valueOf(str9).length();
        StringBuilder sb = new StringBuilder(length + 147 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(str10).length() + String.valueOf(str11).length());
        sb.append("CREATE TABLE IF NOT EXISTS ");
        sb.append(str);
        sb.append(" (_id INTEGER PRIMARY KEY,__id__ TEXT,");
        sb.append(str2);
        sb.append(" TEXT,");
        sb.append(str3);
        sb.append(" INTEGER,");
        sb.append(str4);
        sb.append(" TEXT,");
        sb.append(str5);
        sb.append(" TEXT,");
        sb.append(str6);
        sb.append(" INTEGER,");
        sb.append(str7);
        sb.append(" INTEGER,");
        sb.append(str8);
        sb.append(" INTEGER,");
        sb.append(str9);
        sb.append(" INTEGER,");
        sb.append(str10);
        sb.append(" INTEGER,");
        sb.append(str11);
        sb.append(" INTEGER )");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(aunf.f92136j);
        sQLiteDatabase.execSQL(aung.f92148l);
    }
}
