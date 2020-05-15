package com.google.autofill.detection.p098ml;

import com.google.autofill.detection.p098ml.StringDataProducer;

/* renamed from: com.google.autofill.detection.ml.StringMatchingSignal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class StringMatchingSignal extends BooleanSignal {
    private static final int CURRENT_VERSION_CODE = 2;
    public static final bllu READER = new bllu() {
        /* class com.google.autofill.detection.p098ml.StringMatchingSignal.C17041 */

        private StringMatchingSignal readFromBundleV1(bllt bllt) {
            String str;
            DataProducer dataProducer = (DataProducer) bllt.mo66677g();
            try {
                MatchingOperation forKey = MatchingOperation.forKey(bllt.mo66673c());
                boolean b = bllt.mo66672b();
                String f = bllt.mo66676f();
                if (!b) {
                    str = bmwb.m108442a(f);
                } else {
                    str = f;
                }
                return new StringMatchingSignal(dataProducer, forKey, b, str);
            } catch (IllegalArgumentException e) {
                throw new bllj(e);
            }
        }

        private StringMatchingSignal readFromBundleV2(bllt bllt) {
            try {
                return new StringMatchingSignal((DataProducer) bllt.mo66677g(), MatchingOperation.forKey(bllt.mo66673c()), true, bllt.mo66676f());
            } catch (IllegalArgumentException e) {
                throw new bllj(e);
            }
        }

        public StringMatchingSignal readFromBundle(bllt bllt) {
            int c = bllt.mo66673c();
            if (c == 2) {
                return readFromBundleV2(bllt);
            }
            if (c == 1) {
                return readFromBundleV1(bllt);
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append("Unable to read bundle of version: ");
            sb.append(c);
            throw new bllj(sb.toString());
        }
    };
    @Deprecated
    private final boolean caseSensitive;
    private final String comparisonString;
    private final MatchingOperation matchingOperation;
    private final DataProducer stringProducer;

    /* renamed from: com.google.autofill.detection.ml.StringMatchingSignal$2 */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    /* synthetic */ class C17052 {

        /* renamed from: $SwitchMap$com$google$autofill$detection$ml$StringMatchingSignal$MatchingOperation */
        static final /* synthetic */ int[] f152331xf8cb7998;

        static {
            int[] iArr = new int[MatchingOperation.values().length];
            f152331xf8cb7998 = iArr;
            try {
                iArr[MatchingOperation.MATCHES_ENTIRE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f152331xf8cb7998[MatchingOperation.CONTAINS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f152331xf8cb7998[MatchingOperation.CONTAINS_WORD.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    /* renamed from: com.google.autofill.detection.ml.StringMatchingSignal$Builder */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Builder {
        private final DataProducer stringProducer;

        private Builder(DataProducer dataProducer) {
            this.stringProducer = dataProducer;
        }

        public StringMatchingSignal contains(String str) {
            return new StringMatchingSignal(this.stringProducer, MatchingOperation.CONTAINS, true, str);
        }

        public StringMatchingSignal containsWord(String str) {
            return new StringMatchingSignal(this.stringProducer, MatchingOperation.CONTAINS_WORD, true, str);
        }

        public StringMatchingSignal matches(String str) {
            return new StringMatchingSignal(this.stringProducer, MatchingOperation.MATCHES_ENTIRE, true, str);
        }
    }

    /* renamed from: com.google.autofill.detection.ml.StringMatchingSignal$MatchingOperation */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    enum MatchingOperation {
        UNKNOWN_MATCHING_OPERATION(0),
        MATCHES_ENTIRE(1),
        CONTAINS(2),
        CONTAINS_WORD(3);
        
        /* access modifiers changed from: private */
        public final int key;

        private MatchingOperation(int i) {
            this.key = i;
        }

        public static MatchingOperation forKey(int i) {
            MatchingOperation[] values = values();
            for (MatchingOperation matchingOperation : values) {
                if (matchingOperation.key == i) {
                    return matchingOperation;
                }
            }
            throw new IllegalArgumentException("Unsupported matching operation.");
        }
    }

    private StringMatchingSignal(DataProducer dataProducer, MatchingOperation matchingOperation2, boolean z, String str) {
        boolean z2;
        if (matchingOperation2 != MatchingOperation.UNKNOWN_MATCHING_OPERATION) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108589a(z2, "Matching operation can not be unknown.");
        this.stringProducer = dataProducer;
        this.matchingOperation = matchingOperation2;
        this.caseSensitive = z;
        this.comparisonString = str.intern();
    }

    public static Builder activityName() {
        return string(StringDataProducer.forString(StringDataProducer.StringKey.ACTIVITY_NAME));
    }

    public static Builder androidContentDescription() {
        return string(StringDataProducer.forString(StringDataProducer.StringKey.ANDROID_CONTENT_DESCRIPTION));
    }

    public static Builder androidHint() {
        return string(StringDataProducer.forString(StringDataProducer.StringKey.ANDROID_HINT));
    }

    public static Builder androidIdEntry() {
        return string(StringDataProducer.forString(StringDataProducer.StringKey.ANDROID_ID_ENTRY));
    }

    public static Builder androidText() {
        return string(StringDataProducer.forString(StringDataProducer.StringKey.ANDROID_TEXT));
    }

    public static Builder className() {
        return string(StringDataProducer.forString(StringDataProducer.StringKey.CLASS_NAME));
    }

    private static boolean containsWord(String str, String str2) {
        boolean z;
        int length = str.length();
        int length2 = str2.length();
        int i = length - length2;
        int i2 = 0;
        while (i2 <= i) {
            int indexOf = str.indexOf(str2, i2);
            if (indexOf == -1) {
                break;
            }
            int i3 = indexOf - 1;
            if (i3 < 0 || !isLetter(str.charAt(i3))) {
                z = true;
            } else {
                z = false;
            }
            int i4 = indexOf + length2;
            boolean z2 = i4 == length || !isLetter(str.charAt(i4));
            if (!z) {
                if (z2) {
                    i2 = i4 + 1;
                }
            } else if (z2) {
                return true;
            }
            i2 = i4 + 2;
        }
        return false;
    }

    public static Builder htmlInputId() {
        return string(StringDataProducer.forString(StringDataProducer.StringKey.HTML_INPUT_ID));
    }

    public static Builder htmlInputLabel() {
        return string(StringDataProducer.forString(StringDataProducer.StringKey.HTML_INPUT_LABEL));
    }

    public static Builder htmlInputName() {
        return string(StringDataProducer.forString(StringDataProducer.StringKey.HTML_INPUT_NAME));
    }

    public static Builder htmlInputPlaceholder() {
        return string(StringDataProducer.forString(StringDataProducer.StringKey.HTML_INPUT_PLACEHOLDER));
    }

    public static Builder htmlInputType() {
        return string(StringDataProducer.forString(StringDataProducer.StringKey.HTML_INPUT_TYPE));
    }

    private static boolean isLetter(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        return c >= 'A' && c <= 'Z';
    }

    public static Builder metadataText() {
        return string(StringDataProducer.forString(StringDataProducer.StringKey.METADATA_TEXT));
    }

    public static Builder string(DataProducer dataProducer) {
        return new Builder(dataProducer);
    }

    public static Builder userVisibleText() {
        return string(StringDataProducer.forString(StringDataProducer.StringKey.USER_VISIBLE_TEXT));
    }

    public boolean generateBoolean(kom kom) {
        bmxv produce = this.stringProducer.produce(kom);
        if (!produce.mo66813a()) {
            return false;
        }
        String str = (String) produce.mo66814b();
        MatchingOperation matchingOperation2 = MatchingOperation.UNKNOWN_MATCHING_OPERATION;
        int ordinal = this.matchingOperation.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    if (!this.caseSensitive) {
                        str = bmwb.m108442a(str);
                    }
                    return containsWord(str, this.comparisonString);
                }
                throw new IllegalStateException("Unknown matching operation.");
            } else if (!this.caseSensitive) {
                return bmwb.m108442a(str).contains(this.comparisonString);
            } else {
                return str.contains(this.comparisonString);
            }
        } else if (this.caseSensitive) {
            return str.equals(this.comparisonString);
        } else {
            return bmwb.m108443a(str, this.comparisonString);
        }
    }

    public void reset() {
    }

    public String toString() {
        String valueOf = String.valueOf(this.stringProducer);
        String valueOf2 = String.valueOf(this.matchingOperation);
        String str = this.comparisonString;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 66 + String.valueOf(valueOf2).length() + String.valueOf(str).length());
        sb.append("StringMatchingSignal(producer: ");
        sb.append(valueOf);
        sb.append(", matchingOp: ");
        sb.append(valueOf2);
        sb.append(", comparisonString: ");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public void writeToBundle(bllt bllt) {
        bllt.mo66667a(2);
        bllt.mo66668a(this.stringProducer);
        bllt.mo66667a(this.matchingOperation.key);
        bllt.mo66669a(this.comparisonString);
    }
}
