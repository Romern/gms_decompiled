package p000;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Date;

/* renamed from: uvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uvz extends uvt implements uwc, uwb {
    public uvz(String str, boolean[] zArr) {
        super(str, 4100000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28085a(Bundle bundle, Object obj) {
        bundle.putLong(this.f48653a, ((Date) obj).getTime());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28089b(Bundle bundle) {
        return new Date(bundle.getLong(this.f48653a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo28092c(DataHolder dataHolder, int i, int i2) {
        return new Date(dataHolder.mo17763a(this.f48653a, i, i2));
    }

    public uvz(String str) {
        super(str, 4100000);
    }

    public uvz(String str, byte[] bArr) {
        super(str, 8000000);
    }

    public uvz(String str, char[] cArr) {
        super(str, 4100000);
    }

    public uvz(String str, int[] iArr) {
        super(str, 4100000);
    }

    public uvz(String str, short[] sArr) {
        super(str, 4300000);
    }
}
