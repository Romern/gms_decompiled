package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.DeviceDetails;
import com.google.android.gms.smartdevice.d2d.EsimActivationInfo;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.p065ui.SourceDirectTransferChimeraActivity;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ardn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ardn extends aqyf implements arqe {

    /* renamed from: h */
    public static final Logger f87438h = ascp.m73787a("D2D", "SourceDirectTransferController");

    /* renamed from: A */
    private final asck f87439A;

    /* renamed from: B */
    private final ProxyResultReceiver f87440B;

    /* renamed from: C */
    private final ardk f87441C;

    /* renamed from: D */
    private final arly f87442D;

    /* renamed from: E */
    private final aqzy f87443E;

    /* renamed from: F */
    private final ArrayList f87444F = new ArrayList();

    /* renamed from: i */
    public final Context f87445i;

    /* renamed from: j */
    public final armh f87446j;

    /* renamed from: k */
    public final argv f87447k;

    /* renamed from: l */
    public final BootstrapConfigurations f87448l;

    /* renamed from: m */
    public final aqzq f87449m;

    /* renamed from: n */
    public final aqxo f87450n;

    /* renamed from: o */
    public final arqg f87451o;

    /* renamed from: p */
    public final ardm f87452p;

    /* renamed from: q */
    public BootstrapOptions f87453q;

    /* renamed from: r */
    public Boolean f87454r = null;

    /* renamed from: s */
    public boolean f87455s;

    /* renamed from: t */
    public boolean f87456t;

    /* renamed from: u */
    public aran f87457u;

    /* renamed from: v */
    public aral f87458v;

    /* renamed from: w */
    public aucb f87459w;

    /* renamed from: x */
    public aucb f87460x;

    /* renamed from: y */
    public final aram f87461y = new ardg(this);

    /* renamed from: z */
    private final asci f87462z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ardn(arai arai, BootstrapConfigurations bootstrapConfigurations, asci asci, asck asck, aqzq aqzq) {
        super(arai.f87198b);
        long j;
        argz a = argz.m72750a(arai.f87197a);
        aqxo aqxo = aqxo.f87044a;
        arly arly = new arly(arai.f87197a, arai.f87198b);
        aqzy aqzy = new aqzy(arai.f87197a);
        this.f87445i = arai.f87197a;
        armh armh = (armh) arai.f87199c;
        sdo.m34959a(armh);
        this.f87446j = armh;
        this.f87447k = arai.f87200d;
        sdo.m34959a(bootstrapConfigurations);
        this.f87448l = bootstrapConfigurations;
        sdo.m34959a(asci);
        this.f87462z = asci;
        sdo.m34959a(asck);
        this.f87439A = asck;
        this.f87442D = arly;
        this.f87443E = aqzy;
        sdo.m34959a(aqzq);
        this.f87449m = aqzq;
        this.f87450n = aqxo;
        this.f87451o = new arqg();
        this.f87440B = new ProxyResultReceiver(this.f87077f, this);
        this.f87441C = new ardk(a, this.f87448l.f107816h, new ardh(this));
        if (this.f87448l.f107818j) {
            this.f87454r = false;
            this.f87441C.mo48429a();
        }
        String str = arai.f87201e;
        if (str != null && str.startsWith("com.google.android.wearable")) {
            j = cgrk.f187596a.mo6606a().mo84355a();
        } else {
            j = cgpp.f187466a.mo6606a().mo84242a();
        }
        this.f87452p = new ardm(this, j);
    }

    /* renamed from: a */
    public static List m72536a(Context context) {
        Account[] a = asbs.m73758a(context).mo33916a("com.google");
        ArrayList arrayList = new ArrayList();
        for (Account account : a) {
            arrayList.add(new BootstrapAccount(account.name, account.type));
        }
        return arrayList;
    }

    /* renamed from: i */
    private final boolean m72537i() {
        return cgqy.m146727b() && this.f87448l.f107824p;
    }

    /* renamed from: b */
    public final void mo48437b(int i, String str) {
        this.f87462z.mo49039a();
        mo48251b(i);
        mo48244a(i, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo48254c() {
        this.f87462z.mo49039a();
        this.f87447k.mo48401a();
        this.f87451o.mo48746a(1011, Bundle.EMPTY);
        if (cgpm.m146473c()) {
            MessagePayload messagePayload = new MessagePayload();
            messagePayload.mo59093a(2);
            mo48246a(new ardj(this), messagePayload);
            return;
        }
        mo48243a(2);
        mo48440h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo48257d() {
        ardk ardk = this.f87441C;
        f87438h.logVerbose("Encryption negotiation has completed.", new Object[0]);
        ardk.f87426a = true;
        ardk.mo48430b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final asck mo48258e() {
        return this.f87439A;
    }

    /* renamed from: f */
    public final synchronized void mo48438f() {
        int i;
        if (!this.f87448l.f107819k) {
            i = 8;
        } else {
            i = 9;
        }
        mo48436a(new arhq(true, this, i));
    }

    /* renamed from: g */
    public final synchronized void mo48439g() {
        this.f87462z.mo49039a();
        this.f87456t = true;
        this.f87446j.mo48647b(10564);
        this.f87451o.mo48746a(1012, Bundle.EMPTY);
        mo48243a(1);
        mo48242a();
    }

    /* renamed from: h */
    public final void mo48440h() {
        if (m72537i()) {
            this.f87449m.mo48308a(new aqyn().mo48275a());
        } else {
            aqzq aqzq = this.f87449m;
            ArrayList arrayList = this.f87444F;
            aqzq.mo48309a((AccountTransferResult[]) arrayList.toArray(new AccountTransferResult[arrayList.size()]));
        }
        mo48242a();
    }

    /* renamed from: a */
    public final void mo48242a() {
        super.mo48242a();
        this.f87462z.mo49039a();
        this.f87452p.f87435b.mo48751b();
        aral aral = this.f87458v;
        if (aral != null) {
            aral.mo48337b();
        }
    }

    /* renamed from: b */
    public final void mo48253b(byte[] bArr) {
        this.f87452p.mo48431a();
        super.mo48253b(bArr);
    }

    /* renamed from: a */
    public final void mo48435a(int i, Bundle bundle) {
        Logger Logger = f87438h;
        StringBuilder sb = new StringBuilder(28);
        sb.append("onReceiveResult: ");
        sb.append(i);
        Logger.logVerbose(sb.toString(), new Object[0]);
        switch (i) {
            case 1001:
                this.f87451o.mo48747a(m72244a(bundle, "resultReceiver"));
                return;
            case 1002:
                this.f87451o.mo48745a();
                return;
            case 1003:
                this.f87457u.mo48346a(bundle.getParcelableArrayList("accountChallengeData"));
                this.f87452p.mo48433c();
                return;
            case 1004:
                this.f87454r = Boolean.valueOf(bundle.getBoolean("lockScreenConfirmed"));
                this.f87441C.mo48429a();
                this.f87452p.mo48433c();
                return;
            case 1005:
                mo48437b(10564, "Bootstrap canceled by user.");
                return;
            case 1006:
                mo48437b(10585, "The source device is managed by a device owner.");
                return;
            case 1007:
                mo48437b(10586, "The source device backup account is a managed account.");
                return;
            default:
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Unknown resultCode: ");
                sb2.append(i);
                throw new RuntimeException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48244a(int i, String str) {
        this.f87462z.mo49039a();
        this.f87077f.post(new ardi(this, i, str));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aqyf.a(arhq, boolean):void
     arg types: [arhq, int]
     candidates:
      ardn.a(int, android.os.Bundle):void
      ardn.a(int, java.lang.String):void
      aqyf.a(android.os.Bundle, java.lang.String):android.os.ResultReceiver
      aqyf.a(int, java.lang.String):void
      aqyf.a(bqfp, com.google.android.gms.smartdevice.d2d.data.MessagePayload[]):void
      arqe.a(int, android.os.Bundle):void
      aqyf.a(arhq, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo48436a(arhq arhq) {
        this.f87452p.mo48434d();
        mo48245a(arhq, false);
        this.f87462z.mo49040a(this);
        f87438h.logVerbose("startEncryptionNegotiation", new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48247a(MessagePayload messagePayload) {
        boolean z;
        aral aral;
        aran aran;
        boolean z2;
        aucb aucb;
        aucb aucb2;
        boolean z3;
        boolean z4;
        BootstrapOptions bootstrapOptions = messagePayload.f107977d;
        String str = null;
        if (bootstrapOptions != null) {
            this.f87453q = bootstrapOptions;
            if (m72537i()) {
                aqzq aqzq = this.f87449m;
                try {
                    if (aqzq.f87169b.mo66813a()) {
                        ((arij) aqzq.f87169b.mo66814b()).mo48564a(bootstrapOptions);
                    }
                } catch (RemoteException e) {
                    aqzq.f87168a.mo25410a((Throwable) e);
                }
            }
            if (bootstrapOptions.f107837j != -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            sdo.m34974b(z2);
            araa b = bootstrapOptions.mo59048b();
            araa araa = new araa();
            boolean a = b.mo48320a(5);
            boolean c = cgps.m146491c();
            boolean d = cgps.m146492d();
            if (cgqf.m146562c()) {
                f87438h.logVerbose("createWorkProfileTask: targetSupport=%s, supportsWorkProfileSetup=%s, workProfileFallback=%s", Boolean.valueOf(a), Boolean.valueOf(c), Boolean.valueOf(d));
            }
            if (d) {
                d = this.f87442D.mo48623c() == 4;
            }
            if (!a) {
                aucb = null;
            } else if (!c && !d) {
                aucb = null;
            } else {
                araa.mo48319a(6, true);
                aucb = this.f87442D.mo48620a();
            }
            this.f87459w = aucb;
            EsimActivationInfo esimActivationInfo = bootstrapOptions.f107850w;
            if (this.f87453q.f107850w == null || !cgpv.m146521b()) {
                aucb2 = null;
            } else {
                araa.mo48319a(7, true);
                aucb2 = this.f87443E.mo48315a(esimActivationInfo);
            }
            this.f87460x = aucb2;
            araa.mo48319a(2, new arlt(this.f87445i).mo48618a());
            BootstrapConfigurations bootstrapConfigurations = this.f87448l;
            long a2 = spn.getAndroidId(this.f87445i);
            rfi rfi = rfi.f42868a;
            bootstrapConfigurations.mo59035a(new DeviceDetails(a2, rfy.m33553j(this.f87445i)));
            this.f87448l.mo59034a(araa);
            if (m72537i()) {
                if (cgqo.m146590b() && this.f87453q.f107849v != null) {
                    arqc arqc = new arqc(this.f87445i);
                    BootstrapOptions bootstrapOptions2 = this.f87453q;
                    arqc.mo48326a(bootstrapOptions2.f107849v, bootstrapOptions2.f107839l);
                    araa.mo48319a(4, true);
                }
                boui a3 = arsq.m73409a(this.f87445i, this.f87453q.f107848u);
                this.f87446j.mo48644a(a3);
                boui boui = boui.NONE;
                int ordinal = a3.ordinal();
                if (ordinal == 1) {
                    araa.mo48319a(8, true);
                } else if (ordinal == 2) {
                    araa.mo48319a(9, true);
                }
                this.f87448l.mo59034a(araa);
            }
            boolean z5 = this.f87453q.f107837j == 1;
            this.f87455s = z5;
            ardm ardm = this.f87452p;
            ardm.f87434a = z5;
            ardm.mo48434d();
            if (!ascn.m73781a(this.f87453q.f107839l)) {
                this.f87453q.mo59045a(ascn.m73780a());
            }
            f87438h.mo25412b("from target: %s", bootstrapOptions.mo59048b());
            armh armh = this.f87446j;
            armh.mo48643a(this.f87453q.f107839l);
            armh.mo48646a(this.f87455s);
            if (!this.f87453q.f107843p || !cgqs.m146598d()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                this.f87448l.mo59032a(this.f87453q.f107844q);
            } else {
                this.f87448l.mo59032a(0);
            }
            MessagePayload messagePayload2 = new MessagePayload();
            messagePayload2.mo59094a(this.f87448l);
            mo48252b(messagePayload2);
            if (z3) {
                mo48255c(this.f87453q.f107844q);
            }
            ardk ardk = this.f87441C;
            f87438h.logVerbose("Received bootstrap options from target device.", new Object[0]);
            ardk.f87427b = true;
            ardk.mo48430b();
            this.f87452p.mo48432b();
            boolean a4 = this.f87453q.mo59048b().mo48320a(1);
            BootstrapOptions bootstrapOptions3 = this.f87453q;
            if (bootstrapOptions3.f107846s >= 11800000) {
                z4 = a4;
            } else {
                z4 = true;
            }
            PendingIntent a5 = SourceDirectTransferChimeraActivity.m92738a(this.f87445i, this.f87440B, this.f87448l, bootstrapOptions3, asbu.m73761a(bootstrapOptions3), z4);
            f87438h.logVerbose("Sending pending intent to listener", new Object[0]);
            this.f87449m.mo48307a(a5);
            z = true;
        } else {
            z = false;
        }
        AccountBootstrapPayload accountBootstrapPayload = messagePayload.f107980g;
        if (!(accountBootstrapPayload == null || (aran = this.f87457u) == null)) {
            aran.mo48345a(accountBootstrapPayload);
            z = true;
        }
        AccountTransferPayload accountTransferPayload = messagePayload.f107984k;
        if (!(accountTransferPayload == null || (aral = this.f87458v) == null)) {
            aral.mo48335a(accountTransferPayload);
            z = true;
        }
        ArrayList arrayList = messagePayload.f107983j;
        if (arrayList != null) {
            this.f87444F.addAll(arrayList);
            int size = arrayList.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                if (((AccountTransferResult) arrayList.get(i2)).f107789c == 1) {
                    i++;
                }
            }
            if (i > 0 && arqb.m73291b()) {
                BootstrapOptions bootstrapOptions4 = this.f87453q;
                if (bootstrapOptions4 != null) {
                    str = bootstrapOptions4.f107834g;
                }
                arqb.m73289a(this.f87445i, i, str);
            }
        } else if (!z) {
            f87438h.mo25418e("Did not process message for payload: ", messagePayload.toString());
        }
    }

    /* renamed from: a */
    public final void mo48249a(byte[] bArr) {
        this.f87452p.mo48431a();
        super.mo48249a(bArr);
    }
}
