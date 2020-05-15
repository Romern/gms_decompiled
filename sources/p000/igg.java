package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: igg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class igg {

    /* renamed from: a */
    public static final ikh f20915a = ikh.m15586a(rpr.m34216b());

    /* renamed from: e */
    public static final Logger f20916e = new Logger("DroidGuardHelper");

    /* renamed from: f */
    private static igg f20917f;

    /* renamed from: b */
    final Map f20918b = new HashMap();

    /* renamed from: c */
    public final Object f20919c = new Object();

    /* renamed from: d */
    public boolean f20920d;

    /* renamed from: g */
    private long f20921g = 0;

    /* renamed from: a */
    public static synchronized igg m15405a() {
        igg igg;
        synchronized (igg.class) {
            if (f20917f == null) {
                f20917f = new igg();
            }
            igg = f20917f;
        }
        return igg;
    }

    /* renamed from: a */
    public final synchronized void mo12991a(vvq vvq) {
        Map.Entry entry;
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        synchronized (this) {
            Iterator it = this.f20918b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                Map singletonMap = Collections.singletonMap("tx_id", (String) entry2.getKey());
                ikg a = f20915a.mo13087a((byte[]) entry2.getValue());
                if (a != null) {
                    String a2 = vvq.mo28905a(singletonMap);
                    ikh ikh = f20915a;
                    ikh.f21193b.lock();
                    try {
                        ikh.mo13089b();
                        String a3 = ikh.m15588a(a);
                        String a4 = ikh.f21194c.mo13139a(a3);
                        if (a4 == null) {
                            ikh.f21195d.mo25416d("Could not update transaction - not found", new Object[0]);
                            ikh.f21194c.mo13140a();
                            reentrantLock2 = ikh.f21193b;
                        } else {
                            ikg a5 = ikg.m15585a(a4);
                            if (a5 == null) {
                                Logger Logger = ikh.f21195d;
                                String valueOf = String.valueOf(a3);
                                Logger.mo25418e(valueOf.length() == 0 ? new String("Transaction entry was found to be corrupted during cache.updateTransactionState : ") : "Transaction entry was found to be corrupted during cache.updateTransactionState : ".concat(valueOf), new Object[0]);
                                ikh.f21194c.mo13140a();
                                reentrantLock2 = ikh.f21193b;
                            } else {
                                entry = entry2;
                                try {
                                    if (ikh.f21194c.mo13141a(a3, new ikg(a5.f21184a, a5.f21185b, a5.f21186c, a5.f21187d, a5.f21188e, a5.f21189f, a5.f21191h, a2).toString(), a4)) {
                                        ikh.f21195d.mo25414c("Transaction entry droidguard response is updated.", new Object[0]);
                                        ikh.f21194c.mo13140a();
                                        reentrantLock = ikh.f21193b;
                                        reentrantLock.unlock();
                                        ikj.m15597a((byte[]) entry.getValue(), 26, rpr.m34216b());
                                    } else {
                                        ikh.mo13088a();
                                        ikh.f21195d.mo25418e("Tx cache storage failed internally in updateTransactionState", new Object[0]);
                                        reentrantLock = ikh.f21193b;
                                        reentrantLock.unlock();
                                        ikj.m15597a((byte[]) entry.getValue(), 26, rpr.m34216b());
                                    }
                                } catch (IOException e) {
                                    e = e;
                                    try {
                                        ikh.f21195d.mo25417e("Internal transaction cache error", e, new Object[0]);
                                        ikh.mo13088a();
                                        reentrantLock = ikh.f21193b;
                                        reentrantLock.unlock();
                                        ikj.m15597a((byte[]) entry.getValue(), 26, rpr.m34216b());
                                        it.remove();
                                    } catch (Throwable th) {
                                        ikh.f21193b.unlock();
                                        throw th;
                                    }
                                }
                            }
                        }
                        reentrantLock2.unlock();
                        entry = entry2;
                    } catch (IOException e2) {
                        e = e2;
                        entry = entry2;
                        ikh.f21195d.mo25417e("Internal transaction cache error", e, new Object[0]);
                        ikh.mo13088a();
                        reentrantLock = ikh.f21193b;
                        reentrantLock.unlock();
                        ikj.m15597a((byte[]) entry.getValue(), 26, rpr.m34216b());
                        it.remove();
                    }
                    ikj.m15597a((byte[]) entry.getValue(), 26, rpr.m34216b());
                }
                it.remove();
            }
            vvq.mo28907b();
            synchronized (this.f20919c) {
                this.f20920d = false;
                this.f20921g = -1;
                this.f20919c.notifyAll();
            }
            f20916e.mo25414c("DroidGuard snapshot is initialized.", new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo12992a(byte[] bArr) {
        if (!TextUtils.isEmpty((CharSequence) igt.f20962l.mo58455c())) {
            String a = srv.m36160a(bArr);
            if (!this.f20918b.containsKey(a)) {
                this.f20918b.put(a, bArr);
                synchronized (this.f20919c) {
                    if (this.f20920d) {
                        if (SystemClock.elapsedRealtime() <= this.f20921g) {
                            ikj.m15597a(bArr, 25, rpr.m34216b());
                            snp.m35704b(9).execute(new igf(this));
                        }
                    }
                    this.f20920d = true;
                    this.f20921g = SystemClock.elapsedRealtime() + ((Long) igt.f20963m.mo58455c()).longValue();
                    ikj.m15597a(bArr, 25, rpr.m34216b());
                    snp.m35704b(9).execute(new igf(this));
                }
            }
        }
    }
}
