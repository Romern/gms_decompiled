package com.google.android.gms.tapandpay.wear;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.view.View;
import android.widget.TextView;
import androidx.wear.widget.SwipeDismissFrameLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearProxyChimeraActivity extends atex implements axou, asin {

    /* renamed from: b */
    public static final srn f108972b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    static final long f108973c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: h */
    private static final String[] f108974h = {"com.google.android.gms.tapandpay.settings.SelectUntokenizedCardActivity"};

    /* renamed from: d */
    public Bundle f108975d;

    /* renamed from: e */
    public final Runnable f108976e = new atyt(this);

    /* renamed from: f */
    final awe f108977f = new atyw(this);

    /* renamed from: g */
    public rjx f108978g;

    /* renamed from: i */
    private atxz f108979i = new atxz();

    /* renamed from: j */
    private atyy f108980j;

    /* renamed from: k */
    private atzp f108981k;

    /* renamed from: l */
    private int f108982l;

    /* renamed from: m */
    private String f108983m;

    /* renamed from: n */
    private final Handler f108984n = new adzt();

    /* renamed from: o */
    private final Runnable f108985o = new atys(this);

    /* renamed from: p */
    private boolean f108986p;

    /* renamed from: q */
    private rjx f108987q;

    /* renamed from: r */
    private rjx f108988r;

    /* renamed from: a */
    private final rkl m93318a(int i, String str, bmxe bmxe) {
        return new atyv(this, bmxe, i, str);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    private final void m93319b(Bundle bundle) {
        char c;
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            ((bnsl) f108972b.mo68387b()).mo68405a("Bundle is null");
            return;
        }
        String string = bundle2.getString("type");
        if (string == null) {
            ((bnsl) f108972b.mo68387b()).mo68405a("Request has no type");
            return;
        }
        auai.m76648a(bundle);
        char c2 = 0;
        char c3 = 65535;
        switch (string.hashCode()) {
            case -1381540075:
                if (string.equals("apiRequest")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1345311940:
                if (string.equals("crossbarRequest")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -942817766:
                if (string.equals("serviceRequest")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -713963455:
                if (string.equals("proxyRequest")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -605096753:
                if (string.equals("proxyResponse")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            mo59502a(bundle);
        } else if (c != 1) {
            String str = null;
            if (c == 2) {
                String string2 = bundle2.getString("nodeId");
                String string3 = bundle2.getString("method");
                int i = bundle2.getInt("requestId");
                if (string3 == null || string2 == null) {
                    ((bnsl) f108972b.mo68387b()).mo68405a("API request: required params missing");
                    return;
                }
                switch (string3.hashCode()) {
                    case -1424583123:
                        if (string3.equals("deleteAbToken")) {
                            c3 = 1;
                            break;
                        }
                        break;
                    case -445212744:
                        if (string3.equals("getAllCards")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case -248292008:
                        if (string3.equals("removeListener")) {
                            c3 = 3;
                            break;
                        }
                        break;
                    case 1115161719:
                        if (string3.equals("registerListener")) {
                            c3 = 2;
                            break;
                        }
                        break;
                }
                if (c3 == 0) {
                    this.f108987q.mo24769w().mo9459a(m93318a(i, string2, auaa.f91307b), 10, TimeUnit.SECONDS);
                } else if (c3 == 1) {
                    Bundle bundle3 = bundle2.getBundle("data");
                    if (bundle3 != null) {
                        str = bundle3.getString("billingCardId");
                    }
                    if (str != null) {
                        rkb rkb = this.f108987q.f43165D;
                        asxe asxe = new asxe(rkb, str);
                        rkb.mo24795b(asxe);
                        asxe.mo9459a(m93318a(i, string2, auaa.f91308c), 10, TimeUnit.SECONDS);
                        return;
                    }
                    ((bnsl) f108972b.mo68387b()).mo68405a("deleteAbToken error: billingCardId is null");
                } else if (c3 == 2) {
                    this.f108982l = i;
                    this.f108983m = string2;
                    this.f108988r.mo24720a((asin) this);
                } else if (c3 != 3) {
                    ((bnsl) f108972b.mo68387b()).mo68420a("API request: %s unimplemented", string3);
                } else {
                    this.f108982l = 0;
                    this.f108983m = null;
                    this.f108988r.mo24733b((asin) this);
                }
            } else if (c == 3) {
                int i2 = bundle2.getInt("what");
                Bundle bundle4 = bundle2.getBundle("data");
                String string4 = bundle2.getString("nodeId");
                if (string4 == null) {
                    ((bnsl) f108972b.mo68387b()).mo68405a("Service request: required params missing");
                    return;
                }
                this.f108980j.f91186a = string4;
                Message obtain = Message.obtain((Handler) null, i2);
                Bundle bundle5 = new Bundle();
                bundle5.setClassLoader(WearProxyChimeraActivity.class.getClassLoader());
                if (bundle4 != null) {
                    bundle5.putAll(bundle4);
                }
                obtain.setData(bundle5);
                obtain.replyTo = new Messenger(this.f108980j);
                try {
                    this.f108979i.mo50311a(obtain);
                } catch (RemoteException e) {
                    bnsl bnsl = (bnsl) f108972b.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("Service request: Unexpected Remote Exception");
                }
            } else if (c != 4) {
                ((bnsl) f108972b.mo68387b()).mo68420a("Unable to handle request type: %s", string);
            } else {
                AccountInfo accountInfo = (AccountInfo) bundle2.getParcelable("accountInfo");
                String string5 = bundle2.getString("method");
                int i3 = bundle2.getInt("requestId", -1);
                byte[] byteArray = bundle2.getByteArray("message");
                String string6 = bundle2.getString("nodeId");
                if (accountInfo == null || string5 == null || byteArray == null || string6 == null || i3 == -1) {
                    ((bnsl) f108972b.mo68387b()).mo68405a("Volley request: required params missing");
                    return;
                }
                askf askf = new askf(accountInfo.f108325a, accountInfo.f108326b, askc.m74272b(), this);
                try {
                    if (string5.hashCode() != 858223871 || !string5.equals("t/untokenizedcards/list")) {
                        c2 = 65535;
                    }
                    if (c2 != 0) {
                        ((bnsl) f108972b.mo68387b()).mo68420a("Volley request: method %s unimplemented", string5);
                        return;
                    }
                    atff.m75765a(askf, string5, (btjf) bxvk.m124016a(btjf.f149105c, byteArray, bxus.m123744c()), btjg.f149109e, new atyx(this, i3, string6), this);
                } catch (bxwf e2) {
                    bnsl bnsl2 = (bnsl) f108972b.mo68387b();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68405a("Volley request: parse exception");
                }
            }
        } else {
            this.f108984n.removeCallbacks(this.f108985o);
            int i4 = bundle2.getInt("resultCode", 0);
            Intent intent = new Intent();
            Bundle bundle6 = bundle2.getBundle("data");
            if (bundle6 != null) {
                intent.putExtras(bundle6);
            }
            setResult(i4, intent);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            setResult(0);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f108981k = new atzp(this);
        setTheme(C0126R.style.TpWearTheme);
        setContentView((int) C0126R.C0128layout.tp_wear_proxy_activity);
        SwipeDismissFrameLayout swipeDismissFrameLayout = (SwipeDismissFrameLayout) findViewById(C0126R.C0129id.tp_swipe_dismiss_frame_layout);
        awe awe = this.f108977f;
        if (awe != null) {
            swipeDismissFrameLayout.f1807a.add(awe);
            getWindow().addFlags(128);
            this.f108980j = new atyy(this);
            this.f108987q = rjx.m33697b((Activity) this);
            this.f108988r = rjx.m33693a((Activity) this);
            if (this.f108978g == null) {
                this.f108978g = axoz.m82854b(this);
            }
            if (bpai.m111718a(getIntent().getIntExtra("phoneOsType", 2)) == 4) {
                ((TextView) findViewById(C0126R.C0129id.WearProxyActivityTitle)).setText((int) C0126R.string.tp_wear_proxy_title_for_ios);
            }
            findViewById(C0126R.C0129id.retry_button).setOnClickListener(new atyu(this));
            return;
        }
        throw new NullPointerException("addCallback called with null callback");
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.f108979i.mo50310a(this);
        this.f108978g.mo24721a((axou) this);
        if (this.f108983m != null) {
            this.f108982l = 0;
            this.f108983m = null;
            this.f108988r.mo24733b((asin) this);
        }
        this.f108988r.mo24733b((asin) this);
        atff.m75768a(this);
        this.f108984n.removeCallbacks(this.f108976e);
        if (!this.f108986p) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f108979i.mo50137a(this, "com.google.android.gms.tapandpay.tokenization.TokenizePanService");
        this.f108978g.mo24722a(this, auaa.f91306a);
        if ("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodActivity".equals(getIntent().getStringExtra("activity"))) {
            this.f108986p = true;
        }
        m93319b(getIntent().getExtras());
        this.f108984n.postDelayed(this.f108976e, TimeUnit.SECONDS.toMillis((long) bqcn.m112585b(cgxx.m147543b())));
    }

    /* renamed from: a */
    public final void mo49193a() {
        if (this.f108983m != null) {
            mo59503a(auaa.m76635b(this.f108982l, null), this.f108983m);
        }
    }

    /* renamed from: a */
    public final void mo59502a(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("nodeId");
        if (stringExtra == null) {
            ((bnsl) f108972b.mo68387b()).mo68405a("Proxy request: nodeId required");
            return;
        }
        this.f108975d = bundle;
        if (sqc.m35963b(f108974h, bundle.getString("activity"))) {
            this.f108984n.postDelayed(this.f108985o, f108973c);
        }
        mo59503a(bundle, stringExtra);
    }

    /* renamed from: a */
    public final void mo59503a(Bundle bundle, String str) {
        int intExtra = getIntent().getIntExtra("phoneProxyVersion", 0);
        if (intExtra != 0 && intExtra < 7 && !this.f108981k.mo50334a(bundle, 7, intExtra)) {
            auad auad = new auad();
            auad.f91313b = getString(C0126R.string.tp_generic_error_content);
            auad.f91312a = getString(C0126R.string.common_something_went_wrong);
            auad.f91314c = getString(C0126R.string.common_dismiss);
            Intent className = new Intent().setClassName(auad.f91315d, auad.f91316e);
            String str2 = auad.f91312a;
            if (str2 != null) {
                className.putExtra("alert_title", str2);
            }
            String str3 = auad.f91313b;
            if (str3 != null) {
                className.putExtra("alert_msg", str3);
            }
            String str4 = auad.f91314c;
            if (str4 != null) {
                className.putExtra("pos_text", str4);
            }
            startActivityForResult(className, 1);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("shouldCompressRpcs", false);
        bundle.putBoolean("shouldCompressRpcs", booleanExtra);
        this.f108978g.mo24694a(str, "/tapandpay/proxy", auai.m76649a(bundle, booleanExtra));
    }

    /* renamed from: a */
    public final void mo7590a(MessageEventParcelable messageEventParcelable) {
        m93319b(auai.m76640a(messageEventParcelable));
    }

    /* renamed from: a */
    public final void mo59504a(boolean z) {
        int i = 8;
        findViewById(C0126R.C0129id.check_your_phone_layout).setVisibility(!z ? 8 : 0);
        View findViewById = findViewById(C0126R.C0129id.retry_proxy_layout);
        if (!z) {
            i = 0;
        }
        findViewById.setVisibility(i);
    }
}
