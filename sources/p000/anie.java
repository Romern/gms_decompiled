package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;

/* renamed from: anie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anie extends angu {

    /* renamed from: a */
    private final angj f76933a;

    /* renamed from: b */
    private final anif f76934b;

    /* renamed from: a */
    public final cahp mo41825a() {
        anif anif = this.f76934b;
        caho caho = (caho) cahp.f174572m.mo74144da();
        long j = anif.f76937c;
        if (caho.f164950c) {
            caho.mo74035c();
            caho.f164950c = false;
        }
        cahp cahp = (cahp) caho.f164949b;
        int i = cahp.f174574a | 16;
        cahp.f174574a = i;
        cahp.f174581h = j;
        int i2 = anif.f76938d;
        int i3 = i2 - 1;
        if (i2 != 0) {
            cahp.f174574a = i | 64;
            cahp.f174583j = i3;
            return (cahp) caho.mo74062i();
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo41827b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public anie(angj angj, anik anik, String str, long j) {
        super("SyncAfterOperationCall", caif.SYNC_AFTER);
        sdo.m34959a(angj);
        this.f76933a = angj;
        this.f76934b = new anif(str, j, 5);
    }

    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        Cursor query;
        Throwable th;
        Cursor query2;
        Throwable th2;
        long j;
        Cursor rawQuery;
        Throwable th3;
        long j2;
        String str;
        String str2;
        anif anif = this.f76934b;
        if (cgej.m144882b()) {
            SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                boolean z = false;
                query = writableDatabase.query("Packages", new String[]{"packageName"}, "packageName = ?", new String[]{anif.f76936b}, null, null, null);
                if (query.getCount() != 0) {
                    if (query != null) {
                        query.close();
                    }
                    String str3 = "anif";
                    String str4 = "a";
                    query2 = writableDatabase.query("LastSyncAfterRequest", new String[]{"servingVersion"}, "packageName = ?", new String[]{anif.f76936b}, null, null, null);
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
                    if (anif.f76937c != j) {
                        rawQuery = writableDatabase.rawQuery("SELECT MIN(servingVersion) FROM ExperimentTokens WHERE packageName = ? AND isCommitted = 0;", new String[]{anif.f76936b});
                        if (!rawQuery.moveToFirst()) {
                            bnsl bnsl = (bnsl) anif.f76935a.mo68390d();
                            str = str3;
                            str2 = str4;
                            bnsl.mo68432a(str, str2, (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("First sync");
                            z = true;
                            j2 = 0;
                        } else {
                            str = str3;
                            str2 = str4;
                            long j4 = rawQuery.getLong(0);
                            if (j4 < anif.f76937c) {
                                z = true;
                            }
                            j2 = j4;
                        }
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        if (z) {
                            bnsl bnsl2 = (bnsl) anif.f76935a.mo68390d();
                            bnsl2.mo68432a(str, str2, 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68417a("New sync: %d > %d", anif.f76937c, j2);
                            aniu b = HeterodyneSyncTaskChimeraService.m68254b(context);
                            cahw cahw = (cahw) cahz.f174610h.mo74144da();
                            b.mo41854a(anif.f76938d, anif.f76936b, cahw);
                            int a = cahy.m126654a(((cahz) cahw.f164949b).f174617f);
                            if (a == 0 || a == 1) {
                                writableDatabase.beginTransaction();
                                try {
                                    String str5 = anif.f76936b;
                                    long j5 = anif.f76937c;
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("packageName", str5);
                                    contentValues.put("servingVersion", Long.valueOf(j5));
                                    if (writableDatabase.insertWithOnConflict("LastSyncAfterRequest", null, contentValues, 5) == -1) {
                                        bnsl bnsl3 = (bnsl) anif.f76935a.mo68390d();
                                        bnsl3.mo68432a(str, str2, 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl3.mo68420a("Updating lastSyncAfter for package %s table failed", anif.f76936b);
                                    }
                                    writableDatabase.setTransactionSuccessful();
                                } finally {
                                    writableDatabase.endTransaction();
                                }
                            } else {
                                bnsl bnsl4 = (bnsl) anif.f76935a.mo68390d();
                                bnsl4.mo68432a(str, str2, 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl4.mo68405a("Sync as a result of syncAfter failed");
                                throw new anfy(29504);
                            }
                        }
                    } else {
                        bnsl bnsl5 = (bnsl) anif.f76935a.mo68390d();
                        bnsl5.mo68432a(str3, str4, 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68417a("Last successful syncAfter (%d) is equal to requested serving version (%d)", j, anif.f76937c);
                        writableDatabase.endTransaction();
                    }
                    this.f76933a.mo41784a(Status.f30107a, 0);
                    return;
                }
                String str6 = "a";
                bnsl bnsl6 = (bnsl) anif.f76935a.mo68390d();
                bnsl6.mo68432a("anif", str6, 80, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6.mo68420a("Cannot call syncAfter before register(): %s", anif.f76936b);
                throw new anfy(29503);
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

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76933a.mo41784a(status, 0);
    }
}
