package p000;

import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bgfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgfa {

    /* renamed from: a */
    bgez f116328a = bgez.UNAVAILABLE;

    /* renamed from: b */
    final List f116329b = new ArrayList();

    /* renamed from: c */
    final List f116330c = new ArrayList();

    /* renamed from: d */
    private final bgey f116331d;

    /* renamed from: e */
    private long f116332e;

    /* renamed from: f */
    private final bfyx f116333f;

    static {
        new SimpleDateFormat("yyyy.MM.dd HH:mm:ss ");
    }

    public bgfa(bgey bgey, bfyx bfyx) {
        this.f116331d = bgey;
        this.f116333f = bfyx;
    }

    /* renamed from: a */
    private static bgew m98726a(bgew bgew, int i) {
        bgex bgex = new bgex();
        bgex.mo62730a(bgew);
        return bgex.mo62727a(i);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    private final bgez m98728b(long j) {
        if (cexq.f183497a.mo6606a().forceHardwareGeofenceWhenAvailable()) {
            return bgez.FAST_MOVING;
        }
        if (this.f116329b.isEmpty()) {
            return bgez.UNAVAILABLE;
        }
        bgew bgew = (bgew) m98727a(this.f116329b);
        int a = bgew.mo62722a();
        if (a != 3 && j - bgew.f116313b > 660000) {
            return bgez.UNAVAILABLE;
        }
        switch (a) {
            case 0:
            case 1:
                break;
            case 2:
            case 7:
            case 8:
                return bgez.WALKING;
            case 3:
                Pair a2 = mo62735a(j);
                if (((Long) a2.first).longValue() >= 900000) {
                    return bgez.STILL;
                }
                return ((Long) a2.second).longValue() > 660000 ? bgez.UNAVAILABLE : this.f116328a;
            case 4:
                bgew bgew2 = (bgew) m98727a(this.f116329b);
                int max = Math.max(bgew2.mo62723a(0), bgew2.mo62723a(1));
                int a3 = bgew2.mo62723a(2);
                if (this.f116328a != bgez.STILL) {
                    if (this.f116328a == bgez.FAST_MOVING && max > 10) {
                        return bgez.FAST_MOVING;
                    }
                    if (this.f116328a == bgez.WALKING && a3 > 10) {
                        return bgez.WALKING;
                    }
                }
                return bgez.UNKNOWN;
            case 5:
            case 6:
                return this.f116328a;
            default:
                switch (a) {
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        break;
                    default:
                        return bgez.UNKNOWN;
                }
        }
        return bgez.FAST_MOVING;
    }

    /* renamed from: c */
    public final synchronized boolean mo62740c() {
        return ((Long) mo62735a(SystemClock.elapsedRealtime()).first).longValue() >= 11700000;
    }

    /* renamed from: d */
    public final synchronized void mo62741d() {
        bgez b = m98728b(SystemClock.elapsedRealtime());
        if (b != this.f116328a) {
            boolean z = bfxc.f115575a;
            bfyx bfyx = this.f116333f;
            bgez bgez = this.f116328a;
            bfzt bfzt = bfyx.f115742a;
            synchronized (bfzt.f115806k) {
                int i = 4;
                if (Log.isLoggable("GeofencerStateMachine", 4)) {
                    String valueOf = String.valueOf(bgez);
                    String valueOf2 = String.valueOf(b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54 + String.valueOf(valueOf2).length());
                    sb.append("sendMovementChange: previousMovement=");
                    sb.append(valueOf);
                    sb.append(",currentMovement=");
                    sb.append(valueOf2);
                    bfxc.m98132a("GeofencerStateMachine", sb.toString());
                }
                bfxb bfxb = bfxa.f115569a;
                int a = bfzt.m98350a(bgez);
                int a2 = bfzt.m98350a(b);
                if (cexh.m138386e()) {
                    bfxb.mo62417a(new bfxj(a, a2));
                }
                bfww bfww = bfzt.f115812q;
                if (bfww != null) {
                    if (bfww.mo62407d()) {
                        bxvd e = bfww.mo62408e();
                        bxvd da = bpmg.f138246c.mo74144da();
                        bgez bgez2 = bgez.UNAVAILABLE;
                        int ordinal = b.ordinal();
                        if (ordinal == 1) {
                            i = 2;
                        } else if (ordinal == 2) {
                            i = 3;
                        } else if (ordinal != 3) {
                            i = ordinal != 4 ? 1 : 5;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpmg bpmg = (bpmg) da.f164949b;
                        bpmg.f138249b = i - 1;
                        bpmg.f138248a |= 1;
                        if (e.f164950c) {
                            e.mo74035c();
                            e.f164950c = false;
                        }
                        bpmt bpmt = (bpmt) e.f164949b;
                        bpmg bpmg2 = (bpmg) da.mo74062i();
                        bpmt bpmt2 = bpmt.f138341m;
                        bpmg2.getClass();
                        bpmt.f138353k = bpmg2;
                        bpmt.f138343a |= 512;
                        bfww.f115542a.mo62394a((bpmt) e.mo74062i());
                    }
                }
                bfzt.mo62545b(7, Pair.create(bgez, b));
            }
            this.f116328a = b;
        }
    }

    /* renamed from: e */
    public final synchronized bxvd mo62742e() {
        bxvd bxvd;
        bgoq bgoq;
        bxvd = null;
        if (!this.f116329b.isEmpty()) {
            bxvd da = bfyd.f115657e.mo74144da();
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bfyd bfyd = (bfyd) da.f164949b;
            bfyd.f115659a |= 1;
            bfyd.f115660b = currentTimeMillis;
            List list = this.f116329b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bgew bgew = (bgew) list.get(i);
                int i2 = 0;
                for (int i3 = 0; i3 < 23; i3++) {
                    if (bgew.f116314c[i3] != 0) {
                        i2++;
                    }
                }
                int[] iArr = new int[i2];
                int i4 = 0;
                for (int i5 = 0; i5 < 23; i5++) {
                    if (bgew.f116314c[i5] != 0) {
                        iArr[i4] = i5;
                        i4++;
                    }
                }
                if (i2 != 0) {
                    bgop bgop = (bgop) bgoq.f116946f.mo74144da();
                    long j = bgew.f116313b;
                    if (bgop.f164950c) {
                        bgop.mo74035c();
                        bgop.f164950c = false;
                    }
                    bgoq bgoq2 = (bgoq) bgop.f164949b;
                    int i6 = bgoq2.f116948a | 1;
                    bgoq2.f116948a = i6;
                    bgoq2.f116950c = j;
                    long j2 = bgew.f116312a;
                    bgoq2.f116948a = i6 | 2;
                    bgoq2.f116951d = j2;
                    for (int i7 = 0; i7 < i2; i7++) {
                        int i8 = iArr[i7];
                        bxvd da2 = bgov.f116962d.mo74144da();
                        int a = bgfb.m98739a(i8);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bgov bgov = (bgov) da2.f164949b;
                        bgov.f116965b = a;
                        bgov.f116964a |= 1;
                        int a2 = bgew.mo62723a(i8);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bgov bgov2 = (bgov) da2.f164949b;
                        bgov2.f116964a |= 2;
                        bgov2.f116966c = a2;
                        bgop.mo63059a((bgov) da2.mo74062i());
                    }
                    bgoq = (bgoq) bgop.mo74062i();
                } else {
                    bgoq = null;
                }
                if (bgoq != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bfyd bfyd2 = (bfyd) da.f164949b;
                    bgoq.getClass();
                    if (!bfyd2.f115661c.mo73666a()) {
                        bfyd2.f115661c = GeneratedMessageLite.m124021a(bfyd2.f115661c);
                    }
                    bfyd2.f115661c.add(bgoq);
                }
            }
            List list2 = this.f116330c;
            int size2 = list2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                bxvd bxvd2 = (bxvd) list2.get(i9);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bfyd bfyd3 = (bfyd) da.f164949b;
                bfyc bfyc = (bfyc) bxvd2.mo74062i();
                bfyc.getClass();
                if (!bfyd3.f115662d.mo73666a()) {
                    bfyd3.f115662d = GeneratedMessageLite.m124021a(bfyd3.f115662d);
                }
                bfyd3.f115662d.add(bfyc);
            }
            bxvd = da;
        }
        return bxvd;
    }

    /* renamed from: a */
    private static Object m98727a(List list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: f */
    private final void m98729f() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f116332e >= 900000) {
            this.f116332e = elapsedRealtime;
            long j = elapsedRealtime - 12300000;
            int size = this.f116329b.size();
            int i = 0;
            while (i < size && ((bgew) this.f116329b.get(i)).f116313b < j) {
                i++;
            }
            if (i > 0) {
                this.f116329b.subList(0, i).clear();
            }
        }
    }

    /* renamed from: a */
    public final synchronized long mo62734a() {
        return this.f116329b.size() != 0 ? ((bgew) m98727a(this.f116329b)).f116313b : -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized Pair mo62735a(long j) {
        long j2;
        long j3;
        long j4;
        if (!this.f116330c.isEmpty()) {
            int size = this.f116330c.size() - 1;
            j2 = j;
            while (true) {
                if (size < 0) {
                    break;
                }
                bxvd bxvd = (bxvd) this.f116330c.get(size);
                if (((bfyc) bxvd.f164949b).f115655b <= j) {
                    if (size == this.f116330c.size() - 1) {
                        bfyc bfyc = (bfyc) bxvd.f164949b;
                        if ((bfyc.f115654a & 2) == 0) {
                            j2 = bfyc.f115655b;
                        }
                    }
                    bfyc bfyc2 = (bfyc) bxvd.f164949b;
                    if (j2 - bfyc2.f115656c >= 660000) {
                        break;
                    }
                    j2 = bfyc2.f115655b;
                    boolean z = bfxc.f115575a;
                }
                size--;
            }
        } else {
            j2 = j;
        }
        int size2 = this.f116329b.size() - 1;
        bgew bgew = null;
        bgew bgew2 = null;
        while (true) {
            if (size2 < 0) {
                break;
            }
            bgew bgew3 = (bgew) this.f116329b.get(size2);
            long j5 = bgew3.f116313b;
            if (j5 <= j) {
                if (j5 < j2) {
                    break;
                } else if (bgew3.mo62722a() != 3) {
                    bgew = bgew3;
                    break;
                } else {
                    bgew2 = bgew3;
                }
            }
            size2--;
        }
        boolean z2 = bfxc.f115575a;
        if (bgew2 != null) {
            j3 = j - bgew2.f116313b;
        } else {
            j3 = 0;
        }
        j4 = Long.MAX_VALUE;
        if (bgew != null) {
            if (bgew2 != null) {
                j4 = bgew2.f116313b - bgew.f116313b;
            }
        }
        return Pair.create(Long.valueOf(j3), Long.valueOf(j4));
    }

    /* renamed from: a */
    public final synchronized void mo62736a(bfyd bfyd) {
        bgew bgew;
        if (bfyd.f115662d.size() > 0) {
            bxwc bxwc = bfyd.f115662d;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bfyc bfyc = (bfyc) bxwc.get(i);
                if ((bfyc.f115654a & 1) != 0) {
                    List list = this.f116330c;
                    bxvd bxvd = (bxvd) bfyc.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) bfyc);
                    list.add(bxvd);
                }
            }
        }
        bxwc bxwc2 = bfyd.f115661c;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bgoq bgoq = (bgoq) bxwc2.get(i2);
            if (bgoq.f116949b.size() != 0) {
                bgex bgex = new bgex();
                bxwc bxwc3 = bgoq.f116949b;
                int size3 = bxwc3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    bgov bgov = (bgov) bxwc3.get(i3);
                    bgex.mo62728a(bgfb.m98740a(bgov), bgov.f116966c);
                }
                bgex.mo62729a(bgoq.f116951d);
                bgex.mo62731b(bgoq.f116950c);
                bgew = bgex.mo62726a();
            } else {
                bgew = null;
            }
            if (bgew != null) {
                this.f116329b.add(bgew);
                this.f116328a = m98728b(bgew.f116313b);
            }
        }
        m98729f();
        this.f116328a = m98728b(SystemClock.elapsedRealtime());
        boolean z = bfxc.f115575a;
    }

    /* renamed from: b */
    public final synchronized bgez mo62739b() {
        bgez b;
        b = m98728b(SystemClock.elapsedRealtime());
        this.f116328a = b;
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r11.f79300a.size() == 1) goto L_0x0032;
     */
    /* renamed from: a */
    public final synchronized void mo62737a(ActivityRecognitionResult activityRecognitionResult) {
        boolean z = bfxc.f115575a;
        if (activityRecognitionResult != null && (this.f116329b.isEmpty() || ((bgew) m98727a(this.f116329b)).f116313b != activityRecognitionResult.f79302c)) {
            int a = activityRecognitionResult.mo43491a().mo43513a();
            if (a != 5) {
            }
            if (this.f116331d.f116318a) {
                if (!(a == 2 || a == 0 || a == 1)) {
                    boolean z2 = bfxc.f115575a;
                    return;
                }
            }
            int[] iArr = new int[23];
            for (DetectedActivity detectedActivity : activityRecognitionResult.f79300a) {
                iArr[detectedActivity.mo43513a()] = detectedActivity.f79320e;
            }
            bgew bgew = new bgew(iArr, activityRecognitionResult.f79301b, activityRecognitionResult.f79302c);
            int a2 = bgew.mo62722a();
            if (a2 != 4) {
                if (!bgew.mo62724b(a2)) {
                }
                this.f116329b.add(bgew);
                m98729f();
                this.f116333f.mo62451a();
                mo62741d();
                return;
            }
            if (bgew.mo62724b(4)) {
                bgew = m98726a(bgew, 4);
                boolean z3 = bfxc.f115575a;
            } else {
                int max = Math.max(bgew.mo62723a(0), bgew.mo62723a(1));
                if (max < 25) {
                    if (max >= 10) {
                        if (this.f116328a != bgez.FAST_MOVING) {
                        }
                    }
                    int a3 = bgew.mo62723a(2);
                    if (a3 < 25) {
                        if (a3 >= 10) {
                            if (this.f116328a != bgez.WALKING) {
                            }
                        }
                    }
                    bgew = m98726a(bgew, 2);
                    boolean z4 = bfxc.f115575a;
                }
                bgew = m98726a(bgew, 0);
                boolean z5 = bfxc.f115575a;
            }
            this.f116329b.add(bgew);
            m98729f();
            this.f116333f.mo62451a();
            mo62741d();
            return;
        }
        boolean z6 = bfxc.f115575a;
    }

    /* renamed from: a */
    public final void mo62738a(boolean z) {
        boolean z2 = bfxc.f115575a;
        bxvd bxvd = !this.f116330c.isEmpty() ? (bxvd) m98727a(this.f116330c) : null;
        if (z) {
            if (bxvd != null) {
                bfyc bfyc = (bfyc) bxvd.f164949b;
                if ((bfyc.f115654a & 2) == 0) {
                    long j = bfyc.f115655b;
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("Last period not closed. Start=");
                    sb.append(j);
                    bfxc.m98133b("MovementManager", sb.toString());
                    return;
                }
            }
            bxvd da = bfyc.f115652d.mo74144da();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bfyc bfyc2 = (bfyc) da.f164949b;
            bfyc2.f115654a |= 1;
            bfyc2.f115655b = elapsedRealtime;
            this.f116330c.add(da);
            List list = this.f116330c;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bfyc bfyc3 = (bfyc) ((bxvd) it.next()).f164949b;
                if ((bfyc3.f115654a & 2) != 0 && elapsedRealtime2 - bfyc3.f115656c > 660000) {
                    it.remove();
                }
            }
        } else if (bxvd != null && (((bfyc) bxvd.f164949b).f115654a & 2) == 0) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bfyc bfyc4 = (bfyc) bxvd.f164949b;
            bfyc bfyc5 = bfyc.f115652d;
            bfyc4.f115654a |= 2;
            bfyc4.f115656c = elapsedRealtime3;
        } else {
            bfyc bfyc6 = (bfyc) bxvd.f164949b;
            long j2 = bfyc6.f115655b;
            long j3 = bfyc6.f115656c;
            StringBuilder sb2 = new StringBuilder(79);
            sb2.append("Last period already closed. Start=");
            sb2.append(j2);
            sb2.append(" end=");
            sb2.append(j3);
            bfxc.m98133b("MovementManager", sb2.toString());
        }
    }
}
