package p000;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;

/* renamed from: uyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class uyr extends uvt implements uwb {
    public uyr(String str, byte[] bArr) {
        super(str, 4100000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28085a(Bundle bundle, Object obj) {
        bundle.putBoolean(this.f48653a, ((Boolean) obj).booleanValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28089b(Bundle bundle) {
        return Boolean.valueOf(bundle.getBoolean(this.f48653a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Boolean mo28092c(DataHolder dataHolder, int i, int i2) {
        return Boolean.valueOf(dataHolder.mo17771d(this.f48653a, i, i2));
    }

    public uyr(String str) {
        super(str, 4100000);
    }

    public uyr(String str, int i) {
        super(str, i);
    }

    public uyr(String str, Collection collection, Collection collection2) {
        super(str, collection, collection2, 7000000);
    }
}
