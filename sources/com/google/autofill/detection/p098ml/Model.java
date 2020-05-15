package com.google.autofill.detection.p098ml;

import com.google.autofill.detection.p098ml.ModelConfig;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* renamed from: com.google.autofill.detection.ml.Model */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Model {
    private final ModelConfig.FieldConfig fieldConfig;
    private final boolean isLiteModel;
    private final NeuralNetwork neuralNetwork;
    private final boolean randomizeSignalOrder;
    private final RuntimeConfiguration runtimeConfiguration;
    private final ModelConfig.SignalConfig signalConfig;

    /* renamed from: com.google.autofill.detection.ml.Model$Result */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Result {
        private final bngx orderedFieldPredictions;

        /* renamed from: com.google.autofill.detection.ml.Model$Result$FieldPrediction */
        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public abstract class FieldPrediction {
            /* renamed from: of */
            public static FieldPrediction m118860of(kpb kpb, float f) {
                return new AutoValue_Model_Result_FieldPrediction(kpb, f);
            }

            public abstract float getConfidence();

            public abstract kpb getType();
        }

        public Result(List list) {
            this.orderedFieldPredictions = bngx.m109368a((Collection) list.stream().sorted(Comparator.comparingDouble(Model$Result$$Lambda$0.$instance).reversed()).collect(Collectors.toList()));
        }

        public bngx getFieldPredictions() {
            return this.orderedFieldPredictions;
        }

        public bngx getFieldPredictionsAbove(float f) {
            bngs j = bngx.m109377j();
            bnre i = this.orderedFieldPredictions.listIterator();
            while (i.hasNext()) {
                FieldPrediction fieldPrediction = (FieldPrediction) i.next();
                if (fieldPrediction.getConfidence() < f) {
                    break;
                }
                j.mo67668c(fieldPrediction);
            }
            return j.mo67664a();
        }
    }

    public Model(ModelConfig modelConfig, NeuralNetwork neuralNetwork2) {
        this(modelConfig, neuralNetwork2, true);
    }

    private static void assertCompatible(ModelConfig modelConfig, NeuralNetwork neuralNetwork2) {
        Layer layer = (Layer) bnjd.m109595d(neuralNetwork2.getLayers());
        if (modelConfig.getSignalConfig().getSignals().size() != ((Layer) neuralNetwork2.getLayers().get(0)).inputSize() || layer.outputSize() != modelConfig.getFieldConfig().numberOfSupportedTypes()) {
            throw new IllegalArgumentException("Model config is not compatible with neural network.");
        }
    }

    private Result buildResult(Matrix matrix) {
        return new Result((List) IntStream.range(0, matrix.cols()).mapToObj(new Model$$Lambda$0(this, matrix)).collect(Collectors.toList()));
    }

    @Deprecated
    public static Model obsoleteCreate(ModelConfig modelConfig, NeuralNetwork neuralNetwork2) {
        return new Model(modelConfig, neuralNetwork2, false);
    }

    public ModelConfig.FieldConfig getFieldConfig() {
        return this.fieldConfig;
    }

    public NeuralNetwork getNeuralNetwork() {
        return this.neuralNetwork;
    }

    public ModelConfig.SignalConfig getSignalConfig() {
        return this.signalConfig;
    }

    public boolean isLiteModel() {
        return this.isLiteModel;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Result.FieldPrediction lambda$buildResult$0$Model(Matrix matrix, int i) {
        return Result.FieldPrediction.m118860of(this.fieldConfig.getTypeAtIndex(i), matrix.get(0, i));
    }

    public Result predict(kom kom) {
        try {
            bngx signals = this.signalConfig.getSignals();
            ArrayMatrix arrayMatrix = new ArrayMatrix(1, signals.size());
            if (this.randomizeSignalOrder) {
                int nextInt = new Random().nextInt(signals.size());
                for (int i = 0; i < signals.size(); i++) {
                    int size = (i + nextInt) % signals.size();
                    arrayMatrix.set(0, size, (float) ((Signal) signals.get(size)).generate(kom));
                }
            } else {
                for (int i2 = 0; i2 < signals.size(); i2++) {
                    arrayMatrix.set(0, i2, (float) ((Signal) signals.get(i2)).generate(kom));
                }
            }
            return buildResult(this.neuralNetwork.execute(arrayMatrix));
        } catch (ExecutionException e) {
            throw e;
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }

    public void reset() {
        bnre i = this.signalConfig.getSignals().listIterator();
        while (i.hasNext()) {
            ((Signal) i.next()).reset();
        }
    }

    private Model(ModelConfig modelConfig, NeuralNetwork neuralNetwork2, boolean z) {
        RuntimeConfiguration snapshot = RuntimeConfiguration.getSnapshot();
        this.runtimeConfiguration = snapshot;
        this.randomizeSignalOrder = snapshot.shouldRandomizeSignalOrder();
        if (z) {
            assertCompatible(modelConfig, neuralNetwork2);
        }
        this.signalConfig = modelConfig.getSignalConfig();
        this.fieldConfig = modelConfig.getFieldConfig();
        this.neuralNetwork = neuralNetwork2;
        this.isLiteModel = modelConfig.isLiteModel();
    }
}
