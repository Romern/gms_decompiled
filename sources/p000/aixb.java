package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import java.util.Set;

/* renamed from: aixb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aixb {

    /* renamed from: a */
    public final Set f69968a = new C1225nr();

    /* renamed from: b */
    public final ComponentCallbacks2 f69969b;

    /* renamed from: c */
    public final Context f69970c;

    /* renamed from: d */
    public final buqh f69971d;

    public aixb(Context context) {
        int i = Build.VERSION.SDK_INT;
        srn srn = ahfq.f67120a;
        this.f69970c = context;
        this.f69971d = (buqh) ahgz.m55754a(context, buqh.class);
        aiwz aiwz = new aiwz(this);
        this.f69969b = aiwz;
        this.f69970c.registerComponentCallbacks(aiwz);
    }

    /* renamed from: a */
    public final void mo38196a(aixa aixa) {
        int i = Build.VERSION.SDK_INT;
        this.f69968a.add(aixa);
    }
}
