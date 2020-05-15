package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: adjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adjg implements adje {

    /* renamed from: a */
    static final adjh f61875a = new adjh();

    /* renamed from: b */
    static final byte[] f61876b = "LastUpdate".getBytes(adfh.f61554b);

    /* renamed from: c */
    static final byte[] f61877c = "IntentFilterFetchInfo:".getBytes(adfh.f61554b);

    /* renamed from: d */
    private static final adfs f61878d = new adfs("DomainFilterImpl");

    /* renamed from: f */
    private static final byte[] f61879f = "pkgMetadata:".getBytes(adfh.f61554b);

    /* renamed from: A */
    private final adfc f61880A;

    /* renamed from: B */
    private final adfc f61881B;

    /* renamed from: C */
    private final adfc f61882C;

    /* renamed from: e */
    private final Object f61883e = new Object();

    /* renamed from: g */
    private final Context f61884g;

    /* renamed from: h */
    private final adik f61885h;

    /* renamed from: i */
    private final adeo f61886i;

    /* renamed from: j */
    private final adkn f61887j;

    /* renamed from: k */
    private final adha f61888k;

    /* renamed from: l */
    private final adkr f61889l;

    /* renamed from: m */
    private final SharedPreferences f61890m;

    /* renamed from: n */
    private final adfd f61891n;

    /* renamed from: o */
    private final adfg f61892o;

    /* renamed from: p */
    private final ArrayList f61893p;

    /* renamed from: q */
    private final Random f61894q;

    /* renamed from: r */
    private final adfc f61895r;

    /* renamed from: s */
    private final adfc f61896s;

    /* renamed from: t */
    private final adfc f61897t;

    /* renamed from: u */
    private final adfc f61898u;

    /* renamed from: v */
    private final adfc f61899v;

    /* renamed from: w */
    private final adfc f61900w;

    /* renamed from: x */
    private final adfc f61901x;

    /* renamed from: y */
    private final adfc f61902y;

    /* renamed from: z */
    private final adfc f61903z;

    public adjg(Context context, adik adik, adfg adfg, adeo adeo, adha adha, adkn adkn, adkr adkr, SharedPreferences sharedPreferences, adfd adfd, Random random) {
        this.f61884g = context;
        this.f61885h = adik;
        this.f61886i = adeo;
        this.f61892o = adfg;
        this.f61888k = adha;
        this.f61887j = adkn;
        this.f61889l = adkr;
        this.f61890m = sharedPreferences;
        this.f61891n = adfd;
        this.f61893p = new ArrayList();
        this.f61894q = random;
        this.f61895r = adfd.mo33415b("DomainFilter.VerifyIncrementalChangesNoPackageAdded");
        this.f61896s = adfd.mo33415b("DomainFilter.VerifyIncrementalChangesPackageNotFound");
        this.f61897t = adfd.mo33415b("DomainFilter.VerifyIncrementalChangesIOExceptionReadingPackage");
        this.f61898u = adfd.mo33415b("DomainFilter.VerifyIncrementalChangesExceptionParsingEntry");
        this.f61899v = adfd.mo33415b("DomainFilter.VerifyIncrementalChangesPackageEntryNotEqual");
        this.f61900w = adfd.mo33415b("DomainFilter.VerifyIncrementalChangesSuccess");
        this.f61901x = adfd.mo33415b("DomainFilter.VerifyFullChangesNoPackageAdded");
        this.f61902y = adfd.mo33415b("DomainFilter.VerifyFullChangesPackageNotFound");
        this.f61903z = adfd.mo33415b("DomainFilter.VerifyFullChangesIOExceptionReadingPackage");
        this.f61880A = adfd.mo33415b("DomainFilter.VerifyFullChangesExceptionParsingEntry");
        this.f61881B = adfd.mo33415b("DomainFilter.VerifyFullChangesPackageEntryNotEqual");
        this.f61882C = adfd.mo33415b("DomainFilter.VerifyFullChangesSuccess");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d9, code lost:
        if (r2 > 0) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01fd, code lost:
        if (r1 > 0) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0264, code lost:
        if (r0 != 7) goto L_0x0266;
     */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0537  */
    /* renamed from: a */
    private final int m50600a(adiq adiq, camh camh) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        chuw a;
        chus chus;
        String str;
        adgy c;
        Throwable th;
        adiq adiq2 = adiq;
        adfb a2 = this.f61891n.mo33411a();
        Account c2 = this.f61887j.mo33603c();
        if (c2 == null) {
            a2.mo33409a("DomainFilter.NoAccount");
            return 3;
        } else if (this.f61889l.mo33606a() == 0) {
            a2.mo33409a("DomainFilter.OptedOut");
            return 3;
        } else {
            byte[] bArr = new byte[0];
            if (adiq2 != null && adiq2.f61834b.equals(c2.name)) {
                bArr = adiq2.f61835c.getKey();
            }
            Set a3 = m50605a(mo33576g());
            adjf adjf = new adjf(this.f61886i.mo33393a(bArr, c2, camh, a3));
            new Object[1][0] = c2.name;
            try {
                btih btih = (btih) adjf.f61874a.get();
                adfs adfs = f61878d;
                Object[] objArr = new Object[1];
                int i = btih.f164961ai;
                if (i == -1) {
                    i = bxxm.f165037a.mo74228a(btih).mo74223b(btih);
                    btih.f164961ai = i;
                }
                objArr[0] = Integer.valueOf(i);
                adfs.mo33423a("Domain filter response size: %s", objArr);
                adfg adfg = this.f61892o;
                ByteString bxtx = btih.f148966a;
                sdo.m34959a(bxtx);
                adff a4 = adfg.mo33416a();
                camf camf = a4.f61547a;
                bxvd bxvd = (bxvd) camf.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) camf);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                camf camf2 = camf.f175264b;
                bxtx.getClass();
                ((camf) bxvd.f164949b).f175266a = bxtx;
                a4.f61547a = (camf) bxvd.mo74062i();
                adfg.m50301a(adfg.f61552a, a4);
                SharedPreferences.Editor edit = this.f61890m.edit();
                edit.clear();
                for (Map.Entry entry : Collections.unmodifiableMap(btih.f148969d).entrySet()) {
                    edit.putString((String) entry.getKey(), (String) entry.getValue());
                }
                edit.apply();
                int a5 = btig.m116810a(btih.f148970e);
                if (a5 == 0) {
                    a5 = 1;
                }
                int i2 = a5 - 2;
                if (i2 != 1) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            if (cepc.m137701b()) {
                                f61878d.mo33423a("Comparing full and incremental filter for %s", c2.name);
                            }
                            bxwc<bthy> bxwc = btih.f148967b;
                            bxwc<bthy> bxwc2 = btih.f148971f;
                            bxwc bxwc3 = btih.f148972g;
                            Map unmodifiableMap = Collections.unmodifiableMap(btih.f148968c);
                            Map unmodifiableMap2 = Collections.unmodifiableMap(btih.f148973h);
                            bxwc bxwc4 = btih.f148974i;
                            HashSet hashSet = new HashSet();
                            HashSet hashSet2 = new HashSet();
                            c = this.f61888k.mo33517c();
                            c.mo33504c();
                            while (c.mo33507e()) {
                                if (!m50612a(c.mo33502a())) {
                                    if (!m50614b(c.mo33502a())) {
                                        c.mo33506d();
                                    }
                                }
                                if (m50614b(c.mo33502a())) {
                                    hashSet2.add(new String(c.mo33502a()).substring(12));
                                    c.mo33506d();
                                } else {
                                    hashSet.add(bxtx.m123261a(c.mo33502a()));
                                    c.mo33506d();
                                }
                            }
                            if (c != null) {
                                c.close();
                            }
                            hashSet.removeAll(bxwc3);
                            for (bthy bthy : bxwc2) {
                                hashSet.add(bthy.f148919a);
                            }
                            hashSet2.removeAll(bxwc4);
                            hashSet2.addAll(unmodifiableMap2.keySet());
                            HashSet hashSet3 = new HashSet();
                            for (bthy bthy2 : bxwc) {
                                hashSet3.add(bthy2.f148919a);
                            }
                            Set keySet = unmodifiableMap.keySet();
                            int size = rsr.m34361b(hashSet3, hashSet).size();
                            int size2 = rsr.m34361b(hashSet, hashSet3).size();
                            if (size > 0) {
                            }
                            m50607a(a2, "DomainFilter.IncrementalDomainMissing", size);
                            m50607a(a2, "DomainFilter.IncrementalExtraDomainExists", size2);
                            a2.mo33409a("DomainFilter.IncrementalDomainsMismatchesFound");
                            int size3 = rsr.m34361b(keySet, hashSet2).size();
                            int size4 = rsr.m34361b(hashSet2, keySet).size();
                            if (size3 > 0) {
                            }
                            m50607a(a2, "DomainFilter.IncrementalPackageMissing", size3);
                            m50607a(a2, "DomainFilter.IncrementalExtraPackageExists", size4);
                            a2.mo33409a("DomainFilter.IncrementalPackagesMismatchesFound");
                            a2.mo33409a("DomainFilter.IncrementalWithFullChanges");
                        }
                        if (cepc.m137701b()) {
                            f61878d.mo33423a("Saving filter for %s", c2.name);
                        }
                        bxwc bxwc5 = btih.f148967b;
                        if (bxwc5.isEmpty()) {
                            m50609a(c2, a2, btih.f148966a.getKey());
                            z3 = false;
                        } else {
                            adiq a6 = m50602a(c2, btih.f148966a.getKey());
                            Map unmodifiableMap3 = Collections.unmodifiableMap(btih.f148968c);
                            m50608a(a6, bxwc5, m50606a(unmodifiableMap3), unmodifiableMap3);
                            mo33573a(a3, 5);
                            mo33575f();
                            z3 = true;
                        }
                        try {
                            int a7 = btig.m116810a(btih.f148970e);
                            if (a7 == 0) {
                            }
                            a2.mo33409a("DomainFilter.FullChanges");
                            int a8 = btig.m116810a(btih.f148970e);
                            if (a8 != 0 && a8 == 7) {
                                try {
                                    bxwc<bthy> bxwc6 = btih.f148967b;
                                    bxwc<bthy> bxwc7 = btih.f148971f;
                                    bxwc<ByteString> bxwc8 = btih.f148972g;
                                    bxvt bxvt = btih.f148975j;
                                    bxvt bxvt2 = btih.f148976k;
                                    bxvt bxvt3 = btih.f148977l;
                                    ArrayList arrayList = new ArrayList();
                                    for (bthy bthy3 : bxwc6) {
                                        arrayList.add(bthy3.f148919a.mo73781l());
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (bthy bthy4 : bxwc7) {
                                        arrayList2.add(bthy4.f148919a.mo73781l());
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    for (ByteString bxtx2 : bxwc8) {
                                        arrayList3.add(bxtx2.mo73781l());
                                    }
                                    Iterator it = this.f61893p.iterator();
                                    while (it.hasNext()) {
                                        ((adjl) it.next()).mo33585a(arrayList, arrayList2, arrayList3, bxvt, bxvt2, bxvt3);
                                    }
                                    z2 = false;
                                } catch (IOException e) {
                                    try {
                                        adfu.m50331a(this.f61884g, "Error in sending all and incremental data to plugins", e, f61878d);
                                        z2 = true;
                                    } catch (Exception e2) {
                                        e = e2;
                                        z4 = z3;
                                        z5 = true;
                                        a = m50604a(e);
                                        if (a != null) {
                                        }
                                        if (chus == chus.PERMISSION_DENIED) {
                                        }
                                        if (!z2) {
                                        }
                                    }
                                }
                            } else {
                                try {
                                    bxwc<bthy> bxwc9 = btih.f148967b;
                                    bxvt bxvt4 = btih.f148975j;
                                    ArrayList arrayList4 = new ArrayList();
                                    for (bthy bthy5 : bxwc9) {
                                        arrayList4.add(bthy5.f148919a.mo73781l());
                                    }
                                    Iterator it2 = this.f61893p.iterator();
                                    while (it2.hasNext()) {
                                        ((adjl) it2.next()).mo33583a(arrayList4, bxvt4);
                                    }
                                    z2 = false;
                                } catch (IOException e3) {
                                    adfu.m50331a(this.f61884g, "Error in sending all data to plugins", e3, f61878d);
                                    z2 = true;
                                }
                            }
                        } catch (Exception e4) {
                            e = e4;
                            z4 = z3;
                            z5 = false;
                            a = m50604a(e);
                            if (a != null) {
                                chus = a.f189236a.f189233s;
                            } else {
                                chus = null;
                            }
                            if (chus == chus.PERMISSION_DENIED) {
                                m50609a(c2, a2, new byte[0]);
                                z = false;
                                z2 = z5;
                                z3 = z4;
                            } else {
                                if (chus != null) {
                                    String valueOf = String.valueOf(chus.name());
                                    str = valueOf.length() == 0 ? new String("DomainFilter.BackendError.") : "DomainFilter.BackendError.".concat(valueOf);
                                } else {
                                    str = "DomainFilter.Unknown";
                                }
                                a2.mo33409a(str);
                                if (cepl.f183185a.mo6606a().mo79524H() > this.f61894q.nextDouble()) {
                                    adfu.m50331a(this.f61884g, "Error while reading domain filter from WHAPI", e, f61878d);
                                    z = true;
                                    z2 = z5;
                                    z3 = z4;
                                } else {
                                    f61878d.mo33425a(e, "%s", "Error while reading domain filter from WHAPI");
                                    z = true;
                                    z2 = z5;
                                    z3 = z4;
                                }
                            }
                            if (!z2) {
                            }
                        }
                    } else {
                        if (cepc.m137701b()) {
                            f61878d.mo33423a("Saving incremental filter for %s", c2.name);
                        }
                        mo33572a(bmxv.m108566b(m50602a(c2, btih.f148966a.getKey())), btih.f148971f, btih.f148972g, m50606a(Collections.unmodifiableMap(btih.f148973h)), Collections.unmodifiableMap(btih.f148973h), btih.f148974i);
                        mo33575f();
                        try {
                            a2.mo33409a("DomainFilter.IncrementalChanges");
                            try {
                                bxwc<bthy> bxwc10 = btih.f148971f;
                                bxwc<ByteString> bxwc11 = btih.f148972g;
                                bxvt bxvt5 = btih.f148976k;
                                bxvt bxvt6 = btih.f148977l;
                                ArrayList arrayList5 = new ArrayList();
                                for (bthy bthy6 : bxwc10) {
                                    arrayList5.add(bthy6.f148919a.mo73781l());
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (ByteString bxtx3 : bxwc11) {
                                    arrayList6.add(bxtx3.mo73781l());
                                }
                                Iterator it3 = this.f61893p.iterator();
                                while (it3.hasNext()) {
                                    ((adjl) it3.next()).mo33584a(arrayList5, arrayList6, bxvt5, bxvt6);
                                }
                                z3 = true;
                                z2 = false;
                            } catch (IOException e5) {
                                adfu.m50331a(this.f61884g, "Error in sending incremental data to plugins", e5, f61878d);
                                z3 = true;
                                z2 = true;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            z5 = false;
                            z4 = true;
                            a = m50604a(e);
                            if (a != null) {
                            }
                            if (chus == chus.PERMISSION_DENIED) {
                            }
                            if (!z2) {
                            }
                        }
                    }
                    try {
                        if (cepc.f183173a.mo6606a().mo79508a()) {
                            StringWriter stringWriter = new StringWriter();
                            PrintWriter printWriter = new PrintWriter(stringWriter);
                            mo33562a(printWriter);
                            printWriter.flush();
                            f61878d.mo33423a("Domain filter Dump after sync: %s", stringWriter.toString());
                            z = false;
                        } else {
                            z = false;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        z4 = z3;
                        z5 = z2;
                        a = m50604a(e);
                        if (a != null) {
                        }
                        if (chus == chus.PERMISSION_DENIED) {
                        }
                        if (!z2) {
                        }
                    }
                    if (!z2) {
                        a2.mo33409a("DomainFilter.NonRetriableError");
                        return 3;
                    } else if (z3) {
                        a2.mo33409a("DomainFilter.Success");
                        return 1;
                    } else if (z) {
                        a2.mo33409a("DomainFilter.RetriableError");
                        return 2;
                    } else {
                        a2.mo33409a("DomainFilter.NonRetriableError");
                        return 3;
                    }
                } else {
                    f61878d.mo33423a("No changes in domain filter", new Object[0]);
                    try {
                        this.f61888k.mo33512a(f61876b, m50602a(c2, btih.f148966a.getKey()).serializeToBytes());
                    } catch (IOException e8) {
                        adfu.m50331a(this.f61884g, "Error while updating last update information", e8, f61878d);
                    }
                    mo33575f();
                    a2.mo33409a("DomainFilter.NoChanges");
                    return 1;
                }
            } catch (Exception e9) {
                e = e9;
                z5 = false;
                z4 = false;
                a = m50604a(e);
                if (a != null) {
                }
                if (chus == chus.PERMISSION_DENIED) {
                }
                if (!z2) {
                }
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
        }
        throw th;
    }

    /* renamed from: b */
    private final void m50613b(adix adix) {
        try {
            this.f61888k.mo33512a(f61877c, adix.serializeToBytes());
        } catch (IOException e) {
            adfu.m50331a(this.f61884g, "Error while updating IntentFilter Fetch information", e, f61878d);
        }
    }

    /* renamed from: c */
    private final adjh m50615c(String str) {
        adfu.m50331a(this.f61884g, str, new Throwable(str), f61878d);
        return f61875a;
    }

    /* renamed from: h */
    private final boolean m50616h() {
        if (this.f61888k.mo33513a()) {
            return true;
        }
        f61878d.mo33424a(new Throwable("Domain filter data store is not initialized."));
        return false;
    }

    /* renamed from: d */
    public final long mo33568d() {
        adiq e = mo33574e();
        if (e != null) {
            return e.f61833a;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final adiq mo33574e() {
        byte[] bArr;
        if (m50616h()) {
            try {
                bArr = this.f61888k.mo33514a(f61876b);
            } catch (IOException e) {
                adfu.m50331a(this.f61884g, "Error reading the last update from levelDb", e, f61878d);
                bArr = null;
            }
            if (bArr != null) {
                try {
                    return (adiq) GeneratedMessageLite.m124016a(adiq.f61831d, bArr, bxus.m123743b());
                } catch (bxwf e2) {
                    adfu.m50331a(this.f61884g, "Error parsing last update info", e2, f61878d);
                    return null;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo33575f() {
        synchronized (this.f61883e) {
            adix g = mo33576g();
            bxvd bxvd = (bxvd) g.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) g);
            Set a = m50605a(g);
            for (Integer num : Collections.unmodifiableMap(g.f61852a).keySet()) {
                Integer valueOf = Integer.valueOf(num.intValue());
                if (!a.contains(valueOf)) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    adix adix = adix.f61850c;
                    ((adix) bxvd.f164949b).mo33556a().remove(valueOf);
                }
            }
            m50613b((adix) bxvd.mo74062i());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final adix mo33576g() {
        byte[] bArr;
        if (!m50616h()) {
            return adix.f61850c;
        }
        try {
            bArr = this.f61888k.mo33514a(f61877c);
        } catch (IOException e) {
            adfu.m50331a(this.f61884g, "Error reading the Intent filter fetch info from levelDb", e, f61878d);
            bArr = null;
        }
        if (bArr == null) {
            return adix.f61850c;
        }
        try {
            return (adix) GeneratedMessageLite.m124016a(adix.f61850c, bArr, bxus.m123743b());
        } catch (bxwf e2) {
            adfu.m50331a(this.f61884g, "Error parsing Intent filter fetch info.", e2, f61878d);
            return adix.f61850c;
        }
    }

    /* renamed from: c */
    public final int mo33567c() {
        int i = 0;
        if (!m50616h()) {
            return 0;
        }
        adgy c = this.f61888k.mo33517c();
        try {
            c.mo33504c();
            while (c.mo33507e()) {
                if (m50612a(c.mo33502a())) {
                    i++;
                }
                c.mo33506d();
            }
            if (c != null) {
                c.close();
            }
            return i;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    private static boolean m50614b(byte[] bArr) {
        if (bArr.length <= f61879f.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr2 = f61879f;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* renamed from: b */
    public final synchronized int mo33564b(camh camh) {
        int i;
        boolean z;
        if (m50616h()) {
            adiq e = mo33574e();
            if (e != null && (cepl.m137721b() <= 0 || System.currentTimeMillis() - e.f61833a <= cepl.m137721b())) {
                if (this.f61889l.mo33606a() != 1 || this.f61887j.mo33600a() == null) {
                    z = false;
                    new Object[1][0] = Boolean.valueOf(z);
                    i = z ? m50600a(e, camh) : 4;
                } else if (this.f61887j.mo33600a().name.equals(e.f61834b)) {
                    z = false;
                    new Object[1][0] = Boolean.valueOf(z);
                    if (z) {
                    }
                }
            }
            z = true;
            new Object[1][0] = Boolean.valueOf(z);
            if (z) {
            }
        } else {
            i = 3;
        }
        return i;
    }

    /* renamed from: b */
    public final synchronized void mo33565b() {
        if (cepc.m137701b()) {
            f61878d.mo33423a("Wiping all Domain filter data", new Object[0]);
        }
        synchronized (this.f61883e) {
            this.f61888k.mo33519d();
        }
        ArrayList arrayList = this.f61893p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((adjl) arrayList.get(i)).mo33583a(bngx.m109376e(), bngx.m109376e());
        }
    }

    /* renamed from: b */
    public final byte[] mo33566b(String str) {
        String valueOf = String.valueOf(str);
        return this.f61888k.mo33514a((valueOf.length() == 0 ? new String("pkgMetadata:") : "pkgMetadata:".concat(valueOf)).getBytes(adfh.f61554b));
    }

    /* renamed from: a */
    static adip m50601a(bthy bthy, Set set) {
        int i;
        String str;
        int i2;
        boolean z;
        ByteString bxtx;
        ByteString bxtx2;
        ByteString bxtx3;
        ByteString bxtx4;
        bthy bthy2 = bthy;
        bxvd da = adip.f61826d.mo74144da();
        bxwc bxwc = bthy2.f148920b;
        ArrayList arrayList = new ArrayList(bxwc.size());
        int i3 = 0;
        while (i3 < bxwc.size()) {
            bthz bthz = (bthz) bxwc.get(i3);
            bxvd da2 = adis.f61836e.mo74144da();
            int i4 = bthz.f148925a;
            if (i4 != 0) {
                i2 = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? 0 : 5 : 4 : 3 : 2 : 1;
            } else {
                i2 = 6;
            }
            int i5 = i2 - 1;
            if (i2 != 0) {
                if (i5 == 0) {
                    if (i4 == 1) {
                        z = ((Boolean) bthz.f148926b).booleanValue();
                    } else {
                        z = false;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    adis adis = (adis) da2.f164949b;
                    adis.f61838a = 1;
                    adis.f61839b = Boolean.valueOf(z);
                } else if (i5 == 1) {
                    if (i4 == 2) {
                        bxtx = (ByteString) bthz.f148926b;
                    } else {
                        bxtx = bxtx.f164797b;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    adis adis2 = (adis) da2.f164949b;
                    bxtx.getClass();
                    adis2.f61838a = 2;
                    adis2.f61839b = bxtx;
                } else if (i5 == 2) {
                    if (i4 == 3) {
                        bxtx2 = (ByteString) bthz.f148926b;
                    } else {
                        bxtx2 = bxtx.f164797b;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    adis adis3 = (adis) da2.f164949b;
                    bxtx2.getClass();
                    adis3.f61838a = 3;
                    adis3.f61839b = bxtx2;
                } else if (i5 == 3) {
                    if (i4 == 4) {
                        bxtx3 = (ByteString) bthz.f148926b;
                    } else {
                        bxtx3 = bxtx.f164797b;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    adis adis4 = (adis) da2.f164949b;
                    bxtx3.getClass();
                    adis4.f61838a = 4;
                    adis4.f61839b = bxtx3;
                } else if (i5 == 4) {
                    if (i4 == 5) {
                        bxtx4 = (ByteString) bthz.f148926b;
                    } else {
                        bxtx4 = bxtx.f164797b;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    adis adis5 = (adis) da2.f164949b;
                    bxtx4.getClass();
                    adis5.f61838a = 5;
                    adis5.f61839b = bxtx4;
                }
                int i6 = bthz.f148927c;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                adis adis6 = (adis) da2.f164949b;
                adis6.f61840c = i6;
                bxvt bxvt = bthz.f148928d;
                if (!adis6.f61841d.mo73666a()) {
                    adis6.f61841d = GeneratedMessageLite.m124019a(adis6.f61841d);
                }
                bxsy.m123078a(bxvt, adis6.f61841d);
                arrayList.add((adis) da2.mo74062i());
                i3++;
            } else {
                throw null;
            }
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        adip adip = (adip) da.f164949b;
        adip.mo33554a();
        bxsy.m123078a(arrayList, adip.f61828a);
        bxwc bxwc2 = bthy2.f148921c;
        ArrayList arrayList2 = new ArrayList(bxwc2.size());
        for (int i7 = 0; i7 < bxwc2.size(); i7++) {
            btiq btiq = (btiq) bxwc2.get(i7);
            bxvd da3 = adiy.f61854f.mo74144da();
            String str2 = btiq.f149016a;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            adiy adiy = (adiy) da3.f164949b;
            str2.getClass();
            adiy.f61856a = str2;
            String str3 = btiq.f149017b;
            str3.getClass();
            adiy.f61857b = str3;
            adiy.f61858c = btiq.f149018c;
            adiy.f61859d = btiq.f149019d;
            boolean contains = set.contains(btiq.f149016a);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ((adiy) da3.f164949b).f61860e = contains;
            arrayList2.add((adiy) da3.mo74062i());
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        adip adip2 = (adip) da.f164949b;
        adip2.mo33555b();
        bxsy.m123078a(arrayList2, adip2.f61829b);
        bxwc bxwc3 = bthy2.f148922d;
        ArrayList arrayList3 = new ArrayList(bxwc3.size());
        int i8 = 0;
        while (i8 < bxwc3.size()) {
            btil btil = (btil) bxwc3.get(i8);
            bxvd da4 = adiv.f61845c.mo74144da();
            int i9 = btil.f148991a;
            int i10 = i9 != 0 ? i9 != 1 ? i9 != 2 ? 0 : 2 : 1 : 3;
            int i11 = i10 - 1;
            if (i10 != 0) {
                if (i11 == 0) {
                    if (i9 == 1) {
                        i = cami.m126785b(((Integer) btil.f148992b).intValue());
                        if (i == 0) {
                            i = 1;
                        }
                    } else {
                        i = 2;
                    }
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    adiv adiv = (adiv) da4.f164949b;
                    adiv.f61848b = Integer.valueOf(cami.m126784a(i));
                    adiv.f61847a = 1;
                } else if (i11 == 1) {
                    if (i9 == 2) {
                        str = (String) btil.f148992b;
                    } else {
                        str = "";
                    }
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    adiv adiv2 = (adiv) da4.f164949b;
                    str.getClass();
                    adiv2.f61847a = 2;
                    adiv2.f61848b = str;
                }
                arrayList3.add((adiv) da4.mo74062i());
                i8++;
            } else {
                throw null;
            }
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        adip adip3 = (adip) da.f164949b;
        if (!adip3.f61830c.mo73666a()) {
            adip3.f61830c = GeneratedMessageLite.m124021a(adip3.f61830c);
        }
        bxsy.m123078a(arrayList3, adip3.f61830c);
        return (adip) da.mo74062i();
    }

    /* renamed from: a */
    private static final adiq m50602a(Account account, byte[] bArr) {
        bxvd da = adiq.f61831d.mo74144da();
        long currentTimeMillis = System.currentTimeMillis();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((adiq) da.f164949b).f61833a = currentTimeMillis;
        String str = account.name;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((adiq) da.f164949b).f61834b = str;
        ByteString a = ByteString.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((adiq) da.f164949b).f61835c = a;
        return (adiq) da.mo74062i();
    }

    /* renamed from: a */
    private static adjh m50603a(adip adip, int i) {
        if (i >= adip.f61829b.size()) {
            return f61875a;
        }
        adiy adiy = (adiy) adip.f61829b.get(i);
        if (!adiy.f61860e) {
            return new adjh(0, adiy.f61856a, adiy.f61858c, adiy.f61859d, adiy.f61857b, false);
        }
        return new adjh(2, adiy.f61856a, adiy.f61858c, adiy.f61859d, adiy.f61857b, false);
    }

    /* renamed from: a */
    private static chuw m50604a(Throwable th) {
        while (th != null) {
            if (th instanceof chuw) {
                return (chuw) th;
            }
            th = th.getCause();
        }
        return null;
    }

    /* renamed from: a */
    static final Set m50605a(adix adix) {
        long currentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.SECONDS.toMillis(ceqj.f183258a.mo6606a().mo79586e());
        HashSet a = bnpf.m110048a(adix.f61852a.size());
        for (Map.Entry entry : Collections.unmodifiableMap(adix.f61852a).entrySet()) {
            if (currentTimeMillis - ((adio) entry.getValue()).f61825b < millis) {
                a.add((Integer) entry.getKey());
            }
        }
        return a;
    }

    /* renamed from: a */
    private static Set m50606a(Map map) {
        int a;
        C1225nr nrVar = new C1225nr();
        for (Map.Entry entry : map.entrySet()) {
            ByteString bxtx = (ByteString) entry.getValue();
            bxus b = bxus.m123743b();
            btin btin = btin.f148993b;
            try {
                bxuc h = bxtx.mo73764h();
                GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) btin.mo74142c(4);
                bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                a2.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
                a2.mo74225d(GeneratedMessageLite);
                h.mo73787a(0);
                GeneratedMessageLite.m124027b(GeneratedMessageLite);
                btin btin2 = (btin) GeneratedMessageLite;
                int a3 = btim.m116815a(btin2.f148995a);
                if ((a3 == 0 || a3 != 2) && ((a = btim.m116815a(btin2.f148995a)) == 0 || a != 3)) {
                    nrVar.add((String) entry.getKey());
                }
            } catch (IOException e) {
                if (!(e.getCause() instanceof bxwf)) {
                    throw new bxwf(e.getMessage());
                }
                throw ((bxwf) e.getCause());
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof bxwf) {
                    throw ((bxwf) e2.getCause());
                }
                throw e2;
            } catch (bxwf e3) {
                throw e3;
            } catch (bxwf e4) {
                throw e4;
            }
        }
        return nrVar;
    }

    /* renamed from: a */
    private static final void m50607a(adfb adfb, String str, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            adfb.mo33409a(str);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adjg.a(boolean, bthy, java.util.Set):void
     arg types: [int, bthy, java.util.Set]
     candidates:
      adjg.a(adfb, java.lang.String, int):void
      adjg.a(android.accounts.Account, adfb, byte[]):void
      adjg.a(boolean, bthy, java.util.Set):void */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        p000.bqye.m113761a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0101, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:21:0x0056, B:57:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f6 A[SYNTHETIC, Splitter:B:57:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    private final void m50608a(adiq adiq, List list, Set set, Map map) {
        int i;
        int i2;
        Throwable th;
        byte[] bArr;
        bthy bthy;
        int i3;
        Set set2 = set;
        if (m50616h()) {
            try {
                WriteBatch create = WriteBatch.create();
                try {
                    adgy c = this.f61888k.mo33517c();
                    try {
                        c.mo33504c();
                        int i4 = 0;
                        bthy bthy2 = null;
                        i2 = 0;
                        i = 0;
                        while (true) {
                            try {
                                if (i4 >= list.size() && !c.mo33507e()) {
                                    break;
                                } else if (!c.mo33507e() || m50612a(c.mo33502a())) {
                                    if (i4 < list.size()) {
                                        bthy = (bthy) list.get(i4);
                                        bArr = bthy.f148919a.getKey();
                                        i3 = !c.mo33507e() ? 1 : bqcv.f140491b.compare(c.mo33502a(), bArr);
                                    } else {
                                        i3 = -1;
                                        bthy = null;
                                        bArr = null;
                                    }
                                    if (i3 < 0) {
                                        create.delete(c.mo33502a());
                                        i++;
                                        c.mo33506d();
                                    } else if (i3 != 0) {
                                        create.put(bArr, m50601a(bthy, set2).serializeToBytes());
                                        i2++;
                                        i4++;
                                        if (bthy2 == null) {
                                            bthy2 = bthy;
                                        }
                                    } else {
                                        create.put(bArr, m50601a(bthy, set2).serializeToBytes());
                                        i2++;
                                        i4++;
                                        c.mo33506d();
                                        if (bthy2 == null) {
                                            bthy2 = bthy;
                                        }
                                    }
                                } else {
                                    if (m50614b(c.mo33502a())) {
                                        create.delete(c.mo33502a());
                                    }
                                    c.mo33506d();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (c != null) {
                                }
                                throw th;
                            }
                        }
                        m50610a(map, create);
                        create.put(f61876b, adiq.serializeToBytes());
                        this.f61888k.mo33510a(create);
                        if (cepo.f183226a.mo6606a().mo79563g()) {
                            if (bthy2 == null) {
                                this.f61901x.mo33410a();
                            } else {
                                m50611a(true, bthy2, set2);
                            }
                        }
                        if (c != null) {
                            c.close();
                        }
                        if (!cepc.m137701b()) {
                            f61878d.mo33423a("updateDataStore: Domains added: %d, Domains removed: %d", Integer.valueOf(i2), Integer.valueOf(i));
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        i2 = 0;
                        i = 0;
                        if (c != null) {
                            c.close();
                        }
                        throw th;
                    }
                    try {
                        create.close();
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    i2 = 0;
                    i = 0;
                    try {
                        create.close();
                    } catch (Throwable th6) {
                        bqye.m113761a(th5, th6);
                    }
                    throw th5;
                }
            } catch (IOException e2) {
                e = e2;
                i2 = 0;
                i = 0;
                adfu.m50331a(this.f61884g, "Error while updating domain filter", e, f61878d);
                if (!cepc.m137701b()) {
                }
            }
        }
    }

    /* renamed from: a */
    private final void m50609a(Account account, adfb adfb, byte[] bArr) {
        f61878d.mo33423a("Account = %s is ineligible from using Instant apps", account.name);
        m50608a(m50602a(account, bArr), bngx.m109376e(), bnon.f131923a, bnoj.f131912b);
        m50613b(adix.f61850c);
        adfb.mo33409a("DomainFilter.IneligibleError");
    }

    /* renamed from: a */
    private static void m50610a(Map map, WriteBatch writeBatch) {
        for (Map.Entry entry : map.entrySet()) {
            String valueOf = String.valueOf((String) entry.getKey());
            writeBatch.put((valueOf.length() == 0 ? new String("pkgMetadata:") : "pkgMetadata:".concat(valueOf)).getBytes(adfh.f61554b), ((ByteString) entry.getValue()).getKey());
        }
    }

    /* renamed from: a */
    private final void m50611a(boolean z, bthy bthy, Set set) {
        adfc adfc;
        adfc adfc2;
        adfc adfc3;
        adfc adfc4;
        adfc adfc5;
        try {
            byte[] a = this.f61888k.mo33514a(bthy.f148919a.getKey());
            if (a != null) {
                if (a.length != 0) {
                    try {
                        bxus b = bxus.m123743b();
                        if (m50601a(bthy, set).equals((adip) GeneratedMessageLite.m124016a(adip.f61826d, a, b))) {
                            f61878d.mo33423a("Verified entry after DomainFilter sync", new Object[0]);
                            if (!z) {
                                adfc5 = this.f61900w;
                            } else {
                                adfc5 = this.f61882C;
                            }
                            adfc5.mo33410a();
                            return;
                        }
                        f61878d.mo33429c("Successful DomainFilterEntry written != to entry read", new Object[0]);
                        if (!z) {
                            adfc4 = this.f61899v;
                        } else {
                            adfc4 = this.f61881B;
                        }
                        adfc4.mo33410a();
                        return;
                    } catch (bxwf e) {
                        f61878d.mo33429c("Successful DomainFilterEntry write is unparseable", new Object[0]);
                        if (!z) {
                            adfc3 = this.f61898u;
                        } else {
                            adfc3 = this.f61880A;
                        }
                        adfc3.mo33410a();
                        return;
                    }
                }
            }
            f61878d.mo33429c("Successful DomainFilter write unable to be read (no bytes)", new Object[0]);
            if (!z) {
                adfc2 = this.f61896s;
            } else {
                adfc2 = this.f61902y;
            }
            adfc2.mo33410a();
        } catch (IOException e2) {
            f61878d.mo33429c("Successful DomainFilter write unable to be read (IOException)", new Object[0]);
            if (z) {
                adfc = this.f61903z;
            } else {
                adfc = this.f61897t;
            }
            adfc.mo33410a();
        }
    }

    /* renamed from: a */
    private static boolean m50612a(byte[] bArr) {
        if (Arrays.equals(f61876b, bArr) || Arrays.equals(f61877c, bArr) || m50614b(bArr)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        r2 = r14.f61883e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1 = mo33576g();
        r10 = new java.util.HashSet();
        r1 = java.util.Collections.unmodifiableMap(r1.f61852a).entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        if (r1.hasNext() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        r3 = (java.util.Map.Entry) r1.next();
        r4 = p000.adin.m50545b(((p000.adio) r3.getValue()).f61824a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009d, code lost:
        if (r4 == 0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        if (r4 != 3) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        r10.add((java.lang.Integer) r3.getKey());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ab, code lost:
        mo33573a(r10, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00af, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b4, code lost:
        if (r10.isEmpty() == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b6, code lost:
        r8.mo33409a("DomainFilter.GetIntentFilterEmptyInput");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bb, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bc, code lost:
        r1 = r14.f61886i.mo33390a(r0, r10);
        new java.lang.Object[1][0] = r0.name;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r0 = (p000.btik) r1.get();
        r8.mo33409a("DomainFilter.GetIntentFilterRpcSuccess");
        r1 = p000.adjg.f61878d;
        r2 = new java.lang.Object[1];
        r3 = r0.f164961ai;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        if (r3 != -1) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dc, code lost:
        r3 = p000.bxxm.f165037a.mo74228a(r0).mo74223b(r0);
        r0.f164961ai = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e8, code lost:
        r2[0] = java.lang.Integer.valueOf(r3);
        r1.mo33423a("Intent filter response size: %s", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        mo33572a(p000.bmvz.f131120a, r0.f148987a, p000.bngx.m109376e(), m50606a(java.util.Collections.unmodifiableMap(r0.f148988b)), java.util.Collections.unmodifiableMap(r0.f148988b), p000.bngx.m109376e());
        mo33573a(r10, 5);
        r0 = r0.f148987a;
        r1 = new java.util.ArrayList();
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0126, code lost:
        if (r0.hasNext() == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0128, code lost:
        r1.add(((p000.bthy) r0.next()).f148919a.mo73781l());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0138, code lost:
        r0 = r14.f61893p.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0142, code lost:
        if (r0.hasNext() == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0144, code lost:
        ((p000.adjl) r0.next()).mo33586b(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014e, code lost:
        r8.mo33409a("DomainFilter.GetIntentFilterResponseHandlingSuccess");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0154, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r8.mo33409a("DomainFilter.GetIntentFilterHandlingFailure");
        p000.adfu.m50331a(r14.f61884g, "Error in handling Intent filter response", r0, p000.adjg.f61878d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0164, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0165, code lost:
        r8.mo33409a("DomainFilter.GetIntentFilterFailure");
        p000.adfu.m50331a(r14.f61884g, "Error in retrieving Intent filter response", r0, p000.adjg.f61878d);
        mo33573a(r10, 3);
        r0 = m50604a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x017a, code lost:
        if (r0 != null) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017c, code lost:
        r0 = r0.f189236a.f189233s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0181, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0184, code lost:
        if (r0 != p000.chus.PERMISSION_DENIED) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0186, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0188, code lost:
        return 3;
     */
    /* renamed from: a */
    public final int mo33557a() {
        adfb a = this.f61891n.mo33411a();
        Account c = this.f61887j.mo33603c();
        synchronized (this.f61883e) {
            adix g = mo33576g();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - g.f61853b < TimeUnit.SECONDS.toMillis(ceqj.f183258a.mo6606a().mo79583b())) {
                new Object[1][0] = Long.valueOf(currentTimeMillis - g.f61853b);
                a.mo33409a("DomainFilter.GetIntentFilterThrottled");
                return 4;
            }
            bxvd bxvd = (bxvd) g.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) g);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            adix adix = adix.f61850c;
            ((adix) bxvd.f164949b).f61853b = currentTimeMillis;
            m50613b((adix) bxvd.mo74062i());
        }
        return 1;
    }

    /* renamed from: a */
    public final synchronized int mo33558a(camh camh) {
        return m50616h() ? m50600a(mo33574e(), camh) : 3;
    }

    /* renamed from: a */
    public final adip mo33559a(String str) {
        if (!m50616h()) {
            return null;
        }
        try {
            byte[] a = this.f61888k.mo33514a(str.getBytes(adfh.f61554b));
            if (a != null) {
                try {
                    return (adip) GeneratedMessageLite.m124016a(adip.f61826d, a, bxus.m123743b());
                } catch (bxwf e) {
                    adfu.m50331a(this.f61884g, String.format("Couldn't parse result for %s", str), e, f61878d);
                    return null;
                }
            } else {
                new Object[1][0] = str;
                return null;
            }
        } catch (IOException e2) {
            adfu.m50331a(this.f61884g, "Couldn't read from level DB", e2, f61878d);
            return null;
        }
    }

    /* renamed from: a */
    public final adjh mo33560a(String str, boolean z) {
        adjh adjh;
        int i;
        int i2;
        int i3;
        String str2;
        String str3;
        String str4;
        String str5;
        ByteString bxtx;
        ByteString bxtx2;
        ByteString bxtx3;
        ByteString bxtx4;
        if (!m50616h()) {
            return m50615c("Datastore not initialized");
        }
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf(str);
            return m50615c(valueOf.length() == 0 ? new String("Invalid URL: ") : "Invalid URL: ".concat(valueOf));
        }
        int i4 = 0;
        int i5 = 1;
        if (cepc.f183173a.mo6606a().mo79509b()) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            mo33562a(printWriter);
            printWriter.flush();
            f61878d.mo33423a("Domain filter Dump before match url: %s", stringWriter.toString());
        }
        Uri parse = Uri.parse(str);
        if (parse == null || TextUtils.isEmpty(parse.getHost())) {
            String valueOf2 = String.valueOf(str);
            return m50615c(valueOf2.length() == 0 ? new String("Invalid URI: ") : "Invalid URI: ".concat(valueOf2));
        }
        List a = adjk.m50641a(parse.getHost());
        new Object[1][0] = a;
        adjh adjh2 = f61875a;
        int size = a.size();
        int i6 = 0;
        while (i6 < size) {
            adip a2 = mo33559a((String) a.get(i6));
            if (a2 != null) {
                if (a2.f61829b.size() == 0) {
                    String valueOf3 = String.valueOf(a2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 32);
                    sb.append("Domain match without split IDs: ");
                    sb.append(valueOf3);
                    return m50615c(sb.toString());
                }
                int i7 = 2;
                if (!z) {
                    adjh = m50603a(a2, i4);
                    i = 2;
                } else {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= a2.f61828a.size()) {
                            i = 2;
                            i2 = -1;
                            break;
                        }
                        adis adis = (adis) a2.f61828a.get(i8);
                        if (adis.f61838a == i5 && ((Boolean) adis.f61839b).booleanValue()) {
                            i3 = i8;
                            i = 2;
                            break;
                        }
                        String host = parse.getHost();
                        if (adir.m50551a(adis.f61838a) == 3) {
                            if (adis.f61838a == i7) {
                                bxtx4 = (ByteString) adis.f61839b;
                            } else {
                                bxtx4 = bxtx.f164797b;
                            }
                            str2 = bxtx4.mo73773b(adfh.f61554b);
                        } else {
                            str2 = null;
                        }
                        if (adir.m50551a(adis.f61838a) == 4) {
                            if (adis.f61838a == 3) {
                                bxtx3 = (ByteString) adis.f61839b;
                            } else {
                                bxtx3 = bxtx.f164797b;
                            }
                            str3 = bxtx3.mo73773b(adfh.f61554b);
                        } else {
                            str3 = null;
                        }
                        if (adir.m50551a(adis.f61838a) == 5) {
                            if (adis.f61838a == 4) {
                                bxtx2 = (ByteString) adis.f61839b;
                            } else {
                                bxtx2 = bxtx.f164797b;
                            }
                            str4 = bxtx2.mo73773b(adfh.f61554b);
                        } else {
                            str4 = null;
                        }
                        if (adir.m50551a(adis.f61838a) == 6) {
                            if (adis.f61838a == 5) {
                                bxtx = (ByteString) adis.f61839b;
                            } else {
                                bxtx = bxtx.f164797b;
                            }
                            str5 = bxtx.mo73773b(adfh.f61554b);
                        } else {
                            str5 = null;
                        }
                        i3 = i8;
                        i = 2;
                        if (adle.m50789a(host, 0, str2, str3, str4, str5, parse)) {
                            break;
                        }
                        i8 = i3 + 1;
                        i5 = 1;
                        i7 = 2;
                    }
                    i2 = ((adis) a2.f61828a.get(i3)).f61840c;
                    adjh = i2 >= 0 ? m50603a(a2, i2) : f61875a;
                }
                int i9 = adjh.f61904a;
                if (i9 == 0) {
                    return adjh;
                }
                if (i9 == i) {
                    adjh2 = adjh;
                }
            }
            i6++;
            i4 = 0;
            i5 = 1;
        }
        return adjh2;
    }

    /* renamed from: a */
    public final void mo33561a(adjl adjl) {
        this.f61893p.add(adjl);
        ((adjm) adjl).f61924g = this;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adjg.a(boolean, bthy, java.util.Set):void
     arg types: [int, bthy, java.util.Set]
     candidates:
      adjg.a(adfb, java.lang.String, int):void
      adjg.a(android.accounts.Account, adfb, byte[]):void
      adjg.a(boolean, bthy, java.util.Set):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33572a(bmxv bmxv, List list, List list2, Set set, Map map, List list3) {
        WriteBatch create;
        if (m50616h()) {
            try {
                create = WriteBatch.create();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    create.delete(((ByteString) it.next()).getKey());
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    bthy bthy = (bthy) it2.next();
                    create.put(bthy.f148919a.getKey(), m50601a(bthy, set).serializeToBytes());
                }
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    String valueOf = String.valueOf((String) it3.next());
                    create.delete((valueOf.length() == 0 ? new String("pkgMetadata:") : "pkgMetadata:".concat(valueOf)).getBytes(adfh.f61554b));
                }
                m50610a(map, create);
                if (bmxv.mo66813a()) {
                    create.put(f61876b, ((adiq) bmxv.mo66814b()).serializeToBytes());
                }
                this.f61888k.mo33510a(create);
                if (cepo.f183226a.mo6606a().mo79564h()) {
                    if (!list.isEmpty()) {
                        m50611a(false, (bthy) list.get(0), set);
                    } else {
                        this.f61895r.mo33410a();
                    }
                }
                create.close();
            } catch (IOException e) {
                adfu.m50331a(this.f61884g, "Error while incrementally updating domain filter", e, f61878d);
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
            if (cepc.m137701b()) {
                f61878d.mo33423a("updateDataStore: Domains added: %d, Domains removed: %d", Integer.valueOf(list.size()), Integer.valueOf(list2.size()));
                return;
            }
            return;
        }
        return;
        throw th;
    }

    /* renamed from: a */
    public final void mo33562a(PrintWriter printWriter) {
        adgy c;
        Throwable th;
        String str;
        String str2;
        String str3;
        PrintWriter printWriter2 = printWriter;
        if (!m50616h()) {
            printWriter2.printf("DomainFilter: DataStore not initialized!", new Object[0]);
            return;
        }
        try {
            c = this.f61888k.mo33517c();
            adiq e = mo33574e();
            Object[] objArr = new Object[1];
            objArr[0] = Long.valueOf(e != null ? e.f61833a : 0);
            printWriter2.printf("DomainFilter: LastUpdateTime %d: \n", objArr);
            adix g = mo33576g();
            if (g != null) {
                if (!Collections.unmodifiableMap(g.f61852a).isEmpty()) {
                    printWriter2.printf("Recently Used Domain Digests:\n", new Object[0]);
                    for (Map.Entry entry : Collections.unmodifiableMap(g.f61852a).entrySet()) {
                        String valueOf = String.valueOf(entry.getKey());
                        int b = adin.m50545b(((adio) entry.getValue()).f61824a);
                        if (b == 0) {
                            b = 1;
                        }
                        String valueOf2 = String.valueOf(Integer.toString(adin.m50544a(b)));
                        long j = ((adio) entry.getValue()).f61825b;
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25 + String.valueOf(valueOf2).length());
                        sb.append(valueOf);
                        sb.append(" (");
                        sb.append(valueOf2);
                        sb.append("):\t");
                        sb.append(j);
                        printWriter2.printf(sb.toString(), new Object[0]);
                    }
                    long j2 = g.f61853b;
                    StringBuilder sb2 = new StringBuilder(58);
                    sb2.append("Last intent filter fetched timestamp: ");
                    sb2.append(j2);
                    printWriter2.printf(sb2.toString(), new Object[0]);
                }
            }
            printWriter2.printf("\nPlugins:\n", new Object[0]);
            Iterator it = this.f61893p.iterator();
            while (it.hasNext()) {
                adjl adjl = (adjl) it.next();
                printWriter2.printf("\t%s:\n", adjl.getClass().getSimpleName());
                adjl.mo33582a(printWriter2);
            }
            c.mo33504c();
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            C1225nr nrVar = new C1225nr();
            long d = cepc.f183173a.mo6606a().mo79511d();
            while (c.mo33507e()) {
                if (((long) treeMap.size()) >= d) {
                    break;
                }
                byte[] a = c.mo33502a();
                String str4 = new String(a);
                if (m50612a(a)) {
                    for (adiy adiy : ((adip) GeneratedMessageLite.m124016a(adip.f61826d, c.mo33503b(), bxus.m123743b())).f61829b) {
                        if (!nrVar.contains(adiy.f61856a) && this.f61885h.mo33539g(adiy.f61856a)) {
                            nrVar.add(adiy.f61856a);
                        }
                        List list = (List) treeMap.get(adiy.f61856a);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        if (!adiy.f61857b.isEmpty()) {
                            String str5 = adiy.f61857b;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 3);
                            sb3.append(" [");
                            sb3.append(str5);
                            sb3.append("]");
                            str3 = sb3.toString();
                        } else {
                            str3 = "";
                        }
                        String valueOf3 = String.valueOf(str3);
                        list.add(new Pair(valueOf3.length() == 0 ? new String(str4) : str4.concat(valueOf3), Boolean.valueOf(adiy.f61860e)));
                        treeMap.put(adiy.f61856a, list);
                    }
                }
                c.mo33506d();
            }
            printWriter.println();
            if (c.mo33507e()) {
                printWriter2.printf("Domains truncated. Only printing out first %d packages.\n", Long.valueOf(d));
            }
            printWriter2.printf("Printing %d entries in [package: domains...]:\n", Integer.valueOf(treeMap.size()));
            for (Map.Entry entry2 : treeMap.entrySet()) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = entry2.getKey();
                if (!nrVar.contains(entry2.getKey())) {
                    str = "";
                } else {
                    str = " (SNOOZED)";
                }
                objArr2[1] = str;
                printWriter2.printf("%s%s: ", objArr2);
                for (Pair pair : (List) entry2.getValue()) {
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = pair.first;
                    if (!((Boolean) pair.second).booleanValue()) {
                        str2 = "";
                    } else {
                        str2 = " (HELD BACK)";
                    }
                    objArr3[1] = str2;
                    printWriter2.printf("%s%s; ", objArr3);
                }
                printWriter.println();
            }
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Exception e2) {
            adfu.m50331a(this.f61884g, "Failed to dump debug info", e2, f61878d);
            return;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33573a(Collection collection, int i) {
        synchronized (this.f61883e) {
            adix g = mo33576g();
            bxvd bxvd = (bxvd) g.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) g);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                bxww bxww = g.f61852a;
                Integer valueOf = Integer.valueOf(intValue);
                if (bxww.containsKey(valueOf)) {
                    bxww bxww2 = g.f61852a;
                    if (bxww2.containsKey(valueOf)) {
                        adio adio = (adio) bxww2.get(valueOf);
                        bxvd bxvd2 = (bxvd) adio.mo74142c(5);
                        bxvd2.mo73625a((GeneratedMessageLite) adio);
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        adio adio2 = adio.f61822c;
                        ((adio) bxvd2.f164949b).f61824a = adin.m50544a(i);
                        bxvd.mo74026b(intValue, (adio) bxvd2.mo74062i());
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
            }
            m50613b((adix) bxvd.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo33563a(Collection collection, Collection collection2) {
        synchronized (this.f61883e) {
            adix g = mo33576g();
            bxvd bxvd = (bxvd) g.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) g);
            long currentTimeMillis = System.currentTimeMillis();
            bxvd da = adio.f61822c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((adio) da.f164949b).f61824a = adin.m50544a(3);
            adio adio = (adio) da.mo74062i();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                adio a = bxvd.mo73964a(intValue, adio);
                bxvd bxvd2 = (bxvd) a.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) a);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                ((adio) bxvd2.f164949b).f61825b = currentTimeMillis;
                bxvd.mo74026b(intValue, (adio) bxvd2.mo74062i());
            }
            Iterator it2 = collection2.iterator();
            while (it2.hasNext()) {
                int intValue2 = ((Integer) it2.next()).intValue();
                if (Collections.unmodifiableMap(((adix) bxvd.f164949b).f61852a).containsKey(Integer.valueOf(intValue2))) {
                    adio a2 = bxvd.mo73964a(intValue2, adio);
                    bxvd bxvd3 = (bxvd) a2.mo74142c(5);
                    bxvd3.mo73625a((GeneratedMessageLite) a2);
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    ((adio) bxvd3.f164949b).f61825b = currentTimeMillis;
                    bxvd.mo74026b(intValue2, (adio) bxvd3.mo74062i());
                }
            }
            m50613b((adix) bxvd.mo74062i());
        }
    }
}
