package p000;

import android.content.Context;
import android.os.Process;
import com.felicanetworks.mfc.BuildConfig;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: andm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class andm {

    /* renamed from: a */
    public final sfr f76699a;

    static {
        new HashSet(Arrays.asList("generic", "generic_x86", BuildConfig.FLAVOR_client, "Android"));
        new HashSet(Arrays.asList("generic", "generic_x86", "Android"));
    }

    public andm(Context context) {
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = context.getPackageName();
        clientContext.f30212b = Process.myUid();
        this.f76699a = sfr.m35174a(context, clientContext);
    }
}
