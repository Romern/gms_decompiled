package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: uli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uli extends uny {

    /* renamed from: a */
    public uzy f48118a;

    /* renamed from: b */
    public Long f48119b;

    /* renamed from: c */
    private final long f48120c;

    public uli(uno uno, long j, long j2, uzx uzx, String str, Long l, long j3) {
        super(uno, ull.f48129a, j);
        boolean z;
        boolean z2 = true;
        if (j2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        sdo.m34959a(uzx);
        sdo.m34974b(j3 < 0 ? false : z2);
        m38927a(str, l, j3);
        this.f48120c = j2;
        this.f48118a = uzy.m39860a(uzx, str, j3);
        this.f48119b = l;
    }

    /* renamed from: a */
    public static uli m38926a(uno uno, Cursor cursor) {
        vaa vaa;
        long j;
        HashSet hashSet;
        boolean z;
        long longValue = ulk.ACCOUNT_ID.f48128g.mo27705b(cursor).longValue();
        String a = ulk.NEXT_PAGE_TOKEN.f48128g.mo27702a(cursor);
        Long b = ulk.CLIP_TIME.f48128g.mo27705b(cursor);
        long c = ulk.NUM_PAGES_RETRIEVED.f48128g.mo27710c(cursor);
        String a2 = ulk.FEED_TYPE.f48128g.mo27702a(cursor);
        String a3 = ulk.FEED_PARAMETERS.f48128g.mo27702a(cursor);
        uzz[] values = uzz.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            uzz uzz = values[i];
            if (!uzz.f48797f.equals(a2)) {
                i++;
            } else {
                int ordinal = uzz.ordinal();
                if (ordinal == 0) {
                    sdo.m34959a((Object) a3);
                    String[] split = TextUtils.split(a3, ":");
                    if (split.length != 1) {
                        try {
                            JSONObject jSONObject = new JSONObject(a3);
                            j = jSONObject.getLong("changeStamp");
                            JSONArray jSONArray = jSONObject.getJSONArray("sortedAppIds");
                            hashSet = new HashSet();
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                hashSet.add(jSONArray.getString(i2));
                            }
                        } catch (JSONException e) {
                            throw new RuntimeException("JSON encoding failed", e);
                        }
                    } else {
                        j = Long.parseLong(split[0]);
                        hashSet = new HashSet();
                    }
                    vaa = new uzv(j, hashSet);
                } else if (ordinal == 1) {
                    sdo.m34959a((Object) a3);
                    String[] split2 = TextUtils.split(a3, ":");
                    if (split2.length != 1) {
                        try {
                            z = new JSONObject(a3).getBoolean("foldersOnly");
                        } catch (JSONException e2) {
                            throw new RuntimeException("JSON encoding failed", e2);
                        }
                    } else {
                        z = Boolean.parseBoolean(split2[0]);
                    }
                    vaa = new uzw(z);
                } else if (ordinal == 2) {
                    sdo.m34959a((Object) a3);
                    vaa = vab.m39866a(a3);
                } else if (ordinal == 3) {
                    sdo.m34959a((Object) a3);
                    vaa = new uzu(bnic.m109496a((Object[]) TextUtils.split(a3, ",")));
                } else if (ordinal == 4) {
                    sdo.m34959a((Object) a3);
                    vaa = new vaa();
                } else {
                    throw null;
                }
                return new uli(uno, ull.f48129a.f48341a.mo27705b(cursor).longValue(), longValue, vaa, a, b, c);
            }
        }
        String valueOf = String.valueOf(a2);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown FeedType value: ") : "Unknown FeedType value: ".concat(valueOf));
    }

    /* renamed from: b */
    public final uzx mo27690b() {
        return this.f48118a.f48788a;
    }

    /* renamed from: c */
    public final boolean mo27691c() {
        return this.f48118a.mo28148c();
    }

    /* renamed from: d */
    public final long mo27692d() {
        return this.f48118a.f48789b;
    }

    public final String toString() {
        return String.format(Locale.US, "PartialFeed[accountSqlId=%s, clipTime=%s, sqlId=%s, feedState=%s", Long.valueOf(this.f48120c), this.f48119b, Long.valueOf(this.f48366m), this.f48118a);
    }

    /* renamed from: a */
    private static void m38927a(String str, Long l, long j) {
        boolean z = true;
        if ((str == null && j > 0) != (l == null)) {
            z = false;
        }
        String valueOf = String.valueOf(l);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid nextUri=");
        sb.append(str);
        sb.append(", clipTime=");
        sb.append(valueOf);
        sdo.m34975b(z, sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(ulk.ACCOUNT_ID.f48128g.mo27700a(), Long.valueOf(this.f48120c));
        contentValues.put(ulk.FEED_TYPE.f48128g.mo27700a(), this.f48118a.f48788a.f48787c.f48797f);
        contentValues.put(ulk.FEED_PARAMETERS.f48128g.mo27700a(), this.f48118a.f48788a.mo28138a());
        contentValues.put(ulk.NEXT_PAGE_TOKEN.f48128g.mo27700a(), this.f48118a.mo28146a());
        contentValues.put(ulk.CLIP_TIME.f48128g.mo27700a(), this.f48119b);
        contentValues.put(ulk.NUM_PAGES_RETRIEVED.f48128g.mo27700a(), Long.valueOf(this.f48118a.f48789b));
    }

    /* renamed from: a */
    public final void mo27689a(String str, Long l) {
        m38927a(str, l, this.f48118a.f48789b + 1);
        this.f48118a = uzy.m39861a(this.f48118a, str);
        this.f48119b = l;
    }
}
