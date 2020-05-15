package com.google.android.libraries.bluetooth.fastpair;

import android.net.Uri;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoValue_HeadsetPiece extends HeadsetPiece {

    /* renamed from: a */
    private final int f111047a;

    /* renamed from: b */
    private final int f111048b;

    /* renamed from: c */
    private final String f111049c;

    /* renamed from: d */
    private final boolean f111050d;

    /* renamed from: e */
    private final Uri f111051e;

    public AutoValue_HeadsetPiece(int i, int i2, String str, boolean z, Uri uri) {
        this.f111047a = i;
        this.f111048b = i2;
        this.f111049c = str;
        this.f111050d = z;
        this.f111051e = uri;
    }

    /* renamed from: a */
    public final int mo60340a() {
        return this.f111047a;
    }

    /* renamed from: b */
    public final int mo60341b() {
        return this.f111048b;
    }

    /* renamed from: c */
    public final String mo60342c() {
        return this.f111049c;
    }

    /* renamed from: d */
    public final boolean mo60343d() {
        return this.f111050d;
    }

    /* renamed from: e */
    public final Uri mo60344e() {
        return this.f111051e;
    }

    public final String toString() {
        int i = this.f111047a;
        int i2 = this.f111048b;
        String str = this.f111049c;
        boolean z = this.f111050d;
        String valueOf = String.valueOf(this.f111051e);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 114 + String.valueOf(valueOf).length());
        sb.append("HeadsetPiece{lowLevelThreshold=");
        sb.append(i);
        sb.append(", batteryLevel=");
        sb.append(i2);
        sb.append(", imageUrl=");
        sb.append(str);
        sb.append(", charging=");
        sb.append(z);
        sb.append(", imageContentUri=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
