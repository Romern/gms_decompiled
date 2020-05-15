package p000;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: aiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiv extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ aix f620a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiv(aix aix) {
        super(new Handler());
        this.f620a = aix;
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        Cursor cursor;
        aix aix = this.f620a;
        if (aix.f623c && (cursor = aix.f624d) != null && !cursor.isClosed()) {
            aix.f622b = aix.f624d.requery();
        }
    }
}
