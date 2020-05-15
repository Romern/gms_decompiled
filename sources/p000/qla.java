package p000;

import android.content.Context;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.ModuleContext;
import java.lang.reflect.Constructor;

/* renamed from: qla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qla extends dhq {
    public qla() {
        this(qkw.m32313b());
    }

    /* renamed from: a */
    public final IntentOperation mo9006a(Constructor constructor, Context context) {
        if (!cdoz.f181455a.mo6606a().mo78120m()) {
            return super.mo9006a(constructor, context);
        }
        aabl aabl = new aabl(context, constructor.getDeclaringClass(), 3);
        blji b = aabl.mo16696b("constructor");
        try {
            IntentOperation a = super.mo9006a(constructor, context);
            if (b != null) {
                b.close();
            }
            return new qkz(a, aabl);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public qla(qkw qkw) {
        super(qkw);
    }

    /* renamed from: a */
    public final void mo9009a(IntentOperation intentOperation, Context context) {
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof dfz)) {
            context = new qky(this, context);
        }
        intentOperation.init(context);
    }
}
