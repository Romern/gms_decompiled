package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.telephony.SmsMessage;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: bjzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjzg {
    /* renamed from: a */
    public static ContentValues m104967a(SmsMessage[] smsMessageArr) {
        String str;
        SmsMessage smsMessage = smsMessageArr[0];
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("address", smsMessage.getDisplayOriginatingAddress());
        contentValues.put("date", Long.valueOf(smsMessage.getTimestampMillis()));
        int length = smsMessageArr.length;
        if (length == 1) {
            str = m104968a(smsMessageArr[0].getDisplayMessageBody());
        } else {
            StringBuilder sb = new StringBuilder();
            for (SmsMessage smsMessage2 : smsMessageArr) {
                try {
                    sb.append(smsMessage2.getDisplayMessageBody());
                } catch (NullPointerException e) {
                }
            }
            str = m104968a(sb.toString());
        }
        contentValues.put("body", str);
        return contentValues;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    private static String m104968a(String str) {
        return str != null ? str.replace(12, 10) : "";
    }

    /* renamed from: a */
    public static ArrayList m104969a(Context context, long j, Pattern pattern) {
        Pattern pattern2 = pattern;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(30);
        sb.append("date > ");
        sb.append(j);
        Cursor query = context.getContentResolver().query(Uri.parse("content://sms/inbox"), new String[]{"address", "date", "body"}, sb.toString(), null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    String string = query.getString(0);
                    if (pattern2 != null) {
                        if (!pattern2.matcher(string).matches()) {
                        }
                    }
                    ContentValues contentValues = new ContentValues(3);
                    contentValues.put("address", string);
                    contentValues.put("date", Long.valueOf(query.getLong(1)));
                    contentValues.put("body", query.getString(2));
                    arrayList.add(contentValues);
                } finally {
                    query.close();
                }
            }
        }
        return arrayList;
    }
}
