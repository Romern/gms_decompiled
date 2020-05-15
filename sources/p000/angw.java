package p000;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* renamed from: angw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class angw extends angu {

    /* renamed from: a */
    private final angj f76819a;

    /* renamed from: b */
    private final angx f76820b;

    /* renamed from: a */
    public static void m64357a(Context context, anfw anfw, angx angx) {
        SQLiteDatabase sQLiteDatabase;
        Cursor query;
        Throwable th;
        Cursor query2;
        Throwable th2;
        Cursor query3;
        Throwable th3;
        Cursor query4;
        Throwable th4;
        Cursor query5;
        Throwable th5;
        Cursor query6;
        Throwable th6;
        angx angx2 = angx;
        if (anhe.m64387b(angx2.f76829c)) {
            SQLiteDatabase readableDatabase = anfw.getReadableDatabase();
            anfg b = anfg.m64153b(context);
            try {
                SQLiteDatabase writableDatabase = b.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    sQLiteDatabase = writableDatabase;
                    try {
                        query = readableDatabase.query("Packages", (String[]) anfu.f76778a.mo6606a(), "packageName = ?", new String[]{angx2.f76829c}, null, null, null);
                        while (query.moveToNext()) {
                            sQLiteDatabase.replaceOrThrow("Packages", null, anfw.m64175a(query));
                        }
                        if (query != null) {
                            query.close();
                        }
                        sQLiteDatabase.delete("LogSources", "packageName = ?", new String[]{angx2.f76829c});
                        query2 = readableDatabase.query("LogSources", anfr.f76776a, "packageName = ?", new String[]{angx2.f76829c}, null, null, null);
                        while (query2.moveToNext()) {
                            sQLiteDatabase.insertOrThrow("LogSources", null, anfw.m64175a(query2));
                        }
                        if (query2 != null) {
                            query2.close();
                        }
                        sQLiteDatabase.delete("Flags", "packageName = ? AND committed = 1", new String[]{angx2.f76829c});
                        query3 = readableDatabase.query("Flags", anfq.f76774a, "packageName = ? AND committed = 1", new String[]{angx2.f76829c}, null, null, null);
                        while (query3.moveToNext()) {
                            sQLiteDatabase.insertOrThrow("Flags", null, anfw.m64175a(query3));
                        }
                        if (query3 != null) {
                            query3.close();
                        }
                        sQLiteDatabase.delete("FlagOverrides", "packageName = ? AND committed = 1", new String[]{angx2.f76829c});
                        query4 = readableDatabase.query("FlagOverrides", anfp.f76773a, "packageName = ? AND committed = 1", new String[]{angx2.f76829c}, null, null, null);
                        while (query4.moveToNext()) {
                            sQLiteDatabase.insertOrThrow("FlagOverrides", null, anfw.m64175a(query4));
                        }
                        if (query4 != null) {
                            query4.close();
                        }
                        sQLiteDatabase.delete("ExperimentTokens", "packageName = ? AND isCommitted = 1", new String[]{angx2.f76829c});
                        query5 = readableDatabase.query("ExperimentTokens", anfo.f76772a, "packageName = ? AND isCommitted = 1", new String[]{angx2.f76829c}, null, null, null);
                        while (query5.moveToNext()) {
                            sQLiteDatabase.insertOrThrow("ExperimentTokens", null, anfw.m64175a(query5));
                        }
                        if (query5 != null) {
                            query5.close();
                        }
                        sQLiteDatabase.delete("CrossLoggedExperimentTokens", "fromPackageName = ? AND isCommitted = 1", new String[]{angx2.f76829c});
                        query6 = readableDatabase.query("CrossLoggedExperimentTokens", anfn.f76771a, "fromPackageName = ? AND isCommitted = 1", new String[]{angx2.f76829c}, null, null, null);
                        while (query6.moveToNext()) {
                            sQLiteDatabase.insertOrThrow("CrossLoggedExperimentTokens", null, anfw.m64175a(query6));
                        }
                        if (query6 != null) {
                            query6.close();
                        }
                        Pair a = anfw.m64176a(readableDatabase, angx2.f76829c, angx2.f76831e);
                        angx2.mo41833a(sQLiteDatabase, (String) a.first, (long) ((Integer) a.second).intValue());
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th7) {
                        th = th7;
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    sQLiteDatabase = writableDatabase;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            } finally {
                b.close();
            }
        }
        context.getContentResolver().notifyChange(anef.m64088a(angx2.f76829c), null);
        for (String str : ange.f76800a) {
            Intent intent = new Intent("com.google.android.gms.phenotype.COMMIT");
            intent.setPackage(str);
            intent.putExtra("package_name", angx2.f76829c);
            context.sendBroadcast(intent);
        }
        return;
        throw th6;
        throw th;
        throw th2;
        throw th3;
        throw th4;
        throw th5;
    }

    /* renamed from: b */
    public final void mo41827b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public angw(angj angj, String str, String str2) {
        super("CommitToConfigurationOperationCall", r0);
        caif caif;
        String[] a = anhe.m64385a(str);
        if (a == null || a[1].equals(a[5])) {
            caif = caif.COMMIT_CONFIG;
        } else {
            caif = caif.COMMIT_ALT_CONFIG;
        }
        sdo.m34959a(angj);
        this.f76819a = angj;
        this.f76820b = new angx(str, str2);
    }

    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        try {
            this.f76820b.mo41832a(context, anfw);
            m64357a(context, anfw, this.f76820b);
            this.f76819a.mo41795e(Status.f30107a);
        } catch (anfx e) {
            if (e.f76790a == 29512 && anhs.m64428a(this.f76820b.f76829c, 21)) {
                anij.m64478a(context, 21, this.f76820b.f76829c);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        angx angx = this.f76820b;
        caho caho = (caho) cahp.f174572m.mo74144da();
        String str = angx.f76829c;
        if (str != null) {
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp = (cahp) caho.f164949b;
            str.getClass();
            cahp.f174574a |= 1;
            cahp.f174575b = str;
        }
        String str2 = angx.f76828b;
        if (str2 != null) {
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp2 = (cahp) caho.f164949b;
            str2.getClass();
            cahp2.f174574a |= 128;
            cahp2.f174584k = str2;
        }
        int i = angx.f76830d;
        if (caho.f164950c) {
            caho.mo74035c();
            caho.f164950c = false;
        }
        cahp cahp3 = (cahp) caho.f164949b;
        int i2 = cahp3.f174574a | 2;
        cahp3.f174574a = i2;
        cahp3.f174576c = i;
        String str3 = angx.f76831e;
        if (str3 != null) {
            str3.getClass();
            i2 |= 4;
            cahp3.f174574a = i2;
            cahp3.f174579f = str3;
        }
        String str4 = angx.f76827a;
        if (str4 != null) {
            str4.getClass();
            i2 |= 8;
            cahp3.f174574a = i2;
            cahp3.f174580g = str4;
        }
        int i3 = angx.f76832f;
        cahp3.f174574a = i2 | 32;
        cahp3.f174582i = (long) i3;
        return (cahp) caho.mo74062i();
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76819a.mo41795e(status);
    }
}
