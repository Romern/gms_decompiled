package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: zzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zzj {

    /* renamed from: a */
    public static final Object f56287a = new Object();

    /* renamed from: b */
    public static zzj f56288b = null;

    /* renamed from: c */
    long f56289c = -1;

    /* renamed from: d */
    private boolean f56290d;

    /* renamed from: e */
    private final zxv f56291e;

    /* renamed from: f */
    private final zxw f56292f;

    /* renamed from: g */
    private final zxf f56293g;

    /* renamed from: h */
    private zxe f56294h;

    /* renamed from: i */
    private zxe f56295i;

    /* renamed from: j */
    private final List f56296j = new ArrayList();

    /* renamed from: k */
    private final Set f56297k = new HashSet();

    /* renamed from: l */
    private final Context f56298l;

    /* renamed from: m */
    private int f56299m = 1;

    /* renamed from: n */
    private final zyv f56300n;

    public zzj(zxv zxv, zxw zxw, zxf zxf, zyv zyv, Context context) {
        sdo.checkIfNull(zxv, "disk");
        this.f56291e = zxv;
        sdo.checkIfNull(zxw, "downloader");
        this.f56292f = zxw;
        sdo.checkIfNull(zxf, "directorySpec");
        this.f56293g = zxf;
        sdo.checkIfNull(zyv, "fontDirectory");
        this.f56300n = zyv;
        this.f56298l = context;
    }

    /* renamed from: a */
    private final void m46745a(int i) {
        int i2;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[2];
        zxe zxe = this.f56300n.f56231a;
        int i3 = 0;
        if (zxe != null) {
            i2 = zxe.f56082b;
        } else {
            i2 = 0;
        }
        objArr[0] = Integer.valueOf(i2);
        zxe zxe2 = this.f56295i;
        if (zxe2 != null) {
            i3 = zxe2.f56082b;
        }
        objArr[1] = Integer.valueOf(i3);
        zzi.f56267a.mo31621a(this.f56298l).mo31587a(9, i, String.format(locale, "com.google.android.gms.fonts.update.%dto%d", objArr));
    }

    /* renamed from: b */
    private final void m46750b(int i) {
        this.f56295i = null;
        this.f56290d = false;
        this.f56299m = i;
        f56288b = null;
        File a = this.f56292f.mo31577a(this.f56293g.f56087b);
        if (a.exists()) {
            a.delete();
        }
        this.f56292f.mo31578a(zyb.m46670a(this.f56293g), this.f56293g.f56087b);
        for (C1240of ofVar : this.f56297k) {
            this.f56292f.mo31578a((String) ofVar.f26798a, (String) ofVar.f26799b);
        }
        this.f56294h = null;
    }

    /* renamed from: c */
    private final boolean m46751c() {
        return this.f56299m == 1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zxv.a(zxi, zxh, boolean):java.io.File
     arg types: [zxi, zxh, int]
     candidates:
      zxv.a(java.io.File, zxi, zxh):java.io.File
      zxv.a(long, java.io.File, java.io.File):boolean
      zxv.a(zxi, zxh, boolean):java.io.File */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c1, code lost:
        r4 = r11;
     */
    /* renamed from: b */
    public final void mo31631b() {
        int i;
        if (this.f56299m == 1) {
            if (this.f56294h == null) {
                if (m46749a(zyb.m46670a(this.f56293g), this.f56293g)) {
                    this.f56295i = null;
                    try {
                        this.f56295i = zyo.m46707a(this.f56292f.mo31579b(this.f56293g.f56087b));
                    } catch (IllegalArgumentException | IllegalStateException | NullPointerException e) {
                        m46747a(e);
                    } catch (IOException e2) {
                        m46747a(e2);
                    }
                    if (m46751c()) {
                        int i2 = this.f56300n.f56231a.f56082b;
                        zxe zxe = this.f56295i;
                        int i3 = zxe.f56082b;
                        if (i2 >= i3) {
                            StringBuilder sb = new StringBuilder(59);
                            sb.append("Version inside directory is set to wrong value: ");
                            sb.append(i3);
                            m46747a(new IllegalStateException(sb.toString()));
                        } else {
                            this.f56294h = zxe;
                        }
                    }
                    if (this.f56294h == null) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (m46751c()) {
                if (!this.f56290d) {
                    zyh.m46683c("FontsUpdateRunner", "Starting to acquire font files", new Object[0]);
                    long j = this.f56293g.f56088c;
                    if (this.f56296j.isEmpty()) {
                        bxwc bxwc = this.f56294h.f56081a;
                        int size = bxwc.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            zxi zxi = (zxi) bxwc.get(i4);
                            zxi a = this.f56300n.mo31609a(zxi.f56105b);
                            if (a != null && a.f56106c < zxi.f56106c) {
                                zyh.m46683c("FontsUpdateRunner", "Potential family to be updated: %s", zxi.f56105b);
                                this.f56296j.add(zxi);
                            }
                        }
                    }
                    List list = this.f56296j;
                    int size2 = list.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        zxi zxi2 = (zxi) list.get(i5);
                        bxwc bxwc2 = zxi2.f56107d;
                        int size3 = bxwc2.size();
                        int i6 = 0;
                        while (true) {
                            i = i5 + 1;
                            if (i6 >= size3) {
                                break;
                            }
                            zxh zxh = (zxh) bxwc2.get(i6);
                            try {
                                if (this.f56291e.mo31570a(zxi2, zxh, false) != null) {
                                    zxf zxf = zxh.f56097a;
                                    if (zxf == null) {
                                        zxf = zxf.f56084e;
                                    }
                                    j += zxf.f56088c;
                                }
                                i6++;
                            } catch (IllegalStateException e3) {
                                m46747a(e3);
                                return;
                            }
                        }
                        i5 = i;
                    }
                    long j2 = this.f56289c;
                    if (j2 == -1) {
                        j2 = ceao.f182169a.mo6606a().mo78696j();
                        this.f56289c = j2;
                    }
                    long j3 = j + j2;
                    if (!this.f56291e.mo31574b(j3) && !this.f56291e.mo31575c(j3)) {
                        zyh.m46682b("FontsUpdateRunner", "Not enough disk space to process update.", new Object[0]);
                        synchronized (f56287a) {
                            if (f56288b != null) {
                                f56288b.m46746a(Status.f30111e);
                            }
                        }
                        return;
                    }
                    List list2 = this.f56296j;
                    int size4 = list2.size();
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    while (i7 < size4) {
                        zxi zxi3 = (zxi) list2.get(i7);
                        bxwc bxwc3 = zxi3.f56107d;
                        int size5 = bxwc3.size();
                        int i10 = 0;
                        while (true) {
                            int i11 = i7 + 1;
                            if (i10 >= size5) {
                                break;
                            }
                            zxh zxh2 = (zxh) bxwc3.get(i10);
                            try {
                                if (this.f56291e.mo31570a(zxi3, zxh2, false) != null) {
                                    i8++;
                                    String a2 = zyb.m46671a(zxh2);
                                    zxf zxf2 = zxh2.f56097a;
                                    if (zxf2 == null) {
                                        zxf2 = zxf.f56084e;
                                    }
                                    if (m46749a(a2, zxp.m46641a(zxf2))) {
                                        Set set = this.f56297k;
                                        String a3 = zyb.m46671a(zxh2);
                                        zxf zxf3 = zxh2.f56097a;
                                        if (zxf3 == null) {
                                            zxf3 = zxf.f56084e;
                                        }
                                        set.add(C1240of.m19758a(a3, String.valueOf(zxp.m46640a(zxf3.f56089d.getKey())).concat(".ttf")));
                                        i9++;
                                    }
                                    if (this.f56299m != 1) {
                                        return;
                                    }
                                }
                                i10++;
                            } catch (IllegalStateException e4) {
                                m46747a(e4);
                                return;
                            }
                        }
                    }
                    boolean z = i8 == i9;
                    this.f56290d = z;
                    if (!z) {
                        return;
                    }
                }
                if (m46751c()) {
                    zyh.m46683c("FontsUpdateRunner", "Starting to move downloaded fonts for directory v %d", Integer.valueOf(this.f56294h.f56082b));
                    try {
                        for (zxi zxi4 : this.f56296j) {
                            zxi a4 = this.f56300n.mo31609a(zxi4.f56105b);
                            for (zxh zxh3 : zxi4.f56107d) {
                                if (this.f56291e.mo31570a(a4, zxh3, false) != null) {
                                    zxw zxw = this.f56292f;
                                    zxf zxf4 = zxh3.f56097a;
                                    if (zxf4 == null) {
                                        zxf4 = zxf.f56084e;
                                    }
                                    this.f56291e.mo31568a(zxw.mo31577a(String.valueOf(zxp.m46640a(zxf4.f56089d.getKey())).concat(".ttf")), zxi4, zxh3);
                                    zyh.m46683c("FontsUpdateRunner", "Successfully moved %s to disk for directory v %d", zxi4.f56105b, Integer.valueOf(this.f56294h.f56082b));
                                }
                            }
                        }
                    } catch (Exception e5) {
                        zyh.m46681a("FontsUpdateRunner", e5, "Moving the downloaded fonts to disk failed", new Object[0]);
                        m46747a(e5);
                    }
                    if (m46751c()) {
                        try {
                            this.f56291e.mo31572a(this.f56294h);
                            zzi.f56267a.mo31630e(this.f56298l);
                        } catch (IOException e6) {
                            zyh.m46681a("FontsUpdateRunner", e6, "Writing directory to disk failed for v %d", Integer.valueOf(this.f56294h.f56082b));
                            m46747a(e6);
                        }
                    }
                    if (this.f56299m != 3) {
                        m46745a(0);
                        m46750b(2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m46746a(Status status) {
        zyh.m46680a("FontsUpdateRunner", "Abort update with status %s", status);
        m46745a(23504);
        m46750b(3);
    }

    /* renamed from: a */
    private final void m46747a(Exception exc) {
        zyh.m46680a("FontsUpdateRunner", "Update failed for %s due to: %s", this.f56293g.f56087b, exc.getMessage());
        m46746a(new Status(13, exc.getMessage()));
    }

    /* renamed from: a */
    public static boolean m46748a() {
        boolean z;
        synchronized (f56287a) {
            z = f56288b != null;
        }
        return z;
    }

    /* renamed from: a */
    private final boolean m46749a(String str, zxf zxf) {
        Status a = this.f56292f.mo31576a(str, zxf);
        int i = a.f30115i;
        if (i == 0) {
            return true;
        }
        if (i == 23509) {
            return false;
        }
        m46746a(a);
        return false;
    }
}
