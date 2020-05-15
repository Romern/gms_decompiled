package p000;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: pic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pic {

    /* renamed from: a */
    final Map f39191a = new HashMap();

    /* renamed from: b */
    final Map f39192b = new HashMap();

    /* renamed from: c */
    final Set f39193c = new HashSet();

    /* renamed from: d */
    final Set f39194d = new HashSet();

    /* renamed from: e */
    private final pnl f39195e;

    /* renamed from: f */
    private final pmx f39196f;

    /* renamed from: g */
    private final qat f39197g;

    /* renamed from: h */
    private boolean f39198h;

    /* renamed from: i */
    private byte[] f39199i;

    public pic(pnl pnl, pmx pmx, qat qat) {
        this.f39195e = pnl;
        this.f39196f = pmx;
        this.f39197g = qat;
    }

    /* renamed from: a */
    private static void m30425a(pib pib, CastDevice castDevice) {
        String str = castDevice.f29723k;
        if (!TextUtils.isEmpty(str)) {
            pib.f39181b = str;
        }
    }

    /* renamed from: c */
    private static final pib m30426c(CastDevice castDevice) {
        pib pib = new pib();
        pib.f39180a = castDevice.mo17494a();
        pib.f39181b = castDevice.f29723k;
        pib.f39182c = !plj.f39590b;
        return pib;
    }

    /* renamed from: d */
    private final void m30428d() {
        if (this.f39199i != null) {
            pes pes = pes.f38974a;
            for (pnm pnm : this.f39195e.mo23481a(System.currentTimeMillis())) {
                try {
                    byte[] bArr = pnm.f39844a.f29726n;
                    if (bArr != null) {
                        byte[] bArr2 = this.f39199i;
                        this.f39193c.add(new InetSocketAddress(InetAddress.getByAddress(new byte[]{bArr2[0], bArr2[1], bArr[0], bArr[1]}), pnm.f39844a.f29719g));
                    }
                } catch (UnknownHostException e) {
                }
            }
        }
    }

    /* renamed from: e */
    private final void m30429e() {
        ppz ppz = ppz.f40045d;
        if (ppz != null && this.f39199i != null) {
            for (ppc ppc : ppz.mo23549d().values()) {
                try {
                    int i = ppc.f40013i;
                    byte[] bArr = this.f39199i;
                    this.f39194d.add(new InetSocketAddress(InetAddress.getByAddress(new byte[]{bArr[0], bArr[1], (byte) ((i >> 8) & 255), (byte) (i & 255)}), 8009));
                } catch (UnknownHostException e) {
                }
            }
        }
    }

    /* renamed from: b */
    public final synchronized bptf mo23159b() {
        bpte bpte;
        if (this.f39198h) {
            m30428d();
            m30429e();
            bxvd da = bptf.f139104b.mo74144da();
            for (pib pib : this.f39191a.values()) {
                bxvd da2 = bpte.f139098e.mo74144da();
                if (!TextUtils.isEmpty(pib.f39181b)) {
                    String str = pib.f39181b;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpte bpte2 = (bpte) da2.f164949b;
                    str.getClass();
                    int i = bpte2.f139100a | 1;
                    bpte2.f139100a = i;
                    bpte2.f139101b = str;
                    boolean z = pib.f39187h;
                    bpte2.f139100a = i | 2;
                    bpte2.f139102c = z;
                    bpts bpts = (bpts) bptt.f139173e.mo74144da();
                    if (bpts.f164950c) {
                        bpts.mo74035c();
                        bpts.f164950c = false;
                    }
                    bptt bptt = (bptt) bpts.f164949b;
                    bptt.f139176b = 0;
                    int i2 = bptt.f139175a | 1;
                    bptt.f139175a = i2;
                    if (pib.f39188i) {
                        bptt.f139176b = 4;
                        bptt.f139175a = i2 | 1;
                    } else if (pib.f39189j) {
                        bptt.f139176b = 5;
                        bptt.f139175a = i2 | 1;
                        bpes bpes = pib.f39190k;
                        if (bpes == null) {
                            bpes = bpes.ERROR_UNKNOWN;
                        }
                        if (bpts.f164950c) {
                            bpts.mo74035c();
                            bpts.f164950c = false;
                        }
                        bptt bptt2 = (bptt) bpts.f164949b;
                        bptt2.f139177c = bpes.f137353L;
                        bptt2.f139175a |= 2;
                    } else if (pib.f39186g) {
                        bptt.f139176b = 2;
                        bptt.f139175a = i2 | 1;
                    } else if (pib.f39185f) {
                        bptt.f139176b = 1;
                        bptt.f139175a = i2 | 1;
                    } else if (pib.f39182c) {
                        bptt.f139176b = 3;
                        bptt.f139175a = i2 | 1;
                    }
                    InetSocketAddress inetSocketAddress = pib.f39184e;
                    if (inetSocketAddress != null && inetSocketAddress.equals(pib.f39183d)) {
                        bpts.mo68985a(bpfq.TCP_PROBER_IP_SOURCE_CACHED);
                    }
                    if (this.f39193c.contains(pib.f39184e)) {
                        bpts.mo68985a(bpfq.TCP_PROBER_IP_SOURCE_BLE);
                    }
                    if (this.f39194d.contains(pib.f39184e)) {
                        bpts.mo68985a(bpfq.TCP_PROBER_IP_SOURCE_GAIA);
                    }
                    bptt bptt3 = (bptt) bpts.mo74062i();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpte bpte3 = (bpte) da2.f164949b;
                    bptt3.getClass();
                    bpte3.f139103d = bptt3;
                    bpte3.f139100a |= 4;
                    bpte = (bpte) da2.mo74062i();
                } else {
                    bpte = null;
                }
                if (bpte != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bptf bptf = (bptf) da.f164949b;
                    bpte.getClass();
                    if (!bptf.f139106a.mo73666a()) {
                        bptf.f139106a = bxvk.m124021a(bptf.f139106a);
                    }
                    bptf.f139106a.add(bpte);
                }
            }
            m30427c();
            this.f39198h = false;
            return (bptf) da.mo74062i();
        }
        return bptf.f139104b;
    }

    /* renamed from: a */
    public final synchronized void mo23155a() {
        poe poe;
        m30427c();
        this.f39199i = this.f39197g.mo23851c();
        C1240of c = this.f39195e.mo23491c();
        if (!(c == null || (poe = (poe) c.f26799b) == null)) {
            HashSet hashSet = new HashSet();
            if (ccxd.f180145a.mo6606a().mo76968d()) {
                for (pnt pnt : this.f39196f.mo23460b().values()) {
                    hashSet.add(pnt.f39878a.mo17494a());
                }
            }
            for (pnm pnm : poe.mo23516a()) {
                pib c2 = m30426c(pnm.f39844a);
                CastDevice castDevice = pnm.f39844a;
                c2.f39183d = new InetSocketAddress(castDevice.f29715c, castDevice.f29719g);
                c2.f39186g = hashSet.contains(c2.f39180a);
                this.f39191a.put(c2.f39180a, c2);
                CastDevice castDevice2 = pnm.f39844a;
                InetSocketAddress inetSocketAddress = new InetSocketAddress(castDevice2.f29715c, castDevice2.f29719g);
                if (!this.f39192b.containsKey(inetSocketAddress)) {
                    this.f39192b.put(inetSocketAddress, new ArrayList());
                }
                ((List) this.f39192b.get(inetSocketAddress)).add(pnm.f39844a.mo17494a());
            }
        }
        this.f39198h = true;
    }

    /* renamed from: c */
    private final void m30427c() {
        this.f39191a.clear();
        this.f39192b.clear();
        this.f39193c.clear();
        this.f39194d.clear();
        this.f39199i = null;
    }

    /* renamed from: a */
    public final synchronized void mo23156a(CastDevice castDevice) {
        if (this.f39198h) {
            pib pib = (pib) this.f39191a.get(castDevice.mo17494a());
            if (pib == null) {
                pib = m30426c(castDevice);
                this.f39191a.put(pib.f39180a, pib);
            }
            m30425a(pib, castDevice);
            pib.f39187h = true;
            pib.f39184e = new InetSocketAddress(castDevice.f29715c, castDevice.f29719g);
        }
    }

    /* renamed from: a */
    public final synchronized void mo23157a(InetSocketAddress inetSocketAddress) {
        List<String> list;
        if (this.f39198h && (list = (List) this.f39192b.get(inetSocketAddress)) != null) {
            for (String str : list) {
                pib pib = (pib) this.f39191a.get(str);
                if (pib != null) {
                    pib.f39186g = true;
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo23158a(InetSocketAddress inetSocketAddress, bpes bpes) {
        if (this.f39198h) {
            for (pib pib : this.f39191a.values()) {
                if (inetSocketAddress.equals(pib.f39183d)) {
                    pib.f39189j = true;
                    pib.f39190k = bpes;
                }
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo23160b(CastDevice castDevice) {
        if (this.f39198h) {
            pib pib = (pib) this.f39191a.get(castDevice.mo17494a());
            if (pib == null) {
                pib = m30426c(castDevice);
                this.f39191a.put(pib.f39180a, pib);
            }
            m30425a(pib, castDevice);
            pib.f39188i = true;
            pib.f39184e = new InetSocketAddress(castDevice.f29715c, castDevice.f29719g);
        }
    }

    /* renamed from: b */
    public final synchronized void mo23161b(InetSocketAddress inetSocketAddress) {
        List<String> list;
        if (this.f39198h && (list = (List) this.f39192b.get(inetSocketAddress)) != null) {
            for (String str : list) {
                pib pib = (pib) this.f39191a.get(str);
                if (pib != null) {
                    pib.f39185f = true;
                }
            }
        }
    }
}
