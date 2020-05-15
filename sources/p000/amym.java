package p000;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: amym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amym {

    /* renamed from: a */
    private final amvt f76389a;

    /* renamed from: b */
    private final Account f76390b;

    /* renamed from: c */
    private final ContentResolver f76391c;

    public amym(amvt amvt, Account account, ContentResolver contentResolver) {
        this.f76389a = amvt;
        this.f76390b = account;
        this.f76391c = contentResolver;
    }

    /* renamed from: a */
    private final Map m63727a(Uri uri, long j, Set set) {
        String str;
        HashMap a = bnmt.getNewHashMap();
        if (set != null) {
            String join = TextUtils.join(",", set);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 88);
            sb.append("mimetype='vnd.android.cursor.item/group_membership' AND data1=? AND raw_contact_id IN (");
            sb.append(join);
            sb.append(")");
            str = sb.toString();
        } else {
            str = "mimetype='vnd.android.cursor.item/group_membership' AND data1=?";
        }
        Cursor query = this.f76391c.query(uri, new String[]{"raw_contact_id", "_id"}, str, new String[]{String.valueOf(j)}, null);
        while (query.moveToNext()) {
            try {
                a.put(Long.valueOf(query.getLong(0)), Long.valueOf(query.getLong(1)));
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
        if (query != null) {
            query.close();
        }
        return a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amvu.a(java.lang.Long, boolean):void
     arg types: [java.lang.Long, int]
     candidates:
      amvu.a(java.lang.Long, android.content.ContentValues):void
      amvu.a(java.lang.Long, boolean):void */
    /* renamed from: a */
    public final int mo41565a(long j, long j2, long j3) {
        Map map;
        long j4 = j;
        long j5 = j2;
        Uri a = amvt.m63471a(ContactsContract.Data.CONTENT_URI, this.f76390b);
        Map a2 = m63727a(a, j4, (Set) null);
        if (((long) a2.size()) > j3) {
            amdk.m62658a("GroupMembershipMigrater", "Too many contacts to move, contact count = %d", Integer.valueOf(a2.size()));
            return -1;
        }
        Map a3 = m63727a(a, j5, a2.keySet());
        int size = a2.size();
        StringBuilder sb = new StringBuilder(83);
        sb.append("Moving ");
        sb.append(size);
        sb.append(" contacts from group ");
        sb.append(j4);
        sb.append(" to ");
        sb.append(j5);
        sb.toString();
        Set<Long> keySet = a2.keySet();
        try {
            for (Long l : keySet) {
                long longValue = l.longValue();
                Long valueOf = Long.valueOf(longValue);
                if (!a3.containsKey(valueOf)) {
                    map = a3;
                    StringBuilder sb2 = new StringBuilder(75);
                    sb2.append("Changing membership of contact ");
                    sb2.append(longValue);
                    sb2.append(" to ");
                    sb2.append(j5);
                    sb2.toString();
                    amvu amvu = this.f76389a.f76141e;
                    amvu.f76145b.mo41496a(ContentProviderOperation.newAssertQuery(amvu.f76144a).withSelection("mimetype='vnd.android.cursor.item/group_membership' AND data1=? AND raw_contact_id=?", new String[]{String.valueOf(j2), String.valueOf(longValue)}).withExpectedCount(0), false);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data1", Long.valueOf(j2));
                    this.f76389a.f76140d.mo41460a((Long) a2.get(valueOf), contentValues);
                    this.f76389a.f76138b.mo41462a(valueOf);
                } else {
                    map = a3;
                    StringBuilder sb3 = new StringBuilder(63);
                    sb3.append("Removing contact ");
                    sb3.append(longValue);
                    sb3.append(" from ");
                    sb3.append(j4);
                    sb3.toString();
                    amvu amvu2 = this.f76389a.f76141e;
                    amvu2.f76145b.mo41496a(ContentProviderOperation.newAssertQuery(amvu2.f76144a).withSelection("mimetype='vnd.android.cursor.item/group_membership' AND data1=? AND raw_contact_id=?", new String[]{String.valueOf(j2), String.valueOf(longValue)}).withExpectedCount(1), false);
                    this.f76389a.f76140d.mo41461a((Long) a2.get(valueOf), false);
                }
                this.f76389a.mo41449a();
                j5 = j2;
                a3 = map;
            }
            this.f76389a.mo41451b();
            amdk.m62655a("GroupMembershipMigrater", "Successfully moved %d contacts and deleted group membership for %d contacts", a2.size() - a3.size(), a3.size());
            return keySet.size();
        } catch (amyc e) {
            Log.e("GroupMembershipMigrater", "Failed to move contacts", e);
            return -2;
        }
    }
}
