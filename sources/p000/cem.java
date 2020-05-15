package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: cem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cem implements ceo {

    /* renamed from: b */
    private static final String[] f6615b = {"_data"};

    /* renamed from: a */
    private final ContentResolver f6616a;

    public cem(ContentResolver contentResolver) {
        this.f6616a = contentResolver;
    }

    /* renamed from: a */
    public final Cursor mo3779a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f6616a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f6615b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }
}
