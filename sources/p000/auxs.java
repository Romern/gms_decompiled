package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.location.places.NearbyAlertFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.trustlet.place.tracker.NearbyAlertTracker$NearbyAlertReceiver;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: auxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auxs implements auxu {

    /* renamed from: a */
    public static final aunx f92741a = new aunx("TrustAgent.Tracker", "NearbyAlertTracker");

    /* renamed from: b */
    public static final aemi f92742b;

    /* renamed from: l */
    private static WeakReference f92743l = new WeakReference(null);

    /* renamed from: c */
    public final Context f92744c;

    /* renamed from: d */
    public final Object f92745d = new Object();

    /* renamed from: e */
    public boolean f92746e;

    /* renamed from: f */
    public final NearbyAlertTracker$NearbyAlertReceiver f92747f;

    /* renamed from: g */
    public final Map f92748g = new HashMap();

    /* renamed from: h */
    private int f92749h;

    /* renamed from: i */
    private final rkb f92750i;

    /* renamed from: j */
    private rjz f92751j;

    /* renamed from: k */
    private rka f92752k;

    static {
        aemh aemh = new aemh();
        aemh.f63516b = "auth";
        f92742b = aemh.mo34328a();
    }

    protected auxs(Context context) {
        this.f92744c = context;
        rjy rjy = new rjy(context);
        rjy.mo24780a(aema.f63501a, f92742b);
        rjy.mo24780a(aema.f63502b, f92742b);
        rjy.mo24779a(aeie.f63411a);
        this.f92750i = rjy.mo24784b();
        synchronized (this.f92745d) {
            this.f92747f = new NearbyAlertTracker$NearbyAlertReceiver(this);
            this.f92746e = false;
        }
        this.f92749h = 0;
    }

    /* renamed from: a */
    public static synchronized auxs m78055a(Context context) {
        auxs auxs;
        synchronized (auxs.class) {
            auxs = (auxs) f92743l.get();
            if (auxs == null) {
                auxs = new auxs(context.getApplicationContext());
                f92743l = new WeakReference(auxs);
            }
        }
        return auxs;
    }

    /* renamed from: b */
    private final PendingIntent m78056b(int i) {
        Intent intent = new Intent("com.google.android.gms.auth.trustagent.trustlet.ACTION_PERSONAL_NEARBY_ALERT");
        intent.setPackage(this.f92744c.getPackageName());
        return PendingIntent.getBroadcast(this.f92744c, i, intent, 134217728);
    }

    /* renamed from: c */
    public final void mo51030c(auxt auxt) {
        synchronized (this.f92745d) {
            if (!this.f92748g.containsKey(auxt)) {
                f92741a.mo50711a("The caller for nearby alert requests hasn't registered yet.", new Object[0]).mo50708c();
                return;
            }
            ((HashSet) this.f92748g.get(auxt)).clear();
            mo51035a();
        }
    }

    /* renamed from: b */
    public final void mo51028b(auxt auxt) {
        synchronized (this.f92745d) {
            this.f92748g.remove(auxt);
            if (!this.f92748g.isEmpty()) {
                mo51035a();
            } else if (this.f92750i.mo24805i() || this.f92750i.mo24806j()) {
                if (!this.f92750i.mo24805i()) {
                    f92741a.mo50711a("Abort removeAllRequests(), GoogleApiClient not ready yet.", new Object[0]).mo50708c();
                } else {
                    for (int i = 0; i < this.f92749h; i++) {
                        mo51036a(i);
                    }
                    this.f92749h = 0;
                    f92741a.mo50711a("removeNearbyAlerts()", new Object[0]);
                }
                if (this.f92750i.mo24805i()) {
                    if (this.f92746e) {
                        this.f92744c.unregisterReceiver(this.f92747f);
                        this.f92746e = false;
                    }
                }
                this.f92750i.mo24803g();
                this.f92750i.mo24796b(this.f92751j);
                this.f92750i.mo24797b(this.f92752k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51035a() {
        if (!this.f92750i.mo24805i()) {
            f92741a.mo50711a("Abort updateRequests(), GoogleApiClient not ready yet.", new Object[0]).mo50708c();
            return;
        }
        HashSet hashSet = new HashSet();
        synchronized (this.f92745d) {
            for (Map.Entry entry : this.f92748g.entrySet()) {
                hashSet.addAll((Collection) entry.getValue());
            }
        }
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        int length = strArr.length;
        int h = (int) chal.f188193a.mo6606a().mo84878h();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int min = Math.min(i + h, length);
            rjo rjo = aema.f63501a;
            aeny.m52274a(this.f92750i, NearbyAlertRequest.m66910a(NearbyAlertFilter.m66906b(Arrays.asList((String[]) Arrays.copyOfRange(strArr, i, min))), 2), m78056b(i2));
            i2++;
            if (((long) i2) >= chal.f188193a.mo6606a().mo84879i()) {
                f92741a.mo50711a("Places API request limit is reached.", new Object[0]).mo50706a();
                break;
            }
            i = i2 * h;
        }
        int i3 = this.f92749h;
        this.f92749h = i2;
        while (i3 > i2) {
            mo51036a(i2);
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo51029b(auxt auxt, String str) {
        if (TextUtils.isEmpty(str)) {
            f92741a.mo50711a("The place id is empty.", new Object[0]).mo50708c();
            return;
        }
        synchronized (this.f92745d) {
            if (this.f92748g.containsKey(auxt)) {
                ((HashSet) this.f92748g.get(auxt)).remove(str);
                mo51035a();
                return;
            }
            f92741a.mo50711a("The caller for nearby alert requests hasn't registered yet.", new Object[0]).mo50708c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51036a(int i) {
        rjo rjo = aema.f63501a;
        aeny.m52273a(this.f92750i, m78056b(i));
    }

    /* renamed from: a */
    public final void mo51024a(auxt auxt) {
        synchronized (this.f92745d) {
            if (this.f92748g.isEmpty()) {
                f92741a.mo50711a("startTracking", new Object[0]).mo50708c();
                if (!this.f92750i.mo24806j() && !this.f92750i.mo24805i()) {
                    auxr auxr = new auxr(this);
                    this.f92751j = auxr;
                    this.f92750i.mo24790a((rjz) auxr);
                    rka rka = auxq.f92739a;
                    this.f92752k = rka;
                    this.f92750i.mo24791a(rka);
                    this.f92750i.mo24801e();
                }
            }
            if (!this.f92748g.containsKey(auxt)) {
                this.f92748g.put(auxt, new HashSet());
            }
            if (this.f92750i.mo24805i() && this.f92746e) {
                auxt.mo51019c();
            }
        }
    }

    /* renamed from: a */
    public final void mo51025a(auxt auxt, String str) {
        aunx aunx = f92741a;
        String valueOf = String.valueOf(auxt);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("requestNearbyAlert(");
        sb.append(valueOf);
        sb.append(")");
        aunx.mo50711a(sb.toString(), new Object[0]).mo50708c();
        if (TextUtils.isEmpty(str)) {
            f92741a.mo50711a("The place id is empty.", new Object[0]).mo50708c();
            return;
        }
        synchronized (this.f92745d) {
            if (this.f92748g.containsKey(auxt)) {
                ((HashSet) this.f92748g.get(auxt)).add(str);
                mo51035a();
                return;
            }
            f92741a.mo50711a("The caller for nearby alert requests hasn't registered yet.", new Object[0]).mo50708c();
        }
    }

    /* renamed from: a */
    public final void mo51026a(auxt auxt, String[] strArr) {
        aunx aunx = f92741a;
        String valueOf = String.valueOf(auxt);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("requestNearbyAlerts(");
        sb.append(valueOf);
        sb.append(")");
        aunx.mo50711a(sb.toString(), new Object[0]).mo50708c();
        if (strArr.length == 0) {
            f92741a.mo50711a("The place id list is empty.", new Object[0]).mo50708c();
            return;
        }
        synchronized (this.f92745d) {
            if (this.f92748g.containsKey(auxt)) {
                Collections.addAll((Collection) this.f92748g.get(auxt), strArr);
                mo51035a();
                return;
            }
            f92741a.mo50711a("The caller for nearby alert requests hasn't registered yet.", new Object[0]).mo50708c();
        }
    }
}
