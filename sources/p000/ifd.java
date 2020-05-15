package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.auth.authzen.transaction.workflows.BasicConfirmationChimeraWorkflow;
import com.google.android.gms.auth.authzen.transaction.workflows.DoubleConfirmationChimeraWorkflow;
import com.google.android.gms.auth.authzen.transaction.workflows.PinConfirmationChimeraWorkflow;
import com.google.android.gms.auth.authzen.transaction.workflows.SimpleNotificationChimeraWorkflow;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ifd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ifd {

    /* renamed from: a */
    public static final Logger f20845a = new Logger("AuthZenEventHandler");

    /* renamed from: b */
    private static final Lock f20846b = new ReentrantLock();

    /* renamed from: c */
    private final ihe f20847c;

    /* renamed from: d */
    private final ife f20848d;

    /* renamed from: e */
    private final ifg f20849e;

    public ifd(Context context, ikj ikj) {
        ihe a = ihe.m15438a(context);
        ife ife = new ife(context, ikj);
        iff iff = new iff();
        ifg ifg = new ifg(context, ikj);
        Logger Logger = ikn.f21218a;
        sdo.m34959a(ikj);
        sdo.m34959a(a);
        this.f20847c = a;
        sdo.m34959a(ife);
        this.f20848d = ife;
        sdo.m34959a(iff);
        sdo.m34959a(ifg);
        this.f20849e = ifg;
    }

    /* renamed from: a */
    private static final int m15359a(String str, boolean z, boolean z2) {
        if ("android.intent.action.BOOT_COMPLETED".equals(str) && z2) {
            return 1;
        }
        if (z) {
            return 12;
        }
        if ("com.google.android.gms.auth.authzen.CHECK_REGISTRATION".equals(str)) {
            return 4;
        }
        if ("com.google.android.gms.auth.authzen.REGISTER_NOW".equals(str)) {
            return 13;
        }
        if ("com.google.android.gms.gcm.REGISTERED".equals(str)) {
            return 11;
        }
        f20845a.mo25416d("unknown action: %s", str);
        return 0;
    }

    /* renamed from: a */
    private static long m15360a() {
        return ((long) (new Random().nextDouble() * 4.32E7d)) + 64800000;
    }

    /* renamed from: a */
    private static void m15361a(Context context, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Intent intent = new Intent("com.google.android.gms.auth.authzen.CHECK_REGISTRATION");
        imp.m15726a();
        new skc(context).mo25675a("AuthZenEventHandler", 2, elapsedRealtime + j, PendingIntent.getBroadcast(context, 0, intent, 0), "com.google.android.gms");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r2 == false) goto L_0x005c;
     */
    /* renamed from: a */
    public final void mo12958a(Context context, Intent intent) {
        Intent intent2;
        Logger Logger = f20845a;
        String valueOf = String.valueOf(intent.getAction());
        Logger.mo25414c(valueOf.length() == 0 ? new String("Handling event: ") : "Handling event: ".concat(valueOf), new Object[0]);
        f20846b.lock();
        int intExtra = intent.getIntExtra("flags", 0);
        boolean z = (intExtra & 2) > 0;
        boolean z2 = (intExtra & 12) > 0;
        try {
            String action = intent.getAction();
            if (intent.hasExtra("P")) {
                this.f20848d.mo12959a(intent);
            } else if (!intent.hasExtra("syncPayload")) {
                if (!"android.intent.action.BOOT_COMPLETED".equals(action)) {
                }
                if ("com.google.android.gms.auth.authzen.CHECK_REGISTRATION".equals(action)) {
                    this.f20847c.mo13007a(0, m15359a(action, z2, z));
                    if ("android.intent.action.BOOT_COMPLETED".equals(action)) {
                        if (z) {
                            ikj.f21204a.mo13088a();
                        }
                    }
                } else if ("com.google.android.gms.auth.authzen.REGISTER_NOW".equals(action) || "com.google.android.gms.gcm.REGISTERED".equals(action)) {
                    this.f20847c.mo13007a(100, m15359a(action, z2, z));
                } else if ("AUTHZEN_PROXIMITY_CHALLENGE_EXPIRED".equals(action)) {
                    String stringExtra = intent.getStringExtra("account");
                    byte[] byteArrayExtra = intent.getByteArrayExtra("encryption_key_handle");
                    bypc bypc = (bypc) GeneratedMessageLite.m124014a(bypc.f167305k, intent.getByteArrayExtra("tx_request"));
                    bypb bypb = bypc.f167310d;
                    if (bypb == null) {
                        bypb = bypb.f167289p;
                    }
                    bxvv bxvv = new bxvv(bypb.f167300j, bypb.f167288k);
                    if (!bxvv.isEmpty() && bxvv.contains(byox.PROXIMITY_TRIGGER)) {
                        ikj.m15596a(context, bypc, stringExtra, byteArrayExtra, bypf.TRIGGER_FAILED, byox.PROXIMITY_TRIGGER);
                    }
                } else if ("AUTHZEN_NOTIFICATION_EXPIRED".equals(action)) {
                    bypc a = ijt.m15553a(intent);
                    ikj.m15597a(a.f167308b.getKey(), 11, context);
                    ikl.m15607a(context).mo13098a(ikl.m15608a(a));
                    iff.m15364a(context, intent, byoo.EXPIRED);
                } else if ("AUTHZEN_NOTIFICATION_DISMISSED".equals(action)) {
                    ikj.m15597a(ijt.m15553a(intent).f167308b.getKey(), 12, context);
                    iff.m15364a(context, intent, byoo.DISMISSED);
                } else if (!"com.google.android.gms.auth.authzen.TEST_UI".equals(action)) {
                    Logger logger2 = f20845a;
                    String valueOf2 = String.valueOf(action);
                    logger2.mo25418e(valueOf2.length() == 0 ? new String("unknown action: ") : "unknown action: ".concat(valueOf2), new Object[0]);
                } else if (((Boolean) igt.f20960j.mo58455c()).booleanValue()) {
                    String stringExtra2 = intent.getStringExtra("account");
                    try {
                        bypc bypc2 = (bypc) GeneratedMessageLite.m124014a(bypc.f167305k, intent.getByteArrayExtra("tx_request"));
                        bypb bypb2 = bypc2.f167310d;
                        if (bypb2 == null) {
                            bypb2 = bypb.f167289p;
                        }
                        int a2 = byoj.m125028a(bypb2.f167293c);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        if (a2 - 1 != 1) {
                            Logger logger3 = ikn.f21218a;
                            String valueOf3 = String.valueOf(byoj.m125029b(a2));
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 21);
                            sb.append("Unknown prompt type: ");
                            sb.append(valueOf3);
                            logger3.mo25416d(sb.toString(), new Object[0]);
                        } else {
                            bypb bypb3 = bypc2.f167310d;
                            if (bypb3 == null) {
                                bypb3 = bypb.f167289p;
                            }
                            byod a3 = byod.m125020a(bypb3.f167296f);
                            if (a3 == null) {
                                a3 = byod.START_ACTIVITY;
                            }
                            if (a3 == byod.GENERIC_NOTIFICATION) {
                                bypb bypb4 = bypc2.f167310d;
                                if (bypb4 == null) {
                                    bypb4 = bypb.f167289p;
                                }
                                byoa byoa = bypb4.f167301l;
                                if (byoa == null) {
                                    byoa = byoa.f167173e;
                                }
                                if (byoa.f167176b.size() == 1) {
                                    intent2 = SimpleNotificationChimeraWorkflow.m6544b(bypc2, stringExtra2, null);
                                    ikl.m15607a(context).mo13097a(bypc2, intent2, SystemClock.elapsedRealtime(), System.currentTimeMillis(), false);
                                }
                            }
                            bypb bypb5 = bypc2.f167310d;
                            if (bypb5 == null) {
                                bypb5 = bypb.f167289p;
                            }
                            byoa byoa2 = bypb5.f167301l;
                            if (byoa2 == null) {
                                byoa2 = byoa.f167173e;
                            }
                            if (byoa2.f167176b.size() == 2) {
                                bypb bypb6 = bypc2.f167310d;
                                if (bypb6 == null) {
                                    bypb6 = bypb.f167289p;
                                }
                                if ((bypb6.f167291a & 1024) != 0) {
                                    bypb bypb7 = bypc2.f167310d;
                                    if (bypb7 == null) {
                                        bypb7 = bypb.f167289p;
                                    }
                                    byoa byoa3 = bypb7.f167301l;
                                    if (byoa3 == null) {
                                        byoa3 = byoa.f167173e;
                                    }
                                    int a4 = byou.m125042a(((byor) byoa3.f167176b.get(0)).f167237b);
                                    if (a4 == 0) {
                                        a4 = 1;
                                    }
                                    if (a4 != 1) {
                                        intent2 = a4 != 2 ? DoubleConfirmationChimeraWorkflow.m6540b(bypc2, stringExtra2, null) : PinConfirmationChimeraWorkflow.m6542b(bypc2, stringExtra2, null);
                                    } else {
                                        intent2 = BasicConfirmationChimeraWorkflow.m6538b(bypc2, stringExtra2, null);
                                    }
                                }
                            } else {
                                intent2 = null;
                            }
                            ikl.m15607a(context).mo13097a(bypc2, intent2, SystemClock.elapsedRealtime(), System.currentTimeMillis(), false);
                        }
                    } catch (bxwf e) {
                        ikn.f21218a.mo25415d("Invalid tx request", e, new Object[0]);
                    }
                }
            } else {
                this.f20849e.mo12960a(context, intent);
            }
        } catch (bxwf e2) {
            ikj.f21205d.mo25417e("Unable to parse TxRequest from proximityChallengeTimeout intent", e2, new Object[0]);
            iir iir = new iir(context);
            iir.f21069d = 15;
            iir.mo13046a();
        } catch (Throwable th) {
            m15361a(context, m15360a());
            f20846b.unlock();
            throw th;
        }
        m15361a(context, m15360a());
        f20846b.unlock();
    }
}
