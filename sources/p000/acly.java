package p000;

import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;

/* renamed from: acly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class acly extends aclz {

    /* renamed from: a */
    private final Resources f60145a;

    /* renamed from: b */
    private final String f60146b;

    /* renamed from: c */
    private final String f60147c;

    /* renamed from: d */
    private final String f60148d;

    public acly(Resources resources, String str, String str2, String str3) {
        this.f60145a = resources;
        this.f60146b = str;
        this.f60147c = str2;
        this.f60148d = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo32876a(Resources resources, int i, String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo32877a(acmz acmz, long j, String str, int i, String str2, int i2);

    /* renamed from: a */
    public final void mo32878a(acmz acmz, Cursor cursor) {
        boolean z;
        int i;
        long j;
        String b = m49434b(cursor, this.f60146b);
        if (!TextUtils.isEmpty(this.f60146b)) {
            int a = m49433a(cursor, this.f60147c);
            String a2 = mo32876a(this.f60145a, a, m49434b(cursor, this.f60148d));
            int a3 = m49433a(cursor, "is_super_primary");
            if (a3 == 0 && m49433a(cursor, "is_primary") == 0) {
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
                acnv.m49547b("Requested column %s didn't exist in the cursor.", "_id");
                j = 0;
            } else {
                j = cursor.getLong(columnIndex);
            }
            mo32877a(acmz, j, b, a, a2, i);
        }
    }

    /* renamed from: a */
    public final void mo32879a(Collection collection) {
        collection.add("_id");
        collection.add("is_primary");
        collection.add("is_super_primary");
        collection.add(this.f60146b);
        collection.add(this.f60147c);
        collection.add(this.f60148d);
    }
}
