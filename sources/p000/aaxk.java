package p000;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: aaxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaxk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f56762a;

    /* renamed from: b */
    final /* synthetic */ HelpConfig f56763b;

    /* renamed from: c */
    final /* synthetic */ abcr f56764c;

    public aaxk(Context context, HelpConfig helpConfig, abcr abcr) {
        this.f56762a = context;
        this.f56763b = helpConfig;
        this.f56764c = abcr;
    }

    public final void run() {
        aaxj aaxj = new aaxj(this.f56762a, this.f56763b, aaxl.m47164f());
        aaxj.mo31679a(16, this.f56764c);
        aaxj.mo31684e();
    }
}
