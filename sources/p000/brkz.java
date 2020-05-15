package p000;

import android.content.Context;

/* renamed from: brkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brkz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f142900a;

    /* renamed from: b */
    final /* synthetic */ String f142901b;

    public brkz(Context context, String str) {
        this.f142900a = context;
        this.f142901b = str;
    }

    public final void run() {
        brla.m114109b(this.f142900a).edit().remove(this.f142901b).apply();
    }
}
