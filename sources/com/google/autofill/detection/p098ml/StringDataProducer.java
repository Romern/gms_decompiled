package com.google.autofill.detection.p098ml;

import java.lang.ref.WeakReference;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.autofill.detection.ml.StringDataProducer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class StringDataProducer implements DataProducer {
    private static final int CURRENT_VERSION_CODE = 2;
    public static final bllu READER = new bllu() {
        /* class com.google.autofill.detection.p098ml.StringDataProducer.C17021 */

        private StringDataProducer readFromBundleV1(bllt bllt) {
            try {
                return StringDataProducer.forString(StringKey.forOrdinal(bllt.mo66673c()), false);
            } catch (IllegalArgumentException e) {
                throw new bllj(e);
            }
        }

        private StringDataProducer readFromBundleV2(bllt bllt) {
            try {
                return StringDataProducer.forString(StringKey.forOrdinal(bllt.mo66673c()), bllt.mo66672b());
            } catch (IllegalArgumentException e) {
                throw new bllj(e);
            }
        }

        public StringDataProducer readFromBundle(bllt bllt) {
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
    private static final Map cachedLowercaseProducers = new EnumMap(StringKey.class);
    private static final Map cachedUppercaseProducers = new EnumMap(StringKey.class);
    final boolean normalizeToLowercase;
    final StringKey stringKey;

    /* renamed from: com.google.autofill.detection.ml.StringDataProducer$2 */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    /* synthetic */ class C17032 {

        /* renamed from: $SwitchMap$com$google$autofill$detection$ml$StringDataProducer$StringKey */
        static final /* synthetic */ int[] f152330x28db1d13;

        static {
            int[] iArr = new int[StringKey.values().length];
            f152330x28db1d13 = iArr;
            try {
                iArr[StringKey.ACTIVITY_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f152330x28db1d13[StringKey.CLASS_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f152330x28db1d13[StringKey.ANDROID_HINT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f152330x28db1d13[StringKey.ANDROID_ID_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f152330x28db1d13[StringKey.ANDROID_TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f152330x28db1d13[StringKey.ANDROID_CONTENT_DESCRIPTION.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f152330x28db1d13[StringKey.HTML_INPUT_NAME.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f152330x28db1d13[StringKey.HTML_INPUT_ID.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f152330x28db1d13[StringKey.HTML_INPUT_TYPE.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f152330x28db1d13[StringKey.HTML_INPUT_PLACEHOLDER.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                f152330x28db1d13[StringKey.HTML_INPUT_LABEL.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                f152330x28db1d13[StringKey.USER_VISIBLE_TEXT.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                f152330x28db1d13[StringKey.METADATA_TEXT.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
        }
    }

    /* renamed from: com.google.autofill.detection.ml.StringDataProducer$StringKey */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum StringKey {
        UNKNOWN_STRING(0),
        ACTIVITY_NAME(1),
        CLASS_NAME(2),
        ANDROID_HINT(3),
        ANDROID_ID_ENTRY(4),
        ANDROID_TEXT(5),
        ANDROID_CONTENT_DESCRIPTION(6),
        HTML_INPUT_NAME(7),
        HTML_INPUT_ID(8),
        HTML_INPUT_TYPE(9),
        HTML_INPUT_PLACEHOLDER(10),
        HTML_INPUT_LABEL(11),
        USER_VISIBLE_TEXT(12),
        METADATA_TEXT(13);
        
        /* access modifiers changed from: private */
        public final int ordinal;

        private StringKey(int i) {
            this.ordinal = i;
        }

        public static StringKey forOrdinal(int i) {
            StringKey[] values = values();
            for (StringKey stringKey : values) {
                if (stringKey.ordinal == i) {
                    return stringKey;
                }
            }
            throw new IllegalArgumentException("Unsupported ordinal value.");
        }

        public int getOrdinal() {
            return this.ordinal;
        }
    }

    private StringDataProducer(StringKey stringKey2, boolean z) {
        bmxy.m108589a(stringKey2 != StringKey.UNKNOWN_STRING, "String key must not be unknown.");
        this.stringKey = stringKey2;
        this.normalizeToLowercase = z;
    }

    private bmxv computeStringValue(kom kom) {
        bmxv bmxv;
        StringKey stringKey2 = StringKey.UNKNOWN_STRING;
        switch (this.stringKey.ordinal()) {
            case 1:
                bmxv = bmxv.m108567c(koo.m18260a(kom));
                break;
            case 2:
                bmxv = bmxv.m108567c(kom.f24602a);
                break;
            case 3:
                bmxv = bmxv.m108567c(kom.f24605d);
                break;
            case 4:
                bmxv = bmxv.m108567c(kom.f24603b);
                break;
            case 5:
                bmxv = bmxv.m108567c(kom.f24606e);
                break;
            case 6:
                bmxv = bmxv.m108567c(kom.f24619r);
                break;
            case 7:
                bmxv = getHtmlInputAttribute(kom, "name");
                break;
            case 8:
                bmxv = getHtmlInputAttribute(kom, "id");
                break;
            case 9:
                bmxv = getHtmlInputAttribute(kom, "type");
                break;
            case 10:
                bmxv = getHtmlInputAttribute(kom, "placeholder");
                break;
            case 11:
                bmxv = getHtmlInputAttribute(kom, "label");
                break;
            case 12:
                bmxv = getUserVisibleText(kom);
                break;
            case 13:
                bmxv = getMetadataText(kom);
                break;
            default:
                throw new IllegalStateException("Unknown string.");
        }
        return this.normalizeToLowercase ? bmxv.mo66810a(StringDataProducer$$Lambda$0.$instance) : bmxv;
    }

    public static StringDataProducer forString(StringKey stringKey2) {
        return forString(stringKey2, true);
    }

    private static bmxv getHtmlInputAttribute(kom kom, String str) {
        kol kol = kom.f24623v;
        if (kol != null) {
            koh koh = (koh) kol;
            if ("input".equals(koh.f24572a)) {
                bnre i = koh.f24573b.listIterator();
                while (i.hasNext()) {
                    kok kok = (kok) i.next();
                    if (str.equals(kok.mo14744a())) {
                        return bmxv.m108566b(kok.mo14745b());
                    }
                }
                return bmvz.f131120a;
            }
        }
        return bmvz.f131120a;
    }

    private static bmxv getMetadataText(kom kom) {
        StringBuilder sb = new StringBuilder();
        if (!bmxx.m108577a(kom.f24603b)) {
            sb.append(kom.f24603b);
            sb.append(" ");
        }
        if (kom.f24623v != null) {
            bmxv htmlInputAttribute = getHtmlInputAttribute(kom, "name");
            if (htmlInputAttribute.mo66813a()) {
                sb.append((String) htmlInputAttribute.mo66814b());
                sb.append(" ");
            }
            bmxv htmlInputAttribute2 = getHtmlInputAttribute(kom, "id");
            if (htmlInputAttribute2.mo66813a()) {
                sb.append((String) htmlInputAttribute2.mo66814b());
                sb.append(" ");
            }
        }
        return sb.length() != 0 ? bmxv.m108566b(sb.toString().trim()) : bmvz.f131120a;
    }

    private static bmxv getUserVisibleText(kom kom) {
        StringBuilder sb = new StringBuilder();
        if (!bmxx.m108577a(kom.f24605d)) {
            sb.append(kom.f24605d);
            sb.append(" ");
        }
        if (!bmxx.m108577a(kom.f24619r)) {
            sb.append(kom.f24619r);
            sb.append(" ");
        }
        if (kom.f24623v != null) {
            bmxv htmlInputAttribute = getHtmlInputAttribute(kom, "label");
            if (htmlInputAttribute.mo66813a()) {
                sb.append((String) htmlInputAttribute.mo66814b());
                sb.append(" ");
            }
            bmxv htmlInputAttribute2 = getHtmlInputAttribute(kom, "placeholder");
            if (htmlInputAttribute2.mo66813a()) {
                sb.append((String) htmlInputAttribute2.mo66814b());
                sb.append(" ");
            }
        }
        return sb.length() != 0 ? bmxv.m108566b(sb.toString().trim()) : bmvz.f131120a;
    }

    public bmxv produce(kom kom) {
        return computeStringValue(kom);
    }

    public String toString() {
        String valueOf = String.valueOf(this.stringKey);
        boolean z = this.normalizeToLowercase;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
        sb.append("StringDataProducer(key: ");
        sb.append(valueOf);
        sb.append(", normalizeToLowerCase: ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public void writeToBundle(bllt bllt) {
        bllt.mo66667a(2);
        bllt.mo66667a(this.stringKey.ordinal);
        bllt.mo66670a(this.normalizeToLowercase);
    }

    public static StringDataProducer forString(StringKey stringKey2, boolean z) {
        StringDataProducer stringDataProducer;
        WeakReference weakReference = !z ? (WeakReference) cachedUppercaseProducers.get(stringKey2) : (WeakReference) cachedLowercaseProducers.get(stringKey2);
        if (weakReference != null && (stringDataProducer = (StringDataProducer) weakReference.get()) != null) {
            return stringDataProducer;
        }
        StringDataProducer stringDataProducer2 = new StringDataProducer(stringKey2, z);
        if (z) {
            cachedLowercaseProducers.put(stringKey2, new WeakReference(stringDataProducer2));
        } else {
            cachedUppercaseProducers.put(stringKey2, new WeakReference(stringDataProducer2));
        }
        return stringDataProducer2;
    }
}
