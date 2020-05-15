package p000;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: uzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uzg extends uvt implements uwb, uwc {
    public uzg(String str) {
        super(str, 4100000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28085a(Bundle bundle, Object obj) {
        bundle.putString(this.f48653a, (String) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28089b(Bundle bundle) {
        return bundle.getString(this.f48653a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo28092c(DataHolder dataHolder, int i, int i2) {
        return dataHolder.mo17769c(this.f48653a, i, i2);
    }

    public uzg() {
        super("mimeType", 4100000);
    }

    public uzg(String str, int i) {
        super(str, i);
    }
}
