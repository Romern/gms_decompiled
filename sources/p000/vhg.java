package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: vhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vhg {

    /* renamed from: a */
    public static final sbw f49261a = new sbw("RealtimeLoader", "");

    /* renamed from: b */
    public static final ScheduledExecutorService f49262b = adzl.f62962b.mo25877a(1, 2);

    /* renamed from: c */
    public static final bkms f49263c = new vhc();

    /* renamed from: d */
    public final Context f49264d;

    /* renamed from: e */
    public final vhu f49265e;

    /* renamed from: f */
    public final vho f49266f = new vho();

    /* renamed from: g */
    public final int f49267g;

    /* renamed from: h */
    public final veg f49268h;

    /* renamed from: i */
    private SecureRandom f49269i;

    public vhg(Context context, vhu vhu, veg veg) {
        int i;
        this.f49264d = context;
        this.f49265e = vhu;
        try {
            i = svr.m36484b(this.f49264d).mo26176b(this.f49264d.getPackageName(), 64).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            i = -1;
        }
        this.f49267g = i;
        this.f49268h = veg;
    }

    /* renamed from: a */
    public final bkpw mo28454a(String str) {
        List list;
        if (str != null) {
            try {
                list = Collections.unmodifiableList(new bkvk(str).f125326a);
            } catch (IllegalArgumentException e) {
                throw new bkqc(e);
            }
        } else {
            list = Collections.emptyList();
        }
        if (this.f49269i == null) {
            this.f49269i = new SecureRandom();
        }
        String hexString = Long.toHexString(Math.abs(this.f49269i.nextLong()));
        return new bkpw(new bkpx(1, hexString, Collections.emptyList()), bkwz.READ_WRITE, list, Collections.singletonList(bkvo.m106713a(hexString, "", "", "", true, "", "")), null);
    }
}
