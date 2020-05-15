package p000;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: aamr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aamr {

    /* renamed from: a */
    private static final long f28481a = TimeUnit.DAYS.toMillis(28);

    /* renamed from: b */
    private final Context f28482b;

    /* renamed from: c */
    private final aaoa f28483c;

    /* renamed from: d */
    private final aaml f28484d;

    /* renamed from: e */
    private final qxq f28485e;

    /* renamed from: f */
    private final aakl f28486f;

    /* renamed from: g */
    private final List f28487g = new ArrayList();

    /* renamed from: h */
    private final List f28488h = new ArrayList();

    public aamr(Context context, aaoa aaoa, aaml aaml, qxq qxq, aakl aakl) {
        this.f28482b = context;
        this.f28483c = aaoa;
        this.f28484d = aaml;
        this.f28485e = qxq;
        this.f28486f = aakl;
    }

    /* renamed from: a */
    private final void m21547a(aamh aamh, String str, int i) {
        bmxv a = this.f28483c.mo17168a(str);
        if (a.mo66813a()) {
            aajz aajz = (aajz) a.mo66814b();
            blmp blmp = aajz.f28334c;
            if (blmp == null) {
                blmp = blmp.f126864r;
            }
            if (aamh.m21512a(blmp).equals(aamh)) {
                int a2 = aajy.m21373a(aajz.f28335d);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (a2 == i) {
                    this.f28483c.mo17163b(aajz);
                }
            }
        }
    }

    /* renamed from: b */
    private final bmxv m21551b(blmp blmp) {
        List list = this.f28488h;
        int size = list.size();
        int i = 0;
        while (i < size) {
            aamp aamp = (aamp) list.get(i);
            i++;
            if (aamp.mo17042a(blmp)) {
                return bmxv.m108566b(aamp);
            }
        }
        return bmvz.f131120a;
    }

    /* renamed from: b */
    public final synchronized void mo17053b(aajt aajt) {
        aaoa aaoa;
        if (!aytw.m84813a(this.f28482b)) {
            List list = this.f28487g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                aamo aamo = (aamo) list.get(i);
                bmxv a = mo17044a(aamo);
                if (a.mo66813a()) {
                    aajz aajz = (aajz) a.mo66814b();
                    try {
                        if (m21550a(aajz)) {
                            this.f28486f.mo16933a(aamo.f28478c, aamo.f28479d, aamo.f28480e, aaqi.TTL_EXPIRED);
                            aaoa = this.f28483c;
                        } else {
                            blmp blmp = aajz.f28334c;
                            if (blmp == null) {
                                blmp = blmp.f126864r;
                            }
                            aajt.mo16916b(blmp);
                            this.f28486f.mo16932a(aamo.f28478c, aamo.f28479d, aamo.f28480e, aaqg.SENT_ON_LEAVING_DOZE);
                            aaoa = this.f28483c;
                        }
                        aaoa.mo17163b(aajz);
                    } catch (Throwable th) {
                        this.f28483c.mo17163b(aajz);
                        throw th;
                    }
                }
            }
            this.f28487g.clear();
        }
    }

    /* renamed from: a */
    private final void m21548a(aamp aamp) {
        mo17048a(aamp.f28478c, aamp.f28479d);
    }

    /* renamed from: a */
    private final void m21549a(List list, aamh aamh, aaqi aaqi) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aamq aamq = (aamq) it.next();
            if (aamq.f28478c.equals(aamh)) {
                it.remove();
                m21547a(aamh, aamq.f28479d, aamq.mo17038a());
                this.f28484d.mo17033a(aamq.f28478c, aamq.f28479d, aamq.f28480e, aaqi);
            }
        }
    }

    /* renamed from: a */
    private static boolean m21550a(aajz aajz) {
        long j;
        long j2 = aajz.f28333b;
        blmp blmp = aajz.f28334c;
        if (blmp == null) {
            blmp = blmp.f126864r;
        }
        if ((blmp.f126866a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
            j2 = Math.min(j2, blmp.f126878m);
        }
        if ((blmp.f126866a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
            j = Math.min(TimeUnit.SECONDS.toMillis((long) blmp.f126877l), f28481a);
        } else {
            j = f28481a;
        }
        return j2 + j <= System.currentTimeMillis();
    }

    /* renamed from: b */
    public final synchronized void mo17054b(aamh aamh, aaqi aaqi) {
        if (!aytw.m84813a(this.f28482b)) {
            m21549a(this.f28488h, aamh, aaqi);
        }
    }

    /* renamed from: a */
    public final synchronized bmxv mo17043a() {
        bmxv bmxv;
        if (aytw.m84813a(this.f28482b) || this.f28488h.isEmpty()) {
            bmxv = bmvz.f131120a;
        } else {
            List list = this.f28488h;
            int size = list.size();
            long j = Long.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                j = Math.min(((aamp) list.get(i)).mo17040b(), j);
            }
            bmxv = bmxv.m108566b(Long.valueOf(j));
        }
        return bmxv;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bmxv mo17044a(aamq aamq) {
        bmxv a = this.f28483c.mo17168a(aamq.f28479d);
        if (!a.mo66813a()) {
            String valueOf = String.valueOf(aamq);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("Failed to load message missing from store: ");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
            this.f28484d.mo17031a(aamq.f28478c, aamq.f28479d, aamq.f28480e, 2);
            return bmvz.f131120a;
        }
        aajz aajz = (aajz) a.mo66814b();
        blmp blmp = aajz.f28334c;
        if (blmp == null) {
            blmp = blmp.f126864r;
        }
        if (aamq.mo17042a(blmp)) {
            int a2 = aamq.mo17038a();
            int a3 = aajy.m21373a(aajz.f28335d);
            if (a3 == 0) {
                a3 = 1;
            }
            if (a2 == a3) {
                return a;
            }
        }
        String valueOf2 = String.valueOf(aamq);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 53);
        sb2.append("Failed to load message, stored version is different: ");
        sb2.append(valueOf2);
        Log.w("GCM", sb2.toString());
        this.f28484d.mo17031a(aamq.f28478c, aamq.f28479d, aamq.f28480e, 3);
        return bmvz.f131120a;
    }

    /* renamed from: a */
    public final synchronized Set mo17045a(aajt aajt) {
        synchronized (this) {
            if (aytw.m84813a(this.f28482b)) {
                Set emptySet = Collections.emptySet();
                return emptySet;
            }
            bnia j = bnic.m109500j();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            List list = this.f28488h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                aamp aamp = (aamp) list.get(i);
                if (aamp.mo17040b() <= elapsedRealtime) {
                    arrayList.add(aamp);
                }
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                aamp aamp2 = (aamp) arrayList.get(i2);
                bmxv a = mo17044a((aamq) aamp2);
                if (!a.mo66813a()) {
                    this.f28488h.remove(aamp2);
                } else {
                    aajz aajz = (aajz) a.mo66814b();
                    if (m21550a(aajz)) {
                        m21548a(aamp2);
                        this.f28484d.mo17033a(aamp2.f28478c, aamp2.f28479d, aamp2.f28480e, aaqi.TTL_EXPIRED);
                    } else {
                        blmp blmp = aajz.f28334c;
                        if (blmp == null) {
                            blmp = blmp.f126864r;
                        }
                        aajt.mo16913a(blmp);
                        aamp2.f28477b++;
                        aamp2.f28476a = SystemClock.elapsedRealtime();
                        this.f28484d.mo17032a(aamp2.f28478c, aamp2.f28479d, aamp2.f28480e, 3, aamp2.f28477b, 0);
                        if (((long) aamp2.f28477b) >= cecz.f182285a.mo6606a().mo78853u()) {
                            m21548a(aamp2);
                            this.f28484d.mo17033a(aamp2.f28478c, aamp2.f28479d, aamp2.f28480e, aaqi.CLIENT_QUEUE_EXCEEDED_MAX_RETRIES);
                            j.mo67629b(aamp2.f28478c);
                        }
                    }
                }
            }
            bnic a2 = j.mo67751a();
            return a2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo17046a(aajt aajt, aalx aalx, aamh aamh) {
        aaoa aaoa;
        if (!aytw.m84813a(this.f28482b)) {
            int a = aalx.mo16986a(aamh);
            List list = this.f28487g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                aamo aamo = (aamo) list.get(i);
                if (a <= 0) {
                    break;
                }
                if (aamh.equals(aamo.f28478c)) {
                    bmxv a2 = mo17044a(aamo);
                    if (a2.mo66813a()) {
                        aajz aajz = (aajz) a2.mo66814b();
                        try {
                            if (m21550a(aajz)) {
                                this.f28486f.mo16933a(aamo.f28478c, aamo.f28479d, aamo.f28480e, aaqi.TTL_EXPIRED);
                                aaoa = this.f28483c;
                            } else {
                                int a3 = aajg.m21332a(aakb.m21381a().f28351l.mo17012b(aamh.f28458b), aamh);
                                bxvd da = aaqk.f28904k.mo74144da();
                                String str = aamh.f28457a;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                aaqk aaqk = (aaqk) da.f164949b;
                                str.getClass();
                                int i2 = aaqk.f28906a | 2;
                                aaqk.f28906a = i2;
                                aaqk.f28910e = str;
                                int i3 = aamh.f28458b;
                                int i4 = i2 | 4;
                                aaqk.f28906a = i4;
                                aaqk.f28911f = i3;
                                aaqk.f28906a = i4 | 16;
                                aaqk.f28913h = a3;
                                this.f28486f.mo16934a(da, aaqd.SENT_PRIORITY_REDUCED_MESSAGE_ON_NEW_MESSAGE_RECEIVED);
                                blmp blmp = aajz.f28334c;
                                if (blmp == null) {
                                    blmp = blmp.f126864r;
                                }
                                aajt.mo16916b(blmp);
                                a--;
                                aaoa = this.f28483c;
                            }
                            aaoa.mo17163b(aajz);
                        } catch (Throwable th) {
                            this.f28483c.mo17163b(aajz);
                            throw th;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo17047a(aamh aamh, aaqi aaqi) {
        if (!aytw.m84813a(this.f28482b)) {
            mo17054b(aamh, aaqi);
            m21549a(this.f28487g, aamh, aaqi);
        }
    }

    /* renamed from: a */
    public final synchronized void mo17048a(aamh aamh, String str) {
        if (!aytw.m84813a(this.f28482b)) {
            int i = 0;
            while (true) {
                if (i < this.f28488h.size()) {
                    if (((aamp) this.f28488h.get(i)).mo17041a(aamh, str)) {
                        this.f28488h.remove(i);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            m21547a(aamh, str, 2);
        }
    }

    /* renamed from: a */
    public final synchronized void mo17049a(Context context, aajt aajt) {
        bmxv bmxv;
        aajt aajt2 = aajt;
        synchronized (this) {
            if (!aytw.m84813a(context)) {
                boolean z = aajt.m21357d() && aame.m21504b(context);
                for (aajz aajz : this.f28483c.mo17162b()) {
                    if (m21550a(aajz)) {
                        this.f28483c.mo17163b(aajz);
                        blmp blmp = aajz.f28334c;
                        if (blmp == null) {
                            blmp = blmp.f126864r;
                        }
                        int a = aajy.m21373a(aajz.f28335d);
                        if (a != 0) {
                            if (a == 2) {
                                this.f28484d.mo17033a(aamh.m21512a(blmp), blmp.f126873h, blmp.f126882q, aaqi.TTL_EXPIRED);
                            }
                        }
                        int a2 = aajy.m21373a(aajz.f28335d);
                        if (a2 != 0 && a2 == 3) {
                            this.f28486f.mo16933a(aamh.m21512a(blmp), blmp.f126873h, blmp.f126882q, aaqi.TTL_EXPIRED);
                        }
                    } else {
                        int a3 = aajy.m21373a(aajz.f28335d);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        int i = a3 - 1;
                        if (i == 0 || i == 1) {
                            if (cedo.m136289b()) {
                                blmp blmp2 = aajz.f28334c;
                                if (blmp2 == null) {
                                    blmp2 = blmp.f126864r;
                                }
                                if (!m21551b(blmp2).mo66813a()) {
                                    aajt2.mo16913a(blmp2);
                                    this.f28484d.mo17032a(aamh.m21512a(blmp2), blmp2.f126873h, blmp2.f126882q, 4, 0, 0);
                                    this.f28483c.mo17163b(aajz);
                                }
                            }
                        } else if (aajt.m21358e()) {
                            blmp blmp3 = aajz.f28334c;
                            if (blmp3 == null) {
                                blmp3 = blmp.f126864r;
                            }
                            List list = this.f28487g;
                            int size = list.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    bmxv = bmvz.f131120a;
                                    break;
                                }
                                aamo aamo = (aamo) list.get(i2);
                                i2++;
                                if (aamo.mo17042a(blmp3)) {
                                    bmxv = bmxv.m108566b(aamo);
                                    break;
                                }
                            }
                            if (!bmxv.mo66813a()) {
                                if (!z) {
                                    aajt2.mo16916b(blmp3);
                                    this.f28483c.mo17163b(aajz);
                                    this.f28486f.mo16932a(aamh.m21512a(blmp3), blmp3.f126873h, blmp3.f126882q, aaqg.SENT_ON_GMSCORE_RESTART);
                                } else {
                                    this.f28487g.add(new aamo(blmp3));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo17050a(blmp blmp, long j) {
        long j2;
        if (aytw.m84813a(this.f28482b)) {
            this.f28485e.mo24383c("DIRECT_BOOT_RETRY_QUEUE_DROPPED").mo24359a();
            return;
        }
        bmxv b = m21551b(blmp);
        if (b.mo66813a()) {
            aamp aamp = (aamp) b.mo66814b();
            String valueOf = String.valueOf(aamp);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Received duplicate message: ");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
            this.f28484d.mo17031a(aamp.f28478c, aamp.f28479d, aamp.f28480e, 4);
            return;
        }
        bxvd da = aajz.f28330e.mo74144da();
        long currentTimeMillis = System.currentTimeMillis();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aajz aajz = (aajz) da.f164949b;
        int i = aajz.f28332a | 1;
        aajz.f28332a = i;
        aajz.f28333b = currentTimeMillis;
        blmp.getClass();
        aajz.f28334c = blmp;
        int i2 = i | 2;
        aajz.f28332a = i2;
        aajz.f28335d = 1;
        aajz.f28332a = 4 | i2;
        if (this.f28483c.mo17161a((aajz) da.mo74062i())) {
            aamp aamp2 = new aamp(blmp);
            aamh aamh = aamp2.f28478c;
            int t = (int) cecz.f182285a.mo6606a().mo78852t();
            if (t > 0) {
                int i3 = 0;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f28488h.size(); i5++) {
                    if (((aamp) this.f28488h.get(i5)).f28478c.equals(aamh)) {
                        if (i4 == -1) {
                            i4 = i5;
                        }
                        i3++;
                    }
                }
                if (i3 >= t) {
                    aamp aamp3 = (aamp) this.f28488h.remove(i4);
                    this.f28483c.mo17164b(aaoa.m21735b(aamp3.f28479d));
                    this.f28484d.mo17033a(aamp3.f28478c, aamp3.f28479d, aamp3.f28480e, aaqi.CLIENT_QUEUE_EXCEEDED_STORAGE_LIMIT);
                }
            }
            this.f28488h.add(aamp2);
            if (j != -1) {
                j2 = SystemClock.elapsedRealtime() - j;
            } else {
                j2 = 0;
            }
            this.f28484d.mo17032a(aamp2.f28478c, aamp2.f28479d, aamp2.f28480e, 2, 0, j2);
        }
    }

    /* renamed from: a */
    public final synchronized void mo17051a(PrintWriter printWriter) {
        printWriter.println("\nQueued messages:");
        for (aamq aamq : bnfi.m109236a(this.f28487g, this.f28488h)) {
            printWriter.println(aamq);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b2, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b3 A[SYNTHETIC, Splitter:B:67:0x01b3] */
    /* renamed from: a */
    public final synchronized boolean mo17052a(blmp blmp) {
        boolean z;
        bxvd da;
        if (!aytw.m84813a(this.f28482b)) {
            if ((blmp.f126866a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
                if (blmp.f126877l == 0) {
                    this.f28486f.mo16933a(aamh.m21512a(blmp), blmp.f126873h, blmp.f126882q, aaqi.TTL_ZERO);
                    return true;
                }
            }
            aamo aamo = new aamo(blmp);
            Iterator it = this.f28487g.iterator();
            while (it.hasNext()) {
                aamo aamo2 = (aamo) it.next();
                if (!aamo2.f28474a.isEmpty() && !aamo2.f28474a.equals("do_not_collapse") && aamo2.f28478c.equals(aamo.f28478c) && aamo2.f28474a.equals(aamo.f28474a)) {
                    it.remove();
                    m21547a(aamo2.f28478c, aamo2.f28479d, 3);
                    this.f28486f.mo16933a(aamo2.f28478c, aamo2.f28479d, aamo2.f28480e, aaqi.DOZE_QUEUE_COLLAPSED);
                }
            }
            aamh aamh = aamo.f28478c;
            List list = this.f28487g;
            int size = list.size();
            aamo aamo3 = null;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                aamo aamo4 = (aamo) list.get(i2);
                if (aamo4.f28478c.equals(aamh)) {
                    i++;
                    aamo3 = aamo4;
                }
            }
            if (i == 1) {
                if (aamo3.f28475b) {
                    z = true;
                    if (z) {
                        this.f28486f.mo16933a(aamo.f28478c, aamo.f28479d, aamo.f28480e, aaqi.DOZE_QUEUE_CONVERTED_TO_DIRTY_PING);
                        blmo blmo = (blmo) blmp.f126864r.mo74144da();
                        String str = blmp.f126870e;
                        if (blmo.f164950c) {
                            blmo.mo74035c();
                            blmo.f164950c = false;
                        }
                        blmp blmp2 = (blmp) blmo.f164949b;
                        str.getClass();
                        int i3 = blmp2.f126866a | 16;
                        blmp2.f126866a = i3;
                        blmp2.f126870e = str;
                        "".getClass();
                        int i4 = i3 | 4;
                        blmp2.f126866a = i4;
                        blmp2.f126868c = "";
                        long j = blmp.f126878m;
                        int i5 = 65536 | i4;
                        blmp2.f126866a = i5;
                        blmp2.f126878m = j;
                        String str2 = blmp.f126873h;
                        str2.getClass();
                        blmp2.f126866a = i5 | 128;
                        blmp2.f126873h = str2;
                        bxvd da2 = blmi.f126842d.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        blmi blmi = (blmi) da2.f164949b;
                        "message_type".getClass();
                        int i6 = blmi.f126844a | 1;
                        blmi.f126844a = i6;
                        blmi.f126845b = "message_type";
                        "deleted_messages".getClass();
                        blmi.f126844a = i6 | 2;
                        blmi.f126846c = "deleted_messages";
                        blmo.mo66684a(da2);
                        if ((blmp.f126866a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                            long j2 = blmp.f126876k;
                            if (blmo.f164950c) {
                                blmo.mo74035c();
                                blmo.f164950c = false;
                            }
                            blmp blmp3 = (blmp) blmo.f164949b;
                            blmp3.f126866a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                            blmp3.f126876k = j2;
                        }
                        blmp = (blmp) blmo.mo74062i();
                        aamo = new aamo(blmp, true);
                    }
                    da = aajz.f28330e.mo74144da();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    aajz aajz = (aajz) da.f164949b;
                    int i7 = aajz.f28332a | 1;
                    aajz.f28332a = i7;
                    aajz.f28333b = currentTimeMillis;
                    blmp.getClass();
                    aajz.f28334c = blmp;
                    int i8 = i7 | 2;
                    aajz.f28332a = i8;
                    aajz.f28335d = 2;
                    aajz.f28332a = i8 | 4;
                    if (!this.f28483c.mo17161a((aajz) da.mo74062i())) {
                        this.f28487g.add(aamo);
                        this.f28486f.mo16932a(aamh.m21512a(blmp), blmp.f126873h, blmp.f126882q, aaqg.WRITTEN_TO_DOZE_QUEUE);
                        if (z) {
                            Iterator it2 = this.f28487g.iterator();
                            while (it2.hasNext()) {
                                aamo aamo5 = (aamo) it2.next();
                                if (aamo5.f28478c.equals(aamo.f28478c) && !aamo5.f28479d.equals(aamo.f28479d)) {
                                    it2.remove();
                                    m21547a(aamo5.f28478c, aamo5.f28479d, 3);
                                    this.f28486f.mo16933a(aamo5.f28478c, aamo5.f28479d, aamo5.f28480e, aaqi.DOZE_QUEUE_DROPPED_DUE_TO_DIRTY_PING);
                                }
                            }
                        }
                    } else {
                        aakl aakl = this.f28486f;
                        aamh aamh2 = aamo.f28478c;
                        String str3 = aamo.f28479d;
                        int i9 = aamo.f28480e;
                        if (cecn.m136008b()) {
                            bxvd da3 = aaqk.f28904k.mo74144da();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            aaqk aaqk = (aaqk) da3.f164949b;
                            str3.getClass();
                            int i10 = 1 | aaqk.f28906a;
                            aaqk.f28906a = i10;
                            aaqk.f28909d = str3;
                            String str4 = aamh2.f28457a;
                            str4.getClass();
                            int i11 = i10 | 2;
                            aaqk.f28906a = i11;
                            aaqk.f28910e = str4;
                            int i12 = aamh2.f28458b;
                            int i13 = i11 | 4;
                            aaqk.f28906a = i13;
                            aaqk.f28911f = i12;
                            aaqk.f28906a = i13 | 8;
                            aaqk.f28912g = i9;
                            aaqk.f28908c = 5;
                            aaqk.f28907b = 6;
                            aaqk aaqk2 = (aaqk) da3.mo74062i();
                            aakk aakk = aakl.f28371a;
                            bxvd da4 = aaql.f28916c.mo74144da();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            aaql aaql = (aaql) da4.f164949b;
                            aaqk2.getClass();
                            aaql.f28919b = aaqk2;
                            aaql.f28918a |= 4;
                            aakk.mo16931a((aaql) da4.mo74062i());
                        }
                        aakl.f28371a.f28364a.mo24383c("DOZE_QUEUE_WRITE_FAILED").mo24359a();
                        return false;
                    }
                }
            }
            z = ((long) i) >= cecz.f182285a.mo6606a().mo78851s();
            if (z) {
            }
            da = aajz.f28330e.mo74144da();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!da.f164950c) {
            }
            aajz aajz2 = (aajz) da.f164949b;
            int i72 = aajz2.f28332a | 1;
            aajz2.f28332a = i72;
            aajz2.f28333b = currentTimeMillis2;
            blmp.getClass();
            aajz2.f28334c = blmp;
            int i82 = i72 | 2;
            aajz2.f28332a = i82;
            aajz2.f28335d = 2;
            aajz2.f28332a = i82 | 4;
            if (!this.f28483c.mo17161a((aajz) da.mo74062i())) {
            }
        } else {
            this.f28485e.mo24383c("DIRECT_BOOT_DOZE_QUEUE_IGNORED").mo24359a();
            return false;
        }
    }
}
