package p000;

import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: gaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gaq extends gal {

    /* renamed from: a */
    private final int f17796a;

    /* renamed from: b */
    private final byte[] f17797b;

    /* renamed from: c */
    private final fzz f17798c;

    public gaq(ClientContext clientContext, fzz fzz, int i, byte[] bArr) {
        super("ResolveStateOp", clientContext);
        this.f17798c = fzz;
        this.f17796a = i;
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            this.f17797b = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return;
        }
        this.f17797b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final DataHolder mo11597a() {
        Log.e("ResolveStateOp", "API is not available anymore.");
        return DataHolder.m22539b(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11598a(DataHolder dataHolder) {
        this.f17798c.mo11572a(this.f17796a, dataHolder);
    }
}
