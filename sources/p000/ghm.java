package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: ghm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ghm extends aaab {

    /* renamed from: a */
    private final bssp f18262a;

    /* renamed from: b */
    private final LogAuditRecordsRequest f18263b;

    /* renamed from: c */
    private final rnt f18264c;

    /* renamed from: d */
    private ggi f18265d;

    /* renamed from: e */
    private long f18266e;

    public ghm(bssp bssp, LogAuditRecordsRequest logAuditRecordsRequest, rnt rnt) {
        super(MfiClientException.TYPE_MFICLIENT_NOT_STARTED, "LogAuditRecordsOperation");
        this.f18262a = bssp;
        this.f18263b = logAuditRecordsRequest;
        this.f18264c = rnt;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ggi.a(boolean, boolean, boolean, bssn):void
     arg types: [int, boolean, int, bssn]
     candidates:
      ggi.a(com.google.android.gms.audit.LogAuditRecordsRequest, bssp, long, int):void
      ggi.a(boolean, boolean, boolean, bssn):void */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0319 A[Catch:{ chux -> 0x030d, chuw -> 0x030b, gid -> 0x02fb, all -> 0x032c }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0322 A[Catch:{ chux -> 0x030d, chuw -> 0x030b, gid -> 0x02fb, all -> 0x032c }] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        Account account;
        LogAuditRecordsRequest logAuditRecordsRequest;
        Context context2 = context;
        this.f18266e = SystemClock.elapsedRealtime();
        this.f18265d = new ggi(context2);
        if (cbwm.m128777c() && ((logAuditRecordsRequest = this.f18263b) == null || logAuditRecordsRequest.f9901d == null)) {
            throw new aaaj(10, "Empty request.");
        }
        bxwc bxwc = cbwi.f178471a.mo6606a().mo75544a().f18152a;
        int size = bxwc.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ggy ggy = (ggy) bxwc.get(i2);
            if (ggy.f18156b.equals(this.f18262a.f146900f)) {
                int i3 = this.f18262a.f146899e;
                if ((2 & ggy.f18155a) != 0) {
                    long j = (long) i3;
                    ggz ggz = ggy.f18157c;
                    if (ggz == null) {
                        ggz = ggz.f18158c;
                    }
                    if (j >= ggz.f18160a) {
                        ggz ggz2 = ggy.f18157c;
                        if (ggz2 == null) {
                            ggz2 = ggz.f18158c;
                        }
                        if (j > ggz2.f18161b) {
                        }
                    } else {
                        continue;
                    }
                }
                throw new aaaj(24500, "Request rejected.");
            }
        }
        byte[][] bArr = this.f18263b.f9901d;
        int length = bArr.length;
        int i4 = 0;
        while (i4 < length) {
            byte[] bArr2 = bArr[i4];
            if (cbwm.f178475a.mo6606a().mo75549d() && bArr2 == null) {
                throw new aaaj(10, "Empty request.");
            } else if (((long) bArr2.length) <= cbwm.f178475a.mo6606a().mo75546a()) {
                i4++;
            } else {
                throw new aaaj(10, "Size exceeds maximum record size.");
            }
        }
        LogAuditRecordsRequest logAuditRecordsRequest2 = this.f18263b;
        byte[][] bArr3 = logAuditRecordsRequest2.f9901d;
        int length2 = bArr3.length;
        bssn[] bssnArr = new bssn[length2];
        for (int i5 = 0; i5 < length2; i5++) {
            bxvd da = bssn.f146882h.mo74144da();
            int i6 = logAuditRecordsRequest2.f9899b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bssn bssn = (bssn) da.f164949b;
            bssn.f146884a |= 4;
            bssn.f146886c = i6;
            bxvd da2 = bsst.f146912c.mo74144da();
            bssp bssp = this.f18262a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsst bsst = (bsst) da2.f164949b;
            bssp.getClass();
            bsst.f146915b = bssp;
            bsst.f146914a = 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bssn bssn2 = (bssn) da.f164949b;
            bsst bsst2 = (bsst) da2.mo74062i();
            bsst2.getClass();
            bssn2.f146887d = bsst2;
            bssn2.f146884a |= 8;
            bxvd da3 = bssu.f146916d.mo74144da();
            long currentTimeMillis = System.currentTimeMillis();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bssu bssu = (bssu) da3.f164949b;
            bssu.f146918a |= 1;
            bssu.f146919b = currentTimeMillis;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bssn bssn3 = (bssn) da.f164949b;
            bssu bssu2 = (bssu) da3.mo74062i();
            bssu2.getClass();
            bssn3.f146888e = bssu2;
            bssn3.f146884a |= 16;
            ByteString a = ByteString.m123261a(bArr3[i5]);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bssn bssn4 = (bssn) da.f164949b;
            a.getClass();
            bssn4.f146884a |= 1;
            bssn4.f146885b = a;
            byte[] bArr4 = logAuditRecordsRequest2.f9902e;
            if (bArr4 != null) {
                ByteString a2 = ByteString.m123261a(bArr4);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bssn bssn5 = (bssn) da.f164949b;
                a2.getClass();
                bssn5.f146884a |= 64;
                bssn5.f146890g = a2;
            }
            byte[] bArr5 = logAuditRecordsRequest2.f9903f;
            if (bArr5 != null) {
                ByteString a3 = ByteString.m123261a(bArr5);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bssn bssn6 = (bssn) da.f164949b;
                a3.getClass();
                bssn6.f146884a |= 32;
                bssn6.f146889f = a3;
            }
            bssnArr[i5] = (bssn) da.mo74062i();
        }
        int i7 = this.f18263b.f9898a;
        if (i7 == 1) {
            gho gho = new gho(context2);
            String str = this.f18263b.f9900c;
            String str2 = this.f18262a.f146900f;
            Context context3 = gho.f18270a;
            Iterator it = soz.m35801d(context3, context3.getPackageName()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    account = null;
                    break;
                }
                account = (Account) it.next();
                if (account.name.equals(str)) {
                    break;
                }
            }
            ClientContext a4 = gho.mo11882a(account, str2);
            boolean f = a4.mo17811f();
            int i8 = 0;
            while (i8 < length2) {
                bssn bssn7 = bssnArr[i8];
                bxvd bxvd = (bxvd) bssn7.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) bssn7);
                bssu bssu3 = bssn7.f146888e;
                if (bssu3 == null) {
                    bssu3 = bssu.f146916d;
                }
                bxvd bxvd2 = (bxvd) bssu3.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) bssu3);
                long currentTimeMillis2 = System.currentTimeMillis();
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bssu bssu4 = (bssu) bxvd2.f164949b;
                bssu4.f146918a |= 2;
                bssu4.f146920c = currentTimeMillis2;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bssn bssn8 = (bssn) bxvd.f164949b;
                bssu bssu5 = (bssu) bxvd2.mo74062i();
                bssn bssn9 = bssn.f146882h;
                bssu5.getClass();
                bssn8.f146888e = bssu5;
                bssn8.f146884a |= 16;
                bssn bssn10 = (bssn) bxvd.mo74062i();
                try {
                    gho.mo11884a(a4, bssn10);
                    this.f18265d.mo11795a(true, f, true, bssn10);
                    i8++;
                } catch (chux e) {
                    e = e;
                    this.f18265d.mo11795a(true, f, false, bssn10);
                    if (!gho.m13165a(e)) {
                        throw new aaaj(7, "RPC failed", null, e);
                    }
                    throw new aaaj(24500, "Request rejected", null, e);
                } catch (chuw e2) {
                    e = e2;
                    this.f18265d.mo11795a(true, f, false, bssn10);
                    if (!gho.m13165a(e)) {
                    }
                } catch (gid e3) {
                    this.f18265d.mo11795a(true, f, false, bssn10);
                    throw new aaaj(13, "Authentication failed", null, e3);
                } catch (Throwable th) {
                    gho.mo11883a();
                    throw th;
                }
            }
            this.f18265d.mo11793a(this.f18263b, this.f18262a, SystemClock.elapsedRealtime() - this.f18266e, 0);
            this.f18264c.mo11797a(Status.f30107a);
            gho.mo11883a();
        } else if (i7 == 2) {
            ggr ggr = new ggr(context2);
            try {
                if (((long) (ggr.mo11806b() + length2)) <= cbwm.m128776b()) {
                    String str3 = "";
                    if (!bmxx.m108577a(this.f18263b.f9900c)) {
                        try {
                            try {
                                str3 = gik.m13218f(context2, this.f18263b.f9900c);
                            } catch (Throwable th2) {
                                ggr.close();
                                ghp.m13169a().mo11885b();
                                throw th2;
                            }
                        } catch (gid | IOException e4) {
                        }
                    }
                    while (i < length2) {
                        if (ggr.mo11805a(bssnArr[i], str3)) {
                            i++;
                        } else {
                            throw new aaaj(8, "Database error");
                        }
                    }
                    this.f18265d.mo11794a(ggr);
                    ggr.close();
                    ghp.m13169a().mo11885b();
                    this.f18265d.mo11793a(this.f18263b, this.f18262a, SystemClock.elapsedRealtime() - this.f18266e, -1);
                    this.f18264c.mo11797a(new Status(-1));
                    return;
                }
                throw new aaaj(8, "Cache is full.");
            } catch (LevelDbException e5) {
                throw new aaaj(8, "Database error", null, e5);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        LogAuditRecordsRequest logAuditRecordsRequest;
        if (!cbwm.m128777c() || !((logAuditRecordsRequest = this.f18263b) == null || logAuditRecordsRequest.f9901d == null)) {
            this.f18265d.mo11793a(this.f18263b, this.f18262a, SystemClock.elapsedRealtime() - this.f18266e, status.f30115i);
        }
        this.f18264c.mo11797a(status);
    }
}
