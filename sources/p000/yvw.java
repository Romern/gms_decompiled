package p000;

import android.database.CursorWindow;
import java.util.List;

/* renamed from: yvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yvw {
    /* renamed from: a */
    public static CursorWindow m44922a(List list, int i) {
        StringBuilder sb = new StringBuilder(15);
        sb.append("Row ");
        sb.append(i);
        CursorWindow cursorWindow = new CursorWindow(sb.toString());
        cursorWindow.setNumColumns(1);
        cursorWindow.setStartPosition(i);
        list.add(cursorWindow);
        return cursorWindow;
    }

    /* renamed from: a */
    public static boolean m44923a(CursorWindow cursorWindow, int i, byte[] bArr) {
        if (!cursorWindow.allocRow()) {
            return false;
        }
        if (cursorWindow.putBlob(bArr, i, 0)) {
            return true;
        }
        cursorWindow.freeLastRow();
        return false;
    }
}
