package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: bfuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfuh {

    /* renamed from: a */
    public static final String[] f115325a = new String[0];

    /* renamed from: b */
    public final Context f115326b;

    /* renamed from: c */
    public final bfug f115327c;

    /* renamed from: d */
    public final bfpk f115328d;

    /* renamed from: e */
    public final bfpj f115329e = new bfpj(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);

    /* renamed from: f */
    public final bfuo f115330f;

    /* renamed from: g */
    public final bfox f115331g;

    public bfuh(Context context) {
        bfuo bfuo;
        bfuo bfuo2;
        Looper a = bfqt.m97589a();
        bfox bfox = new bfox(context);
        this.f115326b = context;
        this.f115328d = new bfpk(new adzt(a), bfqt.m97590a(context));
        this.f115327c = new bfug(this, context, this.f115328d.f118291c);
        if (cewg.f183473a.mo6606a().fopEnableInertialAnchorOrientationEngineV2()) {
            if (cewg.m138356n()) {
                bfuo2 = new bfun(this.f115326b, this.f115328d, m97899a());
            } else {
                bfuo2 = new bfua(this.f115326b, this.f115328d, m97899a());
            }
            this.f115330f = bfuo2;
        } else {
            if (cewg.m138356n()) {
                bfuo = new bfuk(this.f115326b, this.f115328d, m97899a());
            } else {
                bfuo = new bfua(this.f115326b, this.f115328d, m97899a());
            }
            this.f115330f = bfuo;
        }
        this.f115331g = bfox;
    }

    /* renamed from: a */
    private final bfuf m97899a() {
        return new bfuf(this);
    }

    /* renamed from: a */
    public static final void m97900a(bfub bfub, PrintWriter printWriter) {
        printWriter.print("  ");
        printWriter.print(bfub.f115307a);
        printWriter.print(" Uid=");
        printWriter.print(bfub.f115309c);
        printWriter.print(" Package=");
        printWriter.print(bfub.f115308b);
    }

    /* renamed from: a */
    public final void mo62279a(aehq aehq) {
        if (aehq == null) {
            bftx.m97877a("Received null listener to remove uid:%s packages:%s", Integer.valueOf(Binder.getCallingUid()), Arrays.toString(svr.m36484b(this.f115326b).mo26175a(Binder.getCallingUid())));
            return;
        }
        this.f115328d.mo62099a(31, new bfuc(this, aehq));
    }
}
