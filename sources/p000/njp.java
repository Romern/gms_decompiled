package p000;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.car.CarAudioConfiguration;
import com.google.android.gms.car.CarInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* renamed from: njp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class njp extends nqw implements ojn {

    /* renamed from: k */
    static CountDownLatch f35841k;

    /* renamed from: m */
    public static final /* synthetic */ int f35842m = 0;

    /* renamed from: n */
    private static final bnsn f35843n = odk.m28481a("CAR.AUDIO");

    /* renamed from: a */
    final List f35844a = new ArrayList();

    /* renamed from: b */
    final SparseArray f35845b = new SparseArray();

    /* renamed from: c */
    final nxc[] f35846c = new nxc[3];

    /* renamed from: d */
    final nxe[] f35847d = new nxe[3];

    /* renamed from: e */
    public ntq f35848e;

    /* renamed from: f */
    public final njj f35849f;

    /* renamed from: g */
    public final boolean f35850g;

    /* renamed from: h */
    public final boolean f35851h;

    /* renamed from: i */
    public final boolean f35852i;

    /* renamed from: j */
    public nxg f35853j;

    /* renamed from: l */
    volatile njo f35854l;

    /* renamed from: o */
    private final nhs f35855o;

    /* renamed from: p */
    private final nxb f35856p;

    /* renamed from: q */
    private final nxd f35857q;

    /* renamed from: r */
    private final niw f35858r;

    /* renamed from: s */
    private final olo f35859s;

    /* renamed from: t */
    private final olr f35860t;

    /* renamed from: u */
    private final npd f35861u;

    /* renamed from: v */
    private final olt f35862v;

    /* renamed from: w */
    private final Context f35863w;

    public njp(nxb nxb, nxd nxd, niw niw, olo olo, olr olr, npd npd, olt olt, njj njj, Context context, boolean z, boolean z2) {
        this.f35856p = nxb;
        this.f35857q = nxd;
        this.f35858r = niw;
        this.f35859s = olo;
        this.f35860t = olr;
        this.f35861u = npd;
        this.f35862v = olt;
        this.f35849f = njj;
        this.f35855o = njj.f35802b;
        this.f35863w = context;
        this.f35851h = z;
        this.f35852i = z2;
        CarInfo p = this.f35859s.mo21346p();
        if (p == null) {
            bnsi b = f35843n.mo68387b();
            b.mo68432a("njp", "<init>", 125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("car info null");
            this.f35850g = false;
        } else {
            this.f35850g = npe.m27158a(npe.m27154a(ccuf.f179931a.mo6606a().mo76792c()), p);
            bnsi d = f35843n.mo68390d();
            d.mo68432a("njp", "<init>", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("force single channel capturing:%b", Boolean.valueOf(this.f35850g));
        }
        if (ccsk.f179847a.mo6606a().mo76719b() && npd.mo21384a()) {
            bnsi d2 = f35843n.mo68390d();
            d2.mo68432a("njp", "<init>", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Clean up existing raw audio data on device");
            oaq.m28297a(npe.m27153a(context));
        }
        if (f35841k == null) {
            f35841k = new CountDownLatch(1);
            ExecutorService b2 = adzl.f62962b.mo25879b(2);
            b2.execute(new njn(context));
            b2.shutdown();
        }
    }

    /* renamed from: a */
    public static int m26584a(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 3) {
            return 0;
        }
        if (i == 5) {
            return 1;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("Unsupported stream type ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    static String m26591d(int i) {
        return i != 0 ? i != 1 ? i != 3 ? i != 5 ? "UNKNOWN" : "TTS" : "MEDIA" : "SYSTEM" : "VOICE";
    }

    /* renamed from: e */
    public static int m26592e(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 5) {
            return 1;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("Unsupported stream type ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final CarAudioConfiguration mo20917b(int i, int i2) {
        this.f35862v.mo21255R();
        njo njo = this.f35854l;
        if (i != 0 || njo == null) {
            throw new IllegalStateException("CarNotSupported");
        } else if (i2 == 0) {
            return njo.f35840b[0];
        } else {
            throw new IllegalArgumentException("index out of range");
        }
    }

    /* renamed from: c */
    public final int mo20921c(int i, int i2) {
        int a;
        this.f35862v.mo21318aw();
        synchronized (this.f35845b) {
            njo njo = (njo) this.f35845b.get(i);
            if (njo != null) {
                a = m26586a(njo.f35840b[i2]);
            } else {
                throw new IllegalStateException("CarNotSupported");
            }
        }
        return a;
    }

    /* renamed from: f */
    public final nrc mo20927f() {
        this.f35862v.mo21318aw();
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static int m26585a(int i, CarAudioConfiguration[] carAudioConfigurationArr) {
        int i2 = i == 3 ? 12 : 4;
        int i3 = i == 3 ? 48000 : 16000;
        for (int i4 = 0; i4 < carAudioConfigurationArr.length; i4++) {
            CarAudioConfiguration carAudioConfiguration = carAudioConfigurationArr[i4];
            if (carAudioConfiguration.f29280a == i3 && carAudioConfiguration.f29281b == i2 && carAudioConfiguration.f29282c == 2) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final int mo20924d(int i, int i2) {
        this.f35862v.mo21255R();
        njo njo = this.f35854l;
        if (i != 0 || njo == null) {
            throw new IllegalStateException("CarNotSupported");
        } else if (i2 == 0) {
            return m26586a(njo.f35840b[0]);
        } else {
            throw new IllegalArgumentException("index out of range");
        }
    }

    /* renamed from: e */
    public final void mo20926e() {
        this.f35862v.mo21255R();
    }

    /* renamed from: a */
    static int m26586a(CarAudioConfiguration carAudioConfiguration) {
        int i = carAudioConfiguration.f29280a;
        int i2 = 2048;
        if (!(i == 44100 || i == 48000)) {
            i2 = 1024;
        }
        int i3 = i2 + i2;
        int i4 = carAudioConfiguration.f29281b;
        return (i4 == 12 || i4 == 12) ? i3 + i3 : i3;
    }

    /* renamed from: a */
    private static CarAudioConfiguration m26587a(bioo bioo, boolean z) {
        int i = 12;
        if (z) {
            if (bioo.f121081d != 2) {
                i = 4;
            }
        } else if (bioo.f121081d != 2) {
            i = 16;
        }
        if (bioo.f121080c != 16) {
            bnsi c = f35843n.mo68388c();
            c.mo68432a("njp", "a", 461, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68409a("Audio config received has wrong number of bits %d", bioo.f121080c);
        }
        return new CarAudioConfiguration(bioo.f121079b, i, 2);
    }

    /* renamed from: b */
    public final void mo20918b() {
        nxc[] nxcArr = this.f35846c;
        int length = nxcArr.length;
        for (int i = 0; i < 3; i++) {
            nxc nxc = nxcArr[i];
            if (nxc != null) {
                nxc.mo20680d();
            }
        }
    }

    /* renamed from: c */
    public final int[] mo20922c() {
        int[] iArr;
        this.f35862v.mo21318aw();
        synchronized (this.f35845b) {
            iArr = new int[this.f35845b.size()];
            for (int size = this.f35845b.size() - 1; size >= 0; size--) {
                iArr[size] = ((njo) this.f35845b.valueAt(size)).f35839a;
            }
        }
        return iArr;
    }

    /* renamed from: d */
    public final int[] mo20925d() {
        this.f35862v.mo21255R();
        njo njo = this.f35854l;
        if (njo == null) {
            return new int[0];
        }
        return new int[]{njo.f35839a};
    }

    /* renamed from: a */
    static final String m26588a(bioo bioo) {
        int i;
        int i2;
        int i3 = bioo.f121078a;
        if ((i3 & 1) == 0 || ((i = bioo.f121079b) != 48000 && i != 16000)) {
            int i4 = bioo.f121079b;
            StringBuilder sb = new StringBuilder(31);
            sb.append("wrong sampling rate ");
            sb.append(i4);
            return sb.toString();
        } else if ((i3 & 2) == 0 || bioo.f121080c != 16) {
            int i5 = bioo.f121080c;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("wrong number of bits ");
            sb2.append(i5);
            return sb2.toString();
        } else if ((i3 & 4) != 0 && ((i2 = bioo.f121081d) == 2 || i2 == 1)) {
            return null;
        } else {
            int i6 = bioo.f121081d;
            StringBuilder sb3 = new StringBuilder(36);
            sb3.append("wrong number of channels ");
            sb3.append(i6);
            return sb3.toString();
        }
    }

    /* renamed from: b */
    public final boolean mo20919b(long j) {
        this.f35862v.mo21255R();
        nhw nhw = (nhw) this.f35855o;
        if (nhw.mo20710c()) {
            if (j <= 0) {
                return false;
            }
            int i = (int) (j / 10);
            for (int i2 = 0; i2 < i && nhw.mo20710c(); i2++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
            }
            if (!nhw.mo20710c()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final CarAudioConfiguration[] mo20923c(int i) {
        this.f35862v.mo21255R();
        njo njo = this.f35854l;
        if (i == 0 && njo != null) {
            return njo.f35840b;
        }
        throw new IllegalStateException("CarNotSupported");
    }

    /* renamed from: a */
    public static void m26589a() {
        try {
            f35841k.await();
        } catch (InterruptedException e) {
            bnsi b = f35843n.mo68387b();
            b.mo68432a("njp", "a", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Interrupted waiting for JNI to load");
        }
    }

    /* renamed from: a */
    public static CarAudioConfiguration[] m26590a(bioo[] biooArr, boolean z) {
        int length = biooArr.length;
        CarAudioConfiguration[] carAudioConfigurationArr = new CarAudioConfiguration[length];
        for (int i = 0; i < length; i++) {
            bioo bioo = biooArr[i];
            int i2 = 12;
            int i3 = bioo.f121081d;
            if (z) {
                if (i3 != 2) {
                    i2 = 4;
                }
            } else if (i3 != 2) {
                i2 = 16;
            }
            if (bioo.f121080c != 16) {
                bnsi c = f35843n.mo68388c();
                c.mo68432a("njp", "a", 461, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68409a("Audio config received has wrong number of bits %d", bioo.f121080c);
            }
            carAudioConfigurationArr[i] = new CarAudioConfiguration(bioo.f121079b, i2, 2);
        }
        return carAudioConfigurationArr;
    }

    /* renamed from: b */
    public final CarAudioConfiguration[] mo20920b(int i) {
        CarAudioConfiguration[] carAudioConfigurationArr;
        this.f35862v.mo21318aw();
        synchronized (this.f35845b) {
            njo njo = (njo) this.f35845b.get(i);
            if (njo != null) {
                carAudioConfigurationArr = njo.f35840b;
            } else {
                throw new IllegalStateException("CarNotSupported");
            }
        }
        return carAudioConfigurationArr;
    }

    /* renamed from: a */
    public final CarAudioConfiguration mo20912a(int i, int i2) {
        CarAudioConfiguration carAudioConfiguration;
        this.f35862v.mo21318aw();
        synchronized (this.f35845b) {
            njo njo = (njo) this.f35845b.get(i);
            if (njo != null) {
                carAudioConfiguration = njo.f35840b[i2];
            } else {
                throw new IllegalStateException("CarNotSupported");
            }
        }
        return carAudioConfiguration;
    }

    /* renamed from: a */
    public final nra mo20913a(nqy nqy, int i) {
        njk njk;
        this.f35862v.mo21255R();
        if (i != 0 || this.f35854l == null) {
            throw new IllegalStateException("CarNotSupported");
        }
        synchronized (this.f35844a) {
            synchronized (this.f35844a) {
                Iterator it = this.f35844a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        njk = null;
                        break;
                    }
                    njk = (njk) it.next();
                    if (njk.f35824a.f12819a == nqy.f12819a) {
                        break;
                    }
                }
            }
            if (njk == null) {
                njk = new njk(this.f35863w, nqy, new njm(this));
                if (njk.mo20896a()) {
                    this.f35844a.add(njk);
                } else {
                    throw new IllegalArgumentException("invalid callback");
                }
            }
        }
        return njk.mo20894a(this, this.f35848e);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: njp.a(bioo[], boolean):com.google.android.gms.car.CarAudioConfiguration[]
     arg types: [bioo[], int]
     candidates:
      njp.a(int, com.google.android.gms.car.CarAudioConfiguration[]):int
      njp.a(bioo, boolean):com.google.android.gms.car.CarAudioConfiguration
      njp.a(int, int):com.google.android.gms.car.CarAudioConfiguration
      njp.a(nqy, int):nra
      nqx.a(int, int):com.google.android.gms.car.CarAudioConfiguration
      nqx.a(nqy, int):nra
      njp.a(bioo[], boolean):com.google.android.gms.car.CarAudioConfiguration[] */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a8, code lost:
        if (r6 == 5) goto L_0x01ae;
     */
    /* renamed from: a */
    public final ofs mo20914a(bivb bivb) {
        boolean z;
        nxe nxe;
        bydh bydh;
        bivb bivb2 = bivb;
        if (this.f35851h) {
            bisc bisc = bivb2.f121926d;
            if (bisc == null) {
                bisc = bisc.f121501f;
            }
            if ((bisc.f121503a & 2) != 0) {
                bisc bisc2 = bivb2.f121926d;
                if (bisc2 == null) {
                    bisc2 = bisc.f121501f;
                }
                if (bisc2.f121506d.size() != 0) {
                    bisc bisc3 = bivb2.f121926d;
                    if (bisc3 == null) {
                        bisc3 = bisc.f121501f;
                    }
                    birv a = birv.m102768a(bisc3.f121504b);
                    birv birv = a != null ? a : birv.MEDIA_CODEC_AUDIO_PCM;
                    bisc bisc4 = bivb2.f121926d;
                    if (bisc4 == null) {
                        bisc4 = bisc.f121501f;
                    }
                    int a2 = biow.m102681a(bisc4.f121505c);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    bisc bisc5 = bivb2.f121926d;
                    if (bisc5 == null) {
                        bisc5 = bisc.f121501f;
                    }
                    bioo[] biooArr = (bioo[]) bisc5.f121506d.toArray(new bioo[0]);
                    for (bioo bioo : biooArr) {
                        String a3 = m26588a(bioo);
                        if (a3 != null) {
                            this.f35860t.mo21273a(bpdn.PROTOCOL_WRONG_CONFIGURATION, bpdo.BAD_AUDIO_CONFIG, a3);
                        }
                        if (ccsh.f179839a.mo6606a().mo76711a()) {
                            this.f35858r.mo20851a(a2, bioo.f121081d, bioo.f121080c, bioo.f121079b);
                        }
                    }
                    int i = a2 != 1 ? a2 != 2 ? a2 != 3 ? 0 : 3 : 1 : 5;
                    CarAudioConfiguration[] a4 = m26590a(biooArr, true);
                    int a5 = m26585a(i, a4);
                    if (a5 == -1) {
                        olr olr = this.f35860t;
                        bpdn bpdn = bpdn.PROTOCOL_WRONG_CONFIGURATION;
                        bpdo bpdo = bpdo.MISSING_AUDIO_CONFIG;
                        String str = i != 3 ? "16000 mono missing" : "48000 stereo missing";
                        String valueOf = String.valueOf(Integer.toString(a2));
                        StringBuilder sb = new StringBuilder(str.length() + 29 + String.valueOf(valueOf).length());
                        sb.append("no default config");
                        sb.append(str);
                        sb.append(" for stream ");
                        sb.append(valueOf);
                        olr.mo21273a(bpdn, bpdo, sb.toString());
                        return null;
                    }
                    int a6 = m26584a(i);
                    if (ccpb.f179673a.mo6606a().mo76575a() && (nxe = this.f35847d[a6]) != null) {
                        birv e = nxe.mo20660e();
                        int t = this.f35862v.mo21350t();
                        if (t == 1) {
                            bydh = ccpb.f179673a.mo6606a().mo76576b();
                        } else if (t != 2) {
                            return null;
                        } else {
                            bydh = ccpb.f179673a.mo6606a().mo76577c();
                        }
                        bxvt bxvt = bydh.f165791a;
                        int size = bxvt.size();
                        int i2 = 0;
                        while (i2 < size) {
                            int intValue = ((Integer) bxvt.get(i2)).intValue();
                            if (e == birv.m102768a(intValue)) {
                                return null;
                            }
                            i2++;
                            if (birv.f121478h == intValue) {
                            }
                        }
                        return null;
                    }
                    njo njo = new njo(i, a4);
                    synchronized (this.f35845b) {
                        this.f35845b.get(i);
                        this.f35845b.put(i, njo);
                    }
                    CarAudioConfiguration[] carAudioConfigurationArr = a4;
                    bioo[] biooArr2 = biooArr;
                    int i3 = i;
                    this.f35847d[a6] = new nhi(this.f35863w, this.f35855o, this.f35861u, this.f35858r, this.f35857q, i, a5, birv);
                    int i4 = Build.VERSION.SDK_INT;
                    if (this.f35853j == null) {
                        this.f35853j = new nxg(this.f35863w, this.f35850g, ((nxp) this.f35849f.f35805e).f36884c);
                    }
                    if (i3 != 3) {
                        if (this.f35853j != null) {
                            if (this.f35850g) {
                                z = false;
                                this.f35846c[a6] = new nhk(this.f35863w, this.f35856p, this.f35859s, this.f35860t, this.f35862v, this.f35855o, this.f35853j, i3, z, this.f35850g);
                                this.f35846c[a6].mo20676a(biooArr2, carAudioConfigurationArr);
                                this.f35849f.mo20886a(a6, this.f35846c[a6], this.f35847d[a6]);
                                return this.f35847d[a6];
                            }
                        }
                        z = false;
                        this.f35846c[a6] = new nhk(this.f35863w, this.f35856p, this.f35859s, this.f35860t, this.f35862v, this.f35855o, this.f35853j, i3, z, this.f35850g);
                        this.f35846c[a6].mo20676a(biooArr2, carAudioConfigurationArr);
                        this.f35849f.mo20886a(a6, this.f35846c[a6], this.f35847d[a6]);
                        return this.f35847d[a6];
                    }
                    z = true;
                    this.f35846c[a6] = new nhk(this.f35863w, this.f35856p, this.f35859s, this.f35860t, this.f35862v, this.f35855o, this.f35853j, i3, z, this.f35850g);
                    this.f35846c[a6].mo20676a(biooArr2, carAudioConfigurationArr);
                    this.f35849f.mo20886a(a6, this.f35846c[a6], this.f35847d[a6]);
                    return this.f35847d[a6];
                }
            }
        }
        if (this.f35852i) {
            bisd bisd = bivb2.f121928f;
            if (bisd == null) {
                bisd = bisd.f121509d;
            }
            if ((bisd.f121511a & 2) != 0) {
                bisd bisd2 = bivb2.f121928f;
                if (bisd2 == null) {
                    bisd2 = bisd.f121509d;
                }
                bioo bioo2 = bisd2.f121513c;
                if (bioo2 == null) {
                    bioo2 = bioo.f121076e;
                }
                String a7 = m26588a(bioo2);
                if (a7 != null) {
                    this.f35860t.mo21273a(bpdn.PROTOCOL_WRONG_CONFIGURATION, bpdo.BAD_MIC_AUDIO_CONFIG, a7);
                    return null;
                }
                CarAudioConfiguration[] a8 = m26590a(new bioo[]{bioo2}, false);
                this.f35854l = new njo(a8);
                ntq ntq = new ntq(this.f35863w, this.f35861u.f36296c.getBoolean("car_save_mic", false));
                this.f35848e = ntq;
                ntq.f36454b = a8;
                return ntq;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo20915a(njl njl) {
        njk njk = njl.f35829a;
        if (njk != null) {
            njk.mo20895a(njl);
        }
    }

    /* renamed from: a */
    public final boolean mo20916a(long j) {
        this.f35862v.mo21255R();
        nhw nhw = (nhw) this.f35855o;
        if (nhw.mo20710c()) {
            return true;
        }
        if (j <= 0) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        nhw.mo20708a(3, j, true);
        long elapsedRealtime2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
        if (elapsedRealtime2 > 0) {
            nhw.mo20708a(5, elapsedRealtime2, true);
        }
        return nhw.mo20710c();
    }
}
