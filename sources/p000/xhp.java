package p000;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.view.MultiTransportViewOptions;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class xhp implements xzq {

    /* renamed from: m */
    private static final Logger f52302m = new Logger(new String[]{"RequestController"}, (short[]) null);

    /* renamed from: a */
    protected Handler f52303a = new adzt(Looper.getMainLooper());

    /* renamed from: b */
    protected final Runnable f52304b = new xho(this);

    /* renamed from: c */
    public xwj f52305c;

    /* renamed from: d */
    public xxj f52306d;

    /* renamed from: e */
    public xay f52307e;

    /* renamed from: f */
    protected xzb f52308f;

    /* renamed from: g */
    protected xzz f52309g;

    /* renamed from: h */
    protected Map f52310h;

    /* renamed from: i */
    protected Map f52311i;

    /* renamed from: j */
    protected xzh f52312j;

    /* renamed from: k */
    protected xyy f52313k;

    /* renamed from: l */
    public xwg f52314l;

    /* renamed from: a */
    public abstract void mo29752a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29753a(int i, Transport transport) {
        f52302m.mo25412b(String.format("showViewForTransport %s", transport), new Object[0]);
        Map map = this.f52310h;
        if (map == null) {
            f52302m.mo25416d("Got request for transport %s before initialization", transport);
            return;
        }
        xhq xhq = (xhq) map.get(transport);
        if (xhq == null) {
            f52302m.mo25416d("Got request for transport %s that isn't running", transport);
            return;
        }
        xhq.mo29764a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29756a(JSONObject jSONObject);

    /* renamed from: b */
    public abstract void mo29757b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29758b(Set set) {
        f52302m.mo25412b("selectInitialView", new Object[0]);
        xzh xzh = this.f52312j;
        xfo d = this.f52306d.mo30224d();
        bmxy.m108581a(d);
        Transport transport = null;
        if (!xzh.f53446a.isEmpty()) {
            if (xzh.f53446a.size() == 1) {
                transport = (Transport) xzh.f53446a.iterator().next();
            } else if (d.f52132d - 1 != 0) {
                HashSet a = bnpf.m110047a();
                List list = ((xfp) d).f52133a;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        Logger Logger = xzh.f53445b;
                        String valueOf = String.valueOf(a);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                        sb.append("Returning transports ");
                        sb.append(valueOf);
                        Logger.mo25414c(sb.toString(), new Object[0]);
                        break;
                    }
                    List list2 = ((xfr) list.get(i)).f52138a.f31913d;
                    if (list2 != null && !list2.isEmpty()) {
                        Logger logger2 = xzh.f53445b;
                        String valueOf2 = String.valueOf(list2);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
                        sb2.append("Adding transports from key handle: ");
                        sb2.append(valueOf2);
                        logger2.mo25414c(sb2.toString(), new Object[0]);
                        a.addAll(list2);
                        i++;
                    }
                }
                xzh.f53445b.mo25414c("Key handle has empty transports, returning null", new Object[0]);
                a = null;
                if (a != null && !a.isEmpty()) {
                    bnpd b = bnpf.m110055b(xzh.f53446a, a);
                    if (b.isEmpty()) {
                        xzh.f53445b.mo25414c(String.format("Intersection of enabled transports %s and key handle transports %s is empty", xzh.f53446a, a), new Object[0]);
                    } else if (b.size() != 1) {
                        Logger logger3 = xzh.f53445b;
                        String valueOf3 = String.valueOf(b);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 49);
                        sb3.append("Enabled transports and key handles had ");
                        sb3.append(valueOf3);
                        sb3.append(" in common");
                        logger3.mo25414c(sb3.toString(), new Object[0]);
                    } else {
                        transport = (Transport) ((bnox) b).iterator().next();
                        Logger logger4 = xzh.f53445b;
                        String valueOf4 = String.valueOf(transport);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 49);
                        sb4.append("Enabled transports and key handles had ");
                        sb4.append(valueOf4);
                        sb4.append(" in common");
                        logger4.mo25414c(sb4.toString(), new Object[0]);
                    }
                } else {
                    xzh.f53445b.mo25414c("Key handle had no transports", new Object[0]);
                }
                if (transport == null) {
                    transport = xzh.mo30284a();
                }
                if (transport == null) {
                    transport = xzh.mo30285b();
                }
            } else {
                transport = xzh.mo30284a();
                if (transport == null) {
                    transport = xzh.mo30285b();
                }
            }
        }
        if (transport == null) {
            this.f52309g.mo30295a(1, new MultiTransportViewOptions(set));
        } else {
            mo29753a(1, transport);
        }
    }

    /* renamed from: c */
    public abstract void mo29759c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo29760d();

    /* renamed from: e */
    public synchronized void mo29761e() {
        f52302m.mo25412b("pause", new Object[0]);
        Map map = this.f52310h;
        if (map != null) {
            for (xhq xhq : map.values()) {
                if (xhq != null) {
                    xhq.mo29767c();
                }
            }
        }
    }

    /* renamed from: f */
    public synchronized void mo29762f() {
        f52302m.mo25412b("finish", new Object[0]);
        this.f52303a.removeCallbacks(this.f52304b);
        f52302m.mo25414c("Timeout Runnable is removed, and timer is stopped.", new Object[0]);
        Map map = this.f52310h;
        if (map != null) {
            for (xhq xhq : map.values()) {
                if (xhq != null) {
                    xhq.mo29768d();
                }
            }
            this.f52310h = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo29754a(StateUpdate stateUpdate) {
        f52302m.mo25412b(String.format("onUserAction %s", stateUpdate.f31876f), new Object[0]);
        bmxy.m108581a(stateUpdate);
        StateUpdate.Type type = StateUpdate.Type.CANCEL;
        int ordinal = stateUpdate.f31875e.ordinal();
        if (ordinal == 4) {
            mo29756a(stateUpdate.mo18793a());
        } else if (ordinal == 5) {
            JSONObject a = stateUpdate.mo18793a();
            f52302m.mo25412b(String.format("handleUserViewSelection %s", a), new Object[0]);
            try {
                ViewOptions a2 = ViewOptions.m23647a(a);
                Transport b = a2.mo18854b();
                if (b != null) {
                    xhq xhq = (xhq) this.f52310h.get(b);
                    if (xhq == null) {
                        f52302m.mo25416d(String.format("View requested for transport %s when controller isn't running", a2.mo18854b()), new Object[0]);
                        return;
                    }
                    xhq.mo29765a(a2);
                } else if (!yav.MULTI_TRANSPORT.equals(a2.mo18855c())) {
                    f52302m.mo25416d(String.format("Expected multiple_transports, got %s", a2.mo18855c()), new Object[0]);
                } else {
                    this.f52309g.mo30295a(3, a2);
                }
            } catch (JSONException e) {
                f52302m.mo25416d("Malformed or unrecognized view options %s", a, e);
                this.f52314l.mo30184a(this.f52305c, e);
            }
        } else if (ordinal == 6) {
            JSONObject a3 = stateUpdate.mo18793a();
            f52302m.mo25412b(String.format("handleUserTransportSelection %s", a3), new Object[0]);
            try {
                mo29753a(3, Transport.m23428a(a3.getString("transport")));
            } catch (JSONException | xhk e2) {
                f52302m.mo25415d("Missing or malformed required field \"transport\"", e2, new Object[0]);
                this.f52314l.mo30184a(this.f52305c, e2);
            }
        } else if (ordinal != 7) {
            f52302m.mo25418e(String.format("Unimplemented user action type %s", stateUpdate.f31875e), new Object[0]);
        } else {
            JSONObject a4 = stateUpdate.mo18793a();
            f52302m.mo25412b(String.format("handleCurrentViewUpdate %s", a4), new Object[0]);
            try {
                ViewOptions a5 = ViewOptions.m23647a(a4);
                Map map = this.f52310h;
                if (map != null) {
                    for (xhq xhq2 : map.values()) {
                        xhq2.mo29769e();
                    }
                    xzz xzz = this.f52309g;
                    xzz.f53506c.mo25412b("updateCurrentView %s", a5);
                    xzz.f53507a = a5;
                    xzz.f53508b = 2;
                    return;
                }
                f52302m.mo25416d("No transport controllers initialized", new Object[0]);
            } catch (JSONException e3) {
                f52302m.mo25416d("Malformed or unrecognized view options %s", a4, e3);
                this.f52314l.mo30184a(this.f52305c, e3);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo29755a(Set set) {
        xws xws;
        byte[] bArr;
        f52302m.mo25412b("startU2fTransports", new Object[0]);
        if (set.isEmpty()) {
            mo30061a((Transport) null, new ErrorResponseData(ErrorCode.CONFIGURATION_UNSUPPORTED));
            return;
        }
        if (this.f52310h == null) {
            this.f52310h = new HashMap();
        }
        xfo d = this.f52306d.mo30224d();
        ByteString a = d.mo29694a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Transport transport = (Transport) it.next();
            xhq xhq = (xhq) this.f52310h.get(transport);
            if (xhq == null) {
                xzr xzr = (xzr) this.f52311i.get(transport);
                if (xzr == null) {
                    f52302m.mo25418e("Enabled transport %s has no controller factory", transport);
                    return;
                }
                if (d.f52132d == 2) {
                    byte[] k = a.getKey();
                    bmxy.m108600b(d.f52132d == 2);
                    xfp xfp = (xfp) d;
                    xzb xzb = this.f52308f;
                    List list = xfp.f52133a;
                    bmxy.m108581a(transport);
                    bmxy.m108581a(k);
                    Collections.sort(list, new xza(transport));
                    ArrayList arrayList = new ArrayList(list);
                    bmxy.m108581a(transport);
                    bmxy.m108581a(k);
                    String encodeToString = Base64.encodeToString(k, 11);
                    xzi.f53449f.mo25414c("getLastSuccessfulKeyHandleValueForTransportAndAppIdHash(%s, %s)", transport.f31675g, encodeToString);
                    ((xzi) xzb).f53452d.lock();
                    try {
                        String a2 = ((xzi) xzb).f53453e.mo30181a(xzi.m43684a(transport, encodeToString));
                        if (a2 != null) {
                            bArr = Base64.decode(a2, 11);
                        } else {
                            bArr = null;
                        }
                        ((xzi) xzb).f53452d.unlock();
                        int i = 0;
                        while (true) {
                            if (i >= arrayList.size()) {
                                break;
                            }
                            xfr xfr = (xfr) arrayList.get(i);
                            if (!Arrays.equals(xfr.f52138a.f31911b, bArr)) {
                                i++;
                            } else if (i != 0) {
                                xzb.f53421a.mo25414c(String.format(Locale.US, "Found cached key handle at index %d, reordering to index 0", Integer.valueOf(i)), new Object[0]);
                                arrayList.remove(i);
                                arrayList.add(0, xfr);
                            } else {
                                xzb.f53421a.mo25414c("Found cached key handle, already at index 0, leaving unchanged", new Object[0]);
                            }
                        }
                        d = new xfp(xfp.f52131c, arrayList);
                    } catch (Throwable th) {
                        ((xzi) xzb).f53452d.unlock();
                        throw th;
                    }
                }
                xwg xwg = this.f52314l;
                if (xwg instanceof xws) {
                    xws = (xws) xwg;
                } else if (xwg instanceof xwn) {
                    xws = ((xwn) xwg).mo30188a();
                } else {
                    throw new IllegalStateException("Unable to create the event logger");
                }
                xhq a3 = xzr.mo30272a(this.f52305c, this, d, this.f52309g, xws);
                this.f52310h.put(transport, a3);
                a3.mo29763a();
            } else {
                xhq.mo29766b();
            }
        }
    }
}
