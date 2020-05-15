package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: bers */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bers implements bgmd {

    /* renamed from: a */
    private static final SimpleDateFormat f112236a = new SimpleDateFormat("MM/dd/yyyy h:mm a", Locale.US);

    /* renamed from: b */
    private final bglx f112237b;

    /* renamed from: c */
    private final bfor f112238c;

    public bers(bglx bglx, bfor bfor) {
        this.f112237b = bglx;
        this.f112238c = bfor;
    }

    /* renamed from: a */
    private static String m95606a(String str, String str2, String str3, String str4, String str5) {
        return str.replace("{datetime}", str2).replace("{timestamp}", str3).replace("{hash}", str4).replace("{version}", str5);
    }

    /* renamed from: a */
    private final void m95607a(String str, String str2, String str3, String str4, int i) {
        if (!str3.isEmpty()) {
            String l = Long.toString(System.currentTimeMillis());
            String format = f112236a.format(new Date(System.currentTimeMillis()));
            String num = Integer.toString(i);
            String a = m95606a(str3, format, l, str4, num);
            this.f112237b.mo62766a(m95606a(str, format, l, str4, num), m95606a(str2, format, l, str4, num), a, true, -1);
        }
    }

    /* renamed from: a */
    public final void mo61065a(int i) {
        if (cetp.m138233c() && cetp.f183425a.mo6606a().chreCcHealthNotificationEnabled()) {
            String num = Integer.toString(i);
            this.f112237b.mo62766a(cetp.f183425a.mo6606a().chreCcHealthNotificationTitle().replace("{version}", num), cetp.f183425a.mo6606a().chreCcHealthNotificationText().replace("{version}", num), null, false, 60000);
        }
    }

    /* renamed from: a */
    public final boolean mo61066a(bgmc bgmc) {
        boolean z;
        bgmc bgmc2 = bgmc;
        String format = String.format(Locale.US, "%08x%08x%08x%08x", Integer.valueOf(Float.floatToIntBits(bgmc2.f116807a)), Integer.valueOf(Float.floatToIntBits(bgmc2.f116808b)), Integer.valueOf(Float.floatToIntBits(bgmc2.f116809c)), Integer.valueOf(Float.floatToIntBits(bgmc2.f116810d)));
        if (cetp.m138233c()) {
            if (bgmc2.f116812f) {
                if (!cetp.f183425a.mo6606a().chreCcNotificationEnabled() || ((double) bgmc2.f116807a) < cetp.f183425a.mo6606a().chreCcNotificationConfidenceThreshold()) {
                    z = false;
                } else {
                    m95607a(cetp.f183425a.mo6606a().chreCcNotificationTitle(), cetp.f183425a.mo6606a().chreCcNotificationText(), cetp.f183425a.mo6606a().chreCcNotificationUri(), format, bgmc2.f116811e);
                    z = true;
                }
            } else if (cetp.f183425a.mo6606a().chreCcFalseNotificationEnabled() && ((double) bgmc2.f116807a) >= cetp.f183425a.mo6606a().chreCcFalseNotificationConfidenceThreshold()) {
                m95607a(cetp.f183425a.mo6606a().chreCcFalseNotificationTitle(), cetp.f183425a.mo6606a().chreCcFalseNotificationText(), cetp.f183425a.mo6606a().chreCcFalseNotificationUri(), format, bgmc2.f116811e);
                z = true;
            }
            this.f112238c.mo62047a(new bfop(bfos.CAR_CRASH_DEBUG_EVENT, this.f112238c.mo62055b(), null, String.format(Locale.US, "isCc=%b, conf=%f, veh_conf=%f, integ50=%s, integ75=%s, notif=%b, hash=%s", Boolean.valueOf(bgmc2.f116812f), Float.valueOf(bgmc2.f116807a), Float.valueOf(bgmc2.f116808b), Float.valueOf(bgmc2.f116809c), Float.valueOf(bgmc2.f116810d), Boolean.valueOf(z), format), -1, -1, -1));
            return z;
        }
        z = false;
        this.f112238c.mo62047a(new bfop(bfos.CAR_CRASH_DEBUG_EVENT, this.f112238c.mo62055b(), null, String.format(Locale.US, "isCc=%b, conf=%f, veh_conf=%f, integ50=%s, integ75=%s, notif=%b, hash=%s", Boolean.valueOf(bgmc2.f116812f), Float.valueOf(bgmc2.f116807a), Float.valueOf(bgmc2.f116808b), Float.valueOf(bgmc2.f116809c), Float.valueOf(bgmc2.f116810d), Boolean.valueOf(z), format), -1, -1, -1));
        return z;
    }
}
