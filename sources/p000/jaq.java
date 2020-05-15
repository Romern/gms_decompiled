package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: jaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jaq extends sbm {

    /* renamed from: a */
    private final izo f22029a;

    public jaq(Context context, Looper looper, sat sat, rlz rlz, rof rof, izo izo) {
        super(context, looper, 172, sat, rlz, rof);
        this.f22029a = izo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo12105F() {
        return true;
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return kaz.f23679b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalService");
        if (queryLocalInterface instanceof jac) {
            return (jac) queryLocalInterface;
        }
        return new jaa(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.key.retrieval.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.folsom.internal.IKeyRetrievalService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 19609000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle bundle = new Bundle();
        bundle.putString("SECURITY_DOMAIN", this.f22029a.f22005a);
        return bundle;
    }
}
