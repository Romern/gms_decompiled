package p000;

import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: gao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gao extends gal {

    /* renamed from: a */
    private final fzz f17793a;

    public gao(ClientContext clientContext, fzz fzz) {
        super("ListStatesOp", clientContext);
        this.f17793a = fzz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final DataHolder mo11597a() {
        Log.e("ListStatesOp", "API is not available anymore.");
        return DataHolder.m22539b(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11598a(DataHolder dataHolder) {
        this.f17793a.mo11573a(dataHolder);
    }
}
