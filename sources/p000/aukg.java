package p000;

import android.metrics.LogMaker;
import android.metrics.MetricsReader;
import android.util.Log;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: aukg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aukg implements aujh {

    /* renamed from: e */
    private static aukf f91970e;

    /* renamed from: a */
    final aukh f91971a = new aukh();

    /* renamed from: b */
    final MetricsReader f91972b = new MetricsReader();

    /* renamed from: c */
    public long f91973c;

    /* renamed from: d */
    public long f91974d = 0;

    /* renamed from: f */
    private long f91975f = Long.MAX_VALUE;

    /* renamed from: c */
    public static final void m77215c(auji auji) {
        auji.mo50586a(10800000);
    }

    /* renamed from: b */
    public final void mo50605b() {
        this.f91975f = Long.MAX_VALUE;
        this.f91974d = 0;
        this.f91972b.reset();
        while (this.f91972b.hasNext()) {
            LogMaker next = this.f91972b.next();
            this.f91975f = Math.min(this.f91975f, next.getTimestamp());
            this.f91974d = Math.max(this.f91974d, next.getTimestamp());
        }
    }

    /* renamed from: a */
    public final void mo50582a(auji auji) {
        cgzf.m147724c();
        if (cgzf.m147725d()) {
            this.f91972b.read(0);
            this.f91973c = System.currentTimeMillis();
            mo50605b();
            aukf aukf = f91970e;
            if (aukf == null || !aukf.isAlive()) {
                cgzf.m147724c();
                long j = this.f91973c;
                if (j == 0) {
                    j = System.currentTimeMillis();
                    this.f91973c = j;
                }
                long j2 = this.f91974d;
                if (j2 != 0) {
                    j = j2;
                }
                aukf aukf2 = new aukf(auji, this, j);
                f91970e = aukf2;
                aukf2.start();
            } else {
                cgzf.m147724c();
            }
            m77215c(auji);
        }
    }

    /* renamed from: b */
    public final void mo50584b(auji auji) {
        int i;
        auji auji2 = auji;
        boolean c = cgzf.m147724c();
        if (cgzf.m147725d()) {
            long c2 = auji2.mo50595c("oc.lastProcessing");
            if (c2 > 0) {
                c2 = Math.min(c2, System.currentTimeMillis());
            }
            this.f91972b.reset();
            boolean z = true;
            boolean z2 = true;
            int i2 = 0;
            while (this.f91972b.hasNext()) {
                LogMaker next = this.f91972b.next();
                if (next.getTimestamp() > c2) {
                    aukh aukh = this.f91971a;
                    int category = next.getCategory();
                    if (category == 803) {
                        cgzf.m147724c();
                        String counterName = next.getCounterName();
                        if (counterName != null) {
                            auji2.mo50592b(counterName.length() == 0 ? new String("tron_varz_") : "tron_varz_".concat(counterName), next.getCounterValue());
                        }
                    } else if (category != 804) {
                        boolean c3 = cgzf.m147724c();
                        try {
                            bxvd b = auji.mo50591b();
                            Object[] serialize = next.serialize();
                            for (int i3 = 0; i3 < serialize.length; i3 += 2) {
                                aukh.f91976a.mo50607a(((Integer) serialize[i3]).intValue(), serialize[i3 + 1], b);
                            }
                            auki auki = aukh.f91976a;
                            int i4 = auki.f91978b;
                            if (cgzf.m147724c() && (i = auki.f91978b) > 0) {
                                StringBuilder sb = new StringBuilder(44);
                                sb.append("Attempted to log ");
                                sb.append(i);
                                sb.append(" problem fields.");
                                sb.toString();
                            }
                            auki.f91978b = 0;
                            auji2.mo50588a(b);
                            if (i4 != 0) {
                                bkb a = bkb.m3247a(((bzzx) b.f164949b).f172275d);
                                if (a == null) {
                                    a = bkb.VIEW_UNKNOWN;
                                }
                                auji2.mo50589a("tron_bad_fields", a.f4944CA);
                            }
                        } catch (ClassCastException e) {
                            if (c3) {
                                Log.e("SysuiMultiActionParser", "unexpected operand type: ", e);
                            }
                        }
                    } else {
                        cgzf.m147724c();
                        String counterName2 = next.getCounterName();
                        if (counterName2 != null) {
                            String str = counterName2.length() == 0 ? new String("tron_varz_") : "tron_varz_".concat(counterName2);
                            if (next.isLongCounterBucket()) {
                                auji2.mo50590a(str, next.getCounterBucket());
                            } else {
                                auji2.mo50589a(str, (int) next.getCounterBucket());
                            }
                        }
                    }
                    i2++;
                    z = false;
                }
                z2 = false;
            }
            auji2.mo50589a("tron_items_per_collection", i2);
            long j = this.f91974d;
            if (j == 0) {
                j = this.f91973c;
            }
            if (c2 != 0) {
                auji2.mo50590a("tron_last_heart_minutes", (j - c2) / 60000);
            }
            auji2.mo50593b("oc.lastProcessing", Math.max(c2, j));
            if (c && !z2 && !z) {
                String format = DateFormat.getDateTimeInstance().format(new Date(this.f91975f));
                String format2 = DateFormat.getDateTimeInstance().format(new Date(this.f91974d));
                StringBuilder sb2 = new StringBuilder(String.valueOf(format).length() + 23 + String.valueOf(format2).length());
                sb2.append("MetricsReader from ");
                sb2.append(format);
                sb2.append(" to ");
                sb2.append(format2);
                sb2.toString();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo50583a() {
        aukf aukf = f91970e;
        return aukf != null && aukf.isAlive();
    }
}
