package p000;

import android.content.Intent;
import androidx.preference.Preference;

/* renamed from: auum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auum implements aoa {

    /* renamed from: a */
    final /* synthetic */ auur f92552a;

    public auum(auur auur) {
        this.f92552a = auur;
    }

    /* renamed from: a */
    public final boolean mo2219a(Preference preference) {
        Intent intent = new Intent();
        intent.setClassName("com.android.facelock", "com.android.facelock.AddToSetup");
        this.f92552a.startActivity(intent);
        return true;
    }
}
