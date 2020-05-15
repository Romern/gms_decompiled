package p000;

import android.net.Uri;
import com.google.android.libraries.bluetooth.fastpair.AutoValue_TrueWirelessHeadset;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

/* renamed from: ayqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayqw {

    /* renamed from: a */
    public Uri f98304a;

    /* renamed from: b */
    private String f98305b;

    /* renamed from: c */
    private HeadsetPiece f98306c;

    /* renamed from: d */
    private HeadsetPiece f98307d;

    /* renamed from: e */
    private HeadsetPiece f98308e;

    /* renamed from: f */
    private Long f98309f;

    /* renamed from: g */
    private String f98310g;

    /* renamed from: h */
    private Long f98311h;

    /* renamed from: a */
    public final TrueWirelessHeadset mo54292a() {
        String str = this.f98305b == null ? " name" : "";
        if (this.f98306c == null) {
            str = str.concat(" leftBud");
        }
        if (this.f98307d == null) {
            str = String.valueOf(str).concat(" rightBud");
        }
        if (this.f98308e == null) {
            str = String.valueOf(str).concat(" headsetCase");
        }
        if (this.f98309f == null) {
            str = String.valueOf(str).concat(" lastUpdateElapsedRealtimeMillis");
        }
        if (this.f98310g == null) {
            str = String.valueOf(str).concat(" modelId");
        }
        if (this.f98311h == null) {
            str = String.valueOf(str).concat(" firstObservationTimestampMillis");
        }
        if (str.isEmpty()) {
            return new AutoValue_TrueWirelessHeadset(this.f98305b, this.f98306c, this.f98307d, this.f98308e, this.f98309f.longValue(), this.f98310g, this.f98311h.longValue(), this.f98304a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo54296b(long j) {
        this.f98309f = Long.valueOf(j);
    }

    /* renamed from: c */
    public final void mo54299c(HeadsetPiece headsetPiece) {
        if (headsetPiece != null) {
            this.f98307d = headsetPiece;
            return;
        }
        throw new NullPointerException("Null rightBud");
    }

    /* renamed from: b */
    public final void mo54297b(HeadsetPiece headsetPiece) {
        if (headsetPiece != null) {
            this.f98306c = headsetPiece;
            return;
        }
        throw new NullPointerException("Null leftBud");
    }

    /* renamed from: b */
    public final void mo54298b(String str) {
        if (str != null) {
            this.f98305b = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final void mo54293a(long j) {
        this.f98311h = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo54294a(HeadsetPiece headsetPiece) {
        if (headsetPiece != null) {
            this.f98308e = headsetPiece;
            return;
        }
        throw new NullPointerException("Null headsetCase");
    }

    /* renamed from: a */
    public final void mo54295a(String str) {
        if (str != null) {
            this.f98310g = str;
            return;
        }
        throw new NullPointerException("Null modelId");
    }
}
