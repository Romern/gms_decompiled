package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskChimeraService;
import java.lang.reflect.InvocationTargetException;

/* renamed from: aspl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aspl {
    /* renamed from: a */
    public final aspm mo49331a(String str) {
        try {
            return (aspm) Class.forName(str).asSubclass(aspm.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            bnsl bnsl = (bnsl) TapAndPayGcmTaskChimeraService.f108498a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aspl", "a", (int) MfiClientException.TYPE_CARD_NOT_CACHED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to create TapAndPayGcmTaskOperation of class: %s", str);
            return null;
        }
    }
}
