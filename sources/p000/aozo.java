package p000;

import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;

/* renamed from: aozo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aozo extends aozp {

    /* renamed from: a */
    private final Resources f83954a;

    /* renamed from: b */
    private final String f83955b;

    /* renamed from: c */
    private final String f83956c;

    /* renamed from: d */
    private final String f83957d;

    public aozo(Resources resources, String str, String str2, String str3) {
        this.f83954a = resources;
        this.f83955b = str;
        this.f83956c = str2;
        this.f83957d = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo47040a(Resources resources, int i, String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo47041a(apaw apaw, long j, String str, int i, String str2, int i2);

    /* renamed from: a */
    public final void mo47042a(apaw apaw, Cursor cursor) {
        boolean z;
        int i;
        long j;
        String b = m69912b(cursor, this.f83955b);
        if (!TextUtils.isEmpty(this.f83955b)) {
            int a = m69911a(cursor, this.f83956c);
            String a2 = mo47040a(this.f83954a, a, m69912b(cursor, this.f83957d));
            int a3 = m69911a(cursor, "is_super_primary");
            if (a3 == 0 && m69911a(cursor, "is_primary") == 0) {
                z = false;
            } else {
                z = true;
            }
            if (a3 != 0) {
                i = 3;
            } else {
                i = z ? 2 : 1;
            }
            int columnIndex = cursor.getColumnIndex("_id");
            if (columnIndex == -1) {
                aozy.f83961a.mo46986d("Requested column %s didn't exist in the cursor.", "_id");
                j = 0;
            } else {
                j = cursor.getLong(columnIndex);
            }
            mo47041a(apaw, j, b, a, a2, i);
        }
    }

    /* renamed from: a */
    public final void mo47043a(Collection collection) {
        collection.add("_id");
        collection.add("is_primary");
        collection.add("is_super_primary");
        collection.add(this.f83955b);
        collection.add(this.f83956c);
        collection.add(this.f83957d);
    }
}
