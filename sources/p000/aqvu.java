package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.CalendarContract;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.people.identity.models.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;

/* renamed from: aqvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqvu extends aqwj {

    /* renamed from: c */
    private String[] f86942c;

    /* renamed from: d */
    private aqqu f86943d;

    public aqvu(Context context, Person person, aqqu aqqu) {
        super(context);
        if (person.mo41044o()) {
            ArrayList a = sqc.m35954a();
            List list = ((PersonImpl) person).f81742i;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a.add(((Person.Emails) list.get(i)).mo40923i());
            }
            if (a.size() > 0) {
                this.f86942c = (String[]) a.toArray(new String[a.size()]);
            }
            this.f86943d = aqqu;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0170 A[RETURN] */
    /* renamed from: a */
    private final Cursor m72178a(boolean z, int i) {
        String[] strArr;
        String str;
        String str2;
        boolean z2 = false;
        Cursor query = getContext().getContentResolver().query(CalendarContract.Calendars.CONTENT_URI, new String[]{"_id", "calendar_access_level"}, "visible = 1 AND calendar_access_level = ? ", new String[]{"700"}, null);
        if (query != null) {
            try {
                if (query.getCount() > 0) {
                    query.moveToPosition(-1);
                    strArr = new String[query.getCount()];
                    while (query.moveToNext()) {
                        strArr[query.getPosition()] = String.valueOf(query.getInt(0));
                    }
                    if (strArr != null) {
                        return null;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    String[] strArr2 = {"title", "event_id", "dtstart", "dtend", "allDay", "description"};
                    String[] strArr3 = (String[]) sqc.m35962a((Object[][]) new String[][]{this.f86942c, strArr});
                    if (!z) {
                        str = " < ";
                    } else {
                        str = " > ";
                    }
                    String[] strArr4 = (String[]) sqc.m35962a((Object[][]) new String[][]{strArr3, new String[]{String.valueOf(currentTimeMillis), String.valueOf(-15552000000L + currentTimeMillis), String.valueOf(currentTimeMillis + 31536000000L)}});
                    if (!z) {
                        str2 = " DESC ";
                    } else {
                        str2 = " ASC ";
                    }
                    String str3 = str2.length() == 0 ? new String("dtstart") : "dtstart".concat(str2);
                    int length = this.f86942c.length;
                    if (length > 0) {
                        z2 = true;
                    }
                    bmxy.m108588a(z2);
                    StringBuilder sb = new StringBuilder("(  REPLACE(attendeeEmail, '.', '') = REPLACE(?, '.', '') COLLATE NOCASE");
                    for (int i2 = 1; i2 < length; i2++) {
                        sb.append(" OR  REPLACE(attendeeEmail, '.', '') = REPLACE(?, '.', '') COLLATE NOCASE");
                    }
                    sb.append(")");
                    String sb2 = sb.toString();
                    String a = aqqv.m71995a(strArr.length);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 88 + String.valueOf(a).length() + str.length());
                    sb3.append(sb2);
                    sb3.append(" AND calendar_id IN ");
                    sb3.append(a);
                    sb3.append(" AND dtstart");
                    sb3.append(str);
                    sb3.append(" ?  AND dtstart > ?  AND dtstart < ?  AND lastSynced = 0");
                    String sb4 = sb3.toString();
                    ContentResolver contentResolver = getContext().getContentResolver();
                    Uri uri = CalendarContract.Attendees.CONTENT_URI;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str3).length() + 18);
                    sb5.append(str3);
                    sb5.append(" LIMIT ");
                    sb5.append(i);
                    return contentResolver.query(uri, strArr2, sb4, strArr4, sb5.toString());
                }
            } finally {
                query.close();
            }
        }
        if (query != null) {
            query.close();
            strArr = null;
        } else {
            strArr = null;
        }
        if (strArr != null) {
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aqvu.a(android.database.Cursor, boolean):bngx
     arg types: [android.database.Cursor, int]
     candidates:
      aqvu.a(boolean, int):android.database.Cursor
      aqvu.a(android.database.Cursor, boolean):bngx */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aqvu.a(boolean, int):android.database.Cursor
     arg types: [int, int]
     candidates:
      aqvu.a(android.database.Cursor, boolean):bngx
      aqvu.a(boolean, int):android.database.Cursor */
    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        int i = Build.VERSION.SDK_INT;
        if (this.f86942c == null || !this.f86943d.f86623c) {
            return bngx.m109376e();
        }
        bngx a = m72179a(m72178a(true, 1), true);
        bngx a2 = m72179a(m72178a(false, 12), false);
        bngs bngs = new bngs();
        bngs.mo67666b((Iterable) a);
        bngs.mo67666b((Iterable) a2);
        return bngs.mo67664a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0142 A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015c A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015d A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0183 A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0184 A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c2 A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c3 A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e0 A[Catch:{ all -> 0x01fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x001b A[SYNTHETIC] */
    /* renamed from: a */
    private final bngx m72179a(Cursor cursor, boolean z) {
        bxvd bxvd;
        int i;
        String str;
        bxvd bxvd2;
        bzjc bzjc;
        bzjc bzjc2;
        boolean z2;
        boolean z3;
        Cursor cursor2 = cursor;
        if (cursor2 != null) {
            try {
                if (cursor.getCount() != 0) {
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        long j = cursor2.getLong(cursor2.getColumnIndex("dtend"));
                        String string = cursor2.getString(cursor2.getColumnIndex("title"));
                        int hashCode = Arrays.hashCode(new Object[]{string, cursor2.getString(cursor2.getColumnIndex("description"))});
                        if (j != 0) {
                            Integer valueOf = Integer.valueOf(hashCode);
                            if (!hashSet2.contains(valueOf)) {
                                hashSet2.add(valueOf);
                                bxvd da = bzjc.f170265j.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bzjc bzjc3 = (bzjc) da.f164949b;
                                bzjc3.f170268b = 1;
                                bzjc3.f170267a |= 1;
                                long j2 = cursor2.getLong(cursor2.getColumnIndex("dtstart")) / 1000;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bzjc bzjc4 = (bzjc) da.f164949b;
                                bzjc4.f170267a |= 512;
                                bzjc4.f170273g = j2;
                                if (!cgnz.m146325b()) {
                                    bxvd = da;
                                    i = 1;
                                } else if (cgnk.f187363a.mo6606a().mo84158a()) {
                                    long j3 = cursor2.getLong(cursor2.getColumnIndex("dtstart"));
                                    long currentTimeMillis = System.currentTimeMillis();
                                    String id = TimeZone.getDefault().getID();
                                    if (cursor2.getInt(cursor2.getColumnIndex("allDay")) == 1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    bxvd = da;
                                    i = 1;
                                    str = tew.m36877a(j3, j, currentTimeMillis, id, z3, getContext());
                                    if (cgnb.f187343a.mo6606a().mo84141a() && bmxx.m108577a(string)) {
                                        string = getContext().getResources().getString(C0126R.string.profile_untitled_event);
                                    }
                                    if (z) {
                                        Resources resources = getContext().getResources();
                                        Object[] objArr = new Object[i];
                                        objArr[0] = str;
                                        str = resources.getString(C0126R.string.profile_card_recent_interactions_future_event, objArr);
                                    }
                                    bxvd2 = bxvd;
                                    if (!bxvd2.f164950c) {
                                        bxvd2.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    bzjc = (bzjc) bxvd2.f164949b;
                                    str.getClass();
                                    int i2 = bzjc.f170267a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    bzjc.f170267a = i2;
                                    bzjc.f170272f = str;
                                    string.getClass();
                                    bzjc.f170267a = i2 | 32;
                                    bzjc.f170270d = string;
                                    if (!bzjc.f170270d.isEmpty()) {
                                        String string2 = getContext().getResources().getString(C0126R.string.profile_untitled_event);
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        bzjc bzjc5 = (bzjc) bxvd2.f164949b;
                                        string2.getClass();
                                        bzjc5.f170267a |= 32;
                                        bzjc5.f170270d = string2;
                                    }
                                    String uri = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, cursor2.getLong(cursor2.getColumnIndex("event_id"))).toString();
                                    if (!bxvd2.f164950c) {
                                        bxvd2.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    bzjc2 = (bzjc) bxvd2.f164949b;
                                    uri.getClass();
                                    bzjc2.f170267a |= 16;
                                    bzjc2.f170269c = uri;
                                    if (!hashSet.add(bzjc2.f170269c)) {
                                        arrayList.add((bzjc) bxvd2.mo74062i());
                                    }
                                } else {
                                    bxvd = da;
                                    i = 1;
                                }
                                long j4 = cursor2.getLong(cursor2.getColumnIndex("dtstart"));
                                long currentTimeMillis2 = System.currentTimeMillis();
                                String displayName = TimeZone.getDefault().getDisplayName();
                                if (cursor2.getInt(cursor2.getColumnIndex("allDay")) == i) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                str = tew.m36877a(j4, j, currentTimeMillis2, displayName, z2, getContext());
                                string = getContext().getResources().getString(C0126R.string.profile_untitled_event);
                                if (z) {
                                }
                                bxvd2 = bxvd;
                                if (!bxvd2.f164950c) {
                                }
                                bzjc = (bzjc) bxvd2.f164949b;
                                str.getClass();
                                int i22 = bzjc.f170267a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                bzjc.f170267a = i22;
                                bzjc.f170272f = str;
                                string.getClass();
                                bzjc.f170267a = i22 | 32;
                                bzjc.f170270d = string;
                                if (!bzjc.f170270d.isEmpty()) {
                                }
                                String uri2 = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, cursor2.getLong(cursor2.getColumnIndex("event_id"))).toString();
                                if (!bxvd2.f164950c) {
                                }
                                bzjc2 = (bzjc) bxvd2.f164949b;
                                uri2.getClass();
                                bzjc2.f170267a |= 16;
                                bzjc2.f170269c = uri2;
                                if (!hashSet.add(bzjc2.f170269c)) {
                                }
                            }
                        }
                    }
                    bngx a = bngx.m109368a((Collection) arrayList);
                    cursor.close();
                    return a;
                }
            } catch (Throwable th) {
                if (cursor2 != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        bngx e = bngx.m109376e();
        if (cursor2 != null) {
            cursor.close();
        }
        return e;
    }
}
