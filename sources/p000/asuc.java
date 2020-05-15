package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Process;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: asuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asuc implements asue {

    /* renamed from: c */
    private static final srn f89740c = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: d */
    private static asuc f89741d;

    /* renamed from: a */
    public final ScheduledExecutorService f89742a;

    /* renamed from: b */
    public volatile long f89743b = 0;

    /* renamed from: e */
    private final astv f89744e;

    /* renamed from: f */
    private astt f89745f;

    /* renamed from: g */
    private boolean f89746g;

    public asuc(ScheduledExecutorService scheduledExecutorService, astv astv) {
        this.f89742a = scheduledExecutorService;
        this.f89744e = astv;
    }

    public static synchronized asuc getInstance() {
        asuc asuc;
        synchronized (asuc.class) {
            int i = spn.f44932a;
            if (f89741d == null) {
                f89741d = new asuc(snp.m35703a(1, 9), new astv());
                bnsl bnsl = (bnsl) f89740c.mo68390d();
                bnsl.mo68432a("asuc", "getInstance", 62, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("getInstance: new instance created");
            }
            asuc = f89741d;
        }
        return asuc;
    }

    /* renamed from: a */
    public final synchronized void mo49499a(Context context, int i, long j) {
        astt astt = this.f89745f;
        if (astt != null) {
            try {
                if (astt.mo49476a()) {
                    if (!this.f89746g) {
                        bnsl a = f89740c.mo26019b(aske.m74275a());
                        a.mo68432a("asuc", "a", 169, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        a.mo68405a("onDeactivate: close and reuse");
                        this.f89745f = this.f89745f.mo49477b(context, i, j);
                        this.f89746g = false;
                    }
                }
                bnsl a2 = f89740c.mo26019b(aske.m74275a());
                a2.mo68432a("asuc", "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a2.mo68405a("onDeactivate: close and create");
                this.f89745f.mo49474a(context, i, j);
                this.f89745f = this.f89744e.mo49489a(context);
                this.f89746g = false;
            } catch (RuntimeException e) {
                bnsl bnsl = (bnsl) f89740c.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("asuc", "a", 178, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("onDeactivate Error");
                this.f89745f = null;
                this.f89746g = false;
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo49504b(Context context) {
        if (this.f89745f == null) {
            mo49507c(context, "cacheSessionIfAbsent");
        }
    }

    /* renamed from: c */
    public final synchronized void mo49507c(Context context, String str) {
        bnsl a = f89740c.mo26019b(aske.m74275a());
        a.mo68432a("asuc", "c", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68420a("refreshCachedSession: %s", str);
        try {
            astt astt = this.f89745f;
            if (astt != null) {
                if (astt.mo49479b()) {
                    this.f89746g = true;
                    return;
                }
            }
            astt astt2 = this.f89745f;
            if (astt2 != null) {
                astt2.mo49474a(context, 0, 0);
            }
            this.f89745f = this.f89744e.mo49489a(context);
            bnsl a2 = f89740c.mo26019b(aske.m74275a());
            a2.mo68432a("asuc", "c", 242, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a2.mo68405a("refreshCachedSession succeeded");
        } catch (RuntimeException e) {
            bnsl bnsl = (bnsl) f89740c.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asuc", "c", 244, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("refreshSession error");
            this.f89745f = null;
            this.f89746g = false;
        }
    }

    /* renamed from: b */
    public final void mo49505b(Context context, String str) {
        if (cgwn.m147265o()) {
            astb.f89621b = 0;
            bnsl a = astb.f89620a.mo26019b(aske.m74275a());
            a.mo68432a("astb", "b", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a.mo68405a("notifyPaymentComplete");
        } else {
            astb.m74739b(0);
        }
        mo49500a(context, str);
    }

    /* renamed from: a */
    public final void mo49500a(Context context, String str) {
        this.f89742a.execute(new astx(this, context.getApplicationContext(), str));
    }

    /* renamed from: a */
    public final void mo49501a(Context context, String str, long j, String str2) {
        this.f89742a.execute(new asty(this, context.getApplicationContext(), str, j, str2));
    }

    /* renamed from: b */
    public final synchronized void mo49506b(Context context, String str, long j, String str2) {
        bnsl a = f89740c.mo26019b(aske.m74275a());
        a.mo68432a("asuc", "b", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68420a("refreshCachedSession: %s", str2);
        astt astt = this.f89745f;
        if (astt != null && astt.mo49479b()) {
            if (!Objects.equals(this.f89745f.mo49481d(), str)) {
                this.f89746g = true;
                return;
            }
        }
        try {
            astt astt2 = this.f89745f;
            if (astt2 == null || !Objects.equals(astt2.mo49481d(), str)) {
                astt astt3 = this.f89745f;
                if (astt3 != null) {
                    astt3.mo49474a(context, 0, 0);
                }
                astt a2 = this.f89744e.mo49489a(context);
                this.f89745f = a2;
                if (a2 != null) {
                    a2.mo49478b(j);
                }
                bnsl a3 = f89740c.mo26019b(aske.m74275a());
                a3.mo68432a("asuc", "b", (int) BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a3.mo68405a("refreshCachedSession succeeded");
                return;
            }
            bnsl a4 = f89740c.mo26019b(aske.m74275a());
            a4.mo68432a("asuc", "b", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a4.mo68405a("refreshCachedSession: no change");
            this.f89745f.mo49478b(j);
        } catch (RuntimeException e) {
            bnsl bnsl = (bnsl) f89740c.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asuc", "b", (int) BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("refreshSession error");
            this.f89745f = null;
            this.f89746g = false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asiv.a(java.lang.String, askf, boolean):boolean
     arg types: [java.lang.String, askf, int]
     candidates:
      asiv.a(askf, java.lang.String, java.lang.String):void
      asiv.a(java.lang.String, boolean, askf):void
      asiv.a(java.lang.String, askf, boolean):boolean */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x034b  */
    /* renamed from: a */
    public final synchronized void mo49502a(Context context, byte[] bArr, long j, asud asud) {
        asub asub;
        astt astt;
        String str;
        String str2;
        astt astt2;
        boolean z;
        Context context2 = context;
        long j2 = j;
        synchronized (this) {
            try {
                if (this.f89743b <= j2) {
                    th = new asub(this, j2, asud);
                    try {
                        Process.setThreadPriority(-8);
                        bmza b = bmza.m108658b();
                        astt astt3 = this.f89745f;
                        if (astt3 != null) {
                            if (!astt3.mo49479b()) {
                                astb astb = new astb(context2, j2);
                                if (astb.f89627d || astb.f89628e || !astb.f89629f || astb.f89630g) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                bnsl a = astb.f89620a.mo26019b(aske.m74275a());
                                a.mo68432a("astb", "a", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                a.mo68420a("isPaymentPrevented: %b", Boolean.valueOf(z));
                                if (!z) {
                                    astt astt4 = this.f89745f;
                                    if (astt4.mo49482e().f89458v) {
                                        asqq f = astt4.mo49483f();
                                        if (f != null && !f.mo49382a()) {
                                        }
                                    }
                                    if (!this.f89745f.mo49480c()) {
                                        this.f89745f.mo49473a(j2);
                                        bnsl a2 = f89740c.mo26019b(aske.m74275a());
                                        a2.mo68432a("asuc", "a", 284, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        a2.mo68420a("processCommandApdu: session opened in %s", b);
                                    }
                                }
                                rpr b2 = rpr.m34216b();
                                if (!asjk.m74227a()) {
                                    b2.startService(IntentOperation.getStartIntent(b2, "com.google.android.gms.tapandpay.selfdestruct.SelfDestructIntentOperation", "com.google.android.gms.tapandpay.selfdestruct.SELF_DESTRUCT_ACTION"));
                                }
                                this.f89745f.mo49474a(context2, 0, j2);
                                this.f89745f = null;
                                bnsl a3 = f89740c.mo26019b(aske.m74275a());
                                a3.mo68432a("asuc", "a", 280, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                a3.mo68420a("processCommandApdu: closed invalid session in %s", b);
                            }
                        }
                        if (this.f89745f == null) {
                            astv astv = this.f89744e;
                            try {
                                askf b3 = askg.m74283b(context2, null);
                                asqw a4 = astv.mo49488a(b3);
                                try {
                                    astb astb2 = new astb(context2, j2);
                                    if (astb2.f89627d) {
                                        bnsl a5 = astv.f89717a.mo26019b(aske.m74275a());
                                        a5.mo68432a("astv", "a", 56, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        a5.mo68405a("createFastCheckedSession: screen is off.");
                                        a4.f89454r = 10;
                                        astt2 = astv.m74818a(a4, new asuf(bqcn.m112585b(cgxr.m147493f())));
                                        str2 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                                        str = "a";
                                    } else if (b3 == null) {
                                        bnsl a6 = astv.f89717a.mo26019b(aske.m74275a());
                                        a6.mo68432a("astv", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        a6.mo68405a("create: device setup required (no payment card)");
                                        a4.f89454r = 22;
                                        astt2 = astv.m74818a(a4, new assn());
                                        str2 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                                        str = "a";
                                    } else if (!astb2.f89629f) {
                                        bnsl a7 = astv.f89717a.mo26019b(aske.m74275a());
                                        a7.mo68432a("astv", "a", 69, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        a7.mo68405a("createFastCheckedSession: device password missing.");
                                        a4.f89454r = 22;
                                        astt2 = astv.m74818a(a4, new assn());
                                        str2 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                                        str = "a";
                                    } else if (astb2.f89628e) {
                                        bnsl a8 = astv.f89717a.mo26019b(aske.m74275a());
                                        a8.mo68432a("astv", "a", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        a8.mo68405a("createFastCheckedSession: transactions too close.");
                                        a4.f89454r = 17;
                                        astt2 = astv.m74818a(a4, new asuf(bqcn.m112585b(cgxr.m147493f())));
                                        str2 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                                        str = "a";
                                    } else if (astb2.f89630g) {
                                        bnsl a9 = astv.f89717a.mo26019b(aske.m74275a());
                                        a9.mo68432a("astv", "a", 88, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        a9.mo68405a("createFastCheckedSession: payment cards blocked");
                                        a4.f89454r = 37;
                                        astt2 = astv.m74818a(a4, new asuf(27266));
                                        str2 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                                        str = "a";
                                    } else {
                                        ateb b4 = astv.m74823b(b3);
                                        CardInfo cardInfo = b4.f90168a;
                                        if (cardInfo == null) {
                                            bnsl a10 = astv.f89717a.mo26019b(aske.m74275a());
                                            a10.mo68432a("astv", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            a10.mo68405a("create: device setup required (no payment card)");
                                            a4.f89454r = 23;
                                            astt2 = astv.m74818a(a4, new assn());
                                            str2 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                                            str = "a";
                                        } else if (asiv.m74191b(b3)) {
                                            astv.m74822a(a4, cardInfo);
                                            str2 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                                            str = "a";
                                            a4.f89426C = b4.f90169b;
                                            bnsl a11 = astv.f89717a.mo26019b(aske.m74275a());
                                            a11.mo68432a("astv", "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            a11.mo68420a("Creating payment applet for card: %s", cardInfo.f108343d);
                                            try {
                                                atbu c = astv.mo49492c(b3);
                                                c.mo49790a();
                                                asqs a12 = c.mo49788a(cardInfo, a4, true);
                                                if (a12 == null) {
                                                    bnsl a13 = astv.f89717a.mo26019b(aske.m74275a());
                                                    a13.mo68432a("astv", "a", 138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    a13.mo68405a("create: no payment applet (no credentials)");
                                                    a4.f89454r = 1;
                                                    atbq.m75407a(context);
                                                    astt2 = astv.m74818a(a4, new assn());
                                                } else {
                                                    astt2 = astv.mo49491a(a4, cardInfo, a12, b3);
                                                }
                                            } catch (aths e) {
                                                if (!asiv.m74189a("SELECT fails_attestation from Wallets WHERE account_id = ? AND environment = ?;", b3, false)) {
                                                    bnsl a14 = astv.f89717a.mo26019b(aske.m74275a());
                                                    a14.mo68432a("astv", "a", 125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    a14.mo68405a("create: no storage key");
                                                    a4.f89454r = 7;
                                                    athr.m75911a(context);
                                                } else {
                                                    bnsl a15 = astv.f89717a.mo26019b(aske.m74275a());
                                                    a15.mo68432a("astv", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    a15.mo68405a("create: attestation failure");
                                                    a4.f89454r = 9;
                                                }
                                                astt2 = astv.m74818a(a4, new assn());
                                            } catch (atcu e2) {
                                                bnsl a16 = astv.f89717a.mo26019b(aske.m74275a());
                                                a16.mo68432a("astv", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                a16.mo68405a("create: velocity check exception (device locked)");
                                                a4.f89454r = 21;
                                                astt2 = astv.m74818a(a4, new asuf(bqcn.m112585b(cgxr.f187985a.mo6606a().mo84690b())));
                                            }
                                        } else {
                                            str2 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                                            str = "a";
                                            bnsl a17 = astv.f89717a.mo26019b(aske.m74275a());
                                            a17.mo68432a("astv", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            a17.mo68405a("create: User's GSuites domain has payments turned off");
                                            a4.f89454r = 16;
                                            astt2 = astv.m74818a(a4, new assn());
                                        }
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    throw new asks(e);
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                throw new asks(e);
                            }
                            try {
                                this.f89745f = astt2;
                                astt2.mo49473a(j2);
                                bnsl a18 = f89740c.mo26019b(aske.m74275a());
                                a18.mo68432a("asuc", str, 294, str2);
                                a18.mo68420a("processCommandApdu: session created in %s", b);
                            } catch (asks | RuntimeException e5) {
                                asti.m74760a(bArr);
                                astt = this.f89745f;
                                if (astt != null) {
                                }
                                this.f89745f = null;
                                this.f89746g = false;
                                asub.sendResponseApdu(astf.m74754a(27266).mo49462b());
                            }
                        } else {
                            asub = th;
                        }
                        this.f89745f.mo49475a(context, bArr, j, asub);
                    } catch (asks | RuntimeException e6) {
                        asub = th;
                        asti.m74760a(bArr);
                        astt = this.f89745f;
                        if (astt != null) {
                            try {
                                astt.mo49474a(context, 0, j2);
                            } catch (RuntimeException e7) {
                            }
                        }
                        this.f89745f = null;
                        this.f89746g = false;
                        asub.sendResponseApdu(astf.m74754a(27266).mo49462b());
                    }
                }
            } finally {
                asub asub2 = th;
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo49503a(Context context) {
        astt astt = this.f89745f;
        if (astt != null) {
            if (astt.mo49479b()) {
                return false;
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (cgwn.m147265o()) {
            astb.m74744e(elapsedRealtime);
        } else {
            astb.m74739b(5000 + elapsedRealtime);
        }
        astt astt2 = this.f89745f;
        if (astt2 != null) {
            astt2.mo49474a(context, 0, elapsedRealtime);
            this.f89745f = null;
        }
        return true;
    }
}
