package com.google.autofill.detection.p098ml;

import java.util.Collection;
import java.util.function.BiFunction;
import java.util.regex.Pattern;

/* renamed from: com.google.autofill.detection.ml.RegexCountingSignal$$Lambda$2 */
final /* synthetic */ class RegexCountingSignal$$Lambda$2 implements BiFunction {
    private final boolean arg$1;

    public RegexCountingSignal$$Lambda$2(boolean z) {
        this.arg$1 = z;
    }

    public Object apply(Object obj, Object obj2) {
        return Double.valueOf(RegexCountingSignal.countOccurrencesLimitOnePerString((Pattern) obj, (Collection) obj2, this.arg$1));
    }
}
