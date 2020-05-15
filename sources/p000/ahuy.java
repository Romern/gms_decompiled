package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.fastpair.PairingException;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: ahuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahuy {
    /* renamed from: a */
    static String m56682a(Context context, ahsu ahsu) {
        String a = ((ahvp) ahgz.m55754a(context, ahvp.class)).mo37208a();
        String replaceAll = ahsu.mo37086k().replaceAll("^\\([0-9]+\\)\\s", "");
        srn srn = ahsd.f67925a;
        ahsu.mo37086k();
        if (!cfoj.m141569s() || a == null) {
            return replaceAll;
        }
        return context.getString(C0126R.string.fast_pair_device_name, a, replaceAll);
    }

    /* renamed from: a */
    static String m56683a(Context context, aypk aypk, ahsu ahsu, String str) {
        if (!cfoj.m141572v()) {
            return null;
        }
        String a = aypk.mo54191a();
        if (a == null) {
            a = m56682a(context, ahsu);
            aypk.mo54192a(a);
        }
        buqx.m120259a(str, a);
        return a;
    }

    /* renamed from: a */
    private static void m56684a(Context context, ahyz ahyz, String str) {
        boolean z;
        Throwable e;
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: writeAliasNameToProvider");
        ahti ahti = new ahti(ahyz.f68437k, ahyz.f68428b, context);
        ahti.mo37122a(bvjc.UPDATE_PROVIDER_NAME_START);
        ahtg f = ahth.m56604f();
        f.mo37114a(bvjc.UPDATE_PROVIDER_NAME_END);
        try {
            ayqi a = ahvg.m56719a();
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: writeAliasNameToProvider create connection");
            z = new aypk(context, str, a.mo54224a(), new ahts(ahti)).mo54195a(ahyz.f68429c.getKey(), buqx.m120261b(ahyz.f68428b));
            try {
                ahti.mo37121a(f.mo37111a());
            } catch (BluetoothException | PairingException | InterruptedException | GeneralSecurityException | ExecutionException | TimeoutException e2) {
                e = e2;
            }
        } catch (BluetoothException | PairingException | InterruptedException | GeneralSecurityException | ExecutionException | TimeoutException e3) {
            e = e3;
            z = false;
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("FastPair: Error with write alias name to provider");
            if (ahti.mo37124a()) {
                ahti.mo37123a(e);
            }
            f.f67983a = e;
            ahti.mo37121a(f.mo37111a());
            ((buqh) ahgz.m55754a(context, buqh.class)).mo72982a(new ahux("UpdateStoredFastPairItem", z, context, ahyz));
        }
        try {
            ((buqh) ahgz.m55754a(context, buqh.class)).mo72982a(new ahux("UpdateStoredFastPairItem", z, context, ahyz));
        } catch (InterruptedException e4) {
            bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68388c();
            bnsl2.mo68437a(e4);
            bnsl2.mo68405a("Error to update cache items with name status.");
        }
    }

    /* renamed from: a */
    static synchronized void m56685a(Context context, String str, ahyz ahyz) {
        synchronized (ahuy.class) {
            ahyz a = ((ahst) ahgz.m55754a(context, ahst.class)).mo37033a(ahyz.f68428b);
            if (a == null) {
                srn srn = ahsd.f67925a;
                return;
            }
            srn srn2 = ahsd.f67925a;
            m56684a(context, a, str);
        }
    }
}
