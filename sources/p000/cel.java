package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: cel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cel implements ceo {

    /* renamed from: b */
    private static final String[] f6613b = {"_data"};

    /* renamed from: a */
    private final ContentResolver f6614a;

    public cel(ContentResolver contentResolver) {
        this.f6614a = contentResolver;
    }

    /* renamed from: a */
    public final Cursor mo3779a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f6614a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f6613b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }
}
