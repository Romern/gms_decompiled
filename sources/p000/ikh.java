package p000;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ikh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ikh {

    /* renamed from: a */
    static final bngx f21192a = bngx.m109356a("auth.authzen.store.transactions");

    /* renamed from: b */
    public static final ReentrantLock f21193b = new ReentrantLock();

    /* renamed from: c */
    public static iml f21194c;

    /* renamed from: d */
    public static final Logger f21195d = new Logger("TransactionCache");

    /* renamed from: e */
    private static final ikh f21196e = new ikh();

    /* renamed from: f */
    private sqv f21197f;

    /* renamed from: a */
    public static ikh m15586a(Context context) {
        try {
            ikh ikh = f21196e;
            srb srb = srb.f45012a;
            f21193b.lock();
            if (f21194c == null) {
                f21194c = new iml(new File(context.getFilesDir(), "auth.authzen.store.transactions_v2"));
                ikh.f21197f = srb;
                bnre i = f21192a.listIterator();
                while (i.hasNext()) {
                    String str = (String) i.next();
                    File file = new File(context.getFilesDir(), str);
                    if (file.isFile()) {
                        if (file.delete()) {
                            Logger Logger = f21195d;
                            String valueOf = String.valueOf(str);
                            Logger.mo25414c(valueOf.length() == 0 ? new String("Clearing deprecated transaction cache: ") : "Clearing deprecated transaction cache: ".concat(valueOf), new Object[0]);
                        } else {
                            Logger logger2 = f21195d;
                            String valueOf2 = String.valueOf(str);
                            logger2.mo25416d(valueOf2.length() == 0 ? new String("Failed to clear deprecated transaction cache: ") : "Failed to clear deprecated transaction cache: ".concat(valueOf2), new Object[0]);
                        }
                    }
                }
            }
            f21193b.unlock();
        } catch (IOException | NullPointerException e) {
            f21194c = null;
            throw e;
        } catch (IOException e2) {
            Logger logger3 = f21195d;
            String valueOf3 = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 38);
            sb.append("Could not initialize TransacitonCache ");
            sb.append(valueOf3);
            logger3.mo25418e(sb.toString(), new Object[0]);
        } catch (Throwable th) {
            f21193b.unlock();
            throw th;
        }
        return f21196e;
    }

    /* renamed from: b */
    public final void mo13089b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (String str : f21194c.mo13142b()) {
            String a = f21194c.mo13139a(str);
            if (a != null) {
                ikg a2 = ikg.m15585a(a);
                if (a2 == null) {
                    Logger Logger = f21195d;
                    String valueOf = String.valueOf(str);
                    Logger.mo25418e(valueOf.length() == 0 ? new String("Transaction entry was found to be corrupted during groom read: ") : "Transaction entry was found to be corrupted during groom read: ".concat(valueOf), new Object[0]);
                    f21194c.mo13141a(str, null, a);
                } else if (a2.f21187d <= elapsedRealtime) {
                    f21194c.mo13141a(str, null, a);
                    Logger logger2 = f21195d;
                    String valueOf2 = String.valueOf(str);
                    logger2.mo25414c(valueOf2.length() == 0 ? new String("  Removed an entry during groom: ") : "  Removed an entry during groom: ".concat(valueOf2), new Object[0]);
                }
            } else {
                Logger logger3 = f21195d;
                String valueOf3 = String.valueOf(str);
                logger3.mo25418e(valueOf3.length() == 0 ? new String("Database had null entry for transaction: ") : "Database had null entry for transaction: ".concat(valueOf3), new Object[0]);
                f21194c.mo13141a(str, null, null);
            }
        }
    }

    /* renamed from: a */
    public static String m15587a(bypc bypc) {
        if (bypc == null) {
            f21195d.mo25418e("makeTransactionCacheEntryKey called on null request", new Object[0]);
            return null;
        }
        bypb bypb = bypc.f167310d;
        if (bypb == null) {
            bypb = bypb.f167289p;
        }
        if ((bypc.f167307a & 4) == 0 || (bypb.f167291a & 1024) == 0) {
            f21195d.mo25414c("request doesn't have enough information to make cache entry key", new Object[0]);
            return null;
        }
        byny byny = bypb.f167295e;
        if (byny == null) {
            byny = byny.f167146c;
        }
        int i = byny.f167149b;
        byny byny2 = bypb.f167295e;
        if (byny2 == null) {
            byny2 = byny.f167146c;
        }
        int i2 = byny2.f167148a;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i2);
        sb.append("/");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m15588a(ikg ikg) {
        return m15587a(ikg.f21184a);
    }

    /* renamed from: a */
    public final ikg mo13087a(byte[] bArr) {
        ReentrantLock reentrantLock;
        f21193b.lock();
        try {
            mo13089b();
            f21194c.mo13140a();
            for (String str : f21194c.mo13142b()) {
                String a = f21194c.mo13139a(str);
                if (a == null) {
                    Logger Logger = f21195d;
                    String valueOf = String.valueOf(str);
                    Logger.mo25418e(valueOf.length() == 0 ? new String("Found transaction set to null in cache.getByTxId: ") : "Found transaction set to null in cache.getByTxId: ".concat(valueOf), new Object[0]);
                } else {
                    ikg a2 = ikg.m15585a(a);
                    if (a2 == null) {
                        Logger logger2 = f21195d;
                        String valueOf2 = String.valueOf(str);
                        logger2.mo25418e(valueOf2.length() == 0 ? new String("Found corrupted transaction in cache.getByTxId: ") : "Found corrupted transaction in cache.getByTxId: ".concat(valueOf2), new Object[0]);
                    } else if (Arrays.equals(bArr, a2.f21184a.f167308b.getKey())) {
                        Logger logger3 = f21195d;
                        String valueOf3 = String.valueOf(str);
                        logger3.mo25414c(valueOf3.length() == 0 ? new String("Found transaction in cache: ") : "Found transaction in cache: ".concat(valueOf3), new Object[0]);
                        f21193b.unlock();
                        return a2;
                    }
                }
            }
            f21195d.mo25414c("Requested transaction not found in cache", new Object[0]);
            reentrantLock = f21193b;
        } catch (IOException e) {
            f21195d.mo25417e("Internal transaction cache error", e, new Object[0]);
            reentrantLock = f21193b;
        } catch (Throwable th) {
            f21193b.unlock();
            throw th;
        }
        reentrantLock.unlock();
        return null;
    }

    /* renamed from: a */
    public final void mo13088a() {
        ReentrantLock reentrantLock;
        Lock writeLock;
        f21193b.lock();
        try {
            f21195d.mo25414c("Clearing transaction cache", new Object[0]);
            iml iml = f21194c;
            writeLock = iml.f21359a.writeLock();
            writeLock.lock();
            iml.f21360b.clear();
            iml.f21361c = true;
            writeLock.unlock();
            f21194c.mo13140a();
            reentrantLock = f21193b;
        } catch (IOException e) {
            try {
                f21195d.mo25417e("Error while clearing cache", e, new Object[0]);
                reentrantLock = f21193b;
            } catch (Throwable th) {
                f21193b.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            writeLock.unlock();
            throw th2;
        }
        reentrantLock.unlock();
    }
}
