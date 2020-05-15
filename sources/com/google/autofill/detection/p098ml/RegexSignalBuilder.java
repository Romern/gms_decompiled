package com.google.autofill.detection.p098ml;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* renamed from: com.google.autofill.detection.ml.RegexSignalBuilder */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class RegexSignalBuilder {
    private boolean caseSensitive = false;
    private final String regex;

    /* renamed from: com.google.autofill.detection.ml.RegexSignalBuilder$1 */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    /* synthetic */ class C17011 {

        /* renamed from: $SwitchMap$com$google$autofill$detection$ml$RegexSignalBuilder$StringProducer */
        static final /* synthetic */ int[] f152329x567fb0bf;

        static {
            int[] iArr = new int[StringProducer.values().length];
            f152329x567fb0bf = iArr;
            try {
                iArr[StringProducer.ACTIVITY_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f152329x567fb0bf[StringProducer.CLASS_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f152329x567fb0bf[StringProducer.ANDROID_HINT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f152329x567fb0bf[StringProducer.ANDROID_ID_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f152329x567fb0bf[StringProducer.ANDROID_TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f152329x567fb0bf[StringProducer.ANDROID_CONTENT_DESCRIPTION.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f152329x567fb0bf[StringProducer.WEBVIEW_INPUT_NAME.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f152329x567fb0bf[StringProducer.WEBVIEW_INPUT_ID.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f152329x567fb0bf[StringProducer.WEBVIEW_INPUT_TYPE.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f152329x567fb0bf[StringProducer.WEBVIEW_INPUT_PLACEHOLDER.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                f152329x567fb0bf[StringProducer.WEBVIEW_INPUT_LABEL.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                f152329x567fb0bf[StringProducer.AUTOFILL_HINTS.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                f152329x567fb0bf[StringProducer.AUTOFILL_OPTIONS.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                f152329x567fb0bf[StringProducer.USER_VISIBLE_TEXT.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                f152329x567fb0bf[StringProducer.METADATA_TEXT.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
        }
    }

    /* renamed from: com.google.autofill.detection.ml.RegexSignalBuilder$StringProducer */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    enum StringProducer {
        ACTIVITY_NAME(1),
        CLASS_NAME(2),
        ANDROID_HINT(3),
        ANDROID_ID_ENTRY(4),
        ANDROID_TEXT(5),
        WEBVIEW_INPUT_NAME(6),
        WEBVIEW_INPUT_ID(7),
        WEBVIEW_INPUT_TYPE(8),
        WEBVIEW_INPUT_PLACEHOLDER(9),
        WEBVIEW_INPUT_LABEL(13),
        AUTOFILL_HINTS(10),
        AUTOFILL_OPTIONS(11),
        ANDROID_CONTENT_DESCRIPTION(12),
        USER_VISIBLE_TEXT(13),
        METADATA_TEXT(14);
        
        private final int key;

        private StringProducer(int i) {
            this.key = i;
        }

        public static StringProducer forKey(int i) {
            StringProducer[] values = values();
            for (StringProducer stringProducer : values) {
                if (stringProducer.key == i) {
                    return stringProducer;
                }
            }
            throw new IllegalArgumentException("Unsupported string producer key");
        }

        public int getKey() {
            return this.key;
        }
    }

    public RegexSignalBuilder(String str) {
        this.regex = str;
    }

    private static Function charSequenceArrayToStringCollectionProducer(Function function, boolean z) {
        return new RegexSignalBuilder$$Lambda$9(function, z);
    }

    private static Function getMetadataTextCollectionProducer(boolean z) {
        return new RegexSignalBuilder$$Lambda$12(z);
    }

    private Pattern getPattern() {
        return blmg.m107362a(this.regex, !this.caseSensitive ? 2 : 0);
    }

    private static Function getUserVisibleTextCollectionProducer(boolean z) {
        return new RegexSignalBuilder$$Lambda$11(z);
    }

    /* renamed from: lambda$charSequenceArrayToStringCollectionProducer$1$RegexSignalBuilder */
    static final /* synthetic */ Collection m118861x969d2b82(Function function, boolean z, kom kom) {
        CharSequence[] charSequenceArr = (CharSequence[]) function.apply(kom);
        if (charSequenceArr != null) {
            if (!z) {
                return (Collection) Arrays.stream(charSequenceArr).map(RegexSignalBuilder$$Lambda$13.$instance).collect(Collectors.toList());
            }
            int length = charSequenceArr.length;
            if (length != 0) {
                bngs b = bngx.m109371b(length);
                for (CharSequence charSequence : charSequenceArr) {
                    b.mo67668c(charSequence.toString());
                }
                return b.mo67664a();
            }
        }
        return bngx.m109376e();
    }

    static final /* synthetic */ Collection lambda$getMetadataTextCollectionProducer$4$RegexSignalBuilder(boolean z, kom kom) {
        bngs j = bngx.m109377j();
        j.mo67666b((Iterable) stringProducerForKey(StringProducer.ANDROID_ID_ENTRY, z).apply(kom));
        j.mo67666b((Iterable) stringProducerForKey(StringProducer.WEBVIEW_INPUT_ID, z).apply(kom));
        j.mo67666b((Iterable) stringProducerForKey(StringProducer.WEBVIEW_INPUT_NAME, z).apply(kom));
        return j.mo67664a();
    }

    static final /* synthetic */ Collection lambda$getUserVisibleTextCollectionProducer$3$RegexSignalBuilder(boolean z, kom kom) {
        bngs j = bngx.m109377j();
        j.mo67666b((Iterable) stringProducerForKey(StringProducer.ANDROID_HINT, z).apply(kom));
        j.mo67666b((Iterable) stringProducerForKey(StringProducer.ANDROID_CONTENT_DESCRIPTION, z).apply(kom));
        j.mo67666b((Iterable) stringProducerForKey(StringProducer.WEBVIEW_INPUT_LABEL, z).apply(kom));
        j.mo67666b((Iterable) stringProducerForKey(StringProducer.WEBVIEW_INPUT_PLACEHOLDER, z).apply(kom));
        return j.mo67664a();
    }

    static final /* synthetic */ Collection lambda$toStringCollectionProducer$0$RegexSignalBuilder(Function function, kom kom) {
        String str = (String) function.apply(kom);
        return str != null ? bngx.m109356a(str) : bngx.m109376e();
    }

    /* renamed from: lambda$toWebViewInputAttributeStringProducer$2$RegexSignalBuilder */
    static final /* synthetic */ String m118862x78f1e60c(String str, kom kom) {
        kol kol = kom.f24623v;
        if (kol != null) {
            koh koh = (koh) kol;
            if ("input".equals(koh.f24572a)) {
                bnre i = koh.f24573b.listIterator();
                while (i.hasNext()) {
                    kok kok = (kok) i.next();
                    if (str.equals(kok.mo14744a())) {
                        return kok.mo14745b();
                    }
                }
            }
        }
        return null;
    }

    static Function stringProducerForKey(StringProducer stringProducer, boolean z) {
        StringProducer stringProducer2 = StringProducer.ACTIVITY_NAME;
        switch (stringProducer.ordinal()) {
            case 0:
                return toStringCollectionProducer(RegexSignalBuilder$$Lambda$0.$instance);
            case 1:
                return toStringCollectionProducer(RegexSignalBuilder$$Lambda$1.$instance);
            case 2:
                return toStringCollectionProducer(RegexSignalBuilder$$Lambda$2.$instance);
            case 3:
                return toStringCollectionProducer(RegexSignalBuilder$$Lambda$3.$instance);
            case 4:
                return toStringCollectionProducer(RegexSignalBuilder$$Lambda$4.$instance);
            case 5:
                return toWebViewInputAttributeStringProducer("name");
            case 6:
                return toWebViewInputAttributeStringProducer("id");
            case 7:
                return toWebViewInputAttributeStringProducer("type");
            case 8:
                return toWebViewInputAttributeStringProducer("placeholder");
            case 9:
                return toWebViewInputAttributeStringProducer("label");
            case 10:
                return RegexSignalBuilder$$Lambda$6.$instance;
            case 11:
                return charSequenceArrayToStringCollectionProducer(RegexSignalBuilder$$Lambda$7.$instance, z);
            case 12:
                return toStringCollectionProducer(RegexSignalBuilder$$Lambda$5.$instance);
            case 13:
                return getUserVisibleTextCollectionProducer(z);
            case 14:
                return getMetadataTextCollectionProducer(z);
            default:
                throw new IllegalArgumentException("Unsupported string producer");
        }
    }

    private static Function toStringCollectionProducer(Function function) {
        return new RegexSignalBuilder$$Lambda$8(function);
    }

    private static Function toWebViewInputAttributeStringProducer(String str) {
        return toStringCollectionProducer(new RegexSignalBuilder$$Lambda$10(str));
    }

    public final RegexSignalBuilder caseSensitive() {
        this.caseSensitive = true;
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract Object produceMultipleStringBuilder(Pattern pattern, StringProducer stringProducer);

    /* access modifiers changed from: protected */
    public abstract Object produceSingleStringBuilder(Pattern pattern, StringProducer stringProducer);

    public final Object toActivityName() {
        return produceSingleStringBuilder(getPattern(), StringProducer.ACTIVITY_NAME);
    }

    public final Object toAndroidContentDescription() {
        return produceSingleStringBuilder(getPattern(), StringProducer.ANDROID_CONTENT_DESCRIPTION);
    }

    public final Object toAndroidHint() {
        return produceSingleStringBuilder(getPattern(), StringProducer.ANDROID_HINT);
    }

    public final Object toAndroidIdEntry() {
        return produceSingleStringBuilder(getPattern(), StringProducer.ANDROID_ID_ENTRY);
    }

    public final Object toAndroidText() {
        return produceSingleStringBuilder(getPattern(), StringProducer.ANDROID_TEXT);
    }

    public final Object toAutofillHints() {
        return produceMultipleStringBuilder(getPattern(), StringProducer.AUTOFILL_HINTS);
    }

    public final Object toAutofillOptions() {
        return produceMultipleStringBuilder(getPattern(), StringProducer.AUTOFILL_OPTIONS);
    }

    public final Object toClassName() {
        return produceSingleStringBuilder(getPattern(), StringProducer.CLASS_NAME);
    }

    public final Object toMetadataText() {
        return produceMultipleStringBuilder(getPattern(), StringProducer.METADATA_TEXT);
    }

    public final Object toUserVisibleText() {
        return produceMultipleStringBuilder(getPattern(), StringProducer.USER_VISIBLE_TEXT);
    }

    public final Object toWebViewInputId() {
        return produceSingleStringBuilder(getPattern(), StringProducer.WEBVIEW_INPUT_ID);
    }

    public final Object toWebViewInputLabel() {
        return produceSingleStringBuilder(getPattern(), StringProducer.WEBVIEW_INPUT_LABEL);
    }

    public final Object toWebViewInputName() {
        return produceSingleStringBuilder(getPattern(), StringProducer.WEBVIEW_INPUT_NAME);
    }

    public final Object toWebViewInputPlaceholder() {
        return produceSingleStringBuilder(getPattern(), StringProducer.WEBVIEW_INPUT_PLACEHOLDER);
    }

    public final Object toWebViewInputType() {
        return produceSingleStringBuilder(getPattern(), StringProducer.WEBVIEW_INPUT_TYPE);
    }
}
