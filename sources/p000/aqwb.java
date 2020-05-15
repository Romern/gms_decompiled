package p000;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract;

/* renamed from: aqwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqwb extends tih {

    /* renamed from: c */
    private final String f86957c;

    public aqwb(Context context, String str) {
        super(context);
        this.f86957c = str;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Context context = getContext();
        Cursor query = context.getContentResolver().query(Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.valueOf(this.f86957c).longValue()), "photo"), new String[]{"data15"}, null, null, null);
        byte[] bArr = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    bArr = query.getBlob(query.getColumnIndex("data15"));
                }
            } finally {
                query.close();
            }
        }
        return bArr != null ? bmxv.m108567c(rzl.m34706a(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, tey.m36887a()))) : bmvz.f131120a;
    }
}
