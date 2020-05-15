package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;
import com.google.android.gms.smartdevice.d2d.DeviceDetails;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import com.google.android.gms.smartdevice.d2d.TargetDirectTransferController$3;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;
import com.google.android.gms.smartdevice.d2d.p065ui.ForwardingChimeraActivity;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: argm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class argm extends aqyf implements ascg, arqe {

    /* renamed from: h */
    public static final Logger f87667h = ascp.m73787a("D2D", "TargetDirectTransferController");

    /* renamed from: A */
    private final aqxo f87668A;

    /* renamed from: B */
    private final area f87669B;

    /* renamed from: C */
    private final ardy f87670C;

    /* renamed from: D */
    private final arlt f87671D;

    /* renamed from: E */
    private final arly f87672E;

    /* renamed from: F */
    private final aqzy f87673F;

    /* renamed from: G */
    private final AtomicBoolean f87674G = new AtomicBoolean(false);

    /* renamed from: H */
    private boolean f87675H;

    /* renamed from: I */
    private boolean f87676I;

    /* renamed from: J */
    private final ardz f87677J = new argj(this);

    /* renamed from: i */
    public final Context f87678i;

    /* renamed from: j */
    public final argv f87679j;

    /* renamed from: k */
    public final aqzq f87680k;

    /* renamed from: l */
    public final asci f87681l;

    /* renamed from: m */
    public final ProxyResultReceiver f87682m;

    /* renamed from: n */
    public final arqg f87683n;

    /* renamed from: o */
    public final ArrayList f87684o = new ArrayList();

    /* renamed from: p */
    public final ScheduledExecutorService f87685p;

    /* renamed from: q */
    public final aqyn f87686q = new aqyn();

    /* renamed from: r */
    public boolean f87687r;

    /* renamed from: s */
    public Future f87688s;

    /* renamed from: t */
    public boolean f87689t;

    /* renamed from: u */
    public BootstrapConfigurations f87690u;

    /* renamed from: v */
    private final arai f87691v;

    /* renamed from: w */
    private final armn f87692w;

    /* renamed from: x */
    private final BootstrapOptions f87693x;

    /* renamed from: y */
    private final boolean f87694y;

    /* renamed from: z */
    private final asck f87695z;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aqxo.a(android.content.Context, armn, ardz, boolean, boolean):area
     arg types: [android.content.Context, armn, ardz, boolean, int]
     candidates:
      aqxo.a(android.content.Context, armh, aram, boolean, boolean):aral
      aqxo.a(android.content.Context, android.os.Handler, armn, ardz, boolean):ardy
      aqxo.a(android.content.Context, armn, ardz, boolean, boolean):area */
    /* JADX WARNING: Illegal instructions before constructor call */
    public argm(arai arai, BootstrapOptions bootstrapOptions, asci asci, asck asck, aqzq aqzq) {
        super(r1.f87198b);
        boolean z;
        arai arai2 = arai;
        BootstrapOptions bootstrapOptions2 = bootstrapOptions;
        aqxo aqxo = aqxo.f87044a;
        arly arly = new arly(arai2.f87197a, arai2.f87198b);
        aqzy aqzy = new aqzy(arai2.f87197a);
        snf a = snp.m35703a(1, 10);
        this.f87691v = arai2;
        this.f87678i = arai2.f87197a;
        this.f87692w = (armn) arai2.f87199c;
        this.f87679j = arai2.f87200d;
        bmxy.m108581a(bootstrapOptions);
        this.f87693x = bootstrapOptions2;
        bmxy.m108581a(aqzq);
        this.f87680k = aqzq;
        bmxy.m108581a(asci);
        this.f87681l = asci;
        bmxy.m108581a(asck);
        this.f87695z = asck;
        this.f87672E = arly;
        this.f87673F = aqzy;
        this.f87685p = a;
        this.f87668A = aqxo;
        this.f87682m = new ProxyResultReceiver(arai2.f87198b, this);
        this.f87683n = new arqg();
        this.f87671D = arqd.m73298c(this.f87678i);
        if (bootstrapOptions2.f107837j == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f87694y = z;
        Context context = this.f87678i;
        if (!ascn.m73781a(bootstrapOptions2.f107839l)) {
            bootstrapOptions2.mo59045a(ascn.m73780a());
        }
        bootstrapOptions2.mo59051b(asbu.m73760a(context));
        bootstrapOptions2.mo59058d(cgqs.m146598d());
        bootstrapOptions2.mo59052c(cgqs.m146608n() ? aqxm.m72202c() : aqxm.m72203d());
        araa araa = new araa();
        araa.mo48319a(1, cgqs.f187523a.mo6606a().mo84320f());
        araa.mo48319a(5, cgps.m146493e());
        bootstrapOptions2.mo59053c(araa.f87188b);
        bootstrapOptions2.mo59050b(araa.f87187a);
        armn armn = this.f87692w;
        armn.mo48659a(this.f87693x.f107839l);
        armn.mo48662a(this.f87694y);
        this.f87669B = this.f87668A.mo48207a(this.f87678i, this.f87692w, this.f87677J, this.f87694y, false);
        if (bootstrapOptions2.f107841n) {
            f87667h.logVerbose("Target supports 3P MFM", new Object[0]);
            this.f87670C = this.f87668A.mo48206a(this.f87678i, arai2.f87198b, this.f87692w, this.f87677J, !this.f87694y);
            return;
        }
        f87667h.logVerbose("Target does not support 3P MFM", new Object[0]);
        this.f87670C = null;
    }

    /* renamed from: a */
    public final void mo48242a() {
        super.mo48242a();
        f87667h.logVerbose("Cleaning up.", new Object[0]);
        this.f87681l.mo49039a();
        ardy ardy = this.f87670C;
        if (ardy != null) {
            ardy.mo48449a();
        }
    }

    /* renamed from: b */
    public final void mo48518b(int i, String str) {
        this.f87681l.mo49039a();
        mo48251b(i);
        mo48244a(i, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo48254c() {
        f87667h.logVerbose("handleOnCompleted().", new Object[0]);
        if (this.f87674G.get()) {
            f87667h.mo25414c("Complete state is already handled.", new Object[0]);
            return;
        }
        this.f87674G.set(true);
        this.f87681l.mo49039a();
        this.f87679j.mo48401a();
        if (mo48520g()) {
            this.f87680k.mo48308a(this.f87686q.mo48275a());
        } else {
            aqzq aqzq = this.f87680k;
            ArrayList arrayList = this.f87684o;
            aqzq.mo48309a((AccountTransferResult[]) arrayList.toArray(new AccountTransferResult[arrayList.size()]));
        }
        mo48242a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo48257d() {
        f87667h.mo25412b("-> Sending BootstrapOptions", new Object[0]);
        if (mo48520g() && cgqo.m146590b()) {
            this.f87693x.mo59055c(arqc.m73292b());
        }
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.mo59095a(this.f87693x);
        mo48252b(messagePayload);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final asck mo48258e() {
        return this.f87695z;
    }

    /* renamed from: f */
    public final void mo48519f() {
        this.f87689t = true;
        this.f87692w.mo48658a(10564);
        this.f87681l.mo49039a();
        this.f87683n.mo48746a(2051, Bundle.EMPTY);
        mo48243a(1);
        mo48242a();
    }

    /* renamed from: g */
    public final boolean mo48520g() {
        return cgqy.m146727b() && this.f87693x.f107853z;
    }

    /* renamed from: h */
    public final void mo48521h() {
        if (cgpm.m146473c()) {
            MessagePayload messagePayload = new MessagePayload();
            messagePayload.mo59093a(2);
            MessagePayload messagePayload2 = new MessagePayload();
            messagePayload2.mo59100a(this.f87684o);
            mo48246a(new argl(this), messagePayload2, messagePayload);
            return;
        }
        MessagePayload messagePayload3 = new MessagePayload();
        messagePayload3.mo59100a(this.f87684o);
        mo48252b(messagePayload3);
        mo48243a(2);
    }

    /* renamed from: a */
    public final void mo48435a(int i, Bundle bundle) {
        switch (i) {
            case 2001:
                this.f87683n.mo48747a(m72244a(bundle, "resultReceiver"));
                return;
            case 2002:
                this.f87683n.mo48745a();
                return;
            case 2003:
                mo48516a(bundle.getParcelableArrayList("accountChallengeData"));
                mo48517a((List) this.f87684o);
                return;
            case 2004:
                mo48518b(10564, "User nagivated back in UI.");
                return;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown result code: ");
                sb.append(i);
                throw new RuntimeException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48244a(int i, String str) {
        this.f87681l.mo49039a();
        this.f87077f.post(new argk(this, i, str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48247a(MessagePayload messagePayload) {
        boolean z;
        BootstrapConfigurations bootstrapConfigurations = messagePayload.f107978e;
        if (bootstrapConfigurations != null) {
            f87667h.logVerbose("processBootstrapConfigurations.", new Object[0]);
            int i = bootstrapConfigurations.f107820l;
            if (i > 0 && this.f87693x.f107843p) {
                mo48255c(i);
            }
            araa c = bootstrapConfigurations.mo59041c();
            this.f87675H = c.mo48320a(2);
            this.f87687r = c.mo48320a(6);
            DeviceDetails deviceDetails = bootstrapConfigurations.f107823o;
            if (deviceDetails != null && deviceDetails.f107884d) {
                this.f87692w.mo48669f(3);
            } else {
                this.f87692w.mo48669f(2);
            }
            f87667h.mo25412b("from source: %s", c);
            if (mo48520g()) {
                if (!TextUtils.isEmpty(bootstrapConfigurations.f107812d)) {
                    f87667h.logVerbose("Get wifi ssid from bootstrapConfigurations", new Object[0]);
                }
                int i2 = 4;
                if (c.mo48320a(4)) {
                    arac d = arqd.m73299d(this.f87678i);
                    BootstrapOptions bootstrapOptions = this.f87693x;
                    d.mo48326a(bootstrapOptions.f107849v, bootstrapOptions.f107839l);
                }
                aqyn aqyn = this.f87686q;
                if (!c.mo48320a(2)) {
                    i2 = 0;
                }
                aqyn.f87102d = i2;
                if (c.mo48320a(9)) {
                    this.f87686q.f87099a = 2;
                } else if (c.mo48320a(8)) {
                    this.f87686q.f87099a = 1;
                }
                if (deviceDetails != null) {
                    this.f87686q.f87103e = deviceDetails.f107882b;
                }
            }
            this.f87690u = bootstrapConfigurations;
            z = true;
        } else {
            z = false;
        }
        AccountBootstrapPayload accountBootstrapPayload = messagePayload.f107980g;
        if (accountBootstrapPayload != null) {
            this.f87669B.mo48461a(accountBootstrapPayload);
            z = true;
        }
        AccountTransferPayload accountTransferPayload = messagePayload.f107984k;
        if (!(accountTransferPayload == null || this.f87670C == null)) {
            AccountTransferMsg b = accountTransferPayload.mo59088b();
            if (b != null) {
                this.f87670C.mo48450a(b);
            }
            z = true;
        }
        WorkProfilePayload workProfilePayload = messagePayload.f107986m;
        if (workProfilePayload != null) {
            f87667h.mo25412b("Persisting work profile %s", Logger.m35081a(workProfilePayload.f107996b));
            this.f87687r = false;
            this.f87672E.mo48621a(workProfilePayload);
            this.f87691v.f87202f.mo48202a();
            CleanSharedSecretChimeraService.m92619a(this.f87678i);
            this.f87692w.mo48668e(workProfilePayload.mo59107b());
            if (mo48520g()) {
                this.f87686q.f87102d = workProfilePayload.f107997c;
            }
            Future future = this.f87688s;
            if (future != null) {
                future.cancel(true);
                this.f87688s = null;
                mo48517a((List) this.f87684o);
            }
        }
        ArrayList arrayList = messagePayload.f107987n;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f87673F.mo48316a(arrayList);
            CleanSharedSecretChimeraService.m92622c(this.f87678i);
        }
        if (!z) {
            f87667h.mo25418e("Did not process message for payload: ", messagePayload.toString());
        }
    }

    /* renamed from: a */
    public final void mo48516a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f87684o.add(new AccountTransferResult(new BootstrapAccount(((Bundle) arrayList.get(i)).getString("name"), "com.google"), 1));
        }
    }

    /* renamed from: a */
    public final void mo48517a(List list) {
        ManagedAuthOptions managedAuthOptions;
        int i;
        int i2;
        int i3;
        if (this.f87676I) {
            f87667h.mo25416d("Transfer already completed", new Object[0]);
            return;
        }
        if (this.f87687r) {
            f87667h.mo25416d("Never received work profile data", new Object[0]);
        }
        this.f87676I = true;
        if (this.f87694y || cgqs.f187523a.mo6606a().mo84304Q()) {
            mo48521h();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AccountTransferResult accountTransferResult = (AccountTransferResult) list.get(i4);
            if (accountTransferResult.f107789c == 1) {
                BootstrapAccount bootstrapAccount = accountTransferResult.f107788b;
                arrayList.add(new Account(bootstrapAccount.f107799b, bootstrapAccount.f107800c));
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Account account = (Account) arrayList.get(i5);
            if (this.f87671D.mo48619a(account)) {
                Bundle bundle = new Bundle();
                bundle.putString("theme", stn.m36304a("setupwizard.theme", "glif_light"));
                arlt arlt = this.f87671D;
                if (!cgps.m146490b()) {
                    managedAuthOptions = new ManagedAuthOptions();
                } else {
                    try {
                        i = ((ManagedAccountSetupInfo) aucu.m76782a(this.f87672E.mo48622b())).f107899b;
                    } catch (InterruptedException | ExecutionException e) {
                        f87667h.mo25410a(e);
                        i = 0;
                    }
                    if (!this.f87675H) {
                        i2 = i == 4 ? 1 : i == 3 ? 2 : 0;
                    } else {
                        i2 = 1;
                    }
                    if (this.f87693x.f107829b == 3) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    managedAuthOptions = new ManagedAuthOptions(i2, i3);
                }
                Intent a = arlt.mo48617a(account, bundle, managedAuthOptions);
                if (a != null) {
                    arrayList2.add(a);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            mo48521h();
        } else {
            this.f87680k.mo48307a(ForwardingChimeraActivity.m92736a(this.f87678i, new TargetDirectTransferController$3(this, this.f87077f), arrayList2));
        }
    }
}
