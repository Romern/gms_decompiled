package p000;

import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: gar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gar extends gal {

    /* renamed from: a */
    private final int f17799a;

    /* renamed from: b */
    private final byte[] f17800b;

    /* renamed from: c */
    private final fzz f17801c;

    public gar(ClientContext clientContext, fzz fzz, int i, byte[] bArr) {
        super("UpdateStateOp", clientContext);
        this.f17801c = fzz;
        this.f17799a = i;
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            this.f17800b = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return;
        }
        this.f17800b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final DataHolder mo11597a() {
        Log.e("UpdateStateOp", "API is not available anymore.");
        return DataHolder.m22539b(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11598a(DataHolder dataHolder) {
        fzz fzz = this.f17801c;
        if (fzz != null) {
            fzz.mo11572a(this.f17799a, dataHolder);
        }
    }
}
