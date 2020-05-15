package p000;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.Bundle;

/* renamed from: fsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fsx extends CursorWrapper {

    /* renamed from: a */
    final /* synthetic */ Bundle f17202a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fsx(Cursor cursor, Bundle bundle) {
        super(cursor);
        this.f17202a = bundle;
    }

    public final Bundle getExtras() {
        return this.f17202a;
    }
}
