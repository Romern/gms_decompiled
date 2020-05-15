package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.gms.identity.intents.UserAddressRequest;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import com.google.android.gms.wallet.service.orchestration.GenericSelectorInitializeRequest;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import java.util.List;

/* renamed from: awpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awpy extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ Bundle f94833a;

    /* renamed from: b */
    final /* synthetic */ UserAddressRequest f94834b;

    /* renamed from: c */
    final /* synthetic */ adcy f94835c;

    /* renamed from: d */
    final /* synthetic */ adcx f94836d;

    public awpy(adcy adcy, Bundle bundle, UserAddressRequest userAddressRequest, adcx adcx) {
        this.f94835c = adcy;
        this.f94833a = bundle;
        this.f94834b = userAddressRequest;
        this.f94836d = adcx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52457a() {
        awqb awqb;
        int i;
        String str;
        bxtx bxtx;
        try {
            adcy adcy = this.f94835c;
            awqa awqa = new awqa(adcy.f61426a, adcy.f61427b, adcy.f61428c);
            Bundle bundle = this.f94833a;
            UserAddressRequest userAddressRequest = this.f94834b;
            String str2 = awqa.f94840c;
            awxz a = ApplicationParameters.m94173a();
            if (bundle.containsKey("com.google.android.gms.identity.intents.EXTRA_ACCOUNT")) {
                a.mo52739a((Account) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT"));
            } else {
                Account[] a2 = adyd.m51363a(awqa.f94838a).mo33916a("com.google");
                if (a2 != null && a2.length > 0) {
                    a.mo52739a(a2[0]);
                }
            }
            a.mo52742a(true);
            a.mo52744b(((Integer) awiz.f94512a.mo58455c()).intValue());
            a.mo52745c(bundle.getInt("com.google.android.gms.identity.intents.EXTRA_THEME", 1));
            awyb a3 = BuyFlowConfig.m94175a();
            a3.mo52749a(a.f95270a);
            a3.mo52751b(str2);
            a3.mo52752c("requestUserAddress");
            BuyFlowConfig a4 = a3.mo52748a();
            if (a4.f110418b.f110407b != null) {
                bxvd da = bmrb.f130459e.mo74144da();
                bmaj bmaj = bmaj.f128452m;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmrb bmrb = (bmrb) da.f164949b;
                bmaj.getClass();
                bmrb.f130464d = bmaj;
                bmrb.f130461a |= 1;
                bxvd da2 = bmra.f130453e.mo74144da();
                List list = userAddressRequest.f79115a;
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                bxvd da3 = bmqx.f130447d.mo74144da();
                try {
                    str = svr.m36484b(awqa.f94838a).mo26177b(awqa.f94840c).toString();
                } catch (PackageManager.NameNotFoundException e) {
                    str = awqa.f94838a.getString(C0126R.string.wallet_app_label_not_found);
                }
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bmqx bmqx = (bmqx) da3.f164949b;
                str.getClass();
                bmqx.f130449a |= 1;
                bmqx.f130451c = str;
                for (int i2 = 0; i2 < i; i2++) {
                    String str3 = ((CountrySpecification) userAddressRequest.f79115a.get(i2)).f79116a;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bmqx bmqx2 = (bmqx) da3.f164949b;
                    str3.getClass();
                    if (!bmqx2.f130450b.mo73666a()) {
                        bmqx2.f130450b = bxvk.m124021a(bmqx2.f130450b);
                    }
                    bmqx2.f130450b.add(str3);
                }
                bmqx bmqx3 = (bmqx) da3.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmra bmra = (bmra) da2.f164949b;
                bmqx3.getClass();
                bmra.f130457c = bmqx3;
                bmra.f130456b = 5;
                bmra.f130458d = 1;
                bmra.f130455a |= 1;
                bxtx aL = ((bmra) da2.mo74062i()).mo73639aL();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmrb bmrb2 = (bmrb) da.f164949b;
                aL.getClass();
                bmrb2.f130462b = 3;
                bmrb2.f130463c = aL;
                bmrb bmrb3 = (bmrb) da.mo74062i();
                ServerResponse a5 = awqa.f94839b.mo52586a(a4, new GenericSelectorInitializeRequest(a4.f110418b.f110407b, bmrb3));
                if (a5.mo60050c() == 52) {
                    bmrc bmrc = (bmrc) a5.mo60052e();
                    if ((bmrc.f130467a & 1) == 0) {
                        if (bmrc.f130468b == 5) {
                            bmbr bmbr = ((bmrf) bmrc.f130469c).f130477b;
                            if (bmbr == null) {
                                bmbr = bmbr.f128572L;
                            }
                            if (bmbr.f128592i.size() > 0) {
                                if (bmrb3.f130462b == 3) {
                                    bxtx = (bxtx) bmrb3.f130463c;
                                } else {
                                    bxtx = bxtx.f164797b;
                                }
                                byte[] k = bxtx.mo73780k();
                                Intent intent = new Intent("com.google.android.gms.identity.REQUEST_USER_ADDRESS");
                                intent.setClassName("com.google.android.gms", "com.google.android.gms.wallet.ow.ChooseAccountShimActivity");
                                intent.putExtra("com.google.android.gms.identity.intents.EXTA_CONFIG", a4);
                                intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_GENERIC_SELECTOR_SCENARIO", 1);
                                intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", k);
                                bjvp.m104735a(intent, "com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bmrc);
                                Context context = awqa.f94838a;
                                Bundle bundle2 = new Bundle();
                                bundle2.putParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT", spn.m35844a(context, intent, (int) JGCastService.FLAG_PRIVATE_DISPLAY));
                                awqb = new awqb(6, bundle2);
                            }
                        }
                        awqb = awqb.m80661a();
                    } else {
                        awqb = awqb.m80661a();
                    }
                } else {
                    awqb = awqb.m80661a();
                }
            } else {
                awqb = awqb.m80661a();
            }
            adcx adcx = this.f94836d;
            int i3 = awqb.f94841a;
            Bundle bundle3 = awqb.f94842b;
            Parcel bj = adcx.mo8529bj();
            bj.writeInt(i3);
            dcl.m8165a(bj, bundle3);
            adcx.mo8528b(2, bj);
        } catch (DeadObjectException e2) {
            Log.w("AddressChimeraService", "getAddress: DeadObjectException");
        } catch (RemoteException e3) {
            Log.e("AddressChimeraService", "Exception returning pending intent from getAddress", e3);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        mo52457a();
        return null;
    }
}
