package p000;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;

/* renamed from: sjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sjy extends CursorWrapper implements CrossProcessCursor {

    /* renamed from: a */
    private AbstractWindowedCursor f44596a;

    public sjy(Cursor cursor) {
        super(cursor);
        for (int i = 0; i < 10 && (cursor instanceof CursorWrapper); i++) {
            cursor = ((CursorWrapper) cursor).getWrappedCursor();
        }
        if (!(cursor instanceof AbstractWindowedCursor)) {
            String valueOf = String.valueOf(cursor.getClass().getName());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown type: ") : "Unknown type: ".concat(valueOf));
        } else {
            this.f44596a = (AbstractWindowedCursor) cursor;
        }
    }

    /* renamed from: a */
    public final void mo25658a() {
        this.f44596a.setWindow(null);
    }

    public final void fillWindow(int i, CursorWindow cursorWindow) {
        this.f44596a.fillWindow(i, cursorWindow);
    }

    public final CursorWindow getWindow() {
        return this.f44596a.getWindow();
    }

    public final /* bridge */ /* synthetic */ Cursor getWrappedCursor() {
        return this.f44596a;
    }

    public final boolean onMove(int i, int i2) {
        return this.f44596a.onMove(i, i2);
    }
}
