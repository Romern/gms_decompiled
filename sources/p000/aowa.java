package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: aowa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aowa {

    /* renamed from: b */
    public static final int f83712b = ((Integer) aoss.f83544c.mo58455c()).intValue();

    /* renamed from: c */
    public static chtv f83713c;

    /* renamed from: d */
    private static chtv f83714d;

    /* renamed from: a */
    protected final shl f83715a;

    public aowa(shl shl) {
        this.f83715a = shl;
    }

    /* renamed from: a */
    public final blri mo46947a(ClientContext clientContext, blrh blrh) {
        if (f83714d == null) {
            f83714d = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.CustomizeSnoozePresetsService/SetSnoozePresets", ciie.m150370a(blrh.f127450b), ciie.m150370a(blri.f127454a));
        }
        return (blri) this.f83715a.mo25553a(f83714d, clientContext, blrh, (long) f83712b, TimeUnit.MILLISECONDS);
    }
}
