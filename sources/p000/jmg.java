package p000;

import android.os.Handler;
import java.util.List;

/* renamed from: jmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class jmg {

    /* renamed from: d */
    final Handler f22819d;

    public jmg(Handler handler) {
        this.f22819d = handler == null ? new adzt() : handler;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13765a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13766a(byte[] bArr, List list) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13877a(boolean z, byte[] bArr, List list) {
        this.f22819d.post(new jmf(this, z, bArr, list));
    }
}
