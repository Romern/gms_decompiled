package p000;

import android.database.ContentObserver;

/* renamed from: bdxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdxx extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ bdxy f106611a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bdxx(bdxy bdxy) {
        super(null);
        this.f106611a = bdxy;
    }

    public final void onChange(boolean z) {
        this.f106611a.mo58435b();
    }
}
