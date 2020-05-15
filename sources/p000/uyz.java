package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: uyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class uyz extends uvu {
    public uyz(String str, Collection collection, Collection collection2, int i) {
        super(str, collection, collection2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28085a(Bundle bundle, Object obj) {
        Collection collection = (Collection) obj;
        bundle.putParcelableArrayList(this.f48653a, !(collection instanceof ArrayList) ? new ArrayList(collection) : (ArrayList) collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Collection mo28089b(Bundle bundle) {
        return bundle.getParcelableArrayList(this.f48653a);
    }
}
