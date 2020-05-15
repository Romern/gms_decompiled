package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.internal.ClientIdentity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: zeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zeb {

    /* renamed from: a */
    public static final srn f54998a = zvt.m46581a();

    /* renamed from: b */
    public final ConcurrentMap f54999b = new ConcurrentHashMap();

    /* renamed from: c */
    public final zgf f55000c;

    /* renamed from: d */
    public final zrn f55001d;

    /* renamed from: e */
    private final String f55002e;

    /* renamed from: f */
    private final ytp f55003f;

    /* renamed from: g */
    private final Context f55004g;

    /* renamed from: h */
    private final yvk f55005h;

    public zeb(String str, zgf zgf, zrn zrn, ytp ytp, Context context) {
        this.f55002e = str;
        this.f55003f = ytp;
        this.f55001d = zrn;
        this.f55004g = context;
        this.f55005h = new yvk(zvn.m46574a(context), context.getPackageManager().hasSystemFeature("android.hardware.sensor.heartrate.ecg"), 1, 0);
        zrn.getClass();
        this.f55000c = new zkf(zgf, 1, "Recording", new zdx(zrn));
    }

    /* renamed from: b */
    private final long m45354b(yqe yqe) {
        caae caae;
        cadr cadr = yqe.f54381b;
        long j = cadr.f172722d;
        if (j >= 0) {
            return j;
        }
        yvk yvk = this.f55005h;
        if ((cadr.f172719a & 1) != 0) {
            caae = cadr.f172720b;
            if (caae == null) {
                caae = caae.f172323i;
            }
        } else {
            caae = null;
        }
        return yvk.mo30788a(caae, yyo.m45042a(cadr));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final bqgg mo30969a(yqe yqe, ClientIdentity clientIdentity) {
        zea zea;
        int i;
        zgg zgg;
        char c;
        zgg zgg2;
        bqgg bqgg;
        long j;
        long j2;
        bngx bngx;
        cadr cadr;
        yqe yqe2 = yqe;
        List list = (List) this.f54999b.get(yqe2.f54380a);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zkh zkh = (zkh) it.next();
                if (zkh.f55301d.equals(yqe2)) {
                    zea = new zea(1);
                    break;
                }
                yqe yqe3 = zkh.f55301d;
                if (yqe3.f54380a.equals(yqe2.f54380a) && yyo.m45043a(yqe3.f54381b, yqe2.f54381b)) {
                    cadr cadr2 = yqe3.f54383d;
                    if ((cadr2 == null && yqe2.f54383d == null) || !(cadr2 == null || (cadr = yqe2.f54383d) == null || !yyo.m45043a(cadr2, cadr))) {
                        zea = new zea(3, zkh.f55301d);
                    }
                }
            }
        }
        zea = new zea(2);
        caah a = yyo.m45042a(yqe2.f54381b);
        if (!this.f55000c.mo19159a(a)) {
            return bqga.m112775a((Object) false);
        }
        int i2 = zea.f54996a;
        if (i2 == 1) {
            return bqga.m112775a((Object) true);
        }
        if (i2 == 3) {
            zea.mo30968a();
            if (!mo30973a(zea.mo30968a())) {
                ((bnsl) f54998a.mo68388c()).mo68405a("Failed to remove old recording. Skipping update of recording.");
                mo30971a(a, (int) MfiClientException.TYPE_CARD_NOT_CACHED);
                return bqga.m112775a((Object) false);
            }
        }
        long b = m45354b(yqe);
        if (cdyu.m135393k() && b == -1) {
            return bqga.m112775a((Object) true);
        }
        Context context = this.f55004g;
        caae caae = yqe2.f54381b.f172720b;
        if (caae == null) {
            caae = caae.f172323i;
        }
        if (!((bnic) yvm.f54688a.mo30787a()).contains(a.f172336b)) {
            i = ((bnic) yvq.f54692a.mo30787a()).contains(yqe2.f54380a) ? 1 : 2;
        } else {
            i = 1;
        }
        zgg zdw = new zdw(caae, this.f55001d, i);
        if (a.equals(bzzn.f172101an)) {
            zgg = new zec(this.f55004g, zdw, this.f55002e);
        } else {
            zgg = zdw;
        }
        zdy zdy = new zdy(this, yqe2);
        String str = a.f172336b;
        switch (str.hashCode()) {
            case -2023954015:
                if (str.equals("com.google.location.bounding_box")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1757812901:
                if (str.equals("com.google.location.sample")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1248818137:
                if (str.equals("com.google.distance.delta")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case -1102520626:
                if (str.equals("com.google.step_count.delta")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1099695423:
                if (str.equals("com.google.activity.sample")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -886569606:
                if (str.equals("com.google.location.track")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 269180370:
                if (str.equals("com.google.activity.samples")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 324760871:
                if (str.equals("com.google.step_count.cadence")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 657433501:
                if (str.equals("com.google.step_count.cumulative")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 877955159:
                if (str.equals("com.google.speed.summary")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case 1921738212:
                if (str.equals("com.google.distance.cumulative")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2053496735:
                if (str.equals("com.google.speed")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                int i3 = Build.VERSION.SDK_INT;
                zgg2 = new zdn(context, clientIdentity, cdyr.f181940a.mo6606a().mo78475a(), zgg, zdy, 1);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                int i4 = Build.VERSION.SDK_INT;
                zgg2 = new zdn(context, clientIdentity, "android:fine_location", zgg, zdy, 2);
                break;
            default:
                zgg2 = zgg;
                break;
        }
        cadr cadr3 = yqe2.f54381b;
        if (!cdyu.m135393k() && b == -1) {
            bqgg = bqga.m112775a((Object) false);
        } else {
            long j3 = b / 2;
            long u = cdzd.m135486o() ? cdzd.f182003a.mo6606a().mo78597u() : b;
            if (bzzn.f172085Y.equals(yyo.m45042a(cadr3))) {
                j2 = cdzd.f182003a.mo6606a().mo78547N();
                j = cdzs.f182101a.mo6606a().mo78627a();
            } else {
                j2 = j3;
                j = u;
            }
            zgf zgf = this.f55000c;
            caae caae2 = cadr3.f172720b;
            caae caae3 = caae2 != null ? caae2 : caae.f172323i;
            int i5 = cadr3.f172723e;
            String str2 = yqe2.f54380a;
            try {
                bngx = bngx.m109356a(new ClientIdentity(this.f55004g.getPackageManager().getApplicationInfo(str2, 0).uid, str2));
            } catch (PackageManager.NameNotFoundException e) {
                bngx = bngx.m109376e();
            }
            bqgg = zgf.mo19155a(new zgh(caae3, zgg2, b, j2, j, i5, bngx, -1));
        }
        zkg zkg = new zkg();
        zkg.f55292a = zgg2;
        zkg.f55294c = yqe2;
        zkg.f55297f = System.currentTimeMillis();
        zkh a2 = zkg.mo31198a();
        String str3 = yqe2.f54380a;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ((List) bmxu.m108565a((List) this.f54999b.putIfAbsent(str3, copyOnWriteArrayList), copyOnWriteArrayList)).add(a2);
        bqga.m112781a(bqgg, new zdz(this, yqe, a, i2, a2), bqfb.INSTANCE);
        return bqgg;
    }

    public final String toString() {
        return String.format("RecordingManager{registrations=%s}", this.f54999b);
    }

    /* renamed from: b */
    private final void m45355b(caah caah, int i) {
        ytq a = mo30970a(408, i);
        a.mo30763b(bzzk.m126356a(caah.f172336b).f172235aH);
        a.mo30754a();
    }

    /* renamed from: b */
    public final List mo30974b(String str) {
        return (List) bmxu.m108565a((List) this.f54999b.get(str), bngx.m109376e());
    }

    /* renamed from: a */
    public final ytq mo30970a(int i, int i2) {
        ytq a = this.f55003f.mo30767a(this.f55004g);
        a.mo30762a(this.f55002e);
        a.mo30755a(i);
        a.mo30765d(i2);
        return a;
    }

    /* renamed from: a */
    public final void mo30971a(caah caah, int i) {
        ytq a = mo30970a(407, i);
        a.mo30763b(bzzk.m126356a(caah.f172336b).f172235aH);
        a.mo30754a();
    }

    /* renamed from: a */
    public final void mo30972a(String str) {
        List<zkh> list = (List) this.f54999b.get(str);
        if (list != null) {
            list.size();
            for (zkh zkh : list) {
                if (!this.f55000c.mo19160a(zkh.f55298a)) {
                    ((bnsl) f54998a.mo68388c()).mo68420a("Failed to remove listener for registration %s", zkh);
                }
            }
            this.f54999b.remove(str);
            mo30970a(409, 2).mo30754a();
        }
    }

    /* renamed from: a */
    public final boolean mo30973a(yqe yqe) {
        zkh zkh;
        String str = yqe.f54380a;
        caah a = yyo.m45042a(yqe.f54381b);
        List list = (List) this.f54999b.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zkh = null;
                    break;
                }
                zkh = (zkh) it.next();
                if (zkh.f55301d.equals(yqe)) {
                    break;
                }
            }
            if (zkh != null) {
                if (this.f55000c.mo19160a(zkh.f55298a)) {
                    list.remove(zkh);
                    this.f54999b.remove(str, bngx.m109376e());
                    m45355b(a, 50);
                    return true;
                }
                m45355b(a, 3);
                return false;
            } else if (cdyu.m135387e() && m45354b(yqe) == -1) {
                return true;
            } else {
                ((bnsl) f54998a.mo68387b()).mo68420a("Recording listener not found for the specified subscription: %s", yqe);
                m45355b(a, 51);
                return false;
            }
        } else if (cdyu.m135387e() && m45354b(yqe) == -1) {
            return true;
        } else {
            ((bnsl) f54998a.mo68387b()).mo68420a("Couldn't find any registrations for %s", yqe);
            m45355b(a, 51);
            return false;
        }
    }
}
