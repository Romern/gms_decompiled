package p000;

import android.database.Cursor;
import java.io.Closeable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: uig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uig extends AbstractList implements List, Closeable {

    /* renamed from: a */
    private boolean f47677a = false;

    /* renamed from: b */
    private final int f47678b;

    /* renamed from: c */
    private final uhj f47679c;

    /* renamed from: d */
    private Cursor f47680d;

    /* renamed from: e */
    private final uhx f47681e;

    public uig(uhj uhj, Cursor cursor, uhx uhx) {
        int count = cursor.getCount();
        boolean z = false;
        sdo.m34975b(count >= 0 ? true : z, "Size must be nonnegative.");
        this.f47678b = count;
        sdo.m34959a(uhj);
        this.f47679c = uhj;
        sdo.m34959a(cursor);
        this.f47680d = cursor;
        sdo.m34959a(uhx);
        this.f47681e = uhx;
    }

    /* renamed from: b */
    private final void m38674b() {
        if (this.f47677a) {
            throw new IllegalStateException("Result list is closed.");
        }
    }

    /* renamed from: a */
    public final List mo27502a() {
        m38674b();
        try {
            return Collections.unmodifiableList(new ArrayList(this));
        } finally {
            close();
        }
    }

    public final void close() {
        if (!this.f47677a) {
            this.f47677a = true;
            this.f47680d.close();
            this.f47680d = null;
        }
    }

    public final Object get(int i) {
        m38674b();
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        } else if (this.f47680d.moveToPosition(i)) {
            Object a = this.f47681e.mo27496a(this.f47679c, this.f47680d);
            sdo.checkIfNull(a, "Result decoder returned null.");
            return a;
        } else {
            throw new IllegalStateException("Failed to move delegate cursor.");
        }
    }

    public final int size() {
        m38674b();
        return this.f47678b;
    }
}
