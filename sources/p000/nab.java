package p000;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupTransport;
import android.app.backup.RestoreDescription;
import android.app.backup.RestoreSet;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.backup.transport.BackupTransportChimeraService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: nab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nab extends BackupTransport {

    /* renamed from: a */
    public static final sek f35075a = new lvn("GmsBackupTransport");

    /* renamed from: A */
    public final bjq f35076A;

    /* renamed from: B */
    public final lvr f35077B = lvr.f33060a;

    /* renamed from: C */
    public final lwj f35078C;

    /* renamed from: D */
    public final mzd f35079D;

    /* renamed from: E */
    public final nad f35080E;

    /* renamed from: F */
    public final Set f35081F = new HashSet();

    /* renamed from: G */
    public final lvp f35082G;

    /* renamed from: H */
    public boolean f35083H = false;

    /* renamed from: I */
    public boolean f35084I = false;

    /* renamed from: J */
    public boolean f35085J = true;

    /* renamed from: K */
    public final bzsy f35086K;

    /* renamed from: L */
    public final nae f35087L;

    /* renamed from: M */
    public final myo f35088M;

    /* renamed from: N */
    public int f35089N = 1;

    /* renamed from: O */
    private final rtj f35090O;

    /* renamed from: P */
    private final lvs f35091P;

    /* renamed from: Q */
    private final bmxv f35092Q;

    /* renamed from: R */
    private final ExecutorService f35093R;

    /* renamed from: S */
    private boolean f35094S = false;

    /* renamed from: b */
    public int f35095b = -1;

    /* renamed from: c */
    public lzw f35096c = null;

    /* renamed from: d */
    public String f35097d = null;

    /* renamed from: e */
    public ndo f35098e = null;

    /* renamed from: f */
    public ndi f35099f = null;

    /* renamed from: g */
    public ndn f35100g = null;

    /* renamed from: h */
    public String f35101h = null;

    /* renamed from: i */
    public Boolean f35102i = false;

    /* renamed from: j */
    public mzb f35103j;

    /* renamed from: k */
    public mzc f35104k;

    /* renamed from: l */
    public final aboy f35105l;

    /* renamed from: m */
    public ndv f35106m = null;

    /* renamed from: n */
    public myr f35107n;

    /* renamed from: o */
    public final rtj f35108o;

    /* renamed from: p */
    public final lwc f35109p;

    /* renamed from: q */
    public final Context f35110q;

    /* renamed from: r */
    public final BackupTransportChimeraService f35111r;

    /* renamed from: s */
    public final lvu f35112s;

    /* renamed from: t */
    public final myy f35113t;

    /* renamed from: u */
    public final bjr f35114u;

    /* renamed from: v */
    public final mzf f35115v;

    /* renamed from: w */
    public final mym f35116w;

    /* renamed from: x */
    public final mbx f35117x;

    /* renamed from: y */
    public final myz f35118y;

    /* renamed from: z */
    public final nac f35119z;

    public nab(Context context, BackupTransportChimeraService backupTransportChimeraService, lvu lvu, myy myy, bjr bjr, mzf mzf, mym mym, mbx mbx, myz myz, nac nac, bjq bjq, bzsy bzsy, rtj rtj, rtj rtj2, aboy aboy, lwj lwj, nae nae, nck nck, ncm ncm, mzd mzd, myo myo, lwc lwc, nad nad, lvp lvp, bmxv bmxv) {
        sdo.m34959a(context);
        this.f35110q = context;
        sdo.m34959a(backupTransportChimeraService);
        this.f35111r = backupTransportChimeraService;
        sdo.m34959a(lvu);
        this.f35112s = lvu;
        sdo.m34959a(myy);
        this.f35113t = myy;
        sdo.m34959a(bjr);
        this.f35114u = bjr;
        sdo.m34959a(mzf);
        this.f35115v = mzf;
        sdo.m34959a(mym);
        this.f35116w = mym;
        sdo.m34959a(mbx);
        this.f35117x = mbx;
        sdo.m34959a(myz);
        this.f35118y = myz;
        sdo.m34959a(nac);
        this.f35119z = nac;
        sdo.m34959a(bjq);
        this.f35076A = bjq;
        sdo.m34959a(bzsy);
        this.f35086K = bzsy;
        sdo.m34959a(rtj);
        this.f35108o = rtj;
        sdo.m34959a(rtj2);
        this.f35090O = rtj2;
        sdo.m34959a(aboy);
        this.f35105l = aboy;
        sdo.m34959a(lwj);
        this.f35078C = lwj;
        sdo.m34959a(nae);
        this.f35087L = nae;
        sdo.m34959a(nck);
        sdo.m34959a(ncm);
        sdo.m34959a(mzd);
        this.f35079D = mzd;
        sdo.m34959a(myo);
        this.f35088M = myo;
        sdo.m34959a(lwc);
        this.f35109p = lwc;
        this.f35091P = m25823a(context, mzf);
        this.f35080E = nad;
        this.f35093R = snp.m35704b(10);
        this.f35082G = lvp;
        this.f35092Q = bmxv;
    }

    /* renamed from: a */
    private final Object m25822a(Callable callable) {
        if (ccnl.m130844b()) {
            return this.f35093R.submit(callable).get(ccnl.f179542a.mo6606a().mo76465h(), TimeUnit.MILLISECONDS);
        }
        return callable.call();
    }

    public final synchronized int abortFullRestore() {
        int intValue;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            intValue = ((Integer) m25822a(new mzq(this))).intValue();
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (Exception e) {
            try {
                m25825a(e);
                return -1000;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return intValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02d4, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        p000.skh.m35531a().mo25689a(r3.f35123b, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0303, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        p000.nad.f35122a.mo25415d("Exception when unbinding: ", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x030f, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        p000.nab.f35075a.mo25417e("Error sending final backup to server: ", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0369, code lost:
        r1.f35096c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x036e, code lost:
        return -1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        p000.nab.f35075a.mo25417e("Backup server requires initialization: ", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0379, code lost:
        r1.f35096c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x037e, code lost:
        return -1001;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x037f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0380, code lost:
        r2 = null;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0382, code lost:
        r1.f35096c = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0385, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0224, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0225, code lost:
        r3 = r0;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0229, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x022d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:91:0x0232, B:122:0x02d8, B:152:0x035f, B:156:0x036f] */
    /* renamed from: b */
    public final int mo20372b() {
        luj luj;
        int i = 1;
        boolean z = false;
        try {
            if (this.f35096c != null) {
                lvu lvu = this.f35112s;
                msk msk = msk.KV_BACKUP_FINAL_REQUEST;
                lzw lzw = this.f35096c;
                bxvd da = lth.f32914q.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                lth lth = (lth) da.f164949b;
                lth.f32916a |= 64;
                lth.f32922g = 2;
                if (lzw.f33309c) {
                    bxvd da2 = lta.f32883a.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    lta.m24364a((lta) da2.f164949b);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    lth lth2 = (lth) da.f164949b;
                    lta lta = (lta) da2.mo74062i();
                    lta.getClass();
                    lth2.f32928m = lta;
                    lth2.f32916a |= 8192;
                    lzw.f33309c = false;
                }
                for (Map.Entry entry : lzw.f33308b.entrySet()) {
                    lzv lzv = (lzv) entry.getValue();
                    if (!lzv.f33303a.isEmpty() || !lzv.f33304b.isEmpty() || !lzv.f33305c.isEmpty()) {
                        bxvd da3 = lsz.f32870k.mo74144da();
                        String str = (String) entry.getKey();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = z;
                        }
                        lsz lsz = (lsz) da3.f164949b;
                        str.getClass();
                        int i2 = lsz.f32872a | i;
                        lsz.f32872a = i2;
                        lsz.f32873b = str;
                        String str2 = lzv.f33306d;
                        if (str2 != null) {
                            str2.getClass();
                            lsz.f32872a = i2 | 2;
                            lsz.f32874c = str2;
                        }
                        for (Map.Entry entry2 : lzv.f33303a.entrySet()) {
                            bxvd da4 = ltr.f32982d.mo74144da();
                            String str3 = (String) entry2.getKey();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            ltr ltr = (ltr) da4.f164949b;
                            str3.getClass();
                            ltr.f32984a |= 1;
                            ltr.f32985b = str3;
                            if (entry2.getValue() != null) {
                                bxtx a = bxtx.m123261a((byte[]) entry2.getValue());
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                ltr ltr2 = (ltr) da4.f164949b;
                                a.getClass();
                                ltr2.f32984a |= 2;
                                ltr2.f32986c = a;
                            }
                            da3.mo74055g(da4);
                            z = false;
                        }
                        lzv.f33303a.clear();
                        Iterator it = lzv.f33304b.iterator();
                        while (it.hasNext()) {
                            String str4 = (String) it.next();
                            bxvd da5 = lsw.f32856c.mo74144da();
                            if (!str4.isEmpty()) {
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                lsw lsw = (lsw) da5.f164949b;
                                str4.getClass();
                                lsw.f32858a |= 1;
                                lsw.f32859b = str4;
                            }
                            da3.mo74051f(da5);
                            z = false;
                        }
                        Iterator it2 = lzv.f33305c.iterator();
                        while (it2.hasNext()) {
                            String str5 = (String) it2.next();
                            String valueOf = String.valueOf(lzw.f33307a);
                            String valueOf2 = String.valueOf(str5);
                            String str6 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                            bxvd da6 = lsy.f32864d.mo74144da();
                            if (da6.f164950c) {
                                da6.mo74035c();
                                da6.f164950c = z;
                            }
                            lsy lsy = (lsy) da6.f164949b;
                            str6.getClass();
                            int i3 = lsy.f32866a | 1;
                            lsy.f32866a = i3;
                            lsy.f32867b = str6;
                            str5.getClass();
                            lsy.f32866a = i3 | 2;
                            lsy.f32868c = str5;
                            lsy lsy2 = (lsy) da6.mo74062i();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            lsz lsz2 = (lsz) da3.f164949b;
                            lsy2.getClass();
                            if (!lsz2.f32876e.mo73666a()) {
                                lsz2.f32876e = bxvk.m124021a(lsz2.f32876e);
                            }
                            lsz2.f32876e.add(lsy2);
                            z = false;
                        }
                        lzv.f33305c.clear();
                        da.mo74059h(da3);
                        i = 1;
                        z = false;
                    }
                }
                lvu.mo17279a(msk, da, this.f35116w, true);
            }
        } catch (mbm e) {
            sek sek = f35075a;
            String valueOf3 = String.valueOf(this.f35097d);
            sek.mo25416d(valueOf3.length() == 0 ? new String("Size quota exceeded for package: ") : "Size quota exceeded for package: ".concat(valueOf3), new Object[0]);
            if (ccno.m130867b()) {
                mo20373c();
            }
            this.f35114u.mo3199a(0);
            this.f35112s.mo17279a(msk.KV_BACKUP_ABORT_REQUEST, this.f35096c.mo19795a(), this.f35114u, true);
            int i4 = Build.VERSION.SDK_INT;
            this.f35096c = null;
            return -1005;
        } catch (mbk e2) {
            f35075a.mo25417e("Server policy rejection: ", e2, new Object[0]);
            this.f35114u.mo3199a(0);
            this.f35112s.mo17279a(msk.KV_BACKUP_ABORT_REQUEST, this.f35096c.mo19795a(), this.f35114u, true);
        } catch (mbs e3) {
            f35075a.mo25418e("Unencrypted backup tried; server expected encrypted. Re-initializing.", new Object[0]);
            this.f35096c = null;
            return -1001;
        }
        if (this.f35097d != null) {
            mo20373c();
            nad nad = this.f35080E;
            String str7 = this.f35097d;
            rex rex = new rex();
            if (skh.m35531a().mo25690a(nad.f35123b, new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.backup.BackupStatsService").addCategory("android.intent.category.DEFAULT"), rex, 1)) {
                try {
                    IBinder a2 = rex.mo24567a();
                    if (a2 != null) {
                        IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.backup.IBackupStatsService");
                        luj = !(queryLocalInterface instanceof luj) ? new luh(a2) : (luj) queryLocalInterface;
                    } else {
                        luj = null;
                    }
                    luj.mo19609a(str7, System.currentTimeMillis());
                    try {
                        skh.m35531a().mo25689a(nad.f35123b, rex);
                    } catch (IllegalArgumentException | IllegalStateException e4) {
                        nad.f35122a.mo25415d("Exception when unbinding: ", e4, new Object[0]);
                    }
                } catch (Exception e5) {
                    nad.f35122a.mo25417e("Exception on updating local backup stats", e5, new Object[0]);
                    try {
                        skh.m35531a().mo25689a(nad.f35123b, rex);
                    } catch (IllegalArgumentException | IllegalStateException e6) {
                        nad.f35122a.mo25415d("Exception when unbinding: ", e6, new Object[0]);
                    }
                }
            }
        }
        this.f35096c = null;
        return 0;
    }

    /* renamed from: c */
    public final void mo20373c() {
        int i;
        String str = this.f35097d;
        if (str != null) {
            nac nac = this.f35119z;
            if (nac.mo20406a(str)) {
                long currentTimeMillis = System.currentTimeMillis();
                int p = (int) ccnf.f179489a.mo6606a().mo76444p();
                if (p > 0) {
                    i = new Random(System.currentTimeMillis()).nextInt(p);
                } else {
                    i = 0;
                }
                nac.f35121b.edit().putLong(str, currentTimeMillis + (ccnf.f179489a.mo6606a().mo76441m() * 1000) + (((long) i) * 3600000)).commit();
            }
        }
    }

    public final synchronized void cancelFullBackup() {
        try {
            ned.m26010a();
            m25822a(new mzo(this));
        } catch (Exception e) {
            try {
                m25825a(e);
            } catch (Throwable th) {
                ned.m26011b();
                throw th;
            }
        }
        ned.m26011b();
    }

    public final synchronized int checkFullBackupSize(long j) {
        try {
        } catch (Exception e) {
            m25825a(e);
            return -1000;
        }
        return ((Integer) m25822a(new mzn(this, j))).intValue();
    }

    public final synchronized int clearBackupData(PackageInfo packageInfo) {
        try {
        } catch (Exception e) {
            m25825a(e);
            return -1000;
        }
        return ((Integer) m25822a(new mzt(this, packageInfo))).intValue();
    }

    public final Intent configurationIntent() {
        return this.f35091P.mo19664b();
    }

    public final String currentDestinationString() {
        return this.f35091P.mo19665c();
    }

    /* renamed from: d */
    public final RestoreDescription mo20379d() {
        PackageInfo packageInfo;
        myr myr = this.f35107n;
        if (myr != null) {
            myr.f34966e++;
            while (myr.f34966e < myr.f34965d.size()) {
                String str = (String) myr.f34965d.get(myr.f34966e);
                if (!"@pm@".equals(str)) {
                    try {
                        if (maz.m24784a(myr.f34963b.getPackageManager().getPackageInfo(str, 0))) {
                            myr.f34964c.mo19839b(3, str);
                            return new RestoreDescription(str, 2);
                        }
                        myr.f34964c.mo19839b(2, str);
                        return new RestoreDescription(str, 1);
                    } catch (PackageManager.NameNotFoundException e) {
                        myr.f34964c.mo19838b(8, 2);
                        myr.f34966e++;
                    }
                } else {
                    myr.f34964c.mo19839b(2, str);
                    return new RestoreDescription("@pm@", 1);
                }
            }
            myr.f34964c.mo19839b(5, (String) null);
            return RestoreDescription.NO_MORE_PACKAGES;
        } else if (this.f35098e != null) {
            while (true) {
                ndn ndn = this.f35100g;
                if (ndn == null || !ndn.f35344d.equals(this.f35101h)) {
                    if (this.f35104k != null) {
                        this.f35089N = 3;
                        mo20382e();
                    }
                    ndn ndn2 = this.f35100g;
                    if (ndn2 != null) {
                        String str2 = ndn2.f35344d;
                        this.f35101h = str2;
                        if (str2.equals("@pm@")) {
                            packageInfo = new PackageInfo();
                            packageInfo.packageName = "@pm@";
                        } else {
                            try {
                                packageInfo = this.f35110q.getPackageManager().getPackageInfo(this.f35100g.f35344d, 0);
                            } catch (PackageManager.NameNotFoundException e2) {
                                sek sek = f35075a;
                                String valueOf = String.valueOf(this.f35100g.f35344d);
                                sek.mo25418e(valueOf.length() == 0 ? new String("Package not found-") : "Package not found-".concat(valueOf), new Object[0]);
                                this.f35117x.mo19824a(8, 2, this.f35100g.f35344d);
                                this.f35085J = false;
                            }
                        }
                        if (this.f35100g.mo20491a() == 2) {
                            sek sek2 = f35075a;
                            String valueOf2 = String.valueOf(this.f35100g.f35344d);
                            sek2.mo25414c(valueOf2.length() == 0 ? new String("Got full restore package: ") : "Got full restore package: ".concat(valueOf2), new Object[0]);
                            mcf c = mcg.m24870c(this.f35110q, packageInfo);
                            if (!ccmk.f179455a.mo6606a().mo76384e() || c != mcf.ELIGIBLE) {
                                f35075a.mo25414c("Not performing full restore for %s, package is not eligible.", packageInfo.packageName);
                                this.f35117x.mo19835a(c, this.f35100g.f35344d);
                            } else {
                                mbx mbx = this.f35117x;
                                ndn ndn3 = this.f35100g;
                                mbx.mo19827a(3, ndn3.f35344d, ndn3.mo20492b());
                                return new RestoreDescription(this.f35100g.f35344d, 2);
                            }
                        } else if (this.f35100g.mo20491a() == 1) {
                            sek sek3 = f35075a;
                            String valueOf3 = String.valueOf(this.f35100g.f35344d);
                            sek3.mo25414c(valueOf3.length() == 0 ? new String("Got kv restore package: ") : "Got kv restore package: ".concat(valueOf3), new Object[0]);
                            mcf a = mcg.m24865a(this.f35110q, packageInfo);
                            if (a != mcf.ELIGIBLE) {
                                f35075a.mo25414c("Not performing k/v restore for %s, package is not eligible.", packageInfo.packageName);
                                this.f35117x.mo19835a(a, this.f35100g.f35344d);
                            } else {
                                mbx mbx2 = this.f35117x;
                                ndn ndn4 = this.f35100g;
                                mbx2.mo19827a(2, ndn4.f35344d, ndn4.mo20492b());
                                return new RestoreDescription(this.f35100g.f35344d, 1);
                            }
                        }
                        sek sek4 = f35075a;
                        ndn ndn5 = this.f35100g;
                        sek4.mo25414c("Package %s was ineligible or had unknown type %d", ndn5.f35344d, Integer.valueOf(ndn5.mo20491a()));
                        this.f35117x.mo19839b(4, this.f35100g.f35344d);
                    } else {
                        this.f35117x.mo19839b(5, (String) null);
                        return RestoreDescription.NO_MORE_PACKAGES;
                    }
                } else if (!mo20383f()) {
                    f35075a.mo25418e("Error getting restore data from server", new Object[0]);
                    this.f35117x.mo19838b(5, 4);
                    this.f35085J = false;
                    this.f35098e = null;
                    return null;
                }
            }
        } else {
            f35075a.mo25418e("Restore processing aborted, no more packages", new Object[0]);
            this.f35117x.mo19838b(3, 4);
            this.f35085J = false;
            return null;
        }
    }

    public final Intent dataManagementIntent() {
        return this.f35091P.mo19666d();
    }

    public final String dataManagementLabel() {
        return this.f35091P.mo19667e();
    }

    /* renamed from: e */
    public final void mo20382e() {
        mzc mzc = this.f35104k;
        if (mzc != null) {
            mzc.mo20346a(this.f35089N);
            this.f35104k = null;
            this.f35089N = 1;
        }
    }

    /* renamed from: f */
    public final boolean mo20383f() {
        bxvd bxvd;
        Throwable th;
        int i;
        int a;
        bxvd bxvd2;
        if (!ccnl.m130844b() && !Thread.holdsLock(this)) {
            throw new IllegalStateException("Lock not held.");
        }
        ndo ndo = this.f35098e;
        if (ndo != null) {
            this.f35100g = ndo.mo20493a();
            while (this.f35100g == null && (bxvd = this.f35098e.f35350e) != null) {
                int i2 = 0;
                if (this.f35099f != null) {
                    sdo.m34959a(bxvd);
                    if (((lth) bxvd.f164949b).f32926k.size() != 0) {
                        ndi.f35336a.mo25414c("Attaching GetAppKeyBlacklistInfo request to restore request.", new Object[0]);
                        lth lth = (lth) bxvd.f164949b;
                        if ((lth.f32916a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0) {
                            ltd ltd = lth.f32931p;
                            if (ltd == null) {
                                ltd = ltd.f32894b;
                            }
                            bxvd2 = (bxvd) ltd.mo74142c(5);
                            bxvd2.mo73625a((bxvk) ltd);
                        } else {
                            bxvd2 = ltd.f32894b.mo74144da();
                        }
                        for (lsz lsz : Collections.unmodifiableList(((lth) bxvd.f164949b).f32926k)) {
                            if (!Collections.unmodifiableList(((ltd) bxvd2.f164949b).f32896a).contains(lsz.f32873b)) {
                                String str = lsz.f32873b;
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                ltd ltd2 = (ltd) bxvd2.f164949b;
                                str.getClass();
                                ltd2.mo19597a();
                                ltd2.f32896a.add(str);
                            }
                        }
                        ltd ltd3 = (ltd) bxvd2.mo74062i();
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        lth lth2 = (lth) bxvd.f164949b;
                        lth lth3 = lth.f32914q;
                        ltd3.getClass();
                        lth2.f32931p = ltd3;
                        lth2.f32916a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                    }
                }
                try {
                    ltq a2 = this.f35087L.mo20407a(msk.RESTORE_REQUEST, bxvd);
                    ndo ndo2 = this.f35098e;
                    ndo2.f35347b = a2;
                    ndo2.f35348c = 0;
                    bxvd bxvd3 = null;
                    for (ltk ltk : a2.f32977e) {
                        String str2 = ltk.f32950b;
                        if ((2 & ltk.f32949a) != 0) {
                            long j = ltk.f32951c;
                            Long l = (Long) ndo2.f35349d.get(str2);
                            if (l == null) {
                                ndo2.f35349d.put(str2, Long.valueOf(j));
                            } else if (!l.equals(Long.valueOf(j))) {
                                String valueOf = String.valueOf(l);
                                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 63 + String.valueOf(valueOf).length());
                                sb.append("Application ");
                                sb.append(str2);
                                sb.append(": Fingerprint changed from ");
                                sb.append(valueOf);
                                sb.append(" to ");
                                sb.append(j);
                                throw new mbg(sb.toString());
                            }
                        }
                        int a3 = ltp.m24383a(ltk.f32954f);
                        if (a3 != 0 && a3 == 4) {
                            if (bxvd3 == null) {
                                bxvd3 = ndo2.f35346a.mo20494a();
                            }
                            bxvd da = lsz.f32870k.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            lsz lsz2 = (lsz) da.f164949b;
                            str2.getClass();
                            lsz2.f32872a |= 1;
                            lsz2.f32873b = str2;
                            bxvd da2 = lsx.f32860c.mo74144da();
                            int size = ltk.f32952d.size();
                            if (size > 0) {
                                String concat = String.valueOf(((ltr) ltk.f32952d.get(size - 1)).f32985b).concat(" ");
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                lsx lsx = (lsx) da2.f164949b;
                                concat.getClass();
                                lsx.f32862a |= 1;
                                lsx.f32863b = concat;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            lsz lsz3 = (lsz) da.f164949b;
                            lsx lsx2 = (lsx) da2.mo74062i();
                            lsx2.getClass();
                            lsz3.f32875d = lsx2;
                            lsz3.f32872a |= 4;
                            bxvd3.mo74059h(da);
                        }
                    }
                    ndo2.f35350e = bxvd3;
                    ndi ndi = this.f35099f;
                    if (ndi != null) {
                        ndi.mo20490a(a2);
                    }
                    this.f35106m.mo20503a(this.f35110q, (int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
                    ndn a4 = this.f35098e.mo20493a();
                    this.f35100g = a4;
                    if (a4 != null) {
                        f35075a.mo25409a("Received package %s, type=%d", a4.f35344d, Integer.valueOf(a4.mo20491a()));
                    } else {
                        f35075a.mo25409a("There was no next restore package.", new Object[0]);
                    }
                } catch (mbf e) {
                    i = e.f33375a;
                    f35075a.mo25418e("Get error http response on restore : %s", Integer.valueOf(i));
                    this.f35085J = false;
                    this.f35106m.mo20503a(this.f35110q, i);
                    return false;
                } catch (mbg e2) {
                    f35075a.mo25417e("Application fingerprint changed during restore", e2, new Object[0]);
                    this.f35117x.mo19824a(7, 4, this.f35100g.f35344d);
                    this.f35085J = false;
                    this.f35106m.mo20503a(this.f35110q, -8);
                    return false;
                } catch (mbd e3) {
                    a = e3.mo19815a();
                    f35075a.mo25417e("Exception on restoring data for next application", e3, new Object[0]);
                    this.f35085J = false;
                    this.f35106m.mo20503a(this.f35110q, a);
                    return false;
                } catch (Throwable th2) {
                    i2 = i;
                    th = th2;
                    this.f35106m.mo20503a(this.f35110q, i2);
                    throw th;
                }
            }
            return true;
        }
        throw new IllegalStateException("Restore was never started.");
    }

    /* JADX INFO: finally extract failed */
    public final synchronized int finishBackup() {
        int i;
        if (cckk.m130218b()) {
            if (this.f35094S) {
                i = 0;
                this.f35094S = false;
            }
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ned.m26010a();
            int intValue = ((Integer) m25822a(new mzu(this))).intValue();
            ned.m26011b();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return intValue;
        } catch (Exception e) {
            try {
                m25825a(e);
                ned.m26011b();
                Binder.restoreCallingIdentity(clearCallingIdentity);
                i = -1000;
                return i;
            } catch (Throwable th) {
                ned.m26011b();
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
        }
    }

    public final synchronized void finishRestore() {
        try {
            m25822a(new mzi(this));
            m25822a(new mzj(this));
        } catch (Exception e) {
            m25825a(e);
        }
    }

    /* renamed from: g */
    public final boolean mo20386g() {
        return cclp.f179364a.mo6606a().mo76300c() && lwb.m24518a(this.f35110q).mo19689a() && ((lwd) ((bmyg) this.f35092Q).f131198a).mo19702c();
    }

    public final synchronized RestoreSet[] getAvailableRestoreSets() {
        RestoreSet[] restoreSetArr;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            restoreSetArr = (RestoreSet[]) m25822a(new mzv(this));
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (Exception e) {
            try {
                m25825a(e);
                return null;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return restoreSetArr;
    }

    public final synchronized long getBackupQuota(String str, boolean z) {
        return z ? ccnf.m130741j() * 1048576 : Long.MAX_VALUE;
    }

    public final synchronized long getCurrentRestoreSet() {
        return spn.m35843a(this.f35110q);
    }

    public final synchronized int getNextFullRestoreDataChunk(ParcelFileDescriptor parcelFileDescriptor) {
        int intValue;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            intValue = ((Integer) m25822a(new mzp(this, parcelFileDescriptor))).intValue();
            srz.m36170a(parcelFileDescriptor);
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (Exception e) {
            try {
                m25825a(e);
                return -1000;
            } finally {
                srz.m36170a(parcelFileDescriptor);
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return intValue;
    }

    public final synchronized int getRestoreData(ParcelFileDescriptor parcelFileDescriptor) {
        int intValue;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            intValue = ((Integer) m25822a(new mzz(this, parcelFileDescriptor))).intValue();
            srz.m36170a(parcelFileDescriptor);
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (Exception e) {
            try {
                m25825a(e);
                return -1000;
            } finally {
                srz.m36170a(parcelFileDescriptor);
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return intValue;
    }

    public final int getTransportFlags() {
        return mo20369a() ? 1 : 0;
    }

    /* renamed from: h */
    public final void mo20393h() {
        if (this.f35083H) {
            Context context = this.f35110q;
            String a = mpv.m25497a(context);
            StringBuilder sb = new StringBuilder(a.length() + 33);
            sb.append(a);
            sb.append(".BROADCAST_LAUCHER_RESTORE_FINISH");
            Intent intent = new Intent(sb.toString());
            intent.setPackage(a);
            context.sendBroadcast(intent);
            this.f35083H = false;
        }
    }

    public final synchronized int initializeDevice() {
        try {
        } catch (Exception e) {
            m25825a(e);
            return -1000;
        }
        return ((Integer) m25822a(new mzr(this))).intValue();
    }

    public final String name() {
        return "com.google.android.gms/.backup.BackupTransportService";
    }

    public final synchronized RestoreDescription nextRestorePackage() {
        RestoreDescription restoreDescription;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (!nau.m25857b(this.f35110q)) {
                restoreDescription = (RestoreDescription) m25822a(new mzy(this));
            } else {
                restoreDescription = (RestoreDescription) m25822a(new mzx(this));
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (Exception e) {
            try {
                m25825a(e);
                return null;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return restoreDescription;
    }

    public final synchronized int performBackup(PackageInfo packageInfo, ParcelFileDescriptor parcelFileDescriptor) {
        return performBackup(packageInfo, parcelFileDescriptor, 0);
    }

    public final synchronized int performFullBackup(PackageInfo packageInfo, ParcelFileDescriptor parcelFileDescriptor) {
        return performFullBackup(packageInfo, parcelFileDescriptor, 0);
    }

    public final synchronized long requestBackupTime() {
        try {
        } catch (Exception e) {
            m25825a(e);
            return 604800000;
        }
        return ((Long) m25822a(new mzh(this))).longValue();
    }

    public final synchronized long requestFullBackupTime() {
        try {
        } catch (Exception e) {
            m25825a(e);
            return 604800000;
        }
        return ((Long) m25822a(new mzk(this))).longValue();
    }

    public final synchronized int sendBackupData(int i) {
        int i2;
        try {
            ned.m26010a();
            i2 = ((Integer) m25822a(new mzm(this, i))).intValue();
            ned.m26011b();
        } catch (Exception e) {
            try {
                m25825a(e);
                ned.m26011b();
                i2 = -1000;
            } catch (Throwable th) {
                ned.m26011b();
                throw th;
            }
        }
        return i2;
    }

    /* JADX INFO: finally extract failed */
    public final synchronized int startRestore(long j, PackageInfo[] packageInfoArr) {
        int i;
        this.f35085J = true;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            i = ((Integer) m25822a(new mzw(this, j, packageInfoArr))).intValue();
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (Exception e) {
            try {
                m25825a(e);
                Binder.restoreCallingIdentity(clearCallingIdentity);
                i = -1000;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
        }
        return i;
    }

    public final String transportDirName() {
        return "com.google.android.gms.backup.BackupTransportService";
    }

    /* JADX INFO: finally extract failed */
    public final synchronized int performBackup(PackageInfo packageInfo, ParcelFileDescriptor parcelFileDescriptor, int i) {
        int i2;
        boolean z;
        if (cckk.m130218b()) {
            if ((i & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f35094S = z;
            if (z) {
                return 0;
            }
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ned.m26010a();
            i2 = ((Integer) m25822a(new mzs(this, packageInfo, parcelFileDescriptor, i))).intValue();
            srz.m36170a(parcelFileDescriptor);
            ned.m26011b();
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (Exception e) {
            try {
                m25825a(e);
                srz.m36170a(parcelFileDescriptor);
                ned.m26011b();
                Binder.restoreCallingIdentity(clearCallingIdentity);
                i2 = -1000;
                return i2;
            } catch (Throwable th) {
                srz.m36170a(parcelFileDescriptor);
                ned.m26011b();
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
        }
    }

    public final synchronized int performFullBackup(PackageInfo packageInfo, ParcelFileDescriptor parcelFileDescriptor, int i) {
        int i2;
        try {
            ned.m26010a();
            i2 = ((Integer) m25822a(new mzl(this, packageInfo, parcelFileDescriptor, i))).intValue();
            ned.m26011b();
        } catch (Exception e) {
            try {
                m25825a(e);
                ned.m26011b();
                i2 = -1000;
            } catch (Throwable th) {
                ned.m26011b();
                throw th;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static lvs m25823a(Context context, mzf mzf) {
        return new naa(context, mzf);
    }

    /* renamed from: a */
    static final myr m25824a(Context context, mbx mbx) {
        return new myr(context, mbx);
    }

    /* renamed from: a */
    private final void m25825a(Throwable th) {
        f35075a.mo25417e("", th, new Object[0]);
        mab.m24748a(this.f35110q, th, ccnf.f179489a.mo6606a().mo76408B());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x030e, code lost:
        if (p000.cclp.f179364a.mo6606a().mo76308k() == false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0310, code lost:
        p000.mab.m24748a(r1.f35110q, r2, p000.cclp.m130475e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0319, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
        android.net.TrafficStats.clearThreadStatsUid();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0321, code lost:
        return -1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0322, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        p000.nab.f35075a.mo25417e("Encrypted backup failed", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x032d, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
        android.net.TrafficStats.clearThreadStatsUid();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0335, code lost:
        return -1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        p000.nab.f35075a.mo25416d("Secondary key was in a bad state, requesting re-init", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0340, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
        android.net.TrafficStats.clearThreadStatsUid();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0348, code lost:
        return -1001;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        p000.nab.f35075a.mo25416d("Quota exceeded", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0353, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
        android.net.TrafficStats.clearThreadStatsUid();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x035b, code lost:
        return -1005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        p000.nab.f35075a.mo25416d("Unexpected encrypted backup, returning error", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0366, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
        android.net.TrafficStats.clearThreadStatsUid();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x036e, code lost:
        return -1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        p000.nab.f35075a.mo25416d("Unexpected encrypted backup, requesting re-init", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0379, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
        android.net.TrafficStats.clearThreadStatsUid();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0381, code lost:
        return -1001;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        p000.nab.f35075a.mo25416d("Device not initialized", new java.lang.Object[0]);
        r1.f35117x.mo19822a(16, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0393, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
        android.net.TrafficStats.clearThreadStatsUid();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x039b, code lost:
        return -1001;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        p000.nab.f35075a.mo25416d("Non-incremental backup required, requesting retry.", new java.lang.Object[0]);
        r1.f35117x.mo19822a(15, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03ae, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
        android.net.TrafficStats.clearThreadStatsUid();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03b6, code lost:
        return -1006;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0262, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0263, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x026c, code lost:
        if (r4.f35279e.mo19710a(r4.f35285k) != 2) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x026e, code lost:
        p000.ncl.f35275a.mo25413c("Secondary key not synced, returning error", r2, new java.lang.Object[0]);
        r4.f35286l.mo19822a(27, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0283, code lost:
        throw new p000.mbr();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0284, code lost:
        p000.ncl.f35275a.mo25413c("Secondary key has synced, requesting re-init", r2, new java.lang.Object[0]);
        r4.f35286l.mo19822a(28, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0299, code lost:
        throw new p000.mbq();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x029a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x029b, code lost:
        r2 = r0;
        p000.ncl.f35275a.mo25418e("Permanent upload exception, wiping state", new java.lang.Object[0]);
        r4.mo20454a(r4.f35284j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02aa, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02ce, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02d2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02d3, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        p000.nab.f35075a.mo25417e("Encrypted backup failed", r2, new java.lang.Object[0]);
        r1.f35117x.mo19822a(17, 4);
        p000.mab.m24748a(r1.f35110q, r2, p000.cclp.m130475e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02eb, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
        android.net.TrafficStats.clearThreadStatsUid();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02f3, code lost:
        return -1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02f4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02f5, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        p000.nab.f35075a.mo25417e("Encrypted backup failed", r2, new java.lang.Object[0]);
        r1.f35117x.mo19822a(17, 4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0322 A[ExcHandler: lxc | mbi (r0v6 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0336 A[ExcHandler: lwt (e lwt), Splitter:B:3:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0349 A[ExcHandler: mbm (e mbm), Splitter:B:3:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x035c A[ExcHandler: mbr (e mbr), Splitter:B:3:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x036f A[ExcHandler: mbq (e mbq), Splitter:B:3:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0382 A[ExcHandler: mbt (e mbt), Splitter:B:3:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x039c A[ExcHandler: nbv (e nbv), Splitter:B:3:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02ce A[ExcHandler: GeneralSecurityException | mbb (e java.lang.Throwable), Splitter:B:45:0x01ab] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02d2 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:3:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02f4 A[ExcHandler: mbh (r0v7 'e' mbh A[CUSTOM_DECLARE]), Splitter:B:3:0x000e] */
    /* renamed from: a */
    public final int mo20367a(String str, String str2, ParcelFileDescriptor parcelFileDescriptor, int i) {
        ncl ncl;
        boolean z;
        bmxv bmxv;
        mcp mcp;
        String str3;
        int i2 = i;
        if (!mo20386g()) {
            try {
                Context context = this.f35110q;
                SecureRandom secureRandom = new SecureRandom();
                lwj lwj = this.f35078C;
                lwc lwc = this.f35109p;
                myo myo = this.f35088M;
                myy myy = this.f35113t;
                mym mym = this.f35116w;
                mbx mbx = this.f35117x;
                lwp a = new lxd(context, lwc, myo.mo20314a(), lwj, mbx).mo19720a();
                ncq ncq = new ncq(new BackupDataInput(parcelFileDescriptor.getFileDescriptor()));
                ncl = r14;
                ncl ncl2 = new ncl(context, myy, mym, new nbo(context, secureRandom, nbp.m25896a(context), a, str), nbd.m25879b(context), a, nbd.m25878a(context), ncq, new ncg(lwj, secureRandom, ncq), str, str2, mbx);
                boolean z2 = true;
                if ((i2 & 2) != 0) {
                    f35075a.mo25412b("Framework indicated incremental backup", new Object[0]);
                    z = true;
                } else if ((i2 & 4) != 0) {
                    f35075a.mo25412b("Framework indicated non-incremental backup", new Object[0]);
                    z = false;
                } else {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("No incremental flag:");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (ncl.f35278d.mo20438c()) {
                    ncl.f35275a.mo25412b("Tertiary key is new so clearing package state.", new Object[0]);
                    ncl.mo20454a(ncl.f35284j);
                }
                String str4 = ncl.f35284j;
                bmxv a2 = ncl.f35280f.mo20431a(str4);
                bmxv a3 = ncl.f35281g.mo20431a(str4);
                if (a2.mo66813a() && a3.mo66813a()) {
                    bmxv = bmxv.m108566b(Pair.create((mcx) a2.mo66814b(), (mcp) a3.mo66814b()));
                } else {
                    ncl.f35275a.mo25412b("Both listing were not present, clearing state, key value=%b, chunk=%b", Boolean.valueOf(a2.mo66813a()), Boolean.valueOf(a3.mo66813a()));
                    ncl.mo20454a(str4);
                    bmxv = bmvz.f131120a;
                }
                if (bmxv.mo66813a()) {
                    if (!z) {
                        ncl.f35275a.mo25412b("Non-incremental backup requested but incremental state existed, clearing it", new Object[0]);
                        ncl.mo20454a(ncl.f35284j);
                        bmxv = bmvz.f131120a;
                    }
                }
                if (!bmxv.mo66813a()) {
                    if (z) {
                        throw new nbv();
                    }
                }
                bxvd a4 = ncl.f35276b.mo17278a(ncl.f35284j, ncl.f35277c);
                lsz k = a4.mo74073k();
                bxvd bxvd = (bxvd) k.mo74142c(5);
                bxvd.mo73625a((bxvk) k);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                lsz lsz = (lsz) bxvd.f164949b;
                lsz lsz2 = lsz.f32870k;
                lsz.f32881j = 2;
                int i3 = lsz.f32872a | 32;
                lsz.f32872a = i3;
                String str5 = ncl.f35287m;
                if (str5 == null) {
                    lsz.f32872a = i3 & -3;
                    lsz.f32874c = lsz.f32870k.f32874c;
                } else {
                    str5.getClass();
                    lsz.f32872a = i3 | 2;
                    lsz.f32874c = str5;
                }
                if (a4.f164950c) {
                    a4.mo74035c();
                    a4.f164950c = false;
                }
                lth lth = lth.f32914q;
                ((lth) a4.f164949b).f32926k = bxvk.m124030de();
                a4.mo74059h(bxvd);
                if (bmxv.mo66813a()) {
                    ncl.f35282h.f35294a = (mcx) ((Pair) bmxv.mo66814b()).first;
                }
                if (bmxv.mo66813a()) {
                    ncl.f35275a.mo25409a("Old listings existed, performing incremental backup", new Object[0]);
                    mcp = ncl.f35283i.mo20451a(a4, ncl.f35278d.mo20436a(), ncl.f35278d.mo20437b(), (mcp) ((Pair) bmxv.mo66814b()).second);
                } else {
                    ncl.f35275a.mo25409a("Old listings did not exist, performing non-incremental backup", new Object[0]);
                    mcp = ncl.f35283i.mo20452a(a4, ncl.f35278d.mo20436a(), ncl.f35278d.mo20437b(), (byte[]) null);
                }
                ncl.f35275a.mo25409a("Backup and upload succeeded, saving new listings", new Object[0]);
                str3 = ncl.f35284j;
                ncq ncq2 = ncl.f35282h;
                if (ncq2.f35295b == null) {
                    z2 = false;
                }
                bmxy.m108601b(z2, "Must call backup() first");
                C1578nbu nbu = ncq2.f35295b;
                bxvd da = mcx.f33458b.mo74144da();
                bngx a5 = nbu.f35216a.mo67664a();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mcx mcx = (mcx) da.f164949b;
                if (!mcx.f33460a.mo73666a()) {
                    mcx.f33460a = bxvk.m124021a(mcx.f33460a);
                }
                bxsy.m123078a(a5, mcx.f33460a);
                ncl.f35280f.mo20433a(str3, (mcx) da.mo74062i());
                ncl.f35281g.mo20433a(str3, mcp);
            } catch (IOException e) {
                ncl.f35275a.mo25415d("Unable to save listings, deleting both for consistency", e, new Object[0]);
                ncl.mo20454a(str3);
            } catch (nbv e2) {
            } catch (mbt e3) {
            } catch (mbq e4) {
            } catch (mbr e5) {
            } catch (mbm e6) {
            } catch (lwt e7) {
            } catch (lxc | mbi e8) {
            } catch (mbh e9) {
            } catch (GeneralSecurityException | mbb e10) {
            } catch (Throwable th) {
                Throwable th2 = th;
                TrafficStats.clearThreadStatsTag();
                TrafficStats.clearThreadStatsUid();
                throw th2;
            }
            TrafficStats.clearThreadStatsTag();
            TrafficStats.clearThreadStatsUid();
            return 0;
        }
        f35075a.mo25416d("Not performing kv backup - Encryption key has not synced", new Object[0]);
        return -1002;
    }

    /* renamed from: a */
    public final void mo20368a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f35090O.getLong(str, 0);
        if (j == 0 || currentTimeMillis - j > ccnf.f179489a.mo6606a().mo76443o()) {
            f35075a.mo25412b("Updating %s to %d", str, Long.valueOf(currentTimeMillis));
            SharedPreferences.Editor edit = this.f35090O.edit();
            edit.putLong(str, currentTimeMillis);
            edit.apply();
        }
    }

    /* renamed from: a */
    public final boolean mo20369a() {
        return lwb.m24518a(this.f35110q).mo19689a();
    }

    /* renamed from: a */
    public final boolean mo20370a(boolean z) {
        if (!ccnl.m130844b() && !Thread.holdsLock(this)) {
            throw new IllegalStateException("lock not held");
        } else if (this.f35096c != null) {
            return true;
        } else {
            this.f35116w.mo3199a(0);
            if (z) {
                if (this.f35116w.mo3197a(this.f35076A) > System.currentTimeMillis()) {
                    f35075a.mo25416d("Not ready for backup request right now: %s", this.f35116w);
                    return false;
                }
            }
            f35075a.mo25414c("Starting new backup session", new Object[0]);
            this.f35096c = new lzw(System.currentTimeMillis());
            return true;
        }
    }
}
