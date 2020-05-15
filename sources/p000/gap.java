package p000;

import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: gap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gap extends gal {

    /* renamed from: a */
    private final int f17794a;

    /* renamed from: b */
    private final fzz f17795b;

    public gap(ClientContext clientContext, fzz fzz, int i) {
        super("LoadStateOp", clientContext);
        this.f17795b = fzz;
        this.f17794a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final DataHolder mo11597a() {
        Log.e("LoadStateOp", "API is not available anymore.");
        return DataHolder.m22539b(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11598a(DataHolder dataHolder) {
        this.f17795b.mo11572a(this.f17794a, dataHolder);
    }
}
