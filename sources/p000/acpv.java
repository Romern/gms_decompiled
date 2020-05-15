package p000;

import android.os.SystemClock;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: acpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acpv {

    /* renamed from: a */
    private static final long f60452a = SystemClock.elapsedRealtime();

    /* renamed from: b */
    private static final Map f60453b = new IdentityHashMap();

    /* renamed from: c */
    private static final Map f60454c = new HashMap();

    /* renamed from: d */
    private static final Queue f60455d = bnfd.m109230a(30);

    private acpv() {
    }

    /* renamed from: a */
    public static bpza m49682a() {
        bxvd da = bpza.f139971f.mo74144da();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (acpv.class) {
            for (Map.Entry entry : f60453b.entrySet()) {
                acpn acpn = (acpn) entry.getKey();
                bxvd da2 = bpyy.f139961d.mo74144da();
                bxvd da3 = bpyz.f139966d.mo74144da();
                bqbd bqbd = acpn.f60436g;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bpyz bpyz = (bpyz) da3.f164949b;
                bpyz.f139969b = bqbd.mo3214a();
                bpyz.f139968a |= 1;
                String str = acpn.f60439j;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bpyz bpyz2 = (bpyz) da3.f164949b;
                str.getClass();
                bpyz2.f139968a |= 2;
                bpyz2.f139970c = str;
                bpyz bpyz3 = (bpyz) da3.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpyy bpyy = (bpyy) da2.f164949b;
                bpyz3.getClass();
                bpyy.f139964b = bpyz3;
                bpyy.f139963a |= 1;
                long j = elapsedRealtime - ((acpu) entry.getValue()).f60451b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpyy bpyy2 = (bpyy) da2.f164949b;
                bpyy2.f139963a |= 2;
                bpyy2.f139965c = j;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpza bpza = (bpza) da.f164949b;
                bpyy bpyy3 = (bpyy) da2.mo74062i();
                bpyy3.getClass();
                if (!bpza.f139974b.mo73666a()) {
                    bpza.f139974b = GeneratedMessageLite.m124021a(bpza.f139974b);
                }
                bpza.f139974b.add(bpyy3);
            }
            for (acpr acpr : f60455d) {
                bxvd da4 = bpyx.f139955e.mo74144da();
                bpyz b = m49687b(acpr.f60443a);
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bpyx bpyx = (bpyx) da4.f164949b;
                b.getClass();
                bpyx.f139958b = b;
                int i = bpyx.f139957a | 1;
                bpyx.f139957a = i;
                long j2 = acpr.f60445c.f60451b;
                long j3 = acpr.f60444b.f60451b;
                int i2 = i | 2;
                bpyx.f139957a = i2;
                bpyx.f139959c = j2 - j3;
                bpyx.f139957a = i2 | 4;
                bpyx.f139960d = elapsedRealtime - j3;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpza bpza2 = (bpza) da.f164949b;
                bpyx bpyx2 = (bpyx) da4.mo74062i();
                bpyx2.getClass();
                if (!bpza2.f139975c.mo73666a()) {
                    bpza2.f139975c = GeneratedMessageLite.m124021a(bpza2.f139975c);
                }
                bpza2.f139975c.add(bpyx2);
            }
            for (Map.Entry entry2 : f60454c.entrySet()) {
                acpt acpt = (acpt) entry2.getValue();
                bxvd da5 = bpyw.f139949e.mo74144da();
                bpyz b2 = m49687b((acps) entry2.getKey());
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bpyw bpyw = (bpyw) da5.f164949b;
                b2.getClass();
                bpyw.f139952b = b2;
                int i3 = bpyw.f139951a | 1;
                bpyw.f139951a = i3;
                int i4 = acpt.f60449b;
                int i5 = i3 | 2;
                bpyw.f139951a = i5;
                bpyw.f139953c = i4;
                long j4 = acpt.f60448a;
                bpyw.f139951a = i5 | 4;
                bpyw.f139954d = j4;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpza bpza3 = (bpza) da.f164949b;
                bpyw bpyw2 = (bpyw) da5.mo74062i();
                bpyw2.getClass();
                if (!bpza3.f139976d.mo73666a()) {
                    bpza3.f139976d = GeneratedMessageLite.m124021a(bpza3.f139976d);
                }
                bpza3.f139976d.add(bpyw2);
            }
        }
        long j5 = elapsedRealtime - f60452a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpza bpza4 = (bpza) da.f164949b;
        bpza4.f139973a |= 1;
        bpza4.f139977e = j5;
        return (bpza) da.mo74062i();
    }

    /* renamed from: b */
    private static bpyz m49687b(acps acps) {
        bxvd da = bpyz.f139966d.mo74144da();
        bqbd bqbd = acps.f60447b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpyz bpyz = (bpyz) da.f164949b;
        bpyz.f139969b = bqbd.mo3214a();
        bpyz.f139968a |= 1;
        String str = acps.f60446a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpyz bpyz2 = (bpyz) da.f164949b;
        str.getClass();
        bpyz2.f139968a |= 2;
        bpyz2.f139970c = str;
        return (bpyz) da.mo74062i();
    }

    /* renamed from: c */
    private static String m49690c(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US).format(new Date(j));
    }

    /* renamed from: b */
    private static String m49688b(long j) {
        if (j < 0) {
            return "";
        }
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes - TimeUnit.HOURS.toMinutes(hours)), Long.valueOf(seconds - TimeUnit.MINUTES.toSeconds(minutes)), Long.valueOf(j - TimeUnit.SECONDS.toMillis(seconds)));
    }

    /* renamed from: b */
    public static void m49689b(acpn acpn) {
        if (celx.m137223c()) {
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            acpu acpu = new acpu(currentTimeMillis, elapsedRealtime);
            synchronized (acpv.class) {
                acpu acpu2 = (acpu) f60453b.remove(acpn);
                if (acpu2 != null) {
                    acps acps = new acps(acpn);
                    f60455d.add(new acpr(acps, acpu2, acpu));
                    acpt acpt = (acpt) f60454c.get(acps);
                    if (acpt == null) {
                        acpt = new acpt();
                        f60454c.put(acps, acpt);
                    }
                    acpt.f60449b++;
                    acpt.f60448a += elapsedRealtime - acpu2.f60451b;
                    return;
                }
                absg.m48206e("Task not running: %s", acpn.toString());
            }
        }
    }

    /* renamed from: a */
    private static String m49683a(acps acps) {
        return String.format(Locale.US, "%-40s | %s", acps.f60447b.name(), acps.f60446a);
    }

    /* renamed from: a */
    public static void m49684a(acpn acpn) {
        if (celx.m137223c()) {
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (acpv.class) {
                if (f60453b.put(acpn, new acpu(currentTimeMillis, elapsedRealtime)) != null) {
                    absg.m48206e("Task already running: %s", acpn.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m49685a(PrintWriter printWriter) {
        if (celx.m137223c()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (acpv.class) {
                if (!f60453b.isEmpty()) {
                    ArrayList<Map.Entry> arrayList = new ArrayList(f60453b.entrySet());
                    Collections.sort(arrayList, new acpo());
                    printWriter.println("\nRunning Tasks:");
                    printWriter.format("%-23s | %s | %-40s | %s\n", "Start Time", "Duration (hh:mm:ss.fff)", "Task Name", "Package Name");
                    for (Map.Entry entry : arrayList) {
                        acpu acpu = (acpu) entry.getValue();
                        printWriter.format("%s | %-23s | %s\n", m49690c(acpu.f60450a), m49688b(elapsedRealtime - acpu.f60451b), m49683a(new acps((acpn) entry.getKey())));
                    }
                }
                if (!f60455d.isEmpty()) {
                    ArrayList<acpr> arrayList2 = new ArrayList(f60455d);
                    Collections.sort(arrayList2, new acpp());
                    printWriter.println("\nRecent Finished Tasks:");
                    printWriter.format("%-23s | %-23s | %s | %-40s | %s\n", "Start Time", "End Time", "Duration (hh:mm:ss.fff)", "Task Name", "Package Name");
                    for (acpr acpr : arrayList2) {
                        printWriter.format("%s | %s | %-23s | %s\n", m49690c(acpr.f60444b.f60450a), m49690c(acpr.f60445c.f60450a), m49688b(acpr.f60445c.f60451b - acpr.f60444b.f60451b), m49683a(acpr.f60443a));
                    }
                }
                if (!f60454c.isEmpty()) {
                    ArrayList<Map.Entry> arrayList3 = new ArrayList(f60454c.entrySet());
                    Collections.sort(arrayList3, new acpq());
                    String b = m49688b(elapsedRealtime - f60452a);
                    StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 42);
                    sb.append("\nAggregated Task Stats (total duration: ");
                    sb.append(b);
                    sb.append("):");
                    printWriter.println(sb.toString());
                    printWriter.format("%s | %-11s | %-40s | %s\n", "Total Duration (hh:mm:ss.fff)", "Runs", "Task Name", "Package Name");
                    for (Map.Entry entry2 : arrayList3) {
                        acpt acpt = (acpt) entry2.getValue();
                        printWriter.format("%-29s | (%3d times) | %s\n", m49688b(acpt.f60448a), Integer.valueOf(acpt.f60449b), m49683a((acps) entry2.getKey()));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m49686a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (acpv.class) {
            for (Map.Entry entry : f60453b.entrySet()) {
                if (elapsedRealtime - ((acpu) entry.getValue()).f60451b > j) {
                    return true;
                }
            }
            return false;
        }
    }
}
