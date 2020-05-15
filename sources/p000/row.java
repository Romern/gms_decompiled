package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: row */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class row extends C1018gh implements rnx {

    /* renamed from: a */
    public static final WeakHashMap f43466a = new WeakHashMap();

    /* renamed from: Y */
    private final Map f43467Y = new C1223np();

    /* renamed from: b */
    public int f43468b = 0;

    /* renamed from: c */
    public Bundle f43469c;

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f43467Y.values()) {
            lifecycleCallback.mo17725a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        for (LifecycleCallback lifecycleCallback : this.f43467Y.values()) {
            lifecycleCallback.mo17723a(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f43468b = 1;
        this.f43469c = bundle;
        for (Map.Entry entry : this.f43467Y.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo17724a(bundle2);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f43468b = 5;
        for (LifecycleCallback lifecycleCallback : this.f43467Y.values()) {
        }
    }

    public final void onResume() {
        super.onResume();
        this.f43468b = 3;
        for (LifecycleCallback lifecycleCallback : this.f43467Y.values()) {
            lifecycleCallback.mo17728e();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        for (Map.Entry entry : this.f43467Y.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo17727b(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f43468b = 2;
        for (LifecycleCallback lifecycleCallback : this.f43467Y.values()) {
            lifecycleCallback.mo17722a();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f43468b = 4;
        for (LifecycleCallback lifecycleCallback : this.f43467Y.values()) {
            lifecycleCallback.mo17726b();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Activity mo24869a() {
        return getActivity();
    }

    /* renamed from: a */
    public final LifecycleCallback mo24870a(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f43467Y.get(str));
    }

    /* renamed from: a */
    public final void mo24871a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f43467Y.containsKey(str)) {
            this.f43467Y.put(str, lifecycleCallback);
            if (this.f43468b > 0) {
                new adzt(Looper.getMainLooper()).post(new rov(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }
}
