package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.PhoneNumberInfo;
import com.google.android.gms.constellation.PhoneNumberVerification;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: syl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class syl extends tdl {

    /* renamed from: a */
    final /* synthetic */ sym f45438a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public syl(sym sym, Handler handler) {
        super(handler);
        this.f45438a = sym;
    }

    /* renamed from: a */
    public final void mo11624a(tdw tdw) {
        sym sym = this.f45438a;
        Logger Logger = sym.f45439a;
        sym.f45443e.mo26404a(sym.f45444f, 17, tdw);
        Status status = Status.f30109c;
        if (tdw instanceof tdt) {
            status = new Status(5001);
        } else if (tdw instanceof tdu) {
            status = new Status(5002);
        } else if (tdw instanceof tdv) {
            status = new Status(5003);
        }
        try {
            sym sym2 = this.f45438a;
            if (sym2.f45442d == 1) {
                sym2.f45441c.mo26221a(status, (List) null);
            } else {
                sym2.f45441c.mo26248a(status, (VerifyPhoneNumberResponse) null);
            }
        } catch (RemoteException e) {
            sym.f45439a.mo25415d("Remote exception:", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo11625a(boolean z, Map map) {
        int i;
        String str;
        Bundle bundle;
        Iterator it;
        long j;
        int i2;
        Bundle bundle2;
        boolean z2 = z;
        Map map2 = map;
        sym sym = this.f45438a;
        Logger Logger = sym.f45439a;
        int i3 = 0;
        if (sym.f45442d == 1) {
            sym.f45443e.mo26405a(sym.f45444f, 17, z2);
            try {
                szr.m36692a();
                List<Pair> b = szr.m36696b();
                ArrayList arrayList = new ArrayList();
                for (Pair pair : b) {
                    if (map2 == null || !map2.containsKey(pair.first)) {
                        bundle2 = Bundle.EMPTY;
                    } else {
                        bundle2 = (Bundle) map2.get(pair.first);
                    }
                    arrayList.add(new PhoneNumberInfo((String) pair.first, (Long) pair.second, bundle2));
                }
                sym.f45441c.mo26221a(Status.f30107a, arrayList);
            } catch (tdw e) {
                try {
                    sym.f45441c.mo26221a(new Status(5004), (List) null);
                } catch (RemoteException e2) {
                    sym.f45439a.mo25415d("Remote exception: ", e2, new Object[0]);
                }
            }
        } else {
            sym.f45443e.mo26405a(sym.f45444f, 11, z2);
            try {
                szr.m36692a();
                List b2 = szr.m36696b();
                syi syi = new syi();
                Iterator it2 = b2.iterator();
                while (it2.hasNext()) {
                    Pair pair2 = (Pair) it2.next();
                    cbob cbob = cbob.UNKNOWN;
                    int i4 = syf.f45418h;
                    int i5 = -1;
                    if (map2 == null || !map2.containsKey(pair2.first) || map2.get(pair2.first) == null) {
                        bundle = Bundle.EMPTY;
                        str = null;
                        i = -1;
                    } else {
                        bundle = (Bundle) ((Bundle) map2.get(pair2.first)).clone();
                        try {
                            cbob = cbob.m128037a(bundle.getString("verification_method"));
                        } catch (IllegalArgumentException e3) {
                            Logger logger2 = sym.f45439a;
                            Object[] objArr = new Object[1];
                            objArr[i3] = bundle.getString("verification_method", "null");
                            logger2.mo25416d("Invalid verification method: ", objArr);
                        } catch (NullPointerException e4) {
                            sym.f45439a.mo25416d("Verification method missing", new Object[i3]);
                        }
                        bundle.remove("verification_method");
                        try {
                            i5 = Integer.parseInt(bundle.getString("sim_slot_index", ""));
                        } catch (NumberFormatException e5) {
                            sym.f45439a.mo25416d("Sim slot info not available", new Object[i3]);
                        }
                        bundle.remove("sim_slot_index");
                        String string = bundle.getString("id_token", null);
                        bundle.remove("id_token");
                        str = string;
                        i = i5;
                    }
                    sxz sxz = new sxz();
                    sxz.f45407a = (String) pair2.first;
                    if (pair2.second != null) {
                        it = it2;
                        j = ((Long) pair2.second).longValue();
                    } else {
                        it = it2;
                        j = 0;
                    }
                    sxz.f45408b = j;
                    if (sym.f45440b.containsKey(cbob)) {
                        i2 = ((Integer) sym.f45440b.get(cbob)).intValue();
                    } else {
                        i2 = 0;
                    }
                    sxz.f45409c = str;
                    sxz.f45410d = bundle;
                    if (i2 != 0) {
                        if (!(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7)) {
                            if (i2 != 8) {
                                throw new IllegalStateException("Invalid VerificationMethod.");
                            }
                        }
                    }
                    syi.f45433a.add(new PhoneNumberVerification(sxz.f45407a, sxz.f45408b, i2, i, sxz.f45409c, sxz.f45410d));
                    it2 = it;
                    i3 = 0;
                }
                syy syy = sym.f45441c;
                Status status = Status.f30107a;
                List list = syi.f45433a;
                syy.mo26248a(status, new VerifyPhoneNumberResponse((PhoneNumberVerification[]) list.toArray(new PhoneNumberVerification[list.size()])));
            } catch (tdw e6) {
                try {
                    sym.f45441c.mo26248a(new Status(5004), (VerifyPhoneNumberResponse) null);
                } catch (RemoteException e7) {
                    sym.f45439a.mo25415d("Remote exception: ", e7, new Object[0]);
                }
            }
        }
    }
}
