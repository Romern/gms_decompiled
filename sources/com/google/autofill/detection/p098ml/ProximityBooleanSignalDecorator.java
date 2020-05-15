package com.google.autofill.detection.p098ml;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

/* renamed from: com.google.autofill.detection.ml.ProximityBooleanSignalDecorator */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ProximityBooleanSignalDecorator implements Signal {
    private static final int CURRENT_VERSION_CODE = 1;
    public static final bllu READER = new bllu() {
        /* class com.google.autofill.detection.p098ml.ProximityBooleanSignalDecorator.C16961 */

        private ProximityBooleanSignalDecorator readFromBundleV1(bllt bllt) {
            return new ProximityBooleanSignalDecorator((BooleanSignal) bllt.mo66677g(), bllt.mo66673c(), bllt.mo66672b());
        }

        public ProximityBooleanSignalDecorator readFromBundle(bllt bllt) {
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
    private final Set cachedFalseValues = bnpf.m110056b();
    private final Map cachedSearchedRadii = new ConcurrentHashMap();
    private final Set cachedTrueValues = bnpf.m110056b();
    final BooleanSignal delegate;
    final boolean onlyConsiderAncestors;
    final int pathDistanceThreshold;
    private final RuntimeConfiguration runtimeConfiguration;
    private final boolean useFasterGenerate;

    /* renamed from: com.google.autofill.detection.ml.ProximityBooleanSignalDecorator$2 */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    /* synthetic */ class C16972 {

        /* renamed from: $SwitchMap$com$google$autofill$detection$ml$ProximityBooleanSignalDecorator$DirectionalNode$Direction */
        static final /* synthetic */ int[] f152327xbb2b5311;

        static {
            int[] iArr = new int[DirectionalNode.Direction.values().length];
            f152327xbb2b5311 = iArr;
            try {
                iArr[DirectionalNode.Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f152327xbb2b5311[DirectionalNode.Direction.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f152327xbb2b5311[DirectionalNode.Direction.BELOW.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f152327xbb2b5311[DirectionalNode.Direction.ABOVE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f152327xbb2b5311[DirectionalNode.Direction.ORIGINATING.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    /* renamed from: com.google.autofill.detection.ml.ProximityBooleanSignalDecorator$DirectionalNode */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    final class DirectionalNode {
        final Direction direction;
        final kom node;
        final int originalChildIndex;

        /* renamed from: com.google.autofill.detection.ml.ProximityBooleanSignalDecorator$DirectionalNode$Direction */
        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        enum Direction {
            LEFT,
            RIGHT,
            ABOVE,
            BELOW,
            ORIGINATING
        }

        public DirectionalNode(kom kom, Direction direction2) {
            this.node = kom;
            this.direction = direction2;
            this.originalChildIndex = -1;
        }

        public DirectionalNode(kom kom, Direction direction2, int i) {
            this.node = kom;
            this.direction = direction2;
            this.originalChildIndex = i;
        }
    }

    public ProximityBooleanSignalDecorator(BooleanSignal booleanSignal, int i, boolean z) {
        RuntimeConfiguration snapshot = RuntimeConfiguration.getSnapshot();
        this.runtimeConfiguration = snapshot;
        this.useFasterGenerate = snapshot.isMoreEfficientProximityDecoratorGenerateEnabled();
        this.delegate = booleanSignal;
        this.pathDistanceThreshold = i;
        this.onlyConsiderAncestors = z;
    }

    private void commitSearchedRadii(ArrayList arrayList, int i) {
        int i2 = i - 1;
        for (int i3 = 0; i3 < i; i3++) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i3);
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                commitSearchedRadius(((DirectionalNode) arrayList2.get(i4)).node, i2);
            }
            i2--;
        }
    }

    private void commitSearchedRadius(kom kom, int i) {
        Integer num = (Integer) this.cachedSearchedRadii.get(kom);
        if (num == null || i > num.intValue()) {
            this.cachedSearchedRadii.put(kom, Integer.valueOf(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013e A[SYNTHETIC] */
    private double fasterGenerate(kom kom) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        DirectionalNode directionalNode;
        kom kom2;
        kom kom3;
        ArrayList arrayList3 = new ArrayList(this.pathDistanceThreshold);
        boolean z = true;
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(new DirectionalNode(kom, DirectionalNode.Direction.ORIGINATING));
        arrayList3.add(arrayList4);
        int i = this.pathDistanceThreshold - 1;
        int i2 = 0;
        loop0:
        while (true) {
            int i3 = this.pathDistanceThreshold;
            if (i2 < i3) {
                arrayList = (ArrayList) arrayList3.get(i2);
                if (i2 < i) {
                    arrayList2 = new ArrayList();
                } else {
                    arrayList2 = null;
                }
                size = arrayList.size() - 1;
                while (size >= 0) {
                    directionalNode = (DirectionalNode) arrayList.get(size);
                    kom2 = directionalNode.node;
                    Integer num = (Integer) this.cachedSearchedRadii.get(kom2);
                    if (num != null) {
                        if (num.intValue() == -1) {
                            break loop0;
                        }
                        if (num.intValue() + i2 >= i) {
                            size--;
                        }
                        if (arrayList2 == null) {
                            if ((directionalNode.direction == DirectionalNode.Direction.ABOVE || directionalNode.direction == DirectionalNode.Direction.ORIGINATING) && (kom3 = (kom) kom2.f24625x.mo66815c()) != null) {
                                arrayList2.add(new DirectionalNode(kom3, DirectionalNode.Direction.ABOVE, kom3.f24626y.indexOf(kom2)));
                            }
                            if (!this.onlyConsiderAncestors) {
                                bngx bngx = kom2.f24626y;
                                int ordinal = directionalNode.direction.ordinal();
                                if (!(ordinal == 0 || ordinal == 1)) {
                                    if (ordinal == 2) {
                                        int i4 = directionalNode.originalChildIndex;
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            arrayList2.add(new DirectionalNode((kom) bngx.get(i5), DirectionalNode.Direction.LEFT));
                                        }
                                        while (true) {
                                            i4++;
                                            if (i4 >= bngx.size()) {
                                                break;
                                            }
                                            arrayList2.add(new DirectionalNode((kom) bngx.get(i4), DirectionalNode.Direction.RIGHT));
                                        }
                                    } else if (ordinal != 3) {
                                        if (ordinal == 4) {
                                            for (int i6 = 0; i6 < bngx.size(); i6++) {
                                                arrayList2.add(new DirectionalNode((kom) bngx.get(i6), DirectionalNode.Direction.BELOW));
                                            }
                                        }
                                    }
                                }
                                for (int i7 = 0; i7 < bngx.size(); i7++) {
                                    arrayList2.add(new DirectionalNode((kom) bngx.get(i7), directionalNode.direction));
                                }
                            }
                        }
                        size--;
                    } else {
                        if (this.delegate.generateBoolean(kom2)) {
                            break loop0;
                        }
                        if (arrayList2 == null) {
                        }
                        size--;
                    }
                }
                arrayList3.add(arrayList2);
                i2++;
            } else {
                commitSearchedRadii(arrayList3, i3);
                return 0.0d;
            }
        }
        commitSearchedRadii(arrayList3, i2);
        for (int size2 = arrayList.size() - 1; size2 > size; size2--) {
            commitSearchedRadius(((DirectionalNode) arrayList.get(size2)).node, 0);
        }
        commitSearchedRadius(kom2, -1);
        int i8 = this.pathDistanceThreshold;
        if (!(directionalNode.direction == DirectionalNode.Direction.LEFT || directionalNode.direction == DirectionalNode.Direction.BELOW)) {
            z = false;
        }
        return internalGenerateScaledValue(i2, i8, z);
    }

    private boolean getResultFromDelegateSignal(kom kom) {
        if (!this.runtimeConfiguration.isProximityDecoratorCachingAllowed()) {
            return this.delegate.generateBoolean(kom);
        }
        if (this.cachedFalseValues.contains(kom)) {
            return false;
        }
        if (this.cachedTrueValues.contains(kom)) {
            return true;
        }
        boolean generateBoolean = this.delegate.generateBoolean(kom);
        if (generateBoolean) {
            this.cachedTrueValues.add(kom);
        } else {
            this.cachedFalseValues.add(kom);
        }
        return generateBoolean;
    }

    static double internalGenerateScaledValue(int i, int i2) {
        return internalGenerateScaledValue(i, i2, false);
    }

    static double internalGenerateScaledValue(int i, int i2, boolean z) {
        double d = 0.0d;
        if (i == 0) {
            d = 1.0d;
        } else if (i < i2) {
            double d2 = (double) (i + 1);
            Double.isNaN(d2);
            d = 0.0d + (1.0d / d2);
        }
        return z ? -d : d;
    }

    static final /* synthetic */ DirectionalNode lambda$generate$0$ProximityBooleanSignalDecorator(DirectionalNode directionalNode, kom kom) {
        return new DirectionalNode(kom, directionalNode.direction);
    }

    public double generate(kom kom) {
        if (this.useFasterGenerate) {
            return fasterGenerate(kom);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        HashSet hashSet = new HashSet();
        arrayDeque.push(new DirectionalNode(kom, DirectionalNode.Direction.ABOVE));
        boolean z = false;
        int i = 0;
        while (true) {
            if (arrayDeque.isEmpty() && arrayDeque2.isEmpty()) {
                return 0.0d;
            }
            if (!arrayDeque.isEmpty()) {
                DirectionalNode directionalNode = (DirectionalNode) arrayDeque.pop();
                kom kom2 = directionalNode.node;
                hashSet.add(kom2);
                if (!getResultFromDelegateSignal(kom2)) {
                    kom kom3 = (kom) kom2.f24625x.mo66815c();
                    if (kom3 != null && !hashSet.contains(kom3)) {
                        arrayDeque2.push(new DirectionalNode(kom3, DirectionalNode.Direction.ABOVE));
                    }
                    if (!this.onlyConsiderAncestors) {
                        if (directionalNode.direction == DirectionalNode.Direction.ABOVE) {
                            bnre i2 = kom2.f24626y.listIterator();
                            boolean z2 = false;
                            while (i2.hasNext()) {
                                kom kom4 = (kom) i2.next();
                                if (hashSet.contains(kom4)) {
                                    z2 = true;
                                } else if (!z2) {
                                    arrayDeque2.push(new DirectionalNode(kom4, DirectionalNode.Direction.LEFT));
                                } else {
                                    arrayDeque2.push(new DirectionalNode(kom4, DirectionalNode.Direction.RIGHT));
                                }
                            }
                        } else if (!this.runtimeConfiguration.isProximityDecoratorStreamingDisabled()) {
                            Stream map = kom2.f24626y.stream().map(new ProximityBooleanSignalDecorator$$Lambda$0(directionalNode));
                            arrayDeque2.getClass();
                            map.forEachOrdered(ProximityBooleanSignalDecorator$$Lambda$1.get$Lambda(arrayDeque2));
                        } else {
                            bnre i3 = kom2.f24626y.listIterator();
                            while (i3.hasNext()) {
                                arrayDeque2.push(new DirectionalNode((kom) i3.next(), directionalNode.direction));
                            }
                        }
                    }
                } else {
                    int i4 = this.pathDistanceThreshold;
                    if (directionalNode.direction == DirectionalNode.Direction.LEFT) {
                        z = true;
                    }
                    return internalGenerateScaledValue(i, i4, z);
                }
            } else {
                i++;
                if (i >= this.pathDistanceThreshold) {
                    return 0.0d;
                }
                if (!this.runtimeConfiguration.isProximityDecoratorLevelSwappingAllowed()) {
                    arrayDeque.addAll(arrayDeque2);
                    arrayDeque2.clear();
                } else {
                    arrayDeque2 = arrayDeque;
                    arrayDeque = arrayDeque2;
                }
            }
        }
    }

    public void reset() {
        this.delegate.reset();
        this.cachedFalseValues.clear();
        this.cachedTrueValues.clear();
        this.cachedSearchedRadii.clear();
    }

    public String toString() {
        String valueOf = String.valueOf(this.delegate);
        boolean z = this.onlyConsiderAncestors;
        int i = this.pathDistanceThreshold;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 96);
        sb.append("ProximityDecorator(delegate: ");
        sb.append(valueOf);
        sb.append(", onlyConsiderAncestors: ");
        sb.append(z);
        sb.append(", pathDistanceThreshold: ");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public void writeToBundle(bllt bllt) {
        bllt.mo66667a(1);
        bllt.mo66668a(this.delegate);
        bllt.mo66667a(this.pathDistanceThreshold);
        bllt.mo66670a(this.onlyConsiderAncestors);
    }
}
