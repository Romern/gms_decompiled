package com.google.android.gms.common.sqlite;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SQLiteCloseables {
    private static final String TAG = "SQLiteCloseables";
    private static final WeakHashMap closeables = new WeakHashMap();

    private SQLiteCloseables() {
    }

    public static void add(SQLiteAutoCloseable sQLiteAutoCloseable) {
        synchronized (closeables) {
            closeables.put(sQLiteAutoCloseable, null);
        }
    }

    public static void closeAll() {
        List closeables2 = getCloseables();
        int size = closeables2.size();
        for (int i = 0; i < size; i++) {
            try {
                ((SQLiteAutoCloseable) closeables2.get(i)).close();
            } catch (Exception e) {
            }
        }
    }

    private static List getCloseables() {
        ArrayList arrayList;
        synchronized (closeables) {
            arrayList = new ArrayList(closeables.keySet());
        }
        return arrayList;
    }

    public static void remove(SQLiteAutoCloseable sQLiteAutoCloseable) {
        synchronized (closeables) {
            closeables.remove(sQLiteAutoCloseable);
        }
    }
}
