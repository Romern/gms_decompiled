package p000;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.Set;

/* renamed from: aqwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqwh extends tih {

    /* renamed from: c */
    private final Set f86968c;

    /* renamed from: d */
    private final boolean f86969d;

    public aqwh(Context context, Set set, boolean z) {
        super(context);
        this.f86968c = set;
        this.f86969d = z;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        for (String str : this.f86968c) {
            Uri withAppendedId = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(str));
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("starred", Integer.valueOf(this.f86969d ? 1 : 0));
            getContext().getContentResolver().update(withAppendedId, contentValues, null, null);
        }
        return Boolean.valueOf(this.f86969d);
    }
}
