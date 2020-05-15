package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: whh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class whh {

    /* renamed from: a */
    private static final String[] f50638a = {"_id", "display_name", "times_contacted"};

    /* renamed from: b */
    private static final String f50639b;

    /* renamed from: c */
    private static final String[] f50640c = {"contact_id", "data1"};

    /* renamed from: d */
    private static final String[] f50641d = {"contact_id", "data1"};

    static {
        long f = cdsw.f181668a.mo6606a().mo78268f();
        StringBuilder sb = new StringBuilder(40);
        sb.append("times_contacted > '");
        sb.append(f);
        sb.append("'");
        f50639b = sb.toString();
    }

    /* renamed from: a */
    public static List m41944a(Context context, boolean z) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor query = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, f50638a, f50639b, null, null);
        PriorityQueue priorityQueue = new PriorityQueue(10);
        query.move(-1);
        char c = 0;
        int i = 0;
        while (query.moveToNext()) {
            i++;
            long j = query.getLong(query.getColumnIndex("_id"));
            String string = query.getString(query.getColumnIndex("display_name"));
            int i2 = query.getInt(query.getColumnIndex("times_contacted"));
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new whg(j, string, i2));
            } else if (((whg) priorityQueue.peek()).f50637c < i2) {
                priorityQueue.poll();
                priorityQueue.add(new whg(j, string, i2));
            }
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("total number of contacts processed: ");
        sb.append(i);
        sb.toString();
        sbw sbw = wgn.f50624a;
        query.close();
        ArrayList arrayList = new ArrayList();
        while (!priorityQueue.isEmpty()) {
            arrayList.add((whg) priorityQueue.poll());
        }
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            whg whg = (whg) arrayList.get(i3);
            String[] strArr = new String[1];
            strArr[c] = Long.toString(whg.f50635a);
            ArrayList arrayList3 = new ArrayList();
            Cursor query2 = contentResolver.query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, f50641d, "contact_id = ?", strArr, null);
            while (query2.moveToNext()) {
                String string2 = query2.getString(query2.getColumnIndex("data1"));
                if (!TextUtils.isEmpty(string2)) {
                    arrayList3.add(new ContactPerson.ContactMethod(1, string2));
                }
            }
            query2.close();
            if (z) {
                String str = "data1";
                Cursor query3 = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, f50640c, "contact_id = ?", strArr, null);
                while (query3.moveToNext()) {
                    String string3 = query3.getString(query3.getColumnIndex(str));
                    if (!TextUtils.isEmpty(string3)) {
                        arrayList3.add(new ContactPerson.ContactMethod(2, string3));
                    }
                }
                query3.close();
            }
            if (!arrayList3.isEmpty()) {
                ContactPerson contactPerson = new ContactPerson(whg.f50636b, null, new AvatarReference(3, ""), arrayList3);
                if (hashSet.add(contactPerson)) {
                    arrayList2.add(contactPerson);
                }
                if (arrayList2.size() >= 6) {
                    break;
                }
            }
            i3++;
            c = 0;
        }
        return arrayList2;
    }
}
