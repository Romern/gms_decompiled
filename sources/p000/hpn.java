package p000;

import android.os.IBinder;
import com.google.android.gms.auth.api.credentials.manager.yolo.CredentialsInternalChimeraService;

/* renamed from: hpn */
public final /* synthetic */ class hpn implements aaai {

    /* renamed from: a */
    private final CredentialsInternalChimeraService f20175a;

    /* renamed from: b */
    private final String f20176b;

    public hpn(CredentialsInternalChimeraService credentialsInternalChimeraService, String str) {
        this.f20175a = credentialsInternalChimeraService;
        this.f20176b = str;
    }

    public final IBinder asBinder() {
        return new hik(this.f20175a, this.f20176b);
    }
}
