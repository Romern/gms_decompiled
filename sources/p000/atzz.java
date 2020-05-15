package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: atzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atzz extends bmxe {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12636a(Object obj) {
        return !((Bundle) obj).getBoolean("isSuccess") ? Status.f30109c : Status.f30107a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12637b(Object obj) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isSuccess", ((Status) obj).mo17710c());
        return bundle;
    }
}
