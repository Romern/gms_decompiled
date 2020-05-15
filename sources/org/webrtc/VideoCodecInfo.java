package org.webrtc;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VideoCodecInfo {

    /* renamed from: a */
    public final String f192060a;

    /* renamed from: b */
    public final Map f192061b;

    public VideoCodecInfo(String str, Map map) {
        this.f192060a = str;
        this.f192061b = map;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof VideoCodecInfo) {
            VideoCodecInfo videoCodecInfo = (VideoCodecInfo) obj;
            return this.f192060a.equalsIgnoreCase(videoCodecInfo.f192060a) && this.f192061b.equals(videoCodecInfo.f192061b);
        }
    }

    public String getName() {
        return this.f192060a;
    }

    /* access modifiers changed from: package-private */
    public Map getParams() {
        return this.f192061b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f192060a.toUpperCase(Locale.ROOT), this.f192061b});
    }
}
