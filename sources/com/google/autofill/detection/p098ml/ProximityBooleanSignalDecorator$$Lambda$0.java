package com.google.autofill.detection.p098ml;

import com.google.autofill.detection.p098ml.ProximityBooleanSignalDecorator;
import java.util.function.Function;

/* renamed from: com.google.autofill.detection.ml.ProximityBooleanSignalDecorator$$Lambda$0 */
final /* synthetic */ class ProximityBooleanSignalDecorator$$Lambda$0 implements Function {
    private final ProximityBooleanSignalDecorator.DirectionalNode arg$1;

    public ProximityBooleanSignalDecorator$$Lambda$0(ProximityBooleanSignalDecorator.DirectionalNode directionalNode) {
        this.arg$1 = directionalNode;
    }

    public Object apply(Object obj) {
        return ProximityBooleanSignalDecorator.lambda$generate$0$ProximityBooleanSignalDecorator(this.arg$1, (kom) obj);
    }
}
