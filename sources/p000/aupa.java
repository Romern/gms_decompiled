package p000;

import android.os.Bundle;
import android.util.Log;

/* renamed from: aupa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aupa extends aupc implements auoi {

    /* renamed from: c */
    private auol f92241c;

    /* renamed from: d */
    private boolean f92242d;

    /* renamed from: g */
    public boolean f92243g;

    /* renamed from: d */
    private final void mo17248d() {
        this.f92243g = true;
        mo50626e();
    }

    /* renamed from: c */
    public void mo9322c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo50626e() {
    }

    /* renamed from: g */
    public final auol mo50786g() {
        if (this.f92241c == null) {
            Log.e("Coffee-AuthPreferenceFragment", "Shared Preference Service failed to be reached.");
        }
        if (this.f92241c.mo50734b()) {
            return this.f92241c;
        }
        if (!this.f92243g) {
            return null;
        }
        this.f92241c.mo50730b(this);
        this.f92243g = false;
        this.f92241c.mo50726a(this);
        return null;
    }

    /* renamed from: h */
    public final void mo50722h() {
        sdo.m34967a("onPreferencesAvailable() should be called from the main thread.");
        if (isResumed()) {
            mo17248d();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        auol a = auol.m77454a();
        this.f92241c = a;
        a.mo50726a(this);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f92243g = false;
        this.f92241c.mo50730b(this);
        this.f92241c = null;
    }

    public void onPause() {
        super.onPause();
        this.f92243g = false;
    }

    public final void onResume() {
        super.onResume();
        if (!this.f92242d) {
            this.f92242d = true;
            if (this.f92241c.mo50734b()) {
                mo17248d();
                return;
            }
        }
        if (!this.f92241c.mo50734b()) {
            Log.w("Coffee-AuthPreferenceFragment", "preference service client is not available");
        } else {
            this.f92241c.mo50738e();
        }
    }
}
