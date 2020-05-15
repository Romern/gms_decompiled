package p000;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ago */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ago extends C1127kc implements C0013ak, C0062bt, ape, agt {

    /* renamed from: a */
    private final C0015am f509a = new C0015am(this);

    /* renamed from: b */
    private final apd f510b = apd.m1789a(this);

    /* renamed from: c */
    private C0061bs f511c;

    /* renamed from: d */
    private final agw f512d;

    /* renamed from: j */
    public final ags f513j = new ags(new agk(this));

    public ago() {
        new AtomicInteger();
        this.f512d = new agw();
        if (this.f509a != null) {
            int i = Build.VERSION.SDK_INT;
            this.f509a.mo557a(new agl(this));
            this.f509a.mo557a(new agm(this));
            int i2 = Build.VERSION.SDK_INT;
            int i3 = Build.VERSION.SDK_INT;
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C0063bu.m3626a(getWindow().getDecorView(), this);
        super.addContentView(view, layoutParams);
    }

    @Deprecated
    /* renamed from: g */
    public Object mo671g() {
        return null;
    }

    public final C0008af getLifecycle() {
        return this.f509a;
    }

    public final apc getSavedStateRegistry() {
        return this.f510b.f1922a;
    }

    public final C0061bs getViewModelStore() {
        if (getApplication() != null) {
            if (this.f511c == null) {
                agn agn = (agn) getLastNonConfigurationInstance();
                if (agn != null) {
                    this.f511c = agn.f508b;
                }
                if (this.f511c == null) {
                    this.f511c = new C0061bs();
                }
            }
            return this.f511c;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f512d.mo689a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.f513j.mo686a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f510b.mo2255a(bundle);
        agw agw = this.f512d;
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (!(stringArrayList == null || integerArrayList == null)) {
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    int intValue = integerArrayList.get(i).intValue();
                    String str = stringArrayList.get(i);
                    Map map = agw.f526b;
                    Integer valueOf = Integer.valueOf(intValue);
                    map.put(valueOf, str);
                    agw.f527c.put(str, valueOf);
                }
                agw.f525a.set(size);
                agw.f528d.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            }
        }
        C0046be.m2751a(this);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.f512d.mo689a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            int i2 = Build.VERSION.SDK_INT;
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        agn agn;
        Object g = mo671g();
        C0061bs bsVar = this.f511c;
        if (bsVar == null && (agn = (agn) getLastNonConfigurationInstance()) != null) {
            bsVar = agn.f508b;
        }
        if (bsVar == null && g == null) {
            return null;
        }
        agn agn2 = new agn();
        agn2.f507a = g;
        agn2.f508b = bsVar;
        return agn2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C0015am amVar = this.f509a;
        if (amVar instanceof C0015am) {
            amVar.mo1024a(C0007ae.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f510b.mo2256b(bundle);
        agw agw = this.f512d;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(agw.f526b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(agw.f526b.values()));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", agw.f528d);
    }

    public void setContentView(int i) {
        C0063bu.m3626a(getWindow().getDecorView(), this);
        super.setContentView(i);
    }

    public void setContentView(View view) {
        C0063bu.m3626a(getWindow().getDecorView(), this);
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C0063bu.m3626a(getWindow().getDecorView(), this);
        super.setContentView(view, layoutParams);
    }
}
