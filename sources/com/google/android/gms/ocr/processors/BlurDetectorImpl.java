package com.google.android.gms.ocr.processors;

import android.graphics.Rect;
import com.google.android.gms.ocr.base.OcrImage;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BlurDetectorImpl {

    /* renamed from: a */
    private final akvk f81324a;

    /* renamed from: b */
    private int f81325b;

    /* renamed from: c */
    private int f81326c;

    /* renamed from: d */
    private byte[] f81327d;

    /* renamed from: e */
    private byte[] f81328e;

    public BlurDetectorImpl(akvk akvk) {
        this.f81324a = akvk;
    }

    private native boolean isBlurryNative(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr2, byte[] bArr3);

    /* renamed from: a */
    public final boolean mo44745a(OcrImage ocrImage, Rect rect) {
        this.f81324a.mo39895a();
        if (!(this.f81327d != null && this.f81325b == ocrImage.getWidth() && this.f81326c == ocrImage.getHeight())) {
            this.f81325b = ocrImage.getWidth();
            int height = ocrImage.getHeight();
            this.f81326c = height;
            int i = this.f81325b;
            this.f81327d = new byte[(i * 4 * height)];
            this.f81328e = new byte[(Math.max(i, height) * 4)];
            Object[] objArr = {Integer.valueOf(this.f81325b), Integer.valueOf(this.f81326c)};
        }
        return isBlurryNative(ocrImage.getData(), ocrImage.getWidth(), ocrImage.getHeight(), rect.left, rect.top, rect.right, rect.bottom, this.f81327d, this.f81328e);
    }
}
