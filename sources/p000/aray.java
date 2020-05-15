package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.DeviceDetails;
import com.google.android.gms.smartdevice.d2d.EsimActivationInfo;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.DisplayText;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.ProgressEvent;

/* renamed from: aray */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aray extends aqxz {

    /* renamed from: d */
    public static final Logger f87241d = ascp.m73787a("D2D", "SourceDeviceBootstrapController");

    /* renamed from: e */
    public final armh f87242e;

    /* renamed from: f */
    public aqzo f87243f;

    /* renamed from: g */
    public BootstrapConfigurations f87244g;

    /* renamed from: h */
    public boolean f87245h = false;

    /* renamed from: i */
    public aran f87246i;

    /* renamed from: j */
    public aral f87247j;

    /* renamed from: k */
    private final Context f87248k;

    /* renamed from: l */
    private final argv f87249l;

    /* renamed from: m */
    private final ariq f87250m;

    /* renamed from: n */
    private final aqxo f87251n;

    /* renamed from: o */
    private BootstrapOptions f87252o;

    /* renamed from: p */
    private final arly f87253p;

    /* renamed from: q */
    private final aqzy f87254q;

    /* renamed from: r */
    private final adyd f87255r;

    /* renamed from: s */
    private final aram f87256s = new arax(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aray(arai arai, aqxy aqxy, ariq ariq) {
        super(f87241d, arai.f87198b, aqxy);
        aqxo aqxo = aqxo.f87044a;
        arly arly = new arly(arai.f87197a, arai.f87198b);
        aqzy aqzy = new aqzy(arai.f87197a);
        Context context = arai.f87197a;
        sdo.m34959a(context);
        this.f87248k = context;
        this.f87249l = arai.f87200d;
        this.f87242e = (armh) arai.f87199c;
        sdo.m34959a(ariq);
        this.f87250m = ariq;
        sdo.m34959a(aqxo);
        this.f87251n = aqxo;
        this.f87253p = arly;
        this.f87254q = aqzy;
        this.f87255r = asbs.m73758a(this.f87248k);
    }

    /* renamed from: f */
    private final int m72360f() {
        return this.f87255r.mo33916a("com.google").length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final aqzo mo48227a() {
        return this.f87243f;
    }

    /* renamed from: b */
    public final void mo48232b(int i) {
        this.f87249l.mo48402a(i);
        try {
            this.f87250m.mo48570a(i);
        } catch (RemoteException e) {
            f87241d.mo25417e("Error invoking callback.", e, new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo48235c() {
        BootstrapOptions bootstrapOptions = this.f87252o;
        long R = cgqs.f187523a.mo6606a().mo84305R();
        long j = (long) bootstrapOptions.f107846s;
        long s = cgqs.f187523a.mo6606a().mo84333s();
        if (R > 0 && j < s) {
            f87241d.logVerbose("Waiting %dms before sending completion.", Long.valueOf(R));
            try {
                Thread.sleep(R);
            } catch (InterruptedException e) {
                f87241d.mo25410a((Throwable) e);
            }
        }
        mo48236c(2);
        super.mo48235c();
    }

    /* renamed from: e */
    public final void mo48239e() {
        f87241d.logVerbose("cleanup()", new Object[0]);
        super.mo48239e();
        if (this.f87246i != null) {
            this.f87246i = null;
        }
        aral aral = this.f87247j;
        if (aral != null) {
            aral.mo48337b();
        }
        super.mo48237d();
        this.f87243f = null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aray.a(com.google.android.gms.smartdevice.d2d.BootstrapConfigurations, boolean):void
     arg types: [com.google.android.gms.smartdevice.d2d.BootstrapConfigurations, int]
     candidates:
      aray.a(com.google.android.gms.smartdevice.d2d.BootstrapConfigurations, int):void
      aray.a(com.google.android.gms.smartdevice.d2d.BootstrapConfigurations, boolean):void */
    /* renamed from: a */
    public final void mo48356a(BootstrapConfigurations bootstrapConfigurations, int i) {
        boolean z;
        aucb aucb;
        sdo.checkIfNull(bootstrapConfigurations, "bootstrapConfigurations cannot be null.");
        this.f87244g = bootstrapConfigurations;
        f87241d.mo25412b("Starting bootstrap", new Object[0]);
        boolean a = asbu.m73761a(this.f87252o);
        if (a) {
            this.f87247j = this.f87251n.mo48204a(this.f87248k, this.f87242e, this.f87256s, this.f87244g.f107815g, this.f87252o.f107836i);
        } else {
            this.f87246i = this.f87251n.mo48205a(this.f87248k, this.f87242e, this.f87256s, this.f87252o.f107836i, bootstrapConfigurations.f107815g, bootstrapConfigurations.f107816h);
        }
        BootstrapOptions bootstrapOptions = this.f87252o;
        if (!bootstrapOptions.f107843p || !cgqs.m146603i()) {
            z = false;
        } else {
            z = true;
        }
        int i2 = bootstrapOptions.f107844q;
        if (z && i2 > 0) {
            bootstrapConfigurations.mo59032a(i2);
        } else {
            bootstrapConfigurations.mo59032a(0);
        }
        this.f87242e.mo48650c(m72360f());
        long a2 = spn.getAndroidId(this.f87248k);
        rfi rfi = rfi.f42868a;
        bootstrapConfigurations.mo59035a(new DeviceDetails(a2, rfy.m33553j(this.f87248k)));
        araa b = this.f87252o.mo59048b();
        araa c = bootstrapConfigurations.mo59041c();
        BootstrapOptions bootstrapOptions2 = this.f87252o;
        if (cgqo.m146590b() && bootstrapOptions2.f107849v != null) {
            new arqc(this.f87248k).mo48326a(bootstrapOptions2.f107849v, bootstrapOptions2.f107839l);
            c.mo48319a(4, true);
        }
        boui a3 = arsq.m73409a(this.f87248k, this.f87252o.f107848u);
        this.f87242e.mo48644a(a3);
        boui boui = boui.NONE;
        int ordinal = a3.ordinal();
        if (ordinal == 1) {
            c.mo48319a(8, true);
        } else if (ordinal == 2) {
            c.mo48319a(9, true);
        }
        boolean a4 = b.mo48320a(5);
        boolean c2 = cgps.m146491c();
        boolean d = cgps.m146492d();
        if (cgqf.m146562c()) {
            f87241d.logVerbose("createWorkProfileTask: targetSupport=%s, supportsWorkProfileSetup=%s, workProfileFallback=%s", Boolean.valueOf(a4), Boolean.valueOf(c2), Boolean.valueOf(d));
        }
        if (d) {
            if (this.f87253p.mo48623c() == 4) {
                d = true;
            } else {
                d = false;
            }
        }
        aucb aucb2 = null;
        if (!a4) {
            aucb = null;
        } else if (!c2 && !d) {
            aucb = null;
        } else {
            c.mo48319a(6, true);
            aucb = this.f87253p.mo48620a();
        }
        bootstrapConfigurations.mo59034a(c);
        mo48357a(bootstrapConfigurations, false);
        if (bootstrapConfigurations.f107820l > 0) {
            mo48228a(this.f87252o.f107844q);
        }
        EsimActivationInfo esimActivationInfo = this.f87252o.f107850w;
        if (esimActivationInfo != null && cgpv.m146521b()) {
            c.mo48319a(7, true);
            aucb2 = this.f87254q.mo48315a(esimActivationInfo);
        }
        if (aucb2 != null) {
            aucb2.mo50380a(new sty(this.f87061b), new araw(this));
        }
        if (this.f87252o.mo59056c() || m72360f() != 0 || a3 == boui.NONE) {
            arat arat = new arat(this, a, aucb);
            if (i == 1) {
                long D = cgqs.f187523a.mo6606a().mo84291D();
                if (D > 0) {
                    f87241d.mo25412b("Delaying for %dms before sending next message", Long.valueOf(D));
                    this.f87061b.postDelayed(arat, D);
                    return;
                }
                arat.run();
                return;
            }
            arat.run();
            return;
        }
        f87241d.mo25412b("Skipping account transfer because accounts are not required, there are no accounts and WiFi D2D is supported on the device.", new Object[0]);
        mo48236c(4);
        super.mo48235c();
    }

    /* renamed from: a */
    public final void mo48357a(BootstrapConfigurations bootstrapConfigurations, boolean z) {
        f87241d.mo25412b("Sending BootstrapConfigurations.", new Object[0]);
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.mo59094a(bootstrapConfigurations);
        messagePayload.f107982i = z;
        messagePayload.f107974a.add(9);
        mo48233b(messagePayload);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48229a(MessagePayload messagePayload) {
        aral aral;
        aran aran;
        f87241d.logVerbose("Processing MessagePayload.", new Object[0]);
        DisplayText displayText = messagePayload.f107979f;
        if (displayText != null) {
            f87241d.logVerbose("Processing DisplayText", new Object[0]);
            sdo.m34959a(displayText);
            String str = displayText.f107972b;
            if (!TextUtils.isEmpty(str)) {
                this.f87062c.mo48225a(str);
            }
        }
        BootstrapOptions bootstrapOptions = messagePayload.f107977d;
        if (bootstrapOptions != null) {
            f87241d.logVerbose("Processing BootstrapOptions.", new Object[0]);
            sdo.m34959a(bootstrapOptions);
            this.f87252o = bootstrapOptions;
            if (!ascn.m73781a(bootstrapOptions.f107839l)) {
                this.f87252o.mo59045a(ascn.m73780a());
            }
            f87241d.mo25412b("from target %s", bootstrapOptions.mo59048b());
            armh armh = this.f87242e;
            armh.mo48643a(this.f87252o.f107839l);
            armh.mo48646a(this.f87252o.f107836i);
            try {
                this.f87250m.mo48571a(this.f87252o);
            } catch (RemoteException e) {
                f87241d.mo25417e("Error invoking callback.", e, new Object[0]);
            }
        }
        AccountBootstrapPayload accountBootstrapPayload = messagePayload.f107980g;
        if (!(accountBootstrapPayload == null || (aran = this.f87246i) == null)) {
            aran.mo48345a(accountBootstrapPayload);
        }
        ProgressEvent progressEvent = messagePayload.f107981h;
        if (progressEvent != null) {
            f87241d.logVerbose("Processing ProgressEvent", new Object[0]);
            this.f87062c.mo48226a(new BootstrapProgressResult(progressEvent.f107993b, new Bundle()));
        }
        AccountTransferPayload accountTransferPayload = messagePayload.f107984k;
        if (accountTransferPayload != null && (aral = this.f87247j) != null) {
            aral.mo48335a(accountTransferPayload);
        }
    }
}
