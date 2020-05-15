package p000;

import android.content.ComponentName;

/* renamed from: akx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akx {

    /* renamed from: a */
    public final ComponentName f801a;

    public akx(ComponentName componentName) {
        this.f801a = componentName;
    }

    /* renamed from: a */
    public final String mo936a() {
        return this.f801a.getPackageName();
    }

    public final String toString() {
        return "ProviderMetadata{ componentName=" + this.f801a.flattenToShortString() + " }";
    }
}
