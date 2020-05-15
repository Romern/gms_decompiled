package p000;

import android.content.Context;

/* renamed from: azhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class azhc {

    /* renamed from: a */
    protected final Context f99339a;

    /* renamed from: b */
    private final azfx f99340b;

    /* renamed from: c */
    private final String f99341c;

    protected azhc(Context context, azfx azfx, String str) {
        this.f99339a = context;
        this.f99340b = azfx;
        this.f99341c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo54920a(Object obj);

    /* renamed from: a */
    public final void mo54921a() {
        this.f99340b.mo54886b(this.f99341c, new azhb(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo54922a(Object obj, Exception exc);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo54923a(Object obj, Object obj2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo54924b();
}
