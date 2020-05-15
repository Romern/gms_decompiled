package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: ali */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ali extends Handler {

    /* renamed from: a */
    private final WeakReference f829a;

    public ali(alj alj) {
        this.f829a = new WeakReference(alj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9  */
    public final void handleMessage(Message message) {
        alf a;
        aky aky;
        aky a2;
        aky a3;
        alf a4;
        aky a5;
        alf a6;
        aky a7;
        aky a8;
        akp akp;
        alf a9;
        Bundle bundle;
        alf a10;
        alf a11;
        alf a12;
        Messenger messenger = message.replyTo;
        if (alc.m998a(messenger)) {
            int i = message.what;
            int i2 = message.arg1;
            int i3 = message.arg2;
            Object obj = message.obj;
            Bundle peekData = message.peekData();
            alj alj = (alj) this.f829a.get();
            if (alj != null) {
                int i4 = 0;
                ald ald = null;
                r10 = null;
                akp akp2 = null;
                switch (i) {
                    case 1:
                        if (i3 > 0 && alj.mo968b(messenger) < 0) {
                            alf alf = new alf(alj, messenger, i3);
                            try {
                                alf.f821a.getBinder().linkToDeath(alf, 0);
                                alj.f830a.add(alf);
                                if (i2 != 0) {
                                    alj.m1008a(messenger, 2, i2, 2, alj.m1006a(alj.f832c.f808g, alf.f822b), null);
                                    return;
                                }
                                return;
                            } catch (RemoteException e) {
                                alf.binderDied();
                                break;
                            }
                        }
                    case 2:
                        int b = alj.mo968b(messenger);
                        if (b >= 0) {
                            ((alf) alj.f830a.remove(b)).mo960a();
                            alj.m1007a(messenger, i2);
                            return;
                        }
                        break;
                    case 3:
                        String string = peekData.getString("routeId");
                        String string2 = peekData.getString("routeGroupId");
                        if (!(string == null || (a = alj.mo967a(messenger)) == null || a.f824d.indexOfKey(i3) >= 0)) {
                            aky a13 = string2 != null ? a.f826f.f832c.mo946a(string, string2) : a.f826f.f832c.mo945a(string);
                            if (a13 != null) {
                                a.f824d.put(i3, a13);
                                alj.m1007a(messenger, i2);
                                return;
                            }
                        }
                        break;
                    case 4:
                        alf a14 = alj.mo967a(messenger);
                        if (!(a14 == null || (aky = (aky) a14.f824d.get(i3)) == null)) {
                            a14.f824d.remove(i3);
                            aky.mo941c();
                            alj.m1007a(messenger, i2);
                            return;
                        }
                    case 5:
                        alf a15 = alj.mo967a(messenger);
                        if (!(a15 == null || (a2 = a15.mo959a(i3)) == null)) {
                            a2.mo943d();
                            alj.m1007a(messenger, i2);
                            return;
                        }
                    case 6:
                        if (peekData != null) {
                            i4 = peekData.getInt("unselectReason", 0);
                        }
                        alf a16 = alj.mo967a(messenger);
                        if (!(a16 == null || (a3 = a16.mo959a(i3)) == null)) {
                            a3.mo938a(i4);
                            alj.m1007a(messenger, i2);
                            return;
                        }
                    case 7:
                        int i5 = peekData.getInt("volume", -1);
                        if (!(i5 < 0 || (a4 = alj.mo967a(messenger)) == null || (a5 = a4.mo959a(i3)) == null)) {
                            a5.mo940b(i5);
                            alj.m1007a(messenger, i2);
                            return;
                        }
                    case 8:
                        int i6 = peekData.getInt("volume", 0);
                        if (!(i6 == 0 || (a6 = alj.mo967a(messenger)) == null || (a7 = a6.mo959a(i3)) == null)) {
                            a7.mo942c(i6);
                            alj.m1007a(messenger, i2);
                            return;
                        }
                    case 9:
                        if (obj instanceof Intent) {
                            Intent intent = (Intent) obj;
                            alf a17 = alj.mo967a(messenger);
                            if (!(a17 == null || (a8 = a17.mo959a(i3)) == null)) {
                                if (i2 != 0) {
                                    ald = new ald(alj, messenger, i2);
                                }
                                if (a8.mo939a(intent, ald)) {
                                    return;
                                }
                            }
                        }
                        break;
                    case 10:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle2 = (Bundle) obj;
                            if (bundle2 != null) {
                                akp = new akp(bundle2);
                            } else {
                                akp = null;
                            }
                            if (akp != null && akp.mo921c()) {
                                akp2 = akp;
                            }
                            alf a18 = alj.mo967a(messenger);
                            if (a18 != null) {
                                a18.mo961a(akp2);
                                alj.m1007a(messenger, i2);
                                return;
                            }
                        }
                        break;
                    case 11:
                        String string3 = peekData.getString("memberRouteId");
                        if (!(string3 == null || (a9 = alj.mo967a(messenger)) == null)) {
                            if (a9.f824d.indexOfKey(i3) < 0) {
                                akv b2 = a9.f826f.f832c.mo950b(string3);
                                b2.mo932a(C1133kh.m17846d(a9.f826f.getApplicationContext()), a9.f825e);
                                if (b2 != null) {
                                    a9.f824d.put(i3, b2);
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("routeId", string3);
                                    bundle3.putString("groupableTitle", b2.mo929a());
                                    bundle3.putString("transferableTitle", b2.mo933b());
                                    bundle = bundle3;
                                    if (bundle != null) {
                                        alj.m1008a(messenger, 6, i2, 2, bundle, null);
                                        return;
                                    }
                                }
                            }
                            bundle = null;
                            if (bundle != null) {
                            }
                        }
                        break;
                    case 12:
                        String string4 = peekData.getString("memberRouteId");
                        if (!(string4 == null || (a10 = alj.mo967a(messenger)) == null)) {
                            aky a19 = a10.mo959a(i3);
                            if (a19 instanceof akv) {
                                ((akv) a19).mo930a(string4);
                                alj.m1007a(messenger, i2);
                                return;
                            }
                        }
                        break;
                    case 13:
                        String string5 = peekData.getString("memberRouteId");
                        if (!(string5 == null || (a11 = alj.mo967a(messenger)) == null)) {
                            aky a20 = a11.mo959a(i3);
                            if (a20 instanceof akv) {
                                ((akv) a20).mo934b(string5);
                                alj.m1007a(messenger, i2);
                                return;
                            }
                        }
                        break;
                    case 14:
                        ArrayList<String> stringArrayList = peekData.getStringArrayList("memberRouteIds");
                        if (!(stringArrayList == null || (a12 = alj.mo967a(messenger)) == null)) {
                            aky a21 = a12.mo959a(i3);
                            if (a21 instanceof akv) {
                                ((akv) a21).mo931a(stringArrayList);
                                alj.m1007a(messenger, i2);
                                return;
                            }
                        }
                        break;
                }
            }
            if (i2 != 0) {
                alj.m1008a(messenger, 0, i2, 0, null, null);
            }
        }
    }
}
