package com.google.android.gms.ocr.processors;

import android.graphics.Rect;
import com.google.android.gms.ocr.base.OcrImage;
import com.google.android.gms.ocr.base.Quadrilateral;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardDetector {

    /* renamed from: a */
    public final akvk f81329a;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class CandidateDetection {

        /* renamed from: a */
        public final Quadrilateral f81330a;

        public CandidateDetection(Quadrilateral quadrilateral, float f) {
            this.f81330a = quadrilateral;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Options {
        public float areaDeviationWeight = 1.0f;
        public float areaToleranceFactor = 2.0f;
        public float aspectRatioDeviationWeight = 1.0f;
        public float cameraHorizontalFov = 38.0f;
        public float cornerAngleDeviationWeight = 1.0f;
        public float cornerAngleTolerance = 20.0f;
        public float cornerOutsideImageTolerance = 20.0f;
        public float maxDistance = 240.0f;
        public float maxGeometricError = 8.0f;
        public float maxSlant = 45.0f;
        public float maxTiltDeviation = 90.0f;
        public float minPerimeterCoverageFraction = 0.3f;
        public float perimeterCoverageWeight = 1.0f;
        public boolean returnLineSegments = false;
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Result {

        /* renamed from: a */
        public final CandidateDetection[] f81331a;

        /* renamed from: b */
        public final float[] f81332b;

        public Result(CandidateDetection[] candidateDetectionArr, float[] fArr) {
            this.f81331a = candidateDetectionArr;
            this.f81332b = fArr;
        }
    }

    public CardDetector(akvk akvk) {
        this.f81329a = akvk;
    }

    public native Result nativeDetectCard(OcrImage ocrImage, Rect rect, Options options);
}
