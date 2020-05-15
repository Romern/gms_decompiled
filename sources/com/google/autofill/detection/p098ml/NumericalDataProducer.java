package com.google.autofill.detection.p098ml;

import java.util.OptionalDouble;

/* renamed from: com.google.autofill.detection.ml.NumericalDataProducer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NumericalDataProducer implements DoubleDataProducer {
    private static final int CURRENT_VERSION = 1;
    private static final int NIBBLE_SIZE = 4;
    public static final bllu READER = new bllu() {
        /* class com.google.autofill.detection.p098ml.NumericalDataProducer.C16921 */

        public NumericalDataProducer readFromBundle(bllt bllt) {
            int c = bllt.mo66673c();
            if (c == 1) {
                try {
                    return new NumericalDataProducer(NumberProducer.fromKey(bllt.mo66673c()));
                } catch (IllegalArgumentException e) {
                    throw new bllj(e);
                }
            } else {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Unable to read bundle of version: ");
                sb.append(c);
                throw new bllj(sb.toString());
            }
        }
    };
    private static final int TYPE_MASK_CLASS = 15;
    private static final int TYPE_MASK_FLAGS = 16773120;
    private static final int TYPE_MASK_VARIATION = 4080;
    final NumberProducer numberProducer;

    /* renamed from: com.google.autofill.detection.ml.NumericalDataProducer$2 */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    /* synthetic */ class C16932 {

        /* renamed from: $SwitchMap$com$google$autofill$detection$ml$NumericalDataProducer$NumberProducer */
        static final /* synthetic */ int[] f152326x2f9e93c7;

        static {
            int[] iArr = new int[NumberProducer.values().length];
            f152326x2f9e93c7 = iArr;
            try {
                iArr[NumberProducer.WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f152326x2f9e93c7[NumberProducer.HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f152326x2f9e93c7[NumberProducer.NUMBER_OF_INPUT_SIBLINGS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f152326x2f9e93c7[NumberProducer.TOTAL_NUMBER_OF_INPUT_NODES.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f152326x2f9e93c7[NumberProducer.AUTOFILL_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f152326x2f9e93c7[NumberProducer.INPUT_TYPE_CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f152326x2f9e93c7[NumberProducer.INPUT_TYPE_FLAGS.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f152326x2f9e93c7[NumberProducer.INPUT_TYPE_VARIATION.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f152326x2f9e93c7[NumberProducer.OPTION_LIST_COUNT.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
        }
    }

    /* renamed from: com.google.autofill.detection.ml.NumericalDataProducer$NumberProducer */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum NumberProducer {
        INPUT_TYPE_CLASS(0),
        INPUT_TYPE_VARIATION(1),
        INPUT_TYPE_FLAGS(2),
        AUTOFILL_TYPE(3),
        NUMBER_OF_INPUT_SIBLINGS(4),
        TOTAL_NUMBER_OF_INPUT_NODES(5),
        WIDTH(6),
        HEIGHT(7),
        OPTION_LIST_COUNT(8);
        
        private final int key;

        private NumberProducer(int i) {
            this.key = i;
        }

        static NumberProducer fromKey(int i) {
            NumberProducer[] values = values();
            for (NumberProducer numberProducer : values) {
                if (numberProducer.key == i) {
                    return numberProducer;
                }
            }
            StringBuilder sb = new StringBuilder(49);
            sb.append("Unknown NumberProducer key specified: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public int getKey() {
            return this.key;
        }
    }

    public NumericalDataProducer(NumberProducer numberProducer2) {
        this.numberProducer = numberProducer2;
    }

    public OptionalDouble produce(kom kom) {
        NumberProducer numberProducer2 = NumberProducer.INPUT_TYPE_CLASS;
        switch (this.numberProducer.ordinal()) {
            case 0:
                if (kom.f24623v == null) {
                    return OptionalDouble.of((double) (kom.f24604c & 15));
                }
                return OptionalDouble.empty();
            case 1:
                if (kom.f24623v == null) {
                    return OptionalDouble.of((double) ((kom.f24604c & TYPE_MASK_VARIATION) >>> 4));
                }
                return OptionalDouble.empty();
            case 2:
                if (kom.f24623v == null) {
                    return OptionalDouble.of((double) ((kom.f24604c >>> 12) & 4095));
                }
                return OptionalDouble.empty();
            case 3:
                return OptionalDouble.of((double) kom.f24607f);
            case 4:
                if (!kom.f24625x.mo66813a()) {
                    return OptionalDouble.empty();
                }
                return OptionalDouble.of((double) (kom.f24625x.mo66813a() ? ((kom) kom.f24625x.mo66814b()).f24626y.stream().filter(new kon(kom)).count() : 0));
            case 5:
                break;
            case 6:
                return OptionalDouble.of((double) kom.f24615n);
            case 7:
                return OptionalDouble.of((double) kom.f24614m);
            case 8:
                CharSequence[] charSequenceArr = kom.f24608g;
                return charSequenceArr != null ? OptionalDouble.of((double) charSequenceArr.length) : OptionalDouble.empty();
            default:
                return OptionalDouble.empty();
        }
        while (kom.f24625x.mo66813a()) {
            kom = (kom) kom.f24625x.mo66814b();
        }
        return OptionalDouble.of((double) kom.mo14754a());
    }

    public String toString() {
        String name = this.numberProducer.name();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 43);
        sb.append("NumericalDataProducer [ numberProducer = ");
        sb.append(name);
        sb.append(" ]");
        return sb.toString();
    }

    public void writeToBundle(bllt bllt) {
        bllt.mo66667a(1);
        bllt.mo66667a(this.numberProducer.getKey());
    }
}
