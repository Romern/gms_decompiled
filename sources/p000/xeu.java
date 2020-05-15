package p000;

import android.content.Context;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;

/* renamed from: xeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xeu implements xes {

    /* renamed from: a */
    public static final bnic f52089a = bnic.m109492a(Transport.BLUETOOTH_LOW_ENERGY, Transport.NFC, Transport.USB, Transport.INTERNAL);

    /* renamed from: b */
    public static final bnic f52090b = bnic.m109491a(Transport.BLUETOOTH_LOW_ENERGY, Transport.NFC, Transport.USB);

    /* renamed from: c */
    public static final bnic f52091c = bnic.m109489a(Transport.INTERNAL);

    /* renamed from: d */
    public final Context f52092d;

    /* renamed from: e */
    public final RequestOptions f52093e;

    public xeu(Context context, RequestOptions requestOptions) {
        bmxy.m108581a(context);
        this.f52092d = context;
        bmxy.m108581a(requestOptions);
        this.f52093e = requestOptions;
    }

    /* renamed from: a */
    public final Integer mo29682a() {
        return 2;
    }

    /* renamed from: a */
    public final void mo29683a(StateUpdate stateUpdate) {
    }

    /* renamed from: b */
    public final bqgg mo29684b() {
        return xhu.f52320a.mo25819b(new xet(this));
    }
}
