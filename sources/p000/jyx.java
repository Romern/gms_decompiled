package p000;

import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* renamed from: jyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jyx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f23552a;

    /* renamed from: b */
    final /* synthetic */ MinuteMaidChimeraActivity f23553b;

    public jyx(MinuteMaidChimeraActivity minuteMaidChimeraActivity, boolean z) {
        this.f23553b = minuteMaidChimeraActivity;
        this.f23552a = z;
    }

    public final void run() {
        bizb.m103020a(this.f23553b.getWindow(), this.f23552a);
    }
}
