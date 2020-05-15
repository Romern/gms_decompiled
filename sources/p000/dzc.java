package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: dzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dzc extends dyg {

    /* renamed from: b */
    public static final dxr f14465b = new dyw(new dyv(), "DetectedBeaconProducer", new int[]{26});

    /* renamed from: k */
    public final HashMap f14466k = new HashMap();

    /* renamed from: l */
    public final HashMap f14467l = new HashMap();

    /* renamed from: m */
    private final aixf f14468m = new dza(this);

    /* renamed from: n */
    private final drx f14469n = new dyx(this, "DetectedBeaconProducer");

    public dzc(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14465b, str, dqb);
    }

    /* renamed from: b */
    private final void m9865b(long j) {
        if (!rjs.m33679e(dwq.m9672p().mo10035a(26, j, dwq.m9652a(this.f14389e, "DetectedBeaconProducer")))) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dzc", "b", 261, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[DetectedBeaconProducer] Failed to close ongoing contexts.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.contextmanager.module.DetectedBeaconProducer");
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
        if (!rjs.m33679e(dwq.m9672p().mo10035a(26, dwq.m9665i().mo20505a(), dwq.m9652a(this.f14389e, "DetectedBeaconProducer")))) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dzc", "b", 261, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[DetectedBeaconProducer] Failed to close ongoing contexts.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
        if (!this.f14467l.isEmpty()) {
            WriteBatchImpl b = tjj.m37080b();
            long a = dwq.m9665i().mo20505a();
            for (ContextData contextData : this.f14467l.values()) {
                tip tip = new tip(contextData);
                tip.mo26571a(a);
                b.mo18101a(tip.mo26570a());
            }
            mo9852a(b);
            this.f14467l.clear();
        }
        for (dzb dzb : this.f14466k.values()) {
            PendingIntent pendingIntent = dzb.f14459e;
            if (pendingIntent != null) {
                dzb.f14456b.mo38207e(pendingIntent).mo50371a(new dqi("[DetectedBeaconProducer] unsubscribe, package=%s", dzb.f14455a));
            }
        }
    }

    /* renamed from: a */
    public final void mo9847a(Context context, Intent intent) {
        int i = ahcb.f66972a;
        ajcc.m58482a(intent, this.f14468m);
    }

    /* renamed from: a */
    public final void mo9854a(dwa dwa) {
        new Object[1][0] = dwa;
        dzb dzb = (dzb) this.f14466k.get(dwa.f14242b.mo9738a());
        if (dzb != null) {
            dzb.mo9887a(dwa);
            dwq.m9667k().mo9433a(this.f14469n);
            this.f14469n.mo9516a(dqy.m9123a("ResubscribeIfNecessary"));
        }
    }

    /* renamed from: a */
    public final void mo9855a(dwa dwa, dwa dwa2) {
        Object[] objArr = {dwa, dwa2};
        if (dwa2 != null) {
            dzb dzb = (dzb) this.f14466k.get(dwa2.f14242b.mo9738a());
            if (dzb != null) {
                dzb.mo9887a(dwa2);
            }
        }
        if (dwa.mo9752f()) {
            String a = dwa.f14242b.mo9738a();
            dzb dzb2 = (dzb) this.f14466k.get(a);
            if (dzb2 == null) {
                dzb2 = new dzb(this, this.f14388d, a);
                this.f14466k.put(a, dzb2);
            }
            new Object[1][0] = dwa;
            dzb2.f14457c.add(dwa);
            dzb2.f14461g.mo9898a(dwa, null);
        }
        dwq.m9667k().mo9433a(this.f14469n);
        this.f14469n.mo9516a(dqy.m9123a("ResubscribeIfNecessary"));
    }

    /* renamed from: a */
    public final boolean mo9889a(String str, String str2, byte[] bArr) {
        for (dzb dzb : this.f14466k.values()) {
            Iterator it = dzb.f14458d.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((BeaconStateImpl.TypeFilterImpl) it.next()).mo8039a(str, str2, bArr)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
