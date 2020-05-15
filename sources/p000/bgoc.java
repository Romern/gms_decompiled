package p000;

import android.hardware.TriggerEvent;
import android.hardware.TriggerEventListener;

/* renamed from: bgoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgoc extends TriggerEventListener {

    /* renamed from: a */
    private final bgob f116898a;

    public bgoc(bgns bgns, bgod bgod) {
        this.f116898a = new bgob(bgns, bgod);
    }

    public final void onTrigger(TriggerEvent triggerEvent) {
        this.f116898a.mo63030a();
    }
}
