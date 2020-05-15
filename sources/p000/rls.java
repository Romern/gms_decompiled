package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: rls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rls extends Fragment implements rnx {

    /* renamed from: a */
    public static final WeakHashMap f43243a = new WeakHashMap();

    /* renamed from: b */
    public int f43244b = 0;

    /* renamed from: c */
    public Bundle f43245c;

    /* renamed from: d */
    private final Map f43246d = new C1223np();

    /* renamed from: a */
    public final Activity mo24869a() {
        return getActivity().getContainerActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f43246d.values()) {
            lifecycleCallback.mo17725a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f43246d.values()) {
            lifecycleCallback.mo17723a(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f43244b = 1;
        this.f43245c = bundle;
        for (Map.Entry entry : this.f43246d.entrySet()) {
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
        this.f43244b = 5;
        for (LifecycleCallback lifecycleCallback : this.f43246d.values()) {
        }
    }

    public final void onResume() {
        super.onResume();
        this.f43244b = 3;
        for (LifecycleCallback lifecycleCallback : this.f43246d.values()) {
            lifecycleCallback.mo17728e();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f43246d.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo17727b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f43244b = 2;
        for (LifecycleCallback lifecycleCallback : this.f43246d.values()) {
            lifecycleCallback.mo17722a();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f43244b = 4;
        for (LifecycleCallback lifecycleCallback : this.f43246d.values()) {
            lifecycleCallback.mo17726b();
        }
    }

    /* renamed from: a */
    public final LifecycleCallback mo24870a(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f43246d.get(str));
    }

    /* renamed from: a */
    public final void mo24871a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f43246d.containsKey(str)) {
            this.f43246d.put(str, lifecycleCallback);
            if (this.f43244b > 0) {
                new adzt(Looper.getMainLooper()).post(new rlr(this, lifecycleCallback, str));
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
