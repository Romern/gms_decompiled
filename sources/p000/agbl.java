package p000;

import android.text.TextUtils;
import com.google.android.gms.mdns.MdnsServiceInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: agbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agbl {

    /* renamed from: a */
    public static final agcm f65147a = new agcm("MdnsServiceTypeClient");

    /* renamed from: b */
    public final String f65148b;

    /* renamed from: c */
    public final String[] f65149c;

    /* renamed from: d */
    public final agbt f65150d;

    /* renamed from: e */
    public final ScheduledExecutorService f65151e;

    /* renamed from: f */
    public final Object f65152f = new Object();

    /* renamed from: g */
    public final Set f65153g = new C1225nr();

    /* renamed from: h */
    public final Map f65154h = new HashMap();

    /* renamed from: i */
    public long f65155i = 0;

    /* renamed from: j */
    public Future f65156j;

    public agbl(String str, agbt agbt, ScheduledExecutorService scheduledExecutorService) {
        this.f65148b = str;
        this.f65150d = agbt;
        this.f65151e = scheduledExecutorService;
        this.f65149c = TextUtils.split(str, "\\.");
    }

    /* renamed from: a */
    public static MdnsServiceInfo m53875a(agat agat, String[] strArr) {
        String str;
        String str2;
        String[] strArr2 = agat.mo35164c().f65115b;
        int i = agat.mo35164c().f65114a;
        if (agat.mo35167f()) {
            str = agat.mo35166e().f65078b.getHostAddress();
        } else {
            str = null;
        }
        if (agat.mo35169h()) {
            str2 = agat.mo35168g().f65077a.getHostAddress();
        } else {
            str2 = null;
        }
        return new MdnsServiceInfo(agat.mo35171j(), strArr, agat.mo35162b(), strArr2, i, str, str2, Collections.unmodifiableList(agat.mo35165d().f65197a));
    }

    /* renamed from: a */
    public final synchronized void mo35189a(int i, int i2) {
        for (agbb agbb : this.f65153g) {
            agbb.mo23433a(i, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo35190a(agat agat) {
        if (agat.mo35172k()) {
            String j = agat.mo35171j();
            this.f65154h.remove(j);
            for (agbb agbb : this.f65153g) {
                agbb.mo23436a(j);
            }
            return;
        }
        agat agat2 = (agat) this.f65154h.get(agat.mo35171j());
        boolean z = true;
        boolean z2 = false;
        if (agat2 == null) {
            this.f65154h.put(agat.mo35171j(), agat);
        } else if (agat2.mo35161a(agat)) {
            agat = agat2;
            z = false;
            z2 = true;
        } else {
            agat = agat2;
            z = false;
        }
        if (agat.mo35170i()) {
            if (!z) {
                if (!z2) {
                }
            }
            MdnsServiceInfo a = m53875a(agat, this.f65149c);
            for (agbb agbb2 : this.f65153g) {
                if (z) {
                    agbb2.mo23435a(a);
                } else {
                    agbb2.mo23439b(a);
                }
            }
        }
    }
}
