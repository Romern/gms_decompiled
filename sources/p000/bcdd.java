package p000;

import android.database.ContentObserver;
import android.os.Looper;

/* renamed from: bcdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcdd extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ bcde f103979a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bcdd(bcde bcde) {
        super(bcde.f103989j.f105245f);
        this.f103979a = bcde;
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        boolean z2;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z2 = true;
        } else {
            z2 = false;
        }
        bbov.m88300a(z2, "checkMainThread failed");
        this.f103979a.onContentChanged();
    }
}
