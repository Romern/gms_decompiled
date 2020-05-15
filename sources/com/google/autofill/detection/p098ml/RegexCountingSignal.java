package com.google.autofill.detection.p098ml;

import com.google.autofill.detection.p098ml.RegexSignalBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.autofill.detection.ml.RegexCountingSignal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RegexCountingSignal implements Signal {
    private static final int CURRENT_VERSION_CODE = 2;
    public static final bllu READER = new bllu() {
        /* class com.google.autofill.detection.p098ml.RegexCountingSignal.C16981 */

        private RegexCountingSignal readFromBundleV1(bllt bllt) {
            String f = bllt.mo66676f();
            int c = bllt.mo66673c();
            return new RegexCountingSignal(blmg.m107362a(f, c), RegexSignalBuilder.StringProducer.forKey(bllt.mo66673c()), CountOperation.forKey(bllt.mo66673c()), true);
        }

        private RegexCountingSignal readFromBundleV2(bllt bllt) {
            String f = bllt.mo66676f();
            int c = bllt.mo66673c();
            return new RegexCountingSignal(blmg.m107362a(f, c), RegexSignalBuilder.StringProducer.forKey(bllt.mo66673c()), CountOperation.forKey(bllt.mo66673c()), bllt.mo66672b());
        }

        public RegexCountingSignal readFromBundle(bllt bllt) {
            int c = bllt.mo66673c();
            if (c == 1) {
                return readFromBundleV1(bllt);
            }
            if (c == 2) {
                return readFromBundleV2(bllt);
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append("Unable to read bundle of version: ");
            sb.append(c);
            throw new bllj(sb.toString());
        }
    };
    final CountOperation countOperation;
    private final BiFunction countOperationFunction;
    final Pattern pattern;
    private final RuntimeConfiguration runtimeConfiguration;
    private final boolean shouldCompareEmptyStrings;
    private final boolean shouldReturnEarlyForEmptyCollection;
    final RegexSignalBuilder.StringProducer stringProducer;
    private final Function stringProducerFunction;

    /* renamed from: com.google.autofill.detection.ml.RegexCountingSignal$2 */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    /* synthetic */ class C16992 {

        /* renamed from: $SwitchMap$com$google$autofill$detection$ml$RegexCountingSignal$CountOperation */
        static final /* synthetic */ int[] f152328x67fe8c76;

        static {
            int[] iArr = new int[CountOperation.values().length];
            f152328x67fe8c76 = iArr;
            try {
                iArr[CountOperation.COUNT_MATCHING.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f152328x67fe8c76[CountOperation.COUNT_OCCURRENCES.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f152328x67fe8c76[CountOperation.COUNT_OCCURRENCES_LIMIT_ONE_PER_STRING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    /* renamed from: com.google.autofill.detection.ml.RegexCountingSignal$Builder */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Builder extends RegexSignalBuilder {

        /* renamed from: com.google.autofill.detection.ml.RegexCountingSignal$Builder$MultiStringBuilder */
        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class MultiStringBuilder {
            private final Pattern pattern;
            private boolean shouldCompareEmptyStrings;
            private final RegexSignalBuilder.StringProducer stringProducer;

            private MultiStringBuilder(Pattern pattern2, RegexSignalBuilder.StringProducer stringProducer2) {
                this.shouldCompareEmptyStrings = false;
                this.pattern = pattern2;
                this.stringProducer = stringProducer2;
            }

            public MultiStringBuilder consideringEmptyStrings() {
                this.shouldCompareEmptyStrings = true;
                return this;
            }

            public RegexCountingSignal countMatching() {
                return new RegexCountingSignal(this.pattern, this.stringProducer, CountOperation.COUNT_MATCHING, this.shouldCompareEmptyStrings);
            }

            public RegexCountingSignal countOccurrences() {
                return countOccurrences(false);
            }

            public RegexCountingSignal countOccurrences(boolean z) {
                if (!z) {
                    return new RegexCountingSignal(this.pattern, this.stringProducer, CountOperation.COUNT_OCCURRENCES, this.shouldCompareEmptyStrings);
                }
                return new RegexCountingSignal(this.pattern, this.stringProducer, CountOperation.COUNT_OCCURRENCES_LIMIT_ONE_PER_STRING, this.shouldCompareEmptyStrings);
            }
        }

        /* renamed from: com.google.autofill.detection.ml.RegexCountingSignal$Builder$SingleStringBuilder */
        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class SingleStringBuilder {
            private final Pattern pattern;
            private boolean shouldCompareEmptyStrings;
            private final RegexSignalBuilder.StringProducer stringProducer;

            private SingleStringBuilder(Pattern pattern2, RegexSignalBuilder.StringProducer stringProducer2) {
                this.shouldCompareEmptyStrings = false;
                this.pattern = pattern2;
                this.stringProducer = stringProducer2;
            }

            public SingleStringBuilder consideringEmptyStrings() {
                this.shouldCompareEmptyStrings = true;
                return this;
            }

            public RegexCountingSignal countOccurences() {
                return new RegexCountingSignal(this.pattern, this.stringProducer, CountOperation.COUNT_OCCURRENCES, this.shouldCompareEmptyStrings);
            }
        }

        protected Builder(String str) {
            super(str);
        }

        /* access modifiers changed from: protected */
        public MultiStringBuilder produceMultipleStringBuilder(Pattern pattern, RegexSignalBuilder.StringProducer stringProducer) {
            return new MultiStringBuilder(pattern, stringProducer);
        }

        /* access modifiers changed from: protected */
        public SingleStringBuilder produceSingleStringBuilder(Pattern pattern, RegexSignalBuilder.StringProducer stringProducer) {
            return new SingleStringBuilder(pattern, stringProducer);
        }
    }

    /* renamed from: com.google.autofill.detection.ml.RegexCountingSignal$CountOperation */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    enum CountOperation {
        COUNT_MATCHING(1),
        COUNT_OCCURRENCES(2),
        COUNT_OCCURRENCES_LIMIT_ONE_PER_STRING(3);
        
        private final int key;

        private CountOperation(int i) {
            this.key = i;
        }

        public static CountOperation forKey(int i) {
            CountOperation[] values = values();
            for (CountOperation countOperation : values) {
                if (countOperation.key == i) {
                    return countOperation;
                }
            }
            throw new IllegalArgumentException("Unsupported string operation key");
        }

        public int getKey() {
            return this.key;
        }
    }

    private RegexCountingSignal(Pattern pattern2, RegexSignalBuilder.StringProducer stringProducer2, CountOperation countOperation2, boolean z) {
        RuntimeConfiguration snapshot = RuntimeConfiguration.getSnapshot();
        this.runtimeConfiguration = snapshot;
        this.shouldReturnEarlyForEmptyCollection = snapshot.isRegexCountingSignalEarlyQuittingEnabled();
        this.pattern = pattern2;
        this.stringProducer = stringProducer2;
        this.stringProducerFunction = RegexSignalBuilder.stringProducerForKey(stringProducer2, this.runtimeConfiguration.isRegexBuilderProducerOptimizationEnabled());
        this.countOperation = countOperation2;
        this.countOperationFunction = getCountOperationFunction(countOperation2, z);
        this.shouldCompareEmptyStrings = z;
    }

    public static Builder comparing(String str) {
        return new Builder(str);
    }

    private static double countMatching(Pattern pattern2, Collection collection, boolean z) {
        Iterator it = collection.iterator();
        int i = 0;
        Matcher matcher = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z || !str.isEmpty()) {
                if (matcher != null) {
                    matcher.reset(str);
                } else {
                    matcher = blmg.m107361a(pattern2, str);
                }
                if (matcher.matches()) {
                    i++;
                }
            }
        }
        if (matcher != null) {
            blmg.m107363a(matcher);
        }
        return (double) i;
    }

    private static double countOccurrences(Pattern pattern2, Collection collection, boolean z) {
        return countOccurrences(pattern2, collection, false, z);
    }

    private static double countOccurrencesLimitOnePerString(Pattern pattern2, Collection collection, boolean z) {
        return countOccurrences(pattern2, collection, true, z);
    }

    private static BiFunction getCountOperationFunction(CountOperation countOperation2, boolean z) {
        CountOperation countOperation3 = CountOperation.COUNT_MATCHING;
        int ordinal = countOperation2.ordinal();
        if (ordinal == 0) {
            return new RegexCountingSignal$$Lambda$0(z);
        }
        if (ordinal == 1) {
            return new RegexCountingSignal$$Lambda$1(z);
        }
        if (ordinal == 2) {
            return new RegexCountingSignal$$Lambda$2(z);
        }
        String valueOf = String.valueOf(countOperation2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unsupported operation: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public double generate(kom kom) {
        Collection collection = (Collection) this.stringProducerFunction.apply(kom);
        if (!this.shouldReturnEarlyForEmptyCollection || !collection.isEmpty()) {
            return ((Double) this.countOperationFunction.apply(this.pattern, collection)).doubleValue();
        }
        return 0.0d;
    }

    public void reset() {
    }

    public String toString() {
        String pattern2 = this.pattern.pattern();
        String valueOf = String.valueOf(this.countOperation);
        String valueOf2 = String.valueOf(this.stringProducer);
        boolean z = this.shouldCompareEmptyStrings;
        int length = String.valueOf(pattern2).length();
        StringBuilder sb = new StringBuilder(length + 100 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("RegexCountingSignal(pattern: ");
        sb.append(pattern2);
        sb.append(", countOperation: ");
        sb.append(valueOf);
        sb.append(", stringProducer: ");
        sb.append(valueOf2);
        sb.append(", shouldCompareEmptyStrings: ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public void writeToBundle(bllt bllt) {
        bllt.mo66667a(2);
        bllt.mo66669a(this.pattern.pattern());
        bllt.mo66667a(this.pattern.flags());
        bllt.mo66667a(this.stringProducer.getKey());
        bllt.mo66667a(this.countOperation.getKey());
        bllt.mo66670a(this.shouldCompareEmptyStrings);
    }

    private static double countOccurrences(Pattern pattern2, Collection collection, boolean z, boolean z2) {
        Iterator it = collection.iterator();
        int i = 0;
        Matcher matcher = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z2 || !str.isEmpty()) {
                if (matcher != null) {
                    matcher.reset(str);
                } else {
                    matcher = blmg.m107361a(pattern2, str);
                }
                while (matcher.find()) {
                    i++;
                    if (z) {
                        break;
                    }
                }
            }
        }
        if (matcher != null) {
            blmg.m107363a(matcher);
        }
        return (double) i;
    }
}
