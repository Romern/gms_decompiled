package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.plus.internal.PlusSession;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.Set;

/* renamed from: anty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anty extends sbm {

    /* renamed from: a */
    private final PlusSession f77729a;

    /* renamed from: b */
    public static boolean m65328b(Set set) {
        if (set == null || set.isEmpty()) {
            return false;
        }
        if (set.size() != 1 || !set.contains(new Scope("plus_one_placeholder_scope"))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
        if (queryLocalInterface instanceof antx) {
            return (antx) queryLocalInterface;
        }
        return new antv(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.plus.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle a = this.f77729a.mo46579a();
        a.putStringArray("request_visible_actions", this.f77729a.f82353d);
        a.putString("auth_package", this.f77729a.f82355f);
        return a;
    }

    /* renamed from: g */
    public final boolean mo12787g() {
        return m65328b(this.f44003H.mo25319a(ankt.f77031a));
    }

    public anty(Context context, Looper looper, sat sat, PlusSession plusSession, rjz rjz, rka rka) {
        super(context, looper, 2, sat, rjz, rka);
        this.f77729a = plusSession;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16780a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person")) {
            PersonEntity.m68452c(bundle.getByteArray("loaded_person"));
        }
        super.mo16780a(i, iBinder, bundle, i2);
    }
}
