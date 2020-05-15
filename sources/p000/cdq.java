package p000;

import android.content.res.AssetManager;
import java.io.IOException;

/* renamed from: cdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cdq implements cdt {

    /* renamed from: a */
    private final String f6580a;

    /* renamed from: b */
    private final AssetManager f6581b;

    /* renamed from: c */
    private Object f6582c;

    public cdq(AssetManager assetManager, String str) {
        this.f6581b = assetManager;
        this.f6580a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo3750a(AssetManager assetManager, String str);

    /* renamed from: a */
    public final void mo3751a(cbs cbs, cds cds) {
        try {
            Object a = mo3750a(this.f6581b, this.f6580a);
            this.f6582c = a;
            cds.mo3762a(a);
        } catch (IOException e) {
            cds.mo3761a((Exception) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3752a(Object obj);

    /* renamed from: b */
    public final void mo3753b() {
        Object obj = this.f6582c;
        if (obj != null) {
            try {
                mo3752a(obj);
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: c */
    public final void mo3754c() {
    }

    /* renamed from: d */
    public final int mo3755d() {
        return 1;
    }
}
