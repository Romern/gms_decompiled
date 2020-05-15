package p000;

import android.content.Context;
import android.util.Pair;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.pos.PlusonesEntity;

/* renamed from: aobo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobo extends aobb {

    /* renamed from: c */
    private final String f78100c;

    /* renamed from: d */
    private final String f78101d;

    public aobo(ClientContext clientContext, String str, String str2, antk antk) {
        super(clientContext, antk);
        this.f78100c = str;
        this.f78101d = str2;
    }

    /* renamed from: b */
    public final Pair mo42521b(Context context, anru anru) {
        String str;
        aocu aocu;
        ClientContext clientContext = this.f78060a;
        String str2 = this.f78100c;
        String str3 = this.f78101d;
        ansh ansh = anru.f77551b;
        String a = anru.mo42169a(context, clientContext);
        ansa a2 = anry.m65083a().mo42172a(clientContext.mo17802b(), str2);
        String a3 = a2 != null ? a2.mo42175a() : null;
        String a4 = aoan.m65705a(context.getPackageManager(), clientContext.f30215e);
        try {
            aocq aocq = new aocq();
            aocq.mo42525a(ansh.m65102a(str2));
            aocq.f78206a = str3;
            aocq.f78207b.add(2);
            aocq.mo42526a(true);
            aocu a5 = aocq.mo42524a();
            aocv aocv = ansh.f77586a;
            String format = String.format("plusones/%1$s", shd.m35267a(ansh.m65102a(str2)));
            if (str3 != null) {
                format = shd.m35268a(format, "abtk", shd.m35267a(str3));
            }
            if (a3 != null) {
                format = shd.m35268a(format, "cdx", shd.m35267a(a3));
            }
            if (a4 != null) {
                format = shd.m35268a(format, "container", shd.m35267a(a4));
            }
            aocu aocu2 = (PlusonesEntity) aocv.f78210a.mo25536a(clientContext, 1, shd.m35268a(format, "source", shd.m35267a("native:android_app")), a5, PlusonesEntity.class);
            aocu a6 = anry.m65083a().mo42173a(clientContext.mo17802b(), str2, anrz.m65092a(aocu2));
            String a7 = clientContext.mo17795a();
            if (a6 == null) {
                aocu = aocu2;
            } else {
                aocu = a6;
            }
            str = str2;
            try {
                return Pair.create(ConnectionResult.f30063a, anrz.m65089a(context, a7, true, str2, aocu, context.getResources().getString(C0126R.string.plus_one_self), context.getResources().getString(C0126R.string.common_chips_label_public), a).f77709a);
            } catch (VolleyError e) {
                e = e;
                anry.m65083a().mo42174b(clientContext.mo17802b(), str);
                throw e;
            }
        } catch (VolleyError e2) {
            e = e2;
            str = str2;
            anry.m65083a().mo42174b(clientContext.mo17802b(), str);
            throw e;
        }
    }
}
