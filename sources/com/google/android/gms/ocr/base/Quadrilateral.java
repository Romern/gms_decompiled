package com.google.android.gms.ocr.base;

import android.graphics.PointF;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Quadrilateral {
    public final PointF bottomLeft;
    public final PointF bottomRight;
    public final PointF topLeft;
    public final PointF topRight;

    public Quadrilateral(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        this.topLeft = pointF;
        this.topRight = pointF2;
        this.bottomRight = pointF3;
        this.bottomLeft = pointF4;
    }
}
