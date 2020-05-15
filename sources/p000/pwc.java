package p000;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pwc {

    /* renamed from: a */
    public static final Set f40435a = new HashSet(Arrays.asList("MultizoneLeader", "531A4F84", "MultizoneFollower", "705D30C6"));

    /* renamed from: b */
    private static final String f40436b = cdaa.m132383b();

    /* renamed from: a */
    static Bundle m31494a(MediaInfo mediaInfo) {
        Bundle bundle = new Bundle();
        bundle.putLong("android.media.metadata.DURATION", mediaInfo.f29750e);
        MediaMetadata mediaMetadata = mediaInfo.f29749d;
        if (mediaMetadata == null) {
            return bundle;
        }
        String b = mediaMetadata.mo17542b("com.google.android.gms.cast.metadata.ALBUM_ARTIST");
        if (b != null) {
            bundle.putString("android.media.metadata.ALBUM_ARTIST", b);
        }
        String b2 = mediaMetadata.mo17542b("com.google.android.gms.cast.metadata.ALBUM_TITLE");
        if (b2 != null) {
            bundle.putString("android.media.metadata.ALBUM_TITLE", b2);
        }
        String b3 = mediaMetadata.mo17542b("com.google.android.gms.cast.metadata.ARTIST");
        if (b3 == null) {
            b3 = mediaMetadata.mo17542b("com.google.android.gms.cast.metadata.STUDIO");
        }
        if (b3 != null) {
            bundle.putString("android.media.metadata.ARTIST", b3);
        }
        String b4 = mediaMetadata.mo17542b("com.google.android.gms.cast.metadata.COMPOSER");
        if (b4 != null) {
            bundle.putString("android.media.metadata.COMPOSER", b4);
        }
        if (mediaMetadata.mo17541a("com.google.android.gms.cast.metadata.DISC_NUMBER")) {
            bundle.putInt("android.media.metadata.DISC_NUMBER", mediaMetadata.mo17543c("com.google.android.gms.cast.metadata.DISC_NUMBER"));
        }
        String b5 = mediaMetadata.mo17542b("com.google.android.gms.cast.metadata.TITLE");
        if (b5 != null) {
            bundle.putString("android.media.metadata.TITLE", b5);
        }
        if (mediaMetadata.mo17541a("com.google.android.gms.cast.metadata.TRACK_NUMBER")) {
            bundle.putInt("android.media.metadata.TRACK_NUMBER", mediaMetadata.mo17543c("com.google.android.gms.cast.metadata.TRACK_NUMBER"));
        }
        Calendar d = mediaMetadata.mo17544d("com.google.android.gms.cast.metadata.BROADCAST_DATE");
        if (d == null) {
            d = mediaMetadata.mo17544d("com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        if (d == null) {
            d = mediaMetadata.mo17544d("com.google.android.gms.cast.metadata.CREATION_DATE");
        }
        if (d != null) {
            bundle.putInt("android.media.metadata.YEAR", d.get(1));
        }
        List list = mediaMetadata.f29783a;
        if (list != null && !list.isEmpty()) {
            bundle.putString("android.media.metadata.ARTWORK_URI", ((WebImage) mediaMetadata.f29783a.get(0)).f30201b.toString());
        }
        return bundle;
    }

    /* renamed from: b */
    static JSONObject m31499b(Bundle bundle) {
        if (bundle != null) {
            JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                try {
                    if (obj instanceof Bundle) {
                        jSONObject.put(str, m31499b((Bundle) obj));
                    } else {
                        jSONObject.put(str, obj);
                    }
                } catch (JSONException e) {
                }
            }
            return jSONObject;
        }
        throw new IllegalArgumentException("Cannot pass in a null bundle");
    }

    /* renamed from: c */
    public static boolean m31501c(String str) {
        String[] split = TextUtils.split(str, "/");
        return split.length > 0 && split[0].equals("com.google.android.gms.cast.CATEGORY_CAST_DYNAMIC_SESSION");
    }

    /* renamed from: d */
    public static String m31502d(String str) {
        if (m31501c(str)) {
            return str;
        }
        if (m31498a(str, "com.google.android.gms.cast.CATEGORY_CAST")) {
            return str.replace("com.google.android.gms.cast.CATEGORY_CAST", "com.google.android.gms.cast.CATEGORY_CAST_DYNAMIC_SESSION");
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m31500b(String str) {
        if (ccxv.f180201a.mo6606a().mo77027m() && !m31498a(str, "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK") && !m31498a(str, "com.google.android.gms.cast.CATEGORY_CAST") && !m31498a(str, "com.google.android.gms.cast.CATEGORY_CAST_DYNAMIC_SESSION")) {
            return true;
        }
        String[] split = TextUtils.split(str, "/");
        if (split.length != 5 || TextUtils.isEmpty(split[4]) || !split[4].equals("ALLOW_IPV6")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static Bundle m31495a(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (obj == JSONObject.NULL) {
                        bundle.putParcelable(next, null);
                    } else if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof JSONObject) {
                        bundle.putBundle(next, m31495a((JSONObject) obj));
                    }
                } catch (JSONException e) {
                }
            }
        }
        return bundle;
    }

    /* renamed from: a */
    static MediaMetadata m31496a(Bundle bundle) {
        Integer num;
        MediaMetadata mediaMetadata;
        Integer num2 = null;
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("android.media.metadata.ALBUM_TITLE");
        String string2 = bundle.getString("android.media.metadata.ALBUM_ARTIST");
        String string3 = bundle.getString("android.media.metadata.COMPOSER");
        if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
            num = Integer.valueOf(bundle.getInt("android.media.metadata.DISC_NUMBER"));
        } else {
            num = null;
        }
        if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
            num2 = Integer.valueOf(bundle.getInt("android.media.metadata.TRACK_NUMBER"));
        }
        if (string == null && num == null && num2 == null) {
            mediaMetadata = new MediaMetadata(0);
        } else {
            MediaMetadata mediaMetadata2 = new MediaMetadata(3);
            if (string != null) {
                mediaMetadata2.mo17539a("com.google.android.gms.cast.metadata.ALBUM_TITLE", string);
            }
            if (string2 != null) {
                mediaMetadata2.mo17539a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", string2);
            }
            if (string3 != null) {
                mediaMetadata2.mo17539a("com.google.android.gms.cast.metadata.COMPOSER", string3);
            }
            if (num != null) {
                mediaMetadata2.mo17538a("com.google.android.gms.cast.metadata.DISC_NUMBER", num.intValue());
            }
            if (num2 != null) {
                mediaMetadata2.mo17538a("com.google.android.gms.cast.metadata.TRACK_NUMBER", num2.intValue());
            }
            mediaMetadata = mediaMetadata2;
        }
        String string4 = bundle.getString("android.media.metadata.TITLE");
        if (string4 != null) {
            mediaMetadata.mo17539a("com.google.android.gms.cast.metadata.TITLE", string4);
        }
        String string5 = bundle.getString("android.media.metadata.ARTIST");
        if (string5 != null) {
            mediaMetadata.mo17539a("com.google.android.gms.cast.metadata.ARTIST", string5);
        }
        if (bundle.containsKey("android.media.metadata.YEAR")) {
            int i = bundle.getInt("android.media.metadata.YEAR");
            Calendar instance = Calendar.getInstance();
            instance.set(1, i);
            MediaMetadata.m22274b("com.google.android.gms.cast.metadata.RELEASE_DATE", 4);
            mediaMetadata.f29784b.putString("com.google.android.gms.cast.metadata.RELEASE_DATE", pui.m31375a(instance));
        }
        if (bundle.containsKey("android.media.metadata.ARTWORK_URI")) {
            String string6 = bundle.getString("android.media.metadata.ARTWORK_URI");
            if (!TextUtils.isEmpty(string6)) {
                mediaMetadata.f29783a.add(new WebImage(Uri.parse(string6)));
            }
        }
        return mediaMetadata;
    }

    /* renamed from: a */
    static C1240of m31497a(String str) {
        int i;
        String[] split;
        int length;
        int i2;
        String str2 = str;
        HashSet hashSet = new HashSet(2);
        if (str2.equals("android.media.intent.category.REMOTE_PLAYBACK") || str2.equals("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK")) {
            hashSet.add(f40436b);
            i = 0;
        } else if (m31498a(str2, "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK") || m31498a(str2, "com.google.android.gms.cast.CATEGORY_CAST") || m31498a(str2, "com.google.android.gms.cast.CATEGORY_CAST_DYNAMIC_SESSION")) {
            String[] split2 = TextUtils.split(str2, "/");
            int length2 = split2.length;
            if (length2 >= 2) {
                if (!TextUtils.isEmpty(split2[1])) {
                    hashSet.add(split2[1]);
                } else if (m31498a(str2, "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK")) {
                    hashSet.add(f40436b);
                }
            }
            if (length2 >= 3 && (length = (split = TextUtils.split(split2[2], ",")).length) > 0) {
                int i3 = 0;
                while (i3 < length) {
                    String str3 = split[i3];
                    if (!TextUtils.isEmpty(str3)) {
                        if (str3.indexOf(37) != -1) {
                            StringBuilder sb = new StringBuilder(str3.length());
                            boolean z = false;
                            int i4 = 0;
                            int i5 = 0;
                            for (int i6 = 0; i6 < str3.length(); i6++) {
                                char charAt = str3.charAt(i6);
                                if (z) {
                                    int i7 = i4 << 4;
                                    if (charAt < 'A' || charAt > 'F') {
                                        i2 = (charAt < 'a' || charAt > 'f') ? (charAt < '0' || charAt > '9') ? 0 : charAt - '0' : charAt - 'W';
                                    } else {
                                        i2 = charAt - '7';
                                    }
                                    i4 = i7 | i2;
                                    int i8 = i5 + 1;
                                    if (i8 != 4) {
                                        i5 = i8;
                                    } else {
                                        sb.append((char) i4);
                                        z = false;
                                        i4 = 0;
                                        i5 = 0;
                                    }
                                } else if (ptk.m31233a(charAt) || charAt == '.' || charAt == ':') {
                                    sb.append(charAt);
                                } else if (charAt != '%') {
                                    String valueOf = String.valueOf(str3);
                                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid encoded namespace: ") : "Invalid encoded namespace: ".concat(valueOf));
                                } else {
                                    z = true;
                                }
                            }
                            str3 = sb.toString();
                        }
                        String valueOf2 = String.valueOf(str3);
                        hashSet.add(valueOf2.length() == 0 ? new String("%") : "%".concat(valueOf2));
                        i3++;
                    } else {
                        throw new IllegalArgumentException("Namespace names must not be null or empty");
                    }
                }
            }
            int length3 = split2.length;
            if (length3 < 4 || TextUtils.isEmpty(split2[3])) {
                i = 0;
            } else {
                i = Integer.valueOf(split2[3]).intValue();
            }
            if (length3 >= 6) {
                String valueOf3 = String.valueOf(str);
                throw new IllegalArgumentException(valueOf3.length() == 0 ? new String("Could not parse criteria from control category: ") : "Could not parse criteria from control category: ".concat(valueOf3));
            }
        } else {
            String valueOf4 = String.valueOf(str);
            throw new IllegalArgumentException(valueOf4.length() == 0 ? new String("Unsupported category: ") : "Unsupported category: ".concat(valueOf4));
        }
        return new C1240of(Integer.valueOf(i), hashSet);
    }

    /* renamed from: a */
    public static boolean m31498a(String str, String str2) {
        return str.equals(str2) || str.startsWith(str2.concat("/"));
    }
}
