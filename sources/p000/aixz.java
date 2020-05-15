package p000;

import android.os.SystemClock;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;

/* renamed from: aixz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aixz {

    /* renamed from: a */
    final ClientAppIdentifier f70045a;

    /* renamed from: b */
    final long f70046b = SystemClock.elapsedRealtime();

    /* renamed from: c */
    final int f70047c;

    public aixz(ClientAppIdentifier clientAppIdentifier, int i) {
        this.f70045a = clientAppIdentifier;
        this.f70047c = i;
    }

    /* renamed from: a */
    public final int mo38239a() {
        return (int) (SystemClock.elapsedRealtime() - this.f70046b);
    }
}
