package com.google.android.gms.phenotype.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConfigurationChimeraProvider extends ContentProvider {

    /* renamed from: a */
    private static final srn f82137a = srn.m36127a(sgj.PHENOTYPE);

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Cursor query;
        Throwable th;
        Cursor query2;
        Throwable th2;
        PrintWriter printWriter2 = printWriter;
        anfg a = anfg.m64152a(getContext());
        try {
            SQLiteDatabase writableDatabase = a.getWritableDatabase();
            query = writableDatabase.query("ExperimentTokens", new String[]{"packageName", "version", "user", "experimentToken", "servingVersion"}, "isCommitted = 1", null, null, null, "packageName");
            printWriter2.println("Phenotype committed experiment tokens; config-package v=version u=user: base64-token (config version)");
            while (query.moveToNext()) {
                printWriter2.println(String.format(Locale.US, "%s v=%d u=%s: %s (%d)", query.getString(0), Integer.valueOf(query.getInt(1)), query.getString(2), Base64.encodeToString(query.getBlob(3), 11), Long.valueOf(query.getLong(4))));
            }
            if (query != null) {
                query.close();
            }
            if (cgch.f186562a.mo6606a().mo83493b()) {
                braa braa = (braa) brac.f142121d.mo74144da();
                if (braa.f164950c) {
                    braa.mo74035c();
                    braa.f164950c = false;
                }
                brac brac = (brac) braa.f164949b;
                brac.f142124b = 2;
                brac.f142123a |= 1;
                braa braa2 = braa;
                query2 = writableDatabase.query("Flags", new String[]{"packageName", "name", "intVal", "boolVal", "floatVal", "stringVal", "extensionVal"}, "committed = 1", null, null, null, "packageName, name");
                String str = null;
                bxvd bxvd = null;
                while (query2.moveToNext()) {
                    String string = query2.getString(0);
                    if (!string.equals(str)) {
                        if (bxvd != null) {
                            if (((brad) bxvd.f164949b).f142130c.size() > 0) {
                                braa2.mo69470a(bxvd);
                            }
                        }
                        bxvd da = brad.f142126d.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        brad brad = (brad) da.f164949b;
                        string.getClass();
                        brad.f142128a |= 1;
                        brad.f142129b = string;
                        bxvd = da;
                        str = string;
                    }
                    bxvd da2 = brae.f142131e.mo74144da();
                    String string2 = query2.getString(1);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    brae brae = (brae) da2.f164949b;
                    string2.getClass();
                    brae.f142133a |= 1;
                    brae.f142136d = string2;
                    if (!query2.isNull(2)) {
                        long j = query2.getLong(2);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        brae brae2 = (brae) da2.f164949b;
                        brae2.f142134b = 2;
                        brae2.f142135c = Long.valueOf(j);
                    } else if (!query2.isNull(3)) {
                        boolean z = query2.getInt(3) != 0;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        brae brae3 = (brae) da2.f164949b;
                        brae3.f142134b = 4;
                        brae3.f142135c = Boolean.valueOf(z);
                    } else if (!query2.isNull(4)) {
                        double d = query2.getDouble(4);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        brae brae4 = (brae) da2.f164949b;
                        brae4.f142134b = 3;
                        brae4.f142135c = Double.valueOf(d);
                    } else if (!query2.isNull(5)) {
                        String string3 = query2.getString(5);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        brae brae5 = (brae) da2.f164949b;
                        string3.getClass();
                        brae5.f142134b = 5;
                        brae5.f142135c = string3;
                    } else if (!query2.isNull(6)) {
                        bxtx a2 = bxtx.m123261a(query2.getBlob(6));
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        brae brae6 = (brae) da2.f164949b;
                        a2.getClass();
                        brae6.f142134b = 6;
                        brae6.f142135c = a2;
                    }
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    brad brad2 = (brad) bxvd.f164949b;
                    brae brae7 = (brae) da2.mo74062i();
                    brad brad3 = brad.f142126d;
                    brae7.getClass();
                    if (!brad2.f142130c.mo73666a()) {
                        brad2.f142130c = bxvk.m124021a(brad2.f142130c);
                    }
                    brad2.f142130c.add(brae7);
                }
                if (query2 != null) {
                    query2.close();
                }
                if (bxvd != null) {
                    if (((brad) bxvd.f164949b).f142130c.size() > 0) {
                        braa2.mo69470a(bxvd);
                    }
                }
                String valueOf = String.valueOf(Base64.encodeToString(((brac) braa2.mo74062i()).mo73642k(), 11));
                printWriter2.println(valueOf.length() == 0 ? new String("Phenotype committed flags: ") : "Phenotype committed flags: ".concat(valueOf));
            }
        } catch (SQLiteException e) {
            try {
                angu.m64347a(getContext(), "ConfigurationChimeraProvider-dump", e);
            } catch (Throwable th3) {
                a.close();
                throw th3;
            }
        } catch (Throwable th4) {
            bqye.m113761a(th2, th4);
        }
        a.close();
        return;
        throw th2;
        throw th;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final boolean onCreate() {
        return true;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:123:0x0293 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:116:0x0289 */
    /* JADX WARN: Type inference failed for: r7v15, assign insn: PHI: (r7v15 ?) = (r7v16 ?), (r7v16 ?), (r7v17 ?), (r7v17 ?) binds: [B:123:0x0293, B:124:?, B:116:0x0289, B:117:?] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Throwable, anfx], assign insn: 0x028c: MOVE  (r7v16 ? I:?[OBJECT, ARRAY]) = (r0v28 anfx) */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Throwable, anfy], assign insn: 0x0282: MOVE  (r7v17 ? I:?[OBJECT, ARRAY]) = (r0v31 anfy) */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.RuntimeException], assign insn: 0x0279: MOVE_EXCEPTION  (r0v36 ? I:java.lang.RuntimeException A[CUSTOM_DECLARE]) =  */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.RuntimeException], assign insn: 0x026e: MOVE_EXCEPTION  (r0v41 ? I:java.lang.RuntimeException A[CUSTOM_DECLARE]) =  */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03e4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03ea, code lost:
        if (r0.f76790a == 29512) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03ec, code lost:
        r1 = (p000.bnsl) com.google.android.gms.phenotype.provider.ConfigurationChimeraProvider.f82137a.mo68388c();
        r1.mo68432a("com.google.android.gms.phenotype.provider.ConfigurationChimeraProvider", "query", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r1.mo68420a("%s", r0.f76791b);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0402, code lost:
        r0 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:37:0x00d5, B:189:0x03d1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02c3 A[Catch:{ all -> 0x03ce, anfx -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02c4 A[Catch:{ all -> 0x03ce, anfx -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02ec A[Catch:{ all -> 0x03ce, anfx -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02ed A[Catch:{ all -> 0x03ce, anfx -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0308 A[Catch:{ all -> 0x03ce, anfx -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0309 A[Catch:{ all -> 0x03ce, anfx -> 0x03e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0320 A[Catch:{ all -> 0x03ce, anfx -> 0x03e5 }] */
    /* JADX WARNING: Unknown variable types count: 3 */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        Configurations configurations;
        SQLiteDatabase writableDatabase;
        Integer num;
        SQLiteException sQLiteException;
        anfg anfg;
        bxvd a;
        caho caho;
        ? r7;
        SQLiteException sQLiteException2;
        Uri uri2 = uri;
        String[] strArr3 = strArr;
        if (aytw.m84813a(getContext()) && !cgcr.m144765c()) {
            return null;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            bnsl bnsl = (bnsl) f82137a.mo68388c();
            bnsl.mo68432a("com.google.android.gms.phenotype.provider.ConfigurationChimeraProvider", "query", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Invalid Uri: %s", uri2);
            return null;
        }
        String nameForUid = getContext().getPackageManager().getNameForUid(Binder.getCallingUid());
        if (cget.m144957b()) {
            lastPathSegment = angb.m64192a(lastPathSegment, nameForUid);
        }
        if (rfz.m33557a(getContext().getApplicationContext()).mo24608b(Binder.getCallingUid()) || ange.m64198a(cgch.m144746b(), angb.m64191a(lastPathSegment))) {
            if (strArr3 != null) {
                String str4 = null;
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i2 >= strArr3.length) {
                        str3 = str4;
                        break;
                    }
                    String str5 = strArr3[i];
                    String str6 = strArr3[i2];
                    if ("account".equals(str5)) {
                        if (str6 == null) {
                            bnsl bnsl2 = (bnsl) f82137a.mo68388c();
                            bnsl2.mo68432a("com.google.android.gms.phenotype.provider.ConfigurationChimeraProvider", "query", 123, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("Invalid argument for account: null");
                            return null;
                        } else if (str4 == null) {
                            str4 = str6;
                        } else {
                            bnsl bnsl3 = (bnsl) f82137a.mo68388c();
                            bnsl3.mo68432a("com.google.android.gms.phenotype.provider.ConfigurationChimeraProvider", "query", 127, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68405a("Cannot specify argument \"account\" twice");
                            return null;
                        }
                    }
                    i += 2;
                }
            } else {
                str3 = null;
            }
            if (str3 == null) {
                anfg a2 = anfg.m64152a(getContext());
                try {
                    writableDatabase = a2.getWritableDatabase();
                    anfw.m64180a(writableDatabase);
                    if (anhb.m64373a(writableDatabase, lastPathSegment)) {
                        configurations = anhb.m64374b(writableDatabase, lastPathSegment);
                    } else {
                        configurations = null;
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    a2.close();
                } catch (SQLiteException e) {
                    angu.m64347a(getContext(), getClass().getName(), e);
                    throw e;
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } else if (!aytw.m84813a(getContext())) {
                if (!str3.equals("")) {
                    if (!angd.m64196a(str3, getContext())) {
                        configurations = null;
                    }
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                anfg a3 = anfg.m64152a(getContext());
                try {
                    SQLiteDatabase writableDatabase2 = a3.getWritableDatabase();
                    writableDatabase2.beginTransaction();
                    try {
                        anfg = a3;
                        try {
                            configurations = new anhe(lastPathSegment, str3, null, lastPathSegment, nameForUid).mo41834a(getContext(), anfg);
                            if (!configurations.f82074a.isEmpty()) {
                                angx angx = new angx(configurations.f82074a, nameForUid);
                                angx.mo41832a(getContext(), anfg);
                                angw.m64357a(getContext(), anfg, angx);
                                writableDatabase2.setTransactionSuccessful();
                                try {
                                    writableDatabase2.endTransaction();
                                    anfg.close();
                                    bxvd a4 = anfd.m64145a(getContext());
                                    caho caho2 = (caho) cahp.f174572m.mo74144da();
                                    if (caho2.f164950c) {
                                        caho2.mo74035c();
                                        caho2.f164950c = false;
                                    }
                                    cahp cahp = (cahp) caho2.f164949b;
                                    lastPathSegment.getClass();
                                    int i3 = cahp.f174574a | 1;
                                    cahp.f174574a = i3;
                                    cahp.f174575b = lastPathSegment;
                                    str3.getClass();
                                    cahp.f174574a = i3 | 4;
                                    cahp.f174579f = str3;
                                    int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                                    if (caho2.f164950c) {
                                        caho2.mo74035c();
                                        caho2.f164950c = false;
                                    }
                                    cahp cahp2 = (cahp) caho2.f164949b;
                                    cahp2.f174574a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    cahp2.f174585l = elapsedRealtime2;
                                    cahp cahp3 = (cahp) caho2.mo74062i();
                                    if (a4.f164950c) {
                                        a4.mo74035c();
                                        a4.f164950c = false;
                                    }
                                    caig caig = (caig) a4.f164949b;
                                    caig caig2 = caig.f174681k;
                                    cahp3.getClass();
                                    caig.f174685c = cahp3;
                                    caig.f174683a |= 2;
                                    qwo a5 = anfd.m64146a().mo24335a(((caig) a4.mo74062i()).mo73642k());
                                    a5.mo24328b(37);
                                    a5.mo24327b();
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    sQLiteException = e;
                                    angu.m64347a(getContext(), getClass().getName(), sQLiteException);
                                    throw sQLiteException;
                                } catch (anfx e3) {
                                    e = e3;
                                    r7 = e;
                                    num = Integer.valueOf(r7.f76790a);
                                    throw r7;
                                } catch (anfy e4) {
                                    e = e4;
                                    r7 = e;
                                    try {
                                        num = Integer.valueOf(r7.f76792a);
                                        try {
                                            throw r7;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteException = r7;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        sQLiteException = null;
                                        num = null;
                                        anfg.close();
                                        a = anfd.m64145a(getContext());
                                        caho = (caho) cahp.f174572m.mo74144da();
                                        if (!caho.f164950c) {
                                        }
                                        cahp cahp4 = (cahp) caho.f164949b;
                                        lastPathSegment.getClass();
                                        int i4 = cahp4.f174574a | 1;
                                        cahp4.f174574a = i4;
                                        cahp4.f174575b = lastPathSegment;
                                        str3.getClass();
                                        cahp4.f174574a = i4 | 4;
                                        cahp4.f174579f = str3;
                                        int elapsedRealtime3 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                                        if (!caho.f164950c) {
                                        }
                                        cahp cahp5 = (cahp) caho.f164949b;
                                        cahp5.f174574a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                        cahp5.f174585l = elapsedRealtime3;
                                        cahp cahp6 = (cahp) caho.mo74062i();
                                        if (!a.f164950c) {
                                        }
                                        caig caig3 = (caig) a.f164949b;
                                        caig caig4 = caig.f174681k;
                                        cahp6.getClass();
                                        caig3.f174685c = cahp6;
                                        caig3.f174683a |= 2;
                                        if (sQLiteException != null) {
                                        }
                                        qwo a6 = anfd.m64146a().mo24335a(((caig) a.mo74062i()).mo73642k());
                                        a6.mo24328b(37);
                                        a6.mo24327b();
                                        throw th;
                                    }
                                } catch (RuntimeException e5) {
                                    sQLiteException2 = e5;
                                    sQLiteException = sQLiteException2;
                                    try {
                                        throw sQLiteException;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        num = null;
                                    }
                                }
                            } else {
                                writableDatabase2.setTransactionSuccessful();
                                writableDatabase2.endTransaction();
                                anfg.close();
                                bxvd a7 = anfd.m64145a(getContext());
                                caho caho3 = (caho) cahp.f174572m.mo74144da();
                                if (caho3.f164950c) {
                                    caho3.mo74035c();
                                    caho3.f164950c = false;
                                }
                                cahp cahp7 = (cahp) caho3.f164949b;
                                lastPathSegment.getClass();
                                int i5 = cahp7.f174574a | 1;
                                cahp7.f174574a = i5;
                                cahp7.f174575b = lastPathSegment;
                                str3.getClass();
                                cahp7.f174574a = i5 | 4;
                                cahp7.f174579f = str3;
                                int elapsedRealtime4 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                                if (caho3.f164950c) {
                                    caho3.mo74035c();
                                    caho3.f164950c = false;
                                }
                                cahp cahp8 = (cahp) caho3.f164949b;
                                cahp8.f174574a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                cahp8.f174585l = elapsedRealtime4;
                                cahp cahp9 = (cahp) caho3.mo74062i();
                                if (a7.f164950c) {
                                    a7.mo74035c();
                                    a7.f164950c = false;
                                }
                                caig caig5 = (caig) a7.f164949b;
                                caig caig6 = caig.f174681k;
                                cahp9.getClass();
                                caig5.f174685c = cahp9;
                                caig5.f174683a |= 2;
                                qwo a8 = anfd.m64146a().mo24335a(((caig) a7.mo74062i()).mo73642k());
                                a8.mo24328b(37);
                                a8.mo24327b();
                                configurations = null;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            writableDatabase2.endTransaction();
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        anfg = a3;
                        writableDatabase2.endTransaction();
                        throw th;
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    anfg = a3;
                    sQLiteException = e;
                    angu.m64347a(getContext(), getClass().getName(), sQLiteException);
                    throw sQLiteException;
                } catch (anfx e7) {
                    e = e7;
                    anfg = a3;
                    r7 = e;
                    num = Integer.valueOf(r7.f76790a);
                    throw r7;
                } catch (anfy e8) {
                    e = e8;
                    anfg = a3;
                    r7 = e;
                    num = Integer.valueOf(r7.f76792a);
                    throw r7;
                } catch (RuntimeException e9) {
                    anfg = a3;
                    sQLiteException2 = e9;
                    sQLiteException = sQLiteException2;
                    throw sQLiteException;
                } catch (Throwable th7) {
                    th = th7;
                    anfg = a3;
                    sQLiteException = null;
                    num = null;
                    anfg.close();
                    a = anfd.m64145a(getContext());
                    caho = (caho) cahp.f174572m.mo74144da();
                    if (!caho.f164950c) {
                        caho.mo74035c();
                        caho.f164950c = false;
                    }
                    cahp cahp42 = (cahp) caho.f164949b;
                    lastPathSegment.getClass();
                    int i42 = cahp42.f174574a | 1;
                    cahp42.f174574a = i42;
                    cahp42.f174575b = lastPathSegment;
                    str3.getClass();
                    cahp42.f174574a = i42 | 4;
                    cahp42.f174579f = str3;
                    int elapsedRealtime32 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                    if (!caho.f164950c) {
                        caho.mo74035c();
                        caho.f164950c = false;
                    }
                    cahp cahp52 = (cahp) caho.f164949b;
                    cahp52.f174574a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    cahp52.f174585l = elapsedRealtime32;
                    cahp cahp62 = (cahp) caho.mo74062i();
                    if (!a.f164950c) {
                        a.mo74035c();
                        a.f164950c = false;
                    }
                    caig caig32 = (caig) a.f164949b;
                    caig caig42 = caig.f174681k;
                    cahp62.getClass();
                    caig32.f174685c = cahp62;
                    caig32.f174683a |= 2;
                    if (sQLiteException != null) {
                        bxvd da = caie.f174634d.mo74144da();
                        String name = sQLiteException.getClass().getName();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        caie caie = (caie) da.f164949b;
                        name.getClass();
                        caie.f174636a |= 1;
                        caie.f174637b = name;
                        if (num != null) {
                            int intValue = num.intValue();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            caie caie2 = (caie) da.f164949b;
                            caie2.f174636a |= 2;
                            caie2.f174638c = intValue;
                        }
                        if (a.f164950c) {
                            a.mo74035c();
                            a.f164950c = false;
                        }
                        caig caig7 = (caig) a.f164949b;
                        caie caie3 = (caie) da.mo74062i();
                        caie3.getClass();
                        caig7.f174687e = caie3;
                        caig7.f174683a |= 8;
                    }
                    qwo a62 = anfd.m64146a().mo24335a(((caig) a.mo74062i()).mo73642k());
                    a62.mo24328b(37);
                    a62.mo24327b();
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("Phenotype commitOnQuery cannot be used in direct boot mode");
            }
            if (configurations == null || configurations.f82077d == null) {
                return null;
            }
            MatrixCursor matrixCursor = new MatrixCursor(bdxy.f106612c);
            for (Configuration configuration : configurations.f82077d) {
                Flag[] flagArr = configuration.f82071b;
                for (Flag flag : flagArr) {
                    matrixCursor.addRow(new String[]{flag.f82099a, flag.mo46505f()});
                }
            }
            matrixCursor.addRow(new String[]{"__phenotype_server_token", configurations.f82076c});
            matrixCursor.addRow(new String[]{"__phenotype_snapshot_token", configurations.f82074a});
            matrixCursor.addRow(new String[]{"__phenotype_configuration_version", Long.toString(configurations.f82080g)});
            return matrixCursor;
        }
        bnsl bnsl4 = (bnsl) f82137a.mo68388c();
        bnsl4.mo68432a("com.google.android.gms.phenotype.provider.ConfigurationChimeraProvider", "query", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68420a("Caller is not authorized to access Uri: %s", uri2);
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
