package p000;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.net.Uri;
import android.util.Log;

/* renamed from: axxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axxt extends AbstractWindowedCursor {

    /* renamed from: a */
    private final Cursor f96680a;

    /* renamed from: b */
    private final int f96681b;

    /* renamed from: c */
    private final int f96682c = this.f96680a.getColumnIndex("path");

    /* renamed from: d */
    private final int f96683d = this.f96680a.getColumnIndex("data");

    /* renamed from: e */
    private final int f96684e = this.f96680a.getColumnIndex("tags");

    /* renamed from: f */
    private final int f96685f = this.f96680a.getColumnIndex("asset_id");

    /* renamed from: g */
    private final int f96686g = this.f96680a.getColumnIndex("asset_key");

    public axxt(Cursor cursor) {
        this.f96680a = cursor;
        this.f96681b = cursor.getColumnIndex("host");
    }

    /* renamed from: a */
    private static final boolean m83487a(Cursor cursor, CursorWindow cursorWindow, int i, int i2) {
        if (cursor.getType(i2) == 0) {
            return cursorWindow.putNull(i, i2);
        }
        return cursorWindow.putString(cursor.getString(i2), i, i2);
    }

    public final void close() {
        this.f96680a.close();
    }

    public final void fillWindow(int i, CursorWindow cursorWindow) {
        boolean z;
        boolean z2;
        Cursor cursor = this.f96680a;
        if (i >= 0 && i < cursor.getCount()) {
            int position = cursor.getPosition();
            int columnCount = cursor.getColumnCount();
            cursorWindow.clear();
            cursorWindow.setStartPosition(i);
            cursorWindow.setNumColumns(columnCount);
            if (cursor.moveToPosition(i)) {
                String str = null;
                while (true) {
                    if (!cursorWindow.allocRow()) {
                        break;
                    }
                    String string = cursor.getString(this.f96682c);
                    boolean z3 = true;
                    if (string == null) {
                        StringBuilder sb = new StringBuilder(62);
                        sb.append("Cursor row did not have a value for path. position=");
                        sb.append(i);
                        Log.e("DataItems", sb.toString());
                        z = false;
                    } else {
                        String uri = new Uri.Builder().scheme("wear").authority(cursor.getString(this.f96681b)).path(string).build().toString();
                        z3 = true ^ uri.equals(str);
                        z = cursorWindow.putString(uri, i, this.f96682c);
                        str = uri;
                    }
                    if (!z || !cursorWindow.putNull(i, this.f96681b) || !cursorWindow.putNull(i, this.f96684e) || !m83487a(cursor, cursorWindow, i, this.f96685f) || !m83487a(cursor, cursorWindow, i, this.f96686g)) {
                        break;
                    }
                    if (z3 && cursor.getType(this.f96683d) != 0) {
                        z2 = cursorWindow.putBlob(cursor.getBlob(this.f96683d), i, this.f96683d);
                    } else {
                        z2 = cursorWindow.putNull(i, this.f96683d);
                    }
                    if (!z2) {
                        break;
                    }
                    i++;
                    if (!cursor.moveToNext()) {
                        break;
                    }
                }
                cursorWindow.freeLastRow();
                cursor.moveToPosition(position);
                return;
            }
            cursor.moveToPosition(position);
        }
    }

    public final String[] getColumnNames() {
        return this.f96680a.getColumnNames();
    }

    public final int getCount() {
        return this.f96680a.getCount();
    }

    public final CursorWindow getWindow() {
        return null;
    }

    public final void setWindow(CursorWindow cursorWindow) {
    }
}
