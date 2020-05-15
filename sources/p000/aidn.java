package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;

/* renamed from: aidn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aidn extends aidy {

    /* renamed from: a */
    final /* synthetic */ OnConnectionResultParams f68801a;

    /* renamed from: b */
    final /* synthetic */ Status f68802b;

    public aidn(OnConnectionResultParams onConnectionResultParams, Status status) {
        this.f68801a = onConnectionResultParams;
        this.f68802b = status;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11649a(Object obj) {
        ((ahia) obj).mo20145a(this.f68801a.f80584a, new ahid(this.f68802b));
    }
}
