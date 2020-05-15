package p000;

import android.content.SyncResult;
import android.database.SQLException;
import android.os.SystemClock;
import com.android.volley.NetworkError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: vbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vbi {

    /* renamed from: a */
    private static final sbw f48920a = new sbw("FeedProcessorDriver", "");

    /* renamed from: b */
    private final BlockingQueue f48921b;

    /* renamed from: c */
    private final ArrayList f48922c = new ArrayList();

    /* renamed from: d */
    private final ArrayList f48923d = new ArrayList();

    /* renamed from: e */
    private final uih f48924e;

    /* renamed from: f */
    private final vpu f48925f;

    /* renamed from: g */
    private final uhn f48926g;

    /* renamed from: h */
    private final uhj f48927h;

    /* renamed from: i */
    private long f48928i = 0;

    public vbi(vpu vpu, uih uih, String str) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(4);
        sdo.m34959a(vpu);
        this.f48925f = vpu;
        sdo.m34959a(uih);
        this.f48924e = uih;
        sdo.m34959a((Object) str);
        sdo.m34959a(linkedBlockingQueue);
        this.f48921b = linkedBlockingQueue;
        this.f48926g = vpu.f49757d;
        this.f48927h = vpu.f49756c;
    }

    /* renamed from: a */
    private final void m39930a() {
        ArrayList arrayList = this.f48923d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((vbq) arrayList.get(i)).interrupt();
        }
        ArrayList arrayList2 = this.f48923d;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            vbq vbq = (vbq) arrayList2.get(i2);
            try {
                vbq.join();
            } catch (Exception e) {
                if (vbq.isAlive()) {
                    f48920a.mo25378c("FeedProcessorDriver", "Producer not cleaned up correctly.", e);
                }
            }
        }
        do {
            try {
                if (this.f48921b.isEmpty()) {
                    return;
                }
            } catch (Exception e2) {
                if (!this.f48921b.isEmpty()) {
                    f48920a.mo25378c("FeedProcessorDriver", "Producer not cleaned up correctly.", e2);
                    return;
                }
                return;
            }
        } while (!((vbr) this.f48921b.take()).mo28203a());
    }

    /* renamed from: a */
    private final void m39931a(Set set) {
        if (!set.isEmpty()) {
            this.f48925f.f49775v.mo27859a(set);
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:3:0x0017 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:147:0x025b */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:30:0x0094 */
    /* JADX INFO: additional move instructions added (6) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:193:0x0043 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:44:0x00c7 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:200:0x00a8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String], assign insn: 0x0004: CONST_STR  (r3v0 ? I:java.lang.String) =  "Exception in finally block" */
    /* JADX WARN: Type inference failed for: r3v5, assign insn: PHI: (r3v5 ?) = (r3v0 ?), (r3v30 ?) binds: [B:3:0x0017, B:147:0x025b] */
    /* JADX WARN: Type inference failed for: r3v8, assign insn: PHI: (r3v8 ?) = (r3v0 ?), (r3v37 ?) binds: [B:3:0x0017, B:20:0x0065] */
    /* JADX WARN: Type inference failed for: r3v12, assign insn: PHI: (r3v12 ?) = (r3v0 ?), (r3v37 ?) binds: [B:3:0x0017, B:20:0x0065] */
    /* JADX WARN: Type inference failed for: r3v18, assign insn: PHI: (r3v18 ?) = (r3v0 ?), (r3v37 ?) binds: [B:3:0x0017, B:20:0x0065] */
    /* JADX WARN: Type inference failed for: r3v19, assign insn: PHI: (r3v19 ?) = (r3v0 ?), (r3v37 ?) binds: [B:3:0x0017, B:20:0x0065] */
    /* JADX WARN: Type inference failed for: r3v24, assign insn: PHI: (r3v24 ?) = (r3v0 ?), (r3v37 ?) binds: [B:3:0x0017, B:20:0x0065] */
    /* JADX WARN: Type inference failed for: r3v25, assign insn: PHI: (r3v25 ?) = (r3v0 ?), (r3v37 ?) binds: [B:3:0x0017, B:20:0x0065] */
    /* JADX WARN: Type inference failed for: r3v28, assign insn: PHI: (r3v28 ?) = (r3v0 ?), (r3v37 ?) binds: [B:3:0x0017, B:20:0x0065] */
    /* JADX WARN: Type inference failed for: r3v30, types: [android.content.SyncResult], assign insn: PHI: (r3v30 ?) = (r3v64 ?), (r3v71 ?), (r3v86 ?) binds: [B:66:0x0136, B:80:0x0171, B:146:0x025a] */
    /* JADX WARN: Type inference failed for: r3v32, assign insn: PHI: (r3v32 ?) = (r3v0 ?), (r3v37 ?) binds: [B:3:0x0017, B:20:0x0065] */
    /* JADX WARN: Type inference failed for: r3v35, assign insn: PHI: (r3v35 ?) = (r3v0 ?), (r3v37 ?) binds: [B:3:0x0017, B:20:0x0065] */
    /* JADX WARN: Type inference failed for: r3v37, assign insn: PHI: (r3v37 ?) = (r3v0 ?), (r3v40 ?) binds: [B:8:0x0042, B:193:0x0043] */
    /* JADX WARN: Type inference failed for: r3v40, assign insn: PHI: (r3v40 ?) = (r3v56 ?), (r3v75 ?) binds: [B:199:0x0043, B:198:0x0043] */
    /* JADX WARN: Type inference failed for: r3v56, assign insn: 0x01fa: MOVE  (r3v56 ? I:?[OBJECT, ARRAY]) = (r19v2 java.lang.String) */
    /* JADX WARN: Type inference failed for: r3v64, assign insn: 0x0136: MOVE  (r3v64 ? I:?[OBJECT, ARRAY]) = (r21v0 android.content.SyncResult) */
    /* JADX WARN: Type inference failed for: r3v71, assign insn: 0x0173: MOVE  (r3v71 ? I:?[OBJECT, ARRAY]) = (r21v0 android.content.SyncResult) */
    /* JADX WARN: Type inference failed for: r3v75, assign insn: 0x010c: MOVE  (r3v75 ? I:?[OBJECT, ARRAY]) = (r19v11 java.lang.String) */
    /* JADX WARN: Type inference failed for: r3v76, assign insn: PHI: (r3v76 ?) = (r3v37 ?), (r3v77 ?), (r3v77 ?) binds: [B:30:0x0094, B:44:0x00c7, B:45:?] */
    /* JADX WARN: Type inference failed for: r3v77, assign insn: PHI: (r3v77 ?) = (r3v37 ?), (r3v78 ?) binds: [B:31:?, B:200:0x00a8] */
    /* JADX WARN: Type inference failed for: r3v78, assign insn: PHI: (r3v78 ?) = (r3v80 ?), (r3v77 ?), (r3v77 ?) binds: [B:204:0x00a8, B:202:0x00a8, B:203:0x00a8] */
    /* JADX WARN: Type inference failed for: r3v80, assign insn: 0x00de: MOVE  (r3v80 ? I:?[OBJECT, ARRAY]) = (r19v15 java.lang.String) */
    /* JADX WARN: Type inference failed for: r3v86, assign insn: ?: MOVE  (r3v86 ?) = (r3v31 android.content.SyncResult) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02a9 A[Catch:{ SQLException -> 0x02d0, vbl -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, gid -> 0x026c, Exception -> 0x0257, all -> 0x0251, all -> 0x02df }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02aa A[Catch:{ SQLException -> 0x02d0, vbl -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, gid -> 0x026c, Exception -> 0x0257, all -> 0x0251, all -> 0x02df }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a A[Catch:{ SQLException -> 0x0197, vbl -> 0x0190, NetworkError | TimeoutError -> 0x0187, VolleyError | InterruptedException -> 0x017e, gid -> 0x0177, Exception -> 0x0170, all -> 0x0169 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0103 A[Catch:{ SQLException -> 0x0161, vbl -> 0x0159, NetworkError | TimeoutError -> 0x014f, VolleyError | InterruptedException -> 0x0145, gid -> 0x013d, Exception -> 0x0135, all -> 0x012d }] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    public final long mo28196a(SyncResult syncResult, boolean z) {
        String str;
        SyncResult syncResult2;
        Throwable th;
        SyncResult syncResult3;
        SQLException sQLException;
        SyncResult syncResult4;
        vbl vbl;
        SyncResult syncResult5;
        Throwable th2;
        boolean z2;
        SyncResult syncResult6;
        Throwable th3;
        boolean z3;
        SyncResult syncResult7;
        gid gid;
        Exception exc;
        SyncResult syncResult8;
        SyncResult syncResult9;
        String str2;
        ? r3;
        boolean z4;
        List<vkr> list;
        Throwable th4;
        SyncResult syncResult10 = syncResult;
        ? r32 = "Exception in finally block";
        this.f48928i = 0;
        if (!this.f48922c.isEmpty()) {
            HashSet hashSet = new HashSet();
            try {
                ArrayList arrayList = new ArrayList();
                long j = this.f48926g.mo27418b(this.f48924e.f47682a).f47686a;
                Iterator it = this.f48922c.iterator();
                while (it.hasNext()) {
                    ((vbh) it.next()).mo28194a(j);
                    arrayList.add(null);
                }
                int i = 0;
                while (!Thread.interrupted()) {
                    vbr vbr = (vbr) this.f48921b.take();
                    Exception exc2 = vbr.f48961b;
                    if (exc2 != null) {
                        str = r32;
                        SyncResult syncResult11 = syncResult10;
                        try {
                            throw exc2;
                        } catch (SQLException e) {
                            e = e;
                            syncResult3 = syncResult11;
                            sQLException = e;
                            syncResult3.databaseError = true;
                            throw new vbw("Database corrupted", sQLException);
                        } catch (vbl e2) {
                            e = e2;
                            syncResult4 = syncResult11;
                            vbl = e;
                            if (vbl.f48930a != null) {
                            }
                            syncResult4.stats.numParseExceptions++;
                            throw new vbw("Invalid feed while syncing", vbl);
                        } catch (NetworkError | TimeoutError e3) {
                            e = e3;
                            syncResult5 = syncResult11;
                            th2 = e;
                            syncResult5.stats.numIoExceptions++;
                            throw th2;
                        } catch (VolleyError | InterruptedException e4) {
                            e = e4;
                            syncResult6 = syncResult11;
                            th3 = e;
                            syncResult6.stats.numParseExceptions++;
                            throw th3;
                        } catch (gid e5) {
                            e = e5;
                            syncResult7 = syncResult11;
                            gid = e;
                            syncResult7.stats.numAuthExceptions++;
                            throw new vbw("Authorization exception received from server", gid);
                        } catch (Exception e6) {
                            e = e6;
                            syncResult8 = syncResult11;
                            exc = e;
                            r32 = syncResult8;
                            r32.stats.numParseExceptions++;
                            throw new vbw("Runtime Exception", exc);
                        }
                    } else if (!vbr.mo28203a()) {
                        try {
                            if (!Thread.interrupted()) {
                                int i2 = vbr.f48960a;
                                if (i2 >= 0) {
                                    if (i2 < this.f48922c.size()) {
                                        z4 = true;
                                        sdo.m34971a(z4, (Object) "Item in processor results queue is invalid.");
                                        vbh vbh = (vbh) this.f48922c.get(vbr.f48960a);
                                        vkw vkw = vbr.f48963d;
                                        HashSet hashSet2 = new HashSet();
                                        list = vkw.f49421a;
                                        if (list == null) {
                                            long elapsedRealtime = SystemClock.elapsedRealtime();
                                            uhp c = this.f48927h.mo27477c();
                                            try {
                                                uht uht = c.f47652a;
                                                uos b = uht.mo27494b(this.f48924e.f47682a);
                                                uht.mo27493a(b, list);
                                                vbh.mo28193a(b, vkw);
                                                for (vkr vkr : list) {
                                                    DriveId a = vbh.mo28156a(b, vkr, z);
                                                    if (a != null) {
                                                        hashSet2.add(a);
                                                    }
                                                }
                                                str2 = r32;
                                                vbh.mo28192a(b);
                                                c.mo27485a();
                                                try {
                                                    c.mo27486b();
                                                    this.f48928i += SystemClock.elapsedRealtime() - elapsedRealtime;
                                                } catch (SQLException e7) {
                                                    syncResult3 = syncResult;
                                                    sQLException = e7;
                                                } catch (vbl e8) {
                                                    syncResult4 = syncResult;
                                                    vbl = e8;
                                                    if (vbl.f48930a != null) {
                                                    }
                                                    syncResult4.stats.numParseExceptions++;
                                                    throw new vbw("Invalid feed while syncing", vbl);
                                                } catch (NetworkError | TimeoutError e9) {
                                                    syncResult5 = syncResult;
                                                    th2 = e9;
                                                    syncResult5.stats.numIoExceptions++;
                                                    throw th2;
                                                } catch (VolleyError | InterruptedException e10) {
                                                    syncResult6 = syncResult;
                                                    th3 = e10;
                                                    syncResult6.stats.numParseExceptions++;
                                                    throw th3;
                                                } catch (gid e11) {
                                                    syncResult7 = syncResult;
                                                    gid = e11;
                                                    syncResult7.stats.numAuthExceptions++;
                                                    throw new vbw("Authorization exception received from server", gid);
                                                } catch (Exception e12) {
                                                    r32 = syncResult;
                                                    exc = e12;
                                                    str = str2;
                                                    r32.stats.numParseExceptions++;
                                                    throw new vbw("Runtime Exception", exc);
                                                } catch (Throwable th5) {
                                                    syncResult2 = syncResult;
                                                    th = th5;
                                                    str = str2;
                                                    try {
                                                        m39930a();
                                                        m39931a(hashSet);
                                                        throw th;
                                                    } catch (Exception e13) {
                                                        syncResult2.stats.numParseExceptions++;
                                                        throw new vbw(str, e13);
                                                    }
                                                }
                                            } catch (RuntimeException e14) {
                                                RuntimeException runtimeException = e14;
                                                str2 = r32;
                                                syncResult10.stats.numParseExceptions++;
                                                f48920a.mo25378c("FeedProcessorDriver", "Error while syncing entry.", runtimeException);
                                                syncResult10 = syncResult;
                                                r32 = str2;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                th4 = th;
                                                c.mo27486b();
                                                throw th4;
                                            }
                                        } else {
                                            str2 = r32;
                                        }
                                        hashSet.addAll(hashSet2);
                                        syncResult10 = syncResult;
                                        r3 = str2;
                                    }
                                }
                                z4 = false;
                                sdo.m34971a(z4, (Object) "Item in processor results queue is invalid.");
                                vbh vbh2 = (vbh) this.f48922c.get(vbr.f48960a);
                                vkw vkw2 = vbr.f48963d;
                                HashSet hashSet22 = new HashSet();
                                list = vkw2.f49421a;
                                if (list == null) {
                                }
                                hashSet.addAll(hashSet22);
                                syncResult10 = syncResult;
                                r3 = str2;
                            } else {
                                int i3 = vbr.f48960a;
                                StringBuilder sb = new StringBuilder(41);
                                sb.append("Interrupted while processing #");
                                sb.append(i3);
                                throw new InterruptedException(sb.toString());
                            }
                        } catch (SQLException e15) {
                            sQLException = e15;
                            syncResult3 = syncResult;
                            syncResult3.databaseError = true;
                            throw new vbw("Database corrupted", sQLException);
                        } catch (vbl e16) {
                            vbl = e16;
                            syncResult4 = syncResult;
                            if (vbl.f48930a != null) {
                            }
                            syncResult4.stats.numParseExceptions++;
                            throw new vbw("Invalid feed while syncing", vbl);
                        } catch (NetworkError | TimeoutError e17) {
                            th2 = e17;
                            syncResult5 = syncResult;
                            syncResult5.stats.numIoExceptions++;
                            throw th2;
                        } catch (VolleyError | InterruptedException e18) {
                            th3 = e18;
                            syncResult6 = syncResult;
                            syncResult6.stats.numParseExceptions++;
                            throw th3;
                        } catch (gid e19) {
                            gid = e19;
                            syncResult7 = syncResult;
                            syncResult7.stats.numAuthExceptions++;
                            throw new vbw("Authorization exception received from server", gid);
                        } catch (Exception e20) {
                            exc = e20;
                            str = r32;
                            r32 = syncResult;
                            r32.stats.numParseExceptions++;
                            throw new vbw("Runtime Exception", exc);
                        } catch (Throwable th7) {
                            th = th7;
                            str = r32;
                            syncResult2 = syncResult;
                            m39930a();
                            m39931a(hashSet);
                            throw th;
                        }
                    } else {
                        str2 = r32;
                        i++;
                        try {
                            int i4 = vbr.f48960a;
                            vkw vkw3 = vbr.f48963d;
                            arrayList.set(i4, vkw3 == null ? vbr.f48962c : vkw3.f49422b);
                            if (i == this.f48922c.size()) {
                                for (int i5 = 0; i5 < this.f48922c.size(); i5++) {
                                    ((vbh) this.f48922c.get(i5)).mo28195a((String) arrayList.get(i5));
                                }
                                long j2 = this.f48928i;
                                try {
                                    m39930a();
                                    m39931a(hashSet);
                                    return j2;
                                } catch (Exception e21) {
                                    syncResult.stats.numParseExceptions++;
                                    throw new vbw(str2, e21);
                                }
                            } else {
                                syncResult10 = syncResult;
                                r3 = str2;
                            }
                        } catch (SQLException e22) {
                            e = e22;
                            syncResult3 = syncResult;
                            sQLException = e;
                            syncResult3.databaseError = true;
                            throw new vbw("Database corrupted", sQLException);
                        } catch (vbl e23) {
                            e = e23;
                            syncResult4 = syncResult;
                            vbl = e;
                            if (vbl.f48930a != null) {
                                this.f48927h.mo27465a(ull.f48129a, ull.f48129a.f48341a.mo27717e(vbl.f48930a.longValue()));
                            }
                            syncResult4.stats.numParseExceptions++;
                            throw new vbw("Invalid feed while syncing", vbl);
                        } catch (NetworkError | TimeoutError e24) {
                            e = e24;
                            syncResult5 = syncResult;
                            th2 = e;
                            syncResult5.stats.numIoExceptions++;
                            throw th2;
                        } catch (VolleyError | InterruptedException e25) {
                            e = e25;
                            syncResult6 = syncResult;
                            th3 = e;
                            syncResult6.stats.numParseExceptions++;
                            throw th3;
                        } catch (gid e26) {
                            e = e26;
                            syncResult7 = syncResult;
                            gid = e;
                            syncResult7.stats.numAuthExceptions++;
                            throw new vbw("Authorization exception received from server", gid);
                        } catch (Exception e27) {
                            e = e27;
                            syncResult8 = syncResult;
                            str = str2;
                            exc = e;
                            r32 = syncResult8;
                            r32.stats.numParseExceptions++;
                            throw new vbw("Runtime Exception", exc);
                        } catch (Throwable th8) {
                            th = th8;
                            syncResult9 = syncResult;
                            str = str2;
                            th = th;
                            syncResult2 = syncResult9;
                            m39930a();
                            m39931a(hashSet);
                            throw th;
                        }
                    }
                }
                throw new InterruptedException("Interrupted during processing");
            } catch (SQLException e28) {
                e = e28;
                syncResult3 = syncResult10;
                sQLException = e;
                syncResult3.databaseError = true;
                throw new vbw("Database corrupted", sQLException);
            } catch (vbl e29) {
                e = e29;
                syncResult4 = syncResult10;
                vbl = e;
                if (vbl.f48930a != null) {
                }
                syncResult4.stats.numParseExceptions++;
                throw new vbw("Invalid feed while syncing", vbl);
            } catch (NetworkError e30) {
                e = e30;
                z2 = r32;
                syncResult5 = syncResult10;
                th2 = e;
                syncResult5.stats.numIoExceptions++;
                throw th2;
            } catch (TimeoutError e31) {
                e = e31;
                z2 = r32;
                syncResult5 = syncResult10;
                th2 = e;
                syncResult5.stats.numIoExceptions++;
                throw th2;
            } catch (VolleyError e32) {
                e = e32;
                z3 = r32;
                syncResult6 = syncResult10;
                th3 = e;
                syncResult6.stats.numParseExceptions++;
                throw th3;
            } catch (InterruptedException e33) {
                e = e33;
                z3 = r32;
                syncResult6 = syncResult10;
                th3 = e;
                syncResult6.stats.numParseExceptions++;
                throw th3;
            } catch (gid e34) {
                e = e34;
                syncResult7 = syncResult10;
                gid = e;
                syncResult7.stats.numAuthExceptions++;
                throw new vbw("Authorization exception received from server", gid);
            } catch (Exception e35) {
                e = e35;
                str = r32;
                syncResult8 = syncResult10;
                exc = e;
                r32 = syncResult8;
                r32.stats.numParseExceptions++;
                throw new vbw("Runtime Exception", exc);
            } catch (Throwable th9) {
                th = th9;
                syncResult9 = r32;
                th = th;
                syncResult2 = syncResult9;
                m39930a();
                m39931a(hashSet);
                throw th;
            }
        } else {
            throw new vbw("No feeds to process");
        }
    }

    /* renamed from: a */
    public final void mo28197a(uzy uzy, Long l, uih uih, int i, vbh vbh, vks vks) {
        boolean z;
        if (this.f48922c.size() == this.f48923d.size()) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        sdo.m34974b(this.f48924e.equals(uih));
        int size = this.f48922c.size();
        this.f48922c.add(vbh);
        vbq vbq = new vbq(uey.m38255a(this.f48924e).mo27262a(this.f48925f.f49755b), this.f48925f, this.f48921b, uzy, l, this.f48926g.mo27431d(this.f48924e), i, size, vks);
        vbq.start();
        this.f48923d.add(vbq);
    }
}
