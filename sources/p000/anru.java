package p000;

import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.DefaultChimeraIntentService;

/* renamed from: anru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anru {

    /* renamed from: g */
    private static anru f77549g;

    /* renamed from: a */
    public final shj f77550a;

    /* renamed from: b */
    public final ansh f77551b;

    /* renamed from: c */
    public final ansg f77552c;

    /* renamed from: d */
    public final anse f77553d;

    /* renamed from: e */
    public final anrv f77554e;

    /* renamed from: f */
    public final anrx f77555f;

    private anru(Context context) {
        Context applicationContext = context.getApplicationContext();
        aoao aoao = new aoao(applicationContext, (String) ansx.f77682d.mo25081c(), (String) ansx.f77683e.mo25081c(), ((Boolean) ansx.f77677a.mo25081c()).booleanValue(), ((Boolean) ansx.f77680b.mo25081c()).booleanValue(), (String) ansx.f77681c.mo25081c(), (String) ansx.f77684f.mo25081c());
        aoao aoao2 = new aoao(applicationContext, (String) ansx.f77682d.mo25081c(), "", ((Boolean) ansx.f77677a.mo25081c()).booleanValue(), ((Boolean) ansx.f77680b.mo25081c()).booleanValue(), (String) ansx.f77681c.mo25081c(), (String) ansx.f77684f.mo25081c());
        aoao aoao3 = new aoao(applicationContext, (String) ansx.f77689k.mo25081c(), (String) ansx.f77690l.mo25081c(), ((Boolean) ansx.f77677a.mo25081c()).booleanValue(), ((Boolean) ansx.f77680b.mo25081c()).booleanValue(), (String) ansx.f77681c.mo25081c(), (String) ansx.f77691m.mo25081c());
        aoao aoao4 = new aoao(applicationContext, (String) ansx.f77686h.mo25081c(), (String) ansx.f77687i.mo25081c(), ((Boolean) ansx.f77677a.mo25081c()).booleanValue(), ((Boolean) ansx.f77680b.mo25081c()).booleanValue(), (String) ansx.f77681c.mo25081c(), (String) ansx.f77688j.mo25081c());
        aoao aoao5 = new aoao(applicationContext, (String) ((bmzm) rsv.f43624m).f131273a, (String) rsv.f43625n.mo25081c(), ((Boolean) ansx.f77677a.mo25081c()).booleanValue(), ((Boolean) ansx.f77680b.mo25081c()).booleanValue(), (String) ansx.f77681c.mo25081c(), "");
        aoao aoao6 = new aoao(applicationContext, (String) ansx.f77692n.mo25081c(), (String) ansx.f77693o.mo25081c(), ((Boolean) ansx.f77677a.mo25081c()).booleanValue(), ((Boolean) ansx.f77680b.mo25081c()).booleanValue(), (String) ansx.f77681c.mo25081c(), (String) ansx.f77694p.mo25081c());
        this.f77550a = aoao6;
        aoao6.f44447g = 6400;
        this.f77551b = new ansh(new aocv(aoao), new aodd(aoao2), aoay.f78058a);
        this.f77552c = new ansg(aoao4);
        this.f77554e = new anrv(aoao3, new aode(aoao3));
        this.f77553d = new anse(aoao3, new aodg(aoao3));
        this.f77555f = new anrx(aoao4, aoao5);
    }

    /* renamed from: a */
    public static synchronized anru m65076a(Context context) {
        anru anru;
        synchronized (anru.class) {
            if (f77549g == null) {
                f77549g = new anru(context);
            }
            anru = f77549g;
        }
        return anru;
    }

    /* renamed from: a */
    public final antb mo42168a(Context context, ClientContext clientContext, int i) {
        boolean z = true;
        if (i != 1) {
            Cursor a = aoam.m65703a(context.getContentResolver(), clientContext.mo17802b());
            if (a != null) {
                try {
                    if (a.moveToFirst()) {
                        if (a.getInt(a.getColumnIndex("signedUp")) == 0) {
                            return this.f77551b.mo42181a(context, clientContext);
                        }
                        if (System.currentTimeMillis() - a.getLong(a.getColumnIndex("updated")) > 3600000) {
                            DefaultChimeraIntentService.m68555a(context, new aobl(clientContext, null));
                        }
                        String string = a.getString(a.getColumnIndex("display_name"));
                        String string2 = a.getString(a.getColumnIndex("profile_image_url"));
                        if (a.getInt(a.getColumnIndex("signedUp")) == 0) {
                            z = false;
                        }
                        antb antb = new antb(string, string2, z);
                        a.close();
                        return antb;
                    }
                } finally {
                    a.close();
                }
            }
            if (a != null) {
                a.close();
            }
        }
        return this.f77551b.mo42181a(context, clientContext);
    }

    /* renamed from: a */
    public final String mo42169a(Context context, ClientContext clientContext) {
        if (clientContext.mo17802b() != null) {
            return mo42168a(context, clientContext, 0).mo42215b();
        }
        return null;
    }
}
