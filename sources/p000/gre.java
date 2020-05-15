package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: gre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gre {
    /* renamed from: a */
    public static List m13766a(Intent intent) {
        return m13767a(intent.getParcelableArrayExtra("accountsAdded"));
    }

    /* renamed from: b */
    public static List m13768b(Intent intent) {
        return m13767a(intent.getParcelableArrayExtra("accountsRemoved"));
    }

    /* renamed from: a */
    public static List m13767a(Parcelable[] parcelableArr) {
        int length;
        if (parcelableArr == null || (length = parcelableArr.length) == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (Parcelable parcelable : parcelableArr) {
            arrayList.add((Account) parcelable);
        }
        return arrayList;
    }
}
