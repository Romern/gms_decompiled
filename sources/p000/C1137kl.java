package p000;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: kl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1137kl extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C1140ko f24398a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1137kl(C1140ko koVar) {
        super(new Handler());
        this.f24398a = koVar;
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        this.f24398a.onContentChanged();
    }
}
