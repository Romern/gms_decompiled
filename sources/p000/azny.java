package p000;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Pair;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: azny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azny {

    /* renamed from: a */
    private static Bitmap f99773a = null;

    /* renamed from: a */
    public static synchronized Bitmap m85881a(Context context) {
        Bitmap bitmap;
        synchronized (azny.class) {
            if (f99773a == null) {
                f99773a = azal.m85135a(context, C1133kh.m17843b(context, C0126R.color.avatar_letter_tile_default_color));
            }
            bitmap = f99773a;
        }
        return bitmap;
    }

    /* renamed from: b */
    private static Cursor m85886b(Context context, String str) {
        if (TextUtils.isEmpty(str) || !azos.m85957a(context)) {
            return null;
        }
        Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str));
        return context.getContentResolver().query(withAppendedPath, new String[]{"display_name", "_id"}, null, null, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    /* renamed from: c */
    public static String m85888c(Context context, LocalEntityId localEntityId) {
        Throwable th;
        String a = m85885a(localEntityId);
        Cursor cursor = null;
        if (TextUtils.isEmpty(a) || !azos.m85957a(context)) {
            return null;
        }
        bmxy.m108581a(localEntityId);
        try {
            Cursor query = context.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"display_name"}, a, new String[]{localEntityId.f111074a}, null);
            if (query != null) {
                try {
                    if (query.moveToNext()) {
                        String string = query.getString(0);
                        query.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0085  */
    /* renamed from: d */
    public static long m85889d(Context context, LocalEntityId localEntityId) {
        long j = -1;
        if (!azos.m85957a(context)) {
            return -1;
        }
        Cursor cursor = null;
        if (localEntityId.f111075b != 1) {
            String a = m85885a(localEntityId);
            new Object[1][0] = a;
            if (TextUtils.isEmpty(a)) {
                return -1;
            }
            try {
                cursor = context.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id"}, a, new String[]{localEntityId.f111074a}, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToNext()) {
                            Object[] objArr = {localEntityId, Long.valueOf(cursor.getLong(0))};
                            long j2 = cursor.getLong(0);
                            cursor.close();
                            return j2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                }
                throw th;
            }
        } else {
            try {
                cursor = m85886b(context, localEntityId.f111074a);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            j = cursor.getLong(1);
                            cursor.close();
                            return j;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                    return -1;
                }
                return j;
            } catch (Throwable th4) {
                th = th4;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static Bitmap m85882a(Context context, LocalEntityId localEntityId) {
        azox.m85982b();
        long d = m85889d(context, localEntityId);
        Bitmap bitmap = null;
        if (d != -1) {
            try {
                InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(context.getContentResolver(), ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, d), false);
                if (openContactPhotoInputStream != null) {
                    bitmap = BitmapFactory.decodeStream(openContactPhotoInputStream);
                    try {
                        openContactPhotoInputStream.close();
                    } catch (IOException e) {
                        e = e;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                azoj.m85931a("ContactsUtil", e, "retrieve contact photo error", new Object[0]);
                return bitmap;
            }
        }
        return bitmap;
    }

    /* renamed from: b */
    public static boolean m85887b(Context context, LocalEntityId localEntityId) {
        int i;
        if (localEntityId == null || ((i = localEntityId.f111075b) != 1 && i != 7)) {
            return false;
        }
        return !azos.m85957a(context) || m85889d(context, localEntityId) != -1;
    }

    /* renamed from: a */
    public static Pair m85883a(Context context, azdd azdd) {
        String str;
        String str2;
        int i = azdd.f99048d;
        if (i == 3) {
            if (!TextUtils.isEmpty(azdd.f99058n)) {
                str2 = azdd.f99058n;
            } else {
                str2 = azdd.f99047c;
            }
            return new Pair(str2, false);
        }
        if (i == 1) {
            Cursor b = m85886b(context, azdd.f99047c);
            str = null;
            if (b != null && b.moveToNext()) {
                str = b.getString(0);
            }
            if (b != null) {
                b.close();
            }
        } else {
            str = m85888c(context, azdd.f99062r);
        }
        boolean z = !TextUtils.isEmpty(str);
        if (!z) {
            str = azdd.f99058n;
            if (TextUtils.isEmpty(str)) {
                str = azdd.f99049e;
            }
        }
        return new Pair(str, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static String m85884a(Context context, String str) {
        Cursor b = m85886b(context, str);
        String str2 = null;
        if (b != null && b.moveToNext()) {
            str2 = b.getString(0);
        }
        if (b != null) {
            b.close();
        }
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    /* renamed from: a */
    static String m85885a(LocalEntityId localEntityId) {
        String str;
        String str2;
        if (localEntityId != null) {
            int i = localEntityId.f111075b;
            if (i == 1) {
                str = "data4";
                str2 = "vnd.android.cursor.item/phone_v2";
            } else if (i == 7) {
                str2 = "vnd.android.cursor.item/email_v2";
                str = "data1";
            }
            StringBuilder sb = new StringBuilder(str.length() + 25 + str2.length());
            sb.append(str);
            sb.append(" LIKE ? AND mimetype = '");
            sb.append(str2);
            sb.append("'");
            return sb.toString();
        }
        return null;
    }
}
