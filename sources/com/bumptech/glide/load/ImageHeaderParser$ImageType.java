package com.bumptech.glide.load;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    UNKNOWN(false);
    

    /* renamed from: a */
    private final boolean f7370a;

    private ImageHeaderParser$ImageType(boolean z) {
        this.f7370a = z;
    }

    public boolean hasAlpha() {
        return this.f7370a;
    }
}
