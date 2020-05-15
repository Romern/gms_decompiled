package p000;

import android.content.Context;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: dof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dof extends dwm implements dog {

    /* renamed from: a */
    public final HashSet f13685a = new HashSet();

    /* renamed from: b */
    private final Context f13686b;

    /* renamed from: c */
    private boolean f13687c = false;

    public dof(Context context) {
        this.f13686b = context;
        doh.m8933a(this);
    }

    /* renamed from: a */
    public static String m8923a(String str) {
        if (((Boolean) rsv.f43612a.mo25081c()).booleanValue()) {
            return str;
        }
        int hashCode = str != null ? str.hashCode() : 0;
        StringBuilder sb = new StringBuilder(20);
        sb.append("account#");
        sb.append(hashCode);
        sb.append("#");
        return sb.toString();
    }

    /* renamed from: b */
    public static final doh m8924b(String str) {
        sdo.m34977c(str);
        if (TextUtils.equals(str, "@@ContextManagerNullAccount@@")) {
            return doh.f13688a;
        }
        return new doh(str);
    }

    /* renamed from: d */
    private final void m8925d() {
        tng tng = null;
        tjq a = dwq.m9673q().mo10053a((doh) null, 3);
        if (a != null) {
            try {
                tng = (tng) GeneratedMessageLite.m124016a(tng.f46282b, a.mo26593c(), bxus.m123744c());
            } catch (bxwf e) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("dof", "d", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[AccountManager] Bad proto");
            }
            if (tng != null) {
                bxwc bxwc = tng.f46284a;
                int size = bxwc.size();
                for (int i = 0; i < size; i++) {
                    this.f13685a.add(m8924b(((tnf) bxwc.get(i)).f46281b));
                }
            }
        }
    }

    /* renamed from: e */
    private final void m8926e() {
        bxvd da = tng.f46282b.mo74144da();
        Iterator it = this.f13685a.iterator();
        while (it.hasNext()) {
            bxvd da2 = tnf.f46278c.mo74144da();
            String str = ((doh) it.next()).f13690b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            tnf tnf = (tnf) da2.f164949b;
            str.getClass();
            tnf.f46280a |= 1;
            tnf.f46281b = str;
            tnf tnf2 = (tnf) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            tng tng = (tng) da.f164949b;
            tnf2.getClass();
            if (!tng.f46284a.mo73666a()) {
                tng.f46284a = GeneratedMessageLite.m124021a(tng.f46284a);
            }
            tng.f46284a.add(tnf2);
        }
        dwq.m9673q().mo10051a(tjq.m37091a(3, (tng) da.mo74062i()));
    }

    /* renamed from: c */
    public final void mo9335c() {
        if (!this.f13687c) {
            this.f13687c = true;
            tng tng = null;
            tjq a = dwq.m9673q().mo10053a((doh) null, 3);
            if (a != null) {
                try {
                    tng = (tng) GeneratedMessageLite.m124016a(tng.f46282b, a.mo26593c(), bxus.m123744c());
                } catch (bxwf e) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("dof", "d", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("[AccountManager] Bad proto");
                }
                if (tng != null) {
                    bxwc bxwc = tng.f46284a;
                    int size = bxwc.size();
                    for (int i = 0; i < size; i++) {
                        this.f13685a.add(m8924b(((tnf) bxwc.get(i)).f46281b));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final Set mo9331a() {
        mo9335c();
        return (Set) this.f13685a.clone();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, doh, int]
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
    public final boolean mo9333b() {
        Set<doh> a = mo9331a();
        if (!a.isEmpty()) {
            tit tit = new tit();
            tit.mo26579a(-1);
            tit.mo26582b(1);
            tiu a2 = tit.mo26578a();
            eel p = dwq.m9672p();
            for (doh doh : a) {
                eej a3 = p.mo10037a((ContextDataFilterImpl) a2, dwq.m9652a(doh, "AccountManager"));
                if (a3.f14775a != 0) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                    bnsl.mo68432a("dof", "b", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68422a("[AccountManager] Can't read store: %s, %s", (Object) doh, a3.f14775a);
                } else {
                    ArrayList arrayList = a3.f14776b;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo9332a(doh doh) {
        mo9335c();
        if (!this.f13685a.contains(doh)) {
            this.f13685a.add(doh);
            m8926e();
        }
    }

    /* renamed from: b */
    public final boolean mo9334b(doh doh) {
        return soz.m35791a(this.f13686b, doh.mo9337a());
    }

    /* renamed from: c */
    public final void mo9336c(doh doh) {
        mo9335c();
        if (this.f13685a.remove(doh)) {
            m8926e();
        }
    }
}
