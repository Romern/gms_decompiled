package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: pxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pxf extends aaab {

    /* renamed from: a */
    public final WeakReference f40556a;

    /* renamed from: b */
    private final pwp f40557b;

    /* renamed from: c */
    private final List f40558c;

    /* renamed from: d */
    private final String f40559d;

    /* renamed from: e */
    private final List f40560e;

    /* renamed from: f */
    private final phy f40561f;

    public pxf(pwp pwp, List list, String str, List list2, rnt rnt, phy phy) {
        super(161, "BroadcastPrecacheMessageOperation");
        this.f40557b = pwp;
        this.f40558c = list;
        this.f40559d = str;
        this.f40560e = list2;
        this.f40556a = new WeakReference(rnt);
        this.f40561f = phy;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        String string;
        String string2;
        pwp pwp = this.f40557b;
        List list = this.f40558c;
        String str = puc.f40227a;
        String str2 = this.f40559d;
        List list2 = this.f40560e;
        phy phy = this.f40561f;
        pxe pxe = new pxe(this);
        String a = puc.m31343a(str2, list2, pwp.f40511d.incrementAndGet());
        try {
            if (pwp.f40513f == null) {
                pwp.f40513f = InetAddress.getByName("239.255.3.22");
            }
            long currentTimeMillis = System.currentTimeMillis();
            pwn pwn = pwp.f40508a;
            pwo pwo = r10;
            pwo pwo2 = new pwo(pwp, phy, currentTimeMillis, list, str, a, pxe);
            byte[] bArr = pwn.f40491g;
            CastDevice castDevice = null;
            if (bArr == null) {
                String a2 = pwn.mo23772a("MULTICAST_SENDER_KEY");
                if (a2 == null || (string2 = pwn.f40489e.getString(a2, null)) == null) {
                    bArr = null;
                } else {
                    try {
                        pwn.f40491g = Base64.decode(string2, 0);
                        bArr = pwn.f40491g;
                    } catch (IllegalArgumentException e) {
                        pwn.f40485a.mo23677d("Failed to decode senderKey.", new Object[0]);
                        bArr = null;
                    }
                }
            }
            pwn.f40491g = bArr;
            if (pwn.f40491g != null) {
                blse blse = pwn.f40492h;
                if (blse == null) {
                    String a3 = pwn.mo23772a("MULTICAST_WRAPPED_SENDER_KEY");
                    if (a3 == null || (string = pwn.f40489e.getString(a3, null)) == null) {
                        blse = null;
                    } else {
                        try {
                            pwn.f40492h = (blse) GeneratedMessageLite.m124016a(blse.f127570b, Base64.decode(string, 0), bxus.m123744c());
                            blse = pwn.f40492h;
                        } catch (bxwf e2) {
                            pwn.f40485a.mo23677d("Failed to decode WrappedSenderKey.", new Object[0]);
                            blse = null;
                        }
                    }
                }
                pwn.f40492h = blse;
                blse blse2 = pwn.f40492h;
                if (blse2 != null && blse2.f127572a > System.currentTimeMillis()) {
                    pwo.mo23771a(pwn.f40491g, pwn.f40492h);
                    return;
                }
            }
            pwn.f40490f.add(pwo);
            if (!pwn.f40493i) {
                pwn.f40493i = true;
                pvv pvv = pwn.f40487c;
                ArrayList arrayList = new ArrayList();
                for (pvt pvt : pvv.f40408d.values()) {
                    if (pvt.f40399c.mo23211b()) {
                        arrayList.add(pvt);
                    }
                }
                if (arrayList.isEmpty()) {
                    Collection values = pwn.f40486b.mo23460b().values();
                    if (values.isEmpty()) {
                        pwn.f40485a.mo23861b("No device found on the network.");
                        pwn.mo23775f(5);
                        return;
                    }
                    Iterator it = values.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        pnt pnt = (pnt) it.next();
                        if (pnt.f39878a.mo17500e()) {
                            castDevice = pnt.f39878a;
                            break;
                        }
                    }
                    if (castDevice != null) {
                        pwn.f40485a.mo23856a("No connected device. Will create a connection to device %s.", castDevice);
                        pwn.f40495k = new pim("gms_cast_rcn", rfi.f42869b, 0, "MulticastKeyManager", pwn);
                        pwn.f40494j = pwn.f40488d.mo23232a(castDevice, castDevice.f29723k, pwn.f40495k);
                        pwn.f40494j.mo23198a();
                        pwn.f40496l = true;
                        return;
                    }
                    pwn.f40485a.mo23861b("No device found on the network.");
                    pwn.mo23775f(5);
                    return;
                }
                pwn.f40485a.mo23861b("Reuse the existing connection to do key exchange.");
                pwn.f40494j = ((pvt) arrayList.get(0)).f40399c;
                pwn.mo23774b();
                pwn.f40496l = false;
            }
        } catch (IOException e3) {
            pwp.f40509b.mo23673b("Failed to multicast the message due to %s", e3);
            pxe.mo23797a(9);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        try {
            rnt rnt = (rnt) this.f40556a.get();
            if (rnt != null) {
                rnt.mo11797a(new Status(8));
            }
        } catch (RemoteException e) {
        }
    }
}
