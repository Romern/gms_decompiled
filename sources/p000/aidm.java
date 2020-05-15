package p000;

import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;

/* renamed from: aidm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aidm extends aidy {

    /* renamed from: a */
    final /* synthetic */ OnConnectionInitiatedParams f68800a;

    public aidm(OnConnectionInitiatedParams onConnectionInitiatedParams) {
        this.f68800a = onConnectionInitiatedParams;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11649a(Object obj) {
        String str = this.f68800a.f80570a;
        ahhy ahhy = new ahhy();
        OnConnectionInitiatedParams onConnectionInitiatedParams = this.f68800a;
        ahhy.f67224a = onConnectionInitiatedParams.f80571b;
        ahhy.f67225b = onConnectionInitiatedParams.f80572c;
        ahhy.f67226c = onConnectionInitiatedParams.f80575f;
        boolean z = onConnectionInitiatedParams.f80573d;
        ahhy.f67227d = onConnectionInitiatedParams.f80576g;
        ((ahia) obj).mo20144a(str, new ahhz(ahhy.f67224a, ahhy.f67225b, ahhy.f67226c, z, onConnectionInitiatedParams.f80577h, ahhy.f67227d));
    }
}
