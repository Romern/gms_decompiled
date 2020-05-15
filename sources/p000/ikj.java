package p000;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import com.google.android.gms.auth.authzen.transaction.secondscreen.SecondScreenIntentOperation;
import com.google.android.gms.auth.authzen.transaction.workflows.BasicConfirmationChimeraWorkflow;
import com.google.android.gms.auth.authzen.transaction.workflows.DoubleConfirmationChimeraWorkflow;
import com.google.android.gms.auth.authzen.transaction.workflows.PinConfirmationChimeraWorkflow;
import com.google.android.gms.auth.authzen.transaction.workflows.SimpleNotificationChimeraWorkflow;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ikj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ikj {

    /* renamed from: a */
    public static ikh f21204a = ikh.m15586a(rpr.m34216b());

    /* renamed from: d */
    public static final sek f21205d = new sek("TransactionManager");

    /* renamed from: b */
    public final ikl f21206b = ikl.m15607a(rpr.m34216b());

    /* renamed from: c */
    public final igr f21207c;

    public ikj() {
        igr igr = new igr();
        axsg axsg = axoz.f96228c;
        bmxy.m108581a(axsg);
        igr.f20934b = axsg;
        axsn axsn = axoz.f96229d;
        bmxy.m108581a(axsn);
        igr.f20935c = axsn;
        this.f21207c = igr;
        f21204a = ikh.m15586a(rpr.m34216b());
    }

    /* renamed from: a */
    public static long m15593a(bypc bypc) {
        Long valueOf = Long.valueOf(bypc.f167309c);
        bypb bypb = bypc.f167310d;
        if (bypb == null) {
            bypb = bypb.f167289p;
        }
        return bypb.f167292b - valueOf.longValue();
    }

    /* renamed from: b */
    public static String m15598b(byte[] bArr) {
        return bArr != null ? srv.m36160a(bArr) : "null_transaction";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0090, code lost:
        if (r1 == 1) goto L_0x0092;
     */
    /* renamed from: a */
    public static final Intent m15594a(Context context, bypc bypc, String str, byte[] bArr) {
        try {
            bypb bypb = bypc.f167310d;
            if (bypb == null) {
                bypb = bypb.f167289p;
            }
            byod a = byod.m125020a(bypb.f167296f);
            if (a == null) {
                a = byod.START_ACTIVITY;
            }
            if (a == byod.GENERIC_NOTIFICATION) {
                bypb bypb2 = bypc.f167310d;
                if (bypb2 == null) {
                    bypb2 = bypb.f167289p;
                }
                byoa byoa = bypb2.f167301l;
                if (byoa == null) {
                    byoa = byoa.f167173e;
                }
                if (byoa.f167176b.size() == 1) {
                    int i = SimpleNotificationChimeraWorkflow.f10507s;
                    int i2 = ilc.f21278b;
                    bypb bypb3 = bypc.f167310d;
                    if (bypb3 == null) {
                        bypb3 = bypb.f167289p;
                    }
                    byoa byoa2 = bypb3.f167301l;
                    if (byoa2 == null) {
                        byoa2 = byoa.f167173e;
                    }
                    if ((byoa2.f167175a & 1) != 0) {
                        bypb bypb4 = bypc.f167310d;
                        if (bypb4 == null) {
                            bypb4 = bypb.f167289p;
                        }
                        byoa byoa3 = bypb4.f167301l;
                        if (byoa3 == null) {
                            byoa3 = byoa.f167173e;
                        }
                        if ((byoa3.f167175a & 2) != 0) {
                            bypb bypb5 = bypc.f167310d;
                            if (bypb5 == null) {
                                bypb5 = bypb.f167289p;
                            }
                            byoa byoa4 = bypb5.f167301l;
                            if (byoa4 == null) {
                                byoa4 = byoa.f167173e;
                            }
                            if (byoa4.f167176b.size() == 1) {
                                bypb bypb6 = bypc.f167310d;
                                if (bypb6 == null) {
                                    bypb6 = bypb.f167289p;
                                }
                                byoa byoa5 = bypb6.f167301l;
                                if (byoa5 == null) {
                                    byoa5 = byoa.f167173e;
                                }
                                int a2 = byou.m125042a(((byor) byoa5.f167176b.get(0)).f167237b);
                                if (a2 == 0) {
                                }
                                bypb bypb7 = bypc.f167310d;
                                if (bypb7 == null) {
                                    bypb7 = bypb.f167289p;
                                }
                                byoa byoa6 = bypb7.f167301l;
                                if (byoa6 == null) {
                                    byoa6 = byoa.f167173e;
                                }
                                if ((((byor) byoa6.f167176b.get(0)).f167236a & 1) != 0) {
                                    return SimpleNotificationChimeraWorkflow.m6544b(bypc, str, bArr);
                                }
                            }
                        }
                    }
                    throw new UnsupportedOperationException("Req proto for simple notification malformed.");
                }
            }
            bypb bypb8 = bypc.f167310d;
            if (bypb8 == null) {
                bypb8 = bypb.f167289p;
            }
            byoa byoa7 = bypb8.f167301l;
            if (byoa7 == null) {
                byoa7 = byoa.f167173e;
            }
            if (byoa7.f167176b.size() == 2) {
                bypb bypb9 = bypc.f167310d;
                if (bypb9 == null) {
                    bypb9 = bypb.f167289p;
                }
                if ((bypb9.f167291a & 1024) != 0) {
                    bypb bypb10 = bypc.f167310d;
                    if (bypb10 == null) {
                        bypb10 = bypb.f167289p;
                    }
                    byoa byoa8 = bypb10.f167301l;
                    if (byoa8 == null) {
                        byoa8 = byoa.f167173e;
                    }
                    int a3 = byou.m125042a(((byor) byoa8.f167176b.get(0)).f167237b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    if (a3 == 1) {
                        int i3 = BasicConfirmationChimeraWorkflow.f10504s;
                        bypb bypb11 = bypc.f167310d;
                        if (bypb11 == null) {
                            bypb11 = bypb.f167289p;
                        }
                        if ((bypb11.f167291a & 1024) != 0) {
                            try {
                                ilf.m15648a(bypc).mo13116a();
                                return BasicConfirmationChimeraWorkflow.m6538b(bypc, str, bArr);
                            } catch (ile e) {
                                ijt.f21129r.mo25417e("Error while creating TextProvider", e, new Object[0]);
                            }
                        } else {
                            ijt.f21129r.mo25418e("Request is missing prompt parameters", new Object[0]);
                            throw new UnsupportedOperationException("Req proto for simple notification malformed.");
                        }
                    } else if (a3 != 2) {
                        int i4 = DoubleConfirmationChimeraWorkflow.f10505s;
                        bypb bypb12 = bypc.f167310d;
                        if (bypb12 == null) {
                            bypb12 = bypb.f167289p;
                        }
                        if ((bypb12.f167291a & 1024) != 0) {
                            try {
                                ilf.m15648a(bypc).mo13116a();
                                return DoubleConfirmationChimeraWorkflow.m6540b(bypc, str, bArr);
                            } catch (ile e2) {
                                ijt.f21129r.mo25417e("Error while creating TextProvider: ", e2, new Object[0]);
                            }
                        }
                        throw new UnsupportedOperationException("Req proto for DOUBLE_CONFIRMATION malformed");
                    } else {
                        int i5 = PinConfirmationChimeraWorkflow.f10506s;
                        bypb bypb13 = bypc.f167310d;
                        if (bypb13 == null) {
                            bypb13 = bypb.f167289p;
                        }
                        if ((bypb13.f167291a & 1024) == 0) {
                            sek sek = ijt.f21129r;
                            String valueOf = String.valueOf(bypc.toString());
                            sek.mo25418e(valueOf.length() == 0 ? new String("Malformed request: ") : "Malformed request: ".concat(valueOf), new Object[0]);
                        } else {
                            try {
                                ilf.m15648a(bypc).mo13116a();
                                bypb bypb14 = bypc.f167310d;
                                if (bypb14 == null) {
                                    bypb14 = bypb.f167289p;
                                }
                                byoa byoa9 = bypb14.f167301l;
                                if (byoa9 == null) {
                                    byoa9 = byoa.f167173e;
                                }
                                if (byoa9.f167176b.size() > 0) {
                                    byor byor = (byor) byoa9.f167176b.get(0);
                                    if (byor.f167239d.size() == 3) {
                                        return PinConfirmationChimeraWorkflow.m6542b(bypc, str, bArr);
                                    }
                                    sek sek2 = ijt.f21129r;
                                    int size = byor.f167239d.size();
                                    StringBuilder sb = new StringBuilder(51);
                                    sb.append("Unexpected number of pin options found: ");
                                    sb.append(size);
                                    sek2.mo25418e(sb.toString(), new Object[0]);
                                } else {
                                    ijt.f21129r.mo25418e("Request has 0 SelectorDescriptors", new Object[0]);
                                }
                            } catch (ile e3) {
                                ijt.f21129r.mo25417e("Error while creating TextProvider: %s", e3, new Object[0]);
                            }
                        }
                        throw new UnsupportedOperationException("Req proto for PIN_CONFIRMATION malformed");
                    }
                } else {
                    throw new UnsupportedOperationException("Req proto misses prompt");
                }
            } else {
                bypb bypb15 = bypc.f167310d;
                if (bypb15 == null) {
                    bypb15 = bypb.f167289p;
                }
                byoa byoa10 = bypb15.f167301l;
                if (byoa10 == null) {
                    byoa10 = byoa.f167173e;
                }
                int size2 = byoa10.f167176b.size();
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Invalid workflow - unexpected number of selectors: ");
                sb2.append(size2);
                throw new UnsupportedOperationException(sb2.toString());
            }
        } catch (UnsupportedOperationException e4) {
            iir iir = new iir(context);
            iir.f21069d = 2;
            iir.mo13046a();
            throw e4;
        }
    }

    /* renamed from: a */
    private static void m15595a(Context context, bypc bypc, String str, byte[] bArr, byoo byoo) {
        bxvd da = bypd.f167317i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bypd bypd = (bypd) da.f164949b;
        bypd.f167320b = byoo.f167232j;
        bypd.f167319a |= 1;
        bypd bypd2 = (bypd) da.mo74062i();
        bxvd da2 = byoz.f167283d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byoz byoz = (byoz) da2.f164949b;
        bypc.getClass();
        byoz.f167286b = bypc;
        int i = byoz.f167285a | 1;
        byoz.f167285a = i;
        bypd2.getClass();
        byoz.f167287c = bypd2;
        byoz.f167285a = i | 2;
        context.startService(TransactionReplyIntentOperation.m6530a(str, bArr, bypc, new byrz(bysa.TX_REPLY, ((byoz) da2.mo74062i()).mo73642k())));
    }

    /* renamed from: a */
    public static void m15596a(Context context, bypc bypc, String str, byte[] bArr, bypf bypf, byox byox) {
        context.startService(TransactionReplyIntentOperation.m6529a(str, bArr, bypc.f167308b, bypf, byox, bypc));
    }

    /* renamed from: a */
    public static void m15597a(byte[] bArr, int i, Context context) {
        iir iir = new iir(context);
        iir.mo13047a(bArr);
        iir.f21070e = i;
        iir.mo13046a();
    }

    /* renamed from: a */
    public final ikg mo13090a(byte[] bArr) {
        try {
            return f21204a.mo13087a(bArr);
        } catch (IllegalStateException e) {
            f21205d.mo25417e("Cannot get transaction by tx id", e, new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01c4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c5, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:35:0x00e1, B:73:0x0168] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0216 A[Catch:{ UnsupportedOperationException -> 0x0361 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0225 A[Catch:{ UnsupportedOperationException -> 0x0361 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0226 A[Catch:{ UnsupportedOperationException -> 0x0361 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x022e A[Catch:{ UnsupportedOperationException -> 0x0361 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02b0 A[Catch:{ UnsupportedOperationException -> 0x0361 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f4 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:35:0x00e1] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:102:0x01d5=Splitter:B:102:0x01d5, B:97:0x01c8=Splitter:B:97:0x01c8} */
    /* renamed from: a */
    public final void mo13091a(Context context, bypc bypc, String str, byte[] bArr, boolean z) {
        int i;
        byte[] bArr2;
        bypc bypc2;
        String str2;
        char c;
        bypc bypc3;
        int i2;
        ikg ikg;
        bypb bypb;
        ikg ikg2;
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        int i3;
        ReentrantLock reentrantLock3;
        Context context2 = context;
        bypc bypc4 = bypc;
        String str3 = str;
        byte[] bArr3 = bArr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bypb bypb2 = bypc4.f167310d;
        if (bypb2 == null) {
            bypb2 = bypb.f167289p;
        }
        long j = bypb2.f167292b;
        if (elapsedRealtime > j) {
            f21205d.mo25414c("Authzen prompt was supposed to be expired based on device clock, expiry=%s, now=%s", Long.valueOf(j), Long.valueOf(elapsedRealtime));
            iir iir = new iir(context2);
            iir.f21069d = 16;
            iir.f21067b = true;
            iir.mo13046a();
        }
        try {
            bypb bypb3 = bypc4.f167310d;
            if (bypb3 == null) {
                bypb3 = bypb.f167289p;
            }
            int a = byoj.m125028a(bypb3.f167293c);
            if (a == 0) {
                a = 1;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long currentTimeMillis = System.currentTimeMillis();
            int i4 = a - 1;
            if (i4 == 1) {
                ikg a2 = mo13090a(bypc4.f167308b.mo73780k());
                if (a2 != null) {
                    if (!z) {
                        bypc3 = bypc4;
                        c = 0;
                    } else if (ikm.m15619a(a2.f21191h, 46)) {
                        bArr2 = bArr;
                        i = 0;
                        str2 = str3;
                        bypc2 = bypc4;
                        try {
                            m15596a(context, a2.f21184a, a2.f21185b, a2.f21186c, bypf.TRIGGERED, byox.SERVER_SYNC_TRIGGER);
                            if (mo13092a(a2, 46)) {
                                bypb bypb4 = a2.f21184a.f167310d;
                                if (bypb4 == null) {
                                    bypb4 = bypb.f167289p;
                                }
                                byod a3 = byod.m125020a(bypb4.f167296f);
                                if (a3 == null) {
                                    a3 = byod.START_ACTIVITY;
                                }
                                if (a3.equals(byod.AUTO) || a3.equals(byod.START_ACTIVITY)) {
                                    TransactionReplyIntentOperation.m6533b(a2.f21184a.f167308b.mo73780k());
                                    return;
                                } else {
                                    this.f21206b.mo13097a(a2.f21184a, m15594a(context2, a2.f21184a, a2.f21185b, a2.f21186c), a2.f21188e, a2.f21189f, true);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (UnsupportedOperationException e) {
                            e = e;
                            f21205d.mo25417e("Error handling authzen event", e, new Object[i]);
                            m15595a(context2, bypc2, str2, bArr2, byoo.UNSUPPORTED_REQUEST);
                        }
                    } else {
                        bypc3 = bypc4;
                        c = 0;
                    }
                    sek sek = f21205d;
                    Object[] objArr = new Object[1];
                    objArr[c] = m15598b(bypc3.f167308b.mo73780k());
                    sek.mo25412b("Prompt for TxRequest (txId=%s) already shown, stopping...", objArr);
                    return;
                } else if (z) {
                    f21205d.mo25412b("Can't trigger TxRequest (txId=%s) - not found in the cache", m15598b(bypc4.f167308b.mo73780k()));
                    return;
                } else {
                    ikh ikh = f21204a;
                    ikh.f21193b.lock();
                    if (bypc4 == null) {
                        try {
                            ikh.f21195d.mo25418e("can't add transaction cache entry: null request to cache", new Object[0]);
                            try {
                                reentrantLock3 = ikh.f21193b;
                            } catch (IllegalStateException e2) {
                                e = e2;
                                i2 = 0;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            i2 = 0;
                            ikg2 = null;
                            try {
                                ikh.mo13088a();
                                ikh.f21195d.mo25417e("Transaction cache contents have been corrupted and cleared", e, new Object[i2]);
                                reentrantLock = ikh.f21193b;
                                reentrantLock.unlock();
                                ikg = ikg2;
                                if (ikg != null) {
                                }
                                bypb = bypc4.f167310d;
                                if (bypb == null) {
                                }
                                if ((bypb.f167291a & 1024) != 0) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                ikh.f21193b.unlock();
                                throw th;
                            }
                        } catch (Throwable th2) {
                        }
                    } else {
                        if (str3 == null) {
                            i3 = 0;
                        } else if (!str.isEmpty()) {
                            if (bArr3 == null) {
                                i2 = 0;
                            } else if (bArr3.length != 0) {
                                String a4 = ikh.m15587a(bypc);
                                sek sek2 = ikh.f21195d;
                                String valueOf = String.valueOf(a4);
                                sek2.mo25414c(valueOf.length() == 0 ? new String("adding transaction to cache: ") : "adding transaction to cache: ".concat(valueOf), new Object[0]);
                                if (a4 == null) {
                                    ikh.f21195d.mo25418e("Cache was asked to add an entry with a null key", new Object[0]);
                                    reentrantLock3 = ikh.f21193b;
                                } else {
                                    String a5 = ikh.f21194c.mo13139a(a4);
                                    if (a5 != null) {
                                        ikh.f21195d.mo25412b(a5.length() == 0 ? new String("Found transaction: ") : "Found transaction: ".concat(a5), new Object[0]);
                                        ikg2 = ikg.m15585a(a5);
                                    } else {
                                        ikg2 = null;
                                    }
                                    String str4 = a5;
                                    i2 = 0;
                                    try {
                                        String ikg3 = new ikg(bypc, str, bArr, elapsedRealtime2 + m15593a(bypc), elapsedRealtime2, currentTimeMillis, 40, null).toString();
                                        if (ikg3 == null) {
                                            throw new IllegalStateException(a4.length() == 0 ? new String("Error serializing new entry: ") : "Error serializing new entry: ".concat(a4));
                                        } else if (ikh.f21194c.mo13141a(a4, ikg3, str4)) {
                                            ikh.mo13089b();
                                            ikh.f21194c.mo13140a();
                                            try {
                                                reentrantLock = ikh.f21193b;
                                                reentrantLock.unlock();
                                                ikg = ikg2;
                                            } catch (IllegalStateException e4) {
                                                e = e4;
                                            }
                                            if (ikg != null) {
                                                TransactionReplyIntentOperation.m6533b(ikg.f21184a.f167308b.mo73780k());
                                            }
                                            bypb = bypc4.f167310d;
                                            if (bypb == null) {
                                                bypb = bypb.f167289p;
                                            }
                                            if ((bypb.f167291a & 1024) != 0) {
                                                Intent a6 = m15594a(context, bypc, str, bArr);
                                                bypb bypb5 = bypc4.f167310d;
                                                if (bypb5 == null) {
                                                    bypb5 = bypb.f167289p;
                                                }
                                                int a7 = byoj.m125028a(bypb5.f167293c);
                                                if (a7 == 0) {
                                                    a7 = 1;
                                                }
                                                int i5 = a7 - 1;
                                                if (i5 == 1) {
                                                    byod a8 = byod.m125020a(bypb5.f167296f);
                                                    if (a8 == null) {
                                                        a8 = byod.START_ACTIVITY;
                                                    }
                                                    if (a8 == byod.INVISIBLE) {
                                                        new bxvv(bypb5.f167300j, bypb.f167288k);
                                                        return;
                                                    }
                                                    m15597a(bypc4.f167308b.mo73780k(), 2, context2);
                                                    this.f21206b.mo13097a(bypc, a6, elapsedRealtime2, currentTimeMillis, false);
                                                    return;
                                                } else if (i5 != 100) {
                                                    sek sek3 = f21205d;
                                                    int a9 = byoj.m125028a(bypb5.f167293c);
                                                    if (a9 == 0) {
                                                        a9 = 1;
                                                    }
                                                    String valueOf2 = String.valueOf(byoj.m125029b(a9));
                                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                                                    sb.append("Unexpected tx request type: ");
                                                    sb.append(valueOf2);
                                                    sek3.mo25418e(sb.toString(), new Object[i2]);
                                                    return;
                                                } else {
                                                    return;
                                                }
                                            } else {
                                                iir iir2 = new iir(context2);
                                                iir2.f21069d = 17;
                                                iir2.mo13046a();
                                                throw new UnsupportedOperationException("The request proto for GENERIC_APPROVAL was malformed");
                                            }
                                        } else {
                                            ikh.mo13088a();
                                            throw new IllegalStateException("Transaction cache storage failed internally during add");
                                        }
                                    } catch (IOException e5) {
                                        e = e5;
                                        ikh.mo13088a();
                                        ikh.f21195d.mo25417e("Transaction cache contents have been corrupted and cleared", e, new Object[i2]);
                                        reentrantLock = ikh.f21193b;
                                        reentrantLock.unlock();
                                        ikg = ikg2;
                                        if (ikg != null) {
                                        }
                                        bypb = bypc4.f167310d;
                                        if (bypb == null) {
                                        }
                                        if ((bypb.f167291a & 1024) != 0) {
                                        }
                                    }
                                }
                            } else {
                                i2 = 0;
                            }
                            try {
                                ikh.f21195d.mo25418e("can't add transaction cache entry: null or empty key handle", new Object[i2]);
                                reentrantLock2 = ikh.f21193b;
                                reentrantLock2.unlock();
                                ikg = null;
                            } catch (IOException e6) {
                                e = e6;
                                ikg2 = null;
                                ikh.mo13088a();
                                ikh.f21195d.mo25417e("Transaction cache contents have been corrupted and cleared", e, new Object[i2]);
                                reentrantLock = ikh.f21193b;
                                reentrantLock.unlock();
                                ikg = ikg2;
                                if (ikg != null) {
                                }
                                bypb = bypc4.f167310d;
                                if (bypb == null) {
                                }
                                if ((bypb.f167291a & 1024) != 0) {
                                }
                            }
                            if (ikg != null) {
                            }
                            bypb = bypc4.f167310d;
                            if (bypb == null) {
                            }
                            if ((bypb.f167291a & 1024) != 0) {
                            }
                        } else {
                            i3 = 0;
                        }
                        ikh.f21195d.mo25418e("can't add transaction cache entry: null or empty account", new Object[i2]);
                        reentrantLock2 = ikh.f21193b;
                        reentrantLock2.unlock();
                        ikg = null;
                        if (ikg != null) {
                        }
                        bypb = bypc4.f167310d;
                        if (bypb == null) {
                        }
                        if ((bypb.f167291a & 1024) != 0) {
                        }
                    }
                    reentrantLock3.unlock();
                    ikg = null;
                    i2 = 0;
                    if (ikg != null) {
                    }
                    bypb = bypc4.f167310d;
                    if (bypb == null) {
                    }
                    if ((bypb.f167291a & 1024) != 0) {
                    }
                }
            } else if (i4 == 11) {
                context2.startService(SecondScreenIntentOperation.m6535a(bypc, str, bArr));
                return;
            } else if (i4 == 100) {
                f21205d.mo25414c("Handling TX_SYNC_PING", new Object[0]);
                m15595a(context2, bypc4, str3, bArr3, byoo.NO_RESPONSE_SELECTED);
                return;
            } else {
                iir iir3 = new iir(context2);
                iir3.f21069d = 18;
                iir3.mo13046a();
                String valueOf3 = String.valueOf(byoj.m125029b(a));
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 59);
                sb2.append("Unknown workflow. Transaction not handled for prompt type: ");
                sb2.append(valueOf3);
                throw new UnsupportedOperationException(sb2.toString());
            }
            try {
                f21205d.mo25417e("Cannot add transaction", e, new Object[i2]);
                ikg = null;
                if (ikg != null) {
                }
                bypb = bypc4.f167310d;
                if (bypb == null) {
                }
                if ((bypb.f167291a & 1024) != 0) {
                }
            } catch (UnsupportedOperationException e7) {
                e = e7;
                bArr2 = bArr;
                str2 = str3;
                bypc2 = bypc4;
                i = 0;
                f21205d.mo25417e("Error handling authzen event", e, new Object[i]);
                m15595a(context2, bypc2, str2, bArr2, byoo.UNSUPPORTED_REQUEST);
            }
        } catch (UnsupportedOperationException e8) {
            e = e8;
            bArr2 = bArr3;
            str2 = str3;
            bypc2 = bypc4;
            i = 0;
            f21205d.mo25417e("Error handling authzen event", e, new Object[i]);
            m15595a(context2, bypc2, str2, bArr2, byoo.UNSUPPORTED_REQUEST);
        }
    }

    /* renamed from: a */
    public final boolean mo13092a(ikg ikg, int i) {
        ikh ikh;
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        try {
            ikh ikh2 = f21204a;
            if (ikg != null) {
                ikh.f21193b.lock();
                try {
                    ikh2.mo13089b();
                    String a = ikh.m15588a(ikg);
                    String a2 = ikh.f21194c.mo13139a(a);
                    if (a2 == null) {
                        ikh.f21195d.mo25416d("Could not update transaction state - not found", new Object[0]);
                        ikh.f21194c.mo13140a();
                        reentrantLock2 = ikh.f21193b;
                    } else {
                        ikg a3 = ikg.m15585a(a2);
                        if (a3 == null) {
                            sek sek = ikh.f21195d;
                            String valueOf = String.valueOf(a);
                            sek.mo25418e(valueOf.length() == 0 ? new String("Transaction entry was found to be corrupted during cache.updateTransactionState : ") : "Transaction entry was found to be corrupted during cache.updateTransactionState : ".concat(valueOf), new Object[0]);
                            ikh.f21194c.mo13140a();
                            reentrantLock2 = ikh.f21193b;
                        } else if (ikm.m15619a(a3.f21191h, i)) {
                            ikh = ikh2;
                            try {
                                if (ikh.f21194c.mo13141a(a, new ikg(a3.f21184a, a3.f21185b, a3.f21186c, a3.f21187d, a3.f21188e, a3.f21189f, i, a3.f21190g).toString(), a2)) {
                                    sek sek2 = ikh.f21195d;
                                    String a4 = ikm.m15618a(i);
                                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 39 + a4.length());
                                    sb.append("Transaction entry ");
                                    sb.append(a);
                                    sb.append(" state is updated to ");
                                    sb.append(a4);
                                    sek2.mo25414c(sb.toString(), new Object[0]);
                                    ikh.f21194c.mo13140a();
                                    ikh.f21193b.unlock();
                                    return true;
                                }
                                ikh.mo13088a();
                                ikh.f21195d.mo25418e("Tx cache storage failed internally in updateTransactionState", new Object[0]);
                                reentrantLock = ikh.f21193b;
                                reentrantLock.unlock();
                            } catch (IOException e) {
                                e = e;
                                ikh.f21195d.mo25417e("Internal transaction cache error", e, new Object[0]);
                                ikh.mo13088a();
                                reentrantLock = ikh.f21193b;
                                reentrantLock.unlock();
                                return false;
                            }
                        } else {
                            ikh = ikh2;
                            sek sek3 = ikh.f21195d;
                            String a5 = ikm.m15618a(a3.f21191h);
                            String a6 = ikm.m15618a(i);
                            StringBuilder sb2 = new StringBuilder(a5.length() + 83 + a6.length() + String.valueOf(a).length());
                            sb2.append("updateTransactionState found incompatible state update from to ");
                            sb2.append(a5);
                            sb2.append(" to ");
                            sb2.append(a6);
                            sb2.append(" for transaction");
                            sb2.append(a);
                            sek3.mo25416d(sb2.toString(), new Object[0]);
                            ikh.f21194c.mo13140a();
                            reentrantLock = ikh.f21193b;
                            reentrantLock.unlock();
                        }
                    }
                    reentrantLock2.unlock();
                    return false;
                } catch (IOException e2) {
                    e = e2;
                    ikh = ikh2;
                    ikh.f21195d.mo25417e("Internal transaction cache error", e, new Object[0]);
                    ikh.mo13088a();
                    reentrantLock = ikh.f21193b;
                    reentrantLock.unlock();
                    return false;
                }
            }
            return false;
        } catch (IllegalStateException e3) {
            f21205d.mo25417e("Cannot update transaction state", e3, new Object[0]);
            return false;
        } catch (Throwable th) {
            ikh.f21193b.unlock();
            throw th;
        }
    }
}
