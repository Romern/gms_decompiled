package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.auth.authzen.transaction.BaseTransactionActivity$4;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import java.util.concurrent.TimeUnit;

/* renamed from: ijt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ijt extends FragmentActivity implements iko {

    /* renamed from: r */
    public static final sek f21129r = new sek("BaseTransactionActivity");

    /* renamed from: a */
    private ijs f21130a;

    /* renamed from: b */
    private final ikl f21131b;

    /* renamed from: c */
    private rjx f21132c;

    /* renamed from: d */
    protected String f21133d;

    /* renamed from: e */
    public bypc f21134e;

    /* renamed from: f */
    protected bypd f21135f;

    /* renamed from: g */
    public long f21136g;

    /* renamed from: h */
    protected long f21137h;

    /* renamed from: i */
    protected long f21138i;

    /* renamed from: j */
    protected long f21139j;

    /* renamed from: k */
    public String f21140k;

    /* renamed from: l */
    protected BroadcastReceiver f21141l;

    /* renamed from: m */
    public boolean f21142m;

    /* renamed from: n */
    protected boolean f21143n = false;

    /* renamed from: o */
    public rkb f21144o;

    /* renamed from: p */
    public ijr f21145p;

    /* renamed from: q */
    public int f21146q;

    public ijt() {
        new ikj();
        this.f21131b = ikl.m15607a(this);
    }

    /* renamed from: a */
    public static bypc m15553a(Intent intent) {
        try {
            return (bypc) bxvk.m124014a(bypc.f167305k, intent.getByteArrayExtra("tx_request"));
        } catch (bxwf e) {
            throw new RuntimeException("Unable to parse TxRequest", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13063a(Bundle bundle);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ijt.a(int, boolean, java.lang.Integer):void
     arg types: [int, int, int]
     candidates:
      ijt.a(com.google.android.gms.wearable.internal.MessageEventParcelable, bypc, ijq):void
      ijt.a(int, boolean, java.lang.Integer):void */
    public final void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f21133d = intent.getStringExtra("account");
        this.f21134e = m15553a(intent);
        if (cceo.m129401b()) {
            this.f21130a = new ijs(this.f21134e, new ijn(this));
        } else {
            this.f21145p = new ijr(this.f21134e, new ijo(this));
        }
        ikj.m15597a(this.f21134e.f167308b.mo73780k(), 5, this);
        long j = 0;
        if (bundle2 == null) {
            this.f21138i = SystemClock.elapsedRealtime();
            this.f21139j = System.currentTimeMillis();
            this.f21136g = getIntent().getLongExtra("creation_elapsed_time", this.f21138i);
            this.f21137h = getIntent().getLongExtra("creation_wall_time", this.f21139j);
            this.f21142m = false;
            this.f21146q = 40;
            this.f21135f = mo7589a();
            if (getIntent().getLongExtra("proximity_verified_time", 0) != 0) {
                mo13072a(602, false, (Integer) 0);
            }
        } else {
            this.f21143n = bundle2.getBoolean("alarm_set");
            this.f21138i = bundle2.getLong("activity_start_elapsed_time");
            this.f21139j = bundle2.getLong("activity_start_wall_time");
            this.f21136g = bundle2.getLong("creation_elapsed_time");
            this.f21137h = bundle2.getLong("creation_wall_time");
            this.f21142m = bundle2.getBoolean("reply_sent");
            this.f21146q = ikm.m15620b(bundle2.getInt("transaction_state"));
            try {
                this.f21135f = (bypd) bxvk.m124014a(bypd.f167317i, bundle2.getByteArray("tx_response"));
            } catch (bxwf e) {
                f21129r.mo25417e("Failed to parse TxResponse", e, new Object[0]);
                this.f21135f = mo7589a();
            }
        }
        if (!this.f21143n) {
            ikl ikl = this.f21131b;
            bypc bypc = this.f21134e;
            long longExtra = getIntent().getLongExtra("creation_elapsed_time", SystemClock.elapsedRealtime());
            long a = ikj.m15593a(bypc);
            if (a >= 0) {
                j = a;
            }
            PendingIntent a2 = ikl.mo13094a(longExtra);
            ikj.m15597a(bypc.f167308b.mo73780k(), 6, ikl.f21216a);
            new skc(ikl.f21216a).mo25675a("AuthzenActivityAlarm", 2, longExtra + j, a2, "com.google.android.gms");
            ikl.f21214b.mo25414c("Scheduling activity-based prompt (txId=%s) to be killed in %s seconds.", ikj.m15598b(bypc.f167308b.mo73780k()), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j)));
            bypb bypb = this.f21134e.f167310d;
            if (bypb == null) {
                bypb = bypb.f167289p;
            }
            byod a3 = byod.m125020a(bypb.f167296f);
            if (a3 == null) {
                a3 = byod.START_ACTIVITY;
            }
            if (a3 != byod.AUTO) {
                this.f21131b.mo13095a(getIntent());
            }
        }
        this.f21140k = ikl.m15608a(this.f21134e);
        this.f21141l = new BaseTransactionActivity$4(this, "auth_authzen");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("AUTHZEN_CLOSE_ACTIVITY");
        intentFilter.addAction("AUTHZEN_REPLACE_ACTIVITY");
        intentFilter.addAction("AUTHZEN_UPDATE_ACTIVITY");
        registerReceiver(this.f21141l, intentFilter, "com.google.android.gms.permission.INTERNAL_BROADCAST", null);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("AUTHZEN_ACTIVITY_EXPIRED");
        long j2 = this.f21136g;
        StringBuilder sb = new StringBuilder(42);
        sb.append("creation_elapsed_time:");
        sb.append(j2);
        intentFilter2.addCategory(sb.toString());
        registerReceiver(this.f21141l, intentFilter2, "com.google.android.gms.permission.INTERNAL_BROADCAST", null);
        if (igt.m15429a().booleanValue()) {
            setTheme(C0126R.style.AuthzenMaterialTheme);
        }
        mo13063a(bundle);
        if (cceo.m129401b()) {
            rjx b = axoz.m82854b(this);
            this.f21132c = b;
            b.mo24723a(this.f21130a, new IntentFilter[]{axta.m83152a("com.google.android.gms.wearable.MESSAGE_RECEIVED")});
        } else {
            rjy rjy = new rjy(this);
            rjy.mo24779a(axoz.f96226a);
            rkb b2 = rjy.mo24784b();
            this.f21144o = b2;
            b2.mo24790a((rjz) new ijp(this));
            this.f21144o.mo24801e();
        }
        f21129r.mo25414c("Created activity (%s) for user %s (txId=%s...)", getClass().getSimpleName(), sek.m35081a(this.f21133d), ikj.m15598b(this.f21134e.f167308b.mo73780k()));
        startService(TransactionReplyIntentOperation.m6532a(this.f21134e.f167308b.mo73780k()));
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.f21142m) {
            mo13073a(byoo.NO_RESPONSE_SELECTED);
        }
        ikl ikl = this.f21131b;
        new skc(ikl.f21216a).mo25668a(ikl.mo13094a(getIntent().getLongExtra("creation_elapsed_time", 0)));
        BroadcastReceiver broadcastReceiver = this.f21141l;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        if (!cceo.m129401b()) {
            ijr ijr = this.f21145p;
            ijr.f21125a = null;
            rjo rjo = axoz.f96226a;
            rkb rkb = this.f21144o;
            rkb.mo24787a((rle) new axsd(rkb, ijr));
            rkb rkb2 = this.f21144o;
            if (rkb2 != null) {
                rkb2.mo24803g();
                return;
            }
            return;
        }
        ijs ijs = this.f21130a;
        ijs.f21127a = null;
        rjx rjx = this.f21132c;
        if (rjx != null) {
            rjx.mo24721a((axou) ijs);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("activity_start_elapsed_time", this.f21138i);
        bundle.putLong("activity_start_wall_time", this.f21139j);
        bundle.putLong("creation_elapsed_time", this.f21136g);
        bundle.putLong("creation_wall_time", this.f21137h);
        bundle.putBoolean("alarm_set", this.f21143n);
        bundle.putBoolean("reply_sent", this.f21142m);
        int i = this.f21146q;
        ikm.m15621c(i);
        bundle.putInt("transaction_state", i);
        bundle.putByteArray("tx_response", this.f21135f.mo73642k());
    }

    /* renamed from: a */
    private final bypd mo7589a() {
        bxvd da = bypd.f167317i.mo74144da();
        long j = this.f21139j;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bypd bypd = (bypd) da.f164949b;
        int i = bypd.f167319a | 2;
        bypd.f167319a = i;
        bypd.f167321c = j;
        long j2 = this.f21137h;
        bypd.f167319a = i | 8;
        bypd.f167324f = j2;
        return (bypd) da.mo74062i();
    }

    /* renamed from: a */
    static void m15555a(MessageEventParcelable messageEventParcelable, bypc bypc, ijq ijq) {
        f21129r.mo25414c("onMessageReceived : %s", messageEventParcelable);
        if ("/send-tx-response".equals(messageEventParcelable.f110947b)) {
            axos a = axos.m82822a(messageEventParcelable.f110948c);
            try {
                bypc bypc2 = (bypc) bxvk.m124014a(bypc.f167305k, a.mo53343f("tx_request"));
                bypd bypd = (bypd) bxvk.m124014a(bypd.f167317i, a.mo53343f("tx_response"));
                if (bypc2.f167308b.equals(bypc.f167308b)) {
                    sek sek = f21129r;
                    Object[] objArr = new Object[2];
                    objArr[0] = bypc2.f167308b;
                    byoo a2 = byoo.m125034a(bypd.f167320b);
                    if (a2 == null) {
                        a2 = byoo.NO_RESPONSE_SELECTED;
                    }
                    objArr[1] = a2;
                    sek.mo25414c("TxId %s was finalized on wear with selection %s. Dismissing the Activity", objArr);
                    if (ijq != null) {
                        ijq.mo13070a();
                    }
                }
            } catch (bxwf e) {
                f21129r.mo25417e("Received a malformed TxRequest or TxResponse", e, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final void mo13071a(int i, boolean z) {
        mo13072a(i, z, (Integer) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13072a(int i, boolean z, Integer num) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f21138i;
        int i2 = i - 2;
        sek sek = f21129r;
        String valueOf = String.valueOf(Integer.toString(i2));
        String valueOf2 = String.valueOf(num);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 100 + String.valueOf(valueOf2).length());
        sb.append("Adding UiEvent: ");
        sb.append(valueOf);
        sb.append(", replySent: ");
        sb.append(z);
        sb.append(", timeSinceReceived: ");
        sb.append(elapsedRealtime);
        sb.append(", proximitySensorResult: ");
        sb.append(valueOf2);
        sek.mo25414c(sb.toString(), new Object[0]);
        bxvd da = bypj.f167346f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bypj bypj = (bypj) da.f164949b;
        int i3 = bypj.f167348a | 1;
        bypj.f167348a = i3;
        bypj.f167349b = elapsedRealtime;
        bypj.f167351d = i2;
        int i4 = i3 | 4;
        bypj.f167348a = i4;
        bypj.f167348a = i4 | 2;
        bypj.f167350c = z;
        if (num != null) {
            bxvd da2 = byok.f167216c.mo74144da();
            int intValue = num.intValue();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byok byok = (byok) da2.f164949b;
            byok.f167218a |= 1;
            byok.f167219b = intValue;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bypj bypj2 = (bypj) da.f164949b;
            byok byok2 = (byok) da2.mo74062i();
            byok2.getClass();
            bypj2.f167352e = byok2;
            bypj2.f167348a |= 8;
        }
        bxvd a = bypd.f167317i.mo74141a(this.f21135f);
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bypd bypd = (bypd) a.f164949b;
        bypj bypj3 = (bypj) da.mo74062i();
        bypj3.getClass();
        if (!bypd.f167323e.mo73666a()) {
            bypd.f167323e = bxvk.m124021a(bypd.f167323e);
        }
        bypd.f167323e.add(bypj3);
        this.f21135f = (bypd) a.mo74062i();
    }

    /* renamed from: a */
    public final void mo13073a(byoo byoo) {
        ikj.m15597a(this.f21134e.f167308b.mo73780k(), 14, this);
        this.f21142m = true;
        byte[] byteArray = getIntent().getExtras().getByteArray("encryption_key_handle");
        if (byteArray != null) {
            String str = this.f21133d;
            bypc bypc = this.f21134e;
            bxvd a = bypd.f167317i.mo74141a(this.f21135f);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bypd bypd = (bypd) a.f164949b;
            bypd.f167320b = byoo.f167232j;
            bypd.f167319a |= 1;
            long currentTimeMillis = System.currentTimeMillis();
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bypd bypd2 = (bypd) a.f164949b;
            bypd2.f167319a |= 4;
            bypd2.f167322d = currentTimeMillis;
            this.f21135f = (bypd) a.mo74062i();
            bxvd da = byoz.f167283d.mo74144da();
            bypc bypc2 = this.f21134e;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byoz byoz = (byoz) da.f164949b;
            bypc2.getClass();
            byoz.f167286b = bypc2;
            int i = 1 | byoz.f167285a;
            byoz.f167285a = i;
            bypd bypd3 = this.f21135f;
            bypd3.getClass();
            byoz.f167287c = bypd3;
            byoz.f167285a = i | 2;
            startService(TransactionReplyIntentOperation.m6530a(str, byteArray, bypc, new byrz(bysa.TX_REPLY, ((byoz) da.mo74062i()).mo73642k())));
        }
        if (((Boolean) igt.f20955e.mo58455c()).booleanValue()) {
            rjy rjy = new rjy(this);
            rjy.mo24779a(axoz.f96226a);
            igr igr = new igr(this, rjy.mo24784b(), axoz.f96228c, axoz.f96229d);
            String valueOf = String.valueOf(this.f21134e.f167308b.mo73781l());
            igs a2 = igr.mo12996a(valueOf.length() == 0 ? new String("/dismiss-wear-prompt/") : "/dismiss-wear-prompt/".concat(valueOf));
            if (cceo.m129401b()) {
                a2.mo12999a();
            } else {
                a2.mo13000b();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ijt.a(int, boolean):void
     arg types: [int, int]
     candidates:
      ijt.a(byoo, int):void
      iko.a(ikz, int):boolean
      ijt.a(int, boolean):void */
    /* renamed from: a */
    public final void mo13074a(byoo byoo, int i) {
        mo13071a(i, true);
        mo13073a(byoo);
    }
}
