package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: ssg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssg {

    /* renamed from: a */
    public static final Uri f45078a = MediaStore.Images.Media.getContentUri("phoneStorage");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ssa.a(android.content.ContentResolver, android.net.Uri, android.graphics.Bitmap, boolean):android.graphics.Bitmap
     arg types: [android.content.ContentResolver, android.net.Uri, android.graphics.Bitmap, int]
     candidates:
      ssa.a(android.content.ContentResolver, android.net.Uri, int, boolean):android.graphics.Bitmap
      ssa.a(android.content.ContentResolver, android.net.Uri, android.graphics.Bitmap, boolean):android.graphics.Bitmap */
    /* renamed from: a */
    public static Bitmap m36209a(Context context, Uri uri) {
        Bitmap a;
        int a2 = ssa.m36180a(context);
        Bitmap bitmap = null;
        if (uri != null && m36212b(uri)) {
            ContentResolver contentResolver = context.getContentResolver();
            long parseId = ContentUris.parseId(uri);
            String a3 = ssa.m36189a(contentResolver, uri);
            if (ssa.m36191b(a3)) {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, 1, null);
            } else if (ssa.m36192c(a3)) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, 1, null);
            } else if (Log.isLoggable("MediaStoreUtils", 5)) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 42 + String.valueOf(valueOf).length());
                sb.append("getThumbnail: unrecognized mimeType=");
                sb.append(a3);
                sb.append(", uri=");
                sb.append(valueOf);
                Log.w("MediaStoreUtils", sb.toString());
                return null;
            }
            if (bitmap != null) {
                bitmap = ssa.m36183a(contentResolver, uri, bitmap, false);
                if (!((bitmap.getWidth() == a2 && bitmap.getHeight() == a2) || (a = ssa.m36187a(bitmap, a2, a2)) == bitmap)) {
                    bitmap.recycle();
                    return a;
                }
            }
        }
        return bitmap;
    }

    /* renamed from: b */
    public static boolean m36212b(Uri uri) {
        if (!m36211a(uri)) {
            return false;
        }
        String path = uri.getPath();
        return path.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.getPath()) || path.startsWith(MediaStore.Video.Media.EXTERNAL_CONTENT_URI.getPath());
    }

    /* renamed from: a */
    public static String m36210a(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
        if (query == null) {
            if (Log.isLoggable("MediaStoreUtils", 5)) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("getFilePath: query returned null cursor for uri=");
                sb.append(valueOf);
                Log.w("MediaStoreUtils", sb.toString());
            }
            return null;
        }
        try {
            if (query.moveToFirst()) {
                String string = query.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    query.close();
                    return string;
                } else if (Log.isLoggable("MediaStoreUtils", 5)) {
                    String valueOf2 = String.valueOf(uri);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                    sb2.append("getFilePath: MediaColumns.DATA was empty for uri=");
                    sb2.append(valueOf2);
                    Log.w("MediaStoreUtils", sb2.toString());
                }
            } else if (Log.isLoggable("MediaStoreUtils", 5)) {
                String valueOf3 = String.valueOf(uri);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 49);
                sb3.append("getFilePath: query returned empty cursor for uri=");
                sb3.append(valueOf3);
                Log.w("MediaStoreUtils", sb3.toString());
            }
            return null;
        } finally {
            query.close();
        }
    }

    /* renamed from: a */
    public static boolean m36211a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
