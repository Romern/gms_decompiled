package p000;

import android.database.sqlite.SQLiteDatabase;
import android.net.NetworkKey;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: akkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akkf implements akjk {

    /* renamed from: a */
    private static final bnic f72146a = bnic.m109494a("clear", "help", "inject", "list", "summary", "request_scores", new String[0]);

    /* renamed from: b */
    private final akmh f72147b;

    /* renamed from: c */
    private final akmz f72148c;

    /* renamed from: d */
    private final akni f72149d;

    public akkf(akmh akmh, akmz akmz, akni akni) {
        this.f72147b = akmh;
        this.f72148c = akmz;
        this.f72149d = akni;
    }

    /* renamed from: a */
    private static void m59909a(PrintWriter printWriter, String str, Object... objArr) {
        printWriter.printf(str, objArr);
        printWriter.printf("\n", new Object[0]);
        eoa.m10826b("NetRec", str, objArr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akmy.a(int, boolean):java.util.List
     arg types: [int, int]
     candidates:
      akmy.a(java.util.Collection, int):int
      akmy.a(int, boolean):java.util.List */
    /* renamed from: a */
    public final void mo39503a(PrintWriter printWriter, String[] strArr) {
        String[] strArr2;
        String str;
        int i;
        int length = strArr.length;
        if (length >= 2 && akjl.m59883a(strArr)) {
            str = strArr[1].toLowerCase();
            strArr2 = (String[]) Arrays.copyOfRange(strArr, 2, length);
        } else {
            strArr2 = new String[0];
            str = "summary";
        }
        bmyx b = bmyx.m108640a('=').mo66921b(2);
        HashMap hashMap = new HashMap();
        for (String str2 : strArr2) {
            if (str2.startsWith("--")) {
                List c = b.mo66925c((CharSequence) str2.substring(2));
                if (c.size() == 2) {
                    hashMap.put((String) c.get(0), (String) c.get(1));
                } else {
                    hashMap.put((String) c.get(0), null);
                }
            }
        }
        if ("summary".equals(str)) {
            m59909a(printWriter, "Cache summary:", new Object[0]);
            akmz akmz = this.f72148c;
            StringBuilder sb = new StringBuilder();
            sb.append("Cache has a total of ");
            SQLiteDatabase b2 = akmz.f72284a.mo39578b();
            if (b2 != null) {
                i = akmy.m60048b(b2);
            } else {
                i = 0;
            }
            sb.append(i);
            sb.append(" entries\nSample of max 7 updated entries:\n");
            for (akna akna : akmz.f72284a.mo39571a(7, false)) {
                sb.append(akna);
                sb.append("\n");
            }
            sb.append("Sample of max 7 pending entries:\n");
            List a = akmz.f72284a.mo39570a(7);
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append((NetworkKey) a.get(i2));
                sb.append("\n");
            }
            printWriter.println(sb.toString());
        }
        if ("clear".equals(str)) {
            m59909a(printWriter, "Cleared cache of %d entries", Integer.valueOf(this.f72148c.f72284a.mo39580c()));
        } else if ("help".equals(str)) {
            printWriter.println("Query and trigger NetRec module for debug purposes with:");
            printWriter.println("dumpsys activity service PersistentBoundBrokerService netrec [cmd] [flags]");
            printWriter.print("Supported commands: ");
            printWriter.println(akkd.f72143a.mo66874a((Iterable) f72146a));
            printWriter.println("Without a command, prints a simple summary");
            printWriter.println("clear: clear cache contents");
            printWriter.println("list: list all cache contents");
            printWriter.println("inject: inject scores into cache");
            printWriter.println("  inject --scores=\"foo\\|01:01:01:01:01:01\\|-5:1:2:4\"");
            printWriter.println("request_scores: trigger a requestScores call");
            printWriter.println("  request_scores --network_keys=\"foo\\ one\\|01:01:01:01:01:01,bar\\ two\\|02:02:02:02:02:02\"");
        } else if (!"inject".equals(str)) {
            if ("list".equals(str)) {
                m59909a(printWriter, "All cache entries:", new Object[0]);
                this.f72148c.f72284a.mo39575a(printWriter);
            } else if (!"request_scores".equals(str)) {
                printWriter.printf("Supported commands: %s\n", akkd.f72143a.mo66874a((Iterable) f72146a));
            } else if (hashMap.containsKey("network_keys")) {
                m59909a(printWriter, "Triggering onRequestScores for %s", hashMap.get("network_keys"));
                try {
                    this.f72147b.mo39559a(akkg.m59911a(akkd.f72144b.mo66925c((CharSequence) hashMap.get("network_keys"))));
                } catch (IllegalArgumentException e) {
                    m59909a(printWriter, "Could not parse --network_keys argument: %s", e.getMessage());
                }
            } else {
                m59909a(printWriter, "requires the --network_keys argument", new Object[0]);
            }
        } else if (hashMap.containsKey("scores")) {
            try {
                m59909a(printWriter, "Injected scores: %d", Integer.valueOf(this.f72149d.mo39584a(aknc.m60070a(akkd.f72144b.mo66925c((CharSequence) hashMap.get("scores"))))));
            } catch (IllegalArgumentException e2) {
                m59909a(printWriter, "Could not parse --scores: %s", e2.getMessage());
            }
        } else {
            m59909a(printWriter, "requires the --scores argument", new Object[0]);
        }
    }
}
