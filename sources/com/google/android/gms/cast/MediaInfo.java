package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new pgb();

    /* renamed from: a */
    public String f29746a;

    /* renamed from: b */
    public int f29747b;

    /* renamed from: c */
    public String f29748c;

    /* renamed from: d */
    public MediaMetadata f29749d;

    /* renamed from: e */
    public long f29750e;

    /* renamed from: f */
    public List f29751f;

    /* renamed from: g */
    public TextTrackStyle f29752g;

    /* renamed from: h */
    String f29753h;

    /* renamed from: i */
    public String f29754i;

    /* renamed from: j */
    public VastAdsRequest f29755j;

    /* renamed from: k */
    public long f29756k;

    /* renamed from: l */
    public String f29757l;

    /* renamed from: m */
    public String f29758m;

    /* renamed from: n */
    private List f29759n;

    /* renamed from: o */
    private List f29760o;

    /* renamed from: p */
    private JSONObject f29761p;

    public MediaInfo(String str) {
        this(str, -1, null, null, -1, null, null, null, null, null, null, null, -1, null, null);
        if (str == null) {
            throw new IllegalArgumentException("contentID cannot be null");
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x020a A[Catch:{ JSONException -> 0x0216 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0212 A[Catch:{ JSONException -> 0x0216 }] */
    /* renamed from: a */
    public final JSONObject mo17526a() {
        int i;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("contentId", this.f29746a);
        jSONObject2.putOpt("contentUrl", this.f29758m);
        int i2 = this.f29747b;
        jSONObject2.put("streamType", i2 != 1 ? i2 != 2 ? "NONE" : "LIVE" : "BUFFERED");
        String str = this.f29748c;
        if (str != null) {
            jSONObject2.put("contentType", str);
        }
        MediaMetadata mediaMetadata = this.f29749d;
        if (mediaMetadata != null) {
            jSONObject2.put("metadata", mediaMetadata.mo17537a());
        }
        long j = this.f29750e;
        if (j <= -1) {
            jSONObject2.put("duration", JSONObject.NULL);
        } else {
            jSONObject2.put("duration", ptk.m31227a(j));
        }
        if (this.f29751f != null) {
            JSONArray jSONArray = new JSONArray();
            for (MediaTrack mediaTrack : this.f29751f) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("trackId", mediaTrack.f29832a);
                    int i3 = mediaTrack.f29833b;
                    if (i3 == 1) {
                        jSONObject3.put("type", "TEXT");
                    } else if (i3 == 2) {
                        jSONObject3.put("type", "AUDIO");
                    } else if (i3 == 3) {
                        jSONObject3.put("type", "VIDEO");
                    }
                    String str2 = mediaTrack.f29834c;
                    if (str2 != null) {
                        jSONObject3.put("trackContentId", str2);
                    }
                    String str3 = mediaTrack.f29835d;
                    if (str3 != null) {
                        jSONObject3.put("trackContentType", str3);
                    }
                    String str4 = mediaTrack.f29836e;
                    if (str4 != null) {
                        jSONObject3.put("name", str4);
                    }
                    if (!TextUtils.isEmpty(mediaTrack.f29837f)) {
                        jSONObject3.put("language", mediaTrack.f29837f);
                    }
                    int i4 = mediaTrack.f29838g;
                    if (i4 == 1) {
                        jSONObject3.put("subtype", "SUBTITLES");
                    } else if (i4 == 2) {
                        jSONObject3.put("subtype", "CAPTIONS");
                    } else if (i4 == 3) {
                        jSONObject3.put("subtype", "DESCRIPTIONS");
                    } else if (i4 == 4) {
                        jSONObject3.put("subtype", "CHAPTERS");
                    } else if (i4 == 5) {
                        jSONObject3.put("subtype", "METADATA");
                    }
                    JSONObject jSONObject4 = mediaTrack.f29840i;
                    if (jSONObject4 != null) {
                        jSONObject3.put("customData", jSONObject4);
                    }
                } catch (JSONException e) {
                }
                try {
                    jSONArray.put(jSONObject3);
                } catch (JSONException e2) {
                }
            }
            jSONObject2.put("tracks", jSONArray);
        }
        TextTrackStyle textTrackStyle = this.f29752g;
        if (textTrackStyle != null) {
            JSONObject jSONObject5 = new JSONObject();
            try {
                jSONObject5.put("fontScale", (double) textTrackStyle.f29845a);
                int i5 = textTrackStyle.f29846b;
                if (i5 != 0) {
                    jSONObject5.put("foregroundColor", TextTrackStyle.m22290a(i5));
                }
                int i6 = textTrackStyle.f29847c;
                if (i6 != 0) {
                    jSONObject5.put("backgroundColor", TextTrackStyle.m22290a(i6));
                }
                int i7 = textTrackStyle.f29848d;
                if (i7 == 0) {
                    jSONObject5.put("edgeType", "NONE");
                } else if (i7 == 1) {
                    jSONObject5.put("edgeType", "OUTLINE");
                } else if (i7 == 2) {
                    jSONObject5.put("edgeType", "DROP_SHADOW");
                } else if (i7 == 3) {
                    jSONObject5.put("edgeType", "RAISED");
                } else if (i7 == 4) {
                    jSONObject5.put("edgeType", "DEPRESSED");
                }
                int i8 = textTrackStyle.f29849e;
                if (i8 != 0) {
                    jSONObject5.put("edgeColor", TextTrackStyle.m22290a(i8));
                }
                int i9 = textTrackStyle.f29850f;
                if (i9 == 0) {
                    jSONObject5.put("windowType", "NONE");
                } else if (i9 == 1) {
                    jSONObject5.put("windowType", "NORMAL");
                } else if (i9 == 2) {
                    jSONObject5.put("windowType", "ROUNDED_CORNERS");
                }
                int i10 = textTrackStyle.f29851g;
                if (i10 != 0) {
                    jSONObject5.put("windowColor", TextTrackStyle.m22290a(i10));
                }
                if (textTrackStyle.f29850f == 2) {
                    jSONObject5.put("windowRoundedCornerRadius", textTrackStyle.f29852h);
                }
                String str5 = textTrackStyle.f29853i;
                if (str5 != null) {
                    jSONObject5.put("fontFamily", str5);
                }
                switch (textTrackStyle.f29854j) {
                    case 0:
                        jSONObject5.put("fontGenericFamily", "SANS_SERIF");
                        i = textTrackStyle.f29855k;
                        if (i != 0) {
                            jSONObject5.put("fontStyle", "NORMAL");
                        } else if (i == 1) {
                            jSONObject5.put("fontStyle", "BOLD");
                        } else if (i == 2) {
                            jSONObject5.put("fontStyle", "ITALIC");
                        } else if (i == 3) {
                            jSONObject5.put("fontStyle", "BOLD_ITALIC");
                        }
                        jSONObject = textTrackStyle.f29857m;
                        if (jSONObject != null) {
                            jSONObject5.put("customData", jSONObject);
                            break;
                        }
                        break;
                    case 1:
                        jSONObject5.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                        i = textTrackStyle.f29855k;
                        if (i != 0) {
                        }
                        jSONObject = textTrackStyle.f29857m;
                        if (jSONObject != null) {
                        }
                        break;
                    case 2:
                        jSONObject5.put("fontGenericFamily", "SERIF");
                        i = textTrackStyle.f29855k;
                        if (i != 0) {
                        }
                        jSONObject = textTrackStyle.f29857m;
                        if (jSONObject != null) {
                        }
                        break;
                    case 3:
                        jSONObject5.put("fontGenericFamily", "MONOSPACED_SERIF");
                        i = textTrackStyle.f29855k;
                        if (i != 0) {
                        }
                        jSONObject = textTrackStyle.f29857m;
                        if (jSONObject != null) {
                        }
                        break;
                    case 4:
                        jSONObject5.put("fontGenericFamily", "CASUAL");
                        i = textTrackStyle.f29855k;
                        if (i != 0) {
                        }
                        jSONObject = textTrackStyle.f29857m;
                        if (jSONObject != null) {
                        }
                        break;
                    case 5:
                        jSONObject5.put("fontGenericFamily", "CURSIVE");
                        i = textTrackStyle.f29855k;
                        if (i != 0) {
                        }
                        jSONObject = textTrackStyle.f29857m;
                        if (jSONObject != null) {
                        }
                        break;
                    case 6:
                        jSONObject5.put("fontGenericFamily", "SMALL_CAPITALS");
                        i = textTrackStyle.f29855k;
                        if (i != 0) {
                        }
                        jSONObject = textTrackStyle.f29857m;
                        if (jSONObject != null) {
                        }
                        break;
                    default:
                        i = textTrackStyle.f29855k;
                        if (i != 0) {
                        }
                        jSONObject = textTrackStyle.f29857m;
                        if (jSONObject != null) {
                        }
                        break;
                }
            } catch (JSONException e3) {
            }
            jSONObject2.put("textTrackStyle", jSONObject5);
        }
        JSONObject jSONObject6 = this.f29761p;
        if (jSONObject6 != null) {
            jSONObject2.put("customData", jSONObject6);
        }
        String str6 = this.f29754i;
        if (str6 != null) {
            jSONObject2.put("entity", str6);
        }
        if (this.f29759n != null) {
            JSONArray jSONArray2 = new JSONArray();
            for (AdBreakInfo adBreakInfo : this.f29759n) {
                JSONObject jSONObject7 = new JSONObject();
                try {
                    jSONObject7.put("id", adBreakInfo.f29695b);
                    jSONObject7.put("position", ptk.m31227a(adBreakInfo.f29694a));
                    jSONObject7.put("isWatched", adBreakInfo.f29697d);
                    jSONObject7.put("isEmbedded", adBreakInfo.f29699f);
                    jSONObject7.put("duration", ptk.m31227a(adBreakInfo.f29696c));
                    if (adBreakInfo.f29698e != null) {
                        JSONArray jSONArray3 = new JSONArray();
                        for (String str7 : adBreakInfo.f29698e) {
                            jSONArray3.put(str7);
                        }
                        jSONObject7.put("breakClipIds", jSONArray3);
                    }
                } catch (JSONException e4) {
                }
                jSONArray2.put(jSONObject7);
            }
            jSONObject2.put("breaks", jSONArray2);
        }
        if (this.f29760o != null) {
            JSONArray jSONArray4 = new JSONArray();
            for (AdBreakClipInfo adBreakClipInfo : this.f29760o) {
                JSONObject jSONObject8 = new JSONObject();
                try {
                    jSONObject8.put("id", adBreakClipInfo.f29681a);
                    jSONObject8.put("duration", ptk.m31227a(adBreakClipInfo.f29683c));
                    long j2 = adBreakClipInfo.f29690j;
                    if (j2 != -1) {
                        jSONObject8.put("whenSkippable", ptk.m31227a(j2));
                    }
                    String str8 = adBreakClipInfo.f29688h;
                    if (str8 != null) {
                        jSONObject8.put("contentId", str8);
                    }
                    String str9 = adBreakClipInfo.f29685e;
                    if (str9 != null) {
                        jSONObject8.put("contentType", str9);
                    }
                    String str10 = adBreakClipInfo.f29682b;
                    if (str10 != null) {
                        jSONObject8.put("title", str10);
                    }
                    String str11 = adBreakClipInfo.f29684d;
                    if (str11 != null) {
                        jSONObject8.put("contentUrl", str11);
                    }
                    String str12 = adBreakClipInfo.f29686f;
                    if (str12 != null) {
                        jSONObject8.put("clickThroughUrl", str12);
                    }
                    JSONObject jSONObject9 = adBreakClipInfo.f29693m;
                    if (jSONObject9 != null) {
                        jSONObject8.put("customData", jSONObject9);
                    }
                    String str13 = adBreakClipInfo.f29689i;
                    if (str13 != null) {
                        jSONObject8.put("posterUrl", str13);
                    }
                    String str14 = adBreakClipInfo.f29691k;
                    if (str14 != null) {
                        jSONObject8.put("hlsSegmentFormat", str14);
                    }
                    VastAdsRequest vastAdsRequest = adBreakClipInfo.f29692l;
                    if (vastAdsRequest != null) {
                        jSONObject8.put("vastAdsRequest", vastAdsRequest.mo17573a());
                    }
                } catch (JSONException e5) {
                }
                jSONArray4.put(jSONObject8);
            }
            jSONObject2.put("breakClips", jSONArray4);
        }
        VastAdsRequest vastAdsRequest2 = this.f29755j;
        if (vastAdsRequest2 != null) {
            jSONObject2.put("vmapAdsRequest", vastAdsRequest2.mo17573a());
        }
        long j3 = this.f29756k;
        if (j3 != -1) {
            jSONObject2.put("startAbsoluteTime", ptk.m31227a(j3));
        }
        jSONObject2.putOpt("atvEntity", this.f29757l);
        return jSONObject2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaInfo) {
            MediaInfo mediaInfo = (MediaInfo) obj;
            JSONObject jSONObject = this.f29761p;
            if (jSONObject != null) {
                z = false;
            } else {
                z = true;
            }
            JSONObject jSONObject2 = mediaInfo.f29761p;
            if (jSONObject2 != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2) {
                return (jSONObject == null || jSONObject2 == null || ssd.m36200a(jSONObject, jSONObject2)) && ptk.m31236a(this.f29746a, mediaInfo.f29746a) && this.f29747b == mediaInfo.f29747b && ptk.m31236a(this.f29748c, mediaInfo.f29748c) && ptk.m31236a(this.f29749d, mediaInfo.f29749d) && this.f29750e == mediaInfo.f29750e && ptk.m31236a(this.f29751f, mediaInfo.f29751f) && ptk.m31236a(this.f29752g, mediaInfo.f29752g) && ptk.m31236a(this.f29759n, mediaInfo.f29759n) && ptk.m31236a(this.f29760o, mediaInfo.f29760o) && ptk.m31236a(this.f29754i, mediaInfo.f29754i) && ptk.m31236a(this.f29755j, mediaInfo.f29755j) && this.f29756k == mediaInfo.f29756k && ptk.m31236a(this.f29757l, mediaInfo.f29757l) && ptk.m31236a(this.f29758m, mediaInfo.f29758m);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29746a, Integer.valueOf(this.f29747b), this.f29748c, this.f29749d, Long.valueOf(this.f29750e), String.valueOf(this.f29761p), this.f29751f, this.f29752g, this.f29759n, this.f29760o, this.f29754i, this.f29755j, Long.valueOf(this.f29756k), this.f29757l});
    }

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
        List list;
        JSONObject jSONObject = this.f29761p;
        List list2 = null;
        this.f29753h = jSONObject != null ? jSONObject.toString() : null;
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f29746a, false);
        see.m35063b(parcel, 3, this.f29747b);
        see.m35046a(parcel, 4, this.f29748c, false);
        see.m35040a(parcel, 5, this.f29749d, i, false);
        see.m35036a(parcel, 6, this.f29750e);
        see.m35066c(parcel, 7, this.f29751f, false);
        see.m35040a(parcel, 8, this.f29752g, i, false);
        see.m35046a(parcel, 9, this.f29753h, false);
        List list3 = this.f29759n;
        if (list3 != null) {
            list = Collections.unmodifiableList(list3);
        } else {
            list = null;
        }
        see.m35066c(parcel, 10, list, false);
        List list4 = this.f29760o;
        if (list4 != null) {
            list2 = Collections.unmodifiableList(list4);
        }
        see.m35066c(parcel, 11, list2, false);
        see.m35046a(parcel, 12, this.f29754i, false);
        see.m35040a(parcel, 13, this.f29755j, i, false);
        see.m35036a(parcel, 14, this.f29756k);
        see.m35046a(parcel, 15, this.f29757l, false);
        see.m35046a(parcel, 16, this.f29758m, false);
        see.m35062b(parcel, a);
    }

    public MediaInfo(String str, int i, String str2, MediaMetadata mediaMetadata, long j, List list, TextTrackStyle textTrackStyle, String str3, List list2, List list3, String str4, VastAdsRequest vastAdsRequest, long j2, String str5, String str6) {
        String str7 = str3;
        this.f29746a = str;
        this.f29747b = i;
        this.f29748c = str2;
        this.f29749d = mediaMetadata;
        this.f29750e = j;
        this.f29751f = list;
        this.f29752g = textTrackStyle;
        this.f29753h = str7;
        if (str7 != null) {
            try {
                this.f29761p = new JSONObject(str3);
            } catch (JSONException e) {
                this.f29761p = null;
                this.f29753h = null;
            }
        } else {
            this.f29761p = null;
        }
        this.f29759n = list2;
        this.f29760o = list3;
        this.f29754i = str4;
        this.f29755j = vastAdsRequest;
        this.f29756k = j2;
        this.f29757l = str5;
        this.f29758m = str6;
    }

    public MediaInfo(JSONObject jSONObject) {
        this(jSONObject.optString("contentId"), -1, null, null, -1, null, null, null, null, null, null, null, -1, null, null);
        MediaInfo mediaInfo;
        int i;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("streamType", "NONE");
        if ("NONE".equals(optString)) {
            mediaInfo = this;
            mediaInfo.f29747b = 0;
        } else if ("BUFFERED".equals(optString)) {
            mediaInfo = this;
            mediaInfo.f29747b = 1;
        } else if (!"LIVE".equals(optString)) {
            mediaInfo = this;
            mediaInfo.f29747b = -1;
        } else {
            mediaInfo = this;
            mediaInfo.f29747b = 2;
        }
        mediaInfo.f29748c = jSONObject2.optString("contentType", null);
        if (jSONObject2.has("metadata")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("metadata");
            MediaMetadata mediaMetadata = new MediaMetadata(jSONObject3.getInt("metadataType"));
            mediaInfo.f29749d = mediaMetadata;
            mediaMetadata.mo17540a(jSONObject3);
        }
        mediaInfo.f29750e = -1;
        if (jSONObject2.has("duration") && !jSONObject2.isNull("duration")) {
            double optDouble = jSONObject2.optDouble("duration", 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble)) {
                mediaInfo.f29750e = ptk.m31228a(optDouble);
            }
        }
        if (jSONObject2.has("tracks")) {
            mediaInfo.f29751f = new ArrayList();
            JSONArray jSONArray = jSONObject2.getJSONArray("tracks");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                mediaInfo.f29751f.add(new MediaTrack(jSONArray.getJSONObject(i2)));
            }
        } else {
            mediaInfo.f29751f = null;
        }
        if (jSONObject2.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("textTrackStyle");
            TextTrackStyle textTrackStyle = new TextTrackStyle(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
            textTrackStyle.f29845a = (float) jSONObject4.optDouble("fontScale", 1.0d);
            textTrackStyle.f29846b = TextTrackStyle.m22289a(jSONObject4.optString("foregroundColor"));
            textTrackStyle.f29847c = TextTrackStyle.m22289a(jSONObject4.optString("backgroundColor"));
            if (jSONObject4.has("edgeType")) {
                String string = jSONObject4.getString("edgeType");
                if ("NONE".equals(string)) {
                    textTrackStyle.f29848d = 0;
                } else if ("OUTLINE".equals(string)) {
                    textTrackStyle.f29848d = 1;
                } else if ("DROP_SHADOW".equals(string)) {
                    textTrackStyle.f29848d = 2;
                } else if ("RAISED".equals(string)) {
                    textTrackStyle.f29848d = 3;
                } else if ("DEPRESSED".equals(string)) {
                    textTrackStyle.f29848d = 4;
                }
            }
            textTrackStyle.f29849e = TextTrackStyle.m22289a(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string2 = jSONObject4.getString("windowType");
                if ("NONE".equals(string2)) {
                    textTrackStyle.f29850f = 0;
                } else if ("NORMAL".equals(string2)) {
                    textTrackStyle.f29850f = 1;
                } else if ("ROUNDED_CORNERS".equals(string2)) {
                    textTrackStyle.f29850f = 2;
                }
            }
            textTrackStyle.f29851g = TextTrackStyle.m22289a(jSONObject4.optString("windowColor"));
            if (textTrackStyle.f29850f == 2) {
                textTrackStyle.f29852h = jSONObject4.optInt("windowRoundedCornerRadius", 0);
            }
            textTrackStyle.f29853i = jSONObject4.optString("fontFamily", null);
            if (jSONObject4.has("fontGenericFamily")) {
                String string3 = jSONObject4.getString("fontGenericFamily");
                if ("SANS_SERIF".equals(string3)) {
                    textTrackStyle.f29854j = 0;
                } else if ("MONOSPACED_SANS_SERIF".equals(string3)) {
                    textTrackStyle.f29854j = 1;
                } else if ("SERIF".equals(string3)) {
                    textTrackStyle.f29854j = 2;
                } else if ("MONOSPACED_SERIF".equals(string3)) {
                    textTrackStyle.f29854j = 3;
                } else if (!"CASUAL".equals(string3)) {
                    if (!"CURSIVE".equals(string3)) {
                        i = "SMALL_CAPITALS".equals(string3) ? 6 : i;
                    } else {
                        i = 5;
                    }
                    textTrackStyle.f29854j = i;
                } else {
                    textTrackStyle.f29854j = 4;
                }
            }
            if (jSONObject4.has("fontStyle")) {
                String string4 = jSONObject4.getString("fontStyle");
                if ("NORMAL".equals(string4)) {
                    textTrackStyle.f29855k = 0;
                } else if ("BOLD".equals(string4)) {
                    textTrackStyle.f29855k = 1;
                } else if ("ITALIC".equals(string4)) {
                    textTrackStyle.f29855k = 2;
                } else if ("BOLD_ITALIC".equals(string4)) {
                    textTrackStyle.f29855k = 3;
                }
            }
            textTrackStyle.f29857m = jSONObject4.optJSONObject("customData");
            mediaInfo.f29752g = textTrackStyle;
        } else {
            mediaInfo.f29752g = null;
        }
        mo17527a(jSONObject);
        mediaInfo.f29761p = jSONObject2.optJSONObject("customData");
        mediaInfo.f29754i = jSONObject2.optString("entity", null);
        mediaInfo.f29757l = jSONObject2.optString("atvEntity", null);
        mediaInfo.f29755j = VastAdsRequest.m22291a(jSONObject2.optJSONObject("vmapAdsRequest"));
        if (jSONObject2.has("startAbsoluteTime") && !jSONObject2.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject2.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= 0.0d) {
                mediaInfo.f29756k = ptk.m31228a(optDouble2);
            }
        }
        if (jSONObject2.has("contentUrl")) {
            mediaInfo.f29758m = jSONObject2.optString("contentUrl");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0175 A[LOOP:2: B:30:0x00c0->B:74:0x0175, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017e A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo17527a(JSONObject jSONObject) {
        AdBreakClipInfo adBreakClipInfo;
        AdBreakClipInfo adBreakClipInfo2;
        String str;
        String str2;
        AdBreakInfo adBreakInfo;
        String[] strArr;
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2.has("breaks")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("breaks");
            this.f29759n = new ArrayList(jSONArray.length());
            int i = 0;
            while (true) {
                if (i < jSONArray.length()) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    if (jSONObject3 == null || !jSONObject3.has("id") || !jSONObject3.has("position")) {
                        adBreakInfo = null;
                    } else {
                        try {
                            String string = jSONObject3.getString("id");
                            long a = ptk.m31228a((double) jSONObject3.getLong("position"));
                            boolean optBoolean = jSONObject3.optBoolean("isWatched");
                            long a2 = ptk.m31228a((double) jSONObject3.optLong("duration"));
                            JSONArray optJSONArray = jSONObject3.optJSONArray("breakClipIds");
                            if (optJSONArray != null) {
                                String[] strArr2 = new String[optJSONArray.length()];
                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                    strArr2[i2] = optJSONArray.getString(i2);
                                }
                                strArr = strArr2;
                            } else {
                                strArr = null;
                            }
                            adBreakInfo = new AdBreakInfo(a, string, a2, optBoolean, strArr, jSONObject3.optBoolean("isEmbedded"));
                        } catch (JSONException e) {
                            Locale locale = Locale.ROOT;
                            new Object[1][0] = e.getMessage();
                            adBreakInfo = null;
                        }
                    }
                    if (adBreakInfo == null) {
                        this.f29759n.clear();
                        break;
                    } else {
                        this.f29759n.add(adBreakInfo);
                        i++;
                    }
                } else {
                    break;
                }
            }
        }
        if (jSONObject2.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject2.getJSONArray("breakClips");
            this.f29760o = new ArrayList(jSONArray2.length());
            int i3 = 0;
            while (i3 < jSONArray2.length()) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
                if (jSONObject4 == null || !jSONObject4.has("id")) {
                    adBreakClipInfo = null;
                } else {
                    try {
                        String string2 = jSONObject4.getString("id");
                        long a3 = ptk.m31228a((double) jSONObject4.optLong("duration"));
                        try {
                            String optString = jSONObject4.optString("clickThroughUrl", null);
                            String optString2 = jSONObject4.optString("contentUrl", null);
                            String optString3 = jSONObject4.optString("mimeType", null);
                            if (optString3 != null) {
                                str = optString3;
                            } else {
                                str = jSONObject4.optString("contentType", null);
                            }
                            String optString4 = jSONObject4.optString("title", null);
                            JSONObject optJSONObject = jSONObject4.optJSONObject("customData");
                            adBreakClipInfo2 = null;
                            try {
                                String optString5 = jSONObject4.optString("contentId", null);
                                String optString6 = jSONObject4.optString("posterUrl", null);
                                long a4 = jSONObject4.has("whenSkippable") ? ptk.m31228a((double) ((Integer) jSONObject4.get("whenSkippable")).intValue()) : -1;
                                adBreakClipInfo2 = null;
                                String optString7 = jSONObject4.optString("hlsSegmentFormat", null);
                                VastAdsRequest a5 = VastAdsRequest.m22291a(jSONObject4.optJSONObject("vastAdsRequest"));
                                if (optJSONObject == null || optJSONObject.length() == 0) {
                                    str2 = null;
                                } else {
                                    str2 = optJSONObject.toString();
                                }
                                adBreakClipInfo = new AdBreakClipInfo(string2, optString4, a3, optString2, str, optString, str2, optString5, optString6, a4, optString7, a5);
                            } catch (JSONException e2) {
                                e = e2;
                                Locale locale2 = Locale.ROOT;
                                new Object[1][0] = e.getMessage();
                                adBreakClipInfo = adBreakClipInfo2;
                                if (adBreakClipInfo == null) {
                                }
                            }
                        } catch (JSONException e3) {
                            e = e3;
                            adBreakClipInfo2 = null;
                            Locale locale22 = Locale.ROOT;
                            new Object[1][0] = e.getMessage();
                            adBreakClipInfo = adBreakClipInfo2;
                            if (adBreakClipInfo == null) {
                            }
                        }
                    } catch (JSONException e4) {
                        e = e4;
                        adBreakClipInfo2 = null;
                        Locale locale222 = Locale.ROOT;
                        new Object[1][0] = e.getMessage();
                        adBreakClipInfo = adBreakClipInfo2;
                        if (adBreakClipInfo == null) {
                        }
                    }
                }
                if (adBreakClipInfo == null) {
                    this.f29760o.add(adBreakClipInfo);
                    i3++;
                } else {
                    this.f29760o.clear();
                    return;
                }
            }
        }
    }
}
