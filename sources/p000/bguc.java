package p000;

import android.accounts.Account;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.List;

/* renamed from: bguc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bguc {

    /* renamed from: a */
    public final bgug f117547a;

    /* renamed from: b */
    public final bgue f117548b;

    public bguc(bgue bgue, bgug bgug) {
        this.f117548b = bgue;
        this.f117547a = bgug;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r5 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        if (r5 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009d, code lost:
        if (r5 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0124, code lost:
        if (r2 != null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x013a, code lost:
        if (r2 != null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0146, code lost:
        if (r2 != null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x014a, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a6 A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x014e A[Catch:{ all -> 0x014b }] */
    /* renamed from: a */
    public final void mo63174a(ReportingConfig reportingConfig) {
        bgue bgue;
        LevelDb.Iterator iterator;
        LevelDb.Iterator iterator2 = null;
        if (chcp.m148197f()) {
            bgug bgug = this.f117547a;
            synchronized (bgug.f117559c) {
                if (bgug.f117560d != null) {
                    List<Account> b = reportingConfig.mo70928b();
                    for (Account account : b) {
                        bgug.mo63190a(account);
                    }
                    try {
                        iterator = bgug.f117560d.iterator();
                        try {
                            iterator.seekToFirst();
                            while (iterator.isValid()) {
                                bgul bgul = new bgul(iterator.key());
                                if (!bgul.mo63212a(b)) {
                                    long j = bgul.f117581a;
                                    StringBuilder sb = new StringBuilder(50);
                                    sb.append("Deleting entries for account #");
                                    sb.append(j);
                                    bgur.m100011a("GCoreUlr", sb.toString());
                                    bguv.m100042a("UlrEntitiesDeletedForInvalidAccount");
                                    bgug.f117560d.deleteRange(bgul.mo63213a(), bgul.mo63214b());
                                }
                                bgul.mo63210a(iterator);
                            }
                        } catch (LevelDbCorruptionException | IllegalStateException e) {
                            e = e;
                            bgug.mo63194a(e);
                        } catch (LevelDbException e2) {
                            e = e2;
                            try {
                                bgur.m100012a("GCoreUlr", "Error removing invalid entries", e);
                                bguz.m100120a(e);
                            } catch (Throwable th) {
                                th = th;
                                iterator2 = iterator;
                                if (iterator2 != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            iterator2 = iterator;
                            if (iterator2 != null) {
                            }
                            throw th;
                        }
                    } catch (LevelDbCorruptionException | IllegalStateException e3) {
                        e = e3;
                        iterator = null;
                        bgug.mo63194a(e);
                    } catch (LevelDbException e4) {
                        e = e4;
                        iterator = null;
                        bgur.m100012a("GCoreUlr", "Error removing invalid entries", e);
                        bguz.m100120a(e);
                    } catch (Throwable th3) {
                        th = th3;
                        if (iterator2 != null) {
                            iterator2.close();
                        }
                        throw th;
                    }
                }
            }
        }
        if (chcp.m148195d() && (bgue = this.f117548b) != null) {
            synchronized (bgue.f117553c) {
                if (bgue.f117554d != null) {
                    List<Account> b2 = reportingConfig.mo70928b();
                    for (Account account2 : b2) {
                        bgue.mo63177a(account2);
                    }
                    try {
                        iterator2 = bgue.f117554d.iterator();
                        try {
                            iterator2.seekToFirst();
                            while (iterator2.isValid()) {
                                bgul bgul2 = new bgul(iterator2.key());
                                if (!bgul2.mo63212a(b2)) {
                                    long j2 = bgul2.f117581a;
                                    StringBuilder sb2 = new StringBuilder(50);
                                    sb2.append("Deleting entries for account #");
                                    sb2.append(j2);
                                    bgur.m100011a("GCoreUlr", sb2.toString());
                                    bguv.m100042a("UlrEntitiesDeletedForInvalidAccount");
                                    bgue.f117554d.deleteRange(bgul2.mo63213a(), bgul2.mo63214b());
                                }
                                bgul2.mo63210a(iterator2);
                            }
                        } catch (LevelDbCorruptionException | IllegalStateException e5) {
                            e = e5;
                            bgue.mo63181a(e);
                        } catch (LevelDbException e6) {
                            e = e6;
                            try {
                                bgur.m100012a("GCoreUlr", "Error removing invalid entries", e);
                                bguz.m100120a(e);
                            } catch (Throwable th4) {
                                th = th4;
                                if (iterator2 != null) {
                                }
                                throw th;
                            }
                        }
                    } catch (LevelDbCorruptionException | IllegalStateException e7) {
                        e = e7;
                        bgue.mo63181a(e);
                    } catch (LevelDbException e8) {
                        e = e8;
                        bgur.m100012a("GCoreUlr", "Error removing invalid entries", e);
                        bguz.m100120a(e);
                    } catch (Throwable th5) {
                        th = th5;
                        if (iterator2 != null) {
                            iterator2.close();
                        }
                        throw th;
                    }
                }
            }
        }
    }
}
