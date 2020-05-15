package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ftv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ftv extends SQLiteOpenHelper {

    /* renamed from: a */
    public final Context f17225a;

    /* renamed from: b */
    public final apox f17226b;

    /* renamed from: c */
    public final ftw f17227c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ftv(Context context, String str, int i, ftw ftw) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        apox b = aplx.m70651b(context, null);
        this.f17225a = context;
        this.f17226b = b;
        this.f17227c = ftw;
    }

    /* renamed from: a */
    public static final Cursor m12377a(Cursor cursor, ftz ftz, SQLiteDatabase sQLiteDatabase) {
        if (cursor == null) {
            return null;
        }
        String a = ftt.m12365a(sQLiteDatabase, ftz);
        return a != null ? fta.m12292a(cursor, a) : cursor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11312a(SQLiteDatabase sQLiteDatabase);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11313a(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo11314a();

    /* renamed from: c */
    public final SQLiteDatabase mo11320c() {
        try {
            return super.getReadableDatabase();
        } catch (SQLiteException e) {
            Log.e("AppDataSearchHelper", "Failed to get a readable database", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo11321d() {
        throw null;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        mo11312a(sQLiteDatabase);
        ftt.m12366a(sQLiteDatabase);
        for (ftz ftz : this.f17227c.f17229b) {
            m12379a(sQLiteDatabase, ftz);
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        RegisterSectionInfo[] registerSectionInfoArr;
        m12380b(sQLiteDatabase);
        if (mo11314a()) {
            ftx ftx = new ftx(this.f17225a, this, this.f17226b);
            ArrayList arrayList = new ArrayList();
            ftz[] ftzArr = ftx.f17232c.f17229b;
            for (ftz ftz : ftzArr) {
                apox apox = ftx.f17231b;
                String packageName = ftx.f17230a.getPackageName();
                String str = ftz.f17242a;
                roz b = rpa.m34196b();
                b.f43472a = new appo(packageName, str);
                aucb a = ((rjx) apox).mo24701a(b.mo24977a());
                try {
                    aucu.m76782a(a);
                    RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) a.mo50386d();
                    if (registerCorpusInfo == null) {
                        String valueOf = String.valueOf(ftz.f17242a);
                        arrayList.add(valueOf.length() == 0 ? new String("Could not get info for ") : "Could not get info for ".concat(valueOf));
                    } else {
                        Uri.Builder authority = new Uri.Builder().scheme("content").authority(ftx.f17232c.f17228a);
                        String valueOf2 = String.valueOf(Uri.encode(ftz.f17242a));
                        Uri build = authority.path(valueOf2.length() == 0 ? new String("appdatasearch/") : "appdatasearch/".concat(valueOf2)).build();
                        if (!registerCorpusInfo.f9637c.toString().startsWith(build.toString())) {
                            String valueOf3 = String.valueOf(registerCorpusInfo.f9637c);
                            String str2 = ftz.f17242a;
                            String valueOf4 = String.valueOf(build);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 62 + String.valueOf(str2).length() + String.valueOf(valueOf4).length());
                            sb.append("Content provider URI ");
                            sb.append(valueOf3);
                            sb.append(" for corpus ");
                            sb.append(str2);
                            sb.append(" does not match expected URI ");
                            sb.append(valueOf4);
                            arrayList.add(sb.toString());
                        }
                        RegisterSectionInfo[] registerSectionInfoArr2 = registerCorpusInfo.f9638d;
                        HashSet<String> hashSet = new HashSet(ftz.f17251j.keySet());
                        int length = registerSectionInfoArr2.length;
                        int i = 0;
                        while (i < length) {
                            RegisterSectionInfo registerSectionInfo = registerSectionInfoArr2[i];
                            hashSet.remove(registerSectionInfo.f9646a);
                            if (!ftz.f17251j.containsKey(registerSectionInfo.f9646a)) {
                                String str3 = ftz.f17245d;
                                String str4 = registerSectionInfo.f9646a;
                                String str5 = ftz.f17242a;
                                registerSectionInfoArr = registerSectionInfoArr2;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 74 + String.valueOf(str4).length() + String.valueOf(str5).length());
                                sb2.append("CorpusTableMapping for ");
                                sb2.append(str3);
                                sb2.append(" does not contain a mapping for section ");
                                sb2.append(str4);
                                sb2.append(" in corpus ");
                                sb2.append(str5);
                                arrayList.add(sb2.toString());
                            } else {
                                registerSectionInfoArr = registerSectionInfoArr2;
                            }
                            i++;
                            registerSectionInfoArr2 = registerSectionInfoArr;
                        }
                        if (!hashSet.isEmpty()) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Mapping for ");
                            sb3.append(hashSet.size());
                            sb3.append(" non-existent sections(s) for corpus ");
                            sb3.append(ftz.f17242a);
                            sb3.append(": ");
                            for (String str6 : hashSet) {
                                sb3.append("\n  ");
                                sb3.append(str6);
                                sb3.append(" -> ");
                                sb3.append((String) ftz.f17251j.get(str6));
                            }
                            arrayList.add(sb3.toString());
                        }
                    }
                } catch (InterruptedException | ExecutionException e) {
                    String valueOf5 = String.valueOf(ftz.f17242a);
                    arrayList.add(valueOf5.length() == 0 ? new String("Could not get info for ") : "Could not get info for ".concat(valueOf5));
                }
            }
            if (arrayList.size() > 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Encountered ");
                sb4.append(arrayList.size());
                sb4.append(" error(s) with corpus configuration: ");
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb4.append("\n");
                    sb4.append((String) arrayList.get(i2));
                }
                throw new AssertionError(sb4.toString());
            }
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        mo11313a(sQLiteDatabase, i, i2);
        m12380b(sQLiteDatabase);
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
    /* renamed from: b */
    private final void m12380b(SQLiteDatabase sQLiteDatabase) {
        int i;
        ftt.m12366a(sQLiteDatabase);
        if (fua.m12404c(sQLiteDatabase, "version_appdatasearch")) {
            Cursor query = sQLiteDatabase.query("version_appdatasearch", new String[]{"version"}, null, null, null, null, null);
            if (query == null) {
                Log.w("AppDataSearchHelper", "Empty version table.");
                i = 0;
            } else {
                try {
                    if (query.moveToNext()) {
                        i = query.getInt(query.getColumnIndex("version"));
                    } else {
                        Log.w("AppDataSearchHelper", "Empty version table.");
                        query.close();
                        i = 0;
                    }
                } finally {
                    query.close();
                }
            }
        } else {
            i = 0;
        }
        if (i < 6) {
            if (i <= 0) {
                for (String str : fua.m12400a(sQLiteDatabase, "_appdatasearch_seqno_table")) {
                    fua.m12401a(sQLiteDatabase, str);
                }
                for (String str2 : fua.m12402b(sQLiteDatabase, "_appdatasearch_insert_trigger", "_appdatasearch_delete_trigger", "_appdatasearch_update_trigger")) {
                    fua.m12403b(sQLiteDatabase, str2);
                }
            }
            if (i == 2) {
                sQLiteDatabase.execSQL(String.format("ALTER TABLE [%s] ADD COLUMN [%s] INTEGER", "incarnation_appdatasearch", "seqno_table_complete"));
            } else if (i >= 3) {
                for (String str3 : ftu.m12369a(sQLiteDatabase)) {
                    fua.m12401a(sQLiteDatabase, str3);
                }
                for (String str4 : ftu.m12371b(sQLiteDatabase)) {
                    fua.m12403b(sQLiteDatabase, str4);
                }
            }
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("version", (Integer) 6);
            sQLiteDatabase.update("version_appdatasearch", contentValues, null, null);
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ftz[] ftzArr = this.f17227c.f17229b;
        for (ftz ftz : ftzArr) {
            hashSet.add(ftu.m12368a(ftz));
            hashSet2.addAll(ftu.m12376g(ftz));
        }
        Set<String> a = ftu.m12369a(sQLiteDatabase);
        for (String str5 : a) {
            if (!hashSet.contains(str5)) {
                fua.m12401a(sQLiteDatabase, str5);
            }
        }
        Set<String> b = ftu.m12371b(sQLiteDatabase);
        for (String str6 : b) {
            if (!hashSet2.contains(str6)) {
                fua.m12403b(sQLiteDatabase, str6);
            }
        }
        ftz[] ftzArr2 = this.f17227c.f17229b;
        for (ftz ftz2 : ftzArr2) {
            if (!a.contains(ftu.m12368a(ftz2)) || !b.containsAll(ftu.m12376g(ftz2))) {
                m12379a(sQLiteDatabase, ftz2);
            }
        }
    }

    /* renamed from: a */
    public static String m12378a(String str, String str2) {
        becj a = becj.m91776a();
        a.mo58556a("[");
        a.mo58556a(str);
        a.mo58556a("].");
        a.mo58556a("[");
        a.mo58556a(str2);
        a.mo58556a("]");
        return ((bech) a.mo58557b()).f106902a;
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
    public static void m12379a(SQLiteDatabase sQLiteDatabase, ftz ftz) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        ftz ftz2 = ftz;
        String a = ftu.m12368a(ftz);
        fua.m12401a(sQLiteDatabase2, a);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 108);
        sb.append("CREATE TABLE [");
        sb.append(a);
        sb.append("] (seqno INTEGER PRIMARY KEY AUTOINCREMENT,action_type INTEGER,uri TEXT,tag TEXT DEFAULT NULL)");
        sQLiteDatabase2.execSQL(sb.toString());
        String str = ftz2.f17247f;
        String str2 = ftz2.f17245d;
        int length = String.valueOf(a).length();
        StringBuilder sb2 = new StringBuilder(length + 52 + str.length() + String.valueOf(str2).length());
        sb2.append("INSERT INTO [");
        sb2.append(a);
        sb2.append("] (action_type,uri) SELECT 0,[");
        sb2.append(str);
        sb2.append("] FROM [");
        sb2.append(str2);
        sb2.append("]");
        sQLiteDatabase2.execSQL(sb2.toString());
        String str3 = ftz2.f17246e;
        if (str3 != null) {
            String str4 = ftz2.f17247f;
            String str5 = ftz2.f17248g;
            int length2 = String.valueOf(a).length();
            int length3 = str4.length();
            StringBuilder sb3 = new StringBuilder(length2 + 59 + length3 + String.valueOf(str5).length() + str3.length());
            sb3.append("INSERT INTO [");
            sb3.append(a);
            sb3.append("] (action_type,uri,tag) SELECT 0,[");
            sb3.append(str4);
            sb3.append("],[");
            sb3.append(str5);
            sb3.append("] FROM [");
            sb3.append(str3);
            sb3.append("]");
            sQLiteDatabase2.execSQL(sb3.toString());
        }
        ftt.m12367a(sQLiteDatabase2, ftz2, true);
        String b = ftu.m12370b(ftz);
        String c = ftu.m12372c(ftz);
        String d = ftu.m12373d(ftz);
        String str6 = ftz2.f17247f;
        fua.m12403b(sQLiteDatabase2, b);
        fua.m12403b(sQLiteDatabase2, d);
        fua.m12403b(sQLiteDatabase2, c);
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("corpus_name", ftz2.f17242a);
        contentValues.put("incarnation", String.format("%d-%s", Long.valueOf(System.currentTimeMillis()), Long.toHexString(new Random().nextLong())));
        contentValues.put("seqno_table_complete", (Integer) 1);
        sQLiteDatabase2.replace("incarnation_appdatasearch", null, contentValues);
        StringBuilder sb4 = new StringBuilder(String.valueOf(a).length() + 49);
        sb4.append("INSERT INTO [");
        sb4.append(a);
        sb4.append("]  (action_type,uri) VALUES (%s,%s);");
        String sb5 = sb4.toString();
        StringBuilder sb6 = new StringBuilder(str6.length() + 6);
        sb6.append("new.[");
        sb6.append(str6);
        sb6.append("]");
        String format = String.format(sb5, 0, sb6.toString());
        StringBuilder sb7 = new StringBuilder(str6.length() + 6);
        sb7.append("old.[");
        sb7.append(str6);
        sb7.append("]");
        String format2 = String.format(sb5, 1, sb7.toString());
        String str7 = ftz2.f17243b;
        int length4 = String.valueOf(b).length();
        String str8 = "old.[";
        StringBuilder sb8 = new StringBuilder(length4 + 60 + String.valueOf(str7).length() + String.valueOf(format).length());
        sb8.append("CREATE TRIGGER [");
        sb8.append(b);
        sb8.append("] AFTER INSERT ON [");
        sb8.append(str7);
        sb8.append("] FOR EACH ROW BEGIN ");
        sb8.append(format);
        String str9 = "] AFTER INSERT ON [";
        sb8.append(" END");
        sQLiteDatabase2.execSQL(sb8.toString());
        int length5 = String.valueOf(c).length();
        String str10 = "]";
        StringBuilder sb9 = new StringBuilder(length5 + 60 + String.valueOf(str7).length() + String.valueOf(format2).length());
        sb9.append("CREATE TRIGGER [");
        sb9.append(c);
        sb9.append("] AFTER DELETE ON [");
        sb9.append(str7);
        sb9.append("] FOR EACH ROW BEGIN ");
        sb9.append(format2);
        sb9.append(" END");
        sQLiteDatabase2.execSQL(sb9.toString());
        int length6 = String.valueOf(d).length();
        String str11 = "] AFTER DELETE ON [";
        StringBuilder sb10 = new StringBuilder(length6 + 60 + String.valueOf(str7).length() + String.valueOf(format).length());
        sb10.append("CREATE TRIGGER [");
        sb10.append(d);
        sb10.append("] AFTER UPDATE ON [");
        sb10.append(str7);
        sb10.append("] FOR EACH ROW BEGIN ");
        sb10.append(format);
        sb10.append(" END");
        sQLiteDatabase2.execSQL(sb10.toString());
        String str12 = ftz2.f17244c;
        if (str12 != null) {
            String str13 = ftz2.f17247f;
            String str14 = ftz2.f17248g;
            String e = ftu.m12374e(ftz);
            String f = ftu.m12375f(ftz);
            fua.m12403b(sQLiteDatabase2, e);
            fua.m12403b(sQLiteDatabase2, f);
            StringBuilder sb11 = new StringBuilder(String.valueOf(a).length() + 55);
            sb11.append("INSERT INTO [");
            sb11.append(a);
            sb11.append("] (action_type,uri,tag) VALUES (%s,%s,%s);");
            String sb12 = sb11.toString();
            StringBuilder sb13 = new StringBuilder(str13.length() + 6);
            sb13.append("new.[");
            sb13.append(str13);
            sb13.append(str10);
            StringBuilder sb14 = new StringBuilder(String.valueOf(str14).length() + 6);
            sb14.append("new.[");
            sb14.append(str14);
            sb14.append(str10);
            String format3 = String.format(sb12, 0, sb13.toString(), sb14.toString());
            StringBuilder sb15 = new StringBuilder(str13.length() + 6);
            sb15.append(str8);
            sb15.append(str13);
            sb15.append(str10);
            StringBuilder sb16 = new StringBuilder(String.valueOf(str14).length() + 6);
            sb16.append(str8);
            sb16.append(str14);
            sb16.append(str10);
            String format4 = String.format(sb12, 1, sb15.toString(), sb16.toString());
            int length7 = String.valueOf(e).length();
            StringBuilder sb17 = new StringBuilder(length7 + 60 + str12.length() + String.valueOf(format3).length());
            sb17.append("CREATE TRIGGER [");
            sb17.append(e);
            sb17.append(str9);
            sb17.append(str12);
            sb17.append("] FOR EACH ROW BEGIN ");
            sb17.append(format3);
            sb17.append(" END");
            sQLiteDatabase2.execSQL(sb17.toString());
            StringBuilder sb18 = new StringBuilder(String.valueOf(f).length() + 60 + str12.length() + String.valueOf(format4).length());
            sb18.append("CREATE TRIGGER [");
            sb18.append(f);
            sb18.append(str11);
            sb18.append(str12);
            sb18.append("] FOR EACH ROW BEGIN ");
            sb18.append(format4);
            sb18.append(" END");
            sQLiteDatabase2.execSQL(sb18.toString());
        }
    }

    /* renamed from: b */
    public final long mo11317b(ftz ftz) {
        SQLiteDatabase c = mo11320c();
        long j = 0;
        if (c == null) {
            return 0;
        }
        String a = ftu.m12368a(ftz);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 25);
        sb.append("SELECT MAX(seqno) FROM [");
        sb.append(a);
        sb.append("]");
        Cursor rawQuery = c.rawQuery(sb.toString(), null);
        if (rawQuery == null) {
            return 0;
        }
        try {
            if (rawQuery.moveToNext()) {
                j = rawQuery.getLong(0);
            }
            return j;
        } finally {
            rawQuery.close();
        }
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo11315a(ftz ftz) {
        return mo11316a(ftz, 30000);
    }

    /* renamed from: b */
    public final SQLiteDatabase mo11318b() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            Log.e("AppDataSearchHelper", "Failed to get a writable database", e);
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo11316a(ftz ftz, long j) {
        if (Arrays.asList(this.f17227c.f17229b).contains(ftz)) {
            String str = ftz.f17242a;
            aucb b = this.f17226b.mo47488b(this.f17225a.getPackageName(), str);
            try {
                aucu.m76783a(b, j, TimeUnit.MILLISECONDS);
                CorpusStatus corpusStatus = (CorpusStatus) b.mo50386d();
                if (!corpusStatus.f9523a) {
                    String str2 = ftz.f17242a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 23);
                    sb.append("Couldn't find corpus '");
                    sb.append(str2);
                    sb.append("'");
                    Log.e("AppDataSearchHelper", sb.toString());
                    return false;
                }
                long j2 = 0;
                if (!corpusStatus.f9529g.equals(ftt.m12365a(mo11320c(), ftz))) {
                    if (mo11321d()) {
                        try {
                            aucu.m76783a(this.f17226b.mo47486a(this.f17225a.getPackageName(), str), j, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException | ExecutionException | TimeoutException e) {
                            String valueOf = String.valueOf(ftz.f17242a);
                            Log.w("AppDataSearchHelper", valueOf.length() == 0 ? new String("Couldn't clear corpus ") : "Couldn't clear corpus ".concat(valueOf));
                        }
                    }
                } else if (!mo11319b(ftz, corpusStatus.f9525c)) {
                    return false;
                } else {
                    j2 = corpusStatus.f9524b;
                }
                long b2 = mo11317b(ftz);
                if (b2 <= j2) {
                    return true;
                }
                try {
                    return ((Boolean) aucu.m76783a(this.f17226b.mo47487a(this.f17225a.getPackageName(), str, b2), j, TimeUnit.MILLISECONDS)).booleanValue();
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    String str3 = ftz.f17242a;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 39);
                    sb2.append("Couldn't request indexing for corpus '");
                    sb2.append(str3);
                    sb2.append("'");
                    Log.w("AppDataSearchHelper", sb2.toString());
                    return false;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                String valueOf2 = String.valueOf(ftz.f17242a);
                Log.e("AppDataSearchHelper", valueOf2.length() == 0 ? new String("Couldn't fetch status for corpus ") : "Couldn't fetch status for corpus ".concat(valueOf2));
                return false;
            }
        } else {
            String str4 = ftz.f17242a;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 57);
            sb3.append("The table ");
            sb3.append(str4);
            sb3.append(" does not have a registered CorpusTableMapping.");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: b */
    public final boolean mo11319b(ftz ftz, long j) {
        SQLiteDatabase b = mo11318b();
        if (b == null) {
            return false;
        }
        String a = ftu.m12368a(ftz);
        b.beginTransaction();
        try {
            b.delete(a, "seqno < ?", new String[]{String.valueOf(j)});
            ftt.m12367a(b, ftz, false);
            b.setTransactionSuccessful();
            return true;
        } finally {
            b.endTransaction();
        }
    }
}
