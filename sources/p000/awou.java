package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.wallet.service.orchestration.AddInstrumentInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.BuyflowInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.BuyflowRefreshRequest;
import com.google.android.gms.wallet.service.orchestration.EmbeddedLandingPageInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.EmbeddedLandingPageSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.EmbeddedSettingsInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.EmbeddedSettingsSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.FixInstrumentInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.IdCreditInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.IdCreditSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.InstrumentManagerRefreshRequest;
import com.google.android.gms.wallet.service.orchestration.InstrumentManagerSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.InvoiceSummaryInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.PaymentMethodsInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.PaymentMethodsSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.PurchaseManagerInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.PurchaseManagerSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.SetupWizardInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.SetupWizardSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.TimelineViewInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.TimelineViewSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.UserManagementInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.UserManagementSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.WebViewWidgetInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.WriteDocumentServerRequest;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceRequest;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: awou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awou implements awpb {

    /* renamed from: a */
    protected final BuyFlowConfig f94764a;

    /* renamed from: b */
    public final Account f94765b;

    /* renamed from: c */
    public final Set f94766c;

    /* renamed from: d */
    protected final PriorityBlockingQueue f94767d;

    /* renamed from: e */
    protected final ConcurrentLinkedQueue f94768e;

    /* renamed from: f */
    public final Context f94769f;

    /* renamed from: g */
    protected final LinkedList f94770g;

    /* renamed from: h */
    protected final String f94771h;

    /* renamed from: i */
    protected int f94772i = 0;

    /* renamed from: j */
    protected final AtomicInteger f94773j = new AtomicInteger(1);

    /* renamed from: k */
    public awxa f94774k;

    /* renamed from: l */
    public final ServiceConnection f94775l;

    /* renamed from: m */
    public awua f94776m;

    /* renamed from: n */
    public final ServiceConnection f94777n;

    /* renamed from: o */
    public awrn f94778o;

    /* renamed from: p */
    public final ServiceConnection f94779p;

    /* renamed from: q */
    public awxo f94780q;

    /* renamed from: r */
    public final ServiceConnection f94781r;

    /* renamed from: s */
    public final int f94782s;

    /* renamed from: t */
    public boolean f94783t;

    /* renamed from: u */
    public adzt f94784u;

    /* renamed from: v */
    public final CountDownLatch f94785v;

    /* renamed from: w */
    private final Thread f94786w;

    /* renamed from: a */
    public final int mo52395a(awpc awpc) {
        awpc.f94796c = false;
        this.f94766c.remove(awpc);
        int i = awpc.f94795b;
        this.f94767d.add(Integer.valueOf(i));
        return i;
    }

    /* renamed from: b */
    public final int mo52427b() {
        Integer num = (Integer) this.f94767d.peek();
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: c */
    public final synchronized void mo52428c() {
        this.f94772i = this.f94770g.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final synchronized boolean mo52429d() {
        boolean z;
        mo52396a();
        int i = this.f94772i;
        if (i > 0) {
            this.f94772i = i - 1;
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo52430e() {
        return (this.f94782s & 2) != 0;
    }

    /* renamed from: f */
    public final boolean mo52431f() {
        return (this.f94782s & 4) != 0;
    }

    /* renamed from: g */
    public final boolean mo52432g() {
        return (this.f94782s & 8) != 0;
    }

    /* renamed from: h */
    public final boolean mo52433h() {
        return (this.f94782s & 16) != 0;
    }

    public awou(int i, BuyFlowConfig buyFlowConfig, Account account, Context context) {
        this.f94764a = buyFlowConfig;
        this.f94765b = account;
        this.f94769f = context.getApplicationContext();
        this.f94766c = Collections.synchronizedSet(new LinkedHashSet());
        this.f94767d = new PriorityBlockingQueue();
        this.f94768e = new ConcurrentLinkedQueue();
        this.f94770g = new LinkedList();
        Account account2 = this.f94765b;
        String str = buyFlowConfig.f110417a;
        String str2 = account2.name;
        String str3 = account2.type;
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str3).length() + String.valueOf(str).length());
        sb.append(str2);
        sb.append(10);
        sb.append(str3);
        sb.append(10);
        sb.append(str);
        this.f94771h = sb.toString();
        this.f94782s = i;
        this.f94785v = new CountDownLatch(1);
        this.f94775l = new awov(this, "wallet");
        this.f94777n = new awow(this, "wallet");
        this.f94779p = new awox(this, "wallet");
        this.f94781r = new awoy(this, "wallet");
        awpa awpa = new awpa(this);
        this.f94786w = awpa;
        awpa.start();
        try {
            this.f94785v.await();
        } catch (InterruptedException e) {
            Log.e("NetworkPaymentServiceCo", "Unable to initialize PaymentChimeraService background thread.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo52396a() {
        this.f94770g.poll();
    }

    /* renamed from: a */
    public final void mo52397a(awpc awpc, int i) {
        awpc.f94796c = true;
        this.f94766c.add(awpc);
        if (i >= 0) {
            Iterator it = this.f94768e.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                if (message.arg1 > i) {
                    awpc.handleMessage(message);
                }
            }
            this.f94767d.remove(Integer.valueOf(i));
            long b = (long) mo52427b();
            Iterator it2 = this.f94768e.iterator();
            while (it2.hasNext() && ((long) ((Message) it2.next()).arg1) > b) {
                it2.remove();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52398a(blxm blxm) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a((bxxc) blxm)) {
            Message.obtain(this.f94784u, 41, new AddInstrumentInitializeRequest(this.f94765b, blxm)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52399a(blxw blxw, byaa byaa) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a(blxw)) {
            Message.obtain(this.f94784u, 21, new BuyflowInitializeRequest(this.f94765b, blxw, byaa)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52400a(blyo blyo, byaa byaa, bmar bmar) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a(blyo)) {
            Message.obtain(this.f94784u, 23, new BuyflowRefreshRequest(this.f94765b, blyo, byaa, bmar.f128493b)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52401a(bmqu bmqu, Uri uri, String str) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a(bmqu)) {
            Message.obtain(this.f94784u, 40, new WriteDocumentServerRequest(this.f94765b, bmqu, uri, str)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52402a(bmrj bmrj) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a((bxxc) bmrj)) {
            Message.obtain(this.f94784u, 30, new IdCreditInitializeRequest(this.f94765b, bmrj)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52403a(bmrq bmrq, bmar bmar) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a(bmrq)) {
            Message.obtain(this.f94784u, 31, new IdCreditSubmitRequest(this.f94765b, bmrq, bmar.f128492a)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52404a(bmrz bmrz, bmar bmar) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a(bmrz)) {
            Message.obtain(this.f94784u, 25, new InstrumentManagerRefreshRequest(this.f94765b, bmrz, bmar.f128493b)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52405a(bmsb bmsb, bmar bmar) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a(bmsb)) {
            Message.obtain(this.f94784u, 24, new InstrumentManagerSubmitRequest(this.f94765b, bmsb, bmar.f128492a)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52406a(bmsi bmsi) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a((bxxc) bmsi)) {
            Message.obtain(this.f94784u, 33, new PaymentMethodsInitializeRequest(this.f94765b, bmsi)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52407a(bmsn bmsn, bmar bmar) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a(bmsn)) {
            Message.obtain(this.f94784u, 34, new PaymentMethodsSubmitRequest(this.f94765b, bmsn, bmar.f128492a)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52408a(bwgk bwgk) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a((bxxc) bwgk)) {
            Message.obtain(this.f94784u, 28, new SetupWizardInitializeRequest(this.f94765b, bwgk)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52409a(bwgq bwgq, bmar bmar) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a(bwgq)) {
            Message.obtain(this.f94784u, 29, new SetupWizardSubmitRequest(this.f94765b, bwgq, bmar.f128492a)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52410a(bwiy bwiy) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a((bxxc) bwiy)) {
            Message.obtain(this.f94784u, 45, new EmbeddedLandingPageInitializeRequest(this.f94765b, bwiy)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52411a(bwjc bwjc, bmar bmar) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a(bwjc)) {
            Message.obtain(this.f94784u, 46, new EmbeddedLandingPageSubmitRequest(this.f94765b, bwjc, bmar.f128492a)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52412a(bwje bwje) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a((bxxc) bwje)) {
            Message.obtain(this.f94784u, 50, new EmbeddedSettingsInitializeRequest(this.f94765b, bwje)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52413a(bwji bwji, bmar bmar) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a(bwji)) {
            Message.obtain(this.f94784u, 51, new EmbeddedSettingsSubmitRequest(this.f94765b, bwji, bmar.f128492a)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52414a(bwjk bwjk) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a((bxxc) bwjk)) {
            Message.obtain(this.f94784u, 43, new FixInstrumentInitializeRequest(this.f94765b, bwjk)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52415a(bwjq bwjq) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a((bxxc) bwjq)) {
            Message.obtain(this.f94784u, 56, new InvoiceSummaryInitializeRequest(this.f94765b, bwjq)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52416a(bwjw bwjw) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a((bxxc) bwjw)) {
            Message.obtain(this.f94784u, 37, new PurchaseManagerInitializeRequest(this.f94765b, bwjw)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52417a(bwka bwka, bmar bmar) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a(bwka)) {
            Message.obtain(this.f94784u, 27, new PurchaseManagerSubmitRequest(this.f94765b, bwka, bmar.f128492a)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52418a(bwkp bwkp) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a((bxxc) bwkp)) {
            Message.obtain(this.f94784u, 48, new TimelineViewInitializeRequest(this.f94765b, bwkp)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52419a(bwkt bwkt, bmar bmar) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a(bwkt)) {
            Message.obtain(this.f94784u, 49, new TimelineViewSubmitRequest(this.f94765b, bwkt, bmar.f128492a)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52420a(bwld bwld) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a((bxxc) bwld)) {
            Message.obtain(this.f94784u, 53, new UserManagementInitializeRequest(this.f94765b, bwld)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52421a(bwlh bwlh, bmar bmar) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a(bwlh)) {
            Message.obtain(this.f94784u, 54, new UserManagementSubmitRequest(this.f94765b, bwlh, bmar.f128492a)).sendToTarget();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52422a(bwlj bwlj) {
        sdo.m34971a(mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!mo52425a((bxxc) bwlj)) {
            Message.obtain(this.f94784u, 61, new WebViewWidgetInitializeRequest(this.f94765b, bwlj)).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo52423a(LoadFullWalletServiceRequest loadFullWalletServiceRequest) {
        Message.obtain(this.f94784u, 36, loadFullWalletServiceRequest).sendToTarget();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52424a(ReauthProofTokenRequest reauthProofTokenRequest) {
        sdo.m34971a(mo52433h(), (Object) "Must specify connection to Reauth service!");
        Message.obtain(this.f94784u, 52, reauthProofTokenRequest).sendToTarget();
    }

    /* renamed from: a */
    public final boolean mo52425a(bxxc bxxc) {
        String valueOf = String.valueOf(this.f94771h);
        String str = valueOf.length() == 0 ? new String("") : "".concat(valueOf);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(bxxc.getClass().getSimpleName());
        sb.append(":");
        try {
            sb.append(new String(bxxc.serializeToBytes(), "UTF-8"));
            return mo52426a(sb.toString());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("UTF-8 not supported", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized boolean mo52426a(String str) {
        boolean z;
        if (!this.f94770g.contains(str)) {
            this.f94770g.add(str);
            z = false;
        } else {
            z = true;
        }
        return z;
    }
}
