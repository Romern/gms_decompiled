package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Random;

/* renamed from: sts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sts {

    /* renamed from: a */
    static boolean f45133a = false;

    /* renamed from: b */
    public final String[] f45134b;

    /* renamed from: c */
    private final Context f45135c;

    /* renamed from: d */
    private final Random f45136d;

    public sts(Context context) {
        Context applicationContext = context.getApplicationContext();
        Random random = new Random();
        this.f45135c = applicationContext;
        this.f45136d = random;
        String d = cdpf.f181509a.mo6606a().mo78142d();
        if (!TextUtils.isEmpty(d)) {
            this.f45134b = d.split(",");
        } else {
            this.f45134b = new String[0];
        }
    }

    /* renamed from: b */
    public static final boolean m36312b() {
        boolean z;
        if (!cdpf.m134588b() || f45133a) {
            return false;
        }
        int a = (int) cdpi.f181516a.mo6606a().mo78145a();
        if (a == 1) {
            z = true;
        } else {
            z = false;
        }
        f45133a = z;
        if (a == 3 || (a == 2 && cdpi.f181516a.mo6606a().mo78146b() < System.currentTimeMillis())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final PendingIntent mo26075a() {
        return PendingIntent.getActivity(this.f45135c, 0, new Intent().setClassName(this.f45135c, "com.google.android.gms.auth.uiflows.addaccount.UncertifiedNotificationActivity"), 134217728);
    }

    /* renamed from: a */
    public final void mo26076a(int i) {
        if (((double) this.f45136d.nextFloat()) < cdpf.f181509a.mo6606a().mo78143e()) {
            bxvd da = bpvf.f139321t.mo74144da();
            bxvd da2 = bpvp.f139399c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpvp bpvp = (bpvp) da2.f164949b;
            bpvp.f139402b = i - 1;
            bpvp.f139401a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpvf bpvf = (bpvf) da.f164949b;
            bpvp bpvp2 = (bpvp) da2.mo74062i();
            bpvp2.getClass();
            bpvf.f139335m = bpvp2;
            bpvf.f139323a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            qwo a = sfa.m35133a().mo25463b(this.f45135c).mo24333a((bpvf) da.mo74062i());
            a.mo24328b(15);
            a.mo24327b();
        }
    }
}
