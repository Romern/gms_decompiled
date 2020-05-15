package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.backup.d2d.migrate.service.protocol.p2p.PlayP2pRestoreServiceResultReceiver;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: mib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mib extends mhu {

    /* renamed from: e */
    public static final lvn f33754e = new lvn("SourceProtocol");

    /* renamed from: f */
    public final mmm f33755f;

    /* renamed from: g */
    public final mhv f33756g;

    /* renamed from: h */
    public final lsp f33757h;

    /* renamed from: i */
    public final mio f33758i;

    /* renamed from: j */
    public boolean f33759j;

    /* renamed from: k */
    private final met f33760k;

    /* renamed from: l */
    private final mis f33761l;

    /* renamed from: m */
    private mjj f33762m;

    /* renamed from: n */
    private final mle f33763n;

    /* renamed from: o */
    private final mhp f33764o;

    /* renamed from: p */
    private volatile boolean f33765p;

    /* JADX WARNING: Illegal instructions before constructor call */
    public mib(Context context, mjl mjl, mfr mfr, lyz lyz, mhv mhv, bqgj bqgj, met met, lsp lsp, mle mle, mhp mhp) {
        super(context, r8);
        bqgj bqgj2 = bqgj;
        this.f33757h = lsp;
        this.f33756g = mhv;
        this.f33760k = met;
        this.f33745d = mjl.mo19977a(this);
        this.f33763n = mle;
        this.f33764o = mhp;
        mis mis = new mis();
        this.f33761l = mis;
        mmm mmm = new mmm();
        bqgg b = snp.m35704b(9).mo25819b(new mml(context));
        if (C1145kt.m18540a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            mmo mmo = new mmo(new mmi(b));
            mmo mmo2 = new mmo(new mmj(b));
            if (cckw.f179263a.mo6606a().mo76212B()) {
                mmm.mo20169a("photos", mmo);
            }
            if (cckw.f179263a.mo6606a().mo76259x()) {
                mmm.mo20169a("music", mmo2);
            }
        }
        if (cckw.f179263a.mo6606a().mo76255t()) {
            mmm.mo20169a("documents", new mme(Environment.DIRECTORY_DOCUMENTS));
        }
        if (cckw.f179263a.mo6606a().mo76252q()) {
            mmm.mo20169a("contacts", new mmg(lyz));
        }
        if (cckw.m130265c()) {
            mmm.mo20169a("appdata", new mmc(context, mfr, met, new mfp(context), new mhf(context)));
        }
        if (cckw.f179263a.mo6606a().mo76256u()) {
            mmm.mo20169a("downloads", new mme(Environment.DIRECTORY_DOWNLOADS));
        }
        if (ccnx.m130935b()) {
            mmm.mo20169a("mms_attachments", new mmp(context.getContentResolver()));
        }
        if (cckw.m130273k()) {
            mmm.mo20169a("apk", new mma(mis));
        }
        this.f33755f = mmm;
        this.f33758i = new mio(context, bqgj2);
    }

    /* renamed from: a */
    private final void m25150a(mpl mpl, HandshakeData handshakeData) {
        bxvd da = mpm.f34178i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mpm mpm = (mpm) da.f164949b;
        mpm.f34181b = mpl.f34177s;
        mpm.f34180a |= 1;
        bxvd da2 = mpg.f34125o.mo74144da();
        bxtx a = bxtx.m123261a(handshakeData.mo59188g());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        mpg mpg = (mpg) da2.f164949b;
        a.getClass();
        mpg.f34127a |= 4096;
        mpg.f34140n = a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mpm mpm2 = (mpm) da.f164949b;
        mpg mpg2 = (mpg) da2.mo74062i();
        mpg2.getClass();
        mpm2.f34183d = mpg2;
        mpm2.f34180a |= 4;
        mo20035a((mpm) da.mo74062i());
    }

    /* renamed from: b */
    public final synchronized void mo20037b() {
        this.f33765p = true;
        mhv mhv = this.f33756g;
        mgj.f33623a.mo25412b("Device disconnected.", new Object[0]);
        if (((mgj) mhv).f33632j != 8) {
            mgq mgq = ((mgj) mhv).f33627e;
            mgq.f33652a.post(new mgm(mgq));
            ((mgj) mhv).mo19981a(5);
            ((mgj) mhv).f33638p.mo19913c();
        }
        ((mgj) mhv).f33629g.mo19772c();
        ((mgj) mhv).f33626d.mo20001a(12, null, 1, 1);
        ((mgj) mhv).f33634l = false;
        ((mgj) mhv).mo19988e();
        if (((mgj) mhv).f33635m && ((mgj) mhv).f33632j != 8) {
            ((mgj) mhv).mo19980a();
        }
        mo20045d();
        super.mo20037b();
    }

    /* renamed from: c */
    public final void mo20044c() {
        f33754e.mo25412b("Requesting restart of smart device", new Object[0]);
        bxvd da = mpq.f34203d.mo74144da();
        mpp mpp = mpp.ABORT_AND_RESTART;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mpq mpq = (mpq) da.f164949b;
        mpq.f34206b = mpp.f34202g;
        mpq.f34205a |= 1;
        mo20036a((mpq) da.mo74062i(), (mpn) null);
    }

    /* renamed from: d */
    public final void mo20045d() {
        mjj mjj = this.f33762m;
        if (mjj != null) {
            mjj.mo20086a();
            this.f33762m = null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mib.a(int, java.lang.String, boolean):void
     arg types: [int, ?[OBJECT, ARRAY], int]
     candidates:
      mhu.a(int, int, java.lang.String):mpn
      mib.a(int, java.lang.String, boolean):void */
    /* renamed from: e */
    public final void mo20046e() {
        mo20031a(4, (String) null, true);
    }

    /* renamed from: f */
    public final void mo20047f() {
        this.f33758i.mo20075a();
        this.f33745d.mo20095a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mib.a(int, java.lang.String, boolean):void
     arg types: [int, java.lang.String, int]
     candidates:
      mhu.a(int, int, java.lang.String):mpn
      mib.a(int, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mce.a(int, boolean):int
     arg types: [int, int]
     candidates:
      mce.a(android.content.Context, java.lang.String):java.io.File
      mce.a(int, boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mib.a(int, java.lang.String, boolean):void
     arg types: [int, ?[OBJECT, ARRAY], int]
     candidates:
      mhu.a(int, int, java.lang.String):mpn
      mib.a(int, java.lang.String, boolean):void */
    /* renamed from: b */
    public final void mo20043b(mpm mpm) {
        mpn mpn;
        int i;
        lvn lvn = f33754e;
        Object[] objArr = new Object[1];
        mpl a = mpl.m25483a(mpm.f34181b);
        if (a == null) {
            a = mpl.PACKET_TYPE_UNSPECIFIED;
        }
        objArr[0] = a;
        lvn.mo25412b("Received packet of type: %s", objArr);
        mpl a2 = mpl.m25483a(mpm.f34181b);
        if (a2 == null) {
            a2 = mpl.PACKET_TYPE_UNSPECIFIED;
        }
        mpp mpp = mpp.SMART_DEVICE_PAYLOAD_TYPE_UNSPECIFIED;
        int ordinal = a2.ordinal();
        if (!(ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 12)) {
            switch (ordinal) {
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    if (!((mgj) this.f33756g).f33634l || !this.f33759j) {
                        Object[] objArr2 = new Object[1];
                        mpl a3 = mpl.m25483a(mpm.f34181b);
                        if (a3 == null) {
                            a3 = mpl.PACKET_TYPE_UNSPECIFIED;
                        }
                        objArr2[0] = a3;
                        mo20035a(mo20030a(10, String.format("Require authorization for request of type: %s", objArr2)));
                        lvn lvn2 = f33754e;
                        String str = !((mgj) this.f33756g).f33634l ? "Channel is not secure" : "Authorization required";
                        lvn2.mo25416d(str.length() == 0 ? new String("Cannot process packet. ") : "Cannot process packet. ".concat(str), new Object[0]);
                        return;
                    }
            }
        }
        mpl a4 = mpl.m25483a(mpm.f34181b);
        if (a4 == null) {
            a4 = mpl.PACKET_TYPE_UNSPECIFIED;
        }
        mpp mpp2 = null;
        byte[] bArr = null;
        switch (a4.ordinal()) {
            case 1:
                mpg mpg = mpm.f34183d;
                if (mpg == null) {
                    mpg = mpg.f34125o;
                }
                if (mpg.f34128b != -757399334) {
                    f33754e.mo25418e("Handshake magic did not match. Got: %d", Integer.valueOf(mpg.f34128b));
                    mo20031a(5, (String) null, true);
                    return;
                } else if (mpg.f34129c == 1) {
                    f33754e.mo25414c("Protocol versions: local=%d.%d remote=%d.%d", 1, 4, Integer.valueOf(mpg.f34129c), Integer.valueOf(mpg.f34130d));
                    if ((mpg.f34127a & 8) == 0) {
                        f33754e.mo25416d("Target has not sent the device model.", new Object[0]);
                    } else {
                        mgj mgj = (mgj) this.f33756g;
                        mgj.f33633k = mpg.f34131e;
                        mgj.mo19986c();
                    }
                    mhv mhv = this.f33756g;
                    String str2 = mpg.f34132f;
                    met met = ((mgj) mhv).f33630h;
                    sdo.m34959a((Object) str2);
                    bxvd bxvd = met.f33543l;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    mtb mtb = (mtb) bxvd.f164949b;
                    mtb mtb2 = mtb.f34626o;
                    str2.getClass();
                    mtb.f34628a |= 1;
                    mtb.f34629b = str2;
                    String str3 = mpg.f34132f;
                    mta mta = (mta) this.f33760k.f33214e.mo74062i();
                    mpm b = mhu.m25130b(mpl.HANDSHAKE);
                    bxvd bxvd2 = (bxvd) b.mo74142c(5);
                    bxvd2.mo73625a((bxvk) b);
                    bxvd da = mpg.f34125o.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mpg mpg2 = (mpg) da.f164949b;
                    int i2 = mpg2.f34127a | 1;
                    mpg2.f34127a = i2;
                    mpg2.f34128b = -757399334;
                    int i3 = 2 | i2;
                    mpg2.f34127a = i3;
                    mpg2.f34129c = 1;
                    int i4 = i3 | 4;
                    mpg2.f34127a = i4;
                    mpg2.f34130d = 4;
                    str3.getClass();
                    mpg2.f34127a = i4 | 16;
                    mpg2.f34132f = str3;
                    String str4 = Build.MODEL;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mpg mpg3 = (mpg) da.f164949b;
                    str4.getClass();
                    mpg3.f34127a |= 8;
                    mpg3.f34131e = str4;
                    int i5 = Build.VERSION.SDK_INT;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mpg mpg4 = (mpg) da.f164949b;
                    int i6 = mpg4.f34127a | 2048;
                    mpg4.f34127a = i6;
                    mpg4.f34139m = i5;
                    mpg4.f34127a = i6 | 1024;
                    mpg4.f34138l = false;
                    try {
                        ModuleManager moduleManager = ModuleManager.get(this.f33743b);
                        int i7 = moduleManager.getCurrentModule().moduleVersion;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        mpg mpg5 = (mpg) da.f164949b;
                        mpg5.f34127a |= 128;
                        mpg5.f34135i = i7;
                        int i8 = moduleManager.getCurrentModuleApk().apkVersionCode;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        mpg mpg6 = (mpg) da.f164949b;
                        mpg6.f34127a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        mpg6.f34136j = i8;
                    } catch (IllegalStateException e) {
                        mhu.f33742a.mo25417e("Exception while getting module/policy version number.", e, new Object[0]);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        mpg mpg7 = (mpg) da.f164949b;
                        int i9 = mpg7.f34127a | 128;
                        mpg7.f34127a = i9;
                        mpg7.f34135i = -1;
                        mpg7.f34127a = i9 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        mpg7.f34136j = -1;
                    }
                    try {
                        PackageInfo packageInfo = this.f33743b.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                        int i10 = packageInfo.versionCode;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        mpg mpg8 = (mpg) da.f164949b;
                        mpg8.f34127a |= 32;
                        mpg8.f34133g = i10;
                        String a5 = stm.m36299a(packageInfo.versionName);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        mpg mpg9 = (mpg) da.f164949b;
                        a5.getClass();
                        mpg9.f34127a |= 64;
                        mpg9.f34134h = a5;
                    } catch (PackageManager.NameNotFoundException e2) {
                        mhu.f33742a.mo25417e("Exception while getting GmsCore version number.", e2, new Object[0]);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        mpg mpg10 = (mpg) da.f164949b;
                        mpg10.f34127a |= 32;
                        mpg10.f34133g = -1;
                    }
                    if (mta != null) {
                        bxtx aL = mta.mo73639aL();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        mpg mpg11 = (mpg) da.f164949b;
                        aL.getClass();
                        mpg11.f34127a |= 512;
                        mpg11.f34137k = aL;
                    }
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    mpm mpm2 = (mpm) bxvd2.f164949b;
                    mpg mpg12 = (mpg) da.mo74062i();
                    mpm mpm3 = mpm.f34178i;
                    mpg12.getClass();
                    mpm2.f34183d = mpg12;
                    mpm2.f34180a |= 4;
                    mo20035a((mpm) bxvd2.mo74062i());
                    return;
                } else {
                    f33754e.mo25418e("Handshake major version did not match. Got: %d", Integer.valueOf(mpg.f34129c));
                    mo20031a(6, String.format("Handshake did not match, Required: %d", 1), true);
                    return;
                }
            case 2:
                mpq mpq = mpm.f34182c;
                if (mpq == null) {
                    mpq = mpq.f34203d;
                }
                if ((mpm.f34180a & 8) != 0) {
                    mpn = mpm.f34184e;
                    if (mpn == null) {
                        mpn = mpn.f34188e;
                    }
                } else {
                    mpn = null;
                }
                try {
                    Iterator it = ModuleManager.get(this.f33743b).getAllModules().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) it.next();
                            if ("com.google.android.gms.smartdevice".equals(moduleInfo.moduleId)) {
                                i = moduleInfo.moduleVersion;
                            }
                        } else {
                            i = -1;
                        }
                    }
                } catch (InvalidConfigException e3) {
                    f33754e.mo25416d("unable to enumerate modules to find smart setup", new Object[0]);
                    i = -1;
                }
                if (i == -1) {
                    f33754e.mo25416d("Unable to determine smart device version, assuming all is well", new Object[0]);
                    i = 4;
                }
                if (i >= 4 && cckw.f179263a.mo6606a().mo76213C()) {
                    mpp a6 = mpp.m25489a(mpq.f34206b);
                    if (a6 == null) {
                        a6 = mpp.SMART_DEVICE_PAYLOAD_TYPE_UNSPECIFIED;
                    }
                    int ordinal2 = a6.ordinal();
                    if (ordinal2 == 1) {
                        ((mgj) this.f33756g).mo19981a(1);
                        if (this.f33762m != null) {
                            f33754e.mo25418e("Source controller already initialized, but got Initialized command", new Object[0]);
                            mo20045d();
                        }
                        mje mje = new mje(this.f33743b, new mht(this), this.f33744c, aqxc.m72189b(this.f33743b));
                        this.f33762m = mje;
                        mje.mo20088c();
                        return;
                    } else if (ordinal2 == 2) {
                        mjj mjj = this.f33762m;
                        if (mjj != null) {
                            byte[] k = mpq.f34207c.mo73780k();
                            int a7 = mpq.f34207c.mo73744a();
                            OutputStream outputStream = mjj.f33832f;
                            if (outputStream != null) {
                                try {
                                    outputStream.write(k, 0, a7);
                                    return;
                                } catch (IOException e4) {
                                    mjj.f33830d.mo25418e("Could not deliver data to API", new Object[0]);
                                    mjj.mo20094b(2, e4.getMessage());
                                    return;
                                }
                            } else {
                                mjj.f33835i.write(k, 0, a7);
                                mjj.f33830d.mo25409a("deliverData called before onInitialized() callback, queuing data to send after", new Object[0]);
                                return;
                            }
                        } else {
                            f33754e.mo25418e("SmartDeviceSourceController null but payload received", new Object[0]);
                            return;
                        }
                    } else if (ordinal2 == 3) {
                        if (mpn != null) {
                            f33754e.mo25418e("SmartDevice error received from other device: code %d and category %d", Integer.valueOf(mpn.f34191b), Integer.valueOf(mpn.f34193d));
                        }
                        mo20045d();
                        this.f33756g.mo19984a(false);
                        return;
                    } else if (ordinal2 == 4) {
                        if (this.f33762m == null) {
                            f33754e.mo25418e("SmartDevice complete received but controller is null. Ignoring.", new Object[0]);
                        }
                        this.f33762m = null;
                        return;
                    } else if (ordinal2 != 5) {
                        lvn lvn3 = f33754e;
                        Object[] objArr3 = new Object[1];
                        if ((1 & mpq.f34205a) != 0 && (mpp2 = mpp.m25489a(mpq.f34206b)) == null) {
                            mpp2 = mpp.SMART_DEVICE_PAYLOAD_TYPE_UNSPECIFIED;
                        }
                        objArr3[0] = mpp2;
                        lvn3.mo25416d("Got an unknown smart device packet: %s", objArr3);
                        return;
                    } else {
                        if (this.f33762m == null) {
                            f33754e.mo25418e("Received abort and restart, but controller is already null. Recreating.", new Object[0]);
                        } else {
                            mo20045d();
                        }
                        mje mje2 = new mje(this.f33743b, new mht(this), this.f33744c, aqxc.m72189b(this.f33743b));
                        this.f33762m = mje2;
                        mje2.mo20088c();
                        return;
                    }
                } else {
                    bxvd da2 = mpn.f34188e.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    mpn mpn2 = (mpn) da2.f164949b;
                    int i11 = mpn2.f34190a | 1;
                    mpn2.f34190a = i11;
                    mpn2.f34191b = i;
                    int i12 = i11 | 4;
                    mpn2.f34190a = i12;
                    mpn2.f34193d = 5;
                    "Source Disabled".getClass();
                    mpn2.f34190a = i12 | 2;
                    mpn2.f34192c = "Source Disabled";
                    mpn mpn3 = (mpn) da2.mo74062i();
                    bxvd da3 = mpq.f34203d.mo74144da();
                    mpp mpp3 = mpp.ERROR;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    mpq mpq2 = (mpq) da3.f164949b;
                    mpq2.f34206b = mpp3.f34202g;
                    mpq2.f34205a = 1 | mpq2.f34205a;
                    mo20036a((mpq) da3.mo74062i(), mpn3);
                    return;
                }
            case 3:
                f33754e.mo25412b("Authorization request.", new Object[0]);
                mgj mgj2 = (mgj) this.f33756g;
                if (!mgj2.f33634l) {
                    mgj2.mo19981a(3);
                    mgj2.f33638p.mo19907a();
                    return;
                }
                mgj2.mo19987d();
                return;
            case 4:
            case 7:
            case 11:
            case 13:
            default:
                lvn lvn4 = f33754e;
                Object[] objArr4 = new Object[1];
                mpl a8 = mpl.m25483a(mpm.f34181b);
                if (a8 == null) {
                    a8 = mpl.PACKET_TYPE_UNSPECIFIED;
                }
                objArr4[0] = a8;
                lvn4.mo25416d("Unknown/unexpected packet type; ignoring: %s", objArr4);
                return;
            case 5:
                bxvd da4 = mpa.f34096b.mo74144da();
                for (String str5 : Collections.unmodifiableSet(this.f33755f.f34012a.keySet())) {
                    bxvd da5 = moz.f34092c.mo74144da();
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    moz moz = (moz) da5.f164949b;
                    str5.getClass();
                    moz.f34094a |= 1;
                    moz.f34095b = str5;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    mpa mpa = (mpa) da4.f164949b;
                    moz moz2 = (moz) da5.mo74062i();
                    moz2.getClass();
                    if (!mpa.f34098a.mo73666a()) {
                        mpa.f34098a = bxvk.m124021a(mpa.f34098a);
                    }
                    mpa.f34098a.add(moz2);
                }
                mpa mpa2 = (mpa) da4.mo74062i();
                if ((mpm.f34180a & 128) != 0) {
                    mpe mpe = mpm.f34187h;
                    if (mpe == null) {
                        mpe = mpe.f34116b;
                    }
                    bArr = mpe.f34118a.mo73780k();
                }
                if (bArr == null || !cckw.m130273k()) {
                    if (bArr != null) {
                        f33754e.mo25412b("Experiment flag for apk transfer disabled", new Object[0]);
                    } else {
                        f33754e.mo25412b("Got a null token from source", new Object[0]);
                    }
                    mo20032a(mpa2);
                    return;
                }
                lvn lvn5 = f33754e;
                String valueOf = String.valueOf(Arrays.toString(bArr));
                lvn5.mo25409a(valueOf.length() == 0 ? new String("Device Token: ") : "Device Token: ".concat(valueOf), new Object[0]);
                mio mio = this.f33758i;
                Intent intent = new Intent();
                intent.setPackage("com.android.vending");
                intent.setAction("com.android.vending.setup.IPlayP2pRestoreService.BIND");
                mio.f33782a.mo25412b("#connect", new Object[0]);
                try {
                    if (!mio.f33783b.bindService(intent, mio.f33784c, 1)) {
                        mio.f33786e = false;
                        mio.f33782a.mo25418e("Play P2P Service wasn't found", new Object[0]);
                        mo20032a(mpa2);
                        return;
                    }
                    mio.f33786e = true;
                    mio.mo20076b();
                    mhx mhx = new mhx(this, mpa2);
                    mio mio2 = this.f33758i;
                    PlayP2pRestoreServiceResultReceiver playP2pRestoreServiceResultReceiver = new PlayP2pRestoreServiceResultReceiver(this.f33761l, mhx, this.f33744c);
                    mio2.f33782a.mo25412b("enqueuing find compatible packages request", new Object[0]);
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("p2pdevicetoken", bArr);
                    bundle.putParcelable("p2presultreceiver", playP2pRestoreServiceResultReceiver);
                    bundle.putString("request_id", "p2pfindcompatiblepackages");
                    mio2.f33785d.add(new mif(bundle, mhx));
                    mio2.mo20076b();
                    return;
                } catch (SecurityException e5) {
                    mio.f33786e = false;
                    mio.f33782a.mo25417e("Security exception occurred connecting to P2P Service.", e5, new Object[0]);
                }
                break;
            case 6:
                mgj mgj3 = (mgj) this.f33756g;
                mgj3.mo19981a(6);
                mgj3.f33638p.mo19916f();
                mo20033a(new mhy(this, this));
                return;
            case 8:
                mgj mgj4 = (mgj) this.f33756g;
                mgj4.mo19981a(7);
                mgj4.f33638p.mo19915e();
                mo20033a(new mhz(this, this));
                return;
            case 9:
                mgj mgj5 = (mgj) this.f33756g;
                mgj5.mo19981a(8);
                met met2 = mgj5.f33630h;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                bxvd bxvd3 = met2.f33214e;
                long j = elapsedRealtime - met2.f33213d;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                mta mta2 = (mta) bxvd3.f164949b;
                mta mta3 = mta.f34617g;
                mta2.f34619a = 2 | mta2.f34619a;
                mta2.f34621c = j;
                bxvd bxvd4 = met2.f33214e;
                if (((mta) bxvd4.f164949b).f34620b != -1) {
                    lys.f33210a.mo25409a("Migrate status code overwritten explicitly", new Object[0]);
                } else {
                    if (bxvd4.f164950c) {
                        bxvd4.mo74035c();
                        bxvd4.f164950c = false;
                    }
                    mta mta4 = (mta) bxvd4.f164949b;
                    mta4.f34619a = 1 | mta4.f34619a;
                    mta4.f34620b = 0;
                }
                mgj5.f33630h.mo19758c();
                mgj5.f33638p.mo19914d();
                mo20047f();
                return;
            case 10:
                mgj mgj6 = (mgj) this.f33756g;
                new adzt(mgj6.f33624b.getMainLooper()).post(new mfv(mgj6.f33624b, mgj6.f33625c, mgj6.f33631i));
                return;
            case 12:
                mpn mpn4 = mpm.f34184e;
                if (mpn4 == null) {
                    mpn4 = mpn.f34188e;
                }
                mhv mhv2 = this.f33756g;
                int i13 = mpn4.f34191b;
                mgj.f33623a.mo25418e("Received error from other device.\nCode: %d. Message: %s", Integer.valueOf(i13), mpn4.f34192c);
                mgj mgj7 = (mgj) mhv2;
                mgj7.f33630h.mo19753a(mce.m24855a(i13, false));
                if (i13 != 9) {
                    mgj7.mo19990g();
                    return;
                }
                mgj.f33623a.mo25418e("Cancel requested from the other device", new Object[0]);
                mgj7.f33631i.mo20045d();
                mgj7.f33638p.mo19910a(C1575mfc.f33570a);
                mgj7.f33626d.mo20001a(14, null, 1, 1);
                mgj7.mo19989f();
                return;
            case 14:
            case 15:
                mpl a9 = mpl.m25483a(mpm.f34181b);
                if (a9 == null) {
                    a9 = mpl.PACKET_TYPE_UNSPECIFIED;
                }
                mpg mpg13 = mpm.f34183d;
                if (mpg13 == null) {
                    mpg13 = mpg.f34125o;
                }
                bxtx bxtx = mpg13.f34140n;
                bmxy.m108582a(this.f33763n, "postSmartSetupAuthenticator must not be null for WiFi D2D.");
                try {
                    HandshakeData handshakeData = new HandshakeData();
                    handshakeData.mo59187e(bxtx.mo73780k());
                    if (a9 != mpl.POST_SMARTSETUP_AUTH_INIT) {
                        mle mle = this.f33763n;
                        mle.f33932a.mo25409a("authenticate", new Object[0]);
                        PostSetupAuthData postSetupAuthData = (PostSetupAuthData) mle.mo20138a(new mkz(mle, handshakeData));
                        m25150a(mpl.POST_SMARTSETUP_AUTH_FINISH, postSetupAuthData.f108107c);
                        this.f33764o.f33738a = postSetupAuthData.f108106b;
                        return;
                    }
                    mle mle2 = this.f33763n;
                    mle.f33932a.mo25409a("handshakeInit", new Object[0]);
                    m25150a(mpl.POST_SMARTSETUP_AUTH_INIT, (HandshakeData) mle2.mo20138a(new mky(mle2, handshakeData)));
                    return;
                } catch (asbx | mld e6) {
                    f33754e.mo25418e(e6.toString(), new Object[0]);
                    mo20031a(13, "Post-SmartSetup authentication failed.", true);
                    return;
                }
            case 16:
                mpj mpj = mpm.f34186g;
                if (mpj == null) {
                    mpj = mpj.f34153b;
                }
                try {
                    byte[] bArr2 = ((mlx) this.f33745d).f33979e.f33960e;
                    mhp mhp = this.f33764o;
                    if (mhp.f33738a == null) {
                        throw new mho("Missing secret key (likely post-smartsetup auth was skipped).");
                    } else if (Arrays.equals(mhn.m25123a(mhp.f33738a, mpj.f34155a.mo73780k()), bArr2)) {
                        f33754e.mo25414c("Nearby authentication success.", new Object[0]);
                        this.f33759j = true;
                        mo20034a(mpl.NEARBY_AUTHENTICATION_SUCCESS);
                        return;
                    } else {
                        throw new mho("Nearby token mismatch.");
                    }
                } catch (mhm e7) {
                    throw new mho("Unable to decrypt Nearby token from target.", e7);
                } catch (mho e8) {
                    f33754e.mo25418e(e8.toString(), new Object[0]);
                    String valueOf2 = String.valueOf(e8.getMessage());
                    mo20031a(14, valueOf2.length() == 0 ? new String("Nearby authentication failed.") : "Nearby authentication failed.".concat(valueOf2), true);
                    return;
                }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mce.a(int, boolean):int
     arg types: [int, int]
     candidates:
      mce.a(android.content.Context, java.lang.String):java.io.File
      mce.a(int, boolean):int */
    /* renamed from: a */
    public final void mo20031a(int i, String str, boolean z) {
        f33754e.mo25412b("Fatal protocol error. Shutting transport down.", new Object[0]);
        if (z) {
            this.f33745d.mo20097a(mo20030a(i - 1, str).mo73642k());
        } else {
            this.f33745d.mo20095a();
        }
        this.f33760k.mo19753a(mce.m24855a(i - 1, true));
        this.f33756g.mo19990g();
    }

    /* renamed from: a */
    public final void mo20036a(mpq mpq, mpn mpn) {
        mpm b = mhu.m25130b(mpl.SMART_DEVICE);
        bxvd bxvd = (bxvd) b.mo74142c(5);
        bxvd.mo73625a((bxvk) b);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mpm mpm = (mpm) bxvd.f164949b;
        mpm mpm2 = mpm.f34178i;
        mpq.getClass();
        mpm.f34182c = mpq;
        int i = mpm.f34180a | 2;
        mpm.f34180a = i;
        if (mpn != null) {
            mpn.getClass();
            mpm.f34184e = mpn;
            mpm.f34180a = i | 8;
        } else {
            mpm.f34184e = null;
            mpm.f34180a = i & -9;
        }
        mpm mpm3 = (mpm) bxvd.mo74062i();
        long P = cckw.f179263a.mo6606a().mo76226P();
        lvn lvn = mhu.f33742a;
        Object[] objArr = new Object[2];
        mpl a = mpl.m25483a(mpm3.f34181b);
        if (a == null) {
            a = mpl.PACKET_TYPE_UNSPECIFIED;
        }
        objArr[0] = a;
        objArr[1] = Long.valueOf(P);
        lvn.mo25412b("Sending packet of type: %s, timeout: %d", objArr);
        this.f33745d.mo20103a(mpm3.mo73642k(), P);
        if (mpn != null) {
            f33754e.mo25418e("SmartDevice error encountered: code %d and category %d", Integer.valueOf(mpn.f34191b), Integer.valueOf(mpn.f34193d));
            met met = this.f33760k;
            int i2 = mpn.f34193d;
            int i3 = mpn.f34191b;
            bxvd bxvd2 = met.f33543l;
            bxvd da = mtq.f34696d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mtq mtq = (mtq) da.f164949b;
            int i4 = mtq.f34698a | 1;
            mtq.f34698a = i4;
            mtq.f34699b = i2;
            mtq.f34698a = i4 | 2;
            mtq.f34700c = i3;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            mtb mtb = (mtb) bxvd2.f164949b;
            mtq mtq2 = (mtq) da.mo74062i();
            mtb mtb2 = mtb.f34626o;
            mtq2.getClass();
            mtb.f34639l = mtq2;
            mtb.f34628a |= 64;
        }
    }
}
