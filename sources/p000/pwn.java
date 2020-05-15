package p000;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: pwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pwn implements pik {

    /* renamed from: a */
    public final qav f40485a = new qav("MulticastKeyManager");

    /* renamed from: b */
    public final pmx f40486b;

    /* renamed from: c */
    public final pvv f40487c;

    /* renamed from: d */
    public final piy f40488d;

    /* renamed from: e */
    public final SharedPreferences f40489e;

    /* renamed from: f */
    public final List f40490f = new ArrayList();

    /* renamed from: g */
    public byte[] f40491g;

    /* renamed from: h */
    public blse f40492h;

    /* renamed from: i */
    public boolean f40493i;

    /* renamed from: j */
    public pjc f40494j;

    /* renamed from: k */
    public pim f40495k;

    /* renamed from: l */
    public boolean f40496l;

    /* renamed from: m */
    private final ScheduledExecutorService f40497m;

    /* renamed from: n */
    private final qat f40498n;

    /* renamed from: o */
    private final pwk f40499o = new pwk(this);

    /* renamed from: p */
    private ScheduledFuture f40500p;

    public pwn(pmx pmx, pvv pvv, piy piy, ScheduledExecutorService scheduledExecutorService, qat qat, SharedPreferences sharedPreferences) {
        this.f40486b = pmx;
        this.f40487c = pvv;
        this.f40488d = piy;
        this.f40497m = scheduledExecutorService;
        this.f40498n = qat;
        this.f40489e = sharedPreferences;
    }

    /* renamed from: a */
    public final String mo23772a(String str) {
        String b = this.f40498n.mo23850b();
        if (b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(b.length() + 1 + str.length());
        sb.append(b);
        sb.append("_");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo23182a(int i, String str) {
    }

    /* renamed from: a */
    public final void mo23183a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
    }

    /* renamed from: a */
    public final void mo23184a(ApplicationStatus applicationStatus) {
    }

    /* renamed from: a */
    public final void mo23185a(DeviceStatus deviceStatus) {
    }

    /* renamed from: a */
    public final void mo23186a(String str, double d, boolean z) {
    }

    /* renamed from: a */
    public final void mo23187a(String str, long j) {
    }

    /* renamed from: a */
    public final void mo23188a(String str, long j, int i) {
    }

    /* renamed from: a */
    public final void mo23189a(String str, String str2) {
    }

    /* renamed from: a */
    public final void mo23190a(String str, byte[] bArr) {
    }

    /* renamed from: b */
    public final void mo23774b() {
        this.f40494j.mo23244a(this.f40499o);
        byte[] bArr = new byte[48];
        new SecureRandom().nextBytes(bArr);
        this.f40491g = bArr;
        try {
            pwk pwk = this.f40499o;
            bxvd da = blsa.f127560c.mo74144da();
            ByteString a = ByteString.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blsa blsa = (blsa) da.f164949b;
            a.getClass();
            blsa.f127562a |= 1;
            blsa.f127563b = a;
            byte[] k = ((blsa) da.mo74062i()).serializeToBytes();
            long c = pwk.mo23633c();
            new Object[1][0] = "receiver-0";
            pwk.f40175u.mo23229a(pwk.f40174t, k, c, "receiver-0");
            this.f40500p = this.f40497m.schedule(new pwl(this), cdaj.f180379a.mo6606a().mo77167b(), TimeUnit.MILLISECONDS);
        } catch (IOException e) {
            mo23775f(7);
        }
    }

    /* renamed from: b */
    public final void mo23193b(String str, String str2) {
    }

    /* renamed from: bm */
    public final void mo23194bm() {
    }

    /* renamed from: c */
    public final void mo23195c(int i) {
    }

    /* renamed from: d */
    public final void mo23196d(int i) {
    }

    /* renamed from: e */
    public final void mo23197e(int i) {
    }

    /* renamed from: f */
    public final void mo23775f(int i) {
        List list = this.f40490f;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((pwm) list.get(i2)).mo23770a(i);
        }
        this.f40490f.clear();
        this.f40493i = false;
    }

    /* renamed from: a */
    public final void mo23181a(int i) {
        mo23775f(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23773a(blse blse, int i) {
        String a;
        if (i == 0) {
            this.f40492h = blse;
            byte[] bArr = this.f40491g;
            String a2 = mo23772a("MULTICAST_SENDER_KEY");
            if (!(a2 == null || (a = mo23772a("MULTICAST_WRAPPED_SENDER_KEY")) == null)) {
                this.f40489e.edit().putString(a2, Base64.encodeToString(bArr, 0)).apply();
                this.f40489e.edit().putString(a, Base64.encodeToString(blse.serializeToBytes(), 0)).apply();
            }
            List list = this.f40490f;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((pwm) list.get(i2)).mo23771a(this.f40491g, this.f40492h);
            }
            this.f40490f.clear();
            this.f40493i = false;
        } else {
            mo23775f(i);
        }
        ScheduledFuture scheduledFuture = this.f40500p;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f40500p = null;
        }
        if (this.f40496l) {
            this.f40494j.mo23207a(false);
        }
    }

    /* renamed from: b */
    public final void mo23192b(int i) {
        mo23775f(8);
    }

    /* renamed from: a */
    public final void mo23191a(boolean z) {
        mo23774b();
    }
}
