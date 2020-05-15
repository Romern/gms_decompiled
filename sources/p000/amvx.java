package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: amvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class amvx {

    /* renamed from: a */
    public final Cursor f76152a;

    protected amvx(Cursor cursor) {
        sdo.m34959a(cursor);
        this.f76152a = cursor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo41465a(String str) {
        int columnIndex = this.f76152a.getColumnIndex(str);
        if (columnIndex == -1 || this.f76152a.isNull(columnIndex)) {
            return null;
        }
        return this.f76152a.getString(columnIndex);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Long mo41466b(String str) {
        int columnIndex = this.f76152a.getColumnIndex(str);
        if (columnIndex == -1 || this.f76152a.isNull(columnIndex)) {
            return null;
        }
        return Long.valueOf(this.f76152a.getLong(columnIndex));
    }

    /* renamed from: b */
    public abstract Object mo41464b();

    /* renamed from: c */
    public final int mo41467c() {
        return this.f76152a.getCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo41469d() {
        return this.f76152a.moveToNext();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public final List mo41471e() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            try {
                Object b = mo41464b();
                if (b != null) {
                    arrayList.add(b);
                } else {
                    mo41472f();
                    arrayList.size();
                    return arrayList;
                }
            } catch (Throwable th) {
                mo41472f();
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final void mo41472f() {
        this.f76152a.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final byte[] mo41468c(String str) {
        int columnIndex = this.f76152a.getColumnIndex(str);
        if (columnIndex == -1 || this.f76152a.isNull(columnIndex)) {
            return null;
        }
        return this.f76152a.getBlob(columnIndex);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo41470d(String str) {
        int columnIndex = this.f76152a.getColumnIndex(str);
        if (columnIndex == -1 || this.f76152a.isNull(columnIndex) || this.f76152a.getLong(columnIndex) == 0) {
            return false;
        }
        return true;
    }
}
