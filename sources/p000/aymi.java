package p000;

import android.database.ContentObserver;

/* renamed from: aymi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aymi extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ ayml f97974a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aymi(ayml ayml) {
        super(null);
        this.f97974a = ayml;
    }

    public final void onChange(boolean z) {
        this.f97974a.f97979c.set(true);
    }
}
