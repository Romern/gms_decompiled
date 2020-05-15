package p000;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: auvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auvk extends Fragment implements auoi {

    /* renamed from: d */
    private static final aunx f92600d = new aunx("TrustAgent", "PromoteScreenLockAndOnbodyFragment");

    /* renamed from: a */
    public String f92601a;

    /* renamed from: b */
    public auol f92602b;

    /* renamed from: c */
    public boolean f92603c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auol.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, int]
     candidates:
      auol.a(java.lang.String, long):long
      auol.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, boolean):void
      aupn.a(java.lang.String, long):long
      aupn.a(java.lang.String, java.lang.String):java.lang.String
      aupn.a(java.lang.String, boolean):void
      auol.a(java.lang.String, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    private final void m77930b() {
        char c;
        String str;
        if (this.f92602b.mo50734b()) {
            String str2 = this.f92601a;
            int hashCode = str2.hashCode();
            if (hashCode != -1847923611) {
                if (hashCode != -1452109386) {
                    if (hashCode == 1773221306 && str2.equals("com.google.android.gms.trustagent.discovery.OnbodyPromotionActivity")) {
                        c = 0;
                        if (c == 0) {
                            str = c != 1 ? c != 2 ? "" : "promotion_status_for_6" : "promotion_status_for_5";
                        } else {
                            str = "promotion_status_for_4";
                        }
                        if (!str.isEmpty()) {
                            auol auol = this.f92602b;
                            synchronized (auol.f92195b) {
                                auol.f92197d.putInt(str, 3);
                            }
                            auol.mo50727a(str, (Object) 3);
                        }
                        if (!this.f92603c) {
                            mo50972a();
                            return;
                        }
                        return;
                    }
                } else if (str2.equals("from_security_advisor")) {
                    c = 2;
                    if (c == 0) {
                    }
                    if (!str.isEmpty()) {
                    }
                    if (!this.f92603c) {
                    }
                }
            } else if (str2.equals("com.google.android.gms.trustagent.discovery.WebpageOnbodyPromotionActivity")) {
                c = 1;
                if (c == 0) {
                }
                if (!str.isEmpty()) {
                }
                if (!this.f92603c) {
                }
            }
            c = 65535;
            if (c == 0) {
            }
            if (!str.isEmpty()) {
            }
            if (!this.f92603c) {
            }
        }
    }

    /* renamed from: a */
    public final void mo50972a() {
        auwo.m77987a(getActivity(), this.f92602b, this.f92601a);
    }

    /* renamed from: h */
    public final void mo50722h() {
        f92600d.mo50711a("onPreferencesAvailable", new Object[0]);
        sdo.m34967a("onPreferencesAvailable() should be called from the main thread.");
        m77930b();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f92601a = getArguments().getString("from_intent");
        this.f92603c = false;
        auol a = auol.m77454a();
        this.f92602b = a;
        a.mo50726a(this);
        if (this.f92602b.mo50734b()) {
            m77930b();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f92602b.mo50730b(this);
        this.f92602b = null;
    }
}
