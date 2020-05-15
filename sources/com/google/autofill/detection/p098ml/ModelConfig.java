package com.google.autofill.detection.p098ml;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.zip.Deflater;

/* renamed from: com.google.autofill.detection.ml.ModelConfig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ModelConfig {
    private final FieldConfig fieldConfig;
    private final boolean isLiteModel;
    private final SignalConfig signalConfig;

    public ModelConfig(SignalConfig signalConfig2, FieldConfig fieldConfig2) {
        this(signalConfig2, fieldConfig2, false);
    }

    public static ModelConfig parseFrom(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ModelConfig parseFrom = parseFrom(fileInputStream);
            fileInputStream.close();
            return parseFrom;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public FieldConfig getFieldConfig() {
        return this.fieldConfig;
    }

    public SignalConfig getSignalConfig() {
        return this.signalConfig;
    }

    public boolean isLiteModel() {
        return this.isLiteModel;
    }

    public void writeTo(File file, boolean z) {
        if (!file.createNewFile() && !z) {
            throw new FileAlreadyExistsException(file.toString());
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            writeTo(fileOutputStream);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: com.google.autofill.detection.ml.ModelConfig$SignalConfig */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SignalConfig implements bllv {
        private static final int CURRENT_VERSION_CODE = 1;
        public static final bllu READER = new bllu() {
            /* class com.google.autofill.detection.p098ml.ModelConfig.SignalConfig.C16911 */

            private SignalConfig readFromBundleV1(bllt bllt) {
                int c = bllt.mo66673c();
                bngs b = bngx.m109371b(c);
                for (int i = 0; i < c; i++) {
                    b.mo67668c((Signal) bllt.mo66677g());
                }
                return new SignalConfig(b.mo67664a());
            }

            public SignalConfig readFromBundle(bllt bllt) {
                int c = bllt.mo66673c();
                if (c == 1) {
                    return readFromBundleV1(bllt);
                }
                StringBuilder sb = new StringBuilder(45);
                sb.append("Unable to read bundle of version: ");
                sb.append(c);
                throw new bllj(sb.toString());
            }
        };
        final bngx signals;

        public SignalConfig(List list) {
            if (!list.isEmpty()) {
                this.signals = bngx.m109368a((Collection) list);
                return;
            }
            throw new IllegalStateException("Signal config cannot be empty.");
        }

        public SignalConfig copyByPruningSignalsAtIndexes(Set set) {
            bngs j = bngx.m109377j();
            for (int i = 0; i < this.signals.size(); i++) {
                if (!set.contains(Integer.valueOf(i))) {
                    j.mo67668c((Signal) this.signals.get(i));
                }
            }
            return new SignalConfig(j.mo67664a());
        }

        public Signal getSignalAtIndex(int i) {
            return (Signal) this.signals.get(i);
        }

        public bngx getSignals() {
            return this.signals;
        }

        public void writeToBundle(bllt bllt) {
            bllt.mo66667a(1);
            bllt.mo66667a(this.signals.size());
            bnre i = this.signals.listIterator();
            while (i.hasNext()) {
                bllt.mo66668a((Signal) i.next());
            }
        }

        public SignalConfig(Signal... signalArr) {
            this(bngx.m109370a((Object[]) signalArr));
        }
    }

    public ModelConfig(SignalConfig signalConfig2, FieldConfig fieldConfig2, boolean z) {
        bmxy.m108581a(signalConfig2);
        this.signalConfig = signalConfig2;
        bmxy.m108581a(fieldConfig2);
        this.fieldConfig = fieldConfig2;
        this.isLiteModel = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.autofill.detection.ml.ModelConfig.parseFrom(java.io.InputStream, boolean):com.google.autofill.detection.ml.ModelConfig
     arg types: [java.io.InputStream, int]
     candidates:
      com.google.autofill.detection.ml.ModelConfig.parseFrom(byte[], boolean):com.google.autofill.detection.ml.ModelConfig
      com.google.autofill.detection.ml.ModelConfig.parseFrom(java.io.InputStream, boolean):com.google.autofill.detection.ml.ModelConfig */
    public static ModelConfig parseFrom(InputStream inputStream) {
        return parseFrom(inputStream, false);
    }

    /* renamed from: com.google.autofill.detection.ml.ModelConfig$FieldConfig */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class FieldConfig implements bllv {
        private static final int CURRENT_VERSION_CODE = 1;
        public static final bllu READER = new bllu() {
            /* class com.google.autofill.detection.p098ml.ModelConfig.FieldConfig.C16901 */

            private FieldConfig readFromBundleV1(bllt bllt) {
                int c = bllt.mo66673c();
                bngs b = bngx.m109371b(c);
                for (int i = 0; i < c; i++) {
                    b.mo67668c(kpb.m18276a(bllt.mo66673c()));
                }
                return new FieldConfig(b.mo67664a());
            }

            public FieldConfig readFromBundle(bllt bllt) {
                int c = bllt.mo66673c();
                if (c == 1) {
                    return readFromBundleV1(bllt);
                }
                StringBuilder sb = new StringBuilder(45);
                sb.append("Unable to read bundle of version: ");
                sb.append(c);
                throw new bllj(sb.toString());
            }
        };
        final bngj fieldIndexBiMap;

        public FieldConfig(List list) {
            if (!list.isEmpty()) {
                bngh b = bngj.m109310b();
                for (int i = 0; i < list.size(); i++) {
                    b.mo67617a((kpb) list.get(i), Integer.valueOf(i));
                }
                this.fieldIndexBiMap = b.mo67618b();
                return;
            }
            throw new IllegalStateException("Field config cannot be empty.");
        }

        public bnic getAllSupportedFieldTypes() {
            return this.fieldIndexBiMap.keySet();
        }

        public int getIndexForType(kpb kpb) {
            Integer num = (Integer) this.fieldIndexBiMap.get(kpb);
            if (num != null) {
                return num.intValue();
            }
            throw new IllegalArgumentException(String.valueOf(kpb.name()).concat(" is not a supported field type."));
        }

        public kpb getTypeAtIndex(int i) {
            bmxy.m108584a(i, numberOfSupportedTypes());
            return (kpb) this.fieldIndexBiMap.mo67620c().get(Integer.valueOf(i));
        }

        public boolean isSupportedType(kpb kpb) {
            return this.fieldIndexBiMap.containsKey(kpb);
        }

        public int numberOfSupportedTypes() {
            return this.fieldIndexBiMap.size();
        }

        public void writeToBundle(bllt bllt) {
            bllt.mo66667a(1);
            ArrayList arrayList = new ArrayList(this.fieldIndexBiMap.keySet());
            bngj bngj = this.fieldIndexBiMap;
            bngj.getClass();
            Collections.sort(arrayList, Comparator.comparingInt(ModelConfig$FieldConfig$$Lambda$0.get$Lambda(bngj)));
            bllt.mo66667a(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bllt.mo66667a(((kpb) arrayList.get(i)).mo3214a());
            }
        }

        public FieldConfig(kpb... kpbArr) {
            this(bngx.m109370a((Object[]) kpbArr));
        }
    }

    public static ModelConfig parseFrom(InputStream inputStream, boolean z) {
        return parseFrom(boav.m111020a(inputStream), z);
    }

    public void writeTo(OutputStream outputStream) {
        bllt a = bllt.m107329a();
        a.mo66671b(this.signalConfig);
        a.mo66671b(this.fieldConfig);
        bxvd da = bllz.f126829b.mo74144da();
        ArrayDeque arrayDeque = a.f126805a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bllz bllz = (bllz) da.f164949b;
        if (!bllz.f126831a.mo73666a()) {
            bllz.f126831a = bxvk.m124021a(bllz.f126831a);
        }
        bxsy.m123078a(arrayDeque, bllz.f126831a);
        byte[] k = ((bllz) da.mo74062i()).mo73642k();
        Deflater deflater = new Deflater();
        deflater.setInput(k);
        deflater.finish();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr, 0, deflater.deflate(bArr, 0, 1024, 2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        outputStream.write(ByteBuffer.allocate(length + 8).putInt(1).putInt(k.length).put(byteArray, 0, length).array());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.autofill.detection.ml.ModelConfig.parseFrom(byte[], boolean):com.google.autofill.detection.ml.ModelConfig
     arg types: [byte[], int]
     candidates:
      com.google.autofill.detection.ml.ModelConfig.parseFrom(java.io.InputStream, boolean):com.google.autofill.detection.ml.ModelConfig
      com.google.autofill.detection.ml.ModelConfig.parseFrom(byte[], boolean):com.google.autofill.detection.ml.ModelConfig */
    public static ModelConfig parseFrom(byte[] bArr) {
        return parseFrom(bArr, false);
    }

    public static ModelConfig parseFrom(byte[] bArr, boolean z) {
        bllt a = bllt.m107330a(bArr);
        return new ModelConfig((SignalConfig) a.mo66664a(SignalConfig.READER), (FieldConfig) a.mo66664a(FieldConfig.READER), z);
    }
}
