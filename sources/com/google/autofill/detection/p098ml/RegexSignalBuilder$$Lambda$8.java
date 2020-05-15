package com.google.autofill.detection.p098ml;

import java.util.function.Function;

/* renamed from: com.google.autofill.detection.ml.RegexSignalBuilder$$Lambda$8 */
final /* synthetic */ class RegexSignalBuilder$$Lambda$8 implements Function {
    private final Function arg$1;

    public RegexSignalBuilder$$Lambda$8(Function function) {
        this.arg$1 = function;
    }

    public Object apply(Object obj) {
        return RegexSignalBuilder.lambda$toStringCollectionProducer$0$RegexSignalBuilder(this.arg$1, (kom) obj);
    }
}
