package p000;

import android.content.Context;

/* renamed from: agae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agae implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f65058a;

    /* renamed from: b */
    final /* synthetic */ String f65059b;

    /* renamed from: c */
    final /* synthetic */ String f65060c;

    public agae(Context context, String str, String str2) {
        this.f65058a = context;
        this.f65059b = str;
        this.f65060c = str2;
    }

    public final void run() {
        agaf.m53797b(this.f65058a, this.f65059b, this.f65060c);
    }
}
