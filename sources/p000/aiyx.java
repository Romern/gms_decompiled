package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: aiyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiyx extends buqb {

    /* renamed from: a */
    public final List f70115a = new ArrayList();

    /* renamed from: b */
    public final List f70116b = new ArrayList();

    /* renamed from: c */
    public final List f70117c = new ArrayList();

    /* renamed from: d */
    public final ajat f70118d;

    /* renamed from: e */
    public final buqh f70119e;

    /* renamed from: g */
    private final Set f70120g = new HashSet();

    public aiyx(Context context) {
        super(context);
        this.f70118d = (ajat) ahgz.m55754a(context, ajat.class);
        this.f70119e = (buqh) ahgz.m55754a(context, buqh.class);
    }

    /* renamed from: a */
    private final bywt m58245a(ClientAppIdentifier clientAppIdentifier) {
        bxvd da = bywt.f168658e.mo74144da();
        String str = clientAppIdentifier.f80668c.f80723b;
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bywt bywt = (bywt) da.f164949b;
            str.getClass();
            bywt.f168660a |= 1;
            bywt.f168661b = str;
        }
        if (clientAppIdentifier.mo44293b()) {
            return (bywt) da.mo74062i();
        }
        try {
            PackageInfo packageInfo = this.f154698f.getPackageManager().getPackageInfo(clientAppIdentifier.f80668c.f80723b, 64);
            long j = (long) packageInfo.versionCode;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bywt bywt2 = (bywt) da.f164949b;
            bywt2.f168660a |= 4;
            bywt2.f168663d = j;
            if (packageInfo.versionName != null) {
                String str2 = packageInfo.versionName;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bywt bywt3 = (bywt) da.f164949b;
                str2.getClass();
                bywt3.f168660a |= 2;
                bywt3.f168662c = str2;
            }
        } catch (PackageManager.NameNotFoundException e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("aiyx", "a", 583, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("%s Failed to find package for %s", "CopresenceLogger: ", clientAppIdentifier.f80668c.f80723b);
        }
        return (bywt) da.mo74062i();
    }

    /* renamed from: c */
    private final int m58249c(bxxc bxxc) {
        for (int i = 0; i < this.f70115a.size(); i++) {
            if (((bxxc) this.f70115a.get(i)).equals(bxxc)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final byvm mo38321b(ClientAppIdentifier clientAppIdentifier, bxxc bxxc, int i) {
        return mo38313a(clientAppIdentifier, bxxc, null, i, null);
    }

    /* renamed from: b */
    public final void mo38322b(bxxc bxxc) {
        int c = m58249c(bxxc);
        if (c >= 0) {
            mo38314a(c);
        }
    }

    /* renamed from: a */
    private static bywz m58246a(byze byze) {
        if (byze == null) {
            return null;
        }
        bxvd da = bywz.f168689d.mo74144da();
        byzh byzh = byze.f169067b;
        if (byzh == null) {
            byzh = byzh.f169078d;
        }
        byxb a = m58247a(byzh);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bywz bywz = (bywz) da.f164949b;
        a.getClass();
        bywz.f168692b = a;
        bywz.f168691a |= 1;
        return (bywz) da.mo74062i();
    }

    /* renamed from: a */
    private static byxb m58247a(byzh byzh) {
        if (byzh == null) {
            return null;
        }
        bxvd da = byxb.f168698d.mo74144da();
        String str = byzh.f169082c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byxb byxb = (byxb) da.f164949b;
        str.getClass();
        byxb.f168700a |= 2;
        byxb.f168702c = str;
        return (byxb) da.mo74062i();
    }

    /* renamed from: a */
    private static final byxd m58248a(bzcj bzcj) {
        Long l;
        bxvd da = byxd.f168710e.mo74144da();
        if ((bzcj.f169338a & 2) != 0) {
            bzcd bzcd = bzcj.f169340c;
            if (bzcd == null) {
                bzcd = bzcd.f169301c;
            }
            bxvd da2 = bywv.f168671c.mo74144da();
            bxwc bxwc = bzcd.f169304b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bywv bywv = (bywv) da2.f164949b;
            if (!bywv.f168674b.mo73666a()) {
                bywv.f168674b = GeneratedMessageLite.m124021a(bywv.f168674b);
            }
            bxsy.m123078a(bxwc, bywv.f168674b);
            int size = bzcd.f169303a.size();
            for (int i = 0; i < size; i++) {
                bxvd da3 = byxc.f168703f.mo74144da();
                byzk byzk = (byzk) bzcd.f169303a.get(i);
                String str = byzk.f169114b;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                byxc byxc = (byxc) da3.f164949b;
                str.getClass();
                byxc.f168705a |= 1;
                byxc.f168706b = str;
                if ((byzk.f169113a & 8) != 0) {
                    bxvd da4 = byxo.f168769e.mo74144da();
                    byzw byzw = byzk.f169117e;
                    if (byzw == null) {
                        byzw = byzw.f169185e;
                    }
                    int a = bzaf.m125576a(byzw.f169188b);
                    if (a == 0) {
                        a = 1;
                    }
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    byxo byxo = (byxo) da4.f164949b;
                    byxo.f168772b = a - 1;
                    byxo.f168771a |= 1;
                    byzw byzw2 = byzk.f169117e;
                    if (byzw2 == null) {
                        byzw2 = byzw.f169185e;
                    }
                    int a2 = bzan.m125585a(byzw2.f169189c);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    byxo byxo2 = (byxo) da4.f164949b;
                    byxo2.f168773c = a2 - 1;
                    int i2 = byxo2.f168771a | 2;
                    byxo2.f168771a = i2;
                    byzw byzw3 = byzk.f169117e;
                    byxo2.f168774d = 0;
                    byxo2.f168771a = i2 | 4;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    byxc byxc2 = (byxc) da3.f164949b;
                    byxo byxo3 = (byxo) da4.mo74062i();
                    byxo3.getClass();
                    byxc2.f168709e = byxo3;
                    byxc2.f168705a |= 8;
                }
                if ((byzk.f169113a & 2) != 0) {
                    bxvd da5 = bywr.f168649d.mo74144da();
                    byyp byyp = byzk.f169115c;
                    if (byyp == null) {
                        byyp = byyp.f168984e;
                    }
                    long j = byyp.f168987b;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bywr bywr = (bywr) da5.f164949b;
                    bywr.f168651a |= 1;
                    bywr.f168652b = j;
                    byyp byyp2 = byzk.f169115c;
                    if (byyp2 == null) {
                        byyp2 = byyp.f168984e;
                    }
                    if ((byyp2.f168986a & 2) != 0) {
                        bxvd da6 = byws.f168654c.mo74144da();
                        byyp byyp3 = byzk.f169115c;
                        if (byyp3 == null) {
                            byyp3 = byyp.f168984e;
                        }
                        byyq byyq = byyp3.f168988c;
                        if (byyq == null) {
                            byyq = byyq.f168991c;
                        }
                        int a3 = bzad.m125574a(byyq.f168994b);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        byws byws = (byws) da6.f164949b;
                        byws.f168657b = a3 - 1;
                        byws.f168656a |= 1;
                        byws byws2 = (byws) da6.mo74062i();
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bywr bywr2 = (bywr) da5.f164949b;
                        byws2.getClass();
                        bywr2.f168653c = byws2;
                        bywr2.f168651a |= 2;
                    }
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    byxc byxc3 = (byxc) da3.f164949b;
                    bywr bywr3 = (bywr) da5.mo74062i();
                    bywr3.getClass();
                    byxc3.f168707c = bywr3;
                    byxc3.f168705a |= 2;
                }
                byze byze = byzk.f169116d;
                if (byze == null) {
                    byze = byze.f169064e;
                }
                bywz a4 = m58246a(byze);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                byxc byxc4 = (byxc) da3.f164949b;
                a4.getClass();
                byxc4.f168708d = a4;
                byxc4.f168705a |= 4;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bywv bywv2 = (bywv) da2.f164949b;
                byxc byxc5 = (byxc) da3.mo74062i();
                byxc5.getClass();
                if (!bywv2.f168673a.mo73666a()) {
                    bywv2.f168673a = GeneratedMessageLite.m124021a(bywv2.f168673a);
                }
                bywv2.f168673a.add(byxc5);
            }
            bywv bywv3 = (bywv) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byxd byxd = (byxd) da.f164949b;
            bywv3.getClass();
            byxd.f168713b = bywv3;
            byxd.f168712a |= 1;
        }
        if ((bzcj.f169338a & 4) != 0) {
            bzcf bzcf = bzcj.f169341d;
            if (bzcf == null) {
                bzcf = bzcf.f169312c;
            }
            bxvd da7 = bywx.f168680c.mo74144da();
            bxwc bxwc2 = bzcf.f169315b;
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bywx bywx = (bywx) da7.f164949b;
            if (!bywx.f168683b.mo73666a()) {
                bywx.f168683b = GeneratedMessageLite.m124021a(bywx.f168683b);
            }
            bxsy.m123078a(bxwc2, bywx.f168683b);
            int size2 = bzcf.f169314a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                bxvd da8 = byxl.f168753f.mo74144da();
                byzs byzs = (byzs) bzcf.f169314a.get(i3);
                String str2 = byzs.f169163b;
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                byxl byxl = (byxl) da8.f164949b;
                str2.getClass();
                byxl.f168755a |= 1;
                byxl.f168756b = str2;
                if ((byzs.f169162a & 16) != 0) {
                    bxvd da9 = byxo.f168769e.mo74144da();
                    byzw byzw4 = byzs.f169166e;
                    if (byzw4 == null) {
                        byzw4 = byzw.f169185e;
                    }
                    int a5 = bzaf.m125576a(byzw4.f169188b);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    if (da9.f164950c) {
                        da9.mo74035c();
                        da9.f164950c = false;
                    }
                    byxo byxo4 = (byxo) da9.f164949b;
                    byxo4.f168772b = a5 - 1;
                    byxo4.f168771a |= 1;
                    byzw byzw5 = byzs.f169166e;
                    if (byzw5 == null) {
                        byzw5 = byzw.f169185e;
                    }
                    int a6 = bzan.m125585a(byzw5.f169189c);
                    if (a6 == 0) {
                        a6 = 1;
                    }
                    if (da9.f164950c) {
                        da9.mo74035c();
                        da9.f164950c = false;
                    }
                    byxo byxo5 = (byxo) da9.f164949b;
                    byxo5.f168773c = a6 - 1;
                    byxo5.f168771a |= 2;
                    if (da8.f164950c) {
                        da8.mo74035c();
                        da8.f164950c = false;
                    }
                    byxl byxl2 = (byxl) da8.f164949b;
                    byxo byxo6 = (byxo) da9.mo74062i();
                    byxo6.getClass();
                    byxl2.f168759e = byxo6;
                    byxl2.f168755a |= 8;
                }
                if ((byzs.f169162a & 2) != 0) {
                    l = Long.valueOf(byzs.f169164c);
                } else {
                    l = null;
                }
                if (l != null) {
                    long longValue = l.longValue();
                    if (da8.f164950c) {
                        da8.mo74035c();
                        da8.f164950c = false;
                    }
                    byxl byxl3 = (byxl) da8.f164949b;
                    byxl3.f168755a |= 2;
                    byxl3.f168757c = longValue;
                }
                byzh byzh = byzs.f169165d;
                if (byzh == null) {
                    byzh = byzh.f169078d;
                }
                byxb a7 = m58247a(byzh);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                byxl byxl4 = (byxl) da8.f164949b;
                a7.getClass();
                byxl4.f168758d = a7;
                byxl4.f168755a |= 4;
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bywx bywx2 = (bywx) da7.f164949b;
                byxl byxl5 = (byxl) da8.mo74062i();
                byxl5.getClass();
                if (!bywx2.f168682a.mo73666a()) {
                    bywx2.f168682a = GeneratedMessageLite.m124021a(bywx2.f168682a);
                }
                bywx2.f168682a.add(byxl5);
            }
            bywx bywx3 = (bywx) da7.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byxd byxd2 = (byxd) da.f164949b;
            bywx3.getClass();
            byxd2.f168714c = bywx3;
            byxd2.f168712a |= 2;
        }
        if ((bzcj.f169338a & 8) != 0) {
            bzcn bzcn = bzcj.f169342e;
            if (bzcn == null) {
                bzcn = bzcn.f169375h;
            }
            bxvd da10 = byxr.f168783b.mo74144da();
            for (int i4 = 0; i4 < bzcn.f169378b.size(); i4++) {
                bxvd da11 = byxp.f168775b.mo74144da();
                byzy byzy = (byzy) bzcn.f169378b.get(i4);
                int size3 = byzy.f169195c.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byzz byzz = (byzz) byzy.f169195c.get(i5);
                    bxvd da12 = byxq.f168778d.mo74144da();
                    bzbu a8 = bzbu.m125627a(byzz.f169199b);
                    if (a8 == null) {
                        a8 = bzbu.TOKEN_MEDIUM_UNKNOWN;
                    }
                    if (da12.f164950c) {
                        da12.mo74035c();
                        da12.f164950c = false;
                    }
                    byxq byxq = (byxq) da12.f164949b;
                    byxq.f168781b = a8.f169275k;
                    int i6 = byxq.f168780a | 1;
                    byxq.f168780a = i6;
                    if ((byzz.f169198a & 2) != 0) {
                        int i7 = byzz.f169200c;
                        byxq.f168780a = i6 | 2;
                        byxq.f168782c = i7;
                    }
                    if (da11.f164950c) {
                        da11.mo74035c();
                        da11.f164950c = false;
                    }
                    byxp byxp = (byxp) da11.f164949b;
                    byxq byxq2 = (byxq) da12.mo74062i();
                    byxq2.getClass();
                    if (!byxp.f168777a.mo73666a()) {
                        byxp.f168777a = GeneratedMessageLite.m124021a(byxp.f168777a);
                    }
                    byxp.f168777a.add(byxq2);
                }
                if (da10.f164950c) {
                    da10.mo74035c();
                    da10.f164950c = false;
                }
                byxr byxr = (byxr) da10.f164949b;
                byxp byxp2 = (byxp) da11.mo74062i();
                byxp2.getClass();
                if (!byxr.f168785a.mo73666a()) {
                    byxr.f168785a = GeneratedMessageLite.m124021a(byxr.f168785a);
                }
                byxr.f168785a.add(byxp2);
            }
            byxr byxr2 = (byxr) da10.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byxd byxd3 = (byxd) da.f164949b;
            byxr2.getClass();
            byxd3.f168715d = byxr2;
            byxd3.f168712a |= 4;
        }
        return (byxd) da.mo74062i();
    }

    /* renamed from: a */
    public final long mo38312a(bxxc bxxc) {
        int c = m58249c(bxxc);
        if (c >= 0) {
            return SystemClock.elapsedRealtime() - ((Long) this.f70117c.get(c)).longValue();
        }
        return -1;
    }

    /* renamed from: a */
    public final byvm mo38313a(ClientAppIdentifier clientAppIdentifier, bxxc bxxc, bxxc bxxc2, int i, Set set) {
        bywt bywt;
        ClientAppIdentifier clientAppIdentifier2 = clientAppIdentifier;
        bxxc bxxc3 = bxxc;
        Set set2 = set;
        this.f70119e.mo72984b();
        byxi byxi = null;
        if (!(bxxc3 instanceof bzcj)) {
            return null;
        }
        bxvd da = bywp.f168633h.mo74144da();
        boolean z = false;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bywp bywp = (bywp) da.f164949b;
        int i2 = 1;
        bywp.f168636b = 1;
        bywp.f168635a |= 1;
        bxvd da2 = byxf.f168722d.mo74144da();
        this.f70119e.mo72984b();
        this.f70119e.mo72984b();
        bxvd da3 = byxg.f168727g.mo74144da();
        this.f70119e.mo72984b();
        String a = ((aiws) ahgz.m55754a(this.f154698f, aiws.class)).f69959b.mo38180a();
        if (a != null) {
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            byxg byxg = (byxg) da3.f164949b;
            a.getClass();
            byxg.f168729a |= 8;
            byxg.f168732d = a;
        }
        if (a != null) {
            String substring = a.substring(0, Math.min(a.length(), 3));
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            byxg byxg2 = (byxg) da3.f164949b;
            substring.getClass();
            byxg2.f168729a |= 16;
            byxg2.f168733e = substring;
        }
        bxvd da4 = bywt.f168658e.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bywt bywt2 = (bywt) da4.f164949b;
        "com.google.android.gms".getClass();
        bywt2.f168660a |= 1;
        bywt2.f168661b = "com.google.android.gms";
        long b = (long) stu.m36316b();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bywt bywt3 = (bywt) da4.f164949b;
        bywt3.f168660a |= 4;
        bywt3.f168663d = b;
        String a2 = stu.m36315a();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bywt bywt4 = (bywt) da4.f164949b;
        a2.getClass();
        bywt4.f168660a |= 2;
        bywt4.f168662c = a2;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        byxg byxg3 = (byxg) da3.f164949b;
        bywt bywt5 = (bywt) da4.mo74062i();
        bywt5.getClass();
        byxg3.f168731c = bywt5;
        byxg3.f168729a |= 2;
        bxvd da5 = bywt.f168658e.mo74144da();
        String str = clientAppIdentifier2.f80668c.f80723b;
        if (str != null) {
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bywt bywt6 = (bywt) da5.f164949b;
            str.getClass();
            bywt6.f168660a |= 1;
            bywt6.f168661b = str;
        }
        if (clientAppIdentifier.mo44293b()) {
            bywt = (bywt) da5.mo74062i();
        } else {
            try {
                PackageInfo packageInfo = this.f154698f.getPackageManager().getPackageInfo(clientAppIdentifier2.f80668c.f80723b, 64);
                long j = (long) packageInfo.versionCode;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bywt bywt7 = (bywt) da5.f164949b;
                bywt7.f168660a |= 4;
                bywt7.f168663d = j;
                if (packageInfo.versionName != null) {
                    String str2 = packageInfo.versionName;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bywt bywt8 = (bywt) da5.f164949b;
                    str2.getClass();
                    bywt8.f168660a |= 2;
                    bywt8.f168662c = str2;
                }
            } catch (PackageManager.NameNotFoundException e) {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                bnsl.mo68432a("aiyx", "a", 583, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("%s Failed to find package for %s", "CopresenceLogger: ", clientAppIdentifier2.f80668c.f80723b);
            }
            bywt = (bywt) da5.mo74062i();
        }
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        byxg byxg4 = (byxg) da3.f164949b;
        bywt.getClass();
        byxg4.f168730b = bywt;
        byxg4.f168729a |= 1;
        bxvd da6 = bywu.f168664f.mo74144da();
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bywu bywu = (bywu) da6.f164949b;
        bywu.f168669d = 6;
        bywu.f168666a |= 4;
        String str3 = Build.MANUFACTURER;
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bywu bywu2 = (bywu) da6.f164949b;
        str3.getClass();
        bywu2.f168666a |= 1;
        bywu2.f168667b = str3;
        String str4 = Build.MODEL;
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bywu bywu3 = (bywu) da6.f164949b;
        str4.getClass();
        bywu3.f168666a |= 2;
        bywu3.f168668c = str4;
        String str5 = Build.VERSION.RELEASE;
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bywu bywu4 = (bywu) da6.f164949b;
        str5.getClass();
        bywu4.f168666a |= 8;
        bywu4.f168670e = str5;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        byxg byxg5 = (byxg) da3.f164949b;
        bywu bywu5 = (bywu) da6.mo74062i();
        bywu5.getClass();
        byxg5.f168734f = bywu5;
        byxg5.f168729a |= 32;
        byxg byxg6 = (byxg) da3.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byxf byxf = (byxf) da2.f164949b;
        byxg6.getClass();
        byxf.f168725b = byxg6;
        byxf.f168724a |= 1;
        byxd a3 = m58248a((bzcj) bxxc3);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byxf byxf2 = (byxf) da2.f164949b;
        a3.getClass();
        byxf2.f168726c = a3;
        byxf2.f168724a |= 8;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bywp bywp2 = (bywp) da.f164949b;
        byxf byxf3 = (byxf) da2.mo74062i();
        byxf3.getClass();
        bywp2.f168639e = byxf3;
        bywp2.f168635a |= 8;
        long a4 = mo38312a(bxxc3);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bywp bywp3 = (bywp) da.f164949b;
        int i3 = bywp3.f168635a | 4;
        bywp3.f168635a = i3;
        bywp3.f168638d = a4;
        bywp3.f168635a = i3 | 2;
        bywp3.f168637c = i;
        if (bxxc2 != null) {
            bxvd da7 = byxh.f168735d.mo74144da();
            bzck bzck = (bzck) bxxc2;
            bzcm bzcm = bzck.f169349b;
            if (bzcm == null) {
                bzcm = bzcm.f169369d;
            }
            if (bzcm != null) {
                bxvd da8 = byxi.f168740c.mo74144da();
                if ((bzcm.f169371a & 2) != 0) {
                    bxvd da9 = byxj.f168744c.mo74144da();
                    byzq byzq = bzcm.f169372b;
                    if (byzq == null) {
                        byzq = byzq.f169146b;
                    }
                    int a5 = bzbq.m125623a(byzq.f169148a);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    if (da9.f164950c) {
                        da9.mo74035c();
                        da9.f164950c = false;
                    }
                    byxj byxj = (byxj) da9.f164949b;
                    byxj.f168747b = a5 - 2;
                    byxj.f168746a |= 1;
                    if (da8.f164950c) {
                        da8.mo74035c();
                        da8.f164950c = false;
                    }
                    byxi byxi2 = (byxi) da8.f164949b;
                    byxj byxj2 = (byxj) da9.mo74062i();
                    byxj2.getClass();
                    byxi2.f168743b = byxj2;
                    byxi2.f168742a |= 1;
                }
                byxi = (byxi) da8.mo74062i();
            }
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            byxh byxh = (byxh) da7.f164949b;
            byxi.getClass();
            byxh.f168738b = byxi;
            byxh.f168737a |= 1;
            bxvd da10 = byxe.f168716e.mo74144da();
            if ((bzck.f169348a & 2) != 0) {
                bxvd da11 = byww.f168675d.mo74144da();
                bzce bzce = bzck.f169350c;
                if (bzce == null) {
                    bzce = bzce.f169306c;
                }
                bxbf a6 = bxbf.m122514a(bzce.f169308a);
                if (a6 == null) {
                    a6 = bxbf.OK;
                }
                int i4 = a6.f161807s;
                if (da11.f164950c) {
                    da11.mo74035c();
                    da11.f164950c = false;
                }
                byww byww = (byww) da11.f164949b;
                byww.f168677a |= 1;
                byww.f168678b = i4;
                int size = bzce.f169309b.size();
                for (int i5 = 0; i5 < size; i5++) {
                    bxvd da12 = byxa.f168694c.mo74144da();
                    String str6 = ((byzg) bzce.f169309b.get(i5)).f169076a;
                    if (da12.f164950c) {
                        da12.mo74035c();
                        da12.f164950c = false;
                    }
                    byxa byxa = (byxa) da12.f164949b;
                    str6.getClass();
                    byxa.f168696a |= 1;
                    byxa.f168697b = str6;
                    if (da11.f164950c) {
                        da11.mo74035c();
                        da11.f164950c = false;
                    }
                    byww byww2 = (byww) da11.f164949b;
                    byxa byxa2 = (byxa) da12.mo74062i();
                    byxa2.getClass();
                    if (!byww2.f168679c.mo73666a()) {
                        byww2.f168679c = GeneratedMessageLite.m124021a(byww2.f168679c);
                    }
                    byww2.f168679c.add(i5, byxa2);
                }
                if (da10.f164950c) {
                    da10.mo74035c();
                    da10.f164950c = false;
                }
                byxe byxe = (byxe) da10.f164949b;
                byww byww3 = (byww) da11.mo74062i();
                byww3.getClass();
                byxe.f168719b = byww3;
                byxe.f168718a |= 1;
            }
            if ((bzck.f169348a & 4) != 0) {
                bzcg bzcg = bzck.f169351d;
                if (bzcg == null) {
                    bzcg = bzcg.f169317c;
                }
                bxvd da13 = bywy.f168684d.mo74144da();
                bxbf a7 = bxbf.m122514a(bzcg.f169319a);
                if (a7 == null) {
                    a7 = bxbf.OK;
                }
                int i6 = a7.f161807s;
                if (da13.f164950c) {
                    da13.mo74035c();
                    da13.f164950c = false;
                }
                bywy bywy = (bywy) da13.f164949b;
                bywy.f168686a |= 1;
                bywy.f168687b = i6;
                int size2 = bzcg.f169320b.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    bxvd da14 = byxm.f168760c.mo74144da();
                    String str7 = ((byzt) bzcg.f169320b.get(i7)).f169173a;
                    if (da14.f164950c) {
                        da14.mo74035c();
                        da14.f164950c = false;
                    }
                    byxm byxm = (byxm) da14.f164949b;
                    str7.getClass();
                    byxm.f168762a |= 1;
                    byxm.f168763b = str7;
                    if (da13.f164950c) {
                        da13.mo74035c();
                        da13.f164950c = false;
                    }
                    bywy bywy2 = (bywy) da13.f164949b;
                    byxm byxm2 = (byxm) da14.mo74062i();
                    byxm2.getClass();
                    if (!bywy2.f168688c.mo73666a()) {
                        bywy2.f168688c = GeneratedMessageLite.m124021a(bywy2.f168688c);
                    }
                    bywy2.f168688c.add(byxm2);
                }
                if (da10.f164950c) {
                    da10.mo74035c();
                    da10.f164950c = false;
                }
                byxe byxe2 = (byxe) da10.f164949b;
                bywy bywy3 = (bywy) da13.mo74062i();
                bywy3.getClass();
                byxe2.f168720c = bywy3;
                byxe2.f168718a |= 2;
            }
            if ((bzck.f169348a & 8) != 0) {
                bzco bzco = bzck.f169352e;
                if (bzco == null) {
                    bzco = bzco.f169385f;
                }
                bxvd da15 = byxs.f168786e.mo74144da();
                bxbf a8 = bxbf.m122514a(bzco.f169387a);
                if (a8 == null) {
                    a8 = bxbf.OK;
                }
                int i8 = a8.f161807s;
                if (da15.f164950c) {
                    da15.mo74035c();
                    da15.f164950c = false;
                }
                byxs byxs = (byxs) da15.f164949b;
                byxs.f168788a |= 1;
                byxs.f168789b = i8;
                int size3 = bzco.f169388b.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    byzv byzv = (byzv) bzco.f169388b.get(i9);
                    bxvd da16 = byxn.f168764d.mo74144da();
                    String str8 = byzv.f169181a;
                    if (da16.f164950c) {
                        da16.mo74035c();
                        da16.f164950c = false;
                    }
                    byxn byxn = (byxn) da16.f164949b;
                    str8.getClass();
                    byxn.f168766a |= 1;
                    byxn.f168767b = str8;
                    int a9 = bzbw.m125631a(byzv.f169182b);
                    if (a9 == 0) {
                        a9 = 1;
                    }
                    if (da16.f164950c) {
                        da16.mo74035c();
                        da16.f164950c = false;
                    }
                    byxn byxn2 = (byxn) da16.f164949b;
                    byxn2.f168768c = a9 - 1;
                    byxn2.f168766a |= 2;
                    if (da15.f164950c) {
                        da15.mo74035c();
                        da15.f164950c = false;
                    }
                    byxs byxs2 = (byxs) da15.f164949b;
                    byxn byxn3 = (byxn) da16.mo74062i();
                    byxn3.getClass();
                    if (!byxs2.f168790c.mo73666a()) {
                        byxs2.f168790c = GeneratedMessageLite.m124021a(byxs2.f168790c);
                    }
                    byxs2.f168790c.add(byxn3);
                }
                int size4 = bzco.f169389c.size();
                int i10 = 0;
                while (i10 < size4) {
                    bxvd da17 = byxk.f168748d.mo74144da();
                    byzr byzr = (byzr) bzco.f169389c.get(i10);
                    byze byze = byzr.f169154c;
                    if (byze == null) {
                        byze = byze.f169064e;
                    }
                    bywz a10 = m58246a(byze);
                    if (da17.f164950c) {
                        da17.mo74035c();
                        da17.f164950c = z;
                    }
                    byxk byxk = (byxk) da17.f164949b;
                    a10.getClass();
                    byxk.f168752c = a10;
                    byxk.f168750a |= i2;
                    int size5 = byzr.f169153b.size();
                    int i11 = 0;
                    while (i11 < size5) {
                        String str9 = (String) byzr.f169153b.get(i11);
                        if (da17.f164950c) {
                            da17.mo74035c();
                            da17.f164950c = z;
                        }
                        byxk byxk2 = (byxk) da17.f164949b;
                        str9.getClass();
                        if (!byxk2.f168751b.mo73666a()) {
                            byxk2.f168751b = GeneratedMessageLite.m124021a(byxk2.f168751b);
                        }
                        byxk2.f168751b.add(str9);
                        i11++;
                        z = false;
                    }
                    if (da15.f164950c) {
                        da15.mo74035c();
                        da15.f164950c = false;
                    }
                    byxs byxs3 = (byxs) da15.f164949b;
                    byxk byxk3 = (byxk) da17.mo74062i();
                    byxk3.getClass();
                    if (!byxs3.f168791d.mo73666a()) {
                        byxs3.f168791d = GeneratedMessageLite.m124021a(byxs3.f168791d);
                    }
                    byxs3.f168791d.add(byxk3);
                    i10++;
                    z = false;
                    i2 = 1;
                }
                if (da10.f164950c) {
                    da10.mo74035c();
                    da10.f164950c = false;
                }
                byxe byxe3 = (byxe) da10.f164949b;
                byxs byxs4 = (byxs) da15.mo74062i();
                byxs4.getClass();
                byxe3.f168721d = byxs4;
                byxe3.f168718a |= 4;
            }
            byxe byxe4 = (byxe) da10.mo74062i();
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            byxh byxh2 = (byxh) da7.f164949b;
            byxe4.getClass();
            byxh2.f168739c = byxe4;
            byxh2.f168737a |= 2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bywp bywp4 = (bywp) da.f164949b;
            byxh byxh3 = (byxh) da7.mo74062i();
            byxh3.getClass();
            bywp4.f168640f = byxh3;
            bywp4.f168635a |= 16;
        }
        if (set2 != null) {
            String[] strArr = (String[]) set2.toArray(new String[0]);
            this.f70119e.mo72984b();
            long[] jArr = new long[strArr.length];
            for (int i12 = 0; i12 < strArr.length; i12++) {
                jArr[i12] = mo72977b(strArr[i12]).longValue();
            }
            List b2 = bqcr.m112598b(jArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bywp bywp5 = (bywp) da.f164949b;
            if (!bywp5.f168641g.mo73666a()) {
                bywp5.f168641g = GeneratedMessageLite.m124020a(bywp5.f168641g);
            }
            bxsy.m123078a(b2, bywp5.f168641g);
        }
        bxvd da18 = byvm.f168451k.mo74144da();
        bxvd da19 = byvr.f168489f.mo74144da();
        if (da19.f164950c) {
            da19.mo74035c();
            da19.f164950c = false;
        }
        byvr byvr = (byvr) da19.f164949b;
        bywp bywp6 = (bywp) da.mo74062i();
        bywp6.getClass();
        byvr.f168493c = bywp6;
        byvr.f168491a |= 2;
        if (da18.f164950c) {
            da18.mo74035c();
            da18.f164950c = false;
        }
        byvm byvm = (byvm) da18.f164949b;
        byvr byvr2 = (byvr) da19.mo74062i();
        byvr2.getClass();
        byvm.f168454b = byvr2;
        byvm.f168453a |= 1;
        return (byvm) da18.mo74062i();
    }

    /* renamed from: a */
    public final void mo38314a(int i) {
        this.f70115a.remove(i);
        this.f70116b.remove(i);
        this.f70117c.remove(i);
    }

    /* renamed from: a */
    public final void mo38315a(Context context, String str, int i) {
        this.f70119e.mo72984b();
        mo38316a(context, str, i, (Set) null);
    }

    /* renamed from: a */
    public final void mo38316a(Context context, String str, int i, Set set) {
        this.f70119e.mo72984b();
        HashSet hashSet = new HashSet();
        hashSet.addAll(((aiyh) ahgz.m55754a(context, aiyh.class)).mo38262a((ClientAppIdentifier) null));
        aiyr aiyr = (aiyr) ahgz.m55754a(context, aiyr.class);
        aiyr.f70096g.mo72984b();
        hashSet.addAll(new HashSet(aiyr.f70095f.keySet()));
        mo38320a(str, i, hashSet, set);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buqb.a(byvm, boolean):void
     arg types: [byvm, int]
     candidates:
      buqb.a(int, ahcv):void
      buqb.a(int, ahcy):void
      buqb.a(byvm, boolean):void */
    /* renamed from: a */
    public final void mo38317a(byvm byvm) {
        if (byvm != null) {
            mo72974a(byvm, false);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            byyk byyk = this.f70118d.f70278f.f168927j;
            if (byyk == null) {
                byyk = byyk.f168943e;
            }
            long j = elapsedRealtime - byyk.f168946b;
            for (int i = 0; i < this.f70115a.size(); i++) {
                bxxc bxxc = (bxxc) this.f70115a.get(i);
                if (((Long) this.f70117c.get(i)).longValue() < j) {
                    byvm b = mo38321b((ClientAppIdentifier) this.f70116b.get(i), bxxc, 400);
                    if (b != null) {
                        mo72974a(b, false);
                    }
                    mo38322b(bxxc);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo38318a(ClientAppIdentifier clientAppIdentifier, bxxc bxxc, int i) {
        this.f70119e.mo72984b();
        bnsl bnsl = (bnsl) ahfq.f67120a.mo68390d();
        bnsl.mo68432a("aiyx", "a", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68425a("%s response failed for %s with status=%d", "CopresenceLogger: ", clientAppIdentifier, Integer.valueOf(i));
        if (m58249c(bxxc) >= 0) {
            mo38317a(mo38321b(clientAppIdentifier, bxxc, i));
            mo38322b(bxxc);
        }
    }

    /* renamed from: a */
    public final void mo38319a(ClientAppIdentifier clientAppIdentifier, bzcj bzcj, bzck bzck, Set set) {
        this.f70119e.mo72984b();
        bnsl bnsl = (bnsl) ahfq.f67120a.mo68390d();
        bnsl.mo68432a("aiyx", "a", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68426a("%s response succeeded for %s [%dms], addresses %s", "CopresenceLogger: ", clientAppIdentifier, Long.valueOf(mo38312a((bxxc) bzcj)), set);
        mo38317a(mo38313a(clientAppIdentifier, bzcj, bzck, BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, set));
        mo38322b(bzcj);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buqb.a(byvm, boolean):void
     arg types: [byvm, int]
     candidates:
      buqb.a(int, ahcv):void
      buqb.a(int, ahcy):void
      buqb.a(byvm, boolean):void */
    /* renamed from: a */
    public final void mo38320a(String str, int i, Set set, Set set2) {
        String[] strArr;
        this.f70119e.mo72984b();
        srn srn = ahfq.f67120a;
        bxvd da = byvm.f168451k.mo74144da();
        bxvd da2 = byvr.f168489f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byvr byvr = (byvr) da2.f164949b;
        byvr.f168492b = i - 1;
        byvr.f168491a |= 1;
        this.f70119e.mo72984b();
        if (!this.f70120g.equals(set)) {
            this.f70120g.clear();
            this.f70120g.addAll(set);
            strArr = (String[]) this.f70120g.toArray(new String[0]);
        } else {
            strArr = new String[]{"-"};
        }
        List asList = Arrays.asList(strArr);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byvr byvr2 = (byvr) da2.f164949b;
        if (!byvr2.f168495e.mo73666a()) {
            byvr2.f168495e = GeneratedMessageLite.m124021a(byvr2.f168495e);
        }
        bxsy.m123078a(asList, byvr2.f168495e);
        if (set2 != null) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                bzbu bzbu = (bzbu) it.next();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                byvr byvr3 = (byvr) da2.f164949b;
                bzbu.getClass();
                if (!byvr3.f168494d.mo73666a()) {
                    byvr3.f168494d = GeneratedMessageLite.m124019a(byvr3.f168494d);
                }
                byvr3.f168494d.mo74153d(bzbu.f169275k);
            }
        }
        byvr byvr4 = (byvr) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byvm byvm = (byvm) da.f164949b;
        byvr4.getClass();
        byvm.f168454b = byvr4;
        int i2 = byvm.f168453a | 1;
        byvm.f168453a = i2;
        if (str != null) {
            str.getClass();
            byvm.f168453a = i2 | 4;
            byvm.f168455c = str;
        }
        mo72974a((byvm) da.mo74062i(), false);
    }
}
