package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collection;

/* renamed from: uza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class uza extends uvt {
    public uza(String str, Collection collection, Collection collection2, int i) {
        super(str, collection, collection2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28085a(Bundle bundle, Object obj) {
        bundle.putParcelable(this.f48653a, (ReflectedParcelable) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28089b(Bundle bundle) {
        return (ReflectedParcelable) bundle.getParcelable(this.f48653a);
    }
}
