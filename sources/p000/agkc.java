package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.internal.InitializationParams;

/* renamed from: agkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agkc {

    /* renamed from: a */
    final Context f65767a;

    /* renamed from: b */
    String f65768b;

    /* renamed from: c */
    String f65769c;

    /* renamed from: d */
    String f65770d;

    /* renamed from: e */
    Boolean f65771e;

    /* renamed from: f */
    long f65772f;

    /* renamed from: g */
    InitializationParams f65773g;

    /* renamed from: h */
    boolean f65774h = true;

    public agkc(Context context, InitializationParams initializationParams) {
        sdo.m34959a(context);
        Context applicationContext = context.getApplicationContext();
        sdo.m34959a(applicationContext);
        this.f65767a = applicationContext;
        if (initializationParams != null) {
            this.f65773g = initializationParams;
            this.f65768b = initializationParams.f80096f;
            this.f65769c = initializationParams.f80095e;
            this.f65770d = initializationParams.f80094d;
            this.f65774h = initializationParams.f80093c;
            this.f65772f = initializationParams.f80092b;
            Bundle bundle = initializationParams.f80097g;
            if (bundle != null) {
                this.f65771e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
