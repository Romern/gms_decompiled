package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* renamed from: ujl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ujl extends uny {

    /* renamed from: g */
    private static final sbw f47791g = new sbw("DriveAppRow", "");

    /* renamed from: a */
    public final long f47792a;

    /* renamed from: b */
    public final String f47793b;

    /* renamed from: c */
    public long f47794c;

    /* renamed from: d */
    public Long f47795d;

    /* renamed from: e */
    public Boolean f47796e;

    /* renamed from: f */
    public Set f47797f;

    public ujl(uno uno, long j, long j2, String str, long j3, Long l, Boolean bool, Set set) {
        super(uno, ujo.f47807a, j);
        this.f47792a = j2;
        this.f47793b = str;
        this.f47794c = j3;
        this.f47795d = l;
        this.f47796e = bool;
        this.f47797f = set;
    }

    /* renamed from: a */
    public static ujl m38703a(uno uno, Cursor cursor) {
        String[] strArr;
        int i;
        long longValue = ujn.ACCOUNT_ID.f47806h.mo27705b(cursor).longValue();
        String a = ujn.SDK_APP_ID.f47806h.mo27702a(cursor);
        long c = ujn.EXPIRY_TIMESTAMP.f47806h.mo27710c(cursor);
        Long b = ujn.APPDATA_ROOT_ENTRY_ID.f47806h.mo27705b(cursor);
        Boolean d = ujn.IS_APPDATA_ROOT_PLACEHOLDER.f47806h.mo27713d(cursor);
        long longValue2 = ujo.f47807a.f48341a.mo27705b(cursor).longValue();
        String a2 = ujn.SCOPES.f47806h.mo27702a(cursor);
        HashSet hashSet = new HashSet();
        if (a2 != null && !a2.isEmpty()) {
            String[] split = TextUtils.split(a2, ",");
            int length = split.length;
            int i2 = 0;
            while (i2 < length) {
                String str = split[i2];
                try {
                    int intValue = Integer.valueOf(str).intValue();
                    if (twt.m37572a(intValue) == null) {
                        strArr = split;
                        try {
                            f47791g.mo25374b("DriveAppRow", "Invalid scope int in database: %s", str);
                            i = length;
                        } catch (NumberFormatException e) {
                            e = e;
                            Object[] objArr = {str};
                            i = length;
                            f47791g.mo25378c("DriveAppRow", String.format("Invalid scope string in database %s", objArr), e);
                            i2++;
                            length = i;
                            split = strArr;
                        }
                    } else {
                        strArr = split;
                        hashSet.add(twt.m37572a(intValue));
                        i = length;
                    }
                } catch (NumberFormatException e2) {
                    e = e2;
                    strArr = split;
                    Object[] objArr2 = {str};
                    i = length;
                    f47791g.mo25378c("DriveAppRow", String.format("Invalid scope string in database %s", objArr2), e);
                    i2++;
                    length = i;
                    split = strArr;
                }
                i2++;
                length = i;
                split = strArr;
            }
        }
        return new ujl(uno, longValue2, longValue, a, c, b, d, hashSet);
    }

    /* renamed from: b */
    private static String m38704b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(((twt) it.next()).f46780g));
        }
        return TextUtils.join(",", hashSet);
    }

    public final String toString() {
        return String.format(Locale.US, "DriveAppRow [accountId=%d sdkAppId=%s, expiryTimestamp=%d, appDataRootEntryId=%s, isAppDataRootPlaceHolder=%s, scopes=%s]", Long.valueOf(this.f47792a), this.f47793b, Long.valueOf(this.f47794c), this.f47795d, this.f47796e, m38704b(this.f47797f));
    }

    /* renamed from: b */
    public final void mo27518b() {
        this.f47796e = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(ujn.ACCOUNT_ID.f47806h.mo27700a(), Long.valueOf(this.f47792a));
        contentValues.put(ujn.SDK_APP_ID.f47806h.mo27700a(), this.f47793b);
        contentValues.put(ujn.EXPIRY_TIMESTAMP.f47806h.mo27700a(), Long.valueOf(this.f47794c));
        contentValues.put(ujn.APPDATA_ROOT_ENTRY_ID.f47806h.mo27700a(), this.f47795d);
        contentValues.put(ujn.IS_APPDATA_ROOT_PLACEHOLDER.f47806h.mo27700a(), this.f47796e);
        contentValues.put(ujn.SCOPES.f47806h.mo27700a(), m38704b(this.f47797f));
    }

    /* renamed from: a */
    public final void mo27517a(Set set) {
        this.f47797f = new HashSet(set);
    }
}
