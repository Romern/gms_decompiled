package p000;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: rnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface rnx {
    /* renamed from: a */
    Activity mo24869a();

    /* renamed from: a */
    LifecycleCallback mo24870a(String str, Class cls);

    /* renamed from: a */
    void mo24871a(String str, LifecycleCallback lifecycleCallback);

    void startActivityForResult(Intent intent, int i);
}
