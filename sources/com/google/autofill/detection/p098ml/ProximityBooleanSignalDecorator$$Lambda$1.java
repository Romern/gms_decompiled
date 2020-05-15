package com.google.autofill.detection.p098ml;

import com.google.autofill.detection.p098ml.ProximityBooleanSignalDecorator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

/* renamed from: com.google.autofill.detection.ml.ProximityBooleanSignalDecorator$$Lambda$1 */
final /* synthetic */ class ProximityBooleanSignalDecorator$$Lambda$1 implements Consumer {
    private final ArrayDeque arg$1;

    private ProximityBooleanSignalDecorator$$Lambda$1(ArrayDeque arrayDeque) {
        this.arg$1 = arrayDeque;
    }

    static Consumer get$Lambda(ArrayDeque arrayDeque) {
        return new ProximityBooleanSignalDecorator$$Lambda$1(arrayDeque);
    }

    public void accept(Object obj) {
        this.arg$1.push((ProximityBooleanSignalDecorator.DirectionalNode) obj);
    }
}
