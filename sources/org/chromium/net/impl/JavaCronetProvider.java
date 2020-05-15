package org.chromium.net.impl;

import android.content.Context;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class JavaCronetProvider extends CronetProvider {
    public JavaCronetProvider(Context context) {
        super(context);
    }

    public final CronetEngine.Builder createBuilder() {
        return new ExperimentalCronetEngine.Builder(new cirp(this.mContext));
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof JavaCronetProvider) && this.mContext.equals(((JavaCronetProvider) obj).mContext))) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return CronetProvider.PROVIDER_NAME_FALLBACK;
    }

    public final String getVersion() {
        return "83.0.4099.5";
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{JavaCronetProvider.class, this.mContext});
    }

    public final boolean isEnabled() {
        return true;
    }
}
