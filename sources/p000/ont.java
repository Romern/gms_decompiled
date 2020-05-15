package p000;

import android.content.Context;
import android.os.Handler;
import com.felicanetworks.sdu.ErrorInfo;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;

/* renamed from: ont */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ont implements Runnable {

    /* renamed from: a */
    private static final bnsn f38029a = odk.m28481a("CAR.SERVICE");

    /* renamed from: b */
    private final Map f38030b = new HashMap();

    /* renamed from: c */
    private final Runnable f38031c = new ons(this);

    /* renamed from: d */
    private final SimpleDateFormat f38032d = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS", Locale.US);

    /* renamed from: e */
    private final Context f38033e;

    /* renamed from: f */
    private final Handler f38034f;

    /* renamed from: g */
    private final ony f38035g;

    /* renamed from: h */
    private final onp f38036h;

    /* renamed from: i */
    private final Queue f38037i;

    /* renamed from: j */
    private final boolean f38038j = ccvx.f180056a.mo6606a().mo76903h();

    /* renamed from: k */
    private onx f38039k = onx.f38055a;

    /* renamed from: l */
    private int f38040l;

    /* renamed from: m */
    private boolean f38041m = true;

    public ont(Context context, Handler handler, ony ony, onp onp, int i) {
        this.f38033e = context;
        this.f38034f = handler;
        this.f38035g = ony;
        this.f38036h = onp;
        this.f38037i = bnfd.m109230a(i);
    }

    /* renamed from: a */
    private final void m29255a(String str) {
        int i;
        Iterator it = this.f38035g.mo22357a().entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            onv onv = (onv) entry.getValue();
            onv onv2 = (onv) this.f38030b.get(str2);
            if (onv != null && !onv.equals(onv2)) {
                String valueOf = String.valueOf(onv);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 26 + String.valueOf(valueOf).length());
                sb.append("Port status changed for ");
                sb.append(str2);
                sb.append(": ");
                sb.append(valueOf);
                String sb2 = sb.toString();
                bnsi d = f38029a.mo68390d();
                d.mo68432a("ont", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68420a("%s", sb2);
                this.f38030b.put(str2, onv);
                Queue queue = this.f38037i;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(sb2).length());
                sb3.append(str);
                sb3.append(" ");
                sb3.append(sb2);
                queue.add(sb3.toString());
                onp onp = this.f38036h;
                if (!onv.equals(onp.f38021c)) {
                    List list = onp.f38019a;
                    int size = list.size();
                    while (i < size) {
                        ((onm) list.get(i)).mo22348a(onv);
                        i++;
                    }
                    onp.f38021c = onv;
                }
            }
        }
        onx e = this.f38035g.mo22379e();
        if (e != null && !e.equals(this.f38039k)) {
            m29257a(this.f38039k.mo22332b(), e.mo22332b(), ofc.CONNECTED, ofc.DISCONNECTED);
            m29257a(this.f38039k.mo22331a(), e.mo22331a(), ofc.CONFIGURED, ofc.LOST_CONFIGURED);
            m29257a(this.f38039k.mo22334d(), e.mo22334d(), ofc.ENTERED_ACCESSORY_MODE, ofc.EXITED_ACCESSORY_MODE);
            m29257a(this.f38039k.mo22335e(), e.mo22335e(), ofc.ENTERED_ADB_MODE, ofc.EXITED_ADB_MODE);
            m29257a(this.f38039k.mo22337f(), e.mo22337f(), ofc.ENTERED_AUDIO_SOURCE_MODE, ofc.EXITED_AUDIO_SOURCE_MODE);
            m29257a(this.f38039k.mo22338g(), e.mo22338g(), ofc.ENTERED_MTP_MODE, ofc.EXITED_MTP_MODE);
            m29257a(this.f38039k.mo22339h(), e.mo22339h(), ofc.ENTERED_PTP_MODE, ofc.EXITED_PTP_MODE);
            m29257a(this.f38039k.mo22333c(), e.mo22333c(), ofc.DATA_UNLOCKED, ofc.DATA_LOCKED);
            onp onp2 = this.f38036h;
            if (!onp2.f38020b.equals(e)) {
                List list2 = onp2.f38019a;
                int size2 = list2.size();
                while (i < size2) {
                    ((onm) list2.get(i)).mo22349a(e);
                    i++;
                }
                onp2.f38020b = e;
            }
            String valueOf2 = String.valueOf(e);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 23);
            sb4.append("Usb status changed to: ");
            sb4.append(valueOf2);
            String sb5 = sb4.toString();
            bnsi d2 = f38029a.mo68390d();
            d2.mo68432a("ont", "a", 186, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68420a("%s", sb5);
            this.f38039k = e;
            Queue queue2 = this.f38037i;
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(sb5).length());
            sb6.append(str);
            sb6.append(" ");
            sb6.append(sb5);
            queue2.add(sb6.toString());
        }
    }

    /* renamed from: b */
    public final synchronized void mo22366b() {
        this.f38034f.removeCallbacks(this);
        String format = this.f38032d.format(new Date());
        m29255a(format);
        this.f38041m = true;
        this.f38039k = onx.f38055a;
        this.f38030b.clear();
        onp onp = this.f38036h;
        List list = onp.f38019a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((onm) list.get(i)).mo22352b();
        }
        onp.mo22360a();
        ofd.m28611a(this.f38033e, "com.google.android.gms.car.USB_MONITOR_LIFETIME", ofa.COMPLETED);
        Queue queue = this.f38037i;
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 20);
        sb.append(format);
        sb.append(" Stopped USB monitor");
        queue.add(sb.toString());
        bnsi d = f38029a.mo68390d();
        d.mo68432a("ont", "b", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Stopped USB monitor");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized List mo22367c() {
        return bngx.m109368a((Collection) this.f38037i);
    }

    public final void run() {
        if (!this.f38041m) {
            m29255a(this.f38032d.format(new Date()));
            this.f38034f.postDelayed(this, (long) this.f38040l);
        }
    }

    /* renamed from: a */
    private final void m29256a(onx onx, String str) {
        if (onx != null && !onx.equals(this.f38039k)) {
            m29257a(this.f38039k.mo22332b(), onx.mo22332b(), ofc.CONNECTED, ofc.DISCONNECTED);
            m29257a(this.f38039k.mo22331a(), onx.mo22331a(), ofc.CONFIGURED, ofc.LOST_CONFIGURED);
            m29257a(this.f38039k.mo22334d(), onx.mo22334d(), ofc.ENTERED_ACCESSORY_MODE, ofc.EXITED_ACCESSORY_MODE);
            m29257a(this.f38039k.mo22335e(), onx.mo22335e(), ofc.ENTERED_ADB_MODE, ofc.EXITED_ADB_MODE);
            m29257a(this.f38039k.mo22337f(), onx.mo22337f(), ofc.ENTERED_AUDIO_SOURCE_MODE, ofc.EXITED_AUDIO_SOURCE_MODE);
            m29257a(this.f38039k.mo22338g(), onx.mo22338g(), ofc.ENTERED_MTP_MODE, ofc.EXITED_MTP_MODE);
            m29257a(this.f38039k.mo22339h(), onx.mo22339h(), ofc.ENTERED_PTP_MODE, ofc.EXITED_PTP_MODE);
            m29257a(this.f38039k.mo22333c(), onx.mo22333c(), ofc.DATA_UNLOCKED, ofc.DATA_LOCKED);
            onp onp = this.f38036h;
            if (!onp.f38020b.equals(onx)) {
                List list = onp.f38019a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((onm) list.get(i)).mo22349a(onx);
                }
                onp.f38020b = onx;
            }
            String valueOf = String.valueOf(onx);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Usb status changed to: ");
            sb.append(valueOf);
            String sb2 = sb.toString();
            bnsi d = f38029a.mo68390d();
            d.mo68432a("ont", "a", 186, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("%s", sb2);
            this.f38039k = onx;
            Queue queue = this.f38037i;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(sb2).length());
            sb3.append(str);
            sb3.append(" ");
            sb3.append(sb2);
            queue.add(sb3.toString());
        }
    }

    /* renamed from: a */
    private final void m29257a(boolean z, boolean z2, ofc ofc, ofc ofc2) {
        if (z != z2) {
            Context context = this.f38033e;
            if (!z2) {
                ofc = ofc2;
            }
            ofd.m28611a(context, "com.google.android.gms.car.USB_STATE_CHANGED", ofc);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo22364a() {
        if (this.f38038j) {
            this.f38034f.removeCallbacks(this.f38031c);
            this.f38034f.postDelayed(this.f38031c, ccvx.f180056a.mo6606a().mo76913r());
            return;
        }
        mo22366b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo22365a(int i) {
        this.f38040l = i;
        if (this.f38038j) {
            this.f38034f.removeCallbacks(this.f38031c);
        }
        if (this.f38041m) {
            bnsi d = f38029a.mo68390d();
            d.mo68432a("ont", "a", 72, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Starting USB monitor");
            String format = this.f38032d.format(new Date());
            Queue queue = this.f38037i;
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(format);
            sb.append(" Starting USB monitor");
            queue.add(sb.toString());
            this.f38041m = false;
            onp onp = this.f38036h;
            onp.mo22360a();
            List list = onp.f38019a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((onm) list.get(i2)).mo22347a();
            }
            ofd.m28611a(this.f38033e, "com.google.android.gms.car.USB_MONITOR_LIFETIME", ofa.STARTED);
            m29255a(format);
            this.f38034f.postDelayed(this, (long) this.f38040l);
        }
    }
}
