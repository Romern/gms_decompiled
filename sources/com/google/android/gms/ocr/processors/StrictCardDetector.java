package com.google.android.gms.ocr.processors;

import android.graphics.Rect;
import com.google.android.gms.ocr.base.Boundaries;
import com.google.android.gms.ocr.base.OcrImage;
import com.google.android.gms.ocr.base.Quadrilateral;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StrictCardDetector {

    /* renamed from: a */
    public final akvk f81340a;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Result {

        /* renamed from: a */
        public final Boundaries f81341a;

        /* renamed from: b */
        public final Quadrilateral f81342b;

        public Result(Boundaries boundaries, Quadrilateral quadrilateral) {
            this.f81341a = boundaries;
            this.f81342b = quadrilateral;
        }
    }

    static {
        new Result(Boundaries.f81261a, null);
    }

    public StrictCardDetector(akvk akvk) {
        this.f81340a = akvk;
    }

    public native Result nativeDetect(OcrImage ocrImage, Rect rect, float f, float f2, int i);
}
