package p000;

import android.content.Context;
import android.content.ContextWrapper;
import org.chromium.net.CronetEngine;

/* renamed from: augv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class augv extends ContextWrapper {

    /* renamed from: b */
    public static CronetEngine f91795b;

    /* renamed from: a */
    public final bqgk f91796a;

    /* renamed from: c */
    private aerx f91797c;

    /* renamed from: d */
    private sxs f91798d;

    /* renamed from: e */
    private spf f91799e;

    public augv(Context context, bqgk bqgk) {
        super(context);
        this.f91796a = bqgk;
    }

    /* renamed from: a */
    public static augv m77052a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof augv) {
                return (augv) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final synchronized sxs mo50518b() {
        if (this.f91798d == null) {
            this.f91798d = new sxs(this);
        }
        return this.f91798d;
    }

    /* renamed from: c */
    public final synchronized spf mo50519c() {
        if (this.f91799e == null) {
            this.f91799e = spf.m35821a(this);
        }
        return this.f91799e;
    }

    /* renamed from: a */
    public final synchronized aerx mo50517a() {
        if (this.f91797c == null) {
            this.f91797c = new aerx(aeie.m51878c(this));
        }
        return this.f91797c;
    }
}
