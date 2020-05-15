package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: amp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amp extends Handler {

    /* renamed from: a */
    public final WeakReference f918a;

    public amp(amm amm) {
        this.f918a = new WeakReference(amm);
    }

    public final void handleMessage(Message message) {
        akt akt;
        Message message2 = message;
        amm amm = (amm) this.f918a.get();
        if (amm != null) {
            int i = message2.what;
            int i2 = message2.arg1;
            int i3 = message2.arg2;
            Object obj = message2.obj;
            Bundle peekData = message.peekData();
            String str = null;
            Object obj2 = null;
            int i4 = 0;
            if (i != 0) {
                switch (i) {
                    case 2:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle = (Bundle) obj;
                            if (amm.f913e == 0 && i2 == amm.f914f && i3 > 0) {
                                amm.f914f = 0;
                                amm.f913e = i3;
                                amm.f916h.mo1049a(amm, alb.m996a(bundle));
                                amt amt = amm.f916h;
                                if (amt.f941m == amm) {
                                    amt.f942n = true;
                                    int size = amt.f939k.size();
                                    for (int i5 = 0; i5 < size; i5++) {
                                        ((amn) amt.f939k.get(i5)).mo1044a(amt.f941m);
                                    }
                                    akp akp = amt.f806e;
                                    if (akp != null) {
                                        amt.f941m.mo1037a(akp);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle2 = (Bundle) obj;
                            alo alo = (alo) amm.f915g.get(i2);
                            if (alo != null) {
                                amm.f915g.remove(i2);
                                alo.mo957a(bundle2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        if (obj == null || (obj instanceof Bundle)) {
                            if (peekData != null) {
                                str = peekData.getString("error");
                            }
                            Bundle bundle3 = (Bundle) obj;
                            alo alo2 = (alo) amm.f915g.get(i2);
                            if (alo2 != null) {
                                amm.f915g.remove(i2);
                                alo2.mo958a(str, bundle3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle4 = (Bundle) obj;
                            if (amm.f913e != 0) {
                                amm.f916h.mo1049a(amm, alb.m996a(bundle4));
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        if (obj instanceof Bundle) {
                            Bundle bundle5 = (Bundle) obj;
                            alo alo3 = (alo) amm.f915g.get(i2);
                            if (bundle5 == null || !bundle5.containsKey("routeId")) {
                                alo3.mo958a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                return;
                            }
                            amm.f915g.remove(i2);
                            alo3.mo957a(bundle5);
                            return;
                        }
                        Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                        return;
                    case 7:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle6 = (Bundle) obj;
                            if (amm.f913e != 0) {
                                ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                ArrayList arrayList = new ArrayList();
                                int size2 = parcelableArrayList.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    Bundle bundle7 = (Bundle) parcelableArrayList.get(i6);
                                    if (bundle7 != null) {
                                        akt = new akt(ako.m943a(bundle7.getBundle("mrDescriptor")), bundle7.getInt("selectionState", 1), bundle7.getBoolean("isUnselectable", false), bundle7.getBoolean("isGroupable", false), bundle7.getBoolean("isTransferable", false));
                                    } else {
                                        akt = null;
                                    }
                                    arrayList.add(akt);
                                }
                                amt amt2 = amm.f916h;
                                if (amt2.f941m == amm) {
                                    ArrayList arrayList2 = amt2.f939k;
                                    int size3 = arrayList2.size();
                                    while (true) {
                                        if (i4 < size3) {
                                            amn amn = (amn) arrayList2.get(i4);
                                            i4++;
                                            if (amn.mo1045f() == i3) {
                                                obj2 = amn;
                                            }
                                        }
                                    }
                                    if (obj2 instanceof amr) {
                                        amr amr = (amr) obj2;
                                        synchronized (amr.f796a) {
                                            Executor executor = amr.f797b;
                                            if (executor == null) {
                                                amr.f799d = new ArrayList(arrayList);
                                            } else {
                                                executor.execute(new aks(amr, amr.f798c, arrayList));
                                            }
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                if (i2 == amm.f914f) {
                    amm.f914f = 0;
                    amt amt3 = amm.f916h;
                    if (amt3.f941m == amm) {
                        amt3.mo1054e();
                    }
                }
                alo alo4 = (alo) amm.f915g.get(i2);
                if (alo4 != null) {
                    amm.f915g.remove(i2);
                    alo4.mo958a(null, null);
                }
            }
        }
    }
}
