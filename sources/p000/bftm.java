package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import com.felicanetworks.mfc.Felica;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.location.fused.bluepixel.BluePixelNanoAdapterReal$1;
import com.google.android.location.fused.bluepixel.BluePixelNanoAdapterReal$RequestTimeoutAlarmListener;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import com.google.location.bluemoon.inertialanchor.Pose;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: bftm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bftm extends bftk {

    /* renamed from: d */
    public static final /* synthetic */ int f115220d = 0;

    /* renamed from: e */
    private static final budl f115221e;

    /* renamed from: a */
    public final PowerManager f115222a;

    /* renamed from: b */
    final spb f115223b = new BluePixelNanoAdapterReal$RequestTimeoutAlarmListener(this);

    /* renamed from: c */
    public final bftu f115224c = new bftu();

    /* renamed from: f */
    private final Context f115225f;

    /* renamed from: g */
    private final BroadcastReceiver f115226g = new BluePixelNanoAdapterReal$1(this, "location");

    /* renamed from: h */
    private final bugr f115227h;

    /* renamed from: i */
    private final adzt f115228i;

    /* renamed from: j */
    private final spf f115229j;

    /* renamed from: k */
    private final bftg f115230k;

    /* renamed from: l */
    private bfto f115231l;

    /* renamed from: m */
    private btvl f115232m;

    /* renamed from: n */
    private final List f115233n = new ArrayList();

    /* renamed from: o */
    private boolean f115234o = false;

    /* renamed from: p */
    private boolean f115235p = false;

    /* renamed from: q */
    private boolean f115236q = false;

    /* renamed from: r */
    private final Pose f115237r = Pose.m151141a();

    /* renamed from: s */
    private budl f115238s;

    /* renamed from: t */
    private final bfts f115239t;

    /* renamed from: u */
    private final btvm f115240u = new btvm();

    static {
        bxvd da = budl.f153483d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        budl budl = (budl) da.f164949b;
        budl.f153486b = 1;
        int i = 1 | budl.f153485a;
        budl.f153485a = i;
        budl.f153485a = i | 2;
        budl.f153487c = false;
        f115221e = (budl) da.mo74062i();
    }

    public bftm(Context context, bugr bugr, adzt adzt, spf spf, bftg bftg) {
        this.f115225f = context;
        this.f115227h = bugr;
        this.f115228i = adzt;
        this.f115229j = spf;
        this.f115230k = bftg;
        bugr.mo72643a(this, adzt);
        this.f115239t = new bfts(context, adzt, this);
        this.f115238s = f115221e;
        this.f115222a = (PowerManager) context.getSystemService("power");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.phenotype.COMMITTED");
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        context.registerReceiver(this.f115226g, intentFilter, null, adzt);
    }

    /* renamed from: a */
    public static String m97829a(budo budo) {
        int i = budo.f153495b;
        return i != 2 ? i != 4 ? i != 5 ? i != 3 ? i == 6 ? "Config" : "unknown" : "StopCollect" : "StopDelivery" : "StartDelivery" : "StartCollect";
    }

    /* renamed from: b */
    private final void m97832b(budo budo) {
        bugu a = this.f115227h.mo72641a(1, 0, budo.serializeToBytes());
        if (a == null) {
            new Object[1][0] = m97829a(budo);
        } else {
            a.mo72638a(new bftl(budo));
        }
    }

    /* renamed from: h */
    private final boolean m97833h() {
        if (!this.f115234o) {
            return false;
        }
        bftg bftg = this.f115230k;
        if (cest.m138200f()) {
            if (bftg.f115215p > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - bftg.f115215p;
                bftg.f115209j = (int) (elapsedRealtime / 1000);
                if (cest.m138198d()) {
                    bftg.f115210k += elapsedRealtime;
                    if (bftg.f115211l < elapsedRealtime) {
                        bftg.f115211l = elapsedRealtime;
                    }
                }
            }
            bftg.f115215p = 0;
        }
        this.f115234o = false;
        this.f115236q = false;
        m97831a(cest.m138202h(), cest.m138204j());
        m97830a(2, this.f115238s.f153487c);
        if (!m97837l()) {
            return true;
        }
        this.f115231l.mo62254a();
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bftm.a(int, boolean):void
     arg types: [int, int]
     candidates:
      bftm.a(long, long):void
      bftm.a(bsct, bsdj):void
      bftm.a(budo, int):void
      bseb.a(bsct, bsdj):void
      bftm.a(int, boolean):void */
    /* renamed from: i */
    private final boolean m97834i() {
        if (!this.f115235p) {
            return false;
        }
        if (cest.m138198d()) {
            bftg bftg = this.f115230k;
            if (cest.m138200f()) {
                if (bftg.f115216q > 0) {
                    long elapsedRealtime = (long) ((int) (SystemClock.elapsedRealtime() - bftg.f115216q));
                    bftg.f115212m += elapsedRealtime;
                    if (bftg.f115213n < elapsedRealtime) {
                        bftg.f115213n = elapsedRealtime;
                    }
                }
                bftg.f115216q = 0;
            }
        }
        this.f115235p = false;
        int a = budk.m119356a(this.f115238s.f153486b);
        if (a == 0) {
            a = 1;
        }
        m97830a(a, false);
        return true;
    }

    /* renamed from: j */
    private final void m97835j() {
        bxvd da = budo.f153492e.mo74144da();
        bxvd da2 = budm.f153488a.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        budo budo = (budo) da.f164949b;
        budm budm = (budm) da2.mo74062i();
        budm.getClass();
        budo.f153496c = budm;
        budo.f153495b = 3;
        mo62248a((budo) da.mo74062i(), 1);
    }

    /* renamed from: k */
    private final boolean m97836k() {
        return !cest.m138205k() || !aeri.m52437b(this.f115225f) || this.f115222a.isPowerSaveMode();
    }

    /* renamed from: l */
    private final boolean m97837l() {
        return this.f115231l != null;
    }

    /* renamed from: m */
    private final boolean m97838m() {
        return this.f115232m != null;
    }

    /* renamed from: a */
    public final void mo62240a(bfti bfti) {
        bfto bfto = this.f115231l;
        if (bfto != null) {
            bfto.f115248g = bfti;
        }
    }

    /* renamed from: c */
    public final bfrx mo62245c() {
        return this.f115231l;
    }

    /* renamed from: cr */
    public final void mo61886cr() {
        List list = this.f115233n;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((bfth) list.get(i)).mo61886cr();
        }
        this.f115224c.mo62262a();
        if (m97837l()) {
            mo62252f();
            mo62249d();
            this.f115239t.mo62261b();
        }
        if (m97838m()) {
            mo62253g();
        }
    }

    /* renamed from: d */
    public final void mo62249d() {
        if (!m97836k()) {
            m97831a(cest.m138202h(), cest.m138204j());
            if (cest.f183409a.mo6606a().conveyGatingOffHysteresisEnabled()) {
                bxvd da = budo.f153492e.mo74144da();
                bxvd da2 = budi.f153472i.mo74144da();
                boolean g = cest.m138201g();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                budi budi = (budi) da2.f164949b;
                budi.f153474a |= 1;
                budi.f153475b = g;
                long i = cest.m138203i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                budi budi2 = (budi) da2.f164949b;
                budi2.f153474a |= 2;
                budi2.f153476c = i;
                long gatingOffHysteresisNanos = cest.f183409a.mo6606a().gatingOffHysteresisNanos();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                budi budi3 = (budi) da2.f164949b;
                budi3.f153474a |= 8;
                budi3.f153477d = gatingOffHysteresisNanos;
                boolean b = cest.m138196b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                budi budi4 = (budi) da2.f164949b;
                budi4.f153474a |= 16;
                budi4.f153478e = b;
                long c = cest.m138197c();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                budi budi5 = (budi) da2.f164949b;
                budi5.f153474a |= 32;
                budi5.f153479f = c;
                int m = (int) cest.m138207m();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                budi budi6 = (budi) da2.f164949b;
                budi6.f153474a |= 64;
                budi6.f153480g = m;
                int o = (int) cest.m138209o();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                budi budi7 = (budi) da2.f164949b;
                budi7.f153474a |= 128;
                budi7.f153481h = o;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                budo budo = (budo) da.f164949b;
                budi budi8 = (budi) da2.mo74062i();
                budi8.getClass();
                budo.f153496c = budi8;
                budo.f153495b = 2;
                mo62248a((budo) da.mo74062i(), 1);
            } else {
                bxvd da3 = budo.f153492e.mo74144da();
                bxvd da4 = budi.f153472i.mo74144da();
                boolean g2 = cest.m138201g();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                budi budi9 = (budi) da4.f164949b;
                budi9.f153474a |= 1;
                budi9.f153475b = g2;
                long i2 = cest.m138203i();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                budi budi10 = (budi) da4.f164949b;
                budi10.f153474a |= 2;
                budi10.f153476c = i2;
                boolean b2 = cest.m138196b();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                budi budi11 = (budi) da4.f164949b;
                budi11.f153474a |= 16;
                budi11.f153478e = b2;
                long c2 = cest.m138197c();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                budi budi12 = (budi) da4.f164949b;
                budi12.f153474a |= 32;
                budi12.f153479f = c2;
                int m2 = (int) cest.m138207m();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                budi budi13 = (budi) da4.f164949b;
                budi13.f153474a |= 64;
                budi13.f153480g = m2;
                int o2 = (int) cest.m138209o();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                budi budi14 = (budi) da4.f164949b;
                budi14.f153474a |= 128;
                budi14.f153481h = o2;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                budo budo2 = (budo) da3.f164949b;
                budi budi15 = (budi) da4.mo74062i();
                budi15.getClass();
                budo2.f153496c = budi15;
                budo2.f153495b = 2;
                mo62248a((budo) da3.mo74062i(), 1);
            }
            if (cest.f183409a.mo6606a().fopIaUseGcoreConfig() && this.f115227h.mo72647c() >= 14) {
                try {
                    btvy a = btvk.m118920a(this.f115225f, Integer.valueOf((int) cest.f183409a.mo6606a().fopIaGcoreConfigIndex()));
                    bxvd da5 = budo.f153492e.mo74144da();
                    bxvd da6 = budh.f153466e.mo74144da();
                    bxvd da7 = bucz.f153435d.mo74144da();
                    if (da7.f164950c) {
                        da7.mo74035c();
                        da7.f164950c = false;
                    }
                    bucz bucz = (bucz) da7.f164949b;
                    a.getClass();
                    bucz.f153438b = a;
                    bucz.f153437a |= 8;
                    bucz bucz2 = (bucz) da7.mo74062i();
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    budh budh = (budh) da6.f164949b;
                    bucz2.getClass();
                    budh.f153469b = bucz2;
                    budh.f153468a |= 1;
                    budh budh2 = (budh) da6.mo74062i();
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    budo budo3 = (budo) da5.f164949b;
                    budh2.getClass();
                    budo3.f153496c = budh2;
                    budo3.f153495b = 6;
                    mo62248a((budo) da5.mo74062i(), 1);
                } catch (IOException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
                    sb.append("Error loading Inertial Anchor config for BluePixel. \n");
                    sb.append(valueOf);
                    bftx.m97877a(sb.toString(), new Object[0]);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo62250e() {
        mo62253g();
        mo62252f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo62252f() {
        m97833h();
        m97835j();
        if (m97837l()) {
            this.f115231l.mo62254a();
        }
    }

    /* renamed from: g */
    public final void mo62253g() {
        if (cest.f183409a.mo6606a().deliverFopDataNotStartedOnFopReset()) {
            List list = this.f115233n;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((bfth) list.get(i)).mo62237a(false);
            }
        }
        m97834i();
    }

    /* renamed from: a */
    private final void m97830a(int i, boolean z) {
        bxvd da = budl.f153483d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        budl budl = (budl) da.f164949b;
        budl.f153486b = i - 1;
        int i2 = budl.f153485a | 1;
        budl.f153485a = i2;
        budl.f153485a = i2 | 2;
        budl.f153487c = z;
        budl budl2 = (budl) da.mo74062i();
        this.f115238s = budl2;
        int a = budk.m119356a(budl2.f153486b);
        if (a != 0 && a == 2 && !this.f115238s.f153487c) {
            bxvd da2 = budo.f153492e.mo74144da();
            bxvd da3 = budn.f153490a.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            budo budo = (budo) da2.f164949b;
            budn budn = (budn) da3.mo74062i();
            budn.getClass();
            budo.f153496c = budn;
            budo.f153495b = 5;
            mo62248a((budo) da2.mo74062i(), 1);
            return;
        }
        bxvd da4 = budo.f153492e.mo74144da();
        budl budl3 = this.f115238s;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        budo budo2 = (budo) da4.f164949b;
        budl3.getClass();
        budo2.f153496c = budl3;
        budo2.f153495b = 4;
        mo62248a((budo) da4.mo74062i(), 1);
    }

    /* renamed from: c */
    public final boolean mo62246c(int i) {
        if (cest.m138196b() && m97836k()) {
            return false;
        }
        if (i - 1 != 1) {
            if (!aeri.m52437b(this.f115225f) || !m97838m() || this.f115235p) {
                return false;
            }
            if (cest.m138198d()) {
                bftg bftg = this.f115230k;
                if (cest.m138200f()) {
                    bftg.f115216q = SystemClock.elapsedRealtime();
                    bftg.f115205f++;
                }
            }
            bxvd da = budl.f153483d.mo74144da();
            int a = budk.m119356a(this.f115238s.f153486b);
            if (a == 0) {
                a = 1;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            budl budl = (budl) da.f164949b;
            budl.f153486b = a - 1;
            int i2 = budl.f153485a | 1;
            budl.f153485a = i2;
            budl.f153485a = 2 | i2;
            budl.f153487c = true;
            this.f115238s = (budl) da.mo74062i();
            bxvd da2 = budo.f153492e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            budo budo = (budo) da2.f164949b;
            budo.f153494a |= 1;
            budo.f153497d = 2;
            budl budl2 = this.f115238s;
            budl2.getClass();
            budo.f153496c = budl2;
            budo.f153495b = 4;
            mo62248a((budo) da2.mo74062i(), 3);
            this.f115235p = true;
            return true;
        } else if (!aeri.m52437b(this.f115225f) || !m97837l() || this.f115234o) {
            return false;
        } else {
            bftg bftg2 = this.f115230k;
            if (cest.m138200f()) {
                bftg2.f115215p = SystemClock.elapsedRealtime();
            }
            bftg bftg3 = this.f115230k;
            if (cest.m138200f()) {
                bftg3.f115214o = SystemClock.elapsedRealtime();
                bftg3.f115202c++;
            }
            bxvd da3 = budl.f153483d.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            budl budl3 = (budl) da3.f164949b;
            budl3.f153486b = 3;
            int i3 = budl3.f153485a | 1;
            budl3.f153485a = i3;
            boolean z = this.f115238s.f153487c;
            budl3.f153485a = i3 | 2;
            budl3.f153487c = z;
            this.f115238s = (budl) da3.mo74062i();
            bxvd da4 = budo.f153492e.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            budo budo2 = (budo) da4.f164949b;
            budo2.f153494a |= 1;
            budo2.f153497d = 1;
            budl budl4 = this.f115238s;
            budl4.getClass();
            budo2.f153496c = budl4;
            budo2.f153495b = 4;
            mo62248a((budo) da4.mo74062i(), 2);
            this.f115234o = true;
            return true;
        }
    }

    /* renamed from: e */
    public final void mo62251e(int i) {
        List list = this.f115233n;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bfth) list.get(i2)).mo61880a(i);
        }
        this.f115229j.mo25932a(this.f115223b);
        if (m97837l()) {
            this.f115231l.mo62254a();
        }
        this.f115224c.mo62262a();
        this.f115234o = false;
        this.f115236q = false;
        this.f115235p = false;
        this.f115238s = f115221e;
    }

    /* renamed from: b */
    public final long mo62244b() {
        if (m97837l()) {
            return this.f115231l.f115244c;
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo61884b(int i) {
        List list = this.f115233n;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bfth) list.get(i2)).mo61884b(i);
        }
    }

    /* renamed from: a */
    private final void m97831a(long j, long j2) {
        bxvd da = budo.f153492e.mo74144da();
        bxvd da2 = budh.f153466e.mo74144da();
        bxvd da3 = bucx.f153418d.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bucx bucx = (bucx) da3.f164949b;
        bucx.f153420a |= 2;
        bucx.f153422c = j;
        bucx bucx2 = (bucx) da3.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        budh budh = (budh) da2.f164949b;
        bucx2.getClass();
        budh.f153470c = bucx2;
        budh.f153468a |= 2;
        bxvd da4 = budr.f153505d.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        budr budr = (budr) da4.f164949b;
        budr.f153507a |= 2;
        budr.f153509c = j2;
        budr budr2 = (budr) da4.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        budh budh2 = (budh) da2.f164949b;
        budr2.getClass();
        budh2.f153471d = budr2;
        budh2.f153468a |= 4;
        budh budh3 = (budh) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        budo budo = (budo) da.f164949b;
        budh3.getClass();
        budo.f153496c = budh3;
        budo.f153495b = 6;
        mo62248a((budo) da.mo74062i(), 1);
    }

    /* renamed from: a */
    public final void mo61880a(int i) {
        mo62251e(i);
        if (i == 2) {
            bfts bfts = this.f115239t;
            if (bfts.f115256c) {
                bfts.f115255b.mo34478a(bfts.f115257d);
                bfts.f115255b.mo34484a(bfts.f115258e);
                bfts.f115254a.unregisterReceiver(bfts.f115260g);
                int i2 = Build.VERSION.SDK_INT;
                bfts.f115254a.getContentResolver().unregisterContentObserver(bfts.f115259f);
                bfts.f115256c = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo62238a(Location location) {
        btwc a = this.f115240u.mo72443a(location);
        if (a != null) {
            bxvd da = budo.f153492e.mo74144da();
            bxvd da2 = budh.f153466e.mo74144da();
            bxvd da3 = bucz.f153435d.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bucz bucz = (bucz) da3.f164949b;
            a.getClass();
            bucz.f153439c = a;
            bucz.f153437a |= 16;
            bucz bucz2 = (bucz) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            budh budh = (budh) da2.f164949b;
            bucz2.getClass();
            budh.f153469b = bucz2;
            budh.f153468a |= 1;
            budh budh2 = (budh) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            budo budo = (budo) da.f164949b;
            budh2.getClass();
            budo.f153496c = budh2;
            budo.f153495b = 6;
            mo62248a((budo) da.mo74062i(), 1);
        }
    }

    /* renamed from: a */
    public final void mo62239a(bfth bfth) {
        if (!this.f115233n.contains(bfth)) {
            this.f115233n.add(bfth);
        }
    }

    /* renamed from: a */
    public final void mo62241a(bsct bsct, bsdj bsdj) {
        this.f115231l = new bfto(this.f115225f, bsct, bsdj, this.f115230k);
        mo62252f();
        mo62249d();
        this.f115239t.mo62261b();
    }

    /* renamed from: a */
    public final void mo62242a(btvl btvl) {
        this.f115232m = btvl;
        mo62253g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62248a(budo budo, int i) {
        bxvd bxvd = (bxvd) budo.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) budo);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        budo budo2 = (budo) bxvd.f164949b;
        budo budo3 = budo.f153492e;
        budo2.f153494a |= 1;
        budo2.f153497d = elapsedRealtime;
        budo budo4 = (budo) bxvd.mo74062i();
        bftu bftu = this.f115224c;
        if (((long) bftu.f115267a.size()) < cest.f183409a.mo6606a().requestQueueMaxSize()) {
            bftu.f115267a.add(new bftt(budo4, i));
            this.f115229j.mo25930a("BluePixelNanoAppRequestAlarm", 3, SystemClock.elapsedRealtime() + cest.f183409a.mo6606a().requestQueueTimeoutMs(), this.f115223b, this.f115228i, (WorkSource) null);
            if (this.f115224c.f115267a.size() == 1) {
                m97832b(budo4);
                return;
            }
            return;
        }
        mo62251e(2);
        m97835j();
    }

    /* renamed from: d */
    public final boolean mo62247d(int i) {
        if (i - 1 != 1) {
            return m97834i();
        }
        return m97833h();
    }

    /* renamed from: a */
    public final void mo61878a(bugn bugn, bugr bugr, buhd buhd) {
        budo budo;
        bpkg bpkg;
        bpkh bpkh;
        boolean z;
        long j;
        int i;
        budf budf;
        budf budf2;
        buda buda;
        budf budf3;
        buda buda2;
        budf budf4;
        buda buda3;
        budf budf5;
        buda buda4;
        buhd buhd2 = buhd;
        if (bugr.mo72639a() == 5147455389092024339L) {
            int i2 = 2;
            if (buhd2.f153831a == 2) {
                bftu bftu = this.f115224c;
                long j2 = ((budp) buhd2.mo72661a((bxxk) budp.f153498c.mo74142c(7))).f153500a;
                if (bftu.f115267a.isEmpty() || ((bftt) bftu.f115267a.getFirst()).f115265a.f153497d != j2) {
                    mo62251e(2);
                    return;
                }
            }
            int i3 = 3;
            int i4 = 1;
            if (m97838m()) {
                int i5 = buhd2.f153831a;
                if (i5 == 2) {
                    budp budp = (budp) buhd2.mo72661a((bxxk) budp.f153498c.mo74142c(7));
                    if (this.f115224c.mo62263a(3)) {
                        if (!budp.f153501b) {
                            mo62247d(3);
                        }
                        List list = this.f115233n;
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((bfth) list.get(i6)).mo62237a(budp.f153501b);
                        }
                    }
                } else if (i5 == 3 && this.f115235p) {
                    bxwc bxwc = ((bucw) buhd2.mo72661a((bxxk) bucw.f153415b.mo74142c(7))).f153417a;
                    int size2 = bxwc.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        bucu bucu = (bucu) bxwc.get(i7);
                        if (buct.m119339a(bucu.f153411a) != i4) {
                            i = size2;
                        } else {
                            if (bucu.f153411a == i2) {
                                budf = (budf) bucu.f153412b;
                            } else {
                                budf = budf.f153455c;
                            }
                            if (budd.m119349a(budf.f153457a) == i3) {
                                Pose pose = this.f115237r;
                                if (bucu.f153411a == i2) {
                                    budf2 = (budf) bucu.f153412b;
                                } else {
                                    budf2 = budf.f153455c;
                                }
                                if (budf2.f153457a == i3) {
                                    buda = (buda) budf2.f153458b;
                                } else {
                                    buda = buda.f153440b;
                                }
                                budg budg = buda.f153442a;
                                if (budg == null) {
                                    budg = budg.f153459e;
                                }
                                double d = (double) budg.f153462b;
                                if (bucu.f153411a == i2) {
                                    budf3 = (budf) bucu.f153412b;
                                } else {
                                    budf3 = budf.f153455c;
                                }
                                if (budf3.f153457a == i3) {
                                    buda2 = (buda) budf3.f153458b;
                                } else {
                                    buda2 = buda.f153440b;
                                }
                                budg budg2 = buda2.f153442a;
                                if (budg2 == null) {
                                    budg2 = budg.f153459e;
                                }
                                i = size2;
                                double d2 = (double) budg2.f153463c;
                                if (bucu.f153411a == i2) {
                                    budf4 = (budf) bucu.f153412b;
                                } else {
                                    budf4 = budf.f153455c;
                                }
                                if (budf4.f153457a == i3) {
                                    buda3 = (buda) budf4.f153458b;
                                } else {
                                    buda3 = buda.f153440b;
                                }
                                budg budg3 = buda3.f153442a;
                                if (budg3 == null) {
                                    budg3 = budg.f153459e;
                                }
                                double d3 = d2;
                                double d4 = (double) budg3.f153464d;
                                if (bucu.f153411a == i2) {
                                    budf5 = (budf) bucu.f153412b;
                                } else {
                                    budf5 = budf.f153455c;
                                }
                                if (budf5.f153457a == i3) {
                                    buda4 = (buda) budf5.f153458b;
                                } else {
                                    buda4 = buda.f153440b;
                                }
                                budg budg4 = buda4.f153442a;
                                if (budg4 == null) {
                                    budg4 = budg.f153459e;
                                }
                                pose.setAttitude(d, d3, d4, (double) budg4.f153461a);
                                Pose pose2 = this.f115237r;
                                pose2.timestampNanos = bucu.f153413c;
                                this.f115232m.mo62285a(pose2);
                            } else {
                                i = size2;
                            }
                        }
                        i7++;
                        size2 = i;
                        i2 = 2;
                        i3 = 3;
                        i4 = 1;
                    }
                }
            }
            if (m97837l()) {
                int i8 = buhd2.f153831a;
                if (i8 == 2) {
                    budp budp2 = (budp) buhd2.mo72661a((bxxk) budp.f153498c.mo74142c(7));
                    if (this.f115224c.mo62263a(2)) {
                        if (budp2.f153501b) {
                            this.f115236q = true;
                            bfto bfto = this.f115231l;
                            if (!bfto.f115245d.mo62231a()) {
                                bfto.mo62254a();
                                z = false;
                            } else {
                                bfte bfte = bfto.f115245d;
                                if (bfte.mo62231a()) {
                                    j = ((bucu) bfte.f115197b.getLast()).f153413c;
                                } else {
                                    j = -1;
                                }
                                bfto.f115244c = j;
                                bfto.f115247f.mo70267a(2);
                                bfto.f115246e.mo70216d();
                                bucv bucv = (bucv) bucw.f153415b.mo74144da();
                                Iterator b = bfto.f115245d.mo62232b();
                                while (b.hasNext()) {
                                    bucu bucu2 = (bucu) b.next();
                                    if (bucu2.f153411a == 4) {
                                        bucv.mo72624a(bucu2);
                                    }
                                }
                                if (((bucw) bucv.f164949b).f153417a.size() <= 0) {
                                    bfto.mo62193a(Collections.emptyList());
                                    z = true;
                                } else {
                                    bfto.f115243b = SystemClock.elapsedRealtime() * 1000000;
                                    bfto.mo62258b((bucw) bucv.mo74062i());
                                    z = true;
                                }
                            }
                            if (z) {
                                m97831a(cest.f183409a.mo6606a().flpBluePixelNanoAppGnssStreamIntervalMs(), cest.f183409a.mo6606a().flpBluePixelNanoAppWifiStreamIntervalMs());
                            } else {
                                mo62247d(2);
                            }
                            if (cest.m138198d()) {
                                this.f115230k.mo62236a(true, z);
                            } else {
                                this.f115230k.mo62235a(z);
                            }
                        } else {
                            if (cest.m138198d()) {
                                this.f115230k.mo62236a(false, false);
                            } else {
                                this.f115230k.mo62235a(false);
                            }
                            mo62247d(2);
                        }
                    }
                } else if (i8 == 3) {
                    bucw bucw = (bucw) buhd2.mo72661a((bxxk) bucw.f153415b.mo74142c(7));
                    if (this.f115236q) {
                        bfto bfto2 = this.f115231l;
                        if (SystemClock.elapsedRealtime() * 1000000 >= bfto2.f115243b + ((Long) bfto2.f115242a.mo6606a()).longValue()) {
                            if (!bfto2.f115245d.mo62234d()) {
                                bfto2.mo62259b(Collections.emptyList());
                            }
                            bxwc bxwc2 = bucw.f153417a;
                            int size3 = bxwc2.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                bucu bucu3 = (bucu) bxwc2.get(i9);
                                if (bucu3.f153411a != 4) {
                                    bfto2.mo62256a(bucu3);
                                } else {
                                    bucv bucv2 = (bucv) bucw.f153415b.mo74144da();
                                    bucv2.mo72624a(bucu3);
                                    bfto2.mo62258b((bucw) bucv2.mo74062i());
                                }
                            }
                        } else {
                            bfto2.mo62257a(bucw);
                        }
                    } else if (this.f115234o) {
                        this.f115231l.mo62257a(bucw);
                    }
                }
            }
            if (cest.m138200f() && buhd2.f153831a == 4 && (bpkg = (bpkg) buhd2.mo72661a((bxxk) bpkg.f137949d.mo74142c(7))) != null && (bpkg.f137951a & 1) != 0) {
                bpki bpki = bpkg.f137952b;
                if (bpki == null) {
                    bpki = bpki.f137969c;
                }
                if (cest.m138198d() && (bpki.f137971a & 16) == 0) {
                    bxvd bxvd = (bxvd) bpki.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) bpki);
                    int c = this.f115227h.mo72647c();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bpki bpki2 = (bpki) bxvd.f164949b;
                    bpki2.f137971a |= 16;
                    bpki2.f137972b = c;
                    bpki = (bpki) bxvd.mo74062i();
                }
                bftg bftg = this.f115230k;
                if (cest.m138198d()) {
                    bxvd da = bpkh.f137954n.mo74144da();
                    int min = Math.min(bftg.f115202c, 14400);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpkh bpkh2 = (bpkh) da.f164949b;
                    bpkh2.f137956a |= 1;
                    bpkh2.f137957b = min;
                    int min2 = Math.min(bftg.f115203d, 14400);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpkh bpkh3 = (bpkh) da.f164949b;
                    bpkh3.f137956a |= 2;
                    bpkh3.f137958c = min2;
                    int min3 = Math.min(bftg.f115206g, (int) Felica.MAX_TIMEOUT);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpkh bpkh4 = (bpkh) da.f164949b;
                    bpkh4.f137956a = 4 | bpkh4.f137956a;
                    bpkh4.f137959d = min3;
                    int min4 = Math.min(bftg.f115207h, 2880);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpkh bpkh5 = (bpkh) da.f164949b;
                    bpkh5.f137956a |= 8;
                    bpkh5.f137960e = min4;
                    int min5 = Math.min(bftg.f115208i, 2880);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpkh bpkh6 = (bpkh) da.f164949b;
                    bpkh6.f137956a |= 16;
                    bpkh6.f137961f = min5;
                    int min6 = Math.min(bftg.f115209j, 3600);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpkh bpkh7 = (bpkh) da.f164949b;
                    bpkh7.f137956a |= 32;
                    bpkh7.f137962g = min6;
                    int min7 = Math.min(bftg.f115204e, 14400);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpkh bpkh8 = (bpkh) da.f164949b;
                    bpkh8.f137956a |= 64;
                    bpkh8.f137963h = min7;
                    int min8 = Math.min(bftg.f115205f, 14400);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpkh bpkh9 = (bpkh) da.f164949b;
                    bpkh9.f137956a |= 128;
                    bpkh9.f137964i = min8;
                    int min9 = Math.min((int) (bftg.f115210k / 1000), 86400);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpkh bpkh10 = (bpkh) da.f164949b;
                    bpkh10.f137956a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bpkh10.f137965j = min9;
                    int min10 = Math.min((int) (bftg.f115211l / 1000), 3600);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpkh bpkh11 = (bpkh) da.f164949b;
                    bpkh11.f137956a |= 512;
                    bpkh11.f137966k = min10;
                    int min11 = Math.min((int) (bftg.f115212m / 1000), 86400);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpkh bpkh12 = (bpkh) da.f164949b;
                    bpkh12.f137956a |= 1024;
                    bpkh12.f137967l = min11;
                    int min12 = Math.min((int) (bftg.f115213n / 1000), 3600);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpkh bpkh13 = (bpkh) da.f164949b;
                    bpkh13.f137956a |= 2048;
                    bpkh13.f137968m = min12;
                    bpkh = (bpkh) da.mo74062i();
                } else {
                    bxvd da2 = bpkh.f137954n.mo74144da();
                    int i10 = bftg.f115202c;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpkh bpkh14 = (bpkh) da2.f164949b;
                    int i11 = bpkh14.f137956a | 1;
                    bpkh14.f137956a = i11;
                    bpkh14.f137957b = i10;
                    int i12 = bftg.f115203d;
                    int i13 = i11 | 2;
                    bpkh14.f137956a = i13;
                    bpkh14.f137958c = i12;
                    int i14 = bftg.f115206g;
                    int i15 = 4 | i13;
                    bpkh14.f137956a = i15;
                    bpkh14.f137959d = i14;
                    int i16 = bftg.f115207h;
                    int i17 = i15 | 8;
                    bpkh14.f137956a = i17;
                    bpkh14.f137960e = i16;
                    int i18 = bftg.f115208i;
                    int i19 = i17 | 16;
                    bpkh14.f137956a = i19;
                    bpkh14.f137961f = i18;
                    int i20 = bftg.f115209j;
                    bpkh14.f137956a = i19 | 32;
                    bpkh14.f137962g = i20;
                    bpkh = (bpkh) da2.mo74062i();
                }
                bxvd da3 = bpkg.f137949d.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bpkg bpkg2 = (bpkg) da3.f164949b;
                bpki.getClass();
                bpkg2.f137952b = bpki;
                int i21 = bpkg2.f137951a | 1;
                bpkg2.f137951a = i21;
                bpkh.getClass();
                bpkg2.f137953c = bpkh;
                bpkg2.f137951a = i21 | 2;
                bpkg bpkg3 = (bpkg) da3.mo74062i();
                if (!cest.f183409a.mo6606a().restrictClearcutToCheckboxConsent()) {
                    if (cest.m138200f()) {
                        bxvd da4 = bonq.f133833p.mo74144da();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bonq bonq = (bonq) da4.f164949b;
                        bonq.f133836b = 14;
                        int i22 = bonq.f133835a | 1;
                        bonq.f133835a = i22;
                        bpkg3.getClass();
                        bonq.f133848n = bpkg3;
                        bonq.f133835a = i22 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                        bftg.f115200a.mo24333a((bonq) da4.mo74062i()).mo24327b();
                    }
                } else if (cest.m138200f() && ((double) bftg.f115201b.nextFloat()) < cest.f183409a.mo6606a().clearcutSamplingRate()) {
                    bftg.f115217r.mo24673E().mo50373a(new bftf(bftg, bpkg3));
                }
                bftg.f115202c = 0;
                bftg.f115203d = 0;
                bftg.f115206g = 0;
                bftg.f115207h = 0;
                bftg.f115208i = 0;
                bftg.f115209j = 0;
                bftg.f115204e = 0;
                bftg.f115205f = 0;
                bftg.f115210k = 0;
                bftg.f115211l = 0;
                bftg.f115212m = 0;
                bftg.f115213n = 0;
            }
            if (buhd2.f153831a == 2) {
                bftu bftu2 = this.f115224c;
                if (!bftu2.f115267a.isEmpty()) {
                    bftu2.f115267a.removeFirst();
                }
                if (!bftu2.f115267a.isEmpty()) {
                    budo = ((bftt) bftu2.f115267a.getFirst()).f115265a;
                } else {
                    budo = null;
                }
                if (budo == null) {
                    this.f115229j.mo25932a(this.f115223b);
                } else {
                    m97832b(budo);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62243a(PrintWriter printWriter) {
        if (printWriter != null) {
            printWriter.printf("FLP registered: %b%n", Boolean.valueOf(m97837l()));
            printWriter.printf("FOP registered: %b%n", Boolean.valueOf(m97838m()));
            printWriter.println();
            printWriter.printf("FLP delivering: %b%n", Boolean.valueOf(this.f115234o));
            printWriter.printf("FLP batch received: %b%n", Boolean.valueOf(this.f115236q));
            printWriter.println();
            printWriter.printf("FOP delivering: %b%n", Boolean.valueOf(this.f115235p));
        }
    }
}
