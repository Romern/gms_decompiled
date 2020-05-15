package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MediaStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pgp();

    /* renamed from: a */
    public MediaInfo f29809a;

    /* renamed from: b */
    public long f29810b;

    /* renamed from: c */
    int f29811c;

    /* renamed from: d */
    public double f29812d;

    /* renamed from: e */
    public int f29813e;

    /* renamed from: f */
    public int f29814f;

    /* renamed from: g */
    public long f29815g;

    /* renamed from: h */
    long f29816h;

    /* renamed from: i */
    double f29817i;

    /* renamed from: j */
    boolean f29818j;

    /* renamed from: k */
    long[] f29819k;

    /* renamed from: l */
    public int f29820l;

    /* renamed from: m */
    int f29821m;

    /* renamed from: n */
    String f29822n;

    /* renamed from: o */
    public JSONObject f29823o;

    /* renamed from: p */
    int f29824p;

    /* renamed from: q */
    final List f29825q;

    /* renamed from: r */
    boolean f29826r;

    /* renamed from: s */
    AdBreakStatus f29827s;

    /* renamed from: t */
    VideoInfo f29828t;

    /* renamed from: u */
    public MediaLiveSeekableRange f29829u;

    /* renamed from: v */
    MediaQueueData f29830v;

    /* renamed from: w */
    private final SparseArray f29831w;

    static {
        new ptx("MediaStatus");
    }

    public MediaStatus(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, List list, boolean z2, AdBreakStatus adBreakStatus, VideoInfo videoInfo, MediaLiveSeekableRange mediaLiveSeekableRange, MediaQueueData mediaQueueData) {
        String str2 = str;
        List list2 = list;
        this.f29825q = new ArrayList();
        this.f29831w = new SparseArray();
        this.f29809a = mediaInfo;
        this.f29810b = j;
        this.f29811c = i;
        this.f29812d = d;
        this.f29813e = i2;
        this.f29814f = i3;
        this.f29815g = j2;
        this.f29816h = j3;
        this.f29817i = d2;
        this.f29818j = z;
        this.f29819k = jArr;
        this.f29820l = i4;
        this.f29821m = i5;
        this.f29822n = str2;
        if (str2 != null) {
            try {
                this.f29823o = new JSONObject(str2);
            } catch (JSONException e) {
                this.f29823o = null;
                this.f29822n = null;
            }
        } else {
            this.f29823o = null;
        }
        this.f29824p = i6;
        if (list2 != null && !list.isEmpty()) {
            m22286a(list2);
        }
        this.f29826r = z2;
        this.f29827s = adBreakStatus;
        this.f29828t = videoInfo;
        this.f29829u = mediaLiveSeekableRange;
        this.f29830v = mediaQueueData;
    }

    /* renamed from: a */
    private final void m22286a(List list) {
        this.f29825q.clear();
        this.f29831w.clear();
        for (int i = 0; i < list.size(); i++) {
            MediaQueueItem mediaQueueItem = (MediaQueueItem) list.get(i);
            this.f29825q.add(mediaQueueItem);
            this.f29831w.put(mediaQueueItem.f29801b, Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public static final boolean m22287a(int i, int i2, int i3, int i4) {
        if (i == 1) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return i4 != 2;
                }
                if (i2 != 3) {
                    return true;
                }
            }
            if (i3 == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaStatus) {
            MediaStatus mediaStatus = (MediaStatus) obj;
            if (this.f29823o != null) {
                z = false;
            } else {
                z = true;
            }
            if (mediaStatus.f29823o != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            return z == z2 && this.f29810b == mediaStatus.f29810b && this.f29811c == mediaStatus.f29811c && this.f29812d == mediaStatus.f29812d && this.f29813e == mediaStatus.f29813e && this.f29814f == mediaStatus.f29814f && this.f29815g == mediaStatus.f29815g && this.f29817i == mediaStatus.f29817i && this.f29818j == mediaStatus.f29818j && this.f29820l == mediaStatus.f29820l && this.f29821m == mediaStatus.f29821m && this.f29824p == mediaStatus.f29824p && Arrays.equals(this.f29819k, mediaStatus.f29819k) && ptk.m31236a(Long.valueOf(this.f29816h), Long.valueOf(mediaStatus.f29816h)) && ptk.m31236a(this.f29825q, mediaStatus.f29825q) && ptk.m31236a(this.f29809a, mediaStatus.f29809a) && ((jSONObject = this.f29823o) == null || (jSONObject2 = mediaStatus.f29823o) == null || ssd.m36200a(jSONObject, jSONObject2)) && this.f29826r == mediaStatus.f29826r && ptk.m31236a(this.f29827s, mediaStatus.f29827s) && ptk.m31236a(this.f29828t, mediaStatus.f29828t) && ptk.m31236a(this.f29829u, mediaStatus.f29829u) && sdg.m34949a(this.f29830v, mediaStatus.f29830v);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29809a, Long.valueOf(this.f29810b), Integer.valueOf(this.f29811c), Double.valueOf(this.f29812d), Integer.valueOf(this.f29813e), Integer.valueOf(this.f29814f), Long.valueOf(this.f29815g), Long.valueOf(this.f29816h), Double.valueOf(this.f29817i), Boolean.valueOf(this.f29818j), Integer.valueOf(Arrays.hashCode(this.f29819k)), Integer.valueOf(this.f29820l), Integer.valueOf(this.f29821m), String.valueOf(this.f29823o), Integer.valueOf(this.f29824p), this.f29825q, Boolean.valueOf(this.f29826r), this.f29827s, this.f29828t, this.f29829u, this.f29830v});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, long[], boolean):void
     arg types: [android.os.Parcel, int, long[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
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
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f29823o;
        this.f29822n = jSONObject != null ? jSONObject.toString() : null;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f29809a, i, false);
        see.m35036a(parcel, 3, this.f29810b);
        see.m35063b(parcel, 4, this.f29811c);
        see.m35033a(parcel, 5, this.f29812d);
        see.m35063b(parcel, 6, this.f29813e);
        see.m35063b(parcel, 7, this.f29814f);
        see.m35036a(parcel, 8, this.f29815g);
        see.m35036a(parcel, 9, this.f29816h);
        see.m35033a(parcel, 10, this.f29817i);
        see.m35051a(parcel, 11, this.f29818j);
        see.m35056a(parcel, 12, this.f29819k, false);
        see.m35063b(parcel, 13, this.f29820l);
        see.m35063b(parcel, 14, this.f29821m);
        see.m35046a(parcel, 15, this.f29822n, false);
        see.m35063b(parcel, 16, this.f29824p);
        see.m35066c(parcel, 17, this.f29825q, false);
        see.m35051a(parcel, 18, this.f29826r);
        see.m35040a(parcel, 19, this.f29827s, i, false);
        see.m35040a(parcel, 20, this.f29828t, i, false);
        see.m35040a(parcel, 21, this.f29829u, i, false);
        see.m35040a(parcel, 22, this.f29830v, i, false);
        see.m35062b(parcel, a);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x04b3, code lost:
        if (r12 != 1) goto L_0x04ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x04ff  */
    /* renamed from: a */
    public final int mo17560a(JSONObject jSONObject, int i) {
        int i2;
        long[] jArr;
        boolean z;
        char c;
        int i3;
        char c2;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        int i4;
        int i5;
        MediaInfo mediaInfo;
        boolean z2;
        MediaQueueItem mediaQueueItem;
        boolean z3;
        MediaInfo mediaInfo2;
        int i6;
        JSONObject jSONObject2 = jSONObject;
        JSONObject optJSONObject = jSONObject2.optJSONObject("extendedStatus");
        if (optJSONObject != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    arrayList.add(keys.next());
                }
                JSONObject jSONObject3 = new JSONObject(jSONObject2, (String[]) arrayList.toArray(new String[0]));
                Iterator<String> keys2 = optJSONObject.keys();
                while (keys2.hasNext()) {
                    String next = keys2.next();
                    jSONObject3.put(next, optJSONObject.get(next));
                }
                jSONObject3.remove("extendedStatus");
                jSONObject2 = jSONObject3;
            } catch (JSONException e) {
            }
        }
        long j = jSONObject2.getLong("mediaSessionId");
        if (j != this.f29810b) {
            this.f29810b = j;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (jSONObject2.has("playerState")) {
            String string = jSONObject2.getString("playerState");
            int i7 = !string.equals("IDLE") ? !string.equals("PLAYING") ? !string.equals("PAUSED") ? !string.equals("BUFFERING") ? string.equals("LOADING") ? 5 : 0 : 4 : 3 : 2 : 1;
            if (i7 != this.f29813e) {
                this.f29813e = i7;
                i2 |= 2;
            }
            if (i7 == 1 && jSONObject2.has("idleReason")) {
                String string2 = jSONObject2.getString("idleReason");
                int i8 = !string2.equals("CANCELLED") ? !string2.equals("INTERRUPTED") ? !string2.equals("FINISHED") ? string2.equals("ERROR") ? 4 : 0 : 1 : 3 : 2;
                if (i8 != this.f29814f) {
                    this.f29814f = i8;
                    i2 |= 2;
                }
            }
        }
        if (jSONObject2.has("playbackRate")) {
            double d = jSONObject2.getDouble("playbackRate");
            if (this.f29812d != d) {
                this.f29812d = d;
                i2 |= 2;
            }
        }
        if (jSONObject2.has("currentTime")) {
            long a = ptk.m31228a(jSONObject2.getDouble("currentTime"));
            if (a != this.f29815g) {
                this.f29815g = a;
                i2 |= 2;
            }
            i2 |= 128;
        }
        if (jSONObject2.has("supportedMediaCommands")) {
            long j2 = jSONObject2.getLong("supportedMediaCommands");
            if (j2 != this.f29816h) {
                this.f29816h = j2;
                i2 |= 2;
            }
        }
        if (jSONObject2.has("volume") && i == 0) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("volume");
            double d2 = jSONObject4.getDouble("level");
            if (d2 != this.f29817i) {
                this.f29817i = d2;
                i2 |= 2;
            }
            boolean z4 = jSONObject4.getBoolean("muted");
            if (z4 != this.f29818j) {
                this.f29818j = z4;
                i2 |= 2;
            }
        }
        if (jSONObject2.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("activeTrackIds");
            if (jSONArray != null) {
                jArr = new long[jSONArray.length()];
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    jArr[i9] = jSONArray.getLong(i9);
                }
            } else {
                jArr = null;
            }
            long[] jArr2 = this.f29819k;
            if (jArr2 != null && jArr2.length == jArr.length) {
                int i10 = 0;
                while (true) {
                    if (i10 < jArr.length) {
                        if (this.f29819k[i10] != jArr[i10]) {
                            z = true;
                            break;
                        }
                        i10++;
                    } else {
                        z = false;
                        break;
                    }
                }
            } else {
                z = true;
            }
            if (z) {
                this.f29819k = jArr;
            }
        } else {
            jArr = null;
            z = this.f29819k != null;
        }
        if (z) {
            this.f29819k = jArr;
            i2 |= 2;
        }
        if (jSONObject2.has("customData")) {
            this.f29823o = jSONObject2.getJSONObject("customData");
            this.f29822n = null;
            i2 |= 2;
        }
        if (jSONObject2.has("media")) {
            JSONObject jSONObject5 = jSONObject2.getJSONObject("media");
            MediaInfo mediaInfo3 = new MediaInfo(jSONObject5);
            MediaInfo mediaInfo4 = this.f29809a;
            if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                this.f29809a = mediaInfo3;
                i2 |= 2;
            }
            if (jSONObject5.has("metadata")) {
                i2 |= 4;
            }
        }
        if (jSONObject2.has("currentItemId") && this.f29811c != (i6 = jSONObject2.getInt("currentItemId"))) {
            this.f29811c = i6;
            i2 |= 2;
        }
        int optInt = jSONObject2.optInt("preloadedItemId", 0);
        if (this.f29821m != optInt) {
            this.f29821m = optInt;
            i2 |= 16;
        }
        int optInt2 = jSONObject2.optInt("loadingItemId", 0);
        int i11 = this.f29820l;
        if (i11 != optInt2) {
            this.f29820l = optInt2;
            i2 |= 2;
        } else {
            optInt2 = i11;
        }
        MediaInfo mediaInfo5 = this.f29809a;
        if (m22287a(this.f29813e, this.f29814f, optInt2, mediaInfo5 != null ? mediaInfo5.f29747b : -1)) {
            this.f29811c = 0;
            this.f29820l = 0;
            this.f29821m = 0;
            if (!this.f29825q.isEmpty()) {
                this.f29824p = 0;
                this.f29825q.clear();
                this.f29831w.clear();
                i2 |= 8;
            }
        } else {
            if (jSONObject2.has("repeatMode")) {
                Integer a2 = puh.m31374a(jSONObject2.getString("repeatMode"));
                Integer valueOf = Integer.valueOf(a2 != null ? a2.intValue() : this.f29824p);
                if (this.f29824p != valueOf.intValue()) {
                    this.f29824p = valueOf.intValue();
                    z2 = true;
                    if (jSONObject2.has("items")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("items");
                        int length = jSONArray2.length();
                        SparseArray sparseArray = new SparseArray();
                        for (int i12 = 0; i12 < length; i12++) {
                            sparseArray.put(i12, Integer.valueOf(jSONArray2.getJSONObject(i12).getInt("itemId")));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < length; i13++) {
                            Integer num = (Integer) sparseArray.get(i13);
                            JSONObject jSONObject6 = jSONArray2.getJSONObject(i13);
                            Integer num2 = (Integer) this.f29831w.get(num.intValue());
                            if (num2 != null) {
                                mediaQueueItem = (MediaQueueItem) this.f29825q.get(num2.intValue());
                            } else {
                                mediaQueueItem = null;
                            }
                            if (mediaQueueItem != null) {
                                z3 = z2 | mediaQueueItem.mo17556a(jSONObject6);
                                arrayList2.add(mediaQueueItem);
                                if (i13 != ((Integer) this.f29831w.get(num.intValue())).intValue()) {
                                    z3 = true;
                                }
                            } else if (num.intValue() == this.f29811c && (mediaInfo2 = this.f29809a) != null) {
                                MediaQueueItem a3 = new pgl(mediaInfo2).mo23047a();
                                a3.mo17556a(jSONObject6);
                                arrayList2.add(a3);
                                z3 = true;
                            } else {
                                arrayList2.add(new MediaQueueItem(jSONObject6));
                                z3 = true;
                            }
                        }
                        if (this.f29825q.size() != length) {
                            z2 = true;
                        }
                        m22286a(arrayList2);
                    }
                    if (z2) {
                        i2 |= 8;
                    }
                }
            }
            z2 = false;
            if (jSONObject2.has("items")) {
            }
            if (z2) {
            }
        }
        AdBreakStatus a4 = AdBreakStatus.m22253a(jSONObject2.optJSONObject("breakStatus"));
        AdBreakStatus adBreakStatus = this.f29827s;
        if ((adBreakStatus == null && a4 != null) || (adBreakStatus != null && !adBreakStatus.equals(a4))) {
            this.f29826r = a4 != null;
            this.f29827s = a4;
            i2 |= 32;
        }
        VideoInfo a5 = VideoInfo.m22293a(jSONObject2.optJSONObject("videoInfo"));
        VideoInfo videoInfo = this.f29828t;
        if ((videoInfo == null && a5 != null) || (videoInfo != null && !videoInfo.equals(a5))) {
            this.f29828t = a5;
            i2 |= 64;
        }
        if (jSONObject2.has("breakInfo") && (mediaInfo = this.f29809a) != null) {
            mediaInfo.mo17527a(jSONObject2.getJSONObject("breakInfo"));
            i2 |= 2;
        }
        if (jSONObject2.has("queueData")) {
            pgj pgj = new pgj();
            JSONObject jSONObject7 = jSONObject2.getJSONObject("queueData");
            MediaQueueData mediaQueueData = pgj.f39082a;
            mediaQueueData.mo17552a();
            if (jSONObject7 != null) {
                mediaQueueData.f29791a = jSONObject7.optString("id", null);
                mediaQueueData.f29792b = jSONObject7.optString("entity", null);
                String optString = jSONObject7.optString("queueType");
                switch (optString.hashCode()) {
                    case -1803151310:
                        if (optString.equals("PODCAST_SERIES")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1758903120:
                        if (optString.equals("RADIO_STATION")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1632865838:
                        if (optString.equals("PLAYLIST")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1319760993:
                        if (optString.equals("AUDIOBOOK")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1088524588:
                        if (optString.equals("TV_SERIES")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 62359119:
                        if (optString.equals("ALBUM")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 73549584:
                        if (optString.equals("MOVIE")) {
                            c = 8;
                            break;
                        }
                        c = 65535;
                        break;
                    case 393100598:
                        if (optString.equals("VIDEO_PLAYLIST")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 902303413:
                        if (optString.equals("LIVE_TV")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        i5 = 1;
                        mediaQueueData.f29793c = i5;
                        break;
                    case 1:
                        mediaQueueData.f29793c = 2;
                        break;
                    case 2:
                        i5 = 3;
                        mediaQueueData.f29793c = i5;
                        break;
                    case 3:
                        i5 = 4;
                        mediaQueueData.f29793c = i5;
                        break;
                    case 4:
                        i5 = 5;
                        mediaQueueData.f29793c = i5;
                        break;
                    case 5:
                        i5 = 6;
                        mediaQueueData.f29793c = i5;
                        break;
                    case 6:
                        i5 = 7;
                        mediaQueueData.f29793c = i5;
                        break;
                    case 7:
                        mediaQueueData.f29793c = 8;
                        break;
                    case 8:
                        i5 = 9;
                        mediaQueueData.f29793c = i5;
                        break;
                }
                mediaQueueData.f29794d = jSONObject7.optString("name", null);
                if (jSONObject7.has("containerMetadata")) {
                    pgh pgh = new pgh();
                    JSONObject optJSONObject2 = jSONObject7.optJSONObject("containerMetadata");
                    MediaQueueContainerMetadata mediaQueueContainerMetadata = pgh.f39081a;
                    mediaQueueContainerMetadata.mo17548a();
                    if (optJSONObject2 != null) {
                        String optString2 = optJSONObject2.optString("containerType", "");
                        int hashCode = optString2.hashCode();
                        if (hashCode != 6924225) {
                            if (hashCode == 828666841 && optString2.equals("GENERIC_CONTAINER")) {
                                c2 = 0;
                                if (c2 != 0) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                mediaQueueContainerMetadata.f29786a = i4;
                                mediaQueueContainerMetadata.f29787b = optJSONObject2.optString("title", null);
                                optJSONArray = optJSONObject2.optJSONArray("sections");
                                if (optJSONArray != null) {
                                    mediaQueueContainerMetadata.f29788c = new ArrayList();
                                    for (int i14 = 0; i14 < optJSONArray.length(); i14++) {
                                        JSONObject optJSONObject3 = optJSONArray.optJSONObject(i14);
                                        if (optJSONObject3 != null) {
                                            MediaMetadata mediaMetadata = new MediaMetadata(0);
                                            mediaMetadata.mo17540a(optJSONObject3);
                                            mediaQueueContainerMetadata.f29788c.add(mediaMetadata);
                                        }
                                    }
                                    i3 = 0;
                                } else {
                                    i3 = 0;
                                }
                                optJSONArray2 = optJSONObject2.optJSONArray("containerImages");
                                if (optJSONArray2 != null) {
                                    mediaQueueContainerMetadata.f29789d = new ArrayList();
                                    pui.m31378a(mediaQueueContainerMetadata.f29789d, optJSONArray2);
                                }
                                mediaQueueContainerMetadata.f29790e = optJSONObject2.optDouble("containerDuration", mediaQueueContainerMetadata.f29790e);
                            }
                        } else if (optString2.equals("AUDIOBOOK_CONTAINER")) {
                            c2 = 1;
                            if (c2 != 0) {
                            }
                            mediaQueueContainerMetadata.f29786a = i4;
                            mediaQueueContainerMetadata.f29787b = optJSONObject2.optString("title", null);
                            optJSONArray = optJSONObject2.optJSONArray("sections");
                            if (optJSONArray != null) {
                            }
                            optJSONArray2 = optJSONObject2.optJSONArray("containerImages");
                            if (optJSONArray2 != null) {
                            }
                            mediaQueueContainerMetadata.f29790e = optJSONObject2.optDouble("containerDuration", mediaQueueContainerMetadata.f29790e);
                        }
                        c2 = 65535;
                        if (c2 != 0) {
                        }
                        mediaQueueContainerMetadata.f29786a = i4;
                        mediaQueueContainerMetadata.f29787b = optJSONObject2.optString("title", null);
                        optJSONArray = optJSONObject2.optJSONArray("sections");
                        if (optJSONArray != null) {
                        }
                        optJSONArray2 = optJSONObject2.optJSONArray("containerImages");
                        if (optJSONArray2 != null) {
                        }
                        mediaQueueContainerMetadata.f29790e = optJSONObject2.optDouble("containerDuration", mediaQueueContainerMetadata.f29790e);
                    } else {
                        i3 = 0;
                    }
                    mediaQueueData.f29795e = new MediaQueueContainerMetadata(pgh.f39081a);
                } else {
                    i3 = 0;
                }
                Integer a6 = puh.m31374a(jSONObject7.optString("repeatMode"));
                if (a6 != null) {
                    mediaQueueData.f29796f = a6.intValue();
                }
                JSONArray optJSONArray3 = jSONObject7.optJSONArray("items");
                if (optJSONArray3 != null) {
                    mediaQueueData.f29797g = new ArrayList();
                    while (i3 < optJSONArray3.length()) {
                        JSONObject optJSONObject4 = optJSONArray3.optJSONObject(i3);
                        if (optJSONObject4 != null) {
                            try {
                                mediaQueueData.f29797g.add(new MediaQueueItem(optJSONObject4));
                            } catch (JSONException e2) {
                            }
                        }
                        i3++;
                    }
                }
                mediaQueueData.f29798h = jSONObject7.optInt("startIndex", mediaQueueData.f29798h);
                if (jSONObject7.has("startTime")) {
                    mediaQueueData.f29799i = ptk.m31228a(jSONObject7.optDouble("startTime", (double) mediaQueueData.f29799i));
                }
            }
            this.f29830v = new MediaQueueData(pgj.f39082a);
        }
        if (jSONObject2.has("liveSeekableRange")) {
            this.f29829u = MediaLiveSeekableRange.m22272a(jSONObject2.optJSONObject("liveSeekableRange"));
            return i2 | 2;
        }
        if (this.f29829u != null) {
            i2 |= 2;
        }
        this.f29829u = null;
        return i2;
    }

    public MediaStatus(JSONObject jSONObject) {
        this(null, 0, 0, 0.0d, 0, 0, 0, 0, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
        mo17560a(jSONObject, 0);
    }
}
