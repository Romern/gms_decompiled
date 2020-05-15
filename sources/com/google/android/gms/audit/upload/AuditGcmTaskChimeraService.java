package com.google.android.gms.audit.upload;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuditGcmTaskChimeraService extends aeah {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ggi.a(boolean, boolean, boolean, bssn):void
     arg types: [int, boolean, int, bssn]
     candidates:
      ggi.a(com.google.android.gms.audit.LogAuditRecordsRequest, bssp, long, int):void
      ggi.a(boolean, boolean, boolean, bssn):void */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0144, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0145, code lost:
        r4.mo11883a();
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014b, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093 A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3 A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a4 A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00aa A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c1 A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c2 A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8 A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9 A[Catch:{ LevelDbException -> 0x014c, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0144 A[ExcHandler: all (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:65:0x0123] */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        ghk a;
        bssp bssp;
        bssn bssn;
        bxvd bxvd;
        bssn bssn2;
        bssu bssu;
        bxvd bxvd2;
        bssn bssn3;
        Account account;
        ggi ggi = new ggi(this);
        ggr ggr = new ggr(this);
        gho gho = new gho(this);
        long d = cbwv.f178492a.mo6606a().mo75563d();
        int i = 1;
        try {
            ggi.mo11794a(ggr);
            long j = 0;
            String str = null;
            String str2 = null;
            ClientContext clientContext = null;
            while (j < d && (a = ggr.mo11803a()) != null) {
                String str3 = a.f18258d;
                bssn bssn4 = a.f18256b;
                if (bssn4 == null) {
                    bssn4 = bssn.f146882h;
                }
                bsst bsst = bssn4.f146887d;
                if (bsst == null) {
                    bsst = bsst.f146912c;
                }
                if (bsst.f146914a == i) {
                    bssp = (bssp) bsst.f146915b;
                } else {
                    bssp = bssp.f146893l;
                }
                String str4 = bssp.f146900f;
                if (str3.equals(str)) {
                    if (str4.equals(str2)) {
                        if (clientContext != null) {
                            str3 = str;
                            bssn = a.f18256b;
                            if (bssn == null) {
                                bssn = bssn.f146882h;
                            }
                            bxvd = (bxvd) bssn.mo74142c(5);
                            bxvd.mo73625a((GeneratedMessageLite) bssn);
                            bssn2 = a.f18256b;
                            if (bssn2 != null) {
                                bssn2 = bssn.f146882h;
                            }
                            bssu = bssn2.f146888e;
                            if (bssu != null) {
                                bssu = bssu.f146916d;
                            }
                            bxvd2 = (bxvd) bssu.mo74142c(5);
                            bxvd2.mo73625a((GeneratedMessageLite) bssu);
                            long j2 = j;
                            long currentTimeMillis = System.currentTimeMillis();
                            if (!bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            bssu bssu2 = (bssu) bxvd2.f164949b;
                            bssu2.f146918a |= 2;
                            bssu2.f146920c = currentTimeMillis;
                            if (!bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bssn bssn5 = (bssn) bxvd.f164949b;
                            bssu bssu3 = (bssu) bxvd2.mo74062i();
                            bssu3.getClass();
                            bssn5.f146888e = bssu3;
                            bssn5.f146884a |= 16;
                            bssn3 = (bssn) bxvd.mo74062i();
                            gho.mo11884a(clientContext, bssn3);
                            ggi.mo11795a(false, clientContext.mo17811f(), true, bssn3);
                            ggr.mo11804a(a);
                            j = j2 + 1;
                            str = str3;
                            i = 1;
                        }
                    }
                }
                Context context = gho.f18270a;
                Iterator it = soz.m35801d(context, context.getPackageName()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        account = null;
                        break;
                    }
                    account = (Account) it.next();
                    try {
                        if (!str3.equals(gik.m13218f(gho.f18270a, account.name))) {
                        }
                    } catch (gid | IOException e) {
                    } catch (Throwable th) {
                    }
                }
                clientContext = gho.mo11882a(account, str4);
                str2 = str4;
                bssn = a.f18256b;
                if (bssn == null) {
                }
                bxvd = (bxvd) bssn.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) bssn);
                bssn2 = a.f18256b;
                if (bssn2 != null) {
                }
                bssu = bssn2.f146888e;
                if (bssu != null) {
                }
                bxvd2 = (bxvd) bssu.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) bssu);
                long j22 = j;
                long currentTimeMillis2 = System.currentTimeMillis();
                if (!bxvd2.f164950c) {
                }
                bssu bssu22 = (bssu) bxvd2.f164949b;
                bssu22.f146918a |= 2;
                bssu22.f146920c = currentTimeMillis2;
                if (!bxvd.f164950c) {
                }
                bssn bssn52 = (bssn) bxvd.f164949b;
                bssu bssu32 = (bssu) bxvd2.mo74062i();
                bssu32.getClass();
                bssn52.f146888e = bssu32;
                bssn52.f146884a |= 16;
                bssn3 = (bssn) bxvd.mo74062i();
                try {
                    gho.mo11884a(clientContext, bssn3);
                    ggi.mo11795a(false, clientContext.mo17811f(), true, bssn3);
                } catch (chuw | chux | gid e2) {
                    ggi.mo11795a(false, clientContext.mo17811f(), false, bssn3);
                    if (gho.m13165a(e2)) {
                        gho.mo11883a();
                        ggr.close();
                        return 1;
                    }
                }
                ggr.mo11804a(a);
                j = j22 + 1;
                str = str3;
                i = 1;
            }
            if (ggr.mo11806b() > 0) {
                ghp.m13169a().mo11885b();
            }
            gho.mo11883a();
            ggr.close();
            return 0;
        } catch (LevelDbException e3) {
            gho.mo11883a();
            ggr.close();
            return 1;
        } catch (Throwable th2) {
        }
    }
}
