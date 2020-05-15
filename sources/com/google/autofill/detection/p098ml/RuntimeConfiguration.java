package com.google.autofill.detection.p098ml;

/* renamed from: com.google.autofill.detection.ml.RuntimeConfiguration */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RuntimeConfiguration {
    private static boolean staticAllowProximityDecoratorCaching = false;
    private static boolean staticAllowProximityDecoratorLevelSwapping = false;
    private static boolean staticAllowRegexCountingSignalEarlyQuitting = false;
    private static boolean staticDisableProximityDecoratorStreaming = false;
    private static boolean staticEnableMoreEfficientProximityDecoratorGenerate = false;
    private static boolean staticOptimizeRegexBuilderProducers = false;
    private static boolean staticRandomizeModelSignalOrder = false;
    private final boolean allowProximityDecoratorCaching = staticAllowProximityDecoratorCaching;
    private final boolean allowProximityDecoratorLevelSwapping = staticAllowProximityDecoratorLevelSwapping;
    private final boolean allowRegexCountingSignalEarlyQuitting = staticAllowRegexCountingSignalEarlyQuitting;
    private final boolean disableProximityDecoratorStreaming = staticDisableProximityDecoratorStreaming;
    private final boolean enableMoreEfficientProximityDecoratorGenerate = staticEnableMoreEfficientProximityDecoratorGenerate;
    private final boolean optimizeRegexBuilderProducers = staticOptimizeRegexBuilderProducers;
    private final boolean randomizeModelSignalOrder = staticRandomizeModelSignalOrder;

    private RuntimeConfiguration() {
    }

    public static RuntimeConfiguration getSnapshot() {
        return new RuntimeConfiguration();
    }

    public static void setAllowProximityDecoratorCaching(boolean z) {
        staticAllowProximityDecoratorCaching = z;
    }

    public static void setAllowProximityDecoratorLevelSwapping(boolean z) {
        staticAllowProximityDecoratorLevelSwapping = z;
    }

    public static void setAllowRegexCountingSignalEarlyQuitting(boolean z) {
        staticAllowRegexCountingSignalEarlyQuitting = z;
    }

    public static void setDisableProximityDecoratorStreaming(boolean z) {
        staticDisableProximityDecoratorStreaming = z;
    }

    public static void setEnableMoreEfficientProximityDecoratorGenerate(boolean z) {
        staticEnableMoreEfficientProximityDecoratorGenerate = z;
    }

    public static void setOptimizeRegexBuilderProducers(boolean z) {
        staticOptimizeRegexBuilderProducers = z;
    }

    public static void setRandomizeModelSignalOrder(boolean z) {
        staticRandomizeModelSignalOrder = z;
    }

    public boolean isMoreEfficientProximityDecoratorGenerateEnabled() {
        return this.enableMoreEfficientProximityDecoratorGenerate;
    }

    public boolean isProximityDecoratorCachingAllowed() {
        return this.allowProximityDecoratorCaching;
    }

    public boolean isProximityDecoratorLevelSwappingAllowed() {
        return this.allowProximityDecoratorLevelSwapping;
    }

    public boolean isProximityDecoratorStreamingDisabled() {
        return this.disableProximityDecoratorStreaming;
    }

    public boolean isRegexBuilderProducerOptimizationEnabled() {
        return this.optimizeRegexBuilderProducers;
    }

    public boolean isRegexCountingSignalEarlyQuittingEnabled() {
        return this.allowRegexCountingSignalEarlyQuitting;
    }

    public boolean shouldRandomizeSignalOrder() {
        return this.randomizeModelSignalOrder;
    }
}
