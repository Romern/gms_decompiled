package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import com.google.android.gms.car.CarFacet;
import com.google.android.gms.car.CarSensorEvent;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: nja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nja implements niw {

    /* renamed from: a */
    public static final bnsn f35783a = odk.m28481a("CAR.ANALYTICS");

    /* renamed from: b */
    public final npa f35784b;

    /* renamed from: c */
    public final Context f35785c;

    /* renamed from: d */
    public final List f35786d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public CarFacet f35787e;

    /* renamed from: f */
    public long f35788f;

    /* renamed from: g */
    private final nlm f35789g;

    /* renamed from: h */
    private final niy f35790h;

    /* renamed from: i */
    private final npd f35791i;

    /* renamed from: j */
    private final boolean f35792j;

    /* renamed from: k */
    private int f35793k = -1;

    public nja(nlm nlm, npa npa, npd npd, Context context) {
        if (nlm == null || npd == null) {
            throw new IllegalArgumentException("args must not be null");
        }
        this.f35789g = nlm;
        this.f35784b = npa;
        this.f35785c = context;
        this.f35791i = npd;
        Context applicationContext = context.getApplicationContext();
        boolean a = ccqc.f179744a.mo6606a().mo76635a();
        this.f35792j = a;
        if (a) {
            ocx a2 = ocx.m28405a(applicationContext);
            nmj nmj = new nmj(nlm);
            synchronized (ocx.f37197a) {
                a2.f37202c = nmj;
            }
            this.f35790h = new niz(a2);
            return;
        }
        this.f35790h = new nix(new omq(applicationContext));
    }

    /* renamed from: a */
    public static int m26514a(int i, boolean z) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return !z ? 6 : 7;
        } else {
            if (i2 == 2) {
                return !z ? 8 : 9;
            }
            if (i2 == 3) {
                return !z ? 10 : 11;
            }
            if (i2 == 4) {
                return !z ? 12 : 13;
            }
            if (i2 != 5) {
                return 1;
            }
            return !z ? 14 : 15;
        }
    }

    /* renamed from: b */
    public final void mo20862b(int i) {
        bxvd c = mo20870c();
        bxvd da = bpee.f137262c.mo74144da();
        int i2 = i - 1;
        if (i != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpee bpee = (bpee) da.f164949b;
            bpee.f137264a |= 1;
            bpee.f137265b = i2;
            bpee bpee2 = (bpee) da.mo74062i();
            if (c.f164950c) {
                c.mo74035c();
                c.f164950c = false;
            }
            bpcl bpcl = (bpcl) c.f164949b;
            bpcl bpcl2 = bpcl.f135759L;
            bpee2.getClass();
            bpcl.f135778f = bpee2;
            bpcl.f135773a |= 8;
            mo20868a(c, 16);
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public final boolean mo20863b() {
        return this.f35793k == -1;
    }

    /* renamed from: c */
    public final bxvd mo20870c() {
        Integer num;
        boolean z;
        byte b;
        bpde bpde;
        if (this.f35792j) {
            return bpcl.f135759L.mo74144da();
        }
        bpcl a = this.f35790h.mo20864a();
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        if (this.f35789g.mo21046f() == null) {
            return bxvd;
        }
        nmv f = this.f35789g.mo21046f();
        try {
            CarSensorEvent c = f.mo21181c(2);
            if (c != null) {
                num = Integer.valueOf((int) (c.f29366d[0] * 1000.0f));
            } else {
                num = null;
            }
            if (num == null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpcl bpcl = (bpcl) bxvd.f164949b;
                bpcl bpcl2 = bpcl.f135759L;
                bpcl.f135773a &= -524289;
                bpcl.f135789q = 0;
            } else {
                int intValue = num.intValue();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpcl bpcl3 = (bpcl) bxvd.f164949b;
                bpcl bpcl4 = bpcl.f135759L;
                bpcl3.f135773a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                bpcl3.f135789q = intValue;
            }
            CarSensorEvent c2 = f.mo21181c(9);
            if (c2 != null) {
                z = c2.f29367e[0] != 0;
            } else {
                z = false;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpcl bpcl5 = (bpcl) bxvd.f164949b;
            bpcl5.f135773a |= 1048576;
            bpcl5.f135790r = z;
            CarSensorEvent c3 = f.mo21181c(11);
            if (c3 != null) {
                b = c3.f29367e[0];
            } else {
                b = 0;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpcl bpcl6 = (bpcl) bxvd.f164949b;
            bpcl6.f135773a |= 2097152;
            bpcl6.f135791s = b;
            CarSensorEvent c4 = f.mo21181c(7);
            if (c4 != null) {
                byte b2 = c4.f29367e[0];
                switch (b2) {
                    case 0:
                        bpde = bpde.GEAR_NEUTRAL;
                        break;
                    case 1:
                        bpde = bpde.GEAR_1;
                        break;
                    case 2:
                        bpde = bpde.GEAR_2;
                        break;
                    case 3:
                        bpde = bpde.GEAR_3;
                        break;
                    case 4:
                        bpde = bpde.GEAR_4;
                        break;
                    case 5:
                        bpde = bpde.GEAR_5;
                        break;
                    case 6:
                        bpde = bpde.GEAR_6;
                        break;
                    default:
                        switch (b2) {
                            case 100:
                                bpde = bpde.GEAR_DRIVE;
                                break;
                            case 101:
                                bpde = bpde.GEAR_PARK;
                                break;
                            case 102:
                                bpde = bpde.GEAR_REVERSE;
                                break;
                            default:
                                bpde = bpde.UNKNOWN_GEAR;
                                break;
                        }
                }
            } else {
                bpde = bpde.UNKNOWN_GEAR;
            }
            int i = bpde.f135928l;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpcl bpcl7 = (bpcl) bxvd.f164949b;
            bpcl7.f135773a |= 4194304;
            bpcl7.f135792t = i;
        } catch (IllegalStateException e) {
        }
        return bxvd;
    }

    /* renamed from: a */
    static bpct m26515a(CarUiInfo carUiInfo) {
        bxvd da = bpct.f135850i.mo74144da();
        boolean z = carUiInfo.f29369a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpct bpct = (bpct) da.f164949b;
        int i = 1;
        int i2 = bpct.f135852a | 1;
        bpct.f135852a = i2;
        bpct.f135853b = z;
        boolean z2 = carUiInfo.f29370b;
        int i3 = i2 | 2;
        bpct.f135852a = i3;
        bpct.f135854c = z2;
        int i4 = carUiInfo.f29375g;
        if (i4 == 2) {
            i = 2;
        } else if (i4 == 3) {
            i = 3;
        } else if (i4 == 4) {
            i = 4;
        }
        int i5 = i3 | 4;
        bpct.f135852a = i5;
        bpct.f135855d = i - 1;
        boolean z3 = carUiInfo.f29372d;
        int i6 = i5 | 8;
        bpct.f135852a = i6;
        bpct.f135856e = z3;
        boolean z4 = carUiInfo.f29374f;
        int i7 = i6 | 16;
        bpct.f135852a = i7;
        bpct.f135857f = z4;
        boolean z5 = carUiInfo.f29376h;
        int i8 = i7 | 32;
        bpct.f135852a = i8;
        bpct.f135858g = z5;
        boolean z6 = carUiInfo.f29371c;
        bpct.f135852a = i8 | 64;
        bpct.f135859h = z6;
        return (bpct) da.mo74062i();
    }

    /* renamed from: a */
    public static String m26516a(PackageManager packageManager, String str) {
        try {
            return packageManager.getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static List m26517a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Point point = new Point();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            biwg biwg = (biwg) it.next();
            bxvd da = bpcr.f135823i.mo74144da();
            oak.m28273b(biwg, point);
            int i = point.x;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcr bpcr = (bpcr) da.f164949b;
            bpcr.f135825a |= 2;
            bpcr.f135827c = i;
            int i2 = point.y;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcr bpcr2 = (bpcr) da.f164949b;
            int i3 = 1;
            bpcr2.f135825a |= 1;
            bpcr2.f135826b = i2;
            biwf a = biwf.m102896a(biwg.f122094b);
            if (a == null) {
                a = biwf.VIDEO_800x480;
            }
            int i4 = a.f122090j;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcr bpcr3 = (bpcr) da.f164949b;
            int i5 = bpcr3.f135825a | 4;
            bpcr3.f135825a = i5;
            bpcr3.f135828d = i4;
            if ((biwg.f122093a & 16) != 0) {
                int i6 = biwg.f122098f;
                bpcr3.f135825a = i5 | 8;
                bpcr3.f135829e = i6;
            }
            int a2 = biwo.m102908a(biwg.f122095c);
            if (a2 != 0) {
                i3 = a2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcr bpcr4 = (bpcr) da.f164949b;
            int i7 = bpcr4.f135825a | 16;
            bpcr4.f135825a = i7;
            bpcr4.f135830f = i3;
            if ((biwg.f122093a & 128) != 0) {
                int i8 = biwg.f122100h;
                i7 |= 32;
                bpcr4.f135825a = i7;
                bpcr4.f135831g = i8;
            }
            if ((biwg.f122093a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                int i9 = biwg.f122101i;
                bpcr4.f135825a = i7 | 64;
                bpcr4.f135832h = i9;
            }
            arrayList.add((bpcr) da.mo74062i());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo20849a() {
        for (oej oej : this.f35786d) {
            oej.f37366a.mo22065b();
        }
        this.f35793k = -1;
        this.f35790h.mo20865a(-1, null);
    }

    /* renamed from: a */
    public final void mo20850a(int i) {
        bxvd c = mo20870c();
        long j = (long) i;
        if (c.f164950c) {
            c.mo74035c();
            c.f164950c = false;
        }
        bpcl bpcl = (bpcl) c.f164949b;
        bpcl bpcl2 = bpcl.f135759L;
        bpcl.f135774b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        bpcl.f135768H = j;
        mo20868a(c, 57);
    }

    /* renamed from: a */
    public final void mo20851a(int i, int i2, int i3, int i4) {
        bxvd da = bpcj.f135734f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpcj bpcj = (bpcj) da.f164949b;
        int i5 = bpcj.f135736a | 1;
        bpcj.f135736a = i5;
        bpcj.f135737b = i;
        int i6 = i5 | 2;
        bpcj.f135736a = i6;
        bpcj.f135738c = i2;
        int i7 = i6 | 4;
        bpcj.f135736a = i7;
        bpcj.f135739d = i3;
        bpcj.f135736a = i7 | 8;
        bpcj.f135740e = i4;
        bpcj bpcj2 = (bpcj) da.mo74062i();
        bxvd c = mo20870c();
        if (c.f164950c) {
            c.mo74035c();
            c.f164950c = false;
        }
        bpcl bpcl = (bpcl) c.f164949b;
        bpcl bpcl2 = bpcl.f135759L;
        bpcj2.getClass();
        bpcl.f135771K = bpcj2;
        bpcl.f135774b |= 268435456;
        mo20868a(c, 67);
    }

    /* renamed from: a */
    public final void mo20852a(int i, OutputStream outputStream) {
        this.f35793k = i;
        this.f35790h.mo20865a(i, outputStream);
        for (oej oej : this.f35786d) {
            oej.f37366a.mo22065b();
        }
    }

    /* renamed from: a */
    public final void mo20853a(bios bios, int i) {
        if (bios != null) {
            bxvd da = bpci.f135729d.mo74144da();
            int i2 = bios.f121100e;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpci bpci = (bpci) da.f164949b;
            int i3 = bpci.f135731a | 1;
            bpci.f135731a = i3;
            bpci.f135732b = i2;
            bpci.f135731a = i3 | 2;
            bpci.f135733c = i;
            bpci bpci2 = (bpci) da.mo74062i();
            bxvd c = mo20870c();
            if (c.f164950c) {
                c.mo74035c();
                c.f164950c = false;
            }
            bpcl bpcl = (bpcl) c.f164949b;
            bpcl bpcl2 = bpcl.f135759L;
            bpci2.getClass();
            bpcl.f135782j = bpci2;
            bpcl.f135773a |= 128;
            mo20868a(c, 23);
        }
    }

    /* renamed from: a */
    public final void mo20854a(bpck bpck) {
        bxvd c = mo20870c();
        if (c.f164950c) {
            c.mo74035c();
            c.f164950c = false;
        }
        bpcl bpcl = (bpcl) c.f164949b;
        bpcl bpcl2 = bpcl.f135759L;
        bpck.getClass();
        bpcl.f135764D = bpck;
        bpcl.f135774b |= 4096;
        mo20868a(c, 55);
    }

    /* renamed from: a */
    public final void mo20855a(bpcn bpcn) {
        bxvd c = mo20870c();
        if (c.f164950c) {
            c.mo74035c();
            c.f164950c = false;
        }
        bpcl bpcl = (bpcl) c.f164949b;
        bpcl bpcl2 = bpcl.f135759L;
        bpcn.getClass();
        bpcl.f135786n = bpcn;
        bpcl.f135773a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        mo20868a(c, 39);
    }

    /* renamed from: a */
    public final void mo20856a(bpcp bpcp) {
        bxvd c = mo20870c();
        if (c.f164950c) {
            c.mo74035c();
            c.f164950c = false;
        }
        bpcl bpcl = (bpcl) c.f164949b;
        bpcl bpcl2 = bpcl.f135759L;
        bpcp.getClass();
        bpcl.f135783k = bpcp;
        bpcl.f135773a |= 2048;
        mo20868a(c, 36);
    }

    /* renamed from: a */
    public final void mo20857a(bpdi bpdi, bpdh bpdh) {
        bxvd da = bpdj.f136247f.mo74144da();
        int i = bpdi.f136246K;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpdj bpdj = (bpdj) da.f164949b;
        int i2 = bpdj.f136249a | 1;
        bpdj.f136249a = i2;
        bpdj.f136250b = i;
        int i3 = bpdh.f136208em;
        bpdj.f136249a = i2 | 2;
        bpdj.f136251c = i3;
        mo20867a((bpdj) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo20858a(bpdi bpdi, bpdh bpdh, String str) {
        bxvd da = bpdj.f136247f.mo74144da();
        int i = bpdi.f136246K;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpdj bpdj = (bpdj) da.f164949b;
        int i2 = bpdj.f136249a | 1;
        bpdj.f136249a = i2;
        bpdj.f136250b = i;
        int i3 = bpdh.f136208em;
        int i4 = i2 | 2;
        bpdj.f136249a = i4;
        bpdj.f136251c = i3;
        int i5 = i4 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bpdj.f136249a = i5;
        bpdj.f136253e = 300;
        str.getClass();
        bpdj.f136249a = i5 | 128;
        bpdj.f136252d = str;
        mo20867a((bpdj) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo20867a(bpdj bpdj) {
        boolean z;
        bmxy.m108581a(bpdj);
        boolean z2 = true;
        if ((bpdj.f136249a & 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        bmxy.m108600b(z);
        if ((bpdj.f136249a & 2) == 0) {
            z2 = false;
        }
        bmxy.m108600b(z2);
        bxvd c = mo20870c();
        if (c.f164950c) {
            c.mo74035c();
            c.f164950c = false;
        }
        bpcl bpcl = (bpcl) c.f164949b;
        bpcl bpcl2 = bpcl.f135759L;
        bpdj.getClass();
        bpcl.f135785m = bpdj;
        bpcl.f135773a |= 8192;
        mo20868a(c, 38);
    }

    /* renamed from: a */
    public final void mo20859a(bpdn bpdn, bpdo bpdo, long j, long j2) {
        bmxy.m108582a(bpdn, "errorCode is necessary");
        bmxy.m108582a(bpdo, "errorDetail is necessary");
        bxvd da = bpdp.f136352f.mo74144da();
        int i = bpdn.f136282v;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpdp bpdp = (bpdp) da.f164949b;
        int i2 = bpdp.f136354a | 1;
        bpdp.f136354a = i2;
        bpdp.f136355b = i;
        int i3 = bpdo.f136351ap;
        int i4 = i2 | 2;
        bpdp.f136354a = i4;
        bpdp.f136356c = i3;
        int i5 = i4 | 4;
        bpdp.f136354a = i5;
        bpdp.f136357d = j;
        bpdp.f136354a = i5 | 8;
        bpdp.f136358e = j2;
        bpdp bpdp2 = (bpdp) da.mo74062i();
        bxvd c = mo20870c();
        if (c.f164950c) {
            c.mo74035c();
            c.f164950c = false;
        }
        bpcl bpcl = (bpcl) c.f164949b;
        bpcl bpcl2 = bpcl.f135759L;
        bpdp2.getClass();
        bpcl.f135787o = bpdp2;
        bpcl.f135773a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        mo20868a(c, 58);
    }

    /* renamed from: a */
    public final void mo20860a(bpeb bpeb, bpea bpea) {
        bmxy.m108581a(bpeb);
        bxvd da = bped.f137237x.mo74144da();
        int i = bpeb.f137221cE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bped bped = (bped) da.f164949b;
        int i2 = bped.f137239a | 1;
        bped.f137239a = i2;
        bped.f137240b = i;
        int i3 = bpea.f137033jW;
        bped.f137239a = i2 | 2;
        bped.f137241c = i3;
        bped bped2 = (bped) da.mo74062i();
        bxvd c = mo20870c();
        if (c.f164950c) {
            c.mo74035c();
            c.f164950c = false;
        }
        bpcl bpcl = (bpcl) c.f164949b;
        bpcl bpcl2 = bpcl.f135759L;
        bped2.getClass();
        bpcl.f135784l = bped2;
        bpcl.f135773a |= 4096;
        mo20868a(c, 37);
    }

    /* renamed from: a */
    public final void mo20868a(bxvd bxvd, int i) {
        int i2;
        if ((((bpcl) bxvd.f164949b).f135774b & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) == 0) {
            try {
                i2 = this.f35785c.getApplicationContext().getPackageManager().getPackageInfo(npe.m27161b(this.f35785c.getApplicationContext()), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                i2 = -1;
            }
            bxvd da = bpdf.f135929c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpdf bpdf = (bpdf) da.f164949b;
            bpdf.f135931a |= 1;
            bpdf.f135932b = i2;
            bpdf bpdf2 = (bpdf) da.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpcl bpcl = (bpcl) bxvd.f164949b;
            bpcl bpcl2 = bpcl.f135759L;
            bpdf2.getClass();
            bpcl.f135767G = bpdf2;
            bpcl.f135774b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            int i3 = this.f35793k;
            bpcl.f135773a |= 8388608;
            bpcl.f135793u = i3;
            if (this.f35791i.f36297d) {
                this.f35790h.mo20866a((bpcl) bxvd.mo74062i(), i, bngx.m109376e());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("GearheadInfo already set, please add logic to merge it in.");
    }

    /* renamed from: a */
    public final void mo20861a(odg odg) {
        bmxy.m108601b(odg.mo21991d().isEmpty(), "TestCodes not implemented pending b/131928884");
        mo20868a(odg.mo22020C(), odg.mo21987B());
    }

    /* renamed from: a */
    public final void mo20869a(byte[] bArr, int i) {
        bxvd c = mo20870c();
        try {
            c.mo73635b(bArr, bxus.m123744c());
            mo20868a(c, i);
        } catch (bxwf e) {
            bnsi c2 = f35783a.mo68388c();
            c2.mo68432a("nja", "a", 490, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("Error reading event proto");
        }
    }
}
