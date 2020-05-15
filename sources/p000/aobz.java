package p000;

import android.content.Context;
import android.util.Pair;
import com.android.volley.VolleyError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.pos.PlusonesEntity;

/* renamed from: aobz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobz extends aobb {

    /* renamed from: c */
    final String f78148c;

    public aobz(ClientContext clientContext, String str, antk antk) {
        super(clientContext, antk);
        this.f78148c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0117, code lost:
        r0 = th;
     */
    /* renamed from: b */
    public final Pair mo42521b(Context context, anru anru) {
        ClientContext clientContext;
        boolean z;
        anry anry;
        ClientContext clientContext2;
        ansa ansa;
        Context context2 = context;
        anru anru2 = anru;
        ClientContext clientContext3 = this.f78060a;
        String str = this.f78148c;
        if (clientContext3.mo17802b() == null) {
            ClientContext clientContext4 = new ClientContext(clientContext3.f30212b, clientContext3.mo17795a(), soz.m35784a(context2, clientContext3.f30215e), clientContext3.f30215e, clientContext3.f30216f);
            clientContext4.f30217g.clear();
            clientContext4.f30217g.addAll(clientContext3.f30217g);
            clientContext4.mo17797a(clientContext3);
            clientContext = clientContext4;
        } else {
            clientContext = clientContext3;
        }
        ansh ansh = anru2.f77551b;
        String a = anru2.mo42169a(context2, clientContext);
        String a2 = aoan.m65705a(context.getPackageManager(), clientContext.f30215e);
        anry a3 = anry.m65083a();
        if (clientContext.mo17802b() != null) {
            aoay aoay = ansh.f77588c;
            anru.m65076a(context);
            z = aoay.mo42518a(context2, clientContext, sam.f43928G).mo17671b();
        } else {
            z = false;
        }
        ansa a4 = a3.mo42172a(clientContext.mo17802b(), str);
        if (a4 == null) {
            try {
                aocv aocv = ansh.f77586a;
                String format = String.format("plusones/%1$s", shd.m35267a(ansh.m65102a(str)));
                if (a2 != null) {
                    format = shd.m35268a(format, "container", shd.m35267a(a2));
                }
                ansa = new ansa((PlusonesEntity) aocv.f78210a.mo25536a(clientContext, 0, shd.m35268a(shd.m35268a(shd.m35268a(format, "max_people", String.valueOf((Object) 4)), "nolog", String.valueOf((Object) true)), "source", shd.m35267a("native:android_app")), (Object) null, PlusonesEntity.class), System.currentTimeMillis());
            } catch (VolleyError e) {
                e = e;
                anry = a3;
                clientContext2 = clientContext;
                anry.mo42174b(clientContext2.mo17802b(), str);
                throw e;
            }
        } else {
            ansa = new ansa(a4.f77567a, System.currentTimeMillis());
        }
        String b = clientContext.mo17802b();
        synchronized (a3.f77563a) {
            try {
                a3.f77563a.mo15547a(Pair.create(anry.m65084a(b), str), ansa);
            } catch (VolleyError e2) {
                e = e2;
            } catch (Throwable th) {
                th = th;
                anry = a3;
                clientContext2 = clientContext;
                while (true) {
                    break;
                }
                throw th;
            }
        }
        anry = a3;
        clientContext2 = clientContext;
        return Pair.create(ConnectionResult.f30063a, anrz.m65089a(context, clientContext.mo17795a(), z, str, ansa.f77567a, null, null, a).f77709a);
    }
}
