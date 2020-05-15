package p000;

import android.app.PendingIntent;
import java.util.Map;
import java.util.Set;

/* renamed from: airz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class airz {

    /* renamed from: a */
    private static airz f69613a;

    /* renamed from: b */
    private final Map f69614b = new C1223np();

    /* renamed from: c */
    private final Map f69615c = new C1223np();

    /* renamed from: d */
    private final Map f69616d = new C1223np();

    /* renamed from: e */
    private final Map f69617e = new C1223np();

    private airz() {
    }

    /* renamed from: a */
    public static synchronized airz m57841a() {
        airz airz;
        synchronized (airz.class) {
            if (f69613a == null) {
                f69613a = new airz();
            }
            airz = f69613a;
        }
        return airz;
    }

    /* renamed from: b */
    public final synchronized Set mo37924b() {
        return new C1225nr(this.f69615c.values());
    }

    /* renamed from: c */
    public final synchronized byte[] mo37926c(String str) {
        return (byte[]) this.f69615c.get(str);
    }

    /* renamed from: a */
    public final synchronized void mo37919a(String str) {
        PendingIntent pendingIntent = (PendingIntent) this.f69614b.get(str);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("airz", "a", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Error sending PendingIntent %s", pendingIntent);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo37925b(String str) {
        this.f69615c.remove(str);
        this.f69616d.remove(str);
        this.f69617e.remove(str);
    }

    /* renamed from: a */
    public final synchronized void mo37920a(String str, ahpy ahpy, bvgl bvgl, ailk ailk) {
        this.f69615c.put(str, bvgl.serializeToBytes());
        this.f69616d.put(str, ailk);
        this.f69617e.put(str, ahpy);
    }

    /* renamed from: a */
    public final synchronized void mo37921a(String str, PendingIntent pendingIntent) {
        this.f69614b.put(str, pendingIntent);
    }

    /* renamed from: a */
    public final synchronized void mo37922a(String str, String str2, byte[] bArr) {
        ahpy ahpy = (ahpy) this.f69617e.get(str);
        if (ahpy != null) {
            ahpy.f67764b.mo36847a(new ahpx(ahpy, str2, bArr));
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo37923a(String str, airy airy) {
        boolean z;
        if (this.f69615c.containsKey(str)) {
            ailk ailk = (ailk) this.f69616d.get(str);
            ailq ailq = ailk.f69128a;
            ailq.mo37649a(new ailn(ailq, ailk.f69129b, airy));
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
