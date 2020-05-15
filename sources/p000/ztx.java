package p000;

import android.content.ContentValues;
import java.util.Collection;
import java.util.List;

/* renamed from: ztx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ztx implements zrk {

    /* renamed from: b */
    private static final srn f55909b = zvt.m46581a();

    /* renamed from: a */
    public final ztl f55910a;

    /* renamed from: c */
    private final zre f55911c;

    /* renamed from: d */
    private final sqv f55912d;

    /* renamed from: e */
    private final zrr f55913e = new zrr(new ztw(this));

    public ztx(ztl ztl, zre zre, sqv sqv) {
        this.f55911c = zre;
        this.f55910a = ztl;
        this.f55912d = sqv;
    }

    /* renamed from: a */
    private final int m46412a(String str, caae caae, caah caah) {
        zsu a;
        this.f55913e.mo31414c();
        ztk b = this.f55910a.mo31503b();
        try {
            b.mo31497a();
            bngs j = bngx.m109377j();
            a = m46413a(b, str, caae, caah);
            while (a.mo31476c()) {
                j.mo67668c(Long.valueOf(a.mo31479d("_id")));
            }
            if (a != null) {
                a.close();
            }
            int i = 0;
            for (List list : bnjd.m109574a(j.mo67664a(), (int) cdzv.m135696d())) {
                i += b.mo31489a("Subscriptions", String.format("%s IN (%s)", "_id", ztu.m46329a(list.size())), ztu.m46352c(list));
            }
            b.mo31498b();
            b.close();
            return i;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* renamed from: b */
    public final bnic mo31399b(String str) {
        return ((bnig) this.f55913e.mo31412a()).mo67692g(str);
    }

    /* renamed from: b */
    public final boolean mo31400b() {
        return this.f55910a.mo31502a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, yqe, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: b */
    public final boolean mo31401b(yqe yqe) {
        caae caae;
        cadr cadr = yqe.f54381b;
        String str = yqe.f54380a;
        caah caah = null;
        if ((cadr.f172719a & 1) != 0) {
            caae = cadr.f172720b;
            if (caae == null) {
                caae = caae.f172323i;
            }
        } else {
            caae = null;
        }
        if ((cadr.f172719a & 2) != 0 && (caah = cadr.f172721c) == null) {
            caah = caah.f172333d;
        }
        int a = m46412a(str, caae, caah);
        if (a > 1) {
            bnsl bnsl = (bnsl) f55909b.mo68387b();
            bnsl.mo68432a("ztx", "b", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68422a("Expected to remove 1 app subscription for %s. Removed %d.", (Object) yqe, a);
        }
        if (a > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static zsu m46413a(ztk ztk, String str, caae caae, caah caah) {
        ztk.mo31499c();
        String format = String.format("%s = ?", "app_package");
        bngs j = bngx.m109377j();
        j.mo67668c(str);
        if (caae != null) {
            String valueOf = String.valueOf(format);
            String valueOf2 = String.valueOf(String.format(" AND %s = ?", "identifier"));
            format = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            j.mo67668c(caae.f172326b);
        }
        if (caah != null) {
            String valueOf3 = String.valueOf(format);
            String valueOf4 = String.valueOf(String.format(" AND %s = ?", "name"));
            format = valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4);
            j.mo67668c(caah.f172336b);
        }
        return ztk.mo31492a(ztc.f55865b, new String[]{"Subscriptions._id", "identifier", "name"}, format, (String[]) j.mo67664a().toArray(new String[0]));
    }

    /* renamed from: a */
    public final bnic mo31396a() {
        return bnic.m109495a((Collection) ((bnig) this.f55913e.mo31412a()).mo67737t());
    }

    /* renamed from: a */
    public final void mo31397a(String str) {
        m46412a(str, null, null);
    }

    /* renamed from: a */
    public final void mo31398a(yqe yqe) {
        caah caah;
        caae caae;
        zsu a;
        ztk b = this.f55910a.mo31503b();
        try {
            b.mo31497a();
            String str = yqe.f54380a;
            cadr cadr = yqe.f54381b;
            if ((cadr.f172719a & 2) != 0) {
                caah = cadr.f172721c;
                if (caah == null) {
                    caah = caah.f172333d;
                }
            } else {
                caah = null;
            }
            if ((cadr.f172719a & 1) != 0) {
                caae = cadr.f172720b;
                if (caae == null) {
                    caae = caae.f172323i;
                }
            } else {
                caae = null;
            }
            a = m46413a(b, str, caae, caah);
            if (!a.mo31474b()) {
                if (a != null) {
                    a.close();
                }
                ContentValues contentValues = new ContentValues();
                if (caah != null) {
                    contentValues.put("data_type_id", Long.valueOf(ztu.m46315a(b, caah)));
                }
                if (caae != null) {
                    contentValues.put("data_source_id", Long.valueOf(((Long) bnjd.m109587b(this.f55911c.mo31380a((Collection) bngx.m109356a(caae)))).longValue()));
                }
                contentValues.put("app_package", str);
                contentValues.put("sampling_delay", Long.valueOf(cadr.f172722d));
                contentValues.put("accuracy_mode", Integer.valueOf(cadr.f172723e));
                contentValues.put("timestamp", Long.valueOf(this.f55912d.mo20505a()));
                int i = yqe.f54384e;
                if (i != 0) {
                    contentValues.put("realm", Integer.valueOf(i));
                    this.f55913e.mo31414c();
                    b.mo31490a("Subscriptions", contentValues);
                    b.mo31498b();
                } else {
                    throw null;
                }
            } else if (a != null) {
                a.close();
            }
            b.close();
            return;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }
}
