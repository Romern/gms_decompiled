package p000;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: sgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sgt extends ContextWrapper {
    public sgt(Context context) {
        super(context);
    }

    public final Context createCredentialProtectedStorageContext() {
        return new sgt(super.createCredentialProtectedStorageContext());
    }

    public final Context createDeviceProtectedStorageContext() {
        return new sgt(super.createDeviceProtectedStorageContext());
    }

    public final Context getApplicationContext() {
        return this;
    }
}
