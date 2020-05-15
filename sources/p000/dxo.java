package p000;

import android.content.Context;
import android.text.TextUtils;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: dxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxo extends dwm implements dvw {

    /* renamed from: a */
    public final dxn f14364a = new dxn();

    /* renamed from: b */
    public final HashMap f14365b = new HashMap();

    /* renamed from: c */
    private final Context f14366c;

    public dxo(Context context) {
        this.f14366c = context;
    }

    /* renamed from: a */
    private static final doh m9758a(doh doh, dxr dxr) {
        return dxr.f14371e ? doh.f13688a : doh;
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
    /* renamed from: c */
    private final dyd m9759c(doh doh, bxco bxco) {
        dxr a = this.f14364a.mo9832a(bxco.f162973bD);
        if (a == null) {
            Object[] objArr = {doh, Integer.valueOf(bxco.f162973bD)};
            return null;
        }
        dxt dxt = (dxt) this.f14365b.get(m9758a(doh, a));
        if (dxt != null) {
            dxs dxs = (dxs) dxt.f14375b.get(a);
            if (dxs != null) {
                return dxs.f14372a;
            }
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dxo", "c", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68422a("[ProducerManager] runningProducer for account=%s, contextName=%s is null.", (Object) doh, bxco.f162973bD);
            return null;
        }
        Object[] objArr2 = {doh, Integer.valueOf(bxco.f162973bD)};
        return null;
    }

    /* renamed from: b */
    public final void mo9394b(doh doh, bxco bxco) {
        Object[] objArr = {Integer.toString(bxco.f162973bD), doh};
        HashSet b = this.f14364a.mo9833b(bxco.f162973bD);
        if (b != null) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                dxr dxr = (dxr) it.next();
                dxt dxt = (dxt) this.f14365b.get(m9758a(doh, dxr));
                if (dxt != null) {
                    int i = bxco.f162973bD;
                    dxs dxs = (dxs) dxt.f14375b.get(dxr);
                    if (dxs != null) {
                        if (dxr.f14371e) {
                            dyd dyd = dxs.f14372a;
                            sdo.m34974b(dyd.f14390f.f14371e);
                            Object[] objArr2 = {doh, dyd.f14387c, Integer.valueOf(dyd.f14392h.size()), Boolean.valueOf(dyd.f14392h.remove(doh))};
                        }
                        if (!dxr.f14371e || sqw.m36041a((Collection) dxs.f14372a.f14392h)) {
                            dxs.f14373b.remove(Integer.valueOf(i));
                            if (dxs.f14373b.isEmpty()) {
                                dxs.f14372a.mo9860f();
                                dxt.f14375b.remove(dxr);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo9834a(int i) {
        dxr a = this.f14364a.mo9832a(i);
        if (a != null) {
            return a.mo9837a(i);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo9389a(doh doh, bxco bxco) {
        doh doh2;
        HashSet b = this.f14364a.mo9833b(bxco.f162973bD);
        if (b != null) {
            Object[] objArr = {Integer.toString(bxco.f162973bD), doh};
            Iterator it = b.iterator();
            while (it.hasNext()) {
                dxr dxr = (dxr) it.next();
                dxt dxt = (dxt) this.f14365b.get(m9758a(doh, dxr));
                if (dxt == null) {
                    dxt = new dxt(this.f14366c);
                    this.f14365b.put(m9758a(doh, dxr), dxt);
                }
                int i = bxco.f162973bD;
                dxs dxs = (dxs) dxt.f14375b.get(dxr);
                if (dxs == null) {
                    Context context = dxt.f14374a;
                    dxp dxp = dxr.f14367a;
                    if (dxr.f14371e) {
                        doh2 = doh.f13688a;
                    } else {
                        doh2 = doh;
                    }
                    dxs = new dxs(dxp.mo9836a(context, doh2));
                    dxt.f14375b.put(dxr, dxs);
                    dxs.f14372a.mo9859e();
                }
                if (dxr.f14371e) {
                    dyd dyd = dxs.f14372a;
                    sdo.m34974b(dyd.f14390f.f14371e);
                    boolean add = dyd.f14392h.add(doh);
                    Object[] objArr2 = {doh, dyd.f14387c, Integer.valueOf(dyd.f14392h.size()), Boolean.valueOf(add)};
                    WriteBatchImpl writeBatchImpl = dyd.f14393i;
                    if (writeBatchImpl != null && add) {
                        new Object[1][0] = writeBatchImpl;
                        dyd.mo9853a(writeBatchImpl, lri.m19583b(dyd.f14390f.f14368b, doh.mo9337a()));
                    }
                }
                dxs.f14373b.add(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: a */
    public final void mo9390a(doh doh, dwa dwa) {
        dyd c = m9759c(doh, dwa.mo9747b());
        if (c != null) {
            c.mo9854a(dwa);
        }
    }

    /* renamed from: a */
    public final void mo9391a(doh doh, dwa dwa, dwa dwa2) {
        dyd c = m9759c(doh, dwa.mo9747b());
        if (c == null) {
            return;
        }
        if (dwa2 == null) {
            c.mo9855a(dwa, (dwa) null);
        } else if (dwa.mo9747b() == dwa2.mo9747b()) {
            c.mo9855a(dwa, dwa2);
        } else {
            dyd c2 = m9759c(doh, dwa2.mo9747b());
            if (c2 != null) {
                c2.mo9854a(dwa2);
            }
            c.mo9855a(dwa, (dwa) null);
        }
    }

    /* renamed from: a */
    public final void mo9835a(dxr dxr) {
        dxn dxn = this.f14364a;
        int[] iArr = dxr.f14369c;
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            dxr dxr2 = (dxr) dxn.f14363a.get(i2);
            if (dxr2 == null || TextUtils.equals(dxr2.f14368b, dxr.f14368b)) {
                dxn.f14363a.put(i2, dxr);
                i++;
            } else {
                String str = dxr2.f14368b;
                String num = Integer.toString(i2);
                String str2 = dxr.f14368b;
                int length2 = String.valueOf(str).length();
                int length3 = String.valueOf(num).length();
                StringBuilder sb = new StringBuilder(length2 + ErrorInfo.TYPE_SDU_FAILED + length3 + String.valueOf(str2).length());
                sb.append("Module ");
                sb.append(str);
                sb.append(" already produces context name ");
                sb.append(num);
                sb.append(".  Cannot add  module ");
                sb.append(str2);
                sb.append(" because it also produces this context data.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
}
