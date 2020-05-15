package p000;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.UserManager;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: iuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iuv implements iva {

    /* renamed from: j */
    public static final sek f21824j = new sek(new String[]{"ConnectionHandler"}, (char[]) null);

    /* renamed from: a */
    public final iuy f21825a;

    /* renamed from: b */
    public final ivb f21826b;

    /* renamed from: c */
    public final iup f21827c;

    /* renamed from: d */
    public final ium f21828d;

    /* renamed from: e */
    public final Object f21829e = new Object();

    /* renamed from: f */
    public final jpc f21830f;

    /* renamed from: g */
    public final Set f21831g = new HashSet();

    /* renamed from: h */
    public final bqgj f21832h;

    /* renamed from: i */
    public int f21833i = 0;

    public iuv(Context context, iuy iuy) {
        sdo.m34959a(context);
        ium a = ium.m16171a(context);
        ivb ivb = new ivb((KeyguardManager) context.getSystemService("keyguard"), new ivo(context), ivu.m16228a(context), ivr.m16222a(context), new imq(), ssh.m36213a(context), (UserManager) context.getSystemService("user"), ivh.m16212a());
        iup iup = new iup(context);
        jpc a2 = jpy.m17097a(context);
        bqgj b = snp.m35704b(9);
        this.f21825a = iuy;
        sdo.m34959a(a);
        this.f21828d = a;
        sdo.m34959a(ivb);
        this.f21826b = ivb;
        sdo.m34959a(iup);
        this.f21827c = iup;
        this.f21830f = a2;
        this.f21832h = b;
    }

    /* renamed from: a */
    public final void mo13345a(ivf ivf) {
        f21824j.mo25414c("Sending status update...", new Object[0]);
        synchronized (this.f21829e) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "status_update");
                jSONObject.put("user_presence", ivf.f21859a.get(ivf.f21862d));
                jSONObject.put("secure_screen_lock", ivf.f21860b.get(ivf.f21863e));
                jSONObject.put("trust_agent", ivf.f21861c.get(ivf.f21864f));
                byte[] bytes = jSONObject.toString().getBytes("UTF-8");
                for (String str : this.f21831g) {
                    this.f21825a.mo13350a(str, bytes);
                }
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            } catch (JSONException e2) {
                f21824j.mo25418e("Failed to serialize StatusUpdateOutgoingMessage", new Object[0]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
