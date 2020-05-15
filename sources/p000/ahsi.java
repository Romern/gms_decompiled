package p000;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collections;
import java.util.List;

/* renamed from: ahsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahsi extends buqb {

    /* renamed from: a */
    private final ahst f67938a;

    /* renamed from: b */
    private final burh f67939b;

    /* renamed from: c */
    private final burl f67940c;

    /* renamed from: d */
    private final sqv f67941d;

    public ahsi(Context context) {
        super(context);
        this.f67938a = (ahst) ahgz.m55754a(context, ahst.class);
        this.f67939b = (burh) ahgz.m55754a(context, burh.class);
        this.f67940c = (burl) ahgz.m55754a(context, burl.class);
        this.f67941d = (sqv) ahgz.m55754a(context, sqv.class);
    }

    /* renamed from: a */
    public static int m56461a(String str) {
        try {
            return Integer.parseInt(str, 16);
        } catch (NumberFormatException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Expected 3-byte hex model ID %s", str);
            return 0;
        }
    }

    /* renamed from: b */
    public final bxvd mo37024b(bvin bvin) {
        int i;
        bxvd da = bywl.f168591u.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bywl bywl = (bywl) da.f164949b;
        bywl.f168594b = bvin.f156289bv;
        bywl.f168593a |= 1;
        if (!this.f67939b.mo73038b()) {
            i = ahfz.m55679a();
        } else {
            i = 6;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bywl bywl2 = (bywl) da.f164949b;
        bywl2.f168605m = i - 1;
        bywl2.f168593a |= 4096;
        return da;
    }

    /* renamed from: a */
    private final void m56462a(bvin bvin, List list, Integer num, String str, Integer num2) {
        bxvd b = mo37024b(bvin);
        if (str != null) {
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bywl bywl = (bywl) b.f164949b;
            bywl bywl2 = bywl.f168591u;
            str.getClass();
            bywl.f168593a |= 8;
            bywl.f168598f = str;
        }
        if (this.f67938a.mo37045b() != null) {
            for (ahsu ahsu : this.f67938a.mo37045b()) {
                if (ahsu.mo37075c()) {
                    byvp a = mo37010a(ahsu);
                    if (b.f164950c) {
                        b.mo74035c();
                        b.f164950c = false;
                    }
                    bywl bywl3 = (bywl) b.f164949b;
                    bywl bywl4 = bywl.f168591u;
                    a.getClass();
                    if (!bywl3.f168597e.mo73666a()) {
                        bywl3.f168597e = GeneratedMessageLite.m124021a(bywl3.f168597e);
                    }
                    bywl3.f168597e.add(a);
                }
            }
        }
        int a2 = this.f67939b.mo73032a("notification_settings_beacon");
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bywl bywl5 = (bywl) b.f164949b;
        bywl bywl6 = bywl.f168591u;
        bywl5.f168599g = a2 - 1;
        bywl5.f168593a |= 16;
        int a3 = this.f67939b.mo73032a("notification_settings_devcie");
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bywl bywl7 = (bywl) b.f164949b;
        bywl7.f168600h = a3 - 1;
        bywl7.f168593a |= 32;
        int e = this.f67940c.mo73045e();
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bywl bywl8 = (bywl) b.f164949b;
        bywl8.f168601i = e - 1;
        bywl8.f168593a |= 128;
        int i = 3;
        int i2 = !this.f67939b.mo73043g() ? 3 : 2;
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bywl bywl9 = (bywl) b.f164949b;
        bywl9.f168603k = i2 - 1;
        bywl9.f168593a |= 512;
        int i3 = Build.VERSION.SDK_INT;
        if (((PowerManager) this.f67940c.f154771a.getSystemService("power")).isInteractive()) {
            i = 2;
        }
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bywl bywl10 = (bywl) b.f164949b;
        bywl10.f168604l = i - 1;
        bywl10.f168593a |= 2048;
        bywl bywl11 = (bywl) b.mo74062i();
        bxvd bxvd = (bxvd) bywl11.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bywl11);
        if (list != null && !list.isEmpty()) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((bywl) bxvd.f164949b).f168596d = GeneratedMessageLite.m124030de();
            for (int i4 = 0; i4 < list.size(); i4++) {
                byvp a4 = mo37010a((ahsu) list.get(i4));
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bywl bywl12 = (bywl) bxvd.f164949b;
                a4.getClass();
                if (!bywl12.f168596d.mo73666a()) {
                    bywl12.f168596d = GeneratedMessageLite.m124021a(bywl12.f168596d);
                }
                bywl12.f168596d.add(a4);
            }
        }
        if (num != null) {
            int intValue = num.intValue();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bywl bywl13 = (bywl) bxvd.f164949b;
            bywl13.f168593a |= 2;
            bywl13.f168595c = intValue;
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bywl bywl14 = (bywl) bxvd.f164949b;
            bywl14.f168593a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bywl14.f168602j = intValue2;
        }
        mo37023a((bywl) bxvd.mo74062i());
    }

    /* renamed from: b */
    public final void mo37025b(bvin bvin, ahsu ahsu, String str, Integer num) {
        List list;
        bvin bvin2;
        bvin bvin3;
        if (!cfoj.m141567q() || ahsu == null || !ahsu.mo37077d()) {
            if (ahsu != null) {
                list = Collections.singletonList(ahsu);
            } else {
                list = null;
            }
            m56462a(bvin, list, num, str, (Integer) null);
            return;
        }
        String o = ahsu.mo37090o();
        bvin bvin4 = bvin.UNKNOWN_DISCOVERY_EVENT;
        int ordinal = bvin.ordinal();
        if (ordinal == 9) {
            bvin3 = o == null ? bvin.FAST_PAIR_NOTIFICATION_CLICKED : bvin.FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_CLICKED;
        } else if (ordinal != 52) {
            bvin2 = bvin;
            mo37019a(bvin2, ahsu.mo37060G(), ahsu.mo37088m(), 0);
        } else {
            bvin3 = bvin.FAST_PAIR_AUTO_LAUNCH_TRIGGERED;
        }
        bvin2 = bvin3;
        mo37019a(bvin2, ahsu.mo37060G(), ahsu.mo37088m(), 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byvp mo37010a(ahsu ahsu) {
        int i;
        int i2;
        bxvd da = byvp.f168473n.mo74144da();
        String i3 = ahsu.mo37084i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvp byvp = (byvp) da.f164949b;
        i3.getClass();
        byvp.f168475a |= 1;
        byvp.f168476b = i3;
        if (!ahsu.mo37081g()) {
            i = 2;
        } else {
            i = 3;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvp byvp2 = (byvp) da.f164949b;
        byvp2.f168479e = i - 1;
        byvp2.f168475a |= 16;
        String G = ahsu.mo37060G();
        if (G != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byvp byvp3 = (byvp) da.f164949b;
            G.getClass();
            byvp3.f168475a |= 128;
            byvp3.f168482h = G;
        }
        String t = ahsu.mo37095t();
        if (t != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byvp byvp4 = (byvp) da.f164949b;
            t.getClass();
            byvp4.f168475a |= 8;
            byvp4.f168478d = t;
        }
        bzbk j = ahsu.mo37085j();
        if (j != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byvp byvp5 = (byvp) da.f164949b;
            byvp5.f168477c = j.f169257h;
            byvp5.f168475a |= 2;
        }
        Integer u = ahsu.mo37097u();
        if (u != null) {
            int intValue = u.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byvp byvp6 = (byvp) da.f164949b;
            byvp6.f168475a |= 32;
            byvp6.f168480f = intValue;
        }
        Integer w = ahsu.mo37099w();
        if (w != null) {
            int intValue2 = w.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byvp byvp7 = (byvp) da.f164949b;
            byvp7.f168475a |= 64;
            byvp7.f168481g = intValue2;
        }
        bzar a = bzar.m125589a(ahsu.f67969b.f68533u);
        if (a == null) {
            a = bzar.DISCOVERY_ATTACHMENT_TYPE_UNKNOWN;
        }
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byvp byvp8 = (byvp) da.f164949b;
            byvp8.f168483i = a.f169225d;
            byvp8.f168475a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        Double z = ahsu.mo37102z();
        if (z != null) {
            double doubleValue = z.doubleValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byvp byvp9 = (byvp) da.f164949b;
            byvp9.f168475a |= 512;
            byvp9.f168484j = doubleValue;
        }
        Long b = mo72977b(ahsu.mo37088m());
        if (b != null) {
            long longValue = b.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byvp byvp10 = (byvp) da.f164949b;
            byvp10.f168475a |= 1024;
            byvp10.f168485k = longValue;
        }
        String G2 = ahsu.mo37085j() == bzbk.NEARBY_DEVICE ? ahsu.mo37060G() : null;
        if (G2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byvp byvp11 = (byvp) da.f164949b;
            G2.getClass();
            byvp11.f168475a |= 2048;
            byvp11.f168486l = G2;
        }
        if (!this.f67939b.mo73038b()) {
            i2 = ahfz.m55679a();
        } else {
            i2 = 6;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvp byvp12 = (byvp) da.f164949b;
        byvp12.f168487m = i2 - 1;
        byvp12.f168475a |= 4096;
        return (byvp) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo37011a(bvin bvin) {
        mo37013a(bvin, (ahsu) null, (Integer) null);
    }

    /* renamed from: a */
    public final void mo37012a(bvin bvin, ahsu ahsu) {
        mo37013a(bvin, ahsu, (Integer) null);
    }

    /* renamed from: a */
    public final void mo37013a(bvin bvin, ahsu ahsu, Integer num) {
        List list;
        long j;
        bvin bvin2;
        bvin bvin3;
        if (!cfoj.m141567q() || ahsu == null || !ahsu.mo37077d()) {
            if (ahsu != null) {
                list = Collections.singletonList(ahsu);
            } else {
                list = null;
            }
            mo37022a(bvin, list, num);
            return;
        }
        String o = ahsu.mo37090o();
        bvin bvin4 = bvin.UNKNOWN_DISCOVERY_EVENT;
        int ordinal = bvin.ordinal();
        long j2 = 0;
        if (ordinal == 3) {
            if (o == null) {
                bvin3 = bvin.FAST_PAIR_NOTIFICATION_SHOWN;
            } else {
                bvin3 = bvin.FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_SHOWN;
            }
            if (ahsu.mo37100x() != null) {
                j2 = this.f67941d.mo20505a() - ahsu.mo37100x().longValue();
            }
        } else if (ordinal == 4) {
            bvin3 = o == null ? bvin.FAST_PAIR_NOTIFICATION_TIMEOUT : bvin.FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_TIMEOUT;
        } else if (ordinal == 10) {
            bvin3 = o == null ? bvin.FAST_PAIR_NOTIFICATION_DISMISSED : bvin.FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_DISMISSED;
        } else if (ordinal != 55) {
            bvin2 = bvin;
            j = 0;
            mo37019a(bvin2, ahsu.mo37060G(), ahsu.mo37088m(), j);
        } else {
            bvin3 = o == null ? bvin.FAST_PAIR_NOTIFICATION_DO_NOT_SHOW_CLICKED : bvin.FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_DO_NOT_SHOW_CLICKED;
        }
        bvin2 = bvin3;
        j = j2;
        mo37019a(bvin2, ahsu.mo37060G(), ahsu.mo37088m(), j);
    }

    /* renamed from: a */
    public final void mo37014a(bvin bvin, ahsu ahsu, String str, Integer num) {
        List list;
        if (ahsu != null) {
            list = Collections.singletonList(ahsu);
        } else {
            list = null;
        }
        m56462a(bvin, list, (Integer) null, str, num);
    }

    /* renamed from: a */
    public final void mo37015a(bvin bvin, String str, double d, String str2, int i) {
        if (!cfoj.m141567q()) {
            mo37011a(bvin);
            return;
        }
        bxvd da = byvt.f168503i.mo74144da();
        int a = m56461a(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvt byvt = (byvt) da.f164949b;
        int i2 = 1;
        int i3 = byvt.f168505a | 1;
        byvt.f168505a = i3;
        byvt.f168506b = a;
        byvt.f168505a = i3 | 8;
        byvt.f168509e = d;
        long longValue = mo72977b(str2).longValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvt byvt2 = (byvt) da.f164949b;
        int i4 = byvt2.f168505a | 16;
        byvt2.f168505a = i4;
        byvt2.f168510f = longValue;
        if (i == -1) {
            i2 = 2;
        } else if (i == 0) {
            i2 = 3;
        } else if (i == 1) {
            i2 = 4;
        } else if (i == 2) {
            i2 = 5;
        }
        byvt2.f168511g = i2 - 1;
        byvt2.f168505a = i4 | 32;
        byvt byvt3 = (byvt) da.mo74062i();
        bxvd b = mo37024b(bvin);
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bywl bywl = (bywl) b.f164949b;
        bywl bywl2 = bywl.f168591u;
        byvt3.getClass();
        bywl.f168606n = byvt3;
        bywl.f168593a |= 8192;
        mo37023a((bywl) b.mo74062i());
    }

    /* renamed from: a */
    public final void mo37016a(bvin bvin, String str, long j) {
        if (!cfoj.m141567q()) {
            mo37011a(bvin);
            return;
        }
        bxvd da = byvv.f168518d.mo74144da();
        int a = m56461a(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvv byvv = (byvv) da.f164949b;
        int i = byvv.f168520a | 1;
        byvv.f168520a = i;
        byvv.f168521b = a;
        byvv.f168520a = i | 2;
        byvv.f168522c = j;
        byvv byvv2 = (byvv) da.mo74062i();
        bxvd b = mo37024b(bvin);
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bywl bywl = (bywl) b.f164949b;
        bywl bywl2 = bywl.f168591u;
        byvv2.getClass();
        bywl.f168607o = byvv2;
        bywl.f168593a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        mo37023a((bywl) b.mo74062i());
    }

    /* renamed from: a */
    public final void mo37017a(bvin bvin, String str, bzau bzau, int i) {
        if (!cfoj.m141567q()) {
            mo37011a(bvin);
            return;
        }
        bxvd b = mo37024b(bvin);
        bxvd da = byvw.f168523e.mo74144da();
        int a = m56461a(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvw byvw = (byvw) da.f164949b;
        int i2 = byvw.f168525a | 1;
        byvw.f168525a = i2;
        byvw.f168526b = a;
        byvw.f168527c = bzau.f169233e;
        int i3 = i2 | 2;
        byvw.f168525a = i3;
        byvw.f168525a = i3 | 4;
        byvw.f168528d = i;
        byvw byvw2 = (byvw) da.mo74062i();
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bywl bywl = (bywl) b.f164949b;
        bywl bywl2 = bywl.f168591u;
        byvw2.getClass();
        bywl.f168611s = byvw2;
        bywl.f168593a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        mo37023a((bywl) b.mo74062i());
    }

    /* renamed from: a */
    public final void mo37018a(bvin bvin, String str, String str2) {
        if (!cfoj.m141567q()) {
            mo37011a(bvin);
            return;
        }
        bxvd b = mo37024b(bvin);
        bxvd da = byvu.f168513d.mo74144da();
        int a = m56461a(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvu byvu = (byvu) da.f164949b;
        int i = byvu.f168515a | 1;
        byvu.f168515a = i;
        byvu.f168516b = a;
        str2.getClass();
        byvu.f168515a = i | 2;
        byvu.f168517c = str2;
        byvu byvu2 = (byvu) da.mo74062i();
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bywl bywl = (bywl) b.f164949b;
        bywl bywl2 = bywl.f168591u;
        byvu2.getClass();
        bywl.f168609q = byvu2;
        bywl.f168593a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        mo37023a((bywl) b.mo74062i());
    }

    /* renamed from: a */
    public final void mo37019a(bvin bvin, String str, String str2, long j) {
        if (!cfoj.m141567q()) {
            mo37011a(bvin);
            return;
        }
        bxvd da = byvx.f168529e.mo74144da();
        int a = m56461a(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvx byvx = (byvx) da.f164949b;
        byvx.f168531a |= 1;
        byvx.f168532b = a;
        long longValue = mo72977b(str2).longValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvx byvx2 = (byvx) da.f164949b;
        int i = byvx2.f168531a | 2;
        byvx2.f168531a = i;
        byvx2.f168533c = longValue;
        byvx2.f168531a = i | 4;
        byvx2.f168534d = j;
        byvx byvx3 = (byvx) da.mo74062i();
        bxvd b = mo37024b(bvin);
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bywl bywl = (bywl) b.f164949b;
        bywl bywl2 = bywl.f168591u;
        byvx3.getClass();
        bywl.f168608p = byvx3;
        bywl.f168593a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        mo37023a((bywl) b.mo74062i());
    }

    /* renamed from: a */
    public final void mo37020a(bvin bvin, String str, String str2, long j, int i) {
        if (!cfoj.m141567q()) {
            mo37011a(bvin);
            return;
        }
        bxvd b = mo37024b(bvin);
        bxvd da = byvs.f168496f.mo74144da();
        int a = m56461a(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvs byvs = (byvs) da.f164949b;
        byvs.f168498a |= 1;
        byvs.f168499b = a;
        long longValue = mo72977b(str2).longValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvs byvs2 = (byvs) da.f164949b;
        int i2 = byvs2.f168498a | 2;
        byvs2.f168498a = i2;
        byvs2.f168500c = longValue;
        int i3 = i2 | 4;
        byvs2.f168498a = i3;
        byvs2.f168501d = j;
        byvs2.f168498a = i3 | 8;
        byvs2.f168502e = i;
        byvs byvs3 = (byvs) da.mo74062i();
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bywl bywl = (bywl) b.f164949b;
        bywl bywl2 = bywl.f168591u;
        byvs3.getClass();
        bywl.f168612t = byvs3;
        bywl.f168593a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        mo37023a((bywl) b.mo74062i());
    }

    /* renamed from: a */
    public final void mo37021a(bvin bvin, List list) {
        m56462a(bvin, list, (Integer) null, (String) null, (Integer) null);
    }

    /* renamed from: a */
    public final void mo37022a(bvin bvin, List list, Integer num) {
        m56462a(bvin, list, num, (String) null, (Integer) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buqb.a(byvm, boolean):void
     arg types: [byvm, int]
     candidates:
      ahsi.a(bvin, ahsu):void
      ahsi.a(bvin, java.util.List):void
      buqb.a(int, ahcv):void
      buqb.a(int, ahcy):void
      buqb.a(byvm, boolean):void */
    /* renamed from: a */
    public final void mo37023a(bywl bywl) {
        if (!cfos.m141988b() || !((bnsl) ahsd.f67925a.mo68390d()).mo68447l()) {
            srn srn = ahsd.f67925a;
        } else {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("DiscoveryLogger log %s", ahsd.m56457a(bywl));
        }
        byvm a = buqb.m120220a((String) null, (String) null, 9);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        byvm byvm = (byvm) bxvd.f164949b;
        byvm byvm2 = byvm.f168451k;
        bywl.getClass();
        byvm.f168461i = bywl;
        byvm.f168453a |= 512;
        mo72974a((byvm) bxvd.mo74062i(), false);
    }
}
