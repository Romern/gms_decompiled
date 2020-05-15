package p000;

import android.content.Context;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* renamed from: autn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class autn {

    /* renamed from: g */
    private static final aunx f92495g = new aunx("TrustAgent", "CapabilityStateEvaluator");

    /* renamed from: i */
    private static WeakReference f92496i = new WeakReference(null);

    /* renamed from: a */
    public final Object f92497a = new Object();

    /* renamed from: b */
    public final Map f92498b = new HashMap();

    /* renamed from: c */
    public final Map f92499c = new HashMap();

    /* renamed from: d */
    public final ConcurrentMap f92500d = new ConcurrentHashMap();

    /* renamed from: e */
    public final auoq f92501e;

    /* renamed from: f */
    public final auoo f92502f;

    /* renamed from: h */
    private final Map f92503h = new HashMap();

    private autn(Context context) {
        aurj a = aurj.m77699a();
        a.getClass();
        auoq auoq = new auoq(context, new autk(a));
        this.f92501e = auoq;
        this.f92502f = new autl(this);
    }

    /* renamed from: a */
    public static synchronized autn m77804a(Context context) {
        autn autn;
        synchronized (autn.class) {
            autn = (autn) f92496i.get();
            if (autn == null) {
                autn = new autn(context);
                f92496i = new WeakReference(autn);
            }
        }
        return autn;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0147 A[Catch:{ InterruptedException | ExecutionException -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0148 A[Catch:{ InterruptedException | ExecutionException -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0161 A[Catch:{ InterruptedException | ExecutionException -> 0x0132 }] */
    /* renamed from: a */
    public final void mo50903a(autj autj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        autj autj2 = autj;
        synchronized (this.f92497a) {
            autp autp = autj2.f92488a;
            aunx aunx = f92495g;
            String valueOf = String.valueOf(autp.f92505b);
            boolean z5 = false;
            aunx.mo50711a(valueOf.length() == 0 ? new String("Updating capability: ") : "Updating capability: ".concat(valueOf), new Object[0]);
            autj autj3 = (autj) this.f92499c.get(autp);
            long j = autj2.f92490c;
            if (autj3 == null) {
                z2 = false;
                z = true;
            } else {
                if (j != -1) {
                    if (autj3.f92490c == -1 && this.f92503h.containsKey(autp)) {
                        f92495g.mo50711a("use last seen valid capability state.", new Object[0]);
                        autm autm = (autm) this.f92503h.get(autp);
                        this.f92498b.put(autp, Boolean.valueOf(autm.f92494b));
                        this.f92499c.put(autp, autm.f92493a);
                    }
                }
                autj3 = (autj) this.f92499c.get(autp);
                long j2 = autj3.f92490c;
                boolean z6 = autj3.f92489b;
                aunx aunx2 = f92495g;
                boolean z7 = autj2.f92489b;
                String valueOf2 = String.valueOf(this.f92498b.get(autp));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
                sb.append("counter new:");
                sb.append(j);
                sb.append(" old:");
                sb.append(j2);
                sb.append("; state new: ");
                sb.append(z7);
                sb.append(" old: ");
                sb.append(z6);
                sb.append(" user presence confirmed: ");
                sb.append(valueOf2);
                aunx2.mo50711a(sb.toString(), new Object[0]);
                if (j2 == j) {
                    if (autj2.f92489b == z6) {
                        z2 = false;
                        z = false;
                    }
                } else if (j >= j2) {
                    z2 = false;
                    z = true;
                }
                z2 = true;
                z = true;
            }
            if (!z2) {
                if (autj3 != null) {
                    autp autp2 = autj2.f92488a;
                    boolean a = mo50905a(autp2);
                    aunx aunx3 = f92495g;
                    StringBuilder sb2 = new StringBuilder(31);
                    sb2.append("isUserPresenceConfirmed = ");
                    sb2.append(a);
                    aunx3.mo50711a(sb2.toString(), new Object[0]);
                    if (z) {
                        z3 = false;
                    } else {
                        z3 = a;
                    }
                    try {
                        if (!"user_authenticated".equals(autp2.f92505b)) {
                            if (((Boolean) this.f92501e.mo50741a().get()).booleanValue()) {
                                z4 = true;
                            } else if (!z3) {
                                z4 = false;
                            }
                            if (!autj2.f92489b) {
                                if (z4) {
                                    z5 = true;
                                }
                            }
                            mo50904a(autp, z5);
                            this.f92499c.put(autp, autj2);
                            if (autj2.f92490c != -1) {
                                autm autm2 = new autm();
                                autm2.f92493a = new autj(autj2);
                                autm2.f92494b = ((Boolean) this.f92498b.get(autp)).booleanValue();
                                this.f92503h.put(autp, autm2);
                            }
                        }
                        z4 = true;
                    } catch (InterruptedException | ExecutionException e) {
                        f92495g.mo50710a("Failed to get isUserPresent()", e, new Object[0]).mo50706a();
                        z4 = false;
                    }
                    if (!autj2.f92489b) {
                    }
                    mo50904a(autp, z5);
                    this.f92499c.put(autp, autj2);
                    if (autj2.f92490c != -1) {
                    }
                }
            }
            mo50904a(autp, false);
            this.f92499c.put(autp, autj2);
            if (autj2.f92490c != -1) {
            }
        }
    }

    /* renamed from: a */
    public final void mo50904a(autp autp, boolean z) {
        aunx aunx = f92495g;
        StringBuilder sb = new StringBuilder(28);
        sb.append("confirm user presence: ");
        sb.append(z);
        boolean z2 = false;
        aunx.mo50711a(sb.toString(), new Object[0]);
        synchronized (this.f92497a) {
            if (this.f92498b.containsKey(autp)) {
                if (((Boolean) this.f92498b.get(autp)).equals(Boolean.valueOf(z))) {
                }
            }
            this.f92498b.put(autp, Boolean.valueOf(z));
            autm autm = (autm) this.f92503h.get(autp);
            if (autm != null) {
                if (((autj) this.f92499c.get(autp)).equals(autm.f92493a)) {
                    autm.f92494b = z;
                }
            }
            if (this.f92500d.containsKey(autp)) {
                z2 = true;
            }
        }
        if (z2) {
            for (aute aute : (List) this.f92500d.get(autp)) {
                aupn aupn = aute.f92480a.f109173h;
                aupn.mo50728a(auuj.m77859b(autp.f92505b, ((autr) aute.f92480a.f109171c.get(autp.f92504a.getAddress())).f92508a), z);
                aupn.mo50737d();
                aute.f92480a.mo59564g();
                HashMap hashMap = new HashMap();
                hashMap.put("trustlet_id", autp.f92504a.getAddress());
                hashMap.put("device_capability_key", autp.f92505b);
                hashMap.put("user_present_key", String.valueOf(z));
                aute.f92480a.mo59561b("capability_state_evaluation_change_for_user_present", aumv.m77341a(hashMap));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return false;
     */
    /* renamed from: a */
    public final boolean mo50905a(autp autp) {
        synchronized (this.f92497a) {
            boolean z = false;
            if (this.f92498b.containsKey(autp) && this.f92499c.containsKey(autp)) {
                if (((Boolean) this.f92498b.get(autp)).booleanValue() && ((autj) this.f92499c.get(autp)).f92489b) {
                    z = true;
                }
            }
        }
    }
}
