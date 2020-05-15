package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.Locale;

/* renamed from: awwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awwx extends sji {

    /* renamed from: a */
    public static final byte[] f95210a = new byte[0];

    /* renamed from: d */
    private final awwt f95211d;

    /* renamed from: e */
    private final GetClientTokenRequest f95212e;

    /* renamed from: f */
    private final Bundle f95213f;

    /* renamed from: g */
    private final awnl f95214g;

    /* renamed from: h */
    private final Context f95215h;

    /* renamed from: i */
    private final String f95216i;

    /* renamed from: j */
    private final rfz f95217j;

    public awwx(Context context, GetClientTokenRequest getClientTokenRequest, Bundle bundle, awnl awnl, awwt awwt, String str, rfz rfz) {
        super(4, "getClientToken");
        this.f95215h = context;
        this.f95212e = getClientTokenRequest;
        this.f95213f = bundle;
        this.f95214g = awnl;
        this.f95211d = awwt;
        this.f95216i = str;
        this.f95217j = rfz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        this.f95217j.mo24605a(this.f95216i);
        BuyFlowConfig b = awxj.m81404b(this.f95213f);
        bxvd da = bpic.f137715f.mo74144da();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bwhf a = awfx.m79880a(this.f95215h, C0126R.style.Theme_Wallet_Dark);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (this.f95212e.f110162b) {
            bwhe bwhe = bwhe.f159496c;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bwhf bwhf = (bwhf) bxvd.f164949b;
            bwhf bwhf2 = bwhf.f159500e;
            bwhe.getClass();
            bwhf.f159505d = bwhe;
            bwhf.f159502a |= 8;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpic bpic = (bpic) da.f164949b;
            bpic.f137717a |= 4;
            bpic.f137720d = true;
            Account account = b.f110418b.f110407b;
            if (account != null) {
                rjr b2 = this.f95211d.mo65548b(b, account, null);
                if (b2.f43154a.mo17710c()) {
                    boolean z = b2.f43155b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpic bpic2 = (bpic) da.f164949b;
                    bpic2.f137717a |= 8;
                    bpic2.f137721e = z;
                    bmkn bmkn = (bmkn) bmks.f129878d.mo74144da();
                    boolean z2 = !z;
                    if (bmkn.f164950c) {
                        bmkn.mo74035c();
                        bmkn.f164950c = false;
                    }
                    bmks bmks = (bmks) bmkn.f164949b;
                    bmks.f129880a |= 1;
                    bmks.f129881b = z2;
                    bmks bmks2 = (bmks) bmkn.mo74062i();
                    if (z) {
                        asmi c = this.f95211d.mo65549c(b, account, null);
                        if (c.mo7183bo().mo17710c()) {
                            bxvd bxvd2 = (bxvd) bmks2.mo74142c(5);
                            bxvd2.mo73625a((GeneratedMessageLite) bmks2);
                            bmkn bmkn2 = (bmkn) bxvd2;
                            if (bmkn2.f164950c) {
                                bmkn2.mo74035c();
                                bmkn2.f164950c = false;
                            }
                            ((bmks) bmkn2.f164949b).f129882c = GeneratedMessageLite.m124030de();
                            bmkn2.mo66799a(awrt.m80838a(c.mo49240b().f108367a));
                            bmks2 = (bmks) bmkn2.mo74062i();
                        } else {
                            Log.w("GetClientTokenOperation", String.format(Locale.US, "Failed to fetch cards for Android Pay! status = %s message = %s", Integer.valueOf(c.mo7183bo().f30115i), c.mo7183bo().f30116j));
                            awxj.m81402a(this.f95215h, b, da, 4, elapsedRealtime);
                            this.f95214g.mo52336a(Status.f30109c, new GetClientTokenResponse(f95210a), Bundle.EMPTY);
                            return;
                        }
                    }
                    bxvd da2 = bwhe.f159496c.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bwhe bwhe2 = (bwhe) da2.f164949b;
                    bmks2.getClass();
                    bwhe2.f159499b = bmks2;
                    bwhe2.f159498a |= 1;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bwhf bwhf3 = (bwhf) bxvd.f164949b;
                    bwhe bwhe3 = (bwhe) da2.mo74062i();
                    bwhe3.getClass();
                    bwhf3.f159505d = bwhe3;
                    bwhf3.f159502a |= 8;
                } else {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    StringBuilder sb = new StringBuilder(73);
                    sb.append("get serviceLayerEnabledResult failed, current time : ");
                    sb.append(elapsedRealtime2);
                    sb.toString();
                    Log.w("GetClientTokenOperation", String.format(Locale.US, "Service layer check failed! status = %s message = %s", Integer.valueOf(b2.f43154a.f30115i), b2.f43154a.f30116j));
                    awxj.m81402a(this.f95215h, b, da, 3, elapsedRealtime);
                    this.f95214g.mo52336a(Status.f30109c, new GetClientTokenResponse(f95210a), Bundle.EMPTY);
                    return;
                }
            } else {
                Log.e("GetClientTokenOperation", "GetClientToken called for facilitated payments with null account");
                awxj.m81402a(this.f95215h, b, da, 5, elapsedRealtime);
                this.f95214g.mo52336a(new Status(10, "GetClientToken requires a valid account for facilitated payments."), new GetClientTokenResponse(new byte[0]), Bundle.EMPTY);
                return;
            }
        }
        bxvd da3 = bwhg.f159506d.mo74144da();
        bmaj a2 = awfx.m79877a(this.f95215h, null, b, this.f95216i, false, true);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bwhg bwhg = (bwhg) da3.f164949b;
        a2.getClass();
        bwhg.f159509b = a2;
        bwhg.f159508a |= 1;
        bwhf bwhf4 = (bwhf) bxvd.mo74062i();
        bwhf4.getClass();
        bwhg.f159510c = bwhf4;
        bwhg.f159508a |= 2;
        byte[] k = ((bwhg) da3.mo74062i()).serializeToBytes();
        awxj.m81402a(this.f95215h, b, da, 2, elapsedRealtime);
        Locale locale = Locale.US;
        Object[] objArr = {Long.valueOf(elapsedRealtime), Long.valueOf(SystemClock.elapsedRealtime())};
        this.f95214g.mo52336a(Status.f30107a, new GetClientTokenResponse(k), Bundle.EMPTY);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f95214g.mo52336a(Status.f30109c, new GetClientTokenResponse(f95210a), Bundle.EMPTY);
    }
}
