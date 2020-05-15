package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;

/* renamed from: aloi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aloi extends alna {

    /* renamed from: g */
    private static final String[] f73946g = {"_id"};

    /* renamed from: c */
    private final String[] f73947c;

    /* renamed from: d */
    private final int f73948d;

    /* renamed from: e */
    private final int f73949e;

    /* renamed from: f */
    private final String f73950f;

    public aloi(String str, int i, alzm alzm, String[] strArr, int i2) {
        super(str, i, alzm, null, "SendInteractionFeedback");
        this.f73947c = strArr;
        this.f73948d = i2;
        this.f73949e = i;
        this.f73950f = str;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final Pair mo40604c(Context context) {
        Uri uri;
        String str;
        if (new amus(context, this.f73950f, this.f73949e).mo41358a()) {
            String[] strArr = this.f73947c;
            int i = this.f73948d;
            int i2 = Build.VERSION.SDK_INT;
            StringBuilder sb = new StringBuilder();
            sb.append("data1 IN(");
            int length = strArr.length;
            String str2 = "";
            int i3 = 0;
            while (i3 < length) {
                String str3 = strArr[i3];
                sb.append(str2);
                if (!TextUtils.isEmpty(str3)) {
                    DatabaseUtils.appendEscapedSQLString(sb, str3);
                }
                i3++;
                str2 = ",";
            }
            sb.append(")");
            ArrayList arrayList = new ArrayList();
            Cursor query = context.getContentResolver().query(ContactsContract.Data.CONTENT_URI, f73946g, sb.toString(), null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        arrayList.add(String.valueOf(query.getLong(0)));
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
                if (arrayList.size() != 0) {
                    Uri.Builder appendPath = ContactsContract.DataUsageFeedback.FEEDBACK_URI.buildUpon().appendPath(TextUtils.join(",", arrayList));
                    if (i != 0) {
                        str = i != 2 ? "long_text" : "call";
                    } else {
                        str = "short_text";
                    }
                    uri = appendPath.appendQueryParameter("type", str).build();
                } else {
                    uri = null;
                }
            } else {
                Log.w("BasePeopleOperation", "Failed to query from cp2");
                uri = null;
            }
            if (uri != null) {
                context.getContentResolver().update(uri, new ContentValues(), null, null);
            }
        } else {
            Log.w("BasePeopleOperation", "READ_CONTACTS permission is missing. Skipping SendInteractionFeedbackOperation.");
        }
        return new Pair(amqv.f75777c, null);
    }
}
