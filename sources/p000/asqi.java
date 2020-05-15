package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.service.quickaccesswallet.GetWalletCardsCallback;
import android.service.quickaccesswallet.GetWalletCardsError;
import android.service.quickaccesswallet.GetWalletCardsRequest;
import android.service.quickaccesswallet.GetWalletCardsResponse;
import android.service.quickaccesswallet.QuickAccessWalletService;
import android.service.quickaccesswallet.SelectWalletCardRequest;
import android.service.quickaccesswallet.WalletCard;
import android.service.quickaccesswallet.WalletServiceEvent;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.globalactions.GlobalActionCard;
import com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: asqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asqi extends QuickAccessWalletService implements asqk {

    /* renamed from: a */
    public static final srn f89387a = srn.m36126a("QAWalletSvc", sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    static final int f89388b = ((int) TimeUnit.MINUTES.toMillis(5));

    /* renamed from: c */
    asqc f89389c;

    /* renamed from: d */
    bqgj f89390d;

    /* renamed from: a */
    public static WalletCard m74459a(GlobalActionCard globalActionCard) {
        Icon icon;
        WalletCard.Builder builder = new WalletCard.Builder(String.format("%s::%s", Integer.valueOf(globalActionCard.f108506a), globalActionCard.f108507b), Icon.createWithBitmap(globalActionCard.f108508c), globalActionCard.f108509d, globalActionCard.f108513h);
        Bitmap bitmap = globalActionCard.f108512g;
        if (bitmap != null) {
            icon = Icon.createWithBitmap(bitmap);
        } else {
            icon = null;
        }
        return builder.setCardIcon(icon).setCardLabel(globalActionCard.f108510e).build();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context, asqi], assign insn: null */
    /* renamed from: b */
    public final void mo49373b() {
        try {
            this.f89389c.mo49357a(askg.m74283b(this, null), new SelectGlobalActionCardRequest(4, "", f89388b));
        } catch (asks e) {
            bnsl bnsl = (bnsl) f89387a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asqi", "b", 175, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("onWalletCardSelected: error");
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [android.service.quickaccesswallet.QuickAccessWalletService, asqk, android.content.Context, asqi], assign insn: null */
    public final void onCreate() {
        asqi.super.onCreate();
        if (!ssw.m36269a()) {
            bnsl bnsl = (bnsl) f89387a.mo68388c();
            bnsl.mo68432a("asqi", "onCreate", 61, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Should not run on Q");
            stopSelf();
            return;
        }
        this.f89390d = snp.m35702a(9);
        this.f89389c = new asqc(this);
        asql.m74467a((asqk) this);
    }

    public final void onDestroy() {
        asql.m74467a((asqk) null);
        asqi.super.onDestroy();
        if (ssw.m36269a()) {
            this.f89390d.shutdownNow();
        }
    }

    public final void onWalletCardSelected(SelectWalletCardRequest selectWalletCardRequest) {
        if (ssw.m36269a()) {
            this.f89390d.mo25812a(new asqe(this, selectWalletCardRequest));
        }
    }

    public final void onWalletCardsRequested(GetWalletCardsRequest getWalletCardsRequest, GetWalletCardsCallback getWalletCardsCallback) {
        if (!ssw.m36269a()) {
            getWalletCardsCallback.onFailure(new GetWalletCardsError((Icon) null, (CharSequence) null));
        } else {
            this.f89390d.mo25812a(new asqd(this, getWalletCardsRequest, getWalletCardsCallback));
        }
    }

    public final void onWalletDismissed() {
        if (ssw.m36269a()) {
            this.f89390d.mo25812a(new asqf(this));
        }
    }

    /* renamed from: a */
    public final void mo49369a() {
        sendWalletServiceEvent(new WalletServiceEvent(1));
    }

    /* renamed from: a */
    public final void mo49370a(Context context) {
        asqi.super.attachBaseContext(context);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [android.content.Context, asqi], assign insn: null */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49371a(GetWalletCardsRequest getWalletCardsRequest, asqh asqh) {
        try {
            GetGlobalActionCardsResponse a = this.f89389c.mo49358a(askg.m74283b(this, null), getWalletCardsRequest.getCardWidthPx(), getWalletCardsRequest.getCardHeightPx(), getWalletCardsRequest.getIconSizePx(), getWalletCardsRequest.getMaxCards());
            GlobalActionCard[] globalActionCardArr = a.f108504a;
            if (globalActionCardArr.length == 0) {
                bnsl bnsl = (bnsl) f89387a.mo68388c();
                bnsl.mo68432a("asqi", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("getWalletCards: feature disabled");
                asqh.mo49368a(new GetWalletCardsError((Icon) null, this.f89389c.mo49363f()));
                return;
            }
            asqh.f89386a.onSuccess(new GetWalletCardsResponse(bnkn.m109668a(Arrays.asList(globalActionCardArr), asqg.f89385a), a.f108505b));
        } catch (Exception e) {
            bnsl bnsl2 = (bnsl) f89387a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("asqi", "a", 133, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("getWalletCards: error");
            asqh.mo49368a(new GetWalletCardsError((Icon) null, this.f89389c.mo49363f()));
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.Context, asqi], assign insn: null */
    /* renamed from: a */
    public final void mo49372a(SelectWalletCardRequest selectWalletCardRequest) {
        try {
            askf b = askg.m74283b(this, null);
            String[] split = TextUtils.split(selectWalletCardRequest.getCardId(), "::");
            if (split.length == 2) {
                this.f89389c.mo49357a(b, new SelectGlobalActionCardRequest(Integer.parseInt(split[0]), split[1], f89388b));
                return;
            }
            bnsl bnsl = (bnsl) f89387a.mo68388c();
            bnsl.mo68432a("asqi", "a", (int) MfiClientException.TYPE_NO_ACCOUNT_INFO, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("couldn't parse card id");
        } catch (asks | NumberFormatException e) {
            bnsl bnsl2 = (bnsl) f89387a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("asqi", "a", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("onWalletCardSelected: error");
        }
    }
}
