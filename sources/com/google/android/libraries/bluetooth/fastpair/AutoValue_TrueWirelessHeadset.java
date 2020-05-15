package com.google.android.libraries.bluetooth.fastpair;

import android.net.Uri;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoValue_TrueWirelessHeadset extends TrueWirelessHeadset {

    /* renamed from: a */
    private final String f111052a;

    /* renamed from: b */
    private final HeadsetPiece f111053b;

    /* renamed from: c */
    private final HeadsetPiece f111054c;

    /* renamed from: d */
    private final HeadsetPiece f111055d;

    /* renamed from: e */
    private final long f111056e;

    /* renamed from: f */
    private final String f111057f;

    /* renamed from: g */
    private final long f111058g;

    /* renamed from: h */
    private final Uri f111059h;

    public AutoValue_TrueWirelessHeadset(String str, HeadsetPiece headsetPiece, HeadsetPiece headsetPiece2, HeadsetPiece headsetPiece3, long j, String str2, long j2, Uri uri) {
        this.f111052a = str;
        this.f111053b = headsetPiece;
        this.f111054c = headsetPiece2;
        this.f111055d = headsetPiece3;
        this.f111056e = j;
        this.f111057f = str2;
        this.f111058g = j2;
        this.f111059h = uri;
    }

    /* renamed from: a */
    public final String mo60346a() {
        return this.f111052a;
    }

    /* renamed from: b */
    public final HeadsetPiece mo60347b() {
        return this.f111053b;
    }

    /* renamed from: c */
    public final HeadsetPiece mo60348c() {
        return this.f111054c;
    }

    /* renamed from: d */
    public final HeadsetPiece mo60349d() {
        return this.f111055d;
    }

    /* renamed from: e */
    public final long mo60350e() {
        return this.f111056e;
    }

    /* renamed from: f */
    public final String mo60351f() {
        return this.f111057f;
    }

    /* renamed from: g */
    public final long mo60352g() {
        return this.f111058g;
    }

    /* renamed from: h */
    public final Uri mo60353h() {
        return this.f111059h;
    }

    public final String toString() {
        String str = this.f111052a;
        String valueOf = String.valueOf(this.f111053b);
        String valueOf2 = String.valueOf(this.f111054c);
        String valueOf3 = String.valueOf(this.f111055d);
        long j = this.f111056e;
        String str2 = this.f111057f;
        long j2 = this.f111058g;
        String valueOf4 = String.valueOf(this.f111059h);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + BaseMfiEventCallback.TYPE_UNKNOWN_ERROR + length2 + length3 + length4 + length5 + String.valueOf(valueOf4).length());
        sb.append("TrueWirelessHeadset{name=");
        sb.append(str);
        sb.append(", leftBud=");
        sb.append(valueOf);
        sb.append(", rightBud=");
        sb.append(valueOf2);
        sb.append(", headsetCase=");
        sb.append(valueOf3);
        sb.append(", lastUpdateElapsedRealtimeMillis=");
        sb.append(j);
        sb.append(", modelId=");
        sb.append(str2);
        sb.append(", firstObservationTimestampMillis=");
        sb.append(j2);
        sb.append(", mainIconContentUri=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
