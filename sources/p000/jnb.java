package p000;

import android.os.Handler;
import java.util.Map;

/* renamed from: jnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class jnb {

    /* renamed from: b */
    final Handler f22854b;

    public jnb(Handler handler) {
        this.f22854b = handler;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13785a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13786a(Map map) {
    }

    /* renamed from: b */
    public final void mo13893b(Map map) {
        this.f22854b.post(new jna(this, map));
    }
}
