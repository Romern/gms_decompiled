package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.telecom.TelecomManager;
import android.view.KeyEvent;
import com.google.android.gms.car.CarCall;
import com.google.android.gms.car.InCallServiceImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: nkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nkw extends nrh {

    /* renamed from: a */
    public static final bnsn f35922a = odk.m28481a("CAR.TEL.Service");

    /* renamed from: b */
    public final Object f35923b = new Object();

    /* renamed from: c */
    final Map f35924c = new HashMap();

    /* renamed from: d */
    public InCallServiceImpl f35925d;

    /* renamed from: e */
    public final nku f35926e = new nku(this);

    /* renamed from: f */
    public final nla f35927f;

    /* renamed from: g */
    boolean f35928g;

    /* renamed from: h */
    ComponentName f35929h;

    /* renamed from: i */
    final ntt f35930i = new nkr(this);

    /* renamed from: j */
    final nib f35931j = new nks(this);

    /* renamed from: k */
    private final Context f35932k;

    /* renamed from: l */
    private final TelecomManager f35933l;

    /* renamed from: m */
    private final nkt f35934m = new nkt(this);

    /* renamed from: n */
    private volatile ntv f35935n;

    public nkw(Context context) {
        this.f35932k = context;
        this.f35933l = (TelecomManager) context.getSystemService("telecom");
        this.f35927f = nla.m26709a();
        if (ccwj.m131930b()) {
            m26673a(npp.f36340b);
        } else {
            m26673a(npp.f36339a);
        }
    }

    /* renamed from: a */
    private final void m26673a(ComponentName componentName) {
        if (!this.f35928g) {
            bnsi d = f35922a.mo68390d();
            d.mo68432a("nkw", "a", 84, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Binding to InCallService");
            Intent component = new Intent().setComponent(componentName);
            component.setAction("local_action");
            boolean a = skh.m35531a().mo25690a(this.f35932k, component, this.f35934m, 1);
            this.f35928g = a;
            if (!a) {
                bnsi b = f35922a.mo68387b();
                b.mo68432a("nkw", "a", 91, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Failed to bind to InCallService");
                return;
            }
            this.f35929h = componentName;
        }
    }

    /* renamed from: g */
    private final void m26676g() {
        try {
            bnsi d = f35922a.mo68390d();
            d.mo68432a("nkw", "g", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Unbinding from InCallService");
            skh.m35531a().mo25689a(this.f35932k, this.f35934m);
        } catch (IllegalArgumentException | IllegalStateException e) {
            if (!this.f35928g) {
                e.getMessage();
            } else {
                throw e;
            }
        }
        this.f35928g = false;
        this.f35929h = null;
    }

    /* renamed from: h */
    private final nhl m26677h() {
        if (this.f35935n != null) {
            int i = Build.VERSION.SDK_INT;
            if (this.f35935n.f36486a.getCallAudioState() != null) {
                return new nhl(this.f35935n.f36486a.getAudioState());
            }
            bnsi c = f35922a.mo68388c();
            c.mo68432a("nkw", "h", 280, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("mPhone.getCallAudioState() is null");
        }
        return null;
    }

    /* renamed from: i */
    private final void m26678i() {
        if (this.f35935n != null) {
            List a = this.f35935n.mo21578a();
            a.size();
            for (int i = 0; i < a.size(); i++) {
                ((nid) a.get(i)).mo20727b(this.f35931j);
            }
            ntv ntv = this.f35935n;
            ntt ntt = this.f35930i;
            ntt ntt2 = ntv.f36487b;
            if (ntt2 == null || ntt == ntt2) {
                ntv.f36487b = null;
                ntv.f36486a.removeListener(ntv.f36488c);
            } else {
                throw new IllegalStateException("Wrong listener");
            }
        }
        nla nla = this.f35927f;
        bnsi d = nla.f35936a.mo68390d();
        d.mo68432a("nla", "b", 148, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("clearCalls");
        ArrayList arrayList = new ArrayList(nla.f35938b.values());
        nla.f35938b.clear();
        bnsi d2 = f35922a.mo68390d();
        d2.mo68432a("nkw", "i", 333, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68405a("Clearing calls during remotePhone");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            CarCall carCall = (CarCall) arrayList.get(i2);
            synchronized (this.f35923b) {
                for (nkv nkv : this.f35924c.values()) {
                    try {
                        nkv.f35921b.mo21480b(carCall);
                    } catch (RemoteException e) {
                        bnsi b = f35922a.mo68387b();
                        b.mo68437a(e);
                        b.mo68432a("nkw", "i", 341, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68405a("RemoteException in CarCallListener.");
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private final boolean m26679j() {
        if (this.f35932k.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            return true;
        }
        bnsi d = f35922a.mo68390d();
        d.mo68432a("nkw", "j", 511, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Caller does not have %s", "android.permission.READ_PHONE_STATE");
        return false;
    }

    /* renamed from: b */
    public final void mo21004b() {
        if (ccwj.m131930b()) {
            m26675a(npp.f36340b, npp.f36339a);
        } else {
            m26675a(npp.f36339a, npp.f36340b);
        }
    }

    /* renamed from: c */
    public final List mo21007c() {
        if (m26679j()) {
            return new ArrayList(this.f35927f.f35938b.values());
        }
        return Collections.emptyList();
    }

    /* renamed from: d */
    public final void mo21009d(CarCall carCall) {
        nid a = this.f35927f.mo21024a(carCall);
        if (a != null) {
            a.f35688a.unhold();
        }
    }

    /* renamed from: e */
    public final int mo21011e() {
        nhl h = m26677h();
        if (h != null) {
            return h.mo20684b();
        }
        return 0;
    }

    /* renamed from: f */
    public final int mo21013f() {
        nhl h = m26677h();
        if (h != null) {
            return h.mo20685c();
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo21012e(CarCall carCall) {
        nid a = this.f35927f.mo21024a(carCall);
        if (a != null) {
            a.f35688a.stopDtmfTone();
        }
    }

    /* renamed from: f */
    public final void mo21014f(CarCall carCall) {
        nid a = this.f35927f.mo21024a(carCall);
        if (a != null) {
            a.f35688a.splitFromConference();
        }
    }

    /* renamed from: b */
    public final void mo21005b(CarCall carCall) {
        nid a = this.f35927f.mo21024a(carCall);
        if (a == null) {
            this.f35933l.endCall();
        } else {
            a.f35688a.disconnect();
        }
    }

    /* renamed from: c */
    public final void mo21008c(CarCall carCall) {
        nid a = this.f35927f.mo21024a(carCall);
        if (a != null) {
            a.f35688a.hold();
        }
    }

    /* renamed from: d */
    public final boolean mo21010d() {
        nhl h = m26677h();
        return h != null && h.mo20683a();
    }

    /* renamed from: a */
    private final void m26674a(ComponentName componentName, int i) {
        String className = componentName.getClassName();
        if (onz.m29292a(this.f35932k, className) != i) {
            onz.m29293a(this.f35932k, className, i);
        }
    }

    /* renamed from: a */
    private final void m26675a(ComponentName componentName, ComponentName componentName2) {
        bryx.m114908a(componentName.getShortClassName());
        if (this.f35928g && !this.f35929h.equals(componentName)) {
            m26676g();
        }
        m26674a(componentName, 1);
        m26674a(componentName2, 2);
        m26673a(componentName);
    }

    /* renamed from: b */
    public final boolean mo21006b(nrj nrj) {
        if (nrj == null) {
            return false;
        }
        synchronized (this.f35923b) {
            nkv nkv = (nkv) this.f35924c.get(nrj.f12819a);
            if (nkv == null) {
                return false;
            }
            mo21000a(nkv);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo20989a() {
        InCallServiceImpl inCallServiceImpl = this.f35925d;
        if (inCallServiceImpl != null) {
            inCallServiceImpl.f29408a.remove(this.f35926e);
        }
        m26676g();
        m26678i();
    }

    /* renamed from: a */
    public final void mo20990a(int i) {
        ntv ntv = this.f35935n;
        if (ntv == null) {
            bnsi c = f35922a.mo68388c();
            c.mo68432a("nkw", "a", 262, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68409a("Can't set the audio route to %d. Phone is null.", i);
            return;
        }
        ntv.f36486a.setAudioRoute(i);
    }

    /* renamed from: a */
    public final void mo20991a(Uri uri, Bundle bundle) {
        Intent intent = new Intent("android.intent.action.CALL_PRIVILEGED", uri);
        intent.addFlags(268435456);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        Binder.clearCallingIdentity();
        this.f35932k.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo20992a(KeyEvent keyEvent) {
        synchronized (this.f35923b) {
            for (nkv nkv : this.f35924c.values()) {
                try {
                    nrj nrj = nkv.f35921b;
                    Parcel bj = nrj.mo8529bj();
                    dcl.m8165a(bj, keyEvent);
                    nrj.mo8530c(1, bj);
                } catch (RemoteException e) {
                    bnsi b = f35922a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("nkw", "a", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("RemoteException dispatching phone key event to CarCallListener");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20993a(CarCall carCall) {
        nid a = this.f35927f.mo21024a(carCall);
        if (a == null) {
            this.f35933l.acceptRingingCall();
        } else {
            a.f35688a.answer(0);
        }
    }

    /* renamed from: a */
    public final void mo20994a(CarCall carCall, char c) {
        nid a = this.f35927f.mo21024a(carCall);
        if (a != null) {
            a.f35688a.playDtmfTone(c);
        }
    }

    /* renamed from: a */
    public final void mo20995a(CarCall carCall, CarCall carCall2) {
        nid a = this.f35927f.mo21024a(carCall);
        nid a2 = this.f35927f.mo21024a(carCall2);
        if (a != null && a2 != null) {
            a.f35688a.conference(a2.f35688a);
        }
    }

    /* renamed from: a */
    public final void mo20996a(CarCall carCall, String str, Bundle bundle) {
        if (ccwj.m131930b()) {
            this.f35927f.mo21024a(carCall).f35688a.sendCallEvent(str, bundle);
        }
    }

    /* renamed from: a */
    public final void mo20997a(CarCall carCall, boolean z) {
        nid a = this.f35927f.mo21024a(carCall);
        if (a != null) {
            a.f35688a.postDialContinue(z);
        }
    }

    /* renamed from: a */
    public final void mo20998a(CarCall carCall, boolean z, String str) {
        nid a = this.f35927f.mo21024a(carCall);
        if (a == null) {
            this.f35933l.endCall();
        } else {
            a.f35688a.reject(z, str);
        }
    }

    /* renamed from: a */
    public final void mo20999a(String str) {
        if (ccwj.m131930b()) {
            mo20991a(Uri.fromParts("tel", str, null), (Bundle) null);
            return;
        }
        Intent intent = new Intent("android.intent.action.CALL_PRIVILEGED", Uri.fromParts("tel", str, null));
        intent.addFlags(268435456);
        Binder.clearCallingIdentity();
        this.f35932k.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo21000a(nkv nkv) {
        nkv.f35921b.f12819a.unlinkToDeath(nkv, 0);
        this.f35924c.remove(nkv.f35921b.f12819a);
    }

    /* renamed from: a */
    public final void mo21001a(ntv ntv) {
        bnsi d = f35922a.mo68390d();
        d.mo68432a("nkw", "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("setPhone: %s", ntv);
        m26678i();
        this.f35935n = ntv;
        if (this.f35935n != null) {
            ntv ntv2 = this.f35935n;
            ntt ntt = this.f35930i;
            if (ntv2.f36487b == null) {
                ntv2.f36487b = ntt;
                ntv2.f36486a.addListener(ntv2.f36488c);
                this.f35935n.mo21578a().size();
                for (nid nid : this.f35935n.mo21578a()) {
                    this.f35927f.mo21022a(nid);
                    nid.mo20725a(this.f35931j);
                }
                return;
            }
            throw new IllegalStateException("Non-null listener");
        }
    }

    /* renamed from: a */
    public final void mo21002a(boolean z) {
        ntv ntv = this.f35935n;
        if (ntv != null) {
            ntv.f36486a.setMuted(z);
        }
    }

    /* renamed from: a */
    public final boolean mo21003a(nrj nrj) {
        if (!m26679j()) {
            throw new SecurityException("Missing READ_PHONE_STATE");
        } else if (nrj == null) {
            return false;
        } else {
            synchronized (this.f35923b) {
                if (!this.f35924c.containsKey(nrj.f12819a)) {
                    nkv nkv = new nkv(this, nrj);
                    try {
                        nrj.f12819a.linkToDeath(nkv, 0);
                        this.f35924c.put(nrj.f12819a, nkv);
                    } catch (RemoteException e) {
                        bnsi b = f35922a.mo68387b();
                        b.mo68437a(e);
                        b.mo68432a("nkw", "a", 315, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68405a("RemoteException setting death recipient for CarCallListener.");
                    }
                }
            }
            return true;
        }
    }
}
