package p000;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* renamed from: zhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class zhv implements zhk {

    /* renamed from: a */
    private boolean f55109a = false;

    /* renamed from: d */
    final /* synthetic */ zhw f55110d;

    public zhv(zhw zhw) {
        this.f55110d = zhw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo31141a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo31142a(cacv cacv);

    /* JADX WARN: Failed to insert an additional move for type inference into block B:29:0x0020 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo31120a(zhm zhm, byte[] bArr) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < bArr.length - 2) {
            int i2 = i + 1;
            byte b = bArr[i];
            if (b == 0) {
                break;
            }
            int i3 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 == 2 || b2 == 3) {
                while (b > 1) {
                    int i4 = i3 + 1;
                    hashSet.add(UUID.fromString(String.format("%08x-0000-1000-8000-00805f9b34fb", Integer.valueOf(bArr[i3] + (bArr[i4] << 8)))));
                    i3 = i4 + 1;
                    b -= 2;
                }
                i = i3;
            } else {
                i = (b - 1) + i3;
            }
        }
        bnic<yqo> a = yqx.m44622a((Set) hashSet);
        if (!a.isEmpty() && zhm.mo31127b() != null) {
            HashSet hashSet2 = new HashSet(a.size());
            for (yqo yqo : a) {
                hashSet2.add(yqo.mo30673a());
            }
            mo31142a(yya.m44975a(zhm.mo31125a(), zhm.mo31127b(), hashSet2, yqx.m44623b(hashSet2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized boolean mo31144b() {
        boolean z;
        if (!this.f55109a) {
            srn srn = zhw.f55111a;
            this.f55110d.f55112b.mo31122a(this);
            z = true;
            this.f55109a = true;
        } else {
            z = false;
        }
        return z;
    }
}
