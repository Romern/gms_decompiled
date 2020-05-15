package p000;

import android.database.CursorWindow;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class vkc {

    /* renamed from: a */
    private final String[] f49389a;

    /* renamed from: b */
    private final int f49390b;

    protected vkc(String[] strArr) {
        this.f49389a = strArr;
        this.f49390b = strArr.length;
    }

    /* renamed from: a */
    private final CursorWindow m40624a(int i) {
        CursorWindow cursorWindow = new CursorWindow(false);
        cursorWindow.setNumColumns(this.f49390b);
        cursorWindow.setStartPosition(i);
        return cursorWindow;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo28494a(CursorWindow cursorWindow, int i, Object obj);

    /* renamed from: a */
    public final DataHolder mo28514a(Iterable iterable) {
        CursorWindow[] cursorWindowArr;
        if (iterable.iterator().hasNext()) {
            ArrayList arrayList = new ArrayList();
            try {
                int i = 0;
                for (Object obj : iterable) {
                    int i2 = i + 1;
                    mo28516a(arrayList, obj, i);
                    i = i2;
                }
                cursorWindowArr = (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
            } catch (RuntimeException e) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((CursorWindow) arrayList.get(i3)).close();
                }
                throw e;
            }
        } else {
            cursorWindowArr = new CursorWindow[0];
        }
        return mo28515a(cursorWindowArr);
    }

    /* renamed from: a */
    public final DataHolder mo28515a(CursorWindow[] cursorWindowArr) {
        return new DataHolder(this.f49389a, cursorWindowArr, 0, null);
    }

    /* renamed from: a */
    public final void mo28516a(List list, Object obj, int i) {
        CursorWindow cursorWindow;
        int size = list.size();
        if (size == 0) {
            cursorWindow = m40624a(i);
            list.add(cursorWindow);
        } else {
            cursorWindow = (CursorWindow) list.get(size - 1);
        }
        if (!cursorWindow.allocRow()) {
            cursorWindow = m40624a(i);
            list.add(cursorWindow);
            if (!cursorWindow.allocRow()) {
                throw new IllegalStateException("Cannot allocate window space.");
            }
        }
        if (!mo28494a(cursorWindow, i, obj)) {
            cursorWindow.freeLastRow();
            CursorWindow a = m40624a(i);
            list.add(a);
            if (!a.allocRow()) {
                throw new IllegalStateException("Cannot allocate window space.");
            } else if (!mo28494a(a, i, obj)) {
                StringBuilder sb = new StringBuilder(43);
                sb.append("Single row exceeds window size: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
    }
}
