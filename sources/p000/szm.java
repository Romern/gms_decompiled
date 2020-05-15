package p000;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.common.stats.radio.NetworkLatencyContract;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: szm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class szm {

    /* renamed from: a */
    public static final Logger f45509a = tea.m36798a("service_state_listener");

    /* renamed from: b */
    private static WeakReference f45510b = new WeakReference(null);

    /* renamed from: c */
    private final SparseArray f45511c = new SparseArray();

    /* renamed from: d */
    private int f45512d;

    /* renamed from: e */
    private long f45513e;

    /* renamed from: f */
    private int f45514f;

    /* renamed from: g */
    private long f45515g;

    private szm() {
    }

    /* renamed from: b */
    private final synchronized void m36652b(int i) {
        szl szl = (szl) this.f45511c.get(i);
        if (szl != null) {
            f45509a.mo25412b("Stopping ServiceStateEvents listener for subId %d.", Integer.valueOf(i));
            m36649a(i).listen(szl, 0);
            this.f45511c.remove(i);
        }
    }

    /* renamed from: c */
    public final synchronized void mo26277c() {
        if (this.f45511c.size() != 0) {
            for (int i = 0; i < this.f45511c.size(); i++) {
                f45509a.mo25412b("Stopping ServiceStateEvents listener for subId %d.", Integer.valueOf(this.f45511c.keyAt(i)));
                m36649a(this.f45511c.keyAt(i)).listen((PhoneStateListener) this.f45511c.valueAt(i), 0);
            }
            this.f45511c.clear();
            return;
        }
        f45509a.mo25412b("ServiceStateEvents listener already stopped.", new Object[0]);
    }

    /* renamed from: a */
    public static final TelephonyManager m36649a(int i) {
        int i2 = Build.VERSION.SDK_INT;
        return ((TelephonyManager) rpr.m34216b().getSystemService("phone")).createForSubscriptionId(i);
    }

    /* renamed from: d */
    public static void m36653d() {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: b */
    public final void mo26276b() {
        List a = m36650a(rpr.m34216b());
        if (!a.isEmpty()) {
            new adzt(Looper.getMainLooper()).post(new szh(this, cdfn.f180658a.mo6606a().mo77417s(), (int) cdfn.f180658a.mo6606a().mo77416r(), a));
        }
    }

    /* renamed from: a */
    public static final List m36650a(Context context) {
        if (!cdfn.m132940c()) {
            f45509a.logVerbose("Service state signals disabled.", new Object[0]);
            return Collections.emptyList();
        }
        List c = szn.m36664c(context);
        Iterator it = c.iterator();
        szr.m36692a();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            szr.f45526a.logVerbose("Getting count of successful ServiceStateEvents for subscriptionId %d", Integer.valueOf(intValue));
            if (szr.m36688a(intValue, 2) >= ((long) ((int) cdfn.f180658a.mo6606a().mo77418t()))) {
                it.remove();
            }
        }
        return c;
    }

    /* renamed from: a */
    public static synchronized szm m36651a() {
        szm szm;
        synchronized (szm.class) {
            szm = (szm) f45510b.get();
            if (szm == null) {
                szm = new szm();
                f45510b = new WeakReference(szm);
            }
        }
        return szm;
    }

    /* renamed from: a */
    public final synchronized void mo26274a(long j, int i, List list) {
        if (Looper.myLooper() == null) {
            f45509a.mo25418e("Must call startListening(long, int) from a prepared Looper thread", new Object[0]);
            return;
        }
        this.f45512d = i;
        this.f45513e = j;
        this.f45514f = 0;
        this.f45515g = System.currentTimeMillis() / 1000;
        f45509a.mo25412b("Starting ServiceStateEvents listener for %d subIds: %s.", Integer.valueOf(list.size()), list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (this.f45511c.get(intValue) != null) {
                f45509a.mo25412b("ServiceStateEvents listener already started for subId %d.", Integer.valueOf(intValue));
            } else {
                f45509a.mo25412b("Starting ServiceStateEvents listener for subId %s.", Integer.valueOf(intValue));
                TelephonyManager a = m36649a(intValue);
                szl szl = new szl(this, intValue);
                m36653d();
                a.listen(szl, 1);
                this.f45511c.append(intValue, szl);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public final void mo26275a(ServiceState serviceState, int i, SignalStrength signalStrength) {
        Logger Logger = f45509a;
        Integer valueOf = Integer.valueOf(i);
        Logger.mo25412b("Service state changed for subId %d: %s, %s", valueOf, serviceState, signalStrength);
        bxvd da = cbpb.f177888i.mo74144da();
        bxyk a = tdo.m36764a(System.currentTimeMillis());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cbpb) da.f164949b).f177890a = a;
        boolean b = szn.m36663b(rpr.m34216b());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbpb) da.f164949b).f177891b = b;
        boolean a2 = szn.m36661a(rpr.m34216b());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbpb) da.f164949b).f177892c = a2;
        int a3 = cbrg.m128130a(szn.m36659a(serviceState));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbpb) da.f164949b).f177893d = a3;
        int a4 = cbrg.m128130a(szn.m36662b(serviceState));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbpb) da.f164949b).f177894e = a4;
        int a5 = szn.m36660a(serviceState, "getVoiceNetworkType");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbpb) da.f164949b).f177895f = a5;
        int a6 = szn.m36660a(serviceState, "getDataNetworkType");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbpb) da.f164949b).f177896g = a6;
        if (signalStrength != null) {
            int i2 = Build.VERSION.SDK_INT;
            int level = signalStrength.getLevel();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbpb) da.f164949b).f177897h = level;
        }
        cbpb cbpb = (cbpb) da.f164949b;
        int i3 = (cbpb.f177893d == 1 || cbpb.f177894e == 1) ? 1 : 0;
        szr.m36692a();
        cbpb cbpb2 = (cbpb) da.mo74062i();
        szr.f45526a.logVerbose("Saving a ServiceStateEvent", new Object[0]);
        ContentValues contentValues = new ContentValues();
        contentValues.put("subscription_id", valueOf);
        bxyk bxyk = cbpb2.f177890a;
        if (bxyk == null) {
            bxyk = bxyk.f165095c;
        }
        contentValues.put("event_time", Long.valueOf(tdo.m36763a(bxyk)));
        contentValues.put("event_type", (Integer) 2);
        contentValues.put(NetworkLatencyContract.NetworkLatencyColumns.SUCCESSFUL, Integer.valueOf(i3));
        contentValues.put("event_proto", cbpb2.serializeToBytes());
        szr.m36693a(contentValues);
        if (i3 != 0) {
            f45509a.mo25412b("State IN_SERVICE for subId %d. Will stop listening.", valueOf);
            m36652b(i);
        }
        int i4 = this.f45514f + 1;
        this.f45514f = i4;
        int i5 = this.f45512d;
        if (i4 >= i5) {
            f45509a.mo25412b("Reached maximum number of events (%d). Will stop listening.", Integer.valueOf(i5));
            mo26277c();
            return;
        }
        long j = this.f45515g;
        long j2 = this.f45513e;
        if (System.currentTimeMillis() / 1000 > j + j2) {
            f45509a.mo25412b("Reached maximum listening time (%ds). Will stop listening.", Long.valueOf(j2));
            mo26277c();
        }
    }
}
