package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: omy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class omy extends omx {

    /* renamed from: a */
    private static final bnsn f37977a = odk.m28481a("CAR.SERVICE");

    /* renamed from: b */
    private final boolean f37978b = ccwa.m131880b();

    /* renamed from: c */
    private final ony f37979c;

    /* renamed from: d */
    private final ont f37980d;

    /* renamed from: e */
    private final Context f37981e;

    /* renamed from: f */
    private final SharedPreferences f37982f;

    /* renamed from: g */
    private final Set f37983g = new HashSet();

    public omy(ony ony, ont ont, Context context) {
        this.f37979c = ony;
        this.f37980d = ont;
        this.f37981e = context;
        this.f37982f = context.getSharedPreferences("reset_prefs", 0);
    }

    /* renamed from: a */
    public final synchronized void mo22342a(PrintWriter printWriter) {
        if (this.f37978b && this.f37979c.mo22378d()) {
            printWriter.println("\nCarServiceUsbMonitor");
            printWriter.println("Current");
            for (Map.Entry entry : this.f37979c.mo22357a().entrySet()) {
                String str = (String) entry.getKey();
                String valueOf = String.valueOf(entry.getValue());
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(valueOf).length());
                sb.append("Port status for ");
                sb.append(str);
                sb.append(": ");
                sb.append(valueOf);
                printWriter.println(sb.toString());
            }
            String valueOf2 = String.valueOf(this.f37979c.mo22379e());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 9);
            sb2.append("UsbState ");
            sb2.append(valueOf2);
            printWriter.println(sb2.toString());
            List c = this.f37980d.mo22367c();
            if (!c.isEmpty()) {
                printWriter.println("History");
                int size = c.size();
                for (int i = 0; i < size; i++) {
                    String str2 = (String) c.get(i);
                    if (str2 != null) {
                        printWriter.println(str2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo22343a(Object obj) {
        if (this.f37978b && this.f37979c.mo22378d() && this.f37983g.remove(obj) && this.f37983g.isEmpty()) {
            this.f37980d.mo22364a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo22344a(Object obj, int i) {
        if (this.f37978b && this.f37979c.mo22378d()) {
            this.f37983g.add(obj);
            this.f37980d.mo22365a(i);
        }
    }

    /* renamed from: a */
    public final boolean mo22345a() {
        if (this.f37978b && ccvx.f180056a.mo6606a().mo76912q()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f37982f.getLong("reset_timestamp", -1);
            if (j == -1 || currentTimeMillis - j >= ccvx.f180056a.mo6606a().mo76909n()) {
                bnsi c = f37977a.mo68388c();
                c.mo68432a("omy", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Attempting to reset the USB connection");
                ofd.m28611a(this.f37981e, "com.google.android.gms.car.USB_RESET", ofa.STARTED);
                this.f37982f.edit().putLong("reset_timestamp", System.currentTimeMillis()).apply();
                try {
                    this.f37979c.mo22359c();
                    return true;
                } catch (onn e) {
                    bnsi c2 = f37977a.mo68388c();
                    c2.mo68437a(e);
                    c2.mo68432a("omy", "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c2.mo68405a("Failed to reset usb connection.");
                    return false;
                }
            } else {
                ofd.m28611a(this.f37981e, "com.google.android.gms.car.USB_ISSUE_FOUND", ofb.USB_RESET_SUPPRESSED);
                bnsi c3 = f37977a.mo68388c();
                c3.mo68432a("omy", "a", 121, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c3.mo68405a("USB connection has been reset recently");
            }
        }
        return false;
    }
}
