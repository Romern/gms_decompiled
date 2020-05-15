package p000;

import android.util.Base64;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.List;

/* renamed from: jmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jmz implements bqfp {

    /* renamed from: a */
    final /* synthetic */ jnc f22849a;

    public jmz(jnc jnc) {
        this.f22849a = jnc;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        List<SyncedCryptauthDevice> list = (List) obj;
        if (list == null || list.isEmpty()) {
            jnc.f22855a.mo25416d("No valid beacon seeds could be fetched.", new Object[0]);
            this.f22849a.mo13894a(null);
            return;
        }
        synchronized (this.f22849a.f22859e) {
            this.f22849a.f22860f.clear();
            for (SyncedCryptauthDevice syncedCryptauthDevice : list) {
                this.f22849a.f22860f.put(Base64.encodeToString(syncedCryptauthDevice.f11186a, 8), syncedCryptauthDevice.mo7813a());
            }
            jnc jnc = this.f22849a;
            jnc.f22862h = false;
            jnc.mo13894a(jnc.f22860f);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        jnc.f22855a.mo25417e("Beacon seeds could be fetched", th, new Object[0]);
        this.f22849a.mo13894a(null);
    }
}
