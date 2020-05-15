package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;
import com.google.android.gms.smartdevice.d2d.DeviceDetails;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.DisplayText;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: arem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arem extends aqxz {

    /* renamed from: d */
    public static final Logger f87517d = ascp.m73787a("D2D", "TargetDeviceBootstrapController");

    /* renamed from: e */
    public final Context f87518e;

    /* renamed from: f */
    public final BootstrapOptions f87519f;

    /* renamed from: g */
    public final ScheduledExecutorService f87520g;

    /* renamed from: h */
    public aqzo f87521h;

    /* renamed from: i */
    public boolean f87522i = false;

    /* renamed from: j */
    public araa f87523j;

    /* renamed from: k */
    public ScheduledFuture f87524k;

    /* renamed from: l */
    public final aqyn f87525l = new aqyn();

    /* renamed from: m */
    public boolean f87526m;

    /* renamed from: n */
    private final arai f87527n;

    /* renamed from: o */
    private final Queue f87528o;

    /* renamed from: p */
    private final armn f87529p;

    /* renamed from: q */
    private final area f87530q;

    /* renamed from: r */
    private final ardy f87531r;

    /* renamed from: s */
    private final arly f87532s;

    /* renamed from: t */
    private final aqzy f87533t;

    /* renamed from: u */
    private boolean f87534u;

    /* renamed from: v */
    private final ardz f87535v = new areg(this);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aqxo.a(android.content.Context, armn, ardz, boolean, boolean):area
     arg types: [android.content.Context, armn, ardz, boolean, int]
     candidates:
      aqxo.a(android.content.Context, armh, aram, boolean, boolean):aral
      aqxo.a(android.content.Context, android.os.Handler, armn, ardz, boolean):ardy
      aqxo.a(android.content.Context, armn, ardz, boolean, boolean):area */
    public arem(arai arai, aqxy aqxy, BootstrapOptions bootstrapOptions, aqxo aqxo, ScheduledExecutorService scheduledExecutorService) {
        super(f87517d, arai.f87198b, aqxy);
        this.f87529p = (armn) arai.f87199c;
        this.f87527n = arai;
        this.f87520g = scheduledExecutorService;
        Context context = arai.f87197a;
        sdo.m34959a(context);
        this.f87518e = context;
        this.f87528o = new ArrayDeque();
        sdo.m34959a(bootstrapOptions);
        this.f87519f = bootstrapOptions;
        this.f87532s = new arly(this.f87518e, this.f87061b);
        this.f87533t = new aqzy(this.f87518e);
        if (cgqo.m146590b()) {
            bootstrapOptions.mo59055c(arqc.m73292b());
        }
        sdo.m34959a(aqxo);
        if (bootstrapOptions.f107841n) {
            this.f87531r = aqxo.mo48206a(arai.f87197a, arai.f87198b, (armn) arai.f87199c, this.f87535v, !this.f87519f.f107836i);
        } else {
            this.f87531r = null;
        }
        this.f87530q = aqxo.mo48207a(arai.f87197a, (armn) arai.f87199c, this.f87535v, this.f87519f.f107836i, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final aqzo mo48227a() {
        return this.f87521h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final BootstrapCompletionResult mo48231b() {
        return this.f87525l.mo48275a();
    }

    /* renamed from: b */
    public final void mo48232b(int i) {
    }

    /* renamed from: e */
    public final void mo48239e() {
        super.mo48239e();
        super.mo48237d();
        this.f87521h = null;
        ardy ardy = this.f87531r;
        if (ardy != null) {
            ardy.mo48449a();
        }
    }

    /* renamed from: f */
    public final void mo48474f() {
        synchronized (this.f87528o) {
            while (!this.f87528o.isEmpty()) {
                if (!this.f87522i) {
                    arel arel = (arel) this.f87528o.poll();
                    Logger Logger = f87517d;
                    String valueOf = String.valueOf(arel.getClass().getSimpleName());
                    Logger.logVerbose(valueOf.length() == 0 ? new String("Processing item from Request queue: ") : "Processing item from Request queue: ".concat(valueOf), new Object[0]);
                    arel.mo48472a();
                } else {
                    f87517d.mo25414c("Bootstrap paused.", new Object[0]);
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo48475g() {
        if (!this.f87534u) {
            mo48236c(2);
            this.f87534u = true;
        }
    }

    /* renamed from: a */
    public final void mo48473a(BootstrapProgressResult bootstrapProgressResult) {
        this.f87522i = this.f87062c.mo48226a(bootstrapProgressResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48229a(MessagePayload messagePayload) {
        int i;
        f87517d.logVerbose("Processing MessagePayload.", new Object[0]);
        sdo.checkIfNull(messagePayload, "payload cannot be null.");
        ArrayList arrayList = new ArrayList();
        DisplayText displayText = messagePayload.f107979f;
        if (displayText != null) {
            arrayList.add(new arej(this.f87062c, displayText));
        }
        BootstrapConfigurations bootstrapConfigurations = messagePayload.f107978e;
        if (bootstrapConfigurations != null) {
            if (!TextUtils.isEmpty(bootstrapConfigurations.f107812d)) {
                arrayList.add(new arek(this, this.f87062c, bootstrapConfigurations));
            }
            araa c = bootstrapConfigurations.mo59041c();
            this.f87523j = c;
            aqyn aqyn = this.f87525l;
            if (!c.mo48320a(2)) {
                i = 0;
            } else {
                i = 4;
            }
            aqyn.f87102d = i;
            if (this.f87523j.mo48320a(9)) {
                this.f87525l.f87099a = 2;
                this.f87529p.mo48660a(boui.OEM_APP);
            } else if (this.f87523j.mo48320a(8)) {
                this.f87525l.f87099a = 1;
                this.f87529p.mo48660a(boui.WIFI_D2D);
            }
            this.f87526m = this.f87523j.mo48320a(6);
            if (this.f87523j.mo48320a(4)) {
                arac d = arqd.m73299d(this.f87518e);
                BootstrapOptions bootstrapOptions = this.f87519f;
                d.mo48326a(bootstrapOptions.f107849v, bootstrapOptions.f107839l);
            }
            f87517d.mo25412b("from source: %s", this.f87523j);
            DeviceDetails deviceDetails = bootstrapConfigurations.f107823o;
            if (deviceDetails != null) {
                this.f87525l.f87103e = deviceDetails.f107882b;
            }
            int i2 = bootstrapConfigurations.f107820l;
            if (this.f87519f.f107843p && i2 > 0) {
                mo48228a(i2);
            }
        }
        AccountBootstrapPayload accountBootstrapPayload = messagePayload.f107980g;
        if (accountBootstrapPayload != null) {
            arrayList.add(new arei(this.f87530q, accountBootstrapPayload));
        }
        WorkProfilePayload workProfilePayload = messagePayload.f107986m;
        if (workProfilePayload != null) {
            f87517d.mo25412b("Persisting work profile %s", Logger.m35081a(workProfilePayload.f107996b));
            this.f87526m = false;
            this.f87532s.mo48621a(workProfilePayload);
            this.f87529p.mo48668e(workProfilePayload.mo59107b());
            this.f87525l.f87102d = workProfilePayload.f107997c;
            this.f87527n.f87202f.mo48202a();
            CleanSharedSecretChimeraService.m92619a(this.f87518e);
            ScheduledFuture scheduledFuture = this.f87524k;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.f87524k = null;
                mo48475g();
            }
        }
        ArrayList arrayList2 = messagePayload.f107987n;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            this.f87533t.mo48316a(arrayList2);
            CleanSharedSecretChimeraService.m92622c(this.f87518e);
        }
        AccountTransferPayload accountTransferPayload = messagePayload.f107984k;
        if (accountTransferPayload != null) {
            arrayList.add(new areh(this.f87531r, accountTransferPayload));
        }
        if (arrayList.size() == 0) {
            f87517d.mo25414c("MessagePayload did not yield any Requests.", new Object[0]);
            if (Log.isLoggable(f87517d.f44092a, 2)) {
                Logger Logger = f87517d;
                String valueOf = String.valueOf(messagePayload.toString());
                Logger.mo25414c(valueOf.length() == 0 ? new String("MessagePayload: ") : "MessagePayload: ".concat(valueOf), new Object[0]);
            }
        }
        if (messagePayload.f107982i) {
            ArrayDeque arrayDeque = new ArrayDeque();
            synchronized (this.f87528o) {
                while (!this.f87528o.isEmpty()) {
                    arrayDeque.add((arel) this.f87528o.poll());
                }
                this.f87528o.addAll(arrayList);
                this.f87528o.addAll(arrayDeque);
            }
            this.f87522i = false;
        } else {
            synchronized (this.f87528o) {
                this.f87528o.addAll(arrayList);
            }
        }
        mo48474f();
    }
}
