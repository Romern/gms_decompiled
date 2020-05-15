package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.car.CarWindowLayoutParams;

/* renamed from: nin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nin {

    /* renamed from: a */
    final ComponentName f35741a;

    /* renamed from: b */
    final Intent f35742b;

    /* renamed from: c */
    final Bundle f35743c;

    /* renamed from: d */
    final niu f35744d;

    /* renamed from: e */
    final nii f35745e;

    /* renamed from: f */
    final niv f35746f;

    /* renamed from: g */
    final CarWindowLayoutParams f35747g = null;

    public nin(ComponentName componentName, Intent intent, Bundle bundle, niu niu, nii nii, niv niv) {
        this.f35741a = componentName;
        this.f35742b = intent;
        this.f35743c = bundle;
        this.f35744d = niu;
        this.f35745e = nii;
        this.f35746f = niv;
    }

    public final String toString() {
        int i = nip.f35750c;
        String valueOf = String.valueOf(this.f35742b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length());
        sb.append(valueOf);
        return sb.toString();
    }
}
