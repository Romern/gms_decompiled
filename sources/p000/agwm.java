package p000;

import android.widget.CompoundButton;

/* renamed from: agwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agwm implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ String f66724a;

    /* renamed from: b */
    final /* synthetic */ agwp f66725b;

    public agwm(agwp agwp, String str) {
        this.f66725b = agwp;
        this.f66724a = str;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        agza agza = this.f66725b.f66732u;
        agza.f66898d.execute(new agyw(agza, this.f66724a, z));
    }
}
