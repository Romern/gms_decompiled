package p000;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.p065ui.TargetChimeraActivity;

/* renamed from: arld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arld extends adzt {

    /* renamed from: a */
    final /* synthetic */ arjb f87840a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arld(arjb arjb, Looper looper) {
        super(looper);
        this.f87840a = arjb;
    }

    public final void handleMessage(Message message) {
        Bundle bundle;
        try {
            int i = message.what;
            if (i == 0) {
                areb areb = this.f87840a.f87787a;
                TargetConnectionArgs targetConnectionArgs = (TargetConnectionArgs) message.obj;
                areb areb2 = ((arey) areb).f87552a;
                arps.f88090a.mo25409a("Device connected", new Object[0]);
                armc armc = ((arpp) areb2).f88084a.f88098i;
                bxvd bxvd = armc.f87880c;
                long currentTimeMillis = System.currentTimeMillis() - armc.f87878a;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boeb boeb = (boeb) bxvd.f164949b;
                boeb boeb2 = boeb.f132758u;
                boeb.f132760a |= 4;
                boeb.f132762c = currentTimeMillis;
                ((arpp) areb2).f88084a.f88096g.mo48707b(111, Bundle.EMPTY);
            } else if (i == 1) {
                areb areb3 = this.f87840a.f87787a;
                ((arey) areb3).f87553b.mo48476a("target_nearby_api");
                areb areb4 = ((arey) areb3).f87552a;
                arps.f88090a.mo25409a("TargetBootstrapListener.onDisconnected()", new Object[0]);
                arps arps = ((arpp) areb4).f88084a;
                if (arps.f88092c && arps.f88095f != 2) {
                    arps.mo48738a();
                }
            } else if (i == 2) {
                BootstrapCompletionResult bootstrapCompletionResult = message.obj != null ? (BootstrapCompletionResult) message.obj : null;
                areb areb5 = this.f87840a.f87787a;
                ((arey) areb5).f87553b.mo48476a("target_nearby_api");
                areb areb6 = ((arey) areb5).f87552a;
                ((arpp) areb6).f88084a.f88095f = 2;
                arps.f88090a.mo25409a("TargetBootstrapListener.onCompleted()", new Object[0]);
                arps arps2 = ((arpp) areb6).f88084a;
                if (arps2.f88099j) {
                    if (arps2.f88094e == null) {
                        arps2.f88096g.mo48707b(108, Bundle.EMPTY);
                        return;
                    }
                }
                Bundle bundle2 = arps2.f88094e;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    String string = bundle2.getString("restoreAccount");
                    String string2 = bundle2.getString("restoreToken");
                    sek sek = arps.f88090a;
                    String valueOf = String.valueOf(string);
                    sek.mo25409a(valueOf.length() == 0 ? new String("restoreAccountId: ") : "restoreAccountId: ".concat(valueOf), new Object[0]);
                    sek sek2 = arps.f88090a;
                    String valueOf2 = String.valueOf(string2);
                    sek2.mo25409a(valueOf2.length() == 0 ? new String("restoreToken: ") : "restoreToken: ".concat(valueOf2), new Object[0]);
                    if (TextUtils.isEmpty(string)) {
                        arps.f88090a.mo25412b("Restore account is null or empty.", new Object[0]);
                    }
                    bundle.putString("restoreAccount", string);
                    bundle.putString("restoreToken", string2);
                    bundle.putParcelableArrayList("accounts", bundle2.getParcelableArrayList("accounts"));
                } else {
                    bundle = Bundle.EMPTY;
                }
                boolean z = ((arpp) areb6).f88084a.f88097h;
                arps.f88090a.mo25409a("handleResults()", new Object[0]);
                TargetChimeraActivity targetChimeraActivity = (TargetChimeraActivity) arps2.getActivity();
                if (targetChimeraActivity == null) {
                    arps2.f88101l = new arpq(bundle, z, bootstrapCompletionResult);
                    arps.f88090a.mo25418e("TargetChimeraActivity is null in doneToSuw()", new Object[0]);
                    return;
                }
                targetChimeraActivity.mo59128a(bundle, z, bootstrapCompletionResult);
            } else if (i == 3) {
                areb areb7 = this.f87840a.f87787a;
                arps.f88090a.mo25409a((String) message.obj, new Object[0]);
            } else if (i == 4) {
                areb areb8 = this.f87840a.f87787a;
                String str = (String) message.obj;
                areb areb9 = ((arey) areb8).f87552a;
                sek sek3 = arps.f88090a;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
                sb.append("TargetBootstrapListener.onPinProvided(");
                sb.append(str);
                sb.append(")");
                sek3.mo25409a(sb.toString(), new Object[0]);
                arps arps3 = ((arpp) areb9).f88084a;
                arps.f88090a.mo25409a("startPinCode()", new Object[0]);
                Bundle bundle3 = new Bundle();
                bundle3.putString("pin.code", str);
                arps3.f88096g.mo48707b(113, bundle3);
            } else if (i == 5) {
                areb areb10 = this.f87840a.f87787a;
                int intValue = ((Integer) message.obj).intValue();
                if (intValue != 8004) {
                    ((arey) areb10).f87553b.mo48476a("target_nearby_api");
                }
                areb areb11 = ((arey) areb10).f87552a;
                if (intValue != 8004) {
                    sek sek4 = arps.f88090a;
                    String valueOf3 = String.valueOf(araj.m72321a(intValue));
                    sek4.mo25418e(valueOf3.length() == 0 ? new String("Something went wrong: ") : "Something went wrong: ".concat(valueOf3), new Object[0]);
                    ((arpp) areb11).f88084a.mo48738a();
                    return;
                }
                ((arpp) areb11).f88084a.f88096g.mo48707b(115, Bundle.EMPTY);
            } else {
                int i2 = message.what;
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unrecognized message: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        } catch (RemoteException e) {
            Log.e("SmartDevice", "Error invoking ISourceBootstrapListener.", e);
        }
    }
}
