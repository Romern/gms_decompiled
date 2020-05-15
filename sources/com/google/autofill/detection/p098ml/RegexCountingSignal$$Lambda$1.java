package com.google.autofill.detection.p098ml;

import java.util.Collection;
import java.util.function.BiFunction;
import java.util.regex.Pattern;

/* renamed from: com.google.autofill.detection.ml.RegexCountingSignal$$Lambda$1 */
final /* synthetic */ class RegexCountingSignal$$Lambda$1 implements BiFunction {
    private final boolean arg$1;

    public RegexCountingSignal$$Lambda$1(boolean z) {
        this.arg$1 = z;
    }

    public Object apply(Object obj, Object obj2) {
        return Double.valueOf(RegexCountingSignal.countOccurrences((Pattern) obj, (Collection) obj2, this.arg$1));
    }
}
