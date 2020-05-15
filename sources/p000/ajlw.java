package p000;

import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.SetDeviceNameParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: ajlw */
final /* synthetic */ class ajlw implements Callable {

    /* renamed from: a */
    private final ajmt f70885a;

    /* renamed from: b */
    private final SetDeviceNameParams f70886b;

    public ajlw(ajmt ajmt, SetDeviceNameParams setDeviceNameParams) {
        this.f70885a = ajmt;
        this.f70886b = setDeviceNameParams;
    }

    public final Object call() {
        ajmt ajmt = this.f70885a;
        SetDeviceNameParams setDeviceNameParams = this.f70886b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
        String str = setDeviceNameParams.f81126a;
        Charset charset = NearbySharingChimeraService.f80888a;
        String trim = str.trim();
        int i = 13;
        if (TextUtils.isEmpty(trim)) {
            ((bnsl) ajvp.f71371a.mo68388c()).mo68405a("deviceName cannot be empty");
        } else {
            int integer = nearbySharingChimeraService.getResources().getInteger(C0126R.integer.sharing_max_name_length_bytes);
            if (trim.getBytes(NearbySharingChimeraService.f80888a).length > integer) {
                ((bnsl) ajvp.f71371a.mo68388c()).mo68411a("deviceName is too large. Expected at most %d bytes. Got %d bytes.", integer, trim.getBytes(NearbySharingChimeraService.f80888a).length);
            } else if ("code:reset".equals(trim) && (ajvh.m59100a() == 2 || ajvh.m59100a() == 3)) {
                nearbySharingChimeraService.mo44438d(false);
                nearbySharingChimeraService.mo44427a(false);
                C1240of ofVar = nearbySharingChimeraService.f80908t;
                if (ofVar != null) {
                    nearbySharingChimeraService.mo44429b((ShareTarget) ofVar.f26798a);
                    nearbySharingChimeraService.mo44450o();
                    nearbySharingChimeraService.f80908t = null;
                }
                nearbySharingChimeraService.f80904p.mo38816b();
                ajna.m58862c();
                nearbySharingChimeraService.f80898b.mo38793d();
                nearbySharingChimeraService.f80899k.mo39178g();
                nearbySharingChimeraService.mo44439d().edit().clear().apply();
                akif.m59806a(akis.m59847a(nearbySharingChimeraService.f80905q));
                nearbySharingChimeraService.mo44427a(true);
                nearbySharingChimeraService.mo44457v();
                nearbySharingChimeraService.mo44440e();
                ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Reset all local Nearby Sharing state");
                i = 35503;
            } else if (!nearbySharingChimeraService.mo44439d().contains("device_name") || !nearbySharingChimeraService.mo44449n().equals(trim)) {
                nearbySharingChimeraService.mo44439d().edit().putString("device_name", trim).apply();
                if (nearbySharingChimeraService.mo44454s()) {
                    nearbySharingChimeraService.mo44455t();
                    nearbySharingChimeraService.mo44442g();
                }
                nearbySharingChimeraService.f80899k.mo39174c(trim);
                nearbySharingChimeraService.mo44457v();
                ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Device name set to %s", trim);
                i = 0;
            } else {
                i = 35500;
            }
        }
        return Integer.valueOf(i);
    }
}
