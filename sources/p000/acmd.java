package p000;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;

/* renamed from: acmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acmd extends aclz {

    /* renamed from: a */
    private static final String[] f60149a = {"data4", "data1", "data8", "data7", "data5", "data9", "data6"};

    /* renamed from: b */
    private final StringBuilder f60150b = new StringBuilder();

    /* renamed from: a */
    public final void mo32878a(acmz acmz, Cursor cursor) {
        this.f60150b.setLength(0);
        for (String str : f60149a) {
            String b = m49434b(cursor, str);
            if (!TextUtils.isEmpty(b)) {
                if (this.f60150b.length() != 0) {
                    this.f60150b.append(", ");
                }
                this.f60150b.append(b);
            }
        }
        if (this.f60150b.length() > 0) {
            acmu.m49482a(acmz.f60209a.f60196f, this.f60150b.toString());
        }
    }

    /* renamed from: a */
    public final void mo32879a(Collection collection) {
        for (String str : f60149a) {
            collection.add(str);
        }
    }
}
