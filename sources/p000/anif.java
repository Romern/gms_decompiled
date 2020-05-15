package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;

/* renamed from: anif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anif {

    /* renamed from: a */
    public static final srn f76935a = srn.m36127a(sgj.PHENOTYPE);

    /* renamed from: b */
    public final String f76936b;

    /* renamed from: c */
    public final long f76937c;

    /* renamed from: d */
    public final int f76938d;

    public anif(String str, long j, int i) {
        this.f76936b = str;
        this.f76937c = j;
        this.f76938d = i;
    }

    /* renamed from: a */
    public final Void mo41840a(Context context, anfw anfw) {
        Cursor query;
        Throwable th;
        Cursor query2;
        Throwable th2;
        long j;
        Cursor rawQuery;
        Throwable th3;
        long j2;
        String str;
        if (cgej.m144882b()) {
            SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                boolean z = false;
                query = writableDatabase.query("Packages", new String[]{"packageName"}, "packageName = ?", new String[]{this.f76936b}, null, null, null);
                if (query.getCount() != 0) {
                    if (query != null) {
                        query.close();
                    }
                    String str2 = "anif";
                    query2 = writableDatabase.query("LastSyncAfterRequest", new String[]{"servingVersion"}, "packageName = ?", new String[]{this.f76936b}, null, null, null);
                    if (query2.moveToFirst()) {
                        long j3 = query2.getLong(0);
                        if (query2 != null) {
                            query2.close();
                        }
                        j = j3;
                    } else {
                        if (query2 != null) {
                            query2.close();
                        }
                        j = 0;
                    }
                    if (this.f76937c != j) {
                        rawQuery = writableDatabase.rawQuery("SELECT MIN(servingVersion) FROM ExperimentTokens WHERE packageName = ? AND isCommitted = 0;", new String[]{this.f76936b});
                        if (!rawQuery.moveToFirst()) {
                            bnsl bnsl = (bnsl) f76935a.mo68390d();
                            str = str2;
                            bnsl.mo68432a(str, "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("First sync");
                            j2 = 0;
                            z = true;
                        } else {
                            str = str2;
                            long j4 = rawQuery.getLong(0);
                            if (j4 < this.f76937c) {
                                z = true;
                            }
                            j2 = j4;
                        }
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        if (!z) {
                            return null;
                        }
                        bnsl bnsl2 = (bnsl) f76935a.mo68390d();
                        bnsl2.mo68432a(str, "a", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68417a("New sync: %d > %d", this.f76937c, j2);
                        aniu b = HeterodyneSyncTaskChimeraService.m68254b(context);
                        cahw cahw = (cahw) cahz.f174610h.mo74144da();
                        b.mo41854a(this.f76938d, this.f76936b, cahw);
                        int a = cahy.m126654a(((cahz) cahw.f164949b).f174617f);
                        if (a == 0 || a == 1) {
                            writableDatabase.beginTransaction();
                            try {
                                String str3 = this.f76936b;
                                long j5 = this.f76937c;
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("packageName", str3);
                                contentValues.put("servingVersion", Long.valueOf(j5));
                                if (writableDatabase.insertWithOnConflict("LastSyncAfterRequest", null, contentValues, 5) == -1) {
                                    bnsl bnsl3 = (bnsl) f76935a.mo68390d();
                                    bnsl3.mo68432a(str, "a", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl3.mo68420a("Updating lastSyncAfter for package %s table failed", this.f76936b);
                                }
                                writableDatabase.setTransactionSuccessful();
                                return null;
                            } finally {
                                writableDatabase.endTransaction();
                            }
                        } else {
                            bnsl bnsl4 = (bnsl) f76935a.mo68390d();
                            bnsl4.mo68432a(str, "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68405a("Sync as a result of syncAfter failed");
                            throw new anfy(29504);
                        }
                    } else {
                        bnsl bnsl5 = (bnsl) f76935a.mo68390d();
                        bnsl5.mo68432a(str2, "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68417a("Last successful syncAfter (%d) is equal to requested serving version (%d)", j, this.f76937c);
                        writableDatabase.endTransaction();
                        return null;
                    }
                } else {
                    String str4 = "anif";
                    bnsl bnsl6 = (bnsl) f76935a.mo68390d();
                    bnsl6.mo68432a(str4, "a", 80, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68420a("Cannot call syncAfter before register(): %s", this.f76936b);
                    throw new anfy(29503);
                }
            } catch (Throwable th4) {
                writableDatabase.endTransaction();
                throw th4;
            }
        } else {
            throw new UnsupportedOperationException();
        }
        throw th2;
        throw th3;
        throw th;
    }
}
