package com.google.autofill.detection.p098ml;

/* renamed from: com.google.autofill.detection.ml.AndroidInputTypeSignal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AndroidInputTypeSignal extends BooleanSignal {
    private static final int CURRENT_VERSION_CODE = 3;
    public static final bllu READER = new bllu() {
        /* class com.google.autofill.detection.p098ml.AndroidInputTypeSignal.C16851 */

        private AndroidInputTypeSignal readFromBundleV1orV2(bllt bllt) {
            return new AndroidInputTypeSignal(readOptionalInteger(bllt), readOptionalInteger(bllt), bmvz.f131120a);
        }

        private AndroidInputTypeSignal readFromBundleV3(bllt bllt) {
            return new AndroidInputTypeSignal(readOptionalInteger(bllt), readOptionalInteger(bllt), readOptionalInteger(bllt));
        }

        private bmxv readOptionalInteger(bllt bllt) {
            return bllt.mo66672b() ? bmxv.m108566b(Integer.valueOf(bllt.mo66673c())) : bmvz.f131120a;
        }

        public AndroidInputTypeSignal readFromBundle(bllt bllt) {
            int c = bllt.mo66673c();
            if (c == 1 || c == 2) {
                return readFromBundleV1orV2(bllt);
            }
            if (c == 3) {
                return readFromBundleV3(bllt);
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append("Unable to read bundle of version: ");
            sb.append(c);
            throw new bllj(sb.toString());
        }
    };
    public static final int TYPE_CLASS_DATETIME = 4;
    public static final int TYPE_CLASS_NUMBER = 2;
    public static final int TYPE_CLASS_PHONE = 3;
    public static final int TYPE_CLASS_TEXT = 1;
    public static final int TYPE_DATETIME_VARIATION_DATE = 16;
    public static final int TYPE_DATETIME_VARIATION_NORMAL = 0;
    public static final int TYPE_DATETIME_VARIATION_TIME = 32;
    private static final int TYPE_MASK_CLASS = 15;
    private static final int TYPE_MASK_FLAGS = 16773120;
    private static final int TYPE_MASK_VARIATION = 4080;
    public static final int TYPE_NUMBER_FLAG_DECIMAL = 8192;
    public static final int TYPE_NUMBER_FLAG_SIGNED = 4096;
    public static final int TYPE_NUMBER_VARIATION_NORMAL = 0;
    public static final int TYPE_NUMBER_VARIATION_PASSWORD = 16;
    public static final int TYPE_TEXT_FLAG_AUTO_COMPLETE = 65536;
    public static final int TYPE_TEXT_FLAG_AUTO_CORRECT = 32768;
    public static final int TYPE_TEXT_FLAG_CAP_CHARACTERS = 4096;
    public static final int TYPE_TEXT_FLAG_CAP_SENTENCES = 16384;
    public static final int TYPE_TEXT_FLAG_CAP_WORDS = 8192;
    public static final int TYPE_TEXT_FLAG_IME_MULTI_LINE = 262144;
    public static final int TYPE_TEXT_FLAG_MULTI_LINE = 131072;
    public static final int TYPE_TEXT_FLAG_NO_SUGGESTIONS = 524288;
    public static final int TYPE_TEXT_VARIATION_EMAIL_ADDRESS = 32;
    public static final int TYPE_TEXT_VARIATION_EMAIL_SUBJECT = 48;
    public static final int TYPE_TEXT_VARIATION_FILTER = 176;
    public static final int TYPE_TEXT_VARIATION_LONG_MESSAGE = 80;
    public static final int TYPE_TEXT_VARIATION_NORMAL = 0;
    public static final int TYPE_TEXT_VARIATION_PASSWORD = 128;
    public static final int TYPE_TEXT_VARIATION_PERSON_NAME = 96;
    public static final int TYPE_TEXT_VARIATION_PHONETIC = 192;
    public static final int TYPE_TEXT_VARIATION_POSTAL_ADDRESS = 112;
    public static final int TYPE_TEXT_VARIATION_SHORT_MESSAGE = 64;
    public static final int TYPE_TEXT_VARIATION_URI = 16;
    public static final int TYPE_TEXT_VARIATION_VISIBLE_PASSWORD = 144;
    public static final int TYPE_TEXT_VARIATION_WEB_EDIT_TEXT = 160;
    public static final int TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS = 208;
    public static final int TYPE_TEXT_VARIATION_WEB_PASSWORD = 224;
    final bmxv inputClass;
    final bmxv inputFlags;
    final bmxv inputVariation;

    private AndroidInputTypeSignal(bmxv bmxv, bmxv bmxv2, bmxv bmxv3) {
        if (!bmxv.mo66813a() && !bmxv2.mo66813a() && !bmxv3.mo66813a()) {
            throw new IllegalArgumentException("Either a class, variation, or flags must be supplied.");
        }
        this.inputClass = bmxv;
        this.inputVariation = bmxv2;
        this.inputFlags = bmxv3;
    }

    private boolean matchesClass(kom kom) {
        if (!this.inputClass.mo66813a() || (kom.f24604c & 15) == ((Integer) this.inputClass.mo66814b()).intValue()) {
            return true;
        }
        return false;
    }

    private boolean matchesFlags(kom kom) {
        if (!this.inputFlags.mo66813a() || (kom.f24604c & TYPE_MASK_FLAGS) == ((Integer) this.inputFlags.mo66814b()).intValue()) {
            return true;
        }
        return false;
    }

    private boolean matchesVariation(kom kom) {
        if (!this.inputVariation.mo66813a() || (kom.f24604c & TYPE_MASK_VARIATION) == ((Integer) this.inputVariation.mo66814b()).intValue()) {
            return true;
        }
        return false;
    }

    public static AndroidInputTypeSignal matching(int i, int i2, int i3) {
        return new AndroidInputTypeSignal(bmxv.m108566b(Integer.valueOf(i)), bmxv.m108566b(Integer.valueOf(i2)), bmxv.m108566b(Integer.valueOf(i3)));
    }

    public static AndroidInputTypeSignal matchingClass(int i) {
        return new AndroidInputTypeSignal(bmxv.m108566b(Integer.valueOf(i)), bmvz.f131120a, bmvz.f131120a);
    }

    public static AndroidInputTypeSignal matchingFlags(int i, int i2) {
        return new AndroidInputTypeSignal(bmxv.m108566b(Integer.valueOf(i)), bmvz.f131120a, bmxv.m108566b(Integer.valueOf(i2)));
    }

    public static AndroidInputTypeSignal matchingVariation(int i, int i2) {
        return new AndroidInputTypeSignal(bmxv.m108566b(Integer.valueOf(i)), bmxv.m108566b(Integer.valueOf(i2)), bmvz.f131120a);
    }

    /* access modifiers changed from: protected */
    public boolean generateBoolean(kom kom) {
        return matchesClass(kom) && matchesVariation(kom) && matchesFlags(kom);
    }

    public void reset() {
    }

    public String toString() {
        String valueOf = String.valueOf(this.inputClass);
        String valueOf2 = String.valueOf(this.inputVariation);
        String valueOf3 = String.valueOf(this.inputFlags);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("AndroidInputTypeSignal(class: ");
        sb.append(valueOf);
        sb.append(", variation: ");
        sb.append(valueOf2);
        sb.append(", flags: ");
        sb.append(valueOf3);
        sb.append(")");
        return sb.toString();
    }

    public void writeToBundle(bllt bllt) {
        bllt.mo66667a(3);
        bllt.mo66670a(this.inputClass.mo66813a());
        if (this.inputClass.mo66813a()) {
            bllt.mo66667a(((Integer) this.inputClass.mo66814b()).intValue());
        }
        bllt.mo66670a(this.inputVariation.mo66813a());
        if (this.inputVariation.mo66813a()) {
            bllt.mo66667a(((Integer) this.inputVariation.mo66814b()).intValue());
        }
        bllt.mo66670a(this.inputFlags.mo66813a());
        if (this.inputFlags.mo66813a()) {
            bllt.mo66667a(((Integer) this.inputFlags.mo66814b()).intValue());
        }
    }
}
