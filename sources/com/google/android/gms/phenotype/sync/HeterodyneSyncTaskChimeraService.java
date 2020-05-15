package com.google.android.gms.phenotype.sync;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HeterodyneSyncTaskChimeraService extends aeah {

    /* renamed from: a */
    public static final srn f82139a = srn.m36127a(sgj.PHENOTYPE);

    /* renamed from: m */
    public static final anik f82140m = anik.f76946a;

    /* renamed from: b */
    public Context f82141b;

    /* renamed from: c */
    public anfg f82142c;

    /* renamed from: d */
    public anfg f82143d;

    /* renamed from: e */
    public qws f82144e;

    /* renamed from: g */
    public qxq f82145g;

    /* renamed from: h */
    public bdza f82146h;

    /* renamed from: i */
    angg f82147i;

    /* renamed from: j */
    public aniz f82148j;

    /* renamed from: k */
    public anin f82149k;

    /* renamed from: l */
    public sqv f82150l;

    /* renamed from: n */
    private aney f82151n;

    /* renamed from: o */
    private PackageManager f82152o;

    /* renamed from: p */
    private rfz f82153p;

    /* renamed from: q */
    private beai f82154q;

    public HeterodyneSyncTaskChimeraService() {
    }

    /* renamed from: b */
    public static final /* synthetic */ aniu m68254b(Context context) {
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = new HeterodyneSyncTaskChimeraService();
        heterodyneSyncTaskChimeraService.mo46523a(context);
        return heterodyneSyncTaskChimeraService.f82149k;
    }

    /* renamed from: c */
    private final long m68255c() {
        try {
            return new File(this.f82142c.getWritableDatabase().getPath()).length();
        } catch (SQLiteException e) {
            angu.m64347a(this.f82141b, getClass().getName(), e);
            return 0;
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:24:0x00cc */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:92:0x024c */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r9v15, types: [bnsl], assign insn: 0x00bd: CHECK_CAST  (r9v15 ? I:bnsl) = (bnsl) (r9v14 bnsi) */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.util.List, java.util.ArrayList], assign insn: 0x0042: CONSTRUCTOR  (r9v16 ? I:java.util.ArrayList) =  call: java.util.ArrayList.<init>():void type: CONSTRUCTOR */
    /* JADX WARN: Type inference failed for: r9v24, types: [bnsl], assign insn: 0x00a9: CHECK_CAST  (r9v24 ? I:bnsl) = (bnsl) (r9v23 bnsi) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0297 A[Catch:{ SQLiteException -> 0x035c, anfy -> 0x027a, RuntimeException -> 0x0248, all -> 0x0242, all -> 0x0358 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0298 A[Catch:{ SQLiteException -> 0x035c, anfy -> 0x027a, RuntimeException -> 0x0248, all -> 0x0242, all -> 0x0358 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0371 A[Catch:{ all -> 0x0432 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0372 A[Catch:{ all -> 0x0432 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0265 A[Catch:{ SQLiteException -> 0x035c, anfy -> 0x027a, RuntimeException -> 0x0248, all -> 0x0242, all -> 0x0358 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0266 A[Catch:{ SQLiteException -> 0x035c, anfy -> 0x027a, RuntimeException -> 0x0248, all -> 0x0242, all -> 0x0358 }] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    public final int mo46522a(int i, String str, cahw cahw, String str2) {
        boolean z;
        int i2;
        long c;
        bxvd a;
        int i3;
        long c2;
        bxvd a2;
        int i4;
        long c3;
        bxvd a3;
        int i5;
        SQLiteDatabase writableDatabase;
        Cursor rawQuery;
        int i6;
        String str3 = str2;
        long b = this.f82150l.mo20506b();
        bxvd da = caid.f174626g.mo74144da();
        String b2 = bmxx.m108578b(str2);
        boolean z2 = false;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caid caid = (caid) da.f164949b;
        b2.getClass();
        int i7 = 1;
        caid.f174628a |= 1;
        caid.f174629b = b2;
        this.f82150l.mo20505a();
        this.f82147i.mo41782b();
        try {
            ? arrayList = new ArrayList();
            if (!cgeg.m144877b()) {
                i6 = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC;
            } else {
                i6 = 196;
            }
            for (PackageInfo packageInfo : this.f82152o.getInstalledPackages(i6)) {
                if (this.f82153p.mo24606a(packageInfo)) {
                    arrayList.addAll(this.f82154q.mo58477a(packageInfo));
                } else {
                    String str4 = packageInfo.packageName;
                }
            }
            if (arrayList.isEmpty()) {
                z = arrayList;
            } else {
                anio anio = new anio();
                new anhq(anio, (braj[]) arrayList.toArray(new braj[0])).mo41826a(this.f82141b, this.f82142c);
                boolean c4 = anio.f76951a.mo17710c();
                z = c4;
                if (!c4) {
                    ? r9 = (bnsl) f82139a.mo68387b();
                    r9.mo68432a("com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService", "b", 394, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    r9.mo68405a("Failed to bulk register phenotype registrants");
                    z = r9;
                }
            }
        } catch (Exception e) {
            ? r92 = (bnsl) f82139a.mo68387b();
            r92.mo68437a(e);
            r92.mo68432a("com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService", "a", 278, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            r92.mo68405a("Encountered an exception while processing phenotype registration resources: ");
            z = r92;
        }
        try {
            try {
                this.f82149k.mo41854a(i, str, cahw);
                try {
                    if (cgec.f186635a.mo6606a().mo83526g()) {
                        writableDatabase = this.f82142c.getWritableDatabase();
                        writableDatabase.beginTransaction();
                        rawQuery = writableDatabase.rawQuery("SELECT packageName, MAX(servingVersion) FROM ExperimentTokens WHERE isCommitted=1 GROUP BY packageName", new String[0]);
                        while (rawQuery.moveToNext()) {
                            bxvd da2 = cahr.f174593d.mo74144da();
                            String string = rawQuery.getString(z2);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = z2;
                            }
                            cahr cahr = (cahr) da2.f164949b;
                            string.getClass();
                            cahr.f174595a |= i7;
                            cahr.f174596b = string;
                            long j = (long) rawQuery.getInt(i7);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            cahr cahr2 = (cahr) da2.f164949b;
                            cahr2.f174595a |= 2;
                            cahr2.f174597c = j;
                            cahr cahr3 = (cahr) da2.mo74062i();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            caid caid2 = (caid) da.f164949b;
                            cahr3.getClass();
                            if (!caid2.f174633f.mo73666a()) {
                                caid2.f174633f = GeneratedMessageLite.m124021a(caid2.f174633f);
                            }
                            caid2.f174633f.add(cahr3);
                            z2 = false;
                            i7 = 1;
                        }
                        writableDatabase.setTransactionSuccessful();
                        rawQuery.close();
                        writableDatabase.endTransaction();
                    }
                    anij.m64480a(this.f82141b, str3, 0);
                    long c5 = m68255c();
                    if (c5 != 0) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        caid caid3 = (caid) da.f164949b;
                        caid3.f174628a |= 8;
                        caid3.f174632e = c5;
                    }
                    int b3 = (int) (this.f82150l.mo20506b() - b);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    caid caid4 = (caid) da.f164949b;
                    caid4.f174628a |= 4;
                    caid4.f174631d = b3;
                    bxvd a4 = anfd.m64145a(this.f82141b);
                    if (a4.f164950c) {
                        a4.mo74035c();
                        a4.f164950c = false;
                    }
                    caig caig = (caig) a4.f164949b;
                    cahz cahz = (cahz) cahw.mo74062i();
                    caig caig2 = caig.f174681k;
                    cahz.getClass();
                    caig.f174689g = cahz;
                    caig.f174683a |= 32;
                    if (a4.f164950c) {
                        a4.mo74035c();
                        a4.f164950c = false;
                    }
                    caig caig3 = (caig) a4.f164949b;
                    caid caid5 = (caid) da.mo74062i();
                    caid5.getClass();
                    caig3.f174690h = caid5;
                    caig3.f174683a |= 64;
                    qwo a5 = this.f82144e.mo24335a(((caig) a4.mo74062i()).mo73642k());
                    a5.mo24328b(33);
                    a5.mo24327b();
                    this.f82147i.mo41780a();
                    return 0;
                } catch (SQLiteException e2) {
                    e = e2;
                    i3 = 0;
                    try {
                        angu.m64347a(this.f82141b, getClass().getName(), e);
                        if (da.f164950c) {
                        }
                        caid caid6 = (caid) da.f164949b;
                        caid6.f174630c = 4;
                        caid6.f174628a |= 2;
                        anij.m64480a(this.f82141b, str3, i3);
                        c2 = m68255c();
                        if (c2 != 0) {
                        }
                        int b4 = (int) (this.f82150l.mo20506b() - b);
                        if (da.f164950c) {
                        }
                        caid caid7 = (caid) da.f164949b;
                        caid7.f174628a |= 4;
                        caid7.f174631d = b4;
                        a2 = anfd.m64145a(this.f82141b);
                        if (a2.f164950c) {
                        }
                        caig caig4 = (caig) a2.f164949b;
                        cahz cahz2 = (cahz) cahw.mo74062i();
                        caig caig5 = caig.f174681k;
                        cahz2.getClass();
                        caig4.f174689g = cahz2;
                        caig4.f174683a |= 32;
                        if (a2.f164950c) {
                        }
                        caig caig6 = (caig) a2.f164949b;
                        caid caid8 = (caid) da.mo74062i();
                        caid8.getClass();
                        caig6.f174690h = caid8;
                        caig6.f174683a |= 64;
                        qwo a6 = this.f82144e.mo24335a(((caig) a2.mo74062i()).mo73642k());
                        a6.mo24328b(33);
                        a6.mo24327b();
                        this.f82147i.mo41780a();
                        return i3;
                    } catch (Throwable th) {
                        th = th;
                        i2 = i3;
                        anij.m64480a(this.f82141b, str3, i2);
                        c = m68255c();
                        if (c != 0) {
                        }
                        int b5 = (int) (this.f82150l.mo20506b() - b);
                        if (da.f164950c) {
                        }
                        caid caid9 = (caid) da.f164949b;
                        caid9.f174628a |= 4;
                        caid9.f174631d = b5;
                        a = anfd.m64145a(this.f82141b);
                        if (a.f164950c) {
                        }
                        caig caig7 = (caig) a.f164949b;
                        cahz cahz3 = (cahz) cahw.mo74062i();
                        caig caig8 = caig.f174681k;
                        cahz3.getClass();
                        caig7.f174689g = cahz3;
                        caig7.f174683a |= 32;
                        if (a.f164950c) {
                        }
                        caig caig9 = (caig) a.f164949b;
                        caid caid10 = (caid) da.mo74062i();
                        caid10.getClass();
                        caig9.f174690h = caid10;
                        caig9.f174683a |= 64;
                        qwo a7 = this.f82144e.mo24335a(((caig) a.mo74062i()).mo73642k());
                        a7.mo24328b(33);
                        a7.mo24327b();
                        this.f82147i.mo41780a();
                        throw th;
                    }
                } catch (anfy e3) {
                    e = e3;
                    i4 = 0;
                    bnsl bnsl = (bnsl) f82139a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService", "a", 292, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Sync task failure");
                    if (da.f164950c) {
                    }
                    caid caid11 = (caid) da.f164949b;
                    caid11.f174630c = 2;
                    caid11.f174628a = 2 | caid11.f174628a;
                    anij.m64480a(this.f82141b, str3, i4);
                    c3 = m68255c();
                    if (c3 != 0) {
                    }
                    int b6 = (int) (this.f82150l.mo20506b() - b);
                    if (da.f164950c) {
                    }
                    caid caid12 = (caid) da.f164949b;
                    caid12.f174628a |= 4;
                    caid12.f174631d = b6;
                    a3 = anfd.m64145a(this.f82141b);
                    if (a3.f164950c) {
                    }
                    caig caig10 = (caig) a3.f164949b;
                    cahz cahz4 = (cahz) cahw.mo74062i();
                    caig caig11 = caig.f174681k;
                    cahz4.getClass();
                    caig10.f174689g = cahz4;
                    caig10.f174683a |= 32;
                    if (a3.f164950c) {
                    }
                    caig caig12 = (caig) a3.f164949b;
                    caid caid13 = (caid) da.mo74062i();
                    caid13.getClass();
                    caig12.f174690h = caid13;
                    caig12.f174683a |= 64;
                    qwo a8 = this.f82144e.mo24335a(((caig) a3.mo74062i()).mo73642k());
                    a8.mo24328b(33);
                    a8.mo24327b();
                    this.f82147i.mo41780a();
                    return i4;
                } catch (RuntimeException e4) {
                    e = e4;
                    i5 = 0;
                    bnsl bnsl2 = (bnsl) f82139a.mo68387b();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService", "a", 296, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Unexpected sync task failure");
                    if (da.f164950c) {
                    }
                    caid caid14 = (caid) da.f164949b;
                    caid14.f174630c = 3;
                    caid14.f174628a |= 2;
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    i2 = 0;
                    anij.m64480a(this.f82141b, str3, i2);
                    c = m68255c();
                    if (c != 0) {
                    }
                    int b52 = (int) (this.f82150l.mo20506b() - b);
                    if (da.f164950c) {
                    }
                    caid caid92 = (caid) da.f164949b;
                    caid92.f174628a |= 4;
                    caid92.f174631d = b52;
                    a = anfd.m64145a(this.f82141b);
                    if (a.f164950c) {
                    }
                    caig caig72 = (caig) a.f164949b;
                    cahz cahz32 = (cahz) cahw.mo74062i();
                    caig caig82 = caig.f174681k;
                    cahz32.getClass();
                    caig72.f174689g = cahz32;
                    caig72.f174683a |= 32;
                    if (a.f164950c) {
                    }
                    caig caig92 = (caig) a.f164949b;
                    caid caid102 = (caid) da.mo74062i();
                    caid102.getClass();
                    caig92.f174690h = caid102;
                    caig92.f174683a |= 64;
                    qwo a72 = this.f82144e.mo24335a(((caig) a.mo74062i()).mo73642k());
                    a72.mo24328b(33);
                    a72.mo24327b();
                    this.f82147i.mo41780a();
                    throw th;
                }
            } catch (SQLiteException e5) {
                e = e5;
                i3 = 2;
                angu.m64347a(this.f82141b, getClass().getName(), e);
                if (da.f164950c) {
                }
                caid caid62 = (caid) da.f164949b;
                caid62.f174630c = 4;
                caid62.f174628a |= 2;
                anij.m64480a(this.f82141b, str3, i3);
                c2 = m68255c();
                if (c2 != 0) {
                }
                int b42 = (int) (this.f82150l.mo20506b() - b);
                if (da.f164950c) {
                }
                caid caid72 = (caid) da.f164949b;
                caid72.f174628a |= 4;
                caid72.f174631d = b42;
                a2 = anfd.m64145a(this.f82141b);
                if (a2.f164950c) {
                }
                caig caig42 = (caig) a2.f164949b;
                cahz cahz22 = (cahz) cahw.mo74062i();
                caig caig52 = caig.f174681k;
                cahz22.getClass();
                caig42.f174689g = cahz22;
                caig42.f174683a |= 32;
                if (a2.f164950c) {
                }
                caig caig62 = (caig) a2.f164949b;
                caid caid82 = (caid) da.mo74062i();
                caid82.getClass();
                caig62.f174690h = caid82;
                caig62.f174683a |= 64;
                qwo a62 = this.f82144e.mo24335a(((caig) a2.mo74062i()).mo73642k());
                a62.mo24328b(33);
                a62.mo24327b();
                this.f82147i.mo41780a();
                return i3;
            } catch (anfy e6) {
                e = e6;
                i4 = 2;
                bnsl bnsl3 = (bnsl) f82139a.mo68387b();
                bnsl3.mo68437a(e);
                bnsl3.mo68432a("com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService", "a", 292, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Sync task failure");
                if (da.f164950c) {
                }
                caid caid112 = (caid) da.f164949b;
                caid112.f174630c = 2;
                caid112.f174628a = 2 | caid112.f174628a;
                anij.m64480a(this.f82141b, str3, i4);
                c3 = m68255c();
                if (c3 != 0) {
                }
                int b62 = (int) (this.f82150l.mo20506b() - b);
                if (da.f164950c) {
                }
                caid caid122 = (caid) da.f164949b;
                caid122.f174628a |= 4;
                caid122.f174631d = b62;
                a3 = anfd.m64145a(this.f82141b);
                if (a3.f164950c) {
                }
                caig caig102 = (caig) a3.f164949b;
                cahz cahz42 = (cahz) cahw.mo74062i();
                caig caig112 = caig.f174681k;
                cahz42.getClass();
                caig102.f174689g = cahz42;
                caig102.f174683a |= 32;
                if (a3.f164950c) {
                }
                caig caig122 = (caig) a3.f164949b;
                caid caid132 = (caid) da.mo74062i();
                caid132.getClass();
                caig122.f174690h = caid132;
                caig122.f174683a |= 64;
                qwo a82 = this.f82144e.mo24335a(((caig) a3.mo74062i()).mo73642k());
                a82.mo24328b(33);
                a82.mo24327b();
                this.f82147i.mo41780a();
                return i4;
            } catch (RuntimeException e7) {
                e = e7;
                i5 = 2;
                bnsl bnsl22 = (bnsl) f82139a.mo68387b();
                bnsl22.mo68437a(e);
                bnsl22.mo68432a("com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService", "a", 296, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl22.mo68405a("Unexpected sync task failure");
                if (da.f164950c) {
                }
                caid caid142 = (caid) da.f164949b;
                caid142.f174630c = 3;
                caid142.f174628a |= 2;
                throw e;
            } catch (Throwable th3) {
                th = th3;
                i2 = 2;
                anij.m64480a(this.f82141b, str3, i2);
                c = m68255c();
                if (c != 0) {
                }
                int b522 = (int) (this.f82150l.mo20506b() - b);
                if (da.f164950c) {
                }
                caid caid922 = (caid) da.f164949b;
                caid922.f174628a |= 4;
                caid922.f174631d = b522;
                a = anfd.m64145a(this.f82141b);
                if (a.f164950c) {
                }
                caig caig722 = (caig) a.f164949b;
                cahz cahz322 = (cahz) cahw.mo74062i();
                caig caig822 = caig.f174681k;
                cahz322.getClass();
                caig722.f174689g = cahz322;
                caig722.f174683a |= 32;
                if (a.f164950c) {
                }
                caig caig922 = (caig) a.f164949b;
                caid caid1022 = (caid) da.mo74062i();
                caid1022.getClass();
                caig922.f174690h = caid1022;
                caig922.f174683a |= 64;
                qwo a722 = this.f82144e.mo24335a(((caig) a.mo74062i()).mo73642k());
                a722.mo24328b(33);
                a722.mo24327b();
                this.f82147i.mo41780a();
                throw th;
            }
        } catch (SQLiteException e8) {
            e = e8;
            i3 = 2;
            angu.m64347a(this.f82141b, getClass().getName(), e);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caid caid622 = (caid) da.f164949b;
            caid622.f174630c = 4;
            caid622.f174628a |= 2;
            anij.m64480a(this.f82141b, str3, i3);
            c2 = m68255c();
            if (c2 != 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                caid caid15 = (caid) da.f164949b;
                caid15.f174628a |= 8;
                caid15.f174632e = c2;
            }
            int b422 = (int) (this.f82150l.mo20506b() - b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caid caid722 = (caid) da.f164949b;
            caid722.f174628a |= 4;
            caid722.f174631d = b422;
            a2 = anfd.m64145a(this.f82141b);
            if (a2.f164950c) {
                a2.mo74035c();
                a2.f164950c = false;
            }
            caig caig422 = (caig) a2.f164949b;
            cahz cahz222 = (cahz) cahw.mo74062i();
            caig caig522 = caig.f174681k;
            cahz222.getClass();
            caig422.f174689g = cahz222;
            caig422.f174683a |= 32;
            if (a2.f164950c) {
                a2.mo74035c();
                a2.f164950c = false;
            }
            caig caig622 = (caig) a2.f164949b;
            caid caid822 = (caid) da.mo74062i();
            caid822.getClass();
            caig622.f174690h = caid822;
            caig622.f174683a |= 64;
            qwo a622 = this.f82144e.mo24335a(((caig) a2.mo74062i()).mo73642k());
            a622.mo24328b(33);
            a622.mo24327b();
            this.f82147i.mo41780a();
            return i3;
        } catch (anfy e9) {
            e = e9;
            i4 = 2;
            bnsl bnsl32 = (bnsl) f82139a.mo68387b();
            bnsl32.mo68437a(e);
            bnsl32.mo68432a("com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService", "a", 292, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl32.mo68405a("Sync task failure");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caid caid1122 = (caid) da.f164949b;
            caid1122.f174630c = 2;
            caid1122.f174628a = 2 | caid1122.f174628a;
            anij.m64480a(this.f82141b, str3, i4);
            c3 = m68255c();
            if (c3 != 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                caid caid16 = (caid) da.f164949b;
                caid16.f174628a |= 8;
                caid16.f174632e = c3;
            }
            int b622 = (int) (this.f82150l.mo20506b() - b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caid caid1222 = (caid) da.f164949b;
            caid1222.f174628a |= 4;
            caid1222.f174631d = b622;
            a3 = anfd.m64145a(this.f82141b);
            if (a3.f164950c) {
                a3.mo74035c();
                a3.f164950c = false;
            }
            caig caig1022 = (caig) a3.f164949b;
            cahz cahz422 = (cahz) cahw.mo74062i();
            caig caig1122 = caig.f174681k;
            cahz422.getClass();
            caig1022.f174689g = cahz422;
            caig1022.f174683a |= 32;
            if (a3.f164950c) {
                a3.mo74035c();
                a3.f164950c = false;
            }
            caig caig1222 = (caig) a3.f164949b;
            caid caid1322 = (caid) da.mo74062i();
            caid1322.getClass();
            caig1222.f174690h = caid1322;
            caig1222.f174683a |= 64;
            qwo a822 = this.f82144e.mo24335a(((caig) a3.mo74062i()).mo73642k());
            a822.mo24328b(33);
            a822.mo24327b();
            this.f82147i.mo41780a();
            return i4;
        } catch (RuntimeException e10) {
            e = e10;
            i5 = 2;
            bnsl bnsl222 = (bnsl) f82139a.mo68387b();
            bnsl222.mo68437a(e);
            bnsl222.mo68432a("com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService", "a", 296, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl222.mo68405a("Unexpected sync task failure");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caid caid1422 = (caid) da.f164949b;
            caid1422.f174630c = 3;
            caid1422.f174628a |= 2;
            throw e;
        } catch (Throwable th4) {
            th = th4;
            i2 = z;
            anij.m64480a(this.f82141b, str3, i2);
            c = m68255c();
            if (c != 0) {
            }
            int b5222 = (int) (this.f82150l.mo20506b() - b);
            if (da.f164950c) {
            }
            caid caid9222 = (caid) da.f164949b;
            caid9222.f174628a |= 4;
            caid9222.f174631d = b5222;
            a = anfd.m64145a(this.f82141b);
            if (a.f164950c) {
            }
            caig caig7222 = (caig) a.f164949b;
            cahz cahz3222 = (cahz) cahw.mo74062i();
            caig caig8222 = caig.f174681k;
            cahz3222.getClass();
            caig7222.f174689g = cahz3222;
            caig7222.f174683a |= 32;
            if (a.f164950c) {
            }
            caig caig9222 = (caig) a.f164949b;
            caid caid10222 = (caid) da.mo74062i();
            caid10222.getClass();
            caig9222.f174690h = caid10222;
            caig9222.f174683a |= 64;
            qwo a7222 = this.f82144e.mo24335a(((caig) a.mo74062i()).mo73642k());
            a7222.mo24328b(33);
            a7222.mo24327b();
            this.f82147i.mo41780a();
            throw th;
        }
    }

    /* renamed from: aZ */
    public final void mo7135aZ() {
        anij.m64476a(this);
    }

    public final void onCreate() {
        super.onCreate();
        mo46523a(this);
    }

    public final void onDestroy() {
        this.f82145g.mo24388e();
        this.f82142c.close();
        anfg anfg = this.f82143d;
        if (anfg != null) {
            anfg.close();
        }
        super.onDestroy();
    }

    public HeterodyneSyncTaskChimeraService(anfg anfg, anfg anfg2, bdza bdza, qxq qxq, Context context, qws qws, aney aney, PackageManager packageManager, rfz rfz, beai beai, sqv sqv) {
        this.f82142c = anfg;
        this.f82143d = anfg2;
        this.f82146h = bdza;
        this.f82145g = qxq;
        this.f82141b = context;
        this.f82144e = qws;
        this.f82151n = aney;
        this.f82152o = packageManager;
        this.f82153p = rfz;
        this.f82154q = beai;
        this.f82150l = sqv;
        this.f82147i = new angg(aney, context);
        this.f82149k = new anin(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo46524b() {
        int i;
        ArrayList arrayList = new ArrayList();
        if (!cgeg.m144877b()) {
            i = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC;
        } else {
            i = 196;
        }
        for (PackageInfo packageInfo : this.f82152o.getInstalledPackages(i)) {
            if (!this.f82153p.mo24606a(packageInfo)) {
                String str = packageInfo.packageName;
            } else {
                arrayList.addAll(this.f82154q.mo58477a(packageInfo));
            }
        }
        if (!arrayList.isEmpty()) {
            anio anio = new anio();
            new anhq(anio, (braj[]) arrayList.toArray(new braj[0])).mo41826a(this.f82141b, this.f82142c);
            if (!anio.f76951a.mo17710c()) {
                bnsl bnsl = (bnsl) f82139a.mo68387b();
                bnsl.mo68432a("com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService", "b", 394, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to bulk register phenotype registrants");
            }
        }
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        int i;
        cahw cahw = (cahw) cahz.f174610h.mo74144da();
        Bundle bundle = aecc.f63129b;
        if (bundle != null) {
            i = bqyo.m113771a(bundle.getInt("fetchReason"));
        } else {
            i = 1;
        }
        Bundle bundle2 = aecc.f63129b;
        return mo46522a(i, bundle2 != null ? bundle2.getString("fetchPackage") : null, cahw, aecc.f63128a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abop.<init>(android.content.Context, java.lang.String, boolean, aboq):void
     arg types: [android.content.Context, java.lang.String, int, aboq]
     candidates:
      abop.<init>(android.content.Context, java.lang.String, boolean, boolean):void
      abop.<init>(android.content.Context, java.lang.String, boolean, aboq):void */
    /* renamed from: a */
    public final void mo46523a(Context context) {
        aniz aniz;
        this.f82141b = context;
        this.f82144e = anfd.m64146a();
        this.f82145g = new qxq(this.f82144e, "CLEARCUT_LOG_LOSS", 1024);
        this.f82142c = anfg.m64152a(context);
        if (anhe.m64383a()) {
            this.f82143d = anfg.m64153b(context);
        }
        this.f82146h = new anil(context);
        this.f82151n = anef.m64089a(context);
        this.f82147i = new angg(this.f82151n, context);
        this.f82152o = context.getPackageManager();
        this.f82153p = rfz.m33557a(context);
        this.f82154q = new beai(this.f82152o);
        if (!cgem.f186663a.mo6606a().mo83569z()) {
            Context context2 = this.f82141b;
            abop abop = new abop(context2, anfi.m64157a(context2), true, rfy.m33550g(this.f82141b) ? aboq.PERMIT_ALL : aboq.PERMIT_NONE);
            abop.f57804b.setParameter("http.connection.timeout", Integer.valueOf(Math.max((int) cgem.m144887b(), 30000)));
            aniz = new aniv(abop, aniu.m64525e());
        } else {
            aniz = new anix(aniu.m64525e());
        }
        this.f82148j = aniz;
        this.f82150l = srb.f45012a;
        this.f82149k = new anin(this);
    }
}
