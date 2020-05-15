package com.google.autofill.detection.p098ml;

import com.google.autofill.detection.p098ml.RegexSignalBuilder;
import java.util.Collection;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.autofill.detection.ml.RegexMatchingSignal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RegexMatchingSignal extends BooleanSignal {
    private static final int CURRENT_VERSION_CODE = 2;
    public static final bllu READER = new bllu() {
        /* class com.google.autofill.detection.p098ml.RegexMatchingSignal.C17001 */

        private RegexMatchingSignal readFromBundleV1(bllt bllt) {
            String f = bllt.mo66676f();
            int c = bllt.mo66673c();
            boolean b = bllt.mo66672b();
            boolean b2 = bllt.mo66672b();
            return new RegexMatchingSignal(blmg.m107362a(f, c), RegexSignalBuilder.StringProducer.forKey(bllt.mo66673c()), b, b2, true);
        }

        private RegexMatchingSignal readFromBundleV2(bllt bllt) {
            String f = bllt.mo66676f();
            int c = bllt.mo66673c();
            boolean b = bllt.mo66672b();
            boolean b2 = bllt.mo66672b();
            boolean b3 = bllt.mo66672b();
            return new RegexMatchingSignal(blmg.m107362a(f, c), RegexSignalBuilder.StringProducer.forKey(bllt.mo66673c()), b, b2, b3);
        }

        public RegexMatchingSignal readFromBundle(bllt bllt) {
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
    final boolean mustMatchAllEntries;
    final boolean mustMatchEntireString;
    final Pattern pattern;
    private final RuntimeConfiguration runtimeConfiguration;
    final boolean shouldCompareEmptyStrings;
    final RegexSignalBuilder.StringProducer stringProducer;
    private final Function stringProducerFunction;

    /* renamed from: com.google.autofill.detection.ml.RegexMatchingSignal$Builder */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Builder extends RegexSignalBuilder {
        protected Builder(String str) {
            super(str);
        }

        /* access modifiers changed from: protected */
        public MultiMatchBuilder produceMultipleStringBuilder(Pattern pattern, RegexSignalBuilder.StringProducer stringProducer) {
            return new MultiMatchBuilder(pattern, stringProducer);
        }

        /* access modifiers changed from: protected */
        public SingleMatchBuilder produceSingleStringBuilder(Pattern pattern, RegexSignalBuilder.StringProducer stringProducer) {
            return new SingleMatchBuilder(pattern, stringProducer);
        }
    }

    /* renamed from: com.google.autofill.detection.ml.RegexMatchingSignal$MultiMatchBuilder */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class MultiMatchBuilder {
        private final Pattern pattern;
        private boolean shouldCompareEmptyStrings;
        private final RegexSignalBuilder.StringProducer stringProducer;

        private MultiMatchBuilder(Pattern pattern2, RegexSignalBuilder.StringProducer stringProducer2) {
            this.shouldCompareEmptyStrings = false;
            this.pattern = pattern2;
            this.stringProducer = stringProducer2;
        }

        public MultiMatchBuilder consideringEmptyStrings() {
            this.shouldCompareEmptyStrings = true;
            return this;
        }

        public RegexMatchingSignal foundWithinAll() {
            return new RegexMatchingSignal(this.pattern, this.stringProducer, false, true, this.shouldCompareEmptyStrings);
        }

        public RegexMatchingSignal foundWithinAny() {
            return new RegexMatchingSignal(this.pattern, this.stringProducer, false, false, this.shouldCompareEmptyStrings);
        }

        public RegexMatchingSignal matchesAll() {
            return new RegexMatchingSignal(this.pattern, this.stringProducer, true, true, this.shouldCompareEmptyStrings);
        }

        public RegexMatchingSignal matchesAny() {
            return new RegexMatchingSignal(this.pattern, this.stringProducer, true, false, this.shouldCompareEmptyStrings);
        }
    }

    /* renamed from: com.google.autofill.detection.ml.RegexMatchingSignal$SingleMatchBuilder */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SingleMatchBuilder {
        private final Pattern pattern;
        private boolean shouldCompareEmptyStrings;
        private final RegexSignalBuilder.StringProducer stringProducer;

        private SingleMatchBuilder(Pattern pattern2, RegexSignalBuilder.StringProducer stringProducer2) {
            this.shouldCompareEmptyStrings = false;
            this.pattern = pattern2;
            this.stringProducer = stringProducer2;
        }

        public SingleMatchBuilder consideringEmptyStrings() {
            this.shouldCompareEmptyStrings = true;
            return this;
        }

        public RegexMatchingSignal findWithin() {
            return new RegexMatchingSignal(this.pattern, this.stringProducer, false, true, this.shouldCompareEmptyStrings);
        }

        public RegexMatchingSignal matchEntire() {
            return new RegexMatchingSignal(this.pattern, this.stringProducer, true, true, this.shouldCompareEmptyStrings);
        }
    }

    private RegexMatchingSignal(Pattern pattern2, RegexSignalBuilder.StringProducer stringProducer2, boolean z, boolean z2, boolean z3) {
        RuntimeConfiguration snapshot = RuntimeConfiguration.getSnapshot();
        this.runtimeConfiguration = snapshot;
        this.pattern = pattern2;
        this.stringProducer = stringProducer2;
        this.stringProducerFunction = RegexSignalBuilder.stringProducerForKey(stringProducer2, snapshot.isRegexBuilderProducerOptimizationEnabled());
        this.mustMatchEntireString = z;
        this.mustMatchAllEntries = z2;
        this.shouldCompareEmptyStrings = z3;
    }

    public static Builder comparing(String str) {
        return new Builder(str);
    }

    public static Builder comparingWord(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
        sb.append("(?:[^a-zA-Z]|^)(?:");
        sb.append(str);
        sb.append(")(?:[^a-zA-Z]|$)");
        return comparing(sb.toString());
    }

    /* access modifiers changed from: protected */
    public boolean generateBoolean(kom kom) {
        Collection<String> collection = (Collection) this.stringProducerFunction.apply(kom);
        if (collection.isEmpty()) {
            return false;
        }
        Matcher matcher = null;
        boolean z = false;
        for (String str : collection) {
            if (!str.isEmpty() || this.shouldCompareEmptyStrings) {
                if (matcher == null) {
                    matcher = blmg.m107361a(this.pattern, str);
                } else {
                    matcher.reset(str);
                }
                z = !this.mustMatchEntireString ? matcher.find() : matcher.matches();
            } else {
                z = false;
            }
            if (this.mustMatchAllEntries) {
                if (!z) {
                    break;
                }
            } else if (z) {
                break;
            }
        }
        if (matcher != null) {
            blmg.m107363a(matcher);
        }
        return z;
    }

    public void reset() {
    }

    public String toString() {
        String pattern2 = this.pattern.pattern();
        String valueOf = String.valueOf(this.stringProducer);
        boolean z = this.mustMatchEntireString;
        boolean z2 = this.mustMatchAllEntries;
        boolean z3 = this.shouldCompareEmptyStrings;
        StringBuilder sb = new StringBuilder(String.valueOf(pattern2).length() + 137 + String.valueOf(valueOf).length());
        sb.append("RegexBooleanSignal(pattern: ");
        sb.append(pattern2);
        sb.append(", stringProducer: ");
        sb.append(valueOf);
        sb.append(", mustMatchEntireString: ");
        sb.append(z);
        sb.append(", mustMatchAllEntries:");
        sb.append(z2);
        sb.append(", shouldCompareEmptyStrings:");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public void writeToBundle(bllt bllt) {
        bllt.mo66667a(2);
        bllt.mo66669a(this.pattern.pattern());
        bllt.mo66667a(this.pattern.flags());
        bllt.mo66670a(this.mustMatchEntireString);
        bllt.mo66670a(this.mustMatchAllEntries);
        bllt.mo66670a(this.shouldCompareEmptyStrings);
        bllt.mo66667a(this.stringProducer.getKey());
    }
}
