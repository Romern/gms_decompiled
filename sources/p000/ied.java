package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ied */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ied implements bqeg {

    /* renamed from: a */
    public static final bnhe f20788a;

    /* renamed from: b */
    private final Context f20789b;

    /* renamed from: c */
    private final GoogleSignInOptions f20790c;

    /* renamed from: d */
    private final String f20791d;

    /* renamed from: e */
    private final bmxv f20792e;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(5, 5);
        h.mo67695b(4, 4);
        h.mo67695b(17, 12500);
        h.mo67695b(16, 12500);
        h.mo67695b(7, 7);
        h.mo67695b(13, 12501);
        h.mo67695b(10, 10);
        f20788a = h.mo67618b();
    }

    public ied(Context context, GoogleSignInOptions googleSignInOptions, String str, bmxv bmxv) {
        this.f20789b = context;
        this.f20790c = googleSignInOptions;
        this.f20791d = str;
        this.f20792e = bmxv;
    }

    /* renamed from: a */
    public static final bqgg m15313a(rkb rkb) {
        return bqdx.m112673a(adbb.m50102a(rkb.mo24787a((rle) new aqnc(rkb))), iea.f20785a, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bqgg bqgg;
        GoogleSignInOptions googleSignInOptions = this.f20790c;
        HashSet hashSet = new HashSet(googleSignInOptions.mo7526a());
        boolean z = true;
        if (!hashSet.contains(aacw.f27968a) && !hashSet.contains(aacw.f27969b) && !hashSet.contains(aacw.f27971d) && !googleSignInOptions.f10344q.containsKey(1)) {
            z = false;
        }
        rjy a = mo12949a(z);
        if (this.f20792e.mo66813a()) {
            bqgg = new adba(a, (FragmentActivity) this.f20792e.mo66814b()).f61230a;
        } else {
            bqgg = adbb.m50101a(a);
        }
        return bqdx.m112674a(bqdf.m112619a(bqgg, rjp.class, ieb.f20786a, bqfb.INSTANCE), new idy(this, z), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final rjy mo12949a(boolean z) {
        bmxv bmxv;
        rjo rjo;
        Context context = this.f20789b;
        GoogleSignInOptions googleSignInOptions = this.f20790c;
        String str = this.f20791d;
        aqks aqks = new aqks();
        aqks.f86303g = true;
        aqks.f86301e = googleSignInOptions.f10341n;
        aqks.f86302f = googleSignInOptions.f10343p;
        if (googleSignInOptions.f10337j) {
            String str2 = googleSignInOptions.f10340m;
            aqks.f86298b = true;
            aqks.mo47942a(str2);
            aqks.f86299c = str2;
        }
        if (googleSignInOptions.f10338k) {
            String str3 = googleSignInOptions.f10340m;
            aqks.f86300d = googleSignInOptions.f10339l;
            aqks.f86297a = true;
            aqks.mo47942a(str3);
            aqks.f86299c = str3;
        }
        rjy rjy = new rjy(context);
        rjy.mo24780a(aqkq.f86291c, aqks.mo47941a());
        rjy.f43173b = str;
        rjy.f43172a = googleSignInOptions.f10336i;
        Set<Scope> hashSet = new HashSet(googleSignInOptions.mo7526a());
        if (idx.m15309a(googleSignInOptions)) {
            hashSet = idx.m15308a(hashSet);
        }
        for (Scope scope : hashSet) {
            rjy.mo24777a(scope);
        }
        if (!z) {
            return rjy;
        }
        GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) this.f20790c.f10344q.get(1);
        if (googleSignInOptionsExtensionParcelable == null) {
            bmxv = bmvz.f131120a;
        } else {
            Bundle bundle = googleSignInOptionsExtensionParcelable.f10350c;
            if (bundle != null) {
                sdo.m34959a(bundle);
                aacu aacu = new aacu();
                if (bundle.containsKey("com.google.android.gms.games.key.isHeadless")) {
                    aacu.f27943a = bundle.getBoolean("com.google.android.gms.games.key.isHeadless");
                }
                if (bundle.containsKey("com.google.android.gms.games.key.showConnectingPopup")) {
                    if (bundle.containsKey("com.google.android.gms.games.key.connectingPopupGravity")) {
                        boolean z2 = bundle.getBoolean("com.google.android.gms.games.key.showConnectingPopup");
                        int i = bundle.getInt("com.google.android.gms.games.key.connectingPopupGravity");
                        aacu.f27944b = z2;
                        aacu.f27945c = i;
                    } else {
                        aacu.f27944b = bundle.getBoolean("com.google.android.gms.games.key.showConnectingPopup");
                        aacu.f27945c = 17;
                    }
                }
                if (bundle.containsKey("com.google.android.gms.games.key.retryingSignIn")) {
                    aacu.f27946d = bundle.getBoolean("com.google.android.gms.games.key.retryingSignIn");
                }
                if (bundle.containsKey("com.google.android.gms.games.key.sdkVariant")) {
                    aacu.f27947e = bundle.getInt("com.google.android.gms.games.key.sdkVariant");
                }
                if (bundle.containsKey("com.google.android.gms.games.key.unauthenticated")) {
                    aacu.f27950h = bundle.getBoolean("com.google.android.gms.games.key.unauthenticated");
                }
                String string = bundle.getString("com.google.android.gms.games.key.forceResolveAccountKey");
                if (string != null) {
                    sdo.m34959a((Object) string);
                    aacu.f27948f = string;
                }
                if (bundle.containsKey("com.google.android.gms.games.key.skipWelcomePopup")) {
                    aacu.mo16733a(Boolean.valueOf(bundle.getBoolean("com.google.android.gms.games.key.skipWelcomePopup")));
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("com.google.android.gms.games.key.proxyApis");
                if (stringArrayList != null) {
                    int size = stringArrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        aacu.f27949g.add(stringArrayList.get(i2));
                    }
                }
                aacu.f27952j = (GoogleSignInAccount) bundle.getParcelable("com.google.android.gms.games.key.googleSignInAccount");
                aacu.f27953k = bundle.getString("com.google.android.gms.games.key.realClientPackageName", null);
                if (bundle.containsKey("com.google.android.gms.games.key.API_VERSION")) {
                    aacu.f27954l = bundle.getInt("com.google.android.gms.games.key.API_VERSION");
                }
                bmxv = bmxv.m108566b(aacu.mo16732a());
            } else {
                bmxv = bmvz.f131120a;
            }
        }
        if (!this.f20790c.mo7526a().contains(aacw.f27971d)) {
            rjo = aacw.f27970c;
        } else {
            rjo = aacw.f27972e;
        }
        aacu aacu2 = new aacu((aacv) bmxv.mo66815c());
        aacu2.f27954l = 6;
        aacu2.mo16733a(true);
        rjy.mo24780a(rjo, aacu2.mo16732a());
        return rjy;
    }
}
