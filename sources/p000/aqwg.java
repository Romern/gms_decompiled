package p000;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.Set;

/* renamed from: aqwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqwg extends tih {

    /* renamed from: c */
    private final Set f86967c;

    public aqwg(Context context, Set set) {
        super(context);
        this.f86967c = set;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        for (String str : this.f86967c) {
            Cursor query = getContext().getContentResolver().query(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(str)), new String[]{"starred"}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst() && query.getInt(0) == 1) {
                        query.close();
                        return true;
                    }
                } finally {
                    query.close();
                }
            }
        }
        return false;
    }
}
