package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.google.autofill.detection.p098ml.ModelConfig;
import com.google.autofill.detection.p098ml.NeuralNetwork;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: kye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kye implements kyo {

    /* renamed from: a */
    private static final srn f25399a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    private final Context f25400b;

    /* renamed from: c */
    private final Object f25401c = new Object();

    /* renamed from: d */
    private MappedByteBuffer f25402d = null;

    /* renamed from: e */
    private WeakReference f25403e = null;

    public kye(Context context) {
        this.f25400b = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.autofill.detection.ml.ModelConfig.parseFrom(java.io.InputStream, boolean):com.google.autofill.detection.ml.ModelConfig
     arg types: [java.io.InputStream, int]
     candidates:
      com.google.autofill.detection.ml.ModelConfig.parseFrom(byte[], boolean):com.google.autofill.detection.ml.ModelConfig
      com.google.autofill.detection.ml.ModelConfig.parseFrom(java.io.InputStream, boolean):com.google.autofill.detection.ml.ModelConfig */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = r5.f25400b.getAssets().open("model_lite/model_config.bundle");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1 = com.google.autofill.detection.p098ml.ModelConfig.parseFrom(r0, true);
        r2 = r5.f25401c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.f25403e = new java.lang.ref.WeakReference(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        if (r0 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003e, code lost:
        if (r0 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        p000.bqye.m113761a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0048, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x004e, code lost:
        r1 = (p000.bnsl) p000.kye.f25399a.mo68387b();
        r1.mo68437a(r0);
        r1.mo68432a("kye", "c", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r1.mo68405a("Could not load model lite config");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006a, code lost:
        return null;
     */
    /* renamed from: c */
    private final ModelConfig m18774c() {
        synchronized (this.f25401c) {
            WeakReference weakReference = this.f25403e;
            if (weakReference != null && weakReference.get() != null) {
                ModelConfig modelConfig = (ModelConfig) this.f25403e.get();
                return modelConfig;
            }
        }
    }

    /* renamed from: d */
    private final NeuralNetwork m18775d() {
        synchronized (this.f25401c) {
            MappedByteBuffer mappedByteBuffer = this.f25402d;
            if (mappedByteBuffer != null) {
                NeuralNetwork createFromFlatBuffer = NeuralNetwork.createFromFlatBuffer(mappedByteBuffer);
                return createFromFlatBuffer;
            }
            try {
                AssetFileDescriptor openFd = this.f25400b.getAssets().openFd("model_lite/model.fb_bin.jpeg");
                MappedByteBuffer map = new FileInputStream(openFd.getFileDescriptor()).getChannel().map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getDeclaredLength());
                synchronized (this.f25401c) {
                    this.f25402d = map;
                }
                return NeuralNetwork.createFromFlatBuffer(map);
            } catch (IOException | RuntimeException e) {
                bnsl bnsl = (bnsl) f25399a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("kye", "d", 86, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Could not load model lite neural network");
                return null;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.autofill.detection.ml.ModelConfig.parseFrom(java.io.InputStream, boolean):com.google.autofill.detection.ml.ModelConfig
     arg types: [java.io.InputStream, int]
     candidates:
      com.google.autofill.detection.ml.ModelConfig.parseFrom(byte[], boolean):com.google.autofill.detection.ml.ModelConfig
      com.google.autofill.detection.ml.ModelConfig.parseFrom(java.io.InputStream, boolean):com.google.autofill.detection.ml.ModelConfig */
    /* renamed from: a */
    public final kyn mo14939a() {
        NeuralNetwork neuralNetwork;
        ModelConfig modelConfig;
        synchronized (this.f25401c) {
            WeakReference weakReference = this.f25403e;
            neuralNetwork = null;
            if (weakReference == null || weakReference.get() == null) {
                try {
                    InputStream open = this.f25400b.getAssets().open("model_lite/model_config.bundle");
                    try {
                        modelConfig = ModelConfig.parseFrom(open, true);
                        synchronized (this.f25401c) {
                            this.f25403e = new WeakReference(modelConfig);
                        }
                        if (open != null) {
                            open.close();
                        }
                    } catch (Throwable th) {
                        if (open != null) {
                            open.close();
                        }
                        throw th;
                    }
                } catch (blma | IOException | RuntimeException e) {
                    bnsl bnsl = (bnsl) f25399a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("kye", "c", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Could not load model lite config");
                    modelConfig = null;
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            } else {
                modelConfig = (ModelConfig) this.f25403e.get();
            }
        }
        synchronized (this.f25401c) {
            MappedByteBuffer mappedByteBuffer = this.f25402d;
            if (mappedByteBuffer != null) {
                neuralNetwork = NeuralNetwork.createFromFlatBuffer(mappedByteBuffer);
            } else {
                try {
                    AssetFileDescriptor openFd = this.f25400b.getAssets().openFd("model_lite/model.fb_bin.jpeg");
                    MappedByteBuffer map = new FileInputStream(openFd.getFileDescriptor()).getChannel().map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getDeclaredLength());
                    synchronized (this.f25401c) {
                        this.f25402d = map;
                    }
                    neuralNetwork = NeuralNetwork.createFromFlatBuffer(map);
                } catch (IOException | RuntimeException e2) {
                    bnsl bnsl2 = (bnsl) f25399a.mo68387b();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68432a("kye", "d", 86, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Could not load model lite neural network");
                }
            }
        }
        return kyn.m18798a(modelConfig, neuralNetwork);
    }

    /* renamed from: b */
    public final void mo14940b() {
        synchronized (this.f25401c) {
            this.f25402d = null;
            this.f25403e = null;
        }
    }
}
