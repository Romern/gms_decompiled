package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.car.CarPhoneStatus;
import java.io.PrintWriter;

/* renamed from: nme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nme extends nsb implements ojb, ojn {

    /* renamed from: a */
    public static final bnsn f36013a = odk.m28481a("CAR.INST");

    /* renamed from: b */
    final C1245ok f36014b = new C1245ok();

    /* renamed from: c */
    public volatile boolean f36015c;

    /* renamed from: d */
    private final Context f36016d;

    /* renamed from: e */
    private final nuu f36017e;

    /* renamed from: f */
    private final oln f36018f;

    /* renamed from: g */
    private ojc f36019g;

    public nme(Context context, nuu nuu, oln oln) {
        this.f36016d = context;
        this.f36017e = nuu;
        this.f36018f = oln;
    }

    /* renamed from: c */
    private static final void m26798c(nsd nsd) {
        if (nsd == null) {
            throw new IllegalArgumentException("CarPhoneStatusEventListener is null");
        }
    }

    /* renamed from: a */
    public final ofs mo20914a(bivb bivb) {
        if ((bivb.f121923a & 512) == 0) {
            return null;
        }
        this.f36015c = true;
        return this;
    }

    /* renamed from: a */
    public final void mo20649a(PrintWriter printWriter) {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo21109a() {
        return this.f36015c;
    }

    /* renamed from: b */
    public final boolean mo21112b(nsd nsd) {
        m26798c(nsd);
        synchronized (this.f36014b) {
            nmd nmd = (nmd) this.f36014b.get(nsd.f12819a);
            if (nmd == null) {
                return false;
            }
            mo21107a(nmd);
            return true;
        }
    }

    /* renamed from: c */
    public final void mo20658c() {
        throw null;
    }

    /* renamed from: a */
    public final ojh mo20646a(ojm ojm) {
        return new ojc(this, ojm);
    }

    /* renamed from: a */
    public final void mo21104a(KeyEvent keyEvent) {
        synchronized (this.f36014b) {
            int i = 0;
            while (true) {
                C1245ok okVar = this.f36014b;
                if (i < okVar.f26809h) {
                    try {
                        nmd nmd = (nmd) okVar.mo15621c(i);
                        if (nmd.f36010a > 0) {
                            nmd.f36012c.mo21506a(keyEvent);
                        }
                    } catch (RemoteException e) {
                        bnsi c = f36013a.mo68388c();
                        c.mo68437a(e);
                        c.mo68432a("nme", "a", 257, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68405a("Error calling onInput()");
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21105a(CarPhoneStatus carPhoneStatus) {
        this.f36018f.mo22279c();
        if (!this.f36015c) {
            throw new IllegalStateException("CarNotConnected");
        } else if (this.f36019g != null) {
            int i = 0;
            while (true) {
                CarPhoneStatus.CarCall[] carCallArr = carPhoneStatus.f29355a;
                if (i >= carCallArr.length) {
                    break;
                }
                nuu.m27793a(carCallArr[i].f29362f);
                i++;
            }
            bxvd da = bitm.f121674d.mo74144da();
            CarPhoneStatus.CarCall[] carCallArr2 = carPhoneStatus.f29355a;
            if (carCallArr2 != null) {
                for (CarPhoneStatus.CarCall carCall : carCallArr2) {
                    bitl a = bitl.m102818a(carCall.f29357a);
                    bxvd da2 = bitj.f121654h.mo74144da();
                    bitl bitl = (bitl) ooe.m29303a(a).mo22383a(bitl.UNKNOWN);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bitj bitj = (bitj) da2.f164949b;
                    bitj.f121657b = bitl.f121673h;
                    int i2 = bitj.f121656a | 1;
                    bitj.f121656a = i2;
                    int i3 = carCall.f29358b;
                    int i4 = i2 | 2;
                    bitj.f121656a = i4;
                    bitj.f121658c = i3;
                    String str = carCall.f29359c;
                    if (str != null) {
                        str.getClass();
                        i4 |= 4;
                        bitj.f121656a = i4;
                        bitj.f121659d = str;
                    }
                    String str2 = carCall.f29360d;
                    if (str2 != null) {
                        str2.getClass();
                        i4 |= 8;
                        bitj.f121656a = i4;
                        bitj.f121660e = str2;
                    }
                    String str3 = carCall.f29361e;
                    if (str3 != null) {
                        str3.getClass();
                        bitj.f121656a = i4 | 16;
                        bitj.f121661f = str3;
                    }
                    byte[] bArr = carCall.f29362f;
                    if (bArr != null) {
                        bxtx a2 = bxtx.m123261a(bArr);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bitj bitj2 = (bitj) da2.f164949b;
                        a2.getClass();
                        bitj2.f121656a |= 32;
                        bitj2.f121662g = a2;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bitm bitm = (bitm) da.f164949b;
                    bitj bitj3 = (bitj) da2.mo74062i();
                    bitj3.getClass();
                    if (!bitm.f121677b.mo73666a()) {
                        bitm.f121677b = bxvk.m124021a(bitm.f121677b);
                    }
                    bitm.f121677b.add(bitj3);
                }
            }
            int i5 = carPhoneStatus.f29356b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bitm bitm2 = (bitm) da.f164949b;
            bitm2.f121676a |= 1;
            bitm2.f121678c = i5;
            this.f36019g.mo22206a(32769, (bitm) da.mo74062i());
        } else {
            throw new IllegalStateException("PhoneStatusEndpoint not set.");
        }
    }

    /* renamed from: a */
    public final void mo21106a(String str, String str2, int i) {
        synchronized (this.f36014b) {
            int i2 = 0;
            while (true) {
                C1245ok okVar = this.f36014b;
                if (i2 < okVar.f26809h) {
                    try {
                        nsd nsd = ((nmd) okVar.mo15621c(i2)).f36012c;
                        Parcel bj = nsd.mo8529bj();
                        bj.writeString(str);
                        bj.writeString(str2);
                        bj.writeInt(i);
                        nsd.mo8530c(2, bj);
                    } catch (RemoteException e) {
                        bnsi c = f36013a.mo68388c();
                        c.mo68437a(e);
                        c.mo68432a("nme", "a", 242, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68405a("Error calling onInput()");
                    }
                    i2++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21107a(nmd nmd) {
        nmd.f36012c.f12819a.unlinkToDeath(nmd, 0);
        this.f36014b.remove(nmd.f36012c.f12819a);
    }

    /* renamed from: a */
    public final void mo21108a(nsd nsd, CarPhoneStatus carPhoneStatus) {
        m26798c(nsd);
        mo21105a(carPhoneStatus);
    }

    /* renamed from: a */
    public final void mo20651a(ojh ojh) {
        this.f36019g = (ojc) ojh;
    }

    /* renamed from: a */
    public final boolean mo21110a(int i, nsd nsd) {
        if (this.f36017e.mo21622a(this.f36016d, Binder.getCallingUid())) {
            m26798c(nsd);
            synchronized (this.f36014b) {
                if (!this.f36014b.containsKey(nsd.f12819a)) {
                    nmd nmd = new nmd(this, i, nsd);
                    try {
                        nmd.f36012c.f12819a.linkToDeath(nmd, 0);
                        this.f36014b.put(nsd.f12819a, nmd);
                    } catch (RemoteException e) {
                        bnsi c = f36013a.mo68388c();
                        c.mo68437a(e);
                        c.mo68432a("nme", "a", (int) MfiClientException.TYPE_MFICLIENT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68405a("Adding listener failed");
                        return false;
                    }
                }
            }
            return true;
        }
        throw new SecurityException("Wrong signature - go/gearhead-retail-device");
    }

    /* renamed from: a */
    public final boolean mo21111a(nsd nsd) {
        return mo21110a(0, nsd);
    }
}
