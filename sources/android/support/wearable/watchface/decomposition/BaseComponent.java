package android.support.wearable.watchface.decomposition;

import android.os.Bundle;
import android.support.wearable.watchface.decomposition.WatchFaceDecomposition;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class BaseComponent implements WatchFaceDecomposition.Component {

    /* renamed from: a */
    public final Bundle f1461a;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    abstract class BaseBuilder {
        public BaseBuilder() {
            new Bundle();
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    interface ComponentFactory {
    }

    public BaseComponent(Bundle bundle) {
        this.f1461a = bundle;
    }
}
