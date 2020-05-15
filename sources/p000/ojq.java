package p000;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.car.senderprotocol.Channel$FlattenedChannel;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ojq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ojq implements ogr {

    /* renamed from: a */
    public static final bnsn f37790a = odk.m28481a("CAR.GAL.GAL");

    /* renamed from: h */
    private static final oba f37791h;

    /* renamed from: b */
    public final ohq f37792b;

    /* renamed from: c */
    public final ofl f37793c;

    /* renamed from: d */
    public final ogs f37794d;

    /* renamed from: e */
    public int f37795e = 0;

    /* renamed from: f */
    public ojl f37796f;

    /* renamed from: g */
    public ojp[] f37797g;

    /* renamed from: i */
    private final Closeable f37798i;

    /* renamed from: j */
    private ofo f37799j;

    /* renamed from: k */
    private final oba f37800k;

    /* renamed from: l */
    private final int f37801l;

    static {
        oaz d = oba.m28331d();
        d.mo21935a(false);
        f37791h = d.mo21933a();
    }

    public ojq(ojk ojk) {
        ogn ogn;
        int i;
        int i2;
        int i3;
        this.f37792b = ojk.f37766g;
        this.f37799j = ojk.f37767h;
        this.f37800k = (oba) ooe.m29303a(ojk.f37768i).mo22383a(f37791h);
        this.f37798i = ojk.f37763d;
        this.f37797g = ojk.f37777r;
        this.f37793c = new ofl(this.f37792b);
        okk okk = ojk.f37782w;
        this.f37801l = ojk.f37785z;
        ohv ohv = ojk.f37781v;
        ogs ogs = ojk.f37762c;
        Bundle bundle = ojk.f37760a;
        if (bundle == null) {
            ogn = ogs.m28688a(ojk.f37769j, ojk.f37773n);
            okz okz = ojk.f37783x;
            ogn.mo22120a(new ojj(this, ojk));
        } else {
            ohc ohc = new ohc(ojk.f37764e, bundle, ojk.f37774o, this.f37793c, this.f37792b);
            ogn a = ogs.m28687a(ojk.f37760a, ojk.f37771l);
            a.mo22120a(new oji(ohc));
            ogn = a;
        }
        ohk ohk = ojk.f37780u;
        if (ohk != null) {
            ogn.f37572j = ohk;
        }
        ohu ohu = ojk.f37784y;
        ogn.f37574l = this.f37801l;
        ogn.f37567e = ojk.f37766g;
        ogn.f37570h = ojk.f37767h;
        ogn.f37569g = this;
        ogn.f37568f = oaw.m28315a(this.f37800k);
        ogn.f37571i = ojk.f37765f;
        this.f37794d = new ogs(ogn);
        List list = ojk.f37761b;
        if (list != null) {
            this.f37797g = new ojp[list.size()];
            for (int i4 = 0; i4 < ojk.f37761b.size(); i4++) {
                bnsi d = f37790a.mo68390d();
                d.mo68432a("ojq", "<init>", 419, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68420a("Adding service (%s)", ogs.m28685a((bivb) ojk.f37761b.get(i4)));
                this.f37797g[i4] = new ojp();
                this.f37797g[i4].f37786a = ((bivb) ojk.f37761b.get(i4)).f121924b;
                this.f37797g[i4].f37787b = (bivb) ojk.f37761b.get(i4);
            }
        }
        if (ojk.f37760a != null) {
            m28929b(this.f37799j);
        }
        ogs ogs2 = this.f37794d;
        oga oga = new oga(0, -128, olk.DEFAULT, ogs2, ogs2.mo22125a(0), ogs2.f37584h, ogs2.f37590n);
        ogs2.f37578b.mo22159a(oga);
        ogs2.f37597u.put(0, ogs2.f37590n);
        oga.f37537h = 2;
        ogs2.f37584h.mo22210a(oga);
        ogs2.f37584h.mo22088i();
        ogs2.f37579c[0] = oga;
        int i5 = ojk.f37778s;
        if (i5 > 0 && (i = ojk.f37772m) > 0 && (i2 = ojk.f37770k) > 0 && (i3 = ojk.f37779t) > 0) {
            Resources resources = ojk.f37764e.getResources();
            ohc ohc2 = this.f37794d.f37583g;
            ohc2.f37609c = mo22219a(resources, i5);
            ohc2.f37610d = mo22219a(resources, i);
            ohc2.f37611e = mo22219a(resources, i2);
            ohc2.f37608b = resources.getString(i3);
        }
    }

    /* renamed from: a */
    static Object m28925a(Class cls, IBinder iBinder) {
        oib oib;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.senderprotocol.IObjectWrapper");
            oib = queryLocalInterface instanceof oib ? (oib) queryLocalInterface : new ohz(iBinder);
        } else {
            oib = null;
        }
        return cls.cast(oja.m28891a(oib));
    }

    /* renamed from: b */
    private final void m28929b(ofo ofo) {
        if (ofo != null) {
            ofo.mo22101a(0, 1);
            ojp[] ojpArr = this.f37797g;
            if (ojpArr != null) {
                for (ojp ojp : ojpArr) {
                    ojh ojh = ojp.f37788c;
                    if (ojh != null) {
                        ofo.mo22101a(ojp.f37786a, ojh.f37753n);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo22222c() {
        this.f37794d.mo22132b();
        ojp[] ojpArr = this.f37797g;
        if (ojpArr != null) {
            for (ojp ojp : ojpArr) {
                ojh ojh = ojp.f37788c;
                if (ojh != null) {
                    ojh.mo22149d();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo22223d() {
        ofl ofl = this.f37793c;
        synchronized (ofl.f37510d) {
            ofl.f37513g = true;
            ofl.mo22090a();
        }
        this.f37794d.mo22130a(false);
        Closeable closeable = this.f37798i;
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: e */
    public final boolean mo22224e() {
        return this.f37794d.f37583g.mo22144c();
    }

    /* renamed from: b */
    public final void mo22220b() {
        ogs ogs = this.f37794d;
        ogs.f37578b.mo22161b();
        ohu ohu = ogs.f37596t;
        ogb ogb = new ogb(ogs);
        ogc ogc = new ogc(ogs);
        ohs ohs = ohu.f37685a;
        if (ohs instanceof oht) {
            ((oht) ohs).mo22174a(ogb);
        }
        ohu.f37685a = ogb;
        ohs ohs2 = ohu.f37686b;
        if (ohs2 instanceof oht) {
            ((oht) ohs2).mo22174a(ogc);
        }
        ohu.f37686b = ogc;
    }

    /* renamed from: a */
    public static oib m28926a(Object obj) {
        return oja.m28892a(obj);
    }

    /* renamed from: a */
    public static ojk m28927a() {
        return new ojk();
    }

    /* renamed from: a */
    public static ojk m28928a(Bundle bundle) {
        ojk ojk = new ojk();
        ojk.f37760a = bundle;
        return ojk;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [oib, android.os.IBinder], assign insn: 0x00cf: INVOKE  (r1v12 ? I:oib) = (r1v11 java.io.Closeable) type: STATIC call: oja.a(java.lang.Object):oib */
    /* JADX WARN: Type inference failed for: r0v7, types: [oib, android.os.IBinder], assign insn: 0x012a: INVOKE  (r0v7 ? I:oib) = (r1v13 java.util.ArrayList) type: STATIC call: oja.a(java.lang.Object):oib */
    /* renamed from: b */
    public final void mo22221b(Bundle bundle) {
        oga oga;
        int i;
        ojl ojl = this.f37796f;
        if (ojl == null) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                ojp[] ojpArr = this.f37797g;
                if (i3 < ojpArr.length) {
                    ofs ofs = ojpArr[i3].f37789d;
                    if (ofs != null) {
                        if (ofs instanceof ofq) {
                            ((ofq) ofs).mo22107b();
                        } else {
                            String valueOf = String.valueOf(ofs);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                            sb.append("Non-suspendable service ");
                            sb.append(valueOf);
                            throw new UnsupportedOperationException(sb.toString());
                        }
                    }
                    i3++;
                } else {
                    ogs ogs = this.f37794d;
                    ogs.f37578b.mo22155a();
                    ogs.m28689a(ogs.f37585i);
                    ogs.m28689a(ogs.f37586j);
                    ogs.m28689a(ogs.f37587k);
                    ogs.m28689a(ogs.f37589m);
                    ogs.m28689a(ogs.f37588l);
                    ogs ogs2 = this.f37794d;
                    if (ogs2.f37582f || ogs2.f37581e) {
                        boolean z = ogs2.f37582f;
                        boolean z2 = ogs2.f37581e;
                        StringBuilder sb2 = new StringBuilder(39);
                        sb2.append("Can't bundle ChannelManager:");
                        sb2.append(z);
                        sb2.append(" ");
                        sb2.append(z2);
                        throw new IllegalStateException(sb2.toString());
                    }
                    int length = ogs2.f37579c.length;
                    Channel$FlattenedChannel[] channel$FlattenedChannelArr = new Channel$FlattenedChannel[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                    int i4 = 0;
                    while (true) {
                        oga[] ogaArr = ogs2.f37579c;
                        int length2 = ogaArr.length;
                        if (i4 < 256) {
                            oga = ogaArr[i4];
                            if (oga != null) {
                                i = oga.f37537h;
                                if ((i == 4 || i == 2) && !oga.f37538i) {
                                    channel$FlattenedChannelArr[i4] = Channel$FlattenedChannel.m22093a(oga.f37531b, oga.f37534e, i, oga.f37535f);
                                }
                            }
                            i4++;
                        } else {
                            bundle.putParcelableArray("channels", channel$FlattenedChannelArr);
                            ogs2.f37584h.mo22146a(bundle);
                            ogs2.f37578b.mo22157a(bundle);
                            bundle.putBinder("connection", oja.m28892a(this.f37798i));
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            while (true) {
                                ojp[] ojpArr2 = this.f37797g;
                                if (i2 < ojpArr2.length) {
                                    ojp ojp = ojpArr2[i2];
                                    if (ojp.f37787b != null) {
                                        arrayList.add(new Pair(Integer.valueOf(ojp.f37786a), this.f37797g[i2].f37787b.mo73642k()));
                                    } else if (ojp.f37788c != null) {
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putInt("end_point_service_id", this.f37797g[i2].f37786a);
                                        this.f37797g[i2].f37788c.mo22146a(bundle2);
                                        arrayList2.add(bundle2);
                                    }
                                    i2++;
                                } else {
                                    bundle.putBinder("proto_services", oja.m28892a(arrayList));
                                    bundle.putParcelableArrayList("end_points", arrayList2);
                                    return;
                                }
                            }
                        }
                    }
                    boolean z3 = oga.f37538i;
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Can't flatten channel: ");
                    sb3.append(i);
                    sb3.append(" ");
                    sb3.append(z3);
                    throw new IllegalStateException(sb3.toString());
                }
            }
        } else {
            String valueOf2 = String.valueOf(ojl);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
            sb4.append("Can't suspend ProtocolManager:");
            sb4.append(valueOf2);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* renamed from: a */
    public final int mo22212a(ojn ojn) {
        bivb bivb;
        ofs a;
        ojp[] ojpArr = this.f37797g;
        int i = 0;
        for (ojp ojp : ojpArr) {
            if (!(ojp.f37789d != null || (bivb = ojp.f37787b) == null || (a = ojn.mo20914a(bivb)) == null)) {
                int i2 = this.f37801l;
                ogs ogs = this.f37794d;
                oko oko = ogs.f37598v;
                Map map = ogs.f37597u;
                ofu a2 = ogs.mo22125a(ojp.f37786a);
                int i3 = i2 - 1;
                if (i2 != 0) {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            a = new olb(a, a2, new ola(map, oko));
                        } else {
                            String a3 = ofp.m28659a(i2);
                            StringBuilder sb = new StringBuilder(a3.length() + 13);
                            sb.append("Invalid type ");
                            sb.append(a3);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    ojp.f37789d = a;
                    i++;
                    ojp.f37787b = null;
                } else {
                    throw null;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public final List mo22213a(ojl ojl) {
        Object obj;
        obl obl;
        ofs ofs;
        ojl ojl2 = ojl;
        if (this.f37796f == null) {
            this.f37796f = ojl2;
            ArrayList arrayList = new ArrayList();
            ojp[] ojpArr = this.f37797g;
            for (ojp ojp : ojpArr) {
                if (ojp.f37788c == null && (ofs = ojp.f37789d) != null) {
                    if (ojl2.mo21211a(ofs, ojp.f37786a)) {
                        ojp.f37788c = ojp.f37789d.mo20646a(this.f37792b);
                    }
                    if (ojp.f37788c != null) {
                        arrayList.add(ojp);
                        ofo ofo = this.f37799j;
                        if (ofo != null) {
                            ofo.mo22101a(ojp.f37786a, ojp.f37788c.f37753n);
                        }
                    }
                }
            }
            this.f37795e = arrayList.size();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                ojp ojp2 = (ojp) arrayList.get(i);
                olk j = ojp2.f37788c.mo22071j();
                ogs ogs = this.f37794d;
                int i2 = ojp2.f37786a;
                ojh ojh = ojp2.f37788c;
                int i3 = ojh.f37754o;
                Object obj2 = ogs.f37580d;
                synchronized (obj2) {
                    try {
                        Handler b = ogs.mo22131b(i3);
                        ogs.f37597u.put(Integer.valueOf(i2), b);
                        obj = obj2;
                        int i4 = i3;
                        ojh ojh2 = ojh;
                        int i5 = i2;
                        try {
                            oga oga = new oga(i2, 0, j, ogs, ogs.mo22125a(i2), ojh2, b);
                            int i6 = i5;
                            ogs.f37579c[i6] = oga;
                            ojh2.mo22210a(oga);
                            ogs.f37578b.mo22159a(oga);
                            oer a = oer.m28607a(ojh2.f37753n);
                            bmxy.m108581a(a);
                            oaw oaw = ogs.f37594r;
                            int ordinal = a.ordinal();
                            if (ordinal == 2) {
                                if (obo.f37136b == null) {
                                    obo.f37136b = new obo();
                                }
                                obl = obo.f37136b;
                            } else if (ordinal == 3) {
                                obl = obj.m28344a(oer.AUDIO_SINK_GUIDANCE);
                            } else if (ordinal != 5) {
                                if (obl.f37132a == null) {
                                    obl.f37132a = new obl();
                                }
                                obl = obl.f37132a;
                            } else {
                                obl = obj.m28344a(oer.AUDIO_SINK_MEDIA);
                            }
                            oaw.f37108h.put(i6, obl.mo21937a(oaw.f37107g.mo21922c()));
                            ogs.mo22129a(i6, ohr.m28776a(a));
                            synchronized (oga.f37540k) {
                                if (oga.f37537h == 4) {
                                    oga.f37537h = 0;
                                } else {
                                    throw new IllegalStateException("Channel needs to be closed before it can be opened.");
                                }
                            }
                            if (ogs.f37581e || i4 == 3) {
                                oga.mo22114b();
                            }
                            arrayList2.add(Integer.valueOf(ojp2.f37786a));
                            i++;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                        throw th;
                    }
                }
            }
            arrayList.size();
            if (arrayList.size() == 0) {
                ojl.mo21210a();
            }
            return arrayList2;
        }
        throw new IllegalStateException("Can't start services while waiting on services");
    }

    /* renamed from: a */
    public final void mo22214a(long j, boolean z) {
        ohc ohc = this.f37794d.f37583g;
        bxvd da = bitp.f121689e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bitp bitp = (bitp) da.f164949b;
        int i = bitp.f121691a | 1;
        bitp.f121691a = i;
        bitp.f121692b = j;
        bitp.f121691a = i | 2;
        bitp.f121693c = z;
        ohc.mo22206a(11, (bitp) da.mo74062i());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        r0.f37509c = true;
        r0 = r0.f37508b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r0.mo22142a(r7);
     */
    /* renamed from: a */
    public final void mo22215a(bipi bipi) {
        ofl ofl = this.f37793c;
        synchronized (ofl.f37510d) {
            if (!ofl.f37513g) {
                ofl.f37511e = new adzt(Looper.getMainLooper());
                ofl.f37512f = new ofk(ofl);
                ofl.f37511e.postDelayed(ofl.f37512f, 200);
            } else {
                bnsi d = ofl.f37507a.mo68390d();
                d.mo68432a("ofl", "a", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Ignoring byebye on released handler");
            }
        }
    }

    /* renamed from: a */
    public final void mo22216a(bivb bivb) {
        ojp[] ojpArr = this.f37797g;
        if (ojpArr != null) {
            int length = ojpArr.length;
            int i = 0;
            while (i < length) {
                ojp ojp = ojpArr[i];
                if (ojp.f37786a != bivb.f121924b) {
                    i++;
                } else {
                    ofs ofs = ojp.f37789d;
                    if (ofs instanceof ofr) {
                        ((ofr) ofs).mo21076b(bivb);
                        return;
                    } else if (ofs != null) {
                        bnsi c = f37790a.mo68388c();
                        c.mo68432a("ojq", "a", 709, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68420a("Attempted to update a service that is not updatable: %s", bivb);
                        return;
                    } else {
                        throw new IllegalStateException("Service updated before service discovery is complete");
                    }
                }
            }
            throw new IllegalArgumentException("Updating a service that was not registered during service discovery");
        }
        throw new IllegalStateException("Service updated before service discovery");
    }

    /* renamed from: a */
    public final void mo22217a(ofo ofo) {
        this.f37799j = ofo;
        ogs ogs = this.f37794d;
        ogs.f37593q = ofo;
        ogs.f37578b.mo22158a(ofo);
        m28929b(ofo);
    }

    /* renamed from: a */
    public final void mo22218a(ogy ogy, ogx ogx) {
        ohc ohc = this.f37794d.f37583g;
        ohc.f37617k = ogy;
        ohc.f37617k.mo20889a(ohc);
        synchronized (ohc.f37612f) {
            for (Pair pair : ohc.f37616j) {
                ohc.f37617k.mo20887a((biou) pair.first, ((Boolean) pair.second).booleanValue());
            }
            ohc.f37616j.clear();
        }
        ohc ohc2 = this.f37794d.f37583g;
        ohc2.f37615i = ogx;
        ((ody) ohc2.f37615i).f37319a = ohc2;
        synchronized (ohc2.f37612f) {
            Iterator it = ohc2.f37613g.iterator();
            while (it.hasNext()) {
                ohc2.f37615i.mo22038a(((bisn) it.next()) == bisn.NAV_FOCUS_PROJECTED);
            }
            ohc2.f37613g.clear();
            for (Boolean bool : ohc2.f37614h) {
                ohc2.f37615i.mo22039b(bool.booleanValue());
            }
            ohc2.f37614h.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo22219a(Resources resources, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream openRawResource = resources.openRawResource(i);
        byte[] bArr = new byte[1024];
        int i2 = 0;
        while (i2 != -1) {
            try {
                i2 = openRawResource.read(bArr);
                if (i2 > 0) {
                    try {
                        byteArrayOutputStream.write(bArr, 0, i2);
                    } catch (IOException e) {
                    }
                }
            } catch (IOException e2) {
                bnsi b = f37790a.mo68387b();
                b.mo68432a("ojq", "a", 764, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Error reading raw resource.");
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
