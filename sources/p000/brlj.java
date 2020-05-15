package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: brlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brlj {

    /* renamed from: a */
    static final Map f142925a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static final Object f142926b = new Object();

    /* renamed from: c */
    private static final sek f142927c = new sek("FirebaseAuth", "PhoneVerificationSessionManager");

    /* renamed from: a */
    public static void m114134a(long j) {
        long j2 = 0;
        while (j2 < j) {
            synchronized (f142925a) {
                Iterator it = f142925a.entrySet().iterator();
                while (it.hasNext()) {
                    brli brli = (brli) ((Map.Entry) it.next()).getValue();
                    if (!brli.mo69683a()) {
                        brli.f142912c.quit();
                        it.remove();
                    }
                }
            }
            if (f142925a.isEmpty()) {
                break;
            }
            try {
                Thread.sleep(200);
                j2 += 200;
            } catch (InterruptedException e) {
                f142927c.mo25416d("Interrupted while waiting for terminating inactive phone auth sessions", new Object[0]);
            }
        }
        if (j2 >= j) {
            f142927c.mo25416d(String.format("There are still %d sessions alive after %d milliseconds' wait", Integer.valueOf(f142925a.size()), Long.valueOf(j2)), new Object[0]);
        }
    }

    /* renamed from: b */
    private static String m114138b(String... strArr) {
        return TextUtils.join(":", strArr);
    }

    /* renamed from: c */
    public static void m114140c(String str, String str2) {
        m114137a(str, str2);
    }

    /* renamed from: b */
    public static void m114139b(String str, String str2) {
        m114137a(str, str2, "enroll");
    }

    /* renamed from: a */
    public static void m114135a(brpy brpy, Context context, String str, brph brph, brpj brpj, String str2, long j, boolean z, boolean z2) {
        String str3;
        brli brli;
        boolean z3;
        brpy brpy2 = brpy;
        String str4 = str2;
        sdo.m34959a(brpy);
        sdo.m34959a((Object) str);
        sdo.m34959a((Object) str2);
        sdo.m34959a(context);
        sdo.m34959a(brph);
        sdo.m34959a(brpj);
        if ((brpy2 instanceof SendVerificationCodeRequest) || (brpy2 instanceof brre) || (brpy2 instanceof brrg)) {
            synchronized (f142926b) {
                boolean z4 = brpy2 instanceof brrg;
                if (z4) {
                    str3 = m114138b(str, ((brrg) brpy2).f143228a);
                } else if (brpy2 instanceof brre) {
                    str3 = m114138b(str, str4, "enroll");
                } else {
                    str3 = m114138b(str, str4);
                }
                if (f142925a.containsKey(str3) && (z || !((brli) f142925a.get(str3)).mo69683a())) {
                    ((brli) f142925a.get(str3)).f142912c.quit();
                    f142925a.remove(str3);
                }
                if (!f142925a.containsKey(str3)) {
                    sns sns = new sns("PhoneVerificationSession", 9);
                    sns.start();
                    if (j > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    long j2 = 30;
                    if (j >= 30) {
                        j2 = j;
                    }
                    brli = new brli(brpy, str4, z3, sns);
                    snr snr = brli.f142911b;
                    snr.sendMessageDelayed(snr.obtainMessage(3), TimeUnit.SECONDS.toMillis(j2));
                    f142925a.put(str3, brli);
                } else {
                    brli = (brli) f142925a.get(str3);
                }
                if (cdyc.m135274b()) {
                    if (z4) {
                        brli.f142920k = ((brrg) brpy2).f143229b;
                    }
                }
                Object[] objArr = {context, brph, brpj, Boolean.valueOf(z2)};
                snr snr2 = brli.f142911b;
                snr2.sendMessage(snr2.obtainMessage(1, objArr));
            }
            return;
        }
        throw new IllegalArgumentException("Invalid request proto wrapper.");
    }

    /* renamed from: a */
    public static void m114136a(String str, String str2) {
        m114137a(str, str2);
    }

    /* renamed from: a */
    private static void m114137a(String... strArr) {
        synchronized (f142926b) {
            String b = m114138b(strArr);
            if (f142925a.containsKey(b)) {
                snr snr = ((brli) f142925a.get(b)).f142911b;
                snr.sendMessage(snr.obtainMessage(3, 4));
            }
        }
    }
}
