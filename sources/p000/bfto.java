package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bfto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfto implements bfrx {

    /* renamed from: a */
    public final bmzi f115242a = bmzn.m108681a(bftn.f115241a);

    /* renamed from: b */
    public long f115243b = -1;

    /* renamed from: c */
    public long f115244c = -1;

    /* renamed from: d */
    public final bfte f115245d = new bfte();

    /* renamed from: e */
    public final bsct f115246e;

    /* renamed from: f */
    public final bsdj f115247f;

    /* renamed from: g */
    public bfti f115248g;

    /* renamed from: h */
    private final Context f115249h;

    /* renamed from: i */
    private final bftg f115250i;

    public bfto(Context context, bsct bsct, bsdj bsdj, bftg bftg) {
        this.f115249h = context;
        this.f115246e = bsct;
        this.f115247f = bsdj;
        this.f115250i = bftg;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62254a() {
        this.f115244c = -1;
        this.f115243b = -1;
        this.f115245d.mo62233c();
        this.f115246e.mo70216d();
        this.f115247f.mo70267a(1);
    }

    /* renamed from: b */
    public final void mo62258b(bucw bucw) {
        bxbi bxbi = new bxbi("com.google.android.gms");
        byte[] k = bucw.serializeToBytes();
        PendingIntent a = bfsa.m97673a(this.f115249h, "com.google.android.location.internal.action.ACTION_FLP_COMPUTE_WIFI_LOCATIONS_RESULT");
        bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_COMPUTE_WIFI_LOCATIONS_REQUEST", k);
        bxbi.f161815a.putExtra("com.google.android.location.internal.EXTRA_COMPUTE_WIFI_LOCATIONS_RESPONSE", a);
        bxbi.mo73549a(this.f115249h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62255a(Location location) {
        long time = location.getTime();
        this.f115247f.f144173c.mo70271a(2, time * 1000000, bfqy.m97597a(location, cevw.m138329n()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62256a(bucu bucu) {
        budf budf;
        budf budf2;
        budb budb;
        budf budf3;
        budb budb2;
        budf budf4;
        budc budc;
        bucy bucy;
        int a = buct.m119339a(bucu.f153411a);
        int i = a - 1;
        bsbl bsbl = null;
        if (a == 0) {
            throw null;
        } else if (i == 0) {
            if (bucu.f153411a == 2) {
                budf = (budf) bucu.f153412b;
            } else {
                budf = budf.f153455c;
            }
            int a2 = budd.m119349a(budf.f153457a);
            int i2 = a2 - 1;
            if (a2 == 0) {
                throw null;
            } else if (i2 == 0) {
                bsdk bsdk = this.f115247f.f144172b;
                long j = bucu.f153413c;
                if (bucu.f153411a == 2) {
                    budf2 = (budf) bucu.f153412b;
                } else {
                    budf2 = budf.f153455c;
                }
                if (budf2.f153457a == 1) {
                    budb = (budb) budf2.f153458b;
                } else {
                    budb = budb.f153444c;
                }
                double d = (double) budb.f153446a;
                if (bucu.f153411a == 2) {
                    budf3 = (budf) bucu.f153412b;
                } else {
                    budf3 = budf.f153455c;
                }
                if (budf3.f153457a == 1) {
                    budb2 = (budb) budf3.f153458b;
                } else {
                    budb2 = budb.f153444c;
                }
                bsdk.mo70269a(2, j, d, (double) budb2.f153447b);
            } else if (i2 == 1) {
                this.f115247f.f144172b.mo70270b(2, bucu.f153413c);
            } else if (i2 == 3) {
                bsdk bsdk2 = this.f115247f.f144172b;
                long j2 = bucu.f153413c;
                if (bucu.f153411a == 2) {
                    budf4 = (budf) bucu.f153412b;
                } else {
                    budf4 = budf.f153455c;
                }
                if (budf4.f153457a == 4) {
                    budc = (budc) budf4.f153458b;
                } else {
                    budc = budc.f153449b;
                }
                bsdk2.mo70268a(2, j2, (double) budc.f153451a);
            }
        } else if (i == 1) {
            if (bucu.f153411a == 3) {
                bucy = (bucy) bucu.f153412b;
            } else {
                bucy = bucy.f153423k;
            }
            if (bucy != null) {
                bsbj o = bsbl.m115064o();
                o.mo70178a(bucy.f153426b, bucy.f153427c, Math.round(bucy.f153431g * 1000.0f));
                o.mo70179a(bsbk.GPS);
                if ((bucy.f153425a & 8) != 0) {
                    o.mo70182b(bucy.f153429e);
                }
                if ((bucy.f153425a & 128) != 0) {
                    o.mo70177a(bucy.f153433i);
                }
                if ((4 & bucy.f153425a) != 0) {
                    o.mo70184d(bucy.f153428d);
                }
                if ((bucy.f153425a & 64) != 0) {
                    o.mo70183c(bucy.f153432h);
                }
                if ((bucy.f153425a & 16) != 0) {
                    o.mo70175a((double) bucy.f153430f);
                }
                if ((bucy.f153425a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    o.mo70181b((double) bucy.f153434j);
                }
                bsbl = o.mo70174a();
            }
            this.f115247f.f144173c.mo70271a(2, bucu.f153413c, bsbl);
        } else if (i == 3) {
            this.f115247f.f144175e.mo70265a(2, bucu.f153413c);
        }
    }

    /* renamed from: b */
    public final void mo62259b(List list) {
        Location a;
        Iterator b = this.f115245d.mo62232b();
        while (b.hasNext()) {
            bucu bucu = (bucu) b.next();
            if (bucu.f153411a == 4) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Location location = (Location) it.next();
                    if (bucu.f153413c / 1000000 == location.getTime()) {
                        mo62255a(location);
                        it.remove();
                        break;
                    }
                }
            } else {
                mo62256a(bucu);
            }
        }
        this.f115243b = -1;
        this.f115245d.mo62233c();
        bfti bfti = this.f115248g;
        if (bfti != null) {
            bfqs bfqs = (bfqs) bfti;
            if (TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()) - bfqs.f114919d.mo70214b() < cest.f183409a.mo6606a().flpBluePixelInstantLocationDeliveryMaxTimeDeltaNs() && (a = bfqs.mo62149a(System.currentTimeMillis(), TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()))) != null) {
                bfqs.mo62158c(Collections.singletonList(a));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62257a(bucw bucw) {
        bxwc bxwc = bucw.f153417a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bucu bucu = (bucu) bxwc.get(i);
            if (bucu.f153411a != 2 || ((budf) bucu.f153412b).f153457a != 3) {
                bfte bfte = this.f115245d;
                if (((long) bfte.f115197b.size()) == ((Long) bfte.f115196a.mo6606a()).longValue()) {
                    bucu bucu2 = (bucu) bfte.f115197b.removeFirst();
                }
                bfte.f115197b.add(bucu);
            }
        }
    }

    /* renamed from: a */
    public final void mo62193a(List list) {
        bftg bftg = this.f115250i;
        boolean z = !list.isEmpty();
        if (cest.m138200f()) {
            if (!z) {
                bftg.f115208i++;
            } else {
                bftg.f115207h++;
            }
        }
        if (this.f115245d.mo62234d()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mo62255a((Location) it.next());
            }
            return;
        }
        mo62259b(list);
    }
}
