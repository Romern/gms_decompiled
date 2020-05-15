package p000;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aghz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aghz extends agmn {

    /* renamed from: q */
    private String f65548q;

    /* renamed from: r */
    private long f65549r = -1;

    /* renamed from: s */
    private Set f65550s;

    public aghz(agmo agmo) {
        super(agmo);
    }

    /* renamed from: a */
    public final String mo35432a(String str, long j) {
        return mo35433a("com.google.android.gms.ads.social.GmsDoritosProvider", str, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo35433a(String str, String str2, long j) {
        if (this.f65549r < 0 || mo35691o().mo20506b() > this.f65549r + 120000) {
            try {
                this.f65549r = mo35691o().mo20506b();
                Class<?> cls = Class.forName(str);
                Object newInstance = cls.getConstructor(Context.class).newInstance(mo35690n());
                this.f65548q = (String) ((Future) cls.getMethod("getDoritosCookieAsynchronously", String.class).invoke(newInstance, str2)).get(j, TimeUnit.MILLISECONDS);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | InterruptedException | NoSuchMethodException | InvocationTargetException | ExecutionException | TimeoutException e) {
                if (this.f65550s == null) {
                    this.f65550s = new HashSet();
                }
                if (!this.f65550s.contains(str2)) {
                    this.f65550s.add(str2);
                    mo35497E().f65567f.mo35438a("Failed to get dsid. appId, exception type, exception", agid.m54288a(str2), agid.m54288a(e.getClass().getName()), e);
                }
            }
        }
        return this.f65548q;
    }
}
