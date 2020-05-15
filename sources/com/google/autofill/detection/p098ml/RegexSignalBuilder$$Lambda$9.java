package com.google.autofill.detection.p098ml;

import java.util.function.Function;

/* renamed from: com.google.autofill.detection.ml.RegexSignalBuilder$$Lambda$9 */
final /* synthetic */ class RegexSignalBuilder$$Lambda$9 implements Function {
    private final Function arg$1;
    private final boolean arg$2;

    public RegexSignalBuilder$$Lambda$9(Function function, boolean z) {
        this.arg$1 = function;
        this.arg$2 = z;
    }

    public Object apply(Object obj) {
        return RegexSignalBuilder.m118861x969d2b82(this.arg$1, this.arg$2, (kom) obj);
    }
}
