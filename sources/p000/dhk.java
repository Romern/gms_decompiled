package p000;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: dhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dhk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ dhm f13134a;

    /* renamed from: b */
    private final dhi f13135b;

    public dhk(dhm dhm, dhi dhi) {
        this.f13134a = dhm;
        this.f13135b = dhi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0496 A[Catch:{ all -> 0x04b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0498 A[Catch:{ all -> 0x04b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03e0 A[SYNTHETIC] */
    public final void run() {
        boolean z;
        int i;
        dmw dmw;
        String str;
        int i2;
        brtm brtm;
        djz djz;
        boolean z2;
        int i3;
        String str2;
        String str3;
        Object obj;
        boolean z3;
        boolean z4;
        dii dii;
        dhj dhj;
        boolean z5;
        int i4;
        String b;
        dii dii2;
        Set<String> categories;
        Intent intent = this.f13135b.f13118e;
        bmzs.m108696a(intent);
        String action = intent.getAction();
        dfy a = dfy.m8329a(this.f13134a.f13148k);
        try {
            djz f = a.mo8898f();
            brtm f2 = f.mo9181f();
            String str4 = this.f13135b.f13123j;
            if (str4 != null) {
                int a2 = dlb.m8783a(f, str4);
                if (a2 < 0) {
                    this.f13134a.f13143f.lock();
                    this.f13134a.f13149l.mo9012b(this.f13135b);
                    this.f13135b.mo9014b();
                    if (this.f13134a.f13145h <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bmzs.m108698a(z);
                    dhm.m8502a(this.f13134a);
                    this.f13134a.f13149l.mo9007a();
                }
                i = a2;
            } else {
                i = -1;
            }
            String E = f2.mo69896E();
            String a3 = dmv.m8834a(E, this.f13134a.f13148k.getClass().getName());
            dmz c = f2.mo69922c(a3);
            if (c == null) {
                String valueOf = String.valueOf(a3);
                Log.e("LoadManifestTask", valueOf.length() == 0 ? new String("Unable to find container service: ") : "Unable to find container service: ".concat(valueOf));
                dmw = null;
            } else {
                String a4 = dmv.m8834a(E, action);
                dmw = c.mo9293a(a4);
                if (dmw == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 24 + String.valueOf(a4).length());
                    sb.append("Unable to find action: ");
                    sb.append(a3);
                    sb.append(":");
                    sb.append(a4);
                    Log.e("LoadManifestTask", sb.toString());
                    dmw = null;
                }
            }
            if (dmw != null) {
                Intent intent2 = this.f13135b.f13118e;
                if (intent2 != null && (categories = intent2.getCategories()) != null) {
                    Iterator<String> it = categories.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        if (next.startsWith("targeted_intent_op_prefix:")) {
                            str = next.substring(26);
                            break;
                        }
                    }
                }
                str = null;
                boolean z6 = !aytw.m84815b(this.f13134a.f13148k);
                dnb dnb = new dnb();
                String str5 = " dropping operation.";
                dhf dhf = null;
                int i5 = 0;
                for (int b2 = dmw.mo9289b(); i5 < b2; b2 = i2) {
                    dmw.mo9288a(dnb, i5);
                    dmw dmw2 = dmw;
                    String e = dnb.mo9296e();
                    if (z6 && !dnb.mo9300i()) {
                        str2 = str;
                        djz = f;
                        brtm = f2;
                        i3 = i;
                        z2 = z6;
                        i2 = b2;
                        str3 = str5;
                    } else {
                        if (this.f13135b.f13124k && !dnb.mo9299h()) {
                            str2 = str;
                            djz = f;
                            brtm = f2;
                            i3 = i;
                            z2 = z6;
                            i2 = b2;
                        } else if (i >= 0 && dnb.mo9290S() != i) {
                            str2 = str;
                            djz = f;
                            brtm = f2;
                            i3 = i;
                            z2 = z6;
                            i2 = b2;
                            str3 = str5;
                        } else if ((this.f13135b.f13114a & 1) != 0 && !dnb.mo9297f()) {
                            str2 = str;
                            djz = f;
                            brtm = f2;
                            i3 = i;
                            z2 = z6;
                            i2 = b2;
                            str3 = str5;
                        } else if (str == null || str.equals(e)) {
                            if (dnb.mo9298g()) {
                                dhm dhm = this.f13134a;
                                str2 = str;
                                i3 = i;
                                z2 = z6;
                                obj = dhm.f13142e.mo9095a(dhm.f13148k, e, dhm.f13138a);
                            } else {
                                str2 = str;
                                i3 = i;
                                z2 = z6;
                                obj = null;
                            }
                            try {
                                int S = dnb.mo9290S();
                                if (S < 0 || S >= f.mo9177c()) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                bmxy.m108600b(z4);
                                String b3 = f.mo9176b(S).mo9184b();
                                dhl dhl = (dhl) this.f13134a.f13147j.get(b3);
                                if (dhl != null) {
                                    djz = f;
                                } else {
                                    try {
                                        Context context = this.f13134a.f13148k;
                                        djz f3 = a.mo8898f();
                                        djz = f;
                                        try {
                                            dka a5 = f3.mo9172a(b3);
                                            if (a5 != null) {
                                                Context a6 = a.mo8883a(context, f3, a5);
                                                if (a6 != null) {
                                                    dhl = new dhl(a6);
                                                    this.f13134a.f13147j.put(b3, dhl);
                                                } else {
                                                    brtm = f2;
                                                    i2 = b2;
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(e).length() + 62);
                                                    sb2.append("Unable to load Chimera module context for ");
                                                    sb2.append(e);
                                                    str3 = str5;
                                                    sb2.append(str3);
                                                    Log.w("LoadManifestTask", sb2.toString());
                                                    if (obj != null) {
                                                        dii2 = this.f13134a.f13142e;
                                                        dii2.mo9097a(obj);
                                                    }
                                                }
                                            } else {
                                                brtm = f2;
                                                i2 = b2;
                                                str3 = str5;
                                                try {
                                                    dgd.m8383a(a.f12990a, 12, b3);
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(b3).length() + 17);
                                                    sb3.append("module ");
                                                    sb3.append(b3);
                                                    sb3.append(" not found");
                                                    throw new InvalidConfigException(sb3.toString());
                                                } catch (InvalidConfigException e2) {
                                                    e = e2;
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(e).length() + 62);
                                                    sb4.append("Unable to load Chimera module context for ");
                                                    sb4.append(e);
                                                    sb4.append(str3);
                                                    Log.w("LoadManifestTask", sb4.toString(), e);
                                                    if (obj != null) {
                                                        dii2 = this.f13134a.f13142e;
                                                        dii2.mo9097a(obj);
                                                        i5++;
                                                        str5 = str3;
                                                        dmw = dmw2;
                                                        str = str2;
                                                        i = i3;
                                                        z6 = z2;
                                                        f = djz;
                                                        f2 = brtm;
                                                    } else {
                                                        i5++;
                                                        str5 = str3;
                                                        dmw = dmw2;
                                                        str = str2;
                                                        i = i3;
                                                        z6 = z2;
                                                        f = djz;
                                                        f2 = brtm;
                                                    }
                                                }
                                            }
                                        } catch (InvalidConfigException e3) {
                                            e = e3;
                                            brtm = f2;
                                            i2 = b2;
                                            str3 = str5;
                                            StringBuilder sb42 = new StringBuilder(String.valueOf(e).length() + 62);
                                            sb42.append("Unable to load Chimera module context for ");
                                            sb42.append(e);
                                            sb42.append(str3);
                                            Log.w("LoadManifestTask", sb42.toString(), e);
                                            if (obj != null) {
                                            }
                                        }
                                    } catch (InvalidConfigException e4) {
                                        e = e4;
                                        djz = f;
                                        brtm = f2;
                                        i2 = b2;
                                        str3 = str5;
                                        StringBuilder sb422 = new StringBuilder(String.valueOf(e).length() + 62);
                                        sb422.append("Unable to load Chimera module context for ");
                                        sb422.append(e);
                                        sb422.append(str3);
                                        Log.w("LoadManifestTask", sb422.toString(), e);
                                        if (obj != null) {
                                        }
                                    }
                                }
                                dhj dhj2 = (dhj) dhl.f13137b.get(e);
                                if (dhj2 == null) {
                                    b = dmv.m8840b(f2.mo69896E(), e);
                                    if (this.f13135b.f13117d == null) {
                                        brtm = f2;
                                    } else {
                                        String a7 = dhm.m8501a(b3, b);
                                        brtm = f2;
                                        if (this.f13135b.f13117d.contains(a7)) {
                                            String valueOf2 = String.valueOf(a7);
                                            Log.w("LoadManifestTask", valueOf2.length() == 0 ? new String("Dropping blacklisted operation ") : "Dropping blacklisted operation ".concat(valueOf2));
                                            if (obj != null) {
                                                this.f13134a.f13142e.mo9097a(obj);
                                                i2 = b2;
                                                str3 = str5;
                                            } else {
                                                i2 = b2;
                                                str3 = str5;
                                            }
                                        }
                                    }
                                    try {
                                        i4 = b2;
                                        dhj dhj3 = new dhj(this.f13134a, dhl.f13136a, b3, b);
                                        dhl.f13137b.put(e, dhj3);
                                        dhj = dhj3;
                                    } catch (ClassNotFoundException e5) {
                                        e = e5;
                                        i4 = b2;
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(b).length() + 59);
                                        sb5.append("Can't find Chimera operation impl class ");
                                        sb5.append(b);
                                        sb5.append(" dropping operation");
                                        Log.e("LoadManifestTask", sb5.toString(), e);
                                        if (obj == null) {
                                        }
                                    }
                                } else {
                                    brtm = f2;
                                    i4 = b2;
                                    dhj = dhj2;
                                }
                                IntentOperation a8 = dhj.mo9015a();
                                if (a8 != null) {
                                    this.f13134a.f13143f.lock();
                                    if (dhf == null) {
                                        dhg dhg = (dhg) this.f13134a.f13144g.get(action);
                                        if (dhg == null) {
                                            dhg = new dhg(this.f13134a, action);
                                        }
                                        dhi dhi = this.f13135b;
                                        if (!dhg.f13112c) {
                                            if (((dhg) dhg.f13113d.f13144g.put(dhg.f13110a, dhg)) == null) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            bmzs.m108698a(z5);
                                            dhg.f13112c = true;
                                        }
                                        dhf dhf2 = new dhf(dhg, dhi);
                                        dhg.f13111b.add(dhf2);
                                        dhf = dhf2;
                                    }
                                    boolean f4 = dnb.mo9297f();
                                    int __offset = dnb.__offset(6);
                                    long j = (long) (__offset != 0 ? dnb.f143329bb.getInt(__offset + dnb.bb_pos) : 0);
                                    if (f4) {
                                        dhi dhi2 = dhf.f13104a;
                                        bmzs.m108698a(!dhi2.f13115b);
                                        dhi2.f13121h++;
                                    }
                                    Intent intent3 = dhf.f13104a.f13118e;
                                    bmzs.m108696a(intent3);
                                    dhf.f13105b.add(new dhe(dhf, intent3, a8, dhj, f4, obj, j));
                                    dhf.f13109f.mo9004a();
                                    try {
                                        this.f13134a.f13143f.unlock();
                                    } catch (Throwable th) {
                                        th = th;
                                        z3 = true;
                                        this.f13134a.f13142e.mo9097a(obj);
                                        throw th;
                                    }
                                } else if (obj != null) {
                                    dii = this.f13134a.f13142e;
                                    dii.mo9097a(obj);
                                    str3 = str5;
                                } else {
                                    str3 = str5;
                                }
                            } catch (ClassNotFoundException e6) {
                                e = e6;
                                StringBuilder sb52 = new StringBuilder(String.valueOf(b).length() + 59);
                                sb52.append("Can't find Chimera operation impl class ");
                                sb52.append(b);
                                sb52.append(" dropping operation");
                                Log.e("LoadManifestTask", sb52.toString(), e);
                                if (obj == null) {
                                    dii = this.f13134a.f13142e;
                                    dii.mo9097a(obj);
                                    str3 = str5;
                                    i5++;
                                    str5 = str3;
                                    dmw = dmw2;
                                    str = str2;
                                    i = i3;
                                    z6 = z2;
                                    f = djz;
                                    f2 = brtm;
                                } else {
                                    str3 = str5;
                                    i5++;
                                    str5 = str3;
                                    dmw = dmw2;
                                    str = str2;
                                    i = i3;
                                    z6 = z2;
                                    f = djz;
                                    f2 = brtm;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z3 = false;
                                if (obj != null && !z3) {
                                    this.f13134a.f13142e.mo9097a(obj);
                                }
                                throw th;
                            }
                        } else {
                            str2 = str;
                            djz = f;
                            brtm = f2;
                            i3 = i;
                            z2 = z6;
                            i2 = b2;
                            str3 = str5;
                        }
                        str3 = str5;
                    }
                    i5++;
                    str5 = str3;
                    dmw = dmw2;
                    str = str2;
                    i = i3;
                    z6 = z2;
                    f = djz;
                    f2 = brtm;
                }
                if (dhf != null) {
                    dhf.f13109f.f13113d.f13143f.lock();
                    try {
                        bmzs.m108698a(!dhf.f13108e);
                        dhf.f13108e = true;
                        if (dhf.f13106c == 0) {
                            if (dhf.f13105b.isEmpty()) {
                                bmzs.m108698a(dhf.f13109f.f13111b.peek() == dhf);
                                dhf.f13109f.mo9005b();
                            }
                        }
                    } finally {
                        dhf.f13109f.f13113d.f13143f.unlock();
                    }
                }
            }
        } catch (InvalidConfigException e7) {
            String valueOf3 = String.valueOf(this.f13134a.f13148k.getClass().getName());
            Log.e("LoadManifestTask", valueOf3.length() == 0 ? new String("Unable to get Chimera module manifest. Dropping all operations for ") : "Unable to get Chimera module manifest. Dropping all operations for ".concat(valueOf3), e7);
        }
        this.f13134a.f13143f.lock();
        try {
            this.f13134a.f13149l.mo9012b(this.f13135b);
            this.f13135b.mo9014b();
            if (this.f13134a.f13145h <= 0) {
            }
            bmzs.m108698a(z);
            dhm.m8502a(this.f13134a);
            this.f13134a.f13149l.mo9007a();
        } finally {
            this.f13134a.f13143f.unlock();
        }
    }
}
