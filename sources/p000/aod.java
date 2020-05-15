package p000;

import androidx.preference.PreferenceGroup;

/* renamed from: aod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aod implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PreferenceGroup f1863a;

    public aod(PreferenceGroup preferenceGroup) {
        this.f1863a = preferenceGroup;
    }

    public final void run() {
        synchronized (this) {
            this.f1863a.f1611a.clear();
        }
    }
}
