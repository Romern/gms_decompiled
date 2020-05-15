package com.google.android.gms.ocr.processors;

import com.google.android.gms.ocr.base.OcrImage;
import com.google.android.gms.ocr.base.Quadrilateral;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardRectifier {

    /* renamed from: a */
    public static final Result f81333a = new Result(null, null, null, null, false);

    /* renamed from: b */
    public final akvk f81334b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Result {

        /* renamed from: a */
        public final OcrImage f81335a;

        /* renamed from: b */
        public final OcrImage f81336b;

        /* renamed from: c */
        public final OcrImage f81337c;

        /* renamed from: d */
        public final OcrImage f81338d;

        /* renamed from: e */
        public final boolean f81339e;

        public Result(OcrImage ocrImage, OcrImage ocrImage2, OcrImage ocrImage3, OcrImage ocrImage4, boolean z) {
            this.f81335a = ocrImage;
            this.f81336b = ocrImage2;
            this.f81337c = ocrImage3;
            this.f81338d = ocrImage4;
            this.f81339e = z;
        }
    }

    public CardRectifier(akvk akvk) {
        this.f81334b = akvk;
    }

    public native Result nativeRectify(OcrImage ocrImage, Quadrilateral quadrilateral, boolean z, float f, float f2);
}
