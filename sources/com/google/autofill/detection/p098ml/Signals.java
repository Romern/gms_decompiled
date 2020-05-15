package com.google.autofill.detection.p098ml;

import java.util.List;

/* renamed from: com.google.autofill.detection.ml.Signals */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Signals {
    private static final int DEFAULT_PROXIMITY_SIGNAL_DISTANCE_THRESHOLD = 8;

    private Signals() {
    }

    public static Signal ancestorDecorator(BooleanSignal booleanSignal) {
        return new ProximityBooleanSignalDecorator(booleanSignal, 8, true);
    }

    public static BooleanSignal and(List list) {
        return new AndBooleanSignal(list);
    }

    public static Signal constrainToRange(Signal signal, double d, double d2) {
        return new BoundedSignalDecorator(signal, d, d2);
    }

    public static Signal normalizationDecorator(Signal signal, float f, float f2) {
        return new InputNormalizationSignalDecorator(signal, f, f2);
    }

    /* renamed from: or */
    public static BooleanSignal m118863or(List list) {
        return new OrBooleanSignal(list);
    }

    public static Signal proximityDecorator(BooleanSignal booleanSignal) {
        return new ProximityBooleanSignalDecorator(booleanSignal, 8, false);
    }

    public static BooleanSignal and(BooleanSignal... booleanSignalArr) {
        return and(bngx.m109370a((Object[]) booleanSignalArr));
    }

    /* renamed from: or */
    public static BooleanSignal m118864or(BooleanSignal... booleanSignalArr) {
        return m118863or(bngx.m109370a((Object[]) booleanSignalArr));
    }
}
