package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import java.util.Arrays;

/* renamed from: ajao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajao {

    /* renamed from: a */
    final IBinder f70259a;

    /* renamed from: b */
    final PendingIntent f70260b;

    public ajao(ajcd ajcd) {
        this.f70259a = ajcd.asBinder();
        this.f70260b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajao) {
            ajao ajao = (ajao) obj;
            return sdg.m34949a(this.f70259a, ajao.f70259a) && sdg.m34949a(this.f70260b, ajao.f70260b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f70259a, this.f70260b});
    }

    public ajao(PendingIntent pendingIntent) {
        this.f70259a = null;
        this.f70260b = pendingIntent;
    }
}
