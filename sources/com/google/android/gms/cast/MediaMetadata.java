package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MediaMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pgg();

    /* renamed from: d */
    private static final String[] f29781d = {null, "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};

    /* renamed from: e */
    private static final pgf f29782e;

    /* renamed from: a */
    public final List f29783a;

    /* renamed from: b */
    public final Bundle f29784b;

    /* renamed from: c */
    public int f29785c;

    static {
        pgf pgf = new pgf();
        pgf.mo23039a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        pgf.mo23039a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        pgf.mo23039a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        pgf.mo23039a("com.google.android.gms.cast.metadata.TITLE", "title", 1);
        pgf.mo23039a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        pgf.mo23039a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        pgf.mo23039a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        pgf.mo23039a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        pgf.mo23039a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        pgf.mo23039a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        pgf.mo23039a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        pgf.mo23039a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        pgf.mo23039a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        pgf.mo23039a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        pgf.mo23039a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        pgf.mo23039a("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        pgf.mo23039a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        pgf.mo23039a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        pgf.mo23039a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        pgf.mo23039a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        pgf.mo23039a("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        pgf.mo23039a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        pgf.mo23039a("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        pgf.mo23039a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        pgf.mo23039a("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        pgf.mo23039a("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        pgf.mo23039a("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        pgf.mo23039a("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        f29782e = pgf;
    }

    public MediaMetadata() {
        this(0);
    }

    /* renamed from: a */
    private final boolean m22273a(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !m22273a((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj != null) {
                if (!obj.equals(obj2)) {
                    return false;
                }
            } else if (obj2 != null || !bundle2.containsKey(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m22274b(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            int b = f29782e.mo23040b(str);
            if (b != i && b != 0) {
                String str2 = f29781d[i];
                StringBuilder sb = new StringBuilder(str.length() + 21 + String.valueOf(str2).length());
                sb.append("Value for ");
                sb.append(str);
                sb.append(" must be a ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString());
            }
            return;
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    /* renamed from: c */
    public final int mo17543c(String str) {
        m22274b(str, 2);
        return this.f29784b.getInt(str);
    }

    /* renamed from: d */
    public final Calendar mo17544d(String str) {
        m22274b(str, 4);
        String string = this.f29784b.getString(str);
        if (string != null) {
            return pui.m31376a(string);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaMetadata) {
            MediaMetadata mediaMetadata = (MediaMetadata) obj;
            return m22273a(this.f29784b, mediaMetadata.f29784b) && this.f29783a.equals(mediaMetadata.f29783a);
        }
    }

    public final int hashCode() {
        int i = 17;
        for (String str : this.f29784b.keySet()) {
            i = (i * 31) + this.f29784b.get(str).hashCode();
        }
        return (i * 31) + this.f29783a.hashCode();
    }

    public MediaMetadata(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f29783a, false);
        see.m35037a(parcel, 3, this.f29784b, false);
        see.m35063b(parcel, 4, this.f29785c);
        see.m35062b(parcel, a);
    }

    public MediaMetadata(List list, Bundle bundle, int i) {
        this.f29783a = list;
        this.f29784b = bundle;
        this.f29785c = i;
    }

    /* renamed from: b */
    public final String mo17542b(String str) {
        m22274b(str, 1);
        return this.f29784b.getString(str);
    }

    /* renamed from: a */
    public final JSONObject mo17537a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.f29785c);
        } catch (JSONException e) {
        }
        JSONArray a = pui.m31377a(this.f29783a);
        if (a.length() != 0) {
            try {
                jSONObject.put("images", a);
            } catch (JSONException e2) {
            }
        }
        ArrayList<String> arrayList = new ArrayList();
        int i = this.f29785c;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            for (String str : arrayList) {
                if (this.f29784b.containsKey(str)) {
                    int b = f29782e.mo23040b(str);
                    if (b != 1) {
                        if (b == 2) {
                            jSONObject.put(f29782e.mo23038a(str), this.f29784b.getInt(str));
                        } else if (b == 3) {
                            jSONObject.put(f29782e.mo23038a(str), this.f29784b.getDouble(str));
                        } else if (b != 4) {
                            if (b == 5) {
                                jSONObject.put(f29782e.mo23038a(str), ptk.m31227a(this.f29784b.getLong(str)));
                            }
                        }
                    }
                    jSONObject.put(f29782e.mo23038a(str), this.f29784b.getString(str));
                }
            }
            for (String str2 : this.f29784b.keySet()) {
                if (!str2.startsWith("com.google.")) {
                    Object obj = this.f29784b.get(str2);
                    if (obj instanceof String) {
                        jSONObject.put(str2, obj);
                    } else if (obj instanceof Integer) {
                        jSONObject.put(str2, obj);
                    } else if (obj instanceof Double) {
                        jSONObject.put(str2, obj);
                    }
                }
            }
        } catch (JSONException e3) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo17538a(String str, int i) {
        m22274b(str, 2);
        this.f29784b.putInt(str, i);
    }

    /* renamed from: a */
    public final void mo17539a(String str, String str2) {
        m22274b(str, 1);
        this.f29784b.putString(str, str2);
    }

    /* renamed from: a */
    public final void mo17540a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        this.f29784b.clear();
        this.f29783a.clear();
        this.f29785c = 0;
        try {
            this.f29785c = jSONObject2.getInt("metadataType");
        } catch (JSONException e) {
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("images");
        if (optJSONArray != null) {
            pui.m31378a(this.f29783a, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.f29785c;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!"metadataType".equals(next)) {
                    String str = (String) f29782e.f39078a.get(next);
                    if (str == null) {
                        Object obj = jSONObject2.get(next);
                        if (obj instanceof String) {
                            this.f29784b.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.f29784b.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.f29784b.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(str)) {
                        try {
                            Object obj2 = jSONObject2.get(next);
                            if (obj2 != null) {
                                int b = f29782e.mo23040b(str);
                                if (b != 1) {
                                    if (b != 2) {
                                        if (b == 3) {
                                            double optDouble = jSONObject2.optDouble(next);
                                            if (!Double.isNaN(optDouble)) {
                                                this.f29784b.putDouble(str, optDouble);
                                            }
                                        } else if (b != 4) {
                                            if (b == 5) {
                                                this.f29784b.putLong(str, ptk.m31228a((double) jSONObject2.optLong(next)));
                                            }
                                        } else if (obj2 instanceof String) {
                                            String str2 = (String) obj2;
                                            if (pui.m31376a(str2) != null) {
                                                this.f29784b.putString(str, str2);
                                            }
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.f29784b.putInt(str, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    this.f29784b.putString(str, (String) obj2);
                                }
                            }
                        } catch (JSONException e2) {
                        }
                    }
                }
            }
        } catch (JSONException e3) {
        }
    }

    /* renamed from: a */
    public final boolean mo17541a(String str) {
        return this.f29784b.containsKey(str);
    }
}
