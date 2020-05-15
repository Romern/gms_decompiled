package p000;

import android.util.EventLog;
import com.google.android.gms.gcm.GcmChimeraService;

/* renamed from: aamy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aamy {

    /* renamed from: a */
    private static final bnhe f28515a = bnhe.m109410a(-1, "UNKNOWN_NETWORK", 0, "MOBILE", 1, "WIFI");

    /* renamed from: a */
    private static String m21593a(int i) {
        return (String) f28515a.getOrDefault(Integer.valueOf(i), "UNMAPPED_NETWORK_TYPE");
    }

    /* renamed from: a */
    public static void m21594a(aakl aakl, int i) {
        EventLog.writeEvent(204002, 0);
        GcmChimeraService.m24303a("Connected", new Object[0]);
        aakl.f28371a.mo16930a().mo16899a(m21593a(i), "NO_ERROR", true);
    }

    /* renamed from: a */
    public static void m21595a(aakl aakl, int i, int i2) {
        EventLog.writeEvent(204002, (i << 8) + 16777216 + (i2 & 255));
        aakl.f28371a.mo16930a().mo16899a(m21593a(i2), bydk.m124682a(i), false);
    }

    /* renamed from: a */
    public static void m21596a(aakl aakl, int i, int i2, int i3) {
        Integer valueOf = Integer.valueOf(i3);
        EventLog.writeEvent(204003, Integer.valueOf((i2 << 8) + i), valueOf);
        GcmChimeraService.m24303a("Close err:%s time:%d", Integer.valueOf(i), valueOf);
        ((beoj) aakl.f28371a.mo16930a().f28254c.mo6606a()).mo60852a((double) ((long) i3), m21593a(i2), bydk.m124682a(i));
    }

    /* renamed from: a */
    public static void m21597a(bxxb bxxb) {
        if (bxxb instanceof blmo) {
            GcmChimeraService.m24303a("Sent %s", ((blmp) ((blmo) bxxb).f164949b).f126870e);
        } else if (bxxb instanceof blmv) {
            GcmChimeraService.m24303a("Sent Client HB", new Object[0]);
        } else if (bxxb instanceof blms) {
            GcmChimeraService.m24303a("Sent Server HB Ack", new Object[0]);
        } else if (bxxb instanceof blmm) {
            GcmChimeraService.m24303a("Sent Close", new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if ("subscribedfeeds".equals(r5.f126846c) != false) goto L_0x0042;
     */
    /* renamed from: a */
    public static void m21598a(bxxc bxxc) {
        String str;
        if (bxxc instanceof blmp) {
            blmp blmp = (blmp) bxxc;
            String str2 = blmp.f126870e;
            if (!"GSYNC_TICKLE".equals(str2)) {
                if ("com.google.android.gms".equals(blmp.f126870e)) {
                    bxwc bxwc = blmp.f126872g;
                    int size = bxwc.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        blmi blmi = (blmi) bxwc.get(i);
                        i++;
                        if ("gcms".equals(blmi.f126845b)) {
                        }
                    }
                }
                GcmChimeraService.m24303a("Received %s %s", str2, blmp.f126873h);
            }
            int i2 = blmp.f126882q;
            if (i2 != 17) {
                str = "";
            } else {
                str = " reduced";
            }
            String str3 = blmp.f126871f;
            StringBuilder sb = new StringBuilder(str.length() + 23 + String.valueOf(str3).length());
            sb.append("GSync (p=");
            sb.append(i2);
            sb.append(str);
            sb.append("): ");
            sb.append(str3);
            str2 = sb.toString();
            GcmChimeraService.m24303a("Received %s %s", str2, blmp.f126873h);
        } else if (bxxc instanceof blmw) {
            GcmChimeraService.m24303a("Received Server HB", new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m21599a(boolean z, int i, bxxc bxxc, int i2, int i3) {
        String str;
        if (bxxc instanceof blmp) {
            blmp blmp = (blmp) bxxc;
            String str2 = blmp.f126870e;
            String str3 = blmp.f126873h;
            int indexOf = str3.indexOf(37);
            if (indexOf > 0) {
                str3 = str3.substring(0, indexOf);
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
            sb.append(str2);
            sb.append(":");
            sb.append(str3);
            str = sb.toString();
        } else {
            str = "";
        }
        Object[] objArr = new Object[4];
        if (z) {
            i = -i;
        }
        objArr[0] = Integer.valueOf(i);
        objArr[1] = str;
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Integer.valueOf(i3);
        EventLog.writeEvent(204005, objArr);
    }
}
