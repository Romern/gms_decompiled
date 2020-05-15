package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;

/* renamed from: qsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class qsi extends aaab {

    /* renamed from: b */
    private static final Logger f42030b = qqu.m32670a("ChromeSyncOperation");

    /* renamed from: a */
    protected acyr f42031a;

    /* renamed from: c */
    private final Account f42032c;

    protected qsi(String str, Account account) {
        super(80, str);
        sdo.m34959a(account);
        this.f42032c = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo24251b(Context context);

    /* renamed from: a */
    public final void mo6502a(Context context) {
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.f42031a = acyr.m50017a(context, this.f42032c);
            mo24251b(context);
            qsh a = qsh.m32791a(context, this.f42032c.name);
            bxvd da = boka.f133379e.mo74144da();
            String str = this.f27820m;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boka boka = (boka) da.f164949b;
            str.getClass();
            boka.f133381a |= 1;
            boka.f133382b = str;
            int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boka boka2 = (boka) da.f164949b;
            boka2.f133381a |= 2;
            boka2.f133383c = elapsedRealtime2;
            bxvd da2 = bojz.f133375c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bojz bojz = (bojz) da2.f164949b;
            bojz.f133377a |= 1;
            bojz.f133378b = 0;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boka boka3 = (boka) da.f164949b;
            bojz bojz2 = (bojz) da2.mo74062i();
            bojz2.getClass();
            boka3.f133384d = bojz2;
            boka3.f133381a |= 4;
            a.mo24249a((boka) da.mo74062i());
            return;
        } catch (gid e) {
            f42030b.mo25410a((Throwable) e);
            throw new aaaj(8, "Internal error.", null, e);
        } catch (qrp e2) {
            f42030b.mo25410a((Throwable) e2);
            int i2 = e2.f42002a;
            if (i2 == 513) {
                throw new aaaj(7, "Network error.", null, e2);
            } else if (i2 == 1537) {
                throw new aaaj(11000, "Passphrase required.", qwg.m32995a(context, this.f42031a.mo33252a()), e2);
            } else if (i2 != 1538) {
                switch (i2) {
                    case 1793:
                        throw new aaaj(10, e2.getMessage(), null, e2);
                    case 1794:
                        throw new aaaj(11002, e2.getMessage(), null, e2);
                    case 1795:
                        throw new aaaj(11001, "Wrong passphrase.", null, e2);
                    default:
                        throw new aaaj(8, "Internal error.", null, e2);
                }
            } else {
                throw new aaaj(11000, "Key retrieval required.", e2.f42003b, e2);
            }
        } catch (aaaj e3) {
            try {
                i = e3.f27843a.f30115i;
                throw e3;
            } catch (Throwable th) {
                th = th;
            }
        }
        qsh a2 = qsh.m32791a(context, this.f42032c.name);
        bxvd da3 = boka.f133379e.mo74144da();
        String str2 = this.f27820m;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        boka boka4 = (boka) da3.f164949b;
        str2.getClass();
        boka4.f133381a |= 1;
        boka4.f133382b = str2;
        int elapsedRealtime3 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        boka boka5 = (boka) da3.f164949b;
        boka5.f133381a |= 2;
        boka5.f133383c = elapsedRealtime3;
        bxvd da4 = bojz.f133375c.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bojz bojz3 = (bojz) da4.f164949b;
        bojz3.f133377a |= 1;
        bojz3.f133378b = i;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        boka boka6 = (boka) da3.f164949b;
        bojz bojz4 = (bojz) da4.mo74062i();
        bojz4.getClass();
        boka6.f133384d = bojz4;
        boka6.f133381a |= 4;
        a2.mo24249a((boka) da3.mo74062i());
        throw th;
    }
}
