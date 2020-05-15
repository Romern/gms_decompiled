package com.google.android.gms.phenotype.sync;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PackageUpdateTaskChimeraService extends aeah {

    /* renamed from: a */
    private static final srn f82155a = srn.m36127a(sgj.PHENOTYPE);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r6 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        p000.bqye.m113761a(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r7 = (p000.bnsl) com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService.f82155a.mo68387b();
        r7.mo68437a(r6);
        r7.mo68432a("com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r7.mo68405a("Unexpected package update task failure");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        if (r10.f164950c == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0089, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        r0 = (p000.caib) r10.f164949b;
        r1 = p000.caib.f174620d;
        r0.f174624c = 2;
        r0.f174622a |= 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ac, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c8, code lost:
        r9.mo74035c();
        r9.f164950c = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e A[ExcHandler: RuntimeException (r6v0 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x000a] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ab A[Catch:{ SQLiteException -> 0x005c, RuntimeException -> 0x006e, all -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac A[Catch:{ SQLiteException -> 0x005c, RuntimeException -> 0x006e, all -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c8  */
    /* renamed from: a */
    static int m68261a(Context context, bxvd bxvd) {
        try {
            anfg a = anfg.m64152a(context);
            m68262a(context, bnon.f131923a, a.getWritableDatabase());
            if (a != null) {
                a.close();
            }
            bxvd a2 = anfd.m64145a(context);
            if (a2.f164950c) {
                a2.mo74035c();
                a2.f164950c = false;
            }
            caig caig = (caig) a2.f164949b;
            caib caib = (caib) bxvd.mo74062i();
            caig caig2 = caig.f174681k;
            caib.getClass();
            caig.f174691i = caib;
            caig.f174683a |= 128;
            qwo a3 = anfd.m64146a().mo24335a(((caig) a2.mo74062i()).mo73642k());
            a3.mo24328b(34);
            a3.mo24327b();
            return 0;
            throw th;
        } catch (SQLiteException e) {
            e = e;
            int i = 0;
            angu.m64347a(context, PackageUpdateTaskChimeraService.class.getName(), e);
            if (bxvd.f164950c) {
            }
            caib caib2 = (caib) bxvd.f164949b;
            caib caib3 = caib.f174620d;
            caib2.f174624c = 3;
            caib2.f174622a |= 2;
            bxvd a4 = anfd.m64145a(context);
            if (a4.f164950c) {
            }
            caig caig3 = (caig) a4.f164949b;
            caib caib4 = (caib) bxvd.mo74062i();
            caig caig4 = caig.f174681k;
            caib4.getClass();
            caig3.f174691i = caib4;
            caig3.f174683a |= 128;
            qwo a5 = anfd.m64146a().mo24335a(((caig) a4.mo74062i()).mo73642k());
            a5.mo24328b(34);
            a5.mo24327b();
            return i;
        } catch (RuntimeException e2) {
        } catch (Throwable th) {
            bxvd a6 = anfd.m64145a(context);
            if (a6.f164950c) {
                a6.mo74035c();
                a6.f164950c = false;
            }
            caig caig5 = (caig) a6.f164949b;
            caib caib5 = (caib) bxvd.mo74062i();
            caig caig6 = caig.f174681k;
            caib5.getClass();
            caig5.f174691i = caib5;
            caig5.f174683a |= 128;
            qwo a7 = anfd.m64146a().mo24335a(((caig) a6.mo74062i()).mo73642k());
            a7.mo24328b(34);
            a7.mo24327b();
            throw th;
        }
    }

    /* renamed from: aZ */
    public final void mo7135aZ() {
    }

    /* renamed from: a */
    public static void m68262a(Context context, Set set, SQLiteDatabase sQLiteDatabase) {
        Cursor query;
        Throwable th;
        String str;
        boolean z;
        String str2;
        byte[] bArr;
        Cursor query2;
        Throwable th2;
        HashSet hashSet = new HashSet();
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query3 = sQLiteDatabase.query("Packages", new String[]{"packageName", "version"}, null, null, null, null, null);
            while (query3.moveToNext()) {
                try {
                    String string = query3.getString(0);
                    int i = query3.getInt(1);
                    if (!set.contains(string)) {
                        query = sQLiteDatabase.query("ExperimentTokens", new String[]{"experimentToken", "serverToken", "configHash", "user"}, "packageName = ? AND isCommitted = 1", new String[]{string}, null, null, null, null);
                        String str3 = "";
                        if (query.moveToNext()) {
                            bArr = query.getBlob(0);
                            String string2 = query.getString(1);
                            str = query.getString(2);
                            str2 = string2;
                            str3 = query.getString(3);
                            z = true;
                        } else {
                            bArr = null;
                            str2 = str3;
                            str = str2;
                            z = false;
                        }
                        if (query != null) {
                            query.close();
                        }
                        query2 = sQLiteDatabase.query("ExperimentTokens", new String[]{"experimentToken", "serverToken", "configHash"}, "packageName = ? AND version <= ? AND user = ? and isCommitted = 0", new String[]{string, Integer.toString(i), str3}, null, null, "version DESC", "1");
                        if (query2.moveToNext() && (!z || !Arrays.equals(bArr, query2.getBlob(0)) || !str2.equals(query2.getString(1)) || !str.equals(query2.getString(2)))) {
                            hashSet.add(string);
                        }
                        if (query2 != null) {
                            query2.close();
                        }
                    }
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    if (query3 != null) {
                        try {
                            query3.close();
                        } catch (Throwable th5) {
                            th = th5;
                            sQLiteDatabase.endTransaction();
                            throw th;
                        }
                    }
                    throw th4;
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            if (query3 != null) {
                query3.close();
            }
            sQLiteDatabase.endTransaction();
            m68263a(context, hashSet, anfu.m64169a(sQLiteDatabase, hashSet), 2);
            aeat.m51532a(context).mo33985a("com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService");
            hashSet.size();
            return;
            throw th;
            throw th2;
        } catch (Throwable th6) {
            th = th6;
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public static void m68263a(Context context, Set set, Map map, int i) {
        bxvd a = anfd.m64145a(context);
        for (Map.Entry entry : map.entrySet()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    if (set.contains(str)) {
                        String str2 = (String) entry.getKey();
                        int i2 = i - 1;
                        if (i != 0) {
                            cahq a2 = angc.m64195a(context, str, str2, i2, false);
                            if (a2 != null) {
                                if (a.f164950c) {
                                    a.mo74035c();
                                    a.f164950c = false;
                                }
                                caig caig = (caig) a.f164949b;
                                caig caig2 = caig.f174681k;
                                a2.getClass();
                                caig.mo74651c();
                                caig.f174692j.add(a2);
                            }
                        } else {
                            throw null;
                        }
                    }
                }
            }
        }
        caig caig3 = (caig) a.mo74062i();
        if (caig3.f174692j.size() > 0) {
            qwo a3 = anfd.m64146a().mo24335a(caig3.mo73642k());
            a3.mo24328b(39);
            a3.mo24327b();
        }
    }

    /* renamed from: a */
    public static void m68264a(Context context, boolean z) {
        aebi aebi;
        long e = cgdy.f186626a.mo6606a().mo83517e();
        long d = cgdy.f186626a.mo6606a().mo83516d();
        if (e >= 0) {
            if (e < d) {
                e = d;
            }
            bnsl bnsl = (bnsl) f82155a.mo68390d();
            bnsl.mo68432a("com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68417a("Scheduling Phenotype config package catchup updates to be %d seconds from now (%d)", e, System.currentTimeMillis());
            if (z) {
                aebi = new aebi();
                aebi.mo34004a(0, e);
                aebi.f63097i = "com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService";
                aebi.f63102n = true;
                aebi.f63099k = "PhenotypeCatchupPackageUpdate-OnChargerAndIdle";
                aebi.mo34028b(0, 0);
                aebi.mo34024a(1, 1);
                aebi.mo34026a(false);
                aebi.mo34027b(0);
                aebi.mo34026a(true);
                aeat.m51532a(context).mo33986a("PhenotypeCatchupPackageUpdate-OnCharger", "com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService");
            } else {
                aebi = new aebi();
                aebi.mo34004a(0, e);
                aebi.f63097i = "com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService";
                aebi.f63102n = true;
                aebi.f63099k = "PhenotypeCatchupPackageUpdate-OnCharger";
                aebi.mo34028b(0, 0);
                aebi.mo34024a(1, 1);
                aebi.mo34026a(false);
                aebi.mo34027b(0);
                aeat.m51532a(context).mo33986a("PhenotypeCatchupPackageUpdate-OnChargerAndIdle", "com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService");
            }
            aeat.m51532a(context).mo33984a(aebi.mo33974b());
            aebi aebi2 = new aebi();
            aebi2.mo34004a(e - TimeUnit.HOURS.toSeconds(1), e);
            aebi2.f63097i = "com.google.android.gms.phenotype.service.sync.PackageUpdateTaskService";
            aebi2.f63102n = true;
            aebi2.f63099k = "PhenotypeCatchupPackageUpdate-Timeout";
            aebi2.mo34028b(0, 0);
            aebi2.mo34024a(0, 0);
            aebi2.mo34026a(false);
            aebi2.mo34027b(0);
            aeat.m51532a(context).mo33984a(aebi2.mo33974b());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0085, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0086, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0094, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r8 = (p000.bnsl) com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService.f82155a.mo68387b();
        r8.mo68437a(r7);
        r8.mo68432a("com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r8.mo68405a("Unexpected package update task failure");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00af, code lost:
        if (r0.f164950c == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
        r0.mo74035c();
        r0.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b7, code lost:
        r1 = (p000.caib) r0.f164949b;
        r1.f174624c = 2;
        r1.f174622a |= 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d3, code lost:
        r0.mo74035c();
        r0.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ed, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0123, code lost:
        r11 = p000.anfd.m64145a(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0129, code lost:
        if (r11.f164950c != false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012c, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0131, code lost:
        r2 = (p000.caig) r11.f164949b;
        r0 = (p000.caib) r0.mo74062i();
        r3 = p000.caig.f174681k;
        r0.getClass();
        r2.f174691i = r0;
        r2.f174683a |= 128;
        r11 = p000.anfd.m64146a().mo24335a(((p000.caig) r11.mo74062i()).mo73642k());
        r11.mo24328b(34);
        r11.mo24327b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0160, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097 A[ExcHandler: RuntimeException (r7v0 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:4:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d2 A[Catch:{ SQLiteException -> 0x0085, RuntimeException -> 0x0097, all -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d3 A[Catch:{ SQLiteException -> 0x0085, RuntimeException -> 0x0097, all -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ed  */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        anfg a;
        bxvd da = caib.f174620d.mo74144da();
        String b = bmxx.m108578b(aecc.f63128a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caib caib = (caib) da.f164949b;
        b.getClass();
        caib.f174622a |= 1;
        caib.f174623b = b;
        Context applicationContext = getApplicationContext();
        try {
            a = anfg.m64152a(applicationContext);
            m68262a(applicationContext, bnon.f131923a, a.getWritableDatabase());
            if (a != null) {
                a.close();
            }
            bxvd a2 = anfd.m64145a(applicationContext);
            if (a2.f164950c) {
                a2.mo74035c();
                a2.f164950c = false;
            }
            caig caig = (caig) a2.f164949b;
            caib caib2 = (caib) da.mo74062i();
            caig caig2 = caig.f174681k;
            caib2.getClass();
            caig.f174691i = caib2;
            caig.f174683a |= 128;
            qwo a3 = anfd.m64146a().mo24335a(((caig) a2.mo74062i()).mo73642k());
            a3.mo24328b(34);
            a3.mo24327b();
            return 0;
        } catch (SQLiteException e) {
            e = e;
            int i = 2;
            angu.m64347a(applicationContext, PackageUpdateTaskChimeraService.class.getName(), e);
            if (da.f164950c) {
            }
            caib caib3 = (caib) da.f164949b;
            caib3.f174624c = 3;
            caib3.f174622a |= 2;
            bxvd a4 = anfd.m64145a(applicationContext);
            if (a4.f164950c) {
            }
            caig caig3 = (caig) a4.f164949b;
            caib caib4 = (caib) da.mo74062i();
            caig caig4 = caig.f174681k;
            caib4.getClass();
            caig3.f174691i = caib4;
            caig3.f174683a |= 128;
            qwo a5 = anfd.m64146a().mo24335a(((caig) a4.mo74062i()).mo73642k());
            a5.mo24328b(34);
            a5.mo24327b();
            return i;
        } catch (RuntimeException e2) {
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
