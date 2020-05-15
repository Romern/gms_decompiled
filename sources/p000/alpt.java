package p000;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;

/* renamed from: alpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alpt extends alpp {

    /* renamed from: a */
    private static final String[] f74041a = {"data4", "data1", "data8", "data7", "data5", "data9", "data6"};

    /* renamed from: b */
    private final StringBuilder f74042b = new StringBuilder();

    /* renamed from: a */
    public final void mo40634a(alqk alqk, Cursor cursor) {
        this.f74042b.setLength(0);
        for (String str : f74041a) {
            String b = m61487b(cursor, str);
            if (!TextUtils.isEmpty(b)) {
                if (this.f74042b.length() != 0) {
                    this.f74042b.append(", ");
                }
                this.f74042b.append(b);
            }
        }
        if (this.f74042b.length() > 0) {
            alqf.m61514a(alqk.f74096a.f74082f, this.f74042b.toString());
        }
    }

    /* renamed from: a */
    public final void mo40635a(Collection collection) {
        Collections.addAll(collection, f74041a);
    }
}
