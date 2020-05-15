package p000;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ajaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajaq implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final IInterface f70267a;

    /* renamed from: b */
    final /* synthetic */ ajar f70268b;

    /* renamed from: c */
    private final Object f70269c;

    public ajaq(ajar ajar, Object obj, IInterface iInterface) {
        this.f70268b = ajar;
        this.f70269c = obj;
        this.f70267a = iInterface;
    }

    public final void binderDied() {
        this.f70268b.mo38407b(this.f70269c);
    }
}
