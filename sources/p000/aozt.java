package p000;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;

/* renamed from: aozt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aozt extends aozp {

    /* renamed from: a */
    private static final String[] f83958a = {"data4", "data1", "data8", "data7", "data5", "data9", "data6"};

    /* renamed from: b */
    private final StringBuilder f83959b = new StringBuilder();

    /* renamed from: a */
    public final void mo47042a(apaw apaw, Cursor cursor) {
        this.f83959b.setLength(0);
        for (String str : f83958a) {
            String b = m69912b(cursor, str);
            if (!TextUtils.isEmpty(b)) {
                if (this.f83959b.length() != 0) {
                    this.f83959b.append(", ");
                }
                this.f83959b.append(b);
            }
        }
        if (this.f83959b.length() > 0) {
            apar.m69974a(apaw.f84073a.f84060f, this.f83959b.toString());
        }
    }

    /* renamed from: a */
    public final void mo47043a(Collection collection) {
        Collections.addAll(collection, f83958a);
    }
}
