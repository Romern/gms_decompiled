package p000;

import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;

/* renamed from: alpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class alpo extends alpp {

    /* renamed from: a */
    private final Resources f74037a;

    /* renamed from: b */
    private final String f74038b;

    /* renamed from: c */
    private final String f74039c;

    /* renamed from: d */
    private final String f74040d;

    public alpo(Resources resources, String str, String str2, String str3) {
        this.f74037a = resources;
        this.f74038b = str;
        this.f74039c = str2;
        this.f74040d = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo40632a(Resources resources, int i, String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo40633a(alqk alqk, long j, String str, int i, String str2, int i2);

    /* renamed from: a */
    public final void mo40634a(alqk alqk, Cursor cursor) {
        boolean z;
        int i;
        long j;
        String b = m61487b(cursor, this.f74038b);
        if (!TextUtils.isEmpty(this.f74038b)) {
            int a = m61486a(cursor, this.f74039c);
            String a2 = mo40632a(this.f74037a, a, m61487b(cursor, this.f74040d));
            int a3 = m61486a(cursor, "is_super_primary");
            if (a3 == 0 && m61486a(cursor, "is_primary") == 0) {
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
                amdk.m62659b("ContactsDataHandler", "Requested column %s didn't exist in the cursor.", "_id");
                j = 0;
            } else {
                j = cursor.getLong(columnIndex);
            }
            mo40633a(alqk, j, b, a, a2, i);
        }
    }

    /* renamed from: a */
    public final void mo40635a(Collection collection) {
        collection.add("_id");
        collection.add("is_primary");
        collection.add("is_super_primary");
        collection.add(this.f74038b);
        collection.add(this.f74039c);
        collection.add(this.f74040d);
    }
}
