package p000;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: uyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uyw extends uvt implements uwc {
    public uyw(String str) {
        super(str, 4300000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28085a(Bundle bundle, Object obj) {
        bundle.putLong(this.f48653a, ((Long) obj).longValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28089b(Bundle bundle) {
        return Long.valueOf(bundle.getLong(this.f48653a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo28092c(DataHolder dataHolder, int i, int i2) {
        return Long.valueOf(dataHolder.mo17763a(this.f48653a, i, i2));
    }
}
